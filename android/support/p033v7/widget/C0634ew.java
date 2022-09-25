package android.support.p033v7.widget;

/* renamed from: android.support.v7.widget.ew */
/* compiled from: PG */
final class C0634ew implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f2400a;

    public C0634ew(RecyclerView recyclerView) {
        this.f2400a = recyclerView;
    }

    public final void run() {
        C0646fh fhVar = this.f2400a.mItemAnimator;
        if (fhVar != null) {
            fhVar.mo2689e();
        }
        this.f2400a.mPostedAnimatorRunner = false;
    }
}
