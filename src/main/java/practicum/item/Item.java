package practicum.item;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="items")
@Data
class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String url;
}