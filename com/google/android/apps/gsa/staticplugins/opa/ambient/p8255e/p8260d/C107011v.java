package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8260d;

import com.google.android.apps.gsa.smartspace.p7259c.C92094j;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.C106864c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.C107017f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.d.v */
/* compiled from: PG */
public final /* synthetic */ class C107011v implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C106989ao f298026a;

    /* renamed from: b */
    public final /* synthetic */ C106864c f298027b;

    /* renamed from: c */
    public final /* synthetic */ C92094j f298028c;

    /* renamed from: d */
    public final /* synthetic */ C106596h f298029d;

    public /* synthetic */ C107011v(C106989ao aoVar, C106864c cVar, C92094j jVar, C106596h hVar) {
        this.f298026a = aoVar;
        this.f298027b = cVar;
        this.f298028c = jVar;
        this.f298029d = hVar;
    }

    public final C60870cx apply(Object obj) {
        C106989ao aoVar = this.f298026a;
        C106864c cVar = this.f298027b;
        C92094j jVar = this.f298028c;
        C106596h hVar = this.f298029d;
        if (((Boolean) obj).booleanValue()) {
            return aoVar.mo95726b(cVar, jVar, hVar);
        }
        ((C58970a) ((C58970a) aoVar.f297978a.mo56224b()).mo56372aa(23436)).mo56386p("PersonalResponse is disabled");
        return C60856cj.m92900i(C107017f.m177726d().mo95685a());
    }
}
