package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7976d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.android.p265e.C5114a;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.binaries.satin.app.C73964bv;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.binaries.satin.app.asp;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83974p;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83975q;
import com.google.android.apps.gsa.opaonboarding.personalresults.C83952c;
import com.google.android.apps.gsa.opaonboarding.personalresults.PersonalResultsPage;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101495ac;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
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
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.d.b */
/* compiled from: PG */
public final class C101582b extends C101591k implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C101590j f283453a;

    /* renamed from: b */
    private Context f283454b;

    /* renamed from: c */
    private final C2393x f283455c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f283456d = new C47515ab(this);

    /* renamed from: e */
    private boolean f283457e;

    @Deprecated
    public C101582b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        C101590j b = mo17754z();
        C101763c cVar = new C101763c();
        cVar.mo92556b(0);
        C47393f.m84236g(cVar.mo92555a(), b.f283463b);
    }

    /* renamed from: b */
    public final C101590j mo17754z() {
        C101590j jVar = this.f283453a;
        if (jVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f283457e) {
            return jVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92409d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f283454b == null) {
            this.f283454b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f283454b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f283456d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f283455c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f283456d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f283456d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101581a.m167965a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f283456d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101581a.m167965a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f283456d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101581a.m167965a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f283456d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101581a.m167965a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f283456d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C101581a.m167965a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f283456d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C101590j b = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            PersonalResultsPage personalResultsPage = (PersonalResultsPage) layoutInflater.inflate(R.layout.hotword_enrollment_personal_results, (ViewGroup) null);
            personalResultsPage.f228691c.mo77360a().setOnClickListener(new C47591co(b.f283468g, "handle opt-in", new C101583c(b)));
            personalResultsPage.f228691c.mo77361b().setOnClickListener(new C47591co(b.f283468g, "handle opt-out", new C101584d(b)));
            if (C92408n.m151745g(b.f283464c.mo70891j(), b.f283465d.f284137d.get(), b.f283466e)) {
                String b2 = C5114a.m13988b(Locale.getDefault(), b.f283463b.getString(R.string.personal_results_unicorn_title), "GENDER", b.f283466e.mo87023d(), "PERSON", b.f283466e.mo87022c());
                HeaderLayout headerLayout = personalResultsPage.f228689a;
                C84018m.m133908c(headerLayout.f228718a, b2, TextView.BufferType.NORMAL, headerLayout);
                String b3 = C5114a.m13988b(Locale.getDefault(), b.f283463b.getString(R.string.voice_match_personal_result_subtitle_unicorn), "GENDER", b.f283466e.mo87023d(), "PERSON", b.f283466e.mo87022c());
                HeaderLayout headerLayout2 = personalResultsPage.f228689a;
                C84018m.m133908c(headerLayout2.f228719b, b3, TextView.BufferType.NORMAL, headerLayout2);
                personalResultsPage.f228690b.setText(Html.fromHtml(C5114a.m13988b(Locale.getDefault(), b.f283463b.getString(true != b.f283466e.mo87034o() ? R.string.personal_results_unicorn_explanation : R.string.personal_results_unicorn_explanation_dragonglass), "GENDER", b.f283466e.mo87023d(), "PERSON", b.f283466e.mo87022c())));
                personalResultsPage.mo77354c(2);
                personalResultsPage.f228691c.mo77360a().setText(R.string.personal_results_action_button_unicorn);
            } else {
                HeaderLayout headerLayout3 = personalResultsPage.f228689a;
                C84018m.m133908c(headerLayout3.f228718a, C84018m.m133906a(R.string.hotword_enrollment_personal_results_title, headerLayout3), TextView.BufferType.NORMAL, headerLayout3);
                HeaderLayout headerLayout4 = personalResultsPage.f228689a;
                C84018m.m133908c(headerLayout4.f228719b, C84018m.m133906a(R.string.voice_match_personal_result_subtitle, headerLayout4), TextView.BufferType.NORMAL, headerLayout4);
                personalResultsPage.f228690b.setText(true != b.f283466e.mo87034o() ? R.string.hotword_enrollment_personal_results_explanation_non_dragonglass : R.string.hotword_enrollment_personal_results_explanation_dragonglass);
                personalResultsPage.mo77354c(1);
                C83973o a = C83974p.m133833a(personalResultsPage.mo77352a(), personalResultsPage.mo77353b(), new C101589i());
                a.mo77402c();
                a.mo77403d();
                b.f283469h = a;
            }
            C47831fm.m85019n();
            return personalResultsPage;
        } catch (Throwable th) {
            C101581a.m167965a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f283456d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C101581a.m167965a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f283456d.mo51375c();
        try {
            super.onDestroyView();
            C101590j b = mo17754z();
            C83975q qVar = b.f283469h;
            if (qVar != null) {
                qVar.mo77406g();
                b.f283469h = null;
            }
            c.close();
            return;
        } catch (Throwable th) {
            C101581a.m167965a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f283456d.mo51376d();
        try {
            super.onDetach();
            this.f283457e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C101581a.m167965a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f283456d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C101581a.m167965a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f283456d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101581a.m167965a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f283456d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101581a.m167965a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f283456d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C101581a.m167965a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f283456d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f283456d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101581a.m167965a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f283456d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101581a.m167965a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f283456d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f283456d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f283456d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f283456d;
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
        C47515ab abVar = this.f283456d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f283456d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f283456d;
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
        this.f283456d.mo51381i();
        try {
            if (!this.f283457e) {
                super.onAttach(context);
                if (this.f283453a == null) {
                    Object jN = mo92413f().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C101582b) {
                        C101582b bVar = (C101582b) fragment;
                        C68225k.m98532d(bVar);
                        C73964bv bvVar = ((C74178nm) jN).f207136c;
                        asp asp = bvVar.f205604c.a;
                        C101590j jVar = r3;
                        C101590j jVar2 = new C101590j(bVar, (String) ((C74178nm) jN).f207136c.f205595br.mo17428b(), (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b(), (C101860a) ((C74178nm) jN).f207135b.f205818a.mo17428b(), (C86054o) ((C74178nm) jN).f207130a.a.f202324I.mo17428b(), (C92371d) ((C74178nm) jN).f207130a.a.f202806dy.mo17428b(), new C83952c(asp.f202833eY, bvVar.f205623cS, asp.f203709v, asp.f202806dy), (l) ((C74178nm) jN).f207130a.a.f202833eY.mo17428b(), (C22871g) ((C74178nm) jN).f207130a.aT.mo17428b(), C68219e.m98518a(((C74178nm) jN).f207130a.a.f202586Q), (C101495ac) ((C74178nm) jN).f207136c.f205625cU.mo17428b(), (C101592l) ((C74178nm) jN).f207136c.f205614cJ.mo17428b(), (C47770dh) ((C74178nm) jN).f207130a.a.f202593X.mo17428b());
                        this.f283453a = jVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f283456d, this.f283455c));
                    } else {
                        String obj = C101590j.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f283456d;
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
                C101581a.m167965a(th2, th3);
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
