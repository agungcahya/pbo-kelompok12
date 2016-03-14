public abstract class Orang {
	private String nama;
	private char jenisKelamin;
	private int umur;
	private String id;
	
	public Orang (String nama, char jenisKelamin, int umur, String id){
		setNama (nama);
		setJenisKelamin (jenisKelamin);
		setUmur (umur);
		setId (id);
	}
	public void setNama (String nama){
		this.nama = nama;
	}
	public String getNama() {
		return nama;
	}
	public void setJenisKelamin (char jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public char getJenisKelamin() {
		return jenisKelamin;
	}
	public void setUmur (int umur) {
		this.umur = umur;
	}
	public int getUmur() {
		return umur;
	}
	public void setId (String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public abstract void display ();
}