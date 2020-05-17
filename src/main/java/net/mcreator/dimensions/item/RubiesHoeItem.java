
package net.mcreator.dimensions.item;

@DimensionsElements.ModElement.Tag
public class RubiesHoeItem extends DimensionsElements.ModElement {

	@ObjectHolder("dimensions:rubieshoe")
	public static final Item block = null;

	public RubiesHoeItem(DimensionsElements instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("rubieshoe"));
	}

}
