package android.support.p033v7.widget;

/* renamed from: android.support.v7.widget.ev */
/* compiled from: PG */
final class C0633ev implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f2399a;

    public C0633ev(RecyclerView recyclerView) {
        this.f2399a = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.f2399a;
        if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
            RecyclerView recyclerView2 = this.f2399a;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }
}
