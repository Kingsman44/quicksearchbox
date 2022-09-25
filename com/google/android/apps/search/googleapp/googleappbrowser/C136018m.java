package com.google.android.apps.search.googleapp.googleappbrowser;

import android.app.assist.AssistContent;
import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.activity.C133416bc;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.C135588a;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10294h.C135854a;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10298l.C135870a;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10298l.C135871b;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.webfeature.AutoValue_ReadabilityFeature;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs.C135948d;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135456b;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.googleappbrowser.p10262c.C135543c;
import com.google.android.apps.search.googleapp.googleappbrowser.p10264e.C135576c;
import com.google.android.apps.search.googleapp.googleappbrowser.p10264e.p10267c.C135577a;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.p10117aa.C133105aw;
import com.google.android.apps.search.googleapp.p10117aa.p10118a.C133081f;
import com.google.android.apps.search.googleapp.p10117aa.p10119b.C133110a;
import com.google.android.apps.search.googleapp.p10117aa.p10120c.C133116a;
import com.google.android.apps.search.googleapp.p10335j.C136370a;
import com.google.android.apps.search.googleapp.p10527u.C139761b;
import com.google.android.apps.search.googleapp.p10527u.C139768i;
import com.google.android.apps.search.googleapp.p10527u.C139775p;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139680b;
import com.google.android.apps.search.googleapp.startup.p10514a.C139676e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.C43265p;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.contrib.contextmenu.AutoValue_ContextMenuFeature;
import com.google.android.libraries.web.contrib.contextmenu.C43440b;
import com.google.android.libraries.web.contrib.contextmenu.internal.ContextMenuWebFragmentObserver;
import com.google.android.libraries.web.contrib.debug.C43471c;
import com.google.android.libraries.web.contrib.debug.C43474f;
import com.google.android.libraries.web.contrib.debug.DebugFeature;
import com.google.android.libraries.web.contrib.favicon.C43546e;
import com.google.android.libraries.web.contrib.favicon.internal.FaviconWebFragmentObserver;
import com.google.android.libraries.web.contrib.fullscreen.FullScreenFeature;
import com.google.android.libraries.web.contrib.googlesignin.C43586d;
import com.google.android.libraries.web.contrib.googlesignin.GoogleSignInFeature;
import com.google.android.libraries.web.contrib.jsclose.C43669a;
import com.google.android.libraries.web.contrib.jsclose.JsCloseFeature;
import com.google.android.libraries.web.contrib.logging.LoggingFeature;
import com.google.android.libraries.web.contrib.thirdparty.ThirdPartyFeature;
import com.google.android.libraries.web.p3345b.p3346a.C43231b;
import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.android.libraries.web.shared.contrib.C44086d;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.android.libraries.web.weblayer.contrib.contactpicker.AutoValue_ContactPickerFeature;
import com.google.android.libraries.web.weblayer.contrib.crashreport.AutoValue_CrashReportFeature;
import com.google.android.libraries.web.weblayer.contrib.footprints.AutoValue_FootprintsFeature;
import com.google.android.libraries.web.weblayer.contrib.footprints.C44205b;
import com.google.android.libraries.web.weblayer.contrib.footprints.internal.FootprintsWebFragmentObserver;
import com.google.android.libraries.web.weblayer.contrib.medianotification.AutoValue_MediaNotificationFeature;
import com.google.android.libraries.web.weblayer.contrib.microphone.AutoValue_MicrophoneFeature;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.common.p4526f.C59071e;
import java.util.List;
import p3186j$.util.Optional;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.m */
/* compiled from: PG */
public final class C136018m implements C139768i, C139761b, C133416bc {

    /* renamed from: a */
    public static final C59071e f370425a = C59071e.m91331h();

    /* renamed from: b */
    public final C135462h f370426b;

    /* renamed from: c */
    public final GoogleAppBrowserCoordinatorFragment f370427c;

    /* renamed from: d */
    public final C139680b f370428d;

    /* renamed from: e */
    public final C28306ab f370429e;

    /* renamed from: f */
    public final C139676e f370430f;

    /* renamed from: g */
    public final Optional f370431g;

    /* renamed from: h */
    public final C135543c f370432h;

    /* renamed from: i */
    public final C46855i f370433i;

