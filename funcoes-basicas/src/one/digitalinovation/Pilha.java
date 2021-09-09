package one.digitalinovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public No top() {
        return refNoEntradaPilha;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReNo(refAuxiliar);
    }

    public No pop() {
        if (!this.isEmpty()) {
            No noPop = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getReNo();
            return noPop;
        }
        return null;
    }

    public boolean isEmpty() {
        if(refNoEntradaPilha == null){
          return  true;
        } else {
            return false;

        }
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "           Pilha\n";
        stringRetorno += "------------\n";
        No noAuxiliar = refNoEntradaPilha;
        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReNo();
            } else {
                break;
            }
        }
        stringRetorno += "---------------";
        return stringRetorno;

    }
}
