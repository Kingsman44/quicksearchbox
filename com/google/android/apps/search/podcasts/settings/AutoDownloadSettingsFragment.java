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
import com.google.android.apps.search.podcasts.p10601r.C140997s;
import com.google.android.apps.search.podcasts.settings.p10612a.C141050c;
import com.google.android.apps.search.podcasts.settings.p10612a.C141055h;
import com.google.android.apps.search.podcasts.settings.p10612a.C141057j;
import com.google.android.apps.search.podcasts.settings.p10613b.C141077a;
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
public final class AutoDownloadSettingsFragment extends C141073ap implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C141084h f382915a;

    /* renamed from: c */
    private Context f382916c;

    /* renamed from: d */
    private final C2393x f382917d = new C2393x(this);

    /* renamed from: e */
    private boolean f382918e;

    @Deprecated
    public AutoDownloadSettingsFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C141084h mo17754z() {
        C141084h hVar = this.f382915a;
        if (hVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f382918e) {
            return hVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo116098b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f382916c == null) {
            this.f382916c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f382916c;
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
        return this.f382917d;
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
            C141047a.m229045a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C141084h a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.podcasts_auto_download_settings_fragment, viewGroup, false);
            C28306ab abVar = a.f383034j;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(59304)));
            a.f383034j.mo33801b(inflate.findViewById(R.id.podcasts_enable_auto_download_only_on_unmetered_networks), a.f383034j.f76990a.mo33805a(C28427h.m53115a(59307)));
            a.f383034j.mo33801b(inflate.findViewById(R.id.podcasts_enable_auto_download), a.f383034j.f76990a.mo33805a(C28427h.m53115a(59308)));
            a.f383029e.mo50707a(new C141055h(a.f383028d), a.f383036l);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C141047a.m229045a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f382918e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C141047a.m229045a(th, th);
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
            C141047a.m229045a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C141077a.class, new C141086i(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C141084h a = mo17754z();
            C69664n.m101061g(view, "view");
            View requireView = a.f383027c.requireView();
            Context requireContext = a.f383027c.requireContext();
            C69664n.m101060f(requireContext, "fragment.requireContext()");
            requireView.setBackgroundColor(C141264b.m229297a(requireContext, 16842801));
            View requireView2 = a.f383027c.requireView();
            C69664n.m101060f(requireView2, "fragment.requireView()");
            AppBarLayout appBarLayout = (AppBarLayout) requireView2.findViewById(R.id.podcasts_appbar_layout);
            C69664n.m101060f(appBarLayout, BuildConfig.FLAVOR);
            C141215f.m229224b(appBarLayout);
            Toolbar toolbar = (Toolbar) appBarLayout.findViewById(R.id.podcasts_appbar_header_toolbar);
            toolbar.mo2393g().clear();
            C141213d dVar = a.f383033i;
            C69664n.m101060f(toolbar, "this");
            dVar.mo116227b(toolbar);
            a.f383033i.mo116226a(toolbar);
            toolbar.mo2423x(a.f383027c.getString(R.string.podcasts_auto_downloading));
            Menu g = toolbar.mo2393g();
            C69664n.m101060f(g, "this.menu");
            C141214e.m229222a(g);
            ((RecyclerView) a.f383027c.requireView().findViewById(R.id.podcasts_shows_settings_list)).setAdapter(a.f383037m);
            C141050c cVar = a.f383035k;
            if (cVar != null) {
                a.mo116146a(cVar);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141047a.m229045a(th, th);
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
            if (!this.f382918e) {
                super.onAttach(context);
                if (this.f382915a == null) {
                    Object jN = mo116130d().mo17653jN();
                    Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof AutoDownloadSettingsFragment) {
                        AutoDownloadSettingsFragment autoDownloadSettingsFragment = (AutoDownloadSettingsFragment) fragment;
                        C68225k.m98532d(autoDownloadSettingsFragment);
                        C141084h hVar = r3;
                        C141084h hVar2 = new C141084h(context2, autoDownloadSettingsFragment, (C141057j) ((C74176nj) jN).f206730b.f198027a.f199518gY.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C140133ai) ((C74176nj) jN).f206730b.f198027a.f199153E.mo17428b(), (C46778cv) ((C74176nj) jN).f206677a.ao.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), ((C74176nj) jN).mo69715ez(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C47400m) ((C74176nj) jN).f206730b.f198027a.f199472ff.mo17428b(), (C47449e) ((C74176nj) jN).f207092s.mo17428b(), (C140997s) ((C74176nj) jN).f206757ba.mo17428b());
                        this.f382915a = hVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f382917d));
                    } else {
                        String obj = C141084h.class.toString();
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
                C141047a.m229045a(th2, th3);
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
