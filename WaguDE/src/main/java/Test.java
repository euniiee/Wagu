import java.util.ArrayList;
import java.util.Arrays;

import com.wagu.dao.KorailTimeTableDAO;

public class Test {
	public static void main(String[] args) throws Exception {
		KorailTimeTableDAO dao = new KorailTimeTableDAO();
//		int[] arr = null;
//		try {
//			arr = dao.findTimetableId(1312, "대전", "서울");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		if(arr!=null)
//			System.out.println(Arrays.toString(arr));
		
		// "2023-01-19", 1312, 1, "대전", "서울" (오라클: Varchar2(20), Number, Number,...) ------> 예약된 좌석 list를 리턴. 
		ArrayList<String> listTest = dao.getSeatsAvailable("2023-01-19", 1312, 1, "대전", "서울");
		System.out.println(listTest);
		
	}
}
