package com.google.frameworks.client.data.android;

import android.content.Context;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import com.google.frameworks.client.data.android.p4632a.C61343d;
import com.google.frameworks.client.data.android.p4636d.C61402a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.frameworks.client.data.android.c */
/* compiled from: PG */
final class C61394c extends C61466h {

    /* renamed from: a */
    private final Context f166009a;

    /* renamed from: b */
    private final C21370a f166010b;

    /* renamed from: c */
    private final C61378at f166011c;

    /* renamed from: d */
    private final Executor f166012d;

    /* renamed from: e */
    private final Executor f166013e;

    /* renamed from: f */
    private final Executor f166014f;

    /* renamed from: g */
    private final ScheduledExecutorService f166015g;

    /* renamed from: h */
    private final C61343d f166016h;

    /* renamed from: i */
    private final String f166017i;

    /* renamed from: j */
    private final C58881cr f166018j;

    /* renamed from: k */
    private final C58881cr f166019k;

    /* renamed from: l */
    private final C58881cr f166020l;

    /* renamed from: m */
    private final C58881cr f166021m;

    /* renamed from: n */
    private final int f166022n;

    public C61394c(Context context, C21370a aVar, C61378at atVar, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, C61343d dVar, String str, C58881cr crVar, C58881cr crVar2, C58881cr crVar3, C58881cr crVar4, int i) {
        this.f166009a = context;
        this.f166010b = aVar;
        this.f166011c = atVar;
        this.f166012d = executor;
        this.f166013e = executor2;
        this.f166014f = executor3;
        this.f166015g = scheduledExecutorService;
        this.f166016h = dVar;
        this.f166017i = str;
        this.f166018j = crVar;
        this.f166019k = crVar2;
        this.f166020l = crVar3;
        this.f166021m = crVar4;
        this.f166022n = i;
    }

    /* renamed from: a */
    public final int mo57978a() {
        return this.f166022n;
    }

    /* renamed from: b */
    public final Context mo57979b() {
        return this.f166009a;
    }

    /* renamed from: c */
    public final C21370a mo57980c() {
        return this.f166010b;
    }

    /* renamed from: d */
    public final C58881cr mo57981d() {
        return this.f166021m;
    }

