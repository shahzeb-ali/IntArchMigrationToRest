package org.intArchMigrationToRest.managePersonal.controller;

import org.intArchMigrationToRest.dtos.salesman.SalesMan;
import org.intArchMigrationToRest.service.ManagePersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagePersonalController {

	@Autowired
	ManagePersonalService mps;

	@PostMapping("/setsalesman")
	public void createSalesMan(@RequestBody(required = true) SalesMan s) {
		mps.create(s);

	}

}
