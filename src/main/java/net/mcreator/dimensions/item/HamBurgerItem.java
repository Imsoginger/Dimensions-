
package net.mcreator.dimensions.item;

@DimensionsElements.ModElement.Tag
public class HamBurgerItem extends DimensionsElements.ModElement {

	@ObjectHolder("dimensions:hamburger")
	public static final Item block = null;

	public HamBurgerItem(DimensionsElements instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).food((new Food.Builder()).hunger(8).saturation(0.3f)

					.meat().build()));
			setRegistryName("hamburger");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 40;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

	}

}
