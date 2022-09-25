package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.assistant.p3897e.p3921j.aar;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.p4552o.ajy;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.cq */
/* compiled from: PG */
public final /* synthetic */ class C114452cq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317344a;

    /* renamed from: b */
    public final /* synthetic */ ajy f317345b;

    /* renamed from: c */
    public final /* synthetic */ aas f317346c;

    public /* synthetic */ C114452cq(C114464db dbVar, ajy ajy, aas aas) {
        this.f317344a = dbVar;
        this.f317345b = ajy;
        this.f317346c = aas;
    }

    public final C60870cx apply(Object obj) {
        C114464db dbVar = this.f317344a;
        ajy ajy = this.f317345b;
        aas aas = this.f317346c;
        aas aas2 = (aas) obj;
        int a = aar.m86269a(aas2.f134664b);
        return dbVar.mo101328e((a != 0 && a == 5) ? dbVar.mo101327d(aas2) : dbVar.mo101331i(aas2, ajy), aas, ajy);
    }
}
