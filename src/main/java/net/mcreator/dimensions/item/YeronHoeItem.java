
package net.mcreator.dimensions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.dimensions.DimensionsElements;

@DimensionsElements.ModElement.Tag
public class YeronHoeItem extends DimensionsElements.ModElement {
	@ObjectHolder("dimensions:yeronhoe")
	public static final Item block = null;
	public YeronHoeItem(DimensionsElements instance) {
		super(instance, 46);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 483;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -1f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("yeronhoe"));
	}
}
