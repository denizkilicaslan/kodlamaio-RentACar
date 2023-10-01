package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.entities.concretes.Brand;
import java.util.List;

public interface BrandService {
    public List<GetAllBrandsResponse> getAll();
    public void add(CreateBrandRequest createBrandRequest);

}
