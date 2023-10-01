package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;

import java.util.List;

public interface BrandService {
    public List<GetAllBrandsResponse> getAll();

    public void add(CreateBrandRequest createBrandRequest);

    public void update(UpdateBrandRequest updateBrandRequest);

    GetByIdBrandResponse getById(int id);

    void delete(int id);

}
