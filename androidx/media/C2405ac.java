package androidx.media;

/* renamed from: androidx.media.ac */
/* compiled from: PG */
final class C2405ac implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2413ak f6650a;

    /* renamed from: b */
    final /* synthetic */ C2414al f6651b;

    public C2405ac(C2413ak akVar, C2414al alVar) {
        this.f6650a = akVar;
        this.f6651b = alVar;
    }

    public final void run() {
        C2436m mVar = (C2436m) this.f6650a.f6681a.f6687c.remove(this.f6651b.f6682a.getBinder());
        if (mVar != null) {
            mVar.f6725g.f6682a.getBinder().unlinkToDeath(mVar, 0);
        }
    }
}
