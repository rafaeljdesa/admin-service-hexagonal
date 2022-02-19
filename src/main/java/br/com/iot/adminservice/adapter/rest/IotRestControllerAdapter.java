package br.com.iot.adminservice.adapter.rest;

import br.com.iot.adminservice.domain.dto.IotDTO;
import br.com.iot.adminservice.domain.port.controller.IotController;
import br.com.iot.adminservice.domain.service.IotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/admin/iot")
public class IotRestControllerAdapter implements IotController {

    private final IotService iotService;

    public IotRestControllerAdapter(IotService iotService) {
        this.iotService = iotService;
    }

    @PostMapping
    public IotDTO createIot(@RequestBody IotDTO iotDTO) {
        log.info("POST request to create Iot");
        return iotService.createIot(iotDTO);
    }

    @PutMapping
    public IotDTO updateIot(@RequestBody IotDTO iotDTO) {
        log.info("PUT request to update Iot");
        return iotService.updateIot(iotDTO);
    }

    @GetMapping("/{id}")
    public IotDTO getById(@PathVariable String id) {
        log.info("GET request to find Iot by id {}", id);
        return iotService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        log.info("DELETE request to delete Iot by id {}", id);
        iotService.deleteById(id);
    }

    @GetMapping("/all")
    public List<IotDTO> getAll() {
        log.info("GET request to find all Iot");
        return iotService.getAll();
    }

}
