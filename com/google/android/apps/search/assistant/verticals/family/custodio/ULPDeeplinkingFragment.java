package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0816c;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.kids.platform.kidonboarding.C24048e;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.p4109av.p4114c.p4115a.p4116a.C54616i;
import com.google.p4109av.p4114c.p4115a.p4116a.C54618k;
import com.google.p4109av.p4114c.p4115a.p4116a.C54621n;
import com.google.p4109av.p4114c.p4115a.p4116a.C54622o;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* compiled from: PG */
public final class ULPDeeplinkingFragment extends C132331fy implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C132336gc f360612a;

    /* renamed from: c */
    private Context f360613c;

    /* renamed from: d */
    private final C2393x f360614d = new C2393x(this);

    /* renamed from: e */
    private boolean f360615e;

    @Deprecated
    public ULPDeeplinkingFragment() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo110472b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f360613c == null) {
            this.f360613c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f360613c;
    }

    /* renamed from: f */
    public final C132336gc mo17754z() {
        C132336gc gcVar = this.f360612a;
        if (gcVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f360615e) {
            return gcVar;
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
        return this.f360614d;
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
            C132334ga.m215095a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C132336gc f = mo17754z();
            f.f361246i = f.f361239b.registerForActivityResult(new C24048e(f.f361241d), new C132335gb(f));
            View inflate = layoutInflater.inflate(R.layout.assistant_fragment_ulp_deeplinking, viewGroup, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C132334ga.m215095a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f360615e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C132334ga.m215095a(th, th);
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
            C132334ga.m215095a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            mo17754z().f361244g.mo19974a(C37176a.f96937cB);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C132334ga.m215095a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            mo17754z().f361244g.mo19974a(C37176a.f96936cA);
            e.close();
            return;
        } catch (Throwable th) {
            C132334ga.m215095a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C132336gc f = mo17754z();
            C0816c cVar = f.f361246i;
            if (cVar != null) {
                boolean z = (f.f361245h.getResources().getConfiguration().uiMode & 48) == 32;
                C54616i iVar = (C54616i) C54618k.f143390g.createBuilder();
                iVar.copyOnWrite();
                C54618k kVar = (C54618k) iVar.instance;
                kVar.f143392a |= 1;
                kVar.f143395d = "agsa-assistant-custodio";
                String str = f.f361240c;
                iVar.copyOnWrite();
                C54618k kVar2 = (C54618k) iVar.instance;
                str.getClass();
                kVar2.f143392a |= 2;
                kVar2.f143396e = str;
                iVar.copyOnWrite();
                C54618k kVar3 = (C54618k) iVar.instance;
                kVar3.f143392a |= 4;
                kVar3.f143397f = z;
                if (f.f361243f.getBoolean("should_open_ulp_upgrade_flow", false)) {
                    String string = f.f361243f.getString("supervised_oid");
                    if (string != null) {
                        C54621n nVar = (C54621n) C54622o.f143400c.createBuilder();
                        nVar.copyOnWrite();
                        C54622o oVar = (C54622o) nVar.instance;
                        oVar.f143402a = 1 | oVar.f143402a;
                        oVar.f143403b = string;
                        iVar.copyOnWrite();
                        C54618k kVar4 = (C54618k) iVar.instance;
                        C54622o oVar2 = (C54622o) nVar.build();
                        oVar2.getClass();
                        kVar4.f143394c = oVar2;
                        kVar4.f143393b = 7;
                    } else {
                        throw new IllegalStateException("Not provided with required argument!");
                    }
                }
                cVar.mo526b((C54618k) iVar.build());
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C132334ga.m215095a(th, th);
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
            if (!this.f360615e) {
                super.onAttach(context);
                if (this.f360612a == null) {
                    Object jN = mo110649a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof ULPDeeplinkingFragment) {
                        ULPDeeplinkingFragment uLPDeeplinkingFragment = (ULPDeeplinkingFragment) fragment;
                        C68225k.m98532d(uLPDeeplinkingFragment);
                        this.f360612a = new C132336gc(uLPDeeplinkingFragment, (String) ((C74176nj) jN).f206677a.S.mo17428b(), (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C46485f) ((C74176nj) jN).f206995g.mo17428b(), (C37215b) ((C74176nj) jN).f206730b.f198067an.mo17428b(), (Context) ((C74176nj) jN).f206677a.g.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f360614d));
                    } else {
                        String obj = C132336gc.class.toString();
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
                C132334ga.m215095a(th, th2);
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
