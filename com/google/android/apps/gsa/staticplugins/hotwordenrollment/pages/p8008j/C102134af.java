package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73778a;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LinkUtil;
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
import com.google.common.p4526f.C59052c;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Arrays;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.af */
/* compiled from: PG */
public final class C102134af extends C102190u implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C102140al f284928a;

    /* renamed from: b */
    private Context f284929b;

    /* renamed from: c */
    private final C2393x f284930c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f284931d = new C47515ab(this);

    /* renamed from: e */
    private boolean f284932e;

    @Deprecated
    public C102134af() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        C102140al j = mo17754z();
        j.f284944f.mo83702b(C89849ae.VOICE_MATCH_UNIFIED_ENROLLMENT_BACK_PRESSED);
        if (j.f284942d.isPresent()) {
            ((C19435g) j.f284942d.get()).mo24621c("FedAss.UnifiedDiscoverability.Status", 7);
            C101765e eVar = new C101765e();
            eVar.mo92562b(-1);
            eVar.f283865a = null;
            C47393f.m84236g(eVar.mo92561a(), j.f284940b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92897d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f284929b == null) {
            this.f284929b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f284929b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f284931d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f284930c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f284931d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C102140al mo17754z() {
        C102140al alVar = this.f284928a;
        if (alVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f284932e) {
            return alVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f284931d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102133ae.m169164a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f284931d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C102133ae.m169164a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f284931d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102133ae.m169164a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f284931d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102133ae.m169164a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f284931d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C102133ae.m169164a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f284931d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C102140al j = mo17754z();
            C73778a.m108339b(j.f284940b);
            View a = j.f284941c.mo93019a(layoutInflater);
            j.f284941c.mo93024f(R.layout.ufda_consent_screen_content);
            C102230s sVar = j.f284941c;
            C102231t e = C102232u.m169449e();
            e.mo92352d(j.f284940b.getString(R.string.unified_opt_in_enrollment_title));
            e.mo92351c(j.f284940b.getString(R.string.unified_opt_in_enrollment_dialog_subtitle));
            sVar.mo93026h(e.mo92349a());
            ScrollView c = j.f284941c.mo93021c();
            C102230s sVar2 = j.f284941c;
            C102228q f = C102229r.m169429f();
            f.mo92319b(2);
            C84010e e2 = C84011f.m133882e();
            e2.mo77375c(j.f284940b.getString(R.string.unified_opt_in_enrollment_more));
            ((C83958a) e2).f228734b = new C102135ag(j);
            f.mo92320c(e2.mo77373a());
            C84010e e3 = C84011f.m133882e();
            e3.mo77376d(false);
            f.mo92321d(e3.mo77373a());
            sVar2.mo93025g(f.mo92318a());
            c.getViewTreeObserver().addOnScrollChangedListener(new C102136ah(j));
            c.getViewTreeObserver().addOnGlobalLayoutListener(new C102139ak(j, c));
            ItemView findViewById = a.findViewById(R.id.unified_opt_in_enrollment_popup_learn_more);
            String string = j.f284940b.getString(R.string.unified_opt_in_enrollment_learn_more_url);
            C84018m.m133908c(findViewById.e(), LinkUtil.m133792b(j.f284940b.getString(R.string.learn_more_enrollment_popup_text, string)), TextView.BufferType.NORMAL, findViewById);
            findViewById.e().setMovementMethod(LinkMovementMethod.getInstance());
            TextView d = j.f284941c.mo93022d();
            int currentTextColor = d.getCurrentTextColor();
            Drawable background = d.getBackground();
            for (Integer intValue : Arrays.asList(new Integer[]{Integer.valueOf(R.id.iv1), Integer.valueOf(R.id.iv2), Integer.valueOf(R.id.iv3), Integer.valueOf(R.id.iv4), Integer.valueOf(R.id.iv5)})) {
                ItemView findViewById2 = a.findViewById(intValue.intValue());
                findViewById2.e().setTextColor(currentTextColor);
                findViewById2.e().setBackground(background);
            }
            C47831fm.m85019n();
            return a;
        } catch (Throwable th) {
            C102133ae.m169164a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f284931d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C102133ae.m169164a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f284931d.mo51375c();
        try {
            super.onDestroyView();
            mo17754z();
            ((C59052c) ((C59052c) C102140al.f284939a.mo56224b()).mo56372aa(20587)).mo56386p("onDestroyView");
            c.close();
            return;
        } catch (Throwable th) {
            C102133ae.m169164a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f284931d.mo51376d();
        try {
            super.onDetach();
            this.f284932e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C102133ae.m169164a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f284931d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C102133ae.m169164a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f284931d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C102133ae.m169164a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f284931d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102133ae.m169164a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f284931d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C102133ae.m169164a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f284931d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f284931d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102133ae.m169164a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f284931d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102133ae.m169164a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f284931d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f284931d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f284931d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f284931d;
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
        C47515ab abVar = this.f284931d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f284931d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f284931d;
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
        this.f284931d.mo51381i();
        try {
            if (!this.f284932e) {
                super.onAttach(context);
                if (this.f284928a == null) {
                    Object jN = mo92939b().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C102134af) {
                        C102134af afVar = (C102134af) fragment;
                        C68225k.m98532d(afVar);
                        C90476a aVar = (C90476a) ((C74178nm) jN).f207130a.r.mo17428b();
                        this.f284928a = new C102140al(afVar, ((C74178nm) jN).mo70079u(), Optional.m71637of((C19435g) ((C74178nm) jN).f207130a.aG.mo17428b()), ((C74178nm) jN).mo70082x(), (C89859i) ((C74178nm) jN).f207130a.a.f202586Q.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f284931d, this.f284930c));
                    } else {
                        String obj = C102140al.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f284931d;
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
                C102133ae.m169164a(th, th2);
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
