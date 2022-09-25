package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h;

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
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.h.s.s;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102229r;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102231t;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102232u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101765e;
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
import com.google.common.p4522b.C58495hd;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.ad */
/* compiled from: PG */
public final class C102051ad extends C102058g implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C102052ae f284721a;

    /* renamed from: b */
    private Context f284722b;

    /* renamed from: c */
    private final C2393x f284723c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f284724d = new C47515ab(this);

    /* renamed from: e */
    private boolean f284725e;

    @Deprecated
    public C102051ad() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        C102052ae j = mo17754z();
        C101765e eVar = new C101765e();
        eVar.mo92562b(-1);
        eVar.f283865a = null;
        C47393f.m84236g(eVar.mo92561a(), j.f284727a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92821d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f284722b == null) {
            this.f284722b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f284722b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f284724d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f284723c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f284724d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C102052ae mo17754z() {
        C102052ae aeVar = this.f284721a;
        if (aeVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f284725e) {
            return aeVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f284724d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102050ac.m168979a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f284724d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C102050ac.m168979a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f284724d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102050ac.m168979a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f284724d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102050ac.m168979a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f284724d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C102050ac.m168979a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f284724d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C102052ae j = mo17754z();
            View a = j.f284729c.mo93019a(layoutInflater);
            C102230s sVar = j.f284729c;
            C102231t e = C102232u.m169449e();
            e.mo92352d(j.f284730d.mo92820d());
            e.mo92351c(j.f284730d.mo92819c());
            sVar.mo93026h(e.mo92349a());
            C102076y b = j.f284730d.mo92818b();
            if (b != null) {
                j.f284729c.mo93024f(b.mo92846a());
                C102230s sVar2 = j.f284729c;
                sVar2.mo93023e();
                b.mo92847b(sVar2.f285265a);
            }
            C102229r a2 = j.f284730d.mo92817a();
            if (a2 != null) {
                j.f284729c.mo93025g(a2);
            }
            if (j.f284728b.mo85090c()) {
                C90743b.m148214a(a.findViewById(R.id.title), 500);
            }
            C47831fm.m85019n();
            return a;
        } catch (Throwable th) {
            C102050ac.m168979a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f284724d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C102050ac.m168979a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f284724d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C102050ac.m168979a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f284724d.mo51376d();
        try {
            super.onDetach();
            this.f284725e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C102050ac.m168979a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f284724d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C102050ac.m168979a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f284724d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C102050ac.m168979a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f284724d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102050ac.m168979a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f284724d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C102050ac.m168979a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f284724d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f284724d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102050ac.m168979a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f284724d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102050ac.m168979a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f284724d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f284724d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f284724d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f284724d;
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
        C47515ab abVar = this.f284724d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f284724d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f284724d;
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
        this.f284724d.mo51381i();
        try {
            if (!this.f284725e) {
                super.onAttach(context);
                if (this.f284721a == null) {
                    Object jN = mo92843b().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C102051ad) {
                        C102051ad adVar = (C102051ad) fragment;
                        C68225k.m98532d(adVar);
                        this.f284721a = new C102052ae(adVar, (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b(), ((C74178nm) jN).mo70079u(), (C90743b) ((C74178nm) jN).f207130a.gx.mo17428b(), C58495hd.m89901o(s.b, ((C74178nm) jN).f207115L, s.a, ((C74178nm) jN).f207116M));
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f284724d, this.f284723c));
                    } else {
                        String obj = C102052ae.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f284724d;
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
                C102050ac.m168979a(th, th2);
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
