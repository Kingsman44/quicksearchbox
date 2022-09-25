package com.google.android.apps.search.googleapp.googleappbrowser.feature.omnibox;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.googleappbrowser.C135508ba;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10275c.C135627b;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.p10307a.C136026e;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.p10307a.C136037o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.contrib.loadingbar.p3397a.C43675b;
import com.google.android.libraries.web.contrib.loadingbar.p3398ui.C43679c;
import com.google.android.libraries.web.contrib.p3390j.p3392b.C43643c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
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
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.omnibox.b */
/* compiled from: PG */
public final class C135901b extends C135906g implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C135903d f370129a;

    /* renamed from: c */
    private Context f370130c;

    /* renamed from: d */
    private final C2393x f370131d = new C2393x(this);

    /* renamed from: e */
    private boolean f370132e;

    @Deprecated
    public C135901b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C135903d mo17754z() {
        C135903d dVar = this.f370129a;
        if (dVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f370132e) {
            return dVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112616b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f370130c == null) {
            this.f370130c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f370130c;
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
        return this.f370131d;
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
            C135900a.m220509a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C135903d a = mo17754z();
            C69664n.m101061g(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.cloneInContext(new ContextThemeWrapper(a.f370136b.requireContext(), 2132150922)).inflate(R.layout.googleapp_browser_fragment_omnibox, viewGroup, false);
            C69664n.m101060f(inflate, "layoutInflater\n        .…* attachToRoot= */ false)");
            C28306ab abVar = a.f370140f;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(155766)));
            View findViewById = inflate.findViewById(R.id.googleapp_browser_omnibox_background);
            if (findViewById != null) {
                findViewById.setOnClickListener(new C47591co(a.f370142h, "Omnibox fragment clicked.", new C135902c(a, inflate)));
            }
            if (a.f370136b.getChildFragmentManager().f634a.mo670b(R.id.googleapp_browser_omnibox_urlbar) == null) {
                FragmentManager childFragmentManager = a.f370136b.getChildFragmentManager();
                C69664n.m101060f(childFragmentManager, "fragment.childFragmentManager");
                C0154a aVar = new C0154a(childFragmentManager);
                aVar.mo511h(R.id.googleapp_browser_omnibox_closeaction, C135627b.m219919a(((C135508ba) a.f370138d).f369140a), (String) null, 1);
                aVar.mo511h(R.id.googleapp_browser_omnibox_urlbar, a.f370137c.mo112367a(), (String) null, 1);
                aVar.mo511h(R.id.googleapp_browser_omnibox_actions, C136026e.m220865f(((C136037o) a.f370139e).f370496a), (String) null, 1);
                aVar.mo511h(R.id.googleapp_browser_omnibox_background, C43679c.m77075a(a.f370135a, R.drawable.googleapp_browser_omnibox_loadingbar, C43675b.f113958d), (String) null, 1);
                aVar.mo509f();
            }
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C135900a.m220509a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f370132e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C135900a.m220509a(th, th);
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
            C135900a.m220509a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C43643c.class, new C135904e(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135900a.m220509a(th, th);
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
            if (!this.f370132e) {
                super.onAttach(context);
                if (this.f370129a == null) {
                    Object jN = mo112619d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    C46485f fVar = (C46485f) ((C74176nj) jN).f206995g.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C135901b) {
                        C135901b bVar = (C135901b) fragment;
                        C68225k.m98532d(bVar);
                        this.f370129a = new C135903d(accountId, fVar, bVar, ((C74176nj) jN).mo69608cy(), ((C74176nj) jN).mo69607cx(), ((C74176nj) jN).mo69606cw(), ((C74176nj) jN).mo69736fT(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f370131d));
                    } else {
                        String obj = C135903d.class.toString();
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
                C135900a.m220509a(th, th2);
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
