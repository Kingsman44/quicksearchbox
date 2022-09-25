package com.google.android.apps.search.googleapp.search.settings.p10430f;

import com.google.android.apps.search.googleapp.config.C133665d;
import com.google.android.apps.search.googleapp.p10539y.p10542c.C139895a;
import com.google.android.libraries.search.silk.web.core.C40756j;
import com.google.android.libraries.search.silk.web.core.C40757k;
import com.google.android.libraries.search.silk.web.core.C40758l;
import com.google.android.libraries.search.silk.web.core.C40759m;
import com.google.android.libraries.search.silk.web.settings.AutoValue_SilkSettingsFeature;
import com.google.android.libraries.search.silk.web.settings.AutoValue_SilkSettingsPostMessageConfig;
import com.google.android.libraries.search.silk.web.settings.SilkSettingsMessageHandler;
import com.google.android.libraries.silk.p3205a.p3234w.C41737a;
import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.base.WebConfig;
import com.google.android.libraries.web.contrib.googlesignin.GoogleSignInFeature;
import com.google.android.libraries.web.p3345b.C43229a;
import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.common.p4552o.apk;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.f.i */
/* compiled from: PG */
public final class C137637i implements C43229a {

    /* renamed from: a */
    private final C133665d f374382a;

    /* renamed from: b */
    private final C40758l f374383b;

    public C137637i(C133665d dVar, C40758l lVar) {
        this.f374382a = dVar;
        this.f374383b = lVar;
    }

    /* renamed from: a */
    public final WebConfig mo46279a() {
        C43259j jVar = new C43259j();
        jVar.mo46375e(this.f374382a.mo111322c());
        jVar.f113060c = C43271v.WEB_VIEW;
        jVar.f113063f = true;
        C40758l lVar = this.f374383b;
        C40756j jVar2 = (C40756j) C40757k.f106857c.createBuilder();
        apk apk = apk.TNG_SETTINGS;
        jVar2.copyOnWrite();
        C40757k kVar = (C40757k) jVar2.instance;
        kVar.f106860b = apk.f159677E;
        kVar.f106859a |= 1;
        C139895a aVar = new C139895a();
        C44085c cVar = new C44085c();
        cVar.mo47058c(new AutoValue_SilkSettingsPostMessageConfig());
        cVar.f114767d.add(SilkSettingsMessageHandler.class);
        cVar.mo47057b(C41737a.class, aVar.getClass());
        jVar.mo46372b(GoogleSignInFeature.m76919e().mo46642c(), lVar.mo42702a((C40757k) jVar2.build()), new AutoValue_SilkSettingsFeature(cVar.mo47056a(), C40759m.m70631a(39, new Integer[0])));
        return jVar.mo46371a();
    }
}
