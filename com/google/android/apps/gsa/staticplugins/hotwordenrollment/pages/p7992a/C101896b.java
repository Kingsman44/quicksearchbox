package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7992a;

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
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.C90548ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92410p;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.microdetection.p7309b.C92529a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102228q;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102229r;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102231t;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102232u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.C101718a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b.C101634x;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101770j;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7988k.C101873d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.setupdesign.GlifLoadingLayout;
import com.google.android.setupdesign.p3555d.C45301i;
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
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.a.b */
/* compiled from: PG */
public final class C101896b extends C101907m implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C101905k f284225a;

    /* renamed from: b */
    private Context f284226b;

    /* renamed from: c */
    private final C2393x f284227c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f284228d = new C47515ab(this);

    /* renamed from: e */
    private boolean f284229e;

    @Deprecated
    public C101896b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        C101905k b = mo17754z();
        C101763c cVar = new C101763c();
        cVar.mo92556b(0);
        C47393f.m84236g(cVar.mo92555a(), b.f284240b);
    }

    /* renamed from: b */
    public final C101905k mo17754z() {
        C101905k kVar = this.f284225a;
        if (kVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f284229e) {
            return kVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92678d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f284226b == null) {
            this.f284226b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f284226b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f284228d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f284227c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f284228d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f284228d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101895a.m168588a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f284228d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101895a.m168588a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f284228d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101895a.m168588a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        C60870cx cxVar;
        this.f284228d.mo51381i();
        try {
            super.onCreate(bundle);
            C101905k b = mo17754z();
            if (!b.f284241c.mo70891j()) {
                WeakHashMap weakHashMap = C47831fm.f123851a;
                List list = b.f284242d.f284135b;
                if (list == null || list.isEmpty()) {
                    throw new AssertionError("Cloud enrollment should not be called!");
                }
                b.f284243e.mo83702b(C89849ae.VOICE_MATCH_CLOUD_ENROLLMENT_START);
                if (b.f284241c.mo70887e().mo70853a().mo70880d()) {
                    cxVar = C60866ct.f164955a;
                } else if (b.f284245g.mo83850M()) {
                    cxVar = b.f284250l.mo87050a((List) Collection.EL.stream(list).map(C101899e.f284232a).collect(Collectors.toCollection(C101900f.f284233a)), 1);
                } else {
                    cxVar = C2169h.m6027a(new C101903i(b, list));
                }
                C90875ai.m148465b(C101873d.m168557b(new C101901g(b)), cxVar, b.f284249k, "runEnrollment").mo85223a(C101873d.m168556a(new C101902h(b)));
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101895a.m168588a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f284228d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C101895a.m168588a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f284228d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C101905k b = mo17754z();
            View b2 = b.f284252n.mo93020b(layoutInflater, R.layout.hotword_enrollment_waiting_screen, R.layout.hotword_enrollment_waiting_screen_glif, R.layout.hotword_enrollment_waiting_screen_glif_no_partner_theme, (ViewGroup) null, 0, 0);
            ac a = b.f284241c.mo70886d().mo70847a();
            if (a.d() == 2 && !a.equals(ac.c)) {
                GlifLoadingLayout glifLoadingLayout = (GlifLoadingLayout) b2.findViewById(R.id.glif_layout);
                glifLoadingLayout.mo49203x();
                ((C45301i) glifLoadingLayout.mo49129j(C45301i.class)).mo49235c(true);
            }
            C102230s sVar = b.f284252n;
            C102231t e = C102232u.m169449e();
            e.mo92352d(b.f284240b.getString(R.string.hotword_enrollment_enrollment_waiting_screen_header_title));
            sVar.mo93026h(e.mo92349a());
            C102230s sVar2 = b.f284252n;
            C102228q f = C102229r.m169429f();
            f.mo92319b(0);
            f.mo92320c(C84011f.m133882e().mo77373a());
            f.mo92321d(C84011f.m133882e().mo77373a());
            sVar2.mo93025g(f.mo92318a());
            C47831fm.m85019n();
            return b2;
        } catch (Throwable th) {
            C101895a.m168588a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f284228d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C101895a.m168588a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f284228d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C101895a.m168588a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f284228d.mo51376d();
        try {
            super.onDetach();
            this.f284229e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C101895a.m168588a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f284228d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C101895a.m168588a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f284228d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101895a.m168588a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f284228d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101895a.m168588a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f284228d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C101895a.m168588a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f284228d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f284228d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101895a.m168588a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f284228d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101895a.m168588a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f284228d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f284228d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f284228d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f284228d;
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
        C47515ab abVar = this.f284228d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f284228d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f284228d;
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
        this.f284228d.mo51381i();
        try {
            if (!this.f284229e) {
                super.onAttach(context);
                if (this.f284225a == null) {
                    Object jN = mo92681f().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C101896b) {
                        C101896b bVar = (C101896b) fragment;
                        C68225k.m98532d(bVar);
                        C101905k kVar = r3;
                        C101905k kVar2 = new C101905k(bVar, ((C74178nm) jN).mo70078t(), (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b(), (C101860a) ((C74178nm) jN).f207135b.f205818a.mo17428b(), ((C74178nm) jN).mo70079u(), (C89859i) ((C74178nm) jN).f207130a.a.f202586Q.mo17428b(), (C92529a) ((C74178nm) jN).f207130a.b.f200055cP.mo17428b(), (C89994f) ((C74178nm) jN).f207130a.a.f202651bB.mo17428b(), (C92486a) ((C74178nm) jN).f207130a.a.f202803dv.mo17428b(), (C101770j) ((C74178nm) jN).f207136c.f205610cF.mo17428b(), (C101634x) ((C74178nm) jN).f207136c.f205626cV.mo17428b(), (C22871g) ((C74178nm) jN).f207130a.aT.mo17428b(), (C90548ak) ((C74178nm) jN).f207130a.a.f202801dt.mo17428b(), (C92410p) ((C74178nm) jN).f207130a.b.f200466kC.mo17428b(), (C101497ae) ((C74178nm) jN).f207109F.mo17428b(), ((C74178nm) jN).f207136c.mo69070W(), (String) ((C74178nm) jN).f207136c.f205595br.mo17428b(), (C86124t) ((C74178nm) jN).f207130a.a.f202006C.mo17428b(), (C101718a) ((C74178nm) jN).f207130a.d.f201702eB.mo17428b());
                        this.f284225a = kVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f284228d, this.f284227c));
                    } else {
                        String obj = C101905k.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f284228d;
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
                C101895a.m168588a(th2, th3);
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
