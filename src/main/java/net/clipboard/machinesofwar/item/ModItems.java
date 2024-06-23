package net.clipboard.machinesofwar.item;

import io.netty.util.Attribute;
import net.clipboard.machinesofwar.MachinesofWar;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MachinesofWar.MODID);

    public static final RegistryObject<Item> PERIODOT = ITEMS.register("periodot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PERIODOT = ITEMS.register("raw_periodot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METALDETECTOR = ITEMS.register("metal_detector",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
