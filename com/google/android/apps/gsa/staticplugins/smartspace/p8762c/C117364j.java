package com.google.android.apps.gsa.staticplugins.smartspace.p8762c;

import android.content.Context;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.c.j */
/* compiled from: PG */
public final class C117364j implements C117356b {

    /* renamed from: a */
    public final C58974d f325807a = C58974d.m91134h("DriveModeCardConverter");

    /* renamed from: b */
    public final Context f325808b;

    /* renamed from: c */
    public final C86124t f325809c;

    /* renamed from: d */
    private final C91189au f325810d;

    /* renamed from: e */
    private final C60888db f325811e;

    public C117364j(Context context, C91189au auVar, C90851k kVar, C86124t tVar) {
        this.f325808b = context;
        this.f325810d = auVar;
        this.f325811e = kVar.mo85208a("backgroundExecutor");
        this.f325809c = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo103276a(C83802r rVar) {
        C60870cx f = C92025g.m151037f(rVar, this.f325811e, this.f325810d, this.f325809c);
        C117363i iVar = new C117363i(this, rVar);
        return C60922j.m93044g(f, C47810es.m84963c(iVar), this.f325811e);
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo103277b(C92113i iVar) {
        return C117355a.m195020a(iVar);
    }
}
