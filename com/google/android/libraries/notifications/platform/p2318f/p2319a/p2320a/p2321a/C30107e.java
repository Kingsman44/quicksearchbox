package com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.p2321a;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.C142914n;
import com.google.android.gms.auth.TokenData;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.C30102a;
import com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.C30110d;
import com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.C30112f;
import com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.C30113g;
import com.google.android.libraries.p1730f.C21370a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C71422aw;
import p5304e.p5305a.p5306a.p5409o.p5410a.C68936a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.notifications.platform.f.a.a.a.e */
/* compiled from: PG */
public final class C30107e implements C30113g {
    @Deprecated

    /* renamed from: c */
    private static final long f81448c = TimeUnit.MINUTES.toMillis(5);
    @Deprecated

    /* renamed from: d */
    private static final long f81449d = TimeUnit.HOURS.toMillis(1);

    /* renamed from: a */
    public final Map f81450a = new LinkedHashMap();

    /* renamed from: b */
    public final Map f81451b = new LinkedHashMap();

    /* renamed from: e */
    private final Context f81452e;

    /* renamed from: f */
    private final C21370a f81453f;

    /* renamed from: g */
    private final C71422aw f81454g;

    public C30107e(Context context, C21370a aVar, C71422aw awVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(awVar, "blockingScope");
        this.f81452e = context;
        this.f81453f = aVar;
        this.f81454g = awVar;
    }

    /* renamed from: g */
    private final C30104b m55937g(Account account, String str) {
        Context context = this.f81452e;
        Bundle bundle = Bundle.EMPTY;
        C69664n.m101060f(bundle, "EMPTY");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(str, "scope");
        C69664n.m101061g(bundle, "extras");
        TokenData q = C142914n.m231869q(context, account, str, bundle);
        C69664n.m101060f(q, "getTokenWithDetails(cont…, account, scope, extras)");
        String str2 = q.f387646b;
        C69664n.m101060f(str2, "tokenData.token");
        return new C30104b(str2, this.f81453f.mo26870b(), q.f387647c);
    }

