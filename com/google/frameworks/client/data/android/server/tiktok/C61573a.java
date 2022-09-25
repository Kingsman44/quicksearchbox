package com.google.frameworks.client.data.android.server.tiktok;

import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.a */
/* compiled from: PG */
public final class C61573a extends C61591f {

    /* renamed from: a */
    public final C70334de f166417a;

    /* renamed from: b */
    private final C70256c f166418b;

    public C61573a(C70334de deVar, C70256c cVar) {
        this.f166417a = deVar;
        if (cVar != null) {
            this.f166418b = cVar;
            return;
        }
        throw new NullPointerException("Null attributes");
    }

    /* renamed from: a */
    public final C70256c mo58128a() {
        return this.f166418b;
    }

    /* renamed from: b */
    public final C70334de mo58129b() {
        return this.f166417a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61591f) {
            C61591f fVar = (C61591f) obj;
            return this.f166417a.equals(fVar.mo58129b()) && this.f166418b.equals(fVar.mo58128a());
        }
    }

    public final int hashCode() {
        return ((this.f166417a.hashCode() ^ 1000003) * 1000003) ^ this.f166418b.hashCode();
    }

    public final String toString() {
        String obj = this.f166417a.toString();
        String identityHashMap = this.f166418b.f187256b.toString();
        return "GrpcSelectorContext{metadata=" + obj + ", attributes=" + identityHashMap + "}";
    }
}
