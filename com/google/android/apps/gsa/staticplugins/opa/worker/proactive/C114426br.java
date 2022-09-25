package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.libraries.search.assistant.proactive.C36207ac;
import com.google.android.libraries.search.assistant.proactive.C36334o;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;
import com.google.common.p4552o.ajy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.br */
/* compiled from: PG */
public final /* synthetic */ class C114426br implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317279a;

    /* renamed from: b */
    public final /* synthetic */ aas f317280b;

    /* renamed from: c */
    public final /* synthetic */ ajy f317281c;

    /* renamed from: d */
    public final /* synthetic */ C36334o f317282d;

    public /* synthetic */ C114426br(C114464db dbVar, aas aas, ajy ajy, C36334o oVar) {
        this.f317279a = dbVar;
        this.f317280b = aas;
        this.f317281c = ajy;
        this.f317282d = oVar;
    }

    public final C60870cx apply(Object obj) {
        C114464db dbVar = this.f317279a;
        aas aas = this.f317280b;
        ajy ajy = this.f317281c;
        C36334o oVar = this.f317282d;
        C36207ac acVar = (C36207ac) obj;
        int i = acVar.f94595b;
        if (i == 2) {
            return C60856cj.m92899h(new C114463da(C51962fo.THROTTLED, acVar.f94594a));
        }
        if (i == 3) {
            dbVar.f317399t.mo101317a(aas, ajy, C51962fo.THROTTLED, (String) null, acVar.f94594a);
        }
        return dbVar.mo101330h(aas, oVar, ajy);
    }
}
