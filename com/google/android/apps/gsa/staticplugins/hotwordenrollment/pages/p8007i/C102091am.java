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
import android.widget.FrameLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.n.p;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.speech.hotword.unicornenrollment.ParentSelectorScreenView;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101495ac;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
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
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.base.C58833ax;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.am */
/* compiled from: PG */
public final class C102091am extends C102118t implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C102097as f284799a;

    /* renamed from: b */
    private Context f284800b;

    /* renamed from: c */
    private final C2393x f284801c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f284802d = new C47515ab(this);

    /* renamed from: e */
    private boolean f284803e;

    @Deprecated
    public C102091am() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        C102097as j = mo17754z();
        C101763c cVar = new C101763c();
        cVar.mo92556b(0);
        C47393f.m84236g(cVar.mo92555a(), j.f284812c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92865d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f284800b == null) {
            this.f284800b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f284800b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f284802d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f284801c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f284802d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C102097as mo17754z() {
        C102097as asVar = this.f284799a;
        if (asVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f284803e) {
            return asVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f284802d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102090al.m169050a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f284802d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C102090al.m169050a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f284802d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102090al.m169050a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f284802d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102090al.m169050a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f284802d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C102090al.m169050a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f284802d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C102097as j = mo17754z();
            j.f284821l = (ParentSelectorScreenView) layoutInflater.inflate(R.layout.hotword_enrollment_parent_selector_screen, (ViewGroup) null);
            j.f284821l.mo87063b(true, new C102092an(j), j.f284819j.mo92329b(), j.f284819j.mo92337j(), j.f284819j.mo92332e());
            l lVar = j.f284813d;
            p pVar = new p();
            pVar.b = C58833ax.m90833j(j.f284814e.mo79668a());
            acu acu = (acu) acv.f128920X.createBuilder();
            acu.copyOnWrite();
            acv acv = (acv) acu.instance;
            acv.f128945a |= 1073741824;
            acv.f128970z = true;
            pVar.e((acv) acu.build());
            pVar.a = new C102095aq(j);
            pVar.e = C58833ax.m90833j(j.getClass().getSimpleName());
            lVar.h(pVar.a());
            FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.setId(R.id.hotword_enrollment_unicorn_container);
            frameLayout.addView(j.f284821l);
            C47831fm.m85019n();
            return frameLayout;
        } catch (Throwable th) {
            C102090al.m169050a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f284802d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C102090al.m169050a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f284802d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C102090al.m169050a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f284802d.mo51376d();
        try {
            super.onDetach();
            this.f284803e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C102090al.m169050a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f284802d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C102090al.m169050a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f284802d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C102090al.m169050a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f284802d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102090al.m169050a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f284802d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C102090al.m169050a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f284802d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f284802d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102090al.m169050a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f284802d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102090al.m169050a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f284802d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f284802d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f284802d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f284802d;
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
        C47515ab abVar = this.f284802d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f284802d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f284802d;
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
        this.f284802d.mo51381i();
        try {
            if (!this.f284803e) {
                super.onAttach(context);
                if (this.f284799a == null) {
                    Object jN = mo92888b().mo17653jN();
                    C101781u w = ((C74178nm) jN).mo70081w();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C102091am) {
                        C102091am amVar = (C102091am) fragment;
                        C68225k.m98532d(amVar);
                        this.f284799a = new C102097as(w, amVar, (l) ((C74178nm) jN).f207130a.a.f202833eY.mo17428b(), (C86054o) ((C74178nm) jN).f207130a.a.f202324I.mo17428b(), (C90929bz) ((C74178nm) jN).f207130a.a.f203444q.mo17428b(), (C91189au) ((C74178nm) jN).f207130a.a.f202737ci.mo17428b(), ((C74178nm) jN).mo70083y(), (C92371d) ((C74178nm) jN).f207130a.a.f202806dy.mo17428b(), (C101495ac) ((C74178nm) jN).f207136c.f205625cU.mo17428b(), (C101497ae) ((C74178nm) jN).f207109F.mo17428b(), (C47770dh) ((C74178nm) jN).f207130a.a.f202593X.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f284802d, this.f284801c));
                    } else {
                        String obj = C102097as.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f284802d;
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
                C102090al.m169050a(th, th2);
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
