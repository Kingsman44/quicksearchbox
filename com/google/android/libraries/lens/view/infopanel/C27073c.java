package com.google.android.libraries.lens.view.infopanel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C73958bn;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.infopanel.bottomsheet.LensResultPanelBottomsheetBehavior;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26980p;
import com.google.android.libraries.lens.view.infopanel.p2140b.C27031s;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27078e;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27079f;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27080g;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27081h;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27082i;
import com.google.android.libraries.lens.view.infopanel.p2145f.C27188c;
import com.google.android.libraries.lens.view.p2053ad.C24981d;
import com.google.android.libraries.lens.view.p2056af.C25073c;
import com.google.android.libraries.lens.view.p2074ap.C25466f;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2078at.C25543z;
import com.google.android.libraries.lens.view.p2078at.p2079a.C25490e;
import com.google.android.libraries.lens.view.p2092c.C25699a;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.p2161r.C27655b;
import com.google.android.libraries.lens.view.p2180z.C28225a;
import com.google.android.libraries.lens.view.session.C27766bb;
import com.google.android.libraries.lens.view.srpx.C28044j;
import com.google.android.libraries.lens.view.srpx.C28049o;
import com.google.android.libraries.lens.view.srpx.C28052q;
import com.google.android.libraries.lens.view.srpx.LensRequestBlockObserver;
import com.google.android.libraries.lens.view.utils.C28134w;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.silk.web.core.C40756j;
import com.google.android.libraries.search.silk.web.core.C40757k;
import com.google.android.libraries.search.silk.web.core.C40758l;
import com.google.android.libraries.search.silk.web.share.C40907c;
import com.google.android.libraries.search.silk.web.share.SilkShareFeature;
import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.contrib.logging.LoggingFeature;
import com.google.android.libraries.web.webview.contrib.setup.WebViewSetupFeature;
import com.google.apps.tiktok.account.AccountId;
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
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4552o.apk;
import com.google.common.p4552o.p4563i.C59892ba;
import com.google.common.p4552o.p4563i.C59895bd;
import com.google.lens.p4711m.C62632i;
import com.google.net.p4726a.p4727a.C62722b;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.infopanel.c */
/* compiled from: PG */
public final class C27073c extends C27086cd implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C27195m f73807a;

    /* renamed from: b */
    private Context f73808b;

    /* renamed from: c */
    private final C2393x f73809c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f73810d = new C47515ab(this);

    /* renamed from: e */
    private boolean f73811e;

    @Deprecated
    public C27073c() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C27195m mo17754z() {
        C27195m mVar = this.f73807a;
        if (mVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f73811e) {
            return mVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo32520b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f73808b == null) {
            this.f73808b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f73808b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f73810d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f73809c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f73810d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f73810d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27009b.m50108a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f73810d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C27009b.m50108a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f73810d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27009b.m50108a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo17754z().mo32634n(configuration.screenWidthDp);
    }

    public final void onCreate(Bundle bundle) {
        this.f73810d.mo51381i();
        try {
            super.onCreate(bundle);
            C27195m a = mo17754z();
            a.f74348l.mo33143a(a);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27009b.m50108a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f73810d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C27009b.m50108a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f73810d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C27195m a = mo17754z();
            a.f74361y = (InfoPanelView) layoutInflater.inflate(R.layout.lens_info_panel, viewGroup, false);
            InfoPanelView infoPanelView = a.f74361y;
            C28310af afVar = a.f74341e;
            C28443m mVar = a.f74343g;
            C28306ab abVar = a.f74342f;
            infoPanelView.f73491e = mVar;
            infoPanelView.f73493g = (int) C28134w.m52424a(48.0f, infoPanelView.getContext());
            infoPanelView.f73496j = C27070bx.m50232a(infoPanelView.f73489c.f73586a, infoPanelView.mo32356f());
            infoPanelView.f73498l = new C27188c(infoPanelView.mo32356f(), afVar, mVar, abVar);
            infoPanelView.f73498l.mo32622e();
            if (a.f74359w && a.f74360x.mo30591a()) {
                a.mo32626e();
            }
            C27193k kVar = new C27193k(a);
            C27207w a2 = a.f74361y.f73489c.f73586a.mo17754z();
            a2.f74390d.f74379d.setOnClickListener(new C47591co(a2.f74396j, "Click down caret", kVar));
            a.f74342f.mo33801b(a.f74361y, a.f74341e.mo33805a(C28427h.m53115a(51774)));
            a.f74357u.add(new C27194l(a));
            a.f74357u.add(a.f74346j);
            a.f74357u.add(a.f74349m);
            InfoPanelView infoPanelView2 = a.f74361y;
            infoPanelView2.f73502p = new C27185f(a);
            infoPanelView2.f73492f = a;
            a.f74347k.mo32475d(infoPanelView2);
            C43264o oVar = (C43264o) a.f74338b.getChildFragmentManager().f634a.mo671c("srpx-web-coordinator-fragment");
            if (oVar != null) {
                ((C28049o) oVar.mo17754z().mo46379a()).mo17754z().f76342l = a;
            }
            a.f74351o.f69401a.mo5704e(a.f74338b.getViewLifecycleOwner(), new C27189g(a));
            a.f74354r.f75782a.mo5704e(a.f74338b.getViewLifecycleOwner(), new C27190h(a));
            a.f74344h.f73569c.mo5704e(a.f74338b.getViewLifecycleOwner(), new C27191i(a));
            a.f74344h.f73570d.mo5704e(a.f74338b.getViewLifecycleOwner(), new C27192j(a));
            a.mo32634n(a.f74361y.getContext().getResources().getConfiguration().screenWidthDp);
            if (C62632i.m94823h(a.f74358v.mo32701h())) {
                a.f74361y.f73500n = 0;
            } else {
                Resources resources = a.f74338b.getResources();
                a.f74361y.f73500n = resources.getDimensionPixelSize(R.dimen.filter_carousel_height_with_borders) + resources.getDimensionPixelSize(R.dimen.lens_info_panel_peek_height_offset);
            }
            LensResultPanelBottomsheetBehavior.m50197t(a.f74361y).f73764v = a.f74359w;
            LensResultPanelBottomsheetBehavior.m50197t(a.f74361y).f73763u = a.f74340d;
            InfoPanelView infoPanelView3 = a.f74361y;
            if (infoPanelView3 != null) {
                C47831fm.m85019n();
                return infoPanelView3;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C27009b.m50108a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f73810d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C27009b.m50108a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f73810d.mo51375c();
        try {
            super.onDestroyView();
            C27195m a = mo17754z();
            a.f74347k.mo32476e(a.f74361y);
            c.close();
            return;
        } catch (Throwable th) {
            C27009b.m50108a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f73810d.mo51376d();
        try {
            super.onDetach();
            this.f73811e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C27009b.m50108a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f73810d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C27009b.m50108a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f73810d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C27009b.m50108a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f73810d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27009b.m50108a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f73810d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C27009b.m50108a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f73810d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f73810d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27009b.m50108a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f73810d.mo51381i();
        try {
            super.onStop();
            C27195m a = mo17754z();
            C25073c cVar = a.f74355s;
            C62722b bVar = C62722b.CANCELLED;
            C59892ba baVar = (C59892ba) C59895bd.f161854d.createBuilder();
            int r = a.mo32638r();
            baVar.copyOnWrite();
            C59895bd bdVar = (C59895bd) baVar.instance;
            bdVar.f161857b = r - 1;
            bdVar.f161856a |= 1;
            cVar.mo30252a(bVar, (C59895bd) baVar.build());
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27009b.m50108a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f73810d.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C27195m a = mo17754z();
            C47393f.m84233d(this, C27082i.class, new C27196n(a));
            C47393f.m84233d(this, C27079f.class, new C27197o(a));
            C47393f.m84233d(this, C27081h.class, new C27198p(a));
            C47393f.m84233d(this, C27080g.class, new C27199q(a));
            C47393f.m84233d(this, C27078e.class, new C27200r(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27009b.m50108a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f73810d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f73810d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f73810d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReenterTransition(obj);
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void setReturnTransition(Object obj) {
        C47515ab abVar = this.f73810d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f73810d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f73810d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f73810d.mo51381i();
        try {
            if (!this.f73811e) {
                super.onAttach(context);
                if (this.f73807a == null) {
                    Object jN = mo32524d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C27073c) {
                        C27073c cVar = (C27073c) fragment;
                        C68225k.m98532d(cVar);
                        C73958bn bnVar = ((C74176nj) jN).f206836d;
                        C40758l eH = bnVar.f205338c.f198027a.mo66888eH();
                        C43259j jVar = new C43259j();
                        jVar.f113072o.add(LensRequestBlockObserver.class);
                        C40756j jVar2 = (C40756j) C40757k.f106857c.createBuilder();
                        apk apk = apk.LENS_ANDROID;
                        jVar2.copyOnWrite();
                        C40757k kVar = (C40757k) jVar2.instance;
                        kVar.f106860b = apk.f159677E;
                        kVar.f106859a |= 1;
                        jVar.mo46372b(LoggingFeature.m77099d(C28052q.class), WebViewSetupFeature.m78387d(C25490e.class), eH.mo42702a((C40757k) jVar2.build()), SilkShareFeature.m70984e(new C40907c()));
                        jVar.mo46375e(String.format(Locale.US, "GoogleLens/%s", new Object[]{(String) bnVar.f205285b.S.mo17428b()}));
                        this.f73807a = new C27195m(accountId, cVar, (C26244b) ((C74176nj) jN).f206836d.f205444z.mo17428b(), jVar.mo46371a(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C25073c) ((C74176nj) jN).f206730b.f198027a.f199484fr.mo17428b(), (C26980p) ((C74176nj) jN).f206836d.f205248aP.mo17428b(), (C26990ah) ((C74176nj) jN).f206836d.f205251aS.mo17428b(), (C25699a) ((C74176nj) jN).f206836d.f205280av.mo17428b(), (C27031s) ((C74176nj) jN).f206836d.f205252aT.mo17428b(), (C27655b) ((C74176nj) jN).f206836d.f205260ab.mo17428b(), (C28225a) ((C74176nj) jN).f206836d.f205253aU.mo17428b(), (C37215b) ((C74176nj) jN).f206730b.f198027a.f199167S.mo17428b(), (C24981d) ((C74176nj) jN).f206836d.f205231Z.mo17428b(), (C25466f) ((C74176nj) jN).f206836d.f205224S.mo17428b(), (C28044j) ((C74176nj) jN).f206732bB.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C25537t) ((C74176nj) jN).f206836d.f205273ao.mo17428b(), (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b(), (C27766bb) ((C74176nj) jN).f206836d.f205254aV.mo17428b(), ((C74176nj) jN).mo69676eM(), (C27232l) ((C74176nj) jN).f206836d.f205441w.mo17428b(), ((C74176nj) jN).f206836d.mo69016cR(), ((Integer) ((C74176nj) jN).f206836d.f205222Q.mo17428b()).intValue(), (C25543z) ((C74176nj) jN).f206836d.f205229X.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f73810d, this.f73809c));
                    } else {
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + C27195m.class.toString() + ", but the wrapper available is of type: " + String.valueOf(fragment.getClass()) + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f73810d;
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
                C27009b.m50108a(th2, th3);
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
