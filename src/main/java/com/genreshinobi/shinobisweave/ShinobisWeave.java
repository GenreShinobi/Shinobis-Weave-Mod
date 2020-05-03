package com.genreshinobi.shinobisweave;

import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.*;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Magelighter.MOD_ID)
@Mod.EventBusSubscriber(modid = Magelighter.MOD_ID, bus = Bus.MOD)
public class Magelighter
{
    public static Magelighter instance;
    public static final String MOD_ID = "shinobisweave";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public Magelighter() {
        instance = this;

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        //PotionList.addBrewingRecipes();
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // Register custom GUI
        // ScreenManager.registerFactory(BlockList.CLERICSOVEN_CONTAINER, ClericsOvenScreen::new);
        // Allow Transparency
        // RenderTypeLookup.setRenderLayer(BlockList.CROCUS_CROP, RenderType.getCutout());
    }

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
        // Adds ore to world generation
        // OreGeneration.generateOre();
    }

    public void onServerStarting(final FMLClientSetupEvent event) {

    }

    // TODO: Build the Crocus Crop
    // Drops a Crocus & a Bulb
    // Is it a crop or a flower?


}
