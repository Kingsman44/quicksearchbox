package com.google.android.libraries.search.assistant.p2700k;

/* renamed from: com.google.android.libraries.search.assistant.k.g */
/* compiled from: PG */
public final class C34769g {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m63527a(com.google.apps.tiktok.account.data.C46175b r4, com.google.apps.tiktok.account.AccountId r5, com.google.apps.tiktok.account.data.p3611a.C46128f r6, p5462h.p5466c.C69577g r7) {
        /*
            boolean r0 = r7 instanceof com.google.android.libraries.search.assistant.p2700k.C34768f
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.libraries.search.assistant.k.f r0 = (com.google.android.libraries.search.assistant.p2700k.C34768f) r0
            int r1 = r0.f92259c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f92259c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.k.f r0 = new com.google.android.libraries.search.assistant.k.f
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f92258b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f92259c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r6 = r0.f92257a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            p5462h.C69714l.m101134b(r7)
            com.google.common.util.concurrent.cx r4 = r4.mo50246c(r5)
            java.lang.String r5 = "accountDataService.getAccount(accountId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            r0.f92257a = r6
            r0.f92259c = r3
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r4, r0)
            if (r7 == r1) goto L_0x00a4
        L_0x0047:
            java.lang.String r4 = "accountDataService.getAccount(accountId).await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r4)
            com.google.apps.tiktok.account.data.a r7 = (com.google.apps.tiktok.account.data.C46108a) r7
            com.google.apps.tiktok.account.data.j r4 = r7.mo50210b()
            java.lang.String r4 = r4.f121165j
            java.lang.String r5 = "pseudonymous"
            boolean r4 = p5462h.p5473f.p5475b.C69664n.m101066l(r4, r5)
            if (r4 == 0) goto L_0x0061
            com.google.frameworks.client.data.android.a.a r4 = com.google.frameworks.client.data.android.p4632a.C61333a.m93822c()
            return r4
        L_0x0061:
            com.google.apps.tiktok.account.data.j r4 = r7.mo50210b()
            java.lang.String r4 = r4.f121165j
            java.lang.String r5 = "incognito"
            boolean r4 = p5462h.p5473f.p5475b.C69664n.m101066l(r4, r5)
            if (r4 == 0) goto L_0x0074
            com.google.frameworks.client.data.android.a.a r4 = com.google.frameworks.client.data.android.p4632a.C61333a.m93821b()
            return r4
        L_0x0074:
            com.google.apps.tiktok.account.data.j r4 = r7.mo50210b()
            com.google.apps.tiktok.account.data.a.f r6 = (com.google.apps.tiktok.account.data.p3611a.C46128f) r6
            java.lang.String r4 = r6.mo50217e(r4)
            if (r4 == 0) goto L_0x0085
            com.google.frameworks.client.data.android.a.a r4 = com.google.frameworks.client.data.android.p4632a.C61333a.m93820a(r4)
            return r4
        L_0x0085:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            com.google.apps.tiktok.account.data.j r5 = r7.mo50210b()
            java.lang.String r5 = r5.f121165j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Cannot provide rpc auth context for unrecognized type "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = "."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L_0x00a4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2700k.C34769g.m63527a(com.google.apps.tiktok.account.data.b, com.google.apps.tiktok.account.AccountId, com.google.apps.tiktok.account.data.a.f, h.c.g):java.lang.Object");
    }
}
