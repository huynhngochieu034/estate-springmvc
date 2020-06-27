package com.estate.controller.admin.api;

import com.estate.dto.BuildingDTO;
import com.estate.service.IBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/admin/building")
public class BuildingAPI {

    @Autowired
    private IBuildingService buildingService;

    @PostMapping
    public ResponseEntity<BuildingDTO> createBuilding(@RequestBody BuildingDTO buildingDTO) {
        return ResponseEntity.ok(buildingService.save(buildingDTO));
    }

    @PutMapping
    public ResponseEntity<BuildingDTO> updateBuilding(@RequestBody BuildingDTO buildingDTO) {
        return ResponseEntity.ok(buildingService.update(buildingDTO));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteBuilding(@RequestBody long[] id) {
        buildingService.deleteBuilding(id);
        return ResponseEntity.noContent().build();

    }


}
