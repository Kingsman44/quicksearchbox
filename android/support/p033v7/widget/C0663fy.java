package android.support.p033v7.widget;

import androidx.core.p098j.C2043bi;

/* renamed from: android.support.v7.widget.fy */
/* compiled from: PG */
final class C0663fy extends C0642fd {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f2439a;

    public C0663fy(RecyclerView recyclerView) {
        this.f2439a = recyclerView;
    }

    /* renamed from: a */
    public final void mo2831a() {
        this.f2439a.assertNotInLayoutOrScroll((String) null);
        RecyclerView recyclerView = this.f2439a;
        recyclerView.mState.f2461f = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (!this.f2439a.mAdapterHelper.mo3294k()) {
            this.f2439a.requestLayout();
        }
    }

    /* renamed from: c */
    public final void mo2833c(int i, int i2, Object obj) {
        this.f2439a.assertNotInLayoutOrScroll((String) null);
        C0777w wVar = this.f2439a.mAdapterHelper;
        if (i2 > 0) {
            wVar.f2672a.add(wVar.mo3285b(4, i, i2, obj));
            wVar.f2675d |= 4;
            if (wVar.f2672a.size() == 1) {
                mo3042h();
            }
        }
    }

    /* renamed from: d */
    public final void mo2834d(int i, int i2) {
        this.f2439a.assertNotInLayoutOrScroll((String) null);
        C0777w wVar = this.f2439a.mAdapterHelper;
        if (i2 > 0) {
            wVar.f2672a.add(wVar.mo3285b(1, i, i2, (Object) null));
            wVar.f2675d |= 1;
            if (wVar.f2672a.size() == 1) {
                mo3042h();
            }
        }
    }

    /* renamed from: e */
    public final void mo2835e(int i, int i2) {
        this.f2439a.assertNotInLayoutOrScroll((String) null);
        C0777w wVar = this.f2439a.mAdapterHelper;
        if (i2 > 0) {
            wVar.f2672a.add(wVar.mo3285b(2, i, i2, (Object) null));
            wVar.f2675d |= 2;
            if (wVar.f2672a.size() == 1) {
                mo3042h();
            }
        }
    }

    /* renamed from: f */
    public final void mo2836f() {
        C0640fb fbVar;
        RecyclerView recyclerView = this.f2439a;
        if (recyclerView.mPendingSavedState != null && (fbVar = recyclerView.mAdapter) != null && fbVar.canRestoreState()) {
            this.f2439a.requestLayout();
        }
    }

    /* renamed from: g */
    public final void mo2837g(int i, int i2) {
        this.f2439a.assertNotInLayoutOrScroll((String) null);
        C0777w wVar = this.f2439a.mAdapterHelper;
        if (i != i2) {
            wVar.f2672a.add(wVar.mo3285b(8, i, i2, (Object) null));
            wVar.f2675d |= 8;
            if (wVar.f2672a.size() == 1) {
                mo3042h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo3042h() {
        if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
            RecyclerView recyclerView = this.f2439a;
            if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                C2043bi.m5520N(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                return;
            }
        }
        RecyclerView recyclerView2 = this.f2439a;
        recyclerView2.mAdapterUpdateDuringMeasure = true;
        recyclerView2.requestLayout();
    }
}
