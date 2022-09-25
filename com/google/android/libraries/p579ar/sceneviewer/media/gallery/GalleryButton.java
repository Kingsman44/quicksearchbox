package com.google.android.libraries.p579ar.sceneviewer.media.gallery;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p033v7.widget.AppCompatImageButton;
import android.util.AttributeSet;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.gallery.GalleryButton */
/* compiled from: PG */
public final class GalleryButton extends AppCompatImageButton {
    private static final int STROKE_WIDTH_DP = 2;
    private Bitmap bitmap;
    private final Paint paint = new Paint(1);
    float strokeWidthPx;

    public GalleryButton(Context context) {
        super(context);
        initialize(context);
    }

    private void initialize(Context context) {
        this.paint.setStyle(Paint.Style.STROKE);
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = f + f;
        this.strokeWidthPx = f2;
        this.paint.setStrokeWidth(f2);
        this.paint.setColor(getResources().getColor(C10730R.color.gallery_button_border_color));
    }

    public Bitmap getThumbnail() {
        return this.bitmap;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        float width = (float) (getWidth() / 2);
        Path path = new Path();
        path.addCircle(width, width, width, Path.Direction.CW);
        canvas.clipPath(path);
        Bitmap bitmap2 = this.bitmap;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), (Paint) null);
        }
        canvas.drawCircle(width, width, width - (this.strokeWidthPx / 2.0f), this.paint);
        canvas.restore();
    }

    public void setThumbnail(Bitmap bitmap2) {
        this.bitmap = bitmap2;
        invalidate();
    }

    public GalleryButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context);
    }
}
