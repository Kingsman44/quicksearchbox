package com.google.android.apps.gsa.staticplugins.webview;

import android.content.Context;
import android.support.p033v7.app.C0401v;
import android.util.LongSparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.C0826b;
import androidx.p201w.C4370n;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.C85747ck;
import com.google.android.apps.gsa.search.core.C85748cl;
import com.google.android.apps.gsa.search.core.C85751co;
import com.google.android.apps.gsa.search.core.C85756cp;
import com.google.android.apps.gsa.search.core.C85757cq;
import com.google.android.apps.gsa.search.core.google.C85854al;
import com.google.android.apps.gsa.search.core.google.C85862at;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6500ac.C84400d;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.search.core.p6519al.p6662co.C85167c;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85424a;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85452b;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85454d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.preferences.notification.C86327b;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.webview.C87260f;
import com.google.android.apps.gsa.search.core.webview.C87266l;
import com.google.android.apps.gsa.search.core.webview.C87273s;
import com.google.android.apps.gsa.search.core.webview.C87276v;
import com.google.android.apps.gsa.search.core.webview.C87278x;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.apps.gsa.search.shared.p6929g.C87553a;
import com.google.android.apps.gsa.search.shared.p6929g.C87554b;
import com.google.android.apps.gsa.search.shared.p6929g.C87555c;
import com.google.android.apps.gsa.search.shared.p6929g.C87557e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.C90117fo;
import com.google.android.apps.gsa.shared.p7066m.C90136o;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90776bt;
import com.google.android.apps.gsa.shared.util.C91033e;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.p7635c.p7636a.C97497b;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7826a.C99748t;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7827b.C99754f;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7827b.C99755g;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7830e.C99777j;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7831f.C99786d;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7833h.C99796h;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7834i.C99814a;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7834i.C99815b;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7835j.C99817b;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7835j.C99818c;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7837l.C99823c;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7837l.C99824d;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7838m.C99825a;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7838m.C99826b;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7839n.C99832f;
import com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h.C116498a;
import com.google.android.apps.gsa.staticplugins.webview.common.ScrollableGsaWebView;
import com.google.android.apps.search.lens.p10547a.C139921f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gcoreclient.p1784p.p1785a.p1786a.p1787a.C21601a;
import com.google.android.libraries.gcoreclient.p1784p.p1785a.p1786a.p1787a.C21603c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.location.p3029a.C38658cb;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.protos.p5124m.p5125a.C65603f;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.bo */
/* compiled from: PG */
public final class C118152bo {

    /* renamed from: a */
    public static final C59071e f327920a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.webview.bo");

    /* renamed from: A */
    private final C99824d f327921A;

    /* renamed from: B */
    private final C97497b f327922B;

    /* renamed from: b */
    public final C68214a f327923b;

    /* renamed from: c */
    public final C86124t f327924c;

    /* renamed from: d */
    public final C68214a f327925d;

    /* renamed from: e */
    public final C22871g f327926e;

    /* renamed from: f */
    public final C22871g f327927f;

    /* renamed from: g */
    public final Object f327928g = new Object();

    /* renamed from: h */
    public final LongSparseArray f327929h;

    /* renamed from: i */
    public final Object f327930i = new Object();

    /* renamed from: j */
    public final Map f327931j;

    /* renamed from: k */
    public boolean f327932k = true;

    /* renamed from: l */
    private final C85748cl f327933l;

    /* renamed from: m */
    private final C118184cr f327934m;

    /* renamed from: n */
    private final Optional f327935n;

    /* renamed from: o */
    private final C118163bz f327936o;

    /* renamed from: p */
    private final C118172ch f327937p;

    /* renamed from: q */
    private final C118250g f327938q;

    /* renamed from: r */
    private final C99786d f327939r;

    /* renamed from: s */
    private final C99796h f327940s;

    /* renamed from: t */
    private final C99832f f327941t;

    /* renamed from: u */
    private final C99777j f327942u;

    /* renamed from: v */
    private final C99815b f327943v;

    /* renamed from: w */
    private final C99748t f327944w;

    /* renamed from: x */
    private final C99755g f327945x;

    /* renamed from: y */
    private final C99818c f327946y;

    /* renamed from: z */
    private final C99826b f327947z;

