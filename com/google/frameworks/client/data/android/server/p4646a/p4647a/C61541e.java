package com.google.frameworks.client.data.android.server.p4646a.p4647a;

import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70145ai;
import p5488io.grpc.C70297cz;

/* renamed from: com.google.frameworks.client.data.android.server.a.a.e */
/* compiled from: PG */
public final class C61541e {

    /* renamed from: a */
    public final C70297cz f166335a;

    /* renamed from: b */
    public final C70145ai f166336b;

    /* renamed from: c */
    public final C70145ai f166337c;

    /* renamed from: d */
    public final C70145ai f166338d;

    public C61541e(C70297cz czVar, C70145ai aiVar, C70145ai aiVar2, C70145ai aiVar3) {
        this.f166335a = czVar;
        this.f166336b = aiVar;
        this.f166337c = aiVar2;
        this.f166338d = aiVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61541e)) {
            return false;
        }
        C61541e eVar = (C61541e) obj;
        return C69664n.m101066l(this.f166335a, eVar.f166335a) && C69664n.m101066l(this.f166336b, eVar.f166336b) && C69664n.m101066l(this.f166337c, eVar.f166337c) && C69664n.m101066l(this.f166338d, eVar.f166338d);
    }

    public final int hashCode() {
        return (((((this.f166335a.f187370a.hashCode() * 31) + this.f166336b.hashCode()) * 31) + this.f166337c.hashCode()) * 31) + this.f166338d.hashCode();
    }

    public final String toString() {
        C70297cz czVar = this.f166335a;
        C70145ai aiVar = this.f166336b;
        C70145ai aiVar2 = this.f166337c;
        C70145ai aiVar3 = this.f166338d;
        return "ParcelableOverMetadataKeys(metadataKey=" + czVar + ", requestKey=" + aiVar + ", responseHeaderKey=" + aiVar2 + ", responseTrailerKey=" + aiVar3 + ")";
    }
}
