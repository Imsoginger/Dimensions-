
package net.mcreator.dimensions.item;

@DimensionsElements.ModElement.Tag
public class RubiesAxeItem extends DimensionsElements.ModElement {

	@ObjectHolder("dimensions:rubiesaxe")
	public static final Item block = null;

	public RubiesAxeItem(DimensionsElements instance) {
		super(instance, 58);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
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
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("rubiesaxe"));
	}

}
