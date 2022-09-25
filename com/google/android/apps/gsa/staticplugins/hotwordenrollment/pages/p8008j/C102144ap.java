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
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73778a;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102228q;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102229r;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102231t;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102232u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101765e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
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
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.ap */
/* compiled from: PG */
public final class C102144ap extends C102191v implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C102148at f284950a;

    /* renamed from: b */
    private Context f284951b;

    /* renamed from: c */
    private final C2393x f284952c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f284953d = new C47515ab(this);

    /* renamed from: e */
    private boolean f284954e;

    @Deprecated
    public C102144ap() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        C102148at j = mo17754z();
        j.f284963f.mo83702b(C89849ae.VOICE_MATCH_UNIFIED_ENROLLMENT_BACK_PRESSED);
        if (j.f284961d.isPresent()) {
            ((C19435g) j.f284961d.get()).mo24621c("FedAss.UnifiedDiscoverability.Status", 7);
            C101765e eVar = new C101765e();
            eVar.mo92562b(-1);
            eVar.f283865a = null;
            C47393f.m84236g(eVar.mo92561a(), j.f284959b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92906d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f284951b == null) {
            this.f284951b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f284951b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f284953d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f284952c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f284953d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C102148at mo17754z() {
        C102148at atVar = this.f284950a;
        if (atVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f284954e) {
            return atVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f284953d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102143ao.m169175a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f284953d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C102143ao.m169175a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f284953d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102143ao.m169175a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f284953d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102143ao.m169175a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f284953d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C102143ao.m169175a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f284953d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C102148at j = mo17754z();
            C73778a.m108339b(j.f284959b);
            View a = j.f284960c.mo93019a(layoutInflater);
            j.f284960c.mo93024f(R.layout.unified_opt_in_enrollment_screen_content);
            if (j.f284962e.f284949b) {
                C102230s sVar = j.f284960c;
                C102231t e = C102232u.m169449e();
                e.mo92352d(j.f284959b.getString(R.string.unified_opt_in_enrollment_title));
                e.mo92351c(j.f284959b.getString(R.string.unified_opt_in_enrollment_banner_subtitle));
                sVar.mo93026h(e.mo92349a());
                C102230s sVar2 = j.f284960c;
                C102228q f = C102229r.m169429f();
                f.mo92319b(1);
                C84010e e2 = C84011f.m133882e();
                e2.mo77375c(j.f284959b.getString(R.string.unified_opt_in_enrollment_I_understand_continue));
                ((C83958a) e2).f228734b = new C102147as(j);
                f.mo92320c(e2.mo77373a());
                f.mo92321d(C84011f.f228856a);
                sVar2.mo93025g(f.mo92318a());
                if (j.f284961d.isPresent()) {
                    ((C19435g) j.f284961d.get()).mo24621c("FedAss.UnifiedDiscoverability.Status", 1);
                }
            } else {
                C102230s sVar3 = j.f284960c;
                C102231t e3 = C102232u.m169449e();
                e3.mo92352d(j.f284959b.getString(R.string.unified_opt_in_enrollment_title));
                e3.mo92351c(j.f284959b.getString(R.string.unified_opt_in_enrollment_subtitle));
                sVar3.mo93026h(e3.mo92349a());
                C102230s sVar4 = j.f284960c;
                C102228q f2 = C102229r.m169429f();
                f2.mo92319b(6);
                C84010e e4 = C84011f.m133882e();
                e4.mo77375c(j.f284959b.getString(R.string.unified_opt_in_enrollment_start_saving_audio));
                ((C83958a) e4).f228734b = new C102146ar(j);
                f2.mo92320c(e4.mo77373a());
                C84010e e5 = C84011f.m133882e();
                e5.mo77375c(j.f284959b.getString(R.string.unified_opt_in_enrollment_not_now));
                ((C83958a) e5).f228734b = new C102145aq(j);
                e5.mo77374b(false);
                f2.mo92321d(e5.mo77373a());
                sVar4.mo93025g(f2.mo92318a());
                if (j.f284961d.isPresent()) {
                    ((C19435g) j.f284961d.get()).mo24621c("FedAss.UnifiedDiscoverability.Status", 2);
                }
            }
            j.f284963f.mo83702b(C89849ae.VOICE_MATCH_UNIFIED_ENROLLMENT_START);
            C47831fm.m85019n();
            return a;
        } catch (Throwable th) {
            C102143ao.m169175a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f284953d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C102143ao.m169175a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f284953d.mo51375c();
        try {
            super.onDestroyView();
            mo17754z();
            ((C59052c) ((C59052c) C102148at.f284958a.mo56224b()).mo56372aa(20593)).mo56386p("onDestroyView");
            c.close();
            return;
        } catch (Throwable th) {
            C102143ao.m169175a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f284953d.mo51376d();
        try {
            super.onDetach();
            this.f284954e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C102143ao.m169175a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f284953d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C102143ao.m169175a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f284953d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C102143ao.m169175a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f284953d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102143ao.m169175a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f284953d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C102143ao.m169175a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f284953d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f284953d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102143ao.m169175a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f284953d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102143ao.m169175a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f284953d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f284953d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f284953d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f284953d;
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
        C47515ab abVar = this.f284953d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f284953d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f284953d;
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
        this.f284953d.mo51381i();
        try {
            if (!this.f284954e) {
                super.onAttach(context);
                if (this.f284950a == null) {
                    Object jN = mo92941b().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C102144ap) {
                        C102144ap apVar = (C102144ap) fragment;
                        C68225k.m98532d(apVar);
                        Bundle a = ((C74178nm) jN).mo70044a();
                        C58838bb.m90869d(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C102142an anVar = (C102142an) ProtoParsers.m95522e(a, "TIKTOK_FRAGMENT_ARGUMENT", C102142an.f284946c, (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b());
                        C68225k.m98532d(anVar);
                        C90476a aVar = (C90476a) ((C74178nm) jN).f207130a.r.mo17428b();
                        C102230s u = ((C74178nm) jN).mo70079u();
                        Optional of = Optional.m71637of((C19435g) ((C74178nm) jN).f207130a.aG.mo17428b());
                        ((C74178nm) jN).mo70082x();
                        this.f284950a = new C102148at(apVar, anVar, u, of, (C89859i) ((C74178nm) jN).f207130a.a.f202586Q.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f284953d, this.f284952c));
                    } else {
                        String obj = C102148at.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f284953d;
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
                C102143ao.m169175a(th, th2);
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
