
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
    private Long id;

    // Menandakan format tanggal agar Jackson tidak bingung
    @JsonFormat(shape = JsonFormat.Shape.String, pattern = "yyyy-MM-dd")
    private LocalDate transactionDate;

    private BigDecimal amount;
    private String category;
    private String paymentMethod;
    private String description;
    private Boolean isIncome;

    // --- KOSONGKAN UNTUK GETTER & SETTER ---
}