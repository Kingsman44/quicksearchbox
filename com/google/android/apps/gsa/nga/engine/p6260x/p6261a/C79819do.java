package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.engine.recognition.C77889u;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.do */
/* compiled from: PG */
public final class C79819do {

    /* renamed from: e */
    private static final C58974d f218882e = C58974d.m91136j();

    /* renamed from: a */
    public final C79863k f218883a;

    /* renamed from: b */
    public final Object f218884b = new Object();

    /* renamed from: c */
    public C83320io f218885c;

    /* renamed from: d */
    public boolean f218886d;

    /* renamed from: f */
    private final C76092h f218887f;

    /* renamed from: g */
    private final C21370a f218888g;

    /* renamed from: h */
    private ac f218889h;

    /* renamed from: i */
    private String f218890i;

    /* renamed from: j */
    private long f218891j;

    public C79819do(C79863k kVar, C21370a aVar, C76092h hVar) {
        this.f218883a = kVar;
        this.f218888g = aVar;
        this.f218887f = hVar;
    }

    /* renamed from: a */
    public static C89849ae m127962a(C77889u uVar) {
        C77889u uVar2 = C77889u.ASR;
        switch (uVar.ordinal()) {
            case 0:
                return C89849ae.NGA_ASR_RECOGNITION_START;
            case 1:
                return C89849ae.NGA_SODA_RECOGNITION_START;
            case 2:
                return C89849ae.NGA_SYSTEM_RECOGNITION_START;
            case 3:
            case 6:
            case 8:
                return C89849ae.NGA_TEXT_QUERY_RECOGNITION_START;
            case 4:
                return C89849ae.NGA_PROACTIVE_RECOGNITION_START;
            case 5:
                return C89849ae.NGA_SUGGESTION_CHIP_RECOGNITION_START;
            case 7:
                return C89849ae.NGA_S3_RECOGNITION_START;
            case 9:
                return C89849ae.NGA_WATCH_SUGGESTION_CHIP_RECOGNITION_START;
            case 10:
                return C89849ae.CONVERSATION_API_INTERACTION_START;
            case 11:
                return C89849ae.NGA_TITAN_VOICE_PLATE_START;
            default:
                return C89849ae.NGA_UNKNOWN_RECOGNITION_START;
        }
    }

    /* renamed from: b */
    public final void mo74263b(C83320io ioVar) {
        this.f218883a.mo74237c(C89849ae.NGA_EXECUTION_DONE, ioVar);
    }

