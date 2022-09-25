package com.google.android.libraries.lens.view.srpx;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.common.NestedScrollingChildWrapperFrameLayout;
import com.google.android.libraries.lens.view.session.C27749al;
import com.google.android.libraries.lens.view.srpx.C28050p;
import com.google.android.libraries.lens.view.srpx.p2171b.C28036b;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.p3420k.C43864j;
import com.google.android.libraries.web.webview.contrib.p3476a.C44355e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.srpx.o */
/* compiled from: PG */
public final class C28049o extends C28054s implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C28050p f76326a;

    /* renamed from: b */
    private Context f76327b;

    /* renamed from: c */
    private final C2393x f76328c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f76329d = new C47515ab(this);

    /* renamed from: e */
    private boolean f76330e;

    @Deprecated
    public C28049o() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C28050p mo17754z() {
        C28050p pVar = this.f76326a;
        if (pVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f76330e) {
            return pVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo33502b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f76327b == null) {
            this.f76327b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f76327b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f76329d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f76328c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f76329d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f76329d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28048n.m52276a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f76329d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C28048n.m52276a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f76329d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28048n.m52276a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f76329d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28048n.m52276a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f76329d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C28048n.m52276a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f76329d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C28050p a = mo17754z();
            a.f76341k = (CoordinatorLayout) layoutInflater.inflate(R.layout.lens_srpx_container, viewGroup, false);
            C43861g b = C43864j.m77436b(a.f76333c);
            C0154a aVar = new C0154a(a.f76332b.getChildFragmentManager());
            aVar.mo689v(R.id.lens_srpx_web_fragment_container, b, "srpx-web-fragment");
            aVar.mo509f();
            a.f76335e.mo46385c().name();
            a.mo33503d(a.f76334d, a.f76344n);
            C44355e eVar = a.f76336f;
            NestedScrollingChildWrapperFrameLayout nestedScrollingChildWrapperFrameLayout = (NestedScrollingChildWrapperFrameLayout) a.f76341k.findViewById(R.id.lens_srpx_web_fragment_container);
            nestedScrollingChildWrapperFrameLayout.getClass();
            eVar.mo47231a(nestedScrollingChildWrapperFrameLayout);
            a.f76337g.mo50707a(a.f76338h.mo46469b(), new C28050p.C28051a());
            ((NestedScrollingChildWrapperFrameLayout) a.f76341k.findViewById(R.id.lens_srpx_web_fragment_container)).f69963b = null;
            CoordinatorLayout coordinatorLayout = a.f76341k;
            C47831fm.m85019n();
            return coordinatorLayout;
        } catch (Throwable th) {
            C28048n.m52276a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f76329d.mo51374b();
        try {
            super.onDestroy();
            C28452b bVar = mo17754z().f76343m;
            if (bVar != null) {
                bVar.mo33910d();
            }
            b.close();
            return;
        } catch (Throwable th) {
            C28048n.m52276a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f76329d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C28048n.m52276a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f76329d.mo51376d();
        try {
            super.onDetach();
            this.f76330e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C28048n.m52276a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f76329d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C28048n.m52276a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f76329d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C28048n.m52276a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f76329d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28048n.m52276a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f76329d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C28048n.m52276a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f76329d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f76329d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28048n.m52276a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f76329d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28048n.m52276a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f76329d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f76329d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f76329d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f76329d;
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
        C47515ab abVar = this.f76329d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f76329d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f76329d;
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
        this.f76329d.mo51381i();
        try {
            if (!this.f76330e) {
                super.onAttach(context);
                if (this.f76326a == null) {
                    Object jN = mo33506d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C28049o) {
                        C28049o oVar = (C28049o) fragment;
                        C68225k.m98532d(oVar);
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C28036b bVar = (C28036b) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C28036b.f76306e, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(bVar);
                        this.f76326a = new C28050p(oVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), bVar, new C28043i((C27749al) ((C74176nj) jN).f206836d.f205221P.mo17428b()), ((C74176nj) jN).mo69679eP(), ((C74176nj) jN).mo69766fx(), (C43269t) ((C74176nj) jN).f207085l.mo17428b(), ((C74176nj) jN).mo69786gQ(), (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), ((C74176nj) jN).mo69736fT(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f76329d, this.f76328c));
                    } else {
                        String obj = C28050p.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f76329d;
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
                C28048n.m52276a(th2, th3);
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
