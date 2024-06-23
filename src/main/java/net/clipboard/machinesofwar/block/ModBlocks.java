package net.clipboard.machinesofwar.block;

import net.clipboard.machinesofwar.MachinesofWar;
import net.clipboard.machinesofwar.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MachinesofWar.MODID);

    public static final RegistryObject<Block> PERIODOT_BLOCK = registerBlock("periodot_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RAW_PERIODOT_BLOCK = registerBlock("raw_periodot_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> PERIODOT_BRICKS = registerBlock("periodot_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PERIODOT_LAMP = registerBlock("periodot_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SOIL = registerBlock("soil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<Block> COVERWOOD_LOG = registerBlock("coverwood_log",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}