package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8005g;

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
import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84031z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83974p;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83975q;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92362c;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102228q;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102229r;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102231t;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102232u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
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
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.g.b */
/* compiled from: PG */
public final class C102034b extends C102043k implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C102042j f284677a;

    /* renamed from: b */
    private Context f284678b;

    /* renamed from: c */
    private final C2393x f284679c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f284680d = new C47515ab(this);

    /* renamed from: e */
    private boolean f284681e;

    @Deprecated
    public C102034b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        C102042j b = mo17754z();
        C101763c cVar = new C101763c();
        cVar.mo92556b(0);
        C47393f.m84236g(cVar.mo92555a(), b.f284692e);
    }

    /* renamed from: b */
    public final C102042j mo17754z() {
        C102042j jVar = this.f284677a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f284681e) {
            return jVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92807d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f284678b == null) {
            this.f284678b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f284678b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f284680d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f284679c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f284680d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f284680d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102033a.m168938a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f284680d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C102033a.m168938a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f284680d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102033a.m168938a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f284680d.mo51381i();
        try {
            super.onCreate(bundle);
            C102042j b = mo17754z();
            if (b.f284690c.f284134a.get()) {
                b.f284693f.mo87027h("EnrollCallbackForHomeCloudEnroll", new C102039g(b, C47816ey.m84988b()));
                b.f284699l.mo92368b();
                b.f284698k.mo83702b(C89849ae.VOICE_MATCH_CLOUD_ENROLLMENT_START);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102033a.m168938a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f284680d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C102033a.m168938a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f284680d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C102042j b = mo17754z();
            View b2 = b.f284700m.mo93020b(layoutInflater, R.layout.hotword_enrollment_progress_update_screen, R.layout.hotword_enrollment_progress_update_screen_glif, R.layout.hotword_enrollment_progress_update_screen_glif_no_partner_theme, (ViewGroup) null, 0, 0);
            ac a = b.f284689b.mo70886d().mo70847a();
            C92362c cVar = C92362c.LINK_ACCOUNT;
            if (a.d() - 1 != 1) {
                LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) b2;
                C84031z zVar = legacyOpaStandardPage.f228724c;
                C83973o a2 = C83974p.m133833a(zVar.f228892o, zVar.f228888k, new C102041i());
                a2.mo77402c();
                a2.mo77403d();
                legacyOpaStandardPage.mo77366a();
                b.f284703p = a2;
                legacyOpaStandardPage.f228724c.f228888k.setMinimumHeight(b.f284692e.getResources().getDimensionPixelSize(R.dimen.hotword_enrollment_progress_update_animation_min_height));
            } else if (!a.equals(ac.c)) {
                GlifLoadingLayout glifLoadingLayout = (GlifLoadingLayout) b2.findViewById(R.id.glif_layout);
                glifLoadingLayout.mo49203x();
                ((C45301i) glifLoadingLayout.mo49129j(C45301i.class)).mo49235c(true);
            }
            C102230s sVar = b.f284700m;
            C102231t e = C102232u.m169449e();
            e.mo92352d(b.f284692e.getString(R.string.hotword_enrollment_enrollment_waiting_screen_header_title));
            sVar.mo93026h(e.mo92349a());
            C102230s sVar2 = b.f284700m;
            C102228q f = C102229r.m169429f();
            f.mo92319b(0);
            f.mo92320c(C84011f.m133882e().mo77373a());
            f.mo92321d(C84011f.m133882e().mo77373a());
            sVar2.mo93025g(f.mo92318a());
            if (b.f284696i.mo85090c()) {
                C90743b.m148214a(b.f284700m.mo93022d(), 500);
            }
            if (b.f284695h.mo79746e(C90014bt.f247483hx)) {
                b.f284698k.mo83702b(C89849ae.VOICE_MATCH_MULTI_DEVICE_ENROLLMENT_TIMER_START);
                C102045m mVar = (C102045m) b.f284694g.mo27525b();
                C58976aa aaVar = C58975e.f156826a;
                mVar.f284712c = mVar.f284711b.mo85137b(new C102044l(mVar), TimeUnit.SECONDS.toMillis(mVar.f284714e.mo79743a(C90014bt.f247481hv)));
            }
            C47831fm.m85019n();
            return b2;
        } catch (Throwable th) {
            C102033a.m168938a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f284680d.mo51374b();
        try {
            super.onDestroy();
            mo17754z().f284693f.mo87033n("EnrollCallbackForHomeCloudEnroll");
            b.close();
            return;
        } catch (Throwable th) {
            C102033a.m168938a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f284680d.mo51375c();
        try {
            super.onDestroyView();
            C102042j b = mo17754z();
            C83975q qVar = b.f284703p;
            if (qVar != null) {
                qVar.mo77406g();
            }
            b.f284703p = null;
            c.close();
            return;
        } catch (Throwable th) {
            C102033a.m168938a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f284680d.mo51376d();
        try {
            super.onDetach();
            this.f284681e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C102033a.m168938a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f284680d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C102033a.m168938a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f284680d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C102033a.m168938a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f284680d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102033a.m168938a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f284680d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C102033a.m168938a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f284680d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f284680d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102033a.m168938a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8005g.C102045m) r0.f284694g.mo27525b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStop() {
        /*
            r3 = this;
            com.google.apps.tiktok.tracing.ab r0 = r3.f284680d
            r0.mo51381i()
            super.onStop()     // Catch:{ all -> 0x002f }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.g.j r0 = r3.mo17754z()     // Catch:{ all -> 0x002f }
            com.google.android.apps.gsa.shared.m.c r1 = r0.f284695h     // Catch:{ all -> 0x002f }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247483hx     // Catch:{ all -> 0x002f }
            boolean r1 = r1.mo79746e(r2)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002b
            dagger.a r0 = r0.f284694g     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x002f }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.g.m r0 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8005g.C102045m) r0     // Catch:{ all -> 0x002f }
            com.google.common.util.concurrent.cx r1 = r0.f284712c     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002b
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x002f }
            r2 = 1
            r1.cancel(r2)     // Catch:{ all -> 0x002f }
            r1 = 0
            r0.f284712c = r1     // Catch:{ all -> 0x002f }
        L_0x002b:
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return
        L_0x002f:
            r0 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r1 = move-exception
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8005g.C102033a.m168938a(r0, r1)
        L_0x0038:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8005g.C102034b.onStop():void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f284680d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f284680d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f284680d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f284680d;
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
        C47515ab abVar = this.f284680d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f284680d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f284680d;
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

    /* JADX WARNING: type inference failed for: r14v0, types: [com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.j, java.lang.Object] */
    public final void onAttach(Context context) {
        this.f284680d.mo51381i();
        try {
            if (!this.f284681e) {
                super.onAttach(context);
                if (this.f284677a == null) {
                    Object jN = mo92810f().mo17653jN();
                    String str = (String) ((C74178nm) jN).f207136c.f205595br.mo17428b();
                    C74555u uVar = (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b();
                    C101860a aVar = (C101860a) ((C74178nm) jN).f207135b.f205818a.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C102034b) {
                        C102034b bVar = (C102034b) fragment;
                        C68225k.m98532d(bVar);
                        this.f284677a = new C102042j(str, uVar, aVar, bVar, (C92371d) ((C74178nm) jN).f207130a.a.f202806dy.mo17428b(), C68219e.m98518a(((C74178nm) jN).f207114K), (C90021c) ((C74178nm) jN).f207130a.a.f202006C.mo17428b(), (C90743b) ((C74178nm) jN).f207130a.gx.mo17428b(), (C22871g) ((C74178nm) jN).f207130a.aT.mo17428b(), ((C74178nm) jN).f207136c.mo69208cb(), (C89859i) ((C74178nm) jN).f207130a.a.f202586Q.mo17428b(), (C101497ae) ((C74178nm) jN).f207109F.mo17428b(), ((C74178nm) jN).f207136c.mo69070W(), ((C74178nm) jN).mo70079u());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f284680d, this.f284679c));
                    } else {
                        String obj = C102042j.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f284680d;
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
                C102033a.m168938a(th2, th3);
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
