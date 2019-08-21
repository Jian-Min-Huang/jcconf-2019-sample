package org.yfr.api.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Serializable {

    private Long id;

    private String code;

    private String name;

    private LocalDateTime date;

    private Float price;

}
