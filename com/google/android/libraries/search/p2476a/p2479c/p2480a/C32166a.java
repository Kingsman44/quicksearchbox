package com.google.android.libraries.search.p2476a.p2479c.p2480a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.account.tiktok.accountselector.AgsaGrpcAccountSelector$getSelection$1", mo61344c = "AgsaGrpcAccountSelector.kt", mo61345d = "invokeSuspend", mo61346e = {35, 38, 42, 44})
/* renamed from: com.google.android.libraries.search.a.c.a.a */
/* compiled from: PG */
final class C32166a extends C69572j implements C69630p {

    /* renamed from: a */
    Object f86352a;

    /* renamed from: b */
    int f86353b;

    /* renamed from: c */
    final /* synthetic */ C32167b f86354c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32166a(C32167b bVar, C69577g gVar) {
        super(2, gVar);
        this.f86354c = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32166a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (r7 != r1) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092 A[PHI: r0 
      PHI: (r0v1 java.lang.Object) = (r0v9 com.google.apps.tiktok.account.AccountId), (r0v10 java.lang.Object) binds: [B:28:0x0090, B:7:?] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0093 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r0 = "pseudonymous"
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r6.f86353b
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0026
            if (r2 == r5) goto L_0x0020
            if (r2 == r4) goto L_0x001c
            if (r2 == r3) goto L_0x0018
            java.lang.Object r0 = r6.f86352a
            p5462h.C69714l.m101134b(r7)     // Catch:{ Exception -> 0x0024 }
            goto L_0x0092
        L_0x0018:
            p5462h.C69714l.m101134b(r7)     // Catch:{ Exception -> 0x0024 }
            goto L_0x0077
        L_0x001c:
            p5462h.C69714l.m101134b(r7)     // Catch:{ Exception -> 0x0024 }
            goto L_0x005d
        L_0x0020:
            p5462h.C69714l.m101134b(r7)     // Catch:{ Exception -> 0x0024 }
            goto L_0x003f
        L_0x0024:
            r7 = move-exception
            goto L_0x0094
        L_0x0026:
            p5462h.C69714l.m101134b(r7)
            com.google.android.libraries.search.a.c.a.b r7 = r6.f86354c     // Catch:{ Exception -> 0x0024 }
            com.google.android.libraries.search.a.b r7 = r7.f86356b     // Catch:{ Exception -> 0x0024 }
            com.google.common.util.concurrent.cx r7 = r7.mo37974b()     // Catch:{ Exception -> 0x0024 }
            java.lang.String r2 = "agsaAccountManager.primaryAccountName"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)     // Catch:{ Exception -> 0x0024 }
            r6.f86353b = r5     // Catch:{ Exception -> 0x0024 }
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r6)     // Catch:{ Exception -> 0x0024 }
            if (r7 != r1) goto L_0x003f
            return r1
        L_0x003f:
            com.google.common.base.ax r7 = (com.google.common.base.C58833ax) r7     // Catch:{ Exception -> 0x0024 }
            boolean r2 = r7.mo56113h()     // Catch:{ Exception -> 0x0024 }
            if (r2 == 0) goto L_0x0062
            com.google.android.libraries.search.a.c.a.b r0 = r6.f86354c     // Catch:{ Exception -> 0x0024 }
            com.google.apps.tiktok.account.data.a.f r0 = r0.f86358d     // Catch:{ Exception -> 0x0024 }
            java.lang.Object r7 = r7.mo56107c()     // Catch:{ Exception -> 0x0024 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0024 }
            com.google.common.util.concurrent.cx r7 = r0.mo50216c(r7)     // Catch:{ Exception -> 0x0024 }
            r6.f86353b = r4     // Catch:{ Exception -> 0x0024 }
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r6)     // Catch:{ Exception -> 0x0024 }
            if (r7 == r1) goto L_0x0061
        L_0x005d:
            com.google.apps.tiktok.account.AccountId r7 = (com.google.apps.tiktok.account.AccountId) r7     // Catch:{ Exception -> 0x0024 }
        L_0x005f:
            r0 = r7
            goto L_0x007a
        L_0x0061:
            return r1
        L_0x0062:
            com.google.android.libraries.search.a.c.a.b r7 = r6.f86354c     // Catch:{ Exception -> 0x0024 }
            com.google.apps.tiktok.account.data.t r7 = r7.f86357c     // Catch:{ Exception -> 0x0024 }
            com.google.common.util.concurrent.cx r7 = r7.mo50283c(r0, r0)     // Catch:{ Exception -> 0x0024 }
            java.lang.String r0 = "tikTokAccountManager\n   …eudonymousAccountType.ID)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)     // Catch:{ Exception -> 0x0024 }
            r6.f86353b = r3     // Catch:{ Exception -> 0x0024 }
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r6)     // Catch:{ Exception -> 0x0024 }
            if (r7 == r1) goto L_0x0093
        L_0x0077:
            com.google.apps.tiktok.account.AccountId r7 = (com.google.apps.tiktok.account.AccountId) r7     // Catch:{ Exception -> 0x0024 }
            goto L_0x005f
        L_0x007a:
            com.google.android.libraries.search.a.c.a.b r7 = r6.f86354c     // Catch:{ Exception -> 0x0024 }
            com.google.apps.tiktok.account.data.t r7 = r7.f86357c     // Catch:{ Exception -> 0x0024 }
            com.google.common.util.concurrent.cx r7 = r7.mo50282b(r0)     // Catch:{ Exception -> 0x0024 }
            java.lang.String r2 = "tikTokAccountManager.enable(accountId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)     // Catch:{ Exception -> 0x0024 }
            r6.f86352a = r0     // Catch:{ Exception -> 0x0024 }
            r2 = 4
            r6.f86353b = r2     // Catch:{ Exception -> 0x0024 }
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r6)     // Catch:{ Exception -> 0x0024 }
            if (r7 == r1) goto L_0x0093
        L_0x0092:
            return r0
        L_0x0093:
            return r1
        L_0x0094:
            io.grpc.Status r0 = p5488io.grpc.Status.f186915m
            io.grpc.Status r7 = r0.mo61678e(r7)
            java.lang.String r0 = "Failed to select/enable AGSA account."
            io.grpc.Status r7 = r7.withDescription(r0)
            io.grpc.fa r1 = new io.grpc.fa
            r2 = 0
            r1.<init>(r7, r2, r5)
            com.google.common.f.e r7 = com.google.android.libraries.search.p2476a.p2479c.p2480a.C32167b.f86355a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.x r7 = r7.mo56382g(r1)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 50541(0xc56d, float:7.0823E-41)
            r2.<init>(r3)
            r7.mo56379ah(r2)
            r7.mo56386p(r0)
            goto L_0x00c4
        L_0x00c3:
            throw r1
        L_0x00c4:
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2476a.p2479c.p2480a.C32166a.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32166a(this.f86354c, gVar);
    }
}