    /* renamed from: j */
    public final boolean f370434j;

    /* renamed from: k */
    public final C136016k f370435k = new C136016k(this);

    /* renamed from: l */
    private final AccountId f370436l;

    /* renamed from: m */
    private final C135514bg f370437m;

    /* renamed from: n */
    private final C136370a f370438n;

    /* renamed from: o */
    private final boolean f370439o;

    /* renamed from: p */
    private final IncognitoLifecycleObserver f370440p;

    /* renamed from: q */
    private final C133110a f370441q;

    public C136018m(C135462h hVar, AccountId accountId, GoogleAppBrowserCoordinatorFragment googleAppBrowserCoordinatorFragment, C139680b bVar, C28306ab abVar, C135514bg bgVar, C136370a aVar, boolean z, C139676e eVar, Optional optional, C135543c cVar, C46855i iVar, IncognitoLifecycleObserver incognitoLifecycleObserver, boolean z2, C133110a aVar2) {
        C136370a aVar3 = aVar;
        C139676e eVar2 = eVar;
        C135543c cVar2 = cVar;
        C46855i iVar2 = iVar;
        IncognitoLifecycleObserver incognitoLifecycleObserver2 = incognitoLifecycleObserver;
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar, "criticalStartupUiInteractivePublisher");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(aVar3, "gabInGaaExperienceChecker");
        C69664n.m101061g(eVar2, "firstDrawRunner");
        C69664n.m101061g(cVar2, "firstRunDataAccessor");
        C69664n.m101061g(iVar2, "localSubscriptionMixin");
        C69664n.m101061g(incognitoLifecycleObserver2, "incognitoLifecycleObserver");
        this.f370426b = hVar;
        this.f370436l = accountId;
        this.f370427c = googleAppBrowserCoordinatorFragment;
        this.f370428d = bVar;
        this.f370429e = abVar;
        this.f370437m = bgVar;
        this.f370438n = aVar3;
        this.f370439o = z;
        this.f370430f = eVar2;
        this.f370431g = optional;
        this.f370432h = cVar2;
        this.f370433i = iVar2;
        this.f370440p = incognitoLifecycleObserver2;
        this.f370434j = z2;
        this.f370441q = aVar2;
        incognitoLifecycleObserver.mo112948g();
    }

    /* renamed from: a */
    public final void mo111136a(AssistContent assistContent) {
        C69664n.m101061g(assistContent, "outContent");
        C136020o k = mo112687k();
        if (k != null) {
            k.mo17754z().mo112760e(assistContent);
        }
    }

    /* renamed from: b */
    public final void mo111219b(C139779t tVar) {
        C69664n.m101061g(tVar, "destinationTab");
        if (this.f370438n.mo112949a()) {
            mo112689m();
        }
    }

    /* renamed from: c */
    public final void mo111220c(C139775p pVar) {
        C135456b bVar;
        C69664n.m101061g(pVar, "tabParams");
        if (this.f370438n.mo112949a()) {
            mo112690n();
        }
        C136020o k = mo112687k();
        if (k != null) {
            C136109q a = k.mo17754z();
            if (pVar.f379890a == 7) {
                bVar = (C135456b) pVar.f379891b;
            } else {
                bVar = C135456b.f369035c;
            }
            a.mo112761f(bVar.f369038b);
        }
    }

    /* renamed from: d */
    public final void mo111221d() {
        C136020o k = mo112687k();
        if (k != null) {
            C136109q a = k.mo17754z();
            if (a.f370707y && a.f370701s.mo110979b()) {
                C133081f fVar = a.f370695m;
                String str = a.f370704v.mo46384b().f112969h;
                str.getClass();
                fVar.mo110970a(str);
            }
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void mo111222e() {
    }

    /* renamed from: f */
    public final boolean mo111223f() {
        return this.f370441q.mo110979b();
    }

    /* renamed from: g */
    public final boolean mo111224g() {
        C136020o k = mo112687k();
        if (k != null) {
            return k.mo17754z().mo112763h();
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo111225h() {
        C135948d b;
        C136020o k = mo112687k();
        if (k != null) {
            C136109q a = k.mo17754z();
            if (!a.f370701s.mo110979b() || a.f370680B || (b = a.mo112757b()) == null || b.mo17754z().f370260i.mo112645g()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo111226i() {
        return this.f370439o;
    }

    /* renamed from: j */
    public final boolean mo111227j() {
        return false;
    }

    /* renamed from: k */
    public final C136020o mo112687k() {
        C43264o oVar = (C43264o) this.f370427c.getChildFragmentManager().f634a.mo671c("web_coordinator_fragment");
        return (C136020o) (oVar != null ? oVar.mo17754z().mo46379a() : null);
    }

    /* renamed from: l */
    public final void mo112688l() {
        if (mo112687k() == null) {
            AccountId accountId = this.f370436l;
            C135514bg bgVar = this.f370437m;
            String str = this.f370426b.f369065e;
            C69664n.m101060f(str, "it");
            if (str.length() <= 0) {
                str = null;
            }
            C136010h hVar = bgVar.f369157g;
            C43259j jVar = new C43259j();
            jVar.f113065h = true;
            if (hVar.f370418a) {
                jVar.f113068k = 143347;
            }
            jVar.f113060c = C43271v.WEB_LAYER;
            jVar.f113064g = true;
            jVar.f113067j = true;
            jVar.f113069l = bgVar.f369156f;
            List list = jVar.f113070m;
            WebFeature[] webFeatureArr = new WebFeature[12];
            C44085c cVar = new C44085c();
            cVar.f114767d.add(ContextMenuWebFragmentObserver.class);
            cVar.mo47057b(C43440b.class, C135588a.class);
            webFeatureArr[0] = new AutoValue_ContextMenuFeature(cVar.mo47056a());
            webFeatureArr[1] = FullScreenFeature.f113728a;
            webFeatureArr[2] = JsCloseFeature.m77046d(true != bgVar.f369152b.mo112949a() ? C43669a.class : C135854a.class);
            webFeatureArr[3] = ThirdPartyFeature.f114060a;
            webFeatureArr[4] = new AutoValue_CrashReportFeature();
            webFeatureArr[5] = new AutoValue_MediaNotificationFeature();
            webFeatureArr[6] = new AutoValue_MicrophoneFeature();
            webFeatureArr[7] = new AutoValue_ContactPickerFeature();
            C43586d e = GoogleSignInFeature.m76919e();
            e.f113776b = C135870a.class;
            e.f113777c = C135871b.class;
            webFeatureArr[8] = e.mo46642c();
            webFeatureArr[9] = LoggingFeature.m77099d(C135576c.class);
            C44085c a = C44086d.m77839a();
            a.f114764a = true;
            a.f114767d.add(FootprintsWebFragmentObserver.class);
            a.mo47057b(C44205b.class, C135577a.class);
            webFeatureArr[10] = new AutoValue_FootprintsFeature(a.mo47056a());
            C43471c g = DebugFeature.m76710g();
            g.mo46551b(C43474f.GOOGLE_APP_BROWSER);
            g.mo46552c(30);
            webFeatureArr[11] = g.mo46555d();
            C69540x.m100811r(list, C69540x.m100947e(webFeatureArr));
            if (((int) bgVar.f369155e) == 0 && (bgVar.f369153c || bgVar.f369154d)) {
                jVar.f113070m.add(new AutoValue_ReadabilityFeature());
            }
            if (bgVar.f369151a.mo110979b()) {
                if (str == null) {
                    str = C133116a.m216079a();
                }
                jVar.f113062e = str;
                C43231b.m76217a(jVar.f113071n, C43546e.class).add(C133105aw.class);
                jVar.f113072o.add(FaviconWebFragmentObserver.class);
            }
            C43264o a2 = C43265p.m76349a(accountId, jVar.mo46371a());
            C0154a aVar = new C0154a(this.f370427c.getChildFragmentManager());
            aVar.mo689v(R.id.googleapp_browser_root, a2, "web_coordinator_fragment");
            aVar.mo509f();
            a2.mo17754z().mo46380b(C136109q.m221146a(this.f370436l, this.f370426b));
        }
    }

    /* renamed from: m */
    public final void mo112689m() {
        this.f370427c.requireActivity().getWindow().setSoftInputMode(32);
    }

    /* renamed from: n */
    public final void mo112690n() {
        this.f370427c.requireActivity().getWindow().setSoftInputMode(16);
    }
}
