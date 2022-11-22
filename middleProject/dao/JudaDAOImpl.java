package middleProject.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import middleProject.domain.PayVO;

@Repository
public class JudaDAOImpl implements JudaDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	public void insertOrder(PayVO payVo) {
		mybatis.insert("user.insertDelivery", payVo);
		mybatis.insert("user.insertOrderList", payVo);
	}

}
