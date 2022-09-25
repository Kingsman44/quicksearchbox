package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: android.support.v7.widget.dr */
/* compiled from: PG */
public class C0602dr extends C0669gd {

    /* renamed from: a */
    protected final LinearInterpolator f2333a = new LinearInterpolator();

    /* renamed from: b */
    protected final DecelerateInterpolator f2334b = new DecelerateInterpolator();

    /* renamed from: c */
    protected PointF f2335c;

    /* renamed from: d */
    protected int f2336d = 0;

    /* renamed from: e */
    protected int f2337e = 0;

    /* renamed from: f */
    private final DisplayMetrics f2338f;

    /* renamed from: n */
    private boolean f2339n = false;

    /* renamed from: o */
    private float f2340o;

    public C0602dr(Context context) {
        this.f2338f = context.getResources().getDisplayMetrics();
    }

    /* renamed from: m */
    private static final int m2151m(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo2793a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: b */
    public int mo2794b(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo2795c(int i) {
        double d = (double) mo2796d(i);
        Double.isNaN(d);
        return (int) Math.ceil(d / 0.3356d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo2796d(int i) {
        float abs = (float) Math.abs(i);
        if (!this.f2339n) {
            this.f2340o = mo2793a(this.f2338f);
            this.f2339n = true;
        }
        return (int) Math.ceil((double) (abs * this.f2340o));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo2797e() {
        PointF pointF = this.f2335c;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        return this.f2335c.x <= 0.0f ? -1 : 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo2798f() {
        PointF pointF = this.f2335c;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.f2335c.y <= 0.0f ? -1 : 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo2799g() {
        this.f2337e = 0;
        this.f2336d = 0;
        this.f2335c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo2800h(View view, C0670ge geVar, C0667gb gbVar) {
        int i;
        int e = mo2797e();
        C0653fo foVar = this.f2451i;
        int i2 = 0;
        if (foVar == null || !foVar.canScrollHorizontally()) {
            i = 0;
        } else {
            C0654fp fpVar = (C0654fp) view.getLayoutParams();
            i = mo2794b(foVar.getDecoratedLeft(view) - fpVar.leftMargin, foVar.getDecoratedRight(view) + fpVar.rightMargin, foVar.getPaddingLeft(), foVar.getWidth() - foVar.getPaddingRight(), e);
        }
        int f = mo2798f();
        C0653fo foVar2 = this.f2451i;
        if (foVar2 != null && foVar2.canScrollVertically()) {
            C0654fp fpVar2 = (C0654fp) view.getLayoutParams();
            i2 = mo2794b(foVar2.getDecoratedTop(view) - fpVar2.topMargin, foVar2.getDecoratedBottom(view) + fpVar2.bottomMargin, foVar2.getPaddingTop(), foVar2.getHeight() - foVar2.getPaddingBottom(), f);
        }
        int c = mo2795c((int) Math.sqrt((double) ((i * i) + (i2 * i2))));
        if (c > 0) {
            gbVar.mo3048b(-i, -i2, c, this.f2334b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo2801i(int i, int i2, C0667gb gbVar) {
        if (this.f2450h.mLayout.getChildCount() == 0) {
            mo3051l();
            return;
        }
        int m = m2151m(this.f2336d, i);
        this.f2336d = m;
        int m2 = m2151m(this.f2337e, i2);
        this.f2337e = m2;
        if (m == 0 && m2 == 0) {
            PointF j = mo3049j(this.f2449g);
            if (j == null || (j.x == 0.0f && j.y == 0.0f)) {
                gbVar.f2443c = this.f2449g;
                mo3051l();
                return;
            }
            float sqrt = (float) Math.sqrt((double) ((j.x * j.x) + (j.y * j.y)));
            j.x /= sqrt;
            j.y /= sqrt;
            this.f2335c = j;
            this.f2336d = (int) (j.x * 10000.0f);
            this.f2337e = (int) (j.y * 10000.0f);
            gbVar.mo3048b((int) (((float) this.f2336d) * 1.2f), (int) (((float) this.f2337e) * 1.2f), (int) (((float) mo2796d(10000)) * 1.2f), this.f2333a);
        }
    }
}
