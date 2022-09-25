package com.google.android.apps.search.googleapp.googleappbrowser.pane.p10307a;

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
import com.google.android.apps.search.googleapp.googleappbrowser.C135498av;
import com.google.android.apps.search.googleapp.googleappbrowser.C135499aw;
import com.google.android.apps.search.googleapp.googleappbrowser.C135500ax;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10290f.C135782d;
import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136012b;
import com.google.android.apps.search.googleapp.p10335j.C136370a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
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
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69086g;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.a.l */
/* compiled from: PG */
public final class C136034l extends C136024c implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C136035m f370487a;

    /* renamed from: c */
    private Context f370488c;

    /* renamed from: d */
    private final C2393x f370489d = new C2393x(this);

    /* renamed from: e */
    private boolean f370490e;

    @Deprecated
    public C136034l() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112699b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f370488c == null) {
            this.f370488c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f370488c;
    }

    /* renamed from: f */
    public final C136035m mo17754z() {
        C136035m mVar = this.f370487a;
        if (mVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f370490e) {
            return mVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
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
        return this.f370489d;
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
            C136033k.m220887a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C136035m f = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_browser_fragment_topbar, viewGroup, false);
            C28306ab abVar = f.f370492b;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(89149)));
            if (f.f370491a.getChildFragmentManager().f634a.mo670b(R.id.googleapp_browser_topbar_content) == null) {
                C0154a aVar = new C0154a(f.f370491a.getChildFragmentManager());
                aVar.mo511h(R.id.googleapp_browser_topbar_progressbar, C135782d.m220318a(((C135500ax) f.f370493c).f369127a), (String) null, 1);
                aVar.mo511h(R.id.googleapp_browser_topbar_content, f.f370494d.mo112367a(), (String) null, 1);
                aVar.mo509f();
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C136033k.m220887a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f370490e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136033k.m220887a(th, th);
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
            C136033k.m220887a(th, th);
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
        C136012b bVar;
        this.f122869b.mo51381i();
        try {
            if (!this.f370490e) {
                super.onAttach(context);
                if (this.f370487a == null) {
                    Object jN = mo112698a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C136034l) {
                        C136034l lVar = (C136034l) fragment;
                        C68225k.m98532d(lVar);
                        C28306ab abVar = (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b();
                        C135500ax axVar = new C135500ax((AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b());
                        C136370a aVar = (C136370a) ((C74176nj) jN).f206724au.mo17428b();
                        AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                        if (C69086g.m100210d(((C74176nj) jN).f206730b.f198009I)) {
                            bVar = new C135498av(accountId);
                        } else {
                            bVar = new C135499aw(accountId);
                        }
                        this.f370487a = new C136035m(lVar, abVar, axVar, bVar);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f370489d));
                    } else {
                        String obj = C136035m.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = this.f122869b;
                    if (abVar2.f123354b == null) {
                        abVar2.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
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
                C136033k.m220887a(th, th2);
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
