package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;
import com.google.common.p4552o.ajy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.cp */
/* compiled from: PG */
public final /* synthetic */ class C114451cp implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317342a;

    /* renamed from: b */
    public final /* synthetic */ aas f317343b;

    public /* synthetic */ C114451cp(C114464db dbVar, aas aas) {
        this.f317342a = dbVar;
        this.f317343b = aas;
    }

    public final C60870cx apply(Object obj) {
        C114464db dbVar = this.f317342a;
        aas aas = this.f317343b;
        if (((Boolean) obj).booleanValue()) {
            return C60856cj.m92899h(new C114463da(C51962fo.ALREADY_ACTIONED));
        }
        return dbVar.mo101331i(aas, ajy.CLIENT_OP);
    }
}
