package com.google.apps.tiktok.inject.p3660e.p3661a;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.gsa.binaries.satin.app.C74163mv;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3654a.C47195d;
import com.google.apps.tiktok.inject.p3654a.C47197e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.apps.tiktok.inject.e.a.a */
/* compiled from: PG */
public class C47247a implements C68288b {

    /* renamed from: a */
    private volatile Object f122902a;

    /* renamed from: b */
    private final Object f122903b = new Object();

    /* renamed from: c */
    private final Fragment f122904c;

    /* renamed from: com.google.apps.tiktok.inject.e.a.a$a */
    /* compiled from: PG */
    public interface C47248a {
        /* renamed from: bO */
        C47195d mo51147bO();
    }

    /* renamed from: com.google.apps.tiktok.inject.e.a.a$b */
    /* compiled from: PG */
    public interface C47249b {
        /* renamed from: cV */
        C74163mv mo51148cV();
    }

    /* renamed from: com.google.apps.tiktok.inject.e.a.a$c */
    /* compiled from: PG */
    public interface C47250c {
        /* renamed from: eg */
        C47197e mo51149eg();
    }

    /* renamed from: com.google.apps.tiktok.inject.e.a.a$d */
    /* compiled from: PG */
    public interface C47251d {
        /* renamed from: bV */
        C58833ax mo51150bV();
    }

    public C47247a(Fragment fragment) {
        this.f122904c = fragment;
    }

