package com.google.android.apps.search.assistant.platform.pcp.api;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import p3186j$.time.Instant;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.api.t */
/* compiled from: PG */
public final class C123604t {

    /* renamed from: a */
    public static final C59071e f341511a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.api.t");

    /* renamed from: b */
    public final CopyOnWriteArraySet f341512b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public final Context f341513c;

    /* renamed from: d */
    private final Set f341514d;

    /* renamed from: e */
    private final Executor f341515e;

    /* renamed from: f */
    private final Executor f341516f;

    /* renamed from: g */
    private final C60950i f341517g;

    /* renamed from: h */
    private final C124100bz f341518h;

    /* renamed from: i */
    private final C46175b f341519i;

    /* renamed from: j */
    private final boolean f341520j;

    public C123604t(Set set, Executor executor, Executor executor2, C60950i iVar, C124100bz bzVar, Context context, C46175b bVar, boolean z) {
        this.f341514d = set;
        this.f341515e = executor;
        this.f341516f = executor2;
        this.f341517g = iVar;
        this.f341518h = bzVar;
        this.f341513c = context;
        this.f341519i = bVar;
        this.f341520j = z;
    }

    /* renamed from: c */
    private static void m202918c(C60870cx cxVar, C53306j jVar, int i, Instant instant, C60950i iVar, C124100bz bzVar) {
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C123603s(instant, bzVar, iVar, jVar, i)), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final void mo106054a(C123598n nVar) {
        this.f341512b.add(nVar);
        if (this.f341520j && nVar.mo22862a().equals(C53306j.OPA_HUB_UI)) {
            C53306j a = nVar.mo22862a();
            C60870cx d = this.f341519i.mo50247d();
            C123602r rVar = new C123602r(this, a);
            C60922j.m93045h(d, C47810es.m84966f(rVar), this.f341516f);
        }
    }

    /* renamed from: b */
    public final C60870cx mo106055b(C58485gu guVar, int i, Instant instant) {
        for (C123606v vVar : this.f341514d) {
            C53306j a = vVar.mo28158a();
            if (guVar.contains(a)) {
                Objects.requireNonNull(vVar);
                m202918c(C60856cj.m92903l(new C123600p(vVar), this.f341515e), a, i, instant, this.f341517g, this.f341518h);
            }
        }
        Iterator it = this.f341512b.iterator();
        while (it.hasNext()) {
            C123598n nVar = (C123598n) it.next();
            C53306j a2 = nVar.mo22862a();
            if (guVar.contains(a2)) {
                if (nVar.mo22863f().isPresent()) {
                    Intent intent = new Intent();
                    intent.setPackage((String) nVar.mo22863f().get());
                    intent.setAction("com.google.android.apps.search.platform.pcp.ON_DATA_UPDATE");
                    this.f341513c.sendBroadcast(intent);
                } else {
                    Objects.requireNonNull(nVar);
                    m202918c(C60856cj.m92903l(new C123601q(nVar), this.f341515e), a2, i, instant, this.f341517g, this.f341518h);
                }
            }
        }
        return C60866ct.f164955a;
    }
}
