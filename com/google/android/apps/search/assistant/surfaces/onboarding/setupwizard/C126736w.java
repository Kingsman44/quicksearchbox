package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
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
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58836b;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.w */
/* compiled from: PG */
public final class C126736w extends C126710ax implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C126688ab f349027a;

    /* renamed from: c */
    private Context f349028c;

    /* renamed from: d */
    private final C2393x f349029d = new C2393x(this);

    /* renamed from: e */
    private boolean f349030e;

    @Deprecated
    public C126736w() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    static C126736w m207297a(AccountId accountId, String str) {
        C126736w wVar = new C126736w();
        C68324h.m98669f(wVar);
        C47247a.m84047b(wVar, accountId);
        C47243l.m84040b(wVar, str);
        return wVar;
    }

    /* renamed from: b */
    public final C126688ab mo17754z() {
        C126688ab abVar = this.f349027a;
        if (abVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f349030e) {
            return abVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47247a mo107707d() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f349028c == null) {
            this.f349028c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f349028c;
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
        return this.f349029d;
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
            C126735v.m207296a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x041f A[Catch:{ Exception -> 0x0061, all -> 0x054a }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x048e A[SYNTHETIC, Splitter:B:107:0x048e] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x04b6 A[ADDED_TO_REGION, Catch:{ Exception -> 0x0061, all -> 0x054a }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x04e2 A[Catch:{ Exception -> 0x0061, all -> 0x054a }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x04e6 A[Catch:{ Exception -> 0x0061, all -> 0x054a }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x04fd A[Catch:{ Exception -> 0x0061, all -> 0x054a }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0501 A[Catch:{ Exception -> 0x0061, all -> 0x054a }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0085 A[Catch:{ Exception -> 0x0061, all -> 0x054a }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087 A[Catch:{ Exception -> 0x0061, all -> 0x054a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091 A[Catch:{ Exception -> 0x0061, all -> 0x054a }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094 A[Catch:{ Exception -> 0x0061, all -> 0x054a }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00af A[SYNTHETIC, Splitter:B:38:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0105 A[Catch:{ Exception -> 0x0061, all -> 0x054a }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02c8 A[Catch:{ Exception -> 0x0061, all -> 0x054a }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0346 A[ADDED_TO_REGION, Catch:{ Exception -> 0x0061, all -> 0x054a }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x03ba A[Catch:{ Exception -> 0x0061, all -> 0x054a }, LOOP:1: B:93:0x03b8->B:94:0x03ba, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x03ff A[Catch:{ Exception -> 0x0061, all -> 0x054a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r21, android.view.ViewGroup r22, android.os.Bundle r23) {
        /*
            r20 = this;
            java.lang.String r1 = "\n\n"
            java.lang.String r0 = "intent_extra_enable_warm_word"
            r2 = r20
            com.google.apps.tiktok.tracing.ab r3 = r2.f122869b
            r3.mo51381i()
            r20.mo51119t(r21, r22, r23)     // Catch:{ all -> 0x054a }
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ab r3 = r20.mo17754z()     // Catch:{ all -> 0x054a }
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.w r4 = r3.f348887f     // Catch:{ all -> 0x054a }
            android.support.v4.app.am r4 = r4.getActivity()     // Catch:{ all -> 0x054a }
            android.content.Intent r4 = r4.getIntent()     // Catch:{ all -> 0x054a }
            android.os.Bundle r4 = r4.getExtras()     // Catch:{ all -> 0x054a }
            java.lang.String r5 = "intent_extra_enable_t_ui"
            r6 = 0
            boolean r5 = r4.getBoolean(r5, r6)     // Catch:{ all -> 0x054a }
            android.content.Context r7 = r3.f348886e     // Catch:{ all -> 0x054a }
            r8 = 2132085063(0x7f150947, float:1.9810314E38)
            java.lang.String r7 = r7.getString(r8)     // Catch:{ all -> 0x054a }
            boolean r8 = r3.f348895n     // Catch:{ all -> 0x054a }
            r9 = 1
            if (r8 != 0) goto L_0x004e
            boolean r8 = r3.f348896o     // Catch:{ all -> 0x054a }
            if (r8 == 0) goto L_0x003a
            goto L_0x004e
        L_0x003a:
            if (r4 == 0) goto L_0x004a
            boolean r8 = r4.containsKey(r0)     // Catch:{ all -> 0x054a }
            if (r8 == 0) goto L_0x004a
            boolean r0 = r4.getBoolean(r0)     // Catch:{ all -> 0x054a }
            if (r0 == 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            r3.f348900s = r0     // Catch:{ all -> 0x054a }
            goto L_0x0070
        L_0x004e:
            com.google.android.libraries.search.assistant.u.a.b r0 = r3.f348889h     // Catch:{ Exception -> 0x0061 }
            com.google.common.util.concurrent.cx r0 = r0.mo40290c()     // Catch:{ Exception -> 0x0061 }
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92909r(r0)     // Catch:{ Exception -> 0x0061 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0061 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0061 }
            r3.f348900s = r0     // Catch:{ Exception -> 0x0061 }
            goto L_0x0070
        L_0x0061:
            r0 = move-exception
            com.google.common.f.e r8 = com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.C126688ab.f348882a     // Catch:{ all -> 0x054a }
            com.google.common.f.x r8 = r8.mo56225c()     // Catch:{ all -> 0x054a }
            java.lang.String r10 = "error in getting warm actions eligibility"
            r11 = 37115(0x90fb, float:5.2009E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r0)).mo56372aa(r11)).mo56386p(r10)     // Catch:{ all -> 0x054a }
        L_0x0070:
            r0 = 2131624378(0x7f0e01ba, float:1.8875934E38)
            r8 = r21
            r10 = r22
            android.view.View r0 = r8.inflate(r0, r10, r6)     // Catch:{ all -> 0x054a }
            com.google.android.setupdesign.GlifLayout r0 = (com.google.android.setupdesign.GlifLayout) r0     // Catch:{ all -> 0x054a }
            if (r4 == 0) goto L_0x0087
            boolean r8 = com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.C126688ab.m207180b(r4)     // Catch:{ all -> 0x054a }
            if (r8 == 0) goto L_0x0087
            r8 = 1
            goto L_0x0088
        L_0x0087:
            r8 = 0
        L_0x0088:
            r10 = 3
            r11 = 4
            r12 = 2
            if (r8 == 0) goto L_0x0094
            boolean r13 = r3.f348900s     // Catch:{ all -> 0x054a }
            if (r13 == 0) goto L_0x0094
            r3.f348901t = r11     // Catch:{ all -> 0x054a }
            goto L_0x009f
        L_0x0094:
            if (r8 == 0) goto L_0x0099
            r3.f348901t = r12     // Catch:{ all -> 0x054a }
            goto L_0x009f
        L_0x0099:
            boolean r13 = r3.f348900s     // Catch:{ all -> 0x054a }
            if (r13 == 0) goto L_0x009f
            r3.f348901t = r10     // Catch:{ all -> 0x054a }
        L_0x009f:
            java.lang.String r13 = "female"
            java.lang.String r14 = "male"
            java.lang.String r15 = "other"
            java.lang.String r10 = "intent_extra_standard_gender"
            java.lang.String r16 = "GIVEN_NAME"
            java.lang.String r17 = "GENDER"
            java.lang.String r6 = "intent_extra_given_name"
            if (r5 == 0) goto L_0x0105
            boolean r1 = com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.C126688ab.m207180b(r4)     // Catch:{ all -> 0x054a }
            if (r1 == 0) goto L_0x00e6
            java.lang.String r1 = r4.getString(r6)     // Catch:{ all -> 0x054a }
            int r10 = r4.getInt(r10)     // Catch:{ all -> 0x054a }
            if (r10 != r9) goto L_0x00c1
            r13 = r14
            goto L_0x00c5
        L_0x00c1:
            if (r10 != r12) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r13 = r15
        L_0x00c5:
            android.content.Context r10 = r3.f348886e     // Catch:{ all -> 0x054a }
            r14 = 2132085104(0x7f150970, float:1.9810397E38)
            java.lang.String r10 = r10.getString(r14)     // Catch:{ all -> 0x054a }
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch:{ all -> 0x054a }
            r15 = 0
            r14[r15] = r17     // Catch:{ all -> 0x054a }
            r14[r9] = r13     // Catch:{ all -> 0x054a }
            r14[r12] = r16     // Catch:{ all -> 0x054a }
            r13 = 3
            r14[r13] = r1     // Catch:{ all -> 0x054a }
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch:{ all -> 0x054a }
            java.lang.String r1 = com.android.p265e.C5114a.m13988b(r1, r10, r14)     // Catch:{ all -> 0x054a }
            r0.mo49197s(r1)     // Catch:{ all -> 0x054a }
            goto L_0x00f2
        L_0x00e6:
            android.content.Context r1 = r3.f348886e     // Catch:{ all -> 0x054a }
            r10 = 2132085105(0x7f150971, float:1.98104E38)
            java.lang.String r1 = r1.getString(r10)     // Catch:{ all -> 0x054a }
            r0.mo49197s(r1)     // Catch:{ all -> 0x054a }
        L_0x00f2:
            android.content.Context r1 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x054a }
            r13 = 0
            r10[r13] = r7     // Catch:{ all -> 0x054a }
            r13 = 2132085102(0x7f15096e, float:1.9810393E38)
            java.lang.String r1 = r1.getString(r13, r10)     // Catch:{ all -> 0x054a }
            r0.mo49195q(r1)     // Catch:{ all -> 0x054a }
            goto L_0x02bc
        L_0x0105:
            r18 = 0
            if (r8 == 0) goto L_0x010e
            java.lang.String r19 = r4.getString(r6)     // Catch:{ all -> 0x054a }
            goto L_0x0110
        L_0x010e:
            r19 = r18
        L_0x0110:
            r11 = -1
            int r10 = r4.getInt(r10, r11)     // Catch:{ all -> 0x054a }
            if (r10 != r9) goto L_0x0119
            r13 = r14
            goto L_0x011d
        L_0x0119:
            if (r10 != r12) goto L_0x011c
            goto L_0x011d
        L_0x011c:
            r13 = r15
        L_0x011d:
            int r10 = r3.f348901t     // Catch:{ all -> 0x054a }
            int r11 = r10 + -1
            if (r10 == 0) goto L_0x0549
            if (r11 == 0) goto L_0x0243
            if (r11 == r9) goto L_0x01da
            if (r11 == r12) goto L_0x0195
            r10 = 3
            if (r11 == r10) goto L_0x0134
            r9 = r18
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            goto L_0x0288
        L_0x0134:
            android.content.Context r10 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ all -> 0x054a }
            r14 = 0
            r11[r14] = r19     // Catch:{ all -> 0x054a }
            r15 = 2132085084(0x7f15095c, float:1.9810357E38)
            java.lang.String r18 = r10.getString(r15, r11)     // Catch:{ all -> 0x054a }
            android.content.Context r10 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object[] r11 = new java.lang.Object[r12]     // Catch:{ all -> 0x054a }
            r11[r14] = r19     // Catch:{ all -> 0x054a }
            r11[r9] = r7     // Catch:{ all -> 0x054a }
            r15 = 2132085101(0x7f15096d, float:1.9810391E38)
            java.lang.String r10 = r10.getString(r15, r11)     // Catch:{ all -> 0x054a }
            android.content.Context r11 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ all -> 0x054a }
            r15[r14] = r7     // Catch:{ all -> 0x054a }
            r12 = 2132085064(0x7f150948, float:1.9810316E38)
            java.lang.String r11 = r11.getString(r12, r15)     // Catch:{ all -> 0x054a }
            r12 = 4
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ all -> 0x054a }
            r15[r14] = r17     // Catch:{ all -> 0x054a }
            r15[r9] = r13     // Catch:{ all -> 0x054a }
            r12 = 2
            r15[r12] = r16     // Catch:{ all -> 0x054a }
            r13 = 3
            r15[r13] = r19     // Catch:{ all -> 0x054a }
            java.util.Locale r13 = java.util.Locale.getDefault()     // Catch:{ all -> 0x054a }
            java.lang.String r11 = com.android.p265e.C5114a.m13988b(r13, r11, r15)     // Catch:{ all -> 0x054a }
            android.content.Context r13 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ all -> 0x054a }
            r15 = 0
            r14[r15] = r19     // Catch:{ all -> 0x054a }
            r14[r9] = r7     // Catch:{ all -> 0x054a }
            r9 = 2132085086(0x7f15095e, float:1.981036E38)
            java.lang.String r9 = r13.getString(r9, r14)     // Catch:{ all -> 0x054a }
            android.content.Context r13 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ all -> 0x054a }
            r14[r15] = r7     // Catch:{ all -> 0x054a }
            r12 = 1
            r14[r12] = r19     // Catch:{ all -> 0x054a }
            r12 = 2132085088(0x7f150960, float:1.9810365E38)
            java.lang.String r12 = r13.getString(r12, r14)     // Catch:{ all -> 0x054a }
            r13 = r9
            goto L_0x01d6
        L_0x0195:
            android.content.Context r9 = r3.f348886e     // Catch:{ all -> 0x054a }
            r10 = 2132085103(0x7f15096f, float:1.9810395E38)
            java.lang.String r18 = r9.getString(r10)     // Catch:{ all -> 0x054a }
            android.content.Context r9 = r3.f348886e     // Catch:{ all -> 0x054a }
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x054a }
            r12 = 0
            r11[r12] = r7     // Catch:{ all -> 0x054a }
            r13 = 2132085100(0x7f15096c, float:1.981039E38)
            java.lang.String r9 = r9.getString(r13, r11)     // Catch:{ all -> 0x054a }
            android.content.Context r11 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ all -> 0x054a }
            r13[r12] = r7     // Catch:{ all -> 0x054a }
            r14 = 2132085065(0x7f150949, float:1.9810318E38)
            java.lang.String r11 = r11.getString(r14, r13)     // Catch:{ all -> 0x054a }
            android.content.Context r13 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object[] r14 = new java.lang.Object[r10]     // Catch:{ all -> 0x054a }
            r14[r12] = r7     // Catch:{ all -> 0x054a }
            r15 = 2132085087(0x7f15095f, float:1.9810363E38)
            java.lang.String r13 = r13.getString(r15, r14)     // Catch:{ all -> 0x054a }
            android.content.Context r14 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object[] r15 = new java.lang.Object[r10]     // Catch:{ all -> 0x054a }
            r15[r12] = r7     // Catch:{ all -> 0x054a }
            r10 = 2132085089(0x7f150961, float:1.9810367E38)
            java.lang.String r10 = r14.getString(r10, r15)     // Catch:{ all -> 0x054a }
        L_0x01d4:
            r12 = r10
        L_0x01d5:
            r10 = r9
        L_0x01d6:
            r9 = r18
            goto L_0x0288
        L_0x01da:
            android.content.Context r9 = r3.f348886e     // Catch:{ all -> 0x054a }
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x054a }
            r12 = 0
            r11[r12] = r19     // Catch:{ all -> 0x054a }
            r14 = 1
            r11[r14] = r7     // Catch:{ all -> 0x054a }
            r15 = 2132085083(0x7f15095b, float:1.9810355E38)
            java.lang.String r18 = r9.getString(r15, r11)     // Catch:{ all -> 0x054a }
            android.content.Context r9 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x054a }
            r11[r12] = r19     // Catch:{ all -> 0x054a }
            r11[r14] = r7     // Catch:{ all -> 0x054a }
            r10 = 2132085081(0x7f150959, float:1.981035E38)
            java.lang.String r9 = r9.getString(r10, r11)     // Catch:{ all -> 0x054a }
            android.content.Context r10 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object[] r11 = new java.lang.Object[r14]     // Catch:{ all -> 0x054a }
            r11[r12] = r7     // Catch:{ all -> 0x054a }
            r14 = 2132085064(0x7f150948, float:1.9810316E38)
            java.lang.String r10 = r10.getString(r14, r11)     // Catch:{ all -> 0x054a }
            r11 = 4
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch:{ all -> 0x054a }
            r14[r12] = r17     // Catch:{ all -> 0x054a }
            r11 = 1
            r14[r11] = r13     // Catch:{ all -> 0x054a }
            r11 = 2
            r14[r11] = r16     // Catch:{ all -> 0x054a }
            r12 = 3
            r14[r12] = r19     // Catch:{ all -> 0x054a }
            java.util.Locale r12 = java.util.Locale.getDefault()     // Catch:{ all -> 0x054a }
            java.lang.String r10 = com.android.p265e.C5114a.m13988b(r12, r10, r14)     // Catch:{ all -> 0x054a }
            android.content.Context r12 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ all -> 0x054a }
            r14 = 0
            r13[r14] = r19     // Catch:{ all -> 0x054a }
            r15 = 1
            r13[r15] = r7     // Catch:{ all -> 0x054a }
            r15 = 2132085066(0x7f15094a, float:1.981032E38)
            java.lang.String r12 = r12.getString(r15, r13)     // Catch:{ all -> 0x054a }
            android.content.Context r13 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object[] r15 = new java.lang.Object[r11]     // Catch:{ all -> 0x054a }
            r15[r14] = r7     // Catch:{ all -> 0x054a }
            r11 = 1
            r15[r11] = r19     // Catch:{ all -> 0x054a }
            r11 = 2132085068(0x7f15094c, float:1.9810324E38)
            java.lang.String r11 = r13.getString(r11, r15)     // Catch:{ all -> 0x054a }
            r13 = r12
            r12 = r11
            r11 = r10
            goto L_0x01d5
        L_0x0243:
            android.content.Context r9 = r3.f348886e     // Catch:{ all -> 0x054a }
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x054a }
            r12 = 0
            r11[r12] = r7     // Catch:{ all -> 0x054a }
            r13 = 2132085082(0x7f15095a, float:1.9810353E38)
            java.lang.String r18 = r9.getString(r13, r11)     // Catch:{ all -> 0x054a }
            android.content.Context r9 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x054a }
            r11[r12] = r7     // Catch:{ all -> 0x054a }
            r13 = 2132085080(0x7f150958, float:1.9810349E38)
            java.lang.String r9 = r9.getString(r13, r11)     // Catch:{ all -> 0x054a }
            android.content.Context r11 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ all -> 0x054a }
            r13[r12] = r7     // Catch:{ all -> 0x054a }
            r14 = 2132085065(0x7f150949, float:1.9810318E38)
            java.lang.String r11 = r11.getString(r14, r13)     // Catch:{ all -> 0x054a }
            android.content.Context r13 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object[] r14 = new java.lang.Object[r10]     // Catch:{ all -> 0x054a }
            r14[r12] = r7     // Catch:{ all -> 0x054a }
            r15 = 2132085067(0x7f15094b, float:1.9810322E38)
            java.lang.String r13 = r13.getString(r15, r14)     // Catch:{ all -> 0x054a }
            android.content.Context r14 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object[] r15 = new java.lang.Object[r10]     // Catch:{ all -> 0x054a }
            r15[r12] = r7     // Catch:{ all -> 0x054a }
            r10 = 2132085069(0x7f15094d, float:1.9810326E38)
            java.lang.String r10 = r14.getString(r10, r15)     // Catch:{ all -> 0x054a }
            goto L_0x01d4
        L_0x0288:
            r0.mo49197s(r9)     // Catch:{ all -> 0x054a }
            com.google.common.base.ar r9 = new com.google.common.base.ar     // Catch:{ all -> 0x054a }
            r9.<init>((java.lang.String) r1)     // Catch:{ all -> 0x054a }
            r14 = 0
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x054a }
            com.google.common.base.ap r14 = new com.google.common.base.ap     // Catch:{ all -> 0x054a }
            r14.<init>(r15, r10, r11)     // Catch:{ all -> 0x054a }
            java.lang.String r9 = r9.mo56097d(r14)     // Catch:{ all -> 0x054a }
            r0.mo49195q(r9)     // Catch:{ all -> 0x054a }
            r9 = 2131429055(0x7f0b06bf, float:1.8479772E38)
            android.view.View r9 = r0.findViewById(r9)     // Catch:{ all -> 0x054a }
            android.widget.TextView r9 = (android.widget.TextView) r9     // Catch:{ all -> 0x054a }
            com.google.common.base.ar r10 = new com.google.common.base.ar     // Catch:{ all -> 0x054a }
            r10.<init>((java.lang.String) r1)     // Catch:{ all -> 0x054a }
            r1 = 0
            java.lang.Object[] r11 = new java.lang.Object[r1]     // Catch:{ all -> 0x054a }
            com.google.common.base.ap r1 = new com.google.common.base.ap     // Catch:{ all -> 0x054a }
            r1.<init>(r11, r13, r12)     // Catch:{ all -> 0x054a }
            java.lang.String r1 = r10.mo56097d(r1)     // Catch:{ all -> 0x054a }
            r9.setText(r1)     // Catch:{ all -> 0x054a }
        L_0x02bc:
            boolean r1 = r3.f348900s     // Catch:{ all -> 0x054a }
            r10 = 8
            r11 = 2131429059(0x7f0b06c3, float:1.847978E38)
            r12 = 2131429058(0x7f0b06c2, float:1.8479778E38)
            if (r1 == 0) goto L_0x0346
            if (r5 == 0) goto L_0x02cd
            com.google.common.b.hd r1 = com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.C126688ab.f348884c     // Catch:{ all -> 0x054a }
            goto L_0x02cf
        L_0x02cd:
            com.google.common.b.hd r1 = com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.C126688ab.f348883b     // Catch:{ all -> 0x054a }
        L_0x02cf:
            com.google.common.b.ij r1 = r1.entrySet()     // Catch:{ all -> 0x054a }
            com.google.common.b.sl r1 = r1.iterator()     // Catch:{ all -> 0x054a }
        L_0x02d7:
            boolean r8 = r1.hasNext()     // Catch:{ all -> 0x054a }
            if (r8 == 0) goto L_0x030d
            java.lang.Object r8 = r1.next()     // Catch:{ all -> 0x054a }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ all -> 0x054a }
            java.lang.Object r13 = r8.getKey()     // Catch:{ all -> 0x054a }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x054a }
            int r13 = r13.intValue()     // Catch:{ all -> 0x054a }
            android.view.View r13 = r0.findViewById(r13)     // Catch:{ all -> 0x054a }
            android.widget.TextView r13 = (android.widget.TextView) r13     // Catch:{ all -> 0x054a }
            android.content.Context r14 = r3.f348886e     // Catch:{ all -> 0x054a }
            java.lang.Object r8 = r8.getValue()     // Catch:{ all -> 0x054a }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x054a }
            int r8 = r8.intValue()     // Catch:{ all -> 0x054a }
            r15 = 1
            java.lang.Object[] r9 = new java.lang.Object[r15]     // Catch:{ all -> 0x054a }
            r15 = 0
            r9[r15] = r7     // Catch:{ all -> 0x054a }
            java.lang.String r8 = r14.getString(r8, r9)     // Catch:{ all -> 0x054a }
            r13.setText(r8)     // Catch:{ all -> 0x054a }
            goto L_0x02d7
        L_0x030d:
            r1 = 2131429062(0x7f0b06c6, float:1.8479786E38)
            android.view.View r1 = r0.findViewById(r1)     // Catch:{ all -> 0x054a }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ all -> 0x054a }
            android.view.View r7 = r0.findViewById(r11)     // Catch:{ all -> 0x054a }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ all -> 0x054a }
            r1.setVisibility(r10)     // Catch:{ all -> 0x054a }
            r7.setVisibility(r10)     // Catch:{ all -> 0x054a }
            int r1 = r3.f348901t     // Catch:{ all -> 0x054a }
            r7 = 4
            if (r1 != r7) goto L_0x0380
            if (r5 != 0) goto L_0x0380
            java.lang.String r1 = r4.getString(r6)     // Catch:{ all -> 0x054a }
            android.view.View r6 = r0.findViewById(r12)     // Catch:{ all -> 0x054a }
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch:{ all -> 0x054a }
            android.content.Context r7 = r3.f348886e     // Catch:{ all -> 0x054a }
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x054a }
            r8 = 0
            r9[r8] = r1     // Catch:{ all -> 0x054a }
            r1 = 2132085094(0x7f150966, float:1.9810377E38)
            java.lang.String r1 = r7.getString(r1, r9)     // Catch:{ all -> 0x054a }
            r6.setText(r1)     // Catch:{ all -> 0x054a }
            goto L_0x0380
        L_0x0346:
            if (r8 == 0) goto L_0x0380
            if (r5 != 0) goto L_0x0380
            r1 = 2131429057(0x7f0b06c1, float:1.8479776E38)
            android.view.View r6 = r0.findViewById(r1)     // Catch:{ all -> 0x054a }
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch:{ all -> 0x054a }
            r1 = 2131429061(0x7f0b06c5, float:1.8479784E38)
            android.view.View r1 = r0.findViewById(r1)     // Catch:{ all -> 0x054a }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ all -> 0x054a }
            android.view.View r7 = r0.findViewById(r12)     // Catch:{ all -> 0x054a }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ all -> 0x054a }
            android.view.View r8 = r0.findViewById(r11)     // Catch:{ all -> 0x054a }
            android.widget.TextView r8 = (android.widget.TextView) r8     // Catch:{ all -> 0x054a }
            r9 = 2132085071(0x7f15094f, float:1.981033E38)
            r6.setText(r9)     // Catch:{ all -> 0x054a }
            r6 = 2132085078(0x7f150956, float:1.9810345E38)
            r1.setText(r6)     // Catch:{ all -> 0x054a }
            r1 = 2132085073(0x7f150951, float:1.9810334E38)
            r7.setText(r1)     // Catch:{ all -> 0x054a }
            r1 = 2132085075(0x7f150953, float:1.9810339E38)
            r8.setText(r1)     // Catch:{ all -> 0x054a }
        L_0x0380:
            r1 = 7
            int[] r6 = new int[r1]     // Catch:{ all -> 0x054a }
            r7 = 2131429060(0x7f0b06c4, float:1.8479782E38)
            r8 = 0
            r6[r8] = r7     // Catch:{ all -> 0x054a }
            r7 = 2131429057(0x7f0b06c1, float:1.8479776E38)
            r8 = 1
            r6[r8] = r7     // Catch:{ all -> 0x054a }
            r7 = 2131429061(0x7f0b06c5, float:1.8479784E38)
            r8 = 2
            r6[r8] = r7     // Catch:{ all -> 0x054a }
            r7 = 3
            r6[r7] = r12     // Catch:{ all -> 0x054a }
            r7 = 2131429062(0x7f0b06c6, float:1.8479786E38)
            r8 = 4
            r6[r8] = r7     // Catch:{ all -> 0x054a }
            r7 = 5
            r6[r7] = r11     // Catch:{ all -> 0x054a }
            r7 = 6
            r8 = 2131429055(0x7f0b06bf, float:1.8479772E38)
            r6[r7] = r8     // Catch:{ all -> 0x054a }
            java.lang.Class<com.google.android.setupdesign.d.c> r7 = com.google.android.setupdesign.p3555d.C45295c.class
            com.google.android.setupcompat.template.g r7 = r0.mo49129j(r7)     // Catch:{ all -> 0x054a }
            com.google.android.setupdesign.d.c r7 = (com.google.android.setupdesign.p3555d.C45295c) r7     // Catch:{ all -> 0x054a }
            android.widget.TextView r8 = r7.mo49224a()     // Catch:{ all -> 0x054a }
            int r8 = r8.getGravity()     // Catch:{ all -> 0x054a }
            r15 = 0
        L_0x03b8:
            if (r15 >= r1) goto L_0x03d8
            r9 = r6[r15]     // Catch:{ all -> 0x054a }
            android.view.View r9 = r0.findViewById(r9)     // Catch:{ all -> 0x054a }
            android.widget.TextView r9 = (android.widget.TextView) r9     // Catch:{ all -> 0x054a }
            r9.setGravity(r8)     // Catch:{ all -> 0x054a }
            android.widget.TextView r11 = r7.mo49224a()     // Catch:{ all -> 0x054a }
            android.graphics.Typeface r11 = r11.getTypeface()     // Catch:{ all -> 0x054a }
            r12 = 0
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r12)     // Catch:{ all -> 0x054a }
            r9.setTypeface(r11)     // Catch:{ all -> 0x054a }
            int r15 = r15 + 1
            goto L_0x03b8
        L_0x03d8:
            com.google.apps.tiktok.dataservice.dp r6 = r3.f348891j     // Catch:{ all -> 0x054a }
            com.google.apps.tiktok.account.data.b r7 = r3.f348888g     // Catch:{ all -> 0x054a }
            com.google.apps.tiktok.account.AccountId r8 = r3.f348885d     // Catch:{ all -> 0x054a }
            com.google.apps.tiktok.dataservice.ag r7 = r7.mo50244a(r8)     // Catch:{ all -> 0x054a }
            com.google.apps.tiktok.dataservice.de r8 = com.google.apps.tiktok.dataservice.C46788de.DONT_CARE     // Catch:{ all -> 0x054a }
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.aa r9 = new com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.aa     // Catch:{ all -> 0x054a }
            r9.<init>()     // Catch:{ all -> 0x054a }
            r6.mo50708b(r7, r8, r9)     // Catch:{ all -> 0x054a }
            r6 = 2131429054(0x7f0b06be, float:1.847977E38)
            android.view.View r6 = r0.findViewById(r6)     // Catch:{ all -> 0x054a }
            com.airbnb.lottie.LottieAnimationView r6 = (com.airbnb.lottie.LottieAnimationView) r6     // Catch:{ all -> 0x054a }
            if (r5 == 0) goto L_0x041f
            com.google.common.base.ax r5 = r3.f348890i     // Catch:{ all -> 0x054a }
            boolean r5 = r5.mo56113h()     // Catch:{ all -> 0x054a }
            if (r5 == 0) goto L_0x041f
            r6.setVisibility(r10)     // Catch:{ all -> 0x054a }
            r5 = 2131429056(0x7f0b06c0, float:1.8479774E38)
            android.view.View r5 = r0.findViewById(r5)     // Catch:{ all -> 0x054a }
            android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ all -> 0x054a }
            com.google.common.base.ax r6 = r3.f348890i     // Catch:{ all -> 0x054a }
            java.lang.Object r6 = r6.mo56107c()     // Catch:{ all -> 0x054a }
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.b.a r6 = (com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.p9498b.C126714a) r6     // Catch:{ all -> 0x054a }
            android.graphics.drawable.Drawable r6 = r6.mo107718a()     // Catch:{ all -> 0x054a }
            r5.setImageDrawable(r6)     // Catch:{ all -> 0x054a }
            r7 = 0
            r5.setVisibility(r7)     // Catch:{ all -> 0x054a }
            goto L_0x045f
        L_0x041f:
            r7 = 0
            android.content.Context r5 = r3.f348886e     // Catch:{ all -> 0x054a }
            boolean r5 = com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.C126728o.m207280e(r5)     // Catch:{ all -> 0x054a }
            if (r5 == 0) goto L_0x0444
            android.content.Context r5 = r3.f348886e     // Catch:{ all -> 0x054a }
            r8 = 2132017386(0x7f1400ea, float:1.9673049E38)
            java.lang.String r8 = com.airbnb.lottie.C4972s.m13754l(r5, r8)     // Catch:{ all -> 0x054a }
            r9 = 2132017386(0x7f1400ea, float:1.9673049E38)
            com.airbnb.lottie.ak r5 = com.airbnb.lottie.C4972s.m13751i(r5, r9, r8)     // Catch:{ all -> 0x054a }
            p3186j$.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x054a }
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.x r8 = new com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.x     // Catch:{ all -> 0x054a }
            r8.<init>(r6)     // Catch:{ all -> 0x054a }
            r5.mo9793e(r8)     // Catch:{ all -> 0x054a }
            goto L_0x045f
        L_0x0444:
            android.content.Context r5 = r3.f348886e     // Catch:{ all -> 0x054a }
            r8 = 2132017387(0x7f1400eb, float:1.967305E38)
            java.lang.String r8 = com.airbnb.lottie.C4972s.m13754l(r5, r8)     // Catch:{ all -> 0x054a }
            r9 = 2132017387(0x7f1400eb, float:1.967305E38)
            com.airbnb.lottie.ak r5 = com.airbnb.lottie.C4972s.m13751i(r5, r9, r8)     // Catch:{ all -> 0x054a }
            p3186j$.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x054a }
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.x r8 = new com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.x     // Catch:{ all -> 0x054a }
            r8.<init>(r6)     // Catch:{ all -> 0x054a }
            r5.mo9793e(r8)     // Catch:{ all -> 0x054a }
        L_0x045f:
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ap r5 = r3.f348899r     // Catch:{ all -> 0x054a }
            r5.mo107697c(r0)     // Catch:{ all -> 0x054a }
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ap r5 = r3.f348899r     // Catch:{ all -> 0x054a }
            com.google.android.setupcompat.template.c r6 = new com.google.android.setupcompat.template.c     // Catch:{ all -> 0x054a }
            android.content.Context r8 = r3.f348886e     // Catch:{ all -> 0x054a }
            r6.<init>(r8)     // Catch:{ all -> 0x054a }
            r8 = 2132085061(0x7f150945, float:1.981031E38)
            r6.mo49181b(r8)     // Catch:{ all -> 0x054a }
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.y r8 = new com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.y     // Catch:{ all -> 0x054a }
            r8.<init>(r3)     // Catch:{ all -> 0x054a }
            r6.f118281b = r8     // Catch:{ all -> 0x054a }
            r8 = 5
            r6.f118282c = r8     // Catch:{ all -> 0x054a }
            r8 = 2132150157(0x7f16078d, float:1.994234E38)
            r6.f118283d = r8     // Catch:{ all -> 0x054a }
            com.google.android.setupcompat.template.d r6 = r6.mo49180a()     // Catch:{ all -> 0x054a }
            r5.f348934e = r6     // Catch:{ all -> 0x054a }
            boolean r5 = r3.f348895n     // Catch:{ all -> 0x054a }
            java.lang.String r6 = "intent_extra_use_unicorn_flow"
            if (r5 != 0) goto L_0x04b2
            boolean r5 = r3.f348896o     // Catch:{ all -> 0x054a }
            if (r5 == 0) goto L_0x0493
            goto L_0x04b2
        L_0x0493:
            if (r4 == 0) goto L_0x04c5
            java.lang.String r5 = "intent_extra_intro_screen_neutral_buttons"
            boolean r5 = r4.containsKey(r5)     // Catch:{ all -> 0x054a }
            if (r5 == 0) goto L_0x04a5
            java.lang.String r5 = "intent_extra_intro_screen_neutral_buttons"
            boolean r5 = r4.getBoolean(r5)     // Catch:{ all -> 0x054a }
            if (r5 != 0) goto L_0x04c7
        L_0x04a5:
            boolean r5 = r4.containsKey(r6)     // Catch:{ all -> 0x054a }
            if (r5 == 0) goto L_0x04c5
            boolean r4 = r4.getBoolean(r6)     // Catch:{ all -> 0x054a }
            if (r4 == 0) goto L_0x04c5
            goto L_0x04c7
        L_0x04b2:
            boolean r5 = r3.f348897p     // Catch:{ all -> 0x054a }
            if (r5 != 0) goto L_0x04c7
            if (r4 == 0) goto L_0x04c5
            boolean r5 = r4.containsKey(r6)     // Catch:{ all -> 0x054a }
            if (r5 == 0) goto L_0x04c5
            boolean r4 = r4.getBoolean(r6)     // Catch:{ all -> 0x054a }
            if (r4 == 0) goto L_0x04c5
            goto L_0x04c7
        L_0x04c5:
            r6 = 0
            goto L_0x04c8
        L_0x04c7:
            r6 = 1
        L_0x04c8:
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ap r4 = r3.f348899r     // Catch:{ all -> 0x054a }
            com.google.android.setupcompat.template.c r5 = new com.google.android.setupcompat.template.c     // Catch:{ all -> 0x054a }
            android.content.Context r7 = r3.f348886e     // Catch:{ all -> 0x054a }
            r5.<init>(r7)     // Catch:{ all -> 0x054a }
            r7 = 2132085062(0x7f150946, float:1.9810312E38)
            r5.mo49181b(r7)     // Catch:{ all -> 0x054a }
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.z r7 = new com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.z     // Catch:{ all -> 0x054a }
            r7.<init>(r3)     // Catch:{ all -> 0x054a }
            r5.f118281b = r7     // Catch:{ all -> 0x054a }
            r5.f118282c = r1     // Catch:{ all -> 0x054a }
            if (r6 == 0) goto L_0x04e6
            r1 = 2132150157(0x7f16078d, float:1.994234E38)
            goto L_0x04e9
        L_0x04e6:
            r1 = 2132150158(0x7f16078e, float:1.9942343E38)
        L_0x04e9:
            r5.f118283d = r1     // Catch:{ all -> 0x054a }
            com.google.android.setupcompat.template.d r1 = r5.mo49180a()     // Catch:{ all -> 0x054a }
            r4.f348935f = r1     // Catch:{ all -> 0x054a }
            r4.f348932c = r6     // Catch:{ all -> 0x054a }
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ap r1 = r3.f348899r     // Catch:{ all -> 0x054a }
            r1.mo107698d()     // Catch:{ all -> 0x054a }
            boolean r1 = r3.f348900s     // Catch:{ all -> 0x054a }
            r4 = 1
            if (r4 == r1) goto L_0x0501
            r1 = 149912(0x24998, float:2.10071E-40)
            goto L_0x0504
        L_0x0501:
            r1 = 149913(0x24999, float:2.10073E-40)
        L_0x0504:
            com.google.android.libraries.logging.ve.ab r4 = r3.f348892k     // Catch:{ all -> 0x054a }
            com.google.android.libraries.logging.ve.af r5 = r3.f348893l     // Catch:{ all -> 0x054a }
            com.google.android.libraries.logging.ve.h r1 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r1)     // Catch:{ all -> 0x054a }
            com.google.android.libraries.logging.ve.c r1 = r5.mo33805a(r1)     // Catch:{ all -> 0x054a }
            r4.mo33802c(r0, r1)     // Catch:{ all -> 0x054a }
            r1 = 2131429049(0x7f0b06b9, float:1.847976E38)
            android.view.View r1 = r0.findViewById(r1)     // Catch:{ all -> 0x054a }
            r4 = 2131429050(0x7f0b06ba, float:1.8479762E38)
            android.view.View r4 = r0.findViewById(r4)     // Catch:{ all -> 0x054a }
            com.google.android.libraries.logging.ve.ab r5 = r3.f348892k     // Catch:{ all -> 0x054a }
            com.google.android.libraries.logging.ve.af r6 = r3.f348893l     // Catch:{ all -> 0x054a }
            r7 = 149916(0x2499c, float:2.10077E-40)
            com.google.android.libraries.logging.ve.h r7 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r7)     // Catch:{ all -> 0x054a }
            com.google.android.libraries.logging.ve.c r6 = r6.mo33805a(r7)     // Catch:{ all -> 0x054a }
            r5.mo33802c(r1, r6)     // Catch:{ all -> 0x054a }
            com.google.android.libraries.logging.ve.ab r1 = r3.f348892k     // Catch:{ all -> 0x054a }
            com.google.android.libraries.logging.ve.af r3 = r3.f348893l     // Catch:{ all -> 0x054a }
            r5 = 149917(0x2499d, float:2.10078E-40)
            com.google.android.libraries.logging.ve.h r5 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r5)     // Catch:{ all -> 0x054a }
            com.google.android.libraries.logging.ve.c r3 = r3.mo33805a(r5)     // Catch:{ all -> 0x054a }
            r1.mo33802c(r4, r3)     // Catch:{ all -> 0x054a }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r0
        L_0x0549:
            throw r18     // Catch:{ all -> 0x054a }
        L_0x054a:
            r0 = move-exception
            r1 = r0
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0550 }
            goto L_0x0555
        L_0x0550:
            r0 = move-exception
            r3 = r0
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.C126735v.m207296a(r1, r3)
        L_0x0555:
            goto L_0x0557
        L_0x0556:
            throw r1
        L_0x0557:
            goto L_0x0556
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.C126736w.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f349030e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C126735v.m207296a(th, th);
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
            C126735v.m207296a(th, th);
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

    /* JADX WARNING: type inference failed for: r7v0, types: [com.google.android.libraries.search.assistant.u.a.b, java.lang.Object] */
    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f349030e) {
                super.onAttach(context);
                if (this.f349027a == null) {
                    Object jN = mo107708f().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    C46175b bVar = (C46175b) ((C74176nj) jN).f206730b.f198398h.mo17428b();
                    ? gN = ((C74176nj) jN).f206730b.f198027a.mo67000gN();
                    C58836b bVar2 = C58836b.f156633a;
                    C46801dp dpVar = (C46801dp) ((C74176nj) jN).f207084k.mo17428b();
                    C28306ab abVar = (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b();
                    C28310af afVar = (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b();
                    C28443m mVar = (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b();
                    Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C126736w) {
                        C126736w wVar = (C126736w) fragment;
                        C68225k.m98532d(wVar);
                        boolean a = ((C74176nj) jN).f206730b.f198027a.mo66983fx().mo60459a();
                        boolean b = ((C74176nj) jN).f206730b.f198027a.mo66983fx().mo60460b();
                        String b2 = C47260e.m84065b(((C74176nj) jN).mo69504b());
                        C68225k.m98532d(b2);
                        this.f349027a = new C126688ab(accountId, bVar, gN, bVar2, dpVar, abVar, afVar, mVar, context2, wVar, a, b, b2);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f349029d));
                    } else {
                        String obj = C126688ab.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = this.f122869b;
                    if (abVar2.f123354b == null) {
                        abVar2.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
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
                C126735v.m207296a(th2, th3);
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
