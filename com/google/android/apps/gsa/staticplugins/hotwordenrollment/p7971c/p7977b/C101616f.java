package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import com.google.android.apps.gsa.binaries.satin.app.C73964bv;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.asp;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7970b.C101501b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101770j;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101777q;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101779s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101782v;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
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
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.f */
/* compiled from: PG */
public final class C101616f extends C101613c implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C101619i f283551a;

    /* renamed from: b */
    private Context f283552b;

    /* renamed from: c */
    private final C2393x f283553c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f283554d = new C47515ab(this);

    /* renamed from: e */
    private boolean f283555e;

    @Deprecated
    public C101616f() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        Fragment fragment;
        C101619i j = mo17754z();
        FragmentManager childFragmentManager = j.f283562e.getChildFragmentManager();
        if (childFragmentManager != null) {
            fragment = childFragmentManager.f634a.mo670b(R.id.setup_content);
        } else {
            C59104x c = C101619i.f283558a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PhEnrollmentCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(20355)).mo56386p("ChildFragmentManager of phone fragment is null!");
            fragment = null;
        }
        if (fragment == null) {
            C59104x b = C101619i.f283558a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PhEnrollmentCtrl");
            ((C59052c) ((C59052c) b).mo56372aa(20361)).mo56386p("Child fragment hasn't installed yet. Exit");
            j.mo92442a(0);
            return;
        }
        C59104x b2 = C101619i.f283558a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "PhEnrollmentCtrl");
        ((C59052c) ((C59052c) b2).mo56372aa(20359)).mo56389s("Child fragment: %s", fragment);
        if (fragment instanceof C101501b) {
            ((C101501b) fragment).mo92348a();
            return;
        }
        C59104x c2 = C101619i.f283558a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "PhEnrollmentCtrl");
        ((C59052c) ((C59052c) c2).mo56372aa(20360)).mo56389s("Each fragment/screen has to implement this to log the exit events, etc, current Fragment %s ", fragment);
        throw new C58894dd("Each fragment/screen has to implement this to log the exit events, etc");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92439d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f283552b == null) {
            this.f283552b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f283552b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f283554d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f283553c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f283554d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C101619i mo17754z() {
        C101619i iVar = this.f283551a;
        if (iVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f283555e) {
            return iVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f283554d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101615e.m168066a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f283554d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101615e.m168066a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f283554d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101615e.m168066a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f283554d.mo51381i();
        try {
            super.onCreate(bundle);
            C101619i j = mo17754z();
            j.f283561d.mo92570c(j.f283563f);
            if (bundle != null && bundle.containsKey("key_current_screen")) {
                j.mo92445d(C101773m.values()[bundle.getInt("key_current_screen")], false);
            }
            if (bundle == null) {
                j.mo92444c();
            }
            j.f283566i = j.f283559b.mo83841D(j.f283565h);
            SharedPreferences.Editor edit = j.f283560c.edit();
            j.f283560c.edit().putInt("hands_free_hotword_retraining_notification_state", 1).apply();
            edit.remove("hands_free_hotword_retraining_notification_source").apply();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101615e.m168066a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f283554d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C101615e.m168066a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f283554d.mo51381i();
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
            C101615e.m168066a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f283554d.mo51374b();
        try {
            super.onDestroy();
            C101619i j = mo17754z();
            boolean z = false;
            if (j.f283562e.getActivity() != null && j.f283562e.getActivity().isChangingConfigurations()) {
                z = true;
            }
            j.f283561d.mo92571d(z);
            b.close();
            return;
        } catch (Throwable th) {
            C101615e.m168066a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f283554d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C101615e.m168066a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f283554d.mo51376d();
        try {
            super.onDetach();
            this.f283555e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C101615e.m168066a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f283554d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C101615e.m168066a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f283554d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101615e.m168066a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f283554d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101615e.m168066a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f283554d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C101615e.m168066a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f283554d.mo51381i();
        try {
            C101619i j = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            if (j.f283561d.f283875b != C101773m.NO_SCREEN) {
                bundle.putInt("key_current_screen", j.f283561d.f283875b.ordinal());
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101615e.m168066a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f283554d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101615e.m168066a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f283554d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101615e.m168066a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f283554d.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C101619i j = mo17754z();
            C47393f.m84233d(this, C101782v.class, new C101620j(j));
            C47393f.m84233d(this, C101777q.class, new C101621k(j));
            C47393f.m84233d(this, C101779s.class, new C101622l(j));
            C47393f.m84233d(this, C101783w.class, new C101623m(j));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101615e.m168066a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f283554d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f283554d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f283554d;
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
        C47515ab abVar = this.f283554d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f283554d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f283554d;
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
        this.f283554d.mo51381i();
        try {
            if (!this.f283555e) {
                super.onAttach(context);
                if (this.f283551a == null) {
                    Object jN = mo92438b().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C101616f) {
                        C101616f fVar = (C101616f) fragment;
                        C68225k.m98532d(fVar);
                        C92380d t = ((C74178nm) jN).mo70078t();
                        aqy aqy = ((C74178nm) jN).f207130a;
                        asp asp = aqy.a;
                        C69464a aVar = asp.f202006C;
                        C69464a aVar2 = asp.f202651bB;
                        C69464a aVar3 = ((C74178nm) jN).f207135b.f205818a;
                        C69464a aVar4 = aqy.r;
                        C69464a aVar5 = ((C74178nm) jN).f207110G;
                        C69464a aVar6 = ((C74178nm) jN).f207109F;
                        C73964bv bvVar = ((C74178nm) jN).f207136c;
                        this.f283551a = new C101619i(fVar, t, new C101614d((C89994f) ((C74178nm) jN).f207130a.a.f202651bB.mo17428b(), (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b(), new C101629s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, bvVar.f205606cB, bvVar.f205609cE), (C86124t) ((C74178nm) jN).f207130a.a.f202006C.mo17428b(), (String) ((C74178nm) jN).f207136c.f205595br.mo17428b()), (C89994f) ((C74178nm) jN).f207130a.a.f202651bB.mo17428b(), (SharedPreferences) ((C74178nm) jN).f207130a.a.f203126k.mo17428b(), C68219e.m98518a(((C74178nm) jN).f207130a.a.f202803dv), C68219e.m98518a(((C74178nm) jN).f207130a.a.f202586Q), (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b(), (C22871g) ((C74178nm) jN).f207130a.aT.mo17428b(), (C101770j) ((C74178nm) jN).f207136c.f205610cF.mo17428b(), (String) ((C74178nm) jN).f207136c.f205595br.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f283554d, this.f283553c));
                    } else {
                        String obj = C101619i.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f283554d;
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
                C101615e.m168066a(th2, th3);
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
