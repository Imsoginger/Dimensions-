
package net.mcreator.dimensions.item;

@DimensionsElements.ModElement.Tag
public class KnifeItem extends DimensionsElements.ModElement {

	@ObjectHolder("dimensions:knife")
	public static final Item block = null;

	public KnifeItem(DimensionsElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 110;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("knife"));
	}

}
