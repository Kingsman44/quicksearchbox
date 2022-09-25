package com.google.android.libraries.social.peoplekit.chips.viewcontrollers;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: com.google.android.libraries.social.peoplekit.chips.viewcontrollers.n */
/* compiled from: PG */
public final class C42068n extends BitmapDrawable {

    /* renamed from: a */
    private static final Matrix f109960a;

    /* renamed from: b */
    private final Paint f109961b;

    static {
        Matrix matrix = new Matrix();
        f109960a = matrix;
        matrix.postTranslate(-0.5f, -0.5f);
    }

    public C42068n(Bitmap bitmap) {
        float f;
        Paint paint = new Paint();
        this.f109961b = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        if (width > height) {
            matrix.postTranslate((width - height) / 2.0f, 0.0f);
            f = 1.0f / height;
        } else {
            if (width < height) {
                matrix.postTranslate(0.0f, (height - width) / 2.0f);
            }
            f = 1.0f / width;
        }
        matrix.postScale(f, f);
        matrix.postConcat(f109960a);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        try {
            Rect bounds = getBounds();
            canvas.translate(bounds.exactCenterX(), bounds.exactCenterY());
            float min = (float) Math.min(bounds.width(), bounds.height());
            canvas.scale(min, min);
            canvas.drawCircle(0.0f, 0.0f, 0.5f, this.f109961b);
        } finally {
            canvas.restore();
        }
    }
}