    /* renamed from: h */
    private final boolean m55938h(C30104b bVar) {
        if (bVar.f81441c != null) {
            if (TimeUnit.SECONDS.toMillis(bVar.f81441c.longValue()) - this.f81453f.mo26870b() > f81448c) {
                return true;
            }
            return false;
        } else if (this.f81453f.mo26870b() - bVar.f81440b < f81449d - f81448c) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final C30112f mo35496a(String str, String str2) {
        C30104b bVar;
        C30110d dVar;
        C69664n.m101061g(str, "accountName");
        Account account = new Account(str, "com.google");
        C30103a aVar = new C30103a(account, str2);
        synchronized (this.f81450a) {
            try {
                if (C68936a.m99978c()) {
                    bVar = mo35500e(aVar);
                } else {
                    bVar = m55937g(account, str2);
                }
                if (!m55938h(bVar)) {
                    C30058b.m55789a("GnpGoogleAuthUtilImpl", "Token for [%s, %s] is invalid with expiration %s, refreshing...", account.name, str2, bVar.f81441c);
                    mo35501f(bVar);
                    if (C68936a.m99978c()) {
                        bVar = mo35499d(aVar);
                    } else {
                        bVar = m55937g(account, str2);
                    }
                }
                C30058b.m55789a("GnpGoogleAuthUtilImpl", "Returning valid token for [%s, %s] with expiration %s", account.name, str2, bVar.f81441c);
                dVar = new C30110d(bVar.f81439a);
            } catch (Exception e) {
                return C30102a.m55932a(e);
            }
        }
        return dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo35497b(java.lang.String r8, java.lang.String r9, p5462h.p5466c.C69577g r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.p2321a.C30105c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.libraries.notifications.platform.f.a.a.a.c r0 = (com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.p2321a.C30105c) r0
            int r1 = r0.f81444c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f81444c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.notifications.platform.f.a.a.a.c r0 = new com.google.android.libraries.notifications.platform.f.a.a.a.c
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f81442a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f81444c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r10)
            goto L_0x0071
        L_0x0027:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x002f:
            p5462h.C69714l.m101134b(r10)
            com.google.android.libraries.notifications.platform.f.a.a.a.a r10 = new com.google.android.libraries.notifications.platform.f.a.a.a.a
            android.accounts.Account r2 = new android.accounts.Account
            java.lang.String r4 = "com.google"
            r2.<init>(r8, r4)
            r10.<init>(r2, r9)
            h.f.b.ae r8 = new h.f.b.ae
            r8.<init>()
            java.util.Map r9 = r7.f81451b
            monitor-enter(r9)
            java.util.Map r2 = r7.f81451b     // Catch:{ all -> 0x008b }
            java.lang.Object r2 = r2.get(r10)     // Catch:{ all -> 0x008b }
            kotlinx.coroutines.be r2 = (kotlinx.coroutines.C71604be) r2     // Catch:{ all -> 0x008b }
            if (r2 != 0) goto L_0x0062
            kotlinx.coroutines.aw r2 = r7.f81454g     // Catch:{ all -> 0x008b }
            com.google.android.libraries.notifications.platform.f.a.a.a.d r4 = new com.google.android.libraries.notifications.platform.f.a.a.a.d     // Catch:{ all -> 0x008b }
            r5 = 0
            r4.<init>(r7, r10, r5)     // Catch:{ all -> 0x008b }
            r6 = 3
            kotlinx.coroutines.be r2 = kotlinx.coroutines.C71803m.m105042c(r2, r5, r5, r4, r6)     // Catch:{ all -> 0x008b }
            java.util.Map r4 = r7.f81451b     // Catch:{ all -> 0x008b }
            r4.put(r10, r2)     // Catch:{ all -> 0x008b }
        L_0x0062:
            r8.f186027a = r2     // Catch:{ all -> 0x008b }
            monitor-exit(r9)
            java.lang.Object r8 = r8.f186027a
            kotlinx.coroutines.be r8 = (kotlinx.coroutines.C71604be) r8
            r0.f81444c = r3
            java.lang.Object r10 = r8.mo62825a(r0)
            if (r10 == r1) goto L_0x008a
        L_0x0071:
            h.k r10 = (p5462h.C69702k) r10
            java.lang.Object r8 = r10.f186073a
            java.lang.Throwable r9 = p5462h.C69702k.m101124a(r8)
            if (r9 != 0) goto L_0x0085
            com.google.android.libraries.notifications.platform.f.a.a.a.b r8 = (com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.p2321a.C30104b) r8
            com.google.android.libraries.notifications.platform.f.a.a.d r9 = new com.google.android.libraries.notifications.platform.f.a.a.d
            java.lang.String r8 = r8.f81439a
            r9.<init>(r8)
            goto L_0x0089
        L_0x0085:
            com.google.android.libraries.notifications.platform.f.a.a.f r9 = com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.C30102a.m55932a(r9)
        L_0x0089:
            return r9
        L_0x008a:
            return r1
        L_0x008b:
            r8 = move-exception
            monitor-exit(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.p2321a.C30107e.mo35497b(java.lang.String, java.lang.String, h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final String mo35498c(String str) {
        C69664n.m101061g(str, "accountName");
        Context context = this.f81452e;
        C69664n.m101061g(context, "context");
        C69664n.m101061g(str, "accountName");
        String f = C142914n.m231858f(context, str);
        C69664n.m101060f(f, "getAccountId(context, accountName)");
        return f;
    }

    /* renamed from: d */
    public final C30104b mo35499d(C30103a aVar) {
        C30104b g = m55937g(aVar.f81437a, aVar.f81438b);
        this.f81450a.put(aVar, g);
        return g;
    }

    /* renamed from: e */
    public final C30104b mo35500e(C30103a aVar) {
        C30104b bVar = (C30104b) this.f81450a.get(aVar);
        if (bVar != null) {
            if (m55938h(bVar)) {
                return bVar;
            }
            mo35501f(bVar);
        }
        return mo35499d(aVar);
    }

    /* renamed from: f */
    public final void mo35501f(C30104b bVar) {
        Context context = this.f81452e;
        String str = bVar.f81439a;
        C69664n.m101061g(context, "context");
        C69664n.m101061g(str, "token");
        C142914n.m231867o(context, str);
    }
}
