package com.google.android.gms.common.internal;

import android.accounts.Account;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143839k;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.ac */
/* compiled from: PG */
public abstract class C143887ac extends C143939n implements C143839k, C143888ad {

    /* renamed from: a */
    private static volatile Executor f390060a;

    /* renamed from: K */
    public final C143944s f390061K;

    /* renamed from: b */
    private final Set f390062b;

    /* renamed from: c */
    private final Account f390063c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C143887ac(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C143944s r13, com.google.android.gms.common.api.internal.C143726aa r14, com.google.android.gms.common.api.internal.C143789cj r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.ag r3 = com.google.android.gms.common.internal.C143891ag.m233922a(r10)
            com.google.android.gms.common.g r4 = com.google.android.gms.common.C143875g.f389987a
            com.google.android.gms.common.internal.C143919bh.m233958a(r14)
            com.google.android.gms.common.internal.C143919bh.m233958a(r15)
            com.google.android.gms.common.internal.aa r6 = new com.google.android.gms.common.internal.aa
            r6.<init>(r14)
            com.google.android.gms.common.internal.ab r7 = new com.google.android.gms.common.internal.ab
            r7.<init>(r15)
            java.lang.String r8 = r13.f390174f
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f390061K = r13
            android.accounts.Account r10 = r13.f390169a
            r9.f390063c = r10
            java.util.Set r10 = r13.f390171c
            java.util.Iterator r11 = r10.iterator()
        L_0x002b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0046
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L_0x003e
            goto L_0x002b
        L_0x003e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L_0x0046:
            r9.f390062b = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C143887ac.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.s, com.google.android.gms.common.api.internal.aa, com.google.android.gms.common.api.internal.cj):void");
    }

    /* renamed from: F */
    public final Account mo119392F() {
        return this.f390063c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final Set mo119393J() {
        return this.f390062b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final Executor mo119394K() {
        return null;
    }

    /* renamed from: U */
    public final Feature[] mo119395U() {
        return new Feature[0];
    }

    /* renamed from: a */
    public int mo57744a() {
        throw null;
    }

    /* renamed from: u */
    public final Set mo119246u() {
        return mo117790j() ? this.f390062b : Collections.emptySet();
    }
}
