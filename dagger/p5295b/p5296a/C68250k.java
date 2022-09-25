package dagger.p5295b.p5296a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: dagger.b.a.k */
/* compiled from: PG */
final class C68250k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C60870cx f184614a;

    /* renamed from: b */
    final /* synthetic */ C68253n f184615b;

    public C68250k(C68253n nVar, C60870cx cxVar) {
        this.f184615b = nVar;
        this.f184614a = cxVar;
    }

    public final void run() {
        synchronized (this.f184615b.f184622b) {
            this.f184615b.f184622b.remove(this.f184614a);
        }
    }
}
