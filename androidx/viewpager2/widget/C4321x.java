package androidx.viewpager2.widget;

import android.support.p033v7.widget.RecyclerView;

/* renamed from: androidx.viewpager2.widget.x */
/* compiled from: PG */
final class C4321x implements Runnable {

    /* renamed from: a */
    private final int f13945a;

    /* renamed from: b */
    private final RecyclerView f13946b;

    public C4321x(int i, RecyclerView recyclerView) {
        this.f13945a = i;
        this.f13946b = recyclerView;
    }

    public final void run() {
        this.f13946b.smoothScrollToPosition(this.f13945a);
    }
}