    /* renamed from: e */
    public final C58881cr mo57982e() {
        return this.f166020l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r1 = r4.f166015g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        r1 = r4.f166016h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0083, code lost:
        r1 = r4.f166017i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.frameworks.client.data.android.C61466h
            r2 = 0
            if (r1 == 0) goto L_0x00e4
            com.google.frameworks.client.data.android.h r5 = (com.google.frameworks.client.data.android.C61466h) r5
            android.content.Context r1 = r4.f166009a
            android.content.Context r3 = r5.mo57979b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e4
            com.google.android.libraries.f.a r1 = r4.f166010b
            com.google.android.libraries.f.a r3 = r5.mo57980c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e4
            com.google.frameworks.client.data.android.at r1 = r4.f166011c
            com.google.frameworks.client.data.android.at r3 = r5.mo57990k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e4
            java.util.concurrent.Executor r1 = r4.f166012d
            java.util.concurrent.Executor r3 = r5.mo57996q()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e4
            java.util.concurrent.Executor r1 = r4.f166013e
            java.util.concurrent.Executor r3 = r5.mo57994o()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e4
            java.util.concurrent.Executor r1 = r4.f166014f
            java.util.concurrent.Executor r3 = r5.mo57995p()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e4
            java.util.concurrent.ScheduledExecutorService r1 = r4.f166015g
            if (r1 != 0) goto L_0x005e
            java.util.concurrent.ScheduledExecutorService r1 = r5.mo57997r()
            if (r1 != 0) goto L_0x00e4
            goto L_0x0068
        L_0x005e:
            java.util.concurrent.ScheduledExecutorService r3 = r5.mo57997r()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e4
        L_0x0068:
            com.google.frameworks.client.data.android.a.d r1 = r4.f166016h
            if (r1 != 0) goto L_0x0073
            com.google.frameworks.client.data.android.a.d r1 = r5.mo57991l()
            if (r1 != 0) goto L_0x00e4
            goto L_0x007d
        L_0x0073:
            com.google.frameworks.client.data.android.a.d r3 = r5.mo57991l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e4
        L_0x007d:
            com.google.frameworks.client.data.android.am r1 = r5.mo57988i()
            if (r1 != 0) goto L_0x00e4
            java.lang.String r1 = r4.f166017i
            if (r1 != 0) goto L_0x008e
            java.lang.String r1 = r5.mo57993n()
            if (r1 != 0) goto L_0x00e4
            goto L_0x0099
        L_0x008e:
            java.lang.String r3 = r5.mo57993n()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0099
            goto L_0x00e4
        L_0x0099:
            com.google.common.base.cr r1 = r4.f166018j
            com.google.common.base.cr r3 = r5.mo57985g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e4
            com.google.common.base.cr r1 = r4.f166019k
            com.google.common.base.cr r3 = r5.mo57984f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e4
            com.google.common.base.cr r1 = r4.f166020l
            com.google.common.base.cr r3 = r5.mo57982e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e4
            com.google.common.base.cr r1 = r4.f166021m
            com.google.common.base.cr r3 = r5.mo57981d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e4
            com.google.frameworks.client.data.android.aq r1 = r5.mo57989j()
            if (r1 != 0) goto L_0x00e4
            com.google.frameworks.client.data.android.n r1 = r5.mo57986h()
            if (r1 != 0) goto L_0x00e4
            com.google.frameworks.client.data.android.d.a r1 = r5.mo57992m()
            if (r1 != 0) goto L_0x00e4
            int r1 = r4.f166022n
            int r5 = r5.mo57978a()
            if (r1 != r5) goto L_0x00e4
            return r0
        L_0x00e4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.frameworks.client.data.android.C61394c.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C58881cr mo57984f() {
        return this.f166019k;
    }

    /* renamed from: g */
    public final C58881cr mo57985g() {
        return this.f166018j;
    }

    /* renamed from: h */
    public final C61530n mo57986h() {
        return null;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (((((((((((this.f166009a.hashCode() ^ 1000003) * 1000003) ^ this.f166010b.hashCode()) * 1000003) ^ this.f166011c.hashCode()) * 1000003) ^ this.f166012d.hashCode()) * 1000003) ^ this.f166013e.hashCode()) * 1000003) ^ this.f166014f.hashCode()) * 1000003;
        ScheduledExecutorService scheduledExecutorService = this.f166015g;
        int i3 = 0;
        if (scheduledExecutorService == null) {
            i = 0;
        } else {
            i = scheduledExecutorService.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        C61343d dVar = this.f166016h;
        if (dVar == null) {
            i2 = 0;
        } else {
            i2 = dVar.hashCode();
        }
        int i5 = (i4 ^ i2) * -721379959;
        String str = this.f166017i;
        if (str != null) {
            i3 = str.hashCode();
        }
        return ((((((((((i5 ^ i3) * 1000003) ^ this.f166018j.hashCode()) * 1000003) ^ this.f166019k.hashCode()) * 1000003) ^ this.f166020l.hashCode()) * 1000003) ^ this.f166021m.hashCode()) * 1525764945) ^ this.f166022n;
    }

    /* renamed from: i */
    public final C61371am mo57988i() {
        return null;
    }

    /* renamed from: j */
    public final C61375aq mo57989j() {
        return null;
    }

    /* renamed from: k */
    public final C61378at mo57990k() {
        return this.f166011c;
    }

    /* renamed from: l */
    public final C61343d mo57991l() {
        return this.f166016h;
    }

    /* renamed from: m */
    public final C61402a mo57992m() {
        return null;
    }

    /* renamed from: n */
    public final String mo57993n() {
        return this.f166017i;
    }

    /* renamed from: o */
    public final Executor mo57994o() {
        return this.f166013e;
    }

    /* renamed from: p */
    public final Executor mo57995p() {
        return this.f166014f;
    }

    /* renamed from: q */
    public final Executor mo57996q() {
        return this.f166012d;
    }

    /* renamed from: r */
    public final ScheduledExecutorService mo57997r() {
        return this.f166015g;
    }

    public final String toString() {
        String obj = this.f166009a.toString();
        String obj2 = this.f166010b.toString();
        String obj3 = this.f166011c.toString();
        String obj4 = this.f166012d.toString();
        String obj5 = this.f166013e.toString();
        String obj6 = this.f166014f.toString();
        String valueOf = String.valueOf(this.f166015g);
        String valueOf2 = String.valueOf(this.f166016h);
        String str = this.f166017i;
        String obj7 = this.f166018j.toString();
        String obj8 = this.f166019k.toString();
        String obj9 = this.f166020l.toString();
        String obj10 = this.f166021m.toString();
        int i = this.f166022n;
        return "ChannelConfig{context=" + obj + ", clock=" + obj2 + ", transport=" + obj3 + ", transportExecutor=" + obj4 + ", ioExecutor=" + obj5 + ", networkExecutor=" + obj6 + ", transportScheduledExecutor=" + valueOf + ", authContextManager=" + valueOf2 + ", rpcCacheProvider=null, userAgentOverride=" + str + ", recordNetworkMetricsToPrimes=" + obj7 + ", recordCachingMetricsToPrimes=" + obj8 + ", recordBandwidthMetrics=" + obj9 + ", grpcIdleTimeoutMillis=" + obj10 + ", streamzConfig=null, grpcServiceConfig=null, consistencyTokenConfig=null, maxMessageSize=" + i + "}";
    }
}
