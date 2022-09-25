package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c;

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
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128567c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.animation.C147785k;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;
import com.google.android.libraries.search.p6glow.C39882m;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.c.b */
/* compiled from: PG */
public final class C128582b extends C128598p implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C128593k f353547a;

    /* renamed from: c */
    private Context f353548c;

    /* renamed from: d */
    private final C2393x f353549d = new C2393x(this);

    /* renamed from: e */
    private boolean f353550e;

    @Deprecated
    public C128582b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C128593k mo17754z() {
        C128593k kVar = this.f353547a;
        if (kVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f353550e) {
            return kVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo108528b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f353548c == null) {
            this.f353548c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f353548c;
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
        return this.f353549d;
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
            C128579a.m209846a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C128593k a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.assistant_p6_glow, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.assistant_p6_glow_glow_view);
            C69664n.m101060f(findViewById, "view.findViewById(R.id.a…istant_p6_glow_glow_view)");
            AssistantP6GlowView assistantP6GlowView = (AssistantP6GlowView) findViewById;
            assistantP6GlowView.addOnLayoutChangeListener(new C128592j(assistantP6GlowView));
            View findViewById2 = inflate.findViewById(R.id.assistant_p6_glow_mic);
            C69664n.m101060f(findViewById2, "view.findViewById(R.id.assistant_p6_glow_mic)");
            LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById2;
            C128567c.m209821d(lottieAnimationView, new C128590h(lottieAnimationView));
            C128586d dVar = a.f353564a;
            if ((dVar.f353553a & 2) != 0) {
                a.f353565b.mo108810b(dVar.f353555c, lottieAnimationView);
            } else {
                a.f353565b.mo108810b(125337, lottieAnimationView);
            }
            a.f353565b.mo108810b(92671, assistantP6GlowView);
            if (bundle != null) {
                C128593k.m209860h(lottieAnimationView, (float) bundle.getInt("micFrame"));
                a.f353569f = bundle.getBoolean("shouldAnimateExecuting");
            }
            a.f353566c = new C39882m(assistantP6GlowView, a.f353570g, new C128591i(a, lottieAnimationView), 1016);
            C69664n.m101060f(inflate, "view");
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C128579a.m209846a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C128593k a = mo17754z();
            a.f353566c = null;
            C147785k kVar = a.f353567d;
            if (kVar != null) {
                kVar.mo124464f();
            }
            a.f353567d = null;
            c.close();
            return;
        } catch (Throwable th) {
            C128579a.m209846a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f353550e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C128579a.m209846a(th, th);
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
            C128579a.m209846a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            C128593k a = mo17754z();
            C69664n.m101061g(bundle, "outState");
            bundle.putInt("micFrame", (int) a.mo108531a().f15138d.f15342b.f15714d);
            bundle.putBoolean("shouldAnimateExecuting", a.f353569f);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128579a.m209846a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C128593k a2 = mo17754z();
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_p6_glow_glow_view), new C128594l(a2));
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_p6_glow_mic), new C128595m(a2));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C128579a.m209846a(th, th);
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
            if (!this.f353550e) {
                super.onAttach(context);
                if (this.f353547a == null) {
                    this.f353547a = ((C128596n) mo108542d().mo17653jN()).mo108540B();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f353549d));
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
                C128579a.m209846a(th, th2);
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
