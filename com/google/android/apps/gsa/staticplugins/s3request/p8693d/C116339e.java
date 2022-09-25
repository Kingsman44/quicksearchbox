package com.google.android.apps.gsa.staticplugins.s3request.p8693d;

import android.content.Context;
import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.apps.gsa.staticplugins.s3request.p8690a.C116249ad;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p590as.p591a.C10769c;
import com.google.android.libraries.p590as.p591a.C10771e;
import com.google.android.libraries.p590as.p591a.C10772f;
import com.google.android.libraries.p590as.p591a.C10778l;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59337t;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;
import com.google.speech.recognizer.p5233a.C67451at;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.d.e */
/* compiled from: PG */
public final class C116339e implements C57981b {

    /* renamed from: d */
    private static final C59071e f322532d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.s3request.d.e");

    /* renamed from: a */
    public final Object f322533a = new Object();

    /* renamed from: b */
    public final Query f322534b;

    /* renamed from: c */
    public final C92460b f322535c;

    /* renamed from: e */
    private final C22871g f322536e;

    /* renamed from: f */
    private final C58833ax f322537f;

    /* renamed from: g */
    private final u f322538g;

    /* renamed from: h */
    private final C90021c f322539h;

    /* renamed from: i */
    private final Context f322540i;

    /* renamed from: j */
    private final C58833ax f322541j;

    /* renamed from: k */
    private InputStream f322542k;

    /* renamed from: l */
    private InputStream f322543l;

    /* renamed from: m */
    private C116338d f322544m;

    /* renamed from: n */
    private C60870cx f322545n;

    /* renamed from: o */
    private boolean f322546o = false;

    /* renamed from: p */
    private int f322547p = 0;

    /* renamed from: q */
    private boolean f322548q = true;

    /* renamed from: r */
    private final C91123v f322549r;

