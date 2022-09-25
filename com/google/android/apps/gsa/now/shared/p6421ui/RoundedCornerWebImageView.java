package com.google.android.apps.gsa.now.shared.p6421ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: com.google.android.apps.gsa.now.shared.ui.RoundedCornerWebImageView */
/* compiled from: PG */
public class RoundedCornerWebImageView extends WebImageView implements C83417f {

    /* renamed from: a */
    private RoundRectShape f227340a;

    /* renamed from: b */
    private Paint f227341b;

    /* renamed from: c */
    BitmapShader f227342c;

    /* renamed from: d */
    public boolean f227343d;

    /* renamed from: e */
    float[] f227344e;

    /* renamed from: m */
    private float f227345m;

    /* renamed from: n */
    private int f227346n;

    /* renamed from: o */
    private Rect f227347o;

    /* renamed from: p */
    private RectF f227348p;

    /* renamed from: q */
    private Path f227349q;

    /* renamed from: r */
    private boolean f227350r;

    public RoundedCornerWebImageView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* renamed from: j */
    private final void m132780j(float f, int i) {
        if (f <= 0.0f || i <= 0) {
            this.f227349q = null;
            this.f227340a = null;
            this.f227341b = null;
            return;
        }
        this.f227344e = C83418g.m132812a(f, i);
        this.f227349q = new Path();
        this.f227340a = new RoundRectShape(this.f227344e, (RectF) null, (float[]) null);
        Paint paint = new Paint();
        this.f227341b = paint;
        paint.setAntiAlias(true);
    }

    /* renamed from: k */
    private final void m132781k() {
        Drawable drawable = getDrawable();
        if (!(drawable instanceof BitmapDrawable) || this.f227342c == null || this.f227341b == null) {
            this.f227350r = false;
            return;
        }
        this.f227350r = true;
        ImageView.ScaleType scaleType = getScaleType();
        if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                float f = (float) intrinsicWidth;
                float f2 = (float) intrinsicHeight;
                float min = Math.min(((float) width) / f, ((float) height) / f2);
                intrinsicHeight = (int) ((min * f2) + 0.5f);
                intrinsicWidth = (int) ((f * min) + 0.5f);
            }
            if (intrinsicWidth < width || intrinsicHeight < height) {
                this.f227350r = false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo76711b() {
        super.mo76711b();
        this.f227342c = null;
        Paint paint = this.f227341b;
        if (paint != null) {
            paint.setShader((Shader) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo76727c() {
        Drawable drawable = getDrawable();
        Bitmap bitmap = drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
        if (this.f227340a != null && bitmap != null) {
            this.f227342c = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        }
    }

    /* renamed from: hb */
    public final void mo76723hb(int i) {
        float f = (float) i;
        if (this.f227345m != f) {
            this.f227345m = f;
            m132780j(f, this.f227346n);
            invalidate();
        }
    }

    /* renamed from: hc */
    public final void mo76724hc(int i) {
        if (this.f227346n != i) {
            this.f227346n = i;
            m132780j(this.f227345m, i);
            invalidate();
        }
    }

    public final void onDraw(Canvas canvas) {
        BitmapShader bitmapShader;
        Path path;
        canvas.getClipBounds(this.f227347o);
        this.f227348p.set(this.f227347o);
        float[] fArr = this.f227344e;
        if (!(fArr == null || (path = this.f227349q) == null)) {
            path.addRoundRect(this.f227348p, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(this.f227349q);
        }
        if (getDrawable() == null || (bitmapShader = this.f227342c) == null || this.f227341b == null || !this.f227350r) {
            super.onDraw(canvas);
            return;
        }
        bitmapShader.setLocalMatrix(getImageMatrix());
        Paint paint = this.f227341b;
        paint.getClass();
        paint.setShader(this.f227342c);
        RoundRectShape roundRectShape = this.f227340a;
        if (roundRectShape != null) {
            roundRectShape.resize((float) getWidth(), (float) getHeight());
            this.f227340a.draw(canvas, this.f227341b);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f227343d) {
            mo76723hb((i3 - i) / 2);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        m132781k();
        return frame;
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        mo76727c();
        m132781k();
    }

    public final void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        m132781k();
    }

    public RoundedCornerWebImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedCornerWebImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f227347o = new Rect();
        this.f227348p = new RectF();
        this.f227350r = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C83415d.f227387c, i, 0);
            this.f227345m = obtainStyledAttributes.getDimension(0, 0.0f);
            this.f227346n = obtainStyledAttributes.getInteger(1, 0);
            obtainStyledAttributes.recycle();
            m132780j(this.f227345m, this.f227346n);
            mo76727c();
            m132781k();
            return;
        }
        this.f227340a = null;
        this.f227341b = null;
    }

    /* renamed from: d */
    public final void mo76728d(float f, float f2, float f3, float f4) {
        if (f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 0.0f) {
            this.f227340a = null;
            this.f227341b = null;
            this.f227342c = null;
        } else {
            float[] fArr = new float[8];
            this.f227344e = fArr;
            fArr[0] = f;
            fArr[1] = f;
            fArr[2] = f2;
            fArr[3] = f2;
            fArr[4] = f3;
            fArr[5] = f3;
            fArr[6] = f4;
            fArr[7] = f4;
            this.f227340a = new RoundRectShape(this.f227344e, (RectF) null, (float[]) null);
            if (this.f227341b == null) {
                Paint paint = new Paint();
                this.f227341b = paint;
                paint.setAntiAlias(true);
            }
            mo76727c();
        }
        invalidate();
    }
}
