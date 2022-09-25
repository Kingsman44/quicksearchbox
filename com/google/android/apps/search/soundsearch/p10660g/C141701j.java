package com.google.android.apps.search.soundsearch.p10660g;

import android.content.Context;
import com.google.android.apps.search.soundsearch.p10660g.p10662b.C141687b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.p3644h.C47117b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.frameworks.client.data.android.p4638e.C61412g;
import com.google.speech.p5208h.C66652ds;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.apps.search.soundsearch.g.j */
/* compiled from: PG */
public final class C141701j {

    /* renamed from: a */
    public static final C59071e f384577a = C59071e.m91332i("com.google.android.apps.search.soundsearch.g.j");

    /* renamed from: b */
    public final C60888db f384578b;

    /* renamed from: c */
    public final Context f384579c;

    /* renamed from: d */
    public final C141703l f384580d;

    /* renamed from: e */
    public final String f384581e;

    /* renamed from: f */
    public final AtomicBoolean f384582f = new AtomicBoolean(false);

    /* renamed from: g */
    public C70862aj f384583g;

    /* renamed from: h */
    private final C60888db f384584h;

    /* renamed from: i */
    private final C66652ds f384585i;

    /* renamed from: j */
    private final Optional f384586j;

    /* renamed from: k */
    private final C47117b f384587k;

    /* renamed from: l */
    private final C46175b f384588l;

    /* renamed from: m */
    private C60872cz f384589m;

    /* renamed from: n */
    private C70862aj f384590n;

    public C141701j(Context context, C60888db dbVar, C60888db dbVar2, C66652ds dsVar, Optional optional, C47117b bVar, C46175b bVar2, String str, C141703l lVar) {
        this.f384584h = dbVar;
        this.f384578b = dbVar2;
        this.f384585i = dsVar;
        this.f384579c = context;
        this.f384586j = optional;
        this.f384587k = bVar;
        this.f384588l = bVar2;
        this.f384581e = str;
        this.f384580d = lVar;
    }

