package com.rts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.rts.bean.Carz;
import com.rts.util.DBUtil;

public class CarzDAO {
	
	public int registerCarz(Carz bean) {
		int n = 0;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into carz values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bean.getCarNo());
			ps.setString(2, bean.getManufacture());
			ps.setString(3, bean.getModel());
			ps.setInt(4, bean.getKmsRan());
			ps.setInt(5, bean.getPriceExpected());
			ps.setInt(6, bean.getNoOfOwners());
			n = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

}
