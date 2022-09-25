package com.google.frameworks.client.data.android.server;

import java.util.HashMap;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70716eu;

/* renamed from: com.google.frameworks.client.data.android.server.ae */
/* compiled from: PG */
public final class C61550ae implements C70298d {

    /* renamed from: a */
    public final C70716eu f166357a;

    /* renamed from: b */
    public final ConcurrentHashMap f166358b = new ConcurrentHashMap();

    /* renamed from: c */
    final /* synthetic */ C61551af f166359c;

    public C61550ae(C61551af afVar, C70716eu euVar) {
        this.f166359c = afVar;
        this.f166357a = euVar;
    }

    /* renamed from: gs */
    public final C70711ep mo17222gs() {
        String str = this.f166357a.f188456a;
        HashMap hashMap = new HashMap();
        for (C70338di diVar : this.f166357a.f188457b) {
            C70710eo.m103394b(diVar, new C61549ad(this, diVar), str, (C70716eu) null, hashMap);
        }
        return C70710eo.m103393a(str, (C70716eu) null, hashMap);
    }
}
