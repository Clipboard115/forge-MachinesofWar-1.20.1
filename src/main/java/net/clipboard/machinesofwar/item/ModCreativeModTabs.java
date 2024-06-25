package net.clipboard.machinesofwar.item;

import net.clipboard.machinesofwar.MachinesofWar;
import net.clipboard.machinesofwar.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MachinesofWar.MODID);

    public static final RegistryObject<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TABS.register("machinesofwar_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PERIODOT_LAMP.get()))
                    .title(Component.translatable("creativetab.machinesofwar_blocks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.PERIODOT_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_PERIODOT_BLOCK.get());
                        pOutput.accept(ModBlocks.PERIODOT_LAMP.get());
                        pOutput.accept(ModBlocks.PERIODOT_BRICKS.get());
                        pOutput.accept(ModBlocks.SOIL.get());
                        pOutput.accept(ModBlocks.COVERWOOD_LOG.get());

                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> ITEMS_TAB = CREATIVE_MODE_TABS.register("machinesofwar_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PERIODOT.get()))
                    .title(Component.translatable("creativetab.machinesofwar_items"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PERIODOT.get());
                        pOutput.accept(ModItems.RAW_PERIODOT.get());
                        pOutput.accept(ModItems.STEEL_INGOT.get());
                        pOutput.accept(ModItems.STEEL_PLATE.get());
                        pOutput.accept(ModItems.STEEL_ROD.get());
                        pOutput.accept(ModItems.RAW_ALUMINUM.get());
                        pOutput.accept(ModItems.ALUMINUM_INGOT.get());
                        pOutput.accept(ModItems.ALUMINUM_PLATE.get());
                        pOutput.accept(ModItems.ALUMINUM_ROD.get());
                        pOutput.accept(ModItems.RAW_TIN.get());
                        pOutput.accept(ModItems.TIN_INGOT.get());
                        pOutput.accept(ModItems.TIN_PLATE.get());
                        pOutput.accept(ModItems.TIN_ROD.get());
                        pOutput.accept(ModItems.RAW_ZINC.get());
                        pOutput.accept(ModItems.ZINC_INGOT.get());
                        pOutput.accept(ModItems.ZINC_PLATE.get());
                        pOutput.accept(ModItems.ZINC_ROD.get());
                        pOutput.accept(ModItems.BRONZE_INGOT.get());
                        pOutput.accept(ModItems.BRONZE_PLATE.get());
                        pOutput.accept(ModItems.BRONZE_ROD.get());
                        pOutput.accept(ModItems.BRASS_INGOT.get());
                        pOutput.accept(ModItems.BRASS_PLATE.get());
                        pOutput.accept(ModItems.BRASS_ROD.get());
                        pOutput.accept(ModItems.COPPER_PLATE.get());
                        pOutput.accept(ModItems.COPPER_ROD.get());
                        pOutput.accept(ModItems.METALDETECTOR.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
