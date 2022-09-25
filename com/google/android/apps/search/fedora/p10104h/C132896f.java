package com.google.android.apps.search.fedora.p10104h;

import com.google.android.apps.search.fedora.p10104h.C132899i;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65849r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.fedora.h.f */
/* compiled from: PG */
public final /* synthetic */ class C132896f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132899i f362537a;

    public /* synthetic */ C132896f(C132899i iVar) {
        this.f362537a = iVar;
    }

    public final C60870cx apply(Object obj) {
        C132899i iVar = this.f362537a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            ((C59052c) ((C59052c) C132899i.f362538a.mo56226d()).mo56372aa(39880)).mo56386p("Failed to get account id.");
            return C60866ct.f164955a;
        }
        return C47633f.m84733g(((C132899i.C132900a) C47245e.m84045a(iVar.f362539b, C132899i.C132900a.class, (AccountId) optional.get())).mo110929fN().mo41431b(C65753ak.ASSISTANT_SETTINGS, "sheldon_email_status", C63662ac.f172144a, C65849r.f179002c)).mo51516i(new C132873a(iVar, optional), iVar.f362542e);
    }
}
