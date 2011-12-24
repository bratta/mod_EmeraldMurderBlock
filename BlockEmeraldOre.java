package net.minecraft.src;

import java.util.Random;

public class BlockEmeraldOre extends Block {
	public static final int rarity = 20;
	public static final int veinSize = 5;
	public static final int min_depth = 10;
	public static final int max_depth = 70;
	
	public BlockEmeraldOre(int i, int j) {
		super (i, j, Material.iron);
	}
	
    public int idDropped(int i, Random random, int j) {
        return mod_EmeraldMurderBlock.getEmeraldItem().shiftedIndex;
    }
	
    public int quantityDropped(Random random) {
          return 2 + random.nextInt(5);
    }
}
