package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.ModelRendererTurbo;

public class ModelCaboose3 extends ModelBase {

	public ModelCaboose3() {

		// sideModels = new ModelRendererTurbo[16];
		bogey = new ModelRendererTurbo(this, 2, 9, 256, 128);
		bogey.addBox(0F, 0F, 0F, 1, 6, 14);
		bogey.setPosition(-6F, 0F, -17F);

		bogey0 = new ModelRendererTurbo(this, 2, 9, 256, 128);
		bogey0.addBox(0F, 0F, 0F, 1, 6, 14);
		bogey0.setPosition(5F, 0F, -17F);

		box = new ModelRendererTurbo(this, 35, 9, 256, 128);
		box.addBox(0F, 0F, 0F, 1, 6, 14);
		box.setPosition(6F, 0F, -17F);

		box0 = new ModelRendererTurbo(this, 35, 9, 256, 128);
		box0.addBox(0F, 0F, 0F, 1, 6, 14);
		box0.setPosition(-7F, 0F, -17F);

		box1 = new ModelRendererTurbo(this, 35, 9, 256, 128);
		box1.addBox(0F, 0F, 0F, 1, 6, 14);
		box1.setPosition(-7F, 0F, 4F);

		box10 = new ModelRendererTurbo(this, 80, 97, 256, 128);
		box10.addBox(0F, 0F, 0F, 10, 2, 5);
		box10.setPosition(-5F, 7F, -18F);

		box11 = new ModelRendererTurbo(this, 79, 92, 256, 128);
		box11.addBox(0F, 0F, 0F, 16, 4, 1);
		box11.setPosition(-8F, 6F, 19F);

		box12 = new ModelRendererTurbo(this, 79, 92, 256, 128);
		box12.addBox(0F, 0F, 0F, 16, 4, 1);
		box12.setPosition(-8F, 6F, -19F);

		box13 = new ModelRendererTurbo(this, 14, 107, 256, 128);
		box13.addBox(0F, 0F, 0F, 1, 7, 1);
		box13.setPosition(6F, 10F, 19F);

		box14 = new ModelRendererTurbo(this, 6, 107, 256, 128);
		box14.addBox(0F, 0F, 0F, 1, 7, 1);
		box14.setPosition(-7F, 10F, 19F);

		box15 = new ModelRendererTurbo(this, 1, 117, 256, 128);
		box15.addBox(0F, 0F, 0F, 16, 1, 1);
		box15.setPosition(-8F, 17F, 19F);

		box16 = new ModelRendererTurbo(this, 26, 107, 256, 128);
		box16.addBox(0F, 0F, 0F, 1, 7, 1);
		box16.setPosition(2F, 10F, 19F);

		box17 = new ModelRendererTurbo(this, 10, 107, 256, 128);
		box17.addBox(0F, 0F, 0F, 1, 7, 1);
		box17.setPosition(-3F, 10F, 19F);

		box18 = new ModelRendererTurbo(this, 2, 107, 256, 128);
		box18.addBox(0F, 0F, 0F, 1, 7, 1);
		box18.setPosition(6F, 10F, -19F);

		box19 = new ModelRendererTurbo(this, 30, 107, 256, 128);
		box19.addBox(0F, 0F, 0F, 1, 7, 1);
		box19.setPosition(-7F, 10F, -19F);

		box2 = new ModelRendererTurbo(this, 35, 9, 256, 128);
		box2.addBox(0F, 0F, 0F, 1, 6, 14);
		box2.setPosition(6F, 0F, 4F);

		box20 = new ModelRendererTurbo(this, 21, 106, 256, 128);
		box20.addBox(0F, 0F, 0F, 1, 7, 1);
		box20.setPosition(-3F, 10F, -19F);

		box21 = new ModelRendererTurbo(this, 22, 107, 256, 128);
		box21.addBox(0F, 0F, 0F, 1, 7, 1);
		box21.setPosition(2F, 10F, -19F);

		box22 = new ModelRendererTurbo(this, 1, 103, 256, 128);
		box22.addBox(0F, 0F, 0F, 16, 1, 1);
		box22.setPosition(-8F, 17F, -19F);

		box23 = new ModelRendererTurbo(this, 35, 26, 256, 128);
		box23.addBox(0F, 0F, 0F, 6, 2, 37);
		box23.setPosition(-3F, 29F, -18F);

		box24 = new ModelRendererTurbo(this, 188, 86, 256, 128);
		box24.addBox(0F, 0F, 0F, 14, 4, 10);
		box24.setPosition(-7F, 28F, -5F);

		box25 = new ModelRendererTurbo(this, 70, 5, 256, 128);
		box25.addBox(0F, 0F, 0F, 8, 1, 12);
		box25.setPosition(0F, 33F, -6F);
		box25.rotateAngleZ = -0.13962634015954636F;

		box26 = new ModelRendererTurbo(this, 90, 19, 256, 128);
		box26.addBox(0F, 0F, 0F, 8, 1, 12);
		box26.setPosition(0F, 33F, 6F);
		box26.rotateAngleY = 3.141592653589793F;
		box26.rotateAngleZ = 0.13962634015954636F;

		box27 = new ModelRendererTurbo(this, 179, 75, 256, 128);
		box27.addBox(0F, 0F, 0F, 12, 1, 1);
		box27.setPosition(-6F, 32F, -5F);

		box28 = new ModelRendererTurbo(this, 179, 75, 256, 128);
		box28.addBox(0F, 0F, 0F, 12, 1, 1);
		box28.setPosition(-6F, 32F, 4F);

		box29 = new ModelRendererTurbo(this, 47, 40, 256, 128);
		box29.addBox(0F, 0F, 0F, 1, 5, 1);
		box29.setPosition(5F, 29F, 10F);

		box3 = new ModelRendererTurbo(this, 188, 75, 256, 128);
		box3.addBox(0F, 0F, 0F, 1, 19, 27);
		box3.setPosition(7F, 9F, -13F);

		box4 = new ModelRendererTurbo(this, 117, 80, 256, 128);
		box4.addBox(0F, 0F, 0F, 14, 20, 1);
		box4.setPosition(-7F, 9F, -13F);

		box5 = new ModelRendererTurbo(this, 155, 5, 256, 128);
		box5.addBox(0F, 0F, 0F, 9, 1, 39);
		box5.setPosition(0F, 29F, 20F);
		box5.rotateAngleY = 3.141592653589793F;
		box5.rotateAngleZ = 0.13962634015954636F;

		box52 = new ModelRendererTurbo(this, 27, 56, 256, 128);
		box52.addBox(0F, 0F, 0F, 14, 1, 1);
		box52.setPosition(-7F, 5F, -3F);

		box53 = new ModelRendererTurbo(this, 27, 56, 256, 128);
		box53.addBox(0F, 0F, 0F, 14, 1, 1);
		box53.setPosition(-7F, 5F, -18F);

		box54 = new ModelRendererTurbo(this, 30, 44, 256, 128);
		box54.addBox(0F, 0F, 0F, 4, 2, 3);
		box54.setPosition(-2F, 7F, 20F);

		box55 = new ModelRendererTurbo(this, 2, 33, 256, 128);
		box55.addBox(0F, 0F, 0F, 4, 3, 4);
		box55.setPosition(-2F, 4F, -12F);

		box6 = new ModelRendererTurbo(this, 156, 80, 256, 128);
		box6.addBox(0F, 0F, 0F, 14, 20, 1);
		box6.setPosition(-7F, 9F, 13F);

		box68 = new ModelRendererTurbo(this, 30, 44, 256, 128);
		box68.addBox(0F, 0F, 0F, 4, 2, 3);
		box68.setPosition(-2F, 7F, -22F);

		box7 = new ModelRendererTurbo(this, 93, 17, 256, 128);
		box7.addBox(0F, 0F, 0F, 9, 1, 39);
		box7.setPosition(0F, 29F, -19F);
		box7.rotateAngleZ = -0.13962634015954636F;

		box71 = new ModelRendererTurbo(this, 28, 52, 256, 128);
		box71.addBox(0F, 0F, 0F, 12, 2, 2);
		box71.setPosition(-6F, 2F, -11F);

		box72 = new ModelRendererTurbo(this, 27, 56, 256, 128);
		box72.addBox(0F, 0F, 0F, 14, 1, 1);
		box72.setPosition(-7F, 5F, 3F);

		box73 = new ModelRendererTurbo(this, 27, 56, 256, 128);
		box73.addBox(0F, 0F, 0F, 14, 1, 1);
		box73.setPosition(-7F, 5F, 18F);

		box78 = new ModelRendererTurbo(this, 123, 75, 256, 128);
		box78.addBox(0F, 0F, 0F, 1, 19, 27);
		box78.setPosition(-8F, 9F, -13F);

		box79 = new ModelRendererTurbo(this, 10, 96, 256, 128);
		box79.addBox(0F, 0F, 0F, 16, 2, 27);
		box79.setPosition(-8F, 7F, -13F);

		box8 = new ModelRendererTurbo(this, 2, 33, 256, 128);
		box8.addBox(0F, 0F, 0F, 4, 3, 4);
		box8.setPosition(-2F, 4F, 9F);

		box80 = new ModelRendererTurbo(this, 2, 9, 256, 128);
		box80.addBox(0F, 0F, 0F, 1, 6, 14);
		box80.setPosition(-6F, 0F, 4F);

		box81 = new ModelRendererTurbo(this, 2, 9, 256, 128);
		box81.addBox(0F, 0F, 0F, 1, 6, 14);
		box81.setPosition(5F, 0F, 4F);

		box82 = new ModelRendererTurbo(this, 28, 52, 256, 128);
		box82.addBox(0F, 0F, 0F, 12, 2, 2);
		box82.setPosition(-6F, 2F, 10F);

		box9 = new ModelRendererTurbo(this, 80, 97, 256, 128);
		box9.addBox(0F, 0F, 0F, 10, 2, 5);
		box9.setPosition(-5F, 7F, 14F);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		/*if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}*/
		bogey.render(f5);
		bogey0.render(f5);
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box10.render(f5);
		box11.render(f5);
		box12.render(f5);
		box13.render(f5);
		box14.render(f5);
		box15.render(f5);
		box16.render(f5);
		box17.render(f5);
		box18.render(f5);
		box19.render(f5);
		box2.render(f5);
		box20.render(f5);
		box21.render(f5);
		box22.render(f5);
		box23.render(f5);
		box24.render(f5);
		box25.render(f5);
		box26.render(f5);
		box27.render(f5);
		box28.render(f5);
		box29.render(f5);
		box3.render(f5);
		box4.render(f5);
		box5.render(f5);
		box52.render(f5);
		box53.render(f5);
		box54.render(f5);
		box55.render(f5);
		box6.render(f5);
		box68.render(f5);
		box7.render(f5);
		box71.render(f5);
		box72.render(f5);
		box73.render(f5);
		box78.render(f5);
		box79.render(f5);
		box8.render(f5);
		box80.render(f5);
		box81.render(f5);
		box82.render(f5);
		box9.render(f5);

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

	public ModelRendererTurbo bogey;
	public ModelRendererTurbo bogey0;
	public ModelRendererTurbo box;
	public ModelRendererTurbo box0;
	public ModelRendererTurbo box1;
	public ModelRendererTurbo box10;
	public ModelRendererTurbo box11;
	public ModelRendererTurbo box12;
	public ModelRendererTurbo box13;
	public ModelRendererTurbo box14;
	public ModelRendererTurbo box15;
	public ModelRendererTurbo box16;
	public ModelRendererTurbo box17;
	public ModelRendererTurbo box18;
	public ModelRendererTurbo box19;
	public ModelRendererTurbo box2;
	public ModelRendererTurbo box20;
	public ModelRendererTurbo box21;
	public ModelRendererTurbo box22;
	public ModelRendererTurbo box23;
	public ModelRendererTurbo box24;
	public ModelRendererTurbo box25;
	public ModelRendererTurbo box26;
	public ModelRendererTurbo box27;
	public ModelRendererTurbo box28;
	public ModelRendererTurbo box29;
	public ModelRendererTurbo box3;
	public ModelRendererTurbo box4;
	public ModelRendererTurbo box5;
	public ModelRendererTurbo box52;
	public ModelRendererTurbo box53;
	public ModelRendererTurbo box54;
	public ModelRendererTurbo box55;
	public ModelRendererTurbo box6;
	public ModelRendererTurbo box68;
	public ModelRendererTurbo box7;
	public ModelRendererTurbo box71;
	public ModelRendererTurbo box72;
	public ModelRendererTurbo box73;
	public ModelRendererTurbo box78;
	public ModelRendererTurbo box79;
	public ModelRendererTurbo box8;
	public ModelRendererTurbo box80;
	public ModelRendererTurbo box81;
	public ModelRendererTurbo box82;
	public ModelRendererTurbo box9;

}
