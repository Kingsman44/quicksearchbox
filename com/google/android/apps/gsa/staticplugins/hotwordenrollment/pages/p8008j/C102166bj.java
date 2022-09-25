package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.content.Context;
import android.databinding.C0118a;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7970b.C101501b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101765e;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7832g.C99787a;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7832g.C99788b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.setupcompat.p3549a.C45238a;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.android.setupcompat.p3549a.C45241d;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.p4184bj.p4193c.p4195b.p4196a.C55914b;
import dagger.C68214a;
import java.util.Locale;
import java.util.WeakHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.bj */
/* compiled from: PG */
public final class C102166bj extends C102193x implements C101501b {

    /* renamed from: a */
    public static final C59071e f285000a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.bj");

    /* renamed from: k */
    private static final C58528ij f285001k = C58528ij.m90012L(C55914b.BLUE_BAR, C55914b.SRP_VOICE_SEARCH_PROMO, C55914b.VOICE_SEARCH_MIC_TAP);

    /* renamed from: b */
    public C68214a f285002b;

    /* renamed from: c */
    public C86124t f285003c;

    /* renamed from: d */
    public C68214a f285004d;

    /* renamed from: e */
    public C22871g f285005e;

    /* renamed from: f */
    public C86054o f285006f;

    /* renamed from: g */
    public View f285007g;

    /* renamed from: h */
    public WebView f285008h;

    /* renamed from: i */
    public int f285009i = 1;

    /* renamed from: j */
    public C99788b f285010j;

    /* renamed from: l */
    private C102168bl f285011l;

    /* renamed from: m */
    private C45241d f285012m;

    /* renamed from: g */
    private final boolean m169214g() {
        return f285001k.contains((C55914b) getArguments().getSerializable("entry_point"));
    }

