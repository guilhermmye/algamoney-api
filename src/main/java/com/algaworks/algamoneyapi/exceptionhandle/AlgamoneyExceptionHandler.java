package com.algaworks.algamoneyapi.exceptionhandle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AlgamoneyExceptionHandler extends ResponseEntityExceptionHandler{
	
	@Autowired
	private MessageSource messageSource;

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
			
		String mensagemUsuario = messageSource.getMessage("mensagem.invalida", null,LocaleContextHolder.getLocale());
		String mensagemDesenvolvedor = ex.getCause().toString();
		
		return handleExceptionInternal(ex,new Erro(mensagemUsuario, mensagemDesenvolvedor), headers, HttpStatus.BAD_REQUEST, request);
	}
	
	public static class Erro{
		
		private String msgUsuario;
		private String msgDesenvolvedor;
		
		public Erro(String msgUsuario,String msgDesenvolvedor) {
			this.msgUsuario = msgUsuario;
			this.msgDesenvolvedor = msgDesenvolvedor;
		}

		public String getMsgUsuario() {
			return msgUsuario;
		}

		public void setMsgUsuario(String msgUsuario) {
			this.msgUsuario = msgUsuario;
		}

		public String getMsgDesenvolvedor() {
			return msgDesenvolvedor;
		}

		public void setMsgDesenvolvedor(String msgDesenvolvedor) {
			this.msgDesenvolvedor = msgDesenvolvedor;
		}
			
	}
}