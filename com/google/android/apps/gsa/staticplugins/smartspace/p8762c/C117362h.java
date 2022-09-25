package com.google.android.apps.gsa.staticplugins.smartspace.p8762c;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.apps.gsa.smartspace.p7257a.C92025g;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.C131596c;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.c.h */
/* compiled from: PG */
public final class C117362h implements C117356b {

    /* renamed from: a */
    public final C58974d f325800a;

    /* renamed from: b */
    public final C131596c f325801b;

    /* renamed from: c */
    private final C91189au f325802c;

    /* renamed from: d */
    private final C60888db f325803d;

    /* renamed from: e */
    private final C86124t f325804e;

    public C117362h(C86124t tVar, C91189au auVar, C90851k kVar, C83564a aVar, C131596c cVar) {
        this.f325802c = auVar;
        this.f325804e = tVar;
        this.f325803d = kVar.mo85208a("backgroundExecutor");
        this.f325800a = aVar.mo76900a("DefaultCardConverter");
        this.f325801b = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo103276a(C83802r rVar) {
        return C92025g.m151037f(rVar, this.f325803d, this.f325802c, this.f325804e);
    }

    /* renamed from: b */
    public final C60870cx mo103277b(C92113i iVar) {
        return C60922j.m93044g(C92025g.m151036e(iVar, this.f325803d, this.f325802c, this.f325804e), new C117361g(this), this.f325803d);
    }
}
