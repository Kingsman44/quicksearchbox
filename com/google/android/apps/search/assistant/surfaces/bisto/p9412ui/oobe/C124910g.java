package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124825a;
import com.google.android.libraries.search.assistant.p2868z.p2869a.C37170h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.C49924ea;
import com.google.assistant.p3861at.C49925eb;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62962ci;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.g */
/* compiled from: PG */
public final /* synthetic */ class C124910g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124914k f344638a;

    /* renamed from: b */
    public final /* synthetic */ String f344639b;

    /* renamed from: c */
    public final /* synthetic */ C49883cn f344640c;

    /* renamed from: d */
    public final /* synthetic */ C124825a f344641d;

    public /* synthetic */ C124910g(C124914k kVar, String str, C49883cn cnVar, C124825a aVar) {
        this.f344638a = kVar;
        this.f344639b = str;
        this.f344640c = cnVar;
        this.f344641d = aVar;
    }

    public final C60870cx apply(Object obj) {
        C124914k kVar = this.f344638a;
        String str = this.f344639b;
        C49883cn cnVar = this.f344640c;
        C124825a aVar = this.f344641d;
        C49924ea eaVar = (C49924ea) C49925eb.f129768c.createBuilder();
        Objects.requireNonNull(eaVar);
        ((Optional) obj).ifPresent(new C124909f(eaVar));
        C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
        dfVar.copyOnWrite();
        C49903dg dgVar = (C49903dg) dfVar.instance;
        dgVar.f129714a |= 1;
        dgVar.f129715b = str;
        C49875cf cfVar = C49875cf.ASSISTANT_SDK;
        dfVar.copyOnWrite();
        C49903dg dgVar2 = (C49903dg) dfVar.instance;
        dgVar2.f129716c = cfVar.f129621v;
        dgVar2.f129714a |= 2;
        cnVar.copyOnWrite();
        C49891cv cvVar = (C49891cv) cnVar.instance;
        C49925eb ebVar = (C49925eb) eaVar.build();
        C62962ci ciVar = C49891cv.f129649p;
        ebVar.getClass();
        cvVar.f129660K = ebVar;
        cvVar.f129664b |= C89885b.NOW_VALUE;
        dfVar.copyOnWrite();
        C49903dg dgVar3 = (C49903dg) dfVar.instance;
        C49891cv cvVar2 = (C49891cv) cnVar.build();
        cvVar2.getClass();
        dgVar3.f129719f = cvVar2;
        dgVar3.f129714a |= 32;
        acw acw = (acw) acx.f128971H.createBuilder();
        C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
        daVar.mo53372c((C49903dg) dfVar.build());
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        C49898db dbVar = (C49898db) daVar.build();
        dbVar.getClass();
        acx.f128991h = dbVar;
        acx.f128984a |= 32;
        C37170h hVar = new C37170h();
        hVar.mo40678c(kVar.getClass().getSimpleName());
        hVar.mo40677b((acx) acw.build());
        C60870cx b = kVar.f344649c.mo40670b(hVar.mo40676a());
        C60856cj.m92911t(b, C47810es.m84974n(new C124913j(aVar)), C60826bg.f164896a);
        return b;
    }
}
