package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.apps.gsa.p8839t.p8840a.C118339a;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123776e;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.j */
/* compiled from: PG */
public final /* synthetic */ class C97838j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C97846r f273204a;

    /* renamed from: b */
    public final /* synthetic */ C123726at f273205b;

    public /* synthetic */ C97838j(C97846r rVar, C123726at atVar) {
        this.f273204a = rVar;
        this.f273205b = atVar;
    }

    public final C60870cx apply(Object obj) {
        C97846r rVar = this.f273204a;
        C123726at atVar = this.f273205b;
        C58976aa aaVar = C58975e.f156826a;
        C118339a aVar = rVar.f273220c;
        C53306j jVar = C53306j.AMBIENT_ASSISTANT;
        ArrayList c = C58597ky.m90212c(9);
        C123776e eVar = (C123776e) C123777f.f341922a.createBuilder();
        eVar.mo58885m(C123726at.f341744i, atVar);
        return aVar.mo90818h(jVar, c, (C123777f) eVar.build());
    }
}
