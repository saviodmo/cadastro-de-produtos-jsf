package com.savioduarte.cadastrodeprodutos.business.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "produtos")
public class ProdutosBean {
	private List<ProdutoBean> produtos;
	private ProdutoBean produtoSelecionado; 
	
	public ProdutosBean() {
		produtos = new ArrayList<>();
		produtoSelecionado = new ProdutoBean();
	}


	
	public List<ProdutoBean> getProdutos() {
		return produtos;
	}
	
	public void adicionar(ProdutoBean produto) {
		produtos.add(produto);
	}
	
	public void remover(ProdutoBean produto) {
		produtos.remove(produto);
	}
	
	public String selecionar(ProdutoBean produto) {
		produtoSelecionado = produto;
		
		return "detalhe";
	}

	public ProdutoBean getProdutoSelecionado() {
		return produtoSelecionado;
	}
	
	public String retornar() {
		return "index";
	}


}
