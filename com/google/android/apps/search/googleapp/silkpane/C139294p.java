package com.google.android.apps.search.googleapp.silkpane;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.base.p3348b.C43251d;
import com.google.android.libraries.web.contrib.errorpage.C43514b;
import com.google.android.libraries.web.contrib.errorpage.C43529q;
import com.google.android.libraries.web.contrib.errorpage.C43531s;
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
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.silkpane.p */
/* compiled from: PG */
public final class C139294p extends C139275ac implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139298t f378854a;

    /* renamed from: c */
    private Context f378855c;

    /* renamed from: d */
    private final C2393x f378856d = new C2393x(this);

    /* renamed from: e */
    private boolean f378857e;

    @Deprecated
    public C139294p() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C139298t mo17754z() {
        C139298t tVar = this.f378854a;
        if (tVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f378857e) {
            return tVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo114868b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f378855c == null) {
            this.f378855c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f378855c;
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
        return this.f378856d;
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
            C139293o.m226414a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C139298t a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_silk_pane_error_card, viewGroup, false);
            inflate.findViewById(R.id.googleapp_silk_pane_retry_button).setOnClickListener(new C47591co(a.f378862b, "clicked error retry button", new C139295q(a)));
            inflate.findViewById(R.id.googleapp_silk_pane_dismiss_button).setOnClickListener(new C47591co(a.f378862b, "dismiss the pane after error", new C139296r(a)));
            C43529q qVar = new C43529q(a.f378861a);
            qVar.f113656a.mo55488h(C43514b.CONNECTIVITY);
            qVar.f113658c = new C139297s((TextView) inflate.findViewById(R.id.googleapp_silk_pane_error_message));
            qVar.mo46586a();
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C139293o.m226414a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f378857e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139293o.m226414a(th, th);
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
            C139293o.m226414a(th, th);
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
            if (!this.f378857e) {
                super.onAttach(context);
                if (this.f378854a == null) {
                    Object jN = mo114869d().mo17653jN();
                    C43531s fD = ((C74176nj) jN).mo69720fD();
                    C47770dh dhVar = (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b();
                    C43251d fx = ((C74176nj) jN).mo69766fx();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C139294p) {
                        C139294p pVar = (C139294p) fragment;
                        C68225k.m98532d(pVar);
                        this.f378854a = new C139298t(fD, dhVar, fx, pVar);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f378856d));
                    } else {
                        String obj = C139298t.class.toString();
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
                C139293o.m226414a(th, th2);
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
