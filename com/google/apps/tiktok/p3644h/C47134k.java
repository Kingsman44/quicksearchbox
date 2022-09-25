package com.google.apps.tiktok.p3644h;

import androidx.p060c.C0984n;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.auth.C142915o;
import com.google.android.libraries.p1623at.p1631d.C19552a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.apps.tiktok.h.k */
/* compiled from: PG */
public final class C47134k extends C47117b {

    /* renamed from: a */
    static final long f122740a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    static final long f122741b = TimeUnit.HOURS.toMillis(1);

    /* renamed from: f */
    public static final /* synthetic */ int f122742f = 0;

    /* renamed from: g */
    private static final C19552a f122743g = new C19552a("debug.tiktok.apiary_token", BuildConfig.FLAVOR);

    /* renamed from: c */
    public final C47127d f122744c;

    /* renamed from: d */
    public final C21370a f122745d;

    /* renamed from: e */
    public final C142915o f122746e;

    /* renamed from: h */
    private final C0984n f122747h = new C0984n(0);

    /* renamed from: i */
    private final C60887da f122748i;

    /* renamed from: j */
    private final C60887da f122749j;

    /* renamed from: k */
    private final C46128f f122750k;

    public C47134k(C60887da daVar, C60887da daVar2, C142915o oVar, C47127d dVar, C46128f fVar, C21370a aVar) {
        this.f122748i = daVar;
        this.f122749j = daVar2;
        this.f122746e = oVar;
        this.f122744c = dVar;
        this.f122750k = fVar;
        this.f122745d = aVar;
    }

    /* renamed from: e */
    private final C60870cx m83812e() {
        return C60856cj.m92900i(new C47103a(f122743g.mo24804a(), this.f122745d.mo26870b(), (Long) null));
    }

    /* renamed from: f */
    private static final C47103a m83813f(C60870cx cxVar) {
        try {
            return (C47103a) C60856cj.m92909r(cxVar);
        } catch (ExecutionException unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static final boolean m83814g() {
        return !f122743g.mo24804a().isEmpty();
    }

    /* renamed from: a */
    public final C60870cx mo51024a(AccountId accountId) {
        if (m83814g()) {
            return m83812e();
        }
        return C60856cj.m92901j(C60922j.m93045h(this.f122750k.mo50215b(accountId), C47810es.m84966f(new C47133j(this, accountId)), this.f122749j));
    }

    /* renamed from: b */
    public final C60870cx mo51025b(AccountId accountId) {
        if (m83814g()) {
            return m83812e();
        }
        return C60856cj.m92901j(C60922j.m93045h(this.f122750k.mo50215b(accountId), C47810es.m84966f(new C47132i(this, accountId)), this.f122749j));
    }

    /* renamed from: c */
    public final synchronized C60870cx mo51029c(String str) {
        C47103a aVar;
        C60870cx cxVar = (C60870cx) this.f122747h.get(str);
        if (cxVar == null) {
            aVar = null;
        } else if (!cxVar.isDone()) {
            return cxVar;
        } else {
            aVar = m83813f(cxVar);
        }
        C47633f f = C47633f.m84733g(C60856cj.m92900i(aVar)).mo51516i(new C47128e(this), this.f122748i).mo51516i(new C47129f(this, str), this.f122748i).mo51514f(IOException.class, C47130g.f122734a, C60826bg.f164896a);
        this.f122747h.put(str, f);
        return f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        if ((r8.f122745d.mo26870b() - r1.f122702b) >= (f122741b - f122740a)) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        return r0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.common.util.concurrent.C60870cx mo51030d(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            androidx.c.n r0 = r8.f122747h     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0052 }
            com.google.common.util.concurrent.cx r0 = (com.google.common.util.concurrent.C60870cx) r0     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x004c
            boolean r1 = r0.isDone()     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x0013
            monitor-exit(r8)
            return r0
        L_0x0013:
            com.google.apps.tiktok.h.a r1 = m83813f(r0)     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x004c
            java.lang.Long r2 = r1.f122703c     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0037
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0052 }
            java.lang.Long r1 = r1.f122703c     // Catch:{ all -> 0x0052 }
            long r3 = r1.longValue()     // Catch:{ all -> 0x0052 }
            long r1 = r2.toMillis(r3)     // Catch:{ all -> 0x0052 }
            com.google.android.libraries.f.a r3 = r8.f122745d     // Catch:{ all -> 0x0052 }
            long r3 = r3.mo26870b()     // Catch:{ all -> 0x0052 }
            long r1 = r1 - r3
            long r3 = f122740a     // Catch:{ all -> 0x0052 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004c
            goto L_0x004a
        L_0x0037:
            com.google.android.libraries.f.a r2 = r8.f122745d     // Catch:{ all -> 0x0052 }
            long r2 = r2.mo26870b()     // Catch:{ all -> 0x0052 }
            long r4 = r1.f122702b     // Catch:{ all -> 0x0052 }
            long r2 = r2 - r4
            long r4 = f122741b     // Catch:{ all -> 0x0052 }
            long r6 = f122740a     // Catch:{ all -> 0x0052 }
            long r4 = r4 - r6
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            monitor-exit(r8)
            return r0
        L_0x004c:
            com.google.common.util.concurrent.cx r9 = r8.mo51029c(r9)     // Catch:{ all -> 0x0052 }
            monitor-exit(r8)
            return r9
        L_0x0052:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.p3644h.C47134k.mo51030d(java.lang.String):com.google.common.util.concurrent.cx");
    }
}
