package com.poshyweb.venda.dominio;

import java.time.LocalDateTime;

public class PedidoEntity {

    private Integer id;
    private ClienteEntity cleinteId;
    private LocalDateTime dataPedido;
    private Long total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ClienteEntity getCleinteId() {
        return cleinteId;
    }

    public void setCleinteId(ClienteEntity cleinteId) {
        this.cleinteId = cleinteId;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
