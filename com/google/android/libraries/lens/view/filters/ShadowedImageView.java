package com.google.android.libraries.lens.view.filters;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.support.p033v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.android.libraries.lens.view.utils.C28134w;

/* compiled from: PG */
public final class ShadowedImageView extends AppCompatImageView {

    /* renamed from: a */
    private int f70222a = -16777216;

    /* renamed from: b */
    private float f70223b = 0.0f;

    /* renamed from: c */
    private float f70224c = 2.0f;

    /* renamed from: d */
    private float f70225d = 4.0f;

    /* renamed from: e */
    private C25924bc f70226e;

    public ShadowedImageView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m47691a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C25923bb.f70421a, 0, 0);
        try {
            this.f70222a = obtainStyledAttributes.getColor(0, this.f70222a);
            this.f70223b = obtainStyledAttributes.getFloat(1, this.f70223b);
            this.f70224c = obtainStyledAttributes.getFloat(2, this.f70224c);
            this.f70225d = obtainStyledAttributes.getFloat(3, this.f70225d);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (getDrawable() != null) {
            if (this.f70225d > 0.0f && (getDrawable() instanceof BitmapDrawable) && getVisibility() == 0) {
                if (this.f70226e == null) {
                    Paint paint = new Paint(1);
                    Paint paint2 = new Paint(1);
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(C28134w.m52424a(this.f70225d, getContext()), BlurMaskFilter.Blur.NORMAL);
                    Paint paint3 = new Paint(1);
                    paint3.setAntiAlias(true);
                    paint3.setColor(this.f70222a);
                    paint3.setMaskFilter(blurMaskFilter);
                    paint3.setFilterBitmap(true);
                    this.f70226e = new C25924bc(paint, paint2, paint3);
                }
                C25924bc bcVar = this.f70226e;
                Bitmap bitmap = ((BitmapDrawable) getDrawable()).getBitmap();
                float a = C28134w.m52424a(this.f70223b, getContext());
                float a2 = C28134w.m52424a(this.f70224c, getContext());
                Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ALPHA_8);
                Matrix matrix = new Matrix();
                matrix.setRectToRect(new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight()), new RectF(0.0f, 0.0f, ((float) getWidth()) - a2, ((float) getHeight()) - a2), Matrix.ScaleToFit.CENTER);
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(a, a2);
                Canvas canvas2 = new Canvas(createBitmap);
                canvas2.drawBitmap(bitmap, matrix, bcVar.f70422a);
                canvas2.drawBitmap(bitmap, matrix2, bcVar.f70423b);
                Bitmap createBitmap2 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap2).drawBitmap(createBitmap, 0.0f, 0.0f, bcVar.f70424c);
                createBitmap.recycle();
                canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, new Paint());
            }
            super.onDraw(canvas);
        }
    }

    public ShadowedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m47691a(context, attributeSet);
    }

    public ShadowedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m47691a(context, attributeSet);
    }
}
