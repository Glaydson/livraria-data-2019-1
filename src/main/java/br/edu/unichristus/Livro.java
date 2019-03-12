package br.edu.unichristus;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_LIVRO")
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long livroID;

	private String titulo;

	private int numeroPaginas;

	private BigDecimal preco;

	public Livro(String titulo, int numeroPaginas, BigDecimal preco) {
		super();
		this.titulo = titulo;
		this.numeroPaginas = numeroPaginas;
		this.preco = preco;
	}

	public Livro() {

	}

	public Long getLivroID() {
		return livroID;
	}

	public void setLivroID(Long livroID) {
		this.livroID = livroID;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Livro [livroID=" + livroID + ", titulo=" + titulo + ", numeroPaginas=" + numeroPaginas + ", preco="
				+ preco + "]";
	}

}
