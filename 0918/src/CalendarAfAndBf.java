import java.util.Calendar;
import java.util.Date;

/**
 * Created on 2019.09.18
 * calendar 클래스를 이용한 날짜 구하기
 * java.util.Date를 이용해 하루 전과 하루 뒤를 구함
 * @author olive
 */
public class CalendarAfAndBf {
	/**
	 * @param d 입력 다음 날을 출력하기 위한 입력 날
	 * @return 하루 뒤를 출력
	 */
	public Date afterOneDay(Date d) {
		// d 기준 날짜를 입력한다
		long dd = d.getTime();
		// 밀리세컨드 *60초*60분*24시간 == 하루
		return new Date(dd + 1000 * 60 * 60 * 24);
	}
	
	/**
	 * @param d 입력 전 날을 출력하기 위한 입력 날
	 * @return 하루 전을 출력
	 */
	public Date beforOneDay(Date d) {
		// d 기준 날짜를 입력한다
		long dd = d.getTime();
		// 밀리세컨드 *60초*60분*24시간 == 하루
		return new Date(dd - 1000 * 60 * 60 * 24);
	}
	public Date setDate(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day); // 0~11까지 존재하기 때문에 -1
		return new Date(cal.getTimeInMillis());
	}
}
