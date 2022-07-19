package com.poshyweb.venda.dominio;

public class ItemPedidoEntity {
    private Integer id;
    private PedidoEntity  pedidoId;
    private ProdutoEntity produtoId;
    private Integer quantidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PedidoEntity getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(PedidoEntity pedidoId) {
        this.pedidoId = pedidoId;
    }

    public ProdutoEntity getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(ProdutoEntity produtoId) {
        this.produtoId = produtoId;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
