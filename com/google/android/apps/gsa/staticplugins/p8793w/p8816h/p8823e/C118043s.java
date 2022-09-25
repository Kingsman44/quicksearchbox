package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.binaries.satin.app.C74044gl;
import com.google.android.apps.gsa.binaries.satin.app.gn;
import com.google.android.apps.gsa.search.core.p6820r.C86386ah;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p8793w.p8827i.C118083b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5294a.C68225k;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.s */
/* compiled from: PG */
public final /* synthetic */ class C118043s implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C118044t f327621a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f327622b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f327623c;

    public /* synthetic */ C118043s(C118044t tVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f327621a = tVar;
        this.f327622b = cxVar;
        this.f327623c = cxVar2;
    }

    public final Object call() {
        C118044t tVar = this.f327621a;
        C60870cx cxVar = this.f327622b;
        C60870cx cxVar2 = this.f327623c;
        Query query = (Query) C60856cj.m92909r(cxVar);
        C118083b bVar = (C118083b) C60856cj.m92909r(cxVar2);
        C74044gl glVar = (C74044gl) tVar.f327626c.mo17428b();
        query.getClass();
        glVar.f206238e = query;
        bVar.getClass();
        glVar.f206237d = bVar;
        glVar.f206239f = tVar.f327624a;
        glVar.f206240g = tVar.f327625b.mo80283a();
        C68225k.m98529a(glVar.f206237d, C118083b.class);
        C68225k.m98529a(glVar.f206238e, Query.class);
        C68225k.m98529a(glVar.f206239f, C89356b.class);
        C68225k.m98529a(glVar.f206240g, ClientConfig.class);
        gn gnVar = new gn(glVar.f206234a, glVar.f206235b, glVar.f206236c, glVar.f206237d, glVar.f206238e, glVar.f206239f, glVar.f206240g);
        return new C86386ah(gnVar.b.mo60297gq(), gnVar.f.mo60297gq());
    }
}
