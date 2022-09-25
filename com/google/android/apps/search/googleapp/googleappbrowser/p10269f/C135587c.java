package com.google.android.apps.search.googleapp.googleappbrowser.p10269f;

import com.google.android.libraries.search.udcdataservice.C41385a;
import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41409h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.f.c */
/* compiled from: PG */
public final class C135587c {

    /* renamed from: a */
    public static final C59071e f369324a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.f.c");

    /* renamed from: b */
    private final C41409h f369325b;

    /* renamed from: c */
    private final C60887da f369326c;

    public C135587c(C41409h hVar, C60887da daVar) {
        this.f369325b = hVar;
        this.f369326c = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo112395a() {
        C60870cx b = this.f369325b.mo43949b(new C41387c[]{C41387c.WEB_AND_APP_HISTORY}, C41385a.GOOGLE_APP_BROWSER);
        C135585a aVar = C135585a.f369322a;
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(aVar), this.f369326c);
        C135586b bVar = C135586b.f369323a;
        return C60846c.m92878g(g, Exception.class, C47810es.m84963c(bVar), this.f369326c);
    }
}
