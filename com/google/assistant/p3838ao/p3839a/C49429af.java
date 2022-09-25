package com.google.assistant.p3838ao.p3839a;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.ap.b.l;
import com.google.android.apps.gsa.nga.engine.ap.b.m;
import com.google.android.apps.gsa.nga.engine.p5949ap.p5950b.C75004k;
import com.google.android.apps.gsa.nga.engine.p5949ap.p5950b.C75005n;
import com.google.assistant.p3838ao.p3839a.p3845e.C49528al;
import com.google.assistant.p3838ao.p3839a.p3845e.C49587cq;
import com.google.assistant.p3838ao.p3839a.p3845e.C49594cx;
import com.google.assistant.p3838ao.p3839a.p3845e.C49595cy;
import com.google.assistant.p3838ao.p3839a.p3845e.C49617h;
import com.google.assistant.p3838ao.p3839a.p3847g.C49644a;
import com.google.assistant.p3838ao.p3839a.p3848h.C49662q;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60890dd;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;

/* renamed from: com.google.assistant.ao.a.af */
/* compiled from: PG */
public final class C49429af implements C49430ag {

    /* renamed from: a */
    public static final C58974d f127673a = C58974d.m91136j();

    /* renamed from: l */
    private static final Duration f127674l = Duration.ofMillis(10);

    /* renamed from: b */
    public final Context f127675b;

    /* renamed from: c */
    public final C49662q f127676c;

    /* renamed from: d */
    public final C49644a f127677d;

    /* renamed from: e */
    public final C60950i f127678e;

    /* renamed from: f */
    public final C49690p f127679f;

    /* renamed from: g */
    public final C49643g f127680g;

    /* renamed from: h */
    public final l f127681h;

    /* renamed from: i */
    public final C75005n f127682i;

    /* renamed from: j */
    public final C75004k f127683j;

    /* renamed from: k */
    public final m f127684k;

    /* renamed from: m */
    private final C60887da f127685m;

    /* renamed from: n */
    private final C60887da f127686n;

    /* renamed from: o */
    private boolean f127687o = false;

    public C49429af(Context context, C49690p pVar, C49662q qVar, l lVar, C75005n nVar, C49644a aVar, C60888db dbVar, C60888db dbVar2, C75004k kVar, m mVar, C60950i iVar, C49643g gVar) {
        new C60890dd();
        this.f127675b = context;
        this.f127679f = pVar;
        this.f127676c = qVar;
        this.f127681h = lVar;
        this.f127682i = nVar;
        this.f127677d = aVar;
        this.f127685m = dbVar;
        this.f127686n = dbVar2;
        this.f127683j = kVar;
        this.f127684k = mVar;
        this.f127678e = iVar;
        this.f127680g = gVar;
    }

    /* renamed from: a */
    public static C49594cx m85476a(C49617h hVar, Map map) {
        C49594cx cxVar = (C49594cx) map.get(hVar);
        if (cxVar != null) {
            return cxVar;
        }
        C49594cx cxVar2 = (C49594cx) C49595cy.f127972c.createBuilder();
        map.put(hVar, cxVar2);
        return cxVar2;
    }

    /* renamed from: c */
    static /* synthetic */ void m85477c(C60870cx cxVar) {
        try {
            cxVar.get(f127674l.toMillis(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            ((C58970a) ((C58970a) ((C58970a) f127673a.mo56224b()).mo56382g(e)).mo56372aa(54831)).mo56386p("Timed out waiting for the new config.");
        }
    }

    /* renamed from: b */
    public final C60870cx mo53265b(C49528al alVar) {
        C60887da daVar = this.f127685m;
        int a = C49587cq.m85581a(alVar.f127798f);
        if (a != 0 && a == 1) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C60870cx cxVar = C60866ct.f164955a;
        if (!this.f127687o) {
            this.f127687o = true;
            if (this.f127679f.mo53328b() != 1) {
                cxVar = C60866ct.f164955a;
            } else {
                cxVar = daVar.mo19399b(new C49695u(this.f127686n.mo19399b(new C49694t(this))));
            }
        }
        return C60856cj.m92895d(cxVar).mo57334a(new C49427ad(this, alVar), daVar);
    }
}
