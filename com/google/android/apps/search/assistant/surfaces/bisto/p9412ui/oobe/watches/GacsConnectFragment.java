package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9405a.C124743o;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124844bo;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124848bs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.OobeActivityViewModel;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9416c.C124863f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template.C125009e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template.ScreenStateView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.p10712d.C142327bf;
import com.google.android.p10712d.C142328bg;
import com.google.android.setupdesign.GlifLayout;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.local.C46855i;
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
import com.google.common.p4580v.C60950i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.GacsConnectFragment */
/* compiled from: PG */
public final class GacsConnectFragment extends C124947at implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C124931ad f344684a;

    /* renamed from: c */
    private Context f344685c;

    /* renamed from: d */
    private final C2393x f344686d = new C2393x(this);

    /* renamed from: e */
    private boolean f344687e;

    @Deprecated
    public GacsConnectFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C124931ad mo17754z() {
        C124931ad adVar = this.f344684a;
        if (adVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f344687e) {
            return adVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo106726b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f344685c == null) {
            this.f344685c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f344685c;
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
        return this.f344686d;
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
            C124928aa.m204819a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C124931ad a = mo17754z();
            if (bundle != null && bundle.containsKey("start_time_ms")) {
                a.f344708f = Instant.ofEpochMilli(bundle.getLong("start_time_ms"));
            }
            a.f344709g = a.f344705c.mo50828h(R.id.assistant_bisto_subscription_gacs_connect, a, a);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C124928aa.m204819a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C124931ad a = mo17754z();
            ScreenStateView screenStateView = (ScreenStateView) layoutInflater.inflate(R.layout.assistant_oobe_template_screen_root, viewGroup, false);
            C124844bo boVar = a.f344703a.f344439b;
            if (boVar == null) {
                boVar = C124844bo.f344417m;
            }
            if (boVar.f344429k) {
                GlifLayout glifLayout = (GlifLayout) screenStateView.mo106775a(C125009e.MAIN, R.layout.assistant_bisto_oobe_generic);
                glifLayout.mo49196r(R.string.assistant_bisto_oobe_connecting_title);
                glifLayout.mo49194p(R.string.assistant_bisto_oobe_connecting_message);
                C0154a aVar = new C0154a(a.f344704b.getChildFragmentManager());
                AccountId accountId = a.f344706d;
                C142327bf bfVar = (C142327bf) C142328bg.f386139f.createBuilder();
                bfVar.mo117125a("https://gstatic.com/bisto/oobe/b74043146438293b6f380b6f65dd0e39716d9f87b2dd4a2151949de9c327907f/connecting.html");
                bfVar.copyOnWrite();
                C142328bg bgVar = (C142328bg) bfVar.instance;
                bgVar.f386141a |= 2;
                bgVar.f386145e = "H,4:3";
                aVar.mo689v(R.id.assistant_bisto_oobe_webview_container, C124863f.m204684a(accountId, (C142328bg) bfVar.build()), (String) null);
                aVar.mo509f();
            } else {
                screenStateView.mo106776b(R.string.assistant_bisto_oobe_connecting_title, Integer.valueOf(R.string.assistant_bisto_oobe_connecting_message));
            }
            C47831fm.m85019n();
            return screenStateView;
        } catch (Throwable th) {
            C124928aa.m204819a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f344687e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C124928aa.m204819a(th, th);
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
            C124928aa.m204819a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            ((OobeActivityViewModel) new C2368bp(mo17754z().f344704b.requireActivity()).mo5770a(OobeActivityViewModel.class)).mo106637a().mo106662b("GacsConnectFragment");
            e.close();
            return;
        } catch (Throwable th) {
            C124928aa.m204819a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            Instant instant = mo17754z().f344708f;
            if (instant != null) {
                bundle.putLong("start_time_ms", instant.toEpochMilli());
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C124928aa.m204819a(th, th);
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
            if (!this.f344687e) {
                super.onAttach(context);
                if (this.f344684a == null) {
                    Object jN = mo106743d().mo17653jN();
                    C124743o Q = ((C74176nj) jN).f206730b.f198027a.mo66658Q();
                    C124848bs p = ((C74176nj) jN).mo70006p();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof GacsConnectFragment) {
                        GacsConnectFragment gacsConnectFragment = (GacsConnectFragment) fragment;
                        C68225k.m98532d(gacsConnectFragment);
                        this.f344684a = new C124931ad(Q, p, gacsConnectFragment, (C46855i) ((C74176nj) jN).f207083j.mo17428b(), (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C46485f) ((C74176nj) jN).f206995g.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C60950i) ((C74176nj) jN).f206677a.bC.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f344686d));
                    } else {
                        String obj = C124931ad.class.toString();
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
                C124928aa.m204819a(th, th2);
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
