package com.google.android.apps.search.podcasts.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0660fv;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.home.C140398b;
import com.google.android.apps.search.podcasts.home.p10570a.C140395f;
import com.google.android.apps.search.podcasts.home.p10570a.C140396g;
import com.google.android.apps.search.podcasts.p10566g.p10567a.C140333a;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10591p.C140749o;
import com.google.android.apps.search.podcasts.p10600q.C140951j;
import com.google.android.apps.search.podcasts.p10601r.p10602a.C140957c;
import com.google.android.apps.search.podcasts.p10601r.p10606d.C140971c;
import com.google.android.apps.search.podcasts.p10601r.p10606d.C140975g;
import com.google.android.apps.search.podcasts.widgets.feedback.FeedbackHelper;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141250a;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141251b;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141254e;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141215f;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141218i;
import com.google.android.apps.search.podcasts.widgets.p10623e.C141230b;
import com.google.android.apps.search.podcasts.widgets.p10625g.C141259b;
import com.google.android.apps.search.podcasts.widgets.p10625g.C141261d;
import com.google.android.apps.search.podcasts.widgets.p10627i.C141265c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.play.unison.binding.C31972au;
import com.google.android.libraries.play.unison.binding.C31974aw;
import com.google.android.libraries.play.unison.binding.RootBindableController$Builder;
import com.google.android.material.appbar.AppBarLayout;
import com.google.apps.tiktok.dataservice.C46726bj;
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
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47701a;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class HomeFragment extends C140404g implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C140398b f381344a;

    /* renamed from: c */
    private Context f381345c;

    /* renamed from: d */
    private final C2393x f381346d = new C2393x(this);

    /* renamed from: e */
    private boolean f381347e;

    @Deprecated
    public HomeFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C140398b mo17754z() {
        C140398b bVar = this.f381344a;
        if (bVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f381347e) {
            return bVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo115643b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f381345c == null) {
            this.f381345c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f381345c;
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
        return this.f381346d;
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
            C140389a.m228085a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C140398b a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.podcasts_home_fragment, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.podcasts_home_feed_recycler_view);
            C69664n.m101060f(findViewById, "rootView.findViewById(R.…_home_feed_recycler_view)");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            View findViewById2 = inflate.findViewById(R.id.podcasts_appbar_layout);
            C69664n.m101060f(findViewById2, "rootView\n      .findView…d.podcasts_appbar_layout)");
            C141215f.m229223a((AppBarLayout) findViewById2, R.id.podcasts_home_feed_recycler_view);
            C141218i iVar = a.f381373i;
            HomeFragment homeFragment = a.f381370f;
            C69664n.m101060f(inflate, "rootView");
            iVar.mo116230a(homeFragment, inflate);
            RootBindableController$Builder a2 = C31972au.m59570a(a.f381370f, C140951j.m228908b(recyclerView, a.f381368d.f381203a.mo116036a(), a.f381369e));
            a2.f85926a = true;
            a.f381378n = a2.mo37724a();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.podcasts_home_refresh_layout);
            C69664n.m101060f(swipeRefreshLayout, BuildConfig.FLAVOR);
            C141265c.m229299a(swipeRefreshLayout);
            swipeRefreshLayout.f13508a = new C47701a(a.f381372h, "Swipe refresh home feed", new C140400c(a));
            C141254e a3 = ((FullScreenMessageView) inflate.findViewById(R.id.podcasts_message_layer)).mo17754z();
            a3.f383492a = C141250a.m229282a(R.string.podcasts_generic_error_message, R.string.podcasts_error_loading_feed_secondary, Integer.valueOf(R.string.podcasts_retry_load), new C140401d(a));
            a3.f383493b = new C141251b(R.drawable.podcasts_home_feed_empty, (Integer) null, R.string.podcasts_home_feed_empty_primary, Integer.valueOf(R.string.podcasts_home_feed_empty_secondary), Integer.valueOf(R.string.podcasts_explore_button), C140402e.f381383a);
            C46801dp dpVar = a.f381366b;
            C140396g gVar = a.f381367c;
            dpVar.mo50709c(new C46726bj(gVar.f381362g, "Home", new C140395f(gVar)), new C140398b.C140399a());
            C141230b.m229247a(recyclerView, C69540x.m100944b(Integer.valueOf(R.layout.podcasts_feed_episode_item)));
            Context context = recyclerView.getContext();
            C69664n.m101060f(context, "recyclerView.context");
            recyclerView.addItemDecoration$ar$ds(C141259b.m229290a(context));
            Context context2 = inflate.getContext();
            C69664n.m101060f(context2, "rootView.context");
            recyclerView.addItemDecoration$ar$ds(C141261d.m229291a(context2));
            a.f381371g.f76997b.mo33800a(C28427h.m53115a(93993)).mo33809b(inflate);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C140389a.m228085a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C140398b a = mo17754z();
            a.f381377m = null;
            C31974aw awVar = a.f381378n;
            if (awVar != null) {
                awVar.mo37741b();
            }
            a.f381378n = null;
            c.close();
            return;
        } catch (Throwable th) {
            C140389a.m228085a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f381347e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140389a.m228085a(th, th);
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
            C140389a.m228085a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C140398b a = mo17754z();
            a.mo115648b(a.f381377m);
            e.close();
            return;
        } catch (Throwable th) {
            C140389a.m228085a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C140975g.class, new C140403f(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140389a.m228085a(th, th);
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
            if (!this.f381347e) {
                super.onAttach(context);
                if (this.f381344a == null) {
                    Object jN = mo115653d().mo17653jN();
                    C46801dp dpVar = (C46801dp) ((C74176nj) jN).f207084k.mo17428b();
                    C140396g gVar = (C140396g) ((C74176nj) jN).f206730b.f198027a.f199514gU.mo17428b();
                    C46778cv cvVar = (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b();
                    C140333a ep = ((C74176nj) jN).mo69705ep();
                    C0660fv fvVar = (C0660fv) ((C74176nj) jN).f206759bc.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof HomeFragment) {
                        HomeFragment homeFragment = (HomeFragment) fragment;
                        C68225k.m98532d(homeFragment);
                        C140398b bVar = r3;
                        C140398b bVar2 = new C140398b(dpVar, gVar, cvVar, ep, fvVar, homeFragment, (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), ((C74176nj) jN).mo69846hd(), ((C74176nj) jN).mo69664eA(), new C140971c((Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), (FeedbackHelper) ((C74176nj) jN).f206703aZ.mo17428b(), (C140459au) ((C74176nj) jN).f206730b.f198027a.f199879y.mo17428b(), (C21370a) ((C74176nj) jN).f206677a.i.mo17428b(), (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b()), (C140749o) ((C74176nj) jN).f206677a.d.f201897x.mo17428b(), (C140957c) ((C74176nj) jN).f206730b.f198027a.f199513gT.mo17428b());
                        this.f381344a = bVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f381346d));
                    } else {
                        String obj = C140398b.class.toString();
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
                C140389a.m228085a(th2, th3);
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
