
public class MeuObj {

	Integer num;
	
	
	public Integer getNum() {
		return num;
	}


	public void setNum(Integer num) {
		this.num = num;
	}


	@Override
	public String toString() {
		return this.num.toString();
	}


	public MeuObj(Integer num) {
		super();
		this.num = num;
	}
	


	
}
