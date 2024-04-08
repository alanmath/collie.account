package insper.collie.account;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "collie-account")
public interface AccountController {

    @PostMapping("/accounts")
    public ResponseEntity<AccountOut> create(
        @RequestBody(required = true) AccountIn in
    );

    @PostMapping("/accounts/login")
    public ResponseEntity<AccountOut> login(
        @RequestBody(required = true) LoginIn in
    );

    @PutMapping("/accounts/{id}")
    public ResponseEntity<AccountOut> update(
        @RequestHeader(required = true, name = "id-user") String idUser,
        @PathVariable(required = true) String id,
        @RequestBody(required = true) AccountIn in
    );

    @GetMapping("/accounts/{idUser}")
    public ResponseEntity<AccountOut> getAccount(
        @PathVariable(required = true) String idUser
    );

    @GetMapping("/accounts/exists/{id}")
    public ResponseEntity<Boolean> isAccount(
        @PathVariable(required = true) String id
    );

    @GetMapping("/accounts")
    public ResponseEntity<AccountOut> read(
        @RequestHeader(required = true, name = "id-user") String idUser,
        @RequestHeader(required = true, name = "role-user") String roleUser
    );
    
}