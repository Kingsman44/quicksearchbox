package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.assistant.settings.features.av.au;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.assistant.settings.features.av.ei;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83974p;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83975q;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.speech.utils.p7317ui.C92658d;
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
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ar */
/* compiled from: PG */
public final class C101654ar extends C101698g implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C101661ay f283661a;

    /* renamed from: b */
    private Context f283662b;

    /* renamed from: c */
    private final C2393x f283663c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f283664d = new C47515ab(this);

    /* renamed from: e */
    private boolean f283665e;

    @Deprecated
    public C101654ar() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        mo17754z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92464d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f283662b == null) {
            this.f283662b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f283662b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f283664d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f283663c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f283664d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C101661ay mo17754z() {
        C101661ay ayVar = this.f283661a;
        if (ayVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f283665e) {
            return ayVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f283664d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101653aq.m168162a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f283664d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101653aq.m168162a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f283664d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101653aq.m168162a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f283664d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101653aq.m168162a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f283664d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C101653aq.m168162a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f283664d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C101661ay j = mo17754z();
            OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.structure_level_personal_results_device_consent, viewGroup, false);
            HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.findViewById(R.id.opa_header);
            C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.structure_level_device_personal_results_header_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            int i = j.f283674f - 1;
            int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? R.string.structure_level_device_personal_results_message_v5 : R.string.structure_level_device_personal_results_message_v4 : R.string.structure_level_device_personal_results_message_v3 : R.string.structure_level_device_personal_results_message_v2 : R.string.structure_level_device_personal_results_message_v1;
            String string = j.f283669a.getString(R.string.pr_learn_more);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(j.f283669a.getString(i2, string));
            C92658d.m152614a(spannableStringBuilder, string, new C101657au(j));
            C84018m.m133908c(headerLayout.f228719b, spannableStringBuilder, TextView.BufferType.NORMAL, headerLayout);
            headerLayout.f228719b.setMovementMethod(LinkMovementMethod.getInstance());
            headerLayout.f228719b.setClickable(true);
            FooterLayout footerLayout = opaPageLayout.f228726a;
            footerLayout.mo77362c(2);
            footerLayout.mo77363d(true);
            Button a = footerLayout.mo77360a();
            a.setText(R.string.structure_level_device_personal_results_consent_action_button_text);
            a.setOnClickListener(new C101655as(j));
            Button b = footerLayout.mo77361b();
            b.setText(R.string.structure_level_device_personal_results_consent_cancel_button_text);
            b.setOnClickListener(new C101656at(j));
            j.f283673e = C83974p.m133833a(opaPageLayout.findViewById(R.id.animation_container), (LottieAnimationView) opaPageLayout.findViewById(R.id.animation), new C101660ax());
            j.f283673e.mo77402c();
            j.f283673e.mo77403d();
            if (j.f283672d.mo85090c()) {
                C90743b.m148214a(headerLayout.f228718a, 500);
            }
            C47831fm.m85019n();
            return opaPageLayout;
        } catch (Throwable th) {
            C101653aq.m168162a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f283664d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C101653aq.m168162a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f283664d.mo51375c();
        try {
            super.onDestroyView();
            C101661ay j = mo17754z();
            C83975q qVar = j.f283673e;
            if (qVar != null) {
                qVar.mo77406g();
                j.f283673e = null;
            }
            c.close();
            return;
        } catch (Throwable th) {
            C101653aq.m168162a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f283664d.mo51376d();
        try {
            super.onDetach();
            this.f283665e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C101653aq.m168162a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f283664d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C101653aq.m168162a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f283664d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101653aq.m168162a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f283664d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101653aq.m168162a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f283664d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C101653aq.m168162a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f283664d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f283664d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101653aq.m168162a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f283664d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101653aq.m168162a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f283664d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f283664d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f283664d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f283664d;
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
        C47515ab abVar = this.f283664d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f283664d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f283664d;
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
        this.f283664d.mo51381i();
        try {
            if (!this.f283665e) {
                super.onAttach(context);
                if (this.f283661a == null) {
                    Object jN = mo92507b().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C101654ar) {
                        C101654ar arVar = (C101654ar) fragment;
                        C68225k.m98532d(arVar);
                        String b = C47260e.m84065b(((C74178nm) jN).mo70044a());
                        C68225k.m98532d(b);
                        au auVar = (au) ((C74178nm) jN).f207130a.b.f200246fv.mo17428b();
                        this.f283661a = new C101661ay(arVar, b, (dn) ((C74178nm) jN).f207130a.b.f200233fi.mo17428b(), (ei) ((C74178nm) jN).f207130a.b.f200245fu.mo17428b(), (C90743b) ((C74178nm) jN).f207130a.gx.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f283664d, this.f283663c));
                    } else {
                        String obj = C101661ay.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f283664d;
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
                C101653aq.m168162a(th, th2);
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
