package com.udacity.pricing;

import com.udacity.pricing.api.PricingController;
import com.udacity.pricing.service.PricingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PricingController.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
public class PricingServiceApplicationTests {

//	@LocalServerPort
//	private int port;

//	@Autowired
//	private TestRestTemplate restTemplate;

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	PricingService pricingService;



	@Test
	// for get price
	public void contextLoads() throws Exception {
		mockMvc.perform(get("/services/price").param("vehicleId","2"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE));
//				.andExpect(content().json("[]"));
	}

//	@Test
//	public void getPrice() throws Exception {
//
//		ResponseEntity<Price> response =
//				this.restTemplate.getForEntity("http://localhost:" + port + "/prices/1", Price.class);
//		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
//	}
//	@Test
//	public void getAllPrices() throws Exception {
//		mockMvc.perform(get("/services/price/allPrice")).
//				andExpect(status().isOk()).
//				andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE));
//	}

}
