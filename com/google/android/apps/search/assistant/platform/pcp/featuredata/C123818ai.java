package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.ai */
/* compiled from: PG */
public final /* synthetic */ class C123818ai implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123819aj f342046a;

    public /* synthetic */ C123818ai(C123819aj ajVar) {
        this.f342046a = ajVar;
    }

    public final C60870cx apply(Object obj) {
        C123819aj ajVar = this.f342046a;
        Set set = (Set) obj;
        if (!set.isEmpty()) {
            return C47638k.m84752c((Iterable) Collection.EL.stream(set).map(new C123815af(ajVar)).collect(Collectors.toCollection(C123816ag.f342044a))).mo51521b(new C123817ah(ajVar), ajVar.f342049c);
        }
        C59104x b = C123819aj.f342047a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.TipsDataController");
        ((C59052c) ((C59052c) b).mo56372aa(35241)).mo56386p("accountIds is empty");
        return C60866ct.f164955a;
    }
}
