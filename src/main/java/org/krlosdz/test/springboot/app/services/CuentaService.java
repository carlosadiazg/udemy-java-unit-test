package org.krlosdz.test.springboot.app.services;

import org.krlosdz.test.springboot.app.models.Cuenta;

import java.math.BigDecimal;

public interface CuentaService {

    Cuenta findById(Long id);

    int revisarTotalTransferencias(Long bancoId);

    BigDecimal revisarSaldo(Long id);

    void transferir(Long numCuentaOrigen, Long numCuentaDestino, BigDecimal monto);
}
