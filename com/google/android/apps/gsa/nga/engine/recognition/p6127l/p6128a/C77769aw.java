package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.aw */
/* compiled from: PG */
public final /* synthetic */ class C77769aw implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77772az f214229a;

    public /* synthetic */ C77769aw(C77772az azVar) {
        this.f214229a = azVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:31|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0146 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17879a(java.lang.Object r15) {
        /*
            r14 = this;
            com.google.android.apps.gsa.nga.engine.recognition.l.a.az r0 = r14.f214229a
            com.google.speech.j.hh r15 = (com.google.speech.p5218j.C66999hh) r15
            com.google.android.apps.gsa.nga.engine.recognition.l.a.v r1 = r0.f214237f
            java.util.concurrent.locks.ReadWriteLock r2 = r1.f214367k
            java.util.concurrent.locks.Lock r2 = r2.writeLock()
            r2.lock()
            java.util.concurrent.atomic.AtomicReference r3 = r1.f214366j     // Catch:{ all -> 0x02af }
            r4 = 0
            r3.set(r4)     // Catch:{ all -> 0x02af }
            com.google.speech.j.hf r3 = r15.f182132d     // Catch:{ all -> 0x02af }
            if (r3 != 0) goto L_0x001b
            com.google.speech.j.hf r3 = com.google.speech.p5218j.C66997hf.f182099z     // Catch:{ all -> 0x02af }
        L_0x001b:
            java.lang.String r3 = r3.f182115n     // Catch:{ all -> 0x02af }
            com.google.android.apps.gsa.shared.util.v.g r4 = r1.f214358b     // Catch:{ all -> 0x02af }
            com.google.android.apps.gsa.shared.m.f r5 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251748of     // Catch:{ all -> 0x02af }
            long r4 = r4.mo85399d(r5)     // Catch:{ all -> 0x02af }
            boolean r3 = com.google.android.libraries.assistant.soda.C19245ah.m36706n(r3, r4)     // Catch:{ all -> 0x02af }
            r4 = 1
            java.lang.String r5 = "Failed to initialize Soda: "
            if (r3 == 0) goto L_0x025c
            com.google.common.f.a.d r3 = com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a.C77817v.f214357a     // Catch:{ all -> 0x02af }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x02af }
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3     // Catch:{ all -> 0x02af }
            r6 = 4424(0x1148, float:6.2E-42)
            com.google.common.f.x r3 = r3.mo56372aa(r6)     // Catch:{ all -> 0x02af }
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3     // Catch:{ all -> 0x02af }
            java.lang.String r6 = "Initializing Soda with config %s."
            r3.mo56389s(r6, r15)     // Catch:{ all -> 0x02af }
            com.google.android.apps.gsa.nga.engine.recognition.l.a.aq r3 = r1.f214365i     // Catch:{ all -> 0x02af }
            dagger.a r6 = r1.f214359c     // Catch:{ all -> 0x02af }
            java.lang.Object r6 = r6.mo27525b()     // Catch:{ all -> 0x02af }
            com.google.android.libraries.assistant.soda.o r6 = (com.google.android.libraries.assistant.soda.C19347o) r6     // Catch:{ all -> 0x02af }
            com.google.android.libraries.assistant.soda.Soda r7 = new com.google.android.libraries.assistant.soda.Soda     // Catch:{ all -> 0x02af }
            android.content.Context r3 = r3.f214223a     // Catch:{ all -> 0x02af }
            r7.<init>((android.content.Context) r3, (com.google.android.libraries.assistant.soda.C19347o) r6)     // Catch:{ all -> 0x02af }
            r1.f214369m = r7     // Catch:{ all -> 0x02af }
            com.google.android.libraries.assistant.soda.c r3 = new com.google.android.libraries.assistant.soda.c     // Catch:{ all -> 0x02af }
            r3.<init>()     // Catch:{ all -> 0x02af }
            r3.mo24390b(r15)     // Catch:{ all -> 0x02af }
            com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory r6 = r1.f214363g     // Catch:{ all -> 0x02af }
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)     // Catch:{ all -> 0x02af }
            r3.f53966a = r6     // Catch:{ all -> 0x02af }
            j$.util.Optional r6 = r1.f214364h     // Catch:{ all -> 0x02af }
            p3186j$.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x02af }
            com.google.android.apps.gsa.nga.engine.recognition.l.a.s r8 = new com.google.android.apps.gsa.nga.engine.recognition.l.a.s     // Catch:{ all -> 0x02af }
            r8.<init>(r3)     // Catch:{ all -> 0x02af }
            r6.ifPresent(r8)     // Catch:{ all -> 0x02af }
            com.google.android.libraries.assistant.soda.ac r3 = r3.mo24391c()     // Catch:{ all -> 0x02af }
            com.google.speech.j.mx r3 = r7.mo24331g(r3)     // Catch:{ all -> 0x02af }
            com.google.android.apps.gsa.nga.engine.recognition.l.a.bi r6 = r1.f214361e     // Catch:{ all -> 0x02af }
            r6.mo72823f(r15, r3)     // Catch:{ all -> 0x02af }
            int r6 = r3.f182527b     // Catch:{ all -> 0x02af }
            com.google.speech.j.mz r6 = com.google.speech.p5218j.C67152mz.m97427a(r6)     // Catch:{ all -> 0x02af }
            if (r6 != 0) goto L_0x008a
            com.google.speech.j.mz r6 = com.google.speech.p5218j.C67152mz.NO_ERROR     // Catch:{ all -> 0x02af }
        L_0x008a:
            com.google.speech.j.mz r7 = com.google.speech.p5218j.C67152mz.NO_ERROR     // Catch:{ all -> 0x02af }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x02af }
            if (r6 == 0) goto L_0x0158
            com.google.common.f.a.d r3 = com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a.C77817v.f214357a     // Catch:{ all -> 0x02af }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x02af }
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3     // Catch:{ all -> 0x02af }
            r5 = 4425(0x1149, float:6.201E-42)
            com.google.common.f.x r3 = r3.mo56372aa(r5)     // Catch:{ all -> 0x02af }
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3     // Catch:{ all -> 0x02af }
            java.lang.String r5 = "Soda initialized."
            r3.mo56386p(r5)     // Catch:{ all -> 0x02af }
            java.util.concurrent.atomic.AtomicReference r1 = r1.f214366j     // Catch:{ all -> 0x02af }
            r1.set(r15)     // Catch:{ all -> 0x02af }
            r2.unlock()
            com.google.android.apps.gsa.shared.util.v.g r15 = r0.f214240i
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251412iN
            boolean r15 = r15.mo85405j(r1)
            if (r15 != 0) goto L_0x00bb
            goto L_0x0155
        L_0x00bb:
            com.google.android.apps.gsa.nga.engine.x.ai r15 = r0.f214235d     // Catch:{ u -> 0x0147 }
            r1 = 14002(0x36b2, float:1.9621E-41)
            com.google.android.apps.gsa.nga.engine.x.ah r15 = r15.mo74251b(r1)     // Catch:{ u -> 0x0147 }
            com.google.android.apps.gsa.nga.engine.recognition.l.a.v r1 = r0.f214237f     // Catch:{ all -> 0x0128 }
            com.google.android.apps.gsa.nga.engine.d.a.fa r0 = r0.f214234c     // Catch:{ all -> 0x0128 }
            com.google.android.libraries.f.a r2 = r0.d     // Catch:{ all -> 0x0128 }
            long r2 = r2.mo26872d()     // Catch:{ all -> 0x0128 }
            com.google.speech.j.a.az r5 = r0.a()     // Catch:{ all -> 0x0128 }
            com.google.android.apps.gsa.nga.engine.d.a.ez r6 = r0.h     // Catch:{ all -> 0x0128 }
            r6.a(r5, r2)     // Catch:{ all -> 0x0128 }
            com.google.protobuf.bn r5 = r5.toBuilder()     // Catch:{ all -> 0x0128 }
            com.google.speech.j.a.ay r5 = (com.google.speech.p5218j.p5219a.C66721ay) r5     // Catch:{ all -> 0x0128 }
            com.google.android.apps.gsa.nga.engine.d.a.fg r6 = r0.c     // Catch:{ all -> 0x0128 }
            com.google.speech.j.a.az r6 = r6.c()     // Catch:{ all -> 0x0128 }
            r5.mergeFrom(r6)     // Catch:{ all -> 0x0128 }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ all -> 0x0128 }
            com.google.speech.j.a.az r5 = (com.google.speech.p5218j.p5219a.C66722az) r5     // Catch:{ all -> 0x0128 }
            com.google.android.apps.gsa.nga.shared.v.d.ec r6 = com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec.SPEECH_RECOGNITION_CONTEXT_AT_BIND     // Catch:{ all -> 0x0128 }
            r0.b(r5, r6)     // Catch:{ all -> 0x0128 }
            r0.i = r5     // Catch:{ all -> 0x0128 }
            com.google.android.apps.gsa.nga.shared.v.i r6 = r0.g     // Catch:{ all -> 0x0128 }
            com.google.android.apps.gsa.nga.shared.v.c.nk r7 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82661nl.m131982f()     // Catch:{ all -> 0x0128 }
            com.google.android.libraries.f.a r0 = r0.d     // Catch:{ all -> 0x0128 }
            long r8 = r0.mo26872d()     // Catch:{ all -> 0x0128 }
            long r8 = r8 - r2
            j$.time.Duration r0 = p3186j$.time.Duration.ofNanos(r8)     // Catch:{ all -> 0x0128 }
            long r2 = r0.toMillis()     // Catch:{ all -> 0x0128 }
            double r2 = (double) r2     // Catch:{ all -> 0x0128 }
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x0128 }
            r2 = r7
            com.google.android.apps.gsa.nga.shared.v.c.ex r2 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82430ex) r2     // Catch:{ all -> 0x0128 }
            r2.f225226b = r0     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "BIND_TOTAL"
            r2 = r7
            com.google.android.apps.gsa.nga.shared.v.c.ex r2 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82430ex) r2     // Catch:{ all -> 0x0128 }
            r2.f225227c = r0     // Catch:{ all -> 0x0128 }
            com.google.android.apps.gsa.nga.shared.v.c.nl r0 = r7.mo76190a()     // Catch:{ all -> 0x0128 }
            r6.mo75579d(r0)     // Catch:{ all -> 0x0128 }
            r1.mo72834b(r5)     // Catch:{ all -> 0x0128 }
            if (r15 == 0) goto L_0x0155
            r15.mo74255b()     // Catch:{ u -> 0x0147 }
            goto L_0x0155
        L_0x0128:
            r0 = move-exception
            if (r15 == 0) goto L_0x0146
            r15.mo74255b()     // Catch:{ all -> 0x012f }
            goto L_0x0146
        L_0x012f:
            r15 = move-exception
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0146 }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            r3 = 0
            r1[r3] = r2     // Catch:{ Exception -> 0x0146 }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r5, r1)     // Catch:{ Exception -> 0x0146 }
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0146 }
            r2[r3] = r15     // Catch:{ Exception -> 0x0146 }
            r1.invoke(r0, r2)     // Catch:{ Exception -> 0x0146 }
        L_0x0146:
            throw r0     // Catch:{ u -> 0x0147 }
        L_0x0147:
            r15 = move-exception
            com.google.common.f.a.d r0 = com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a.C77772az.f214232a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Failed to updateRecognitionContext because soda is not initialized."
            r2 = 4459(0x116b, float:6.248E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56382g(r15)).mo56372aa(r2)).mo56386p(r1)
        L_0x0155:
            com.google.common.util.concurrent.cx r15 = com.google.common.util.concurrent.C60866ct.f164955a
            return r15
        L_0x0158:
            com.google.speech.j.hf r15 = r15.f182132d     // Catch:{ all -> 0x02af }
            if (r15 != 0) goto L_0x015e
            com.google.speech.j.hf r15 = com.google.speech.p5218j.C66997hf.f182099z     // Catch:{ all -> 0x02af }
        L_0x015e:
            java.lang.String r10 = r15.f182115n     // Catch:{ all -> 0x02af }
            int r12 = com.google.android.libraries.assistant.soda.C19245ah.m36693a(r10)     // Catch:{ all -> 0x02af }
            com.google.android.apps.gsa.nga.engine.recognition.l.a.bi r9 = r1.f214361e     // Catch:{ all -> 0x02af }
            com.google.android.apps.gsa.nga.engine.recognition.l.c r15 = r1.f214362f     // Catch:{ all -> 0x02af }
            java.util.Locale r15 = r15.mo72835a()     // Catch:{ all -> 0x02af }
            java.lang.String r13 = r15.toString()     // Catch:{ all -> 0x02af }
            com.google.android.apps.gsa.nga.engine.x.k r15 = r9.f214263c     // Catch:{ all -> 0x02af }
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NGA_SODA_INITIALIZATION_FAILURE     // Catch:{ all -> 0x02af }
            r15.mo74271b(r0)     // Catch:{ all -> 0x02af }
            int r15 = r3.f182527b     // Catch:{ all -> 0x02af }
            com.google.speech.j.mz r15 = com.google.speech.p5218j.C67152mz.m97427a(r15)     // Catch:{ all -> 0x02af }
            if (r15 != 0) goto L_0x0181
            com.google.speech.j.mz r15 = com.google.speech.p5218j.C67152mz.NO_ERROR     // Catch:{ all -> 0x02af }
        L_0x0181:
            java.util.concurrent.atomic.AtomicReference r0 = r9.f214272l     // Catch:{ all -> 0x02af }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x02af }
            boolean r15 = r15.equals(r0)     // Catch:{ all -> 0x02af }
            if (r15 != 0) goto L_0x0234
            java.util.concurrent.atomic.AtomicReference r15 = r9.f214272l     // Catch:{ all -> 0x02af }
            int r0 = r3.f182527b     // Catch:{ all -> 0x02af }
            com.google.speech.j.mz r0 = com.google.speech.p5218j.C67152mz.m97427a(r0)     // Catch:{ all -> 0x02af }
            if (r0 != 0) goto L_0x0199
            com.google.speech.j.mz r0 = com.google.speech.p5218j.C67152mz.NO_ERROR     // Catch:{ all -> 0x02af }
        L_0x0199:
            r15.set(r0)     // Catch:{ all -> 0x02af }
            com.google.android.apps.gsa.nga.shared.v.i r15 = r9.f214264d     // Catch:{ all -> 0x02af }
            java.lang.String r0 = "NGA_SODA_INITIALIZATION_FAILURE_WITH_LOCALE2"
            if (r13 == 0) goto L_0x022c
            int r1 = r3.f182527b     // Catch:{ all -> 0x02af }
            com.google.speech.j.mz r1 = com.google.speech.p5218j.C67152mz.m97427a(r1)     // Catch:{ all -> 0x02af }
            if (r1 != 0) goto L_0x01ac
            com.google.speech.j.mz r1 = com.google.speech.p5218j.C67152mz.NO_ERROR     // Catch:{ all -> 0x02af }
        L_0x01ac:
            java.lang.String r1 = r1.name()     // Catch:{ all -> 0x02af }
            if (r1 == 0) goto L_0x0224
            com.google.android.apps.gsa.nga.shared.v.c.ev r4 = new com.google.android.apps.gsa.nga.shared.v.c.ev     // Catch:{ all -> 0x02af }
            r4.<init>(r0, r13, r12, r1)     // Catch:{ all -> 0x02af }
            r15.mo75579d(r4)     // Catch:{ all -> 0x02af }
            com.google.frameworks.client.a.a.b r15 = new com.google.frameworks.client.a.a.b     // Catch:{ all -> 0x02af }
            com.google.frameworks.client.a.a.a r0 = com.google.frameworks.client.p4624a.p4625a.C61284a.NO_USER_DATA     // Catch:{ all -> 0x02af }
            int r1 = r3.f182527b     // Catch:{ all -> 0x02af }
            com.google.speech.j.mz r1 = com.google.speech.p5218j.C67152mz.m97427a(r1)     // Catch:{ all -> 0x02af }
            if (r1 != 0) goto L_0x01c8
            com.google.speech.j.mz r1 = com.google.speech.p5218j.C67152mz.NO_ERROR     // Catch:{ all -> 0x02af }
        L_0x01c8:
            java.lang.String r1 = r1.name()     // Catch:{ all -> 0x02af }
            r15.<init>(r0, r1)     // Catch:{ all -> 0x02af }
            com.google.frameworks.client.a.a.b r0 = new com.google.frameworks.client.a.a.b     // Catch:{ all -> 0x02af }
            com.google.frameworks.client.a.a.a r1 = com.google.frameworks.client.p4624a.p4625a.C61284a.NO_USER_DATA     // Catch:{ all -> 0x02af }
            java.lang.String r4 = r3.f182528c     // Catch:{ all -> 0x02af }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x02af }
            com.google.common.f.a.d r1 = com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a.C77782bi.f214261a     // Catch:{ all -> 0x02af }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x02af }
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1     // Catch:{ all -> 0x02af }
            r4 = 4465(0x1171, float:6.257E-42)
            com.google.common.f.x r1 = r1.mo56372aa(r4)     // Catch:{ all -> 0x02af }
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1     // Catch:{ all -> 0x02af }
            java.lang.String r4 = "Soda initialization failed with status: %s, message: %s"
            r1.mo56354G(r4, r15, r0)     // Catch:{ all -> 0x02af }
            com.google.android.apps.gsa.shared.util.v.g r15 = r9.f214268h     // Catch:{ all -> 0x02af }
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251006af     // Catch:{ all -> 0x02af }
            boolean r15 = r15.mo85405j(r0)     // Catch:{ all -> 0x02af }
            if (r15 == 0) goto L_0x0215
            java.util.Random r15 = r9.f214269i     // Catch:{ all -> 0x02af }
            double r0 = r15.nextDouble()     // Catch:{ all -> 0x02af }
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r6
            com.google.android.apps.gsa.shared.util.v.g r15 = r9.f214268h     // Catch:{ all -> 0x02af }
            com.google.android.apps.gsa.shared.m.f r4 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251747oe     // Catch:{ all -> 0x02af }
            long r6 = r15.mo85399d(r4)     // Catch:{ all -> 0x02af }
            double r6 = (double) r6     // Catch:{ all -> 0x02af }
            int r15 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r15 < 0) goto L_0x020f
            goto L_0x0215
        L_0x020f:
            com.google.android.apps.gsa.shared.util.b.m r15 = new com.google.android.apps.gsa.shared.util.b.m     // Catch:{ all -> 0x02af }
            r15.<init>()     // Catch:{ all -> 0x02af }
            throw r15     // Catch:{ all -> 0x02af }
        L_0x0215:
            com.google.android.libraries.gsa.k.g r15 = r9.f214265e     // Catch:{ all -> 0x02af }
            com.google.android.apps.gsa.nga.engine.recognition.l.a.be r0 = new com.google.android.apps.gsa.nga.engine.recognition.l.a.be     // Catch:{ all -> 0x02af }
            r8 = r0
            r11 = r3
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x02af }
            java.lang.String r1 = "[NGA] SodaRecognitionHandler.logModelsSize"
            r15.mo28212l(r1, r0)     // Catch:{ all -> 0x02af }
            goto L_0x0234
        L_0x0224:
            java.lang.NullPointerException r15 = new java.lang.NullPointerException     // Catch:{ all -> 0x02af }
            java.lang.String r0 = "Null failureReason"
            r15.<init>(r0)     // Catch:{ all -> 0x02af }
            throw r15     // Catch:{ all -> 0x02af }
        L_0x022c:
            java.lang.NullPointerException r15 = new java.lang.NullPointerException     // Catch:{ all -> 0x02af }
            java.lang.String r0 = "Null assistantLocale"
            r15.<init>(r0)     // Catch:{ all -> 0x02af }
            throw r15     // Catch:{ all -> 0x02af }
        L_0x0234:
            com.google.android.apps.gsa.nga.engine.recognition.l.a.t r15 = new com.google.android.apps.gsa.nga.engine.recognition.l.a.t     // Catch:{ all -> 0x02af }
            int r0 = r3.f182527b     // Catch:{ all -> 0x02af }
            com.google.speech.j.mz r0 = com.google.speech.p5218j.C67152mz.m97427a(r0)     // Catch:{ all -> 0x02af }
            if (r0 != 0) goto L_0x0240
            com.google.speech.j.mz r0 = com.google.speech.p5218j.C67152mz.NO_ERROR     // Catch:{ all -> 0x02af }
        L_0x0240:
            int r0 = r0.f182542l     // Catch:{ all -> 0x02af }
            java.lang.String r1 = r3.f182528c     // Catch:{ all -> 0x02af }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02af }
            r3.<init>(r5)     // Catch:{ all -> 0x02af }
            r3.append(r0)     // Catch:{ all -> 0x02af }
            java.lang.String r0 = " message: "
            r3.append(r0)     // Catch:{ all -> 0x02af }
            r3.append(r1)     // Catch:{ all -> 0x02af }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x02af }
            r15.<init>(r0)     // Catch:{ all -> 0x02af }
            throw r15     // Catch:{ all -> 0x02af }
        L_0x025c:
            com.google.android.apps.gsa.nga.engine.recognition.l.a.bi r0 = r1.f214361e     // Catch:{ all -> 0x02af }
            com.google.speech.j.mx r3 = com.google.speech.p5218j.C67150mx.f182524d     // Catch:{ all -> 0x02af }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x02af }
            com.google.speech.j.mw r3 = (com.google.speech.p5218j.C67149mw) r3     // Catch:{ all -> 0x02af }
            com.google.speech.j.mz r6 = com.google.speech.p5218j.C67152mz.UNSUPPORTED_LANGUAGE_PACK     // Catch:{ all -> 0x02af }
            r3.copyOnWrite()     // Catch:{ all -> 0x02af }
            com.google.protobuf.bv r7 = r3.instance     // Catch:{ all -> 0x02af }
            com.google.speech.j.mx r7 = (com.google.speech.p5218j.C67150mx) r7     // Catch:{ all -> 0x02af }
            int r6 = r6.f182542l     // Catch:{ all -> 0x02af }
            r7.f182527b = r6     // Catch:{ all -> 0x02af }
            int r6 = r7.f182526a     // Catch:{ all -> 0x02af }
            r4 = r4 | r6
            r7.f182526a = r4     // Catch:{ all -> 0x02af }
            java.lang.String r4 = "Unsupported LP version"
            r3.copyOnWrite()     // Catch:{ all -> 0x02af }
            com.google.protobuf.bv r6 = r3.instance     // Catch:{ all -> 0x02af }
            com.google.speech.j.mx r6 = (com.google.speech.p5218j.C67150mx) r6     // Catch:{ all -> 0x02af }
            int r7 = r6.f182526a     // Catch:{ all -> 0x02af }
            r7 = r7 | 2
            r6.f182526a = r7     // Catch:{ all -> 0x02af }
            r6.f182528c = r4     // Catch:{ all -> 0x02af }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ all -> 0x02af }
            com.google.speech.j.mx r3 = (com.google.speech.p5218j.C67150mx) r3     // Catch:{ all -> 0x02af }
            r0.mo72823f(r15, r3)     // Catch:{ all -> 0x02af }
            com.google.android.apps.gsa.nga.shared.s.h r15 = r1.f214360d     // Catch:{ all -> 0x02af }
            com.google.speech.j.mz r0 = com.google.speech.p5218j.C67152mz.UNSUPPORTED_LANGUAGE_PACK     // Catch:{ all -> 0x02af }
            r15.mo75090a(r0)     // Catch:{ all -> 0x02af }
            com.google.android.apps.gsa.nga.engine.recognition.l.a.t r15 = new com.google.android.apps.gsa.nga.engine.recognition.l.a.t     // Catch:{ all -> 0x02af }
            com.google.speech.j.mz r0 = com.google.speech.p5218j.C67152mz.UNSUPPORTED_LANGUAGE_PACK     // Catch:{ all -> 0x02af }
            int r0 = r0.f182542l     // Catch:{ all -> 0x02af }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02af }
            r1.<init>(r5)     // Catch:{ all -> 0x02af }
            r1.append(r0)     // Catch:{ all -> 0x02af }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02af }
            r15.<init>(r0)     // Catch:{ all -> 0x02af }
            throw r15     // Catch:{ all -> 0x02af }
        L_0x02af:
            r15 = move-exception
            r2.unlock()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a.C77769aw.mo17879a(java.lang.Object):java.lang.Object");
    }
}
