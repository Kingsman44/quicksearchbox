package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

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
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101495ac;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7970b.C101501b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j.C102152ax;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46801dp;
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
import com.google.common.base.C58894dd;
import com.google.common.p4526f.C59052c;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.av */
/* compiled from: PG */
public final class C102150av extends C102192w implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C102152ax f284964a;

    /* renamed from: b */
    private Context f284965b;

    /* renamed from: c */
    private final C2393x f284966c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f284967d = new C47515ab(this);

    /* renamed from: e */
    private boolean f284968e;

    @Deprecated
    public C102150av() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        Fragment a = mo17754z().mo92914a();
        if (a == null) {
            ((C59052c) ((C59052c) C102152ax.f284970a.mo56224b()).mo56372aa(20597)).mo56386p("Child fragment hasn't installed yet. Exit");
            return;
        }
        ((C59052c) ((C59052c) C102152ax.f284970a.mo56224b()).mo56372aa(20595)).mo56389s("Child fragment: %s ", a);
        if (a instanceof C101501b) {
            ((C101501b) a).mo92348a();
        } else {
            ((C59052c) ((C59052c) C102152ax.f284970a.mo56225c()).mo56372aa(20596)).mo56389s("Each fragment/screen has to implement this to log the exit events, etc, current Fragment %s ", a);
            throw new C58894dd("Each fragment/screen has to implement this to log the exit events, etc");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92912d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f284965b == null) {
            this.f284965b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f284965b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f284967d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f284966c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f284967d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C102152ax mo17754z() {
        C102152ax axVar = this.f284964a;
        if (axVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f284968e) {
            return axVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f284967d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102149au.m169185a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f284967d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C102149au.m169185a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f284967d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102149au.m169185a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f284967d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102149au.m169185a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f284967d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C102149au.m169185a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f284967d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C102152ax j = mo17754z();
            j.f284972c.mo50707a(new C46719bc(j.f284973d, new C102151aw(j), "GetAccountIdInVaaConsentCoordinatorFrag"), new C102152ax.C102153a());
            View inflate = layoutInflater.inflate(R.layout.vaa_consent_coordinator_fragment, viewGroup, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C102149au.m169185a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f284967d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C102149au.m169185a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f284967d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C102149au.m169185a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f284967d.mo51376d();
        try {
            super.onDetach();
            this.f284968e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C102149au.m169185a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f284967d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C102149au.m169185a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f284967d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C102149au.m169185a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f284967d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102149au.m169185a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f284967d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C102149au.m169185a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f284967d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f284967d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102149au.m169185a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f284967d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102149au.m169185a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f284967d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f284967d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f284967d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f284967d;
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
        C47515ab abVar = this.f284967d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f284967d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f284967d;
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
        this.f284967d.mo51381i();
        try {
            if (!this.f284968e) {
                super.onAttach(context);
                if (this.f284964a == null) {
                    Object jN = mo92943b().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C102150av) {
                        C102150av avVar = (C102150av) fragment;
                        C68225k.m98532d(avVar);
                        this.f284964a = new C102152ax(avVar, (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b(), (C46801dp) ((C74178nm) jN).f207138e.mo17428b(), (C46723bg) ((C74178nm) jN).f207130a.ap.mo17428b(), (C46128f) ((C74178nm) jN).f207130a.a.f203020i.mo17428b(), (C101497ae) ((C74178nm) jN).f207109F.mo17428b(), (C101495ac) ((C74178nm) jN).f207136c.f205625cU.mo17428b(), (String) ((C74178nm) jN).f207136c.f205595br.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f284967d, this.f284966c));
                    } else {
                        String obj = C102152ax.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f284967d;
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
                C102149au.m169185a(th, th2);
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
