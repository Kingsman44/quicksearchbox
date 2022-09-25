package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.libraries.search.assistant.proactive.C36334o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.p4552o.ajy;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.co */
/* compiled from: PG */
public final /* synthetic */ class C114450co implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317339a;

    /* renamed from: b */
    public final /* synthetic */ aas f317340b;

    /* renamed from: c */
    public final /* synthetic */ ajy f317341c;

    public /* synthetic */ C114450co(C114464db dbVar, aas aas, ajy ajy) {
        this.f317339a = dbVar;
        this.f317340b = aas;
        this.f317341c = ajy;
    }

    public final C60870cx apply(Object obj) {
        C114464db dbVar = this.f317339a;
        aas aas = this.f317340b;
        C60870cx a = dbVar.f317401v.mo40013a(C114464db.m189728a(aas.f134670h), aas);
        C114426br brVar = new C114426br(dbVar, aas, this.f317341c, (C36334o) obj);
        return C60922j.m93045h(a, C47810es.m84966f(brVar), C60826bg.f164896a);
    }
}
