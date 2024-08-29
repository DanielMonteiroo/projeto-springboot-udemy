package com.danielmonteiro.springboot.entities.enums;


public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);
	
	private int code;

	//Construtor
	private OrderStatus(int code) {
		this.code = code;
	}
	
	//Metodo acessivel ao codigo enum
	public int getCode() {
		return code;
	}
	
	//Metodo estático para converter um valor numero para o tipo Enumerado
	public static OrderStatus valueOf (int code) {
	
		for(OrderStatus value: OrderStatus.values()) {
			if(value.getCode()==code) {
				return value;
			}
		}throw new IllegalArgumentException("Código de status do pedido, inválido!");
		
	}
	
	
}
