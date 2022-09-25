package com.google.frameworks.client.data.android.p4640g;

import com.google.frameworks.client.data.android.C61466h;
import java.net.URI;
import java.net.URISyntaxException;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5488io.grpc.C70888j;

/* renamed from: com.google.frameworks.client.data.android.g.am */
/* compiled from: PG */
public final class C61439am extends C70888j {

    /* renamed from: a */
    private final String f166112a;

    /* renamed from: b */
    private final C61466h f166113b;

    /* renamed from: c */
    private final Object f166114c = new Object();

    /* renamed from: d */
    private final ConcurrentHashMap f166115d = new ConcurrentHashMap();

    public C61439am(String str, C61466h hVar) {
        this.f166112a = str;
        this.f166113b = hVar;
    }

    /* renamed from: c */
    private static final URI m94085c(String str) {
        try {
            URI uri = new URI((String) null, str, (String) null, (String) null, (String) null);
            if (uri.getPort() != -1) {
                return uri;
            }
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), 443, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw new IllegalStateException("Malformed endpoint authority", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: io.grpc.j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p5488io.grpc.C70898m mo39510a(p5488io.grpc.C70338di r24, p5488io.grpc.C70851i r25) {
        /*
            r23 = this;
            r1 = r23
            r0 = r25
            com.google.frameworks.client.data.android.h r2 = r1.f166113b
            io.grpc.h r3 = com.google.frameworks.client.data.android.C61374ap.f165954a
            java.lang.Object r3 = r0.mo62571g(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0012
            java.lang.String r3 = r1.f166112a
        L_0x0012:
            java.net.URI r5 = m94085c(r3)
            java.lang.String r3 = r5.getAuthority()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r3 = r3 ^ 1
            java.lang.String r4 = "Could not parse channel authority"
            com.google.common.base.C58838bb.m90884s(r3, r4)
            io.grpc.h r3 = com.google.frameworks.client.data.android.C61368aj.f165949a
            java.lang.Object r3 = r0.mo62571g(r3)
            r8 = r3
            java.lang.Integer r8 = (java.lang.Integer) r8
            io.grpc.h r3 = com.google.frameworks.client.data.android.C61368aj.f165950b
            java.lang.Object r3 = r0.mo62571g(r3)
            r9 = r3
            java.lang.Integer r9 = (java.lang.Integer) r9
            com.google.frameworks.client.data.android.h r3 = r1.f166113b
            com.google.common.base.cr r3 = r3.mo57981d()
            java.lang.Object r3 = r3.mo6453a()
            java.lang.Long r3 = (java.lang.Long) r3
            long r6 = r3.longValue()
            com.google.frameworks.client.data.android.g.l r3 = new com.google.frameworks.client.data.android.g.l
            r4 = r3
            r4.<init>(r5, r6, r8, r9)
            j$.util.concurrent.ConcurrentHashMap r4 = r1.f166115d
            java.lang.Object r4 = r4.get(r3)
            io.grpc.j r4 = (p5488io.grpc.C70888j) r4
            if (r4 != 0) goto L_0x01a3
            java.lang.Object r5 = r1.f166114c
            monitor-enter(r5)
            j$.util.concurrent.ConcurrentHashMap r4 = r1.f166115d     // Catch:{ all -> 0x01a0 }
            boolean r4 = r4.containsKey(r3)     // Catch:{ all -> 0x01a0 }
            if (r4 != 0) goto L_0x0195
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x01a0 }
            com.google.common.base.cv r6 = new com.google.common.base.cv     // Catch:{ all -> 0x01a0 }
            r6.<init>(r4)     // Catch:{ all -> 0x01a0 }
            com.google.frameworks.client.data.android.e r4 = new com.google.frameworks.client.data.android.e     // Catch:{ all -> 0x01a0 }
            r4.<init>()     // Catch:{ all -> 0x01a0 }
            r4.f166054g = r6     // Catch:{ all -> 0x01a0 }
            r6 = 4194304(0x400000, float:5.877472E-39)
            r4.mo57938a(r6)     // Catch:{ all -> 0x01a0 }
            android.content.Context r6 = r2.mo57979b()     // Catch:{ all -> 0x01a0 }
            if (r6 == 0) goto L_0x018d
            r4.f166048a = r6     // Catch:{ all -> 0x01a0 }
            java.net.URI r6 = r3.f166140a     // Catch:{ all -> 0x01a0 }
            r4.f166049b = r6     // Catch:{ all -> 0x01a0 }
            java.lang.Integer r6 = r3.f166142c     // Catch:{ all -> 0x01a0 }
            r4.f166056i = r6     // Catch:{ all -> 0x01a0 }
            java.lang.Integer r6 = r3.f166143d     // Catch:{ all -> 0x01a0 }
            r4.f166057j = r6     // Catch:{ all -> 0x01a0 }
            long r6 = r3.f166141b     // Catch:{ all -> 0x01a0 }
            r4.f166058k = r6     // Catch:{ all -> 0x01a0 }
            byte r6 = r4.f166060m     // Catch:{ all -> 0x01a0 }
            r6 = r6 | 1
            byte r6 = (byte) r6     // Catch:{ all -> 0x01a0 }
            r4.f166060m = r6     // Catch:{ all -> 0x01a0 }
            java.util.concurrent.Executor r6 = r2.mo57995p()     // Catch:{ all -> 0x01a0 }
            if (r6 == 0) goto L_0x0185
            r4.f166050c = r6     // Catch:{ all -> 0x01a0 }
            java.util.concurrent.Executor r6 = r2.mo57996q()     // Catch:{ all -> 0x01a0 }
            if (r6 == 0) goto L_0x017d
            r4.f166051d = r6     // Catch:{ all -> 0x01a0 }
            java.util.concurrent.ScheduledExecutorService r6 = r2.mo57997r()     // Catch:{ all -> 0x01a0 }
            r4.f166052e = r6     // Catch:{ all -> 0x01a0 }
            java.lang.String r6 = r2.mo57993n()     // Catch:{ all -> 0x01a0 }
            r4.f166053f = r6     // Catch:{ all -> 0x01a0 }
            com.google.common.base.cr r6 = r2.mo57985g()     // Catch:{ all -> 0x01a0 }
            if (r6 == 0) goto L_0x0175
            r4.f166054g = r6     // Catch:{ all -> 0x01a0 }
            com.google.frameworks.client.data.android.n r6 = r2.mo57986h()     // Catch:{ all -> 0x01a0 }
            r4.f166055h = r6     // Catch:{ all -> 0x01a0 }
            int r6 = r2.mo57978a()     // Catch:{ all -> 0x01a0 }
            r4.mo57938a(r6)     // Catch:{ all -> 0x01a0 }
            byte r6 = r4.f166060m     // Catch:{ all -> 0x01a0 }
            r7 = 3
            if (r6 != r7) goto L_0x011d
            android.content.Context r9 = r4.f166048a     // Catch:{ all -> 0x01a0 }
            if (r9 == 0) goto L_0x011d
            java.net.URI r10 = r4.f166049b     // Catch:{ all -> 0x01a0 }
            if (r10 == 0) goto L_0x011d
            java.util.concurrent.Executor r11 = r4.f166050c     // Catch:{ all -> 0x01a0 }
            if (r11 == 0) goto L_0x011d
            java.util.concurrent.Executor r12 = r4.f166051d     // Catch:{ all -> 0x01a0 }
            if (r12 == 0) goto L_0x011d
            com.google.common.base.cr r15 = r4.f166054g     // Catch:{ all -> 0x01a0 }
            if (r15 != 0) goto L_0x00e2
            goto L_0x011d
        L_0x00e2:
            com.google.frameworks.client.data.android.f r6 = new com.google.frameworks.client.data.android.f     // Catch:{ all -> 0x01a0 }
            java.util.concurrent.ScheduledExecutorService r13 = r4.f166052e     // Catch:{ all -> 0x01a0 }
            java.lang.String r14 = r4.f166053f     // Catch:{ all -> 0x01a0 }
            com.google.frameworks.client.data.android.n r7 = r4.f166055h     // Catch:{ all -> 0x01a0 }
            java.lang.Integer r8 = r4.f166056i     // Catch:{ all -> 0x01a0 }
            java.lang.Integer r0 = r4.f166057j     // Catch:{ all -> 0x01a0 }
            r22 = r2
            long r1 = r4.f166058k     // Catch:{ all -> 0x0118 }
            int r4 = r4.f166059l     // Catch:{ all -> 0x0118 }
            r17 = r8
            r8 = r6
            r16 = r7
            r18 = r0
            r19 = r1
            r21 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)     // Catch:{ all -> 0x0118 }
            com.google.frameworks.client.data.android.g.z r0 = new com.google.frameworks.client.data.android.g.z     // Catch:{ all -> 0x0118 }
            com.google.frameworks.client.data.android.at r1 = r22.mo57990k()     // Catch:{ all -> 0x0118 }
            java.util.concurrent.Executor r2 = r22.mo57994o()     // Catch:{ all -> 0x0118 }
            r0.<init>(r1, r6, r2)     // Catch:{ all -> 0x0118 }
            r1 = r23
            j$.util.concurrent.ConcurrentHashMap r2 = r1.f166115d     // Catch:{ all -> 0x01a0 }
            r2.put(r3, r0)     // Catch:{ all -> 0x01a0 }
            goto L_0x0195
        L_0x0118:
            r0 = move-exception
            r1 = r23
            goto L_0x01a1
        L_0x011d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a0 }
            r0.<init>()     // Catch:{ all -> 0x01a0 }
            android.content.Context r2 = r4.f166048a     // Catch:{ all -> 0x01a0 }
            if (r2 != 0) goto L_0x012b
            java.lang.String r2 = " applicationContext"
            r0.append(r2)     // Catch:{ all -> 0x01a0 }
        L_0x012b:
            java.net.URI r2 = r4.f166049b     // Catch:{ all -> 0x01a0 }
            if (r2 != 0) goto L_0x0134
            java.lang.String r2 = " uri"
            r0.append(r2)     // Catch:{ all -> 0x01a0 }
        L_0x0134:
            java.util.concurrent.Executor r2 = r4.f166050c     // Catch:{ all -> 0x01a0 }
            if (r2 != 0) goto L_0x013d
            java.lang.String r2 = " networkExecutor"
            r0.append(r2)     // Catch:{ all -> 0x01a0 }
        L_0x013d:
            java.util.concurrent.Executor r2 = r4.f166051d     // Catch:{ all -> 0x01a0 }
            if (r2 != 0) goto L_0x0146
            java.lang.String r2 = " transportExecutor"
            r0.append(r2)     // Catch:{ all -> 0x01a0 }
        L_0x0146:
            com.google.common.base.cr r2 = r4.f166054g     // Catch:{ all -> 0x01a0 }
            if (r2 != 0) goto L_0x014f
            java.lang.String r2 = " recordNetworkMetricsToPrimes"
            r0.append(r2)     // Catch:{ all -> 0x01a0 }
        L_0x014f:
            byte r2 = r4.f166060m     // Catch:{ all -> 0x01a0 }
            r2 = r2 & 1
            if (r2 != 0) goto L_0x015a
            java.lang.String r2 = " grpcIdleTimeoutMillis"
            r0.append(r2)     // Catch:{ all -> 0x01a0 }
        L_0x015a:
            byte r2 = r4.f166060m     // Catch:{ all -> 0x01a0 }
            r2 = r2 & 2
            if (r2 != 0) goto L_0x0165
            java.lang.String r2 = " maxMessageSize"
            r0.append(r2)     // Catch:{ all -> 0x01a0 }
        L_0x0165:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01a0 }
            java.lang.String r3 = "Missing required properties:"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01a0 }
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x01a0 }
            r2.<init>(r0)     // Catch:{ all -> 0x01a0 }
            throw r2     // Catch:{ all -> 0x01a0 }
        L_0x0175:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01a0 }
            java.lang.String r2 = "Null recordNetworkMetricsToPrimes"
            r0.<init>(r2)     // Catch:{ all -> 0x01a0 }
            throw r0     // Catch:{ all -> 0x01a0 }
        L_0x017d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01a0 }
            java.lang.String r2 = "Null transportExecutor"
            r0.<init>(r2)     // Catch:{ all -> 0x01a0 }
            throw r0     // Catch:{ all -> 0x01a0 }
        L_0x0185:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01a0 }
            java.lang.String r2 = "Null networkExecutor"
            r0.<init>(r2)     // Catch:{ all -> 0x01a0 }
            throw r0     // Catch:{ all -> 0x01a0 }
        L_0x018d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01a0 }
            java.lang.String r2 = "Null applicationContext"
            r0.<init>(r2)     // Catch:{ all -> 0x01a0 }
            throw r0     // Catch:{ all -> 0x01a0 }
        L_0x0195:
            j$.util.concurrent.ConcurrentHashMap r0 = r1.f166115d     // Catch:{ all -> 0x01a0 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x01a0 }
            r4 = r0
            io.grpc.j r4 = (p5488io.grpc.C70888j) r4     // Catch:{ all -> 0x01a0 }
            monitor-exit(r5)     // Catch:{ all -> 0x01a0 }
            goto L_0x01a3
        L_0x01a0:
            r0 = move-exception
        L_0x01a1:
            monitor-exit(r5)     // Catch:{ all -> 0x01a0 }
            throw r0
        L_0x01a3:
            r0 = r24
            r2 = r25
            io.grpc.m r0 = r4.mo39510a(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.frameworks.client.data.android.p4640g.C61439am.mo39510a(io.grpc.di, io.grpc.i):io.grpc.m");
    }

    /* renamed from: b */
    public final String mo39511b() {
        return this.f166112a;
    }
}
