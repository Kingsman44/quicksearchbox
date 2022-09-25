package com.google.android.apps.search.googleapp.notificationsurvey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.p10310h.C136131l;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
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
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.notificationsurvey.d */
/* compiled from: PG */
public final class C136813d extends C136828r implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C136817h f372401a;

    /* renamed from: c */
    private Context f372402c;

    /* renamed from: d */
    private final C2393x f372403d = new C2393x(this);

    /* renamed from: e */
    private boolean f372404e;

    @Deprecated
    public C136813d() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C136817h mo17754z() {
        C136817h hVar = this.f372401a;
        if (hVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f372404e) {
            return hVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo113384b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f372402c == null) {
            this.f372402c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f372402c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f372403d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136812c.m222488a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C136817h a = mo17754z();
            a.f372410b.mo50429i(a.f372411c);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C136812c.m222488a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0174, code lost:
        if (r3 == null) goto L_0x0176;
     */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01b1 A[Catch:{ all -> 0x0281, all -> 0x0287 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01d5 A[Catch:{ all -> 0x0281, all -> 0x0287 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r18, android.view.ViewGroup r19, android.os.Bundle r20) {
        /*
            r17 = this;
            r1 = r17
            com.google.apps.tiktok.tracing.ab r0 = r1.f122869b
            r0.mo51381i()
            r17.mo51119t(r18, r19, r20)     // Catch:{ all -> 0x0281 }
            com.google.android.apps.search.googleapp.notificationsurvey.h r0 = r17.mo17754z()     // Catch:{ all -> 0x0281 }
            r2 = 2131625334(0x7f0e0576, float:1.8877873E38)
            r3 = 0
            r4 = r18
            r5 = r19
            android.view.View r2 = r4.inflate(r2, r5, r3)     // Catch:{ all -> 0x0281 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ all -> 0x0281 }
            com.google.android.apps.search.googleapp.notificationsurvey.f r4 = com.google.android.apps.search.googleapp.notificationsurvey.C136815f.f372406a     // Catch:{ all -> 0x0281 }
            r2.setOnTouchListener(r4)     // Catch:{ all -> 0x0281 }
            com.google.ai.b.gc r4 = r0.f372415g     // Catch:{ all -> 0x0281 }
            com.google.ai.b.yk r4 = r4.f26848e     // Catch:{ all -> 0x0281 }
            if (r4 != 0) goto L_0x0029
            com.google.ai.b.yk r4 = com.google.p375ai.p378b.C8178yk.f28736g     // Catch:{ all -> 0x0281 }
        L_0x0029:
            boolean r4 = com.google.android.apps.search.googleapp.notificationsurvey.C136817h.m222496b(r4)     // Catch:{ all -> 0x0281 }
            r5 = 2
            r6 = 5
            if (r4 != 0) goto L_0x0032
            goto L_0x0074
        L_0x0032:
            com.google.ai.b.gc r4 = r0.f372415g     // Catch:{ all -> 0x0281 }
            com.google.ai.b.yk r4 = r4.f26848e     // Catch:{ all -> 0x0281 }
            if (r4 != 0) goto L_0x003a
            com.google.ai.b.yk r4 = com.google.p375ai.p378b.C8178yk.f28736g     // Catch:{ all -> 0x0281 }
        L_0x003a:
            int r7 = r4.f28739b     // Catch:{ all -> 0x0281 }
            if (r7 != r6) goto L_0x0043
            java.lang.Object r4 = r4.f28740c     // Catch:{ all -> 0x0281 }
            com.google.common.o.l.n r4 = (com.google.common.p4552o.p4566l.C60214n) r4     // Catch:{ all -> 0x0281 }
            goto L_0x0045
        L_0x0043:
            com.google.common.o.l.n r4 = com.google.common.p4552o.p4566l.C60214n.f162914g     // Catch:{ all -> 0x0281 }
        L_0x0045:
            boolean r7 = r0.f372418j     // Catch:{ all -> 0x0281 }
            if (r7 == 0) goto L_0x0062
            com.google.android.libraries.logging.ve.ab r7 = r0.f372417i     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.logging.ve.af r8 = r7.f76990a     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.logging.ve.h r4 = com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak.m53062d(r4)     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.logging.ve.c r4 = r8.mo33805a(r4)     // Catch:{ all -> 0x0281 }
            com.google.common.o.e.a r8 = com.google.common.p4552o.p4559e.C59743a.NOW_VISUAL_ELEMENTS_INTERACTION_LOG_EVENT     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.logging.ve.g r8 = com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak.m53060b(r8)     // Catch:{ all -> 0x0281 }
            r4.mo33859g(r8)     // Catch:{ all -> 0x0281 }
            r7.mo33801b(r2, r4)     // Catch:{ all -> 0x0281 }
            goto L_0x0074
        L_0x0062:
            com.google.android.libraries.logging.ve.af r7 = r0.f372416h     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.logging.ve.ab r7 = r7.f76997b     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.logging.ve.h r4 = com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak.m53062d(r4)     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.logging.ve.c r4 = r7.mo33800a(r4)     // Catch:{ all -> 0x0281 }
            r4.mo33860h(r5)     // Catch:{ all -> 0x0281 }
            r4.mo33809b(r2)     // Catch:{ all -> 0x0281 }
        L_0x0074:
            r4 = 2131431741(0x7f0b113d, float:1.848522E38)
            android.view.View r4 = r2.findViewById(r4)     // Catch:{ all -> 0x0281 }
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x0281 }
            if (r4 == 0) goto L_0x027d
            r7 = 2131431742(0x7f0b113e, float:1.8485222E38)
            android.view.View r7 = r4.findViewById(r7)     // Catch:{ all -> 0x0281 }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ all -> 0x0281 }
            r8 = 1
            if (r7 == 0) goto L_0x0097
            com.google.ai.b.gc r9 = r0.f372415g     // Catch:{ all -> 0x0281 }
            int r10 = r9.f26844a     // Catch:{ all -> 0x0281 }
            r10 = r10 & r8
            if (r10 == 0) goto L_0x0097
            java.lang.String r9 = r9.f26845b     // Catch:{ all -> 0x0281 }
            r7.setText(r9)     // Catch:{ all -> 0x0281 }
        L_0x0097:
            r7 = 2131431738(0x7f0b113a, float:1.8485214E38)
            android.view.View r7 = r4.findViewById(r7)     // Catch:{ all -> 0x0281 }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ all -> 0x0281 }
            r9 = 2131431739(0x7f0b113b, float:1.8485216E38)
            android.view.View r9 = r4.findViewById(r9)     // Catch:{ all -> 0x0281 }
            android.widget.TextView r9 = (android.widget.TextView) r9     // Catch:{ all -> 0x0281 }
            r10 = 4
            if (r7 == 0) goto L_0x00bb
            com.google.ai.b.gc r11 = r0.f372415g     // Catch:{ all -> 0x0281 }
            int r12 = r11.f26844a     // Catch:{ all -> 0x0281 }
            r12 = r12 & r10
            if (r12 == 0) goto L_0x00bb
            java.lang.String r11 = r11.f26847d     // Catch:{ all -> 0x0281 }
            r7.setText(r11)     // Catch:{ all -> 0x0281 }
            r7.setVisibility(r3)     // Catch:{ all -> 0x0281 }
        L_0x00bb:
            if (r9 == 0) goto L_0x00cc
            com.google.ai.b.gc r7 = r0.f372415g     // Catch:{ all -> 0x0281 }
            int r11 = r7.f26844a     // Catch:{ all -> 0x0281 }
            r11 = r11 & r5
            if (r11 == 0) goto L_0x00cc
            java.lang.String r7 = r7.f26846c     // Catch:{ all -> 0x0281 }
            r9.setText(r7)     // Catch:{ all -> 0x0281 }
            r9.setVisibility(r3)     // Catch:{ all -> 0x0281 }
        L_0x00cc:
            r7 = 2131431743(0x7f0b113f, float:1.8485224E38)
            android.view.View r7 = r4.findViewById(r7)     // Catch:{ all -> 0x0281 }
            com.google.android.apps.search.googleapp.notificationsurvey.RatingView r7 = (com.google.android.apps.search.googleapp.notificationsurvey.RatingView) r7     // Catch:{ all -> 0x0281 }
            if (r7 != 0) goto L_0x00d9
            goto L_0x0208
        L_0x00d9:
            com.google.android.apps.search.googleapp.notificationsurvey.j r7 = r7.mo17754z()     // Catch:{ all -> 0x0281 }
            com.google.ai.b.gc r9 = r0.f372415g     // Catch:{ all -> 0x0281 }
            com.google.bv.e.b.b r11 = r0.f372414f     // Catch:{ all -> 0x0281 }
            int r12 = r9.f26844a     // Catch:{ all -> 0x0281 }
            r12 = r12 & r5
            java.lang.String r13 = " "
            if (r12 == 0) goto L_0x0113
            java.lang.String r12 = r9.f26846c     // Catch:{ all -> 0x0281 }
            boolean r14 = r12.isEmpty()     // Catch:{ all -> 0x0281 }
            if (r14 != 0) goto L_0x00f8
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0281 }
            java.lang.String r12 = r13.concat(r12)     // Catch:{ all -> 0x0281 }
        L_0x00f8:
            android.support.v7.widget.AppCompatImageView[] r14 = r7.f372424a     // Catch:{ all -> 0x0281 }
            r14 = r14[r10]     // Catch:{ all -> 0x0281 }
            java.lang.CharSequence r15 = r14.getContentDescription()     // Catch:{ all -> 0x0281 }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0281 }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0281 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0281 }
            java.lang.String r12 = r15.concat(r12)     // Catch:{ all -> 0x0281 }
            r14.setContentDescription(r12)     // Catch:{ all -> 0x0281 }
        L_0x0113:
            int r12 = r9.f26844a     // Catch:{ all -> 0x0281 }
            r12 = r12 & r10
            if (r12 == 0) goto L_0x0143
            java.lang.String r12 = r9.f26847d     // Catch:{ all -> 0x0281 }
            boolean r14 = r12.isEmpty()     // Catch:{ all -> 0x0281 }
            if (r14 != 0) goto L_0x0128
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0281 }
            java.lang.String r12 = r13.concat(r12)     // Catch:{ all -> 0x0281 }
        L_0x0128:
            android.support.v7.widget.AppCompatImageView[] r13 = r7.f372424a     // Catch:{ all -> 0x0281 }
            r13 = r13[r3]     // Catch:{ all -> 0x0281 }
            java.lang.CharSequence r14 = r13.getContentDescription()     // Catch:{ all -> 0x0281 }
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0281 }
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0281 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0281 }
            java.lang.String r12 = r14.concat(r12)     // Catch:{ all -> 0x0281 }
            r13.setContentDescription(r12)     // Catch:{ all -> 0x0281 }
        L_0x0143:
            r12 = 0
        L_0x0144:
            android.support.v7.widget.AppCompatImageView[] r13 = r7.f372424a     // Catch:{ all -> 0x0281 }
            if (r12 >= r6) goto L_0x0201
            r13 = r13[r12]     // Catch:{ all -> 0x0281 }
            int[] r14 = new int[r6]     // Catch:{ all -> 0x0281 }
            r14[r3] = r8     // Catch:{ all -> 0x0281 }
            r14[r8] = r5     // Catch:{ all -> 0x0281 }
            r15 = 3
            r14[r5] = r15     // Catch:{ all -> 0x0281 }
            r14[r15] = r10     // Catch:{ all -> 0x0281 }
            r14[r10] = r6     // Catch:{ all -> 0x0281 }
            r14 = r14[r12]     // Catch:{ all -> 0x0281 }
            int r3 = r14 + -1
            r16 = 0
            if (r14 == 0) goto L_0x0200
            if (r3 == 0) goto L_0x019a
            if (r3 == r8) goto L_0x018f
            if (r3 == r5) goto L_0x0184
            if (r3 == r15) goto L_0x0179
            if (r3 == r10) goto L_0x016c
        L_0x0169:
            r3 = r16
            goto L_0x01a5
        L_0x016c:
            int r3 = r9.f26844a     // Catch:{ all -> 0x0281 }
            r3 = r3 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0169
            com.google.ai.b.yk r3 = r9.f26854k     // Catch:{ all -> 0x0281 }
            if (r3 != 0) goto L_0x01a5
        L_0x0176:
            com.google.ai.b.yk r16 = com.google.p375ai.p378b.C8178yk.f28736g     // Catch:{ all -> 0x0281 }
            goto L_0x0169
        L_0x0179:
            int r3 = r9.f26844a     // Catch:{ all -> 0x0281 }
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0169
            com.google.ai.b.yk r3 = r9.f26853j     // Catch:{ all -> 0x0281 }
            if (r3 != 0) goto L_0x01a5
            goto L_0x0176
        L_0x0184:
            int r3 = r9.f26844a     // Catch:{ all -> 0x0281 }
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0169
            com.google.ai.b.yk r3 = r9.f26852i     // Catch:{ all -> 0x0281 }
            if (r3 != 0) goto L_0x01a5
            goto L_0x0176
        L_0x018f:
            int r3 = r9.f26844a     // Catch:{ all -> 0x0281 }
            r3 = r3 & 64
            if (r3 == 0) goto L_0x0169
            com.google.ai.b.yk r3 = r9.f26851h     // Catch:{ all -> 0x0281 }
            if (r3 != 0) goto L_0x01a5
            goto L_0x0176
        L_0x019a:
            int r3 = r9.f26844a     // Catch:{ all -> 0x0281 }
            r3 = r3 & 32
            if (r3 == 0) goto L_0x0169
            com.google.ai.b.yk r3 = r9.f26850g     // Catch:{ all -> 0x0281 }
            if (r3 != 0) goto L_0x01a5
            goto L_0x0176
        L_0x01a5:
            if (r3 == 0) goto L_0x01f2
            boolean r14 = com.google.android.apps.search.googleapp.notificationsurvey.C136820j.m222501a(r3)     // Catch:{ all -> 0x0281 }
            if (r14 == 0) goto L_0x01f2
            boolean r14 = r7.f372428e     // Catch:{ all -> 0x0281 }
            if (r14 == 0) goto L_0x01d5
            com.google.android.libraries.logging.ve.ab r14 = r7.f372427d     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.logging.ve.af r15 = r14.f76990a     // Catch:{ all -> 0x0281 }
            int r8 = r3.f28739b     // Catch:{ all -> 0x0281 }
            if (r8 != r6) goto L_0x01be
            java.lang.Object r8 = r3.f28740c     // Catch:{ all -> 0x0281 }
            com.google.common.o.l.n r8 = (com.google.common.p4552o.p4566l.C60214n) r8     // Catch:{ all -> 0x0281 }
            goto L_0x01c0
        L_0x01be:
            com.google.common.o.l.n r8 = com.google.common.p4552o.p4566l.C60214n.f162914g     // Catch:{ all -> 0x0281 }
        L_0x01c0:
            com.google.android.libraries.logging.ve.h r8 = com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak.m53062d(r8)     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.logging.ve.c r8 = r15.mo33805a(r8)     // Catch:{ all -> 0x0281 }
            com.google.common.o.e.a r15 = com.google.common.p4552o.p4559e.C59743a.NOW_VISUAL_ELEMENTS_INTERACTION_LOG_EVENT     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.logging.ve.g r15 = com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak.m53060b(r15)     // Catch:{ all -> 0x0281 }
            r8.mo33859g(r15)     // Catch:{ all -> 0x0281 }
            r14.mo33801b(r13, r8)     // Catch:{ all -> 0x0281 }
            goto L_0x01f2
        L_0x01d5:
            com.google.android.libraries.logging.ve.af r8 = r7.f372426c     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.logging.ve.ab r8 = r8.f76997b     // Catch:{ all -> 0x0281 }
            int r14 = r3.f28739b     // Catch:{ all -> 0x0281 }
            if (r14 != r6) goto L_0x01e2
            java.lang.Object r14 = r3.f28740c     // Catch:{ all -> 0x0281 }
            com.google.common.o.l.n r14 = (com.google.common.p4552o.p4566l.C60214n) r14     // Catch:{ all -> 0x0281 }
            goto L_0x01e4
        L_0x01e2:
            com.google.common.o.l.n r14 = com.google.common.p4552o.p4566l.C60214n.f162914g     // Catch:{ all -> 0x0281 }
        L_0x01e4:
            com.google.android.libraries.logging.ve.h r14 = com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak.m53062d(r14)     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.logging.ve.c r8 = r8.mo33800a(r14)     // Catch:{ all -> 0x0281 }
            r8.mo33860h(r5)     // Catch:{ all -> 0x0281 }
            r8.mo33809b(r13)     // Catch:{ all -> 0x0281 }
        L_0x01f2:
            com.google.android.apps.search.googleapp.notificationsurvey.i r8 = new com.google.android.apps.search.googleapp.notificationsurvey.i     // Catch:{ all -> 0x0281 }
            r8.<init>(r7, r3, r11)     // Catch:{ all -> 0x0281 }
            r13.setOnClickListener(r8)     // Catch:{ all -> 0x0281 }
            int r12 = r12 + 1
            r3 = 0
            r8 = 1
            goto L_0x0144
        L_0x0200:
            throw r16     // Catch:{ all -> 0x0281 }
        L_0x0201:
            com.google.android.apps.search.googleapp.notificationsurvey.g r3 = new com.google.android.apps.search.googleapp.notificationsurvey.g     // Catch:{ all -> 0x0281 }
            r3.<init>(r0, r4)     // Catch:{ all -> 0x0281 }
            r7.f372429f = r3     // Catch:{ all -> 0x0281 }
        L_0x0208:
            r3 = 2131431737(0x7f0b1139, float:1.8485212E38)
            android.view.View r3 = r4.findViewById(r3)     // Catch:{ all -> 0x0281 }
            if (r3 != 0) goto L_0x0212
            goto L_0x027d
        L_0x0212:
            com.google.android.apps.search.googleapp.notificationsurvey.e r4 = new com.google.android.apps.search.googleapp.notificationsurvey.e     // Catch:{ all -> 0x0281 }
            r4.<init>(r0)     // Catch:{ all -> 0x0281 }
            r3.setOnClickListener(r4)     // Catch:{ all -> 0x0281 }
            com.google.ai.b.gc r4 = r0.f372415g     // Catch:{ all -> 0x0281 }
            com.google.ai.b.yk r4 = r4.f26849f     // Catch:{ all -> 0x0281 }
            if (r4 != 0) goto L_0x0222
            com.google.ai.b.yk r4 = com.google.p375ai.p378b.C8178yk.f28736g     // Catch:{ all -> 0x0281 }
        L_0x0222:
            boolean r4 = com.google.android.apps.search.googleapp.notificationsurvey.C136817h.m222496b(r4)     // Catch:{ all -> 0x0281 }
            if (r4 == 0) goto L_0x027d
            boolean r4 = r0.f372418j     // Catch:{ all -> 0x0281 }
            if (r4 == 0) goto L_0x0258
            com.google.android.libraries.logging.ve.ab r4 = r0.f372417i     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.logging.ve.af r5 = r4.f76990a     // Catch:{ all -> 0x0281 }
            com.google.ai.b.gc r0 = r0.f372415g     // Catch:{ all -> 0x0281 }
            com.google.ai.b.yk r0 = r0.f26849f     // Catch:{ all -> 0x0281 }
            if (r0 != 0) goto L_0x0238
            com.google.ai.b.yk r0 = com.google.p375ai.p378b.C8178yk.f28736g     // Catch:{ all -> 0x0281 }
        L_0x0238:
            int r7 = r0.f28739b     // Catch:{ all -> 0x0281 }
            if (r7 != r6) goto L_0x0241
            java.lang.Object r0 = r0.f28740c     // Catch:{ all -> 0x0281 }
            com.google.common.o.l.n r0 = (com.google.common.p4552o.p4566l.C60214n) r0     // Catch:{ all -> 0x0281 }
            goto L_0x0243
        L_0x0241:
            com.google.common.o.l.n r0 = com.google.common.p4552o.p4566l.C60214n.f162914g     // Catch:{ all -> 0x0281 }
        L_0x0243:
            com.google.android.libraries.logging.ve.h r0 = com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak.m53062d(r0)     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.logging.ve.c r0 = r5.mo33805a(r0)     // Catch:{ all -> 0x0281 }
            com.google.common.o.e.a r5 = com.google.common.p4552o.p4559e.C59743a.NOW_VISUAL_ELEMENTS_INTERACTION_LOG_EVENT     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.logging.ve.g r5 = com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak.m53060b(r5)     // Catch:{ all -> 0x0281 }
            r0.mo33859g(r5)     // Catch:{ all -> 0x0281 }
            r4.mo33801b(r3, r0)     // Catch:{ all -> 0x0281 }
            goto L_0x027d
        L_0x0258:
            com.google.android.libraries.logging.ve.af r4 = r0.f372416h     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.logging.ve.ab r4 = r4.f76997b     // Catch:{ all -> 0x0281 }
            com.google.ai.b.gc r0 = r0.f372415g     // Catch:{ all -> 0x0281 }
            com.google.ai.b.yk r0 = r0.f26849f     // Catch:{ all -> 0x0281 }
            if (r0 != 0) goto L_0x0264
            com.google.ai.b.yk r0 = com.google.p375ai.p378b.C8178yk.f28736g     // Catch:{ all -> 0x0281 }
        L_0x0264:
            int r7 = r0.f28739b     // Catch:{ all -> 0x0281 }
            if (r7 != r6) goto L_0x026d
            java.lang.Object r0 = r0.f28740c     // Catch:{ all -> 0x0281 }
            com.google.common.o.l.n r0 = (com.google.common.p4552o.p4566l.C60214n) r0     // Catch:{ all -> 0x0281 }
            goto L_0x026f
        L_0x026d:
            com.google.common.o.l.n r0 = com.google.common.p4552o.p4566l.C60214n.f162914g     // Catch:{ all -> 0x0281 }
        L_0x026f:
            com.google.android.libraries.logging.ve.h r0 = com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak.m53062d(r0)     // Catch:{ all -> 0x0281 }
            com.google.android.libraries.logging.ve.c r0 = r4.mo33800a(r0)     // Catch:{ all -> 0x0281 }
            r0.mo33860h(r5)     // Catch:{ all -> 0x0281 }
            r0.mo33809b(r3)     // Catch:{ all -> 0x0281 }
        L_0x027d:
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r2
        L_0x0281:
            r0 = move-exception
            r2 = r0
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0287 }
            goto L_0x028c
        L_0x0287:
            r0 = move-exception
            r3 = r0
            com.google.android.apps.search.googleapp.notificationsurvey.C136812c.m222488a(r2, r3)
        L_0x028c:
            goto L_0x028e
        L_0x028d:
            throw r2
        L_0x028e:
            goto L_0x028d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.notificationsurvey.C136813d.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f372404e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C136812c.m222488a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C136812c.m222488a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f372404e) {
                super.onAttach(context);
                if (this.f372401a == null) {
                    Object jN = mo113391d().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C136131l lVar = (C136131l) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C136131l.f370752d, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(lVar);
                    C46439e eVar = (C46439e) ((C74176nj) jN).f206942f.mo17428b();
                    C28443m mVar = (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b();
                    C60888db dbVar = (C60888db) ((C74176nj) jN).f206677a.n.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C136813d) {
                        C136813d dVar = (C136813d) fragment;
                        C68225k.m98532d(dVar);
                        this.f372401a = new C136817h(lVar, eVar, mVar, dbVar, dVar, (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo67131ks());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f372403d));
                    } else {
                        String obj = C136817h.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
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
                C136812c.m222488a(th, th2);
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
