
package net.mcreator.dimensions.item;

@DimensionsElements.ModElement.Tag
public class YeronIngotItem extends DimensionsElements.ModElement {

	@ObjectHolder("dimensions:yeroningot")
	public static final Item block = null;

	public YeronIngotItem(DimensionsElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64));
			setRegistryName("yeroningot");
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
