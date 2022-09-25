package com.google.android.apps.search.fedora.p10104h;

import android.content.Context;
import com.google.android.apps.gsa.p8867w.p8877g.C118794b;
import com.google.android.apps.search.fedora.metrics.C133072j;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19410n;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19411o;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19412p;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.C60790c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63262g;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63265j;
import com.google.speech.p5199c.p5200a.C66460e;
import com.google.speech.p5199c.p5200a.C66461f;
import com.google.speech.p5199c.p5200a.C66463h;
import com.google.speech.p5199c.p5200a.C66468m;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.p5610a.p5611a.p5612a.C71978d;

/* renamed from: com.google.android.apps.search.fedora.h.s */
/* compiled from: PG */
public final class C132910s implements C19412p {

    /* renamed from: a */
    public static final C59071e f362562a = C59071e.m91332i("com.google.android.apps.search.fedora.h.s");

    /* renamed from: b */
    public final C132904m f362563b;

    /* renamed from: c */
    public final Executor f362564c;

    /* renamed from: d */
    public final C118794b f362565d;

    /* renamed from: e */
    private final Context f362566e;

    /* renamed from: f */
    private final C60950i f362567f;

    /* renamed from: g */
    private final C133072j f362568g;

    public C132910s(Context context, C60950i iVar, C132904m mVar, C118794b bVar, Executor executor, C133072j jVar) {
        this.f362566e = context;
        this.f362567f = iVar;
        this.f362563b = mVar;
        this.f362565d = bVar;
        this.f362564c = executor;
        this.f362568g = jVar;
    }

    /* renamed from: b */
    public static void m215886b(File file) {
        if (file.exists()) {
            C71978d.m105262c(file);
        }
    }

