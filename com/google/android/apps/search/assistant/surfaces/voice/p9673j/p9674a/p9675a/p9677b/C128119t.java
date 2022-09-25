package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import p5488io.grpc.p5533i.C70853aa;
import p5488io.grpc.p5533i.C70857ae;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70884w;
import p5488io.grpc.p5533i.C70885x;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.t */
/* compiled from: PG */
final class C128119t implements C70857ae, C70853aa, C70885x, C70884w {

    /* renamed from: a */
    private final C128121v f352499a;

    /* renamed from: b */
    private final int f352500b;

    public C128119t(C128121v vVar, int i) {
        this.f352499a = vVar;
        this.f352500b = i;
    }

    /* renamed from: a */
    public final C70862aj mo20118a(C70862aj ajVar) {
        int i = this.f352500b;
        if (i == 3) {
            return this.f352499a.mo73101c(ajVar);
        }
        if (i == 4) {
            return this.f352499a.mo73100b(ajVar);
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public final void mo20119b(Object obj, C70862aj ajVar) {
        int i = this.f352500b;
        if (i == 0) {
            this.f352499a.mo73103e((C128071at) obj, ajVar);
        } else if (i == 1) {
            C128107h hVar = (C128107h) obj;
            this.f352499a.mo73104f(ajVar);
        } else if (i == 2) {
            this.f352499a.mo73102d((C128103d) obj, ajVar);
        } else {
            throw new AssertionError();
        }
    }
}
