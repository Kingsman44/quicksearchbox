package androidx.customview.p103b;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.p098j.C2043bi;
import java.util.Arrays;

/* renamed from: androidx.customview.b.h */
/* compiled from: PG */
public final class C2150h {

    /* renamed from: l */
    private static final Interpolator f6091l = new C2147e();

    /* renamed from: a */
    public int f6092a;

    /* renamed from: b */
    public int f6093b;

    /* renamed from: c */
    public float[] f6094c;

    /* renamed from: d */
    public float[] f6095d;

    /* renamed from: e */
    public float[] f6096e;

    /* renamed from: f */
    public float[] f6097f;

    /* renamed from: g */
    public float f6098g;

    /* renamed from: h */
    public int f6099h;

    /* renamed from: i */
    public final int f6100i;

    /* renamed from: j */
    public int f6101j;

    /* renamed from: k */
    public View f6102k;

    /* renamed from: m */
    private int f6103m = -1;

    /* renamed from: n */
    private int[] f6104n;

    /* renamed from: o */
    private int[] f6105o;

    /* renamed from: p */
    private int[] f6106p;

    /* renamed from: q */
    private int f6107q;

    /* renamed from: r */
    private VelocityTracker f6108r;

    /* renamed from: s */
    private final float f6109s;

    /* renamed from: t */
    private final OverScroller f6110t;

    /* renamed from: u */
    private final C2149g f6111u;

    /* renamed from: v */
    private boolean f6112v;

    /* renamed from: w */
    private final ViewGroup f6113w;

    /* renamed from: x */
    private final Runnable f6114x = new C2148f(this);

    /* renamed from: b */
    public static C2150h m5963b(ViewGroup viewGroup, C2149g gVar) {
        return new C2150h(viewGroup.getContext(), viewGroup, gVar);
    }

    /* renamed from: m */
    public static C2150h m5964m(ViewGroup viewGroup, C2149g gVar) {
        C2150h b = m5963b(viewGroup, gVar);
        b.f6093b = (int) ((float) b.f6093b);
        return b;
    }

