package com.google.android.libraries.web.profile.p3431a.p3434b.p3435a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.profile.cookies.gaia.internal.GaiaCookieManagerImpl$sequencedVerifyCookies$doVerifyCookies$verifyResult$1", mo61344c = "GaiaCookieManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {194, 198, 201})
/* renamed from: com.google.android.libraries.web.profile.a.b.a.v */
/* compiled from: PG */
final class C44034v extends C69572j implements C69630p {

    /* renamed from: a */
    int f114638a;

    /* renamed from: b */
    final /* synthetic */ C44037y f114639b;

    /* renamed from: c */
    private /* synthetic */ Object f114640c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44034v(C44037y yVar, C69577g gVar) {
        super(2, gVar);
        this.f114639b = yVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44034v) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004c, code lost:
        if (r9 != r0) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r8.f114638a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0023
            if (r1 == r4) goto L_0x001b
            if (r1 == r3) goto L_0x0013
            p5462h.C69714l.m101134b(r9)
            goto L_0x008b
        L_0x0013:
            java.lang.Object r1 = r8.f114640c
            com.google.apps.tiktok.account.data.a r1 = (com.google.apps.tiktok.account.data.C46108a) r1
            p5462h.C69714l.m101134b(r9)
            goto L_0x006e
        L_0x001b:
            java.lang.Object r1 = r8.f114640c
            kotlinx.coroutines.be r1 = (kotlinx.coroutines.C71604be) r1
            p5462h.C69714l.m101134b(r9)
            goto L_0x004e
        L_0x0023:
            p5462h.C69714l.m101134b(r9)
            java.lang.Object r9 = r8.f114640c
            kotlinx.coroutines.aw r9 = (kotlinx.coroutines.C71422aw) r9
            com.google.android.libraries.web.profile.a.b.a.u r1 = new com.google.android.libraries.web.profile.a.b.a.u
            com.google.android.libraries.web.profile.a.b.a.y r6 = r8.f114639b
            r1.<init>(r6, r5)
            kotlinx.coroutines.be r1 = kotlinx.coroutines.C71803m.m105042c(r9, r5, r5, r1, r2)
            com.google.android.libraries.web.profile.a.b.a.y r9 = r8.f114639b
            com.google.apps.tiktok.account.data.b r6 = r9.f114654c
            com.google.apps.tiktok.account.AccountId r9 = r9.f114653b
            com.google.common.util.concurrent.cx r9 = r6.mo50246c(r9)
            java.lang.String r6 = "accountDataService.getAccount(accountId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r6)
            r8.f114640c = r1
            r8.f114638a = r4
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r8)
            if (r9 == r0) goto L_0x008e
        L_0x004e:
            com.google.apps.tiktok.account.data.a r9 = (com.google.apps.tiktok.account.data.C46108a) r9
            com.google.apps.tiktok.account.data.j r4 = r9.mo50210b()
            java.lang.String r4 = r4.f121165j
            java.lang.String r6 = "google"
            boolean r4 = p5462h.p5473f.p5475b.C69664n.m101066l(r4, r6)
            if (r4 != 0) goto L_0x0061
            com.google.android.libraries.web.profile.a.b.m r9 = com.google.android.libraries.web.profile.p3431a.p3434b.C44050m.VALID_NON_GOOGLE_ACCOUNT_TYPE
            goto L_0x008d
        L_0x0061:
            r8.f114640c = r9
            r8.f114638a = r3
            java.lang.Object r1 = r1.mo62825a(r8)
            if (r1 == r0) goto L_0x008e
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x006e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0079
            com.google.android.libraries.web.profile.a.b.m r9 = com.google.android.libraries.web.profile.p3431a.p3434b.C44050m.INVALID_NO_GOOGLE_COOKIES
            goto L_0x008d
        L_0x0079:
            com.google.android.libraries.web.profile.a.b.a.y r9 = r8.f114639b
            java.lang.String r3 = "account"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)
            r8.f114640c = r5
            r8.f114638a = r2
            java.lang.Object r9 = r9.mo47005o(r1, r8)
            if (r9 != r0) goto L_0x008b
            return r0
        L_0x008b:
            com.google.android.libraries.web.profile.a.b.m r9 = (com.google.android.libraries.web.profile.p3431a.p3434b.C44050m) r9
        L_0x008d:
            return r9
        L_0x008e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.profile.p3431a.p3434b.p3435a.C44034v.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C44034v vVar = new C44034v(this.f114639b, gVar);
        vVar.f114640c = obj;
        return vVar;
    }
}
