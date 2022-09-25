package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import androidx.core.p092d.C1886a;
import androidx.core.p096h.C1956i;
import androidx.core.p096h.C1963p;
import androidx.core.p098j.C2043bi;
import com.google.android.material.p3504a.C44497b;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3512i.C44692b;
import com.google.android.material.p3512i.C44698h;
import com.google.android.material.p3512i.C44700j;

/* renamed from: com.google.android.material.internal.g */
/* compiled from: PG */
public final class C44747g {

    /* renamed from: A */
    private float f116610A = 15.0f;

    /* renamed from: B */
    private float f116611B;

    /* renamed from: C */
    private float f116612C;

    /* renamed from: D */
    private float f116613D;

    /* renamed from: E */
    private float f116614E;

    /* renamed from: F */
    private float f116615F;

    /* renamed from: G */
    private float f116616G;

    /* renamed from: H */
    private Typeface f116617H;

    /* renamed from: I */
    private Typeface f116618I;

    /* renamed from: J */
    private Typeface f116619J;

    /* renamed from: K */
    private Typeface f116620K;

    /* renamed from: L */
    private Typeface f116621L;

    /* renamed from: M */
    private Typeface f116622M;

    /* renamed from: N */
    private Typeface f116623N;

    /* renamed from: O */
    private C44692b f116624O;

    /* renamed from: P */
    private C44692b f116625P;

    /* renamed from: Q */
    private CharSequence f116626Q;

    /* renamed from: R */
    private float f116627R;

    /* renamed from: S */
    private float f116628S;

    /* renamed from: T */
    private float f116629T;

    /* renamed from: U */
    private float f116630U;

    /* renamed from: V */
    private float f116631V;

    /* renamed from: W */
    private int f116632W;

    /* renamed from: X */
    private int[] f116633X;

    /* renamed from: Y */
    private boolean f116634Y;

    /* renamed from: Z */
    private final TextPaint f116635Z;

    /* renamed from: a */
    public float f116636a;

    /* renamed from: aa */
    private float f116637aa;

    /* renamed from: ab */
    private float f116638ab;

    /* renamed from: ac */
    private float f116639ac;

    /* renamed from: ad */
    private ColorStateList f116640ad;

    /* renamed from: ae */
    private float f116641ae;

    /* renamed from: af */
    private float f116642af;

    /* renamed from: ag */
    private float f116643ag;

    /* renamed from: ah */
    private ColorStateList f116644ah;

    /* renamed from: ai */
    private float f116645ai;

    /* renamed from: aj */
    private float f116646aj;

    /* renamed from: ak */
    private StaticLayout f116647ak;

    /* renamed from: al */
    private float f116648al;

    /* renamed from: am */
    private float f116649am;

    /* renamed from: an */
    private CharSequence f116650an;

    /* renamed from: b */
    public boolean f116651b;

    /* renamed from: c */
    public float f116652c;

    /* renamed from: d */
    public float f116653d;

    /* renamed from: e */
    public int f116654e;

    /* renamed from: f */
    public final Rect f116655f;

    /* renamed from: g */
    public ColorStateList f116656g;

    /* renamed from: h */
    public ColorStateList f116657h;

    /* renamed from: i */
    public int f116658i;

    /* renamed from: j */
    public TextUtils.TruncateAt f116659j = TextUtils.TruncateAt.END;

    /* renamed from: k */
    public CharSequence f116660k;

    /* renamed from: l */
    public boolean f116661l;

    /* renamed from: m */
    public boolean f116662m = true;

    /* renamed from: n */
    public final TextPaint f116663n;

    /* renamed from: o */
    public TimeInterpolator f116664o;

    /* renamed from: p */
    public TimeInterpolator f116665p;

    /* renamed from: q */
    public float f116666q;

    /* renamed from: r */
    public float f116667r;

    /* renamed from: s */
    public int f116668s = 1;

    /* renamed from: t */
    public float f116669t = 1.0f;

    /* renamed from: u */
    private final View f116670u;

    /* renamed from: v */
    private final Rect f116671v;

    /* renamed from: w */
    private final RectF f116672w;

    /* renamed from: x */
    private int f116673x = 16;

    /* renamed from: y */
    private int f116674y = 16;

