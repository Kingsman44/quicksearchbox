package com.google.frameworks.client.data.android.p4634b;

import java.net.URI;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5488io.grpc.C70339dj;
import p5488io.grpc.C70345dp;
import p5488io.grpc.C70346dq;

/* renamed from: com.google.frameworks.client.data.android.b.l */
/* compiled from: PG */
public final class C61393l extends C70346dq {

    /* renamed from: a */
    public final String f166007a = "ondevice";

    /* renamed from: b */
    private final ConcurrentHashMap f166008b = new ConcurrentHashMap();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo57973a() {
        return 5;
    }

    /* renamed from: b */
    public final C61390i mo57974b(URI uri) {
        if (((C61390i) this.f166008b.get(uri)) == null) {
            this.f166008b.putIfAbsent(uri, new C61390i());
        }
        C61390i iVar = (C61390i) this.f166008b.get(uri);
        iVar.getClass();
        return iVar;
    }

    /* renamed from: c */
    public final C70345dp mo57975c(URI uri, C70339dj djVar) {
        if (this.f166007a.equals(uri.getScheme())) {
            return new C61392k(mo57974b(uri), djVar.f187505c);
        }
        return null;
    }

    /* renamed from: d */
    public final String mo57976d() {
        return this.f166007a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo57977e() {
        return true;
    }
}
