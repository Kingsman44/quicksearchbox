package androidx.core.widget;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: androidx.core.widget.c */
/* compiled from: PG */
public abstract class C2116c implements View.OnTouchListener {

    /* renamed from: f */
    private static final int f6065f = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    final C2112a f6066a;

    /* renamed from: b */
    final View f6067b;

    /* renamed from: c */
    boolean f6068c;

    /* renamed from: d */
    boolean f6069d;

    /* renamed from: e */
    boolean f6070e;

    /* renamed from: g */
    private final Interpolator f6071g = new AccelerateInterpolator();

    /* renamed from: h */
    private Runnable f6072h;

    /* renamed from: i */
    private final float[] f6073i;

    /* renamed from: j */
    private final float[] f6074j;

    /* renamed from: k */
    private final int f6075k;

    /* renamed from: l */
    private final float[] f6076l;

    /* renamed from: m */
    private final float[] f6077m;

    /* renamed from: n */
    private final float[] f6078n;

    /* renamed from: o */
    private boolean f6079o;

    /* renamed from: p */
    private boolean f6080p;

    public C2116c(View view) {
        C2112a aVar = new C2112a();
        this.f6066a = aVar;
        float[] fArr = {0.0f, 0.0f};
        this.f6073i = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6074j = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f6076l = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f6077m = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6078n = fArr5;
        this.f6067b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f = displayMetrics.density;
        float f2 = displayMetrics.density;
        float f3 = ((float) ((int) ((f * 1575.0f) + 0.5f))) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((float) ((int) ((f2 * 315.0f) + 0.5f))) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f6075k = f6065f;
        aVar.f6055a = 500;
        aVar.f6056b = 500;
    }

    /* renamed from: a */
    static float m5868a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final float m5869g(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f6073i
            r0 = r0[r4]
            float r0 = r0 * r6
            float[] r1 = r3.f6074j
            r1 = r1[r4]
            r2 = 0
            float r0 = m5868a(r0, r2, r1)
            float r1 = r3.m5870h(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.m5870h(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0026
            android.view.animation.Interpolator r6 = r3.f6071g
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x0030
        L_0x0026:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0039
            android.view.animation.Interpolator r6 = r3.f6071g
            float r5 = r6.getInterpolation(r5)
        L_0x0030:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = m5868a(r5, r6, r0)
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003f
            return r2
        L_0x003f:
            float[] r6 = r3.f6076l
            r6 = r6[r4]
            float[] r0 = r3.f6077m
            r0 = r0[r4]
            float[] r1 = r3.f6078n
            r4 = r1[r4]
            float r6 = r6 * r7
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0058
            float r5 = r5 * r6
            float r4 = m5868a(r5, r0, r4)
            return r4
        L_0x0058:
            float r5 = -r5
            float r5 = r5 * r6
            float r4 = m5868a(r5, r0, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C2116c.m5869g(int, float, float, float):float");
    }

    /* renamed from: h */
    private final float m5870h(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.f6070e) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    /* renamed from: i */
    private final void m5871i() {
        int i = 0;
        if (this.f6068c) {
            this.f6070e = false;
            return;
        }
        C2112a aVar = this.f6066a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - aVar.f6059e);
        int i3 = aVar.f6056b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.f6063i = i;
        aVar.f6062h = aVar.mo5353a(currentAnimationTimeMillis);
        aVar.f6061g = currentAnimationTimeMillis;
    }

    /* renamed from: b */
    public abstract boolean mo5355b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo5356c() {
        C2112a aVar = this.f6066a;
        float f = aVar.f6058d;
        int abs = (int) (f / Math.abs(f));
        float f2 = aVar.f6057c;
        int abs2 = (int) (f2 / Math.abs(f2));
        if (abs != 0 && mo5355b(abs)) {
            return true;
        }
        if (abs2 == 0 || !mo5357d()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public abstract boolean mo5357d();

    /* renamed from: e */
    public abstract void mo5358e(int i);

    /* renamed from: f */
    public final void mo5359f(boolean z) {
        if (this.f6080p && !z) {
            m5871i();
        }
        this.f6080p = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f6080p
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x007d
        L_0x0016:
            r5.m5871i()
            goto L_0x007d
        L_0x001a:
            r5.f6069d = r2
            r5.f6079o = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            android.view.View r4 = r5.f6067b
            int r4 = r4.getWidth()
            float r3 = (float) r3
            float r4 = (float) r4
            float r0 = r5.m5869g(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            android.view.View r3 = r5.f6067b
            int r3 = r3.getHeight()
            float r6 = (float) r6
            float r3 = (float) r3
            float r6 = r5.m5869g(r2, r7, r6, r3)
            androidx.core.widget.a r7 = r5.f6066a
            r7.f6057c = r0
            r7.f6058d = r6
            boolean r6 = r5.f6070e
            if (r6 != 0) goto L_0x007d
            boolean r6 = r5.mo5356c()
            if (r6 == 0) goto L_0x007d
            java.lang.Runnable r6 = r5.f6072h
            if (r6 != 0) goto L_0x0061
            androidx.core.widget.b r6 = new androidx.core.widget.b
            r6.<init>(r5)
            r5.f6072h = r6
        L_0x0061:
            r5.f6070e = r2
            r5.f6068c = r2
            boolean r6 = r5.f6079o
            if (r6 != 0) goto L_0x0076
            int r6 = r5.f6075k
            if (r6 <= 0) goto L_0x0076
            android.view.View r7 = r5.f6067b
            java.lang.Runnable r0 = r5.f6072h
            long r3 = (long) r6
            androidx.core.p098j.C2043bi.m5521O(r7, r0, r3)
            goto L_0x007b
        L_0x0076:
            java.lang.Runnable r6 = r5.f6072h
            r6.run()
        L_0x007b:
            r5.f6079o = r2
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C2116c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
