import java.util.ArrayList;
import java.util.List;

/**
 * Kelas TemperatureType mewakili kumpulan objek Temperature.
 * Kelas ini menyediakan metode untuk menambahkan suhu ke koleksi,
 * mengambil daftar suhu, dan menampilkan suhu ke konsol.
 */
public class TemperatureType {
    private List<Temperature> items = new ArrayList<>();

    /**
     * Menambahkan objek Temperature ke koleksi
     *
     * @param temperature Objek Temperature yang akan ditambahkan
     */
    public void addItem(Temperature temperature) {
        items.add(temperature);
    }

    /**
     * Mengambil daftar objek Temperature dalam koleksi
     *
     * @return Daftar objek Temperature
     */
    public List<Temperature> getItems() {
        return items;
    }

    // Menampilkan suhu dalam koleksi
    public void showTemperatures() {
        for (Temperature temp : items) {
            System.out.println("Suhu: " + temp.getTemperature());
        }
    }
}
