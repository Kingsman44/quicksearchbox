package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
import com.google.android.setupdesign.p3556e.p3557a.C45305a;
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
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.q */
/* compiled from: PG */
public final class C126730q extends C126709aw implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C126732s f349015a;

    /* renamed from: c */
    private Context f349016c;

    /* renamed from: d */
    private final C2393x f349017d = new C2393x(this);

    /* renamed from: e */
    private boolean f349018e;

    @Deprecated
    public C126730q() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C126732s mo17754z() {
        C126732s sVar = this.f349015a;
        if (sVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f349018e) {
            return sVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo107704b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f349016c == null) {
            this.f349016c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f349016c;
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
        return this.f349017d;
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
            C126732s a2 = mo17754z();
            ((C59052c) ((C59052c) C126732s.f349021a.mo56224b()).mo56372aa(37112)).mo56387q("result code %d", i2);
            C0167am activity = a2.f349022b.getActivity();
            if (i == 1000 && activity != null) {
                if (i2 == 0) {
                    activity.finish();
                } else {
                    C47393f.m84236g(new C126686a(a2.f349023c, -1), a2.f349022b);
                    activity.finish();
                }
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C126729p.m207281a(th, th);
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
            C126729p.m207281a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C126732s a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_suw_hotword_fragment, viewGroup, false);
            C45305a.m80754b(a.f349022b);
            C45305a.m80753a(a.f349022b);
            C0167am activity = a.f349022b.getActivity();
            a.f349025e.mo50708b(a.f349024d.mo40288a(activity.getIntent().getExtras(), a.f349026f), C46788de.DONT_CARE, new C126731r(a, activity));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C126729p.m207281a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f349018e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C126729p.m207281a(th, th);
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
            C126729p.m207281a(th, th);
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

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.libraries.search.assistant.u.a.b, java.lang.Object] */
    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f349018e) {
                super.onAttach(context);
                if (this.f349015a == null) {
                    Object jN = mo107705d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C126730q) {
                        C126730q qVar = (C126730q) fragment;
                        C68225k.m98532d(qVar);
                        boolean b = ((C74176nj) jN).f206730b.f198027a.mo66983fx().mo60460b();
                        String b2 = C47260e.m84065b(((C74176nj) jN).mo69504b());
                        C68225k.m98532d(b2);
                        this.f349015a = new C126732s(qVar, ((C74176nj) jN).f206730b.f198027a.mo67000gN(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), b, b2);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f349017d));
                    } else {
                        String obj = C126732s.class.toString();
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
                C126729p.m207281a(th, th2);
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
