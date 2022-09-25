package com.google.android.apps.gsa.nga.engine.recognition.p6110c;

import com.google.android.apps.gsa.nga.engine.am.p.a;
import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.recognition.C77572b;
import com.google.android.apps.gsa.nga.engine.recognition.C77632g;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.c.b */
/* compiled from: PG */
public final class C77583b implements a, C77632g {

    /* renamed from: a */
    public static final C58974d f213738a = C58974d.m91136j();

    /* renamed from: e */
    private static final Object f213739e = new Object();

    /* renamed from: b */
    public final C21370a f213740b;

    /* renamed from: c */
    public final C91142g f213741c;

    /* renamed from: d */
    public final C83334w f213742d;

    /* renamed from: f */
    private final C77572b f213743f;

    /* renamed from: g */
    private C77582a f213744g;

    public C77583b(C77572b bVar, C21370a aVar, C91142g gVar, C83334w wVar) {
        this.f213743f = bVar;
        this.f213740b = aVar;
        this.f213741c = gVar;
        this.f213742d = wVar;
    }

    /* renamed from: d */
    private final C77582a m124520d(C83320io ioVar) {
        C77582a aVar = this.f213744g;
        if (aVar == null || !aVar.f213728a.f227136c.equals(ioVar.f227136c)) {
            return null;
        }
        return this.f213744g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b9, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72723a(com.google.android.apps.gsa.nga.shared.p6296ab.p6299b.C80542d r10) {
        /*
            r9 = this;
            int r0 = r10.f221089e
            long r0 = r10.f221088d
            java.lang.Object r0 = f213739e
            monitor-enter(r0)
            com.google.android.apps.gsa.nga.shared.v.io r1 = r10.f221086b     // Catch:{ all -> 0x00bc }
            if (r1 != 0) goto L_0x000d
            com.google.android.apps.gsa.nga.shared.v.io r1 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d     // Catch:{ all -> 0x00bc }
        L_0x000d:
            com.google.android.apps.gsa.nga.engine.recognition.c.a r1 = r9.m124520d(r1)     // Catch:{ all -> 0x00bc }
            if (r1 == 0) goto L_0x00ba
            int r2 = r10.f221089e     // Catch:{ all -> 0x00bc }
            int r2 = com.google.android.apps.gsa.nga.shared.p6296ab.p6299b.C80541c.m128194a(r2)     // Catch:{ all -> 0x00bc }
            r3 = 1
            if (r2 != 0) goto L_0x001d
            r2 = 1
        L_0x001d:
            long r4 = r10.f221088d     // Catch:{ all -> 0x00bc }
            j$.time.Duration r10 = p3186j$.time.Duration.ofMillis(r4)     // Catch:{ all -> 0x00bc }
            r4 = 4
            if (r2 != r4) goto L_0x0036
            com.google.android.apps.gsa.nga.engine.recognition.c.b r10 = r1.f213737j     // Catch:{ all -> 0x00bc }
            com.google.android.libraries.f.a r10 = r10.f213740b     // Catch:{ all -> 0x00bc }
            long r2 = r10.mo26872d()     // Catch:{ all -> 0x00bc }
            j$.time.Duration r10 = p3186j$.time.Duration.ofNanos(r2)     // Catch:{ all -> 0x00bc }
            r1.f213733f = r10     // Catch:{ all -> 0x00bc }
            goto L_0x00b8
        L_0x0036:
            j$.time.Duration r2 = r1.f213732e     // Catch:{ all -> 0x00bc }
            if (r2 != 0) goto L_0x00a8
            com.google.common.f.a.d r2 = f213738a     // Catch:{ all -> 0x00bc }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x00bc }
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2     // Catch:{ all -> 0x00bc }
            r4 = 4305(0x10d1, float:6.033E-42)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x00bc }
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2     // Catch:{ all -> 0x00bc }
            com.google.android.apps.gsa.nga.engine.recognition.c.b r4 = r1.f213737j     // Catch:{ all -> 0x00bc }
            com.google.android.libraries.f.a r4 = r4.f213740b     // Catch:{ all -> 0x00bc }
            long r4 = r4.mo26872d()     // Catch:{ all -> 0x00bc }
            java.lang.String r6 = "Time to first progress event is %s"
            j$.time.Duration r4 = p3186j$.time.Duration.ofNanos(r4)     // Catch:{ all -> 0x00bc }
            j$.time.Duration r5 = r1.f213731d     // Catch:{ all -> 0x00bc }
            j$.time.Duration r4 = r4.minus(r5)     // Catch:{ all -> 0x00bc }
            r2.mo56389s(r6, r4)     // Catch:{ all -> 0x00bc }
            com.google.android.apps.gsa.nga.engine.recognition.c.b r2 = r1.f213737j     // Catch:{ all -> 0x00bc }
            com.google.android.apps.gsa.nga.shared.v.w r2 = r2.f213742d     // Catch:{ all -> 0x00bc }
            com.google.android.apps.gsa.nga.shared.v.d.ec r4 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec.SPEECH_EVENT     // Catch:{ all -> 0x00bc }
            com.google.android.apps.gsa.nga.shared.v.d.ea r5 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea.f225977c     // Catch:{ all -> 0x00bc }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x00bc }
            com.google.android.apps.gsa.nga.shared.v.d.dz r5 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz) r5     // Catch:{ all -> 0x00bc }
            com.google.android.apps.gsa.nga.shared.v.d.gz r6 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82964gz.f226343j     // Catch:{ all -> 0x00bc }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ all -> 0x00bc }
            com.google.android.apps.gsa.nga.shared.v.d.gq r6 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82955gq) r6     // Catch:{ all -> 0x00bc }
            r6.copyOnWrite()     // Catch:{ all -> 0x00bc }
            com.google.protobuf.bv r7 = r6.instance     // Catch:{ all -> 0x00bc }
            com.google.android.apps.gsa.nga.shared.v.d.gz r7 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82964gz) r7     // Catch:{ all -> 0x00bc }
            r8 = 9
            r7.f226346b = r8     // Catch:{ all -> 0x00bc }
            int r8 = r7.f226345a     // Catch:{ all -> 0x00bc }
            r3 = r3 | r8
            r7.f226345a = r3     // Catch:{ all -> 0x00bc }
            r5.copyOnWrite()     // Catch:{ all -> 0x00bc }
            com.google.protobuf.bv r3 = r5.instance     // Catch:{ all -> 0x00bc }
            com.google.android.apps.gsa.nga.shared.v.d.ea r3 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea) r3     // Catch:{ all -> 0x00bc }
            com.google.protobuf.bv r6 = r6.build()     // Catch:{ all -> 0x00bc }
            com.google.android.apps.gsa.nga.shared.v.d.gz r6 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82964gz) r6     // Catch:{ all -> 0x00bc }
            r6.getClass()     // Catch:{ all -> 0x00bc }
            r3.f225980b = r6     // Catch:{ all -> 0x00bc }
            r6 = 13
            r3.f225979a = r6     // Catch:{ all -> 0x00bc }
            com.google.protobuf.bv r3 = r5.build()     // Catch:{ all -> 0x00bc }
            com.google.android.apps.gsa.nga.shared.v.d.ea r3 = (com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea) r3     // Catch:{ all -> 0x00bc }
            com.google.android.apps.gsa.nga.shared.v.io r5 = r1.f213728a     // Catch:{ all -> 0x00bc }
            r2.mo75545c(r4, r3, r5)     // Catch:{ all -> 0x00bc }
        L_0x00a8:
            com.google.android.apps.gsa.nga.engine.recognition.c.b r2 = r1.f213737j     // Catch:{ all -> 0x00bc }
            com.google.android.libraries.f.a r2 = r2.f213740b     // Catch:{ all -> 0x00bc }
            long r2 = r2.mo26872d()     // Catch:{ all -> 0x00bc }
            j$.time.Duration r2 = p3186j$.time.Duration.ofNanos(r2)     // Catch:{ all -> 0x00bc }
            r1.f213732e = r2     // Catch:{ all -> 0x00bc }
            r1.f213734g = r10     // Catch:{ all -> 0x00bc }
        L_0x00b8:
            monitor-exit(r0)     // Catch:{ all -> 0x00bc }
            return
        L_0x00ba:
            monitor-exit(r0)     // Catch:{ all -> 0x00bc }
            return
        L_0x00bc:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bc }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.recognition.p6110c.C77583b.mo72723a(com.google.android.apps.gsa.nga.shared.ab.b.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c0, code lost:
        if (r4 == null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c2, code lost:
        r6.f213743f.mo72711g(r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c9, code lost:
        return p3186j$.time.Duration.ZERO;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d6, code lost:
        return p3186j$.time.Duration.ofMillis(r6.f213741c.mo85399d(com.google.android.apps.gsa.shared.p7066m.C90126fx.f251398i));
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.time.Duration mo72724b(com.google.android.apps.gsa.nga.engine.b.g.ac r7) {
        /*
            r6 = this;
            com.google.android.apps.gsa.shared.util.v.g r0 = r6.f213741c
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251071br
            boolean r0 = r0.mo85405j(r1)
            if (r0 != 0) goto L_0x0014
            com.google.android.apps.gsa.nga.engine.recognition.b r0 = r6.f213743f
            com.google.android.apps.gsa.nga.engine.recognition.a r1 = com.google.android.apps.gsa.nga.engine.recognition.C77495a.LEGACY_TIMEOUT
            r0.mo72711g(r7, r1)
            j$.time.Duration r7 = p3186j$.time.Duration.ZERO
            return r7
        L_0x0014:
            java.lang.Object r0 = f213739e
            monitor-enter(r0)
            com.google.android.apps.gsa.nga.shared.v.io r1 = r7.b()     // Catch:{ all -> 0x00d7 }
            com.google.android.apps.gsa.nga.engine.recognition.c.a r1 = r6.m124520d(r1)     // Catch:{ all -> 0x00d7 }
            if (r1 != 0) goto L_0x0025
            j$.time.Duration r7 = p3186j$.time.Duration.ZERO     // Catch:{ all -> 0x00d7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d7 }
            return r7
        L_0x0025:
            com.google.android.apps.gsa.nga.engine.recognition.c.b r2 = r1.f213737j     // Catch:{ all -> 0x00d7 }
            com.google.android.libraries.f.a r2 = r2.f213740b     // Catch:{ all -> 0x00d7 }
            long r2 = r2.mo26872d()     // Catch:{ all -> 0x00d7 }
            j$.time.Duration r2 = p3186j$.time.Duration.ofNanos(r2)     // Catch:{ all -> 0x00d7 }
            boolean r3 = r1.f213736i     // Catch:{ all -> 0x00d7 }
            r4 = 0
            if (r3 == 0) goto L_0x004e
            j$.time.Duration r3 = r1.f213731d     // Catch:{ all -> 0x00d7 }
            j$.time.Duration r5 = r1.f213735h     // Catch:{ all -> 0x00d7 }
            j$.time.Duration r3 = r3.plus(r5)     // Catch:{ all -> 0x00d7 }
            j$.time.Duration r1 = r1.f213734g     // Catch:{ all -> 0x00d7 }
            j$.time.Duration r1 = r3.minus(r1)     // Catch:{ all -> 0x00d7 }
            int r1 = r1.compareTo((p3186j$.time.Duration) r2)     // Catch:{ all -> 0x00d7 }
            if (r1 > 0) goto L_0x00bf
            com.google.android.apps.gsa.nga.engine.recognition.a r4 = com.google.android.apps.gsa.nga.engine.recognition.C77495a.FULFILLMENT_TIMEOUT     // Catch:{ all -> 0x00d7 }
            goto L_0x00bf
        L_0x004e:
            j$.time.Duration r3 = r1.f213734g     // Catch:{ all -> 0x00d7 }
            j$.time.Duration r5 = r1.f213735h     // Catch:{ all -> 0x00d7 }
            int r3 = r3.compareTo((p3186j$.time.Duration) r5)     // Catch:{ all -> 0x00d7 }
            if (r3 < 0) goto L_0x005b
            com.google.android.apps.gsa.nga.engine.recognition.a r4 = com.google.android.apps.gsa.nga.engine.recognition.C77495a.ALL_AUDIO_PROCESSED     // Catch:{ all -> 0x00d7 }
            goto L_0x00bf
        L_0x005b:
            j$.time.Duration r3 = r1.f213732e     // Catch:{ all -> 0x00d7 }
            if (r3 != 0) goto L_0x007c
            j$.time.Duration r3 = r1.f213733f     // Catch:{ all -> 0x00d7 }
            if (r3 != 0) goto L_0x007c
            j$.time.Duration r3 = r1.f213729b     // Catch:{ all -> 0x00d7 }
            boolean r3 = com.google.common.p4580v.C60944c.m93094g(r3)     // Catch:{ all -> 0x00d7 }
            if (r3 == 0) goto L_0x007c
            j$.time.Duration r3 = r1.f213731d     // Catch:{ all -> 0x00d7 }
            j$.time.Duration r5 = r1.f213729b     // Catch:{ all -> 0x00d7 }
            j$.time.Duration r3 = r3.plus(r5)     // Catch:{ all -> 0x00d7 }
            int r3 = r3.compareTo((p3186j$.time.Duration) r2)     // Catch:{ all -> 0x00d7 }
            if (r3 > 0) goto L_0x007c
            com.google.android.apps.gsa.nga.engine.recognition.a r4 = com.google.android.apps.gsa.nga.engine.recognition.C77495a.STARTUP_FAILURE     // Catch:{ all -> 0x00d7 }
            goto L_0x00bf
        L_0x007c:
            j$.time.Duration r3 = r1.f213732e     // Catch:{ all -> 0x00d7 }
            j$.time.Duration r5 = r1.f213733f     // Catch:{ all -> 0x00d7 }
            if (r3 == 0) goto L_0x00a1
            if (r5 == 0) goto L_0x008a
            int r5 = r5.compareTo((p3186j$.time.Duration) r3)     // Catch:{ all -> 0x00d7 }
            if (r5 >= 0) goto L_0x00a1
        L_0x008a:
            j$.time.Duration r5 = r1.f213730c     // Catch:{ all -> 0x00d7 }
            boolean r5 = com.google.common.p4580v.C60944c.m93094g(r5)     // Catch:{ all -> 0x00d7 }
            if (r5 == 0) goto L_0x00a1
            j$.time.Duration r5 = r1.f213730c     // Catch:{ all -> 0x00d7 }
            j$.time.Duration r3 = r3.plus(r5)     // Catch:{ all -> 0x00d7 }
            int r3 = r3.compareTo((p3186j$.time.Duration) r2)     // Catch:{ all -> 0x00d7 }
            if (r3 > 0) goto L_0x00a1
            com.google.android.apps.gsa.nga.engine.recognition.a r4 = com.google.android.apps.gsa.nga.engine.recognition.C77495a.STOPPED_RESPONDING     // Catch:{ all -> 0x00d7 }
            goto L_0x00bf
        L_0x00a1:
            j$.time.Duration r3 = r1.f213732e     // Catch:{ all -> 0x00d7 }
            j$.time.Duration r5 = r1.f213733f     // Catch:{ all -> 0x00d7 }
            if (r5 == 0) goto L_0x00bf
            if (r3 == 0) goto L_0x00af
            int r3 = r5.compareTo((p3186j$.time.Duration) r3)     // Catch:{ all -> 0x00d7 }
            if (r3 < 0) goto L_0x00bf
        L_0x00af:
            j$.time.Duration r3 = r1.f213731d     // Catch:{ all -> 0x00d7 }
            j$.time.Duration r1 = r1.f213735h     // Catch:{ all -> 0x00d7 }
            j$.time.Duration r1 = r3.plus(r1)     // Catch:{ all -> 0x00d7 }
            int r1 = r1.compareTo((p3186j$.time.Duration) r2)     // Catch:{ all -> 0x00d7 }
            if (r1 > 0) goto L_0x00bf
            com.google.android.apps.gsa.nga.engine.recognition.a r4 = com.google.android.apps.gsa.nga.engine.recognition.C77495a.FALLBACK_TIMEOUT     // Catch:{ all -> 0x00d7 }
        L_0x00bf:
            monitor-exit(r0)     // Catch:{ all -> 0x00d7 }
            if (r4 == 0) goto L_0x00ca
            com.google.android.apps.gsa.nga.engine.recognition.b r0 = r6.f213743f
            r0.mo72711g(r7, r4)
            j$.time.Duration r7 = p3186j$.time.Duration.ZERO
            return r7
        L_0x00ca:
            com.google.android.apps.gsa.shared.util.v.g r7 = r6.f213741c
            com.google.android.apps.gsa.shared.m.f r0 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251398i
            long r0 = r7.mo85399d(r0)
            j$.time.Duration r7 = p3186j$.time.Duration.ofMillis(r0)
            return r7
        L_0x00d7:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d7 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.recognition.p6110c.C77583b.mo72724b(com.google.android.apps.gsa.nga.engine.b.g.ac):j$.time.Duration");
    }

    /* renamed from: c */
    public final Duration mo72725c(ac acVar, Duration duration, boolean z) {
        if (!this.f213741c.mo85405j(C90126fx.f251071br)) {
            return duration;
        }
        synchronized (f213739e) {
            C77582a d = m124520d(acVar.b());
            if (d != null) {
                d.f213731d = Duration.ofNanos(d.f213737j.f213740b.mo26872d());
                d.f213735h = d.f213734g.plus(duration);
                if (z) {
                    d.f213736i = true;
                }
            } else {
                this.f213744g = new C77582a(this, acVar.b(), duration);
            }
        }
        return Duration.ofMillis(this.f213741c.mo85399d(C90126fx.f251398i));
    }
}
