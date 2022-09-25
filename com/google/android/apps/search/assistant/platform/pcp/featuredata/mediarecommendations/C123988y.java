package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130929bn;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.y */
/* compiled from: PG */
public final /* synthetic */ class C123988y implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123928ad f342455a;

    /* renamed from: b */
    public final /* synthetic */ C123935ak f342456b;

    public /* synthetic */ C123988y(C123928ad adVar, C123935ak akVar) {
        this.f342455a = adVar;
        this.f342456b = akVar;
    }

    public final C60870cx apply(Object obj) {
        C123928ad adVar = this.f342455a;
        C123935ak akVar = this.f342456b;
        Optional optional = (Optional) obj;
        if (!((Boolean) optional.map(new C123986w(adVar)).orElseGet(new C123987x(adVar))).booleanValue()) {
            C69664n.m101061g(optional, "lastUpdateTimeOptional");
            return C71663i.m104688a(C71803m.m105042c(akVar.f342324a, (C69585o) null, (C71424ay) null, new C123931ag(akVar, optional, (C69577g) null), 3));
        }
        ((C58970a) ((C58970a) adVar.f342289b.mo56224b()).mo56372aa(35310)).mo56389s("#%s: Fetch throttled.", akVar.f342325b.f358263c);
        return C60856cj.m92900i(new C130929bn(akVar.f342325b, (Instant) optional.orElse(null)));
    }
}