    public C118152bo(C68214a aVar, C85748cl clVar, C118184cr crVar, C99786d dVar, C99796h hVar, C99832f fVar, C99777j jVar, C99815b bVar, C99748t tVar, C99755g gVar, C99818c cVar, C99826b bVar2, C99824d dVar2, Optional optional, C97497b bVar3, C86124t tVar2, C68214a aVar2, C22871g gVar2, C22871g gVar3, C91022f fVar2, C118163bz bzVar, C118172ch chVar, C118250g gVar4) {
        this.f327923b = aVar;
        this.f327933l = clVar;
        this.f327934m = crVar;
        this.f327939r = dVar;
        this.f327940s = hVar;
        this.f327941t = fVar;
        this.f327942u = jVar;
        this.f327943v = bVar;
        this.f327944w = tVar;
        this.f327935n = optional;
        this.f327922B = bVar3;
        this.f327924c = tVar2;
        this.f327925d = aVar2;
        this.f327926e = gVar2;
        this.f327927f = gVar3;
        this.f327936o = bzVar;
        this.f327937p = chVar;
        this.f327945x = gVar;
        this.f327946y = cVar;
        this.f327947z = bVar2;
        this.f327921A = dVar2;
        this.f327938q = gVar4;
        this.f327929h = new LongSparseArray();
        this.f327931j = new HashMap();
        fVar2.mo85301a(new C118151bn(this));
    }

