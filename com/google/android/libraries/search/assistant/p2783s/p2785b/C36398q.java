package com.google.android.libraries.search.assistant.p2783s.p2785b;

import com.google.apps.tiktok.account.AccountId;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.network.infoproviders.UserInfoProvider$getAuthToken$2", mo61344c = "UserInfoProvider.kt", mo61345d = "invokeSuspend", mo61346e = {82, 84})
/* renamed from: com.google.android.libraries.search.assistant.s.b.q */
/* compiled from: PG */
final class C36398q extends C69572j implements C69630p {

    /* renamed from: a */
    int f95047a;

    /* renamed from: b */
    final /* synthetic */ boolean f95048b;

    /* renamed from: c */
    final /* synthetic */ C36404w f95049c;

    /* renamed from: d */
    final /* synthetic */ AccountId f95050d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36398q(boolean z, C36404w wVar, AccountId accountId, C69577g gVar) {
        super(2, gVar);
        this.f95048b = z;
        this.f95049c = wVar;
        this.f95050d = accountId;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36398q) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f95047a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0012
            if (r1 == r3) goto L_0x000e
            p5462h.C69714l.m101134b(r8)
            goto L_0x004c
        L_0x000e:
            p5462h.C69714l.m101134b(r8)
            goto L_0x0030
        L_0x0012:
            p5462h.C69714l.m101134b(r8)
            boolean r8 = r7.f95048b
            if (r8 == 0) goto L_0x0034
            com.google.android.libraries.search.assistant.s.b.w r8 = r7.f95049c
            com.google.apps.tiktok.h.b r8 = r8.f95080b
            com.google.apps.tiktok.account.AccountId r1 = r7.f95050d
            com.google.common.util.concurrent.cx r8 = r8.mo51024a(r1)
            java.lang.String r1 = "authTokenManager.forceRefreshAuthToken(accountId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r1)
            r7.f95047a = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r7)
            if (r8 == r0) goto L_0x0033
        L_0x0030:
            com.google.apps.tiktok.h.a r8 = (com.google.apps.tiktok.p3644h.C47103a) r8
            goto L_0x004e
        L_0x0033:
            return r0
        L_0x0034:
            com.google.android.libraries.search.assistant.s.b.w r8 = r7.f95049c
            com.google.apps.tiktok.h.b r8 = r8.f95080b
            com.google.apps.tiktok.account.AccountId r1 = r7.f95050d
            com.google.common.util.concurrent.cx r8 = r8.mo51025b(r1)
            java.lang.String r1 = "authTokenManager.getAuthToken(accountId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r1)
            r7.f95047a = r2
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r7)
            if (r8 != r0) goto L_0x004c
            return r0
        L_0x004c:
            com.google.apps.tiktok.h.a r8 = (com.google.apps.tiktok.p3644h.C47103a) r8
        L_0x004e:
            com.google.speech.h.br r0 = com.google.speech.p5208h.C66592br.f181140e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.speech.h.bq r0 = (com.google.speech.p5208h.C66591bq) r0
            com.google.android.libraries.search.assistant.s.b.w r1 = r7.f95049c
            com.google.apps.tiktok.account.AccountId r3 = r7.f95050d
            java.lang.String r4 = r1.f95081c
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.speech.h.br r5 = (com.google.speech.p5208h.C66592br) r5
            r4.getClass()
            int r6 = r5.f181142a
            r6 = r6 | 4
            r5.f181142a = r6
            r5.f181144c = r4
            com.google.apps.tiktok.account.AccountId r1 = r1.f95082d
            boolean r1 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.speech.h.br r3 = (com.google.speech.p5208h.C66592br) r3
            int r4 = r3.f181142a
            r2 = r2 | r4
            r3.f181142a = r2
            r3.f181143b = r1
            if (r8 == 0) goto L_0x009d
            java.lang.String r8 = r8.f122701a
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.speech.h.br r1 = (com.google.speech.p5208h.C66592br) r1
            r8.getClass()
            int r2 = r1.f181142a
            r2 = r2 | 8
            r1.f181142a = r2
            r1.f181145d = r8
            com.google.protobuf.bv r8 = r0.build()
            return r8
        L_0x009d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required value was null."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2783s.p2785b.C36398q.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C36398q(this.f95048b, this.f95049c, this.f95050d, gVar);
    }
}
