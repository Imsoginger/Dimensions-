
package net.mcreator.dimensions.item;

@DimensionsElements.ModElement.Tag
public class TomatoItem extends DimensionsElements.ModElement {

	@ObjectHolder("dimensions:tomato")
	public static final Item block = null;

	public TomatoItem(DimensionsElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).food((new Food.Builder()).hunger(1).saturation(0.3f)

					.build()));
			setRegistryName("tomato");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 24;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

	}

}
