package com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b;

import android.content.ContentProviderClient;
import android.media.AudioTrack;
import android.os.ParcelFileDescriptor;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.b.b.ad */
/* compiled from: PG */
public final /* synthetic */ class C95178ad implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95186al f266291a;

    /* renamed from: b */
    public final /* synthetic */ C95193h f266292b;

    /* renamed from: c */
    public final /* synthetic */ ParcelFileDescriptor.AutoCloseInputStream f266293c;

    /* renamed from: d */
    public final /* synthetic */ AudioTrack f266294d;

    /* renamed from: e */
    public final /* synthetic */ ContentProviderClient f266295e;

    /* renamed from: f */
    public final /* synthetic */ C95184aj f266296f;

    public /* synthetic */ C95178ad(C95186al alVar, C95193h hVar, C95184aj ajVar, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream, AudioTrack audioTrack, ContentProviderClient contentProviderClient) {
        this.f266291a = alVar;
        this.f266292b = hVar;
        this.f266296f = ajVar;
        this.f266293c = autoCloseInputStream;
        this.f266294d = audioTrack;
        this.f266295e = contentProviderClient;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r9.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r1 = r19
            com.google.android.apps.gsa.staticplugins.bisto.b.b.al r2 = r1.f266291a
            com.google.android.apps.gsa.staticplugins.bisto.b.b.h r3 = r1.f266292b
            com.google.android.apps.gsa.staticplugins.bisto.b.b.aj r0 = r1.f266296f
            android.os.ParcelFileDescriptor$AutoCloseInputStream r4 = r1.f266293c
            android.media.AudioTrack r5 = r1.f266294d
            android.content.ContentProviderClient r6 = r1.f266295e
            java.lang.Object r7 = r2.f266312d
            monitor-enter(r7)
            r8 = 0
            r2.f266315g = r8     // Catch:{ all -> 0x0153 }
            monitor-exit(r7)     // Catch:{ all -> 0x0153 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            j$.time.Duration r9 = com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95186al.f266309c     // Catch:{ IOException -> 0x00d1 }
            long r9 = r9.toMillis()     // Catch:{ IOException -> 0x00d1 }
            j$.time.Duration r11 = com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95186al.f266308b     // Catch:{ IOException -> 0x00d1 }
            long r11 = r11.toMillis()     // Catch:{ IOException -> 0x00d1 }
            r13 = 6400(0x1900, float:8.968E-42)
            byte[] r13 = new byte[r13]     // Catch:{ IOException -> 0x00d1 }
            com.google.android.libraries.gsa.k.g r14 = r3.f266329a     // Catch:{ IOException -> 0x00d1 }
            com.google.android.apps.gsa.staticplugins.bisto.b.b.e r15 = new com.google.android.apps.gsa.staticplugins.bisto.b.b.e     // Catch:{ IOException -> 0x00d1 }
            r15.<init>(r3)     // Catch:{ IOException -> 0x00d1 }
            com.google.android.apps.gsa.staticplugins.bisto.b.b.g r9 = com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95192g.m157348a(r14, r9, r15)     // Catch:{ IOException -> 0x00d1 }
        L_0x0032:
            com.google.android.libraries.f.a r10 = r3.f266330b     // Catch:{ all -> 0x00c1 }
            long r14 = r10.mo26871c()     // Catch:{ all -> 0x00c1 }
            r7 = r11
        L_0x0039:
            java.util.concurrent.atomic.AtomicBoolean r10 = r3.f266332d     // Catch:{ all -> 0x00c1 }
            boolean r10 = r10.get()     // Catch:{ all -> 0x00c1 }
            if (r10 != 0) goto L_0x00b5
            java.util.concurrent.atomic.AtomicBoolean r10 = r3.f266333e     // Catch:{ all -> 0x00c1 }
            boolean r10 = r10.get()     // Catch:{ all -> 0x00c1 }
            if (r10 != 0) goto L_0x00b5
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00c1 }
            com.google.android.libraries.gsa.k.g r1 = r3.f266329a     // Catch:{ all -> 0x00c1 }
            r16 = r6
            com.google.android.apps.gsa.staticplugins.bisto.b.b.f r6 = new com.google.android.apps.gsa.staticplugins.bisto.b.b.f     // Catch:{ all -> 0x00bf }
            r6.<init>(r10)     // Catch:{ all -> 0x00bf }
            com.google.android.apps.gsa.staticplugins.bisto.b.b.g r1 = com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95192g.m157348a(r1, r7, r6)     // Catch:{ all -> 0x00bf }
            java.io.InputStream r6 = r3.f266331c     // Catch:{ all -> 0x00a9 }
            int r6 = r6.read(r13)     // Catch:{ all -> 0x00a9 }
            r1.close()     // Catch:{ all -> 0x00bf }
            if (r6 != 0) goto L_0x0082
            com.google.android.libraries.f.a r1 = r3.f266330b     // Catch:{ all -> 0x00bf }
            long r6 = r1.mo26871c()     // Catch:{ all -> 0x00bf }
            long r6 = r14 - r6
            long r6 = r6 + r11
            r17 = 0
            int r1 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r1 <= 0) goto L_0x007a
            r1 = r19
            r7 = r6
            r6 = r16
            goto L_0x0039
        L_0x007a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00bf }
            java.lang.String r1 = "Timeout"
            r0.<init>(r1)     // Catch:{ all -> 0x00bf }
            throw r0     // Catch:{ all -> 0x00bf }
        L_0x0082:
            r1 = 0
            if (r6 <= 0) goto L_0x00a5
            java.util.concurrent.atomic.AtomicBoolean r7 = r3.f266332d     // Catch:{ all -> 0x00bf }
            boolean r7 = r7.get()     // Catch:{ all -> 0x00bf }
            if (r7 != 0) goto L_0x009f
            android.media.AudioTrack r7 = r0.f266305b     // Catch:{ all -> 0x00bf }
            r7.write(r13, r1, r6)     // Catch:{ all -> 0x00bf }
            boolean r6 = r0.f266304a     // Catch:{ all -> 0x00bf }
            if (r6 == 0) goto L_0x009f
            r0.f266304a = r1     // Catch:{ all -> 0x00bf }
            com.google.android.apps.gsa.staticplugins.bisto.f.af r1 = r0.f266306c     // Catch:{ all -> 0x00bf }
            com.google.android.libraries.performance.primes.au r6 = com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95457c.f267103c     // Catch:{ all -> 0x00bf }
            r1.mo89220a(r6)     // Catch:{ all -> 0x00bf }
        L_0x009f:
            r1 = r19
            r6 = r16
            r8 = 0
            goto L_0x0032
        L_0x00a5:
            r9.close()     // Catch:{ IOException -> 0x00cf }
            goto L_0x0105
        L_0x00a9:
            r0 = move-exception
            r6 = r0
            r1.close()     // Catch:{ all -> 0x00af }
            goto L_0x00b4
        L_0x00af:
            r0 = move-exception
            r1 = r0
            com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95189d.m157347a(r6, r1)     // Catch:{ all -> 0x00bf }
        L_0x00b4:
            throw r6     // Catch:{ all -> 0x00bf }
        L_0x00b5:
            r16 = r6
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00bf }
            java.lang.String r1 = "Stopped"
            r0.<init>(r1)     // Catch:{ all -> 0x00bf }
            throw r0     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r0 = move-exception
            goto L_0x00c4
        L_0x00c1:
            r0 = move-exception
            r16 = r6
        L_0x00c4:
            r1 = r0
            r9.close()     // Catch:{ all -> 0x00c9 }
            goto L_0x00ce
        L_0x00c9:
            r0 = move-exception
            r6 = r0
            com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95189d.m157347a(r1, r6)     // Catch:{ IOException -> 0x00cf }
        L_0x00ce:
            throw r1     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            r0 = move-exception
            goto L_0x00d4
        L_0x00d1:
            r0 = move-exception
            r16 = r6
        L_0x00d4:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95186al.f266307a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "UriPlayer"
            r1.mo56378ag(r6, r7)
            java.lang.String r6 = "Playing uri finished unexpectedly"
            r7 = 14655(0x393f, float:2.0536E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r7)).mo56386p(r6)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f266332d
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0104
            java.lang.Object r1 = r2.f266312d
            monitor-enter(r1)
            com.google.android.apps.gsa.staticplugins.bisto.f.af r0 = r2.f266315g     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x00ff
            com.google.android.libraries.performance.primes.au r6 = com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95457c.f267105e     // Catch:{ all -> 0x0101 }
            r0.mo89220a(r6)     // Catch:{ all -> 0x0101 }
            r6 = 0
            r2.f266315g = r6     // Catch:{ all -> 0x0101 }
        L_0x00ff:
            monitor-exit(r1)     // Catch:{ all -> 0x0101 }
            goto L_0x0104
        L_0x0101:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0101 }
            throw r0
        L_0x0104:
            r1 = 1
        L_0x0105:
            r4.close()     // Catch:{ IOException -> 0x010a }
            r7 = r1
            goto L_0x0121
        L_0x010a:
            r0 = move-exception
            r1 = r0
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95186al.f266307a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "UriPlayer"
            r0.mo56378ag(r4, r6)
            java.lang.String r4 = "Exception while closing stream"
            r6 = 14654(0x393e, float:2.0535E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r1)).mo56372aa(r6)).mo56386p(r4)
            r7 = 1
        L_0x0121:
            r5.stop()     // Catch:{ IllegalStateException -> 0x0125 }
            goto L_0x013b
        L_0x0125:
            r0 = move-exception
            r1 = r0
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95186al.f266307a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "UriPlayer"
            r0.mo56378ag(r4, r6)
            java.lang.String r4 = "Failed to stop AudioTrack"
            r6 = 14653(0x393d, float:2.0533E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r1)).mo56372aa(r6)).mo56386p(r4)
        L_0x013b:
            r5.release()
            r16.release()
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f266332d
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0152
            if (r7 == 0) goto L_0x014f
            r2.mo89091b()
            return
        L_0x014f:
            r2.mo89092c()
        L_0x0152:
            return
        L_0x0153:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0153 }
            goto L_0x0157
        L_0x0156:
            throw r0
        L_0x0157:
            goto L_0x0156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95178ad.run():void");
    }
}
