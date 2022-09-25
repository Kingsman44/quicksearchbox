package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.C11279a;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.components.CircleCountDownButton */
/* compiled from: PG */
public class CircleCountDownButton extends FrameLayout {

    /* renamed from: a */
    public static final C59071e f36834a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.components.CircleCountDownButton");

    /* renamed from: b */
    public int f36835b = -1;

    /* renamed from: c */
    public long f36836c = -1;

    /* renamed from: d */
    public long f36837d = -1;

    /* renamed from: e */
    public int f36838e = 1;

    /* renamed from: f */
    public ImageComponent f36839f;

    /* renamed from: g */
    public Runnable f36840g;

    /* renamed from: h */
    private float f36841h;

    /* renamed from: i */
    private int f36842i;

    /* renamed from: j */
    private float f36843j;

    /* renamed from: k */
    private int f36844k;

    /* renamed from: l */
    private int f36845l;

    /* renamed from: m */
    private final RectF f36846m = new RectF();

    /* renamed from: n */
    private final Paint f36847n = new Paint();

    /* renamed from: o */
    private final Paint f36848o = new Paint();

    /* renamed from: p */
    private final Paint f36849p = new Paint();

    public CircleCountDownButton(Context context) {
        super(context);
        m26956c(context, (AttributeSet) null, 0);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private final void m26956c(Context context, AttributeSet attributeSet, int i) {
        setWillNotDraw(false);
        float applyDimension = TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.fluid_actions_circle_count_down_button_highlight_color, R.attr.fluid_actions_circle_count_down_button_normal_color});
        try {
            int color = obtainStyledAttributes.getColor(0, 0);
            int color2 = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, C11279a.f36700b, i, 0);
                try {
                    this.f36841h = obtainStyledAttributes2.getDimension(1, applyDimension);
                    this.f36843j = obtainStyledAttributes2.getDimension(3, applyDimension / 2.0f);
                    this.f36842i = obtainStyledAttributes2.getColor(0, color);
                    this.f36844k = obtainStyledAttributes2.getColor(2, color2);
                    this.f36845l = obtainStyledAttributes2.getColor(4, color2);
                } finally {
                    obtainStyledAttributes2.recycle();
                }
            } else {
                this.f36841h = applyDimension;
                this.f36843j = applyDimension / 2.0f;
                this.f36842i = color;
                this.f36844k = color2;
                this.f36845l = color2;
            }
            this.f36848o.setStrokeWidth(this.f36841h);
            this.f36848o.setColor(this.f36842i);
            this.f36848o.setStyle(Paint.Style.STROKE);
            this.f36848o.setAntiAlias(true);
            this.f36847n.setStrokeWidth(this.f36843j);
            this.f36847n.setColor(this.f36844k);
            this.f36847n.setStyle(Paint.Style.STROKE);
            this.f36847n.setAntiAlias(true);
            this.f36849p.set(this.f36848o);
            this.f36849p.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f36849p.setAntiAlias(true);
            if (attributeSet == null) {
                this.f36839f = new ImageComponent(context);
            } else {
                this.f36839f = new ImageComponent(context, attributeSet, i);
            }
            addView(this.f36839f);
            this.f36839f.f36857d = true;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo19777a() {
        if (this.f36838e != 3) {
            this.f36836c = -1;
            this.f36837d = -1;
            Runnable runnable = this.f36840g;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f36840g = null;
            }
            this.f36838e = 1;
            invalidate();
        }
    }

    /* renamed from: b */
    public final void mo19778b() {
        mo19777a();
        this.f36838e = 3;
        invalidate();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r16) {
        /*
            r15 = this;
            r0 = r15
            r7 = r16
            super.onDraw(r16)
            int r1 = r15.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            int r3 = r15.getHeight()
            int r3 = r3 / r2
            float r3 = (float) r3
            float r4 = java.lang.Math.min(r1, r3)
            float r5 = r0.f36841h
            float r4 = r4 - r5
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r5 = r0.f36836c
            long r10 = r8 - r5
            float r10 = (float) r10
            int r11 = r0.f36835b
            float r11 = (float) r11
            float r10 = r10 / r11
            int r11 = r0.f36838e
            r12 = 3
            if (r11 != r2) goto L_0x0035
            long r13 = r0.f36837d
            int r2 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r2 <= 0) goto L_0x005f
            r0.f36838e = r12
            goto L_0x004c
        L_0x0035:
            if (r11 == r2) goto L_0x005f
            if (r11 == r12) goto L_0x004c
            r2 = 13
            if (r11 == r2) goto L_0x004c
            android.graphics.Paint r2 = r0.f36847n
            r7.drawCircle(r1, r3, r4, r2)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r1 = r0.f36839f
            int r2 = r0.f36845l
            android.widget.ImageView r1 = r1.f36859f
            r1.setColorFilter(r2)
            return
        L_0x004c:
            android.graphics.Paint r2 = r0.f36849p
            r7.drawCircle(r1, r3, r4, r2)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r1 = r0.f36839f
            r2 = 255(0xff, float:3.57E-43)
            int r2 = android.graphics.Color.argb(r2, r2, r2, r2)
            android.widget.ImageView r1 = r1.f36859f
            r1.setColorFilter(r2)
            return
        L_0x005f:
            r11 = 0
            int r2 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x006f
            r2 = 1135869952(0x43b40000, float:360.0)
            float r10 = r10 * r2
            int r2 = java.lang.Math.round(r10)
            r10 = r2
            goto L_0x0071
        L_0x006f:
            r2 = 0
            r10 = 0
        L_0x0071:
            android.graphics.RectF r2 = r0.f36846m
            float r5 = r1 - r4
            r2.left = r5
            android.graphics.RectF r2 = r0.f36846m
            float r1 = r1 + r4
            r2.right = r1
            android.graphics.RectF r1 = r0.f36846m
            float r2 = r3 - r4
            r1.top = r2
            android.graphics.RectF r1 = r0.f36846m
            float r3 = r3 + r4
            r1.bottom = r3
            android.graphics.RectF r2 = r0.f36846m
            r3 = 1132920832(0x43870000, float:270.0)
            float r4 = (float) r10
            r5 = 0
            android.graphics.Paint r6 = r0.f36848o
            r1 = r16
            r1.drawArc(r2, r3, r4, r5, r6)
            android.graphics.RectF r2 = r0.f36846m
            int r1 = r10 + 270
            float r3 = (float) r1
            int r1 = 360 - r10
            float r4 = (float) r1
            android.graphics.Paint r6 = r0.f36847n
            r1 = r16
            r1.drawArc(r2, r3, r4, r5, r6)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r1 = r0.f36839f
            int r2 = r0.f36845l
            android.widget.ImageView r1 = r1.f36859f
            r1.setColorFilter(r2)
            long r1 = r0.f36837d
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x00b5
            r15.invalidate()
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.CircleCountDownButton.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int max = Math.max(getMeasuredHeight(), getMeasuredWidth());
        setMeasuredDimension(max, max);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void setAlpha(float f) {
        super.setAlpha(f);
        this.f36839f.setAlpha(f);
    }

    public final void setEnabled(boolean z) {
        if (z) {
            this.f36838e = 1;
            setAlpha(1.0f);
        } else {
            mo19777a();
            int i = this.f36838e + 10;
            this.f36838e = i;
            if (i != 13) {
                setAlpha(0.3f);
            }
        }
        invalidate();
        super.setEnabled(z);
    }

    public CircleCountDownButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26956c(context, attributeSet, 0);
    }

    public CircleCountDownButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26956c(context, attributeSet, i);
    }
}
