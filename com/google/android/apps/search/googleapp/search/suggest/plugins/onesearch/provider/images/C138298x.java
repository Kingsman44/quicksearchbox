package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.x */
/* compiled from: PG */
public final /* synthetic */ class C138298x implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ OneSearchImageProvider f376257a;

    /* renamed from: b */
    public final /* synthetic */ String f376258b;

    public /* synthetic */ C138298x(OneSearchImageProvider oneSearchImageProvider, String str) {
        this.f376257a = oneSearchImageProvider;
        this.f376258b = str;
    }

    public final C60870cx apply(Object obj) {
        OneSearchImageProvider oneSearchImageProvider = this.f376257a;
        String str = this.f376258b;
        Exception exc = (Exception) obj;
        ((C59052c) ((C59052c) ((C59052c) OneSearchImageProvider.f376207a.mo56226d()).mo56382g(exc)).mo56372aa(41150)).mo56386p("Failed to fetch image.");
        C60887da daVar = oneSearchImageProvider.f376209c;
        C69464a aVar = oneSearchImageProvider.f376210d;
        Objects.requireNonNull(aVar);
        return C47633f.m84733g(daVar.mo19399b(new C138294t(aVar))).mo51516i(new C138289o(str, exc), oneSearchImageProvider.f376209c);
    }
}