    public C116339e(Query query, C90021c cVar, C92460b bVar, C22871g gVar, C58833ax axVar, u uVar, Context context, C58833ax axVar2, C91123v vVar) {
        this.f322534b = query;
        this.f322539h = cVar;
        this.f322535c = bVar;
        this.f322536e = gVar;
        this.f322537f = axVar;
        this.f322538g = uVar;
        this.f322540i = context;
        this.f322541j = axVar2;
        this.f322549r = vVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final InputStream mo102641c(InputStream inputStream, C67451at atVar, int i, int i2) {
        C10778l.m25802a(this.f322540i);
        C10772f fVar = new C10772f();
        fVar.mo19257g(atVar);
        fVar.f35766b = C58833ax.m90834k(Integer.valueOf(i));
        fVar.f35767c = C58833ax.m90834k(Integer.valueOf(i2));
        fVar.f35765a = C58833ax.m90834k(Integer.valueOf((int) C10771e.m25765b(this.f322539h.mo79743a(C90082eg.f250029cm), i2)));
        return C10771e.m25768e(inputStream, fVar.mo19268j());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo102642d(boolean z, Throwable th) {
        synchronized (this.f322533a) {
            this.f322546o = true;
            InputStream inputStream = this.f322543l;
            InputStream inputStream2 = this.f322542k;
            C59337t.m92221a(inputStream);
            C59337t.m92221a(inputStream2);
            C116338d dVar = this.f322544m;
            if (dVar != null) {
                if (th != null) {
                    dVar.mo54585e(th);
                } else {
                    dVar.mo54584d(z);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.f322547p <= 100) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) f322532d.mo56224b()).mo56372aa(31780)).mo56387q("Audio size: %d bytes", r6.f322547p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r6.f322541j.mo56113h() == false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r6.f322534b.mo84412cs() != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r6.f322549r.mo85390b() == false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r7 = (com.google.common.p4552o.C59582aj) com.google.common.p4552o.C59687cb.f160034bf.createBuilder();
        r8 = r6.f322547p;
        r7.copyOnWrite();
        r9 = (com.google.common.p4552o.C59687cb) r7.instance;
        r9.f160062a |= 128;
        r9.f160131l = r8;
        ((com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a) r6.f322541j.mo56107c()).mo79323e(com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_AUDIO_SENT_TO_S3, 0, (com.google.common.p4552o.C59687cb) r7.build());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00de, code lost:
        mo102642d(true, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021 A[EDGE_INSN: B:12:0x0021->B:13:? ?: BREAK  , SYNTHETIC, Splitter:B:12:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086 A[Catch:{ a -> 0x0108, c -> 0x00fe, b -> 0x00f4, IOException -> 0x00ea, d -> 0x0112 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102643e(java.io.InputStream r7, byte[] r8, boolean r9) {
        /*
            r6 = this;
            r0 = 0
            com.google.android.apps.gsa.shared.m.c r1 = r6.f322539h     // Catch:{ all -> 0x0126 }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250513k     // Catch:{ all -> 0x0126 }
            boolean r1 = r1.mo79746e(r2)     // Catch:{ all -> 0x0126 }
            if (r1 == 0) goto L_0x0019
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x0126 }
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x0126 }
            r2 = -19
            android.os.Process.setThreadPriority(r2)     // Catch:{ all -> 0x00e8 }
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            int r2 = r8.length     // Catch:{ a -> 0x0108, c -> 0x00fe, b -> 0x00f4, IOException -> 0x00ea }
            int r2 = com.google.common.p4541l.C59332o.m92210a(r7, r8, r0, r2)     // Catch:{ a -> 0x0108, c -> 0x00fe, b -> 0x00f4, IOException -> 0x00ea }
            if (r2 > 0) goto L_0x0086
            int r7 = r6.f322547p     // Catch:{ d -> 0x0112 }
            r8 = 100
            if (r7 <= r8) goto L_0x0116
            com.google.common.f.e r7 = f322532d     // Catch:{ d -> 0x0112 }
            com.google.common.f.x r7 = r7.mo56224b()     // Catch:{ d -> 0x0112 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ d -> 0x0112 }
            r8 = 31780(0x7c24, float:4.4533E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r8)     // Catch:{ d -> 0x0112 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ d -> 0x0112 }
            java.lang.String r8 = "Audio size: %d bytes"
            int r9 = r6.f322547p     // Catch:{ d -> 0x0112 }
            r7.mo56387q(r8, r9)     // Catch:{ d -> 0x0112 }
            com.google.common.base.ax r7 = r6.f322541j     // Catch:{ d -> 0x0112 }
            boolean r7 = r7.mo56113h()     // Catch:{ d -> 0x0112 }
            if (r7 == 0) goto L_0x0116
            com.google.android.apps.gsa.shared.search.Query r7 = r6.f322534b     // Catch:{ d -> 0x0112 }
            boolean r7 = r7.mo84412cs()     // Catch:{ d -> 0x0112 }
            if (r7 != 0) goto L_0x0056
            com.google.android.apps.gsa.shared.util.v r7 = r6.f322549r     // Catch:{ d -> 0x0112 }
            boolean r7 = r7.mo85390b()     // Catch:{ d -> 0x0112 }
            if (r7 == 0) goto L_0x0116
        L_0x0056:
            com.google.common.o.cb r7 = com.google.common.p4552o.C59687cb.f160034bf     // Catch:{ d -> 0x0112 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ d -> 0x0112 }
            com.google.common.o.aj r7 = (com.google.common.p4552o.C59582aj) r7     // Catch:{ d -> 0x0112 }
            int r8 = r6.f322547p     // Catch:{ d -> 0x0112 }
            r7.copyOnWrite()     // Catch:{ d -> 0x0112 }
            com.google.protobuf.bv r9 = r7.instance     // Catch:{ d -> 0x0112 }
            com.google.common.o.cb r9 = (com.google.common.p4552o.C59687cb) r9     // Catch:{ d -> 0x0112 }
            int r2 = r9.f160062a     // Catch:{ d -> 0x0112 }
            r2 = r2 | 128(0x80, float:1.794E-43)
            r9.f160062a = r2     // Catch:{ d -> 0x0112 }
            r9.f160131l = r8     // Catch:{ d -> 0x0112 }
            com.google.protobuf.bv r7 = r7.build()     // Catch:{ d -> 0x0112 }
            com.google.common.o.cb r7 = (com.google.common.p4552o.C59687cb) r7     // Catch:{ d -> 0x0112 }
            com.google.common.base.ax r8 = r6.f322541j     // Catch:{ d -> 0x0112 }
            java.lang.Object r8 = r8.mo56107c()     // Catch:{ d -> 0x0112 }
            com.google.android.apps.gsa.search.core.carassistant.c.a r8 = (com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a) r8     // Catch:{ d -> 0x0112 }
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_AUDIO_SENT_TO_S3     // Catch:{ d -> 0x0112 }
            r2 = 0
            r8.mo79323e(r9, r2, r7)     // Catch:{ d -> 0x0112 }
            goto L_0x0116
        L_0x0086:
            java.lang.Object r3 = r6.f322533a     // Catch:{ d -> 0x0112 }
            monitor-enter(r3)     // Catch:{ d -> 0x0112 }
            com.google.android.apps.gsa.staticplugins.s3request.d.d r4 = r6.f322544m     // Catch:{ all -> 0x00e5 }
            if (r4 == 0) goto L_0x00de
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.f155044c     // Catch:{ all -> 0x00e5 }
            boolean r4 = r4.get()     // Catch:{ all -> 0x00e5 }
            if (r4 != 0) goto L_0x0096
            goto L_0x00de
        L_0x0096:
            if (r9 == 0) goto L_0x00a2
            com.google.android.apps.gsa.staticplugins.s3request.d.d r4 = r6.f322544m     // Catch:{ all -> 0x00e5 }
            com.google.speech.h.ce r2 = com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a.m197406d(r8, r2)     // Catch:{ all -> 0x00e5 }
            r4.mo54583c(r2)     // Catch:{ all -> 0x00e5 }
            goto L_0x00db
        L_0x00a2:
            com.google.android.apps.gsa.shared.search.Query r4 = r6.f322534b     // Catch:{ all -> 0x00e5 }
            boolean r4 = r4.mo84412cs()     // Catch:{ all -> 0x00e5 }
            if (r4 != 0) goto L_0x00b2
            com.google.android.apps.gsa.shared.util.v r4 = r6.f322549r     // Catch:{ all -> 0x00e5 }
            boolean r4 = r4.mo85390b()     // Catch:{ all -> 0x00e5 }
            if (r4 == 0) goto L_0x00cd
        L_0x00b2:
            boolean r4 = r6.f322548q     // Catch:{ all -> 0x00e5 }
            if (r4 == 0) goto L_0x00cd
            com.google.common.base.ax r4 = r6.f322541j     // Catch:{ all -> 0x00e5 }
            boolean r4 = r4.mo56113h()     // Catch:{ all -> 0x00e5 }
            if (r4 == 0) goto L_0x00cb
            com.google.common.base.ax r4 = r6.f322541j     // Catch:{ all -> 0x00e5 }
            java.lang.Object r4 = r4.mo56107c()     // Catch:{ all -> 0x00e5 }
            com.google.android.apps.gsa.search.core.carassistant.c.a r4 = (com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a) r4     // Catch:{ all -> 0x00e5 }
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_AUDIO_SENT_TO_S3_STREAM_BEGIN     // Catch:{ all -> 0x00e5 }
            r4.mo79322d(r5)     // Catch:{ all -> 0x00e5 }
        L_0x00cb:
            r6.f322548q = r0     // Catch:{ all -> 0x00e5 }
        L_0x00cd:
            int r4 = r6.f322547p     // Catch:{ all -> 0x00e5 }
            int r4 = r4 + r2
            r6.f322547p = r4     // Catch:{ all -> 0x00e5 }
            com.google.android.apps.gsa.staticplugins.s3request.d.d r4 = r6.f322544m     // Catch:{ all -> 0x00e5 }
            com.google.speech.h.ce r2 = com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a.m197404b(r8, r2)     // Catch:{ all -> 0x00e5 }
            r4.mo54583c(r2)     // Catch:{ all -> 0x00e5 }
        L_0x00db:
            monitor-exit(r3)     // Catch:{ all -> 0x00e5 }
            goto L_0x001a
        L_0x00de:
            r7 = 1
            r8 = 0
            r6.mo102642d(r7, r8)     // Catch:{ all -> 0x00e5 }
            monitor-exit(r3)     // Catch:{ all -> 0x00e5 }
            goto L_0x0116
        L_0x00e5:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00e5 }
            throw r7     // Catch:{ d -> 0x0112 }
        L_0x00e8:
            r7 = move-exception
            goto L_0x0124
        L_0x00ea:
            r7 = move-exception
            com.google.android.apps.gsa.shared.q.d r8 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ d -> 0x0112 }
            r9 = 393264(0x60030, float:5.5108E-40)
            r8.<init>((java.lang.Throwable) r7, (int) r9)     // Catch:{ d -> 0x0112 }
            throw r8     // Catch:{ d -> 0x0112 }
        L_0x00f4:
            r7 = move-exception
            com.google.android.apps.gsa.shared.q.d r8 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ d -> 0x0112 }
            r9 = 393275(0x6003b, float:5.51096E-40)
            r8.<init>((java.lang.Throwable) r7, (int) r9)     // Catch:{ d -> 0x0112 }
            throw r8     // Catch:{ d -> 0x0112 }
        L_0x00fe:
            r7 = move-exception
            com.google.android.apps.gsa.shared.q.d r8 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ d -> 0x0112 }
            r9 = 393266(0x60032, float:5.51083E-40)
            r8.<init>((java.lang.Throwable) r7, (int) r9)     // Catch:{ d -> 0x0112 }
            throw r8     // Catch:{ d -> 0x0112 }
        L_0x0108:
            r7 = move-exception
            com.google.android.apps.gsa.shared.q.d r8 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ d -> 0x0112 }
            r9 = 393265(0x60031, float:5.51082E-40)
            r8.<init>((java.lang.Throwable) r7, (int) r9)     // Catch:{ d -> 0x0112 }
            throw r8     // Catch:{ d -> 0x0112 }
        L_0x0112:
            r7 = move-exception
            r6.mo102642d(r0, r7)     // Catch:{ all -> 0x00e8 }
        L_0x0116:
            com.google.android.apps.gsa.shared.m.c r7 = r6.f322539h
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250513k
            boolean r7 = r7.mo79746e(r8)
            if (r7 == 0) goto L_0x0123
            android.os.Process.setThreadPriority(r1)
        L_0x0123:
            return
        L_0x0124:
            r0 = r1
            goto L_0x0127
        L_0x0126:
            r7 = move-exception
        L_0x0127:
            com.google.android.apps.gsa.shared.m.c r8 = r6.f322539h
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250513k
            boolean r8 = r8.mo79746e(r9)
            if (r8 == 0) goto L_0x0134
            android.os.Process.setThreadPriority(r0)
        L_0x0134:
            goto L_0x0136
        L_0x0135:
            throw r7
        L_0x0136:
            goto L_0x0135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.s3request.p8693d.C116339e.mo102643e(java.io.InputStream, byte[], boolean):void");
    }

    /* renamed from: jJ */
    public final C60870cx mo20440jJ(C57974a aVar) {
        int i;
        byte[] h;
        InputStream inputStream;
        C116338d dVar = new C116338d(this, aVar);
        aVar.mo20338d(dVar);
        synchronized (this.f322533a) {
            if (this.f322546o) {
                dVar.mo21018g();
                C57979e eVar = dVar.f155043b;
                return eVar;
            } else if (this.f322544m != null) {
                dVar.mo54585e(new UnsupportedOperationException("AudioStreamSource is an one shot source."));
                C57979e eVar2 = dVar.f155043b;
                return eVar2;
            } else {
                this.f322544m = dVar;
                int bitCount = Integer.bitCount(this.f322535c.mo87190a());
                int f = this.f322535c.mo87195f();
                if (this.f322537f.mo56113h()) {
                    C92460b a = ((C74458k) this.f322537f.mo56107c()).mo70774a();
                    int bitCount2 = Integer.bitCount(a.mo87190a());
                    i = a.mo87195f();
                    bitCount = bitCount2;
                } else {
                    ((C59052c) ((C59052c) f322532d.mo56226d()).mo56372aa(31779)).mo56386p("AudioListeningSessionAdapterOptional is not present");
                    int i2 = C90755l.f253831a;
                    i = f;
                }
                try {
                    if (this.f322537f.mo56113h()) {
                        InputStream c = this.f322538g.c((C74458k) this.f322537f.mo56107c());
                        if (this.f322534b.mo84370cC()) {
                            c = new C10769c(c, "audio/mp4a-latm", i, 2048, 40000, 1);
                        } else if (!this.f322534b.mo84365by()) {
                            c = mo102641c(c, this.f322535c.mo87202n(), i, bitCount);
                        }
                        this.f322543l = c;
                        if (this.f322534b.mo84370cC()) {
                            h = new byte[2048];
                        } else {
                            h = C10771e.m25771h(this.f322535c.mo87202n());
                        }
                        byte[] bArr = h;
                        InputStream inputStream2 = this.f322543l;
                        byte[] F = this.f322535c.mo87188F();
                        if (F == null) {
                            inputStream = null;
                        } else if (this.f322534b.mo84365by()) {
                            inputStream = new ByteArrayInputStream(F);
                        } else {
                            inputStream = mo102641c(new ByteArrayInputStream(F), this.f322535c.mo87203o(), i, bitCount);
                        }
                        this.f322542k = inputStream;
                        if (inputStream != null) {
                            byte[] h2 = C10771e.m25771h(this.f322535c.mo87203o());
                            this.f322545n = this.f322536e.mo28209i(C116249ad.m192802a(this.f322535c, this.f322534b, this.f322537f), "audioStream", new C116335a(this, this.f322542k, h2, inputStream2, bArr));
                        } else {
                            this.f322545n = this.f322536e.mo28201a("audioStream", new C116336b(this, inputStream2, bArr));
                        }
                        this.f322536e.mo28211k(this.f322545n, "audioStream is Done", new C116337c(this));
                    } else {
                        throw new C90457d("AudioListeningSessionAdapter is empty.", (int) C89885b.S3_CREATE_INPUT_STREAM_FAILED_VALUE);
                    }
                } catch (C90457d e) {
                    mo102642d(false, e);
                }
            }
        }
        return dVar.f155043b;
    }

    /* renamed from: jK */
    public final void mo20388jK() {
        synchronized (this.f322533a) {
            this.f322546o = true;
            C60870cx cxVar = this.f322545n;
            if (cxVar != null) {
                cxVar.cancel(true);
            }
            C116338d dVar = this.f322544m;
            if (dVar != null && dVar.f155044c.get()) {
                this.f322544m.mo21018g();
            }
        }
    }
}
