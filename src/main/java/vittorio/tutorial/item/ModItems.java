package vittorio.tutorial.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import vittorio.tutorial.Tutorial;

public class ModItems {

    public static final Item EXAMPLE_ITEM = registerItem("example_item", new Item(new Item.Settings()));
    public static final Item RAW_EXAMPLE_ITEM = registerItem("raw_example_item", new Item(new Item.Settings()));

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Tutorial.MOD_ID, name), item);
    }

    public static void registerModItem() {

        Tutorial.LOGGER.info("Registering Mod Items for " + Tutorial.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(EXAMPLE_ITEM);
            entries.add(RAW_EXAMPLE_ITEM);
        });
    }
}
