package androidx.media;

import android.os.IBinder;

/* renamed from: androidx.media.ah */
/* compiled from: PG */
final class C2410ah implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2413ak f6670a;

    /* renamed from: b */
    final /* synthetic */ C2414al f6671b;

    public C2410ah(C2413ak akVar, C2414al alVar) {
        this.f6670a = akVar;
        this.f6671b = alVar;
    }

    public final void run() {
        IBinder binder = this.f6671b.f6682a.getBinder();
        C2436m mVar = (C2436m) this.f6670a.f6681a.f6687c.remove(binder);
        if (mVar != null) {
            binder.unlinkToDeath(mVar, 0);
        }
    }
}
