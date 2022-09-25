package com.google.android.apps.gsa.speech.audio;

import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.speech.micro.EchoCancellingInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.apps.gsa.speech.audio.p */
/* compiled from: PG */
public final class C92205p extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private static final C59071e f257072a = C59071e.m91332i("com.google.android.apps.gsa.speech.audio.p");

    /* renamed from: b */
    private boolean f257073b = false;

    /* renamed from: c */
    private boolean f257074c = true;

    /* renamed from: d */
    private boolean f257075d = false;

    /* renamed from: e */
    private long f257076e;

    /* renamed from: f */
    private long f257077f;

    /* renamed from: g */
    private final long f257078g;

    /* renamed from: h */
    private final C58833ax f257079h;

    /* renamed from: i */
    private final EchoCancellingInputStream f257080i;

    public C92205p(EchoCancellingInputStream echoCancellingInputStream, long j, C58833ax axVar) {
        this.f257080i = echoCancellingInputStream;
        this.f257078g = j;
        this.f257079h = axVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x014b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void close() {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.f257075d     // Catch:{ all -> 0x014c }
            if (r0 != 0) goto L_0x014a
            com.google.speech.micro.EchoCancellingInputStream r0 = r10.f257080i     // Catch:{ all -> 0x014c }
            r0.close()     // Catch:{ all -> 0x014c }
            r0 = 1
            r10.f257075d = r0     // Catch:{ all -> 0x014c }
            boolean r1 = r10.f257073b     // Catch:{ all -> 0x014c }
            r2 = 0
            if (r1 == 0) goto L_0x00e6
            com.google.common.f.e r1 = f257072a     // Catch:{ all -> 0x014c }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x014c }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x014c }
            r3 = 12074(0x2f2a, float:1.6919E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r3)     // Catch:{ all -> 0x014c }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x014c }
            java.lang.String r3 = "Latch succeded. Elapsed time %d"
            long r4 = r10.f257077f     // Catch:{ all -> 0x014c }
            long r6 = r10.f257076e     // Catch:{ all -> 0x014c }
            long r4 = r4 - r6
            r1.mo56388r(r3, r4)     // Catch:{ all -> 0x014c }
            com.google.common.o.uf r1 = com.google.common.p4552o.C60555uf.f164065cO     // Catch:{ all -> 0x014c }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x014c }
            com.google.common.o.tz r1 = (com.google.common.p4552o.C60548tz) r1     // Catch:{ all -> 0x014c }
            r1.copyOnWrite()     // Catch:{ all -> 0x014c }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x014c }
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3     // Catch:{ all -> 0x014c }
            int r4 = r3.f164093a     // Catch:{ all -> 0x014c }
            r4 = r4 | 2
            r3.f164093a = r4     // Catch:{ all -> 0x014c }
            r4 = 1317(0x525, float:1.846E-42)
            r3.f164258m = r4     // Catch:{ all -> 0x014c }
            long r3 = r10.f257077f     // Catch:{ all -> 0x014c }
            long r5 = r10.f257076e     // Catch:{ all -> 0x014c }
            r1.copyOnWrite()     // Catch:{ all -> 0x014c }
            com.google.protobuf.bv r7 = r1.instance     // Catch:{ all -> 0x014c }
            com.google.common.o.uf r7 = (com.google.common.p4552o.C60555uf) r7     // Catch:{ all -> 0x014c }
            int r8 = r7.f164249d     // Catch:{ all -> 0x014c }
            r9 = 16777216(0x1000000, float:2.3509887E-38)
            r8 = r8 | r9
            r7.f164249d = r8     // Catch:{ all -> 0x014c }
            long r3 = r3 - r5
            r7.f164143ax = r3     // Catch:{ all -> 0x014c }
            long r3 = r10.f257078g     // Catch:{ all -> 0x014c }
            java.lang.String r3 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r3)     // Catch:{ all -> 0x014c }
            r1.copyOnWrite()     // Catch:{ all -> 0x014c }
            com.google.protobuf.bv r4 = r1.instance     // Catch:{ all -> 0x014c }
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4     // Catch:{ all -> 0x014c }
            r3.getClass()     // Catch:{ all -> 0x014c }
            int r5 = r4.f164093a     // Catch:{ all -> 0x014c }
            r5 = r5 | 4
            r4.f164093a = r5     // Catch:{ all -> 0x014c }
            r4.f164259n = r3     // Catch:{ all -> 0x014c }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ all -> 0x014c }
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1     // Catch:{ all -> 0x014c }
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r1, r2, r2, r2)     // Catch:{ all -> 0x014c }
            com.google.common.base.ax r1 = r10.f257079h     // Catch:{ all -> 0x014c }
            boolean r1 = r1.mo56113h()     // Catch:{ all -> 0x014c }
            if (r1 == 0) goto L_0x014a
            com.google.common.o.ag r1 = com.google.common.p4552o.C59578ag.f158604c     // Catch:{ all -> 0x014c }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x014c }
            com.google.common.o.af r1 = (com.google.common.p4552o.C59577af) r1     // Catch:{ all -> 0x014c }
            long r2 = r10.f257077f     // Catch:{ all -> 0x014c }
            long r4 = r10.f257076e     // Catch:{ all -> 0x014c }
            r1.copyOnWrite()     // Catch:{ all -> 0x014c }
            com.google.protobuf.bv r6 = r1.instance     // Catch:{ all -> 0x014c }
            com.google.common.o.ag r6 = (com.google.common.p4552o.C59578ag) r6     // Catch:{ all -> 0x014c }
            int r7 = r6.f158606a     // Catch:{ all -> 0x014c }
            r0 = r0 | r7
            r6.f158606a = r0     // Catch:{ all -> 0x014c }
            long r2 = r2 - r4
            r6.f158607b = r2     // Catch:{ all -> 0x014c }
            com.google.protobuf.bv r0 = r1.build()     // Catch:{ all -> 0x014c }
            com.google.common.o.ag r0 = (com.google.common.p4552o.C59578ag) r0     // Catch:{ all -> 0x014c }
            com.google.common.base.ax r1 = r10.f257079h     // Catch:{ all -> 0x014c }
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ all -> 0x014c }
            dagger.a r1 = (dagger.C68214a) r1     // Catch:{ all -> 0x014c }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ all -> 0x014c }
            com.google.android.apps.gsa.shared.logger.b.i r1 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r1     // Catch:{ all -> 0x014c }
            com.google.android.apps.gsa.shared.logger.b.f r2 = new com.google.android.apps.gsa.shared.logger.b.f     // Catch:{ all -> 0x014c }
            r2.<init>()     // Catch:{ all -> 0x014c }
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ECHO_TTS_NULLING_SUCCESS     // Catch:{ all -> 0x014c }
            r2.f246201a = r3     // Catch:{ all -> 0x014c }
            com.google.common.o.cb r3 = com.google.common.p4552o.C59687cb.f160034bf     // Catch:{ all -> 0x014c }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x014c }
            com.google.common.o.aj r3 = (com.google.common.p4552o.C59582aj) r3     // Catch:{ all -> 0x014c }
            r3.copyOnWrite()     // Catch:{ all -> 0x014c }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ all -> 0x014c }
            com.google.common.o.cb r4 = (com.google.common.p4552o.C59687cb) r4     // Catch:{ all -> 0x014c }
            r0.getClass()     // Catch:{ all -> 0x014c }
            r4.f160047L = r0     // Catch:{ all -> 0x014c }
            int r0 = r4.f160115b     // Catch:{ all -> 0x014c }
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r4.f160115b = r0     // Catch:{ all -> 0x014c }
            com.google.protobuf.bv r0 = r3.build()     // Catch:{ all -> 0x014c }
            com.google.common.o.cb r0 = (com.google.common.p4552o.C59687cb) r0     // Catch:{ all -> 0x014c }
            r2.f246203c = r0     // Catch:{ all -> 0x014c }
            com.google.android.apps.gsa.shared.logger.b.g r0 = r2.mo83699a()     // Catch:{ all -> 0x014c }
            r1.mo74236a(r0)     // Catch:{ all -> 0x014c }
            monitor-exit(r10)
            return
        L_0x00e6:
            com.google.common.f.e r0 = f257072a     // Catch:{ all -> 0x014c }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x014c }
            java.lang.String r1 = "Latch failed"
            r3 = 12073(0x2f29, float:1.6918E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r1)     // Catch:{ all -> 0x014c }
            com.google.common.o.uf r0 = com.google.common.p4552o.C60555uf.f164065cO     // Catch:{ all -> 0x014c }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x014c }
            com.google.common.o.tz r0 = (com.google.common.p4552o.C60548tz) r0     // Catch:{ all -> 0x014c }
            r0.copyOnWrite()     // Catch:{ all -> 0x014c }
            com.google.protobuf.bv r1 = r0.instance     // Catch:{ all -> 0x014c }
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1     // Catch:{ all -> 0x014c }
            int r3 = r1.f164093a     // Catch:{ all -> 0x014c }
            r3 = r3 | 2
            r1.f164093a = r3     // Catch:{ all -> 0x014c }
            r3 = 1318(0x526, float:1.847E-42)
            r1.f164258m = r3     // Catch:{ all -> 0x014c }
            long r3 = r10.f257078g     // Catch:{ all -> 0x014c }
            java.lang.String r1 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r3)     // Catch:{ all -> 0x014c }
            r0.copyOnWrite()     // Catch:{ all -> 0x014c }
            com.google.protobuf.bv r3 = r0.instance     // Catch:{ all -> 0x014c }
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3     // Catch:{ all -> 0x014c }
            r1.getClass()     // Catch:{ all -> 0x014c }
            int r4 = r3.f164093a     // Catch:{ all -> 0x014c }
            r4 = r4 | 4
            r3.f164093a = r4     // Catch:{ all -> 0x014c }
            r3.f164259n = r1     // Catch:{ all -> 0x014c }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x014c }
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0     // Catch:{ all -> 0x014c }
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r0, r2, r2, r2)     // Catch:{ all -> 0x014c }
            com.google.common.base.ax r0 = r10.f257079h     // Catch:{ all -> 0x014c }
            boolean r0 = r0.mo56113h()     // Catch:{ all -> 0x014c }
            if (r0 == 0) goto L_0x014a
            com.google.common.base.ax r0 = r10.f257079h     // Catch:{ all -> 0x014c }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x014c }
            dagger.a r0 = (dagger.C68214a) r0     // Catch:{ all -> 0x014c }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x014c }
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0     // Catch:{ all -> 0x014c }
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ECHO_TTS_NULLING_FAILURE     // Catch:{ all -> 0x014c }
            r0.mo83702b(r1)     // Catch:{ all -> 0x014c }
            monitor-exit(r10)
            return
        L_0x014a:
            monitor-exit(r10)
            return
        L_0x014c:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.audio.C92205p.close():void");
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public final int read() {
        throw new IOException("Single byte reads not supported.");
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r5, int r6, int r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f257075d     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0008
            monitor-exit(r4)
            r5 = -1
            return r5
        L_0x0008:
            boolean r0 = r4.f257074c     // Catch:{ all -> 0x0048 }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0048 }
            r4.f257076e = r2     // Catch:{ all -> 0x0048 }
            r4.f257074c = r1     // Catch:{ all -> 0x0048 }
        L_0x0015:
            com.google.speech.micro.EchoCancellingInputStream r0 = r4.f257080i     // Catch:{ all -> 0x0048 }
            int r7 = r0.read(r5, r6, r7)     // Catch:{ all -> 0x0048 }
            boolean r0 = r4.f257073b     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x002e
            com.google.speech.micro.EchoCancellingInputStream r0 = r4.f257080i     // Catch:{ all -> 0x0048 }
            boolean r0 = r0.latched     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x002e
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0048 }
            r4.f257077f = r2     // Catch:{ all -> 0x0048 }
            r0 = 1
            r4.f257073b = r0     // Catch:{ all -> 0x0048 }
        L_0x002e:
            if (r7 <= 0) goto L_0x0046
            com.google.speech.micro.EchoCancellingInputStream r0 = r4.f257080i     // Catch:{ all -> 0x0048 }
            boolean r2 = r0.latched     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x0046
            boolean r0 = r0.f183103a     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0046
            int r0 = r6 + r7
            int r2 = r5.length     // Catch:{ all -> 0x0048 }
            int r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x0048 }
            java.util.Arrays.fill(r5, r6, r0, r1)     // Catch:{ all -> 0x0048 }
            monitor-exit(r4)
            return r7
        L_0x0046:
            monitor-exit(r4)
            return r7
        L_0x0048:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.audio.C92205p.read(byte[], int, int):int");
    }
}