    /* renamed from: b */
    public static final void m84047b(Fragment fragment, AccountId accountId) {
        C58838bb.m90866a(accountId, "AccountId cannot be null!");
        int a = accountId.mo50068a();
        C58838bb.m90885t(a >= 0, "AccountId is invalid: %s", a);
        C68324h.m98669f(fragment);
        fragment.getArguments().putInt("TIKTOK_FRAGMENT_ACCOUNT_ID", a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo51144a(Fragment fragment) {
        if (fragment.getArguments() != null) {
            C58838bb.m90869d(!fragment.getArguments().getBoolean("TIKTOK_FRAGMENT_NO_ACCOUNT_ONLY"), "Account-scoped Fragment cannot be instantiated with an argument bundle marking it as no-Account only. If you are using NoAccountNavigation, you must switch to AccountNavigation to navigate to this fragment.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.google.apps.tiktok.account.AccountId} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: jN */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17653jN() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f122902a
            if (r0 != 0) goto L_0x00e8
            java.lang.Object r0 = r6.f122903b
            monitor-enter(r0)
            java.lang.Object r1 = r6.f122902a     // Catch:{ all -> 0x00e5 }
            if (r1 != 0) goto L_0x00e3
            android.support.v4.app.Fragment r1 = r6.f122904c     // Catch:{ all -> 0x00e5 }
            java.lang.Object r1 = r1.getHost()     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = "Sting Fragments must be attached before creating the component."
            com.google.common.base.C58838bb.m90866a(r1, r2)     // Catch:{ all -> 0x00e5 }
            android.support.v4.app.Fragment r1 = r6.f122904c     // Catch:{ all -> 0x00e5 }
            java.lang.Object r2 = r1.getHost()     // Catch:{ all -> 0x00e5 }
            boolean r2 = r2 instanceof dagger.hilt.p5299a.C68288b     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = "Sting Fragments must be attached to an @Sting Activity. Found: %s"
            java.lang.Object r1 = r1.getHost()     // Catch:{ all -> 0x00e5 }
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x00e5 }
            com.google.common.base.C58838bb.m90887v(r2, r3, r1)     // Catch:{ all -> 0x00e5 }
            android.support.v4.app.Fragment r1 = r6.f122904c     // Catch:{ all -> 0x00e5 }
            r6.mo51144a(r1)     // Catch:{ all -> 0x00e5 }
            android.support.v4.app.Fragment r1 = r6.f122904c     // Catch:{ all -> 0x00e5 }
            android.os.Bundle r1 = r1.getArguments()     // Catch:{ all -> 0x00e5 }
            r2 = 0
            if (r1 == 0) goto L_0x004b
            java.lang.String r3 = "TIKTOK_FRAGMENT_ACCOUNT_ID"
            boolean r3 = r1.containsKey(r3)     // Catch:{ all -> 0x00e5 }
            if (r3 == 0) goto L_0x004b
            java.lang.String r2 = "TIKTOK_FRAGMENT_ACCOUNT_ID"
            int r1 = r1.getInt(r2)     // Catch:{ all -> 0x00e5 }
            com.google.apps.tiktok.account.AccountId r2 = com.google.apps.tiktok.account.AccountId.m82057b(r1)     // Catch:{ all -> 0x00e5 }
        L_0x004b:
            android.support.v4.app.Fragment r1 = r6.f122904c     // Catch:{ all -> 0x00e5 }
            java.lang.Object r1 = r1.getHost()     // Catch:{ all -> 0x00e5 }
            java.lang.Class<com.google.apps.tiktok.inject.e.a.a$c> r3 = com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.C47250c.class
            java.lang.Object r1 = dagger.hilt.C68286a.m98629a(r1, r3)     // Catch:{ all -> 0x00e5 }
            com.google.apps.tiktok.inject.e.a.a$c r1 = (com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.C47250c) r1     // Catch:{ all -> 0x00e5 }
            com.google.apps.tiktok.inject.a.e r1 = r1.mo51149eg()     // Catch:{ all -> 0x00e5 }
            com.google.common.base.ax r1 = r1.f122860a     // Catch:{ all -> 0x00e5 }
            boolean r1 = r1.mo56113h()     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x00b7
            android.support.v4.app.Fragment r1 = r6.f122904c     // Catch:{ all -> 0x00e5 }
            java.lang.Object r1 = r1.getHost()     // Catch:{ all -> 0x00e5 }
            java.lang.Class<com.google.apps.tiktok.inject.e.a.a$d> r3 = com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.C47251d.class
            java.lang.Object r1 = dagger.hilt.C68286a.m98629a(r1, r3)     // Catch:{ all -> 0x00e5 }
            com.google.apps.tiktok.inject.e.a.a$d r1 = (com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.C47251d) r1     // Catch:{ all -> 0x00e5 }
            com.google.common.base.ax r1 = r1.mo51150bV()     // Catch:{ all -> 0x00e5 }
            r3 = -1
            if (r2 != 0) goto L_0x008f
            java.lang.Object r1 = r1.mo56111f()     // Catch:{ all -> 0x00e5 }
            r2 = r1
            com.google.apps.tiktok.account.AccountId r2 = (com.google.apps.tiktok.account.AccountId) r2     // Catch:{ all -> 0x00e5 }
            if (r2 == 0) goto L_0x00b7
            int r1 = r2.mo50068a()     // Catch:{ all -> 0x00e5 }
            if (r1 == r3) goto L_0x00b7
            android.support.v4.app.Fragment r1 = r6.f122904c     // Catch:{ all -> 0x00e5 }
            m84047b(r1, r2)     // Catch:{ all -> 0x00e5 }
            goto L_0x00b7
        L_0x008f:
            boolean r4 = r1.mo56113h()     // Catch:{ all -> 0x00e5 }
            java.lang.String r5 = "There is no propagated account id. Did you forget to add one of the account modules:\n\t\"//java/com/google/apps/tiktok/account:module\",\n\t\"//java/com/google/apps/tiktok/account/testing:module\","
            com.google.common.base.C58838bb.m90884s(r4, r5)     // Catch:{ all -> 0x00e5 }
            java.lang.Object r4 = r1.mo56107c()     // Catch:{ all -> 0x00e5 }
            com.google.apps.tiktok.account.AccountId r4 = (com.google.apps.tiktok.account.AccountId) r4     // Catch:{ all -> 0x00e5 }
            int r4 = r4.mo50068a()     // Catch:{ all -> 0x00e5 }
            if (r4 == r3) goto L_0x00b7
            java.lang.Object r3 = r1.mo56107c()     // Catch:{ all -> 0x00e5 }
            com.google.apps.tiktok.account.AccountId r3 = (com.google.apps.tiktok.account.AccountId) r3     // Catch:{ all -> 0x00e5 }
            boolean r3 = r3.equals(r2)     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = "The given account id does not match the propagated account id.\n\tPropagated AccountId: %s\n\tGiven AccountId: %s"
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ all -> 0x00e5 }
            com.google.common.base.C58838bb.m90890y(r3, r4, r1, r2)     // Catch:{ all -> 0x00e5 }
        L_0x00b7:
            android.support.v4.app.Fragment r1 = r6.f122904c     // Catch:{ all -> 0x00e5 }
            java.lang.Object r1 = r1.getHost()     // Catch:{ all -> 0x00e5 }
            java.lang.Class<com.google.apps.tiktok.inject.e.a.a$a> r3 = com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.C47248a.class
            java.lang.Object r1 = dagger.hilt.C68286a.m98629a(r1, r3)     // Catch:{ all -> 0x00e5 }
            com.google.apps.tiktok.inject.e.a.a$a r1 = (com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.C47248a) r1     // Catch:{ all -> 0x00e5 }
            com.google.apps.tiktok.inject.a.d r1 = r1.mo51147bO()     // Catch:{ all -> 0x00e5 }
            java.lang.Object r1 = r1.mo51102b(r2)     // Catch:{ all -> 0x00e5 }
            java.lang.Class<com.google.apps.tiktok.inject.e.a.a$b> r2 = com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.C47249b.class
            java.lang.Object r1 = dagger.hilt.C68286a.m98629a(r1, r2)     // Catch:{ all -> 0x00e5 }
            com.google.apps.tiktok.inject.e.a.a$b r1 = (com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.C47249b) r1     // Catch:{ all -> 0x00e5 }
            com.google.android.apps.gsa.binaries.satin.app.mv r1 = r1.mo51148cV()     // Catch:{ all -> 0x00e5 }
            android.support.v4.app.Fragment r2 = r6.f122904c     // Catch:{ all -> 0x00e5 }
            r1.f206633a = r2     // Catch:{ all -> 0x00e5 }
            com.google.apps.tiktok.inject.b.b r1 = r1.mo69422a()     // Catch:{ all -> 0x00e5 }
            r6.f122902a = r1     // Catch:{ all -> 0x00e5 }
        L_0x00e3:
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            goto L_0x00e8
        L_0x00e5:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            throw r1
        L_0x00e8:
            java.lang.Object r0 = r6.f122902a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.inject.p3660e.p3661a.C47247a.mo17653jN():java.lang.Object");
    }
}
