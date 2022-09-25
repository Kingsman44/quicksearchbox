package com.google.android.apps.gsa.p8867w.p8876f;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3120b.C40102a;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.w.f.d */
/* compiled from: PG */
public final class C118791d implements C40102a {

    /* renamed from: a */
    public static final C59071e f331350a = C59071e.m91331h();

    /* renamed from: b */
    public final C118792e f331351b;

    /* renamed from: c */
    public final C71422aw f331352c;

    /* renamed from: d */
    private final C86054o f331353d;

    public C118791d(C118792e eVar, C86054o oVar, C71422aw awVar) {
        C69664n.m101061g(eVar, "dataStore");
        C69664n.m101061g(oVar, "loginHelper");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f331351b = eVar;
        this.f331353d = oVar;
        this.f331352c = awVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo103967a(java.lang.String r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.apps.gsa.p8867w.p8876f.C118789b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.gsa.w.f.b r0 = (com.google.android.apps.gsa.p8867w.p8876f.C118789b) r0
            int r1 = r0.f331345e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f331345e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.gsa.w.f.b r0 = new com.google.android.apps.gsa.w.f.b
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f331343c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f331345e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.f331342b
            java.lang.Object r0 = r0.f331341a
            p5462h.C69714l.m101134b(r6)
            goto L_0x004e
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p5462h.C69714l.m101134b(r6)
            com.google.android.apps.gsa.w.f.e r6 = r4.f331351b
            com.google.common.util.concurrent.cx r6 = r6.mo90374a()
            java.lang.String r2 = "dataStore.getSubscriptionsEntities()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r2)
            r0.f331341a = r4
            r0.f331342b = r5
            r0.f331345e = r3
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r6 == r1) goto L_0x007f
            r0 = r4
        L_0x004e:
            com.google.common.b.ij r6 = (com.google.common.p4522b.C58528ij) r6
            com.google.android.apps.gsa.w.f.d r0 = (com.google.android.apps.gsa.p8867w.p8876f.C118791d) r0
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r0.mo103968b(r5)
            if (r5 == 0) goto L_0x0060
            java.lang.String r5 = "subscriptions"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r5)
            return r6
        L_0x0060:
            com.google.common.f.e r5 = f331350a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.n r6 = new com.google.common.f.n
            r0 = 11495(0x2ce7, float:1.6108E-41)
            r6.<init>(r0)
            r5.mo56379ah(r6)
            java.lang.String r6 = "getCurrentSubscriptions failed due to account mismatch"
            r5.mo56386p(r6)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Account name does not match current account"
            r5.<init>(r6)
            throw r5
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p8867w.p8876f.C118791d.mo103967a(java.lang.String, h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public final boolean mo103968b(String str) {
        Account a = this.f331353d.mo79668a();
        return C69664n.m101066l(str, a != null ? a.name : null);
    }
}
