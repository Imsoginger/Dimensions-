
package net.mcreator.dimensions.item;

@DimensionsElements.ModElement.Tag
public class YeronPickaxeItem extends DimensionsElements.ModElement {

	@ObjectHolder("dimensions:yeronpickaxe")
	public static final Item block = null;

	public YeronPickaxeItem(DimensionsElements instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 485;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 2.5f;
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

		}.setRegistryName("yeronpickaxe"));
	}

}
