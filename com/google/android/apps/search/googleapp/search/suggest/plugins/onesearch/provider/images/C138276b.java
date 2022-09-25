package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images;

import com.google.apps.tiktok.tracing.contrib.p3701c.C47639a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.b */
/* compiled from: PG */
public final /* synthetic */ class C138276b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C138279e f376217a;

    /* renamed from: b */
    public final /* synthetic */ File f376218b;

    /* renamed from: c */
    public final /* synthetic */ String f376219c;

    public /* synthetic */ C138276b(C138279e eVar, File file, String str) {
        this.f376217a = eVar;
        this.f376218b = file;
        this.f376219c = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C138279e eVar = this.f376217a;
        File file = this.f376218b;
        String str = this.f376219c;
        SettableFuture settableFuture = new SettableFuture();
        UrlRequest build = ((CronetEngine) eVar.f376227c.mo17428b()).newUrlRequestBuilder(str, new C47639a(new C138278d(file, settableFuture, false)), eVar.f376226b).build();
        settableFuture.mo4106b(new C138275a(settableFuture, build), C60826bg.f164896a);
        build.start();
        return settableFuture;
    }
}
