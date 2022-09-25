package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.x */
/* compiled from: PG */
public final /* synthetic */ class C130968x implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C130890ac f358336a;

    public /* synthetic */ C130968x(C130890ac acVar) {
        this.f358336a = acVar;
    }

    public final C60870cx apply(Object obj) {
        C130890ac acVar = this.f358336a;
        C58485gu guVar = (C58485gu) obj;
        ((C58970a) ((C58970a) acVar.f358184c.mo56224b()).mo56372aa(39000)).mo56387q("%d loggers run.", guVar.size());
        return C47638k.m84750a((C58485gu) Collection.EL.stream(guVar).map(new C130966v(acVar)).collect(C58370cn.f155946a)).mo51520a(new C130970z(acVar), acVar.f358183b);
    }
}
