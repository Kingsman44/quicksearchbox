package com.google.android.libraries.web.webview.p3491j;

import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.p201w.C4364h;
import androidx.p201w.C4372p;
import androidx.p201w.p202a.C4325ab;
import androidx.p201w.p202a.C4348q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.libraries.web.base.C43234b;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.browser.C43272a;
import com.google.android.libraries.web.browser.internal.C43296h;
import com.google.android.libraries.web.browser.internal.C43309u;
import com.google.android.libraries.web.p3353c.C43364i;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43370o;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.p3353c.p3355b.C43331ag;
import com.google.android.libraries.web.p3407g.C43772a;
import com.google.android.libraries.web.p3420k.p3422b.C43856a;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.p3428m.p3429a.C43914c;
import com.google.android.libraries.web.p3428m.p3429a.C43920i;
import com.google.android.libraries.web.postmessage.PostMessageConfig;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.android.libraries.web.webview.p3478d.p3479a.C44400f;
import com.google.android.libraries.web.webview.p3478d.p3479a.C44401g;
import com.google.android.libraries.web.webview.p3481f.p3482a.C44408a;
import com.google.android.libraries.web.webview.p3485h.C44412a;
import com.google.android.libraries.web.webview.p3485h.p3486a.C44415c;
import com.google.android.libraries.web.webview.p3485h.p3486a.C44424l;
import com.google.android.libraries.web.webview.p3492k.p3493a.C44475p;
import com.google.android.libraries.web.webview.p3492k.p3493a.C44476q;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import java.util.HashSet;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.libraries.web.webview.j.g */
/* compiled from: PG */
public final class C44455g implements C43856a {

    /* renamed from: a */
    public boolean f115549a;

    /* renamed from: b */
    private final Context f115550b;

    /* renamed from: c */
    private final Fragment f115551c;

    /* renamed from: d */
    private final WebModelProvider f115552d;

    /* renamed from: e */
    private final Set f115553e;

    /* renamed from: f */
    private final C43269t f115554f;

    /* renamed from: g */
    private final C43234b f115555g;

    /* renamed from: h */
    private final C43377v f115556h;

    /* renamed from: i */
    private final C46801dp f115557i;

