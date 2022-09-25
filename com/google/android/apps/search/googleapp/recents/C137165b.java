package com.google.android.apps.search.googleapp.recents;

import android.graphics.Bitmap;
import com.google.android.apps.search.googleapp.p10535w.C139855a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.File;

/* renamed from: com.google.android.apps.search.googleapp.recents.b */
/* compiled from: PG */
public final /* synthetic */ class C137165b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C137177k f373232a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f373233b;

    public /* synthetic */ C137165b(C137177k kVar, Bitmap bitmap) {
        this.f373232a = kVar;
        this.f373233b = bitmap;
    }

    public final C60870cx apply(Object obj) {
        return C47633f.m84733g(this.f373232a.f373269c.f380160b.mo19399b(C47810es.m84978r(new C139855a(this.f373233b, (File) obj))));
    }
}
