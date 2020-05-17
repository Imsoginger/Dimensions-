
package net.mcreator.dimensions.item;

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
