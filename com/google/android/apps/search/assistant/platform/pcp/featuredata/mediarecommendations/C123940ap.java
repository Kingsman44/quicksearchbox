package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ap */
/* compiled from: PG */
public final class C123940ap implements C47352j {

    /* renamed from: a */
    private final C123928ad f342334a;

    /* renamed from: b */
    private final C69464a f342335b;

    /* renamed from: c */
    private final C58974d f342336c;

    public C123940ap(C123928ad adVar, C130603a aVar, C69464a aVar2) {
        C69664n.m101061g(aVar, "loggerFactory");
        this.f342334a = adVar;
        this.f342335b = aVar2;
        this.f342336c = aVar.mo109740b(this);
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        Object b = this.f342335b.mo17428b();
        C69664n.m101060f(b, "enableTng.get()");
        if (!((Boolean) b).booleanValue()) {
            return C60866ct.f164955a;
        }
        ((C58970a) this.f342336c.mo56224b()).mo56386p("Running synclet for media recommendations.");
        return this.f342334a.mo106151a();
    }
}
