package com.google.android.libraries.search.video.p3198ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.protos.youtube.elements.C66226em;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.video.ui.VideoFrameLayout */
/* compiled from: PG */
public final class VideoFrameLayout extends FrameLayout {

    /* renamed from: a */
    float[] f108823a;

    /* renamed from: b */
    final Path f108824b;

    /* renamed from: c */
    private float f108825c;

    /* renamed from: d */
    private C66226em f108826d;

    /* renamed from: e */
    private int f108827e;

    /* renamed from: f */
    private int f108828f;

    public VideoFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private final void m72992b() {
        float[] fArr;
        boolean z;
        this.f108824b.reset();
        if (this.f108825c == 0.0f) {
            fArr = null;
        } else {
            fArr = new float[8];
            if (!this.f108826d.equals(C66226em.f180086e)) {
                C66226em emVar = this.f108826d;
                if (!emVar.f180088a || !emVar.f180089b || !emVar.f180091d || !emVar.f180090c) {
                    z = false;
                    if (z || this.f108826d.f180088a) {
                        float f = this.f108825c;
                        fArr[0] = f;
                        fArr[1] = f;
                    }
                    if (z || this.f108826d.f180089b) {
                        float f2 = this.f108825c;
                        fArr[2] = f2;
                        fArr[3] = f2;
                    }
                    if (z || this.f108826d.f180091d) {
                        float f3 = this.f108825c;
                        fArr[4] = f3;
                        fArr[5] = f3;
                    }
                    if (z || this.f108826d.f180090c) {
                        float f4 = this.f108825c;
                        fArr[6] = f4;
                        fArr[7] = f4;
                    }
                }
            }
            z = true;
            float f5 = this.f108825c;
            fArr[0] = f5;
            fArr[1] = f5;
            float f22 = this.f108825c;
            fArr[2] = f22;
            fArr[3] = f22;
            float f32 = this.f108825c;
            fArr[4] = f32;
            fArr[5] = f32;
            float f42 = this.f108825c;
            fArr[6] = f42;
            fArr[7] = f42;
        }
        this.f108823a = fArr;
        if (fArr != null) {
            this.f108824b.addRoundRect(new RectF(0.0f, 0.0f, (float) this.f108827e, (float) this.f108828f), this.f108823a, Path.Direction.CW);
        }
    }

    /* renamed from: a */
    public final void mo44197a(float f, C66226em emVar) {
        if (this.f108825c != f || !Objects.equals(this.f108826d, emVar)) {
            this.f108825c = f;
            this.f108826d = emVar;
            m72992b();
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (!this.f108824b.isEmpty()) {
            canvas.clipPath(this.f108824b);
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
        this.f108827e = i;
        this.f108828f = i2;
        m72992b();
    }

    public VideoFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoFrameLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public VideoFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f108826d = C66226em.f180086e;
        this.f108824b = new Path();
    }
}
