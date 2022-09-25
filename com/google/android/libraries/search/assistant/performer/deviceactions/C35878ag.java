package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.net.Uri;
import android.os.Build;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35812aa;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35814ac;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35815ad;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35817af;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35845bg;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35857n;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35858o;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35862s;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35932a;
import com.google.apps.tiktok.dataservice.C46740bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.C52097fc;
import com.google.assistant.p3897e.p3921j.C52098fd;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62971cq;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.ag */
/* compiled from: PG */
public final /* synthetic */ class C35878ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35881aj f93991a;

    /* renamed from: b */
    public final /* synthetic */ C52097fc f93992b;

    /* renamed from: c */
    public final /* synthetic */ C52098fd f93993c;

    public /* synthetic */ C35878ag(C35881aj ajVar, C52097fc fcVar, C52098fd fdVar) {
        this.f93991a = ajVar;
        this.f93992b = fcVar;
        this.f93993c = fdVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C35881aj ajVar = this.f93991a;
        C52097fc fcVar = this.f93992b;
        C52098fd fdVar = this.f93993c;
        C58485gu guVar = (C58485gu) obj;
        Map unmodifiableMap = Collections.unmodifiableMap(fcVar.f136726e);
        C62971cq cqVar = fcVar.f136723b;
        if ((!unmodifiableMap.isEmpty() || !cqVar.isEmpty()) && C58890d.m90990e(Build.MANUFACTURER, "google") && (Build.MODEL.contains("Pixel") || Build.MODEL.contains("Nexus"))) {
            C35817af afVar = ajVar.f94002d;
            C58976aa aaVar = C58975e.f156826a;
            if (cqVar.isEmpty()) {
                cxVar = C60866ct.f164955a;
            } else {
                C35932a.m64316a(afVar.f93843e, C35845bg.m64244d(cqVar));
                C35862s a = afVar.f93841c.mo39871a((String) null);
                HashSet hashSet = new HashSet(cqVar);
                C60870cx g = C60846c.m92878g(a.mo39868a(new Uri.Builder().scheme("content").authority("com.google.android.settings.external").path("signals").build()).f121591a.mo57272e(C47810es.m84970j(new C35857n(hashSet)), a.f93956d).mo57275g(), C46740bx.class, C35858o.f93949a, C60826bg.f164896a);
                C35812aa aaVar2 = new C35812aa(afVar, hashSet, fdVar, cqVar);
                cxVar = C60922j.m93044g(g, C47810es.m84963c(aaVar2), afVar.f93842d);
            }
            C60870cx c = C35845bg.m64243c(guVar, new C35814ac(afVar, unmodifiableMap, fdVar));
            return C47638k.m84751b(cxVar, c).mo51520a(C47810es.m84978r(new C35815ad(c, guVar)), C60826bg.f164896a);
        }
        ((C59052c) ((C59052c) C35881aj.f93999a.mo56224b()).mo56372aa(51816)).mo56386p("Settings are not supported by Phone Buddy API, skipping Phone Buddy flow.");
        return C60856cj.m92900i(guVar);
    }
}
