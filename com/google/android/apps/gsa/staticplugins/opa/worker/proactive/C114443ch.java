package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.search.core.p6491a.C84373s;
import com.google.android.libraries.search.assistant.proactive.C36334o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ch */
/* compiled from: PG */
public final /* synthetic */ class C114443ch implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317324a;

    /* renamed from: b */
    public final /* synthetic */ aas f317325b;

    /* renamed from: c */
    public final /* synthetic */ C84373s f317326c;

    public /* synthetic */ C114443ch(C114464db dbVar, aas aas, C84373s sVar) {
        this.f317324a = dbVar;
        this.f317325b = aas;
        this.f317326c = sVar;
    }

    public final C60870cx apply(Object obj) {
        C114464db dbVar = this.f317324a;
        aas aas = this.f317325b;
        C84373s sVar = this.f317326c;
        C60870cx a = dbVar.f317401v.mo40013a(C114464db.m189728a(aas.f134670h), aas);
        C114432bx bxVar = new C114432bx(dbVar, aas, (C36334o) obj, sVar);
        return C60922j.m93045h(a, C47810es.m84966f(bxVar), C60826bg.f164896a);
    }
}
