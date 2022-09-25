package com.google.android.libraries.search.assistant.p2783s.p2785b;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.p3644h.C47117b;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.s.b.w */
/* compiled from: PG */
public final class C36404w {

    /* renamed from: a */
    public static final C36396o f95078a = new C36396o();

    /* renamed from: f */
    private static final C59071e f95079f = C59071e.m91331h();

    /* renamed from: b */
    public final C47117b f95080b;

    /* renamed from: c */
    public final String f95081c;

    /* renamed from: d */
    public final AccountId f95082d;

    /* renamed from: e */
    public final C46175b f95083e;

    /* renamed from: g */
    private final long f95084g;

    public C36404w(C47117b bVar, String str, long j, AccountId accountId, C46175b bVar2) {
        C69664n.m101061g(bVar, "authTokenManager");
        C69664n.m101061g(str, "authScope");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar2, "accountDataService");
        this.f95080b = bVar;
        this.f95081c = str;
        this.f95084g = j;
        this.f95082d = accountId;
        this.f95083e = bVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo40158a(com.google.apps.tiktok.account.AccountId r7, boolean r8, p5462h.p5466c.C69577g r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.search.assistant.p2783s.p2785b.C36397p
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.search.assistant.s.b.p r0 = (com.google.android.libraries.search.assistant.p2783s.p2785b.C36397p) r0
            int r1 = r0.f95046c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f95046c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.s.b.p r0 = new com.google.android.libraries.search.assistant.s.b.p
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f95044a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f95046c
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            p5462h.C69714l.m101134b(r9)     // Catch:{ dx -> 0x0033, UserRecoverableAuthException -> 0x0030, AuthenticatorException -> 0x002d, NetworkErrorException -> 0x002b, IOException -> 0x0029, RuntimeException -> 0x0027 }
            goto L_0x0052
        L_0x0027:
            r7 = move-exception
            goto L_0x005a
        L_0x0029:
            r7 = move-exception
            goto L_0x007f
        L_0x002b:
            r7 = move-exception
            goto L_0x00a4
        L_0x002d:
            r7 = move-exception
            goto L_0x00c9
        L_0x0030:
            r7 = move-exception
            goto L_0x00ee
        L_0x0033:
            r7 = move-exception
            goto L_0x0113
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            p5462h.C69714l.m101134b(r9)
            long r4 = r6.f95084g     // Catch:{ dx -> 0x0033, UserRecoverableAuthException -> 0x0030, AuthenticatorException -> 0x002d, NetworkErrorException -> 0x002b, IOException -> 0x0029, RuntimeException -> 0x0027 }
            com.google.android.libraries.search.assistant.s.b.q r9 = new com.google.android.libraries.search.assistant.s.b.q     // Catch:{ dx -> 0x0033, UserRecoverableAuthException -> 0x0030, AuthenticatorException -> 0x002d, NetworkErrorException -> 0x002b, IOException -> 0x0029, RuntimeException -> 0x0027 }
            r2 = 0
            r9.<init>(r8, r6, r7, r2)     // Catch:{ dx -> 0x0033, UserRecoverableAuthException -> 0x0030, AuthenticatorException -> 0x002d, NetworkErrorException -> 0x002b, IOException -> 0x0029, RuntimeException -> 0x0027 }
            r0.f95046c = r3     // Catch:{ dx -> 0x0033, UserRecoverableAuthException -> 0x0030, AuthenticatorException -> 0x002d, NetworkErrorException -> 0x002b, IOException -> 0x0029, RuntimeException -> 0x0027 }
            java.lang.Object r9 = kotlinx.coroutines.C71745ea.m104929a(r4, r9, r0)     // Catch:{ dx -> 0x0033, UserRecoverableAuthException -> 0x0030, AuthenticatorException -> 0x002d, NetworkErrorException -> 0x002b, IOException -> 0x0029, RuntimeException -> 0x0027 }
            if (r9 != r1) goto L_0x0052
            return r1
        L_0x0052:
            com.google.speech.h.br r9 = (com.google.speech.p5208h.C66592br) r9     // Catch:{ dx -> 0x0033, UserRecoverableAuthException -> 0x0030, AuthenticatorException -> 0x002d, NetworkErrorException -> 0x002b, IOException -> 0x0029, RuntimeException -> 0x0027 }
            java.lang.String r7 = "@SuppressWarnings(\n    \"…E_EXCEPTION\n      )\n    }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r7)
            return r9
        L_0x005a:
            com.google.common.f.e r8 = f95079f
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.x r8 = r8.mo56382g(r7)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r9 = new com.google.common.f.n
            r0 = 51444(0xc8f4, float:7.2088E-41)
            r9.<init>(r0)
            r8.mo56379ah(r9)
            java.lang.String r9 = "Possible configuration error"
            r8.mo56386p(r9)
            com.google.protos.j.a.a.b.a.a.b.a.b r8 = com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a.C65573b.AUTH_TOKEN_FETCH_FAILURE_RUNTIME_EXCEPTION
            com.google.android.libraries.search.assistant.s.a.b r7 = com.google.android.libraries.search.assistant.p2783s.p2784a.C36380a.m64925a(r7, r8)
            throw r7
        L_0x007f:
            com.google.common.f.e r8 = f95079f
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.x r8 = r8.mo56382g(r7)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r9 = new com.google.common.f.n
            r0 = 51443(0xc8f3, float:7.2087E-41)
            r9.<init>(r0)
            r8.mo56379ah(r9)
            java.lang.String r9 = "Auth token fetch failed"
            r8.mo56386p(r9)
            com.google.protos.j.a.a.b.a.a.b.a.b r8 = com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a.C65573b.AUTH_TOKEN_FETCH_FAILURE_IO_EXCEPTION
            com.google.android.libraries.search.assistant.s.a.b r7 = com.google.android.libraries.search.assistant.p2783s.p2784a.C36380a.m64925a(r7, r8)
            throw r7
        L_0x00a4:
            com.google.common.f.e r8 = f95079f
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.x r8 = r8.mo56382g(r7)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r9 = new com.google.common.f.n
            r0 = 51442(0xc8f2, float:7.2086E-41)
            r9.<init>(r0)
            r8.mo56379ah(r9)
            java.lang.String r9 = "Auth token fetch failed with network error"
            r8.mo56386p(r9)
            com.google.protos.j.a.a.b.a.a.b.a.b r8 = com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a.C65573b.AUTH_TOKEN_FETCH_FAILURE_NETWORK_ERROR_EXCEPTION
            com.google.android.libraries.search.assistant.s.a.b r7 = com.google.android.libraries.search.assistant.p2783s.p2784a.C36380a.m64925a(r7, r8)
            throw r7
        L_0x00c9:
            com.google.common.f.e r8 = f95079f
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.x r8 = r8.mo56382g(r7)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r9 = new com.google.common.f.n
            r0 = 51441(0xc8f1, float:7.2084E-41)
            r9.<init>(r0)
            r8.mo56379ah(r9)
            java.lang.String r9 = "Auth token fetch failed with authentication error"
            r8.mo56386p(r9)
            com.google.protos.j.a.a.b.a.a.b.a.b r8 = com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a.C65573b.AUTH_TOKEN_FETCH_FAILURE_AUTHENTICATOR_EXCEPTION
            com.google.android.libraries.search.assistant.s.a.b r7 = com.google.android.libraries.search.assistant.p2783s.p2784a.C36380a.m64925a(r7, r8)
            throw r7
        L_0x00ee:
            com.google.common.f.e r8 = f95079f
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.x r8 = r8.mo56382g(r7)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r9 = new com.google.common.f.n
            r0 = 51440(0xc8f0, float:7.2083E-41)
            r9.<init>(r0)
            r8.mo56379ah(r9)
            java.lang.String r9 = "Auth token fetch failed with recoverable error"
            r8.mo56386p(r9)
            com.google.protos.j.a.a.b.a.a.b.a.b r8 = com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a.C65573b.AUTH_TOKEN_FETCH_FAILURE_USER_RECOVERABLE_AUTH_EXCEPTION
            com.google.android.libraries.search.assistant.s.a.b r7 = com.google.android.libraries.search.assistant.p2783s.p2784a.C36380a.m64925a(r7, r8)
            throw r7
        L_0x0113:
            com.google.common.f.e r8 = f95079f
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.x r8 = r8.mo56382g(r7)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r9 = new com.google.common.f.n
            r0 = 51439(0xc8ef, float:7.2081E-41)
            r9.<init>(r0)
            r8.mo56379ah(r9)
            java.lang.String r9 = "Auth token fetch timed out"
            r8.mo56386p(r9)
            com.google.protos.j.a.a.b.a.a.b.a.b r8 = com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a.C65573b.AUTH_TOKEN_FETCH_FAILURE_TIMEOUT
            com.google.android.libraries.search.assistant.s.a.b r7 = com.google.android.libraries.search.assistant.p2783s.p2784a.C36380a.m64925a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2783s.p2785b.C36404w.mo40158a(com.google.apps.tiktok.account.AccountId, boolean, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo40159b(boolean r13, kotlinx.coroutines.C71604be r14, kotlinx.coroutines.C71604be r15, kotlinx.coroutines.C71604be r16, p5462h.p5466c.C69577g r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.google.android.libraries.search.assistant.p2783s.p2785b.C36401t
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.google.android.libraries.search.assistant.s.b.t r1 = (com.google.android.libraries.search.assistant.p2783s.p2785b.C36401t) r1
            int r2 = r1.f95061c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.f95061c = r2
            r9 = r12
            goto L_0x001c
        L_0x0016:
            com.google.android.libraries.search.assistant.s.b.t r1 = new com.google.android.libraries.search.assistant.s.b.t
            r9 = r12
            r1.<init>(r12, r0)
        L_0x001c:
            java.lang.Object r0 = r1.f95059a
            h.c.a.a r10 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r1.f95061c
            r11 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r11) goto L_0x002b
            p5462h.C69714l.m101134b(r0)
            goto L_0x004c
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0033:
            p5462h.C69714l.m101134b(r0)
            com.google.android.libraries.search.assistant.s.b.v r0 = new com.google.android.libraries.search.assistant.s.b.v
            r8 = 0
            r2 = r0
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.f95061c = r11
            java.lang.Object r0 = kotlinx.coroutines.C71423ax.m104196a(r0, r1)
            if (r0 != r10) goto L_0x004c
            return r10
        L_0x004c:
            java.lang.String r1 = "suspend fun userInfo(\n  …     }\n      .build()\n  }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2783s.p2785b.C36404w.mo40159b(boolean, kotlinx.coroutines.be, kotlinx.coroutines.be, kotlinx.coroutines.be, h.c.g):java.lang.Object");
    }
}
