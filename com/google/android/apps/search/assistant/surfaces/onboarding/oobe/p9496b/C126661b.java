package com.google.android.apps.search.assistant.surfaces.onboarding.oobe.p9496b;

import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.search.assistant.surfaces.onboarding.oobe.C126667h;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.b.b */
/* compiled from: PG */
public final class C126661b implements C126667h {

    /* renamed from: b */
    private static final C59071e f348803b = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.onboarding.oobe.b.b");

    /* renamed from: a */
    public Optional f348804a = Optional.empty();

    /* renamed from: c */
    private final FragmentManager f348805c;

    /* renamed from: d */
    private final int f348806d;

    public C126661b(FragmentManager fragmentManager, int i) {
        this.f348805c = fragmentManager;
        this.f348806d = i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo107667a(java.lang.String r6, p3186j$.util.Optional r7) {
        /*
            r5 = this;
            j$.util.Optional r0 = r5.f348804a
            boolean r0 = r0.isPresent()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            j$.util.Optional r0 = r5.f348804a
            java.lang.Object r0 = r0.get()
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0
            j$.util.Optional r6 = p3186j$.util.Optional.ofNullable(r6)
            com.google.android.apps.search.assistant.surfaces.onboarding.oobe.b.a r2 = new com.google.android.apps.search.assistant.surfaces.onboarding.oobe.b.a
            r2.<init>(r0)
            j$.util.Optional r6 = r6.map(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r6 = r6.orElse(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r2 = r0.size()
            if (r6 < r2) goto L_0x0034
            return r1
        L_0x0034:
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            android.support.v4.app.FragmentManager r0 = r5.f348805c
            android.support.v4.app.cc r0 = r0.f634a
            android.support.v4.app.Fragment r0 = r0.mo671c(r6)
            if (r0 != 0) goto L_0x0106
            boolean r0 = r7.isPresent()
            r2 = 1
            if (r0 != 0) goto L_0x004e
            r7 = 0
            goto L_0x00e5
        L_0x004e:
            int r0 = r6.hashCode()
            r3 = 3
            r4 = 2
            switch(r0) {
                case -1566162234: goto L_0x0076;
                case -325326834: goto L_0x006c;
                case 2586496: goto L_0x0062;
                case 589940442: goto L_0x0058;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x0080
        L_0x0058:
            java.lang.String r0 = "OobeAccountFragment"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0080
            r0 = 0
            goto L_0x0081
        L_0x0062:
            java.lang.String r0 = "OnboardingGetMoreFragment"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0080
            r0 = 3
            goto L_0x0081
        L_0x006c:
            java.lang.String r0 = "OobeOmniconsentFragment"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0080
            r0 = 1
            goto L_0x0081
        L_0x0076:
            java.lang.String r0 = "OobeVoiceMatchFragment"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0080
            r0 = 2
            goto L_0x0081
        L_0x0080:
            r0 = -1
        L_0x0081:
            if (r0 == 0) goto L_0x00d0
            if (r0 == r2) goto L_0x00c3
            if (r0 == r4) goto L_0x00ae
            if (r0 != r3) goto L_0x009e
            java.lang.Object r7 = r7.get()
            com.google.apps.tiktok.account.AccountId r7 = (com.google.apps.tiktok.account.AccountId) r7
            com.google.android.apps.search.assistant.surfaces.onboarding.oobe.j r0 = new com.google.android.apps.search.assistant.surfaces.onboarding.oobe.j
            r0.<init>()
            dagger.hilt.android.internal.managers.C68324h.m98669f(r0)
            com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.m84047b(r0, r7)
            com.google.apps.tiktok.inject.p3659d.C47243l.m84040b(r0, r6)
            goto L_0x00e4
        L_0x009e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown screen tag: %s"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r0.concat(r6)
            r7.<init>(r6)
            throw r7
        L_0x00ae:
            java.lang.Object r7 = r7.get()
            com.google.apps.tiktok.account.AccountId r7 = (com.google.apps.tiktok.account.AccountId) r7
            com.google.android.libraries.search.assistant.u.b.c.b.j r0 = new com.google.android.libraries.search.assistant.u.b.c.b.j
            r0.<init>()
            dagger.hilt.android.internal.managers.C68324h.m98669f(r0)
            com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.m84047b(r0, r7)
            com.google.apps.tiktok.inject.p3659d.C47243l.m84040b(r0, r6)
            goto L_0x00e4
        L_0x00c3:
            java.lang.Object r7 = r7.get()
            com.google.apps.tiktok.account.AccountId r7 = (com.google.apps.tiktok.account.AccountId) r7
            java.lang.String r0 = "1"
            com.google.android.libraries.search.assistant.u.b.c.b.a.w r7 = com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.C36748w.m65383a(r7, r0)
            goto L_0x00e5
        L_0x00d0:
            java.lang.Object r7 = r7.get()
            com.google.apps.tiktok.account.AccountId r7 = (com.google.apps.tiktok.account.AccountId) r7
            com.google.android.libraries.search.assistant.u.b.c.b.b r0 = new com.google.android.libraries.search.assistant.u.b.c.b.b
            r0.<init>()
            dagger.hilt.android.internal.managers.C68324h.m98669f(r0)
            com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.m84047b(r0, r7)
            com.google.apps.tiktok.inject.p3659d.C47243l.m84040b(r0, r6)
        L_0x00e4:
            r7 = r0
        L_0x00e5:
            if (r7 != 0) goto L_0x00e8
            return r1
        L_0x00e8:
            com.google.common.f.e r0 = f348803b
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "nextFragmentTag %s"
            r3 = 37101(0x90ed, float:5.199E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r1, r6)
            android.support.v4.app.FragmentManager r0 = r5.f348805c
            android.support.v4.app.a r1 = new android.support.v4.app.a
            r1.<init>((android.support.p031v4.app.FragmentManager) r0)
            int r0 = r5.f348806d
            r1.mo689v(r0, r7, r6)
            r1.mo509f()
            return r2
        L_0x0106:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.p9496b.C126661b.mo107667a(java.lang.String, j$.util.Optional):boolean");
    }
}
