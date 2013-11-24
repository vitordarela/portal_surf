package br.com.web_juris.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cadclien implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id_clien;
	private String nome;
	private String endereco;
	private String bairro;
	private String cidade;
	private String telefone;
	private Integer numero_casa;
	private String cep;
	private String cpf;
	private String rg;
	private Date dat_nascimento;
	private String observacao;
	private String flg_ativo;
	
	public Cadclien() {
		
	}
	
	public Cadclien(Integer id_clien, String nome, String endereco, String bairro,	String cidade, String telefone, Integer numero_casa, String cep,
														String cpf, String rg, Date dat_nascimento, String observacao,
																												String flg_ativo) {
		super();
		this.id_clien = id_clien;
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.telefone = telefone;
		this.numero_casa = numero_casa;
		this.cep = cep;
		this.cpf = cpf;
		this.rg = rg;
		this.dat_nascimento = dat_nascimento;
		this.observacao = observacao;
		this.flg_ativo = flg_ativo;
	}

	 
	
	public Integer getId_clien() {
		return id_clien;
	}

	public void setId_clien(Integer id_clien) {
		this.id_clien = id_clien;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getNumero_casa() {
		return numero_casa;
	}

	public void setNumero_casa(Integer numero_casa) {
		this.numero_casa = numero_casa;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDat_nascimento() {
		return dat_nascimento;
	}

	public void setDat_nascimento(Date dat_nascimento) {
		this.dat_nascimento = dat_nascimento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getFlg_ativo() {
		return flg_ativo;
	}

	public void setFlg_ativo(String flg_ativo) {
		this.flg_ativo = flg_ativo;
	}
	
	
}
