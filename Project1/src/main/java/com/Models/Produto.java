package com.Models;

public class Produto {
	
	private int id;
	private String codigo;
	private String nome;
	private String categoria;
	private String valor;
	private String quantidade;
	
	

	public Produto(String codigo, String nome, String categoria, String valor, String quantidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.categoria = categoria;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	

	public Produto() {
		
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

}
