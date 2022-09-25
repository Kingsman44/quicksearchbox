package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

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
import com.google.android.apps.gsa.binaries.satin.app.aqe;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9413a.p9414a.C124790d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9413a.p9414a.C124797k;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template.ScreenStateView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
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
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60887da;
import com.google.frameworks.client.data.android.p4632a.C61343d;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.AuthTokenCheckerFragment */
/* compiled from: PG */
public final class AuthTokenCheckerFragment extends C124851bv implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C124919p f344240a;

    /* renamed from: c */
    private Context f344241c;

    /* renamed from: d */
    private final C2393x f344242d = new C2393x(this);

    /* renamed from: e */
    private boolean f344243e;

    @Deprecated
    public AuthTokenCheckerFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C124919p mo17754z() {
        C124919p pVar = this.f344240a;
        if (pVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f344243e) {
            return pVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo106622b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f344241c == null) {
            this.f344241c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f344241c;
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
        return this.f344242d;
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
            C124915l.m204762a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C124919p a = mo17754z();
            a.f344659e.mo50828h(R.id.assistant_subscription_recovery_intent, a.f344661g, a.f344662h);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C124915l.m204762a(th, th);
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
            C124915l.m204762a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f344243e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C124915l.m204762a(th, th);
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
            C124915l.m204762a(th, th);
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
            if (!this.f344243e) {
                super.onAttach(context);
                if (this.f344240a == null) {
                    Object jN = mo106672d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof AuthTokenCheckerFragment) {
                        AuthTokenCheckerFragment authTokenCheckerFragment = (AuthTokenCheckerFragment) fragment;
                        C68225k.m98532d(authTokenCheckerFragment);
                        C124848bs p = ((C74176nj) jN).mo70006p();
                        aqe aqe = ((C74176nj) jN).f206730b.f198027a;
                        Context context2 = (Context) aqe.f199175a.d.f201494aF.mo17428b();
                        C124790d dVar = new C124790d(new C124797k((AccountId) aqe.f199228b.f198239e.mo17428b(), (C61343d) aqe.f199175a.lz.mo17428b(), (C46175b) aqe.f199228b.f198398h.mo17428b(), (C46128f) aqe.f199228b.f198504j.mo17428b(), (Executor) aqe.f199175a.n.mo17428b(), (C60887da) aqe.f199175a.q.mo17428b()), (Executor) aqe.f199175a.n.mo17428b());
                        AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                        this.f344240a = new C124919p(authTokenCheckerFragment, p, dVar, (C46485f) ((C74176nj) jN).f206995g.mo17428b(), (C46855i) ((C74176nj) jN).f207083j.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f344242d));
                    } else {
                        String obj = C124919p.class.toString();
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
                C124915l.m204762a(th, th2);
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
