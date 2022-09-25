package com.google.android.apps.search.googleapp.customtabs.p10152d;

import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133739y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.j */
/* compiled from: PG */
public final class C133749j {

    /* renamed from: a */
    public final C133756q f364293a;

    /* renamed from: b */
    public final C60888db f364294b;

    /* renamed from: c */
    private final C60888db f364295c;

    public C133749j(C133756q qVar, C60888db dbVar, C60888db dbVar2) {
        this.f364293a = qVar;
        this.f364295c = dbVar;
        this.f364294b = dbVar2;
    }

    /* renamed from: a */
    public final C133739y mo111383a() {
        C133746g gVar;
        C133756q qVar = this.f364293a;
        synchronized (qVar.f364306e) {
            C60870cx cxVar = qVar.f364310i;
            if (cxVar != null && cxVar.isDone()) {
                try {
                    gVar = (C133746g) C60856cj.m92909r(qVar.f364310i);
                } catch (ExecutionException e) {
                    ((C59052c) ((C59052c) ((C59052c) C133756q.f364302a.mo56226d()).mo56382g(e)).mo56372aa(40090)).mo56386p("Last service connection attempt failed");
                }
            }
            gVar = null;
        }
        if (gVar != null) {
            return gVar.f364288f;
        }
        return null;
    }

    /* renamed from: b */
    public final C60870cx mo111384b() {
        C60870cx a = this.f364293a.mo111386a();
        C133748i iVar = C133748i.f364292a;
        return C60922j.m93044g(a, C47810es.m84963c(iVar), this.f364295c);
    }
}
