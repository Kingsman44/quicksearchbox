package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.p9497a.C126686a;
import com.google.android.googlequicksearchbox.R;
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
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ah */
/* compiled from: PG */
public final class C126694ah extends C126712az implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C126696aj f348913a;

    /* renamed from: c */
    private Context f348914c;

    /* renamed from: d */
    private final C2393x f348915d = new C2393x(this);

    /* renamed from: e */
    private boolean f348916e;

    @Deprecated
    public C126694ah() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C126696aj mo17754z() {
        C126696aj ajVar = this.f348913a;
        if (ajVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f348916e) {
            return ajVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo107689b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f348914c == null) {
            this.f348914c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f348914c;
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
        return this.f348915d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f122869b.mo51373a("Fragment:onActivityResult");
        try {
            mo51110k(i, i2, intent);
            C126696aj a2 = mo17754z();
            if (a2.f348921c || a2.f348922d) {
                C0167am activity = a2.f348920b.getActivity();
                if (activity != null) {
                    if (i2 != -1) {
                        if (i2 == 1) {
                            i2 = 1;
                        }
                    }
                    activity.setResult(i2);
                    activity.finish();
                }
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126693ag.m207194a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C126693ag.m207194a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C126696aj a = mo17754z();
            C58480gp e = C58485gu.m89837e();
            Intent intent = a.f348920b.getActivity().getIntent();
            if (intent.getBooleanExtra("intent_extra_enable_intro_screen", false)) {
                e.mo55395g("SuwIntroFragment");
            }
            if (intent.getBooleanExtra("intent_extra_enable_settings_screen", false)) {
                e.mo55395g("SuwSettingsFragment");
            }
            if (intent.getBooleanExtra("intent_extra_enable_hardware_button_screen", false)) {
                e.mo55395g("SuwHardwareFragment");
            }
            a.f348923e = e.mo55394f();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C126693ag.m207194a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Fragment fragment;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C126696aj a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_suw_root_fragment, viewGroup, false);
            if (a.f348921c || a.f348922d) {
                C0167am activity = a.f348920b.getActivity();
                if (!(a.f348919a == null || activity == null || a.f348920b.getChildFragmentManager().f634a.mo671c("SuwFragment") != null)) {
                    int intExtra = activity.getIntent().getIntExtra("intent_extra_screen_type", -1);
                    AccountId accountId = a.f348919a;
                    if (intExtra == -1) {
                        fragment = new C126690ad();
                        C68324h.m98669f(fragment);
                        C47247a.m84047b(fragment, accountId);
                    } else if (intExtra == 0) {
                        fragment = C126736w.m207297a(accountId, "SuwIntroFragment");
                    } else if (intExtra == 1) {
                        fragment = C126704ar.m207209a(accountId, "SuwSettingsFragment");
                    } else if (intExtra == 2) {
                        fragment = new C126730q();
                        C68324h.m98669f(fragment);
                        C47247a.m84047b(fragment, accountId);
                        C47243l.m84040b(fragment, "SuwHotwordFragment");
                    } else if (intExtra == 3) {
                        fragment = C126725l.m207268f("SuwHardwareFragment");
                    } else {
                        throw new IllegalArgumentException("Unknown screenType");
                    }
                    C0154a aVar = new C0154a(a.f348920b.getChildFragmentManager());
                    aVar.mo689v(R.id.assistant_suw_root_layout, fragment, "SuwFragment");
                    aVar.mo509f();
                }
            } else {
                a.mo107690a((String) null);
            }
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C126693ag.m207194a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f348916e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C126693ag.m207194a(th, th);
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
            C126693ag.m207194a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C126686a.class, new C126697ak(mo17754z()));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C126693ag.m207194a(th, th);
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
            if (!this.f348916e) {
                super.onAttach(context);
                if (this.f348913a == null) {
                    Object jN = mo107712d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C126694ah) {
                        C126694ah ahVar = (C126694ah) fragment;
                        C68225k.m98532d(ahVar);
                        this.f348913a = new C126696aj(accountId, ahVar, ((C74176nj) jN).f206730b.f198027a.mo66983fx().mo60459a());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f348915d));
                    } else {
                        String obj = C126696aj.class.toString();
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
                C126693ag.m207194a(th, th2);
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
