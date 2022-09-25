package com.google.android.libraries.lens.view.weblrp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.common.NestedScrollingChildWrapperFrameLayout;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26980p;
import com.google.android.libraries.lens.view.p2078at.C25543z;
import com.google.android.libraries.lens.view.p2078at.p2079a.p2080a.C25483a;
import com.google.android.libraries.lens.view.p2078at.p2079a.p2080a.C25486d;
import com.google.android.libraries.lens.view.p2096f.C25799b;
import com.google.android.libraries.lens.view.utils.C28110al;
import com.google.android.libraries.lens.view.weblrp.C28195j;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.contrib.p3389i.C43630d;
import com.google.android.libraries.web.p3353c.C43316a;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.p3420k.C43864j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.protobuf.C62940bt;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.weblrp.f */
/* compiled from: PG */
public final class C28191f extends C28186a implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C28195j f76720a;

    /* renamed from: c */
    private Context f76721c;

    /* renamed from: d */
    private final C2393x f76722d = new C2393x(this);

    /* renamed from: e */
    private boolean f76723e;

    @Deprecated
    public C28191f() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo33704b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f76721c == null) {
            this.f76721c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f76721c;
    }

    /* renamed from: f */
    public final C28195j mo17754z() {
        C28195j jVar = this.f76720a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f76723e) {
            return jVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
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
        return this.f76722d;
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
            C28190e.m52729a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C28195j f = mo17754z();
            if (f.f76747u && f.f76737k.mo31462g(C26239a.ONELRP_REMOVE_CUSTOM_SCROLLING)) {
                f.f76743q.mo46655a(new C28193h(f));
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28190e.m52729a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C28195j f = mo17754z();
            boolean z = f.f76747u;
            int i = R.layout.lens_web_lrp_container;
            if (z && f.f76737k.mo31462g(C26239a.ONELRP_REMOVE_CUSTOM_SCROLLING)) {
                i = R.layout.lens_web_lrp_container_no_nested_scrolling;
            }
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(i, viewGroup, false);
            C28306ab abVar = f.f76733g;
            abVar.mo33801b(coordinatorLayout, abVar.f76990a.mo33805a(C28427h.m53115a(145629)));
            if (f.f76734h.getChildFragmentManager().f634a.mo671c("web-lrp-fragment") == null) {
                C43861g b = C43864j.m77436b(f.f76736j);
                C0154a aVar = new C0154a(f.f76734h.getChildFragmentManager());
                aVar.mo689v(R.id.lens_web_lrp_web_fragment_container, b, "web-lrp-fragment");
                aVar.mo509f();
                f.f76739m.mo46385c().name();
            }
            f.f76741o.mo50707a(f.f76742p.mo46469b(), new C28195j.C28196a());
            if (!f.f76747u || !f.f76737k.mo31462g(C26239a.ONELRP_REMOVE_CUSTOM_SCROLLING)) {
                NestedScrollingChildWrapperFrameLayout nestedScrollingChildWrapperFrameLayout = (NestedScrollingChildWrapperFrameLayout) coordinatorLayout.findViewById(R.id.lens_web_lrp_web_fragment_container);
                f.f76744r.mo47231a(nestedScrollingChildWrapperFrameLayout);
                nestedScrollingChildWrapperFrameLayout.f69963b = null;
                nestedScrollingChildWrapperFrameLayout.f69964c = true;
            }
            if (f.f76737k.mo31462g(C26239a.ENABLE_ONELRP_BLUE_PILL)) {
                layoutInflater.inflate(R.layout.web_lrp_dev_banner, coordinatorLayout, true);
            }
            C47831fm.m85019n();
            return coordinatorLayout;
        } catch (Throwable th) {
            C28190e.m52729a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f76723e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C28190e.m52729a(th, th);
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
            C28190e.m52729a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f122869b.mo51381i();
        try {
            mo51117r();
            C28195j f = mo17754z();
            String f2 = f.f76737k.mo31461f(C26239a.ONELRP_PRELOAD_URL);
            if (!f2.isEmpty() && f.f76734h.requireView().getVisibility() != 0 && ((f.f76729c.mo30591a() || f.f76737k.mo31462g(C26239a.ONELRP_PRELOAD_ALL_ENTRYPOINTS)) && f.f76748v)) {
                if (!f2.equals("about:blank")) {
                    Uri.Builder buildUpon = Uri.parse(f2).buildUpon();
                    if (C28110al.m52391c(f.f76746t)) {
                        buildUpon.appendQueryParameter("dark_mode", "true");
                    }
                    f2 = buildUpon.build().toString();
                }
                C43255f m = C43257h.m76306m(f2);
                C43316a aVar = (C43316a) C43323b.f113174a.createBuilder();
                C62940bt btVar = C25486d.f69438f;
                C25483a aVar2 = (C25483a) C25486d.f69437e.createBuilder();
                aVar2.copyOnWrite();
                C25486d dVar = (C25486d) aVar2.instance;
                dVar.f69443d = 3;
                dVar.f69440a |= 4;
                aVar.mo58885m(btVar, (C25486d) aVar2.build());
                m.mo46343d((C43323b) aVar.build());
                f.mo33713d(m);
                C43257h k = m.mo46365k();
                k.mo46356f();
                f.f76738l.mo46333b(k);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28190e.m52729a(th, th);
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
        this.f122869b.mo51381i();
        try {
            if (!this.f76723e) {
                super.onAttach(context);
                if (this.f76720a == null) {
                    Object jN = mo33703a().mo17653jN();
                    String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                    C68225k.m98532d(b);
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C28191f) {
                        C28191f fVar = (C28191f) fragment;
                        C68225k.m98532d(fVar);
                        this.f76720a = new C28195j(b, fVar, (C25543z) ((C74176nj) jN).f206836d.f205229X.mo17428b(), (C21370a) ((C74176nj) jN).f206677a.i.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), ((C74176nj) jN).mo69679eP(), (C26980p) ((C74176nj) jN).f206836d.f205248aP.mo17428b(), (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C26244b) ((C74176nj) jN).f206836d.f205444z.mo17428b(), ((C74176nj) jN).mo69766fx(), (C43269t) ((C74176nj) jN).f207085l.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).mo69736fT(), (C25799b) ((C74176nj) jN).f206677a.lC.mo17428b(), new C43630d(((C74176nj) jN).mo69777gH()), ((C74176nj) jN).f206836d.mo69016cR(), (C37215b) ((C74176nj) jN).f206730b.f198027a.f199167S.mo17428b(), ((C74176nj) jN).mo69786gQ(), (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f76722d));
                    } else {
                        String obj = C28195j.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C28190e.m52729a(th2, th3);
            }
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
