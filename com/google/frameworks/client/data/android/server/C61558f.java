package com.google.frameworks.client.data.android.server;

import java.util.HashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70716eu;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5533i.C70866e;

/* renamed from: com.google.frameworks.client.data.android.server.f */
/* compiled from: PG */
public final class C61558f implements C70298d {

    /* renamed from: a */
    private final C70851i f166373a;

    /* renamed from: b */
    private final C70716eu f166374b;

    /* renamed from: c */
    private final C61536a f166375c;

    private C61558f(C61536a aVar, C70851i iVar, C70716eu euVar) {
        this.f166375c = aVar;
        this.f166373a = iVar;
        this.f166374b = euVar;
    }

    /* renamed from: b */
    public static C70298d m94316b(C70866e eVar, C70716eu euVar) {
        C70888j jVar = eVar.f189039a;
        return new C61558f(new C61536a(jVar), eVar.f189040b, euVar);
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        C70716eu euVar = this.f166374b;
        HashMap hashMap = new HashMap();
        String str = euVar.f188456a;
        for (C70338di b : this.f166374b.f188457b) {
            C70710eo.m103394b(b, new C61557e(this.f166375c, this.f166373a), str, euVar, hashMap);
        }
        return C70710eo.m103393a(str, euVar, hashMap);
    }
}
