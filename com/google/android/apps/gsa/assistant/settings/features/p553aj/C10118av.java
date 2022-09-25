package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.tabs.TabLayout;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
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

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.av */
/* compiled from: PG */
public final class C10118av extends C10145d implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C10120ax f34434a;

    /* renamed from: c */
    private Context f34435c;

    /* renamed from: d */
    private final C2393x f34436d = new C2393x(this);

    /* renamed from: e */
    private boolean f34437e;

    @Deprecated
    public C10118av() {
        C19559g.m37304c();
    }

    /* renamed from: f */
    public static C10118av m24946f() {
        C10118av avVar = new C10118av();
        C68324h.m98669f(avVar);
        return avVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo18256b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f34435c == null) {
            this.f34435c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f34435c;
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
        return this.f34436d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C10120ax mo17754z() {
        C10120ax axVar = this.f34434a;
        if (axVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f34437e) {
            return axVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10117au.m24945a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C10120ax j = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.fragment_structure_level_personal_results_settings_content, viewGroup, false);
            C0154a aVar = new C0154a(j.f34440a.getChildFragmentManager());
            aVar.mo689v(R.id.phone_settings_container, (Fragment) j.f34441b.mo17428b(), (String) null);
            C10139bp bpVar = new C10139bp();
            C68324h.m98669f(bpVar);
            aVar.mo689v(R.id.shared_devices_settings_container, bpVar, (String) null);
            aVar.mo509f();
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C10117au.m24945a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f34437e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C10117au.m24945a(th, th);
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
            C10117au.m24945a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C10120ax j = mo17754z();
            TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
            ViewSwitcher viewSwitcher = (ViewSwitcher) view.findViewById(R.id.view_switcher);
            tabLayout.mo48413h(tabLayout.mo48406b(j.f34442c), true);
            viewSwitcher.setDisplayedChild(j.f34442c);
            tabLayout.mo48408d(new C10119aw(j, viewSwitcher));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C10117au.m24945a(th, th);
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
            if (!this.f34437e) {
                super.onAttach(context);
                if (this.f34434a == null) {
                    Object jN = mo18281a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C10118av) {
                        C10118av avVar = (C10118av) fragment;
                        C68225k.m98532d(avVar);
                        this.f34434a = new C10120ax(avVar, ((C74178nm) jN).f207136c.f205647cq);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f34436d));
                    } else {
                        String obj = C10120ax.class.toString();
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
                C10117au.m24945a(th, th2);
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
