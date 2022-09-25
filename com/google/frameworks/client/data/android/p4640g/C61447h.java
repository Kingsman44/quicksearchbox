package com.google.frameworks.client.data.android.p4640g;

import com.google.frameworks.client.data.android.p4632a.C61342c;
import p5488io.grpc.C70162az;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.g.h */
/* compiled from: PG */
final class C61447h extends C70162az {

    /* renamed from: a */
    final /* synthetic */ C61448i f166129a;

    /* renamed from: c */
    private C70334de f166130c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61447h(C61448i iVar, C70897l lVar) {
        super(lVar);
        this.f166129a = iVar;
    }

    /* renamed from: b */
    public final void mo27484b(Status status, C70334de deVar) {
        Status.Code code = status.getCode();
        if (code.equals(Status.Code.UNAUTHENTICATED) || code.equals(Status.Code.PERMISSION_DENIED)) {
            C61448i iVar = this.f166129a;
            synchronized (iVar.f166131a) {
                iVar.f166133c = iVar.f166134d.mo39510a(iVar.f166135e, iVar.f166136f.mo62569e(C61342c.f165891a, true));
                for (Runnable run : iVar.f166132b) {
                    run.run();
                }
            }
            return;
        }
        C70334de deVar2 = this.f166130c;
        if (deVar2 != null) {
            this.f187015b.mo27485c(deVar2);
            this.f166130c = null;
        }
        this.f187015b.mo27484b(status, deVar);
    }

    /* renamed from: c */
    public final void mo27485c(C70334de deVar) {
        this.f166130c = deVar;
    }

    /* renamed from: i */
    public final void mo27487i(Object obj) {
        C70334de deVar = this.f166130c;
        if (deVar != null) {
            this.f187015b.mo27485c(deVar);
            this.f166130c = null;
        }
        this.f187015b.mo27487i(obj);
    }
}
