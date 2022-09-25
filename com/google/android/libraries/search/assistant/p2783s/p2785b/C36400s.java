package com.google.android.libraries.search.assistant.p2783s.p2785b;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.network.infoproviders.UserInfoProvider$getAuthTokens$2", mo61344c = "UserInfoProvider.kt", mo61345d = "invokeSuspend", mo61346e = {68, 71})
/* renamed from: com.google.android.libraries.search.assistant.s.b.s */
/* compiled from: PG */
final class C36400s extends C69572j implements C69630p {

    /* renamed from: a */
    int f95055a;

    /* renamed from: b */
    final /* synthetic */ C36404w f95056b;

    /* renamed from: c */
    final /* synthetic */ boolean f95057c;

    /* renamed from: d */
    private /* synthetic */ Object f95058d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36400s(C36404w wVar, boolean z, C69577g gVar) {
        super(2, gVar);
        this.f95056b = wVar;
        this.f95057c = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36400s) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.aw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r8.f95055a
            r2 = 1
            if (r1 == 0) goto L_0x0016
            if (r1 == r2) goto L_0x000e
            p5462h.C69714l.m101134b(r9)
            goto L_0x00a3
        L_0x000e:
            java.lang.Object r1 = r8.f95058d
            kotlinx.coroutines.aw r1 = (kotlinx.coroutines.C71422aw) r1
            p5462h.C69714l.m101134b(r9)
            goto L_0x0037
        L_0x0016:
            p5462h.C69714l.m101134b(r9)
            java.lang.Object r9 = r8.f95058d
            r1 = r9
            kotlinx.coroutines.aw r1 = (kotlinx.coroutines.C71422aw) r1
            com.google.android.libraries.search.assistant.s.b.w r9 = r8.f95056b
            com.google.apps.tiktok.account.data.b r3 = r9.f95083e
            com.google.apps.tiktok.account.AccountId r9 = r9.f95082d
            com.google.common.util.concurrent.cx r9 = r3.mo50246c(r9)
            java.lang.String r3 = "accountDataService.getAccount(accountId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r3)
            r8.f95058d = r1
            r8.f95055a = r2
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r8)
            if (r9 == r0) goto L_0x00a4
        L_0x0037:
            java.util.List r9 = p5462h.p5463a.C69540x.m100948f(r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0044:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x0069
            java.lang.Object r3 = r9.next()
            r4 = r3
            com.google.apps.tiktok.account.data.a r4 = (com.google.apps.tiktok.account.data.C46108a) r4
            com.google.apps.tiktok.account.data.j r5 = r4.mo50210b()
            java.lang.String r5 = r5.f121165j
            java.lang.String r6 = "pseudonymous"
            boolean r5 = p5462h.p5473f.p5475b.C69664n.m101066l(r6, r5)
            if (r5 != 0) goto L_0x0044
            boolean r4 = com.google.apps.tiktok.account.data.p3613b.C46180e.m82417b(r4)
            if (r4 != 0) goto L_0x0044
            r2.add(r3)
            goto L_0x0044
        L_0x0069:
            com.google.android.libraries.search.assistant.s.b.w r9 = r8.f95056b
            boolean r3 = r8.f95057c
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = p5462h.p5463a.C69540x.m100804k(r2, r5)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x007c:
            boolean r5 = r2.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x0097
            java.lang.Object r5 = r2.next()
            com.google.apps.tiktok.account.data.a r5 = (com.google.apps.tiktok.account.data.C46108a) r5
            com.google.android.libraries.search.assistant.s.b.r r7 = new com.google.android.libraries.search.assistant.s.b.r
            r7.<init>(r9, r5, r3, r6)
            r5 = 3
            kotlinx.coroutines.be r5 = kotlinx.coroutines.C71803m.m105042c(r1, r6, r6, r7, r5)
            r4.add(r5)
            goto L_0x007c
        L_0x0097:
            r8.f95058d = r6
            r9 = 2
            r8.f95055a = r9
            java.lang.Object r9 = kotlinx.coroutines.C71760h.m104949a(r4, r8)
            if (r9 != r0) goto L_0x00a3
            return r0
        L_0x00a3:
            return r9
        L_0x00a4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2783s.p2785b.C36400s.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C36400s sVar = new C36400s(this.f95056b, this.f95057c, gVar);
        sVar.f95058d = obj;
        return sVar;
    }
}
