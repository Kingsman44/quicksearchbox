package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.aj */
/* compiled from: PG */
public final class C126696aj {

    /* renamed from: f */
    private static final C59071e f348918f = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.aj");

    /* renamed from: a */
    public final AccountId f348919a;

    /* renamed from: b */
    public final C126694ah f348920b;

    /* renamed from: c */
    public final boolean f348921c;

    /* renamed from: d */
    public final boolean f348922d;

    /* renamed from: e */
    public C58485gu f348923e;

    public C126696aj(AccountId accountId, C126694ah ahVar, boolean z) {
        this.f348919a = accountId;
        this.f348920b = ahVar;
        this.f348921c = z;
        this.f348922d = ahVar.getActivity().getIntent().getBooleanExtra("intent_extra_tng_suw_enabled_from_agsa_c", false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0065, code lost:
        if (r7.equals("SuwIntroFragment") != false) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo107690a(java.lang.String r7) {
        /*
            r6 = this;
            j$.util.Optional r7 = p3186j$.util.Optional.ofNullable(r7)
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ai r0 = new com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ai
            r0.<init>(r6)
            j$.util.Optional r7 = r7.map(r0)
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r7 = r7.orElse(r1)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            com.google.common.b.gu r1 = r6.f348923e
            r2 = r1
            com.google.common.b.pq r2 = (com.google.common.p4522b.C58724pq) r2
            int r2 = r2.f156474d
            if (r7 >= r2) goto L_0x00ba
            com.google.apps.tiktok.account.AccountId r2 = r6.f348919a
            if (r2 == 0) goto L_0x00ba
            java.lang.Object r7 = r1.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ah r1 = r6.f348920b
            android.support.v4.app.FragmentManager r1 = r1.getChildFragmentManager()
            android.support.v4.app.cc r1 = r1.f634a
            android.support.v4.app.Fragment r1 = r1.mo671c(r7)
            if (r1 != 0) goto L_0x00d4
            com.google.apps.tiktok.account.AccountId r1 = r6.f348919a
            int r2 = r7.hashCode()
            r3 = -1383878680(0xffffffffad83afe8, float:-1.4971094E-11)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L_0x0068
            r3 = -1361319769(0xffffffffaedbe8a7, float:-1.0000294E-10)
            if (r2 == r3) goto L_0x005f
            r0 = 677987501(0x286944ad, float:1.294899E-14)
            if (r2 == r0) goto L_0x0055
            goto L_0x0072
        L_0x0055:
            java.lang.String r0 = "SuwHardwareFragment"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0072
            r0 = 2
            goto L_0x0073
        L_0x005f:
            java.lang.String r2 = "SuwIntroFragment"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0072
            goto L_0x0073
        L_0x0068:
            java.lang.String r0 = "SuwSettingsFragment"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0072
            r0 = 1
            goto L_0x0073
        L_0x0072:
            r0 = -1
        L_0x0073:
            if (r0 == 0) goto L_0x0093
            if (r0 == r5) goto L_0x008e
            if (r0 != r4) goto L_0x007e
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.l r0 = com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.C126725l.m207268f(r7)
            goto L_0x0097
        L_0x007e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown Tag: "
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L_0x008e:
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ar r0 = com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.C126704ar.m207209a(r1, r7)
            goto L_0x0097
        L_0x0093:
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.w r0 = com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.C126736w.m207297a(r1, r7)
        L_0x0097:
            com.google.common.f.e r1 = f348918f
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "nextFragmentTag %s"
            r3 = 37118(0x90fe, float:5.2013E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56389s(r2, r7)
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ah r1 = r6.f348920b
            android.support.v4.app.FragmentManager r1 = r1.getChildFragmentManager()
            android.support.v4.app.a r2 = new android.support.v4.app.a
            r2.<init>((android.support.p031v4.app.FragmentManager) r1)
            r1 = 2131429065(0x7f0b06c9, float:1.8479792E38)
            r2.mo689v(r1, r0, r7)
            r2.mo509f()
            return
        L_0x00ba:
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ah r7 = r6.f348920b
            android.support.v4.app.am r7 = r7.getActivity()
            if (r7 == 0) goto L_0x00d4
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ah r7 = r6.f348920b
            android.support.v4.app.am r7 = r7.getActivity()
            r7.finish()
            com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ah r7 = r6.f348920b
            android.support.v4.app.am r7 = r7.getActivity()
            r7.overridePendingTransition(r0, r0)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.C126696aj.mo107690a(java.lang.String):void");
    }
}
