package com.espeschit.geoservico.models

data class Properties(
    //Lista ESCOLAS_MUNICIPAIS_EDUCACAO_INFANTIL
    var ID_EQ_ED: Int,
    var TIPO_LOGRADOURO: String = "",
    var BAIRRO: String = "",
    var COMPLEMENTO: String = "",
    var NUMERO: Int,
    var LOGRADOURO: String = "",
    var INSTANCIA: String = "",
    var NOME: String = "",
    var REGIONAL: String = "",

    //Lista ATRATIVO_TURISTICO
    var LINK_SITE_REDE_SOCIAL: String = "",
    var REF_LOCALIZACAO: String = "",
    var ID_ATRATIVO_TURISTICO: Int,
    var DESCRICAO: String = "",
    var ENDERECO: String = "",
    var CATEGORIA: String = ""
)
