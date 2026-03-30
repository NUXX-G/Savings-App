package com.nuxx.savings_app.repository;

import com.nuxx.savings_app.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngresoRepository extends JpaRepository<Usuario, Long>
{
}
