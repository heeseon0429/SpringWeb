package middleProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import middleProject.dao.JudaDAO;
import middleProject.domain.PayVO;

@Service
public class JudaServiceImpl implements JudaService {

	@Autowired
	private JudaDAO judaDAO;
	
	public void insertOrder(PayVO payVo) {
		judaDAO.insertOrder(payVo);
	}

}
