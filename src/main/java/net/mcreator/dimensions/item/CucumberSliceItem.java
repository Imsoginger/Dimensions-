
package net.mcreator.dimensions.item;

@DimensionsElements.ModElement.Tag
public class CucumberSliceItem extends DimensionsElements.ModElement {

	@ObjectHolder("dimensions:cucumberslice")
	public static final Item block = null;

	public CucumberSliceItem(DimensionsElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).food((new Food.Builder()).hunger(1).saturation(0.1f)

					.build()));
			setRegistryName("cucumberslice");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 30;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

	}

}
