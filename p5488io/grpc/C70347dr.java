package p5488io.grpc;

import java.net.URI;

/* renamed from: io.grpc.dr */
/* compiled from: PG */
final class C70347dr extends C70341dl {

    /* renamed from: a */
    final /* synthetic */ C70349dt f187515a;

    public C70347dr(C70349dt dtVar) {
        this.f187515a = dtVar;
    }

    /* renamed from: c */
    public final C70345dp mo57975c(URI uri, C70339dj djVar) {
        C70346dq dqVar = (C70346dq) this.f187515a.mo62056b().get(uri.getScheme());
        if (dqVar == null) {
            return null;
        }
        return dqVar.mo57975c(uri, djVar);
    }

    /* renamed from: d */
    public final String mo57976d() {
        String str;
        synchronized (this.f187515a) {
            str = this.f187515a.f187519b;
        }
        return str;
    }
}
