package com.google.android.apps.search.googleapp.googleappbrowser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10274b.C135620b;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10283i.C135708b;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a.C135607c;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10284b.C135715b;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10294h.C135855b;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10296j.C135862b;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10297k.C135869c;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10299m.C135880i;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10299m.C135881j;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs.C135946b;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs.C135949e;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135461g;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.googleappbrowser.p10261b.C135504a;
import com.google.android.apps.search.googleapp.googleappbrowser.p10263d.C135568a;
import com.google.android.apps.search.googleapp.googleappbrowser.p10263d.C135569b;
import com.google.android.apps.search.googleapp.googleappbrowser.p10264e.p10265a.C135572a;
import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136012b;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.BottomSheetPlaceholderView;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136053ak;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136062as;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136108z;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.p10307a.C136036n;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.incognito.p10334j.C136363g;
import com.google.android.apps.search.googleapp.p10117aa.p10118a.C133081f;
import com.google.android.apps.search.googleapp.p10117aa.p10119b.C133110a;
import com.google.android.apps.search.googleapp.p10117aa.p10121d.C133118a;
import com.google.android.apps.search.googleapp.p10335j.C136370a;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.recents.C137177k;
import com.google.android.apps.search.googleapp.tabs.manager.C139744k;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.C139787a;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139789b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2476a.p2482d.C32214c;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.contrib.errorpage.C43515c;
import com.google.android.libraries.web.p3353c.C43316a;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.p3353c.p3355b.C43348q;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.p3420k.C43864j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69036bf;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69086g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.o */
/* compiled from: PG */
public final class C136020o extends C135518bk implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C136109q f370442a;

    /* renamed from: c */
    private Context f370443c;

    /* renamed from: d */
    private final C2393x f370444d = new C2393x(this);

    /* renamed from: e */
    private boolean f370445e;

    @Deprecated
    public C136020o() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C136109q mo17754z() {
        C136109q qVar = this.f370442a;
        if (qVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f370445e) {
            return qVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112379b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f370443c == null) {
            this.f370443c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f370443c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f370444d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136019n.m220841a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo17754z().mo112762g();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C136109q a = mo17754z();
            boolean z = a.f370706x;
            int i = R.layout.googleapp_browser_fragment_coordinator_main;
            if (!z) {
                if (!a.f370705w) {
                    i = R.layout.googleapp_browser_fragment_main;
                }
            }
            View inflate = layoutInflater.inflate(i, viewGroup, false);
            C28306ab abVar = a.f370688f;
            a.f370679A = abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(90796)));
            a.f370698p.mo50707a(a.f370689g.mo46469b(), a.f370708z);
            if (a.mo112759d() == null) {
                C0154a aVar = new C0154a(a.f370687e.getChildFragmentManager());
                C43861g b = C43864j.m77436b(a.f370684b);
                AccountId accountId = a.f370684b;
                C136108z zVar = new C136108z();
                C68324h.m98669f(zVar);
                C47247a.m84047b(zVar, accountId);
                aVar.mo689v(R.id.googleapp_browser_main_bottombar, zVar, "googleappbrowser_bottom_bar");
                aVar.mo511h(R.id.googleapp_browser_main_webview, b, "googleappbrowser_webview", 1);
                if (a.f370681C.f101930a) {
                    aVar.mo689v(R.id.googleapp_browser_incognito_topbar_container, C136363g.m221563a(a.f370684b), "googleappbrowser_incognito_topbar");
                    View decorView = a.f370687e.requireActivity().getWindow().getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -8193);
                } else {
                    aVar.mo689v(R.id.googleapp_browser_main_statusbar, a.f370690h.mo112367a(), (String) null);
                }
                a.f370699q.ifPresent(new C136021p(aVar));
                a.mo112761f(a.f370686d.f369070j);
                if (a.f370705w) {
                    AccountId accountId2 = a.f370684b;
                    C135862b bVar = new C135862b();
                    C68324h.m98669f(bVar);
                    C47247a.m84047b(bVar, accountId2);
                    aVar.mo689v(R.id.googleapp_browser_promo_placeholder, bVar, "googleappbrowser_promotion");
                }
                aVar.mo509f();
                b.mo17754z().mo46875c(a.f370691i.mo112367a());
                if (a.f370702t) {
                    AccountId accountId3 = a.f370684b;
                    C136062as asVar = new C136062as();
                    C68324h.m98669f(asVar);
                    C47247a.m84047b(asVar, accountId3);
                    b.mo17754z().f114326h.mo46861h(asVar);
                    zVar.f370673a.mo5790b(new GoogleAppBrowserFragmentPeer$2(zVar, asVar));
                }
                AccountId accountId4 = a.f370684b;
                C135715b bVar2 = new C135715b();
                C68324h.m98669f(bVar2);
                C47247a.m84047b(bVar2, accountId4);
                C43515c.m76782a(b, bVar2);
                C135520bm bmVar = a.f370703u;
                C135462h hVar = a.f370686d;
                C69664n.m101061g(hVar, "gabParams");
                String str = hVar.f369062b;
                C69664n.m101060f(str, "gabParams.initialUrl");
                if (str.length() <= 0) {
                    String str2 = hVar.f369065e;
                    C69664n.m101060f(str2, "gabParams.persistenceId");
                    if (str2.length() <= 0) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                String str3 = hVar.f369062b;
                C69664n.m101060f(str3, "gabParams.initialUrl");
                if (str3.length() != 0) {
                    C135568a aVar2 = (C135568a) C135569b.f369275f.createBuilder();
                    C135461g a2 = C135461g.m219650a(hVar.f369064d);
                    if (a2 == null) {
                        a2 = C135461g.UNKNOWN;
                    }
                    aVar2.copyOnWrite();
                    C135569b bVar3 = (C135569b) aVar2.instance;
                    bVar3.f369279b = a2.f369058p;
                    bVar3.f369278a |= 1;
                    String str4 = hVar.f369063c;
                    aVar2.copyOnWrite();
                    C135569b bVar4 = (C135569b) aVar2.instance;
                    str4.getClass();
                    bVar4.f369278a |= 2;
                    bVar4.f369280c = str4;
                    aVar2.copyOnWrite();
                    C135569b bVar5 = (C135569b) aVar2.instance;
                    bVar5.f369278a |= 8;
                    bVar5.f369282e = true;
                    if ((hVar.f369061a & 16) != 0) {
                        if (hVar.f369067g) {
                            C135461g a3 = C135461g.m219650a(hVar.f369064d);
                            if (a3 == null) {
                                a3 = C135461g.UNKNOWN;
                            }
                            C69664n.m101060f(a3, "gabParams.source");
                            int ordinal = a3.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        if (ordinal != 4) {
                                            bmVar.f369178b.f379927a.mo19974a(C37182a.f97825bD);
                                        }
                                    }
                                }
                                bmVar.f369178b.f379927a.mo19974a(C37182a.f97824bC);
                            }
                            bmVar.f369178b.f379927a.mo19974a(C37182a.f97823bB);
                        }
                        C139789b bVar6 = hVar.f369066f;
                        if (bVar6 == null) {
                            bVar6 = C139789b.f379928d;
                        }
                        aVar2.copyOnWrite();
                        C135569b bVar7 = (C135569b) aVar2.instance;
                        bVar6.getClass();
                        bVar7.f369281d = bVar6;
                        bVar7.f369278a |= 4;
                    }
                    C43255f m = C43257h.m76306m(hVar.f369062b);
                    String str5 = hVar.f369068h;
                    if (str5.length() == 0) {
                        str5 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com";
                    }
                    m.f113051b.mo55429h("Referer", str5);
                    m.mo46345f(!hVar.f369071k);
                    m.mo46342c(true);
                    C43316a aVar3 = (C43316a) C43323b.f113174a.createBuilder();
                    aVar3.mo58885m(C135569b.f369276g, aVar2.build());
                    m.mo46343d((C43323b) aVar3.build());
                    C43257h k = m.mo46365k();
                    C43262m mVar = bmVar.f369177a;
                    C69664n.m101060f(k, "loadUrlParams");
                    mVar.mo46333b(k);
                }
            }
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C136019n.m220841a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            mo17754z().f370679A = null;
            c.close();
            return;
        } catch (Throwable th) {
            C136019n.m220841a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f370445e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136019n.m220841a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C136019n.m220841a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f122869b.mo51381i();
        try {
            mo51117r();
            C136109q a = mo17754z();
            C28439i iVar = a.f370679A;
            iVar.getClass();
            iVar.mo33892i(1);
            if (a.f370685c && a.f370686d.f369069i && a.f370707y && a.f370701s.mo110979b()) {
                C133081f fVar = a.f370695m;
                String str = a.f370704v.mo46384b().f112969h;
                str.getClass();
                fVar.mo110970a(str);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136019n.m220841a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f122869b.mo51381i();
        try {
            mo51118s();
            C28439i iVar = mo17754z().f370679A;
            iVar.getClass();
            iVar.mo33892i(2);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136019n.m220841a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C136053ak c;
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C136109q a = mo17754z();
            C47393f.m84233d(this, C135620b.class, new C136111r(a));
            C47393f.m84233d(this, C135855b.class, new C136112s(a));
            C47393f.m84233d(this, C135504a.class, new C136113t(a));
            C47393f.m84233d(this, C135607c.class, new C136114u(a));
            C47393f.m84233d(this, C135708b.class, new C136115v(a));
            C47393f.m84233d(this, C32214c.class, new C136116w(a));
            this.f54442o.mo24720k(bundle);
            C136109q a2 = mo17754z();
            a2.f370693k.mo112390a(C89849ae.CCT_TAB_SHOWN);
            if (!a2.f370702t && (c = a2.mo112758c()) != null) {
                c.f370528p.f370572i = (BottomSheetPlaceholderView) view.findViewById(R.id.googleapp_browser_main_webview_placeholder);
            }
            a2.mo112762g();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136019n.m220841a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        C136012b bVar;
        Optional optional;
        C136020o oVar = this;
        oVar.f122869b.mo51381i();
        try {
            if (!oVar.f370445e) {
                super.onAttach(context);
                if (oVar.f370442a == null) {
                    Object jN = mo112380d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    boolean a = C69036bf.m100108a(((C74176nj) jN).f206730b.f198009I);
                    C135462h ch = ((C74176nj) jN).mo69591ch();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C136020o) {
                        C136020o oVar2 = (C136020o) fragment;
                        C68225k.m98532d(oVar2);
                        C28306ab abVar = (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b();
                        C43348q fT = ((C74176nj) jN).mo69736fT();
                        AccountId accountId2 = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                        if (C69086g.m100210d(((C74176nj) jN).f206730b.f198009I)) {
                            bVar = new C135880i(accountId2);
                        } else {
                            bVar = new C135881j(accountId2);
                        }
                        C136012b bVar2 = bVar;
                        C136036n nVar = new C136036n((AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b());
                        C135572a aVar = (C135572a) ((C74176nj) jN).f206657G.mo17428b();
                        Optional of = Optional.m71637of(new C139744k((Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b()));
                        C133081f fVar = (C133081f) ((C74176nj) jN).f206836d.f205432n.mo17428b();
                        C133118a aVar2 = (C133118a) ((C74176nj) jN).f206730b.f198027a.f199877w.mo17428b();
                        C38553h hVar = (C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b();
                        C135869c cVar = new C135869c((AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C46175b) ((C74176nj) jN).f206730b.f198398h.mo17428b(), ((C74176nj) jN).mo69764fv(), (C137177k) ((C74176nj) jN).f206730b.f198171cl.mo17428b(), (C60887da) ((C74176nj) jN).f206677a.p.mo17428b(), ((C74176nj) jN).mo69693ed(), (C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b());
                        C135946b bVar3 = new C135946b(((C74176nj) jN).mo69764fv(), (C60888db) ((C74176nj) jN).f206677a.n.mo17428b(), ((C74176nj) jN).mo69693ed(), ((C74176nj) jN).f206730b.f198027a.mo66869dp(), (C43269t) ((C74176nj) jN).f207085l.mo17428b(), (C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b());
                        C46801dp dpVar = (C46801dp) ((C74176nj) jN).f207084k.mo17428b();
                        C133110a ed = ((C74176nj) jN).mo69693ed();
                        AccountId accountId3 = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                        C135946b bVar4 = bVar3;
                        Fragment fragment2 = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                        if (ed.mo110979b()) {
                            optional = Optional.m71637of(new C135949e(accountId3));
                        } else {
                            optional = Optional.empty();
                        }
                        Optional optional2 = optional;
                        C68225k.m98532d(optional2);
                        oVar = this;
                        oVar.f370442a = new C136109q(accountId, a, ch, oVar2, abVar, fT, bVar2, nVar, aVar, of, fVar, aVar2, hVar, cVar, bVar4, dpVar, optional2, (C136247a) ((C74176nj) jN).f206662L.mo17428b(), (C136370a) ((C74176nj) jN).f206724au.mo17428b(), ((C74176nj) jN).mo69693ed(), ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199525gf.mo17428b()).booleanValue(), (C43269t) ((C74176nj) jN).f207085l.mo17428b(), new C135520bm(((C74176nj) jN).mo69766fx(), (C136832c) ((C74176nj) jN).f206730b.f198022V.mo17428b(), (C139787a) ((C74176nj) jN).f206730b.f198166cg.mo17428b(), (C43269t) ((C74176nj) jN).f207085l.mo17428b()), ((C74176nj) jN).mo69604cu(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66953fT().f185286a.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45366255").mo50907f(), ((C74176nj) jN).f206730b.f198027a.mo67121ki(), ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199443fC.mo17428b()).booleanValue());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(oVar.f122869b, oVar.f370444d));
                    } else {
                        String obj = C136109q.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = oVar.f122869b;
                    if (abVar2.f123354b == null) {
                        abVar2.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            th = th;
            Throwable th2 = th;
            C47831fm.m85019n();
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
