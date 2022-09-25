package com.google.android.apps.gsa.assistant.settings.features.p563ap;

import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.assistant.settings.p526e.C9751c;
import com.google.android.apps.gsa.assistant.settings.shared.a.b;
import com.google.android.apps.gsa.assistant.settings.shared.p5792c.C73740a;
import com.google.android.apps.gsa.n.g.l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.speech.helper.crossprofile.C92331p;
import com.google.android.apps.gsa.speech.helper.crossprofile.C92334s;
import com.google.android.enterprise.connectedapps.C142574h;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ap.b */
/* compiled from: PG */
public final class C10184b implements C73740a {

    /* renamed from: a */
    public static final C59071e f34598a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.features.ap.b");

    /* renamed from: b */
    public final C9751c f34599b;

    /* renamed from: c */
    private final C90021c f34600c;

    /* renamed from: d */
    private final b f34601d;

    /* renamed from: e */
    private final C91097g f34602e;

    /* renamed from: f */
    private final C86054o f34603f;

    /* renamed from: g */
    private final l f34604g;

    /* renamed from: h */
    private final C39141kp f34605h;

    /* renamed from: i */
    private final C92331p f34606i;

    public C10184b(C90021c cVar, C9751c cVar2, b bVar, C91097g gVar, C92331p pVar, C86054o oVar, l lVar, C39141kp kpVar) {
        this.f34600c = cVar;
        this.f34599b = cVar2;
        this.f34601d = bVar;
        this.f34602e = gVar;
        this.f34606i = pVar;
        this.f34603f = oVar;
        this.f34604g = lVar;
        this.f34605h = kpVar;
    }

    /* renamed from: a */
    public final String mo18002a() {
        return "productivitySystemInterface";
    }

    @JavascriptInterface
    public void addNewGoogleAccount() {
        this.f34602e.mo65089a(new Intent("android.settings.ADD_ACCOUNT_SETTINGS").setFlags(268435456).putExtra("account_types", new String[]{"com.google"}));
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18003b() {
    }

    @JavascriptInterface
    public boolean canRequestInteractAcrossProfiles() {
        return this.f34606i.mo86986a();
    }

    @JavascriptInterface
    public int getVersion() {
        return 2;
    }

    @JavascriptInterface
    public int getWorkProfileStatus() {
        C92331p pVar = this.f34606i;
        C92334s sVar = pVar.f257434b;
        int i = 2;
        if (sVar != null && sVar.mo117175b().mo117165q()) {
            if (C142574h.m231178b(pVar.f257434b.mo117178i().f386862c)) {
                i = 5;
            } else if (C142574h.m231177a(pVar.f257434b.mo117178i().f386862c)) {
                i = true != pVar.f257434b.mo117184j().mo117170a() ? 3 : 4;
            }
        }
        return i - 1;
    }

    @JavascriptInterface
    public boolean reloadOnDeviceMultiAccountConfiguration() {
        boolean z;
        String F;
        if (this.f34600c.mo79746e(C90059dk.f249073aj) && (F = this.f34603f.mo79659F()) != null) {
            z = this.f34604g.b(F, C65753ak.ASSISTANT_SETTINGS);
        } else {
            z = false;
        }
        ((C19567d) this.f34605h.f102802M.mo6453a()).mo24822a(1, Boolean.valueOf(z));
        return z;
    }

    @JavascriptInterface
    public void requestAdditionalAuthTokens(String[] strArr) {
        C60856cj.m92911t(C60838bs.m92859i(this.f34601d.a(TextUtils.join(" ", strArr), Duration.ofMillis(this.f34600c.mo79743a(C90059dk.f249091bA)))), new C10182a(this), C60826bg.f164896a);
    }

    @JavascriptInterface
    public boolean requestInteractAcrossProfiles() {
        C92331p pVar = this.f34606i;
        Intent intent = null;
        if (pVar.f257433a != null && pVar.mo86986a()) {
            intent = pVar.f257433a.createRequestInteractAcrossProfilesIntent();
        }
        if (intent == null) {
            return false;
        }
        return this.f34602e.mo65089a(intent);
    }
}
