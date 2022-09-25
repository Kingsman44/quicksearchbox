package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import p5488io.grpc.p5533i.C70853aa;
import p5488io.grpc.p5533i.C70857ae;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70884w;
import p5488io.grpc.p5533i.C70885x;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.f */
/* compiled from: PG */
final class C11709f implements C70857ae, C70853aa, C70885x, C70884w {

    /* renamed from: a */
    private final C11708e f37732a;

    /* renamed from: b */
    private final int f37733b;

    public C11709f(C11708e eVar, int i) {
        this.f37732a = eVar;
        this.f37733b = i;
    }

    /* renamed from: a */
    public final C70862aj mo20118a(C70862aj ajVar) {
        int i = this.f37733b;
        if (i == 7) {
            return this.f37732a.mo20109c(ajVar);
        }
        if (i == 8) {
            return this.f37732a.mo20110d(ajVar);
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public final void mo20119b(Object obj, C70862aj ajVar) {
        switch (this.f37733b) {
            case 0:
                this.f37732a.mo20113h((C11694ay) obj, ajVar);
                return;
            case 1:
                this.f37732a.mo20116k((C11697ba) obj, ajVar);
                return;
            case 2:
                C11703bg bgVar = (C11703bg) obj;
                this.f37732a.mo20117n(ajVar);
                return;
            case 3:
                this.f37732a.mo20114i((C11696b) obj, ajVar);
                return;
            case 4:
                this.f37732a.mo20115j((C11725v) obj, ajVar);
                return;
            case 5:
                this.f37732a.mo20112g((C11675af) obj, ajVar);
                return;
            case 6:
                this.f37732a.mo20111f((C11721r) obj, ajVar);
                return;
            default:
                throw new AssertionError();
        }
    }
}
