package com.google.android.libraries.search.p3055n;

import p5488io.grpc.p5533i.C70853aa;
import p5488io.grpc.p5533i.C70857ae;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70884w;
import p5488io.grpc.p5533i.C70885x;

/* renamed from: com.google.android.libraries.search.n.cc */
/* compiled from: PG */
final class C39649cc implements C70857ae, C70853aa, C70885x, C70884w {

    /* renamed from: a */
    private final C39650cd f104371a;

    /* renamed from: b */
    private final int f104372b;

    public C39649cc(C39650cd cdVar, int i) {
        this.f104371a = cdVar;
        this.f104372b = i;
    }

    /* renamed from: a */
    public final C70862aj mo20118a(C70862aj ajVar) {
        if (this.f104372b == 2) {
            return this.f104371a.mo41769b(ajVar);
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public final void mo20119b(Object obj, C70862aj ajVar) {
        int i = this.f104372b;
        if (i == 0) {
            this.f104371a.mo41770c((C39670cx) obj, ajVar);
        } else if (i == 1) {
            this.f104371a.mo41771d((C39670cx) obj, ajVar);
        } else {
            throw new AssertionError();
        }
    }
}
