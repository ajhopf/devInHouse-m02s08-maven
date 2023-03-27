package org.example;

import org.mapstruct.Mapper;

@Mapper
public interface ProdutoMapper {
    Produto toProduto(Produto2 Produto);
    Produto2 toProduto2(Produto Produto2);
}
