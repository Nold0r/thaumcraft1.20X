package net.noldor.thaumcraft.client;

import net.minecraft.util.Identifier;
import net.noldor.thaumcraft.Thaumcraft;
import net.noldor.thaumcraft.custom.AnimatedItem;
import software.bernie.geckolib.model.GeoModel;

public class AnimatedItemModel extends GeoModel<AnimatedItem> {
    @Override
    public Identifier getModelResource(AnimatedItem animatable) {
        return new Identifier(Thaumcraft.MODID, "models/item/thaumonomicon.geo.json");
    }

    @Override
    public Identifier getTextureResource(AnimatedItem animatable) {
        return new Identifier(Thaumcraft.MODID, "textures/items/thaumonomicon.png");
    }

    @Override
    public Identifier getAnimationResource(AnimatedItem animatable) {
        return new Identifier(Thaumcraft.MODID, "animation/items/thaumonomicon.animation.json");
    }
}
