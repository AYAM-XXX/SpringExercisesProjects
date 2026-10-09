package https.github.com.AYAM_XXX.produtosapi.repository;

import https.github.com.AYAM_XXX.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository <Produto, String>{

    public List<Produto> findByNome(String nome);
}