    /* renamed from: a */
    public final void mo92348a() {
        ((C89859i) this.f285004d.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_VAA_CONSENT_WEB_VIEW_EXIT);
        C101765e eVar = new C101765e();
        eVar.mo92562b(-1);
        eVar.f283865a = null;
        C47393f.m84236g(eVar.mo92561a(), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r0 == com.google.android.apps.gsa.assistant.p510b.p511a.C9439b.DEFERRED_ANDROID_SETUP_WIZARD) goto L_0x0036;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo92920e() {
        /*
            r3 = this;
            boolean r0 = r3.m169214g()
            if (r0 != 0) goto L_0x004e
            com.google.android.setupcompat.a.d r0 = r3.f285012m
            if (r0 == 0) goto L_0x004e
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.bl r0 = r3.f285011l
            int r0 = r0.f285017c
            com.google.android.apps.gsa.assistant.b.a.b r0 = com.google.android.apps.gsa.assistant.p510b.p511a.C9439b.m23955a(r0)
            if (r0 != 0) goto L_0x0016
            com.google.android.apps.gsa.assistant.b.a.b r0 = com.google.android.apps.gsa.assistant.p510b.p511a.C9439b.UNKNOWN_ENTRY
        L_0x0016:
            com.google.android.apps.gsa.assistant.b.a.b r1 = com.google.android.apps.gsa.assistant.p510b.p511a.C9439b.OPA_HOTWORD_ENROLLMENT
            if (r0 == r1) goto L_0x0036
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.bl r0 = r3.f285011l
            int r0 = r0.f285017c
            com.google.android.apps.gsa.assistant.b.a.b r1 = com.google.android.apps.gsa.assistant.p510b.p511a.C9439b.m23955a(r0)
            if (r1 != 0) goto L_0x0026
            com.google.android.apps.gsa.assistant.b.a.b r1 = com.google.android.apps.gsa.assistant.p510b.p511a.C9439b.UNKNOWN_ENTRY
        L_0x0026:
            com.google.android.apps.gsa.assistant.b.a.b r2 = com.google.android.apps.gsa.assistant.p510b.p511a.C9439b.ANDROID_SETUP_WIZARD
            if (r1 == r2) goto L_0x0036
            com.google.android.apps.gsa.assistant.b.a.b r0 = com.google.android.apps.gsa.assistant.p510b.p511a.C9439b.m23955a(r0)
            if (r0 != 0) goto L_0x0032
            com.google.android.apps.gsa.assistant.b.a.b r0 = com.google.android.apps.gsa.assistant.p510b.p511a.C9439b.UNKNOWN_ENTRY
        L_0x0032:
            com.google.android.apps.gsa.assistant.b.a.b r1 = com.google.android.apps.gsa.assistant.p510b.p511a.C9439b.DEFERRED_ANDROID_SETUP_WIZARD
            if (r0 != r1) goto L_0x004e
        L_0x0036:
            android.view.View r0 = r3.f285007g
            r1 = 2131432356(0x7f0b13a4, float:1.8486467E38)
            android.view.View r0 = r0.findViewById(r1)
            com.google.android.setupdesign.view.IllustrationVideoView r0 = (com.google.android.setupdesign.view.IllustrationVideoView) r0
            com.google.android.setupcompat.a.d r1 = r3.f285012m
            r1.getClass()
            int r2 = r1.f118174c
            java.lang.String r1 = r1.f118172a
            r0.mo49265c(r2, r1)
            return r0
        L_0x004e:
            android.view.View r0 = r3.f285007g
            r1 = 2131432947(0x7f0b15f3, float:1.8487666E38)
            android.view.View r0 = r0.findViewById(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j.C102166bj.mo92920e():android.view.View");
    }

    /* renamed from: f */
    public final void mo92921f(int i) {
        WeakHashMap weakHashMap = C47831fm.f123851a;
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.VOICE_MATCH_VAA_CONSENT_WEB_VIEW_CONTINUE;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        cbVar.f160111aw = i - 1;
        cbVar.f160122c |= 524288;
        fVar.f246203c = (C59687cb) ajVar.build();
        ((C89859i) this.f285004d.mo27525b()).mo74236a(fVar.mo83699a());
        if (m169214g()) {
            if (i == 3 || i == 2 || i == 4) {
                this.f285009i = 2;
                if (getActivity() != null) {
                    getActivity().setResult(-1);
                }
            } else {
                this.f285009i = 3;
            }
            if (getActivity() != null) {
                getActivity().finish();
                return;
            }
            return;
        }
        C59071e eVar = f285000a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20605)).mo56386p("Move to next Screen!");
        if (getView() != null) {
            C47393f.m84236g(new C101783w(), this);
        } else {
            C0118a.m96d(eVar.mo56225c(), "View is null!", 20606, C58979ad.FULL);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!m169214g()) {
            C102168bl blVar = (C102168bl) C90734ar.m148199b(getArguments(), "vaa_consent_fragment_args", C102168bl.f285013f.getParserForType());
            C58838bb.m90867b(blVar, "Must supply VAAConsentFragmentArgs under key %s", "vaa_consent_fragment_args");
            this.f285011l = blVar;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        this.f285007g = layoutInflater.inflate(R.layout.vaa_consent_webview, viewGroup, false);
        Context context = layoutInflater.getContext();
        this.f285012m = C45240c.m80574e(context).mo49102f(context, C45238a.CONFIG_PROGRESS_ILLUSTRATION_DEFAULT);
        WebView webView = (WebView) this.f285007g.findViewById(R.id.web_view);
        this.f285008h = webView;
        if (bundle == null) {
            webView.setBackgroundColor(0);
            WebSettings settings = this.f285008h.getSettings();
            settings.setUserAgentString(String.format("%s GSA/%s", new Object[]{settings.getUserAgentString(), this.f285002b.mo27525b()}));
            settings.setJavaScriptEnabled(true);
            C99788b bVar = this.f285010j;
            C102154ay ayVar = new C102154ay(this);
            C102165bi biVar = new C102165bi(new C102163bg(this));
            C84411o oVar = (C84411o) bVar.f279187a.mo17428b();
            oVar.getClass();
            C99787a aVar = new C99787a(ayVar, oVar, biVar);
            mo92920e().setVisibility(0);
            this.f285008h.addJavascriptInterface(aVar, "silk_footprints_consent_ext");
            this.f285008h.setWebViewClient(new C102160bd(this));
            String x = this.f285003c.mo79758x(C90082eg.f250064du);
            String string = getArguments().getString("url_locale");
            if (string == null) {
                string = Locale.getDefault().toLanguageTag();
            }
            Uri.Builder appendQueryParameter = Uri.parse(x).buildUpon().appendQueryParameter("hl", string);
            C55914b bVar2 = (C55914b) getArguments().getSerializable("entry_point");
            if (bVar2 == null) {
                C9439b a = C9439b.m23955a(this.f285011l.f285017c);
                if (a == null) {
                    a = C9439b.UNKNOWN_ENTRY;
                }
                int ordinal = a.ordinal();
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        if (ordinal != 7) {
                            if (ordinal != 15) {
                                if (ordinal != 17) {
                                    if (!(ordinal == 19 || ordinal == 64)) {
                                        bVar2 = C55914b.VM_POST_OOBE;
                                    }
                                }
                            }
                        }
                    }
                    bVar2 = C55914b.VM_OOBE;
                }
                bVar2 = C55914b.VM_RETRAINING;
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("entrypoint", bVar2.name());
            if (this.f285003c.mo79746e(C90082eg.f250062ds)) {
                appendQueryParameter2.appendQueryParameter("debugui", "true");
            }
            String string2 = getArguments().getString("utm_source");
            if (string2 != null && !string2.isEmpty()) {
                appendQueryParameter2.appendQueryParameter("utm_source", string2);
            }
            C102168bl blVar = this.f285011l;
            if (blVar != null) {
                if ((4 & blVar.f285015a) != 0) {
                    appendQueryParameter2.appendQueryParameter("target_user_id", blVar.f285018d);
                }
                C102168bl blVar2 = this.f285011l;
                if ((blVar2.f285015a & 8) != 0) {
                    appendQueryParameter2.appendQueryParameter("parent_user_id", blVar2.f285019e);
                }
            }
            String builder = appendQueryParameter2.toString();
            C86054o oVar2 = this.f285006f;
            C102168bl blVar3 = this.f285011l;
            if (blVar3 != null) {
                str = blVar3.f285016b;
            } else {
                str = getArguments().getString("account");
                if (str == null) {
                    throw null;
                }
            }
            oVar2.mo79677k(oVar2.mo79689w(str), Uri.parse(builder), (String) null, new C102155az(this));
        } else {
            webView.restoreState(bundle);
        }
        return this.f285007g;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f285008h.saveState(bundle);
    }
}
