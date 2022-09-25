package com.google.android.apps.search.soundsearch.p10660g;

import com.google.android.apps.search.soundsearch.p10654c.C141646a;
import com.google.android.apps.search.soundsearch.p10654c.C141647b;
import com.google.android.apps.search.soundsearch.p10654c.C141648c;
import com.google.android.apps.search.soundsearch.p10654c.C141649d;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.soundsearch.g.h */
/* compiled from: PG */
public final /* synthetic */ class C141699h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C141700i f384572a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f384573b;

    public /* synthetic */ C141699h(C141700i iVar, Throwable th) {
        this.f384572a = iVar;
        this.f384573b = th;
    }

    public final void run() {
        C141648c cVar;
        C141700i iVar = this.f384572a;
        Throwable th = this.f384573b;
        C141703l lVar = iVar.f384574a.f384580d;
        if ((th instanceof C141649d) || (th instanceof C141646a)) {
            cVar = (C141648c) th;
        } else if (!(th instanceof C70761fa) || ((C70761fa) th).f188571a.getCode() != Status.Code.CANCELLED) {
            cVar = new C141647b(th.getMessage());
        } else {
            cVar = new C141646a();
        }
        lVar.mo116647a(cVar);
    }
}
