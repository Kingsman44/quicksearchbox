package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

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
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ao */
/* compiled from: PG */
public final class C101651ao extends C101697f implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C101652ap f283654a;

    /* renamed from: b */
    private Context f283655b;

    /* renamed from: c */
    private final C2393x f283656c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f283657d = new C47515ab(this);

    /* renamed from: e */
    private boolean f283658e;

    @Deprecated
    public C101651ao() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        mo17754z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92462d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f283655b == null) {
            this.f283655b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f283655b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f283657d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f283656c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f283657d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C101652ap mo17754z() {
        C101652ap apVar = this.f283654a;
        if (apVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f283658e) {
            return apVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f283657d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101650an.m168153a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f283657d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101650an.m168153a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f283657d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101650an.m168153a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f283657d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101650an.m168153a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f283657d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C101650an.m168153a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f283657d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            mo17754z();
            View inflate = layoutInflater.inflate(R.layout.structure_level_personal_results_consent, viewGroup, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C101650an.m168153a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f283657d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C101650an.m168153a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f283657d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C101650an.m168153a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f283657d.mo51376d();
        try {
            super.onDetach();
            this.f283658e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C101650an.m168153a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f283657d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C101650an.m168153a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f283657d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101650an.m168153a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f283657d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101650an.m168153a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f283657d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C101650an.m168153a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f283657d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f283657d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101650an.m168153a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f283657d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101650an.m168153a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r4, android.os.Bundle r5) {
        /*
            r3 = this;
            com.google.apps.tiktok.tracing.ab r4 = r3.f283657d
            r4.mo51381i()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ap r4 = r3.mo17754z()     // Catch:{ all -> 0x005c }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ah r5 = r4.f283660b     // Catch:{ all -> 0x005c }
            com.google.android.apps.gsa.assistant.settings.features.av.bh r5 = r5.f283627b     // Catch:{ all -> 0x005c }
            if (r5 != 0) goto L_0x0011
            com.google.android.apps.gsa.assistant.settings.features.av.bh r5 = com.google.android.apps.gsa.assistant.settings.features.av.bh.c     // Catch:{ all -> 0x005c }
        L_0x0011:
            int r5 = r5.a     // Catch:{ all -> 0x005c }
            r0 = 1
            if (r5 != r0) goto L_0x0035
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ah r5 = r4.f283660b     // Catch:{ all -> 0x005c }
            com.google.android.apps.gsa.assistant.settings.features.av.bh r5 = r5.f283627b     // Catch:{ all -> 0x005c }
            if (r5 != 0) goto L_0x001e
            com.google.android.apps.gsa.assistant.settings.features.av.bh r5 = com.google.android.apps.gsa.assistant.settings.features.av.bh.c     // Catch:{ all -> 0x005c }
        L_0x001e:
            java.lang.String r1 = ""
            int r2 = r5.a     // Catch:{ all -> 0x005c }
            if (r2 != r0) goto L_0x0029
            java.lang.Object r5 = r5.b     // Catch:{ all -> 0x005c }
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x005c }
        L_0x0029:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ar r5 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ar     // Catch:{ all -> 0x005c }
            r5.<init>()     // Catch:{ all -> 0x005c }
            dagger.hilt.android.internal.managers.C68324h.m98669f(r5)     // Catch:{ all -> 0x005c }
            com.google.apps.tiktok.inject.p3659d.C47243l.m84040b(r5, r1)     // Catch:{ all -> 0x005c }
            goto L_0x0043
        L_0x0035:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ah r5 = r4.f283660b     // Catch:{ all -> 0x005c }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ba r0 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ba     // Catch:{ all -> 0x005c }
            r0.<init>()     // Catch:{ all -> 0x005c }
            dagger.hilt.android.internal.managers.C68324h.m98669f(r0)     // Catch:{ all -> 0x005c }
            com.google.apps.tiktok.inject.p3659d.C47243l.m84039a(r0, r5)     // Catch:{ all -> 0x005c }
            r5 = r0
        L_0x0043:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ao r4 = r4.f283659a     // Catch:{ all -> 0x005c }
            android.support.v4.app.FragmentManager r4 = r4.getChildFragmentManager()     // Catch:{ all -> 0x005c }
            android.support.v4.app.a r0 = new android.support.v4.app.a     // Catch:{ all -> 0x005c }
            r0.<init>((android.support.p031v4.app.FragmentManager) r4)     // Catch:{ all -> 0x005c }
            r4 = 2131429970(0x7f0b0a52, float:1.8481628E38)
            r1 = 0
            r0.mo689v(r4, r5, r1)     // Catch:{ all -> 0x005c }
            r0.mo509f()     // Catch:{ all -> 0x005c }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return
        L_0x005c:
            r4 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r5 = move-exception
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101650an.m168153a(r4, r5)
        L_0x0065:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101651ao.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f283657d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f283657d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f283657d;
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
        C47515ab abVar = this.f283657d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f283657d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f283657d;
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
        this.f283657d.mo51381i();
        try {
            if (!this.f283658e) {
                super.onAttach(context);
                if (this.f283654a == null) {
                    Object jN = mo92505b().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C101651ao) {
                        C101651ao aoVar = (C101651ao) fragment;
                        C68225k.m98532d(aoVar);
                        this.f283654a = new C101652ap(aoVar, ((C74178nm) jN).mo70080v());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f283657d, this.f283656c));
                    } else {
                        String obj = C101652ap.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f283657d;
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
                C101650an.m168153a(th, th2);
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
