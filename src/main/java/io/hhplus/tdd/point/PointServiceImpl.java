package io.hhplus.tdd.point;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import io.hhplus.tdd.database.UserPointTable;

@Service("pointService")
public class PointServiceImpl implements PointService {

	private static final Logger log = LoggerFactory.getLogger(PointServiceImpl.class);

	private final UserPointTable userPointTable;

	public PointServiceImpl(UserPointTable userPointTable) {
		this.userPointTable = userPointTable;
	}

	public UserPoint getPoint(long id) {

		UserPoint user = userPointTable.selectById(id);
		log.info("###{}", user);

		return userPointTable.selectById(id);
	}
}
