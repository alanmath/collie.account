package insper.collie.account;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record AccountInfo(
    String id,
    String role
) {
    
}
