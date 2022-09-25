package android.support.p033v7.widget;

/* renamed from: android.support.v7.widget.hp */
/* compiled from: PG */
final class C0708hp extends C0658ft {

    /* renamed from: a */
    boolean f2539a = false;

    /* renamed from: b */
    final /* synthetic */ C0710hr f2540b;

    public C0708hp(C0710hr hrVar) {
        this.f2540b = hrVar;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f2539a) {
            this.f2539a = false;
            this.f2540b.mo3198h();
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.f2539a = true;
        }
    }
}
