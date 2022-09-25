package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.assistant.settings.features.av.ei;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.aa */
/* compiled from: PG */
public final class C101637aa extends C101695d implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C101642af f283613a;

    /* renamed from: b */
    private Context f283614b;

    /* renamed from: c */
    private final C2393x f283615c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f283616d = new C47515ab(this);

    /* renamed from: e */
    private boolean f283617e;

    @Deprecated
    public C101637aa() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        mo17754z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92454d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f283614b == null) {
            this.f283614b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f283614b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f283616d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f283615c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f283616d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C101642af mo17754z() {
        C101642af afVar = this.f283613a;
        if (afVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f283617e) {
            return afVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f283616d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101717z.m168313a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f283616d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101717z.m168313a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f283616d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101717z.m168313a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f283616d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101717z.m168313a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f283616d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C101717z.m168313a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            r10 = this;
            com.google.apps.tiktok.tracing.ab r0 = r10.f283616d
            r0.mo51381i()
            super.onCreateView(r11, r12, r13)     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.af r13 = r10.mo17754z()     // Catch:{ all -> 0x013e }
            r0 = 2131626929(0x7f0e0bb1, float:1.8881108E38)
            r1 = 0
            android.view.View r11 = r11.inflate(r0, r12, r1)     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r11 = (com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout) r11     // Catch:{ all -> 0x013e }
            r12 = 2131434071(0x7f0b1a57, float:1.8489946E38)
            android.view.View r12 = r11.findViewById(r12)     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.opaonboarding.ui.HeaderLayout r12 = (com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout) r12     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.opaonboarding.ui.g r0 = r11.mo77369a()     // Catch:{ all -> 0x013e }
            r2 = 1
            r0.mo77475d(r2)     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.opaonboarding.ui.e r3 = com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f.m133882e()     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ab r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101638ab.f283618a     // Catch:{ all -> 0x013e }
            r5 = r3
            com.google.android.apps.gsa.opaonboarding.ui.a r5 = (com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a) r5     // Catch:{ all -> 0x013e }
            r5.f228734b = r4     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.assistant.settings.features.av.bh r4 = r13.f283620b     // Catch:{ all -> 0x013e }
            int r4 = r4.a     // Catch:{ all -> 0x013e }
            r5 = 2
            if (r4 != r5) goto L_0x00d9
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r4 = r13.f283623e     // Catch:{ all -> 0x013e }
            boolean r4 = r4.mo92334g()     // Catch:{ all -> 0x013e }
            java.lang.String r6 = ""
            if (r4 == 0) goto L_0x0093
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.aa r4 = r13.f283619a     // Catch:{ all -> 0x013e }
            r7 = 2132092671(0x7f1526ff, float:1.9825745E38)
            java.lang.String r4 = r4.getString(r7)     // Catch:{ all -> 0x013e }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r8 = r13.f283623e     // Catch:{ all -> 0x013e }
            java.lang.String r8 = r8.mo92329b()     // Catch:{ all -> 0x013e }
            r7[r1] = r8     // Catch:{ all -> 0x013e }
            java.lang.String r4 = java.lang.String.format(r4, r7)     // Catch:{ all -> 0x013e }
            android.widget.TextView r7 = r12.f228718a     // Catch:{ all -> 0x013e }
            android.widget.TextView$BufferType r8 = android.widget.TextView.BufferType.NORMAL     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r7, r4, r8, r12)     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.aa r4 = r13.f283619a     // Catch:{ all -> 0x013e }
            r7 = 2132092668(0x7f1526fc, float:1.9825739E38)
            java.lang.String r4 = r4.getString(r7)     // Catch:{ all -> 0x013e }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r8 = r13.f283623e     // Catch:{ all -> 0x013e }
            java.lang.String r8 = r8.mo92329b()     // Catch:{ all -> 0x013e }
            r7[r1] = r8     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.assistant.settings.features.av.ei r1 = r13.f283621c     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.assistant.settings.features.av.bh r8 = r13.f283620b     // Catch:{ all -> 0x013e }
            int r9 = r8.a     // Catch:{ all -> 0x013e }
            if (r9 != r5) goto L_0x0081
            java.lang.Object r5 = r8.b     // Catch:{ all -> 0x013e }
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x013e }
        L_0x0081:
            java.lang.String r1 = r1.d(r6)     // Catch:{ all -> 0x013e }
            r7[r2] = r1     // Catch:{ all -> 0x013e }
            java.lang.String r1 = java.lang.String.format(r4, r7)     // Catch:{ all -> 0x013e }
            android.widget.TextView r2 = r12.f228719b     // Catch:{ all -> 0x013e }
            android.widget.TextView$BufferType r4 = android.widget.TextView.BufferType.NORMAL     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r2, r1, r4, r12)     // Catch:{ all -> 0x013e }
            goto L_0x00cc
        L_0x0093:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.aa r4 = r13.f283619a     // Catch:{ all -> 0x013e }
            r7 = 2132092670(0x7f1526fe, float:1.9825743E38)
            java.lang.String r4 = r4.getString(r7)     // Catch:{ all -> 0x013e }
            android.widget.TextView r7 = r12.f228718a     // Catch:{ all -> 0x013e }
            android.widget.TextView$BufferType r8 = android.widget.TextView.BufferType.NORMAL     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r7, r4, r8, r12)     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.aa r4 = r13.f283619a     // Catch:{ all -> 0x013e }
            r7 = 2132092667(0x7f1526fb, float:1.9825737E38)
            java.lang.String r4 = r4.getString(r7)     // Catch:{ all -> 0x013e }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.assistant.settings.features.av.ei r7 = r13.f283621c     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.assistant.settings.features.av.bh r8 = r13.f283620b     // Catch:{ all -> 0x013e }
            int r9 = r8.a     // Catch:{ all -> 0x013e }
            if (r9 != r5) goto L_0x00bb
            java.lang.Object r5 = r8.b     // Catch:{ all -> 0x013e }
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x013e }
        L_0x00bb:
            java.lang.String r5 = r7.d(r6)     // Catch:{ all -> 0x013e }
            r2[r1] = r5     // Catch:{ all -> 0x013e }
            java.lang.String r1 = java.lang.String.format(r4, r2)     // Catch:{ all -> 0x013e }
            android.widget.TextView r2 = r12.f228719b     // Catch:{ all -> 0x013e }
            android.widget.TextView$BufferType r4 = android.widget.TextView.BufferType.NORMAL     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r2, r1, r4, r12)     // Catch:{ all -> 0x013e }
        L_0x00cc:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.aa r1 = r13.f283619a     // Catch:{ all -> 0x013e }
            r2 = 2132092669(0x7f1526fd, float:1.982574E38)
            java.lang.String r1 = r1.getString(r2)     // Catch:{ all -> 0x013e }
            r3.mo77375c(r1)     // Catch:{ all -> 0x013e }
            goto L_0x0105
        L_0x00d9:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.aa r1 = r13.f283619a     // Catch:{ all -> 0x013e }
            r2 = 2132092658(0x7f1526f2, float:1.9825719E38)
            java.lang.String r1 = r1.getString(r2)     // Catch:{ all -> 0x013e }
            android.widget.TextView r2 = r12.f228718a     // Catch:{ all -> 0x013e }
            android.widget.TextView$BufferType r4 = android.widget.TextView.BufferType.NORMAL     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r2, r1, r4, r12)     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.aa r1 = r13.f283619a     // Catch:{ all -> 0x013e }
            r2 = 2132092656(0x7f1526f0, float:1.9825715E38)
            java.lang.String r1 = r1.getString(r2)     // Catch:{ all -> 0x013e }
            android.widget.TextView r2 = r12.f228719b     // Catch:{ all -> 0x013e }
            android.widget.TextView$BufferType r4 = android.widget.TextView.BufferType.NORMAL     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r2, r1, r4, r12)     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.aa r1 = r13.f283619a     // Catch:{ all -> 0x013e }
            r2 = 2132092657(0x7f1526f1, float:1.9825717E38)
            java.lang.String r1 = r1.getString(r2)     // Catch:{ all -> 0x013e }
            r3.mo77375c(r1)     // Catch:{ all -> 0x013e }
        L_0x0105:
            com.google.android.apps.gsa.opaonboarding.ui.f r1 = r3.mo77373a()     // Catch:{ all -> 0x013e }
            r0.mo77472a(r1)     // Catch:{ all -> 0x013e }
            r0 = 2131429847(0x7f0b09d7, float:1.8481378E38)
            android.view.View r0 = r11.findViewById(r0)     // Catch:{ all -> 0x013e }
            r1 = 2131429846(0x7f0b09d6, float:1.8481376E38)
            android.view.View r1 = r11.findViewById(r1)     // Catch:{ all -> 0x013e }
            com.airbnb.lottie.LottieAnimationView r1 = (com.airbnb.lottie.LottieAnimationView) r1     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ae r2 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ae     // Catch:{ all -> 0x013e }
            r2.<init>()     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.opaonboarding.ui.a.o r0 = com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83974p.m133833a(r0, r1, r2)     // Catch:{ all -> 0x013e }
            r0.mo77402c()     // Catch:{ all -> 0x013e }
            r0.mo77403d()     // Catch:{ all -> 0x013e }
            com.google.android.apps.gsa.shared.util.b r13 = r13.f283622d     // Catch:{ all -> 0x013e }
            boolean r13 = r13.mo85090c()     // Catch:{ all -> 0x013e }
            if (r13 == 0) goto L_0x013a
            android.widget.TextView r12 = r12.f228718a     // Catch:{ all -> 0x013e }
            r0 = 500(0x1f4, double:2.47E-321)
            com.google.android.apps.gsa.shared.util.C90743b.m148214a(r12, r0)     // Catch:{ all -> 0x013e }
        L_0x013a:
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r11
        L_0x013e:
            r11 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0143 }
            goto L_0x0147
        L_0x0143:
            r12 = move-exception
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101717z.m168313a(r11, r12)
        L_0x0147:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101637aa.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        C47573bx b = this.f283616d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C101717z.m168313a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f283616d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C101717z.m168313a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f283616d.mo51376d();
        try {
            super.onDetach();
            this.f283617e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C101717z.m168313a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f283616d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C101717z.m168313a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f283616d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101717z.m168313a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f283616d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101717z.m168313a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f283616d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C101717z.m168313a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f283616d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f283616d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101717z.m168313a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f283616d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101717z.m168313a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f283616d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f283616d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f283616d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f283616d;
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
        C47515ab abVar = this.f283616d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f283616d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f283616d;
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
        this.f283616d.mo51381i();
        try {
            if (!this.f283617e) {
                super.onAttach(context);
                if (this.f283613a == null) {
                    Object jN = mo92501b().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C101637aa) {
                        C101637aa aaVar = (C101637aa) fragment;
                        C68225k.m98532d(aaVar);
                        this.f283613a = new C101642af(aaVar, ((C74178nm) jN).mo70080v(), (ei) ((C74178nm) jN).f207130a.b.f200245fu.mo17428b(), (C90743b) ((C74178nm) jN).f207130a.gx.mo17428b(), (C101497ae) ((C74178nm) jN).f207109F.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f283616d, this.f283615c));
                    } else {
                        String obj = C101642af.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f283616d;
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
                C101717z.m168313a(th, th2);
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
