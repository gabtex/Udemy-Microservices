package com.devsuperior.hrpayroll.services;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.entities.Worker;
import com.devsuperior.hrpayroll.feignclients.WorkerFeignClient;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service// ou @Component -> registra a classe como componente do Spring para que possa ser injetado em outras classses
public class PaymentService {



      @Autowired
      private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, int days){


        Worker worker = workerFeignClient.findById(workerId).getBody(); //para pegar o corpo da resposta tipo worker, antes era ResponseEntity

        return new Payment(worker.getName(), worker.getDailyIncome(), days); //mock para ver se está tudo funcionando
    }
}
