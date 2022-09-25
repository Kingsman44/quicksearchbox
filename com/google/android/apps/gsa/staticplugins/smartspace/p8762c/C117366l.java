package com.google.android.apps.gsa.staticplugins.smartspace.p8762c;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.apps.gsa.smartspace.p7257a.C92025g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.c.l */
/* compiled from: PG */
public final class C117366l implements C117356b {

    /* renamed from: a */
    public final C58974d f325814a;

    /* renamed from: b */
    private final C91189au f325815b;

    /* renamed from: c */
    private final C60888db f325816c;

    /* renamed from: d */
    private final C86124t f325817d;

    public C117366l(C83564a aVar, C91189au auVar, C90851k kVar, C86124t tVar) {
        this.f325814a = aVar.mo76900a("MCardConverter");
        this.f325815b = auVar;
        this.f325816c = kVar.mo85208a("backgroundExecutor");
        this.f325817d = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo103276a(C83802r rVar) {
        C60870cx f = C92025g.m151037f(rVar, this.f325816c, this.f325815b, this.f325817d);
        C117365k kVar = new C117365k(this, rVar);
        return C60922j.m93044g(f, C47810es.m84963c(kVar), this.f325816c);
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo103277b(C92113i iVar) {
        return C117355a.m195020a(iVar);
    }
}
