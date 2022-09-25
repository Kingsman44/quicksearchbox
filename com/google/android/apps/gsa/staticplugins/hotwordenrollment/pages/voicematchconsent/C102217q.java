package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent;

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
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.assistant.settings.shared.o;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.binaries.satin.app.C73964bv;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.asp;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83983ah;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83974p;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83975q;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.speech.hotword.p7282a.C92349f;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102228q;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102229r;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102231t;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102232u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.C101610b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b.C101547aa;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b.C101560n;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b.C101568v;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101781u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7990a.C101883i;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b.C101890g;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.material.aspectratio.FixedAspectRatioFrameLayout;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.setupdesign.GlifLayout;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
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
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import dagger.C68214a;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.q */
/* compiled from: PG */
public final class C102217q extends C102205e implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C102226z f285219a;

    /* renamed from: b */
    private Context f285220b;

    /* renamed from: c */
    private final C2393x f285221c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f285222d = new C47515ab(this);

    /* renamed from: e */
    private boolean f285223e;

    @Deprecated
    public C102217q() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        C102226z j = mo17754z();
        C101763c cVar = new C101763c();
        cVar.mo92556b(0);
        C47393f.m84236g(cVar.mo92555a(), j.f285238b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92997d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f285220b == null) {
            this.f285220b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f285220b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f285222d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f285221c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f285222d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C102226z mo17754z() {
        C102226z zVar = this.f285219a;
        if (zVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f285223e) {
            return zVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f285222d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102216p.m169401a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f285222d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C102216p.m169401a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f285222d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102216p.m169401a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f285222d.mo51381i();
        try {
            super.onCreate(bundle);
            C102226z j = mo17754z();
            j.f285250n.mo50429i(j.f285249m);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102216p.m169401a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f285222d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C102216p.m169401a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f285222d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C102226z j = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            View b = j.f285251o.mo93020b(layoutInflater, R.layout.hotword_enrollment_voice_match_consent_opa, R.layout.hotword_enrollment_voice_match_consent_glif, R.layout.hotword_enrollment_voice_match_consent_glif_no_partner_theme, (ViewGroup) null, 0, 0);
            if (j.f285242f.mo92981s()) {
                j.mo93013e(C89849ae.VOICE_MATCH_TISID_INTRO_CONSENT_SCREEN_START);
            }
            if (j.f285242f.mo92982t()) {
                j.mo93013e(C89849ae.VOICE_MATCH_TISID_NGA_CONSENT_SCREEN_START);
            }
            if (j.f285242f.mo92987x()) {
                b.findViewById(R.id.voice_match_consent_animation_constraint_layout).setVisibility(0);
                FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = (FixedAspectRatioFrameLayout) b.findViewById(R.id.voice_match_consent_animation_container);
                fixedAspectRatioFrameLayout.f77355a = 1.3333334f;
                fixedAspectRatioFrameLayout.invalidate();
                C83973o a = C83974p.m133833a(fixedAspectRatioFrameLayout, (LottieAnimationView) b.findViewById(R.id.voice_match_consent_animation), new C102199ac(j.f285239c, j.f285247k, j.f285248l.mo92421b(), j.f285245i));
                if (j.f285245i) {
                    fixedAspectRatioFrameLayout.setForceDarkAllowed(false);
                }
                a.mo77402c();
                a.mo77403d();
                j.f285252p = a;
            }
            if (j.f285242f.mo92960G() && !j.f285242f.mo92959F()) {
                ((TextView) b.findViewById(R.id.hotword_enrollment_suw_intro_legal_part_1)).setText(j.f285242f.mo92967f());
                ((TextView) b.findViewById(R.id.hotword_enrollment_suw_intro_legal_part_2)).setText(j.f285242f.mo92968g());
                ((TextView) b.findViewById(R.id.hotword_enrollment_suw_intro_legal_part_3)).setText(j.f285242f.mo92969h());
            }
            if (j.f285242f.mo92955B()) {
                b.findViewById(R.id.hotword_enrollment_enroll_space).setVisibility(0);
            }
            if (j.f285240d.mo85090c()) {
                C90743b.m148214a(b.findViewById(R.id.title), 500);
            }
            C102230s sVar = j.f285251o;
            C102231t e = C102232u.m169449e();
            e.mo92352d(j.f285242f.mo92974l());
            e.mo92351c(j.f285242f.mo92973k());
            e.mo92350b(j.f285242f.mo92984u());
            sVar.mo93026h(e.mo92349a());
            C102230s sVar2 = j.f285251o;
            C102228q f = C102229r.m169429f();
            f.mo92319b(2);
            f.mo92320c(j.mo93009a(j.f285242f.mo92961a()));
            f.mo92321d(j.mo93010b());
            sVar2.mo93025g(f.mo92318a());
            if (j.f285239c.mo70886d().mo70847a().d() == 2) {
                ScrollView m = ((GlifLayout) b).mo49190m();
                C102230s sVar3 = j.f285251o;
                C102228q f2 = C102229r.m169429f();
                f2.mo92319b(2);
                f2.mo92320c(j.mo93009a(R.string.hotword_enrollment_button_more));
                f2.mo92321d(C84011f.m133882e().mo77373a());
                sVar3.mo93025g(f2.mo92318a());
                m.getViewTreeObserver().addOnScrollChangedListener(new C102218r(j));
                m.getViewTreeObserver().addOnGlobalLayoutListener(new C102197aa(j, m));
            } else {
                C83983ah.m133841a((OpaPageLayout) b, new C102219s(j)).mo77412a();
            }
            if (j.f285242f.mo92986w()) {
                j.mo93016h((TextView) b.findViewById(R.id.hotword_intro_legal_text));
            }
            if (j.f285242f.mo92958E()) {
                b.findViewById(R.id.local_consent_container).setVisibility(0);
                if (j.f285242f.mo92954A()) {
                    b.findViewById(R.id.local_consent_section_header).setVisibility(0);
                }
            }
            if (j.f285242f.mo92959F()) {
                FrameLayout frameLayout = (FrameLayout) b.findViewById(R.id.server_side_consent_container);
                frameLayout.addView(j.f285246j.mo92670a(j.f285238b.getContext()));
                frameLayout.setVisibility(0);
                ((LinearLayout) b.findViewById(R.id.local_consent_container)).setVisibility(8);
            }
            if (j.f285242f.mo92989z()) {
                j.mo93017i(b);
            }
            CharSequence j2 = j.f285242f.mo92972j();
            TextView textView = (TextView) b.findViewById(R.id.misactivation_disclaimer);
            if (!(j2 == null || textView == null)) {
                textView.setVisibility(0);
                textView.setText(j2);
            }
            CharSequence c = j.f285242f.mo92963c();
            TextView textView2 = (TextView) b.findViewById(R.id.wear_os_battery_disclosure);
            if (!(c == null || textView2 == null)) {
                textView2.setVisibility(0);
                textView2.setText(c);
            }
            C47831fm.m85019n();
            return b;
        } catch (Throwable th) {
            C102216p.m169401a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f285222d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C102216p.m169401a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C92349f fVar;
        C47573bx c = this.f285222d.mo51375c();
        try {
            super.onDestroyView();
            C102226z j = mo17754z();
            C83975q qVar = j.f285252p;
            if (qVar != null) {
                qVar.mo77406g();
            }
            j.f285252p = null;
            if (j.f285242f.mo92957D() && (fVar = j.f285253q) != null) {
                fVar.dismiss();
            }
            c.close();
            return;
        } catch (Throwable th) {
            C102216p.m169401a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f285222d.mo51376d();
        try {
            super.onDetach();
            this.f285223e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C102216p.m169401a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f285222d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C102216p.m169401a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f285222d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C102216p.m169401a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f285222d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102216p.m169401a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f285222d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C102216p.m169401a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f285222d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f285222d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102216p.m169401a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f285222d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102216p.m169401a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f285222d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f285222d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f285222d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f285222d;
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
        C47515ab abVar = this.f285222d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f285222d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f285222d;
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
        C102217q qVar;
        this.f285222d.mo51381i();
        try {
            if (!this.f285223e) {
                super.onAttach(context);
                if (this.f285219a == null) {
                    try {
                        Object jN = mo92996b().mo17653jN();
                        C101781u w = ((C74178nm) jN).mo70081w();
                        Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                        if (fragment instanceof C102217q) {
                            C102217q qVar2 = (C102217q) fragment;
                            C68225k.m98532d(qVar2);
                            C74555u uVar = (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b();
                            C104149a aVar = (C104149a) ((C74178nm) jN).f207130a.b.f200015bc.mo17428b();
                            C102230s u = ((C74178nm) jN).mo70079u();
                            C92371d dVar = (C92371d) ((C74178nm) jN).f207130a.a.f202806dy.mo17428b();
                            C90743b bVar = (C90743b) ((C74178nm) jN).f207130a.gx.mo17428b();
                            C101883i y = ((C74178nm) jN).mo70083y();
                            C68214a a = C68219e.m98518a(((C74178nm) jN).f207130a.a.f202803dv);
                            C22871g gVar = (C22871g) ((C74178nm) jN).f207130a.aT.mo17428b();
                            C73964bv bvVar = ((C74178nm) jN).f207136c;
                            C101568v vVar = new C101568v(new C101560n((C86054o) bvVar.f205604c.a.f202324I.mo17428b(), bvVar.f205604c.b.mo67275am(), (C90021c) bvVar.f205604c.a.f202006C.mo17428b(), (C22871g) bvVar.f205604c.aW.mo17428b(), (C22871g) bvVar.f205604c.aV.mo17428b(), (String) bvVar.f205595br.mo17428b(), (C92371d) bvVar.f205604c.a.f202806dy.mo17428b(), (l) bvVar.f205604c.a.f202833eY.mo17428b()), new C101547aa((C92371d) bvVar.f205604c.a.f202806dy.mo17428b(), (l) bvVar.f205604c.a.f202833eY.mo17428b(), (C86054o) bvVar.f205604c.a.f202324I.mo17428b(), (C22871g) bvVar.f205604c.aW.mo17428b(), (String) bvVar.f205595br.mo17428b()), (C22871g) bvVar.f205604c.aW.mo17428b());
                            C68214a a2 = C68219e.m98518a(((C74178nm) jN).f207130a.a.f202586Q);
                            C90476a aVar2 = (C90476a) ((C74178nm) jN).f207130a.r.mo17428b();
                            C86124t tVar = (C86124t) ((C74178nm) jN).f207130a.a.f202006C.mo17428b();
                            C46439e eVar = (C46439e) ((C74178nm) jN).f207139f.mo17428b();
                            C62921ba baVar = (C62921ba) ((C74178nm) jN).f207130a.gG.mo17428b();
                            C73964bv bvVar2 = ((C74178nm) jN).f207136c;
                            C69464a aVar3 = bvVar2.f205594bq;
                            aqy aqy = ((C74178nm) jN).f207130a;
                            C101568v vVar2 = vVar;
                            C69464a aVar4 = aqy.g;
                            C22871g gVar2 = gVar;
                            asp asp = aqy.a;
                            C68214a aVar5 = a;
                            C101883i iVar = y;
                            C90743b bVar2 = bVar;
                            C92371d dVar2 = dVar;
                            C102230s sVar = u;
                            C104149a aVar6 = aVar;
                            C74555u uVar2 = uVar;
                            C102217q qVar3 = qVar2;
                            C102215o oVar = new C102215o(aVar3, aVar4, asp.f202651bB, asp.f202806dy, ((C74178nm) jN).f207135b.f205818a, asp.f202803dv, ((C74178nm) jN).f207117N, ((C74178nm) jN).f207109F, aqy.d.f201704eD, bvVar2.f205607cC, ((C74178nm) jN).f207111H, bvVar2.f205609cE, bvVar2.f205606cB);
                            C102226z zVar = new C102226z(w, qVar3, uVar2, aVar6, sVar, dVar2, bVar2, iVar, aVar5, gVar2, vVar2, a2, tVar, eVar, baVar, oVar, (C101497ae) ((C74178nm) jN).f207109F.mo17428b(), ((C74178nm) jN).f207136c.mo69302ed(), (o) ((C74178nm) jN).f207130a.a.f203120ju.mo17428b(), (C101860a) ((C74178nm) jN).f207135b.f205818a.mo17428b(), (C101890g) ((C74178nm) jN).f207111H.mo17428b(), (C58833ax) ((C74178nm) jN).f207130a.d.f201704eD.mo17428b(), (C101610b) ((C74178nm) jN).f207136c.f205606cB.mo17428b());
                            qVar = this;
                            qVar.f285219a = zVar;
                            super.getLifecycle().mo5790b(new TracedFragmentLifecycle(qVar.f285222d, qVar.f285221c));
                        } else {
                            String obj = C102226z.class.toString();
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
                    qVar = this;
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = qVar.f285222d;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
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
