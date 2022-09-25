package com.google.android.libraries.web.webview.contrib.setup;

import androidx.lifecycle.C2383n;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.coordinator.internal.fragment.C43751j;
import com.google.android.libraries.web.shared.contrib.C44084b;
import com.google.android.libraries.web.shared.contrib.C44088f;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.web.webview.contrib.setup.f */
/* compiled from: PG */
final class C44387f implements C44088f {

    /* renamed from: a */
    private final C44084b f115397a;

    /* renamed from: b */
    private final C44386e f115398b;

    /* renamed from: c */
    private final C43269t f115399c;

    public C44387f(C44084b bVar, C44386e eVar, C43269t tVar) {
        this.f115397a = bVar;
        this.f115398b = eVar;
        this.f115399c = tVar;
    }

    /* renamed from: g */
    public final void mo42597g() {
        if (this.f115399c.mo46385c().equals(C43271v.WEB_VIEW)) {
            C44386e eVar = this.f115398b;
            C44383b bVar = (C44383b) this.f115397a.mo47055a(WebViewSetupFeature.class, C44383b.class).get();
            C58838bb.m90884s(!eVar.f115393a.getLifecycle().mo5789a().mo5788a(C2383n.STARTED), "WebViewSetupMixin#register must be called at Fragment#onCreate.");
            if (eVar.f115394b.mo46385c().equals(C43271v.WEB_VIEW) && !eVar.f115396d) {
                eVar.f115396d = true;
                eVar.f115395c.f115392a = bVar;
                eVar.f115393a.getLifecycle().mo5790b(new WebViewSetupMixin$1(eVar));
                C43751j.m77264a(eVar.f115393a).mo46776c(new C44384c(eVar));
            }
        }
    }
}
