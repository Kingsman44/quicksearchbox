package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C77747aa implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77752af f214174a;

    /* renamed from: b */
    public final /* synthetic */ C67087ko f214175b;

    /* renamed from: c */
    public final /* synthetic */ C79856d f214176c;

    public /* synthetic */ C77747aa(C77752af afVar, C67087ko koVar, C79856d dVar) {
        this.f214174a = afVar;
        this.f214175b = koVar;
        this.f214176c = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r8 != 2) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            com.google.android.apps.gsa.nga.engine.recognition.l.a.af r0 = r11.f214174a
            com.google.speech.j.ko r1 = r11.f214175b
            com.google.android.apps.gsa.nga.engine.x.d r2 = r11.f214176c
            com.google.speech.j.ih r1 = r1.f182373f
            if (r1 != 0) goto L_0x000c
            com.google.speech.j.ih r1 = com.google.speech.p5218j.C67026ih.f182188e
        L_0x000c:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r4 = "time unit"
            com.google.common.p4526f.p4534f.C59081b.m91349a(r3, r4)
            float r3 = r1.f182191b
            float r3 = r1.f182192c
            int r4 = r1.f182190a
            com.google.android.apps.gsa.nga.engine.recognition.l.a.o r5 = r0.f214190h
            r6 = 2
            r4 = r4 & r6
            r7 = 1
            if (r4 == 0) goto L_0x0056
            int r4 = r5.f214348f
            int r8 = r4 + -1
            if (r4 == 0) goto L_0x0054
            if (r8 == 0) goto L_0x0047
            if (r8 == r7) goto L_0x002d
            if (r8 == r6) goto L_0x0047
            goto L_0x0056
        L_0x002d:
            double r3 = (double) r3
            r8 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0056
            r3 = 3
            r5.f214348f = r3
            com.google.android.libraries.f.a r3 = r5.f214343a
            long r3 = r3.mo26872d()
            j$.time.Duration r3 = p3186j$.time.Duration.ofNanos(r3)
            r5.f214347e = r3
            goto L_0x0056
        L_0x0047:
            double r3 = (double) r3
            r8 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0056
            r5.f214348f = r6
            goto L_0x0056
        L_0x0054:
            r0 = 0
            throw r0
        L_0x0056:
            int r3 = r1.f182190a
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0074
            r3 = r3 & r6
            if (r3 == 0) goto L_0x0074
            com.google.android.apps.gsa.nga.engine.b.g.ac r3 = r2.f218924a
            float r4 = r1.f182191b
            float r5 = r1.f182192c
            com.google.android.libraries.f.a r8 = r0.f214188f
            long r8 = r8.mo26870b()
            com.google.android.apps.gsa.nga.engine.recognition.f r3 = com.google.android.apps.gsa.nga.engine.recognition.C77623f.m124587e(r3, r4, r5, r8)
            com.google.android.apps.gsa.nga.engine.recognition.ab r4 = r0.f214184b
            r4.mo72714gG(r3)
        L_0x0074:
            int r3 = r1.f182190a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x00e2
            com.google.android.apps.gsa.nga.engine.recognition.g r3 = r0.f214196n
            com.google.android.apps.gsa.nga.shared.ab.b.d r4 = com.google.android.apps.gsa.nga.shared.p6296ab.p6299b.C80542d.f221083f
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.gsa.nga.shared.ab.b.a r4 = (com.google.android.apps.gsa.nga.shared.p6296ab.p6299b.C80539a) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.gsa.nga.shared.ab.b.d r5 = (com.google.android.apps.gsa.nga.shared.p6296ab.p6299b.C80542d) r5
            r5.f221089e = r7
            int r8 = r5.f221085a
            r8 = r8 | 8
            r5.f221085a = r8
            com.google.android.apps.gsa.nga.engine.b.g.ac r2 = r2.f218924a
            com.google.android.apps.gsa.nga.shared.v.io r2 = r2.b()
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.gsa.nga.shared.ab.b.d r5 = (com.google.android.apps.gsa.nga.shared.p6296ab.p6299b.C80542d) r5
            r2.getClass()
            r5.f221086b = r2
            int r2 = r5.f221085a
            r2 = r2 | r7
            r5.f221085a = r2
            com.google.android.libraries.f.a r0 = r0.f214188f
            long r7 = r0.mo26872d()
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.android.apps.gsa.nga.shared.ab.b.d r0 = (com.google.android.apps.gsa.nga.shared.p6296ab.p6299b.C80542d) r0
            int r2 = r0.f221085a
            r2 = r2 | r6
            r0.f221085a = r2
            r0.f221087c = r7
            long r0 = r1.f182193d
            j$.time.temporal.ChronoUnit r2 = p3186j$.time.temporal.ChronoUnit.MICROS
            j$.time.Duration r0 = p3186j$.time.Duration.m71141of(r0, r2)
            long r0 = r0.toMillis()
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.android.apps.gsa.nga.shared.ab.b.d r2 = (com.google.android.apps.gsa.nga.shared.p6296ab.p6299b.C80542d) r2
            int r5 = r2.f221085a
            r5 = r5 | 4
            r2.f221085a = r5
            r2.f221088d = r0
            com.google.protobuf.bv r0 = r4.build()
            com.google.android.apps.gsa.nga.shared.ab.b.d r0 = (com.google.android.apps.gsa.nga.shared.p6296ab.p6299b.C80542d) r0
            r3.mo72723a(r0)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a.C77747aa.run():void");
    }
}
