package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8007i;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83974p;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83975q;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102228q;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102229r;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102231t;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102232u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101765e;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101781u;
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
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.j */
/* compiled from: PG */
public final class C102108j extends C102115q implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C102110l f284846a;

    /* renamed from: b */
    private Context f284847b;

    /* renamed from: c */
    private final C2393x f284848c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f284849d = new C47515ab(this);

    /* renamed from: e */
    private boolean f284850e;

    @Deprecated
    public C102108j() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        C102110l b = mo17754z();
        C101765e eVar = new C101765e();
        eVar.mo92562b(-1);
        eVar.f283865a = null;
        C47393f.m84236g(eVar.mo92561a(), b.f284853b);
    }

    /* renamed from: b */
    public final C102110l mo17754z() {
        C102110l lVar = this.f284846a;
        if (lVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f284850e) {
            return lVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92877d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f284847b == null) {
            this.f284847b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f284847b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f284849d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f284848c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f284849d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f284849d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102107i.m169085a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f284849d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C102107i.m169085a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f284849d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102107i.m169085a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f284849d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102107i.m169085a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f284849d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C102107i.m169085a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f284849d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C102110l b = mo17754z();
            View b2 = b.f284854c.mo93020b(layoutInflater, R.layout.hand_back_to_parent_screen_opa, R.layout.hand_back_to_parent_screen_glif, R.layout.hand_back_to_parent_screen_glif_no_partner_theme, (ViewGroup) null, 0, 0);
            C102230s sVar = b.f284854c;
            C102231t e = C102232u.m169449e();
            e.mo92352d(b.f284853b.getString(R.string.assistant_suw_hand_back_to_parent_title));
            e.mo92351c(b.f284853b.getString(R.string.assistant_suw_hand_back_to_parent_subtitle));
            sVar.mo93026h(e.mo92349a());
            C102230s sVar2 = b.f284854c;
            C102228q f = C102229r.m169429f();
            f.mo92319b(2);
            C84010e e2 = C84011f.m133882e();
            e2.mo77375c(b.f284853b.getString(R.string.hotword_enrollment_summary_finish_assistant_device));
            ((C83958a) e2).f228734b = new C102109k(b);
            f.mo92320c(e2.mo77373a());
            f.mo92321d(C84011f.f228856a);
            sVar2.mo93025g(f.mo92318a());
            LottieAnimationView lottieAnimationView = (LottieAnimationView) b2.findViewById(R.id.back_to_parent_animation);
            lottieAnimationView.setVisibility(0);
            View findViewById = b2.findViewById(R.id.back_to_parent_animation_container);
            C83973o a = C83974p.m133833a(findViewById, lottieAnimationView, new C102106h(b.f284853b.getContext(), b.f284856e));
            if (b.f284856e) {
                findViewById.setForceDarkAllowed(false);
            }
            a.mo77402c();
            a.mo77403d();
            b.f284855d = a;
            lottieAnimationView.requestLayout();
            C47831fm.m85019n();
            return b2;
        } catch (Throwable th) {
            C102107i.m169085a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f284849d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C102107i.m169085a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f284849d.mo51375c();
        try {
            super.onDestroyView();
            C102110l b = mo17754z();
            C83975q qVar = b.f284855d;
            if (qVar != null) {
                qVar.mo77406g();
            }
            b.f284855d = null;
            c.close();
            return;
        } catch (Throwable th) {
            C102107i.m169085a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f284849d.mo51376d();
        try {
            super.onDetach();
            this.f284850e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C102107i.m169085a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f284849d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C102107i.m169085a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f284849d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C102107i.m169085a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f284849d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102107i.m169085a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f284849d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C102107i.m169085a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f284849d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f284849d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102107i.m169085a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f284849d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102107i.m169085a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f284849d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f284849d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f284849d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f284849d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReenterTransition(obj);
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void setReturnTransition(Object obj) {
        C47515ab abVar = this.f284849d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f284849d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f284849d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f284849d.mo51381i();
        try {
            if (!this.f284850e) {
                super.onAttach(context);
                if (this.f284846a == null) {
                    Object jN = mo92881f().mo17653jN();
                    C101781u w = ((C74178nm) jN).mo70081w();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C102108j) {
                        C102108j jVar = (C102108j) fragment;
                        C68225k.m98532d(jVar);
                        C101497ae aeVar = (C101497ae) ((C74178nm) jN).f207109F.mo17428b();
                        this.f284846a = new C102110l(w, jVar, ((C74178nm) jN).mo70079u(), ((C74178nm) jN).f207136c.mo69302ed());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f284849d, this.f284848c));
                    } else {
                        String obj = C102110l.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f284849d;
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
                C102107i.m169085a(th, th2);
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
