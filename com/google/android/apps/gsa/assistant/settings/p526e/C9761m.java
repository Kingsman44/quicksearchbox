package com.google.android.apps.gsa.assistant.settings.p526e;

import android.accounts.Account;
import android.accounts.AccountsException;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.util.Base64;
import android.webkit.WebView;
import android.widget.ViewFlipper;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.p526e.p527a.C9735a;
import com.google.android.apps.gsa.assistant.settings.shared.g.d;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.search.core.C85757cq;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p11026am.C147759b;
import com.google.android.libraries.p11026am.C147764g;
import com.google.assistant.p3861at.aew;
import com.google.assistant.p3861at.aey;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.m */
/* compiled from: PG */
public final class C9761m {

    /* renamed from: a */
    public static final C59071e f33678a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.e.m");

    /* renamed from: b */
    public final C9768t f33679b;

    /* renamed from: c */
    public final C85757cq f33680c;

    /* renamed from: d */
    public final String f33681d;

    /* renamed from: e */
    public final Executor f33682e;

    /* renamed from: f */
    public final C89859i f33683f;

    /* renamed from: g */
    public final Map f33684g = new HashMap();

    /* renamed from: h */
    public ViewFlipper f33685h;

    /* renamed from: i */
    WebView f33686i;

    /* renamed from: j */
    public final C9771w f33687j;

    /* renamed from: k */
    public final C9735a f33688k;

    /* renamed from: l */
    private final C86054o f33689l;

    /* renamed from: m */
    private final h f33690m;

    /* renamed from: n */
    private final C22871g f33691n;

    /* renamed from: o */
    private final C86124t f33692o;

    /* renamed from: p */
    private final C68214a f33693p;

    /* renamed from: q */
    private final String f33694q;

    /* renamed from: r */
    private final C147764g f33695r;

    /* renamed from: s */
    private final C147764g f33696s;

    /* renamed from: t */
    private final C147764g f33697t;

    /* renamed from: u */
    private final Bundle f33698u;

    public C9761m(Executor executor, C86054o oVar, h hVar, C9768t tVar, C85757cq cqVar, C22871g gVar, C86124t tVar2, C68214a aVar, C89859i iVar, C9735a aVar2, Bundle bundle, C9771w wVar, String str, String str2) {
        this.f33682e = executor;
        this.f33689l = oVar;
        this.f33690m = hVar;
        this.f33679b = tVar;
        this.f33680c = cqVar;
        this.f33691n = gVar;
        this.f33692o = tVar2;
        this.f33693p = aVar;
        this.f33687j = wVar;
        this.f33681d = str;
        this.f33694q = str2;
        this.f33683f = iVar;
        this.f33688k = aVar2;
        this.f33698u = bundle;
        this.f33695r = C147759b.m240834b(tVar2.mo79745c(C90059dk.f249051aN));
        this.f33696s = C147759b.m240834b(tVar2.mo79745c(C90059dk.f249050aM));
        this.f33697t = C147759b.m240834b(tVar2.mo79745c(C90059dk.f249049aL));
    }

    /* renamed from: f */
    private static String m24505f(Account account) {
        return account == null ? BuildConfig.FLAVOR : account.name;
    }

