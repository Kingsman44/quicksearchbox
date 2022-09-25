package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cd */
/* compiled from: PG */
public final class C82356cd extends C82585kq {

    /* renamed from: a */
    private final String f224985a = "NGA_FULFILLMENT_GRPC_STATUS";

    /* renamed from: b */
    private final String f224986b;

    /* renamed from: c */
    private final String f224987c;

    public C82356cd(String str, String str2, String str3) {
        this.f224986b = str2;
        this.f224987c = str3;
    }

    /* renamed from: b */
    public final String mo75845b() {
        return this.f224987c;
    }

    /* renamed from: c */
    public final String mo75846c() {
        return this.f224986b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224985a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82585kq) {
            C82585kq kqVar = (C82585kq) obj;
            return this.f224985a.equals(kqVar.mo75583d()) && this.f224986b.equals(kqVar.mo75846c()) && this.f224987c.equals(kqVar.mo75845b());
        }
    }

    public final int hashCode() {
        return ((((this.f224985a.hashCode() ^ 1000003) * 1000003) ^ this.f224986b.hashCode()) * 1000003) ^ this.f224987c.hashCode();
    }

    public final String toString() {
        String str = this.f224985a;
        String str2 = this.f224986b;
        String str3 = this.f224987c;
        return "NgaFulfillmentGrpcStatusEvent{token=" + str + ", status=" + str2 + ", source=" + str3 + "}";
    }
}
