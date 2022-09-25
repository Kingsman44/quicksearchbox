package com.google.common.p4535g;

import com.google.common.p4522b.C58701ou;

/* renamed from: com.google.common.g.w */
/* compiled from: PG */
public final class C59229w implements C59108aa {

    /* renamed from: a */
    private final C59136bb f157337a;

    /* renamed from: b */
    private final C59136bb f157338b;

    public C59229w(C59136bb bbVar, C59136bb bbVar2) {
        this.f157337a = bbVar;
        this.f157338b = bbVar2;
    }

    /* renamed from: a */
    public final double mo56413a() {
        return this.f157337a.mo56496a(this.f157338b) * 0.5d;
    }

    /* renamed from: b */
    public final C59219m mo56414b(C59225s sVar) {
        C59136bb bbVar = this.f157337a;
        C59136bb bbVar2 = this.f157338b;
        if (bbVar.mo56506q(bbVar2)) {
            return sVar.mo56649a(bbVar);
        }
        C59219m mVar = (C59219m) C58701ou.f156429a.mo55815j(sVar.mo56649a(bbVar), sVar.mo56649a(bbVar2));
        if (mVar.f157305f == C59203do.f157270a) {
            return mVar;
        }
        C59136bb[] bbVarArr = new C59136bb[4];
        for (int i = 0; i < 4; i++) {
            bbVarArr[i] = C59136bb.m91671n(sVar.mo56650b(i));
        }
        C59119al alVar = new C59119al(bbVar, bbVar2, bbVarArr[3]);
        for (int i2 = 0; i2 < 4; i2++) {
            if (alVar.mo56434a(bbVarArr[i2]) >= 0) {
                return C59219m.f157300a;
            }
        }
        C59219m mVar2 = mVar;
        for (int i3 = 0; i3 < 4; i3++) {
            mVar2 = C59123ap.m91589i(bbVarArr[i3], bbVar, bbVar2, mVar2);
        }
        return mVar2;
    }

    /* renamed from: c */
    public final C59219m mo56415c(C59136bb bbVar, C59219m mVar) {
        return C59123ap.m91589i(bbVar, this.f157337a, this.f157338b, mVar);
    }

    /* renamed from: d */
    public final C59136bb mo56416d() {
        return C59136bb.m91671n(C59136bb.m91667j(this.f157337a, this.f157338b));
    }
}
