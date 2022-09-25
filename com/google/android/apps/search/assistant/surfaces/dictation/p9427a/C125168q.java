package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.android.apps.gsa.nga.api.a.af;
import com.google.protobuf.C62912at;
import p5488io.grpc.p5533i.C70853aa;
import p5488io.grpc.p5533i.C70857ae;
import p5488io.grpc.p5533i.C70861ai;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70884w;
import p5488io.grpc.p5533i.C70885x;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.q */
/* compiled from: PG */
final class C125168q implements C70857ae, C70853aa, C70885x, C70884w {

    /* renamed from: a */
    private final C125167p f345304a;

    /* renamed from: b */
    private final int f345305b;

    public C125168q(C125167p pVar, int i) {
        this.f345304a = pVar;
        this.f345305b = i;
    }

    /* renamed from: a */
    public final C70862aj mo20118a(C70862aj ajVar) {
        if (this.f345305b == 6) {
            return this.f345304a.mo106814b(ajVar);
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public final void mo20119b(Object obj, C70862aj ajVar) {
        int i = this.f345305b;
        if (i == 0) {
            this.f345304a.mo106817e((C125149dw) obj, ajVar);
        } else if (i == 1) {
            C125124cy cyVar = (C125124cy) obj;
            C70861ai.m103726e(C125169r.m205029d(), ajVar);
        } else if (i == 2) {
            C62912at atVar = (C62912at) obj;
            this.f345304a.mo106818f(ajVar);
        } else if (i == 3) {
            C62912at atVar2 = (C62912at) obj;
            this.f345304a.mo106819g(ajVar);
        } else if (i == 4) {
            this.f345304a.mo106815c((af) obj, ajVar);
        } else if (i == 5) {
            this.f345304a.mo106816d((C125114co) obj, ajVar);
        } else {
            throw new AssertionError();
        }
    }
}
