package net.daxanius.applesauce.registry;

import net.daxanius.applesauce.Applesauce;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.StewItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static StewItem APPLESAUCE;

    public static void register() {
        FabricItemSettings applesauceSettings = new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder()
                .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*25), 1f)
                .saturationModifier(2.6f)
                .hunger(5)
                .build()
        );

        APPLESAUCE = new StewItem(applesauceSettings);

        // Registering the items
        Registry.register(Registry.ITEM, new Identifier(Applesauce.MODID, "applesauce"), APPLESAUCE);
    }
}