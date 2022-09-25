package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a;

import com.google.apps.tiktok.account.data.C46175b;
import kotlinx.coroutines.p5574b.C71588o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.z */
/* compiled from: PG */
public final class C34492z implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C71588o f91666a;

    /* renamed from: b */
    final /* synthetic */ C46175b f91667b;

    public C34492z(C71588o oVar, C46175b bVar) {
        this.f91666a = oVar;
        this.f91667b = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: kotlinx.coroutines.b.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo20883a(java.lang.Object r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a.C34491y
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.y r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a.C34491y) r0
            int r1 = r0.f91662b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91662b = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.y r0 = new com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.y
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f91661a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f91662b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003b
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p5462h.C69714l.m101134b(r10)
            goto L_0x009c
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0033:
            java.lang.Object r9 = r0.f91665e
            java.lang.Object r2 = r0.f91663c
            p5462h.C69714l.m101134b(r10)
            goto L_0x005f
        L_0x003b:
            p5462h.C69714l.m101134b(r10)
            kotlinx.coroutines.b.o r2 = r8.f91666a
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.s r9 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a.C34485s) r9
            if (r9 != 0) goto L_0x0046
            r6 = r5
            goto L_0x008f
        L_0x0046:
            com.google.apps.tiktok.account.data.b r10 = r8.f91667b
            com.google.apps.tiktok.account.AccountId r6 = r9.f91640a
            com.google.common.util.concurrent.cx r10 = r10.mo50246c(r6)
            java.lang.String r6 = "accountDataService.getAc…(configuration.accountId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r6)
            r0.f91663c = r2
            r0.f91665e = r9
            r0.f91662b = r4
            java.lang.Object r10 = kotlinx.coroutines.p5578d.C71663i.m104690c(r10, r0)
            if (r10 == r1) goto L_0x009f
        L_0x005f:
            com.google.apps.tiktok.account.data.a r10 = (com.google.apps.tiktok.account.data.C46108a) r10
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.s r9 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a.C34485s) r9
            com.google.apps.tiktok.account.AccountId r4 = r9.f91640a
            com.google.apps.tiktok.account.data.j r10 = r10.mo50210b()
            java.lang.String r10 = r10.f121165j
            java.lang.String r6 = "account.info().type"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r6)
            com.google.android.libraries.search.assistant.invocation.o.i.a.b.c r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2678b.C34554c.f91805e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.search.assistant.invocation.o.i.a.b.b r6 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2678b.C34553b) r6
            java.lang.String r7 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            com.google.android.libraries.search.assistant.invocation.o.i.a.b.e r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            java.lang.String r9 = r9.f91641b
            r6.mo39412b(r9)
            com.google.android.libraries.search.assistant.invocation.o.i.a.b.c r9 = r6.mo39411a()
            com.google.android.libraries.search.assistant.invocation.o.i.a.c.c r6 = new com.google.android.libraries.search.assistant.invocation.o.i.a.c.c
            r6.<init>(r4, r10, r9)
        L_0x008f:
            r0.f91663c = r5
            r0.f91665e = r5
            r0.f91662b = r3
            java.lang.Object r9 = r2.mo20883a(r6, r0)
            if (r9 != r1) goto L_0x009c
            return r1
        L_0x009c:
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x009f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a.C34492z.mo20883a(java.lang.Object, h.c.g):java.lang.Object");
    }
}
