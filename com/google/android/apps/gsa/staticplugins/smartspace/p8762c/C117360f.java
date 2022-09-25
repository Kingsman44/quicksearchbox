package com.google.android.apps.gsa.staticplugins.smartspace.p8762c;

import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.apps.gsa.smartspace.p7257a.C92025g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.c.f */
/* compiled from: PG */
public final class C117360f implements C117356b {

    /* renamed from: a */
    private final C91189au f325796a;

    /* renamed from: b */
    private final C60888db f325797b;

    /* renamed from: c */
    private final C86124t f325798c;

    public C117360f(C91189au auVar, C90851k kVar, C86124t tVar) {
        this.f325796a = auVar;
        this.f325797b = kVar.mo85208a("backgroundExecutor");
        this.f325798c = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo103276a(C83802r rVar) {
        C60870cx f = C92025g.m151037f(rVar, this.f325797b, this.f325796a, this.f325798c);
        C117359e eVar = new C117359e(rVar);
        return C60922j.m93044g(f, C47810es.m84963c(eVar), this.f325797b);
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo103277b(C92113i iVar) {
        return C117355a.m195020a(iVar);
    }
}
