package com.google.android.apps.search.podcasts.episode;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.episode.C140241t;
import com.google.android.apps.search.podcasts.episode.p10563a.C140218e;
import com.google.android.apps.search.podcasts.episode.p10563a.C140219f;
import com.google.android.apps.search.podcasts.p10550b.p10551a.C139997j;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10569h.C140387f;
import com.google.android.apps.search.podcasts.p10588n.C140676e;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141250a;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141254e;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141213d;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141215f;
import com.google.android.apps.search.podcasts.widgets.p10627i.C141265c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.material.appbar.AppBarLayout;
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
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47701a;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class EpisodeFragment extends C140246x implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C140241t f380936a;

    /* renamed from: c */
    private Context f380937c;

    /* renamed from: d */
    private final C2393x f380938d = new C2393x(this);

    /* renamed from: e */
    private boolean f380939e;

    @Deprecated
    public EpisodeFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C140241t mo17754z() {
        C140241t tVar = this.f380936a;
        if (tVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f380939e) {
            return tVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo115503b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f380937c == null) {
            this.f380937c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f380937c;
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
        return this.f380938d;
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
            C140240s.m227919a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C140241t a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.podcasts_episode_fragment, viewGroup, false);
            C141254e a2 = ((FullScreenMessageView) inflate.findViewById(R.id.podcasts_message_layer)).mo17754z();
            a2.f383492a = C141250a.m229282a(R.string.podcasts_generic_error_message, R.string.podcasts_error_loading_feed_secondary, (Integer) null, (View.OnClickListener) null);
            a2.f383494c = C141250a.m229282a(R.string.podcasts_explicit_content_title, R.string.podcasts_explicit_content_message, Integer.valueOf(R.string.podcasts_explicit_content_learn_more), C140243u.f381001a);
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.podcasts_episode_swipe_refresh);
            C69664n.m101060f(swipeRefreshLayout, BuildConfig.FLAVOR);
            C141265c.m229299a(swipeRefreshLayout);
            swipeRefreshLayout.f13508a = new C47701a(a.f380998k, "Swipe refresh home feed", new C140244v(a));
            AppBarLayout appBarLayout = (AppBarLayout) inflate.findViewById(R.id.podcasts_appbar_layout);
            appBarLayout.f115671f = R.id.podcasts_episode_page_scroll_view;
            appBarLayout.mo47403m();
            C69664n.m101060f(appBarLayout, BuildConfig.FLAVOR);
            C141215f.m229224b(appBarLayout);
            C46801dp dpVar = a.f380992e;
            C140219f fVar = a.f380993f;
            C140237p pVar = a.f380989b;
            dpVar.mo50709c(new C46726bj(fVar.f380955h, pVar, new C140218e(pVar, fVar)), new C140241t.C140242a());
            C69664n.m101060f(inflate, "rootView");
            Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.podcasts_appbar_header_toolbar);
            C141213d dVar = a.f380994g;
            C69664n.m101060f(toolbar, "this");
            dVar.mo116228c(toolbar);
            C28306ab abVar = a.f380996i;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(53984)));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C140240s.m227919a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f380939e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140240s.m227919a(th, th);
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
            C140240s.m227919a(th, th);
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
            if (!this.f380939e) {
                super.onAttach(context);
                if (this.f380936a == null) {
                    Object jN = mo115524d().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C140237p pVar = (C140237p) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C140237p.f380980c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(pVar);
                    C46485f fVar = (C46485f) ((C74176nj) jN).f206995g.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof EpisodeFragment) {
                        EpisodeFragment episodeFragment = (EpisodeFragment) fragment;
                        C68225k.m98532d(episodeFragment);
                        C140241t tVar = r4;
                        C140241t tVar2 = new C140241t(pVar, fVar, episodeFragment, (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), new C140219f((C140385d) ((C74176nj) jN).f206730b.f198027a.f199878x.mo17428b(), (C140387f) ((C74176nj) jN).f206730b.f198027a.f199154F.mo17428b(), (C139997j) ((C74176nj) jN).f206730b.f198027a.f199880z.mo17428b(), (C140676e) ((C74176nj) jN).f206730b.f198027a.f199158J.mo17428b(), (C140133ai) ((C74176nj) jN).f206730b.f198027a.f199153E.mo17428b(), (C46407v) ((C74176nj) jN).f206730b.f198027a.f199509gP.mo17428b(), ((C74176nj) jN).mo69789gT(), (C46728bl) ((C74176nj) jN).f206730b.f198027a.f199510gQ.mo17428b(), ((C74176nj) jN).f206677a.h(), ((C74176nj) jN).mo69703en()), ((C74176nj) jN).mo69715ez(), (C21370a) ((C74176nj) jN).f206677a.i.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C47449e) ((C74176nj) jN).f207092s.mo17428b(), ((C74176nj) jN).mo69846hd(), (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b());
                        this.f380936a = tVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f380938d));
                    } else {
                        String obj = C140241t.class.toString();
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
                C140240s.m227919a(th2, th3);
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
