package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.C1924a;
import com.google.android.material.p3515l.C44785p;
import com.google.android.material.p3515l.C44786q;
import com.google.android.material.p3515l.C44787r;

/* renamed from: com.google.android.material.floatingactionbutton.e */
/* compiled from: PG */
final class C44666e extends Drawable {

    /* renamed from: a */
    public final Paint f116432a;

    /* renamed from: b */
    float f116433b;

    /* renamed from: c */
    public int f116434c;

    /* renamed from: d */
    public int f116435d;

    /* renamed from: e */
    public int f116436e;

    /* renamed from: f */
    public int f116437f;

    /* renamed from: g */
    public boolean f116438g = true;

    /* renamed from: h */
    public C44785p f116439h;

    /* renamed from: i */
    private final C44787r f116440i = C44786q.f116792a;

    /* renamed from: j */
    private final Path f116441j = new Path();

    /* renamed from: k */
    private final Rect f116442k = new Rect();

    /* renamed from: l */
    private final RectF f116443l = new RectF();

    /* renamed from: m */
    private final RectF f116444m = new RectF();

    /* renamed from: n */
    private final C44665d f116445n = new C44665d(this);

    /* renamed from: o */
    private int f116446o;

    /* renamed from: p */
    private ColorStateList f116447p;

    public C44666e(C44785p pVar) {
        this.f116439h = pVar;
        Paint paint = new Paint(1);
        this.f116432a = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final RectF mo47952a() {
        this.f116444m.set(getBounds());
        return this.f116444m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo47953b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f116446o = colorStateList.getColorForState(getState(), this.f116446o);
        }
        this.f116447p = colorStateList;
        this.f116438g = true;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        if (this.f116438g) {
            Paint paint = this.f116432a;
            Rect rect = this.f116442k;
            copyBounds(rect);
            float height = this.f116433b / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C1924a.m5188g(this.f116434c, this.f116446o), C1924a.m5188g(this.f116435d, this.f116446o), C1924a.m5188g(C1924a.m5189h(this.f116435d, 0), this.f116446o), C1924a.m5188g(C1924a.m5189h(this.f116437f, 0), this.f116446o), C1924a.m5188g(this.f116437f, this.f116446o), C1924a.m5188g(this.f116436e, this.f116446o)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f116438g = false;
        }
        float strokeWidth = this.f116432a.getStrokeWidth() / 2.0f;
        copyBounds(this.f116442k);
        this.f116443l.set(this.f116442k);
        float min = Math.min(this.f116439h.f116784f.mo48107a(mo47952a()), this.f116443l.width() / 2.0f);
        if (this.f116439h.mo48152c(mo47952a())) {
            this.f116443l.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f116443l, min, min, this.f116432a);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f116445n;
    }

    public final int getOpacity() {
        return this.f116433b > 0.0f ? -3 : -2;
    }

    public final void getOutline(Outline outline) {
        if (this.f116439h.mo48152c(mo47952a())) {
            outline.setRoundRect(getBounds(), this.f116439h.f116784f.mo48107a(mo47952a()));
            return;
        }
        copyBounds(this.f116442k);
        this.f116443l.set(this.f116442k);
        this.f116440i.mo48153a(this.f116439h, 1.0f, this.f116443l, (C44776g) null, this.f116441j);
        if (this.f116441j.isConvex()) {
            outline.setConvexPath(this.f116441j);
        }
    }

    public final boolean getPadding(Rect rect) {
        if (!this.f116439h.mo48152c(mo47952a())) {
            return true;
        }
        int round = Math.round(this.f116433b);
        rect.set(round, round, round, round);
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f116447p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f116438g = true;
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f116447p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f116446o)) == this.f116446o)) {
            this.f116438g = true;
            this.f116446o = colorForState;
        }
        if (this.f116438g) {
            invalidateSelf();
        }
        return this.f116438g;
    }

    public final void setAlpha(int i) {
        this.f116432a.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f116432a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
