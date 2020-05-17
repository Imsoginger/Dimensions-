
package net.mcreator.dimensions.world.biome;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.dimensions.block.YesandBlock;
import net.mcreator.dimensions.DimensionsElements;

@DimensionsElements.ModElement.Tag
public class Biome100DesertBiome extends DimensionsElements.ModElement {
	@ObjectHolder("dimensions:biome100desert")
	public static final CustomBiome biome = null;
	public Biome100DesertBiome(DimensionsElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.SANDY, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.WASTELAND);
	}
	static class CustomBiome extends Biome {
		public CustomBiome() {
			super(new Biome.Builder().downfall(0f).depth(0.1f).scale(0.2f).temperature(0.5f).precipitation(Biome.RainType.NONE)
					.category(Biome.Category.DESERT).waterColor(-52).waterFogColor(-52).parent("desert")
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(YesandBlock.block.getDefaultState(),
							Blocks.STONE.getDefaultState(), Blocks.STONE.getDefaultState())));
			setRegistryName("biome100desert");
			DefaultBiomeFeatures.addCarvers(this);
			DefaultBiomeFeatures.addStructures(this);
			DefaultBiomeFeatures.addMonsterRooms(this);
			DefaultBiomeFeatures.addOres(this);
			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.DEAD_BUSH,
					IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(8)));
			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.CACTUS, IFeatureConfig.NO_FEATURE_CONFIG,
					Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(4)));
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getGrassColor(BlockPos pos) {
			return -103;
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getFoliageColor(BlockPos pos) {
			return -103;
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getSkyColorByTemp(float currentTemperature) {
			return -103;
		}
	}
}
