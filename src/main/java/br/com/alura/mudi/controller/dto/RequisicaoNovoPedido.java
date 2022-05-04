package br.com.alura.mudi.controller.dto;

import br.com.alura.mudi.model.Pedido;

public class RequisicaoNovoPedido {
	
	private String nomeProduto;
	private String urlProduto;
	private String urlimagem;
	private String descricao;
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getUrlProduto() {
		return urlProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	public String getUrlimagem() {
		return urlimagem;
	}
	public void setUrlimagem(String urlimagem) {
		this.urlimagem = urlimagem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Pedido toPedido() {
		
		Pedido pedido = new Pedido();
		pedido.setDescricao(descricao);
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlImagem(urlimagem);
		pedido.setUrlProduto(urlProduto);
		
		return pedido;
	}

	
	
}
