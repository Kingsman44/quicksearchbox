package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.mdi.download.h.b.ak */
/* compiled from: PG */
public final /* synthetic */ class C29530ak implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29538as f80026a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f80027b;

    /* renamed from: c */
    public final /* synthetic */ String f80028c;

    public /* synthetic */ C29530ak(C29538as asVar, C65753ak akVar, String str) {
        this.f80026a = asVar;
        this.f80027b = akVar;
        this.f80028c = str;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C29538as asVar = this.f80026a;
        C65753ak akVar = this.f80027b;
        String str = this.f80028c;
        C58833ax axVar = (C58833ax) obj;
        if (((Boolean) asVar.f80058e.mo6453a()).booleanValue()) {
            C29045l.m53931c("%s: Public sync for Corpus: %s skipped because public syncs are disabled", "GddFileGroupPopulator", akVar.name());
            cxVar = C60866ct.f164955a;
        } else {
            C29045l.m53931c("%s: Performing public sync for corpus: %s", "GddFileGroupPopulator", akVar.name());
            cxVar = C29670b.m54719g((C60870cx) asVar.f80056c.mo6453a()).mo34822i(new C29578y(asVar, axVar, akVar), asVar.f80054a).mo34822i(new C29579z(asVar, C58872ci.m90947d(asVar.f80064k), akVar), asVar.f80054a).mo34822i(new C29520aa(asVar, akVar, str), asVar.f80054a);
        }
        return asVar.mo34764a(cxVar, C28737bo.GDD_FAIL_IN_SYNC_RUNNER_PUBLIC, akVar, str);
    }
}
