package com.google.android.apps.search.podcasts.explore;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0640fb;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.explore.C140266f;
import com.google.android.apps.search.podcasts.explore.p10564a.C140252e;
import com.google.android.apps.search.podcasts.explore.p10564a.C140261n;
import com.google.android.apps.search.podcasts.p10565f.C140295ap;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141250a;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141215f;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141218i;
import com.google.android.apps.search.podcasts.widgets.p10627i.C141265c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.C44918u;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
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
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class ExploreFragment extends C140276n implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C140266f f381013a;

    /* renamed from: c */
    private Context f381014c;

    /* renamed from: d */
    private final C2393x f381015d = new C2393x(this);

    /* renamed from: e */
    private boolean f381016e;

    @Deprecated
    public ExploreFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C140266f mo17754z() {
        C140266f fVar = this.f381013a;
        if (fVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f381016e) {
            return fVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo115527b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f381014c == null) {
            this.f381014c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f381014c;
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
        return this.f381015d;
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
            C140263c.m227960a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C140266f a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.podcasts_explore_fragment, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.podcasts_appbar_layout);
            C69664n.m101060f(findViewById, "rootView.findViewById<Ap…d.podcasts_appbar_layout)");
            C141215f.m229223a((AppBarLayout) findViewById, R.id.podcasts_view_pager);
            C141218i iVar = a.f381064i;
            ExploreFragment exploreFragment = a.f381057b;
            C69664n.m101060f(inflate, "rootView");
            iVar.mo116230a(exploreFragment, inflate);
            View findViewById2 = inflate.findViewById(R.id.podcasts_search_button);
            C69664n.m101060f(findViewById2, "rootView.findViewById(R.id.podcasts_search_button)");
            findViewById2.setOnClickListener(a.f381060e.mo50480a(R.id.podcasts_action_to_search, C46490k.m82869b(BuildConfig.FLAVOR).mo50504d(), "Clicked explore to search"));
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.podcasts_swipe_refresh);
            C69664n.m101060f(swipeRefreshLayout, BuildConfig.FLAVOR);
            C141265c.m229299a(swipeRefreshLayout);
            swipeRefreshLayout.f13508a = new C47701a(a.f381062g, "Swipe refresh explore tabs", new C140268g(a));
            ((FullScreenMessageView) inflate.findViewById(R.id.podcasts_explore_message_layer)).mo17754z().f383492a = C141250a.m229282a(R.string.podcasts_generic_error_message, R.string.podcasts_error_loading_feed_secondary, Integer.valueOf(R.string.podcasts_retry_load), new C140269h(a));
            C46801dp dpVar = a.f381058c;
            C140261n nVar = a.f381059d;
            dpVar.mo50709c(new C46726bj(nVar.f381047f, "DiscoverTabs", new C140252e(nVar)), new C140266f.C140267a(a, a.f381063h, a.f381057b));
            a.f381065j = (ViewPager2) inflate.findViewById(R.id.podcasts_view_pager);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C140263c.m227960a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C140266f a = mo17754z();
            C44918u uVar = a.f381066k;
            if (uVar != null) {
                uVar.mo48454b();
            }
            a.f381066k = null;
            ViewPager2 viewPager2 = a.f381065j;
            if (viewPager2 != null) {
                viewPager2.mo9210b((C0640fb) null);
            }
            a.f381065j = null;
            c.close();
            return;
        } catch (Throwable th) {
            C140263c.m227960a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f381016e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140263c.m227960a(th, th);
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
            C140263c.m227960a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C140295ap.class, new C140270i(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C140263c.m227960a(th, th);
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
            if (!this.f381016e) {
                super.onAttach(context);
                if (this.f381013a == null) {
                    Object jN = mo115543d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof ExploreFragment) {
                        ExploreFragment exploreFragment = (ExploreFragment) fragment;
                        C68225k.m98532d(exploreFragment);
                        this.f381013a = new C140266f(exploreFragment, (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C140261n) ((C74176nj) jN).f206730b.f198027a.f199512gS.mo17428b(), (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b(), (C46485f) ((C74176nj) jN).f206995g.mo17428b(), ((C74176nj) jN).mo69843ha(), ((C74176nj) jN).mo69846hd(), (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), ((C74176nj) jN).mo69664eA());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f381015d));
                    } else {
                        String obj = C140266f.class.toString();
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
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C140263c.m227960a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
