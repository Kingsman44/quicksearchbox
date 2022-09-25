package android.support.p033v7.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: android.support.v7.widget.hr */
/* compiled from: PG */
public abstract class C0710hr extends C0656fr {

    /* renamed from: a */
    RecyclerView f2542a;

    /* renamed from: b */
    private Scroller f2543b;

    /* renamed from: c */
    private final C0658ft f2544c = new C0708hp(this);

    /* renamed from: a */
    public abstract int mo2802a(C0653fo foVar, int i, int i2);

    /* renamed from: b */
    public abstract View mo2803b(C0653fo foVar);

    /* renamed from: c */
    public abstract int[] mo2804c(C0653fo foVar, View view);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0669gd mo2853d(C0653fo foVar) {
        return mo3196f(foVar);
    }

    /* renamed from: e */
    public final boolean mo3014e(int i, int i2) {
        C0669gd d;
        int a;
        RecyclerView recyclerView = this.f2542a;
        C0653fo foVar = recyclerView.mLayout;
        if (foVar == null || recyclerView.mAdapter == null) {
            return false;
        }
        int i3 = recyclerView.mMinFlingVelocity;
        if ((Math.abs(i2) <= i3 && Math.abs(i) <= i3) || !(foVar instanceof C0668gc) || (d = mo2853d(foVar)) == null || (a = mo2802a(foVar, i, i2)) == -1) {
            return false;
        }
        d.f2449g = a;
        foVar.startSmoothScroll(d);
        return true;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: f */
    public C0602dr mo3196f(C0653fo foVar) {
        if (!(foVar instanceof C0668gc)) {
            return null;
        }
        return new C0709hq(this, this.f2542a.getContext());
    }

    /* renamed from: g */
    public void mo3197g(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2542a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(this.f2544c);
                this.f2542a.mOnFlingListener = null;
            }
            this.f2542a = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.mOnFlingListener == null) {
                recyclerView.addOnScrollListener(this.f2544c);
                RecyclerView recyclerView3 = this.f2542a;
                recyclerView3.mOnFlingListener = this;
                this.f2543b = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
                mo3198h();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo3198h() {
        C0653fo foVar;
        View b;
        RecyclerView recyclerView = this.f2542a;
        if (recyclerView != null && (foVar = recyclerView.mLayout) != null && (b = mo2803b(foVar)) != null) {
            int[] c = mo2804c(foVar, b);
            int i = c[0];
            if (i == 0) {
                if (c[1] != 0) {
                    i = 0;
                } else {
                    return;
                }
            }
            this.f2542a.smoothScrollBy$ar$ds$a5e2b4f9_0(i, c[1], (Interpolator) null, false);
        }
    }

    /* renamed from: i */
    public final int[] mo3199i(int i, int i2) {
        this.f2543b.fling(0, 0, i, i2, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE);
        return new int[]{this.f2543b.getFinalX(), this.f2543b.getFinalY()};
    }
}
