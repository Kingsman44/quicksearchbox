package com.google.apps.tiktok.dataservice;

import android.net.Uri;
import android.os.Bundle;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.apps.tiktok.dataservice.n */
/* compiled from: PG */
final class C46874n implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C46877q f122303a;

    /* renamed from: b */
    private final Uri f122304b;

    /* renamed from: c */
    private final String[] f122305c;

    /* renamed from: d */
    private final Bundle f122306d;

    /* renamed from: e */
    private final C46876p f122307e;

    public C46874n(C46877q qVar, Uri uri, String[] strArr, Bundle bundle) {
        this.f122303a = qVar;
        this.f122304b = uri;
        this.f122305c = strArr;
        this.f122306d = bundle;
        this.f122307e = new C46876p(qVar, uri);
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        return new C46463o(this.f122303a.mo50871a(this.f122304b, this.f122305c, this.f122306d).f121591a.mo57272e(C47810es.m84970j(new C46873m(this)), C60826bg.f164896a));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo18088c() {
        return this.f122307e;
    }
}
