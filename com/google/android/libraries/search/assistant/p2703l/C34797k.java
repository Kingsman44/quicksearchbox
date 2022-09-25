package com.google.android.libraries.search.assistant.p2703l;

import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58495hd;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70703eh;
import p5488io.grpc.C70704ei;
import p5488io.grpc.C70705ej;
import p5488io.grpc.C70709en;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.search.assistant.l.k */
/* compiled from: PG */
final class C34797k implements C70705ej {

    /* renamed from: a */
    private static final Status f92327a = Status.f186914l.withDescription("Method not found");

    /* renamed from: b */
    private final C58881cr f92328b;

    public C34797k(C70298d dVar) {
        this.f92328b = C58886cw.m90973a(new C34795i(dVar));
    }

    /* renamed from: a */
    public final C70703eh mo39514a(C70704ei eiVar, C70334de deVar) {
        C70709en enVar = (C70709en) ((C58495hd) this.f92328b.mo6453a()).get(eiVar.mo61741c());
        if (enVar != null) {
            return enVar.f188451b.mo39514a(eiVar, deVar);
        }
        eiVar.mo39476a(f92327a, new C70334de());
        return new C34796j();
    }
}
