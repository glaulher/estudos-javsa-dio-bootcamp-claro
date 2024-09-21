/**
 * Palavras
 */
public class Palavras {

  private String palavra;

  public Palavras(String palavra) {
    this.palavra = palavra;
  }

  public String getPalavras() {
    return palavra;
  }

  @Override
  public String toString() {
    return palavra;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((palavra == null) ? 0 : palavra.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Palavras other = (Palavras) obj;
    if (palavra == null) {
      if (other.palavra != null)
        return false;
    } else if (!palavra.equals(other.palavra))
      return false;
    return true;
  }

}