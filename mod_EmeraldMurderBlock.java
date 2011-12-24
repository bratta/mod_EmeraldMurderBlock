package net.minecraft.src;

import java.util.Random;

public class mod_EmeraldMurderBlock extends BaseMod {
	
	private static Block emeraldOre;
	private static Block emeraldBlock;
	private static Item emeraldItem;
	private static StepSound soundMetalFootstep;
	
	public static Block getEmeraldOre() {
		return emeraldOre;
	}

	public static void setEmeraldOre(Block emeraldOre) {
		mod_EmeraldMurderBlock.emeraldOre = emeraldOre;
	}

	public static Block getEmeraldBlock() {
		return emeraldBlock;
	}

	public static void setEmeraldBlock(Block emeraldBlock) {
		mod_EmeraldMurderBlock.emeraldBlock = emeraldBlock;
	}

	public static Item getEmeraldItem() {
		return emeraldItem;
	}

	public static void setEmeraldItem(Item emeraldItem) {
		mod_EmeraldMurderBlock.emeraldItem = emeraldItem;
	}

	@Override
	public String getVersion() {
		return "0.1";
	}

	@Override
	public void load() {
		int emeraldOreId = 123;
		int emeraldId = 124;
		int emeraldItemId = 2000;
			
		// Emerald Ore
		emeraldOre = new BlockEmeraldOre(emeraldOreId, ModLoader.addOverride("/terrain.png", "/net/minecraft/src/emerald_ore.png"));
		emeraldOre.setHardness(2.0F);
		emeraldOre.setResistance(5.0F);
		emeraldOre.setBlockName("emerald");
		ModLoader.RegisterBlock(emeraldOre);
		ModLoader.AddName(emeraldOre,  "Emerald Ore");
		
		// Added to test before world generation
		//ModLoader.AddRecipe(new ItemStack(emeraldOre, 8), new Object[] {
		//	"SSS", "SCS", "SSS",
		//	Character.valueOf('C'), Block.cobblestone,
		//	Character.valueOf('S'), Block.dirt
		//});
		
		// Emerald Block
		soundMetalFootstep = new StepSound("stone", 1.0F, 1.5F);
		emeraldBlock = new BlockEmerald(emeraldId, ModLoader.addOverride("/terrain.png", "/net/minecraft/src/emerald_block.png"));
		emeraldBlock.setHardness(5F);
		emeraldBlock.setResistance(10.0F);
		emeraldBlock.setLightOpacity(3);
		emeraldBlock.setStepSound(soundMetalFootstep);
		emeraldBlock.setBlockName("emeraldBlock");
		ModLoader.RegisterBlock(emeraldBlock);		
		ModLoader.AddName(emeraldBlock, "Emerald Murder Block");
		
		// Emerald Item
		emeraldItem = new ItemEmerald(emeraldItemId).setItemName("emeraldItem");
		ModLoader.AddName(emeraldItem,  "Emerald");
     	emeraldItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/net/minecraft/src/emerald_item.png");
     	ModLoader.AddSmelting(emeraldItem.shiftedIndex, new ItemStack(emeraldBlock, 1));     	
	}
	
	public void GenerateSurface(World world, Random random, int i, int j) {
		for (int a=0; a < BlockEmeraldOre.rarity; a++) {
			int posX = i + random.nextInt(16);
			int posY = random.nextInt(BlockEmeraldOre.max_depth) + BlockEmeraldOre.min_depth;
			int posZ = j + random.nextInt(16);
			new WorldGenMinable(emeraldOre.blockID, BlockEmeraldOre.veinSize).generate(world,  random, posX, posY, posZ);
		}
	}

}
