package com.google.android.libraries.material.featurehighlight;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.graphics.C1924a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.p2205a.C28497j;
import com.google.android.libraries.material.p2207c.C28508a;

/* renamed from: com.google.android.libraries.material.featurehighlight.ah */
/* compiled from: PG */
public final class C28517ah extends Drawable {

    /* renamed from: a */
    public int f77457a;

    /* renamed from: b */
    public final Rect f77458b = new Rect();

    /* renamed from: c */
    public final Rect f77459c = new Rect();

    /* renamed from: d */
    public final Paint f77460d;

    /* renamed from: e */
    public final int f77461e;

    /* renamed from: f */
    public int f77462f;

    /* renamed from: g */
    public int f77463g;

    /* renamed from: h */
    public float f77464h;

    /* renamed from: i */
    public float f77465i;

    /* renamed from: j */
    public float f77466j;

    /* renamed from: k */
    private final Paint f77467k;

    /* renamed from: l */
    private float f77468l;

    /* renamed from: m */
    private float f77469m;

    /* renamed from: n */
    private float f77470n;

    /* renamed from: o */
    private int f77471o;

    /* renamed from: p */
    private int f77472p;

    public C28517ah(Context context) {
        int i;
        Paint paint = new Paint();
        this.f77460d = paint;
        Paint paint2 = new Paint();
        this.f77467k = paint2;
        this.f77468l = 1.0f;
        this.f77469m = 0.0f;
        this.f77470n = 0.0f;
        this.f77471o = 244;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16843827, typedValue, true)) {
            i = typedValue.data;
        } else {
            i = context.getResources().getColor(R.color.quantum_googblue600);
        }
        mo34050c(C1924a.m5189h(i, 244));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        mo34051d(0);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        Resources resources = context.getResources();
        this.f77457a = resources.getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_center_threshold);
        this.f77462f = resources.getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_center_horizontal_offset);
        this.f77463g = resources.getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_center_vertical_offset);
        this.f77461e = resources.getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_outer_padding);
    }

    /* renamed from: f */
    public static final int m53354f(int i, float f, int i2) {
        return (int) (((((f * f) * 9.0f) - ((float) ((i * 8) * i2))) - ((float) ((i2 * i2) * 4))) / ((float) (i2 * 8)));
    }

    /* renamed from: g */
    public static final float m53355g(float f, float f2, Rect rect) {
        float f3 = (float) rect.left;
        float f4 = (float) rect.top;
        float f5 = (float) rect.right;
        float f6 = (float) rect.bottom;
        float a = C28508a.m53285a(f, f2, f3, f4);
        float a2 = C28508a.m53285a(f, f2, f5, f4);
        float a3 = C28508a.m53285a(f, f2, f5, f6);
        float a4 = C28508a.m53285a(f, f2, f3, f6);
        if (a <= a2 || a <= a3 || a <= a4) {
            a = (a2 <= a3 || a2 <= a4) ? a3 > a4 ? a3 : a4 : a2;
        }
        return (float) Math.ceil((double) a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final float mo34048a(Rect rect) {
        return m53355g(this.f77465i + this.f77469m, this.f77466j + this.f77470n, rect);
    }

    /* renamed from: b */
    public final Animator mo34049b(float f, float f2, float f3) {
        float f4 = 1.0f - f3;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scale", new float[]{f3, 1.0f}), PropertyValuesHolder.ofFloat("translationX", new float[]{f * f4, 0.0f}), PropertyValuesHolder.ofFloat("translationY", new float[]{f2 * f4, 0.0f}), PropertyValuesHolder.ofInt("alpha", new int[]{(int) (255.0f * f3), 255})});
        ofPropertyValuesHolder.setInterpolator(C28497j.f77329a);
        return ofPropertyValuesHolder.setDuration(f3 == 0.0f ? 350 : 150);
    }

    /* renamed from: c */
    public final void mo34050c(int i) {
        this.f77460d.setColor(i);
        this.f77471o = this.f77460d.getAlpha();
        invalidateSelf();
    }

    /* renamed from: d */
    public final void mo34051d(int i) {
        this.f77467k.setColor(i);
        this.f77472p = this.f77467k.getAlpha();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        canvas.drawPaint(this.f77467k);
        canvas.drawCircle(this.f77465i + this.f77469m, this.f77466j + this.f77470n, this.f77464h * this.f77468l, this.f77460d);
    }

    /* renamed from: e */
    public final boolean mo34053e(float f, float f2) {
        return C28508a.m53285a(f, f2, this.f77465i, this.f77466j) < this.f77464h;
    }

    public final int getAlpha() {
        return this.f77460d.getAlpha();
    }

    public final int getOpacity() {
        return -3;
    }

    public float getScale() {
        return this.f77468l;
    }

    public float getTranslationX() {
        return this.f77469m;
    }

    public float getTranslationY() {
        return this.f77470n;
    }

    public final void setAlpha(int i) {
        float f = ((float) i) / 255.0f;
        this.f77460d.setAlpha((int) (((float) this.f77471o) * f));
        this.f77467k.setAlpha((int) (((float) this.f77472p) * f));
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f77460d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setScale(float f) {
        this.f77468l = f;
        invalidateSelf();
    }

    public void setTranslationX(float f) {
        this.f77469m = f;
        invalidateSelf();
    }

    public void setTranslationY(float f) {
        this.f77470n = f;
        invalidateSelf();
    }
}
