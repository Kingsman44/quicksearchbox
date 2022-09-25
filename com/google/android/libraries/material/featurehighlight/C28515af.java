package com.google.android.libraries.material.featurehighlight;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.C1924a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.p2205a.C28497j;

/* renamed from: com.google.android.libraries.material.featurehighlight.af */
/* compiled from: PG */
public final class C28515af extends Drawable {

    /* renamed from: a */
    public final int f77435a;

    /* renamed from: b */
    public final int f77436b;

    /* renamed from: c */
    public final int f77437c;

    /* renamed from: d */
    public float f77438d;

    /* renamed from: e */
    public float f77439e;

    /* renamed from: f */
    public float f77440f;

    /* renamed from: g */
    public C28518ai f77441g = C28518ai.PULSE_WITH_INNER_CIRCLE;

    /* renamed from: h */
    private final Paint f77442h;

    /* renamed from: i */
    private final Paint f77443i;

    /* renamed from: j */
    private float f77444j = 1.0f;

    /* renamed from: k */
    private float f77445k;

    /* renamed from: l */
    private float f77446l;

    /* renamed from: m */
    private int f77447m;

    /* renamed from: n */
    private int f77448n;

    public C28515af(Context context) {
        Paint paint = new Paint();
        this.f77442h = paint;
        Paint paint2 = new Paint();
        this.f77443i = paint2;
        Resources resources = context.getResources();
        this.f77435a = resources.getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_inner_radius);
        this.f77436b = resources.getDimensionPixelOffset(R.dimen.libraries_material_featurehighlight_inner_padding);
        this.f77437c = resources.getDimensionPixelOffset(R.dimen.libraries_material_featurehighlight_inner_margin);
        this.f77448n = resources.getInteger(R.integer.libraries_material_featurehighlight_pulse_base_alpha);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        mo34033c(-1);
        mo34034d(C1924a.m5189h(-1, this.f77448n));
    }

    /* renamed from: a */
    public final Animator mo34031a() {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scale", new float[]{getScale(), 0.0f}), PropertyValuesHolder.ofInt("alpha", new int[]{this.f77442h.getAlpha(), 0}), PropertyValuesHolder.ofFloat("pulseScale", new float[]{getPulseScale(), 0.0f}), PropertyValuesHolder.ofFloat("pulseAlpha", new float[]{getPulseAlpha(), 0.0f})});
        ofPropertyValuesHolder.setInterpolator(C28497j.f77330b);
        return ofPropertyValuesHolder.setDuration(200);
    }

    /* renamed from: b */
    public final Animator mo34032b(float f) {
        ObjectAnimator objectAnimator;
        C28518ai aiVar = C28518ai.PULSE_WITH_INNER_CIRCLE;
        int ordinal = this.f77441g.ordinal();
        if (ordinal == 0) {
            objectAnimator = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scale", new float[]{f, 1.0f}), PropertyValuesHolder.ofInt("alpha", new int[]{(int) (255.0f * f), 255})});
        } else if (ordinal == 1) {
            objectAnimator = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scale", new float[]{0.0f}), PropertyValuesHolder.ofInt("alpha", new int[]{0})});
        } else {
            throw new IllegalStateException("Unsupported animation type ".concat(String.valueOf(String.valueOf(this.f77441g))));
        }
        objectAnimator.setInterpolator(C28497j.f77329a);
        return objectAnimator.setDuration(f == 0.0f ? 350 : 150);
    }

    /* renamed from: c */
    public final void mo34033c(int i) {
        this.f77442h.setColor(i);
        this.f77447m = this.f77442h.getAlpha();
        invalidateSelf();
    }

    /* renamed from: d */
    public final void mo34034d(int i) {
        this.f77443i.setColor(i);
        this.f77448n = this.f77443i.getAlpha();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        float f = this.f77438d;
        float f2 = this.f77444j * f;
        float f3 = this.f77446l;
        if (f3 > 0.0f) {
            float f4 = (f * this.f77445k) - f2;
            this.f77443i.setAlpha((int) (((float) this.f77448n) * f3));
            this.f77443i.setStrokeWidth(f4);
            canvas.drawCircle(this.f77439e, this.f77440f, (f4 * 0.5f) + f2, this.f77443i);
        }
        canvas.drawCircle(this.f77439e, this.f77440f, f2, this.f77442h);
    }

    public final int getAlpha() {
        return this.f77442h.getAlpha();
    }

    public final int getOpacity() {
        return -3;
    }

    public float getPulseAlpha() {
        return this.f77446l;
    }

    public float getPulseScale() {
        return this.f77445k;
    }

    public float getScale() {
        return this.f77444j;
    }

    public void setAlpha(int i) {
        this.f77442h.setAlpha((int) (((float) this.f77447m) * (((float) i) / 255.0f)));
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f77442h.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setPulseAlpha(float f) {
        this.f77446l = f;
        invalidateSelf();
    }

    public void setPulseScale(float f) {
        this.f77445k = f;
        invalidateSelf();
    }

    public void setScale(float f) {
        this.f77444j = f;
        invalidateSelf();
    }
}