    /* renamed from: a */
    public final void mo116656a() {
        C60872cz czVar = this.f384589m;
        if (czVar != null) {
            czVar.cancel(false);
            this.f384589m = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo116657b(java.lang.Throwable r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f384582f     // Catch:{ all -> 0x001d }
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001b
            io.grpc.i.aj r0 = r3.f384583g     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0012
            r0.mo20122b(r4)     // Catch:{ all -> 0x001d }
        L_0x0012:
            io.grpc.i.aj r0 = r3.f384590n     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001b
            r0.mo20122b(r4)     // Catch:{ all -> 0x001d }
            monitor-exit(r3)
            return
        L_0x001b:
            monitor-exit(r3)
            return
        L_0x001d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.soundsearch.p10660g.C141701j.mo116657b(java.lang.Throwable):void");
    }

    /* JADX WARNING: type inference failed for: r7v20, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01a9 A[LOOP:0: B:4:0x0024->B:37:0x01a9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01fc  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116658c(java.io.InputStream r20, p3186j$.time.Duration r21) {
        /*
            r19 = this;
            r1 = r19
            com.google.android.apps.search.soundsearch.g.e r0 = new com.google.android.apps.search.soundsearch.g.e
            r0.<init>(r1)
            com.google.p4125ay.C54646d.m87517d(r0)
            java.lang.String r0 = "sound_search_fingerprinter_jni_lib"
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ UnsatisfiedLinkError -> 0x0226 }
            com.google.p4125ay.C54646d.m87516c(r0, r3)     // Catch:{ UnsatisfiedLinkError -> 0x0226 }
            com.google.common.f.e r0 = com.google.android.apps.search.soundsearch.p10655d.C141651a.f384472a
            int r3 = com.google.android.apps.search.soundsearch.p10655d.C141651a.m229868a(r21)
            byte[] r4 = new byte[r3]
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r4)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r5.order(r0)
            r6 = 0
        L_0x0024:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f384582f
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0225
            io.grpc.i.aj r0 = r1.f384583g
            r0.getClass()
            int r0 = com.google.android.apps.search.soundsearch.p10655d.C141651a.f384473b
            int r0 = r6 - r0
            int r7 = com.google.android.apps.search.soundsearch.p10655d.C141651a.f384475d
            int r0 = r0 + r7
            int r0 = java.lang.Math.max(r0, r2)
            int r7 = com.google.android.apps.search.soundsearch.p10655d.C141651a.f384474c
            int r7 = r7 + r0
            r8 = 0
            if (r7 <= r3) goto L_0x0057
            com.google.common.f.e r0 = com.google.android.apps.search.soundsearch.p10655d.C141651a.f384472a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r7 = "Exceeds max duration %s"
            r9 = 41774(0xa32e, float:5.8538E-41)
            r10 = r21
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r9)).mo56389s(r7, r10)
            r9 = r20
        L_0x0054:
            r11 = r8
            goto L_0x00fc
        L_0x0057:
            r10 = r21
            int r7 = r7 - r6
            r9 = r20
            int r11 = com.google.common.p4541l.C59332o.m92210a(r9, r4, r6, r7)     // Catch:{ IOException -> 0x00eb }
            com.google.common.f.e r12 = com.google.android.apps.search.soundsearch.p10655d.C141651a.f384472a     // Catch:{ IOException -> 0x00eb }
            com.google.common.f.x r12 = r12.mo56224b()     // Catch:{ IOException -> 0x00eb }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ IOException -> 0x00eb }
            r13 = 41770(0xa32a, float:5.8532E-41)
            com.google.common.f.x r12 = r12.mo56372aa(r13)     // Catch:{ IOException -> 0x00eb }
            r13 = r12
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ IOException -> 0x00eb }
            java.lang.String r14 = "%s: To read %d bytes. Ended read %d bytes into offset %d."
            java.lang.Thread r12 = java.lang.Thread.currentThread()     // Catch:{ IOException -> 0x00eb }
            java.lang.String r15 = r12.getName()     // Catch:{ IOException -> 0x00eb }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00eb }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x00eb }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x00eb }
            r13.mo56360M(r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x00eb }
            if (r11 == r7) goto L_0x00ac
            com.google.common.f.e r0 = com.google.android.apps.search.soundsearch.p10655d.C141651a.f384472a     // Catch:{ IOException -> 0x00eb }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ IOException -> 0x00eb }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IOException -> 0x00eb }
            r7 = 41773(0xa32d, float:5.8536E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r7)     // Catch:{ IOException -> 0x00eb }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IOException -> 0x00eb }
            java.lang.String r7 = "%s: stream closed."
            java.lang.Thread r11 = java.lang.Thread.currentThread()     // Catch:{ IOException -> 0x00eb }
            java.lang.String r11 = r11.getName()     // Catch:{ IOException -> 0x00eb }
            r0.mo56389s(r7, r11)     // Catch:{ IOException -> 0x00eb }
            goto L_0x0054
        L_0x00ac:
            int r6 = r6 + r11
            com.google.common.f.e r7 = com.google.android.apps.search.soundsearch.p10655d.C141651a.f384472a     // Catch:{ IOException -> 0x00eb }
            com.google.common.f.x r7 = r7.mo56224b()     // Catch:{ IOException -> 0x00eb }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ IOException -> 0x00eb }
            r11 = 41771(0xa32b, float:5.8534E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r11)     // Catch:{ IOException -> 0x00eb }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ IOException -> 0x00eb }
            java.lang.String r11 = "%s: Total read so far %d bytes (%.1f seconds)."
            java.lang.Thread r12 = java.lang.Thread.currentThread()     // Catch:{ IOException -> 0x00eb }
            java.lang.String r12 = r12.getName()     // Catch:{ IOException -> 0x00eb }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x00eb }
            float r14 = (float) r6     // Catch:{ IOException -> 0x00eb }
            r15 = 1182400512(0x467a0000, float:16000.0)
            float r14 = r14 / r15
            r15 = 1073741824(0x40000000, float:2.0)
            float r14 = r14 / r15
            java.lang.Float r14 = java.lang.Float.valueOf(r14)     // Catch:{ IOException -> 0x00eb }
            r7.mo56359L(r11, r12, r13, r14)     // Catch:{ IOException -> 0x00eb }
            int r7 = com.google.android.apps.search.soundsearch.p10655d.C141651a.f384474c
            int r7 = r7 / 2
            short[] r11 = new short[r7]
            r5.position(r0)
            java.nio.ShortBuffer r0 = r5.asShortBuffer()
            r0.get(r11, r2, r7)
            goto L_0x00fc
        L_0x00eb:
            r0 = move-exception
            com.google.common.f.e r7 = com.google.android.apps.search.soundsearch.p10655d.C141651a.f384472a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r11 = "Exception while reading from stream."
            r12 = 41772(0xa32c, float:5.8535E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r0)).mo56372aa(r12)).mo56386p(r11)
            goto L_0x0054
        L_0x00fc:
            r0 = 1
            if (r11 != 0) goto L_0x0101
            goto L_0x019e
        L_0x0101:
            com.google.audio.ambientmusic.d r7 = com.google.audio.ambientmusic.C54575d.f143292d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.audio.ambientmusic.c r7 = (com.google.audio.ambientmusic.C54574c) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.audio.ambientmusic.d r12 = (com.google.audio.ambientmusic.C54575d) r12
            int r13 = r12.f143294a
            r13 = r13 | r0
            r12.f143294a = r13
            r13 = 16000(0x3e80, float:2.2421E-41)
            r12.f143295b = r13
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.audio.ambientmusic.d r12 = (com.google.audio.ambientmusic.C54575d) r12
            int r13 = r12.f143294a
            r13 = r13 | 2
            r12.f143294a = r13
            r12.f143296c = r2
            com.google.protobuf.bv r7 = r7.build()
            com.google.audio.ambientmusic.d r7 = (com.google.audio.ambientmusic.C54575d) r7
            com.google.audio.ambientmusic.f r7 = com.google.audio.ambientmusic.SoundSearchFingerprinter.m87489a(r11, r7)
            if (r7 != 0) goto L_0x0135
            goto L_0x019e
        L_0x0135:
            com.google.audio.b.a.d r8 = com.google.audio.p4107b.p4108a.C54581d.f143303b
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.audio.b.a.c r8 = (com.google.audio.p4107b.p4108a.C54580c) r8
            com.google.protobuf.cq r7 = r7.f143299a
            java.util.Iterator r7 = r7.iterator()
        L_0x0143:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x0197
            java.lang.Object r11 = r7.next()
            com.google.audio.ambientmusic.b r11 = (com.google.audio.ambientmusic.C54573b) r11
            com.google.audio.b.a.b r12 = com.google.audio.p4107b.p4108a.C54579b.f143300b
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.audio.b.a.a r12 = (com.google.audio.p4107b.p4108a.C54578a) r12
            com.google.protobuf.cg r11 = r11.f143291a
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.audio.b.a.b r13 = (com.google.audio.p4107b.p4108a.C54579b) r13
            com.google.protobuf.cg r14 = r13.f143302a
            boolean r15 = r14.mo58948c()
            if (r15 != 0) goto L_0x016e
            com.google.protobuf.cg r14 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62960cg) r14)
            r13.f143302a = r14
        L_0x016e:
            com.google.protobuf.cg r13 = r13.f143302a
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r11, (java.util.List) r13)
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.audio.b.a.d r11 = (com.google.audio.p4107b.p4108a.C54581d) r11
            com.google.protobuf.bv r12 = r12.build()
            com.google.audio.b.a.b r12 = (com.google.audio.p4107b.p4108a.C54579b) r12
            r12.getClass()
            com.google.protobuf.cq r13 = r11.f143305a
            boolean r14 = r13.mo58948c()
            if (r14 != 0) goto L_0x0191
            com.google.protobuf.cq r13 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r13)
            r11.f143305a = r13
        L_0x0191:
            com.google.protobuf.cq r11 = r11.f143305a
            r11.add(r12)
            goto L_0x0143
        L_0x0197:
            com.google.protobuf.bv r7 = r8.build()
            r8 = r7
            com.google.audio.b.a.d r8 = (com.google.audio.p4107b.p4108a.C54581d) r8
        L_0x019e:
            if (r8 == 0) goto L_0x01fc
            com.google.protobuf.cq r7 = r8.f143305a
            int r7 = r7.size()
            if (r7 != 0) goto L_0x01a9
            goto L_0x01fc
        L_0x01a9:
            com.google.speech.h.j r7 = com.google.speech.p5208h.C66676j.f181378c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.speech.h.i r7 = (com.google.speech.p5208h.C66675i) r7
            com.google.protobuf.z r11 = r8.toByteString()
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.speech.h.j r12 = (com.google.speech.p5208h.C66676j) r12
            r11.getClass()
            int r13 = r12.f181382a
            r0 = r0 | r13
            r12.f181382a = r0
            r12.f181383b = r11
            com.google.protobuf.bv r0 = r7.build()
            com.google.speech.h.j r0 = (com.google.speech.p5208h.C66676j) r0
            io.grpc.i.aj r7 = r1.f384583g
            com.google.speech.h.ce r11 = com.google.speech.p5208h.C66607ce.f181191f
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.speech.h.cd r11 = (com.google.speech.p5208h.C66606cd) r11
            com.google.protobuf.bt r12 = com.google.speech.p5208h.C66676j.f181379d
            r11.mo58885m(r12, r0)
            com.google.protobuf.bv r0 = r11.build()
            com.google.speech.h.ce r0 = (com.google.speech.p5208h.C66607ce) r0
            com.google.android.apps.search.soundsearch.g.b.b r7 = (com.google.android.apps.search.soundsearch.p10660g.p10662b.C141687b) r7
            r7.mo20123c(r0)
            com.google.common.f.e r0 = f384577a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.protobuf.cq r7 = r8.f143305a
            int r7 = r7.size()
            r8 = 41791(0xa33f, float:5.8562E-41)
            java.lang.String r11 = "Sent %d fingerprint(s)."
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r8)).mo56387q(r11, r7)
            goto L_0x0024
        L_0x01fc:
            io.grpc.i.aj r2 = r1.f384583g
            com.google.speech.h.ce r3 = com.google.speech.p5208h.C66607ce.f181191f
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.speech.h.cd r3 = (com.google.speech.p5208h.C66606cd) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.speech.h.ce r4 = (com.google.speech.p5208h.C66607ce) r4
            int r5 = r4.f181193a
            r5 = r5 | 8
            r4.f181193a = r5
            r4.f181197e = r0
            com.google.protobuf.bv r0 = r3.build()
            com.google.speech.h.ce r0 = (com.google.speech.p5208h.C66607ce) r0
            com.google.android.apps.search.soundsearch.g.b.b r2 = (com.google.android.apps.search.soundsearch.p10660g.p10662b.C141687b) r2
            r2.mo20123c(r0)
            io.grpc.i.aj r0 = r1.f384583g
            r0.mo20121a()
        L_0x0225:
            return
        L_0x0226:
            r0 = move-exception
            com.google.common.f.e r2 = f384577a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Failed to find the JNI lib"
            r4 = 41792(0xa340, float:5.8563E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
            r1.mo116657b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.soundsearch.p10660g.C141701j.mo116658c(java.io.InputStream, j$.time.Duration):void");
    }

    /* renamed from: d */
    public final synchronized void mo116659d(InputStream inputStream, Duration duration) {
        mo116660e(inputStream, duration, 4);
    }

    /* renamed from: e */
    public final synchronized void mo116660e(InputStream inputStream, Duration duration, int i) {
        C60870cx cxVar;
        C60870cx cxVar2;
        if (this.f384582f.get()) {
            ((C59052c) ((C59052c) f384577a.mo56225c()).mo56372aa(41795)).mo56386p("#closeNetworkIfNeeded called before #startListening");
            return;
        }
        if (this.f384590n == null) {
            if (this.f384583g == null) {
                this.f384589m = this.f384578b.mo29164d(C47810es.m84977q(new C141695d(this)), duration.getSeconds(), TimeUnit.SECONDS);
                C141700i iVar = new C141700i(this);
                this.f384590n = iVar;
                C66652ds dsVar = this.f384585i;
                C70334de deVar = new C70334de();
                deVar.mo62033h(new C70290cs("X-Goog-Api-Key", C70334de.f187481c), "AIzaSyDbHU30I-v5OpOJm1-uff09-NJbd6I8InU");
                deVar.mo62033h(new C70290cs("X-Android-Package", C70334de.f187481c), "com.google.android.googlequicksearchbox");
                deVar.mo62033h(new C70290cs("X-Android-Cert", C70334de.f187481c), "58E1C4133F7441EC3D2C270270A14802DA47BA0E");
                this.f384583g = new C141687b(((C66652ds) ((C66652ds) dsVar.mo62576o(new C70879r(deVar))).mo62577p(C61409d.f166071a, new C61412g())).mo59701b(iVar));
                if (this.f384586j.isPresent()) {
                    cxVar = C60856cj.m92908q(this.f384587k.mo51025b((AccountId) this.f384586j.get()), 2, TimeUnit.SECONDS, this.f384578b);
                } else {
                    cxVar = C60866ct.f164955a;
                }
                C60870cx cxVar3 = cxVar;
                if (this.f384586j.isPresent()) {
                    cxVar2 = this.f384588l.mo50246c((AccountId) this.f384586j.get());
                } else {
                    cxVar2 = C60866ct.f164955a;
                }
                C60870cx cxVar4 = cxVar2;
                C60870cx a = C47638k.m84751b(cxVar3, cxVar4).mo51520a(new C141692c(this, cxVar4, cxVar3, i, inputStream, duration), this.f384584h);
                C141697f fVar = new C141697f(this);
                C60856cj.m92911t(a, C47810es.m84974n(fVar), this.f384578b);
                return;
            }
        }
        ((C59052c) ((C59052c) f384577a.mo56225c()).mo56372aa(41794)).mo56386p("#startListening called twice");
    }
}
