package com.google.android.libraries.storage.protostore;

import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.storage.protostore.ay */
/* compiled from: PG */
public final class C42899ay extends C43002ei {

    /* renamed from: a */
    private final C43002ei f112233a;

    public C42899ay(C43002ei eiVar) {
        this.f112233a = eiVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C43001eh mo45981a(C42878ad adVar, String str, Executor executor, C42813k kVar) {
        C62921ba baVar;
        C58838bb.m90868c(adVar.mo45974d() instanceof C43009l);
        if (adVar.mo45978h()) {
            baVar = C62921ba.m95368a();
        } else {
            baVar = C62921ba.f169869a;
        }
        C62921ba baVar2 = baVar;
        C43009l lVar = (C43009l) adVar.mo45974d();
        C42877ac c = adVar.mo45973c();
        c.mo45970g(lVar.mo45955c());
        C42897aw awVar = new C42897aw(this.f112233a.mo45981a(c.mo45964a(), str, executor, kVar), lVar.mo45960g(), lVar.mo45954b(), lVar.mo45959f(), lVar.mo45953a(), lVar.mo45961h(), baVar2);
        awVar.mo45980a(lVar.mo45956d(), lVar.mo45957e());
        return new C42905ba(awVar);
    }

    /* renamed from: b */
    public final String mo45982b() {
        return "lams";
    }

    /* renamed from: c */
    public final void mo45983c(C42878ad adVar, C42876ab abVar) {
        C58838bb.m90868c(adVar.mo45974d() instanceof C43009l);
        ((C43009l) adVar.mo45974d()).f112470a = new C42898ax(abVar);
    }
}
