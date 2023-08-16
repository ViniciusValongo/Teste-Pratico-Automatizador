package br.com.viniciusvalongo.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.viniciusvalongo.entities.Cliente;
import br.com.viniciusvalongo.entities.Conta;
import br.com.viniciusvalongo.entities.Telefone;

class Teste {

	@Test
	public void testRecargaSaldoSuficiente() {
		
		Conta conta = new Conta(100);
		Telefone tel = new Telefone("123456789", 50);		
		Cliente c = new Cliente("Valongo", tel, conta);		
		c.realizarRecarga(30);
		
		assertEquals(70, conta.getSaldo());
		assertEquals(80, tel.getSaldo());
		
		
	}
	
	@Test
	public void testRecargaSaldoInsuficiente() {
		Conta conta = new Conta(50);
        Telefone telefone = new Telefone("123456789", 100);
        Cliente c = new Cliente("Valongo", telefone, conta);              
        c.realizarRecarga(70);

        assertEquals(50, conta.getSaldo());
        assertEquals(100, telefone.getSaldo());
	}

}
