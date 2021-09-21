package com.foxmula.inventory.Service;

import com.foxmula.inventory.Model.InventoryManager;

public interface InventoryManagerService {
    InventoryManager addInventoryManager(InventoryManager inventoryManager);

    InventoryManager getInventoryManager(Long id);

    InventoryManager updateInventoryManager(Long id, InventoryManager inventoryManager);

    Boolean deleteInventoryManager(Long id);
}