    /* renamed from: a */
    public final void mo18019a(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f33687j.f33732a.getActivity() != null) {
            if (z) {
                this.f33683f.mo83702b(C89849ae.OPA_SETTINGS_WEBVIEW_LOAD_FINISHED);
                this.f33683f.mo83702b(C89849ae.OPA_SETTINGS_WEBVIEW_STARTUP_SUCCESS);
                this.f33685h.setDisplayedChild(1);
                return;
            }
            this.f33683f.mo83702b(C89849ae.OPA_SETTINGS_WEBVIEW_STARTUP_ERROR);
            if (this.f33692o.mo79746e(C90059dk.f249047aJ)) {
                this.f33685h.setDisplayedChild(1);
            } else {
                mo18020b(false);
            }
        }
    }

    /* renamed from: b */
    public final void mo18020b(boolean z) {
        Runnable runnable;
        C0167am activity = this.f33687j.f33732a.getActivity();
        if (activity != null) {
            if (z) {
                runnable = new C9756h(this);
            } else {
                runnable = new C9757i(this);
            }
            d.a(activity, runnable);
        }
    }

    /* renamed from: c */
    public final void mo18021c() {
        Uri uri;
        ComponentName callingActivity;
        Uri parse = Uri.parse(this.f33694q);
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.appendQueryParameter("hl", Locale.getDefault().toLanguageTag());
        if (this.f33696s.mo124438c(parse)) {
            aew aew = (aew) aey.f129137e.createBuilder();
            C0167am activity = this.f33687j.f33732a.getActivity();
            if (!(activity == null || (callingActivity = activity.getCallingActivity()) == null)) {
                String packageName = callingActivity.getPackageName();
                C58976aa aaVar = C58975e.f156826a;
                aew.copyOnWrite();
                aey aey = (aey) aew.instance;
                packageName.getClass();
                aey.f129139a |= 2;
                aey.f129140b = packageName;
            }
            if (this.f33697t.mo124438c(parse)) {
                String string = this.f33698u.getString("extra_assistant_settings_entry_source");
                if (!C58837ba.m90859h(string)) {
                    aew.copyOnWrite();
                    aey aey2 = (aey) aew.instance;
                    string.getClass();
                    aey2.f129139a |= 4;
                    aey2.f129141c = string;
                }
            }
            String encodeToString = Base64.encodeToString(((aey) aew.build()).toByteArray(), 10);
            if (!encodeToString.isEmpty()) {
                buildUpon.appendQueryParameter("clientInfo", encodeToString);
            }
        }
        if (!C58837ba.m90859h(parse.getQueryParameter("deviceId"))) {
            uri = buildUpon.build();
        } else {
            if (this.f33695r.mo124438c(parse)) {
                String b = ((C86106b) this.f33693p.mo27525b()).mo79727b();
                if (C58837ba.m90859h(b)) {
                    C59052c cVar = (C59052c) f33678a.mo56226d();
                    cVar.mo56378ag(C58975e.f156826a, this.f33681d);
                    ((C59052c) cVar.mo56372aa(1634)).mo56386p("Failed to retrieve the deviceId.");
                } else {
                    C58976aa aaVar2 = C58975e.f156826a;
                    buildUpon.appendQueryParameter("deviceId", Base64.encodeToString(b.getBytes(StandardCharsets.UTF_8), 10)).build();
                }
            }
            uri = buildUpon.build();
        }
        C58976aa aaVar3 = C58975e.f156826a;
        this.f33685h.setDisplayedChild(0);
        this.f33686i.loadUrl(uri.toString());
        this.f33683f.mo83702b(C89849ae.OPA_SETTINGS_WEBVIEW_LOAD_START);
    }

    /* renamed from: d */
    public final void mo18022d() {
        this.f33691n.mo28208h("Wait for cookies to sync for the new account and account switch to be completed.", this.f33692o.mo79743a(C90059dk.f249144ca), new C9754f(this, m24505f(this.f33690m.a())));
    }

    /* renamed from: e */
    public final boolean mo18023e() {
        String f = m24505f(this.f33689l.mo79668a());
        String f2 = m24505f(this.f33690m.a());
        if (f.equals(f2)) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        try {
            this.f33689l.mo79686t(f2);
            return true;
        } catch (AccountsException e) {
            C59052c cVar = (C59052c) f33678a.mo56225c();
            cVar.mo56378ag(C58975e.f156826a, this.f33681d);
            ((C59052c) ((C59052c) cVar.mo56382g(e)).mo56372aa(1639)).mo56386p("error switching accounts.");
            return true;
        }
    }
}
