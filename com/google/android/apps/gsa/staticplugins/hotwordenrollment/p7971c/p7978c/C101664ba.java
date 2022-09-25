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
import com.google.android.apps.gsa.binaries.satin.app.C74178nm;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ba */
/* compiled from: PG */
public final class C101664ba extends C101699h implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C101671bh f283680a;

    /* renamed from: b */
    private Context f283681b;

    /* renamed from: c */
    private final C2393x f283682c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f283683d = new C47515ab(this);

    /* renamed from: e */
    private boolean f283684e;

    @Deprecated
    public C101664ba() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final void mo92348a() {
        mo17754z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C68324h mo92473d() {
        return new C47243l(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f283681b == null) {
            this.f283681b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f283681b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f283683d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f283682c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f283683d.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C101671bh mo17754z() {
        C101671bh bhVar = this.f283680a;
        if (bhVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f283684e) {
            return bhVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f283683d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101662az.m168192a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f283683d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C101662az.m168192a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f283683d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101662az.m168192a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f283683d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101662az.m168192a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f283683d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C101662az.m168192a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r17, android.view.ViewGroup r18, android.os.Bundle r19) {
        /*
            r16 = this;
            r1 = r16
            com.google.apps.tiktok.tracing.ab r0 = r1.f283683d
            r0.mo51381i()
            super.onCreateView(r17, r18, r19)     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bh r0 = r16.mo17754z()     // Catch:{ all -> 0x04b5 }
            r2 = 2131626936(0x7f0e0bb8, float:1.8881122E38)
            r3 = 0
            r4 = r17
            r5 = r18
            android.view.View r2 = r4.inflate(r2, r5, r3)     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r2 = (com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout) r2     // Catch:{ all -> 0x04b5 }
            r4 = 2131434071(0x7f0b1a57, float:1.8489946E38)
            android.view.View r4 = r2.findViewById(r4)     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.opaonboarding.ui.HeaderLayout r4 = (com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout) r4     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bi r5 = r0.f283695e     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r6 = r5.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r6 = r6.mo92334g()     // Catch:{ all -> 0x04b5 }
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L_0x004f
            android.content.res.Resources r6 = r5.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r10 = r5.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r10 = r10.mo92329b()     // Catch:{ all -> 0x04b5 }
            r9[r3] = r10     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.assistant.settings.features.av.ei r10 = r5.f283699b     // Catch:{ all -> 0x04b5 }
            java.lang.String r5 = r5.f283702e     // Catch:{ all -> 0x04b5 }
            java.lang.String r5 = r10.d(r5)     // Catch:{ all -> 0x04b5 }
            r9[r8] = r5     // Catch:{ all -> 0x04b5 }
            r5 = 2132092727(0x7f152737, float:1.9825859E38)
            java.lang.String r5 = r6.getString(r5, r9)     // Catch:{ all -> 0x04b5 }
            goto L_0x0064
        L_0x004f:
            android.content.res.Resources r6 = r5.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.assistant.settings.features.av.ei r10 = r5.f283699b     // Catch:{ all -> 0x04b5 }
            java.lang.String r5 = r5.f283702e     // Catch:{ all -> 0x04b5 }
            java.lang.String r5 = r10.d(r5)     // Catch:{ all -> 0x04b5 }
            r9[r3] = r5     // Catch:{ all -> 0x04b5 }
            r5 = 2132092726(0x7f152736, float:1.9825857E38)
            java.lang.String r5 = r6.getString(r5, r9)     // Catch:{ all -> 0x04b5 }
        L_0x0064:
            android.widget.TextView r6 = r4.f228718a     // Catch:{ all -> 0x04b5 }
            android.widget.TextView$BufferType r9 = android.widget.TextView.BufferType.NORMAL     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r6, r5, r9, r4)     // Catch:{ all -> 0x04b5 }
            android.widget.TextView r5 = r4.f228719b     // Catch:{ all -> 0x04b5 }
            r5.setVisibility(r3)     // Catch:{ all -> 0x04b5 }
            android.widget.TextView r5 = r4.f228719b     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bi r6 = r0.f283695e     // Catch:{ all -> 0x04b5 }
            android.content.res.Resources r9 = r6.f283701d     // Catch:{ all -> 0x04b5 }
            r10 = 2132091133(0x7f1520fd, float:1.9822626E38)
            android.net.Uri r9 = com.google.android.apps.gsa.assistant.settings.shared.C73733af.m108288a(r9, r10)     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r10 = r6.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r10 = r10.mo92334g()     // Catch:{ all -> 0x04b5 }
            if (r10 == 0) goto L_0x00a5
            android.content.res.Resources r10 = r6.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r6 = r6.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r6 = r6.mo92329b()     // Catch:{ all -> 0x04b5 }
            r11[r3] = r6     // Catch:{ all -> 0x04b5 }
            r11[r8] = r9     // Catch:{ all -> 0x04b5 }
            r6 = 2132092725(0x7f152735, float:1.9825855E38)
            java.lang.String r6 = r10.getString(r6, r11)     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x04b5 }
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch:{ all -> 0x04b5 }
            java.lang.String r6 = com.android.p265e.C5114a.m13988b(r10, r6, r9)     // Catch:{ all -> 0x04b5 }
            goto L_0x00b2
        L_0x00a5:
            android.content.res.Resources r6 = r6.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x04b5 }
            r10[r3] = r9     // Catch:{ all -> 0x04b5 }
            r9 = 2132092724(0x7f152734, float:1.9825853E38)
            java.lang.String r6 = r6.getString(r9, r10)     // Catch:{ all -> 0x04b5 }
        L_0x00b2:
            com.google.android.apps.gsa.assistant.settings.shared.ao.a(r5, r6)     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bb r5 = new com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bb     // Catch:{ all -> 0x04b5 }
            r5.<init>(r0)     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.opaonboarding.ui.ag r5 = com.google.android.apps.gsa.opaonboarding.p6463ui.C83983ah.m133842b(r2, r5)     // Catch:{ all -> 0x04b5 }
            r5.mo77412a()     // Catch:{ all -> 0x04b5 }
            r5 = 2131429869(0x7f0b09ed, float:1.8481423E38)
            android.view.View r5 = r2.findViewById(r5)     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.assistant.settings.shared.ui.SectionHeaderView r5 = (com.google.android.apps.gsa.assistant.settings.shared.ui.SectionHeaderView) r5     // Catch:{ all -> 0x04b5 }
            r5.d()     // Catch:{ all -> 0x04b5 }
            r5 = 2131429862(0x7f0b09e6, float:1.8481409E38)
            android.view.View r5 = r2.findViewById(r5)     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ui.ExpandableItem r5 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p8009ui.ExpandableItem) r5     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bi r6 = r0.f283695e     // Catch:{ all -> 0x04b5 }
            int r9 = r6.f283703f     // Catch:{ all -> 0x04b5 }
            int r10 = r9 + -1
            if (r9 == 0) goto L_0x04b3
            java.lang.String r9 = ""
            switch(r10) {
                case 1: goto L_0x0100;
                case 2: goto L_0x0100;
                case 3: goto L_0x00e4;
                case 4: goto L_0x00e4;
                case 5: goto L_0x00e4;
                case 6: goto L_0x00e4;
                case 7: goto L_0x00e4;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            goto L_0x011c
        L_0x00e4:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r10 = r6.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r10 = r10.mo92334g()     // Catch:{ all -> 0x04b5 }
            if (r10 == 0) goto L_0x00f6
            android.content.res.Resources r6 = r6.f283701d     // Catch:{ all -> 0x04b5 }
            r10 = 2132092714(0x7f15272a, float:1.9825832E38)
            java.lang.String r6 = r6.getString(r10)     // Catch:{ all -> 0x04b5 }
            goto L_0x011d
        L_0x00f6:
            android.content.res.Resources r6 = r6.f283701d     // Catch:{ all -> 0x04b5 }
            r10 = 2132092713(0x7f152729, float:1.982583E38)
            java.lang.String r6 = r6.getString(r10)     // Catch:{ all -> 0x04b5 }
            goto L_0x011d
        L_0x0100:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r10 = r6.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r10 = r10.mo92334g()     // Catch:{ all -> 0x04b5 }
            if (r10 == 0) goto L_0x0112
            android.content.res.Resources r6 = r6.f283701d     // Catch:{ all -> 0x04b5 }
            r10 = 2132092716(0x7f15272c, float:1.9825836E38)
            java.lang.String r6 = r6.getString(r10)     // Catch:{ all -> 0x04b5 }
            goto L_0x011d
        L_0x0112:
            android.content.res.Resources r6 = r6.f283701d     // Catch:{ all -> 0x04b5 }
            r10 = 2132092715(0x7f15272b, float:1.9825834E38)
            java.lang.String r6 = r6.getString(r10)     // Catch:{ all -> 0x04b5 }
            goto L_0x011d
        L_0x011c:
            r6 = r9
        L_0x011d:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bi r10 = r0.f283695e     // Catch:{ all -> 0x04b5 }
            int r12 = r10.f283703f     // Catch:{ all -> 0x04b5 }
            int r13 = r12 + -1
            if (r12 == 0) goto L_0x04b1
            r12 = 2132092711(0x7f152727, float:1.9825826E38)
            switch(r13) {
                case 1: goto L_0x014f;
                case 2: goto L_0x014f;
                case 3: goto L_0x012c;
                case 4: goto L_0x012c;
                case 5: goto L_0x012c;
                case 6: goto L_0x012c;
                case 7: goto L_0x012c;
                default: goto L_0x012b;
            }     // Catch:{ all -> 0x04b5 }
        L_0x012b:
            goto L_0x0172
        L_0x012c:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r13 = r10.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r13 = r13.mo92334g()     // Catch:{ all -> 0x04b5 }
            if (r13 == 0) goto L_0x0145
            android.content.res.Resources r13 = r10.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r14 = new java.lang.Object[r8]     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r10 = r10.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r10 = r10.mo92329b()     // Catch:{ all -> 0x04b5 }
            r14[r3] = r10     // Catch:{ all -> 0x04b5 }
            java.lang.String r10 = r13.getString(r12, r14)     // Catch:{ all -> 0x04b5 }
            goto L_0x0173
        L_0x0145:
            android.content.res.Resources r10 = r10.f283701d     // Catch:{ all -> 0x04b5 }
            r12 = 2132092710(0x7f152726, float:1.9825824E38)
            java.lang.String r10 = r10.getString(r12)     // Catch:{ all -> 0x04b5 }
            goto L_0x0173
        L_0x014f:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r13 = r10.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r13 = r13.mo92334g()     // Catch:{ all -> 0x04b5 }
            if (r13 == 0) goto L_0x0168
            android.content.res.Resources r13 = r10.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r14 = new java.lang.Object[r8]     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r10 = r10.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r10 = r10.mo92329b()     // Catch:{ all -> 0x04b5 }
            r14[r3] = r10     // Catch:{ all -> 0x04b5 }
            java.lang.String r10 = r13.getString(r12, r14)     // Catch:{ all -> 0x04b5 }
            goto L_0x0173
        L_0x0168:
            android.content.res.Resources r10 = r10.f283701d     // Catch:{ all -> 0x04b5 }
            r12 = 2132092712(0x7f152728, float:1.9825828E38)
            java.lang.String r10 = r10.getString(r12)     // Catch:{ all -> 0x04b5 }
            goto L_0x0173
        L_0x0172:
            r10 = r9
        L_0x0173:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ba r12 = r0.f283691a     // Catch:{ all -> 0x04b5 }
            android.content.Context r12 = r12.requireContext()     // Catch:{ all -> 0x04b5 }
            r13 = 2131234421(0x7f080e75, float:1.8085007E38)
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r13)     // Catch:{ all -> 0x04b5 }
            android.widget.ScrollView r13 = r2.f228727b     // Catch:{ all -> 0x04b5 }
            r5.mo93027b(r6, r10, r12, r13)     // Catch:{ all -> 0x04b5 }
            r5 = 2131429868(0x7f0b09ec, float:1.848142E38)
            android.view.View r5 = r2.findViewById(r5)     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ui.ExpandableItem r5 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p8009ui.ExpandableItem) r5     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bi r6 = r0.f283695e     // Catch:{ all -> 0x04b5 }
            int r10 = r6.f283703f     // Catch:{ all -> 0x04b5 }
            int r12 = r10 + -1
            if (r10 == 0) goto L_0x04af
            switch(r12) {
                case 1: goto L_0x019a;
                case 2: goto L_0x019a;
                case 3: goto L_0x019a;
                case 4: goto L_0x019a;
                case 5: goto L_0x019a;
                case 6: goto L_0x019a;
                case 7: goto L_0x019a;
                default: goto L_0x0199;
            }     // Catch:{ all -> 0x04b5 }
        L_0x0199:
            goto L_0x01c0
        L_0x019a:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r10 = r6.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r10 = r10.mo92334g()     // Catch:{ all -> 0x04b5 }
            if (r10 == 0) goto L_0x01b6
            android.content.res.Resources r10 = r6.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r6 = r6.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r6 = r6.mo92329b()     // Catch:{ all -> 0x04b5 }
            r12[r3] = r6     // Catch:{ all -> 0x04b5 }
            r6 = 2132092731(0x7f15273b, float:1.9825867E38)
            java.lang.String r6 = r10.getString(r6, r12)     // Catch:{ all -> 0x04b5 }
            goto L_0x01c1
        L_0x01b6:
            android.content.res.Resources r6 = r6.f283701d     // Catch:{ all -> 0x04b5 }
            r10 = 2132092730(0x7f15273a, float:1.9825865E38)
            java.lang.String r6 = r6.getString(r10)     // Catch:{ all -> 0x04b5 }
            goto L_0x01c1
        L_0x01c0:
            r6 = r9
        L_0x01c1:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bi r10 = r0.f283695e     // Catch:{ all -> 0x04b5 }
            int r12 = r10.f283703f     // Catch:{ all -> 0x04b5 }
            int r13 = r12 + -1
            if (r12 == 0) goto L_0x04ad
            r12 = 2132092430(0x7f15260e, float:1.9825256E38)
            java.lang.String r14 = "GENDER"
            switch(r13) {
                case 1: goto L_0x01ff;
                case 2: goto L_0x01ff;
                case 3: goto L_0x01d2;
                case 4: goto L_0x01d2;
                case 5: goto L_0x01d2;
                case 6: goto L_0x01d2;
                case 7: goto L_0x01d2;
                default: goto L_0x01d1;
            }
        L_0x01d1:
            goto L_0x022c
        L_0x01d2:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r13 = r10.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r13 = r13.mo92334g()     // Catch:{ all -> 0x04b5 }
            if (r13 == 0) goto L_0x01f5
            android.content.res.Resources r13 = r10.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.String r12 = r13.getString(r12)     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x04b5 }
            r13[r3] = r14     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r10 = r10.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r10 = r10.mo92330c()     // Catch:{ all -> 0x04b5 }
            r13[r8] = r10     // Catch:{ all -> 0x04b5 }
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch:{ all -> 0x04b5 }
            java.lang.String r10 = com.android.p265e.C5114a.m13988b(r10, r12, r13)     // Catch:{ all -> 0x04b5 }
            goto L_0x022d
        L_0x01f5:
            android.content.res.Resources r10 = r10.f283701d     // Catch:{ all -> 0x04b5 }
            r12 = 2132092728(0x7f152738, float:1.982586E38)
            java.lang.String r10 = r10.getString(r12)     // Catch:{ all -> 0x04b5 }
            goto L_0x022d
        L_0x01ff:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r13 = r10.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r13 = r13.mo92334g()     // Catch:{ all -> 0x04b5 }
            if (r13 == 0) goto L_0x0222
            android.content.res.Resources r13 = r10.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.String r12 = r13.getString(r12)     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x04b5 }
            r13[r3] = r14     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r10 = r10.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r10 = r10.mo92330c()     // Catch:{ all -> 0x04b5 }
            r13[r8] = r10     // Catch:{ all -> 0x04b5 }
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch:{ all -> 0x04b5 }
            java.lang.String r10 = com.android.p265e.C5114a.m13988b(r10, r12, r13)     // Catch:{ all -> 0x04b5 }
            goto L_0x022d
        L_0x0222:
            android.content.res.Resources r10 = r10.f283701d     // Catch:{ all -> 0x04b5 }
            r12 = 2132092729(0x7f152739, float:1.9825863E38)
            java.lang.String r10 = r10.getString(r12)     // Catch:{ all -> 0x04b5 }
            goto L_0x022d
        L_0x022c:
            r10 = r9
        L_0x022d:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ba r12 = r0.f283691a     // Catch:{ all -> 0x04b5 }
            android.content.Context r12 = r12.requireContext()     // Catch:{ all -> 0x04b5 }
            r13 = 2131234332(0x7f080e1c, float:1.8084827E38)
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r13)     // Catch:{ all -> 0x04b5 }
            android.widget.ScrollView r13 = r2.f228727b     // Catch:{ all -> 0x04b5 }
            r5.mo93027b(r6, r10, r12, r13)     // Catch:{ all -> 0x04b5 }
            r5 = 2131429870(0x7f0b09ee, float:1.8481425E38)
            android.view.View r5 = r2.findViewById(r5)     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ui.ExpandableItem r5 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p8009ui.ExpandableItem) r5     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bi r6 = r0.f283695e     // Catch:{ all -> 0x04b5 }
            int r10 = r6.f283703f     // Catch:{ all -> 0x04b5 }
            int r12 = r10 + -1
            if (r10 == 0) goto L_0x04ab
            r10 = 2132092433(0x7f152611, float:1.9825262E38)
            switch(r12) {
                case 1: goto L_0x027a;
                case 2: goto L_0x0257;
                case 3: goto L_0x027a;
                case 4: goto L_0x0257;
                case 5: goto L_0x027a;
                case 6: goto L_0x0257;
                case 7: goto L_0x0257;
                default: goto L_0x0256;
            }     // Catch:{ all -> 0x04b5 }
        L_0x0256:
            goto L_0x029d
        L_0x0257:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r12 = r6.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r12 = r12.mo92334g()     // Catch:{ all -> 0x04b5 }
            if (r12 == 0) goto L_0x0270
            android.content.res.Resources r12 = r6.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r6 = r6.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r6 = r6.mo92329b()     // Catch:{ all -> 0x04b5 }
            r13[r3] = r6     // Catch:{ all -> 0x04b5 }
            java.lang.String r6 = r12.getString(r10, r13)     // Catch:{ all -> 0x04b5 }
            goto L_0x029e
        L_0x0270:
            android.content.res.Resources r6 = r6.f283701d     // Catch:{ all -> 0x04b5 }
            r10 = 2132092735(0x7f15273f, float:1.9825875E38)
            java.lang.String r6 = r6.getString(r10)     // Catch:{ all -> 0x04b5 }
            goto L_0x029e
        L_0x027a:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r12 = r6.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r12 = r12.mo92334g()     // Catch:{ all -> 0x04b5 }
            if (r12 == 0) goto L_0x0293
            android.content.res.Resources r12 = r6.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r6 = r6.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r6 = r6.mo92329b()     // Catch:{ all -> 0x04b5 }
            r13[r3] = r6     // Catch:{ all -> 0x04b5 }
            java.lang.String r6 = r12.getString(r10, r13)     // Catch:{ all -> 0x04b5 }
            goto L_0x029e
        L_0x0293:
            android.content.res.Resources r6 = r6.f283701d     // Catch:{ all -> 0x04b5 }
            r10 = 2132092734(0x7f15273e, float:1.9825873E38)
            java.lang.String r6 = r6.getString(r10)     // Catch:{ all -> 0x04b5 }
            goto L_0x029e
        L_0x029d:
            r6 = r9
        L_0x029e:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bi r10 = r0.f283695e     // Catch:{ all -> 0x04b5 }
            int r12 = r10.f283703f     // Catch:{ all -> 0x04b5 }
            int r13 = r12 + -1
            if (r12 == 0) goto L_0x04a9
            switch(r13) {
                case 1: goto L_0x02e5;
                case 2: goto L_0x02ab;
                case 3: goto L_0x02e5;
                case 4: goto L_0x02ab;
                case 5: goto L_0x02e5;
                case 6: goto L_0x02ab;
                case 7: goto L_0x02ab;
                default: goto L_0x02a9;
            }     // Catch:{ all -> 0x04b5 }
        L_0x02a9:
            goto L_0x031f
        L_0x02ab:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r12 = r10.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r12 = r12.mo92334g()     // Catch:{ all -> 0x04b5 }
            if (r12 == 0) goto L_0x02db
            android.content.res.Resources r12 = r10.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r15 = r10.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r15 = r15.mo92329b()     // Catch:{ all -> 0x04b5 }
            r13[r3] = r15     // Catch:{ all -> 0x04b5 }
            r15 = 2132092432(0x7f152610, float:1.982526E38)
            java.lang.String r12 = r12.getString(r15, r13)     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x04b5 }
            r13[r3] = r14     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r10 = r10.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r10 = r10.mo92330c()     // Catch:{ all -> 0x04b5 }
            r13[r8] = r10     // Catch:{ all -> 0x04b5 }
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch:{ all -> 0x04b5 }
            java.lang.String r10 = com.android.p265e.C5114a.m13988b(r10, r12, r13)     // Catch:{ all -> 0x04b5 }
            goto L_0x0320
        L_0x02db:
            android.content.res.Resources r10 = r10.f283701d     // Catch:{ all -> 0x04b5 }
            r12 = 2132092733(0x7f15273d, float:1.982587E38)
            java.lang.String r10 = r10.getString(r12)     // Catch:{ all -> 0x04b5 }
            goto L_0x0320
        L_0x02e5:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r12 = r10.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r12 = r12.mo92334g()     // Catch:{ all -> 0x04b5 }
            if (r12 == 0) goto L_0x0315
            android.content.res.Resources r12 = r10.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r15 = r10.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r15 = r15.mo92329b()     // Catch:{ all -> 0x04b5 }
            r13[r3] = r15     // Catch:{ all -> 0x04b5 }
            r15 = 2132092431(0x7f15260f, float:1.9825258E38)
            java.lang.String r12 = r12.getString(r15, r13)     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x04b5 }
            r13[r3] = r14     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r10 = r10.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r10 = r10.mo92330c()     // Catch:{ all -> 0x04b5 }
            r13[r8] = r10     // Catch:{ all -> 0x04b5 }
            java.util.Locale r10 = java.util.Locale.getDefault()     // Catch:{ all -> 0x04b5 }
            java.lang.String r10 = com.android.p265e.C5114a.m13988b(r10, r12, r13)     // Catch:{ all -> 0x04b5 }
            goto L_0x0320
        L_0x0315:
            android.content.res.Resources r10 = r10.f283701d     // Catch:{ all -> 0x04b5 }
            r12 = 2132092732(0x7f15273c, float:1.9825869E38)
            java.lang.String r10 = r10.getString(r12)     // Catch:{ all -> 0x04b5 }
            goto L_0x0320
        L_0x031f:
            r10 = r9
        L_0x0320:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ba r12 = r0.f283691a     // Catch:{ all -> 0x04b5 }
            android.content.Context r12 = r12.requireContext()     // Catch:{ all -> 0x04b5 }
            r13 = 2131234365(0x7f080e3d, float:1.8084894E38)
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r13)     // Catch:{ all -> 0x04b5 }
            android.widget.ScrollView r14 = r2.f228727b     // Catch:{ all -> 0x04b5 }
            r5.mo93027b(r6, r10, r12, r14)     // Catch:{ all -> 0x04b5 }
            r5 = 2131429864(0x7f0b09e8, float:1.8481413E38)
            android.view.View r5 = r2.findViewById(r5)     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ui.ExpandableItem r5 = (com.google.android.apps.gsa.staticplugins.hotwordenrollment.p8009ui.ExpandableItem) r5     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bi r6 = r0.f283695e     // Catch:{ all -> 0x04b5 }
            int r10 = r6.f283703f     // Catch:{ all -> 0x04b5 }
            r12 = 3
            if (r10 == r7) goto L_0x0419
            if (r10 == r12) goto L_0x0419
            if (r10 == r8) goto L_0x0419
            int r7 = r10 + -1
            if (r10 == 0) goto L_0x0417
            r10 = 7
            r14 = 6
            r15 = 5
            r11 = 4
            if (r7 == r12) goto L_0x0380
            if (r7 == r11) goto L_0x0380
            if (r7 == r15) goto L_0x0380
            if (r7 == r14) goto L_0x0380
            if (r7 == r10) goto L_0x035a
            r6 = r9
            goto L_0x03a5
        L_0x035a:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r7 = r6.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r7 = r7.mo92334g()     // Catch:{ all -> 0x04b5 }
            if (r7 == 0) goto L_0x0376
            android.content.res.Resources r7 = r6.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r6 = r6.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r6 = r6.mo92329b()     // Catch:{ all -> 0x04b5 }
            r13[r3] = r6     // Catch:{ all -> 0x04b5 }
            r6 = 2132092722(0x7f152732, float:1.9825849E38)
            java.lang.String r6 = r7.getString(r6, r13)     // Catch:{ all -> 0x04b5 }
            goto L_0x03a5
        L_0x0376:
            android.content.res.Resources r6 = r6.f283701d     // Catch:{ all -> 0x04b5 }
            r7 = 2132092721(0x7f152731, float:1.9825846E38)
            java.lang.String r6 = r6.getString(r7)     // Catch:{ all -> 0x04b5 }
            goto L_0x03a5
        L_0x0380:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r7 = r6.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r7 = r7.mo92334g()     // Catch:{ all -> 0x04b5 }
            if (r7 == 0) goto L_0x039c
            android.content.res.Resources r7 = r6.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r6 = r6.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r6 = r6.mo92329b()     // Catch:{ all -> 0x04b5 }
            r13[r3] = r6     // Catch:{ all -> 0x04b5 }
            r6 = 2132092429(0x7f15260d, float:1.9825254E38)
            java.lang.String r6 = r7.getString(r6, r13)     // Catch:{ all -> 0x04b5 }
            goto L_0x03a5
        L_0x039c:
            android.content.res.Resources r6 = r6.f283701d     // Catch:{ all -> 0x04b5 }
            r7 = 2132092720(0x7f152730, float:1.9825844E38)
            java.lang.String r6 = r6.getString(r7)     // Catch:{ all -> 0x04b5 }
        L_0x03a5:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bi r7 = r0.f283695e     // Catch:{ all -> 0x04b5 }
            int r13 = r7.f283703f     // Catch:{ all -> 0x04b5 }
            int r3 = r13 + -1
            if (r13 == 0) goto L_0x0415
            r13 = 2132092428(0x7f15260c, float:1.9825252E38)
            if (r3 == r12) goto L_0x03df
            if (r3 == r11) goto L_0x03df
            if (r3 == r15) goto L_0x03df
            if (r3 == r14) goto L_0x03df
            if (r3 == r10) goto L_0x03bb
            goto L_0x0402
        L_0x03bb:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r3 = r7.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r3 = r3.mo92334g()     // Catch:{ all -> 0x04b5 }
            if (r3 == 0) goto L_0x03d5
            android.content.res.Resources r3 = r7.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r7 = r7.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r7 = r7.mo92329b()     // Catch:{ all -> 0x04b5 }
            r10 = 0
            r9[r10] = r7     // Catch:{ all -> 0x04b5 }
            java.lang.String r9 = r3.getString(r13, r9)     // Catch:{ all -> 0x04b5 }
            goto L_0x0402
        L_0x03d5:
            android.content.res.Resources r3 = r7.f283701d     // Catch:{ all -> 0x04b5 }
            r7 = 2132092719(0x7f15272f, float:1.9825842E38)
            java.lang.String r9 = r3.getString(r7)     // Catch:{ all -> 0x04b5 }
            goto L_0x0402
        L_0x03df:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r3 = r7.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r3 = r3.mo92334g()     // Catch:{ all -> 0x04b5 }
            if (r3 == 0) goto L_0x03f9
            android.content.res.Resources r3 = r7.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r7 = r7.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r7 = r7.mo92329b()     // Catch:{ all -> 0x04b5 }
            r10 = 0
            r9[r10] = r7     // Catch:{ all -> 0x04b5 }
            java.lang.String r9 = r3.getString(r13, r9)     // Catch:{ all -> 0x04b5 }
            goto L_0x0402
        L_0x03f9:
            android.content.res.Resources r3 = r7.f283701d     // Catch:{ all -> 0x04b5 }
            r7 = 2132092718(0x7f15272e, float:1.982584E38)
            java.lang.String r9 = r3.getString(r7)     // Catch:{ all -> 0x04b5 }
        L_0x0402:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ba r3 = r0.f283691a     // Catch:{ all -> 0x04b5 }
            android.content.Context r3 = r3.requireContext()     // Catch:{ all -> 0x04b5 }
            r7 = 2131234365(0x7f080e3d, float:1.8084894E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r7)     // Catch:{ all -> 0x04b5 }
            android.widget.ScrollView r7 = r2.f228727b     // Catch:{ all -> 0x04b5 }
            r5.mo93027b(r6, r9, r3, r7)     // Catch:{ all -> 0x04b5 }
            goto L_0x041e
        L_0x0415:
            r0 = 0
            throw r0     // Catch:{ all -> 0x04b5 }
        L_0x0417:
            r0 = 0
            throw r0     // Catch:{ all -> 0x04b5 }
        L_0x0419:
            r3 = 8
            r5.setVisibility(r3)     // Catch:{ all -> 0x04b5 }
        L_0x041e:
            r3 = 2131429872(0x7f0b09f0, float:1.848143E38)
            android.view.View r3 = r2.findViewById(r3)     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.assistant.settings.shared.ui.SectionHeaderView r3 = (com.google.android.apps.gsa.assistant.settings.shared.ui.SectionHeaderView) r3     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bi r5 = r0.f283695e     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r6 = r5.f283700c     // Catch:{ all -> 0x04b5 }
            boolean r6 = r6.mo92334g()     // Catch:{ all -> 0x04b5 }
            if (r6 == 0) goto L_0x0446
            android.content.res.Resources r6 = r5.f283701d     // Catch:{ all -> 0x04b5 }
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r5 = r5.f283700c     // Catch:{ all -> 0x04b5 }
            java.lang.String r5 = r5.mo92329b()     // Catch:{ all -> 0x04b5 }
            r8 = 0
            r7[r8] = r5     // Catch:{ all -> 0x04b5 }
            r5 = 2132092709(0x7f152725, float:1.9825822E38)
            java.lang.String r5 = r6.getString(r5, r7)     // Catch:{ all -> 0x04b5 }
            goto L_0x044f
        L_0x0446:
            android.content.res.Resources r5 = r5.f283701d     // Catch:{ all -> 0x04b5 }
            r6 = 2132092708(0x7f152724, float:1.982582E38)
            java.lang.String r5 = r5.getString(r6)     // Catch:{ all -> 0x04b5 }
        L_0x044f:
            r3.c(r5)     // Catch:{ all -> 0x04b5 }
            r3 = 2131429871(0x7f0b09ef, float:1.8481427E38)
            android.view.View r3 = r2.findViewById(r3)     // Catch:{ all -> 0x04b5 }
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ba r5 = r0.f283691a     // Catch:{ all -> 0x04b5 }
            r6 = 2132092723(0x7f152733, float:1.982585E38)
            java.lang.String r5 = r5.getString(r6)     // Catch:{ all -> 0x04b5 }
            r6 = 2131234794(0x7f080fea, float:1.8085764E38)
            com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView r5 = r0.mo92480b(r5, r6)     // Catch:{ all -> 0x04b5 }
            r3.addView(r5)     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.assistant.settings.features.av.ei r5 = r0.f283693c     // Catch:{ all -> 0x04b5 }
            java.lang.String r6 = r0.f283692b     // Catch:{ all -> 0x04b5 }
            java.util.List r5 = r5.j(r6, r12)     // Catch:{ all -> 0x04b5 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x04b5 }
        L_0x047a:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x04b5 }
            if (r6 == 0) goto L_0x0496
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.assistant.settings.features.av.n r6 = (com.google.android.apps.gsa.assistant.settings.features.p5702av.C72879n) r6     // Catch:{ all -> 0x04b5 }
            java.lang.String r7 = r6.mo64575c()     // Catch:{ all -> 0x04b5 }
            int r6 = r6.mo64573a()     // Catch:{ all -> 0x04b5 }
            com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView r6 = r0.mo92480b(r7, r6)     // Catch:{ all -> 0x04b5 }
            r3.addView(r6)     // Catch:{ all -> 0x04b5 }
            goto L_0x047a
        L_0x0496:
            com.google.android.apps.gsa.shared.util.b r0 = r0.f283696f     // Catch:{ all -> 0x04b5 }
            boolean r0 = r0.mo85090c()     // Catch:{ all -> 0x04b5 }
            if (r0 == 0) goto L_0x04a5
            android.widget.TextView r0 = r4.f228718a     // Catch:{ all -> 0x04b5 }
            r3 = 500(0x1f4, double:2.47E-321)
            com.google.android.apps.gsa.shared.util.C90743b.m148214a(r0, r3)     // Catch:{ all -> 0x04b5 }
        L_0x04a5:
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r2
        L_0x04a9:
            r0 = 0
            throw r0     // Catch:{ all -> 0x04b5 }
        L_0x04ab:
            r0 = 0
            throw r0     // Catch:{ all -> 0x04b5 }
        L_0x04ad:
            r0 = 0
            throw r0     // Catch:{ all -> 0x04b5 }
        L_0x04af:
            r0 = 0
            throw r0     // Catch:{ all -> 0x04b5 }
        L_0x04b1:
            r0 = 0
            throw r0     // Catch:{ all -> 0x04b5 }
        L_0x04b3:
            r0 = 0
            throw r0     // Catch:{ all -> 0x04b5 }
        L_0x04b5:
            r0 = move-exception
            r2 = r0
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x04bb }
            goto L_0x04c0
        L_0x04bb:
            r0 = move-exception
            r3 = r0
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101662az.m168192a(r2, r3)
        L_0x04c0:
            goto L_0x04c2
        L_0x04c1:
            throw r2
        L_0x04c2:
            goto L_0x04c1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101664ba.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        C47573bx b = this.f283683d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C101662az.m168192a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f283683d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C101662az.m168192a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f283683d.mo51376d();
        try {
            super.onDetach();
            this.f283684e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C101662az.m168192a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f283683d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C101662az.m168192a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f283683d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C101662az.m168192a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f283683d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101662az.m168192a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f283683d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C101662az.m168192a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f283683d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f283683d.mo51381i();
        try {
            super.onStart();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101662az.m168192a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f283683d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C101662az.m168192a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f283683d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f283683d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f283683d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f283683d;
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
        C47515ab abVar = this.f283683d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f283683d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f283683d;
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
        this.f283683d.mo51381i();
        try {
            if (!this.f283684e) {
                super.onAttach(context);
                if (this.f283680a == null) {
                    Object jN = mo92509b().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74178nm) jN).f207137d).f184583a;
                    if (fragment instanceof C101664ba) {
                        C101664ba baVar = (C101664ba) fragment;
                        C68225k.m98532d(baVar);
                        au auVar = (au) ((C74178nm) jN).f207130a.b.f200246fv.mo17428b();
                        this.f283680a = new C101671bh(baVar, ((C74178nm) jN).mo70080v(), (C74555u) ((C74178nm) jN).f207136c.f205594bq.mo17428b(), (ei) ((C74178nm) jN).f207130a.b.f200245fu.mo17428b(), (dn) ((C74178nm) jN).f207130a.b.f200233fi.mo17428b(), new C101672bi((ei) ((C74178nm) jN).f207130a.b.f200245fu.mo17428b(), (C101497ae) ((C74178nm) jN).f207109F.mo17428b(), (Context) ((C74178nm) jN).f207130a.g.mo17428b()), (C90743b) ((C74178nm) jN).f207130a.gx.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f283683d, this.f283682c));
                    } else {
                        String obj = C101671bh.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f283683d;
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
                C101662az.m168192a(th, th2);
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
