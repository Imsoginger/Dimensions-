
package net.mcreator.dimensions.item;

@DimensionsElements.ModElement.Tag
public class YeronShovelItem extends DimensionsElements.ModElement {

	@ObjectHolder("dimensions:yeronshovel")
	public static final Item block = null;

	public YeronShovelItem(DimensionsElements instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 483;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 3f;
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
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("yeronshovel"));
	}

}
