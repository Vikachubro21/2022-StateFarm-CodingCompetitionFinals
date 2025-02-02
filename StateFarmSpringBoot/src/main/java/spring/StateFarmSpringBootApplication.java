/**************************************************************************
 * spring.SpringBootCassandraApplication.java codes for the initiation of Spring
 * Boot for backend funcitonality. Refer to any additional comments for
 * details about the code.
 *
 * Written by Tony Dong, Athulya Saravanakumar, Sophia Phu,
 * Rishindra Davuluri, Tommy Fang, Suhani Goswami,
 * Nitya Pakala, and Tejas Kalpathi.
 *
 * Big thanks to Vikas Thoutam for technical support.
 *
 * Last updated: 8/3/2022
 *************************************************************************/

package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StateFarmSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StateFarmSpringBootApplication.class, args);
	}
}
