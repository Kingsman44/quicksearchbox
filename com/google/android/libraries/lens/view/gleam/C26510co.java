package com.google.android.libraries.lens.view.gleam;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C73958bn;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.filters.p2101e.C25976a;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.frozenimage.C26270b;
import com.google.android.libraries.lens.view.frozenimage.C26275g;
import com.google.android.libraries.lens.view.gleam.C26559ej;
import com.google.android.libraries.lens.view.gleam.ObjectLayerView;
import com.google.android.libraries.lens.view.gleam.region.C26616g;
import com.google.android.libraries.lens.view.gleam.region.C26618i;
import com.google.android.libraries.lens.view.livingsurfaces.C27251j;
import com.google.android.libraries.lens.view.p2078at.C25499ae;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2087ay.C25624ag;
import com.google.android.libraries.lens.view.p2087ay.C25664y;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.render.C27661c;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.account.AccountId;
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
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3694d.C47602b;
import com.google.common.base.C58833ax;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.gleam.co */
/* compiled from: PG */
public final class C26510co extends C26596fp implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C26540dr f72246a;

    /* renamed from: b */
    private Context f72247b;

    /* renamed from: c */
    private final C2393x f72248c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f72249d = new C47515ab(this);

    /* renamed from: e */
    private boolean f72250e;

    @Deprecated
    public C26510co() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C26540dr mo17754z() {
        C26540dr drVar = this.f72246a;
        if (drVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f72250e) {
            return drVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo31781b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f72247b == null) {
            this.f72247b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f72247b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f72249d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f72248c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f72249d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f72249d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26509cn.m48967a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f72249d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C26509cn.m48967a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f72249d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26509cn.m48967a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f72249d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26509cn.m48967a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f72249d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C26509cn.m48967a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f72249d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C26540dr a = mo17754z();
            AccountId accountId = a.f72337d;
            C26618i iVar = new C26618i();
            C68324h.m98669f(iVar);
            C47247a.m84047b(iVar, accountId);
            C0154a aVar = new C0154a(a.f72336c.getChildFragmentManager());
            aVar.mo689v(R.id.region_overlay_container, iVar, "region_fragment_tag");
            aVar.mo509f();
            a.f72338e.f72302l = iVar.mo17754z();
            C26526dd ddVar = a.f72338e;
            C25758g gVar = ddVar.f72308r;
            C25758g gVar2 = ddVar.f72307q;
            C25758g gVar3 = ddVar.f72310t;
            C25758g gVar4 = ddVar.f72309s;
            a.f72354u = ddVar.f72311u;
            C25758g gVar5 = ddVar.f72313w;
            a.f72358y = (FrameLayout) layoutInflater.inflate(R.layout.gleam_overlay, viewGroup, false);
            a.f72356w = (GleamingView) a.f72358y.findViewById(R.id.object_gleaming_view);
            a.f72355v = a.f72356w.mo17754z();
            a.f72355v.f72391J = new C26527de(a);
            a.f72338e.f72301k = a.f72345l;
            a.f72345l.mo31874f(new C28452b(a.f72346m.mo33801b(a.f72356w, a.f72344k.mo33805a(C28427h.m53115a(65020)))));
            a.f72341h.mo32781f(a.f72358y);
            a.f72357x = new C26581fa(a.f72339f, new C26531di(a), a.f72349p);
            a.f72355v.f72389H = a.f72357x;
            gVar.mo5704e(a.f72336c, new C26532dj(a));
            gVar2.mo5704e(a.f72336c, new C26533dk(a));
            gVar3.mo5704e(a.f72336c, new C26534dl(a));
            gVar4.mo5704e(a.f72336c, new C26535dm(a));
            a.f72348o.mo30903g().mo5704e(a.f72336c, new C26535dm(a));
            a.f72354u.mo5704e(a.f72336c, new C26536dn(a));
            gVar5.mo5704e(a.f72336c, new C26537do(a));
            a.f72342i.f72478e.mo5704e(a.f72336c.getViewLifecycleOwner(), new C26538dp(a));
            a.f72347n.f69455a.mo5704e(a.f72336c, new C26530dh(a));
            FrameLayout frameLayout = a.f72358y;
            if (frameLayout != null) {
                C47831fm.m85019n();
                return frameLayout;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C26509cn.m48967a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f72249d.mo51374b();
        try {
            super.onDestroy();
            C26526dd ddVar = mo17754z().f72338e;
            ddVar.mo31771g();
            ddVar.f72296f.mo30778l(ddVar.f72285H);
            C26270b bVar = ddVar.f72300j;
            if (bVar != null) {
                ((C26275g) bVar).f71415e = null;
            }
            b.close();
            return;
        } catch (Throwable th) {
            C26509cn.m48967a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f72249d.mo51375c();
        try {
            super.onDestroyView();
            C26540dr a = mo17754z();
            if (a.f72349p) {
                a.f72333A = C58833ax.m90833j((Object) null);
            }
            C27661c cVar = a.f72353t;
            if (cVar != null) {
                cVar.mo33156c();
                a.f72353t = null;
            }
            c.close();
            return;
        } catch (Throwable th) {
            C26509cn.m48967a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f72249d.mo51376d();
        try {
            super.onDetach();
            this.f72250e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C26509cn.m48967a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f72249d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C26509cn.m48967a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f72249d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C26509cn.m48967a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f72249d.mo51381i();
        try {
            super.onPause();
            C26540dr a = mo17754z();
            a.mo31811d();
            if (!C26540dr.f72332b) {
                Choreographer.getInstance().removeFrameCallback(a.f72352s);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26509cn.m48967a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f72249d.mo51377e();
        try {
            super.onResume();
            C26540dr a = mo17754z();
            if (!C26540dr.f72332b) {
                Choreographer.getInstance().postFrameCallback(a.f72352s);
            }
            e.close();
            return;
        } catch (Throwable th) {
            C26509cn.m48967a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f72249d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f72249d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26509cn.m48967a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f72249d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26509cn.m48967a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f72249d.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C26540dr a = mo17754z();
            C47393f.m84233d(this, C26559ej.C26560a.class, new C26541ds(a));
            C47393f.m84233d(this, C26559ej.C26561b.class, new C26542dt(a));
            C47393f.m84233d(this, ObjectLayerView.C26440a.class, new C26543du(a));
            C47393f.m84233d(this, C26616g.class, new C26544dv(a));
            C47393f.m84233d(this, C26559ej.C26563d.class, new C26545dw(a));
            C47393f.m84233d(this, C26559ej.C26562c.class, new C26546dx(a));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C26509cn.m48967a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f72249d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f72249d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f72249d;
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
        C47515ab abVar = this.f72249d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f72249d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f72249d;
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
        this.f72249d.mo51381i();
        try {
            if (!this.f72250e) {
                super.onAttach(context);
                if (this.f72246a == null) {
                    Object jN = mo31856d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C26510co) {
                        C26510co coVar = (C26510co) fragment;
                        C68225k.m98532d(coVar);
                        C26526dd ddVar = new C26526dd((Executor) ((C74176nj) jN).f206677a.lL.mo17428b(), (Executor) ((C74176nj) jN).f206677a.d.f201680dg.mo17428b(), (Executor) ((C74176nj) jN).f206677a.d.f201681dh.mo17428b(), (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), ((C74176nj) jN).f206836d.mo69034q(), (C25664y) ((C74176nj) jN).f206836d.f205240aH.mo17428b(), new C25976a(((C74176nj) jN).f206836d.mo69010ar()), (C25537t) ((C74176nj) jN).f206836d.f205273ao.mo17428b(), (C25624ag) ((C74176nj) jN).f206836d.f205241aI.mo17428b(), (C26244b) ((C74176nj) jN).f206836d.f205444z.mo17428b(), (C26637y) ((C74176nj) jN).f206836d.f205242aJ.mo17428b(), (C25989d) ((C74176nj) jN).f206836d.f205212G.mo17428b(), (C37215b) ((C74176nj) jN).f206730b.f198027a.f199167S.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60890d(), ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199598hz.mo17428b()).booleanValue(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66959fZ().f185304a.mo17428b()).mo50901a("com.google.android.apps.search.lens.user 45376885").mo50907f());
                        C73958bn bnVar = ((C74176nj) jN).f206836d;
                        C26603l lVar = (C26603l) C68219e.m98518a(((C74176nj) jN).f206836d.f205246aN).mo27525b();
                        C68225k.m98532d(lVar);
                        C27232l lVar2 = (C27232l) ((C74176nj) jN).f206836d.f205441w.mo17428b();
                        boolean cS = ((C74176nj) jN).f206836d.mo69017cS();
                        boolean i = ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60895i();
                        C47602b bVar = new C47602b((C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b());
                        ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60907u();
                        this.f72246a = new C26540dr(coVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), ddVar, (C21370a) ((C74176nj) jN).f206677a.i.mo17428b(), (C25989d) ((C74176nj) jN).f206836d.f205212G.mo17428b(), (C27251j) ((C74176nj) jN).f206836d.f205243aK.mo17428b(), bnVar.f205245aM, (C26586ff) bnVar.f205233aA.mo17428b(), (C26244b) ((C74176nj) jN).f206836d.f205444z.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), lVar, (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C25499ae) ((C74176nj) jN).f206836d.f205247aO.mo17428b(), (LensConnectivityManager) ((C74176nj) jN).f206836d.f205208C.mo17428b(), cS, i, bVar, ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66959fZ().f185304a.mo17428b()).mo50901a("com.google.android.apps.search.lens.user 45375023").mo50907f(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.mo66959fZ().f185304a.mo17428b()).mo50901a("com.google.android.apps.search.lens.user 45375442").mo50907f());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f72249d, this.f72248c));
                    } else {
                        String obj = C26540dr.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f72249d;
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
                C26509cn.m48967a(th2, th3);
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
