package dagger.p5295b.p5296a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: dagger.b.a.d */
/* compiled from: PG */
final class C68243d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C68249j f184604a;

    /* renamed from: b */
    final /* synthetic */ C68244e f184605b;

    public C68243d(C68244e eVar, C68249j jVar) {
        this.f184605b = eVar;
        this.f184604a = jVar;
    }

    public final void run() {
        if (this.f184605b.f184606a.isCancelled()) {
            C60870cx cxVar = this.f184605b.f184606a;
            boolean z = false;
            if ((cxVar instanceof C68242c) && ((C68242c) cxVar).mo60302e()) {
                z = true;
            }
            this.f184604a.mo29865a(z);
        }
    }
}
