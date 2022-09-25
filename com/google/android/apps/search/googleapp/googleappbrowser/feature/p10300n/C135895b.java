package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10300n;

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
import android.widget.FrameLayout;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10300n.C135896c;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10300n.p10301a.C135886b;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10300n.p10301a.C135893h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43656d;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43664l;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46801dp;
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
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
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
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.n.b */
/* compiled from: PG */
public final class C135895b extends C135899e implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C135896c f370105a;

    /* renamed from: b */
    private Context f370106b;

    /* renamed from: c */
    private final C2393x f370107c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f370108d = new C47515ab(this);

    /* renamed from: e */
    private boolean f370109e;

    @Deprecated
    public C135895b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C135896c mo17754z() {
        C135896c cVar = this.f370105a;
        if (cVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f370109e) {
            return cVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112607b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f370106b == null) {
            this.f370106b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f370106b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f370108d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f370107c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f370108d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f370108d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135884a.m220474a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f370108d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C135884a.m220474a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f370108d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135884a.m220474a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f370108d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135884a.m220474a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f370108d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C135884a.m220474a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f370108d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C135896c a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            C69664n.m101061g(viewGroup, "parent");
            View inflate = layoutInflater.inflate(R.layout.googleapp_browser_fragment_urlbar, viewGroup, false);
            if (a.f370113d.getChildFragmentManager().f634a.mo671c("GOOGLEAPP_BROWSER_URLBAR_WEBX") == null) {
                C0154a aVar = new C0154a(a.f370113d.getChildFragmentManager());
                aVar.mo511h(R.id.googleapp_browser_urlbar_webxurlbar, C43656d.m77029f(a.f370112c, a.f370111b), "GOOGLEAPP_BROWSER_URLBAR_WEBX", 1);
                AccountId accountId = a.f370112c;
                C43664l lVar = a.f370111b;
                C69664n.m101061g(accountId, "accountId");
                C135886b bVar = new C135886b();
                C68324h.m98669f(bVar);
                C47247a.m84047b(bVar, accountId);
                C47243l.m84039a(bVar, lVar);
                aVar.mo511h(R.id.googleapp_browser_urlbar_ampurlbar, bVar, (String) null, 1);
                aVar.mo509f();
            }
            C28306ab abVar = a.f370115f;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(140498)));
            FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.googleapp_browser_urlbar_ampurlbar);
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.googleapp_browser_urlbar_webxurlbar);
            C46801dp dpVar = a.f370114e;
            C46689ag b = a.f370116g.mo46469b();
            C69664n.m101060f(frameLayout, "ampUrlBar");
            C69664n.m101060f(viewGroup2, "webxUrlBar");
            dpVar.mo50707a(b, new C135896c.C135897a(frameLayout, viewGroup2));
            C69664n.m101060f(inflate, "root");
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C135884a.m220474a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f370108d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C135884a.m220474a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f370108d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C135884a.m220474a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f370108d.mo51376d();
        try {
            super.onDetach();
            this.f370109e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C135884a.m220474a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f370108d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C135884a.m220474a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f370108d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C135884a.m220474a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f370108d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135884a.m220474a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f370108d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C135884a.m220474a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f370108d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f370108d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135884a.m220474a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f370108d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135884a.m220474a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f370108d.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C47393f.m84233d(this, C135893h.class, new C135898d(mo17754z()));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135884a.m220474a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f370108d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f370108d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f370108d;
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
        C47515ab abVar = this.f370108d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f370108d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f370108d;
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
        this.f370108d.mo51381i();
        try {
            if (!this.f370109e) {
                super.onAttach(context);
                if (this.f370105a == null) {
                    Object jN = mo112608d().mo17653jN();
                    C43664l fM = ((C74176nj) jN).mo69729fM();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C135895b) {
                        C135895b bVar = (C135895b) fragment;
                        C68225k.m98532d(bVar);
                        this.f370105a = new C135896c(fM, accountId, bVar, (C46801dp) ((C74176nj) jN).f207084k.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), ((C74176nj) jN).mo69736fT());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f370108d, this.f370107c));
                    } else {
                        String obj = C135896c.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f370108d;
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
                C135884a.m220474a(th, th2);
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
