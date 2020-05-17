
package net.mcreator.dimensions.item;

@DimensionsElements.ModElement.Tag
public class RubiesIngotItem extends DimensionsElements.ModElement {

	@ObjectHolder("dimensions:rubiesingot")
	public static final Item block = null;

	public RubiesIngotItem(DimensionsElements instance) {
		super(instance, 54);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64));
			setRegistryName("rubiesingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
