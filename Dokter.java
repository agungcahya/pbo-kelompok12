public class Dokter extends Orang {
	private String spesialis;
	
	public Dokter (String nama, char jenisKelamin, int umur, String id, String spesialis) {
		super(nama, jenisKelamin, umur, id);
		setSpesialis(spesialis);
	}
	public void setSpesialis (String spesialis) {
		this.spesialis = spesialis;
	}
	public String getSpesialis () {
		return spesialis;
	}
	public void display() {
		System.out.println("=DATA DOKTER=");
		System.out.println("Nama			: "+super.getNama());
		System.out.println("Jenis Kelamin	: "+super.getJenisKelamin());
		System.out.println("Umur			: "+super.getUmur());
		System.out.println("ID				: "+super.getId());
		System.out.println("Spesialis		: "+getSpesialis());
	}
}