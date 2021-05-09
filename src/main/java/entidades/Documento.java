package entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name="Documentos")
public class Documento implements Serializable, Comparable<Documento> {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "documento")
    private String documento;
    
    @Transient
    private double ir = 0;
    
    public Documento() {
    }

    public Documento(String documento) {
        this.documento = documento;
    }

    public double getIr() {
        return ir;
    }

    public void setIr(double ir) {
        this.ir = ir;
    }
    
    public void sumarIr(double x){
        ir += x;
    }

    @Override
    public int compareTo(Documento that) {
        return (int) (that.ir - this.ir);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Documento other = (Documento) obj;
        if (!Objects.equals(this.documento, other.documento)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return documento + " | " + ir;
    }
 
    
    
}
