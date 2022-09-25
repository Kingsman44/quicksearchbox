package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9388c.C124532d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124844bo;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124848bs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template.ScreenStateView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.local.C46855i;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.GacsDataLayerInitFragment */
/* compiled from: PG */
public final class GacsDataLayerInitFragment extends C124948au implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C124935ah f344688a;

    /* renamed from: c */
    private Context f344689c;

    /* renamed from: d */
    private final C2393x f344690d = new C2393x(this);

    /* renamed from: e */
    private boolean f344691e;

    @Deprecated
    public GacsDataLayerInitFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C124935ah mo17754z() {
        C124935ah ahVar = this.f344688a;
        if (ahVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f344691e) {
            return ahVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo106728b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f344689c == null) {
            this.f344689c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f344689c;
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
        return this.f344690d;
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
            C124932ae.m204824a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C124935ah a = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            C124844bo boVar = a.f344719c;
            if (boVar.f344423e && (boVar.f344419a & 4) != 0) {
                a.f344721e = a.f344718b.mo50828h(R.id.assistant_bisto_subscription_data_layer_init, a, a);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C124932ae.m204824a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            mo17754z();
            ScreenStateView screenStateView = (ScreenStateView) layoutInflater.inflate(R.layout.assistant_oobe_template_screen_root, viewGroup, false);
            screenStateView.mo106777c();
            C47831fm.m85019n();
            return screenStateView;
        } catch (Throwable th) {
            C124932ae.m204824a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f344691e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C124932ae.m204824a(th, th);
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
            C124932ae.m204824a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C124935ah a = mo17754z();
            C124844bo boVar = a.f344719c;
            if (!boVar.f344423e || (boVar.f344419a & 4) == 0) {
                a.mo106737c(a.f344720d);
            }
            e.close();
            return;
        } catch (Throwable th) {
            C124932ae.m204824a(th, th);
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
            if (!this.f344691e) {
                super.onAttach(context);
                if (this.f344688a == null) {
                    Object jN = mo106745d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    C124848bs p = ((C74176nj) jN).mo70006p();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof GacsDataLayerInitFragment) {
                        GacsDataLayerInitFragment gacsDataLayerInitFragment = (GacsDataLayerInitFragment) fragment;
                        C68225k.m98532d(gacsDataLayerInitFragment);
                        this.f344688a = new C124935ah(accountId, p, gacsDataLayerInitFragment, new C124977x((C60888db) ((C74176nj) jN).f206677a.p.mo17428b(), (C60888db) ((C74176nj) jN).f206677a.n.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66658Q(), new C124532d((Context) ((C74176nj) jN).f206730b.f198027a.f199175a.d.f201494aF.mo17428b()), ((C74176nj) jN).f206677a.d.mo67832e(), ((C46897i) ((C74176nj) jN).f206677a.d.f201488a.b.mo67408dM().f184816a.mo17428b()).mo50901a("com.google.android.apps.search.assistant.device 45375711").mo50907f(), ((C46897i) ((C74176nj) jN).f206677a.d.f201488a.b.mo67408dM().f184816a.mo17428b()).mo50901a("com.google.android.apps.search.assistant.device 45379985").mo50907f()), (C46855i) ((C74176nj) jN).f207083j.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C46485f) ((C74176nj) jN).f206995g.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f344690d));
                    } else {
                        String obj = C124935ah.class.toString();
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
                C124932ae.m204824a(th2, th3);
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
