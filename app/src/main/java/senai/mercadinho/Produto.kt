package senai.mercadinho

class Produto (var nome:String, var descricao:String, var valor:Double ){
    override fun toString(): String {
        return "$nome"
    }
}