    /* renamed from: n */
    private final int m5965n(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f6113w.getWidth();
        float f = (float) (width / 2);
        float sin = f + (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 8.0f) * 0.47123894f))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: o */
    private final void m5966o(int i) {
        float[] fArr = this.f6094c;
        if (fArr != null && mo5410g(i)) {
            fArr[i] = 0.0f;
            this.f6095d[i] = 0.0f;
            this.f6096e[i] = 0.0f;
            this.f6097f[i] = 0.0f;
            this.f6104n[i] = 0;
            this.f6105o[i] = 0;
            this.f6106p[i] = 0;
            this.f6107q = ((1 << i) ^ -1) & this.f6107q;
        }
    }

    /* renamed from: p */
    private final void m5967p(float f, float f2) {
        this.f6112v = true;
        this.f6111u.mo5399h(this.f6102k, f, f2);
        this.f6112v = false;
        if (this.f6092a == 1) {
            mo5409f(0);
        }
    }

    /* renamed from: q */
    private final void m5968q() {
        this.f6108r.computeCurrentVelocity(1000, this.f6109s);
        m5967p(m5976y(this.f6108r.getXVelocity(this.f6103m), this.f6098g, this.f6109s), m5976y(this.f6108r.getYVelocity(this.f6103m), this.f6098g, this.f6109s));
    }

    /* renamed from: r */
    private final void m5969r(float f, float f2, int i) {
        boolean u = m5972u(f, f2, i, 1);
        if (m5972u(f2, f, i, 4)) {
            u |= true;
        }
        if (m5972u(f, f2, i, 2)) {
            u |= true;
        }
        if (m5972u(f2, f, i, 8)) {
            u |= true;
        }
        if (u) {
            int[] iArr = this.f6105o;
            iArr[i] = iArr[i] | u;
            this.f6111u.mo5396e(u ? 1 : 0, i);
        }
    }

    /* renamed from: s */
    private final void m5970s(float f, float f2, int i) {
        float[] fArr = this.f6094c;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f6095d;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f6096e;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f6097f;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f6104n;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f6105o;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f6106p;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f6094c = fArr2;
            this.f6095d = fArr3;
            this.f6096e = fArr4;
            this.f6097f = fArr5;
            this.f6104n = iArr;
            this.f6105o = iArr2;
            this.f6106p = iArr3;
        }
        float[] fArr9 = this.f6094c;
        this.f6096e[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f6095d;
        this.f6097f[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f6104n;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.f6113w.getLeft() + this.f6099h) {
            i2 = 1;
        }
        if (i5 < this.f6113w.getTop() + this.f6099h) {
            i2 |= 4;
        }
        if (i4 > this.f6113w.getRight() - this.f6099h) {
            i2 |= 2;
        }
        if (i5 > this.f6113w.getBottom() - this.f6099h) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.f6107q |= 1 << i;
    }

    /* renamed from: t */
    private final void m5971t(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m5975x(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f6096e[pointerId] = x;
                this.f6097f[pointerId] = y;
            }
        }
    }

    /* renamed from: u */
    private final boolean m5972u(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (!((this.f6104n[i] & i2) != i2 || (this.f6101j & i2) == 0 || (this.f6106p[i] & i2) == i2 || (this.f6105o[i] & i2) == i2)) {
            float f3 = (float) this.f6093b;
            if (abs > f3 || abs2 > f3) {
                if (abs < abs2 * 0.5f && this.f6111u.mo5402k()) {
                    int[] iArr = this.f6106p;
                    iArr[i] = iArr[i] | i2;
                    return false;
                } else if ((this.f6105o[i] & i2) != 0 || abs <= ((float) this.f6093b)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: v */
    private final boolean m5973v(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f6111u.mo5394c(view) > 0;
        boolean z2 = this.f6111u.mo5395d(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f6093b) : z2 && Math.abs(f2) > ((float) this.f6093b);
        }
        int i = this.f6093b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    /* renamed from: w */
    private final boolean m5974w(int i, int i2, int i3, int i4) {
        int i5;
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f6102k.getLeft();
        int top = this.f6102k.getTop();
        int i6 = i - left;
        int i7 = i2 - top;
        if (i6 != 0) {
            i5 = i6;
        } else if (i7 != 0) {
            i5 = 0;
        } else {
            this.f6110t.abortAnimation();
            mo5409f(0);
            return false;
        }
        View view = this.f6102k;
        int z = m5977z(i3, (int) this.f6098g, (int) this.f6109s);
        int z2 = m5977z(i4, (int) this.f6098g, (int) this.f6109s);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i7);
        int abs3 = Math.abs(z);
        int abs4 = Math.abs(z2);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (z != 0) {
            f = (float) abs3;
            f2 = (float) i8;
        } else {
            f = (float) abs;
            f2 = (float) i9;
        }
        float f5 = f / f2;
        if (z2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i8;
        } else {
            f4 = (float) abs2;
            f3 = (float) i9;
        }
        int n = m5965n(i5, z, this.f6111u.mo5394c(view));
        this.f6110t.startScroll(left, top, i5, i7, (int) ((((float) n) * f5) + (((float) m5965n(i7, z2, this.f6111u.mo5395d(view))) * (f4 / f3))));
        mo5409f(2);
        return true;
    }

    /* renamed from: x */
    private final boolean m5975x(int i) {
        return mo5410g(i);
    }

    /* renamed from: y */
    private static final float m5976y(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs > f3) {
            return f > 0.0f ? f3 : -f3;
        }
        return f;
    }

    /* renamed from: z */
    private static final int m5977z(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs > i3) {
            return i > 0 ? i3 : -i3;
        }
        return i;
    }

    /* renamed from: a */
    public final View mo5405a(int i, int i2) {
        int childCount = this.f6113w.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = this.f6113w.getChildAt(this.f6111u.mo5393b(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    /* renamed from: c */
    public final void mo5406c() {
        this.f6103m = -1;
        float[] fArr = this.f6094c;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f6095d, 0.0f);
            Arrays.fill(this.f6096e, 0.0f);
            Arrays.fill(this.f6097f, 0.0f);
            Arrays.fill(this.f6104n, 0);
            Arrays.fill(this.f6105o, 0);
            Arrays.fill(this.f6106p, 0);
            this.f6107q = 0;
        }
        VelocityTracker velocityTracker = this.f6108r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6108r = null;
        }
    }

    /* renamed from: d */
    public final void mo5407d(View view, int i) {
        if (view.getParent() == this.f6113w) {
            this.f6102k = view;
            this.f6103m = i;
            this.f6111u.mo5397f(view, i);
            mo5409f(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f6113w + ")");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        if (r9.f6103m == -1) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
        m5968q();
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5408e(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r0 = r10.getActionMasked()
            int r1 = r10.getActionIndex()
            r2 = 0
            if (r0 != 0) goto L_0x000f
            r9.mo5406c()
            r0 = 0
        L_0x000f:
            android.view.VelocityTracker r3 = r9.f6108r
            if (r3 != 0) goto L_0x0019
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.f6108r = r3
        L_0x0019:
            android.view.VelocityTracker r3 = r9.f6108r
            r3.addMovement(r10)
            if (r0 == 0) goto L_0x0192
            r3 = 1
            if (r0 == r3) goto L_0x0187
            r4 = 2
            r5 = -1
            if (r0 == r4) goto L_0x00d1
            r4 = 3
            if (r0 == r4) goto L_0x00c5
            r4 = 5
            if (r0 == r4) goto L_0x0074
            r4 = 6
            if (r0 == r4) goto L_0x0032
            goto L_0x01b8
        L_0x0032:
            int r0 = r10.getPointerId(r1)
            int r1 = r9.f6092a
            if (r1 != r3) goto L_0x0070
            int r1 = r9.f6103m
            if (r0 != r1) goto L_0x0070
            int r1 = r10.getPointerCount()
        L_0x0042:
            if (r2 >= r1) goto L_0x006d
            int r3 = r10.getPointerId(r2)
            int r4 = r9.f6103m
            if (r3 != r4) goto L_0x004d
            goto L_0x006a
        L_0x004d:
            float r4 = r10.getX(r2)
            float r6 = r10.getY(r2)
            int r4 = (int) r4
            int r6 = (int) r6
            android.view.View r4 = r9.mo5405a(r4, r6)
            android.view.View r6 = r9.f6102k
            if (r4 != r6) goto L_0x006a
            boolean r3 = r9.mo5414k(r6, r3)
            if (r3 == 0) goto L_0x006a
            int r10 = r9.f6103m
            if (r10 != r5) goto L_0x0070
            goto L_0x006d
        L_0x006a:
            int r2 = r2 + 1
            goto L_0x0042
        L_0x006d:
            r9.m5968q()
        L_0x0070:
            r9.m5966o(r0)
            return
        L_0x0074:
            int r0 = r10.getPointerId(r1)
            float r2 = r10.getX(r1)
            float r10 = r10.getY(r1)
            r9.m5970s(r2, r10, r0)
            int r1 = r9.f6092a
            if (r1 != 0) goto L_0x009f
            int r1 = (int) r2
            int r10 = (int) r10
            android.view.View r10 = r9.mo5405a(r1, r10)
            r9.mo5414k(r10, r0)
            int[] r10 = r9.f6104n
            r10 = r10[r0]
            int r0 = r9.f6101j
            r10 = r10 & r0
            if (r10 == 0) goto L_0x01b8
            androidx.customview.b.g r10 = r9.f6111u
            r10.mo5403l()
            return
        L_0x009f:
            int r1 = (int) r2
            int r10 = (int) r10
            android.view.View r2 = r9.f6102k
            if (r2 != 0) goto L_0x00a7
            goto L_0x01b8
        L_0x00a7:
            int r3 = r2.getLeft()
            if (r1 < r3) goto L_0x01b8
            int r3 = r2.getRight()
            if (r1 >= r3) goto L_0x01b8
            int r1 = r2.getTop()
            if (r10 < r1) goto L_0x01b8
            int r1 = r2.getBottom()
            if (r10 >= r1) goto L_0x01b8
            android.view.View r10 = r9.f6102k
            r9.mo5414k(r10, r0)
            return
        L_0x00c5:
            int r10 = r9.f6092a
            if (r10 != r3) goto L_0x00cd
            r10 = 0
            r9.m5967p(r10, r10)
        L_0x00cd:
            r9.mo5406c()
            return
        L_0x00d1:
            int r0 = r9.f6092a
            if (r0 != r3) goto L_0x0141
            int r0 = r9.f6103m
            boolean r1 = r9.m5975x(r0)
            if (r1 == 0) goto L_0x01b8
            int r0 = r10.findPointerIndex(r0)
            if (r0 == r5) goto L_0x01b8
            float r1 = r10.getX(r0)
            float r0 = r10.getY(r0)
            float[] r2 = r9.f6096e
            int r3 = r9.f6103m
            r2 = r2[r3]
            float r1 = r1 - r2
            int r1 = (int) r1
            float[] r2 = r9.f6097f
            r2 = r2[r3]
            float r0 = r0 - r2
            int r0 = (int) r0
            android.view.View r2 = r9.f6102k
            int r2 = r2.getLeft()
            int r2 = r2 + r1
            android.view.View r3 = r9.f6102k
            int r3 = r3.getTop()
            int r3 = r3 + r0
            android.view.View r4 = r9.f6102k
            int r4 = r4.getLeft()
            android.view.View r5 = r9.f6102k
            int r5 = r5.getTop()
            if (r1 == 0) goto L_0x0124
            androidx.customview.b.g r6 = r9.f6111u
            android.view.View r7 = r9.f6102k
            int r2 = r6.mo5401j(r7, r2)
            android.view.View r6 = r9.f6102k
            int r4 = r2 - r4
            androidx.core.p098j.C2043bi.m5516J(r6, r4)
        L_0x0124:
            if (r0 == 0) goto L_0x0135
            androidx.customview.b.g r4 = r9.f6111u
            android.view.View r6 = r9.f6102k
            int r3 = r4.mo5392a(r6, r3, r0)
            android.view.View r4 = r9.f6102k
            int r5 = r3 - r5
            androidx.core.p098j.C2043bi.m5517K(r4, r5)
        L_0x0135:
            if (r1 != 0) goto L_0x0139
            if (r0 == 0) goto L_0x0183
        L_0x0139:
            androidx.customview.b.g r0 = r9.f6111u
            android.view.View r1 = r9.f6102k
            r0.mo5404m(r1, r2, r3)
            goto L_0x0183
        L_0x0141:
            int r0 = r10.getPointerCount()
        L_0x0145:
            if (r2 >= r0) goto L_0x0183
            int r1 = r10.getPointerId(r2)
            boolean r4 = r9.m5975x(r1)
            if (r4 != 0) goto L_0x0152
            goto L_0x0180
        L_0x0152:
            float r4 = r10.getX(r2)
            float r5 = r10.getY(r2)
            float[] r6 = r9.f6094c
            r6 = r6[r1]
            float r6 = r4 - r6
            float[] r7 = r9.f6095d
            r7 = r7[r1]
            float r7 = r5 - r7
            r9.m5969r(r6, r7, r1)
            int r8 = r9.f6092a
            if (r8 == r3) goto L_0x0183
            int r4 = (int) r4
            int r5 = (int) r5
            android.view.View r4 = r9.mo5405a(r4, r5)
            boolean r5 = r9.m5973v(r4, r6, r7)
            if (r5 == 0) goto L_0x0180
            boolean r1 = r9.mo5414k(r4, r1)
            if (r1 == 0) goto L_0x0180
            goto L_0x0183
        L_0x0180:
            int r2 = r2 + 1
            goto L_0x0145
        L_0x0183:
            r9.m5971t(r10)
            return
        L_0x0187:
            int r10 = r9.f6092a
            if (r10 != r3) goto L_0x018e
            r9.m5968q()
        L_0x018e:
            r9.mo5406c()
            return
        L_0x0192:
            float r0 = r10.getX()
            float r1 = r10.getY()
            int r10 = r10.getPointerId(r2)
            int r2 = (int) r0
            int r3 = (int) r1
            android.view.View r2 = r9.mo5405a(r2, r3)
            r9.m5970s(r0, r1, r10)
            r9.mo5414k(r2, r10)
            int[] r0 = r9.f6104n
            r10 = r0[r10]
            int r0 = r9.f6101j
            r10 = r10 & r0
            if (r10 == 0) goto L_0x01b8
            androidx.customview.b.g r10 = r9.f6111u
            r10.mo5403l()
        L_0x01b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.p103b.C2150h.mo5408e(android.view.MotionEvent):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo5409f(int i) {
        this.f6113w.removeCallbacks(this.f6114x);
        if (this.f6092a != i) {
            this.f6092a = i;
            this.f6111u.mo5398g(i);
            if (this.f6092a == 0) {
                this.f6102k = null;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo5410g(int i) {
        return ((1 << i) & this.f6107q) != 0;
    }

    /* renamed from: h */
    public final boolean mo5411h(int i, int i2) {
        if (this.f6112v) {
            return m5974w(i, i2, (int) this.f6108r.getXVelocity(this.f6103m), (int) this.f6108r.getYVelocity(this.f6103m));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d4, code lost:
        if (r12 != r11) goto L_0x00dd;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5412i(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0012
            r16.mo5406c()
            r2 = 0
        L_0x0012:
            android.view.VelocityTracker r5 = r0.f6108r
            if (r5 != 0) goto L_0x001c
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r0.f6108r = r5
        L_0x001c:
            android.view.VelocityTracker r5 = r0.f6108r
            r5.addMovement(r1)
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x00f8
            if (r2 == r6) goto L_0x00f4
            if (r2 == r5) goto L_0x0071
            r7 = 3
            if (r2 == r7) goto L_0x00f4
            r7 = 5
            if (r2 == r7) goto L_0x003d
            r5 = 6
            if (r2 == r5) goto L_0x0034
            goto L_0x0127
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.m5966o(r1)
            goto L_0x0127
        L_0x003d:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m5970s(r7, r1, r2)
            int r3 = r0.f6092a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f6104n
            r1 = r1[r2]
            int r2 = r0.f6101j
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0127
            androidx.customview.b.g r1 = r0.f6111u
            r1.mo5403l()
            goto L_0x0127
        L_0x0060:
            if (r3 != r5) goto L_0x0127
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo5405a(r3, r1)
            android.view.View r3 = r0.f6102k
            if (r1 != r3) goto L_0x0127
            r0.mo5414k(r1, r2)
            goto L_0x0127
        L_0x0071:
            float[] r2 = r0.f6094c
            if (r2 == 0) goto L_0x0127
            float[] r2 = r0.f6095d
            if (r2 == 0) goto L_0x0127
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00f0
            int r5 = r1.getPointerId(r3)
            boolean r7 = r0.m5975x(r5)
            if (r7 != 0) goto L_0x008b
            goto L_0x00ed
        L_0x008b:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f6094c
            r9 = r9[r5]
            float r9 = r7 - r9
            float[] r10 = r0.f6095d
            r10 = r10[r5]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo5405a(r7, r8)
            boolean r8 = r0.m5973v(r7, r9, r10)
            if (r8 == 0) goto L_0x00dd
            int r11 = r7.getLeft()
            androidx.customview.b.g r12 = r0.f6111u
            int r13 = (int) r9
            int r13 = r13 + r11
            int r12 = r12.mo5401j(r7, r13)
            int r13 = r7.getTop()
            int r14 = (int) r10
            androidx.customview.b.g r15 = r0.f6111u
            int r4 = r13 + r14
            int r4 = r15.mo5392a(r7, r4, r14)
            androidx.customview.b.g r14 = r0.f6111u
            int r14 = r14.mo5394c(r7)
            androidx.customview.b.g r15 = r0.f6111u
            int r15 = r15.mo5395d(r7)
            if (r14 == 0) goto L_0x00d6
            if (r14 <= 0) goto L_0x00dd
            if (r12 != r11) goto L_0x00dd
        L_0x00d6:
            if (r15 == 0) goto L_0x00f0
            if (r15 <= 0) goto L_0x00dd
            if (r4 != r13) goto L_0x00dd
            goto L_0x00f0
        L_0x00dd:
            r0.m5969r(r9, r10, r5)
            int r4 = r0.f6092a
            if (r4 == r6) goto L_0x00f0
            if (r8 == 0) goto L_0x00ed
            boolean r4 = r0.mo5414k(r7, r5)
            if (r4 == 0) goto L_0x00ed
            goto L_0x00f0
        L_0x00ed:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00f0:
            r16.m5971t(r17)
            goto L_0x0127
        L_0x00f4:
            r16.mo5406c()
            goto L_0x0127
        L_0x00f8:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r4 = 0
            int r1 = r1.getPointerId(r4)
            r0.m5970s(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo5405a(r2, r3)
            android.view.View r3 = r0.f6102k
            if (r2 != r3) goto L_0x0119
            int r3 = r0.f6092a
            if (r3 != r5) goto L_0x0119
            r0.mo5414k(r2, r1)
        L_0x0119:
            int[] r2 = r0.f6104n
            r1 = r2[r1]
            int r2 = r0.f6101j
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0127
            androidx.customview.b.g r1 = r0.f6111u
            r1.mo5403l()
        L_0x0127:
            int r1 = r0.f6092a
            if (r1 != r6) goto L_0x012c
            return r6
        L_0x012c:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.p103b.C2150h.mo5412i(android.view.MotionEvent):boolean");
    }

    /* renamed from: j */
    public final boolean mo5413j(View view, int i, int i2) {
        this.f6102k = view;
        this.f6103m = -1;
        boolean w = m5974w(i, i2, 0, 0);
        if (w || this.f6092a != 0 || this.f6102k == null) {
            return w;
        }
        this.f6102k = null;
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo5414k(View view, int i) {
        if (view == this.f6102k && this.f6103m == i) {
            return true;
        }
        if (view == null || !this.f6111u.mo5400i(view, i)) {
            return false;
        }
        this.f6103m = i;
        mo5407d(view, i);
        return true;
    }

    /* renamed from: l */
    public final boolean mo5415l() {
        if (this.f6092a == 2) {
            boolean computeScrollOffset = this.f6110t.computeScrollOffset();
            int currX = this.f6110t.getCurrX();
            int currY = this.f6110t.getCurrY();
            int left = currX - this.f6102k.getLeft();
            int top = currY - this.f6102k.getTop();
            if (left != 0) {
                C2043bi.m5516J(this.f6102k, left);
            }
            if (top != 0) {
                C2043bi.m5517K(this.f6102k, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f6111u.mo5404m(this.f6102k, currX, currY);
            }
            if (computeScrollOffset) {
                if (currX == this.f6110t.getFinalX() && currY == this.f6110t.getFinalY()) {
                    this.f6110t.abortAnimation();
                }
            }
            this.f6113w.post(this.f6114x);
        }
        return this.f6092a == 2;
    }

    private C2150h(Context context, ViewGroup viewGroup, C2149g gVar) {
        if (gVar != null) {
            this.f6113w = viewGroup;
            this.f6111u = gVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f6100i = i;
            this.f6099h = i;
            this.f6093b = viewConfiguration.getScaledTouchSlop();
            this.f6109s = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f6098g = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f6110t = new OverScroller(context, f6091l);
            return;
        }
        throw new NullPointerException("Callback may not be null");
    }
}