    /* renamed from: c */
    public final void mo74264c(C89849ae aeVar, C83320io ioVar) {
        C83320io ioVar2;
        boolean z;
        synchronized (this.f218884b) {
            ioVar2 = this.f218885c;
            this.f218885c = null;
            z = this.f218886d;
            this.f218886d = false;
        }
        if (ioVar2 != null && ioVar2.f227136c.equals(ioVar.f227136c)) {
            ioVar = ioVar2;
        }
        if (z) {
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            cbVar.f160123d |= 4;
            cbVar.f160072aJ = true;
            this.f218883a.mo74241g(aeVar, ioVar, ajVar);
            return;
        }
        this.f218883a.mo74240f(aeVar, ioVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r2.equals(r1) == false) goto L_0x003e;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74265d(com.google.android.apps.gsa.nga.engine.recognition.C77557aj r12) {
        /*
            r11 = this;
            com.google.android.libraries.f.a r0 = r11.f218888g
            long r7 = r0.mo26872d()
            java.lang.Object r0 = r11.f218884b
            monitor-enter(r0)
            java.lang.String r1 = r12.mo72660x()     // Catch:{ all -> 0x00df }
            com.google.android.apps.gsa.nga.engine.g.h r2 = r11.f218887f     // Catch:{ all -> 0x00df }
            com.google.android.apps.gsa.nga.engine.g.f r2 = r2.mo72021b()     // Catch:{ all -> 0x00df }
            java.util.Locale r2 = r2.mo72039e()     // Catch:{ all -> 0x00df }
            java.lang.String r1 = com.google.android.apps.gsa.nga.shared.p6320al.C80884a.m128737b(r1, r2)     // Catch:{ all -> 0x00df }
            com.google.android.apps.gsa.nga.engine.b.c.j r2 = r12.mo72638a()     // Catch:{ all -> 0x00df }
            com.google.android.apps.gsa.nga.engine.b.g.ac r2 = r2.b()     // Catch:{ all -> 0x00df }
            com.google.android.apps.gsa.nga.engine.b.g.ac r3 = r11.f218889h     // Catch:{ all -> 0x00df }
            r4 = 1
            if (r3 != 0) goto L_0x0029
            goto L_0x0031
        L_0x0029:
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x00df }
            if (r2 != 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r4 = 0
        L_0x0031:
            if (r4 != 0) goto L_0x003e
            java.lang.String r2 = r11.f218890i     // Catch:{ all -> 0x00df }
            if (r2 != 0) goto L_0x0038
            goto L_0x004c
        L_0x0038:
            boolean r2 = r2.equals(r1)     // Catch:{ all -> 0x00df }
            if (r2 != 0) goto L_0x004c
        L_0x003e:
            com.google.android.apps.gsa.nga.engine.b.c.j r2 = r12.mo72638a()     // Catch:{ all -> 0x00df }
            com.google.android.apps.gsa.nga.engine.b.g.ac r2 = r2.b()     // Catch:{ all -> 0x00df }
            r11.f218889h = r2     // Catch:{ all -> 0x00df }
            r11.f218891j = r7     // Catch:{ all -> 0x00df }
            r11.f218890i = r1     // Catch:{ all -> 0x00df }
        L_0x004c:
            long r9 = r11.f218891j     // Catch:{ all -> 0x00df }
            monitor-exit(r0)     // Catch:{ all -> 0x00df }
            if (r4 == 0) goto L_0x007f
            com.google.android.apps.gsa.nga.engine.x.k r1 = r11.f218883a
            com.google.android.apps.gsa.nga.engine.recognition.u r0 = r12.mo72639b()
            com.google.android.apps.gsa.shared.logger.b.ae r2 = m127962a(r0)
            com.google.android.apps.gsa.nga.engine.b.c.j r0 = r12.mo72638a()
            com.google.android.apps.gsa.nga.shared.v.io r3 = r0.c()
            com.google.common.o.cb r0 = com.google.common.p4552o.C59687cb.f160034bf
            com.google.protobuf.bn r0 = r0.createBuilder()
            r4 = r0
            com.google.common.o.aj r4 = (com.google.common.p4552o.C59582aj) r4
            j$.util.Optional r0 = r12.mo72647j()
            p3186j$.util.Objects.requireNonNull(r4)
            com.google.android.apps.gsa.nga.engine.x.a.dn r5 = new com.google.android.apps.gsa.nga.engine.x.a.dn
            r5.<init>(r4)
            r0.ifPresent(r5)
            r5 = r7
            r1.mo74246l(r2, r3, r4, r5)
        L_0x007f:
            com.google.android.apps.gsa.nga.engine.x.k r0 = r11.f218883a
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_RECOGNITION_CANDIDATE_START
            com.google.android.apps.gsa.nga.engine.b.c.j r2 = r12.mo72638a()
            com.google.android.apps.gsa.nga.shared.v.io r2 = r2.c()
            r0.mo74238d(r1, r2, r7)
            boolean r0 = r12.mo72662z()
            if (r0 != 0) goto L_0x0095
            return
        L_0x0095:
            long r0 = r7 - r9
            j$.time.Duration r0 = p3186j$.time.Duration.ofNanos(r0)
            boolean r1 = r0.isZero()
            if (r1 != 0) goto L_0x00c0
            com.google.common.f.a.d r1 = f218882e
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "Speech endpoint delay of %.1f seconds"
            long r3 = r0.toMillis()
            double r3 = (double) r3
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            java.lang.Double.isNaN(r3)
            double r3 = r3 / r5
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r3 = 4019(0xfb3, float:5.632E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56389s(r2, r0)
        L_0x00c0:
            com.google.android.apps.gsa.nga.engine.x.k r0 = r11.f218883a
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_RECOGNITION_FINAL_TEXT
            com.google.android.apps.gsa.nga.engine.b.c.j r2 = r12.mo72638a()
            com.google.android.apps.gsa.nga.shared.v.io r2 = r2.c()
            r0.mo74244j(r1, r2, r9)
            com.google.android.apps.gsa.nga.engine.x.k r0 = r11.f218883a
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_RECOGNITION_END
            com.google.android.apps.gsa.nga.engine.b.c.j r12 = r12.mo72638a()
            com.google.android.apps.gsa.nga.shared.v.io r12 = r12.c()
            r0.mo74244j(r1, r12, r7)
            return
        L_0x00df:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00df }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6260x.p6261a.C79819do.mo74265d(com.google.android.apps.gsa.nga.engine.recognition.aj):void");
    }
}
