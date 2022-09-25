package com.google.frameworks.client.data.android;

import android.content.Context;
import com.google.common.base.C58881cr;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.frameworks.client.data.android.f */
/* compiled from: PG */
public final class C61413f extends C61377as {

    /* renamed from: a */
    public final Context f166072a;

    /* renamed from: b */
    public final URI f166073b;

    /* renamed from: c */
    public final Executor f166074c;

    /* renamed from: d */
    public final Executor f166075d;

    /* renamed from: e */
    public final ScheduledExecutorService f166076e;

    /* renamed from: f */
    public final String f166077f;

    /* renamed from: g */
    public final C58881cr f166078g;

    /* renamed from: h */
    public final C61530n f166079h;

    /* renamed from: i */
    public final Integer f166080i;

    /* renamed from: j */
    public final Integer f166081j;

    /* renamed from: k */
    public final long f166082k;

    /* renamed from: l */
    public final int f166083l;

    public C61413f(Context context, URI uri, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, String str, C58881cr crVar, C61530n nVar, Integer num, Integer num2, long j, int i) {
        this.f166072a = context;
        this.f166073b = uri;
        this.f166074c = executor;
        this.f166075d = executor2;
        this.f166076e = scheduledExecutorService;
        this.f166077f = str;
        this.f166078g = crVar;
        this.f166079h = nVar;
        this.f166080i = num;
        this.f166081j = num2;
        this.f166082k = j;
        this.f166083l = i;
    }

    /* renamed from: a */
    public final int mo57939a() {
        return this.f166083l;
    }

    /* renamed from: b */
    public final long mo57940b() {
        return this.f166082k;
    }

    /* renamed from: c */
    public final Context mo57941c() {
        return this.f166072a;
    }

    /* renamed from: d */
    public final C58881cr mo57942d() {
        return this.f166078g;
    }

