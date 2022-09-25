package com.google.android.apps.search.podcasts;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.p10550b.p10551a.C139994g;
import com.google.android.apps.search.podcasts.p10550b.p10552b.C140022ao;
import com.google.android.apps.search.podcasts.p10550b.p10553c.C140050b;
import com.google.android.apps.search.podcasts.p10550b.p10555e.C140084z;
import com.google.android.apps.search.podcasts.p10550b.p10556f.C140097al;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai;
import com.google.android.apps.search.podcasts.p10565f.C140279a;
import com.google.android.apps.search.podcasts.p10565f.C140280aa;
import com.google.android.apps.search.podcasts.p10565f.C140284ae;
import com.google.android.apps.search.podcasts.p10565f.C140285af;
import com.google.android.apps.search.podcasts.p10565f.C140286ag;
import com.google.android.apps.search.podcasts.p10565f.C140287ah;
import com.google.android.apps.search.podcasts.p10565f.C140289aj;
import com.google.android.apps.search.podcasts.p10565f.C140290ak;
import com.google.android.apps.search.podcasts.p10565f.C140291al;
import com.google.android.apps.search.podcasts.p10565f.C140292am;
import com.google.android.apps.search.podcasts.p10565f.C140293an;
import com.google.android.apps.search.podcasts.p10565f.C140294ao;
import com.google.android.apps.search.podcasts.p10565f.C140296aq;
import com.google.android.apps.search.podcasts.p10565f.C140297ar;
import com.google.android.apps.search.podcasts.p10565f.C140298as;
import com.google.android.apps.search.podcasts.p10565f.C140299at;
import com.google.android.apps.search.podcasts.p10565f.C140300au;
import com.google.android.apps.search.podcasts.p10565f.C140301av;
import com.google.android.apps.search.podcasts.p10565f.C140302aw;
import com.google.android.apps.search.podcasts.p10565f.C140303ax;
import com.google.android.apps.search.podcasts.p10565f.C140304ay;
import com.google.android.apps.search.podcasts.p10565f.C140305az;
import com.google.android.apps.search.podcasts.p10565f.C140310f;
import com.google.android.apps.search.podcasts.p10565f.C140312h;
import com.google.android.apps.search.podcasts.p10565f.C140313i;
import com.google.android.apps.search.podcasts.p10565f.C140314j;
import com.google.android.apps.search.podcasts.p10565f.C140316l;
import com.google.android.apps.search.podcasts.p10565f.C140317m;
import com.google.android.apps.search.podcasts.p10565f.C140318n;
import com.google.android.apps.search.podcasts.p10565f.C140319o;
import com.google.android.apps.search.podcasts.p10565f.C140321q;
import com.google.android.apps.search.podcasts.p10565f.C140322r;
import com.google.android.apps.search.podcasts.p10565f.C140323s;
import com.google.android.apps.search.podcasts.p10565f.C140324t;
import com.google.android.apps.search.podcasts.p10565f.C140326v;
import com.google.android.apps.search.podcasts.p10565f.C140327w;
import com.google.android.apps.search.podcasts.p10565f.C140328x;
import com.google.android.apps.search.podcasts.p10571i.C140406a;
import com.google.android.apps.search.podcasts.p10571i.C140415j;
import com.google.android.apps.search.podcasts.p10573k.p10575b.C140436c;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10576l.C140498j;
import com.google.android.apps.search.podcasts.p10590o.C140709b;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.p10601r.p10605c.C140967d;
import com.google.android.apps.search.podcasts.p10601r.p10607e.C140978b;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.apps.search.podcasts.player.p10592a.C140770r;
import com.google.android.apps.search.podcasts.playerpanel.C140896b;
import com.google.android.apps.search.podcasts.widgets.p10624f.C141243d;
import com.google.android.apps.search.podcasts.widgets.p10624f.C141244e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.local.C46855i;
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
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3711b.C47694b;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.m */
/* compiled from: PG */
public final class C140639m extends C139963aa implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C141182w f381968a;

    /* renamed from: c */
    private Context f381969c;

    /* renamed from: d */
    private final C2393x f381970d = new C2393x(this);

    /* renamed from: e */
    private boolean f381971e;

    @Deprecated
    public C140639m() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C141182w mo17754z() {
        C141182w wVar = this.f381968a;
        if (wVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f381971e) {
            return wVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo115365b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f381969c == null) {
            this.f381969c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f381969c;
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
        return this.f381970d;
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
            C140437l.m228145a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C141182w a = mo17754z();
            a.f383290d.mo50828h(R.id.podcasts_main_playback_state_subcription, new C140416j(a.f383294h), a.f383292f);
            a.f383296j.mo50429i(a.f383300n);
            a.f383296j.mo50429i(a.f383299m);
            a.f383291e.mo115657c();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140437l.m228145a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C141182w a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.podcasts_main_fragment, viewGroup, false);
            BottomNavigationView bottomNavigationView = (BottomNavigationView) inflate.findViewById(R.id.podcasts_bottom_nav);
            C141244e eVar = a.f383295i;
            C58485gu p = C58485gu.m89848p(Integer.valueOf(R.navigation.podcasts_home_tab_nav_graph), Integer.valueOf(R.navigation.podcasts_explore_tab_nav_graph), Integer.valueOf(R.navigation.podcasts_library_nav_graph));
            C140639m mVar = a.f383288b;
            C46485f fVar = (C46485f) eVar.f383462a.mo17428b();
            fVar.getClass();
            C47770dh dhVar = (C47770dh) eVar.f383463b.mo17428b();
            dhVar.getClass();
            C47694b bVar = (C47694b) eVar.f383464c.mo17428b();
            bVar.getClass();
            bottomNavigationView.getClass();
            p.getClass();
            mVar.getClass();
            a.f383306t = new C141243d(fVar, dhVar, bVar, bottomNavigationView, p, mVar, bundle);
            if (bundle != null && bundle.containsKey("extra_subscription_count")) {
                a.f383307u = C58833ax.m90834k(Integer.valueOf(bundle.getInt("extra_subscription_count")));
            }
            a.mo116213d();
            BottomSheetBehavior C = BottomSheetBehavior.m78767C(inflate.findViewById(R.id.podcasts_players_panel_container));
            C.f115902m = false;
            C.f115894e = -1;
            C.mo47516N(C141182w.m229194a(a.f383288b) + a.f383288b.getResources().getDimensionPixelSize(R.dimen.podcasts_collapsed_player_height));
            C.mo47506D(new C140953r(a));
            C.f115896g = true;
            inflate.findViewById(R.id.podcasts_mask).setOnClickListener(new C140698o(C));
            inflate.findViewById(R.id.podcasts_collapsed_player_panel_container).setOnClickListener(new C47591co(a.f383289c, "collapsed player clicked", new C140734p(C)));
            C140285af afVar = a.f383293g;
            C69664n.m101061g(inflate, "rootView");
            C47393f.m84234e(inflate, C140303ax.class, new C140328x(afVar));
            C47393f.m84234e(inflate, C140291al.class, new C140316l(afVar, inflate));
            C47393f.m84234e(inflate, C140302aw.class, new C140317m(afVar));
            C47393f.m84234e(inflate, C140292am.class, new C140318n(afVar));
            C47393f.m84234e(inflate, C140294ao.class, new C140319o(afVar));
            C47393f.m84234e(inflate, C140298as.class, new C140324t(afVar));
            C47393f.m84234e(inflate, C140299at.class, new C140326v(afVar, inflate));
            C47393f.m84234e(inflate, C140297ar.class, new C140323s(afVar));
            C47393f.m84234e(inflate, C140296aq.class, new C140322r(afVar));
            C47393f.m84234e(inflate, C140290ak.class, new C140314j(inflate));
            C47393f.m84234e(inflate, C140304ay.class, new C140280aa(afVar, inflate));
            C47393f.m84234e(inflate, C140305az.class, new C140284ae(afVar, inflate));
            C47393f.m84234e(inflate, C140287ah.class, new C140312h(afVar, inflate));
            C47393f.m84234e(inflate, C140286ag.class, new C140313i(afVar));
            C47393f.m84234e(inflate, C140279a.class, new C140310f(afVar, inflate));
            C47393f.m84234e(inflate, C140293an.class, new C140321q(afVar));
            C47393f.m84234e(inflate, C140300au.class, new C140327w(inflate));
            a.f383301o.mo33801b(inflate.findViewById(R.id.podcasts_players_panel_container), a.f383301o.f76990a.mo33805a(C28427h.m53115a(40818)));
            C2043bi.m5555ai(inflate, new C140941q(a, C));
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C140437l.m228145a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            C60870cx a = mo17754z().f383291e.f381410e.f380513c.mo45937a(C139994g.f380505a);
            C69664n.m101060f(a, "databaseConnection.execu…      }\n      count\n    }");
            C46459k.m82829b(a, "Failed to prune stale metadata", new Object[0]);
            b.close();
            return;
        } catch (Throwable th) {
            C140437l.m228145a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            mo17754z().f383306t = null;
            c.close();
            return;
        } catch (Throwable th) {
            C140437l.m228145a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f381971e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140437l.m228145a(th, th);
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
            C140437l.m228145a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            C141182w a = mo17754z();
            C141243d dVar = a.f383306t;
            if (dVar != null) {
                C69664n.m101061g(bundle, "outState");
                bundle.putInt("saved_state_selected_tab_id", dVar.f383455c.f116865b.f116936e);
            }
            if (a.f383307u.mo56113h()) {
                bundle.putInt("extra_subscription_count", ((Integer) a.f383307u.mo56107c()).intValue());
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140437l.m228145a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f122869b.mo51381i();
        try {
            mo51117r();
            mo17754z().f383291e.mo115656b();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140437l.m228145a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f122869b.mo51381i();
        try {
            mo51118s();
            C140415j jVar = mo17754z().f383291e;
            if (C19559g.m37305d(Thread.currentThread())) {
                C140415j.m228122a(jVar, jVar.f381408c.mo115879a());
            } else {
                C140989k.m228950h(jVar.f381408c.mo115883e(), new C140406a(jVar));
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140437l.m228145a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C141182w a = mo17754z();
            C47393f.m84233d(this, C140896b.class, new C141290x(a));
            C47393f.m84233d(this, C140289aj.class, new C141291y(a));
            C47393f.m84233d(this, C140301av.class, new C141292z(a));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140437l.m228145a(th, th);
        }
        throw th;
    }

    public final void onViewStateRestored(Bundle bundle) {
        float f;
        super.onViewStateRestored(bundle);
        C141182w a = mo17754z();
        if (bundle != null) {
            View findViewById = a.f383288b.requireView().findViewById(R.id.podcasts_players_panel_container);
            int i = BottomSheetBehavior.m78767C(findViewById).f115862E;
            if (i == 4) {
                f = 0.0f;
            } else if (i != 5) {
                f = 1.0f;
            } else {
                return;
            }
            a.mo116214e(findViewById, f);
        }
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
        C140639m mVar;
        this.f122869b.mo51381i();
        try {
            if (!this.f381971e) {
                super.onAttach(context);
                if (this.f381968a == null) {
                    try {
                        Object jN = mo115366d().mo17653jN();
                        Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                        if (fragment instanceof C140639m) {
                            C140639m mVar2 = (C140639m) fragment;
                            C68225k.m98532d(mVar2);
                            C47770dh dhVar = (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b();
                            AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                            C46855i iVar = (C46855i) ((C74176nj) jN).f207083j.mo17428b();
                            C140415j dv = ((C74176nj) jN).f206730b.f198027a.mo66875dv();
                            C140790h hVar = (C140790h) ((C74176nj) jN).f206730b.f198027a.f199159K.mo17428b();
                            C140133ai aiVar = (C140133ai) ((C74176nj) jN).f206730b.f198027a.f199153E.mo17428b();
                            C140097al alVar = (C140097al) ((C74176nj) jN).f206730b.f198027a.f199152D.mo17428b();
                            C140709b bVar = (C140709b) ((C74176nj) jN).f206730b.f198027a.f199160L.mo17428b();
                            C46778cv cvVar = (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b();
                            C140084z zVar = (C140084z) ((C74176nj) jN).f206730b.f198027a.f199155G.mo17428b();
                            C140978b bVar2 = new C140978b((Context) ((C74176nj) jN).f206836d.f205391d.mo17428b());
                            C47770dh dhVar2 = (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b();
                            C140022ao aoVar = (C140022ao) ((C74176nj) jN).f206730b.f198027a.f199157I.mo17428b();
                            C140770r dy = ((C74176nj) jN).f206730b.f198027a.mo66878dy();
                            C140459au auVar = (C140459au) ((C74176nj) jN).f206730b.f198027a.f199879y.mo17428b();
                            C141182w wVar = new C141182w(mVar2, dhVar, accountId, iVar, dv, new C140285af(hVar, aiVar, alVar, bVar, cvVar, zVar, bVar2, dhVar2, aoVar, dy, auVar, new C140967d(((C46897i) ((C74176nj) jN).f206677a.d.f201488a.a.f202914g.mo17428b()).mo50901a("com.google.android.apps.podcasts_android.device 45362907").mo50907f(), (C140498j) ((C74176nj) jN).f206677a.b.f199997bK.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b()), (C140436c) ((C74176nj) jN).f206730b.f198027a.f199508gO.mo17428b()), new C140420k((C140790h) ((C74176nj) jN).f206730b.f198027a.f199159K.mo17428b(), (C140050b) ((C74176nj) jN).f206730b.f198027a.f199156H.mo17428b()), new C141244e(((C74176nj) jN).f206995g, ((C74176nj) jN).f206730b.f198663m, ((C74176nj) jN).f206701aX), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (C140133ai) ((C74176nj) jN).f206730b.f198027a.f199153E.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C140459au) ((C74176nj) jN).f206730b.f198027a.f199879y.mo17428b(), (C140050b) ((C74176nj) jN).f206730b.f198027a.f199156H.mo17428b(), (C140436c) ((C74176nj) jN).f206730b.f198027a.f199508gO.mo17428b());
                            mVar = this;
                            mVar.f381968a = wVar;
                            super.getLifecycle().mo5790b(new TracedFragmentLifecycle(mVar.f122869b, mVar.f381970d));
                        } else {
                            String obj = C141182w.class.toString();
                            String valueOf = String.valueOf(fragment.getClass());
                            throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        C47831fm.m85019n();
                        throw th2;
                    }
                } else {
                    mVar = this;
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = mVar.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            C47831fm.m85019n();
            throw th22;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
