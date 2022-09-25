package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8007i;

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
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.android.p265e.C5114a;
import com.google.android.apps.gsa.assistant.settings.shared.ao;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101495ac;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101502c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102228q;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102229r;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102231t;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102232u;
import com.google.android.gms.kids.p10817a.C144428g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
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
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.v */
/* compiled from: PG */
public final class C102120v extends C102116r implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C102123y f284887a;

    /* renamed from: b */
    private Context f284888b;

    /* renamed from: c */
    private final C2393x f284889c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f284890d = new C47515ab(this);

    /* renamed from: e */
    private boolean f284891e;

    @Deprecated
    public C102120v() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        mo17754z().mo92893b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92884d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f284888b == null) {
            this.f284888b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f284888b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f284890d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f284889c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f284890d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C102123y mo17754z() {
        C102123y yVar = this.f284887a;
        if (yVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f284891e) {
            return yVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f284890d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102119u.m169133a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f284890d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C102119u.m169133a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f284890d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102119u.m169133a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f284890d.mo51381i();
        try {
            super.onCreate(bundle);
            C102123y j = mo17754z();
            j.f284903j.mo50429i(j.f284904k);
            j.f284903j.mo50429i(j.f284905l);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102119u.m169133a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f284890d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C102119u.m169133a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f284890d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C102123y j = mo17754z();
            C58976aa aaVar = C58975e.f156826a;
            View b = j.f284900g.mo93020b(layoutInflater, R.layout.parent_reauth_permission_screen, R.layout.parent_reauth_permission_screen_glif, R.layout.parent_reauth_permission_screen_glif_no_partner_theme, (ViewGroup) null, 0, 0);
            TextView textView = (TextView) b.findViewById(R.id.parent_reauth_permission_first_paragraph);
            textView.setVisibility(true != j.f284897d.mo70892k() ? 0 : 8);
            textView.setText(j.f284899f.getString(R.string.assistant_unicorn_parent_reauth_permission_first_paragraph));
            if (!j.f284897d.mo70892k()) {
                ao.b((TextView) b.findViewById(R.id.parent_reauth_permission_second_paragraph), R.string.assistant_unicorn_parent_reauth_permission_second_paragraph, R.string.assistant_unicorn_parent_reauth_permission_learn_more_link);
            }
            C102230s sVar = j.f284900g;
            C102231t e = C102232u.m169449e();
            e.mo92352d(j.f284899f.getString(R.string.assistant_unicorn_parent_reauth_permission_title));
            ((C101502c) e).f283253b = C5114a.m13988b(Locale.getDefault(), j.f284899f.getString(true != j.f284897d.mo70892k() ? R.string.assistant_unicorn_parent_reauth_permission_summary : R.string.assistant_unicorn_parent_reauth_permission_summary_mobile), "GENDER", j.f284902i.mo92330c(), "PERSON", j.f284902i.mo92329b());
            e.mo92350b(false);
            sVar.mo93026h(e.mo92349a());
            C102230s sVar2 = j.f284900g;
            C102228q f = C102229r.m169429f();
            f.mo92319b(2);
            C84010e e2 = C84011f.m133882e();
            e2.mo77375c(j.f284899f.getString(R.string.assistant_unicorn_parent_reauth_permission_next));
            ((C83958a) e2).f228734b = new C102121w(j);
            f.mo92320c(e2.mo77373a());
            C84010e e3 = C84011f.m133882e();
            e3.mo77375c(j.f284899f.getString(R.string.assistant_unicorn_parent_reauth_permission_cancel));
            ((C83958a) e3).f228734b = new C102122x(j);
            f.mo92321d(e3.mo77373a());
            sVar2.mo93025g(f.mo92318a());
            C47831fm.m85019n();
            return b;
        } catch (Throwable th) {
            C102119u.m169133a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f284890d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C102119u.m169133a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f284890d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C102119u.m169133a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f284890d.mo51376d();
        try {
            super.onDetach();
            this.f284891e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C102119u.m169133a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f284890d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C102119u.m169133a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f284890d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C102119u.m169133a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f284890d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102119u.m169133a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f284890d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C102119u.m169133a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f284890d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f284890d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102119u.m169133a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f284890d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102119u.m169133a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f284890d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f284890d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f284890d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f284890d;
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
        C47515ab abVar = this.f284890d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f284890d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f284890d;
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
        this.f284890d.mo51381i();
        try {
            if (!this.f284891e) {
                super.onAttach(context);
                if (this.f284887a == null) {
                    Object jN = mo92883b().mo17653jN();
                    ((C74178nm) jN).mo70081w();
                    l lVar = (l) ((C74178nm) jN).f207130a.a.f202833eY.mo17428b();
                    C74555u uVar = (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b();
                    C144428g gVar = new C144428g((Context) ((C74178nm) jN).f207130a.d.f201488a.g.mo17428b());
                    C46439e eVar = (C46439e) ((C74178nm) jN).f207139f.mo17428b();
                    C102230s u = ((C74178nm) jN).mo70079u();
                    C86054o oVar = (C86054o) ((C74178nm) jN).f207130a.a.f202324I.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C102120v) {
                        C102120v vVar = (C102120v) fragment;
                        C68225k.m98532d(vVar);
                        this.f284887a = new C102123y(lVar, uVar, gVar, eVar, u, oVar, vVar, (C101497ae) ((C74178nm) jN).f207109F.mo17428b(), (C101495ac) ((C74178nm) jN).f207136c.f205625cU.mo17428b(), (String) ((C74178nm) jN).f207136c.f205595br.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f284890d, this.f284889c));
                    } else {
                        String obj = C102123y.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f284890d;
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
                C102119u.m169133a(th, th2);
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
