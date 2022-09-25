package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.File;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.r */
/* compiled from: PG */
public final /* synthetic */ class C138292r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ OneSearchImageProvider f376244a;

    /* renamed from: b */
    public final /* synthetic */ Optional f376245b;

    /* renamed from: c */
    public final /* synthetic */ String f376246c;

    public /* synthetic */ C138292r(OneSearchImageProvider oneSearchImageProvider, Optional optional, String str) {
        this.f376244a = oneSearchImageProvider;
        this.f376245b = optional;
        this.f376246c = str;
    }

    public final C60870cx apply(Object obj) {
        OneSearchImageProvider oneSearchImageProvider = this.f376244a;
        Optional optional = this.f376245b;
        String str = this.f376246c;
        optional.ifPresent(new C138288n(oneSearchImageProvider));
        C138279e eVar = oneSearchImageProvider.f376213g.f376235a;
        C138276b bVar = new C138276b(eVar, (File) obj, str);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(bVar), eVar.f376226b);
        C60870cx cxVar = (C60870cx) oneSearchImageProvider.f376212f.putIfAbsent(str, n);
        if (cxVar == null) {
            return n;
        }
        n.cancel(false);
        return cxVar;
    }
}
