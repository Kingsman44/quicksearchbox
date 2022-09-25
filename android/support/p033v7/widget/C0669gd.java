package android.support.p033v7.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;

/* renamed from: android.support.v7.widget.gd */
/* compiled from: PG */
public abstract class C0669gd {

    /* renamed from: a */
    private final C0667gb f2448a = new C0667gb();

    /* renamed from: g */
    public int f2449g = -1;

    /* renamed from: h */
    public RecyclerView f2450h;

    /* renamed from: i */
    public C0653fo f2451i;

    /* renamed from: j */
    public boolean f2452j;

    /* renamed from: k */
    public boolean f2453k;

    /* renamed from: l */
    public View f2454l;

    /* renamed from: m */
    public boolean f2455m;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo2799g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo2800h(View view, C0670ge geVar, C0667gb gbVar);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo2801i(int i, int i2, C0667gb gbVar);

    /* renamed from: j */
    public PointF mo3049j(int i) {
        C0653fo foVar = this.f2451i;
        if (foVar instanceof C0668gc) {
            return ((C0668gc) foVar).computeScrollVectorForPosition(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(String.valueOf(C0668gc.class.getCanonicalName())));
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo3050k(int i, int i2) {
        PointF j;
        RecyclerView recyclerView = this.f2450h;
        if (this.f2449g == -1 || recyclerView == null) {
            mo3051l();
        }
        if (!(!this.f2452j || this.f2454l != null || this.f2451i == null || (j = mo3049j(this.f2449g)) == null || (j.x == 0.0f && j.y == 0.0f))) {
            recyclerView.scrollStep((int) Math.signum(j.x), (int) Math.signum(j.y), (int[]) null);
        }
        this.f2452j = false;
        View view = this.f2454l;
        if (view != null) {
            if (this.f2450h.getChildLayoutPosition(view) == this.f2449g) {
                mo2800h(this.f2454l, recyclerView.mState, this.f2448a);
                this.f2448a.mo3047a(recyclerView);
                mo3051l();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f2454l = null;
            }
        }
        if (this.f2453k) {
            C0670ge geVar = recyclerView.mState;
            mo2801i(i, i2, this.f2448a);
            C0667gb gbVar = this.f2448a;
            int i3 = gbVar.f2443c;
            gbVar.mo3047a(recyclerView);
            if (i3 >= 0 && this.f2453k) {
                this.f2452j = true;
                recyclerView.mViewFlinger.mo3058b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo3051l() {
        if (this.f2453k) {
            this.f2453k = false;
            mo2799g();
            this.f2450h.mState.f2456a = -1;
            this.f2454l = null;
            this.f2449g = -1;
            this.f2452j = false;
            this.f2451i.onSmoothScrollerStopped(this);
            this.f2451i = null;
            this.f2450h = null;
        }
    }
}
