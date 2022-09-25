package com.google.frameworks.client.data.android.server;

import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.net.URI;
import p5488io.grpc.C70339dj;
import p5488io.grpc.C70345dp;
import p5488io.grpc.C70346dq;

/* renamed from: com.google.frameworks.client.data.android.server.k */
/* compiled from: PG */
public final class C61563k extends C70346dq {

    /* renamed from: a */
    public final C58881cr f166394a;

    public C61563k(C58881cr crVar) {
        this.f166394a = C58886cw.m90973a(crVar);
    }

    /* renamed from: a */
    public final int mo57973a() {
        return 5;
    }

    /* renamed from: c */
    public final C70345dp mo57975c(URI uri, C70339dj djVar) {
        if (uri.getScheme().equals("lazyserver")) {
            return new C61562j(this);
        }
        return null;
    }

    /* renamed from: d */
    public final String mo57976d() {
        return "lazyserver";
    }

    /* renamed from: e */
    public final boolean mo57977e() {
        return true;
    }
}
