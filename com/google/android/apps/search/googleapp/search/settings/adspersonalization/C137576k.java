package com.google.android.apps.search.googleapp.search.settings.adspersonalization;

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
import com.google.android.apps.search.googleapp.config.C133665d;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2476a.p2482d.C32214c;
import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.C43265p;
import com.google.android.libraries.web.base.C43266q;
import com.google.android.libraries.web.base.C43271v;
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
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
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

/* renamed from: com.google.android.apps.search.googleapp.search.settings.adspersonalization.k */
/* compiled from: PG */
public final class C137576k extends C137586u implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C137577l f374203a;

    /* renamed from: c */
    private Context f374204c;

    /* renamed from: d */
    private final C2393x f374205d = new C2393x(this);

    /* renamed from: e */
    private boolean f374206e;

    @Deprecated
    public C137576k() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    static C137576k m223500a(AccountId accountId) {
        C137576k kVar = new C137576k();
        C68324h.m98669f(kVar);
        C47247a.m84047b(kVar, accountId);
        return kVar;
    }

    /* renamed from: b */
    public final C137577l mo17754z() {
        C137577l lVar = this.f374203a;
        if (lVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f374206e) {
            return lVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47247a mo113833d() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f374204c == null) {
            this.f374204c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f374204c;
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
        return this.f374205d;
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
            C137575j.m223499a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C137577l b = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_ads_personalization_setting_host_fragment, viewGroup, false);
            C28306ab abVar = b.f374211e;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(150731)));
            if (((C43264o) b.f374208b.getChildFragmentManager().f634a.mo671c("web_coordinator_fragment")) == null) {
                AccountId accountId = b.f374207a;
                C43259j jVar = new C43259j();
                jVar.mo46375e(b.f374210d.mo111322c());
                jVar.f113060c = C43271v.WEB_VIEW;
                jVar.f113063f = true;
                jVar.mo46372b(GoogleSignInFeature.m76919e().mo46642c());
                C43264o a = C43265p.m76349a(accountId, jVar.mo46371a());
                C0154a aVar = new C0154a(b.f374208b.getChildFragmentManager());
                aVar.mo511h(R.id.googleapp_ads_personalization_setting_host_fragment, a, "web_coordinator_fragment", 1);
                aVar.mo509f();
                C43266q f = a.mo17754z();
                AccountId accountId2 = b.f374207a;
                C137571f fVar = new C137571f();
                C68324h.m98669f(fVar);
                C47247a.m84047b(fVar, accountId2);
                f.mo46380b(fVar);
            }
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C137575j.m223499a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f374206e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C137575j.m223499a(th, th);
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
            C137575j.m223499a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C32214c.class, new C137578m(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C137575j.m223499a(th, th);
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
            if (!this.f374206e) {
                super.onAttach(context);
                if (this.f374203a == null) {
                    Object jN = mo113838f().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C137576k) {
                        C137576k kVar = (C137576k) fragment;
                        C68225k.m98532d(kVar);
                        this.f374203a = new C137577l(accountId, kVar, (C136247a) ((C74176nj) jN).f206662L.mo17428b(), (IncognitoLifecycleObserver) ((C74176nj) jN).f206664N.mo17428b(), (C133665d) ((C74176nj) jN).f206730b.f198021U.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f374205d));
                    } else {
                        String obj = C137577l.class.toString();
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
                C137575j.m223499a(th, th2);
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
