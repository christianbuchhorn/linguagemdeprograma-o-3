package com.tads.ecommerce.dto;
import com.tads.ecommerce.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.cert.Extension;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class CategoryDTO {

    private Long id;
    private String nome;

    public CategoryDTO (Category entity) {
        id = entity.getId();
        nome = entity.getName();
    }

}
