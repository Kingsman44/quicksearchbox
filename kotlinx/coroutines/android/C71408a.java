package kotlinx.coroutines.android;

import kotlinx.coroutines.C71615bp;

/* renamed from: kotlinx.coroutines.android.a */
/* compiled from: PG */
final class C71408a implements C71615bp {

    /* renamed from: a */
    final /* synthetic */ C71411d f190613a;

    /* renamed from: b */
    final /* synthetic */ Runnable f190614b;

    public C71408a(C71411d dVar, Runnable runnable) {
        this.f190613a = dVar;
        this.f190614b = runnable;
    }

    /* renamed from: lT */
    public final void mo62732lT() {
        this.f190613a.f190619c.removeCallbacks(this.f190614b);
    }
}
