package net.minecraft.src;

import java.util.logging.Logger;

import net.minecraft.client.Minecraft;

public class BlockEmerald extends Block {
    private static final Logger logger = Logger.getLogger("BlockEmerald");
	
	public BlockEmerald(int i, int j) {
		super (i, j, Material.iron);
	}
	
	public void onBlockClicked(World world, int i, int j, int k, EntityPlayer entityplayer) {
		entityplayer.kill();
        super.onBlockClicked(world, i, j, k, entityplayer);
	}
	
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k) {
    	float f = 0.0625F;
    	return AxisAlignedBB.getBoundingBoxFromPool((float)i + f, j, (float)k + f, (float)(i + 1) - f, (float)(j + 1) - f, (float)(k + 1) - f);
    }
    
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int i, int j, int k) {
    	float f = 0.0625F;
    	return AxisAlignedBB.getBoundingBoxFromPool((float)i + f, j, (float)k + f, (float)(i + 1) - f, j + 1, (float)(k + 1) - f);
    }
	
    public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity) {
    	if (entity instanceof EntityCreature) {
			teleport(world, entity);
 		}
    }
       
	
 	private void teleport(World worldObj, Entity entity) {
		worldObj.playSoundAtEntity(entity, "mob.endermen.portal", 1.0F, 1.0F);
		entity.setPosition(entity.posX + entity.rand.nextInt(5), entity.posY + 24.0D, entity.posZ + entity.rand.nextInt(5));
	}
 }
