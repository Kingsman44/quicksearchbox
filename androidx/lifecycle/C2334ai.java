package androidx.lifecycle;

/* renamed from: androidx.lifecycle.ai */
/* compiled from: PG */
final class C2334ai implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2338am f6531a;

    public C2334ai(C2338am amVar) {
        this.f6531a = amVar;
    }

    public final void run() {
        C2338am amVar = this.f6531a;
        if (amVar.f6536c == 0) {
            amVar.f6537d = true;
            amVar.f6540g.mo5793e(C2382m.ON_PAUSE);
        }
        this.f6531a.mo5735a();
    }
}
