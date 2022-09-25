package androidx.mediarouter.app;

/* renamed from: androidx.mediarouter.app.n */
/* compiled from: PG */
final class C3777n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3758ad f12195a;

    public C3777n(C3758ad adVar) {
        this.f12195a = adVar;
    }

    public final void run() {
        C3758ad adVar = this.f12195a;
        adVar.mo7962j(true);
        adVar.f12135p.requestLayout();
        adVar.f12135p.getViewTreeObserver().addOnGlobalLayoutListener(new C3775l(adVar));
    }
}
