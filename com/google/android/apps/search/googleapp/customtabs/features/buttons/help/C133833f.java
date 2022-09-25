package com.google.android.apps.search.googleapp.customtabs.features.buttons.help;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2476a.p2482d.C32214c;
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
import com.google.apps.tiktok.monitoring.feedback.HelpAndFeedbackStarter;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69092m;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.buttons.help.f */
/* compiled from: PG */
public final class C133833f extends C133838k implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C133834g f364527a;

    /* renamed from: c */
    private Context f364528c;

    /* renamed from: d */
    private final C2393x f364529d = new C2393x(this);

    /* renamed from: e */
    private boolean f364530e;

    @Deprecated
    public C133833f() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C133834g mo17754z() {
        C133834g gVar = this.f364527a;
        if (gVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f364530e) {
            return gVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo111416b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f364528c == null) {
            this.f364528c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f364528c;
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
        return this.f364529d;
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
            C133832e.m217077a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            FrameLayout frameLayout = new FrameLayout(mo17754z().f364531a.getContext());
            C47831fm.m85019n();
            return frameLayout;
        } catch (Throwable th) {
            C133832e.m217077a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f364530e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C133832e.m217077a(th, th);
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
            C133832e.m217077a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C32214c.class, new C133835h(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133832e.m217077a(th, th);
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
            if (!this.f364530e) {
                super.onAttach(context);
                if (this.f364527a == null) {
                    Object jN = mo111417d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C133833f) {
                        C133833f fVar = (C133833f) fragment;
                        C68225k.m98532d(fVar);
                        String e = ((C46897i) new C69092m(((C74176nj) jN).f206730b.f198027a.f199228b.f198009I).f185293a.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45368521").mo50906e();
                        C68225k.m98532d(e);
                        String e2 = ((C46897i) new C69092m(((C74176nj) jN).f206730b.f198027a.f199228b.f198009I).f185293a.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45368522").mo50906e();
                        C68225k.m98532d(e2);
                        this.f364527a = new C133834g(fVar, (HelpAndFeedbackStarter) ((C74176nj) jN).f207099z.mo17428b(), (C136247a) ((C74176nj) jN).f206662L.mo17428b(), (IncognitoLifecycleObserver) ((C74176nj) jN).f206664N.mo17428b(), e, e2);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f364529d));
                    } else {
                        String obj = C133834g.class.toString();
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
        } catch (ClassCastException e3) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e3);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C133832e.m217077a(th, th2);
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
