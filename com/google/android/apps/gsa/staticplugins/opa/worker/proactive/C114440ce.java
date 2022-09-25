package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;
import com.google.common.p4552o.ajy;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ce */
/* compiled from: PG */
public final /* synthetic */ class C114440ce implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317316a;

    /* renamed from: b */
    public final /* synthetic */ aas f317317b;

    /* renamed from: c */
    public final /* synthetic */ ajy f317318c;

    public /* synthetic */ C114440ce(C114464db dbVar, aas aas, ajy ajy) {
        this.f317316a = dbVar;
        this.f317317b = aas;
        this.f317318c = ajy;
    }

    public final C60870cx apply(Object obj) {
        C114464db dbVar = this.f317316a;
        aas aas = this.f317317b;
        ajy ajy = this.f317318c;
        C51962fo foVar = (C51962fo) obj;
        if (foVar != C51962fo.DISPLAYED) {
            return C60856cj.m92899h(new C114463da(foVar));
        }
        C60870cx c = dbVar.mo101326c(aas);
        C114450co coVar = new C114450co(dbVar, aas, ajy);
        return C60922j.m93045h(c, C47810es.m84966f(coVar), C60826bg.f164896a);
    }
}
