package com.devsuperior.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.entities.Worker;
import com.devsuperior.hrpayroll.feignclientes.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workFeignClient;

	public Payment getPayment(Long workerId, Integer days) {

		Worker worker = workFeignClient.findById(workerId).getBody();

		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