    /* renamed from: e */
    public final C61530n mo57943e() {
        return this.f166079h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r1 = r7.f166076e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r1 = r7.f166077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        r1 = r7.f166079h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        r1 = r7.f166080i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009b, code lost:
        r1 = r7.f166081j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.frameworks.client.data.android.C61377as
            r2 = 0
            if (r1 == 0) goto L_0x00c4
            com.google.frameworks.client.data.android.as r8 = (com.google.frameworks.client.data.android.C61377as) r8
            android.content.Context r1 = r7.f166072a
            android.content.Context r3 = r8.mo57941c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c4
            java.net.URI r1 = r7.f166073b
            java.net.URI r3 = r8.mo57947i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c4
            java.util.concurrent.Executor r1 = r7.f166074c
            java.util.concurrent.Executor r3 = r8.mo57948j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c4
            java.util.concurrent.Executor r1 = r7.f166075d
            java.util.concurrent.Executor r3 = r8.mo57949k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c4
            java.util.concurrent.ScheduledExecutorService r1 = r7.f166076e
            if (r1 != 0) goto L_0x0046
            java.util.concurrent.ScheduledExecutorService r1 = r8.mo57950l()
            if (r1 != 0) goto L_0x00c4
            goto L_0x0050
        L_0x0046:
            java.util.concurrent.ScheduledExecutorService r3 = r8.mo57950l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c4
        L_0x0050:
            java.lang.String r1 = r7.f166077f
            if (r1 != 0) goto L_0x005b
            java.lang.String r1 = r8.mo57946h()
            if (r1 != 0) goto L_0x00c4
            goto L_0x0065
        L_0x005b:
            java.lang.String r3 = r8.mo57946h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c4
        L_0x0065:
            com.google.common.base.cr r1 = r7.f166078g
            com.google.common.base.cr r3 = r8.mo57942d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c4
            com.google.frameworks.client.data.android.n r1 = r7.f166079h
            if (r1 != 0) goto L_0x007c
            com.google.frameworks.client.data.android.n r1 = r8.mo57943e()
            if (r1 != 0) goto L_0x00c4
            goto L_0x0086
        L_0x007c:
            com.google.frameworks.client.data.android.n r3 = r8.mo57943e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c4
        L_0x0086:
            java.lang.Integer r1 = r7.f166080i
            if (r1 != 0) goto L_0x0091
            java.lang.Integer r1 = r8.mo57945g()
            if (r1 != 0) goto L_0x00c4
            goto L_0x009b
        L_0x0091:
            java.lang.Integer r3 = r8.mo57945g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c4
        L_0x009b:
            java.lang.Integer r1 = r7.f166081j
            if (r1 != 0) goto L_0x00a6
            java.lang.Integer r1 = r8.mo57944f()
            if (r1 != 0) goto L_0x00c4
            goto L_0x00b1
        L_0x00a6:
            java.lang.Integer r3 = r8.mo57944f()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00b1
            goto L_0x00c4
        L_0x00b1:
            long r3 = r7.f166082k
            long r5 = r8.mo57940b()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00c4
            int r1 = r7.f166083l
            int r8 = r8.mo57939a()
            if (r1 != r8) goto L_0x00c4
            return r0
        L_0x00c4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.frameworks.client.data.android.C61413f.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Integer mo57944f() {
        return this.f166081j;
    }

    /* renamed from: g */
    public final Integer mo57945g() {
        return this.f166080i;
    }

    /* renamed from: h */
    public final String mo57946h() {
        return this.f166077f;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (((((((this.f166072a.hashCode() ^ 1000003) * 1000003) ^ this.f166073b.hashCode()) * 1000003) ^ this.f166074c.hashCode()) * 1000003) ^ this.f166075d.hashCode()) * 1000003;
        ScheduledExecutorService scheduledExecutorService = this.f166076e;
        int i5 = 0;
        if (scheduledExecutorService == null) {
            i = 0;
        } else {
            i = scheduledExecutorService.hashCode();
        }
        int i6 = (hashCode ^ i) * 1000003;
        String str = this.f166077f;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int hashCode2 = (((i6 ^ i2) * 1000003) ^ this.f166078g.hashCode()) * 1000003;
        C61530n nVar = this.f166079h;
        if (nVar == null) {
            i3 = 0;
        } else {
            i3 = nVar.hashCode();
        }
        int i7 = (hashCode2 ^ i3) * 1000003;
        Integer num = this.f166080i;
        if (num == null) {
            i4 = 0;
        } else {
            i4 = num.hashCode();
        }
        int i8 = (i7 ^ i4) * 1000003;
        Integer num2 = this.f166081j;
        if (num2 != null) {
            i5 = num2.hashCode();
        }
        long j = this.f166082k;
        return ((((i8 ^ i5) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f166083l;
    }

    /* renamed from: i */
    public final URI mo57947i() {
        return this.f166073b;
    }

    /* renamed from: j */
    public final Executor mo57948j() {
        return this.f166074c;
    }

    /* renamed from: k */
    public final Executor mo57949k() {
        return this.f166075d;
    }

    /* renamed from: l */
    public final ScheduledExecutorService mo57950l() {
        return this.f166076e;
    }

    public final String toString() {
        String obj = this.f166072a.toString();
        String obj2 = this.f166073b.toString();
        String obj3 = this.f166074c.toString();
        String obj4 = this.f166075d.toString();
        String valueOf = String.valueOf(this.f166076e);
        String str = this.f166077f;
        String obj5 = this.f166078g.toString();
        String valueOf2 = String.valueOf(this.f166079h);
        Integer num = this.f166080i;
        Integer num2 = this.f166081j;
        long j = this.f166082k;
        int i = this.f166083l;
        return "TransportConfig{applicationContext=" + obj + ", uri=" + obj2 + ", networkExecutor=" + obj3 + ", transportExecutor=" + obj4 + ", transportScheduledExecutorService=" + valueOf + ", userAgentOverride=" + str + ", recordNetworkMetricsToPrimes=" + obj5 + ", grpcServiceConfig=" + valueOf2 + ", trafficStatsUid=" + num + ", trafficStatsTag=" + num2 + ", grpcIdleTimeoutMillis=" + j + ", maxMessageSize=" + i + "}";
    }
}
