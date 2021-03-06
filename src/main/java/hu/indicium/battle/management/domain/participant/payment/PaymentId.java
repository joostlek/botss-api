package hu.indicium.battle.management.domain.participant.payment;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Getter
@NoArgsConstructor
public class PaymentId implements Serializable {
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    private PaymentId(UUID id) {
        this.id = id;
    }

    public static PaymentId fromId(UUID id) {
        return new PaymentId(id);
    }
}
