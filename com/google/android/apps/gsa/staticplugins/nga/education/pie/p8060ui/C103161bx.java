package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

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
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.C103032a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.bx */
/* compiled from: PG */
public final class C103161bx extends C103131au implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C103165ca f287881a;

    /* renamed from: c */
    private Context f287882c;

    /* renamed from: d */
    private final C2393x f287883d = new C2393x(this);

    /* renamed from: e */
    private boolean f287884e;

    @Deprecated
    public C103161bx() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo93649b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f287882c == null) {
            this.f287882c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f287882c;
    }

    /* renamed from: f */
    public final C103165ca mo17754z() {
        C103165ca caVar = this.f287881a;
        if (caVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f287884e) {
            return caVar;
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
        return this.f287883d;
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
            C103160bw.m171059a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C103165ca f = mo17754z();
            f.f287890b.mo93659d();
            View inflate = layoutInflater.inflate(R.layout.nga_pie_swipe_invocation_fragment, viewGroup, false);
            inflate.addOnLayoutChangeListener(new C103162by(inflate));
            ((LottieAnimationView) inflate.findViewById(R.id.nga_pie_swipe_invocation_animation)).mo9698i(R.raw.nga_pie_swipe_invocation_anim);
            inflate.findViewById(R.id.nga_pie_exit_button).setOnClickListener(new C103163bz(f));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C103160bw.m171059a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f287884e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C103160bw.m171059a(th, th);
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
            C103160bw.m171059a(th, th);
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
            if (!this.f287884e) {
                super.onAttach(context);
                if (this.f287881a == null) {
                    Object jN = mo93648a().mo17653jN();
                    C103032a aVar = (C103032a) ((C74178nm) jN).f207130a.b.f200011bY.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C103161bx) {
                        C103161bx bxVar = (C103161bx) fragment;
                        C68225k.m98532d(bxVar);
                        this.f287881a = new C103165ca(aVar, bxVar);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f287883d));
                    } else {
                        String obj = C103165ca.class.toString();
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
                C103160bw.m171059a(th, th2);
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
