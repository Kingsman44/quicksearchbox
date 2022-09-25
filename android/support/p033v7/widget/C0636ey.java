package android.support.p033v7.widget;

/* renamed from: android.support.v7.widget.ey */
/* compiled from: PG */
final class C0636ey {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f2401a;

    public C0636ey(RecyclerView recyclerView) {
        this.f2401a = recyclerView;
    }

    /* renamed from: a */
    public final void mo2860a(C0673gh ghVar, C0645fg fgVar, C0645fg fgVar2) {
        this.f2401a.mRecycler.mo3037n(ghVar);
        RecyclerView recyclerView = this.f2401a;
        recyclerView.addAnimatingView(ghVar);
        ghVar.setIsRecyclable(false);
        if (recyclerView.mItemAnimator.mo2893q(ghVar, fgVar, fgVar2)) {
            recyclerView.postAnimationRunner();
        }
    }

    /* renamed from: b */
    public final void mo2861b(C0673gh ghVar) {
        RecyclerView recyclerView = this.f2401a;
        recyclerView.mLayout.removeAndRecycleView(ghVar.itemView, recyclerView.mRecycler);
    }
}
