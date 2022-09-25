package com.google.android.libraries.search.p2871b.p2902o;

import com.google.android.libraries.search.p2871b.p2890e.C37234c;
import com.google.common.p4522b.C58528ij;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71189f;

/* renamed from: com.google.android.libraries.search.b.o.e */
/* compiled from: PG */
final class C37312e extends C37309b {

    /* renamed from: a */
    private final C71189f f99140a;

    /* renamed from: b */
    private final C58528ij f99141b;

    /* renamed from: c */
    private final C37234c f99142c;

    /* renamed from: d */
    private final boolean f99143d;

    public C37312e(C71189f fVar, C58528ij ijVar, C37234c cVar, boolean z) {
        this.f99140a = fVar;
        this.f99141b = ijVar;
        this.f99142c = cVar;
        this.f99143d = z;
    }

    /* renamed from: a */
    public final C37234c mo40860a() {
        return this.f99142c;
    }

    /* renamed from: c */
    public final C58528ij mo40861c() {
        return this.f99141b;
    }

    /* renamed from: d */
    public final C71189f mo40862d() {
        return this.f99140a;
    }

    /* renamed from: e */
    public final boolean mo40863e() {
        return this.f99143d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37309b) {
            C37309b bVar = (C37309b) obj;
            return this.f99140a.equals(bVar.mo40862d()) && this.f99141b.equals(bVar.mo40861c()) && this.f99142c.equals(bVar.mo40860a()) && this.f99143d == bVar.mo40863e();
        }
    }

    public final int hashCode() {
        return ((((((this.f99140a.hashCode() ^ 1000003) * 1000003) ^ this.f99141b.hashCode()) * 1000003) ^ this.f99142c.hashCode()) * 1000003) ^ (true != this.f99143d ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f99140a.toString();
        String obj2 = this.f99141b.toString();
        String obj3 = this.f99142c.toString();
        boolean z = this.f99143d;
        return "AppFlowLoggingData{appFlow=" + obj + ", testCodes=" + obj2 + ", appFlowType=" + obj3 + ", sampledOut=" + z + "}";
    }
}
