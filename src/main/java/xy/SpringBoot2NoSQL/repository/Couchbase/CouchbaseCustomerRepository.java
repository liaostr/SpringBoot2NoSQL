//package xy.SpringBoot2NoSQL.repository.Couchbase;
//
//import java.util.List;
//
//import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
//import org.springframework.data.couchbase.core.query.ViewIndexed;
//import org.springframework.data.couchbase.repository.CouchbaseRepository;
//
//import xy.SpringBoot2NoSQL.model.Couchbase.Customer;
//
//
//@N1qlPrimaryIndexed
//@ViewIndexed(designDoc = "customer", viewName = "all")
//public interface CouchbaseCustomerRepository extends CouchbaseRepository<Customer, String> {
//	
//	List<Customer> findByLastName(String name);
//}
