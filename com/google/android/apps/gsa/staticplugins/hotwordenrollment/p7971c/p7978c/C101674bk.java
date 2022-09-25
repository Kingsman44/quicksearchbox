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
import com.google.android.apps.gsa.assistant.settings.features.av.au;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.assistant.settings.features.av.ei;
import com.google.android.apps.gsa.assistant.settings.features.av.eq;
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b.C101888e;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b.C101890g;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bk */
/* compiled from: PG */
public final class C101674bk extends C101700i implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C101687bx f283704a;

    /* renamed from: b */
    private Context f283705b;

    /* renamed from: c */
    private final C2393x f283706c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f283707d = new C47515ab(this);

    /* renamed from: e */
    private boolean f283708e;

    @Deprecated
    public C101674bk() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        mo17754z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92482d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f283705b == null) {
            this.f283705b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f283705b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f283707d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f283706c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f283707d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C101687bx mo17754z() {
        C101687bx bxVar = this.f283704a;
        if (bxVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f283708e) {
            return bxVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f283707d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101673bj.m168211a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f283707d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101673bj.m168211a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f283707d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101673bj.m168211a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f283707d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101673bj.m168211a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f283707d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C101673bj.m168211a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            com.google.apps.tiktok.tracing.ab r0 = r9.f283707d
            r0.mo51381i()
            super.onCreateView(r10, r11, r12)     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bx r12 = r9.mo17754z()     // Catch:{ all -> 0x016d }
            r0 = 2131626938(0x7f0e0bba, float:1.8881126E38)
            r1 = 0
            android.view.View r10 = r10.inflate(r0, r11, r1)     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r10 = (com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout) r10     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r11 = r12.f283730j     // Catch:{ all -> 0x016d }
            boolean r11 = r11.mo92334g()     // Catch:{ all -> 0x016d }
            if (r11 == 0) goto L_0x0023
            r12.mo92495c(r10)     // Catch:{ all -> 0x016d }
            goto L_0x0162
        L_0x0023:
            r11 = 2131434071(0x7f0b1a57, float:1.8489946E38)
            android.view.View r11 = r10.findViewById(r11)     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.opaonboarding.ui.HeaderLayout r11 = (com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout) r11     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bk r0 = r12.f283721a     // Catch:{ all -> 0x016d }
            android.content.Context r0 = r0.getContext()     // Catch:{ all -> 0x016d }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.assistant.settings.features.av.bh r2 = r12.f283722b     // Catch:{ all -> 0x016d }
            int r3 = r2.a     // Catch:{ all -> 0x016d }
            r4 = 2
            r5 = 1
            if (r3 != r5) goto L_0x0054
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.a r2 = r12.f283723c     // Catch:{ all -> 0x016d }
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f284134a     // Catch:{ all -> 0x016d }
            boolean r2 = r2.get()     // Catch:{ all -> 0x016d }
            if (r5 == r2) goto L_0x004c
            r2 = 2132092772(0x7f152764, float:1.982595E38)
            goto L_0x004f
        L_0x004c:
            r2 = 2132092773(0x7f152765, float:1.9825952E38)
        L_0x004f:
            java.lang.String r0 = r0.getString(r2)     // Catch:{ all -> 0x016d }
            goto L_0x006e
        L_0x0054:
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.assistant.settings.features.av.ei r7 = r12.f283724d     // Catch:{ all -> 0x016d }
            java.lang.String r8 = ""
            if (r3 != r4) goto L_0x0061
            java.lang.Object r2 = r2.b     // Catch:{ all -> 0x016d }
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x016d }
        L_0x0061:
            java.lang.String r2 = r7.d(r8)     // Catch:{ all -> 0x016d }
            r6[r1] = r2     // Catch:{ all -> 0x016d }
            r2 = 2132092771(0x7f152763, float:1.9825948E38)
            java.lang.String r0 = r0.getString(r2, r6)     // Catch:{ all -> 0x016d }
        L_0x006e:
            android.widget.TextView r2 = r11.f228718a     // Catch:{ all -> 0x016d }
            android.widget.TextView$BufferType r3 = android.widget.TextView.BufferType.NORMAL     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r2, r0, r3, r11)     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bk r0 = r12.f283721a     // Catch:{ all -> 0x016d }
            android.content.Context r0 = r0.getContext()     // Catch:{ all -> 0x016d }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.assistant.settings.features.av.bh r2 = r12.f283722b     // Catch:{ all -> 0x016d }
            int r2 = r2.a     // Catch:{ all -> 0x016d }
            if (r2 != r5) goto L_0x00b3
            r2 = 2132093531(0x7f152a5b, float:1.982749E38)
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x016d }
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.a r6 = r12.f283723c     // Catch:{ all -> 0x016d }
            java.util.concurrent.atomic.AtomicBoolean r6 = r6.f284134a     // Catch:{ all -> 0x016d }
            boolean r6 = r6.get()     // Catch:{ all -> 0x016d }
            if (r5 == r6) goto L_0x009c
            r6 = 2132092769(0x7f152761, float:1.9825944E38)
            goto L_0x009f
        L_0x009c:
            r6 = 2132092770(0x7f152762, float:1.9825946E38)
        L_0x009f:
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x016d }
            r7[r1] = r2     // Catch:{ all -> 0x016d }
            java.lang.String r0 = r0.getString(r6, r7)     // Catch:{ all -> 0x016d }
            r3.<init>(r0)     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bu r0 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bu     // Catch:{ all -> 0x016d }
            r0.<init>(r12)     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.speech.utils.p7317ui.C92658d.m152614a(r3, r2, r0)     // Catch:{ all -> 0x016d }
            goto L_0x00ba
        L_0x00b3:
            r2 = 2132092768(0x7f152760, float:1.9825942E38)
            java.lang.String r3 = r0.getString(r2)     // Catch:{ all -> 0x016d }
        L_0x00ba:
            android.widget.TextView r0 = r11.f228719b     // Catch:{ all -> 0x016d }
            android.widget.TextView$BufferType r2 = android.widget.TextView.BufferType.NORMAL     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r0, r3, r2, r11)     // Catch:{ all -> 0x016d }
            android.widget.TextView r0 = r11.f228719b     // Catch:{ all -> 0x016d }
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()     // Catch:{ all -> 0x016d }
            r0.setMovementMethod(r2)     // Catch:{ all -> 0x016d }
            android.widget.TextView r0 = r11.f228719b     // Catch:{ all -> 0x016d }
            r0.setClickable(r5)     // Catch:{ all -> 0x016d }
            r0 = 2131432314(0x7f0b137a, float:1.8486382E38)
            android.view.View r0 = r10.findViewById(r0)     // Catch:{ all -> 0x016d }
            com.airbnb.lottie.LottieAnimationView r0 = (com.airbnb.lottie.LottieAnimationView) r0     // Catch:{ all -> 0x016d }
            r0.setVisibility(r1)     // Catch:{ all -> 0x016d }
            r2 = 2131432315(0x7f0b137b, float:1.8486384E38)
            android.view.View r2 = r10.findViewById(r2)     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bw r3 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bw     // Catch:{ all -> 0x016d }
            boolean r6 = r12.f283731k     // Catch:{ all -> 0x016d }
            r3.<init>(r6)     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.opaonboarding.ui.a.o r0 = com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83974p.m133833a(r2, r0, r3)     // Catch:{ all -> 0x016d }
            boolean r3 = r12.f283731k     // Catch:{ all -> 0x016d }
            if (r3 == 0) goto L_0x00f4
            r2.setForceDarkAllowed(r1)     // Catch:{ all -> 0x016d }
        L_0x00f4:
            r0.mo77402c()     // Catch:{ all -> 0x016d }
            r0.mo77403d()     // Catch:{ all -> 0x016d }
            r12.f283732l = r0     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.opaonboarding.ui.FooterLayout r0 = r10.f228726a     // Catch:{ all -> 0x016d }
            r0.mo77362c(r4)     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.assistant.settings.features.av.bh r1 = r12.f283722b     // Catch:{ all -> 0x016d }
            int r1 = r1.a     // Catch:{ all -> 0x016d }
            if (r1 != r5) goto L_0x010a
            r0.mo77363d(r5)     // Catch:{ all -> 0x016d }
        L_0x010a:
            android.widget.Button r1 = r0.mo77360a()     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.assistant.settings.features.av.bh r2 = r12.f283722b     // Catch:{ all -> 0x016d }
            int r2 = r2.a     // Catch:{ all -> 0x016d }
            if (r2 != r5) goto L_0x011b
            r2 = 2132092765(0x7f15275d, float:1.9825936E38)
            r1.setText(r2)     // Catch:{ all -> 0x016d }
            goto L_0x0121
        L_0x011b:
            r2 = 2132092764(0x7f15275c, float:1.9825934E38)
            r1.setText(r2)     // Catch:{ all -> 0x016d }
        L_0x0121:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bl r2 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bl     // Catch:{ all -> 0x016d }
            r2.<init>(r12)     // Catch:{ all -> 0x016d }
            r1.setOnClickListener(r2)     // Catch:{ all -> 0x016d }
            android.widget.Button r0 = r0.mo77361b()     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.assistant.settings.features.av.bh r1 = r12.f283722b     // Catch:{ all -> 0x016d }
            int r1 = r1.a     // Catch:{ all -> 0x016d }
            if (r1 != r5) goto L_0x013a
            r1 = 2132092767(0x7f15275f, float:1.982594E38)
            r0.setText(r1)     // Catch:{ all -> 0x016d }
            goto L_0x014b
        L_0x013a:
            int r1 = r12.f283733m     // Catch:{ all -> 0x016d }
            r2 = 3
            if (r1 != r2) goto L_0x0145
            r1 = 8
            r0.setVisibility(r1)     // Catch:{ all -> 0x016d }
            goto L_0x014b
        L_0x0145:
            r1 = 2132092766(0x7f15275e, float:1.9825938E38)
            r0.setText(r1)     // Catch:{ all -> 0x016d }
        L_0x014b:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bn r1 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bn     // Catch:{ all -> 0x016d }
            r1.<init>(r12)     // Catch:{ all -> 0x016d }
            r0.setOnClickListener(r1)     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.shared.util.b r0 = r12.f283726f     // Catch:{ all -> 0x016d }
            boolean r0 = r0.mo85090c()     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x0162
            android.widget.TextView r11 = r11.f228718a     // Catch:{ all -> 0x016d }
            r0 = 500(0x1f4, double:2.47E-321)
            com.google.android.apps.gsa.shared.util.C90743b.m148214a(r11, r0)     // Catch:{ all -> 0x016d }
        L_0x0162:
            com.google.android.apps.gsa.shared.logger.b.i r11 = r12.f283729i     // Catch:{ all -> 0x016d }
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SLA_CONSENT_START     // Catch:{ all -> 0x016d }
            r11.mo83702b(r12)     // Catch:{ all -> 0x016d }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r10
        L_0x016d:
            r10 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0172 }
            goto L_0x0176
        L_0x0172:
            r11 = move-exception
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101673bj.m168211a(r10, r11)
        L_0x0176:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101674bk.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        C47573bx b = this.f283707d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C101673bj.m168211a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f283707d.mo51375c();
        try {
            super.onDestroyView();
            mo17754z().mo92497e();
            c.close();
            return;
        } catch (Throwable th) {
            C101673bj.m168211a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f283707d.mo51376d();
        try {
            super.onDetach();
            this.f283708e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C101673bj.m168211a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f283707d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C101673bj.m168211a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f283707d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101673bj.m168211a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f283707d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101673bj.m168211a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f283707d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C101673bj.m168211a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f283707d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f283707d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101673bj.m168211a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f283707d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101673bj.m168211a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f283707d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f283707d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f283707d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f283707d;
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
        C47515ab abVar = this.f283707d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f283707d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f283707d;
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
        this.f283707d.mo51381i();
        try {
            if (!this.f283708e) {
                super.onAttach(context);
                if (this.f283704a == null) {
                    Object jN = mo92511b().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C101674bk) {
                        C101674bk bkVar = (C101674bk) fragment;
                        C68225k.m98532d(bkVar);
                        au auVar = (au) ((C74178nm) jN).f207130a.b.f200246fv.mo17428b();
                        this.f283704a = new C101687bx(bkVar, ((C74178nm) jN).mo70080v(), (eq) ((C74178nm) jN).f207130a.b.f200247fw.mo17428b(), (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b(), (C101860a) ((C74178nm) jN).f207135b.f205818a.mo17428b(), (ei) ((C74178nm) jN).f207130a.b.f200245fu.mo17428b(), (dn) ((C74178nm) jN).f207130a.b.f200233fi.mo17428b(), (C90743b) ((C74178nm) jN).f207130a.gx.mo17428b(), (C101888e) ((C74178nm) jN).f207136c.f205607cC.mo17428b(), (C101890g) ((C74178nm) jN).f207111H.mo17428b(), (C89859i) ((C74178nm) jN).f207130a.a.f202586Q.mo17428b(), (C101497ae) ((C74178nm) jN).f207109F.mo17428b(), ((C74178nm) jN).f207136c.mo69302ed());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f283707d, this.f283706c));
                    } else {
                        String obj = C101687bx.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f283707d;
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
                C101673bj.m168211a(th2, th3);
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
