package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

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
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.d;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.binaries.satin.app.C73964bv;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.binaries.satin.app.asp;
import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.h.s.s;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.speech.p7271d.C92233j;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.C101503a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.C101610b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101770j;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g.C101806a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g.C101809ab;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g.C101855w;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g.p7984a.C101807a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.googlequicksearchbox.R;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import dagger.C68214a;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.n */
/* compiled from: PG */
public final class C101892n extends C102241x implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C101894p f284203a;

    /* renamed from: b */
    private Context f284204b;

    /* renamed from: c */
    private final C2393x f284205c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f284206d = new C47515ab(this);

    /* renamed from: e */
    private boolean f284207e;

    @Deprecated
    public C101892n() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C101894p mo17754z() {
        C101894p pVar = this.f284203a;
        if (pVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f284207e) {
            return pVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C68324h mo92675b() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f284204b == null) {
            this.f284204b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f284204b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f284206d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f284205c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f284206d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f284206d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101891m.m168577a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f284206d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101891m.m168577a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f284206d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101891m.m168577a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f284206d.mo51381i();
        try {
            super.onCreate(bundle);
            mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101891m.m168577a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f284206d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C101891m.m168577a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        this.f284206d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C101894p a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.hotword_enrollment_fragment, viewGroup, false);
            ac a2 = a.f284217h.mo70886d().mo70847a();
            if (a2.d() == 2) {
                if (a2.c()) {
                    a.f284224o = layoutInflater.inflate(R.layout.hotword_enrollment_fragment_progress_glif, viewGroup, false);
                } else {
                    a.f284224o = layoutInflater.inflate(R.layout.hotword_enrollment_fragment_progress_glif_no_partner, viewGroup, false);
                }
                if (!a2.equals(ac.c)) {
                    GlifLoadingLayout glifLoadingLayout = (GlifLoadingLayout) a.f284224o;
                    glifLoadingLayout.mo49203x();
                    ((C45301i) glifLoadingLayout.mo49129j(C45301i.class)).mo49235c(true);
                }
            } else {
                a.f284224o = layoutInflater.inflate(R.layout.hotword_enrollment_fragment_progress, viewGroup, false);
            }
            ((FrameLayout) inflate).addView(a.f284224o);
            if (a.f284217h.mo70891j()) {
                str = ((C92371d) a.f284214e.mo27525b()).mo87021b();
            } else {
                str = a.f284213d.mo83863Z();
            }
            a.f284218i.f284139f = str;
            a.f284220k.mo83702b(C89849ae.VOICE_MATCH_ENROLLMENT_WITH_MODEL_DOWNLOAD_START);
            if (!a.f284217h.mo70891j()) {
                C89849ae aeVar = C89849ae.VOICE_MATCH_PHONE_ENROLLMENT_START;
                C9439b a3 = a.f284217h.mo70883a();
                boolean u = a.f284222m.u();
                C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
                ajVar.copyOnWrite();
                C59687cb cbVar = (C59687cb) ajVar.instance;
                str.getClass();
                cbVar.f160115b |= 4096;
                cbVar.f160048M = str;
                ajVar.copyOnWrite();
                C59687cb cbVar2 = (C59687cb) ajVar.instance;
                cbVar2.f160049N = a3.f32835aq;
                cbVar2.f160115b |= 8192;
                ajVar.copyOnWrite();
                C59687cb cbVar3 = (C59687cb) ajVar.instance;
                cbVar3.f160115b |= 16384;
                cbVar3.f160050O = u;
                C89859i iVar = a.f284220k;
                C89856f fVar = new C89856f();
                fVar.f246201a = aeVar;
                fVar.f246203c = (C59687cb) ajVar.build();
                iVar.mo74236a(fVar.mo83699a());
            }
            C101893o oVar = new C101893o(a, bundle);
            C101806a aVar = new C101806a();
            aVar.mo92586b(a.f284219j);
            aVar.mo92589e(a.f284224o);
            aVar.mo92588d(a.f284217h.mo70891j());
            aVar.f283949a = oVar;
            aVar.mo92590f(a.f284223n);
            aVar.f283950b = a.f284218i.mo92638c();
            aVar.mo92587c(d.a(C58833ax.m90833j(a.f284217h.mo70889g())));
            a.f284212c.mo92593a(bundle, aVar.mo92585a());
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C101891m.m168577a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f284206d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C101891m.m168577a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f284206d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C101891m.m168577a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f284206d.mo51376d();
        try {
            super.onDetach();
            this.f284207e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C101891m.m168577a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f284206d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C101891m.m168577a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f284206d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101891m.m168577a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f284206d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101891m.m168577a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f284206d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C101891m.m168577a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f284206d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f284206d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101891m.m168577a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f284206d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101891m.m168577a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f284206d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f284206d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f284206d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f284206d;
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
        C47515ab abVar = this.f284206d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f284206d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f284206d;
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
        C101892n nVar;
        this.f284206d.mo51381i();
        try {
            if (!this.f284207e) {
                super.onAttach(context);
                if (this.f284203a == null) {
                    try {
                        Object jN = mo93038d().mo17653jN();
                        Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                        if (fragment instanceof C101892n) {
                            C101892n nVar2 = (C101892n) fragment;
                            C68225k.m98532d(nVar2);
                            String str = (String) ((C74178nm) jN).f207136c.f205595br.mo17428b();
                            C73964bv bvVar = ((C74178nm) jN).f207136c;
                            C101855w wVar = new C101855w((C86054o) bvVar.f205604c.a.f202324I.mo17428b(), (Activity) bvVar.f205710e.mo17428b(), bvVar.mo69065R(), bvVar.mo69066S(), (C92233j) bvVar.f205604c.b.f200728p.mo17428b(), bvVar.mo69069V(), bvVar.mo69067T(), bvVar.mo69068U(), (C86124t) bvVar.f205604c.a.f202006C.mo17428b(), (C89994f) bvVar.f205604c.a.f202651bB.mo17428b(), (C9325m) bvVar.f205604c.br.mo17428b(), (C101807a) bvVar.f205608cD.mo17428b(), (C89859i) bvVar.f205604c.a.f202586Q.mo17428b(), (bm) bvVar.f205604c.a.f202218G.mo17428b());
                            C73964bv bvVar2 = ((C74178nm) jN).f207136c;
                            C101809ab abVar = new C101809ab((C86054o) bvVar2.f205604c.a.f202324I.mo17428b(), (Activity) bvVar2.f205710e.mo17428b(), bvVar2.mo69065R(), (C92233j) bvVar2.f205604c.b.f200728p.mo17428b(), bvVar2.mo69069V(), bvVar2.mo69067T(), (C9325m) bvVar2.f205604c.br.mo17428b(), (C89859i) bvVar2.f205604c.a.f202586Q.mo17428b(), (C86124t) bvVar2.f205604c.a.f202006C.mo17428b(), (bm) bvVar2.f205604c.a.f202218G.mo17428b());
                            C89994f fVar = (C89994f) ((C74178nm) jN).f207130a.a.f202651bB.mo17428b();
                            C68214a a = C68219e.m98518a(((C74178nm) jN).f207130a.a.f202806dy);
                            C101770j jVar = (C101770j) ((C74178nm) jN).f207136c.f205610cF.mo17428b();
                            C74555u uVar = (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b();
                            C101860a aVar = (C101860a) ((C74178nm) jN).f207135b.f205818a.mo17428b();
                            C89859i iVar = (C89859i) ((C74178nm) jN).f207130a.a.f202586Q.mo17428b();
                            C73964bv bvVar3 = ((C74178nm) jN).f207136c;
                            C69464a aVar2 = bvVar3.f205594bq;
                            asp asp = ((C74178nm) jN).f207130a.a;
                            C89859i iVar2 = iVar;
                            C101860a aVar3 = aVar;
                            C101874l lVar = new C101874l(aVar2, asp.f202651bB, asp.f203126k, asp.f202218G, asp.f202006C, bvVar3.f205609cE);
                            C101610b bVar = (C101610b) ((C74178nm) jN).f207136c.f205606cB.mo17428b();
                            C73964bv bvVar4 = ((C74178nm) jN).f207136c;
                            C74555u uVar2 = (C74555u) bvVar4.f205594bq.mo17428b();
                            s sVar = s.b;
                            C69464a aVar4 = bvVar4.f205611cG;
                            C69464a aVar5 = aVar4;
                            C69464a aVar6 = (C69464a) C58495hd.m89902p(sVar, aVar5, s.a, bvVar4.f205612cH, s.c, bvVar4.f205613cI).get(uVar2.mo70884b());
                            C58838bb.m90867b(aVar6, "No DomainFragment bound for domain %s", uVar2.mo70884b());
                            C101503a aVar7 = (C101503a) aVar6.mo17428b();
                            aVar7.getClass();
                            C101894p pVar = new C101894p(nVar2, str, wVar, abVar, fVar, a, jVar, uVar, aVar3, iVar2, lVar, bVar, aVar7, (bm) ((C74178nm) jN).f207130a.a.f202218G.mo17428b(), (C90584f) ((C74178nm) jN).f207136c.f205609cE.mo17428b());
                            nVar = this;
                            nVar.f284203a = pVar;
                            super.getLifecycle().mo5790b(new TracedFragmentLifecycle(nVar.f284206d, nVar.f284205c));
                        } else {
                            String obj = C101894p.class.toString();
                            String valueOf = String.valueOf(fragment.getClass());
                            throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        C47831fm.m85019n();
                        throw th2;
                    }
                } else {
                    nVar = this;
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = nVar.f284206d;
                    if (abVar2.f123354b == null) {
                        abVar2.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            C47831fm.m85019n();
            throw th22;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
