package com.google.android.apps.search.googleapp.collections.p10143b;

import android.net.Uri;
import com.google.android.libraries.web.base.C43261l;
import com.google.android.libraries.web.base.C43262m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.googleapp.collections.b.c */
/* compiled from: PG */
public final class C133502c {

    /* renamed from: a */
    private final C43262m f363761a;

    /* renamed from: b */
    private final C133501b f363762b;

    /* renamed from: c */
    private final C133503d f363763c;

    public C133502c(C43262m mVar, C133501b bVar, C133503d dVar) {
        this.f363761a = mVar;
        this.f363762b = bVar;
        this.f363763c = dVar;
    }

    /* renamed from: a */
    public final void mo111204a(String str) {
        C43262m mVar = this.f363761a;
        C133501b bVar = this.f363762b;
        String uri = this.f363763c.mo111205a(Uri.parse(str)).toString();
        C60870cx a = bVar.f363760a.mo115317a(true, true);
        C133500a aVar = new C133500a(uri);
        C43261l.m76332a(mVar, C60922j.m93044g(a, C47810es.m84963c(aVar), C60826bg.f164896a));
    }
}
