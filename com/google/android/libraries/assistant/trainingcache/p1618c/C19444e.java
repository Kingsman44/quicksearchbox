package com.google.android.libraries.assistant.trainingcache.p1618c;

import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63257b;

/* renamed from: com.google.android.libraries.assistant.trainingcache.c.e */
/* compiled from: PG */
public final class C19444e {

    /* renamed from: a */
    static final C58495hd f54373a;

    /* renamed from: b */
    private static final C59071e f54374b = C59071e.m91332i("com.google.android.libraries.assistant.trainingcache.c.e");

    /* renamed from: c */
    private static final String[] f54375c = {"num_epochs", "acceptance_decision"};

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("baseline_eval", C63257b.EXEC_NAME_BASELINE_EVAL);
        gzVar.mo55429h("p13n_train", C63257b.EXEC_NAME_P13N_TRAIN);
        gzVar.mo55429h("p13n_train_per_epoch", C63257b.EXEC_NAME_P13N_TRAIN_PER_EPOCH);
        gzVar.mo55429h("p13n_eval", C63257b.EXEC_NAME_P13N_EVAL);
        gzVar.mo55429h("regression_eval", C63257b.EXEC_NAME_REGRESSION_EVAL);
        gzVar.mo55429h("extra_evals.p13n_train_data", C63257b.EXEC_NAME_EXTRA_EVALS_P13N_TRAIN_DATA);
        gzVar.mo55429h("extra_evals.baseline_train_data", C63257b.EXEC_NAME_EXTRA_EVALS_BASELINE_TRAIN_DATA);
        gzVar.mo55429h("extra_evals.baseline_unedited_eval", C63257b.EXEC_NAME_EXTRA_EVALS_BASELINE_UNEDITED_EVAL);
        gzVar.mo55429h("extra_evals.p13n_unedited_eval", C63257b.EXEC_NAME_EXTRA_EVALS_P13N_UNEDITED_EVAL);
        gzVar.mo55429h("extra_evals.baseline_speech_eval", C63257b.EXEC_NAME_EXTRA_EVALS_BASELINE_SPEECH_EVAL);
        gzVar.mo55429h("extra_evals.p13n_speech_eval", C63257b.EXEC_NAME_EXTRA_EVALS_P13N_SPEECH_EVAL);
        gzVar.mo55429h("extra_evals.regression_speech_eval", C63257b.EXEC_NAME_EXTRA_EVALS_REGRESSION_SPEECH_EVAL);
        f54373a = gzVar.mo55427f(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0085 A[Catch:{ IOException -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ac A[Catch:{ IOException -> 0x00bb }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63260e m37134a(int r4, java.io.File r5, java.io.File r6) {
        /*
            com.google.protos.ai.d.f.a.f r0 = com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63261f.f170949g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.protos.ai.d.f.a.e r0 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63260e) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.protos.ai.d.f.a.f r1 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63261f) r1
            int r4 = r4 + -1
            r1.f170955e = r4
            int r4 = r1.f170951a
            r4 = r4 | 8
            r1.f170951a = r4
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.protos.ai.d.f.a.f r4 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63261f) r4
            r1 = 1
            r4.f170956f = r1
            int r2 = r4.f170951a
            r2 = r2 | 16
            r4.f170951a = r2
            if (r5 == 0) goto L_0x006f
            boolean r4 = r5.exists()     // Catch:{ IOException -> 0x00bb }
            if (r4 == 0) goto L_0x006f
            java.lang.String r4 = r5.getAbsolutePath()     // Catch:{ IOException -> 0x00bb }
            com.google.al.c.c.b.as r4 = com.google.android.libraries.assistant.soda.C19245ah.m36696d(r4)     // Catch:{ IOException -> 0x00bb }
            if (r4 == 0) goto L_0x0060
            java.lang.String r5 = r4.f29417b     // Catch:{ IOException -> 0x00bb }
            r0.copyOnWrite()     // Catch:{ IOException -> 0x00bb }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ IOException -> 0x00bb }
            com.google.protos.ai.d.f.a.f r2 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63261f) r2     // Catch:{ IOException -> 0x00bb }
            r5.getClass()     // Catch:{ IOException -> 0x00bb }
            int r3 = r2.f170951a     // Catch:{ IOException -> 0x00bb }
            r1 = r1 | r3
            r2.f170951a = r1     // Catch:{ IOException -> 0x00bb }
            r2.f170952b = r5     // Catch:{ IOException -> 0x00bb }
            int r4 = r4.f29419d     // Catch:{ IOException -> 0x00bb }
            r0.copyOnWrite()     // Catch:{ IOException -> 0x00bb }
            com.google.protobuf.bv r5 = r0.instance     // Catch:{ IOException -> 0x00bb }
            com.google.protos.ai.d.f.a.f r5 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63261f) r5     // Catch:{ IOException -> 0x00bb }
            int r1 = r5.f170951a     // Catch:{ IOException -> 0x00bb }
            r1 = r1 | 2
            r5.f170951a = r1     // Catch:{ IOException -> 0x00bb }
            r5.f170953c = r4     // Catch:{ IOException -> 0x00bb }
            goto L_0x007d
        L_0x0060:
            com.google.common.f.e r4 = f54374b     // Catch:{ IOException -> 0x00bb }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ IOException -> 0x00bb }
            java.lang.String r1 = "Could not extract language pack proto from %s!"
            r2 = 47863(0xbaf7, float:6.707E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r2)).mo56389s(r1, r5)     // Catch:{ IOException -> 0x00bb }
            goto L_0x007d
        L_0x006f:
            com.google.common.f.e r4 = f54374b     // Catch:{ IOException -> 0x00bb }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ IOException -> 0x00bb }
            java.lang.String r1 = "Language pack directory %s does not exist."
            r2 = 47861(0xbaf5, float:6.7068E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r2)).mo56389s(r1, r5)     // Catch:{ IOException -> 0x00bb }
        L_0x007d:
            if (r6 == 0) goto L_0x00ac
            boolean r4 = r6.exists()     // Catch:{ IOException -> 0x00bb }
            if (r4 == 0) goto L_0x00ac
            com.google.common.i.o r4 = com.google.common.p4537i.C59294s.m92131a()     // Catch:{ IOException -> 0x00bb }
            java.nio.file.Path r5 = r6.toPath()     // Catch:{ IOException -> 0x00bb }
            byte[] r5 = java.nio.file.Files.readAllBytes(r5)     // Catch:{ IOException -> 0x00bb }
            int r6 = r5.length     // Catch:{ IOException -> 0x00bb }
            com.google.common.i.b r4 = (com.google.common.p4537i.C59277b) r4     // Catch:{ IOException -> 0x00bb }
            com.google.common.i.n r4 = r4.mo56761d(r5, r6)     // Catch:{ IOException -> 0x00bb }
            int r4 = r4.mo56771a()     // Catch:{ IOException -> 0x00bb }
            r0.copyOnWrite()     // Catch:{ IOException -> 0x00bb }
            com.google.protobuf.bv r5 = r0.instance     // Catch:{ IOException -> 0x00bb }
            com.google.protos.ai.d.f.a.f r5 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63261f) r5     // Catch:{ IOException -> 0x00bb }
            int r6 = r5.f170951a     // Catch:{ IOException -> 0x00bb }
            r6 = r6 | 4
            r5.f170951a = r6     // Catch:{ IOException -> 0x00bb }
            r5.f170954d = r4     // Catch:{ IOException -> 0x00bb }
            goto L_0x00ca
        L_0x00ac:
            com.google.common.f.e r4 = f54374b     // Catch:{ IOException -> 0x00bb }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ IOException -> 0x00bb }
            java.lang.String r5 = "Task plan file %s does not exist."
            r1 = 47862(0xbaf6, float:6.7069E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r1)).mo56389s(r5, r6)     // Catch:{ IOException -> 0x00bb }
            goto L_0x00ca
        L_0x00bb:
            r4 = move-exception
            com.google.common.f.e r5 = f54374b
            com.google.common.f.x r5 = r5.mo56225c()
            java.lang.String r6 = "Failed to fully populate task info."
            r1 = 47850(0xbaea, float:6.7052E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r4)).mo56372aa(r1)).mo56386p(r6)
        L_0x00ca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.trainingcache.p1618c.C19444e.m37134a(int, java.io.File, java.io.File):com.google.protos.ai.d.f.a.e");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.util.List} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:49|55|56|57|62|63) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) f54374b.mo56226d()).mo56372aa(47857)).mo56389s("Missing serialized metric value for %s.", r10);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x01a8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0270 A[LOOP:1: B:82:0x026e->B:83:0x0270, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x028f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63262g m37135b(int r17, android.content.Context r18, com.google.android.gms.learning.InAppTrainerOptions r19, boolean r20, p3186j$.time.Instant r21) {
        /*
            r0 = r18
            r1 = r19
            android.net.Uri r2 = r1.f391081m
            j$.util.Optional r2 = p3186j$.util.Optional.ofNullable(r2)
            com.google.android.libraries.assistant.trainingcache.c.b r3 = new com.google.android.libraries.assistant.trainingcache.c.b
            r3.<init>(r0)
            j$.util.Optional r2 = r2.map(r3)
            android.net.Uri r3 = r1.f391075g
            j$.util.Optional r3 = p3186j$.util.Optional.ofNullable(r3)
            com.google.android.libraries.assistant.trainingcache.c.c r4 = new com.google.android.libraries.assistant.trainingcache.c.c
            r4.<init>(r0)
            j$.util.Optional r3 = r3.map(r4)
            android.net.Uri r1 = r1.f391078j
            j$.util.Optional r1 = p3186j$.util.Optional.ofNullable(r1)
            com.google.android.libraries.assistant.trainingcache.c.a r4 = new com.google.android.libraries.assistant.trainingcache.c.a
            r4.<init>(r0)
            j$.util.Optional r0 = r1.map(r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x003c
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x004d
        L_0x003c:
            java.io.File r1 = new java.io.File
            java.lang.Object r0 = r0.get()
            java.io.File r0 = (java.io.File) r0
            java.lang.String r4 = "latest_metrics.pb"
            r1.<init>(r0, r4)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r1)
        L_0x004d:
            r1 = 0
            java.lang.Object r2 = r2.orElse(r1)
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r3 = r3.orElse(r1)
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.orElse(r1)
            java.io.File r0 = (java.io.File) r0
            com.google.protos.ai.d.f.a.j r4 = com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63265j.f170990j
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.protos.ai.d.f.a.g r4 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63262g) r4
            r5 = 5
            r6 = 6
            r9 = 3
            r11 = 2
            r13 = 1
            if (r0 == 0) goto L_0x01c2
            boolean r14 = r0.isFile()
            if (r14 != 0) goto L_0x0077
            goto L_0x01c2
        L_0x0077:
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch:{ IOException -> 0x01ab }
            r14.<init>(r0)     // Catch:{ IOException -> 0x01ab }
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x0188 }
            org.tensorflow.b.c r15 = org.tensorflow.p5651b.C72663c.f193237d     // Catch:{ all -> 0x0188 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r15, (java.io.InputStream) r14, (com.google.protobuf.C62921ba) r0)     // Catch:{ all -> 0x0188 }
            org.tensorflow.b.c r0 = (org.tensorflow.p5651b.C72663c) r0     // Catch:{ all -> 0x0188 }
            java.util.HashMap r15 = new java.util.HashMap     // Catch:{ all -> 0x0188 }
            r15.<init>()     // Catch:{ all -> 0x0188 }
            r1 = 0
        L_0x008e:
            com.google.protobuf.cq r10 = r0.f193241c     // Catch:{ all -> 0x0188 }
            int r10 = r10.size()     // Catch:{ all -> 0x0188 }
            if (r1 >= r10) goto L_0x0182
            com.google.protobuf.cq r10 = r0.f193241c     // Catch:{ all -> 0x0188 }
            java.lang.Object r10 = r10.get(r1)     // Catch:{ all -> 0x0188 }
            com.google.protobuf.z r10 = (com.google.protobuf.C63088z) r10     // Catch:{ all -> 0x0188 }
            java.nio.charset.Charset r12 = com.google.protobuf.C62972cr.f170009a     // Catch:{ all -> 0x0188 }
            java.lang.String r10 = r10.mo59170I(r12)     // Catch:{ all -> 0x0188 }
            int r12 = r1 + 1
            com.google.protobuf.cq r7 = r0.f193241c     // Catch:{ all -> 0x0188 }
            int r7 = r7.size()     // Catch:{ all -> 0x0188 }
            if (r12 < r7) goto L_0x00cc
            com.google.common.f.e r0 = f54374b     // Catch:{ all -> 0x00c6 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x00c6 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x00c6 }
            r1 = 47857(0xbaf1, float:6.7062E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x00c6 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = "Missing serialized metric value for %s."
            r0.mo56389s(r1, r10)     // Catch:{ all -> 0x00c6 }
            goto L_0x0182
        L_0x00c6:
            r0 = move-exception
            r1 = r0
            r5 = 10
            goto L_0x018c
        L_0x00cc:
            com.google.protobuf.cq r7 = r0.f193241c     // Catch:{ all -> 0x0188 }
            java.lang.Object r7 = r7.get(r12)     // Catch:{ all -> 0x0188 }
            com.google.protobuf.z r7 = (com.google.protobuf.C63088z) r7     // Catch:{ all -> 0x0188 }
            com.google.protobuf.ba r12 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x0188 }
            org.tensorflow.b.c r8 = org.tensorflow.p5651b.C72663c.f193237d     // Catch:{ all -> 0x0188 }
            com.google.protobuf.bv r7 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (com.google.protobuf.C63088z) r7, (com.google.protobuf.C62921ba) r12)     // Catch:{ all -> 0x0188 }
            org.tensorflow.b.c r7 = (org.tensorflow.p5651b.C72663c) r7     // Catch:{ all -> 0x0188 }
            com.google.protobuf.z r8 = r7.f193240b     // Catch:{ all -> 0x0188 }
            byte[] r8 = r8.mo59174N()     // Catch:{ all -> 0x0188 }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r8)     // Catch:{ all -> 0x0188 }
            java.nio.ByteOrder r12 = java.nio.ByteOrder.nativeOrder()     // Catch:{ all -> 0x0188 }
            java.nio.ByteBuffer r8 = r8.order(r12)     // Catch:{ all -> 0x0188 }
            int r12 = r7.f193239a     // Catch:{ all -> 0x0188 }
            int r12 = org.tensorflow.p5651b.C72661a.m107463b(r12)     // Catch:{ all -> 0x0188 }
            if (r12 != 0) goto L_0x00fb
            r12 = 1
        L_0x00fb:
            int r12 = r12 + -2
            if (r12 == r13) goto L_0x015a
            if (r12 == r11) goto L_0x0152
            if (r12 == r9) goto L_0x014a
            if (r12 == r5) goto L_0x0143
            if (r12 == r6) goto L_0x013c
            r5 = 9
            if (r12 == r5) goto L_0x0134
            r5 = 10
            if (r12 == r5) goto L_0x013e
            com.google.common.f.e r8 = f54374b     // Catch:{ all -> 0x0180 }
            com.google.common.f.x r8 = r8.mo56226d()     // Catch:{ all -> 0x0180 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x0180 }
            r12 = 47854(0xbaee, float:6.7058E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r12)     // Catch:{ all -> 0x0180 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x0180 }
            java.lang.String r12 = "Unexpected data type (ID=%d) for metric %s."
            int r7 = r7.f193239a     // Catch:{ all -> 0x0180 }
            int r7 = org.tensorflow.p5651b.C72661a.m107463b(r7)     // Catch:{ all -> 0x0180 }
            if (r7 != 0) goto L_0x012b
            r7 = 1
        L_0x012b:
            int r7 = org.tensorflow.p5651b.C72661a.m107462a(r7)     // Catch:{ all -> 0x0180 }
            r8.mo56395y(r12, r7, r10)     // Catch:{ all -> 0x0180 }
            r7 = 0
            goto L_0x0160
        L_0x0134:
            r5 = 10
            long r7 = r8.getLong()     // Catch:{ all -> 0x0180 }
            float r7 = (float) r7     // Catch:{ all -> 0x0180 }
            goto L_0x0160
        L_0x013c:
            r5 = 10
        L_0x013e:
            byte r7 = r8.get()     // Catch:{ all -> 0x0180 }
            goto L_0x0150
        L_0x0143:
            r5 = 10
            short r7 = r8.getShort()     // Catch:{ all -> 0x0180 }
            goto L_0x0150
        L_0x014a:
            r5 = 10
            int r7 = r8.getInt()     // Catch:{ all -> 0x0180 }
        L_0x0150:
            float r7 = (float) r7     // Catch:{ all -> 0x0180 }
            goto L_0x0160
        L_0x0152:
            r5 = 10
            double r7 = r8.getDouble()     // Catch:{ all -> 0x0180 }
            float r7 = (float) r7     // Catch:{ all -> 0x0180 }
            goto L_0x0160
        L_0x015a:
            r5 = 10
            float r7 = r8.getFloat()     // Catch:{ all -> 0x0180 }
        L_0x0160:
            java.lang.Float r8 = java.lang.Float.valueOf(r7)     // Catch:{ all -> 0x0180 }
            r15.put(r10, r8)     // Catch:{ all -> 0x0180 }
            com.google.common.f.e r8 = f54374b     // Catch:{ all -> 0x0180 }
            com.google.common.f.x r8 = r8.mo56224b()     // Catch:{ all -> 0x0180 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x0180 }
            r12 = 47855(0xbaef, float:6.7059E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r12)     // Catch:{ all -> 0x0180 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x0180 }
            r8.mo56376ae(r10, r7)     // Catch:{ all -> 0x0180 }
            int r1 = r1 + 2
            r5 = 5
            goto L_0x008e
        L_0x0180:
            r0 = move-exception
            goto L_0x018b
        L_0x0182:
            r5 = 10
            r14.close()     // Catch:{ IOException -> 0x01a9 }
            goto L_0x01c9
        L_0x0188:
            r0 = move-exception
            r5 = 10
        L_0x018b:
            r1 = r0
        L_0x018c:
            r14.close()     // Catch:{ all -> 0x0190 }
            goto L_0x01a8
        L_0x0190:
            r0 = move-exception
            r7 = r0
            java.lang.Class[] r0 = new java.lang.Class[r13]     // Catch:{ Exception -> 0x01a8 }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            r10 = 0
            r0[r10] = r8     // Catch:{ Exception -> 0x01a8 }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            java.lang.String r12 = "addSuppressed"
            java.lang.reflect.Method r0 = r8.getDeclaredMethod(r12, r0)     // Catch:{ Exception -> 0x01a8 }
            java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x01a8 }
            r8[r10] = r7     // Catch:{ Exception -> 0x01a8 }
            r0.invoke(r1, r8)     // Catch:{ Exception -> 0x01a8 }
        L_0x01a8:
            throw r1     // Catch:{ IOException -> 0x01a9 }
        L_0x01a9:
            r0 = move-exception
            goto L_0x01ae
        L_0x01ab:
            r0 = move-exception
            r5 = 10
        L_0x01ae:
            com.google.common.f.e r1 = f54374b
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r7 = "Unable to generate metrics map from metrics file"
            r8 = 47856(0xbaf0, float:6.706E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r8)).mo56386p(r7)
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
            goto L_0x01c9
        L_0x01c2:
            r5 = 10
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
        L_0x01c9:
            r1 = r17
            com.google.protos.ai.d.f.a.e r0 = m37134a(r1, r2, r3)
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.protos.ai.d.f.a.j r1 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63265j) r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.protos.ai.d.f.a.f r0 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63261f) r0
            r0.getClass()
            r1.f170993b = r0
            int r0 = r1.f170992a
            r0 = r0 | r13
            r1.f170992a = r0
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.protos.ai.d.f.a.j r0 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63265j) r0
            int r1 = r0.f170992a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r0.f170992a = r1
            r1 = r20
            r0.f170999h = r1
            java.lang.String r0 = "num_epochs"
            java.lang.Object r0 = r15.get(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L_0x0215
            int r0 = r0.intValue()
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.protos.ai.d.f.a.j r1 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63265j) r1
            int r2 = r1.f170992a
            r2 = r2 | 64
            r1.f170992a = r2
            r1.f170997f = r0
            goto L_0x0223
        L_0x0215:
            com.google.common.f.e r0 = f54374b
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Number of epochs not provided!"
            r2 = 47859(0xbaf3, float:6.7065E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
        L_0x0223:
            java.lang.String r0 = "acceptance_decision"
            java.lang.Object r0 = r15.get(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            r10 = 4
            if (r0 == 0) goto L_0x0249
            float r0 = r0.floatValue()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0239
            r0 = 1
            goto L_0x023a
        L_0x0239:
            r0 = 0
        L_0x023a:
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.protos.ai.d.f.a.j r1 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63265j) r1
            int r2 = r1.f170992a
            r2 = r2 | r10
            r1.f170992a = r2
            r1.f170995d = r0
            goto L_0x0257
        L_0x0249:
            com.google.common.f.e r0 = f54374b
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Acceptance decision not provided!"
            r2 = 47860(0xbaf4, float:6.7066E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
        L_0x0257:
            long r0 = r21.toEpochMilli()
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.protos.ai.d.f.a.j r2 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63265j) r2
            int r3 = r2.f170992a
            r3 = r3 | 32
            r2.f170992a = r3
            r2.f170996e = r0
            java.lang.String[] r0 = f54375c
            int r1 = r0.length
            r1 = 0
        L_0x026e:
            if (r1 >= r11) goto L_0x0278
            r2 = r0[r1]
            r15.remove(r2)
            int r1 = r1 + 1
            goto L_0x026e
        L_0x0278:
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.protos.ai.d.f.a.b> r1 = com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63257b.class
            r0.<init>(r1)
            java.util.Set r1 = r15.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0287:
            boolean r2 = r1.hasNext()
            r3 = 47
            if (r2 == 0) goto L_0x0312
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r7 = r2.getKey()
            java.lang.String r7 = (java.lang.String) r7
            com.google.common.base.m r8 = new com.google.common.base.m
            r8.<init>(r3)
            com.google.common.base.cf r3 = com.google.common.base.C58869cf.m90936b(r8)
            com.google.common.base.cf r3 = r3.mo56156j()
            java.util.List r3 = r3.mo56155i(r7)
            boolean r7 = r3.isEmpty()
            if (r7 == 0) goto L_0x02c3
            com.google.common.f.e r3 = f54374b
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r7 = "Could not find execution name from metric key."
            r8 = 47849(0xbae9, float:6.7051E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r8)).mo56386p(r7)
            r3 = 0
            r8 = 0
            goto L_0x02d0
        L_0x02c3:
            com.google.common.b.hd r7 = f54373a
            r8 = 0
            java.lang.Object r3 = r3.get(r8)
            java.lang.Object r3 = r7.get(r3)
            com.google.protos.ai.d.f.a.b r3 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63257b) r3
        L_0x02d0:
            if (r3 != 0) goto L_0x02e6
            com.google.common.f.e r3 = f54374b
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.Object r7 = r2.getKey()
            r12 = 47858(0xbaf2, float:6.7063E-41)
            java.lang.String r14 = "Could not find execution name for key %s."
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r12)).mo56389s(r14, r7)
            com.google.protos.ai.d.f.a.b r3 = com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63257b.EXEC_NAME_UNKNOWN
        L_0x02e6:
            boolean r7 = r0.containsKey(r3)
            if (r7 != 0) goto L_0x02f5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0.put(r3, r7)
            goto L_0x02fc
        L_0x02f5:
            java.lang.Object r3 = r0.get(r3)
            r7 = r3
            java.util.List r7 = (java.util.List) r7
        L_0x02fc:
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.Float r2 = (java.lang.Float) r2
            com.google.common.base.az r12 = new com.google.common.base.az
            r12.<init>(r3, r2)
            r7.add(r12)
            goto L_0x0287
        L_0x0312:
            r8 = 0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x031b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x07a0
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.protos.ai.d.f.a.b r2 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63257b) r2
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            com.google.protos.ai.d.f.a.i r7 = com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i.f170957F
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.protos.ai.d.f.a.h r7 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63263h) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r2 = r2.f170933n
            r12.f170965b = r2
            int r2 = r12.f170964a
            r2 = r2 | r13
            r12.f170964a = r2
            java.util.Iterator r1 = r1.iterator()
        L_0x034f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x077b
            java.lang.Object r2 = r1.next()
            com.google.common.base.az r2 = (com.google.common.base.C58835az) r2
            java.lang.Object r12 = r2.f156631a
            java.lang.String r12 = (java.lang.String) r12
            com.google.common.base.m r14 = new com.google.common.base.m
            r14.<init>(r3)
            com.google.common.base.cf r14 = com.google.common.base.C58869cf.m90936b(r14)
            com.google.common.base.cf r14 = r14.mo56156j()
            java.util.List r12 = r14.mo56155i(r12)
            boolean r14 = r12.isEmpty()
            if (r14 != 0) goto L_0x038a
            int r14 = r12.size()
            if (r14 >= r11) goto L_0x037d
            goto L_0x038a
        L_0x037d:
            java.lang.Object r12 = r12.get(r13)
            java.lang.String r12 = (java.lang.String) r12
            r14 = 95
            java.lang.String r12 = r12.replace(r3, r14)
            goto L_0x0399
        L_0x038a:
            com.google.common.f.e r12 = f54374b
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r14 = "Could not find metric name from metric key."
            r15 = 47853(0xbaed, float:6.7056E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r15)).mo56386p(r14)
            r12 = 0
        L_0x0399:
            java.lang.Object r2 = r2.f156632b
            java.lang.Float r2 = (java.lang.Float) r2
            if (r12 == 0) goto L_0x034f
            int r14 = r12.hashCode()
            r15 = 16
            r16 = 8
            switch(r14) {
                case -2131707655: goto L_0x04ec;
                case -2076967198: goto L_0x04e1;
                case -1931997700: goto L_0x04d7;
                case -1907761908: goto L_0x04cc;
                case -1904848609: goto L_0x04c1;
                case -1861726646: goto L_0x04b6;
                case -1427846102: goto L_0x04ac;
                case -1425469743: goto L_0x04a1;
                case -1376177026: goto L_0x0496;
                case -1342332911: goto L_0x048a;
                case -1092323846: goto L_0x047e;
                case -934922479: goto L_0x0472;
                case -711758867: goto L_0x0466;
                case -687720222: goto L_0x045b;
                case -195505379: goto L_0x044f;
                case 3327779: goto L_0x0443;
                case 3596858: goto L_0x0437;
                case 3596982: goto L_0x042b;
                case 441535984: goto L_0x0420;
                case 606112465: goto L_0x0414;
                case 607383419: goto L_0x0409;
                case 1066355985: goto L_0x03fe;
                case 1269298047: goto L_0x03f2;
                case 1271807964: goto L_0x03e6;
                case 1286410651: goto L_0x03da;
                case 1522890261: goto L_0x03ce;
                case 1651956449: goto L_0x03c3;
                case 1667626099: goto L_0x03b8;
                case 1930306895: goto L_0x03ac;
                default: goto L_0x03aa;
            }
        L_0x03aa:
            goto L_0x04f7
        L_0x03ac:
            java.lang.String r14 = "edits_deletions"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 19
            goto L_0x04f8
        L_0x03b8:
            java.lang.String r14 = "num_tokens"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 4
            goto L_0x04f8
        L_0x03c3:
            java.lang.String r14 = "num_word_pieces"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 5
            goto L_0x04f8
        L_0x03ce:
            java.lang.String r14 = "edits_substituitions"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 21
            goto L_0x04f8
        L_0x03da:
            java.lang.String r14 = "precision_recall_retrieved"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 16
            goto L_0x04f8
        L_0x03e6:
            java.lang.String r14 = "stability_num_unstable_segments"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 25
            goto L_0x04f8
        L_0x03f2:
            java.lang.String r14 = "num_frames"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 8
            goto L_0x04f8
        L_0x03fe:
            java.lang.String r14 = "num_updates"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 2
            goto L_0x04f8
        L_0x0409:
            java.lang.String r14 = "num_utterances"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 6
            goto L_0x04f8
        L_0x0414:
            java.lang.String r14 = "stability_num_final_words"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 24
            goto L_0x04f8
        L_0x0420:
            java.lang.String r14 = "num_utterances_changed"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 7
            goto L_0x04f8
        L_0x042b:
            java.lang.String r14 = "upwr"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 28
            goto L_0x04f8
        L_0x0437:
            java.lang.String r14 = "upsr"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 27
            goto L_0x04f8
        L_0x0443:
            java.lang.String r14 = "loss"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 10
            goto L_0x04f8
        L_0x044f:
            java.lang.String r14 = "precision_recall_correct"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 15
            goto L_0x04f8
        L_0x045b:
            java.lang.String r14 = "num_examples"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 1
            goto L_0x04f8
        L_0x0466:
            java.lang.String r14 = "stability_num_unstable_words"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 23
            goto L_0x04f8
        L_0x0472:
            java.lang.String r14 = "recall"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 14
            goto L_0x04f8
        L_0x047e:
            java.lang.String r14 = "edits_insertions"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 20
            goto L_0x04f8
        L_0x048a:
            java.lang.String r14 = "utterance_durations"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 9
            goto L_0x04f8
        L_0x0496:
            java.lang.String r14 = "precision"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 13
            goto L_0x04f8
        L_0x04a1:
            java.lang.String r14 = "stability_num_utterances"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 26
            goto L_0x04f8
        L_0x04ac:
            java.lang.String r14 = "execution_duration_millis"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 0
            goto L_0x04f8
        L_0x04b6:
            java.lang.String r14 = "precision_recall_relevant"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 17
            goto L_0x04f8
        L_0x04c1:
            java.lang.String r14 = "edits_corrects"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 22
            goto L_0x04f8
        L_0x04cc:
            java.lang.String r14 = "word_error_rate"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 18
            goto L_0x04f8
        L_0x04d7:
            java.lang.String r14 = "num_reference_words"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 3
            goto L_0x04f8
        L_0x04e1:
            java.lang.String r14 = "perplexity"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 12
            goto L_0x04f8
        L_0x04ec:
            java.lang.String r14 = "accuracy"
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L_0x04f7
            r14 = 11
            goto L_0x04f8
        L_0x04f7:
            r14 = -1
        L_0x04f8:
            switch(r14) {
                case 0: goto L_0x0767;
                case 1: goto L_0x0752;
                case 2: goto L_0x073e;
                case 3: goto L_0x0729;
                case 4: goto L_0x0714;
                case 5: goto L_0x06ff;
                case 6: goto L_0x06ea;
                case 7: goto L_0x06d5;
                case 8: goto L_0x06c0;
                case 9: goto L_0x06ab;
                case 10: goto L_0x0696;
                case 11: goto L_0x0681;
                case 12: goto L_0x066c;
                case 13: goto L_0x0655;
                case 14: goto L_0x063f;
                case 15: goto L_0x0629;
                case 16: goto L_0x0613;
                case 17: goto L_0x05fd;
                case 18: goto L_0x05e7;
                case 19: goto L_0x05d1;
                case 20: goto L_0x05bb;
                case 21: goto L_0x05a5;
                case 22: goto L_0x058f;
                case 23: goto L_0x0579;
                case 24: goto L_0x0563;
                case 25: goto L_0x054d;
                case 26: goto L_0x0537;
                case 27: goto L_0x0521;
                case 28: goto L_0x050b;
                default: goto L_0x04fb;
            }
        L_0x04fb:
            com.google.common.f.e r2 = f54374b
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r14 = "Could not find name of execution metric %s."
            r15 = 47851(0xbaeb, float:6.7054E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r15)).mo56389s(r14, r12)
            goto L_0x034f
        L_0x050b:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r15 = 1073741824(0x40000000, float:2.0)
            r14 = r14 | r15
            r12.f170964a = r14
            r12.f170963E = r2
            goto L_0x034f
        L_0x0521:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r15 = 536870912(0x20000000, float:1.0842022E-19)
            r14 = r14 | r15
            r12.f170964a = r14
            r12.f170962D = r2
            goto L_0x034f
        L_0x0537:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r15 = 268435456(0x10000000, float:2.5243549E-29)
            r14 = r14 | r15
            r12.f170964a = r14
            r12.f170961C = r2
            goto L_0x034f
        L_0x054d:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r15 = 134217728(0x8000000, float:3.85186E-34)
            r14 = r14 | r15
            r12.f170964a = r14
            r12.f170960B = r2
            goto L_0x034f
        L_0x0563:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            r14 = r14 | r15
            r12.f170964a = r14
            r12.f170959A = r2
            goto L_0x034f
        L_0x0579:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r15 = 33554432(0x2000000, float:9.403955E-38)
            r14 = r14 | r15
            r12.f170964a = r14
            r12.f170989z = r2
            goto L_0x034f
        L_0x058f:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r15 = 16777216(0x1000000, float:2.3509887E-38)
            r14 = r14 | r15
            r12.f170964a = r14
            r12.f170988y = r2
            goto L_0x034f
        L_0x05a5:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r15 = 8388608(0x800000, float:1.17549435E-38)
            r14 = r14 | r15
            r12.f170964a = r14
            r12.f170987x = r2
            goto L_0x034f
        L_0x05bb:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r15 = 4194304(0x400000, float:5.877472E-39)
            r14 = r14 | r15
            r12.f170964a = r14
            r12.f170986w = r2
            goto L_0x034f
        L_0x05d1:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r15 = 2097152(0x200000, float:2.938736E-39)
            r14 = r14 | r15
            r12.f170964a = r14
            r12.f170985v = r2
            goto L_0x034f
        L_0x05e7:
            float r2 = r2.floatValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r15 = 1048576(0x100000, float:1.469368E-39)
            r14 = r14 | r15
            r12.f170964a = r14
            r12.f170984u = r2
            goto L_0x034f
        L_0x05fd:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r15 = 524288(0x80000, float:7.34684E-40)
            r14 = r14 | r15
            r12.f170964a = r14
            r12.f170983t = r2
            goto L_0x034f
        L_0x0613:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r15 = 262144(0x40000, float:3.67342E-40)
            r14 = r14 | r15
            r12.f170964a = r14
            r12.f170982s = r2
            goto L_0x034f
        L_0x0629:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r15 = 131072(0x20000, float:1.83671E-40)
            r14 = r14 | r15
            r12.f170964a = r14
            r12.f170981r = r2
            goto L_0x034f
        L_0x063f:
            float r2 = r2.floatValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r15 = 65536(0x10000, float:9.18355E-41)
            r14 = r14 | r15
            r12.f170964a = r14
            r12.f170980q = r2
            goto L_0x034f
        L_0x0655:
            float r2 = r2.floatValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r15 = 32768(0x8000, float:4.5918E-41)
            r14 = r14 | r15
            r12.f170964a = r14
            r12.f170979p = r2
            goto L_0x034f
        L_0x066c:
            float r2 = r2.floatValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r14 = r14 | 16384(0x4000, float:2.2959E-41)
            r12.f170964a = r14
            r12.f170978o = r2
            goto L_0x034f
        L_0x0681:
            float r2 = r2.floatValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r14 = r14 | 8192(0x2000, float:1.14794E-41)
            r12.f170964a = r14
            r12.f170977n = r2
            goto L_0x034f
        L_0x0696:
            float r2 = r2.floatValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r14 = r14 | 4096(0x1000, float:5.74E-42)
            r12.f170964a = r14
            r12.f170976m = r2
            goto L_0x034f
        L_0x06ab:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r14 = r14 | 2048(0x800, float:2.87E-42)
            r12.f170964a = r14
            r12.f170975l = r2
            goto L_0x034f
        L_0x06c0:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r14 = r14 | 1024(0x400, float:1.435E-42)
            r12.f170964a = r14
            r12.f170974k = r2
            goto L_0x034f
        L_0x06d5:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r14 = r14 | 512(0x200, float:7.175E-43)
            r12.f170964a = r14
            r12.f170973j = r2
            goto L_0x034f
        L_0x06ea:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r14 = r14 | 256(0x100, float:3.59E-43)
            r12.f170964a = r14
            r12.f170972i = r2
            goto L_0x034f
        L_0x06ff:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r14 = r14 | 128(0x80, float:1.794E-43)
            r12.f170964a = r14
            r12.f170971h = r2
            goto L_0x034f
        L_0x0714:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r14 = r14 | 64
            r12.f170964a = r14
            r12.f170970g = r2
            goto L_0x034f
        L_0x0729:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r14 = r14 | 32
            r12.f170964a = r14
            r12.f170969f = r2
            goto L_0x034f
        L_0x073e:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r14 = r14 | r15
            r12.f170964a = r14
            r12.f170968e = r2
            goto L_0x034f
        L_0x0752:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r14 = r14 | 8
            r12.f170964a = r14
            r12.f170967d = r2
            goto L_0x034f
        L_0x0767:
            int r2 = r2.intValue()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.protos.ai.d.f.a.i r12 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r12
            int r14 = r12.f170964a
            r14 = r14 | r10
            r12.f170964a = r14
            r12.f170966c = r2
            goto L_0x034f
        L_0x077b:
            com.google.protobuf.bv r1 = r7.build()
            com.google.protos.ai.d.f.a.i r1 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63264i) r1
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.protos.ai.d.f.a.j r2 = (com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63265j) r2
            r1.getClass()
            com.google.protobuf.cq r7 = r2.f170998g
            boolean r12 = r7.mo58948c()
            if (r12 != 0) goto L_0x0799
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)
            r2.f170998g = r7
        L_0x0799:
            com.google.protobuf.cq r2 = r2.f170998g
            r2.add(r1)
            goto L_0x031b
        L_0x07a0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.trainingcache.p1618c.C19444e.m37135b(int, android.content.Context, com.google.android.gms.learning.InAppTrainerOptions, boolean, j$.time.Instant):com.google.protos.ai.d.f.a.g");
    }
}
