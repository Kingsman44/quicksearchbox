package com.google.android.apps.search.googleapp.stampviewer.webview;

import com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.AutoValue_AmpPostMessageConfig;
import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.WebConfig;
import com.google.android.libraries.web.contrib.thirdparty.ThirdPartyFeature;
import com.google.android.libraries.web.webview.contrib.setup.WebViewSetupFeature;
import com.google.android.libraries.web.webview.contrib.stuckjs.StuckJsFeature;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.a */
/* compiled from: PG */
public final class C139505a {

    /* renamed from: a */
    private final Optional f379311a;

    /* renamed from: b */
    private final boolean f379312b;

    public C139505a(Optional optional, boolean z) {
        this.f379311a = optional;
        this.f379312b = z;
    }

    /* renamed from: a */
    public final WebConfig mo115013a() {
        C43259j jVar = new C43259j();
        jVar.mo46372b(StuckJsFeature.m78405e(), ThirdPartyFeature.f114060a, WebViewSetupFeature.m78387d(C139514aa.class));
        jVar.mo46374d(new AutoValue_AmpPostMessageConfig(((Boolean) this.f379311a.orElse(false)).booleanValue()));
        jVar.f113058a = this.f379312b;
        jVar.f113061d = 0;
        return jVar.mo46371a();
    }
}
