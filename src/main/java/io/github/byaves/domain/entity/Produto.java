package io.github.byaves.domain;

import java.math.BigDecimal;

public class Produto {
    private Integer cliente_id;
    private String descircao;
    private BigDecimal preco;

    public Produto() {
    }

    public Produto(Integer cliente_id, String descircao, BigDecimal preco) {
        this.cliente_id = cliente_id;
        this.descircao = descircao;
        this.preco = preco;
    }

    public Integer getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getDescircao() {
        return descircao;
    }

    public void setDescircao(String descircao) {
        this.descircao = descircao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
