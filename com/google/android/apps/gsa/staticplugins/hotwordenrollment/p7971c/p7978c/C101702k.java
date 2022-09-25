package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.features.av.ei;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.p5855h.p5861s.C74548ak;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7970b.C101501b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101770j;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101777q;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101779s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101782v;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101862c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j.C102170bn;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58894dd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.k */
/* compiled from: PG */
public final class C101702k extends C101663b implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C101706o f283783a;

    /* renamed from: b */
    private Context f283784b;

    /* renamed from: c */
    private final C2393x f283785c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f283786d = new C47515ab(this);

    /* renamed from: e */
    private boolean f283787e;

    @Deprecated
    public C101702k() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        Fragment fragment;
        C101706o j = mo17754z();
        FragmentManager childFragmentManager = j.f283798h.getChildFragmentManager();
        if (childFragmentManager != null) {
            fragment = childFragmentManager.f634a.mo670b(R.id.setup_content);
        } else {
            C59104x c = C101706o.f283791a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SLAEnrollmentCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(20378)).mo56386p("ChildFragmentManager of home fragment is null!");
            fragment = null;
        }
        if (fragment == null) {
            C59104x b = C101706o.f283791a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SLAEnrollmentCtrl");
            ((C59052c) ((C59052c) b).mo56372aa(20391)).mo56386p("Child fragment hasn't installed yet. Exit");
            if (!j.f283801k.isEmpty()) {
                j.f283797g.mo92568a(j.f283801k);
                ((C89859i) j.f283793c.mo27525b()).mo83702b(C89849ae.DELETE_UTTERANCES_ON_ENROLLMENT_BAILOUT);
            }
            j.mo92514a(0, (Intent) null);
            return;
        }
        C59104x b2 = C101706o.f283791a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "SLAEnrollmentCtrl");
        ((C59052c) ((C59052c) b2).mo56372aa(20388)).mo56389s("Child fragment: %s ", fragment);
        if (fragment instanceof C101501b) {
            C59104x b3 = C101706o.f283791a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "SLAEnrollmentCtrl");
            ((C59052c) ((C59052c) b3).mo56372aa(20390)).mo56389s("On back pressed for step %s", j.f283797g.f283875b.name());
            ((C101501b) fragment).mo92348a();
            return;
        }
        C59104x c2 = C101706o.f283791a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "SLAEnrollmentCtrl");
        ((C59052c) ((C59052c) c2).mo56372aa(20389)).mo56389s("Each fragment/screen has to implement this to log the exit events, etc, current Fragment %s ", fragment);
        throw new C58894dd("Each fragment/screen has to implement this to log the exit events, etc");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92471d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f283784b == null) {
            this.f283784b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f283784b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f283786d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f283785c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f283786d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C101706o mo17754z() {
        C101706o oVar = this.f283783a;
        if (oVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f283787e) {
            return oVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f283786d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101701j.m168282a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f283786d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101701j.m168282a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f283786d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101701j.m168282a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f283786d.mo51381i();
        try {
            super.onCreate(bundle);
            C101706o j = mo17754z();
            j.f283797g.mo92570c(j.f283799i);
            ((C92371d) j.f283792b.mo27525b()).mo87027h("EnrollmentActvtCallback", new C101705n(j));
            if (bundle != null && bundle.containsKey("key_current_screen")) {
                j.mo92516c(C101773m.values()[bundle.getInt("key_current_screen")], false);
            }
            if (bundle == null) {
                j.mo92515b();
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101701j.m168282a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f283786d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C101701j.m168282a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f283786d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            mo17754z();
            View inflate = layoutInflater.inflate(R.layout.enrollment_controller_fragment, viewGroup, false);
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C101701j.m168282a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f283786d.mo51374b();
        try {
            super.onDestroy();
            C101706o j = mo17754z();
            boolean z = false;
            if (j.f283798h.getActivity() != null && j.f283798h.getActivity().isChangingConfigurations()) {
                z = true;
            }
            ((C92371d) j.f283792b.mo27525b()).mo87033n("EnrollmentActvtCallback");
            j.f283797g.mo92571d(z);
            if (!z && !C74548ak.m120541b(j.f283794d.mo70888f().mo70866c())) {
                C101770j jVar = j.f283797g;
                if (jVar.f283876c == 2) {
                    ((C89859i) j.f283793c.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_VM_FAILED);
                } else {
                    C101773m mVar = jVar.f283875b;
                    if (mVar == C101773m.VOICE_MATCH_CONSENT_SCREEN || mVar == C101773m.FRESH_ENROLL_SCREEN || mVar == C101773m.CLOUD_ENROLL_SCREEN || (mVar == C101773m.PROGRESS_UPDATE_SCREEN && j.f283797g.f283876c != -1)) {
                        ((C89859i) j.f283793c.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_VM_EXIT);
                    }
                }
            }
            b.close();
            return;
        } catch (Throwable th) {
            C101701j.m168282a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f283786d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C101701j.m168282a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f283786d.mo51376d();
        try {
            super.onDetach();
            this.f283787e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C101701j.m168282a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f283786d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C101701j.m168282a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f283786d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101701j.m168282a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f283786d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101701j.m168282a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f283786d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C101701j.m168282a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f283786d.mo51381i();
        try {
            C101706o j = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            if (j.f283797g.f283875b != C101773m.NO_SCREEN) {
                bundle.putInt("key_current_screen", j.f283797g.f283875b.ordinal());
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101701j.m168282a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f283786d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101701j.m168282a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f283786d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101701j.m168282a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f283786d.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C101706o j = mo17754z();
            C47393f.m84233d(this, C101782v.class, new C101707p(j));
            C47393f.m84233d(this, C101777q.class, new C101708q(j));
            C47393f.m84233d(this, C101779s.class, new C101709r(j));
            C47393f.m84233d(this, C101783w.class, new C101710s(j));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101701j.m168282a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f283786d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f283786d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f283786d;
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
        C47515ab abVar = this.f283786d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f283786d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f283786d;
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
        this.f283786d.mo51381i();
        try {
            if (!this.f283787e) {
                super.onAttach(context);
                if (this.f283783a == null) {
                    Object jN = mo92470b().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C101702k) {
                        C101702k kVar = (C101702k) fragment;
                        C68225k.m98532d(kVar);
                        this.f283783a = new C101706o(kVar, ((C74178nm) jN).mo70078t(), C68219e.m98518a(((C74178nm) jN).f207130a.a.f202586Q), C68219e.m98518a(((C74178nm) jN).f207130a.a.f202806dy), (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b(), (C101860a) ((C74178nm) jN).f207135b.f205818a.mo17428b(), (C101862c) ((C74178nm) jN).f207135b.f205819b.mo17428b(), (C22871g) ((C74178nm) jN).f207130a.aT.mo17428b(), (C101770j) ((C74178nm) jN).f207136c.f205610cF.mo17428b(), new C101646aj(C68219e.m98518a(((C74178nm) jN).f207130a.a.f202806dy), (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b(), (C101860a) ((C74178nm) jN).f207135b.f205818a.mo17428b(), (C101862c) ((C74178nm) jN).f207135b.f205819b.mo17428b(), C68219e.m98518a(((C74178nm) jN).f207130a.a.f202586Q), (C86124t) ((C74178nm) jN).f207130a.a.f202006C.mo17428b(), (ei) ((C74178nm) jN).f207130a.b.f200245fu.mo17428b(), (C101636a) ((C74178nm) jN).f207136c.f205605cA.mo17428b(), (C101497ae) ((C74178nm) jN).f207109F.mo17428b(), (C102170bn) ((C74178nm) jN).f207110G.mo17428b()), (String) ((C74178nm) jN).f207136c.f205595br.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f283786d, this.f283785c));
                    } else {
                        String obj = C101706o.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f283786d;
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
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C101701j.m168282a(th2, th3);
            }
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
