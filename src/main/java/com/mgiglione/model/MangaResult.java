package com.mgiglione.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class MangaResult {

    private List<Manga> result;

	public List<Manga> getResult() {
		return result;
	}

	public void setResult(List<Manga> result) {
		this.result = result;
	}
}
