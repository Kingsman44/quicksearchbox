package com.google.android.apps.search.googleapp.compliance.p10147d;

import android.net.Uri;
import com.google.android.libraries.web.profile.p3439b.C44064c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61363ae;

/* renamed from: com.google.android.apps.search.googleapp.compliance.d.f */
/* compiled from: PG */
public final /* synthetic */ class C133630f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133637m f364017a;

    public /* synthetic */ C133630f(C133637m mVar) {
        this.f364017a = mVar;
    }

    public final C60870cx apply(Object obj) {
        C133637m mVar = this.f364017a;
        C61363ae aeVar = new C61363ae();
        aeVar.mo57933b("GET");
        aeVar.mo57932a(C61362ad.m93870b("Cache-Control"), "no-cache, no-store");
        Uri.Builder a = mVar.mo111302a();
        a.path("preferences");
        a.appendQueryParameter("output", "base64");
        return C47633f.m84733g(mVar.f364033e.mo111320a()).mo51516i(new C133635k(aeVar, (C44064c) obj, a.build().toString()), mVar.f364030b);
    }
}