    /* renamed from: z */
    private float f116675z = 15.0f;

    public C44747g(View view) {
        this.f116670u = view;
        TextPaint textPaint = new TextPaint(129);
        this.f116635Z = textPaint;
        this.f116663n = new TextPaint(textPaint);
        this.f116655f = new Rect();
        this.f116671v = new Rect();
        this.f116672w = new RectF();
        this.f116653d = mo48056a();
        mo48060e(view.getContext().getResources().getConfiguration());
    }

    /* renamed from: A */
    private final void m79321A(float f) {
        m79330z(f, false);
        C2043bi.m5519M(this.f116670u);
    }

    /* renamed from: B */
    private static boolean m79322B(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    /* renamed from: C */
    private static boolean m79323C(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: D */
    private final boolean m79324D() {
        if (this.f116668s > 1) {
            return !this.f116661l || this.f116651b;
        }
        return false;
    }

    /* renamed from: E */
    private static final float m79325E(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: v */
    private static float m79326v(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C44497b.m78597a(f, f2, f3);
    }

    /* renamed from: w */
    private static int m79327w(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), Math.round((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), Math.round((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), Math.round((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: x */
    private final int m79328x(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f116633X;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: y */
    private final void m79329y(float f) {
        float f2;
        float f3;
        if (this.f116651b) {
            this.f116672w.set(f < this.f116653d ? this.f116671v : this.f116655f);
        } else {
            this.f116672w.left = m79326v((float) this.f116671v.left, (float) this.f116655f.left, f, this.f116664o);
            this.f116672w.top = m79326v(this.f116611B, this.f116612C, f, this.f116664o);
            this.f116672w.right = m79326v((float) this.f116671v.right, (float) this.f116655f.right, f, this.f116664o);
            this.f116672w.bottom = m79326v((float) this.f116671v.bottom, (float) this.f116655f.bottom, f, this.f116664o);
        }
        if (!this.f116651b) {
            this.f116615F = m79326v(this.f116613D, this.f116614E, f, this.f116664o);
            this.f116616G = m79326v(this.f116611B, this.f116612C, f, this.f116664o);
            m79321A(f);
            f2 = f;
        } else if (f < this.f116653d) {
            this.f116615F = this.f116613D;
            this.f116616G = this.f116611B;
            m79321A(0.0f);
            f2 = 0.0f;
        } else {
            this.f116615F = this.f116614E;
            this.f116616G = this.f116612C - ((float) Math.max(0, this.f116654e));
            m79321A(1.0f);
            f2 = 1.0f;
        }
        this.f116648al = 1.0f - m79326v(0.0f, 1.0f, 1.0f - f, C44497b.f115651b);
        C2043bi.m5519M(this.f116670u);
        this.f116649am = m79326v(1.0f, 0.0f, f, C44497b.f115651b);
        C2043bi.m5519M(this.f116670u);
        ColorStateList colorStateList = this.f116657h;
        ColorStateList colorStateList2 = this.f116656g;
        if (colorStateList != colorStateList2) {
            this.f116635Z.setColor(m79327w(m79328x(colorStateList2), m79328x(this.f116657h), f2));
        } else {
            this.f116635Z.setColor(m79328x(colorStateList));
        }
        float f4 = this.f116645ai;
        float f5 = this.f116666q;
        if (f4 != f5) {
            this.f116635Z.setLetterSpacing(m79326v(f5, f4, f, C44497b.f115651b));
        } else {
            this.f116635Z.setLetterSpacing(f4);
        }
        this.f116629T = m79326v(this.f116641ae, this.f116637aa, f, (TimeInterpolator) null);
        this.f116630U = m79326v(this.f116642af, this.f116638ab, f, (TimeInterpolator) null);
        this.f116631V = m79326v(this.f116643ag, this.f116639ac, f, (TimeInterpolator) null);
        int w = m79327w(m79328x(this.f116644ah), m79328x(this.f116640ad), f);
        this.f116632W = w;
        this.f116635Z.setShadowLayer(this.f116629T, this.f116630U, this.f116631V, w);
        if (this.f116651b) {
            int alpha = this.f116635Z.getAlpha();
            float f6 = this.f116653d;
            if (f <= f6) {
                f3 = C44497b.m78598b(1.0f, 0.0f, this.f116652c, f6, f);
            } else {
                f3 = C44497b.m78598b(0.0f, 1.0f, f6, 1.0f, f);
            }
            this.f116635Z.setAlpha((int) (f3 * ((float) alpha)));
        }
        C2043bi.m5519M(this.f116670u);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e9, code lost:
        if (r12.f116661l != false) goto L_0x00eb;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m79330z(float r13, boolean r14) {
        /*
            r12 = this;
            java.lang.CharSequence r0 = r12.f116660k
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.graphics.Rect r0 = r12.f116655f
            int r0 = r0.width()
            float r0 = (float) r0
            android.graphics.Rect r1 = r12.f116671v
            int r1 = r1.width()
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            boolean r3 = m79322B(r13, r2)
            r4 = 0
            if (r3 == 0) goto L_0x0025
            float r13 = r12.f116610A
            float r14 = r12.f116645ai
            r12.f116627R = r2
            android.graphics.Typeface r1 = r12.f116617H
            goto L_0x005c
        L_0x0025:
            float r3 = r12.f116675z
            float r5 = r12.f116666q
            android.graphics.Typeface r6 = r12.f116620K
            boolean r7 = m79322B(r13, r4)
            if (r7 == 0) goto L_0x0034
            r12.f116627R = r2
            goto L_0x0043
        L_0x0034:
            float r7 = r12.f116675z
            float r8 = r12.f116610A
            android.animation.TimeInterpolator r9 = r12.f116665p
            float r13 = m79326v(r7, r8, r13, r9)
            float r7 = r12.f116675z
            float r13 = r13 / r7
            r12.f116627R = r13
        L_0x0043:
            float r13 = r12.f116610A
            float r7 = r12.f116675z
            float r13 = r13 / r7
            float r7 = r1 * r13
            if (r14 == 0) goto L_0x0051
        L_0x004c:
            r0 = r1
        L_0x004d:
            r13 = r3
            r14 = r5
            r1 = r6
            goto L_0x005c
        L_0x0051:
            int r14 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x004c
            float r0 = r0 / r13
            float r13 = java.lang.Math.min(r0, r1)
            r0 = r13
            goto L_0x004d
        L_0x005c:
            r3 = 0
            r5 = 1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00a3
            float r6 = r12.f116628S
            float r7 = r12.f116646aj
            android.graphics.Typeface r8 = r12.f116623N
            android.text.StaticLayout r9 = r12.f116647ak
            if (r9 == 0) goto L_0x0077
            int r9 = r9.getWidth()
            float r9 = (float) r9
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x0077
            r9 = 1
            goto L_0x0078
        L_0x0077:
            r9 = 0
        L_0x0078:
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x008b
            int r6 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x008b
            if (r9 != 0) goto L_0x008b
            if (r8 != r1) goto L_0x008b
            boolean r6 = r12.f116634Y
            if (r6 == 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r6 = 0
            goto L_0x008c
        L_0x008b:
            r6 = 1
        L_0x008c:
            r12.f116628S = r13
            r12.f116646aj = r14
            r12.f116623N = r1
            r12.f116634Y = r3
            android.text.TextPaint r13 = r12.f116635Z
            float r14 = r12.f116627R
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x009e
            r14 = 1
            goto L_0x009f
        L_0x009e:
            r14 = 0
        L_0x009f:
            r13.setLinearText(r14)
            goto L_0x00a4
        L_0x00a3:
            r6 = 0
        L_0x00a4:
            java.lang.CharSequence r13 = r12.f116626Q
            if (r13 == 0) goto L_0x00ac
            if (r6 == 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            return
        L_0x00ac:
            android.text.TextPaint r13 = r12.f116635Z
            float r14 = r12.f116628S
            r13.setTextSize(r14)
            android.text.TextPaint r13 = r12.f116635Z
            android.graphics.Typeface r14 = r12.f116623N
            r13.setTypeface(r14)
            android.text.TextPaint r13 = r12.f116635Z
            float r14 = r12.f116646aj
            r13.setLetterSpacing(r14)
            java.lang.CharSequence r13 = r12.f116660k
            boolean r13 = r12.mo48073r(r13)
            r12.f116661l = r13
            boolean r14 = r12.m79324D()
            if (r14 == 0) goto L_0x00d2
            int r14 = r12.f116668s
            goto L_0x00d3
        L_0x00d2:
            r14 = 1
        L_0x00d3:
            if (r14 != r5) goto L_0x00da
            android.text.Layout$Alignment r14 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ ax -> 0x0150 }
            r1 = r14
            r14 = 1
            goto L_0x00f8
        L_0x00da:
            int r1 = r12.f116673x     // Catch:{ ax -> 0x0150 }
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r13)     // Catch:{ ax -> 0x0150 }
            r1 = r1 & 7
            if (r1 == r5) goto L_0x00f6
            r6 = 5
            if (r1 == r6) goto L_0x00f1
            boolean r1 = r12.f116661l     // Catch:{ ax -> 0x0150 }
            if (r1 == 0) goto L_0x00ee
        L_0x00eb:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ ax -> 0x0150 }
            goto L_0x00f8
        L_0x00ee:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ ax -> 0x0150 }
            goto L_0x00f8
        L_0x00f1:
            boolean r1 = r12.f116661l     // Catch:{ ax -> 0x0150 }
            if (r1 == 0) goto L_0x00eb
            goto L_0x00ee
        L_0x00f6:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ ax -> 0x0150 }
        L_0x00f8:
            java.lang.CharSequence r6 = r12.f116660k     // Catch:{ ax -> 0x0150 }
            android.text.TextPaint r7 = r12.f116635Z     // Catch:{ ax -> 0x0150 }
            int r0 = (int) r0     // Catch:{ ax -> 0x0150 }
            int r8 = r6.length()     // Catch:{ ax -> 0x0150 }
            android.text.TextUtils$TruncateAt r9 = r12.f116659j     // Catch:{ ax -> 0x0150 }
            float r10 = r12.f116669t     // Catch:{ ax -> 0x0150 }
            if (r6 != 0) goto L_0x0109
            java.lang.String r6 = ""
        L_0x0109:
            int r0 = java.lang.Math.max(r3, r0)     // Catch:{ ax -> 0x0150 }
            if (r14 != r5) goto L_0x0115
            float r14 = (float) r0     // Catch:{ ax -> 0x0150 }
            java.lang.CharSequence r6 = android.text.TextUtils.ellipsize(r6, r7, r14, r9)     // Catch:{ ax -> 0x0150 }
            r14 = 1
        L_0x0115:
            int r11 = r6.length()     // Catch:{ ax -> 0x0150 }
            int r8 = java.lang.Math.min(r11, r8)     // Catch:{ ax -> 0x0150 }
            if (r13 == 0) goto L_0x0123
            if (r14 != r5) goto L_0x0123
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ ax -> 0x0150 }
        L_0x0123:
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r6, r3, r8, r7, r0)     // Catch:{ ax -> 0x0150 }
            r0.setAlignment(r1)     // Catch:{ ax -> 0x0150 }
            r0.setIncludePad(r3)     // Catch:{ ax -> 0x0150 }
            if (r13 == 0) goto L_0x0132
            android.text.TextDirectionHeuristic r13 = android.text.TextDirectionHeuristics.RTL     // Catch:{ ax -> 0x0150 }
            goto L_0x0134
        L_0x0132:
            android.text.TextDirectionHeuristic r13 = android.text.TextDirectionHeuristics.LTR     // Catch:{ ax -> 0x0150 }
        L_0x0134:
            r0.setTextDirection(r13)     // Catch:{ ax -> 0x0150 }
            if (r9 == 0) goto L_0x013c
            r0.setEllipsize(r9)     // Catch:{ ax -> 0x0150 }
        L_0x013c:
            r0.setMaxLines(r14)     // Catch:{ ax -> 0x0150 }
            int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x0146
            r0.setLineSpacing(r4, r10)     // Catch:{ ax -> 0x0150 }
        L_0x0146:
            if (r14 <= r5) goto L_0x014b
            r0.setHyphenationFrequency(r5)     // Catch:{ ax -> 0x0150 }
        L_0x014b:
            android.text.StaticLayout r13 = r0.build()     // Catch:{ ax -> 0x0150 }
            goto L_0x015f
        L_0x0150:
            r13 = move-exception
            java.lang.Throwable r14 = r13.getCause()
            java.lang.String r14 = r14.getMessage()
            java.lang.String r0 = "CollapsingTextHelper"
            android.util.Log.e(r0, r14, r13)
            r13 = 0
        L_0x015f:
            r13.getClass()
            r12.f116647ak = r13
            java.lang.CharSequence r13 = r13.getText()
            r12.f116626Q = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C44747g.m79330z(float, boolean):void");
    }

    /* renamed from: a */
    public final float mo48056a() {
        float f = this.f116652c;
        return f + ((1.0f - f) * 0.5f);
    }

    /* renamed from: b */
    public final float mo48057b() {
        TextPaint textPaint = this.f116663n;
        textPaint.setTextSize(this.f116610A);
        textPaint.setTypeface(this.f116617H);
        textPaint.setLetterSpacing(this.f116645ai);
        return -this.f116663n.ascent();
    }

    /* renamed from: c */
    public final void mo48058c(Canvas canvas) {
        int save = canvas.save();
        if (this.f116626Q != null && this.f116672w.width() > 0.0f && this.f116672w.height() > 0.0f) {
            this.f116635Z.setTextSize(this.f116628S);
            float f = this.f116615F;
            float f2 = this.f116616G;
            float f3 = this.f116627R;
            if (f3 != 1.0f && !this.f116651b) {
                canvas.scale(f3, f3, f, f2);
            }
            if (!m79324D() || (this.f116651b && this.f116636a <= this.f116653d)) {
                canvas.translate(f, f2);
                this.f116647ak.draw(canvas);
            } else {
                float f4 = this.f116615F;
                int lineStart = this.f116647ak.getLineStart(0);
                int alpha = this.f116635Z.getAlpha();
                canvas.translate(f4 - ((float) lineStart), f2);
                float f5 = (float) alpha;
                this.f116635Z.setAlpha((int) (this.f116649am * f5));
                if (Build.VERSION.SDK_INT >= 31) {
                    TextPaint textPaint = this.f116635Z;
                    textPaint.setShadowLayer(this.f116629T, this.f116630U, this.f116631V, C44535e.m78718a(this.f116632W, textPaint.getAlpha()));
                }
                this.f116647ak.draw(canvas);
                this.f116635Z.setAlpha((int) (this.f116648al * f5));
                if (Build.VERSION.SDK_INT >= 31) {
                    TextPaint textPaint2 = this.f116635Z;
                    textPaint2.setShadowLayer(this.f116629T, this.f116630U, this.f116631V, C44535e.m78718a(this.f116632W, textPaint2.getAlpha()));
                }
                int lineBaseline = this.f116647ak.getLineBaseline(0);
                CharSequence charSequence = this.f116650an;
                float f6 = (float) lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f6, this.f116635Z);
                if (Build.VERSION.SDK_INT >= 31) {
                    this.f116635Z.setShadowLayer(this.f116629T, this.f116630U, this.f116631V, this.f116632W);
                }
                if (!this.f116651b) {
                    String trim = this.f116650an.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    this.f116635Z.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.f116647ak.getLineEnd(0), str.length()), 0.0f, f6, this.f116635Z);
                }
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: d */
    public final void mo48059d(TextPaint textPaint) {
        textPaint.setTextSize(this.f116675z);
        textPaint.setTypeface(this.f116620K);
        textPaint.setLetterSpacing(this.f116666q);
    }

    /* renamed from: e */
    public final void mo48060e(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f116619J;
            if (typeface != null) {
                this.f116618I = C44700j.m79248a(configuration, typeface);
            }
            Typeface typeface2 = this.f116622M;
            if (typeface2 != null) {
                this.f116621L = C44700j.m79248a(configuration, typeface2);
            }
            Typeface typeface3 = this.f116618I;
            if (typeface3 == null) {
                typeface3 = this.f116619J;
            }
            this.f116617H = typeface3;
            Typeface typeface4 = this.f116621L;
            if (typeface4 == null) {
                typeface4 = this.f116622M;
            }
            this.f116620K = typeface4;
            mo48061f(true);
        }
    }

    /* renamed from: f */
    public final void mo48061f(boolean z) {
        StaticLayout staticLayout;
        if (this.f116670u.getHeight() <= 0 || this.f116670u.getWidth() <= 0) {
            if (z) {
                z = true;
            } else {
                return;
            }
        }
        m79330z(1.0f, z);
        CharSequence charSequence = this.f116626Q;
        if (!(charSequence == null || (staticLayout = this.f116647ak) == null)) {
            this.f116650an = TextUtils.ellipsize(charSequence, this.f116635Z, (float) staticLayout.getWidth(), this.f116659j);
        }
        CharSequence charSequence2 = this.f116650an;
        float f = 0.0f;
        if (charSequence2 != null) {
            this.f116667r = m79325E(this.f116635Z, charSequence2);
        } else {
            this.f116667r = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f116674y, this.f116661l ? 1 : 0);
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.f116612C = (float) this.f116655f.top;
        } else if (i != 80) {
            this.f116612C = ((float) this.f116655f.centerY()) - ((this.f116635Z.descent() - this.f116635Z.ascent()) / 2.0f);
        } else {
            this.f116612C = ((float) this.f116655f.bottom) + this.f116635Z.ascent();
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f116614E = ((float) this.f116655f.centerX()) - (this.f116667r / 2.0f);
        } else if (i2 != 5) {
            this.f116614E = (float) this.f116655f.left;
        } else {
            this.f116614E = ((float) this.f116655f.right) - this.f116667r;
        }
        m79330z(0.0f, z);
        StaticLayout staticLayout2 = this.f116647ak;
        float height = staticLayout2 != null ? (float) staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f116647ak;
        if (staticLayout3 == null || this.f116668s <= 1) {
            CharSequence charSequence3 = this.f116626Q;
            if (charSequence3 != null) {
                f = m79325E(this.f116635Z, charSequence3);
            }
        } else {
            f = (float) staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f116647ak;
        this.f116658i = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f116673x, this.f116661l ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 == 48) {
            this.f116611B = (float) this.f116671v.top;
        } else if (i3 != 80) {
            this.f116611B = ((float) this.f116671v.centerY()) - (height / 2.0f);
        } else {
            this.f116611B = (((float) this.f116671v.bottom) - height) + this.f116635Z.descent();
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f116613D = ((float) this.f116671v.centerX()) - (f / 2.0f);
        } else if (i4 != 5) {
            this.f116613D = (float) this.f116671v.left;
        } else {
            this.f116613D = ((float) this.f116671v.right) - f;
        }
        m79321A(this.f116636a);
        m79329y(this.f116636a);
    }

    /* renamed from: g */
    public final void mo48062g(ColorStateList colorStateList) {
        if (this.f116657h != colorStateList || this.f116656g != colorStateList) {
            this.f116657h = colorStateList;
            this.f116656g = colorStateList;
            mo48061f(false);
        }
    }

    /* renamed from: h */
    public final void mo48063h(int i, int i2, int i3, int i4) {
        if (!m79323C(this.f116655f, i, i2, i3, i4)) {
            this.f116655f.set(i, i2, i3, i4);
            this.f116634Y = true;
        }
    }

    /* renamed from: i */
    public final void mo48064i(int i) {
        C44698h hVar = new C44698h(this.f116670u.getContext(), i);
        ColorStateList colorStateList = hVar.f116503j;
        if (colorStateList != null) {
            this.f116657h = colorStateList;
        }
        float f = hVar.f116504k;
        if (f != 0.0f) {
            this.f116610A = f;
        }
        ColorStateList colorStateList2 = hVar.f116494a;
        if (colorStateList2 != null) {
            this.f116640ad = colorStateList2;
        }
        this.f116638ab = hVar.f116498e;
        this.f116639ac = hVar.f116499f;
        this.f116637aa = hVar.f116500g;
        this.f116645ai = hVar.f116502i;
        C44692b bVar = this.f116625P;
        if (bVar != null) {
            bVar.f116483a = true;
        }
        C44745e eVar = new C44745e(this);
        hVar.mo47993b();
        this.f116625P = new C44692b(eVar, hVar.f116506m);
        hVar.mo47994c(this.f116670u.getContext(), this.f116625P);
        mo48061f(false);
    }

    /* renamed from: j */
    public final void mo48065j(ColorStateList colorStateList) {
        if (this.f116657h != colorStateList) {
            this.f116657h = colorStateList;
            mo48061f(false);
        }
    }

    /* renamed from: k */
    public final void mo48066k(int i) {
        if (this.f116674y != i) {
            this.f116674y = i;
            mo48061f(false);
        }
    }

    /* renamed from: l */
    public final void mo48067l(int i, int i2, int i3, int i4) {
        if (!m79323C(this.f116671v, i, i2, i3, i4)) {
            this.f116671v.set(i, i2, i3, i4);
            this.f116634Y = true;
        }
    }

    /* renamed from: m */
    public final void mo48068m(int i) {
        C44698h hVar = new C44698h(this.f116670u.getContext(), i);
        ColorStateList colorStateList = hVar.f116503j;
        if (colorStateList != null) {
            this.f116656g = colorStateList;
        }
        float f = hVar.f116504k;
        if (f != 0.0f) {
            this.f116675z = f;
        }
        ColorStateList colorStateList2 = hVar.f116494a;
        if (colorStateList2 != null) {
            this.f116644ah = colorStateList2;
        }
        this.f116642af = hVar.f116498e;
        this.f116643ag = hVar.f116499f;
        this.f116641ae = hVar.f116500g;
        this.f116666q = hVar.f116502i;
        C44692b bVar = this.f116624O;
        if (bVar != null) {
            bVar.f116483a = true;
        }
        C44746f fVar = new C44746f(this);
        hVar.mo47993b();
        this.f116624O = new C44692b(fVar, hVar.f116506m);
        hVar.mo47994c(this.f116670u.getContext(), this.f116624O);
        mo48061f(false);
    }

    /* renamed from: n */
    public final void mo48069n(int i) {
        if (this.f116673x != i) {
            this.f116673x = i;
            mo48061f(false);
        }
    }

    /* renamed from: o */
    public final void mo48070o(float f) {
        if (this.f116675z != f) {
            this.f116675z = f;
            mo48061f(false);
        }
    }

    /* renamed from: p */
    public final void mo48071p(float f) {
        float b = C1886a.m5144b(f, 0.0f, 1.0f);
        if (b != this.f116636a) {
            this.f116636a = b;
            m79329y(b);
        }
    }

    /* renamed from: q */
    public final void mo48072q(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f116660k, charSequence)) {
            this.f116660k = charSequence;
            this.f116626Q = null;
            mo48061f(false);
        }
    }

    /* renamed from: r */
    public final boolean mo48073r(CharSequence charSequence) {
        C1956i iVar;
        boolean z = true;
        if (C2043bi.m5577f(this.f116670u) != 1) {
            z = false;
        }
        if (!this.f116662m) {
            return z;
        }
        if (z) {
            iVar = C1963p.f5882d;
        } else {
            iVar = C1963p.f5881c;
        }
        return iVar.mo5116a(charSequence, charSequence.length());
    }

    /* renamed from: s */
    public final boolean mo48074s(Typeface typeface) {
        C44692b bVar = this.f116625P;
        if (bVar != null) {
            bVar.f116483a = true;
        }
        if (this.f116619J == typeface) {
            return false;
        }
        this.f116619J = typeface;
        Typeface a = C44700j.m79248a(this.f116670u.getContext().getResources().getConfiguration(), typeface);
        this.f116618I = a;
        if (a == null) {
            a = this.f116619J;
        }
        this.f116617H = a;
        return true;
    }

    /* renamed from: t */
    public final boolean mo48075t(Typeface typeface) {
        C44692b bVar = this.f116624O;
        if (bVar != null) {
            bVar.f116483a = true;
        }
        if (this.f116622M == typeface) {
            return false;
        }
        this.f116622M = typeface;
        Typeface a = C44700j.m79248a(this.f116670u.getContext().getResources().getConfiguration(), typeface);
        this.f116621L = a;
        if (a == null) {
            a = this.f116622M;
        }
        this.f116620K = a;
        return true;
    }

    /* renamed from: u */
    public final boolean mo48076u(int[] iArr) {
        ColorStateList colorStateList;
        this.f116633X = iArr;
        ColorStateList colorStateList2 = this.f116657h;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.f116656g) == null || !colorStateList.isStateful())) {
            return false;
        }
        mo48061f(false);
        return true;
    }
}
