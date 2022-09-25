package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.LinkedHashSet;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.g */
/* compiled from: PG */
public final /* synthetic */ class C18733g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C18736j f52821a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f52822b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f52823c;

    public /* synthetic */ C18733g(C18736j jVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f52821a = jVar;
        this.f52822b = cxVar;
        this.f52823c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C18736j jVar = this.f52821a;
        C60870cx cxVar = this.f52822b;
        Optional optional = (Optional) C60856cj.m92909r(this.f52823c);
        C53306j jVar2 = (C53306j) ((Optional) C60856cj.m92909r(cxVar)).orElse(C53306j.UNKNOWNN);
        if (jVar2 == C53306j.UNKNOWNN) {
            ((C59052c) ((C59052c) C18736j.f52828a.mo56226d()).mo56372aa(47342)).mo56386p("Unexpected UNKNOWN client type");
        }
        LinkedHashSet linkedHashSet = (LinkedHashSet) optional.orElse(new LinkedHashSet());
        return (C60870cx) Collection.EL.stream(jVar.f52830c.mo24191b(C58485gu.m89842j(linkedHashSet), linkedHashSet, jVar2, C123777f.f341922a, false, BuildConfig.FLAVOR, false)).filter(C18729c.f52816a).findFirst().map(new C18730d(jVar, jVar2)).orElseGet(C18731e.f52819a);
    }
}
