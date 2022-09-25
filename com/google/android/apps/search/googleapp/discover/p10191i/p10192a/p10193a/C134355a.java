package com.google.android.apps.search.googleapp.discover.p10191i.p10192a.p10193a;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.protos.youtube.elements.C66226em;

/* renamed from: com.google.android.apps.search.googleapp.discover.i.a.a.a */
/* compiled from: PG */
public final class C134355a extends FrameLayout {

    /* renamed from: a */
    public float f365963a;

    /* renamed from: b */
    public C66226em f365964b = C66226em.f180086e;

    /* renamed from: c */
    public String f365965c;

    /* renamed from: d */
    public AnimatorSet f365966d;

    /* renamed from: e */
    private int f365967e;

    /* renamed from: f */
    private int f365968f;

    /* renamed from: g */
    private final Path f365969g = new Path();

    public C134355a(Context context) {
        super(context, (AttributeSet) null, 0, 0);
    }

    /* renamed from: a */
    public final void mo111759a(boolean z) {
        AnimatorSet animatorSet = this.f365966d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f365966d = null;
            if (z) {
                mo111760b();
            }
        }
    }

    /* renamed from: b */
    public final void mo111760b() {
        ImageView imageView = (ImageView) getChildAt(0);
        imageView.setTranslationX(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
    }

    /* renamed from: c */
    public final void mo111761c() {
        float[] fArr;
        boolean z;
        this.f365969g.reset();
        if (this.f365963a == 0.0f) {
            fArr = null;
        } else {
            fArr = new float[8];
            if (!this.f365964b.equals(C66226em.f180086e)) {
                C66226em emVar = this.f365964b;
                if (!emVar.f180088a || !emVar.f180089b || !emVar.f180091d || !emVar.f180090c) {
                    z = false;
                    if (z || this.f365964b.f180088a) {
                        float f = this.f365963a;
                        fArr[0] = f;
                        fArr[1] = f;
                    }
                    if (z || this.f365964b.f180089b) {
                        float f2 = this.f365963a;
                        fArr[2] = f2;
                        fArr[3] = f2;
                    }
                    if (z || this.f365964b.f180091d) {
                        float f3 = this.f365963a;
                        fArr[4] = f3;
                        fArr[5] = f3;
                    }
                    if (z || this.f365964b.f180090c) {
                        float f4 = this.f365963a;
                        fArr[6] = f4;
                        fArr[7] = f4;
                    }
                }
            }
            z = true;
            float f5 = this.f365963a;
            fArr[0] = f5;
            fArr[1] = f5;
            float f22 = this.f365963a;
            fArr[2] = f22;
            fArr[3] = f22;
            float f32 = this.f365963a;
            fArr[4] = f32;
            fArr[5] = f32;
            float f42 = this.f365963a;
            fArr[6] = f42;
            fArr[7] = f42;
        }
        if (fArr != null) {
            this.f365969g.addRoundRect(new RectF(0.0f, 0.0f, (float) this.f365967e, (float) this.f365968f), fArr, Path.Direction.CW);
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (!this.f365969g.isEmpty()) {
            canvas.clipPath(this.f365969g);
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setClipChildren(true);
        setClipToOutline(true);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f365967e = i;
        this.f365968f = i2;
        mo111761c();
    }
}
