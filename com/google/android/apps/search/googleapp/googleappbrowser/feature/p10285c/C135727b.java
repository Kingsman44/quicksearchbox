package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10285c;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10285c.C135732g;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10285c.p10286a.C135723b;
import com.google.android.apps.search.googleapp.p10335j.C136370a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.contrib.p3367d.p3368a.p3369a.C43463a;
import com.google.android.libraries.web.contrib.p3367d.p3368a.p3369a.C43464b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46719bc;
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
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47764db;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.c.b */
/* compiled from: PG */
public final class C135727b extends C135737k implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C135732g f369696a;

    /* renamed from: c */
    private Context f369697c;

    /* renamed from: d */
    private final C2393x f369698d = new C2393x(this);

    /* renamed from: e */
    private boolean f369699e;

    @Deprecated
    public C135727b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C135732g mo17754z() {
        C135732g gVar = this.f369696a;
        if (gVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f369699e) {
            return gVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112505b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f369697c == null) {
            this.f369697c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f369697c;
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
        return this.f369698d;
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
            C135721a.m220185a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C135732g a = mo17754z();
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.googleapp_browser_fragment_findinpage, viewGroup, false);
            C28306ab abVar = a.f369713h;
            abVar.mo33801b(viewGroup2, abVar.f76990a.mo33805a(C28427h.m53115a(90283)));
            C0154a aVar = new C0154a(a.f369714i.getChildFragmentManager());
            AccountId accountId = a.f369707b;
            C135723b bVar = new C135723b();
            C68324h.m98669f(bVar);
            C47247a.m84047b(bVar, accountId);
            aVar.mo511h(R.id.googleapp_browser_findinpage_close_button_container, bVar, (String) null, 1);
            aVar.mo509f();
            ((EditText) viewGroup2.findViewById(R.id.googleapp_browser_findinpage_searchbox)).addTextChangedListener(new C47764db(a.f369711f, new C135730e(a), "FindInPage TextWatcher"));
            C46801dp dpVar = a.f369710e;
            C43464b bVar2 = a.f369716k;
            dpVar.mo50707a(new C46719bc(bVar2.f113536a, new C43463a(bVar2), "WebX_FindInPageState"), new C135732g.C135733a());
            if (viewGroup2 != null) {
                C47831fm.m85019n();
                return viewGroup2;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C135721a.m220185a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C135732g a = mo17754z();
            ValueAnimator valueAnimator = a.f369715j;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            a.f369709d.mo46536a();
            a.mo112512a();
            c.close();
            return;
        } catch (Throwable th) {
            C135721a.m220185a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f369699e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C135721a.m220185a(th, th);
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
            C135721a.m220185a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C135732g a2 = mo17754z();
            a.f123128b.findViewById(R.id.googleapp_browser_findinpage_next_match).setTag(R.id.tiktok_event_internal_trace, "FindInPage Next onClick");
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_browser_findinpage_next_match), new C135734h(a2));
            a.f123128b.findViewById(R.id.googleapp_browser_findinpage_previous_match).setTag(R.id.tiktok_event_internal_trace, "FindInPage Previous onClick");
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_browser_findinpage_previous_match), new C135735i(a2));
            this.f54442o.mo24720k(bundle);
            C135732g a3 = mo17754z();
            a3.mo112514c(new C135729d(a3, view));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135721a.m220185a(th, th);
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

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, com.google.android.libraries.web.contrib.d.b.a] */
    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f369699e) {
                super.onAttach(context);
                if (this.f369696a == null) {
                    Object jN = mo112517d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C135727b) {
                        C135727b bVar = (C135727b) fragment;
                        C68225k.m98532d(bVar);
                        C136370a aVar = (C136370a) ((C74176nj) jN).f206724au.mo17428b();
                        this.f369696a = new C135732g(accountId, bVar, (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), ((C74176nj) jN).mo69722fF(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).mo69860hr(), ((C74176nj) jN).mo69605cv(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f369698d));
                    } else {
                        String obj = C135732g.class.toString();
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
                C135721a.m220185a(th, th2);
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
