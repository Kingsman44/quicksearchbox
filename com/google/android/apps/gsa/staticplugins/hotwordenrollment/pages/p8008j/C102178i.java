package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7970b.C101501b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101781u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
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
import com.google.common.base.C58894dd;
import com.google.common.p4526f.C59052c;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.i */
/* compiled from: PG */
public final class C102178i extends C102188s implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C102179j f285045a;

    /* renamed from: b */
    private Context f285046b;

    /* renamed from: c */
    private final C2393x f285047c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f285048d = new C47515ab(this);

    /* renamed from: e */
    private boolean f285049e;

    @Deprecated
    public C102178i() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        C102179j b = mo17754z();
        Fragment a = b.mo92930a();
        if (a == null) {
            ((C59052c) ((C59052c) C102179j.f285050a.mo56224b()).mo56372aa(20564)).mo56386p("Child fragment hasn't installed yet.");
            C101763c cVar = new C101763c();
            cVar.mo92556b(0);
            C47393f.m84236g(cVar.mo92555a(), b.f285051b);
            return;
        }
        ((C59052c) ((C59052c) C102179j.f285050a.mo56224b()).mo56372aa(20561)).mo56389s("ChildFragment: %s ", a);
        if (a instanceof C101501b) {
            ((C59052c) ((C59052c) C102179j.f285050a.mo56224b()).mo56372aa(20563)).mo56386p("Child fragment is handing onBackPressed");
            ((C101501b) a).mo92348a();
            return;
        }
        ((C59052c) ((C59052c) C102179j.f285050a.mo56225c()).mo56372aa(20562)).mo56389s("Each fragment/screen has to implement this to log the exit events, etc, current Fragment %s ", a);
        throw new C58894dd("Each fragment/screen has to implement this to log the exit events, etc");
    }

    /* renamed from: b */
    public final C102179j mo17754z() {
        C102179j jVar = this.f285045a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f285049e) {
            return jVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92929d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f285046b == null) {
            this.f285046b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f285046b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f285048d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f285047c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f285048d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f285048d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102177h.m169224a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f285048d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C102177h.m169224a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f285048d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102177h.m169224a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f285048d.mo51381i();
        try {
            super.onCreate(bundle);
            mo17754z();
            if (((C59052c) C102179j.f285050a.mo56224b()).mo56369V()) {
                ((C59052c) ((C59052c) C102179j.f285050a.mo56224b()).mo56372aa(20566)).mo56389s("#onCreate, has savedInstanceState: %b", Boolean.valueOf(bundle != null));
                if (bundle != null) {
                    ((C59052c) ((C59052c) C102179j.f285050a.mo56224b()).mo56372aa(20567)).mo56389s("savedInstanceState=%s", bundle);
                }
            }
            ((C59052c) ((C59052c) C102179j.f285050a.mo56224b()).mo56372aa(20565)).mo56386p("onCreate");
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102177h.m169224a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f285048d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C102177h.m169224a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f285048d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C102179j b = mo17754z();
            ((C59052c) ((C59052c) C102179j.f285050a.mo56224b()).mo56372aa(20553)).mo56386p("#onCreateView");
            View inflate = layoutInflater.inflate(R.layout.fedhot_vaa_parent_fragment, viewGroup, false);
            ((C59052c) ((C59052c) C102179j.f285050a.mo56224b()).mo56372aa(20554)).mo56386p("#pickFragment");
            if (b.mo92930a() == null) {
                b.f285054e = b.f285053d.mo92922a();
                ((C59052c) ((C59052c) C102179j.f285050a.mo56224b()).mo56372aa(20555)).mo56389s("screenType: %s", b.f285054e);
            }
            if (b.f285051b.getActivity() != null && !b.f285051b.getActivity().isFinishing()) {
                if (!b.f285051b.getActivity().isDestroyed()) {
                    FragmentManager childFragmentManager = b.f285051b.getChildFragmentManager();
                    if (childFragmentManager != null) {
                        C102169bm bmVar = C102169bm.NONE;
                        int ordinal = b.f285054e.ordinal();
                        if (ordinal == 0) {
                            ((C59052c) ((C59052c) C102179j.f285050a.mo56225c()).mo56372aa(20560)).mo56386p("No screens eligible to be shown");
                        } else if (ordinal == 1) {
                            ((C59052c) ((C59052c) C102179j.f285050a.mo56224b()).mo56372aa(20558)).mo56386p("Creating Pending Page for Unified Opt In Discoverability fragment");
                            C0154a aVar = new C0154a(childFragmentManager);
                            C102130ac acVar = new C102130ac();
                            C68324h.m98669f(acVar);
                            aVar.mo689v(R.id.fedhot_vaa_controller_fragment, acVar, "FedHotEnrollmentScreenFragment");
                            aVar.mo509f();
                        } else if (ordinal != 2) {
                            ((C59052c) ((C59052c) C102179j.f285050a.mo56224b()).mo56372aa(20557)).mo56386p("Creating VAAv2 fragment");
                            C0154a aVar2 = new C0154a(childFragmentManager);
                            C102150av avVar = new C102150av();
                            C68324h.m98669f(avVar);
                            aVar2.mo689v(R.id.fedhot_vaa_controller_fragment, avVar, "VAAConsentCoordinatorFragment");
                            aVar2.mo509f();
                        } else {
                            ((C59052c) ((C59052c) C102179j.f285050a.mo56224b()).mo56372aa(20559)).mo56386p("Creating FedHot Discoverability fragment");
                            C0154a aVar3 = new C0154a(childFragmentManager);
                            C101781u uVar = b.f285052c;
                            C102156b bVar = new C102156b();
                            C68324h.m98669f(bVar);
                            C47243l.m84039a(bVar, uVar);
                            aVar3.mo689v(R.id.fedhot_vaa_controller_fragment, bVar, "FedHotEnrollmentScreenFragment");
                            aVar3.mo509f();
                        }
                    }
                    C47831fm.m85019n();
                    return inflate;
                }
            }
            ((C59052c) ((C59052c) C102179j.f285050a.mo56224b()).mo56372aa(20556)).mo56386p("The fedHotOrVaaParentFragment activity is/will be destroyed.");
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C102177h.m169224a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f285048d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C102177h.m169224a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f285048d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C102177h.m169224a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f285048d.mo51376d();
        try {
            super.onDetach();
            this.f285049e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C102177h.m169224a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f285048d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C102177h.m169224a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f285048d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C102177h.m169224a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f285048d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102177h.m169224a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f285048d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C102177h.m169224a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f285048d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f285048d.mo51381i();
        try {
            super.onStart();
            C102179j b = mo17754z();
            ((C59052c) ((C59052c) C102179j.f285050a.mo56224b()).mo56372aa(20568)).mo56386p("#onStart");
            if (b.f285054e == C102169bm.NONE) {
                C47393f.m84236g(new C101783w(), b.f285051b);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102177h.m169224a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f285048d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102177h.m169224a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f285048d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f285048d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f285048d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f285048d;
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
        C47515ab abVar = this.f285048d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f285048d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f285048d;
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
        this.f285048d.mo51381i();
        try {
            if (!this.f285049e) {
                super.onAttach(context);
                if (this.f285045a == null) {
                    Object jN = mo92935f().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C102178i) {
                        C102178i iVar = (C102178i) fragment;
                        C68225k.m98532d(iVar);
                        C101781u w = ((C74178nm) jN).mo70081w();
                        C90476a aVar = (C90476a) ((C74178nm) jN).f207130a.r.mo17428b();
                        C86124t tVar = (C86124t) ((C74178nm) jN).f207130a.a.f202006C.mo17428b();
                        ((C74178nm) jN).f207130a.b.mo67282at();
                        C74555u uVar = (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b();
                        C101497ae aeVar = (C101497ae) ((C74178nm) jN).f207109F.mo17428b();
                        String str = (String) ((C74178nm) jN).f207136c.f205595br.mo17428b();
                        this.f285045a = new C102179j(iVar, w, (C102170bn) ((C74178nm) jN).f207110G.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f285048d, this.f285047c));
                    } else {
                        String obj = C102179j.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f285048d;
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
                C102177h.m169224a(th, th2);
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
