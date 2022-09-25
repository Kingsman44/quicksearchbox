package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7993b;

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
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.d;
import com.google.android.apps.gsa.binaries.satin.app.C73964bv;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.speech.p7271d.C92233j;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g.C101806a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g.C101843k;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g.p7984a.C101807a;
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
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.b.b */
/* compiled from: PG */
public final class C101909b extends C101915h implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C101913f f284265a;

    /* renamed from: b */
    private Context f284266b;

    /* renamed from: c */
    private final C2393x f284267c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f284268d = new C47515ab(this);

    /* renamed from: e */
    private boolean f284269e;

    @Deprecated
    public C101909b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        C101913f b = mo17754z();
        C101763c cVar = new C101763c();
        cVar.mo92556b(0);
        C47393f.m84236g(cVar.mo92555a(), b.f284275c);
    }

    /* renamed from: b */
    public final C101913f mo17754z() {
        C101913f fVar = this.f284265a;
        if (fVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f284269e) {
            return fVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92684d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f284266b == null) {
            this.f284266b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f284266b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f284268d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f284267c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f284268d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f284268d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101908a.m168609a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f284268d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101908a.m168609a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f284268d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101908a.m168609a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f284268d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101908a.m168609a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f284268d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C101908a.m168609a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f284268d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C101913f b = mo17754z();
            ac a = b.f284277e.mo70886d().mo70847a();
            if (a.d() == 2) {
                if (a.c()) {
                    b.f284281i = layoutInflater.inflate(R.layout.enrollment_dependency_check_glif, viewGroup, false);
                } else {
                    b.f284281i = layoutInflater.inflate(R.layout.enrollment_dependency_check_glif_no_partner_theme, viewGroup, false);
                }
                b.f284281i.findViewById(R.id.glif_layout_container).setVisibility(0);
                if (!a.equals(ac.c)) {
                    GlifLoadingLayout glifLoadingLayout = (GlifLoadingLayout) b.f284281i.findViewById(R.id.glif_layout);
                    glifLoadingLayout.mo49203x();
                    ((C45301i) glifLoadingLayout.mo49129j(C45301i.class)).mo49235c(true);
                }
            } else {
                b.f284281i = layoutInflater.inflate(R.layout.enrollment_dependency_check, viewGroup, false);
                b.f284281i.findViewById(R.id.progress_bar_container).setVisibility(0);
            }
            C58976aa aaVar = C58975e.f156826a;
            View view = b.f284281i;
            C47831fm.m85019n();
            return view;
        } catch (Throwable th) {
            C101908a.m168609a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f284268d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C101908a.m168609a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f284268d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C101908a.m168609a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f284268d.mo51376d();
        try {
            super.onDetach();
            this.f284269e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C101908a.m168609a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f284268d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C101908a.m168609a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f284268d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101908a.m168609a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f284268d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101908a.m168609a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f284268d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C101908a.m168609a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f284268d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f284268d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101908a.m168609a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f284268d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101908a.m168609a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f284268d.mo51381i();
        try {
            C101913f b = mo17754z();
            C101912e eVar = new C101912e(b);
            C101806a aVar = new C101806a();
            aVar.mo92586b(b.f284279g);
            aVar.mo92589e(b.f284281i);
            aVar.mo92588d(b.f284277e.mo70891j());
            aVar.f283949a = eVar;
            aVar.mo92590f(b.f284280h);
            aVar.f283950b = b.f284278f.mo92638c();
            aVar.mo92587c(d.a(C58833ax.m90833j(b.f284277e.mo70889g())));
            b.f284274b.mo92593a(bundle, aVar.mo92585a());
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101908a.m168609a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f284268d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f284268d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f284268d;
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
        C47515ab abVar = this.f284268d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f284268d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f284268d;
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
        this.f284268d.mo51381i();
        try {
            if (!this.f284269e) {
                super.onAttach(context);
                if (this.f284265a == null) {
                    Object jN = mo92685f().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C101909b) {
                        C101909b bVar = (C101909b) fragment;
                        C68225k.m98532d(bVar);
                        C73964bv bvVar = ((C74178nm) jN).f207136c;
                        this.f284265a = new C101913f(bVar, (String) ((C74178nm) jN).f207136c.f205595br.mo17428b(), (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b(), new C101843k((C86054o) bvVar.f205604c.a.f202324I.mo17428b(), (Activity) bvVar.f205710e.mo17428b(), bvVar.mo69066S(), (C92233j) bvVar.f205604c.b.f200728p.mo17428b(), bvVar.mo69068U(), (C101807a) bvVar.f205608cD.mo17428b(), (C89994f) bvVar.f205604c.a.f202651bB.mo17428b(), (C89859i) bvVar.f205604c.a.f202586Q.mo17428b(), (C9325m) bvVar.f205604c.br.mo17428b()), (C101860a) ((C74178nm) jN).f207135b.f205818a.mo17428b(), (C22871g) ((C74178nm) jN).f207130a.aT.mo17428b(), (C90584f) ((C74178nm) jN).f207136c.f205609cE.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f284268d, this.f284267c));
                    } else {
                        String obj = C101913f.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f284268d;
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
                C101908a.m168609a(th2, th3);
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
