package com.google.android.apps.search.podcasts.library.showsubscriptions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0646fh;
import android.support.p033v7.widget.C0707ho;
import android.support.p033v7.widget.GridLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.support.p033v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C1877c;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.library.showsubscriptions.p10584a.C140619c;
import com.google.android.apps.search.podcasts.library.showsubscriptions.p10584a.C140620d;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141251b;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141213d;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141215f;
import com.google.android.apps.search.podcasts.widgets.p10625g.C141261d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.appbar.AppBarLayout;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
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
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47579cc;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class ShowSubscriptionsFragment extends C140638s implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C140636q f381901a;

    /* renamed from: c */
    private Context f381902c;

    /* renamed from: d */
    private final C2393x f381903d = new C2393x(this);

    /* renamed from: e */
    private boolean f381904e;

    @Deprecated
    public ShowSubscriptionsFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C140636q mo17754z() {
        C140636q qVar = this.f381901a;
        if (qVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f381904e) {
            return qVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo115792b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f381902c == null) {
            this.f381902c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f381902c;
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
        return this.f381903d;
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
            C140631l.m228409a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C140636q a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.podcasts_library_show_subscriptions_fragment, viewGroup, false);
            C69664n.m101060f(inflate, "rootView");
            AppBarLayout appBarLayout = (AppBarLayout) inflate.findViewById(R.id.podcasts_appbar_layout);
            C69664n.m101060f(appBarLayout, BuildConfig.FLAVOR);
            C141215f.m229224b(appBarLayout);
            Toolbar toolbar = (Toolbar) appBarLayout.findViewById(R.id.podcasts_appbar_header_toolbar);
            toolbar.mo2393g().clear();
            C141213d dVar = a.f381951f;
            C69664n.m101060f(toolbar, "this");
            dVar.mo116228c(toolbar);
            Menu g = toolbar.mo2393g();
            C69664n.m101060f(g, "toolbar.menu");
            g.add(0, R.id.podcasts_add_custom_feed_menu_item, 0, R.string.podcasts_add_custom_feed);
            MenuItem findItem = g.findItem(R.id.podcasts_add_custom_feed_menu_item);
            findItem.setIcon(C1877c.m5125a(toolbar.getContext(), R.drawable.quantum_gm_ic_add_link_vd_theme_24));
            findItem.setOnMenuItemClickListener(new C47579cc(a.f381952g, "App bar action to subscribe to show by RSS feed", new C140632m(a)));
            findItem.setShowAsAction(1);
            toolbar.mo2422w(R.string.podcasts_subscriptions);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(inflate.getContext(), 3);
            int dimensionPixelSize = inflate.getContext().getResources().getDimensionPixelSize(R.dimen.podcasts_subscriptions_page_subscription_min_size);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.podcasts_subscribed_shows_recycler_view);
            recyclerView.setLayoutManager(gridLayoutManager);
            C69664n.m101060f(recyclerView, BuildConfig.FLAVOR);
            if (!C2043bi.m5570ax(recyclerView) || recyclerView.isLayoutRequested()) {
                recyclerView.addOnLayoutChangeListener(new C140634o(inflate, dimensionPixelSize, gridLayoutManager));
            } else {
                gridLayoutManager.setSpanCount(Math.max(3, inflate.getMeasuredWidth() / dimensionPixelSize));
            }
            recyclerView.setAdapter(a.f381950e);
            C0646fh fhVar = recyclerView.mItemAnimator;
            if (fhVar != null) {
                ((C0707ho) fhVar).f2538m = false;
            }
            Context context = recyclerView.getContext();
            C69664n.m101060f(context, "context");
            recyclerView.addItemDecoration$ar$ds(C141261d.m229291a(context));
            ((FullScreenMessageView) inflate.findViewById(R.id.podcasts_message_layer)).mo17754z().f383493b = new C141251b(R.drawable.quantum_gm_ic_add_vd_theme_24, 16843827, R.string.podcasts_subscriptions_empty_title, Integer.valueOf(R.string.podcasts_subscriptions_empty_text), (Integer) null, (View.OnClickListener) null);
            a.f381948c.mo50709c(new C140619c(a.f381949d), new C140633n(a));
            C28306ab abVar = a.f381953h;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(95984)));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C140631l.m228409a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f381904e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140631l.m228409a(th, th);
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
            C140631l.m228409a(th, th);
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
            if (!this.f381904e) {
                super.onAttach(context);
                if (this.f381901a == null) {
                    Object jN = mo115808d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof ShowSubscriptionsFragment) {
                        ShowSubscriptionsFragment showSubscriptionsFragment = (ShowSubscriptionsFragment) fragment;
                        C68225k.m98532d(showSubscriptionsFragment);
                        this.f381901a = new C140636q(showSubscriptionsFragment, (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), new C140620d((C140133ai) ((C74176nj) jN).f206730b.f198027a.f199153E.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66838dK(), ((C74176nj) jN).f206730b.f198027a.mo66841dN()), new C140630k((C46485f) ((C74176nj) jN).f206995g.mo17428b(), (C47449e) ((C74176nj) jN).f207092s.mo17428b()), ((C74176nj) jN).mo69715ez(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C46485f) ((C74176nj) jN).f206995g.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), ((C74176nj) jN).mo69710eu());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f381903d));
                    } else {
                        String obj = C140636q.class.toString();
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
                C140631l.m228409a(th, th2);
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
