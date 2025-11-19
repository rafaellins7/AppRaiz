package App;

public class Status {
	private int id;
	private String status;
	 
	public Status() {
		}
	
	public Status(int id, String status) {
		this.id = id;
		this.status = status;
		}
		
	public int getId() {
		return this.id;
		}
	
	public void setId(int id) {
		this.id = id;
		}
			
	public String getStatus() {
		return this.status;
		}
			
	public void setStatus (String status) {
		this.status = status;
		}

	}
