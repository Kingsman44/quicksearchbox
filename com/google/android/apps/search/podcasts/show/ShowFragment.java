package com.google.android.apps.search.podcasts.show;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.RecyclerView;
import android.support.p033v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C1877c;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.p10550b.p10551a.C139997j;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10600q.C140951j;
import com.google.android.apps.search.podcasts.show.p10614a.C141108a;
import com.google.android.apps.search.podcasts.show.p10616c.C141147h;
import com.google.android.apps.search.podcasts.show.p10616c.C141150k;
import com.google.android.apps.search.podcasts.show.p10618d.C141153a;
import com.google.android.apps.search.podcasts.show.p10618d.C141154b;
import com.google.android.apps.search.podcasts.show.p10618d.C141155c;
import com.google.android.apps.search.podcasts.show.p10618d.C141156d;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141250a;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141254e;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141213d;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141215f;
import com.google.android.apps.search.podcasts.widgets.p10623e.C141230b;
import com.google.android.apps.search.podcasts.widgets.p10625g.C141259b;
import com.google.android.apps.search.podcasts.widgets.p10625g.C141261d;
import com.google.android.apps.search.podcasts.widgets.p10627i.C141265c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.play.unison.binding.C31972au;
import com.google.android.libraries.play.unison.binding.C31974aw;
import com.google.android.libraries.play.unison.binding.RootBindableController$Builder;
import com.google.android.material.appbar.AppBarLayout;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46726bj;
import com.google.apps.tiktok.dataservice.C46728bl;
import com.google.apps.tiktok.dataservice.C46778cv;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47579cc;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47701a;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47707g;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69644aa;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class ShowFragment extends C141131ap implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C141175w f383101a;

    /* renamed from: c */
    private Context f383102c;

    /* renamed from: d */
    private final C2393x f383103d = new C2393x(this);

    /* renamed from: e */
    private boolean f383104e;

    @Deprecated
    public ShowFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C141175w mo17754z() {
        C141175w wVar = this.f383101a;
        if (wVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f383104e) {
            return wVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo116160b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f383102c == null) {
            this.f383102c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f383102c;
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
        return this.f383103d;
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
            C141170r.m229178a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C141175w a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            String str = a.f383265b.f383151a;
            C69664n.m101060f(str, "showArgs.feedUrl");
            View inflate = layoutInflater.inflate(R.layout.podcasts_show_fragment, viewGroup, false);
            C69664n.m101060f(inflate, "inflater.inflate(R.layou…* attachToRoot= */ false)");
            AppBarLayout appBarLayout = (AppBarLayout) inflate.findViewById(R.id.podcasts_appbar_layout);
            appBarLayout.f115671f = R.id.podcasts_show_recycler_view;
            appBarLayout.mo47403m();
            C69664n.m101060f(appBarLayout, BuildConfig.FLAVOR);
            C141215f.m229224b(appBarLayout);
            Toolbar toolbar = (Toolbar) appBarLayout.findViewById(R.id.podcasts_appbar_header_toolbar);
            toolbar.mo2393g().add(0, R.id.podcasts_view_rss_feed_menu_item, 0, R.string.podcasts_view_rss_feed);
            MenuItem findItem = toolbar.mo2393g().findItem(R.id.podcasts_view_rss_feed_menu_item);
            findItem.setIcon(C1877c.m5125a(inflate.getContext(), R.drawable.quantum_gm_ic_rss_feed_vd_theme_24));
            findItem.setOnMenuItemClickListener(new C47579cc(a.f383270g, "View RSS feed", new C141174v(a, inflate)));
            C141213d dVar = a.f383274k;
            C69664n.m101060f(toolbar, "this");
            dVar.mo116228c(toolbar);
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.podcasts_swipe_refresh);
            C69664n.m101060f(swipeRefreshLayout, BuildConfig.FLAVOR);
            C141265c.m229299a(swipeRefreshLayout);
            swipeRefreshLayout.f13508a = new C47701a(a.f383269f, "Swipe refresh show page", new C141171s(a));
            View findViewById = inflate.findViewById(R.id.podcasts_show_recycler_view);
            C69664n.m101060f(findViewById, "rootView.findViewById(R.…casts_show_recycler_view)");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            C141230b.m229247a(recyclerView, C69540x.m100944b(Integer.valueOf(R.layout.podcasts_show_episode_item)));
            Context context = recyclerView.getContext();
            C69664n.m101060f(context, "recyclerView.context");
            recyclerView.addItemDecoration$ar$ds(C141259b.m229290a(context));
            Context context2 = inflate.getContext();
            C69664n.m101060f(context2, "rootView.context");
            recyclerView.addItemDecoration$ar$ds(C141261d.m229291a(context2));
            RootBindableController$Builder a2 = C31972au.m59570a(a.f383272i, C140951j.m228907a(recyclerView, a.f383273j.f383110a.mo116036a()));
            a2.f85926a = true;
            a.f383278o = a2.mo37724a();
            C141254e a3 = ((FullScreenMessageView) inflate.findViewById(R.id.podcasts_message_layer)).mo17754z();
            a3.f383492a = C141250a.m229282a(R.string.podcasts_generic_error_message, R.string.podcasts_show_unavailable, (Integer) null, (View.OnClickListener) null);
            a3.f383494c = C141250a.m229282a(R.string.podcasts_explicit_content_title, R.string.podcasts_explicit_content_message, Integer.valueOf(R.string.podcasts_explicit_content_learn_more), C141172t.f383260a);
            C46801dp dpVar = a.f383266c;
            C141150k kVar = a.f383267d;
            boolean z = a.f383265b.f383152b;
            C69664n.m101061g(str, "feedUrl");
            C69644aa aaVar = new C69644aa();
            aaVar.f186023a = z;
            dpVar.mo50709c(new C46726bj(kVar.f383230j, str, new C141147h(kVar, str, z, aaVar)), new C141173u(a));
            a.f383268e.f76997b.mo33800a(C28427h.m53115a(40822)).mo33809b(inflate);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C141170r.m229178a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C141175w a = mo17754z();
            a.f383277n = null;
            C31974aw awVar = a.f383278o;
            if (awVar != null) {
                awVar.mo37741b();
            }
            a.f383278o = null;
            c.close();
            return;
        } catch (Throwable th) {
            C141170r.m229178a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f383104e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C141170r.m229178a(th, th);
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
            C141170r.m229178a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C141175w a = mo17754z();
            a.mo116208a(a.f383277n);
            e.close();
            return;
        } catch (Throwable th) {
            C141170r.m229178a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C141175w a = mo17754z();
            C47393f.m84233d(this, C141154b.class, new C141176x(a));
            C47393f.m84233d(this, C141156d.class, new C141177y(a));
            C47393f.m84233d(this, C141155c.class, new C141178z(a));
            C47393f.m84233d(this, C141153a.class, new C141116aa(a));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141170r.m229178a(th, th);
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
            if (!this.f383104e) {
                super.onAttach(context);
                if (this.f383101a == null) {
                    Object jN = mo116172d().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C141122ag agVar = (C141122ag) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C141122ag.f383149c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(agVar);
                    C46801dp dpVar = (C46801dp) ((C74176nj) jN).f207084k.mo17428b();
                    C141150k kVar = new C141150k((C140385d) ((C74176nj) jN).f206730b.f198027a.f199878x.mo17428b(), (C139997j) ((C74176nj) jN).f206730b.f198027a.f199880z.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66837dJ(), (C140133ai) ((C74176nj) jN).f206730b.f198027a.f199153E.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66872ds(), (C46407v) ((C74176nj) jN).f206730b.f198027a.f199519gZ.mo17428b(), (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b(), ((C74176nj) jN).mo69703en(), ((C74176nj) jN).f206730b.f198027a.mo66841dN(), (C46728bl) ((C74176nj) jN).f206730b.f198027a.f199573ha.mo17428b());
                    C28310af afVar = (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b();
                    C47707g hd = ((C74176nj) jN).mo69846hd();
                    C47770dh dhVar = (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b();
                    C46778cv cvVar = (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof ShowFragment) {
                        ShowFragment showFragment = (ShowFragment) fragment;
                        C68225k.m98532d(showFragment);
                        C141175w wVar = r4;
                        C141175w wVar2 = new C141175w(agVar, dpVar, kVar, afVar, hd, dhVar, cvVar, showFragment, (C141108a) ((C74176nj) jN).f206767bk.mo17428b(), ((C74176nj) jN).mo69715ez(), (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C46485f) ((C74176nj) jN).f206995g.mo17428b());
                        this.f383101a = wVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f383103d));
                    } else {
                        String obj = C141175w.class.toString();
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
                C141170r.m229178a(th2, th3);
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
