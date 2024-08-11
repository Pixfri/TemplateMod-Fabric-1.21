package fr.pixfri.templatemod;

import net.fabricmc.api.ClientModInitializer;

public class TemplateModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TemplateMod.LOGGER.info("Initializing client side code for mod with mod id " + TemplateMod.MOD_ID);
    }
}
