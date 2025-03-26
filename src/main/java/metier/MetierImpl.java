package metier;
import dao.DaoImpl;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    @Autowired

    private IDao dao;
    public MetierImpl( IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul(){
        double t = dao.getData();
        return t = 43/3;
    }

    public void setDao(DaoImpl dao) {
        this.dao = dao;
    }
}