    /* renamed from: com.google.android.libraries.web.webview.j.g$a */
    /* compiled from: PG */
    final class C44456a implements C46792di {
        public C44456a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, C42181t.f110467a);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C43376u uVar = (C43376u) obj;
            C69664n.m101061g(uVar, "data");
            C43369n a = C43369n.m76519a(uVar.f113330c);
            if (a == null) {
                a = C43369n.UNSPECIFIED;
            }
            if (C43370o.m76522b(a)) {
                C44455g gVar = C44455g.this;
                if (!gVar.f115549a) {
                    gVar.f115549a = true;
                    if (gVar.mo47326m().f115421f.mo46945l()) {
                        C44455g gVar2 = C44455g.this;
                        gVar2.mo47327n(gVar2.mo47326m().mo47292b().f115616a);
                    }
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C44455g(Context context, Fragment fragment, WebModelProvider webModelProvider, Set set, C43269t tVar, C43234b bVar, C43377v vVar, C46801dp dpVar, C44408a aVar, C71422aw awVar) {
        C69664n.m101061g(context, "appContext");
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(tVar, "webCoordinatorInfo");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(aVar, "webViewCompatWrapper");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f115550b = context;
        this.f115551c = fragment;
        this.f115552d = webModelProvider;
        this.f115553e = set;
        this.f115554f = tVar;
        this.f115555g = bVar;
        this.f115556h = vVar;
        this.f115557i = dpVar;
    }

    /* renamed from: o */
    public static final void m78521o(WebView webView, Context context) {
        Context context2 = webView.getContext();
        if (context2 instanceof C44450b) {
            ((C44450b) context2).f115544a = context;
        }
    }

    /* renamed from: p */
    private final C44454f m78522p() {
        return mo47326m().mo47292b().f115616a;
    }

    /* renamed from: q */
    private final void m78523q(ViewGroup viewGroup, Bundle bundle) {
        Context context;
        this.f115549a = false;
        if (this.f115554f.mo46384b().f112963b) {
            context = new C44450b(this.f115551c);
        } else {
            context = this.f115551c.getLayoutInflater().getContext();
        }
        C69664n.m101060f(context, "if (webCoordinatorInfo.c…nflater.context\n        }");
        C44454f fVar = new C44454f(context);
        fVar.setId(R.id.webx_web_view);
        viewGroup.addView(fVar);
        if (this.f115555g.f112982a) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        fVar.setOverScrollMode(2);
        CookieManager.getInstance().setAcceptThirdPartyCookies(fVar, true);
        fVar.getSettings().setAllowFileAccess(false);
        fVar.getSettings().setJavaScriptEnabled(true);
        fVar.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        fVar.getSettings().setUseWideViewPort(true);
        fVar.getSettings().setLoadWithOverviewMode(true);
        fVar.getSettings().setBuiltInZoomControls(true);
        fVar.getSettings().setSupportZoom(true);
        fVar.getSettings().setDisplayZoomControls(false);
        fVar.getSettings().setCacheMode(-1);
        fVar.getSettings().setDomStorageEnabled(true);
        fVar.getSettings().setGeolocationEnabled(true);
        fVar.getSettings().setMixedContentMode(2);
        if (C4325ab.m12423b("FORCE_DARK_STRATEGY")) {
            C4364h.m12514a(fVar.getSettings(), 1);
        }
        C44401g m = mo47326m();
        if (!m.f115421f.mo46945l()) {
            C43904a g = m.f115421f.mo46940g(new C44400f(m, fVar));
            C44412a aVar = m.f115416a.f115480a;
            if (C44412a.m78441b()) {
                C44424l lVar = m.f115419d;
                C44412a aVar2 = lVar.f115473c;
                if (C44412a.m78441b()) {
                    for (PostMessageConfig postMessageConfig : lVar.f115474d) {
                        C44408a aVar3 = lVar.f115477g;
                        C4372p.m12526e(fVar, postMessageConfig.mo42598a().f114149a, new HashSet(lVar.mo47301d(postMessageConfig)), new C44415c(lVar, g, postMessageConfig));
                    }
                } else {
                    throw new UnsupportedOperationException("Instant PostMessage is not supported in this WebView version");
                }
            }
            String str = this.f115554f.mo46384b().f112966e;
            String str2 = this.f115554f.mo46384b().f112967f;
            if (!(str.length() == 0 && str2.length() == 0)) {
                fVar.getSettings().setUserAgentString(C69764m.m101197q(str2 + " " + WebSettings.getDefaultUserAgent(this.f115550b) + " " + str).toString());
            }
            mo47327n(fVar);
            m78524r(fVar);
            for (C43772a a : this.f115553e) {
                a.mo46790a();
            }
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("web_view_state");
                String string = bundle.getString("web_view_url");
                if (bundle2 != null && string != null) {
                    C43914c i = mo47326m().f115421f.mo46769c();
                    C69664n.m101058d(i);
                    C43945v b = i.mo46411d(C43331ag.class);
                    C69664n.m101060f(b, "getPlugin(T::class.java)");
                    C43364i iVar = (C43364i) C43367l.f113293h.createBuilder();
                    iVar.copyOnWrite();
                    C43367l lVar2 = (C43367l) iVar.instance;
                    lVar2.f113295a = 2 | lVar2.f113295a;
                    lVar2.f113297c = string;
                    C43366k kVar = C43366k.RESTORATION;
                    iVar.copyOnWrite();
                    C43367l lVar3 = (C43367l) iVar.instance;
                    lVar3.f113299e = kVar.f113292i;
                    lVar3.f113295a |= 8;
                    ((C43331ag) b).mo46449k((C43367l) iVar.build());
                    fVar.restoreState(bundle2);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* renamed from: r */
    private final void m78524r(C44454f fVar) {
        if (C4325ab.m12423b("FORCE_DARK") && C4325ab.m12423b("FORCE_DARK_STRATEGY")) {
            boolean z = (this.f115551c.requireContext().getResources().getConfiguration().uiMode & 48) == 32;
            if (z != mo47326m().f115422g) {
                mo47326m().f115422g = z;
                if (z) {
                    C4348q.m12489d(fVar.getSettings(), 2);
                } else {
                    C4348q.m12489d(fVar.getSettings(), 0);
                }
            }
        }
    }

    /* renamed from: a */
    public final View mo46854a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C69664n.m101061g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.webx_web_view_fragment_root, viewGroup, false);
        C69664n.m101060f(inflate, "inflater.inflate(R.layou…* attachToRoot= */ false)");
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.webx_web_container);
        if (mo47326m().f115421f.mo46945l()) {
            C44454f p = m78522p();
            m78521o(p, this.f115551c.requireContext());
            viewGroup2.addView(p);
            C43369n a = C43369n.m76519a(this.f115556h.mo46468a().f113330c);
            if (a == null) {
                a = C43369n.UNSPECIFIED;
            }
            this.f115549a = C43370o.m76522b(a);
            m78524r(p);
        } else {
            C69664n.m101060f(viewGroup2, "webViewContainer");
            C44401g m = mo47326m();
            Bundle bundle2 = m.f115424i;
            if (bundle2 != null) {
                m.f115424i = null;
            } else {
                bundle2 = null;
            }
            if (bundle2 != null) {
                bundle = bundle2;
            }
            m78523q(viewGroup2, bundle);
        }
        this.f115557i.mo50707a(this.f115556h.mo46469b(), new C44456a());
        return inflate;
    }

    /* renamed from: b */
    public final C43272a mo46855b() {
        View view;
        if (this.f115554f.mo46384b().f112973l && (view = this.f115551c.getView()) != null && !mo47326m().f115421f.mo46945l()) {
            View findViewById = view.findViewById(R.id.webx_web_container);
            C69664n.m101058d(findViewById);
            m78523q((ViewGroup) findViewById, mo47326m().f115423h);
        }
        return mo47326m().f115417b;
    }

    /* renamed from: c */
    public final void mo46856c() {
        if (!this.f115554f.mo46384b().f112963b && mo47326m().f115421f.mo46945l()) {
            C44401g m = mo47326m();
            if (m.f115421f.mo46945l()) {
                C44475p a = C44476q.m78577a((C43904a) m.f115421f.mo46943j().get(0));
                Bundle t = a.mo47360t();
                ViewParent parent = a.f115616a.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(a.f115616a);
                }
                a.mo47361u();
                m.f115424i = t;
                C43920i.m77543m(m.f115421f, 0, true, (C69626l) null, 4);
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        mo47326m().mo47293c().ifPresent(new C44457h());
    }

    /* renamed from: d */
    public final void mo46857d(Bundle bundle) {
        C69664n.m101061g(bundle, "outState");
        mo47326m().mo47293c().ifPresent(new C44458i(bundle));
    }

    /* renamed from: e */
    public final void mo46858e() {
        if (mo47326m().mo47293c().isEmpty()) {
            View findViewById = this.f115551c.requireView().findViewById(R.id.webx_web_container);
            C69664n.m101058d(findViewById);
            m78523q((ViewGroup) findViewById, mo47326m().f115423h);
        }
        m78522p().onResume();
    }

    /* renamed from: f */
    public final void mo46859f() {
        mo47326m().mo47293c().ifPresent(C44459j.f115560a);
    }

    /* renamed from: g */
    public final void mo46860g(boolean z, C69615a aVar) {
        aVar.mo5672a();
    }

    /* renamed from: h */
    public final void mo46861h(Fragment fragment) {
        FragmentManager childFragmentManager = this.f115551c.getChildFragmentManager();
        C69664n.m101060f(childFragmentManager, "fragment.childFragmentManager");
        C0154a aVar = new C0154a(childFragmentManager);
        aVar.mo689v(R.id.webx_bottom_view_root, fragment, (String) null);
        aVar.mo509f();
    }

    /* renamed from: i */
    public final /* synthetic */ void mo46862i(int i, int i2) {
    }

    /* renamed from: j */
    public final void mo46863j(Fragment fragment) {
        C69664n.m101061g(fragment, "topFragment");
        FragmentManager childFragmentManager = this.f115551c.getChildFragmentManager();
        C69664n.m101060f(childFragmentManager, "fragment.childFragmentManager");
        C0154a aVar = new C0154a(childFragmentManager);
        aVar.mo689v(R.id.webx_top_view_root, fragment, (String) null);
        aVar.mo509f();
    }

    /* renamed from: k */
    public final boolean mo46864k() {
        return false;
    }

    /* renamed from: l */
    public final boolean mo46865l() {
        return C43309u.m76408a(mo47326m().f115417b).mo46407f(C43296h.f113112a);
    }

    /* renamed from: m */
    public final C44401g mo47326m() {
        return (C44401g) this.f115552d.mo47072a(C44401g.class);
    }

    /* renamed from: n */
    public final void mo47327n(C44454f fVar) {
        if (!this.f115549a) {
            fVar.mo47309c(C44082a.f114755a, 0);
            return;
        }
        Integer num = this.f115554f.mo46384b().f112968g;
        fVar.mo47309c(C44082a.f114755a, num != null ? num.intValue() : -1);
    }
}
