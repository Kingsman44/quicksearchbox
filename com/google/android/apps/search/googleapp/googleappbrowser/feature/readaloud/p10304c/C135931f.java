package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10304c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.AppCompatImageButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.contrib.p3358b.C43402c;
import com.google.apps.tiktok.account.AccountId;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.c.f */
/* compiled from: PG */
public final class C135931f extends C135936j implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C135933h f370213a;

    /* renamed from: c */
    private Context f370214c;

    /* renamed from: d */
    private final C2393x f370215d = new C2393x(this);

    /* renamed from: e */
    private boolean f370216e;

    @Deprecated
    public C135931f() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public static C135931f m220558a(AccountId accountId) {
        C135931f fVar = new C135931f();
        C68324h.m98669f(fVar);
        C47247a.m84047b(fVar, accountId);
        return fVar;
    }

    /* renamed from: b */
    public final C135933h mo17754z() {
        C135933h hVar = this.f370213a;
        if (hVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f370216e) {
            return hVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47247a mo112630d() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f370214c == null) {
            this.f370214c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f370214c;
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
        return this.f370215d;
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
            C135930e.m220557a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C135933h b = mo17754z();
            AppCompatImageButton a = b.f370218a.mo46501a(new C135932g(b), viewGroup);
            b.f370219b.mo50709c(b.f370220c.mo112623b(), b.f370221d);
            a.getClass();
            C47831fm.m85019n();
            return a;
        } catch (Throwable th) {
            C135930e.m220557a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f370216e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C135930e.m220557a(th, th);
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
            C135930e.m220557a(th, th);
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
            if (!this.f370216e) {
                super.onAttach(context);
                if (this.f370213a == null) {
                    Object jN = mo112634f().mo17653jN();
                    this.f370213a = new C135933h((C43402c) ((C74176nj) jN).f206725av.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).mo69602cs(), (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a, ((C74176nj) jN).mo69736fT(), ((C74176nj) jN).mo69822h(), ((C74176nj) jN).f206730b.f198027a.mo67122kj(), ((C74176nj) jN).f206730b.f198027a.mo67125km());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f370215d));
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
                C135930e.m220557a(th, th2);
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
