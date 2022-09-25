package com.google.android.apps.search.podcasts.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.RecyclerView;
import android.support.p033v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai;
import com.google.android.apps.search.podcasts.p10573k.p10575b.C140436c;
import com.google.android.apps.search.podcasts.settings.p10612a.C141050c;
import com.google.android.apps.search.podcasts.settings.p10612a.C141055h;
import com.google.android.apps.search.podcasts.settings.p10612a.C141057j;
import com.google.android.apps.search.podcasts.settings.p10613b.C141078b;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141213d;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141214e;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141215f;
import com.google.android.apps.search.podcasts.widgets.p10627i.C141264b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.appbar.AppBarLayout;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
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
public final class NewEpisodeNotificationsSettingsFragment extends C141074aq implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C141093p f382919a;

    /* renamed from: c */
    private Context f382920c;

    /* renamed from: d */
    private final C2393x f382921d = new C2393x(this);

    /* renamed from: e */
    private boolean f382922e;

    @Deprecated
    public NewEpisodeNotificationsSettingsFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C141093p mo17754z() {
        C141093p pVar = this.f382919a;
        if (pVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f382922e) {
            return pVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo116100b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f382920c == null) {
            this.f382920c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f382920c;
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
        return this.f382921d;
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
            C141087j.m229081a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C141093p a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.podcasts_new_episode_notifications_settings_fragment, viewGroup, false);
            C28306ab abVar = a.f383057j;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(47649)));
            a.f383052e.mo50707a(new C141055h(a.f383051d), a.f383060m);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C141087j.m229081a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f382922e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C141087j.m229081a(th, th);
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
            C141087j.m229081a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C141078b.class, new C141095q(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C141093p a = mo17754z();
            C69664n.m101061g(view, "view");
            View requireView = a.f383050c.requireView();
            Context requireContext = a.f383050c.requireContext();
            C69664n.m101060f(requireContext, "fragment.requireContext()");
            requireView.setBackgroundColor(C141264b.m229297a(requireContext, 16842801));
            View requireView2 = a.f383050c.requireView();
            C69664n.m101060f(requireView2, "fragment.requireView()");
            AppBarLayout appBarLayout = (AppBarLayout) requireView2.findViewById(R.id.podcasts_appbar_layout);
            C69664n.m101060f(appBarLayout, BuildConfig.FLAVOR);
            C141215f.m229224b(appBarLayout);
            Toolbar toolbar = (Toolbar) appBarLayout.findViewById(R.id.podcasts_appbar_header_toolbar);
            toolbar.mo2393g().clear();
            C141213d dVar = a.f383056i;
            C69664n.m101060f(toolbar, "this");
            dVar.mo116227b(toolbar);
            a.f383056i.mo116226a(toolbar);
            toolbar.mo2423x(a.f383050c.getString(R.string.podcasts_notifications));
            Menu g = toolbar.mo2393g();
            C69664n.m101060f(g, "this.menu");
            C141214e.m229222a(g);
            ((RecyclerView) a.f383050c.requireView().findViewById(R.id.podcasts_shows_settings_list)).setAdapter(a.f383061n);
            C141050c cVar = a.f383059l;
            if (cVar != null) {
                a.mo116149a(cVar);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141087j.m229081a(th, th);
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
            if (!this.f382922e) {
                super.onAttach(context);
                if (this.f382919a == null) {
                    Object jN = mo116132d().mo17653jN();
                    Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof NewEpisodeNotificationsSettingsFragment) {
                        NewEpisodeNotificationsSettingsFragment newEpisodeNotificationsSettingsFragment = (NewEpisodeNotificationsSettingsFragment) fragment;
                        C68225k.m98532d(newEpisodeNotificationsSettingsFragment);
                        C141093p pVar = r3;
                        C141093p pVar2 = new C141093p(context2, newEpisodeNotificationsSettingsFragment, (C141057j) ((C74176nj) jN).f206730b.f198027a.f199518gY.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C140133ai) ((C74176nj) jN).f206730b.f198027a.f199153E.mo17428b(), (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), ((C74176nj) jN).mo69715ez(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C47400m) ((C74176nj) jN).f206730b.f198027a.f199472ff.mo17428b(), (C47449e) ((C74176nj) jN).f207092s.mo17428b(), (C140436c) ((C74176nj) jN).f206730b.f198027a.f199508gO.mo17428b());
                        this.f382919a = pVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f382921d));
                    } else {
                        String obj = C141093p.class.toString();
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
                C141087j.m229081a(th2, th3);
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
