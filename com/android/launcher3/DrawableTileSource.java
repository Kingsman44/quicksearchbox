package com.android.launcher3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.android.p261d.p264c.C5053a;
import com.android.p261d.p264c.C5054b;
import com.android.p271h.p272a.C5156d;
import com.android.p271h.p272a.C5157e;

/* compiled from: PG */
public final class DrawableTileSource implements C5156d {
    private final Drawable mDrawable;
    private C5054b mPreview;
    private final int mPreviewSize = Math.min(1024, 1024);
    private final int mTileSize;

    public DrawableTileSource(Context context, Drawable drawable) {
        this.mTileSize = C5157e.m14089a(context);
        this.mDrawable = drawable;
    }

    public final int getImageHeight() {
        return this.mDrawable.getIntrinsicHeight();
    }

    public final int getImageWidth() {
        return this.mDrawable.getIntrinsicWidth();
    }

    public final C5053a getPreview() {
        if (this.mPreviewSize == 0) {
            return null;
        }
        if (this.mPreview == null) {
            float intrinsicWidth = (float) this.mDrawable.getIntrinsicWidth();
            float intrinsicHeight = (float) this.mDrawable.getIntrinsicHeight();
            while (true) {
                if (intrinsicWidth <= 1024.0f && intrinsicHeight <= 1024.0f) {
                    break;
                }
                intrinsicWidth /= 2.0f;
                intrinsicHeight /= 2.0f;
            }
            int i = (int) intrinsicWidth;
            int i2 = (int) intrinsicHeight;
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            this.mDrawable.setBounds(new Rect(0, 0, i, i2));
            this.mDrawable.draw(canvas);
            canvas.setBitmap((Bitmap) null);
            this.mPreview = new C5054b(createBitmap);
        }
        return this.mPreview;
    }

    public final int getRotation() {
        return 0;
    }

    public final Bitmap getTile(int i, int i2, int i3, Bitmap bitmap) {
        int i4 = this.mTileSize;
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmap);
        Rect rect = new Rect(0, 0, this.mDrawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
        rect.offset(-i2, -i3);
        this.mDrawable.setBounds(rect);
        this.mDrawable.draw(canvas);
        canvas.setBitmap((Bitmap) null);
        return bitmap;
    }

    public final int getTileSize() {
        return this.mTileSize;
    }
}
