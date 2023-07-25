package com.example.sofiyaproductservice.domain.entity.user;

import com.example.sofiyaproductservice.domain.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "role")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoleEntity extends BaseEntity {

    private String name;

    @ManyToMany
    private List<PermissionEntity> permissions;
}