    /* renamed from: a */
    public final GsaWebViewContainer mo103559a(String str) {
        GsaWebViewContainer gsaWebViewContainer;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f327930i) {
            gsaWebViewContainer = (GsaWebViewContainer) this.f327931j.get(str);
        }
        return gsaWebViewContainer;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final C118119ai mo103560b(C85452b bVar) {
        ScrollableGsaWebView scrollableGsaWebView;
        C22872h.m42743c(C0826b.class);
        C58976aa aaVar = C58975e.f156826a;
        C85424a aVar = (C85424a) bVar;
        C118119ai c = mo103561c(aVar.f231230a);
        if (c == null) {
            C118186ct ctVar = (C118186ct) this.f327923b.mo27525b();
            C116498a aVar2 = aVar.f231231b;
            C118120aj ajVar = ctVar.f328112f;
            C118251h hVar = r3;
            C118251h hVar2 = new C118251h();
            C68214a a = C68219e.m98518a(((C68226l) ajVar.f327846a).f184585a);
            C68214a aVar3 = a;
            a.getClass();
            C86124t tVar = (C86124t) ajVar.f327847b.mo17428b();
            C86124t tVar2 = tVar;
            tVar.getClass();
            C21370a aVar4 = (C21370a) ajVar.f327848c.mo17428b();
            C21370a aVar5 = aVar4;
            aVar4.getClass();
            C85923cq cqVar = (C85923cq) ajVar.f327849d.mo17428b();
            C85923cq cqVar2 = cqVar;
            cqVar.getClass();
            C85929cw cwVar = (C85929cw) ajVar.f327850e.mo17428b();
            C85929cw cwVar2 = cwVar;
            cwVar.getClass();
            C22871g gVar = (C22871g) ajVar.f327851f.mo17428b();
            C22871g gVar2 = gVar;
            gVar.getClass();
            C90931ca caVar = (C90931ca) ajVar.f327852g.mo17428b();
            C90931ca caVar2 = caVar;
            caVar.getClass();
            C85757cq cqVar3 = (C85757cq) ajVar.f327853h.mo17428b();
            C85757cq cqVar4 = cqVar3;
            cqVar3.getClass();
            Context context = (Context) ajVar.f327854i.mo17428b();
            Context context2 = context;
            context.getClass();
            C68214a a2 = C68219e.m98518a(((C68226l) ajVar.f327855j).f184585a);
            C68214a aVar6 = a2;
            a2.getClass();
            C68214a a3 = C68219e.m98518a(((C68226l) ajVar.f327856k).f184585a);
            C118119ai aiVar = r3;
            C68214a aVar7 = a3;
            a3.getClass();
            C85424a aVar8 = aVar;
            C68214a a4 = C68219e.m98518a(((C68226l) ajVar.f327857l).f184585a);
            C118120aj ajVar2 = ajVar;
            C68214a aVar9 = a4;
            a4.getClass();
            ((C90476a) ajVar2.f327858m.mo17428b()).getClass();
            C68214a a5 = C68219e.m98518a(((C68226l) ajVar2.f327859n).f184585a);
            C68214a aVar10 = a5;
            a5.getClass();
            C118264u uVar = (C118264u) ajVar2.f327860o.mo17428b();
            C118264u uVar2 = uVar;
            uVar.getClass();
            C85854al alVar = (C85854al) ajVar2.f327861p.mo17428b();
            C85854al alVar2 = alVar;
            alVar.getClass();
            C85862at atVar = (C85862at) ajVar2.f327862q.mo17428b();
            C85862at atVar2 = atVar;
            atVar.getClass();
            C118259p pVar = (C118259p) ajVar2.f327863r.mo17428b();
            C118259p pVar2 = pVar;
            pVar.getClass();
            C38658cb cbVar = (C38658cb) ajVar2.f327864s.mo17428b();
            cbVar.getClass();
            C118119ai aiVar2 = new C118119ai(aVar3, tVar2, aVar5, cqVar2, cwVar2, gVar2, caVar2, cqVar4, context2, aVar6, aVar7, aVar9, aVar10, uVar2, aVar2, alVar2, atVar2, pVar2, cbVar, hVar);
            C90476a aVar11 = C91018d.f254254a;
            try {
                C91033e eVar = new C91033e(ctVar.f328107a);
                int i = true != ctVar.f328108b.mo79746e(C90136o.f251818a) ? R.layout.results_web_view : R.layout.results_no_text_scaling_web_view;
                if (ctVar.f328108b.mo79746e(C90110fh.f250631ac)) {
                    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(eVar, 2132150584);
                    scrollableGsaWebView = (ScrollableGsaWebView) LayoutInflater.from(contextThemeWrapper).cloneInContext(contextThemeWrapper).inflate(i, (ViewGroup) null, false);
                    eVar.mo85312b(scrollableGsaWebView);
                    C0401v.m1321C();
                } else {
                    scrollableGsaWebView = (ScrollableGsaWebView) LayoutInflater.from(new ContextThemeWrapper(eVar, 2132150880)).cloneInContext(eVar).inflate(i, (ViewGroup) null, false);
                    eVar.mo85312b(scrollableGsaWebView);
                }
                ((C85757cq) ctVar.f328111e.mo27525b()).mo79412c(scrollableGsaWebView);
                scrollableGsaWebView.setInitialScale((int) (scrollableGsaWebView.getResources().getDisplayMetrics().density * 100.0f));
                scrollableGsaWebView.f253458a = true;
                C90776bt.m148327a();
                scrollableGsaWebView.setFocusable(false);
                scrollableGsaWebView.setFocusableInTouchMode(false);
                AccessibilityManager accessibilityManager = (AccessibilityManager) scrollableGsaWebView.getContext().getSystemService("accessibility");
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                    scrollableGsaWebView.setVisibility(4);
                }
                scrollableGsaWebView.setTag("RESULTS");
                C85424a aVar12 = aVar8;
                C118260q qVar = new C118260q(scrollableGsaWebView, (C86130z) ctVar.f328109c.mo27525b(), this.f327937p.mo103582a(aVar12.f231231b));
                C87278x xVar = new C87278x(scrollableGsaWebView, (C4370n) null);
                C118119ai aiVar3 = aiVar;
                C58838bb.m90884s(aiVar3.f327788G == null, "WebView may only be set once.");
                aiVar3.f327788G = xVar;
                C87278x xVar2 = aiVar3.f327788G;
                int color = aiVar3.f327788G.f235736a.getResources().getColor(R.color.agsa_color_background);
                xVar2.f235737b.incrementAndGet();
                xVar2.f235736a.setBackgroundColor(color);
                aiVar3.mo103537k(new C118116af(8, (String) null, (Query) null, 0));
                C87278x xVar3 = aiVar3.f327788G;
                xVar3.f235737b.incrementAndGet();
                xVar3.f235736a.setContentDescription(BuildConfig.FLAVOR);
                aiVar3.mo103537k(new C118116af(9, (String) null, (Query) null, 0));
                aiVar3.f327785D = qVar;
                aiVar3.f327790I = false;
                C58838bb.m90883r(aiVar3.f327788G != null);
                C58838bb.m90883r(aiVar3.f327788G.f235736a instanceof ScrollableGsaWebView);
                ScrollableGsaWebView scrollableGsaWebView2 = (ScrollableGsaWebView) aiVar3.f327788G.f235736a;
                WebSettings settings = aiVar3.f327788G.f235736a.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setDomStorageEnabled(true);
                settings.setUserAgentString(((C85757cq) aiVar3.f327839t).mo6453a());
                settings.setAllowFileAccess(false);
                settings.setForceDark(0);
                settings.setSupportZoom(false);
                settings.setGeolocationEnabled(true);
                settings.setGeolocationDatabasePath(aiVar3.f327787F.getDir("webview_geolocation", 0).getAbsolutePath());
                settings.setMediaPlaybackRequiresUserGesture(false);
                settings.setMixedContentMode(2);
                scrollableGsaWebView2.mo103592e(aiVar3.f327783B);
                aiVar3.mo103537k(new C118116af(5, (String) null, (Query) null, 0));
                C118264u uVar3 = aiVar3.f327843x;
                C87278x xVar4 = aiVar3.f327788G;
                C87266l lVar = aiVar3.f327838s;
                C22871g gVar3 = (C22871g) uVar3.f328321a.mo17428b();
                gVar3.getClass();
                C68214a a6 = C68219e.m98518a(((C68226l) uVar3.f328322b).f184585a);
                a6.getClass();
                ((C90476a) uVar3.f328323c.mo17428b()).getClass();
                C118189cw cwVar3 = (C118189cw) uVar3.f328324d.mo17428b();
                cwVar3.getClass();
                C118191cy cyVar = (C118191cy) uVar3.f328325e.mo17428b();
                cyVar.getClass();
                C87273s sVar = (C87273s) uVar3.f328326f.mo17428b();
                sVar.getClass();
                xVar4.getClass();
                lVar.getClass();
                C118263t tVar3 = r10;
                C118263t tVar4 = new C118263t(gVar3, a6, cwVar3, cyVar, sVar, xVar4, lVar);
                aiVar3.f327789H = tVar3;
                scrollableGsaWebView2.mo103591d(aiVar3.f327789H);
                aiVar3.mo103537k(new C118116af(6, (String) null, (Query) null, 0));
                if (((C86338r) aiVar3.f327825f.mo27525b()).getBoolean("debug_js_injection_enabled", false)) {
                    WebView.setWebContentsDebuggingEnabled(true);
                }
                WebView webView = aiVar3.f327788G.f235736a;
                webView.getClass();
                CookieManager instance = CookieManager.getInstance();
                if (instance != null) {
                    instance.setAcceptThirdPartyCookies(webView, true);
                    aiVar3.mo103537k(new C118116af(16, (String) null, (Query) null, 0));
                } else {
                    ((C89911f) aiVar3.f327840u.mo27525b()).mo83755a((Throwable) null, 23795454, 29).mo83721a();
                    C59104x d = C118119ai.f327777a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "GsaWebView");
                    ((C59052c) ((C59052c) d).mo56372aa(33808)).mo56386p("Could not enable third-party cookies: CookieManager not initialised");
                }
                aiVar3.f327791J = false;
                if (aiVar3.f327832m.mo79746e(C90117fo.f250750f)) {
                    aiVar3.f327784C.mo41544a(aiVar3.f327811ad);
                }
                if (this.f327932k) {
                    aiVar3.mo103534g();
                }
                C85748cl clVar = this.f327933l;
                C116498a aVar13 = aVar12.f231231b;
                C118575h hVar3 = C118575h.JS_EXTENSIONS_SRP;
                hVar3.getClass();
                C22871g gVar4 = (C22871g) clVar.f231837a.mo17428b();
                gVar4.getClass();
                C68214a a7 = C68219e.m98518a(((C68226l) clVar.f231838b).f184585a);
                a7.getClass();
                C68219e.m98518a(((C68226l) clVar.f231839c).f184585a).getClass();
                Context context3 = (Context) clVar.f231840d.mo17428b();
                context3.getClass();
                ((C85929cw) clVar.f231841e.mo17428b()).getClass();
                C85923cq cqVar5 = (C85923cq) clVar.f231842f.mo17428b();
                cqVar5.getClass();
                C68214a a8 = C68219e.m98518a(((C68226l) clVar.f231843g).f184585a);
                a8.getClass();
                C68214a a9 = C68219e.m98518a(((C68226l) clVar.f231844h).f184585a);
                a9.getClass();
                C68214a a10 = C68219e.m98518a(((C68226l) clVar.f231845i).f184585a);
                a10.getClass();
                C68214a a11 = C68219e.m98518a(((C68226l) clVar.f231846j).f184585a);
                a11.getClass();
                ((C21601a) clVar.f231847k.mo17428b()).getClass();
                ((C21603c) clVar.f231848l.mo17428b()).getClass();
                ((C90479a) clVar.f231849m.mo17428b()).getClass();
                ((C90476a) clVar.f231850n.mo17428b()).getClass();
                C21370a aVar14 = (C21370a) clVar.f231851o.mo17428b();
                aVar14.getClass();
                C118827a aVar15 = (C118827a) clVar.f231852p.mo17428b();
                aVar15.getClass();
                C91097g gVar5 = (C91097g) clVar.f231853q.mo17428b();
                gVar5.getClass();
                C85756cp cpVar = (C85756cp) clVar.f231854r.mo17428b();
                cpVar.getClass();
                C87276v vVar = new C87276v(cqVar5);
                C91097g gVar6 = (C91097g) cpVar.f231877a.mo17428b();
                gVar6.getClass();
                C86610af afVar = (C86610af) cpVar.f231878b.mo17428b();
                afVar.getClass();
                C85167c cVar = (C85167c) cpVar.f231879c.mo17428b();
                cVar.getClass();
                C22871g gVar7 = (C22871g) cpVar.f231880d.mo17428b();
                gVar7.getClass();
                C85747ck ckVar = new C85747ck(aVar13, hVar3, vVar, gVar4, a7, context3, cqVar5, a8, a9, a10, a11, aVar14, aVar15, gVar5, new C85751co(gVar6, afVar, cVar, gVar7, aVar13));
                C118184cr crVar = this.f327934m;
                C116498a aVar16 = aVar12.f231231b;
                long j = aVar12.f231230a;
                C22871g gVar8 = (C22871g) crVar.f328102a.mo17428b();
                gVar8.getClass();
                C91097g gVar9 = (C91097g) crVar.f328103b.mo17428b();
                gVar9.getClass();
                C85923cq cqVar6 = (C85923cq) crVar.f328104c.mo17428b();
                cqVar6.getClass();
                C85454d dVar = (C85454d) crVar.f328105d.mo17428b();
                dVar.getClass();
                C84411o oVar = (C84411o) crVar.f328106e.mo17428b();
                oVar.getClass();
                C118183cq cqVar7 = new C118183cq(aVar16, j, gVar8, gVar9, cqVar6, dVar, oVar);
                C87555c a12 = this.f327940s.mo91596a(new C118121ak(this, aiVar3));
                C87557e a13 = this.f327941t.mo91614a(new C118142be(this, aiVar3));
                C87554b a14 = this.f327942u.mo91591a(new C118143bf(this, aiVar3));
                C99815b bVar2 = this.f327943v;
                C118144bg bgVar = new C118144bg(this, aiVar3);
                C118145bh bhVar = new C118145bh(aiVar3);
                C84411o oVar2 = (C84411o) bVar2.f279239a.mo17428b();
                oVar2.getClass();
                C99814a aVar17 = new C99814a(bgVar, bhVar, oVar2);
                C87553a a15 = this.f327944w.mo91580a(new C118146bi(this, aiVar3));
                C99755g gVar10 = this.f327945x;
                C118147bj bjVar = new C118147bj(this, aiVar3);
                Context context4 = (Context) gVar10.f279132a.mo17428b();
                context4.getClass();
                C22871g gVar11 = (C22871g) gVar10.f279133b.mo17428b();
                gVar11.getClass();
                C84411o oVar3 = (C84411o) gVar10.f279134c.mo17428b();
                oVar3.getClass();
                C84400d dVar2 = (C84400d) gVar10.f279135d.mo17428b();
                dVar2.getClass();
                C99754f fVar = new C99754f(bjVar, context4, gVar11, oVar3, dVar2);
                C99818c cVar2 = this.f327946y;
                C118148bk bkVar = new C118148bk(this, aiVar3);
                C84411o oVar4 = (C84411o) cVar2.f279249a.mo17428b();
                oVar4.getClass();
                C68214a a16 = C68219e.m98518a(((C68226l) cVar2.f279250b).f184585a);
                a16.getClass();
                C139921f fVar2 = (C139921f) cVar2.f279251c.mo17428b();
                fVar2.getClass();
                Context context5 = (Context) cVar2.f279252d.mo17428b();
                context5.getClass();
                Boolean bool = (Boolean) cVar2.f279253e.mo17428b();
                bool.getClass();
                boolean booleanValue = bool.booleanValue();
                C65603f fVar3 = (C65603f) cVar2.f279254f.mo17428b();
                fVar3.getClass();
                C99817b bVar3 = r14;
                C99817b bVar4 = new C99817b(bkVar, oVar4, a16, fVar2, context5, booleanValue, fVar3);
                C99826b bVar5 = this.f327947z;
                C118149bl blVar = new C118149bl(this, aiVar3);
                C118186ct ctVar2 = ctVar;
                Context context6 = (Context) bVar5.f279277a.mo17428b();
                context6.getClass();
                C84411o oVar5 = (C84411o) bVar5.f279278b.mo17428b();
                oVar5.getClass();
                C99825a aVar18 = new C99825a(context6, blVar, oVar5);
                C99824d dVar3 = this.f327921A;
                C118122al alVar3 = new C118122al(this, aiVar3);
                C99825a aVar19 = aVar18;
                Context context7 = (Context) dVar3.f279268a.mo17428b();
                context7.getClass();
                C91097g gVar12 = (C91097g) dVar3.f279269b.mo17428b();
                gVar12.getClass();
                C84411o oVar6 = (C84411o) dVar3.f279270c.mo17428b();
                oVar6.getClass();
                C22871g gVar13 = (C22871g) dVar3.f279271d.mo17428b();
                gVar13.getClass();
                C86327b bVar6 = (C86327b) dVar3.f279272e.mo17428b();
                bVar6.getClass();
                C99823c cVar3 = new C99823c(alVar3, context7, gVar12, oVar6, gVar13, bVar6);
                if (aiVar3.f327788G == null) {
                    C59104x d2 = C118119ai.f327777a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "GsaWebView");
                    ((C59052c) ((C59052c) d2).mo56372aa(33810)).mo56386p("Cannot set srpJavascriptExtensions before initialize webview.");
                } else {
                    aiVar3.f327792K = ckVar;
                    aiVar3.f327792K.f231833h = aiVar3.f327830k;
                    aiVar3.f327788G.f235736a.addJavascriptInterface(aiVar3.f327792K, "agsa_ext");
                    aiVar3.f327793L = cqVar7;
                    aiVar3.f327788G.f235736a.addJavascriptInterface(aiVar3.f327793L, "silk_pane_ext");
                }
                scrollableGsaWebView.addJavascriptInterface(this.f327939r.mo91593a(), "silk_download_ext");
                scrollableGsaWebView.addJavascriptInterface(a12, "silk_geolocation_ext");
                scrollableGsaWebView.addJavascriptInterface(this.f327922B.mo90734a(), "ad_shield_lite_ext");
                scrollableGsaWebView.addJavascriptInterface(a13, "silk_share_ext");
                scrollableGsaWebView.addJavascriptInterface(a14, "silk_collections_v2_ext");
                scrollableGsaWebView.addJavascriptInterface(aVar17, "silk_initialization_ext");
                scrollableGsaWebView.addJavascriptInterface(a15, "silk_audio_recording_ext");
                scrollableGsaWebView.addJavascriptInterface(fVar, "silk_cast_ext");
                scrollableGsaWebView.addJavascriptInterface(bVar3, "silk_lens_ext");
                scrollableGsaWebView.addJavascriptInterface(aVar19, "silk_prewarm_play_ext");
                scrollableGsaWebView.addJavascriptInterface(cVar3, "silk_notification_v2_ext");
                this.f327935n.ifPresent(new C118132av(this, aiVar3, scrollableGsaWebView));
                C118186ct ctVar3 = ctVar2;
                C118168cd a17 = ctVar3.f328113g.mo103574a(aiVar3, new C87276v((C85923cq) ctVar3.f328110d.mo27525b()));
                if (aiVar3.f327788G == null) {
                    C59104x d3 = C118119ai.f327777a.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "GsaWebView");
                    ((C59052c) ((C59052c) d3).mo56372aa(33812)).mo56386p("Cannot set pluginJsInterface before initialize webview.");
                } else {
                    aiVar3.f327788G.f235736a.addJavascriptInterface(a17, "velour");
                }
                mo103562d(this.f327938q);
                this.f327932k = false;
                synchronized (this.f327928g) {
                    this.f327929h.put(((C85424a) bVar).f231230a, aiVar3);
                }
                return aiVar3;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            return c;
        }
    }

    /* renamed from: c */
    public final C118119ai mo103561c(long j) {
        C118119ai aiVar;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f327928g) {
            aiVar = (C118119ai) this.f327929h.get(j);
        }
        return aiVar;
    }

    /* renamed from: d */
    public final void mo103562d(C87260f fVar) {
        C118163bz bzVar = this.f327936o;
        bzVar.f327961f.add(new C118141bd(this, fVar));
        if (!bzVar.f327962g.getAndSet(true)) {
            bzVar.f327957b.mo28207g("Initialise watched WebView", new C118155br(bzVar)).mo4106b(C118156bs.f327949a, C60826bg.f164896a);
        }
    }
}
