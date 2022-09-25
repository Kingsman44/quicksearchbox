package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52099fe;
import com.google.assistant.p3897e.p3921j.C52103fi;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.x */
/* compiled from: PG */
public final /* synthetic */ class C35867x implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35817af f93976a;

    /* renamed from: b */
    public final /* synthetic */ C52099fe f93977b;

    public /* synthetic */ C35867x(C35817af afVar, C52099fe feVar) {
        this.f93976a = afVar;
        this.f93977b = feVar;
    }

    public final C60870cx apply(Object obj) {
        C35817af afVar = this.f93976a;
        C52099fe feVar = this.f93977b;
        Optional optional = (Optional) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (optional.isEmpty() || ((String) optional.get()).isEmpty() || C58890d.m90990e("false", (CharSequence) optional.get())) {
            return C60866ct.f164955a;
        }
        String str = (String) optional.get();
        feVar.copyOnWrite();
        C52103fi fiVar = (C52103fi) feVar.instance;
        C52103fi fiVar2 = C52103fi.f136729i;
        str.getClass();
        fiVar.f136731a |= 32;
        fiVar.f136737g = str;
        C35862s a = afVar.f93841c.mo39871a((String) optional.get());
        return C60922j.m93044g(a.mo39869b(), C47810es.m84963c(new C35816ae(feVar, a)), afVar.f93842d);
    }
}
