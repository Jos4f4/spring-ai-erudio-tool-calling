package br.com.erudio.api;

import java.util.List;

import br.com.erudio.entities.Share;

public record WalletResponse(List<Share> shares) {

}
