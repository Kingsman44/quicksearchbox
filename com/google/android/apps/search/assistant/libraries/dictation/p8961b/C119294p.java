package com.google.android.apps.search.assistant.libraries.dictation.p8961b;

import p5488io.grpc.p5533i.C70853aa;
import p5488io.grpc.p5533i.C70857ae;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70884w;
import p5488io.grpc.p5533i.C70885x;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.b.p */
/* compiled from: PG */
final class C119294p implements C70857ae, C70853aa, C70885x, C70884w {

    /* renamed from: a */
    private final C119292n f332646a;

    /* renamed from: b */
    private final int f332647b;

    public C119294p(C119292n nVar, int i) {
        this.f332646a = nVar;
        this.f332647b = i;
    }

    /* renamed from: a */
    public final C70862aj mo20118a(C70862aj ajVar) {
        int i = this.f332647b;
        if (i == 5) {
            return this.f332646a.mo104271c(ajVar);
        }
        if (i == 6) {
            return this.f332646a.mo104270b(ajVar);
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public final void mo20119b(Object obj, C70862aj ajVar) {
        int i = this.f332647b;
        if (i == 0) {
            C119280b bVar = (C119280b) obj;
            this.f332646a.mo104275g(ajVar);
        } else if (i == 1) {
            this.f332646a.mo104273e((C119271ag) obj, ajVar);
        } else if (i == 2) {
            this.f332646a.mo104274f((C119277am) obj, ajVar);
        } else if (i == 3) {
            this.f332646a.mo104272d((C119303y) obj, ajVar);
        } else if (i == 4) {
            C119267ac acVar = (C119267ac) obj;
            this.f332646a.mo104276h(ajVar);
        } else {
            throw new AssertionError();
        }
    }
}
