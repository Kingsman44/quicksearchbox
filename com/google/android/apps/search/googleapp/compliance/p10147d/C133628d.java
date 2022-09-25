package com.google.android.apps.search.googleapp.compliance.p10147d;

import android.util.Base64;
import com.google.android.apps.search.googleapp.compliance.p10144a.C133569t;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.web.profile.p3439b.C44064c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.C61363ae;
import com.google.p395al.p417d.p418a.C8539as;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.apps.search.googleapp.compliance.d.d */
/* compiled from: PG */
public final /* synthetic */ class C133628d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133637m f364013a;

    /* renamed from: b */
    public final /* synthetic */ C8539as f364014b;

    /* renamed from: c */
    public final /* synthetic */ C133569t f364015c;

    public /* synthetic */ C133628d(C133637m mVar, C8539as asVar, C133569t tVar) {
        this.f364013a = mVar;
        this.f364014b = asVar;
        this.f364015c = tVar;
    }

    public final C60870cx apply(Object obj) {
        C133637m mVar = this.f364013a;
        C8539as asVar = this.f364014b;
        C133569t tVar = this.f364015c;
        mVar.f364034f.mo19974a(C37182a.f98138gz);
        String uri = mVar.mo111302a().path("setprefs").appendQueryParameter("prefs", new String(Base64.encode(asVar.toByteArray(), 10), StandardCharsets.UTF_8)).appendQueryParameter("sig", asVar.f29627b).appendQueryParameter("xgaUserInitiated", tVar.f363912c).build().toString();
        C61363ae aeVar = new C61363ae();
        aeVar.mo57933b("GET");
        uri.getClass();
        aeVar.f165930a = uri;
        return C47633f.m84733g(mVar.f364033e.mo111320a()).mo51516i(new C133632h(mVar, aeVar, (C44064c) obj, uri), mVar.f364030b);
    }
}
