package com.google.frameworks.client.data.android.server.p4646a.p4647a;

import java.util.concurrent.atomic.AtomicReference;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70168bc;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70704ei;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.server.a.a.h */
/* compiled from: PG */
public final class C61544h extends C70168bc {

    /* renamed from: a */
    final /* synthetic */ C61545i f166340a;

    /* renamed from: b */
    final /* synthetic */ C70148al f166341b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61544h(C70704ei eiVar, C61545i iVar, C70148al alVar) {
        super(eiVar);
        this.f166340a = iVar;
        this.f166341b = alVar;
    }

    /* renamed from: a */
    public final void mo39476a(Status status, C70334de deVar) {
        C69664n.m101061g(status, "status");
        C69664n.m101061g(deVar, "responseTrailers");
        C61545i iVar = this.f166340a;
        C70148al alVar = this.f166341b;
        C61541e[] eVarArr = iVar.f166342a;
        int length = eVarArr.length;
        int i = 0;
        while (i < length) {
            if (((AtomicReference) eVarArr[i].f166337c.mo61711a(alVar)).get() == null) {
                i++;
            } else {
                throw new IllegalStateException("Response headers can be populated only before the first response message.");
            }
        }
        this.f166340a.mo58114b(deVar, this.f166341b, false);
        this.f187017c.mo39476a(status, deVar);
    }

    /* renamed from: b */
    public final void mo58113b(C70334de deVar) {
        C69664n.m101061g(deVar, "responseHeaders");
        this.f166340a.mo58114b(deVar, this.f166341b, true);
        this.f187017c.mo58113b(deVar);
    }
}
