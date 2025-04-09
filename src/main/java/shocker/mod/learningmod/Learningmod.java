package shocker.mod.learningmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;

public class Learningmod implements ModInitializer {

    @Override
    public void onInitialize() {
        SCREEN_HANDLER_TYPE = Registry.register(Registries.SCREEN_HANDLER, ExampleBlock.ID,
                new ScreenHandlerType<>((syncId, inventory) -> new ExampleGuiDescription(syncId, inventory, ScreenHandlerContext.EMPTY),
                        FeatureFlags.VANILLA_FEATURES));
    }
}
