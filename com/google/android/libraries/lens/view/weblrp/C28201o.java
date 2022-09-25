package com.google.android.libraries.lens.view.weblrp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C73958bn;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2078at.p2079a.C25490e;
import com.google.android.libraries.lens.view.p2078at.p2079a.C25492g;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.web.base.C43259j;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.base.C43265p;
import com.google.android.libraries.web.base.WebConfig;
import com.google.android.libraries.web.contrib.googlesignin.GoogleSignInFeature;
import com.google.android.libraries.web.contrib.logging.LoggingFeature;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.android.libraries.web.webview.contrib.setup.WebViewSetupFeature;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
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

/* renamed from: com.google.android.libraries.lens.view.weblrp.o */
/* compiled from: PG */
public final class C28201o extends C28187b implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C28202p f76757a;

    /* renamed from: b */
    private Context f76758b;

    /* renamed from: c */
    private final C2393x f76759c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f76760d = new C47515ab(this);

    /* renamed from: e */
    private boolean f76761e;

    @Deprecated
    public C28201o() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo33707b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f76758b == null) {
            this.f76758b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f76758b;
    }

    /* renamed from: f */
    public final C28202p mo17754z() {
        C28202p pVar = this.f76757a;
        if (pVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f76761e) {
            return pVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f76760d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f76759c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f76760d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f76760d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28200n.m52751a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f76760d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C28200n.m52751a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f76760d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28200n.m52751a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f76760d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28200n.m52751a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f76760d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C28200n.m52751a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f76760d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C28202p f = mo17754z();
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(R.layout.web_lrp_root, viewGroup, false);
            FragmentManager childFragmentManager = f.f76763b.getChildFragmentManager();
            if (childFragmentManager.f634a.mo671c("web-lrp-web-coordinator-fragment") == null) {
                f.f76766e.mo19974a(C37194a.f98619dt);
                C43264o a = C43265p.m76349a(f.f76764c, f.f76765d);
                C0154a aVar = new C0154a(childFragmentManager);
                aVar.mo511h(R.id.web_lrp_root_container, a, "web-lrp-web-coordinator-fragment", 1);
                aVar.mo509f();
                f.f76766e.mo19974a(C37194a.f98620du);
                AccountId accountId = f.f76764c;
                String bool = Boolean.toString(f.f76767f);
                C28191f fVar = new C28191f();
                C68324h.m98669f(fVar);
                C47247a.m84047b(fVar, accountId);
                C47243l.m84040b(fVar, bool);
                a.mo17754z().mo46380b(fVar);
            }
            C47831fm.m85019n();
            return coordinatorLayout;
        } catch (Throwable th) {
            C28200n.m52751a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f76760d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C28200n.m52751a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f76760d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C28200n.m52751a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f76760d.mo51376d();
        try {
            super.onDetach();
            this.f76761e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C28200n.m52751a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f76760d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C28200n.m52751a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f76760d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C28200n.m52751a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f76760d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28200n.m52751a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f76760d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C28200n.m52751a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f76760d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f76760d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28200n.m52751a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f76760d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C28200n.m52751a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f76760d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f76760d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f76760d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f76760d;
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
        C47515ab abVar = this.f76760d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f76760d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f76760d;
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
        this.f76760d.mo51381i();
        try {
            if (!this.f76761e) {
                super.onAttach(context);
                if (this.f76757a == null) {
                    Object jN = mo33706a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C28201o) {
                        C28201o oVar = (C28201o) fragment;
                        C68225k.m98532d(oVar);
                        AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                        C73958bn bnVar = ((C74176nj) jN).f206836d;
                        String str = (String) bnVar.f205285b.S.mo17428b();
                        C43259j jVar = new C43259j();
                        WebFeature[] webFeatureArr = new WebFeature[3];
                        Class<C25492g> cls = C25492g.class;
                        Class<C25490e> cls2 = C25490e.class;
                        if (true != ((C26244b) bnVar.f205444z.mo17428b()).mo31462g(C26239a.ONELRP_REMOVE_CUSTOM_SCROLLING)) {
                            cls = cls2;
                        }
                        webFeatureArr[0] = WebViewSetupFeature.m78387d(cls);
                        webFeatureArr[1] = GoogleSignInFeature.m76919e().mo46642c();
                        webFeatureArr[2] = LoggingFeature.m77099d(C28197k.class);
                        jVar.mo46372b(webFeatureArr);
                        jVar.f113072o.add(WebLrpRequestObserver.class);
                        jVar.f113059b = true;
                        jVar.mo46375e(String.format(Locale.US, "GoogleLens/%s", new Object[]{str}));
                        jVar.f113061d = 0;
                        WebConfig a = jVar.mo46371a();
                        String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                        C68225k.m98532d(b);
                        this.f76757a = new C28202p(oVar, accountId, a, b, (C37215b) ((C74176nj) jN).f206730b.f198027a.f199167S.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f76760d, this.f76759c));
                    } else {
                        String obj = C28202p.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f76760d;
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
                C28200n.m52751a(th, th2);
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
