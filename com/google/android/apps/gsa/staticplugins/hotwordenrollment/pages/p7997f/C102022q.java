package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f;

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
import com.google.android.apps.gsa.binaries.satin.app.C73964bv;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.h.s.s;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83975q;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f.p7999b.C102006e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.local.C46855i;
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
import dagger.C68214a;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.q */
/* compiled from: PG */
public final class C102022q extends C102014i implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C102029x f284646a;

    /* renamed from: b */
    private Context f284647b;

    /* renamed from: c */
    private final C2393x f284648c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f284649d = new C47515ab(this);

    /* renamed from: e */
    private boolean f284650e;

    @Deprecated
    public C102022q() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        C102029x j = mo17754z();
        C101763c cVar = new C101763c();
        cVar.mo92556b(0);
        C47393f.m84236g(cVar.mo92555a(), j.f284661b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92797d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f284647b == null) {
            this.f284647b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f284647b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f284649d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f284648c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f284649d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C102029x mo17754z() {
        C102029x xVar = this.f284646a;
        if (xVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f284650e) {
            return xVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f284649d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102021p.m168919a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f284649d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C102021p.m168919a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f284649d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102021p.m168919a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f284649d.mo51381i();
        try {
            super.onCreate(bundle);
            C102029x j = mo17754z();
            j.f284664e.mo50429i(j.f284667h);
            j.f284664e.mo50429i(j.f284668i);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102021p.m168919a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f284649d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C102021p.m168919a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f284649d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C102029x j = mo17754z();
            View a = j.f284662c.mo93019a(layoutInflater);
            j.f284662c.mo93024f(R.layout.hotword_screen_content);
            j.f284666g.mo83702b(C89849ae.VOICE_MATCH_HOTWORD_CONSENT_SCREEN_START);
            j.f284665f.mo50828h(R.id.hotword_screen_data, j.f284663d.mo92762a(), new C102028w(j, a, layoutInflater));
            C47831fm.m85019n();
            return a;
        } catch (Throwable th) {
            C102021p.m168919a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f284649d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C102021p.m168919a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f284649d.mo51375c();
        try {
            super.onDestroyView();
            C83975q qVar = mo17754z().f284671l;
            if (qVar != null) {
                qVar.mo77406g();
            }
            c.close();
            return;
        } catch (Throwable th) {
            C102021p.m168919a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f284649d.mo51376d();
        try {
            super.onDetach();
            this.f284650e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C102021p.m168919a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f284649d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C102021p.m168919a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f284649d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C102021p.m168919a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f284649d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102021p.m168919a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f284649d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C102021p.m168919a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f284649d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f284649d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102021p.m168919a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f284649d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C102021p.m168919a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f284649d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f284649d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f284649d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f284649d;
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
        C47515ab abVar = this.f284649d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f284649d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f284649d;
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
        C102019n a;
        this.f284649d.mo51381i();
        try {
            if (!this.f284650e) {
                super.onAttach(context);
                if (this.f284646a == null) {
                    Object jN = mo92796b().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C102022q) {
                        C102022q qVar = (C102022q) fragment;
                        C68225k.m98532d(qVar);
                        C102230s u = ((C74178nm) jN).mo70079u();
                        C73964bv bvVar = ((C74178nm) jN).f207136c;
                        C68214a a2 = C68219e.m98518a(bvVar.f205688de);
                        C68214a a3 = C68219e.m98518a(bvVar.f205689df);
                        C68214a a4 = C68219e.m98518a(bvVar.f205690dg);
                        s sVar = s.a;
                        int ordinal = ((C74555u) bvVar.f205594bq.mo17428b()).mo70884b().ordinal();
                        if (ordinal == 0) {
                            a = ((C102006e) a2.mo27525b()).mo92772a();
                        } else if (ordinal == 1) {
                            a = (C102019n) a3.mo27525b();
                        } else if (ordinal != 2) {
                            a = ((C102006e) a2.mo27525b()).mo92772a();
                        } else {
                            a = (C102019n) a4.mo27525b();
                        }
                        C102019n nVar = a;
                        C68225k.m98532d(nVar);
                        this.f284646a = new C102029x(qVar, u, nVar, (C46439e) ((C74178nm) jN).f207139f.mo17428b(), (C46855i) ((C74178nm) jN).f207113J.mo17428b(), ((C74178nm) jN).f207136c.mo69302ed(), (C89859i) ((C74178nm) jN).f207130a.a.f202586Q.mo17428b(), (C90743b) ((C74178nm) jN).f207130a.gx.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f284649d, this.f284648c));
                    } else {
                        String obj = C102029x.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f284649d;
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
                C102021p.m168919a(th, th2);
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
