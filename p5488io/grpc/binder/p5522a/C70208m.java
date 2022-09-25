package p5488io.grpc.binder.p5522a;

import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70703eh;
import p5488io.grpc.C70704ei;
import p5488io.grpc.C70705ej;
import p5488io.grpc.C70706ek;
import p5488io.grpc.Status;
import p5488io.grpc.binder.C70235o;
import p5488io.grpc.binder.C70237q;

/* renamed from: io.grpc.binder.a.m */
/* compiled from: PG */
public final class C70208m implements C70706ek {
    /* renamed from: a */
    public final C70703eh mo20008a(C70704ei eiVar, C70334de deVar, C70705ej ejVar) {
        Status status;
        C70256c f = eiVar.mo62061f();
        C70209n nVar = (C70209n) f.f187256b.get(C70210o.f187136a);
        C70338di c = eiVar.mo61741c();
        String str = c.f187498c;
        boolean z = c.f187502g;
        if (!z || (status = (Status) nVar.f187135c.get(str)) == null) {
            C70237q qVar = nVar.f187134b;
            status = ((C70235o) qVar.f187220b.getOrDefault(str, qVar.f187219a)).mo57957a(nVar.f187133a);
            if (z) {
                nVar.f187135c.putIfAbsent(str, status);
            }
        }
        if (status.mo61679g()) {
            return ejVar.mo39514a(eiVar, deVar);
        }
        eiVar.mo39476a(status, new C70334de());
        return new C70207l();
    }
}
