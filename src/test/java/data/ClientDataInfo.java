package data;

        import lombok.AllArgsConstructor;
        import lombok.Data;

@AllArgsConstructor
@Data
public class ClientDataInfo {
    private final String city;
    private final String fullName;
    private final String phoneNumber;
}