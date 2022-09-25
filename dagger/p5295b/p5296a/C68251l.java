package dagger.p5295b.p5296a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: dagger.b.a.l */
/* compiled from: PG */
final class C68251l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C60870cx f184616a;

    /* renamed from: b */
    final /* synthetic */ C68252m f184617b;

    public C68251l(C68252m mVar, C60870cx cxVar) {
        this.f184617b = mVar;
        this.f184616a = cxVar;
    }

    public final void run() {
        this.f184617b.f184618a.remove(this.f184616a);
        if (this.f184616a.isCancelled()) {
            this.f184617b.f184619b.mo29865a(true);
        }
    }
}
