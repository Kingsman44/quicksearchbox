package com.google.android.apps.search.googleapp.search.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.C43265p;
import com.google.android.libraries.web.base.C43266q;
import com.google.android.libraries.web.contrib.googlesignin.GoogleSignInFeature;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3659d.C47243l;
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
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.b */
/* compiled from: PG */
public final class C137587b extends C137597d implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137591c f374235a;

    /* renamed from: c */
    private Context f374236c;

    /* renamed from: d */
    private final C2393x f374237d = new C2393x(this);

    /* renamed from: e */
    private boolean f374238e;

    @Deprecated
    public C137587b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C137591c mo17754z() {
        C137591c cVar = this.f374235a;
        if (cVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f374238e) {
            return cVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo113841b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f374236c == null) {
            this.f374236c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f374236c;
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
        return this.f374237d;
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
            C137560a.m223473a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C137639g gVar;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C137591c a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_signed_out_search_customization_fragment, viewGroup, false);
            C43264o oVar = (C43264o) a.f374249a.getChildFragmentManager().f634a.mo671c("WEB_COORDINATOR_FRAGMENT_TAG");
            if (oVar == null) {
                gVar = null;
            } else {
                gVar = (C137639g) oVar.mo17754z().mo46379a();
            }
            if (gVar == null) {
                AccountId accountId = a.f374250b;
                C43259j jVar = new C43259j();
                jVar.f113058a = false;
                jVar.mo46372b(GoogleSignInFeature.m76919e().mo46642c());
                C43264o a2 = C43265p.m76349a(accountId, jVar.mo46371a());
                C0154a aVar = new C0154a(a.f374249a.getChildFragmentManager());
                aVar.mo511h(R.id.googleapp_signed_out_search_customization_web_coordinator, a2, "WEB_COORDINATOR_FRAGMENT_TAG", 1);
                aVar.mo509f();
                C43266q f = a2.mo17754z();
                AccountId accountId2 = a.f374250b;
                C137639g gVar2 = new C137639g();
                C68324h.m98669f(gVar2);
                C47247a.m84047b(gVar2, accountId2);
                C47243l.m84040b(gVar2, "https://history.google.com/history/optout?agsa=1&nogb=1");
                f.mo46380b(gVar2);
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C137560a.m223473a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f374238e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137560a.m223473a(th, th);
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
            C137560a.m223473a(th, th);
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
            if (!this.f374238e) {
                super.onAttach(context);
                if (this.f374235a == null) {
                    Object jN = mo113847d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C137587b) {
                        C137587b bVar = (C137587b) fragment;
                        C68225k.m98532d(bVar);
                        this.f374235a = new C137591c(bVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f374237d));
                    } else {
                        String obj = C137591c.class.toString();
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
                C137560a.m223473a(th, th2);
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
