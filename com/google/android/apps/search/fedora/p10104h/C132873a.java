package com.google.android.apps.search.fedora.p10104h;

import com.google.android.apps.search.fedora.p10092a.C132711q;
import com.google.android.apps.search.fedora.p10092a.C132712r;
import com.google.android.apps.search.fedora.p10092a.C132717w;
import com.google.android.apps.search.fedora.p10100f.C132838e;
import com.google.android.apps.search.fedora.p10104h.C132899i;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3929l.p3930a.C52749da;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63042fg;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.fedora.h.a */
/* compiled from: PG */
public final /* synthetic */ class C132873a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132899i f362497a;

    /* renamed from: b */
    public final /* synthetic */ Optional f362498b;

    public /* synthetic */ C132873a(C132899i iVar, Optional optional) {
        this.f362497a = iVar;
        this.f362498b = optional;
    }

    public final C60870cx apply(Object obj) {
        C132899i iVar = this.f362497a;
        AccountId accountId = (AccountId) this.f362498b.get();
        Optional findFirst = Collection.EL.stream((C58485gu) obj).filter(C132892b.f362531a).map(C132893c.f362532a).filter(C132894d.f362533a).findFirst();
        if (!findFirst.isPresent()) {
            return C60866ct.f164955a;
        }
        C63042fg fgVar = ((C52749da) findFirst.get()).f138437b;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        boolean z = ((C52749da) findFirst.get()).f138438c;
        C132838e bE = ((C132899i.C132900a) C47245e.m84045a(iVar.f362539b, C132899i.C132900a.class, accountId)).mo110928bE();
        C47633f g = C47633f.m84733g(C60856cj.m92897f(bE.mo110917e(fgVar), bE.mo110916d(z)));
        C132897g gVar = new C132897g();
        C60856cj.m92911t(g.f164926b, C47810es.m84974n(gVar), iVar.f362542e);
        C132717w wVar = iVar.f362540c;
        C132711q qVar = new C132711q(wVar, accountId);
        return C47633f.m84733g(C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(qVar), wVar.f362145e)).mo51515h(C132712r.f362134a, wVar.f362145e)).mo51516i(new C132895e(iVar, z, fgVar), iVar.f362542e);
    }
}
