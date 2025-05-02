import java.util.Stack;
public class StackSurat23 {
    Stack<Surat23> stack = new Stack<>();

    public void terimaSurat(Surat23 srt) {
        stack.push(srt);
    }

    public Surat23 prosesSurat() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            System.out.println("Tidak ada surat izin untuk diproses");
            return null;
        }
    }

    public Surat23 lihatSuratTerakhir() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            System.out.println("Tidak ada surat izin");
            return null;
        }
    }

    public Surat23 cariSurat(String namaMhs) {
        for (Surat23 surat : stack) {
            if (surat.namaMahasiswa.equalsIgnoreCase(namaMhs)) {
                return surat;
            }
        }
        return null;
    }
}