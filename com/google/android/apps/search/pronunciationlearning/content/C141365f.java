package com.google.android.apps.search.pronunciationlearning.content;

import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.concurrent.C46464p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58890d;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.pronunciationlearning.content.f */
/* compiled from: PG */
public final /* synthetic */ class C141365f implements C46464p {

    /* renamed from: a */
    public final /* synthetic */ C141366g f383764a;

    /* renamed from: b */
    public final /* synthetic */ String f383765b;

    public /* synthetic */ C141365f(C141366g gVar, String str) {
        this.f383764a = gVar;
        this.f383765b = str;
    }

    /* renamed from: a */
    public final C46463o mo18057a() {
        C60870cx cxVar;
        C141366g gVar = this.f383764a;
        String str = this.f383765b;
        if (str == null) {
            cxVar = gVar.mo116389a();
        } else {
            String c = C58890d.m90988c(str);
            if ("es".equals(c) || "hi".equals(c)) {
                C60870cx d = gVar.f383767b.mo46042d();
                C141361b bVar = new C141361b(gVar, c);
                cxVar = C60922j.m93044g(d, C47810es.m84963c(bVar), gVar.f383768c);
            } else {
                cxVar = gVar.mo116389a();
            }
        }
        return new C46463o(new C60817ay(cxVar));
    }
}
