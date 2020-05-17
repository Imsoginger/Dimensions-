
package net.mcreator.dimensions.block;

@DimensionsElements.ModElement.Tag
public class RubiesOreBlockBlock extends DimensionsElements.ModElement {

	@ObjectHolder("dimensions:rubiesoreblock")
	public static final Block block = null;

	public RubiesOreBlockBlock(DimensionsElements instance) {
		super(instance, 53);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5f, 10f).lightValue(0).harvestLevel(6)
							.harvestTool(ToolType.PICKAXE));

			setRegistryName("rubiesoreblock");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
