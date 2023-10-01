package kodlama.io.rentACar.webApi;


import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;


@RestController
@RequestMapping("api/brands")
@AllArgsConstructor
public class BrandsController {

    private BrandService brandService;

//    @Autowired
//    public BrandsController(BrandService brandService) {
//        this.brandService = brandService;
//    }

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll() {
        return brandService.getAll();
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateBrandRequest createBrandRequest) {
        brandService.add(createBrandRequest);
    }


    //update,delete,getByID

    @GetMapping("/{id}")
    public GetByIdBrandResponse getById( @PathVariable  int id) {
        return brandService.getById(id);
    }

    @PutMapping("")
    public void update(@RequestBody UpdateBrandRequest updateBrandRequest){
        this.brandService.update(updateBrandRequest);
    }

    @DeleteMapping("/{id}")
    public void delete( @PathVariable  int id) {
         this.brandService.delete(id);
    }

}