package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

import com.google.android.apps.gsa.nga.shared.p6344g.C81067a;
import com.google.android.apps.gsa.nga.shared.p6407v.C82297c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4552o.aeb;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.u */
/* compiled from: PG */
public final class C82235u implements C82231q {

    /* renamed from: a */
    public final C83334w f224726a;

    /* renamed from: b */
    public final C82297c f224727b;

    /* renamed from: c */
    public final C91142g f224728c;

    /* renamed from: d */
    public long f224729d = 100;

    /* renamed from: e */
    public long f224730e = 10;

    /* renamed from: f */
    public long f224731f = Duration.ofSeconds(15).toMillis();

    /* renamed from: g */
    public long f224732g = Duration.ofMinutes(10).toMillis();

    /* renamed from: h */
    public long f224733h = Duration.ofSeconds(30).toMillis();

    /* renamed from: i */
    public boolean f224734i = true;

    /* renamed from: j */
    public int f224735j = 0;

    /* renamed from: k */
    public Long f224736k;

    /* renamed from: l */
    public final C81067a f224737l = new C81067a(1000);

    /* renamed from: m */
    private final C22871g f224738m;

    /* renamed from: n */
    private final C21370a f224739n;

    /* renamed from: o */
    private C60870cx f224740o;

    public C82235u(C83334w wVar, C21370a aVar, C90821bm bmVar, C82297c cVar, C91142g gVar) {
        this.f224726a = wVar;
        this.f224739n = aVar;
        this.f224738m = bmVar.mo85163a(C82234t.class);
        this.f224727b = cVar;
        this.f224728c = gVar;
    }

    /* renamed from: a */
    public final void mo75574a(aeb aeb) {
        this.f224738m.mo28212l("[NGA] Monitoring event collect", new C82233s(this, aeb));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo75575b(long r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.google.android.libraries.f.a r0 = r8.f224739n     // Catch:{ all -> 0x0051 }
            long r0 = r0.mo26871c()     // Catch:{ all -> 0x0051 }
            java.lang.Long r2 = r8.f224736k     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x0039
            long r2 = r2.longValue()     // Catch:{ all -> 0x0051 }
            long r2 = r2 - r0
            r4 = 1
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x0032
            long r5 = r8.f224731f     // Catch:{ all -> 0x0051 }
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0030
            boolean r2 = r8.f224734i     // Catch:{ all -> 0x0051 }
            if (r2 != 0) goto L_0x0020
            goto L_0x0030
        L_0x0020:
            int r2 = r8.f224735j     // Catch:{ all -> 0x0051 }
            int r2 = r2 + r4
            r8.f224735j = r2     // Catch:{ all -> 0x0051 }
            long r2 = (long) r2     // Catch:{ all -> 0x0051 }
            long r5 = r8.f224730e     // Catch:{ all -> 0x0051 }
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0032
            r2 = 0
            r8.f224734i = r2     // Catch:{ all -> 0x0051 }
            goto L_0x0032
        L_0x0030:
            monitor-exit(r8)
            return
        L_0x0032:
            com.google.common.util.concurrent.cx r2 = r8.f224740o     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x0039
            r2.cancel(r4)     // Catch:{ all -> 0x0051 }
        L_0x0039:
            long r0 = r0 + r9
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0051 }
            r8.f224736k = r0     // Catch:{ all -> 0x0051 }
            com.google.android.libraries.gsa.k.g r0 = r8.f224738m     // Catch:{ all -> 0x0051 }
            com.google.android.apps.gsa.nga.shared.v.a.r r1 = new com.google.android.apps.gsa.nga.shared.v.a.r     // Catch:{ all -> 0x0051 }
            r1.<init>(r8)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "[NGA] Monitoring event flush"
            com.google.common.util.concurrent.cx r9 = r0.mo28208h(r2, r9, r1)     // Catch:{ all -> 0x0051 }
            r8.f224740o = r9     // Catch:{ all -> 0x0051 }
            monitor-exit(r8)
            return
        L_0x0051:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.p6407v.p6408a.C82235u.mo75575b(long):void");
    }
}