    /* renamed from: a */
    public final C60870cx mo110934a(String str, String str2, File file, C66463h hVar) {
        ((C59052c) ((C59052c) f362562a.mo56224b()).mo56372aa(39903)).mo56386p("handleRejectedResourceSave().");
        File file2 = new File(C60790c.m92793a(this.f362563b.mo110932a(str).getAbsolutePath(), "rejected", "metrics", str2));
        try {
            this.f362563b.mo110933c(file, file2);
            mo110935c(hVar, false);
            C19410n c = C19411o.m37043c();
            c.mo24554b(true);
            return C60856cj.m92900i(c.mo24553a());
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f362562a.mo56226d()).mo56382g(e)).mo56372aa(39904)).mo56354G("Failed moving metrics files from %s to rejected directory %s", file, file2);
            mo110935c(hVar, false);
            C19410n c2 = C19411o.m37043c();
            c2.mo24554b(false);
            return C60856cj.m92900i(c2.mo24553a());
        }
    }

    /* renamed from: c */
    public final void mo110935c(C66463h hVar, boolean z) {
        hVar.copyOnWrite();
        C66468m mVar = (C66468m) hVar.instance;
        C66468m mVar2 = C66468m.f180737e;
        mVar.f180739a |= 2;
        mVar.f180741c = z;
        C133072j jVar = this.f362568g;
        C66460e eVar = (C66460e) C66461f.f180719g.createBuilder();
        C66468m mVar3 = (C66468m) hVar.build();
        eVar.copyOnWrite();
        C66461f fVar = (C66461f) eVar.instance;
        mVar3.getClass();
        fVar.f180724d = mVar3;
        fVar.f180721a |= 4;
        jVar.mo110968f((C66461f) eVar.build());
    }

    /* renamed from: d */
    public final void mo110936d(C63262g gVar) {
        C63265j jVar = (C63265j) gVar.instance;
        boolean z = false;
        if (jVar.f170999h && (jVar.f170992a & 256) != 0 && jVar.f171000i) {
            z = true;
        }
        gVar.copyOnWrite();
        C63265j jVar2 = (C63265j) gVar.instance;
        jVar2.f170992a |= 2;
        jVar2.f170994c = z;
        C133072j jVar3 = this.f362568g;
        C66460e eVar = (C66460e) C66461f.f180719g.createBuilder();
        eVar.copyOnWrite();
        C66461f fVar = (C66461f) eVar.instance;
        C63265j jVar4 = (C63265j) gVar.build();
        jVar4.getClass();
        fVar.f180726f = jVar4;
        fVar.f180721a |= 16;
        jVar3.mo110968f((C66461f) eVar.build());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:108|109) */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        throw r5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x0378 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo24604e(boolean r18, java.io.File r19, com.google.android.gms.learning.InAppTrainerOptions r20) {
        /*
            r17 = this;
            r9 = r17
            r0 = r20
            com.google.common.f.e r1 = f362562a
            com.google.common.f.x r2 = r1.mo56224b()
            java.lang.String r3 = "handleResult()"
            r4 = 39905(0x9be1, float:5.5919E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            java.lang.String r6 = r0.f391070a
            java.lang.String r2 = "SheldonAsrP13nTrainerSession"
            boolean r3 = r6.equals(r2)
            java.lang.String r4 = "SheldonLmP13nTrainerSession"
            r5 = 0
            if (r3 != 0) goto L_0x0042
            boolean r3 = r6.equals(r4)
            if (r3 == 0) goto L_0x0026
            goto L_0x0042
        L_0x0026:
            com.google.common.f.x r0 = r1.mo56226d()
            java.lang.String r1 = "Session name is in the wrong format: %s"
            r2 = 39913(0x9be9, float:5.593E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r1, r6)
            com.google.android.libraries.assistant.trainingcache.a.a.n r0 = com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19411o.m37043c()
            r0.mo24554b(r5)
            com.google.android.libraries.assistant.trainingcache.a.a.o r0 = r0.mo24553a()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x0042:
            com.google.common.f.x r3 = r1.mo56224b()
            java.lang.String r7 = "Result handling for model name %s:"
            r8 = 39906(0x9be2, float:5.592E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r8)).mo56389s(r7, r6)
            com.google.speech.c.a.m r3 = com.google.speech.p5199c.p5200a.C66468m.f180737e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.speech.c.a.h r3 = (com.google.speech.p5199c.p5200a.C66463h) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.speech.c.a.m r7 = (com.google.speech.p5199c.p5200a.C66468m) r7
            r6.getClass()
            int r8 = r7.f180739a
            r10 = 1
            r8 = r8 | r10
            r7.f180739a = r8
            r7.f180740b = r6
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0070
            r2 = 2
            goto L_0x0079
        L_0x0070:
            boolean r2 = r6.equals(r4)
            if (r2 == 0) goto L_0x0078
            r2 = 3
            goto L_0x0079
        L_0x0078:
            r2 = 1
        L_0x0079:
            android.content.Context r4 = r9.f362566e
            com.google.common.v.i r11 = r9.f362567f
            j$.time.Instant r11 = r11.mo57444a()
            r12 = r18
            com.google.protos.ai.d.f.a.g r4 = com.google.android.libraries.assistant.trainingcache.p1618c.C19444e.m37135b(r2, r4, r0, r12, r11)
            java.io.File r2 = new java.io.File
            java.lang.String r11 = "latest_metrics.pb"
            r12 = r19
            r2.<init>(r12, r11)
            boolean r11 = r2.exists()
            if (r11 == 0) goto L_0x03a2
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0379 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0379 }
            com.google.protobuf.ba r11 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x0358 }
            org.tensorflow.b.c r13 = org.tensorflow.p5651b.C72663c.f193237d     // Catch:{ all -> 0x0358 }
            com.google.protobuf.bv r11 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r13, (java.io.InputStream) r1, (com.google.protobuf.C62921ba) r11)     // Catch:{ all -> 0x0358 }
            org.tensorflow.b.c r11 = (org.tensorflow.p5651b.C72663c) r11     // Catch:{ all -> 0x0358 }
            com.google.common.b.gz r13 = new com.google.common.b.gz     // Catch:{ all -> 0x0358 }
            r14 = 4
            r13.<init>(r14)     // Catch:{ all -> 0x0358 }
            r14 = 0
        L_0x00ae:
            com.google.protobuf.cq r15 = r11.f193241c     // Catch:{ all -> 0x0358 }
            int r15 = r15.size()     // Catch:{ all -> 0x0358 }
            if (r14 >= r15) goto L_0x0180
            com.google.protobuf.cq r15 = r11.f193241c     // Catch:{ all -> 0x0358 }
            java.lang.Object r15 = r15.get(r14)     // Catch:{ all -> 0x0358 }
            com.google.protobuf.z r15 = (com.google.protobuf.C63088z) r15     // Catch:{ all -> 0x0358 }
            java.nio.charset.Charset r5 = com.google.protobuf.C62972cr.f170009a     // Catch:{ all -> 0x0358 }
            java.lang.String r5 = r15.mo59170I(r5)     // Catch:{ all -> 0x0358 }
            int r15 = r14 + 1
            com.google.protobuf.cq r7 = r11.f193241c     // Catch:{ all -> 0x0358 }
            int r7 = r7.size()     // Catch:{ all -> 0x0358 }
            if (r15 < r7) goto L_0x00e7
            com.google.common.f.e r7 = com.google.android.apps.search.fedora.p10104h.C132905n.f362548a     // Catch:{ all -> 0x0358 }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x0358 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0358 }
            r11 = 39895(0x9bd7, float:5.5905E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r11)     // Catch:{ all -> 0x0358 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0358 }
            java.lang.String r11 = "Missing serialized metric value for %s"
            r7.mo56389s(r11, r5)     // Catch:{ all -> 0x0358 }
            r5 = 0
            goto L_0x0180
        L_0x00e7:
            com.google.protobuf.cq r7 = r11.f193241c     // Catch:{ all -> 0x0358 }
            java.lang.Object r7 = r7.get(r15)     // Catch:{ all -> 0x0358 }
            com.google.protobuf.z r7 = (com.google.protobuf.C63088z) r7     // Catch:{ all -> 0x0358 }
            com.google.protobuf.ba r15 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x0358 }
            org.tensorflow.b.c r8 = org.tensorflow.p5651b.C72663c.f193237d     // Catch:{ all -> 0x0358 }
            com.google.protobuf.bv r7 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (com.google.protobuf.C63088z) r7, (com.google.protobuf.C62921ba) r15)     // Catch:{ all -> 0x0358 }
            org.tensorflow.b.c r7 = (org.tensorflow.p5651b.C72663c) r7     // Catch:{ all -> 0x0358 }
            com.google.protobuf.z r8 = r7.f193240b     // Catch:{ all -> 0x0358 }
            byte[] r8 = r8.mo59174N()     // Catch:{ all -> 0x0358 }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r8)     // Catch:{ all -> 0x0358 }
            java.nio.ByteOrder r15 = java.nio.ByteOrder.nativeOrder()     // Catch:{ all -> 0x0358 }
            java.nio.ByteBuffer r8 = r8.order(r15)     // Catch:{ all -> 0x0358 }
            int r15 = r7.f193239a     // Catch:{ all -> 0x0358 }
            int r15 = org.tensorflow.p5651b.C72661a.m107463b(r15)     // Catch:{ all -> 0x0358 }
            if (r15 != 0) goto L_0x0116
            r15 = 1
        L_0x0116:
            int r15 = r15 + -2
            if (r15 == r10) goto L_0x016f
            r10 = 2
            if (r15 == r10) goto L_0x0169
            r10 = 3
            if (r15 == r10) goto L_0x0163
            r10 = 5
            if (r15 == r10) goto L_0x015e
            r10 = 6
            if (r15 == r10) goto L_0x0159
            r10 = 9
            if (r15 == r10) goto L_0x0153
            r10 = 10
            if (r15 == r10) goto L_0x0159
            com.google.common.f.e r8 = com.google.android.apps.search.fedora.p10104h.C132905n.f362548a     // Catch:{ all -> 0x0358 }
            com.google.common.f.x r8 = r8.mo56226d()     // Catch:{ all -> 0x0358 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x0358 }
            r10 = 39894(0x9bd6, float:5.5903E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r10)     // Catch:{ all -> 0x0358 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x0358 }
            java.lang.String r10 = "Unexpected data type (ID=%d) for metric %s"
            int r7 = r7.f193239a     // Catch:{ all -> 0x0358 }
            int r7 = org.tensorflow.p5651b.C72661a.m107463b(r7)     // Catch:{ all -> 0x0358 }
            if (r7 != 0) goto L_0x014a
            r7 = 1
        L_0x014a:
            int r7 = org.tensorflow.p5651b.C72661a.m107462a(r7)     // Catch:{ all -> 0x0358 }
            r8.mo56395y(r10, r7, r5)     // Catch:{ all -> 0x0358 }
            r7 = 0
            goto L_0x0173
        L_0x0153:
            long r7 = r8.getLong()     // Catch:{ all -> 0x0358 }
            float r7 = (float) r7     // Catch:{ all -> 0x0358 }
            goto L_0x0173
        L_0x0159:
            byte r7 = r8.get()     // Catch:{ all -> 0x0358 }
            goto L_0x0167
        L_0x015e:
            short r7 = r8.getShort()     // Catch:{ all -> 0x0358 }
            goto L_0x0167
        L_0x0163:
            int r7 = r8.getInt()     // Catch:{ all -> 0x0358 }
        L_0x0167:
            float r7 = (float) r7     // Catch:{ all -> 0x0358 }
            goto L_0x0173
        L_0x0169:
            double r7 = r8.getDouble()     // Catch:{ all -> 0x0358 }
            float r7 = (float) r7     // Catch:{ all -> 0x0358 }
            goto L_0x0173
        L_0x016f:
            float r7 = r8.getFloat()     // Catch:{ all -> 0x0358 }
        L_0x0173:
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ all -> 0x0358 }
            r13.mo55429h(r5, r7)     // Catch:{ all -> 0x0358 }
            int r14 = r14 + 2
            r5 = 0
            r10 = 1
            goto L_0x00ae
        L_0x0180:
            com.google.common.b.hd r7 = r13.mo55427f(r5)     // Catch:{ all -> 0x0358 }
            r1.close()     // Catch:{ IOException -> 0x0379 }
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            com.google.common.b.ij r2 = r7.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
        L_0x0195:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x02a7
            java.lang.Object r8 = r2.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            r10 = 200(0xc8, float:2.8E-43)
            if (r5 < r10) goto L_0x01b5
            com.google.common.f.e r2 = com.google.android.apps.search.fedora.p10104h.C132905n.f362548a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r5 = "Exceeded max number of metrics to log: %d"
            r8 = 39898(0x9bda, float:5.5909E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r8)).mo56387q(r5, r10)
            goto L_0x02a7
        L_0x01b5:
            java.lang.Object r10 = r8.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r8 = r8.getValue()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            com.google.common.base.m r11 = new com.google.common.base.m
            r13 = 47
            r11.<init>(r13)
            com.google.common.base.cf r11 = com.google.common.base.C58869cf.m90936b(r11)
            com.google.common.base.cf r11 = r11.mo56156j()
            java.util.List r10 = r11.mo56155i(r10)
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x01ef
            com.google.common.f.e r8 = com.google.android.apps.search.fedora.p10104h.C132905n.f362548a
            com.google.common.f.x r8 = r8.mo56226d()
            java.lang.String r10 = "Metric name is empty"
            r11 = 39897(0x9bd9, float:5.5908E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r11)).mo56386p(r10)
        L_0x01ec:
            r15 = 2
            goto L_0x02a3
        L_0x01ef:
            int r11 = r10.size()
            r13 = 1
            if (r11 != r13) goto L_0x0200
            r11 = 0
            java.lang.Object r10 = r10.get(r11)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r14 = ""
            goto L_0x020d
        L_0x0200:
            r11 = 0
            java.lang.Object r14 = r10.get(r11)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r10 = r10.get(r13)
            java.lang.String r10 = (java.lang.String) r10
        L_0x020d:
            int r11 = r10.length()
            r13 = 30
            if (r11 <= r13) goto L_0x022c
            com.google.common.f.e r8 = com.google.android.apps.search.fedora.p10104h.C132905n.f362548a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            r11 = 39896(0x9bd8, float:5.5906E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r11)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            java.lang.String r11 = "Metric name '%s' exceeds length limit %d"
            r8.mo56352E(r11, r10, r13)
            goto L_0x01ec
        L_0x022c:
            com.google.speech.c.a.l r11 = com.google.speech.p5199c.p5200a.C66467l.f180732d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.speech.c.a.k r11 = (com.google.speech.p5199c.p5200a.C66466k) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.speech.c.a.l r13 = (com.google.speech.p5199c.p5200a.C66467l) r13
            r10.getClass()
            int r15 = r13.f180734a
            r16 = 1
            r15 = r15 | 1
            r13.f180734a = r15
            r13.f180735b = r10
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.speech.c.a.l r10 = (com.google.speech.p5199c.p5200a.C66467l) r10
            int r13 = r10.f180734a
            r15 = 2
            r13 = r13 | r15
            r10.f180734a = r13
            r10.f180736c = r8
            java.lang.Object r8 = r1.get(r14)
            com.google.speech.c.a.i r8 = (com.google.speech.p5199c.p5200a.C66464i) r8
            if (r8 != 0) goto L_0x027e
            com.google.speech.c.a.j r8 = com.google.speech.p5199c.p5200a.C66465j.f180727d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.speech.c.a.i r8 = (com.google.speech.p5199c.p5200a.C66464i) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.speech.c.a.j r10 = (com.google.speech.p5199c.p5200a.C66465j) r10
            r14.getClass()
            int r13 = r10.f180729a
            r16 = 1
            r13 = r13 | 1
            r10.f180729a = r13
            r10.f180730b = r14
            r1.put(r14, r8)
        L_0x027e:
            r8.copyOnWrite()
            com.google.protobuf.bv r8 = r8.instance
            com.google.speech.c.a.j r8 = (com.google.speech.p5199c.p5200a.C66465j) r8
            com.google.protobuf.bv r10 = r11.build()
            com.google.speech.c.a.l r10 = (com.google.speech.p5199c.p5200a.C66467l) r10
            com.google.speech.c.a.j r11 = com.google.speech.p5199c.p5200a.C66465j.f180727d
            r10.getClass()
            com.google.protobuf.cq r11 = r8.f180731c
            boolean r13 = r11.mo58948c()
            if (r13 != 0) goto L_0x029e
            com.google.protobuf.cq r11 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r11)
            r8.f180731c = r11
        L_0x029e:
            com.google.protobuf.cq r8 = r8.f180731c
            r8.add(r10)
        L_0x02a3:
            int r5 = r5 + 1
            goto L_0x0195
        L_0x02a7:
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x02af:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02df
            java.lang.Object r2 = r1.next()
            com.google.speech.c.a.i r2 = (com.google.speech.p5199c.p5200a.C66464i) r2
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.speech.c.a.m r5 = (com.google.speech.p5199c.p5200a.C66468m) r5
            com.google.protobuf.bv r2 = r2.build()
            com.google.speech.c.a.j r2 = (com.google.speech.p5199c.p5200a.C66465j) r2
            r2.getClass()
            com.google.protobuf.cq r8 = r5.f180742d
            boolean r10 = r8.mo58948c()
            if (r10 != 0) goto L_0x02d9
            com.google.protobuf.cq r8 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r8)
            r5.f180742d = r8
        L_0x02d9:
            com.google.protobuf.cq r5 = r5.f180742d
            r5.add(r2)
            goto L_0x02af
        L_0x02df:
            byte[] r0 = r0.f391080l     // Catch:{ ct -> 0x02f3 }
            int r1 = r0.length     // Catch:{ ct -> 0x02f3 }
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ ct -> 0x02f3 }
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x02f3 }
            com.google.android.apps.search.fedora.e.av r2 = com.google.android.apps.search.fedora.p10099e.C132791av.f362294d     // Catch:{ ct -> 0x02f3 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (byte[]) r0, (com.google.protobuf.C62921ba) r1)     // Catch:{ ct -> 0x02f3 }
            com.google.android.apps.search.fedora.e.av r0 = (com.google.android.apps.search.fedora.p10099e.C132791av) r0     // Catch:{ ct -> 0x02f3 }
            goto L_0x0304
        L_0x02f3:
            r0 = move-exception
            com.google.common.f.e r1 = f362562a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Failed to parse the Sheldon taining context."
            r5 = 39899(0x9bdb, float:5.591E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r5)).mo56386p(r2)
            com.google.android.apps.search.fedora.e.av r0 = com.google.android.apps.search.fedora.p10099e.C132791av.f362294d
        L_0x0304:
            r8 = r0
            if (r8 == 0) goto L_0x0336
            int r0 = r8.f362298c
            if (r0 != 0) goto L_0x030c
            goto L_0x0336
        L_0x030c:
            com.google.android.apps.gsa.w.g.b r0 = r9.f362565d
            p3186j$.util.Objects.requireNonNull(r0)
            com.google.android.apps.search.fedora.h.q r1 = new com.google.android.apps.search.fedora.h.q
            r1.<init>(r0)
            java.util.concurrent.Executor r0 = r9.f362564c
            com.google.common.util.concurrent.r r1 = com.google.apps.tiktok.tracing.C47810es.m84965e(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92905n(r1, r0)
            com.google.apps.tiktok.tracing.contrib.b.f r0 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r0)
            com.google.android.apps.search.fedora.h.r r10 = new com.google.android.apps.search.fedora.h.r
            r1 = r10
            r2 = r17
            r5 = r7
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.Executor r1 = r9.f362564c
            com.google.apps.tiktok.tracing.contrib.b.f r0 = r0.mo51516i(r10, r1)
            return r0
        L_0x0336:
            com.google.common.f.e r0 = f362562a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Soda Lp version not available in the sheldon training context."
            r2 = 39908(0x9be4, float:5.5923E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            r9.mo110936d(r4)
            com.google.android.libraries.assistant.trainingcache.a.a.n r0 = com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19411o.m37043c()
            r1 = 0
            r0.mo24554b(r1)
            com.google.android.libraries.assistant.trainingcache.a.a.o r0 = r0.mo24553a()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x0358:
            r0 = move-exception
            r5 = r0
            r1.close()     // Catch:{ all -> 0x035e }
            goto L_0x0378
        L_0x035e:
            r0 = move-exception
            r1 = r0
            r6 = 1
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0378 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r7 = 0
            r0[r7] = r6     // Catch:{ Exception -> 0x0378 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            java.lang.String r8 = "addSuppressed"
            java.lang.reflect.Method r0 = r6.getDeclaredMethod(r8, r0)     // Catch:{ Exception -> 0x0378 }
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0378 }
            r6[r7] = r1     // Catch:{ Exception -> 0x0378 }
            r0.invoke(r5, r6)     // Catch:{ Exception -> 0x0378 }
        L_0x0378:
            throw r5     // Catch:{ IOException -> 0x0379 }
        L_0x0379:
            r0 = move-exception
            com.google.common.f.e r1 = f362562a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r5 = "Failed to read local compute metrics file for Sheldon fine tuning."
            r6 = 39909(0x9be5, float:5.5924E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r6)).mo56386p(r5)
            r2.getAbsolutePath()
            r5 = 0
            r9.mo110935c(r3, r5)
            r9.mo110936d(r4)
            com.google.android.libraries.assistant.trainingcache.a.a.n r0 = com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19411o.m37043c()
            r0.mo24554b(r5)
            com.google.android.libraries.assistant.trainingcache.a.a.o r0 = r0.mo24553a()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x03a2:
            com.google.common.f.x r0 = r1.mo56224b()
            java.lang.String r1 = "Metrics file missing. Not accepting the model."
            r6 = 39911(0x9be7, float:5.5927E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56386p(r1)
            r2.getAbsolutePath()
            r9.mo110935c(r3, r5)
            r9.mo110936d(r4)
            com.google.android.libraries.assistant.trainingcache.a.a.n r0 = com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19411o.m37043c()
            r0.mo24554b(r5)
            com.google.android.libraries.assistant.trainingcache.a.a.o r0 = r0.mo24553a()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.fedora.p10104h.C132910s.mo24604e(boolean, java.io.File, com.google.android.gms.learning.InAppTrainerOptions):com.google.common.util.concurrent.cx");
    }
}
