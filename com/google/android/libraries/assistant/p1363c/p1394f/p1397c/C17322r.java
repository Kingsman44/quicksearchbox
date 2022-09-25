package com.google.android.libraries.assistant.p1363c.p1394f.p1397c;

import p5488io.grpc.p5533i.C70853aa;
import p5488io.grpc.p5533i.C70857ae;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70884w;
import p5488io.grpc.p5533i.C70885x;

/* renamed from: com.google.android.libraries.assistant.c.f.c.r */
/* compiled from: PG */
final class C17322r implements C70857ae, C70853aa, C70885x, C70884w {

    /* renamed from: a */
    private final C17324t f50155a;

    /* renamed from: b */
    private final int f50156b;

    public C17322r(C17324t tVar, int i) {
        this.f50155a = tVar;
        this.f50156b = i;
    }

    /* renamed from: a */
    public final C70862aj mo20118a(C70862aj ajVar) {
        if (this.f50156b == 3) {
            return this.f50155a.mo23271b(ajVar);
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public final void mo20119b(Object obj, C70862aj ajVar) {
        int i = this.f50156b;
        if (i == 0) {
            this.f50155a.mo23273d((C17303ab) obj, ajVar);
        } else if (i == 1) {
            this.f50155a.mo23272c((C17306b) obj, ajVar);
        } else if (i == 2) {
            this.f50155a.mo23274e((C17328x) obj, ajVar);
        } else {
            throw new AssertionError();
        }
    }
}
