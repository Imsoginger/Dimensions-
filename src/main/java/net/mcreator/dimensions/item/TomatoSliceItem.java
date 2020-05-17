
package net.mcreator.dimensions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.dimensions.DimensionsElements;

@DimensionsElements.ModElement.Tag
public class TomatoSliceItem extends DimensionsElements.ModElement {
	@ObjectHolder("dimensions:tomatoslice")
	public static final Item block = null;
	public TomatoSliceItem(DimensionsElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64)
					.food((new Food.Builder()).hunger(1).saturation(0.3f).setAlwaysEdible().build()));
			setRegistryName("tomatoslice");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 21;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
