package com.google.protobuf;

/* renamed from: com.google.protobuf.ao */
/* compiled from: PG */
final class C62907ao {

    /* renamed from: a */
    public final C62906an f169854a;

    public C62907ao(C62906an anVar) {
        C62972cr.m95549i(anVar, "output");
        this.f169854a = anVar;
        anVar.f169853f = this;
    }

    /* renamed from: a */
    public final void mo58790a(int i, Object obj, C63022en enVar) {
        C62906an anVar = this.f169854a;
        anVar.mo58778u(i, 3);
        enVar.mo59002m((MessageLite) obj, anVar.f169853f);
        anVar.mo58778u(i, 4);
    }

    /* renamed from: b */
    public final void mo58791b(int i, Object obj, C63022en enVar) {
        this.f169854a.mo58772o(i, (MessageLite) obj, enVar);
    }

    /* renamed from: c */
    public final void mo58792c(int i, Object obj) {
        if (obj instanceof C63088z) {
            this.f169854a.mo58775r(i, (C63088z) obj);
        } else {
            this.f169854a.mo58774q(i, (MessageLite) obj);
        }
    }
}
