
package net.mcreator.dimensions.item;

@DimensionsElements.ModElement.Tag
public class YeronAxeItem extends DimensionsElements.ModElement {

	@ObjectHolder("dimensions:yeronaxe")
	public static final Item block = null;

	public YeronAxeItem(DimensionsElements instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 483;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 28f;
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

		}.setRegistryName("yeronaxe"));
	}

}
