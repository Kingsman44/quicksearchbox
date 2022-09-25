package com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f;

import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57817n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.f.l */
/* compiled from: PG */
public final class C40544l {

    /* renamed from: a */
    public final int f106413a;

    /* renamed from: b */
    public final C57784p f106414b;

    /* renamed from: c */
    public final C57817n f106415c;

    public C40544l() {
        this(0, (C57784p) null, 7);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C40544l(int r3, com.google.p4283bv.p4380j.p4385b.p4386a.C57784p r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 1
            r1 = 1
            if (r1 != r0) goto L_0x0006
            r3 = 0
        L_0x0006:
            r5 = r5 & 2
            java.lang.String r0 = "getDefaultInstance()"
            if (r5 == 0) goto L_0x0011
            com.google.bv.j.b.a.p r4 = com.google.p4283bv.p4380j.p4385b.p4386a.C57784p.f154382f
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r0)
        L_0x0011:
            com.google.bv.j.b.b.n r5 = com.google.p4283bv.p4380j.p4385b.p4411b.C57817n.f154476d
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            r2.<init>((int) r3, (com.google.p4283bv.p4380j.p4385b.p4386a.C57784p) r4, (com.google.p4283bv.p4380j.p4385b.p4411b.C57817n) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f.C40544l.<init>(int, com.google.bv.j.b.a.p, int):void");
    }

    public C40544l(int i, C57784p pVar, C57817n nVar) {
        C69664n.m101061g(pVar, "elementsOutput");
        C69664n.m101061g(nVar, "xBlendNewVeTreeLoggingMetadata");
        this.f106413a = i;
        this.f106414b = pVar;
        this.f106415c = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40544l)) {
            return false;
        }
        C40544l lVar = (C40544l) obj;
        return this.f106413a == lVar.f106413a && C69664n.m101066l(this.f106414b, lVar.f106414b) && C69664n.m101066l(this.f106415c, lVar.f106415c);
    }

    public final int hashCode() {
        return (((this.f106413a * 31) + this.f106414b.hashCode()) * 31) + this.f106415c.hashCode();
    }

    public final String toString() {
        int i = this.f106413a;
        C57784p pVar = this.f106414b;
        C57817n nVar = this.f106415c;
        return "XBlendFragmentRenderingInput(attributionId=" + i + ", elementsOutput=" + pVar + ", xBlendNewVeTreeLoggingMetadata=" + nVar + ")";
    }
}
