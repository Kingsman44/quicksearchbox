package com.google.android.libraries.assistant.auto.tng.morris.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.onboarding.ah */
/* compiled from: PG */
public final class C15400ah extends C15393aa implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C15403ak f46216a;

    /* renamed from: c */
    private Context f46217c;

    /* renamed from: d */
    private final C2393x f46218d = new C2393x(this);

    /* renamed from: e */
    private boolean f46219e;

    @Deprecated
    public C15400ah() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo22294b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f46217c == null) {
            this.f46217c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f46217c;
    }

    /* renamed from: f */
    public final C15403ak mo17754z() {
        C15403ak akVar = this.f46216a;
        if (akVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f46219e) {
            return akVar;
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
        return this.f46218d;
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
            C15399ag.m32059a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C15403ak f = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            View inflate = layoutInflater.inflate(R.layout.morris_light_education_fragment, viewGroup, false);
            Button button = (Button) inflate.findViewById(R.id.oobe_continue_button);
            f.f46225b.mo51253b(button, new C15401ai(f, button));
            f.f46226c.mo21444a(button, 127753);
            f.f46226c.mo21444a(inflate, 127752);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C15399ag.m32059a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f46219e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C15399ag.m32059a(th, th);
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
            C15399ag.m32059a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C15403ak f = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            View findViewById = f.f46224a.requireView().findViewById(R.id.light_education_fewer_distractions);
            View findViewById2 = f.f46224a.requireView().findViewById(R.id.light_education_animation_container);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) f.f46224a.requireView().findViewById(R.id.light_education_animation);
            lottieAnimationView.mo9700j("anims/morris_oobe_light_education_illustration.json");
            lottieAnimationView.mo9689a(new C15402aj(findViewById2, findViewById));
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.f15138d.mo9773j(0.0f);
            lottieAnimationView.mo9695f();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C15399ag.m32059a(th, th);
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
            if (!this.f46219e) {
                super.onAttach(context);
                if (this.f46216a == null) {
                    Object jN = mo22293a().mo17653jN();
                    this.f46216a = new C15403ak((Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a, (C47400m) ((C74178nm) jN).f207130a.d.f201806g.mo17428b(), ((C74178nm) jN).f207130a.a.mo68330fc(), (C28443m) ((C74178nm) jN).f207130a.a.f202879fR.mo17428b());
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f46218d));
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
                C15399ag.m32059a(th, th2);
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
