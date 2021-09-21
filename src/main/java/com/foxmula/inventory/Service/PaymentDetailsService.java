package com.foxmula.inventory.Service;

import com.foxmula.inventory.Model.PaymentDetails;

public interface PaymentDetailsService {
    PaymentDetails addPaymentDetails(PaymentDetails paymentDetails);

    PaymentDetails getPaymentDetails(Long id);

    PaymentDetails updatePaymentDetails(Long id, PaymentDetails paymentDetails);

    Boolean deletePaymentDetails(Long id);
}
