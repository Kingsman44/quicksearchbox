package com.google.android.apps.search.googleapp.search.settings.safesearch;

import com.google.android.apps.search.googleapp.config.C133665d;
import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.base.WebConfig;
import com.google.android.libraries.web.contrib.googlesignin.GoogleSignInFeature;
import com.google.android.libraries.web.p3345b.C43229a;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.safesearch.l */
/* compiled from: PG */
public final class C137690l implements C43229a {

    /* renamed from: a */
    private final C133665d f374507a;

    public C137690l(C133665d dVar) {
        this.f374507a = dVar;
    }

    /* renamed from: a */
    public final WebConfig mo46279a() {
        C43259j jVar = new C43259j();
        jVar.mo46375e(this.f374507a.mo111322c());
        jVar.f113060c = C43271v.WEB_VIEW;
        jVar.f113063f = true;
        jVar.mo46372b(GoogleSignInFeature.m76919e().mo46642c());
        return jVar.mo46371a();
    }
}
