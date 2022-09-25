package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.google.assistant.p3825an.p3830c.p3831a.C49261ag;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.v */
/* compiled from: PG */
public final /* synthetic */ class C111386v implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C49301bt f309912a;

    public /* synthetic */ C111386v(C49301bt btVar) {
        this.f309912a = btVar;
    }

    public final Object apply(Object obj) {
        C49301bt btVar = this.f309912a;
        Optional optional = (Optional) obj;
        C59071e eVar = C111346ao.f309833a;
        C49261ag agVar = btVar.f127427c;
        if (agVar == null) {
            agVar = C49261ag.f127334e;
        }
        return (String) optional.orElse(agVar.f127336a);
    }
}
