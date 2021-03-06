package de.budgetfreak.accounting.web;

import de.budgetfreak.accounting.domain.Account;
import de.budgetfreak.usermanagement.web.UserController;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Assembler for {@link AccountResource}.
 */
@Component
public class AccountResourceAssembler extends ResourceAssemblerSupport<Account, AccountResource> {

    public AccountResourceAssembler() {
        super(AccountController.class, AccountResource.class);
    }

    @Override
    public AccountResource toResource(Account entity) {
        final AccountResource accountResource = new AccountResource(entity.getDescription(), entity.isOnBudget());
        accountResource.add(linkTo(methodOn(AccountController.class).get(entity.getUser().getId(), entity.getId())).withSelfRel());
        accountResource.add(linkTo(methodOn(UserController.class).get(entity.getUser().getId())).withRel("user"));
        return accountResource;
    }
}
