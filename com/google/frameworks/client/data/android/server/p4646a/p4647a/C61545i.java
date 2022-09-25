package com.google.frameworks.client.data.android.server.p4646a.p4647a;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70145ai;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70150an;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70703eh;
import p5488io.grpc.C70704ei;
import p5488io.grpc.C70705ej;
import p5488io.grpc.C70706ek;

/* renamed from: com.google.frameworks.client.data.android.server.a.a.i */
/* compiled from: PG */
public final class C61545i implements C70706ek {

    /* renamed from: a */
    public final C61541e[] f166342a;

    public C61545i(C61541e... eVarArr) {
        this.f166342a = eVarArr;
    }

    /* renamed from: a */
    public final C70703eh mo20008a(C70704ei eiVar, C70334de deVar, C70705ej ejVar) {
        C69664n.m101061g(ejVar, "next");
        C70148al m = C70148al.m102135m();
        C69664n.m101060f(m, "current()");
        for (C61541e eVar : this.f166342a) {
            m = m.mo61717o(eVar.f166337c, new AtomicReference()).mo61717o(eVar.f166338d, new AtomicReference());
            if (deVar.mo62035j(eVar.f166335a)) {
                m = m.mo61717o(eVar.f166336b, deVar.mo62027b(eVar.f166335a));
            }
        }
        return C70150an.m102152a(m, new C61544h(eiVar, this, m), deVar, ejVar);
    }

    /* renamed from: b */
    public final void mo58114b(C70334de deVar, C70148al alVar, boolean z) {
        C70145ai aiVar;
        for (C61541e eVar : this.f166342a) {
            if (z) {
                aiVar = eVar.f166337c;
            } else {
                aiVar = eVar.f166338d;
            }
            Parcelable parcelable = (Parcelable) ((AtomicReference) aiVar.mo61711a(alVar)).getAndSet((Object) null);
            if (parcelable != null) {
                deVar.mo62033h(eVar.f166335a, parcelable);
            }
        }
    }
}
