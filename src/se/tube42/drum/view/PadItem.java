package se.tube42.drum.view;

import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.audio.*;
import com.badlogic.gdx.Input.*;

import se.tube42.lib.tweeny.*;
import se.tube42.lib.ks.*;
import se.tube42.lib.scene.*;
import se.tube42.lib.util.*;
import se.tube42.lib.item.*;

import se.tube42.drum.data.*;
import se.tube42.drum.logic.*;

import static se.tube42.drum.data.Constants.*;


public class PadItem extends BaseItem
{
    private int tile;

    public PadItem(int tile, int color)
    {

        setColor(color);
        setTile(tile);
    }

    //

    public void mark0()
    {
        final float r = ServiceProvider.getRandom(0.08f, 0.12f);

        set(ITEM_S, 0.9f).configure(1 * r, null)
              .tail(1.1f).configure(2 * r, null)
              .tail(1.0f).configure(1 * r, null);
    }

    //
    public void setTile(int tile)
    {
        this.tile = tile;
    }


    public void draw(SpriteBatch sb)
    {
        final float a = getAlpha();
        final float s = getScale();
        final float x = getX();
        final float y = getY();
        final float r = getRotation();
        final float w2 = w / 2;
        final float h2 = h / 2;


        // draw tile
        if(tile != -1) {
            final TextureRegion tr = World.tex_tiles[tile];
            sb.setColor( cr, cg, cb, a);
            sb.draw(tr,
                    x + 0.5f, y + 0.5f,
                    w2, h2,
                    w, h,
                    s, s, r);
        }
    }

}
