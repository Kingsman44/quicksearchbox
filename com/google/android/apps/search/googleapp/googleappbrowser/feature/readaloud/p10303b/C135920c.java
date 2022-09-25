package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10303b;

import com.google.android.libraries.web.p3353c.C43378w;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63033ey;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.b.c */
/* compiled from: PG */
public final /* synthetic */ class C135920c implements C43378w {

    /* renamed from: a */
    public final /* synthetic */ C135923f f370178a;

    public /* synthetic */ C135920c(C135923f fVar) {
        this.f370178a = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo46481a(Object obj) {
        C135923f fVar = this.f370178a;
        String str = (String) obj;
        if (str.isEmpty()) {
            return C60866ct.f164955a;
        }
        C46407v vVar = fVar.f370181a;
        C63033ey a = C63033ey.m95859a(str);
        C60870cx a2 = fVar.f370184d.mo112395a();
        C135918a aVar = new C135918a(fVar, str);
        C60870cx f = vVar.mo50346f(a, C60922j.m93045h(a2, C47810es.m84966f(aVar), C60826bg.f164896a));
        C135922e eVar = C135922e.f370180a;
        return C60922j.m93044g(f, C47810es.m84963c(eVar), C60826bg.f164896a);
    }
}
