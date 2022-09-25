package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123615ah;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.time.Instant;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.ag */
/* compiled from: PG */
public final /* synthetic */ class C123834ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123841an f342094a;

    /* renamed from: b */
    public final /* synthetic */ Instant f342095b;

    public /* synthetic */ C123834ag(C123841an anVar, Instant instant) {
        this.f342094a = anVar;
        this.f342095b = instant;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C123841an anVar = this.f342094a;
        Instant instant = this.f342095b;
        Long l = (Long) obj;
        Instant ofEpochMilli = Instant.ofEpochMilli(l.longValue());
        Instant minus = instant.minus(anVar.f342106c);
        if (l.longValue() == 0 || ofEpochMilli.isBefore(minus)) {
            return C60866ct.f164955a;
        }
        Instant ofEpochMilli2 = Instant.ofEpochMilli(l.longValue());
        if (ofEpochMilli2.isAfter(instant)) {
            ((C58970a) ((C58970a) anVar.f342109f.mo56226d()).mo56372aa(35283)).mo56386p("Calendar recon start time is a future time.");
            cxVar = C60856cj.m92900i(C58485gu.m89845m());
        } else {
            anVar.f342107d.f342762a.mo41704s("PCP_CALENDAR_QUERY_FOR_RECONCILIATION");
            C60870cx b = anVar.f342104a.mo106139b(ofEpochMilli2, instant);
            C60870cx a = anVar.f342104a.mo106138a();
            cxVar = C47638k.m84753d(b, a).mo51520a(new C123836ai(b, a), anVar.f342105b);
        }
        C123615ah ahVar = anVar.f342108e;
        Objects.requireNonNull(ahVar);
        C123832ae aeVar = new C123832ae(ahVar);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(aeVar), anVar.f342105b);
        C123833af afVar = new C123833af(instant, ofEpochMilli2);
        C60870cx g = C60922j.m93044g(n, C47810es.m84963c(afVar), C60826bg.f164896a);
        return C47638k.m84753d(cxVar, g).mo51521b(new C123831ad(anVar, cxVar, g), C60826bg.f164896a);
    }
}
