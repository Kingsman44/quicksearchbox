package android.support.p033v7.widget;

import android.util.Log;
import android.view.animation.Interpolator;

/* renamed from: android.support.v7.widget.gb */
/* compiled from: PG */
public final class C0667gb {

    /* renamed from: a */
    public int f2441a = 0;

    /* renamed from: b */
    public int f2442b = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: c */
    public int f2443c = -1;

    /* renamed from: d */
    public boolean f2444d = false;

    /* renamed from: e */
    private int f2445e = 0;

    /* renamed from: f */
    private Interpolator f2446f = null;

    /* renamed from: g */
    private int f2447g = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3047a(RecyclerView recyclerView) {
        int i = this.f2443c;
        if (i >= 0) {
            this.f2443c = -1;
            recyclerView.jumpToPositionForSmoothScroller(i);
            this.f2444d = false;
        } else if (this.f2444d) {
            Interpolator interpolator = this.f2446f;
            if (interpolator == null || this.f2442b > 0) {
                int i2 = this.f2442b;
                if (i2 > 0) {
                    recyclerView.mViewFlinger.mo3059c(this.f2445e, this.f2441a, i2, interpolator);
                    int i3 = this.f2447g + 1;
                    this.f2447g = i3;
                    if (i3 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f2444d = false;
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        } else {
            this.f2447g = 0;
        }
    }

    /* renamed from: b */
    public final void mo3048b(int i, int i2, int i3, Interpolator interpolator) {
        this.f2445e = i;
        this.f2441a = i2;
        this.f2442b = i3;
        this.f2446f = interpolator;
        this.f2444d = true;
    }
}
