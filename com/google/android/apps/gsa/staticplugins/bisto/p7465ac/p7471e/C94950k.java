package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e;

import com.google.android.libraries.gsa.p1876k.C22870f;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.e.k */
/* compiled from: PG */
public final /* synthetic */ class C94950k implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C94961v f265608a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f265609b;

    public /* synthetic */ C94950k(C94961v vVar, byte[] bArr) {
        this.f265608a = vVar;
        this.f265609b = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0126, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.apps.gsa.staticplugins.bisto.ac.e.v r0 = r7.f265608a
            byte[] r1 = r7.f265609b
            monitor-enter(r0)
            int r2 = r0.f265642o     // Catch:{ all -> 0x0128 }
            if (r2 != 0) goto L_0x000d
            long r2 = r0.f265644q     // Catch:{ all -> 0x0128 }
            r0.f265643p = r2     // Catch:{ all -> 0x0128 }
        L_0x000d:
            int r2 = r0.f265642o     // Catch:{ all -> 0x0128 }
            int r3 = r1.length     // Catch:{ all -> 0x0128 }
            int r2 = r2 + r3
            r0.f265642o = r2     // Catch:{ all -> 0x0128 }
            int r2 = r0.f265645r     // Catch:{ all -> 0x0128 }
            int r3 = r2 + -1
            r4 = 0
            if (r2 == 0) goto L_0x0127
            if (r3 == 0) goto L_0x0120
            r2 = 1
            if (r3 == r2) goto L_0x011a
            r5 = 2
            r6 = 4
            if (r3 == r5) goto L_0x002a
            if (r3 == r6) goto L_0x0026
            goto L_0x002c
        L_0x0026:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0128 }
            goto L_0x0125
        L_0x002a:
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0128 }
        L_0x002c:
            boolean r3 = r0.f265636i     // Catch:{ all -> 0x0128 }
            if (r3 == 0) goto L_0x0034
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0128 }
            monitor-exit(r0)     // Catch:{ all -> 0x0128 }
            return
        L_0x0034:
            java.lang.Integer r3 = r0.f265637j     // Catch:{ all -> 0x0128 }
            if (r3 != 0) goto L_0x005b
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e.C94961v.f265628a     // Catch:{ all -> 0x0128 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0128 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0128 }
            java.lang.String r3 = "VoiceInputListener"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x0128 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0128 }
            r2 = 17691(0x451b, float:2.479E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0128 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = "Unexpected audio data"
            r1.mo56386p(r2)     // Catch:{ all -> 0x0128 }
            com.google.assistant.a.a.ce r1 = com.google.assistant.p3739a.p3740a.C48098ce.UNEXPECTED_AUDIO     // Catch:{ all -> 0x0128 }
            r0.mo88863b(r1)     // Catch:{ all -> 0x0128 }
            monitor-exit(r0)     // Catch:{ all -> 0x0128 }
            return
        L_0x005b:
            java.lang.Integer r3 = r0.f265637j     // Catch:{ all -> 0x0128 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0128 }
            if (r3 != r2) goto L_0x006b
            com.google.android.apps.gsa.staticplugins.bisto.opus.OpusDecoder r2 = r0.f265635h     // Catch:{ all -> 0x0128 }
            byte[] r1 = r2.mo89798c(r1)     // Catch:{ all -> 0x0128 }
            goto L_0x0102
        L_0x006b:
            java.lang.Integer r2 = r0.f265637j     // Catch:{ all -> 0x0128 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0128 }
            if (r2 != r6) goto L_0x0102
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00dd }
            com.google.speech.h.ce r3 = com.google.speech.p5208h.C66607ce.f181191f     // Catch:{ ct -> 0x00dd }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r1, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x00dd }
            com.google.speech.h.ce r1 = (com.google.speech.p5208h.C66607ce) r1     // Catch:{ ct -> 0x00dd }
            int r2 = r1.f181193a     // Catch:{ all -> 0x0128 }
            r2 = r2 & 8
            if (r2 == 0) goto L_0x0087
            monitor-exit(r0)     // Catch:{ all -> 0x0128 }
            return
        L_0x0087:
            com.google.protobuf.bt r2 = com.google.speech.p5208h.C66676j.f181379d     // Catch:{ all -> 0x0128 }
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)     // Catch:{ all -> 0x0128 }
            r1.mo58887l(r2)     // Catch:{ all -> 0x0128 }
            com.google.protobuf.bf r3 = r1.f169962ag     // Catch:{ all -> 0x0128 }
            com.google.protobuf.bs r2 = r2.f169971d     // Catch:{ all -> 0x0128 }
            boolean r2 = r3.mo58857o(r2)     // Catch:{ all -> 0x0128 }
            if (r2 == 0) goto L_0x00bf
            com.google.protobuf.bt r2 = com.google.speech.p5208h.C66676j.f181379d     // Catch:{ all -> 0x0128 }
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)     // Catch:{ all -> 0x0128 }
            r1.mo58887l(r2)     // Catch:{ all -> 0x0128 }
            com.google.protobuf.bf r1 = r1.f169962ag     // Catch:{ all -> 0x0128 }
            com.google.protobuf.bs r3 = r2.f169971d     // Catch:{ all -> 0x0128 }
            java.lang.Object r1 = r1.mo58854l(r3)     // Catch:{ all -> 0x0128 }
            if (r1 != 0) goto L_0x00b0
            java.lang.Object r1 = r2.f169969b     // Catch:{ all -> 0x0128 }
            goto L_0x00b4
        L_0x00b0:
            java.lang.Object r1 = r2.mo58889c(r1)     // Catch:{ all -> 0x0128 }
        L_0x00b4:
            com.google.speech.h.j r1 = (com.google.speech.p5208h.C66676j) r1     // Catch:{ all -> 0x0128 }
            com.google.protobuf.z r1 = r1.f181383b     // Catch:{ all -> 0x0128 }
            byte[] r1 = r1.mo59174N()     // Catch:{ all -> 0x0128 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0128 }
            goto L_0x0102
        L_0x00bf:
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e.C94961v.f265628a     // Catch:{ all -> 0x0128 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0128 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0128 }
            java.lang.String r3 = "VoiceInputListener"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x0128 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0128 }
            r2 = 17688(0x4518, float:2.4786E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0128 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = "no audio data when waiting for audio data"
            r1.mo56386p(r2)     // Catch:{ all -> 0x0128 }
            r1 = r4
            goto L_0x0102
        L_0x00dd:
            r1 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e.C94961v.f265628a     // Catch:{ all -> 0x0128 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x0128 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0128 }
            java.lang.String r4 = "VoiceInputListener"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x0128 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0128 }
            com.google.common.f.x r1 = r2.mo56382g(r1)     // Catch:{ all -> 0x0128 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0128 }
            r2 = 17690(0x451a, float:2.4789E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0128 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = "Error parsing audio S3Request"
            r1.mo56386p(r2)     // Catch:{ all -> 0x0128 }
            monitor-exit(r0)     // Catch:{ all -> 0x0128 }
            return
        L_0x0102:
            if (r1 == 0) goto L_0x0125
            com.google.android.apps.gsa.staticplugins.bisto.ac.e.i r2 = r0.f265631d     // Catch:{ all -> 0x0128 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.e.c r2 = r2.f265604d     // Catch:{ all -> 0x0128 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0128 }
            java.util.concurrent.Executor r3 = r2.f265584d     // Catch:{ all -> 0x0128 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.e.b r4 = new com.google.android.apps.gsa.staticplugins.bisto.ac.e.b     // Catch:{ all -> 0x0128 }
            r4.<init>(r2, r1)     // Catch:{ all -> 0x0128 }
            r3.execute(r4)     // Catch:{ all -> 0x0128 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.k.f r2 = r0.f265633f     // Catch:{ all -> 0x0128 }
            r2.mo88937b(r1)     // Catch:{ all -> 0x0128 }
            goto L_0x0125
        L_0x011a:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0128 }
            r0.mo88865d(r1)     // Catch:{ all -> 0x0128 }
            goto L_0x0125
        L_0x0120:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0128 }
            r0.mo88864c(r1)     // Catch:{ all -> 0x0128 }
        L_0x0125:
            monitor-exit(r0)     // Catch:{ all -> 0x0128 }
            return
        L_0x0127:
            throw r4     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0128 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e.C94950k.run():void");
    }
}
