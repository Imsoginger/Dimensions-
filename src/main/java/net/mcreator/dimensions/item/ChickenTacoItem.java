
package net.mcreator.dimensions.item;

@DimensionsElements.ModElement.Tag
public class ChickenTacoItem extends DimensionsElements.ModElement {

	@ObjectHolder("dimensions:chickentaco")
	public static final Item block = null;

	public ChickenTacoItem(DimensionsElements instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).food((new Food.Builder()).hunger(10).saturation(0.9f)

					.meat().build()));
			setRegistryName("chickentaco");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

	}

}
