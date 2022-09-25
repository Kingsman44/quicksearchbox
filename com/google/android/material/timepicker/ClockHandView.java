package com.google.android.material.timepicker;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3504a.C44497b;
import com.google.android.material.p3510g.C44688a;
import com.google.android.material.p3512i.C44693c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
class ClockHandView extends View {

    /* renamed from: a */
    public boolean f117490a;

    /* renamed from: b */
    public boolean f117491b;

    /* renamed from: c */
    public final int f117492c;

    /* renamed from: d */
    public final RectF f117493d;

    /* renamed from: e */
    public C44983g f117494e;

    /* renamed from: f */
    public int f117495f;

    /* renamed from: g */
    public int f117496g;

    /* renamed from: h */
    private final int f117497h;

    /* renamed from: i */
    private final TimeInterpolator f117498i;

    /* renamed from: j */
    private final ValueAnimator f117499j;

    /* renamed from: k */
    private float f117500k;

    /* renamed from: l */
    private float f117501l;

    /* renamed from: m */
    private boolean f117502m;

    /* renamed from: n */
    private final int f117503n;

    /* renamed from: o */
    private final List f117504o;

    /* renamed from: p */
    private final float f117505p;

    /* renamed from: q */
    private final Paint f117506q;

    /* renamed from: r */
    private final int f117507r;

    /* renamed from: s */
    private float f117508s;

    /* renamed from: t */
    private boolean f117509t;

    /* renamed from: u */
    private double f117510u;

    public ClockHandView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    private final int m79944d(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f2 - ((float) (getHeight() / 2))), (double) (f - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    /* renamed from: e */
    private final int m79945e(int i) {
        return i == 2 ? Math.round(((float) this.f117495f) * 0.66f) : this.f117495f;
    }

    /* renamed from: a */
    public final void mo48622a(C44984h hVar) {
        this.f117504o.add(hVar);
    }

    /* renamed from: b */
    public final void mo48623b(float f, boolean z) {
        ValueAnimator valueAnimator = this.f117499j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            float f2 = this.f117508s;
            if (Math.abs(f2 - f) > 180.0f) {
                if (f2 > 180.0f && f < 180.0f) {
                    f += 360.0f;
                }
                if (f2 < 180.0f && f > 180.0f) {
                    f2 += 360.0f;
                }
            }
            Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
            this.f117499j.setFloatValues(new float[]{((Float) pair.first).floatValue(), ((Float) pair.second).floatValue()});
            this.f117499j.setDuration((long) this.f117497h);
            this.f117499j.setInterpolator(this.f117498i);
            this.f117499j.addUpdateListener(new C44981e(this));
            this.f117499j.addListener(new C44982f());
            this.f117499j.start();
            return;
        }
        mo48624c(f, false);
    }

