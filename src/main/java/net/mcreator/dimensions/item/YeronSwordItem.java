
package net.mcreator.dimensions.item;

@DimensionsElements.ModElement.Tag
public class YeronSwordItem extends DimensionsElements.ModElement {

	@ObjectHolder("dimensions:yeronsword")
	public static final Item block = null;

	public YeronSwordItem(DimensionsElements instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)) {

		}.setRegistryName("yeronsword"));
	}

}
