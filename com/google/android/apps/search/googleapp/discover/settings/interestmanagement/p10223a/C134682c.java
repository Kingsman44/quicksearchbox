package com.google.android.apps.search.googleapp.discover.settings.interestmanagement.p10223a;

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
import com.google.android.apps.search.googleapp.discover.settings.interestmanagement.p10223a.p10224a.C134678b;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.p3353c.p3355b.C43348q;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.p3420k.C43864j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46788de;
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
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
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
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.interestmanagement.a.c */
/* compiled from: PG */
public final class C134682c extends C134685e implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C134683d f366756a;

    /* renamed from: c */
    private Context f366757c;

    /* renamed from: d */
    private final C2393x f366758d = new C2393x(this);

    /* renamed from: e */
    private boolean f366759e;

    @Deprecated
    public C134682c() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C134683d mo17754z() {
        C134683d dVar = this.f366756a;
        if (dVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f366759e) {
            return dVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo111883b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f366757c == null) {
            this.f366757c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f366757c;
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
        return this.f366758d;
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
            C134681b.m218484a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C134683d a = mo17754z();
            C69664n.m101061g(layoutInflater, "layoutInflater");
            C69664n.m101061g(viewGroup, "parent");
            View inflate = layoutInflater.inflate(R.layout.googleapp_interestmanagement_web_fragment, viewGroup, false);
            C28306ab abVar = a.f366765f;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(147749)));
            if (a.f366762c.getChildFragmentManager().f634a.mo671c("SETTINGS_WEB_FRAGMENT_CONTAINER") == null) {
                C43861g a2 = C43864j.m77435a(a.f366763d, a.f366761b);
                C0154a aVar = new C0154a(a.f366762c.getChildFragmentManager());
                aVar.mo511h(R.id.googleapp_interestmanagement_web_fragment_container, a2, "SETTINGS_WEB_FRAGMENT_CONTAINER", 1);
                aVar.mo509f();
            }
            a.f366764e.mo50708b(a.f366766g.mo46469b(), C46788de.DONT_CARE, a.f366768i);
            C69664n.m101060f(inflate, "root");
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C134681b.m218484a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f366759e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C134681b.m218484a(th, th);
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
            C134681b.m218484a(th, th);
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
            if (!this.f366759e) {
                super.onAttach(context);
                if (this.f366756a == null) {
                    Object jN = mo111884d().mo17653jN();
                    String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                    C68225k.m98532d(b);
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C134682c) {
                        C134682c cVar = (C134682c) fragment;
                        C68225k.m98532d(cVar);
                        C43348q fT = ((C74176nj) jN).mo69736fT();
                        C134678b bVar = new C134678b();
                        C68324h.m98669f(bVar);
                        this.f366756a = new C134683d(b, cVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), fT, bVar, (IncognitoLifecycleObserver) ((C74176nj) jN).f206664N.mo17428b(), ((C74176nj) jN).mo69731fO());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f366758d));
                    } else {
                        String obj = C134683d.class.toString();
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
                C134681b.m218484a(th, th2);
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
