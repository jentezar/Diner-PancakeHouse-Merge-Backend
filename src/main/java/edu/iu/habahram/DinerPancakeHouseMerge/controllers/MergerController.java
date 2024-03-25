package edu.iu.habahram.DinerPancakeHouseMerge.controllers;

import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.DinerRepository;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.PancakeHouseRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/merger")
public class MergerController {
    private final DinerRepository dinerRepository;
    private final PancakeHouseRepository pancakeHouseRepository;

    public MergerController() {
        this.dinerRepository = new DinerRepository();
        this.pancakeHouseRepository = new PancakeHouseRepository();
    }

    @GetMapping
    public List<MenuItem> mergeMenus() {
        List<MenuItem> mergedMenu = new ArrayList<>();
        mergedMenu.addAll(dinerRepository.getMenuArrList());
        mergedMenu.addAll(pancakeHouseRepository.getTheMenu());

        // Sort the merged menu by name
        Collections.sort(mergedMenu, Comparator.comparing(MenuItem::getName));

        return mergedMenu;
    }
}