    /* renamed from: c */
    public final void mo48624c(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f117508s = f2;
        this.f117510u = Math.toRadians((double) (-90.0f + f2));
        int height = getHeight();
        int width = getWidth();
        float e = (float) m79945e(this.f117496g);
        float cos = ((float) (width / 2)) + (((float) Math.cos(this.f117510u)) * e);
        float sin = ((float) (height / 2)) + (e * ((float) Math.sin(this.f117510u)));
        RectF rectF = this.f117493d;
        float f3 = (float) this.f117492c;
        rectF.set(cos - f3, sin - f3, cos + f3, sin + f3);
        for (C44984h a : this.f117504o) {
            a.mo48619a(f2, z);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int e = m79945e(this.f117496g);
        float f = (float) width;
        float f2 = (float) e;
        double cos = Math.cos(this.f117510u);
        float f3 = (float) height;
        double sin = Math.sin(this.f117510u);
        this.f117506q.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) cos) * f2) + f, (f2 * ((float) sin)) + f3, (float) this.f117492c, this.f117506q);
        double sin2 = Math.sin(this.f117510u);
        double cos2 = Math.cos(this.f117510u);
        double d = (double) ((float) (e - this.f117492c));
        this.f117506q.setStrokeWidth((float) this.f117507r);
        Double.isNaN(d);
        Double.isNaN(d);
        canvas.drawLine(f, f3, (float) (width + ((int) (cos2 * d))), (float) (height + ((int) (d * sin2))), this.f117506q);
        canvas.drawCircle(f, f3, this.f117505p, this.f117506q);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f117499j.isRunning()) {
            mo48623b(this.f117508s, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        if (r9 != r8) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008a, code lost:
        if (r9 == r8) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r6 == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        if (r0 == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r11.f117490a == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0097, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0099, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009a, code lost:
        mo48623b(r8, r5);
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getActionMasked()
            float r1 = r12.getX()
            float r12 = r12.getY()
            r2 = 12
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x006c
            r5 = 2
            if (r0 == r3) goto L_0x001a
            if (r0 == r5) goto L_0x001a
            r0 = 0
            r5 = 0
            goto L_0x0076
        L_0x001a:
            float r6 = r11.f117500k
            float r6 = r1 - r6
            int r6 = (int) r6
            float r7 = r11.f117501l
            float r7 = r12 - r7
            int r7 = (int) r7
            int r6 = r6 * r6
            int r7 = r7 * r7
            int r6 = r6 + r7
            int r7 = r11.f117503n
            if (r6 <= r7) goto L_0x002f
            r6 = 1
            goto L_0x0030
        L_0x002f:
            r6 = 0
        L_0x0030:
            r11.f117502m = r6
            boolean r6 = r11.f117509t
            if (r0 != r3) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            boolean r7 = r11.f117491b
            if (r7 == 0) goto L_0x006a
            int r7 = r11.getWidth()
            int r7 = r7 / r5
            float r7 = (float) r7
            float r7 = r1 - r7
            double r7 = (double) r7
            int r9 = r11.getHeight()
            int r9 = r9 / r5
            float r9 = (float) r9
            float r9 = r12 - r9
            double r9 = (double) r9
            double r7 = java.lang.Math.hypot(r7, r9)
            float r7 = (float) r7
            int r8 = r11.m79945e(r5)
            float r8 = (float) r8
            android.content.Context r9 = r11.getContext()
            float r9 = com.google.android.material.internal.C44741bm.m79308a(r9, r2)
            float r8 = r8 + r9
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r5 = 1
        L_0x0068:
            r11.f117496g = r5
        L_0x006a:
            r5 = 0
            goto L_0x0077
        L_0x006c:
            r11.f117500k = r1
            r11.f117501l = r12
            r11.f117502m = r3
            r11.f117509t = r4
            r0 = 0
            r5 = 1
        L_0x0076:
            r6 = 0
        L_0x0077:
            boolean r7 = r11.f117509t
            int r8 = r11.m79944d(r1, r12)
            float r9 = r11.f117508s
            float r8 = (float) r8
            if (r5 == 0) goto L_0x0088
            int r5 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x008c
        L_0x0086:
            r5 = 1
            goto L_0x009e
        L_0x0088:
            int r5 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x0091
        L_0x008c:
            if (r6 == 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r5 = 0
            goto L_0x009e
        L_0x0091:
            if (r0 == 0) goto L_0x0099
            boolean r5 = r11.f117490a
            if (r5 == 0) goto L_0x0099
            r5 = 1
            goto L_0x009a
        L_0x0099:
            r5 = 0
        L_0x009a:
            r11.mo48623b(r8, r5)
            goto L_0x0086
        L_0x009e:
            r5 = r5 | r7
            r11.f117509t = r5
            if (r5 == 0) goto L_0x010b
            if (r0 == 0) goto L_0x010b
            com.google.android.material.timepicker.g r0 = r11.f117494e
            if (r0 == 0) goto L_0x010b
            int r12 = r11.m79944d(r1, r12)
            float r12 = (float) r12
            boolean r1 = r11.f117502m
            com.google.android.material.timepicker.u r0 = (com.google.android.material.timepicker.C44997u) r0
            r0.f117594e = r3
            com.google.android.material.timepicker.TimeModel r5 = r0.f117591b
            int r6 = r5.f117515e
            int r7 = r5.f117514d
            int r5 = r5.f117516f
            r8 = 10
            if (r5 != r8) goto L_0x00e3
            com.google.android.material.timepicker.TimePickerView r12 = r0.f117590a
            float r1 = r0.f117593d
            com.google.android.material.timepicker.ClockHandView r12 = r12.f117520c
            r12.mo48623b(r1, r4)
            com.google.android.material.timepicker.TimePickerView r12 = r0.f117590a
            android.content.Context r12 = r12.getContext()
            java.lang.Class<android.view.accessibility.AccessibilityManager> r1 = android.view.accessibility.AccessibilityManager.class
            java.lang.Object r12 = androidx.core.content.C1878d.m5129b(r12, r1)
            android.view.accessibility.AccessibilityManager r12 = (android.view.accessibility.AccessibilityManager) r12
            if (r12 == 0) goto L_0x00df
            boolean r12 = r12.isTouchExplorationEnabled()
            if (r12 != 0) goto L_0x0103
        L_0x00df:
            r0.mo48665e(r2, r3)
            goto L_0x0103
        L_0x00e3:
            int r12 = java.lang.Math.round(r12)
            if (r1 != 0) goto L_0x00fa
            int r12 = r12 + 15
            int r12 = r12 / 30
            int r12 = r12 * 5
            int r12 = r12 % 60
            com.google.android.material.timepicker.TimeModel r2 = r0.f117591b
            r2.f117515e = r12
            int r12 = r12 * 6
            float r12 = (float) r12
            r0.f117592c = r12
        L_0x00fa:
            com.google.android.material.timepicker.TimePickerView r12 = r0.f117590a
            float r2 = r0.f117592c
            com.google.android.material.timepicker.ClockHandView r12 = r12.f117520c
            r12.mo48623b(r2, r1)
        L_0x0103:
            r0.f117594e = r4
            r0.mo48666g()
            r0.mo48664d(r7, r6)
        L_0x010b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockHandView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f117499j = new ValueAnimator();
        this.f117504o = new ArrayList();
        Paint paint = new Paint();
        this.f117506q = paint;
        this.f117493d = new RectF();
        this.f117496g = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C44991o.f117578b, i, 2132151831);
        this.f117497h = C44693c.m79225a(context, R.attr.motionDurationLong2, 200);
        this.f117498i = C44688a.m79217a(context, R.attr.motionEasingEmphasizedInterpolator, C44497b.f115651b);
        this.f117495f = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f117492c = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f117507r = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f117505p = (float) resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        mo48623b(0.0f, false);
        this.f117503n = ViewConfiguration.get(context).getScaledTouchSlop();
        C2043bi.m5551ae(this, 2);
        obtainStyledAttributes.recycle();
    }
}
