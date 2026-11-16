package com.ghada.maquillage.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nommaquillage", types = { maquillage.class })

public interface maquillageProjection {
	public String getNommaquillage();

}
