package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8260d;

import com.google.android.apps.gsa.smartspace.p7259c.C92094j;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.C106864c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.C107017f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8265a.C107043b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.d.m */
/* compiled from: PG */
public final /* synthetic */ class C107002m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C106989ao f298012a;

    /* renamed from: b */
    public final /* synthetic */ C92094j f298013b;

    /* renamed from: c */
    public final /* synthetic */ C106864c f298014c;

    /* renamed from: d */
    public final /* synthetic */ C106596h f298015d;

    public /* synthetic */ C107002m(C106989ao aoVar, C92094j jVar, C106864c cVar, C106596h hVar) {
        this.f298012a = aoVar;
        this.f298013b = jVar;
        this.f298014c = cVar;
        this.f298015d = hVar;
    }

    public final C60870cx apply(Object obj) {
        C106989ao aoVar = this.f298012a;
        C92094j jVar = this.f298013b;
        C106864c cVar = this.f298014c;
        C106596h hVar = this.f298015d;
        Boolean bool = (Boolean) obj;
        if (jVar == C92094j.HEADPHONES || bool.booleanValue()) {
            C60870cx c = cVar.mo95698c(hVar);
            C107043b.m177757a(aoVar.f297978a, c, "Failed to generate suggestions for %s.", cVar.getClass().getSimpleName());
            return c;
        }
        ((C58970a) ((C58970a) aoVar.f297978a.mo56224b()).mo56372aa(23437)).mo56389s("%s is disabled", cVar.getClass().getSimpleName());
        return C60856cj.m92900i(C107017f.m177726d().mo95685a());
    }
}
