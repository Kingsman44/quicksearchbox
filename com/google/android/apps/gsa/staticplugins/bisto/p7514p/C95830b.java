package com.google.android.apps.gsa.staticplugins.bisto.p7514p;

import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9402f.C124606a;
import com.google.android.libraries.assistant.hotword.C18382s;
import com.google.android.libraries.assistant.hotword.C18385v;
import com.google.android.libraries.assistant.hotword.C18387x;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59331n;
import com.google.speech.micro.GoogleHotwordData;
import com.google.speech.micro.GoogleHotwordRecognizer;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.p.b */
/* compiled from: PG */
public final class C95830b implements C95836h {

    /* renamed from: a */
    public static final C59071e f268347a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.p.b");

    /* renamed from: b */
    public final AtomicInteger f268348b = new AtomicInteger(0);

    /* renamed from: c */
    private final C89656k f268349c;

    /* renamed from: d */
    private final C22871g f268350d;

    /* renamed from: e */
    private final C18385v f268351e;

    /* renamed from: f */
    private final GoogleHotwordRecognizer f268352f;

    /* renamed from: g */
    private final GoogleHotwordData f268353g;

    /* renamed from: h */
    private C18382s f268354h;

    /* renamed from: i */
    private final AtomicReference f268355i = new AtomicReference();

    /* renamed from: j */
    private HotwordResult f268356j = null;

    /* renamed from: k */
    private C18387x f268357k;

    /* renamed from: l */
    private final C124606a f268358l;

    public C95830b(C18385v vVar, GoogleHotwordRecognizer googleHotwordRecognizer, GoogleHotwordData googleHotwordData, C89656k kVar, C124606a aVar, C22871g gVar) {
        this.f268351e = vVar;
        this.f268352f = googleHotwordRecognizer;
        this.f268353g = googleHotwordData;
        this.f268349c = kVar;
        this.f268358l = aVar;
        this.f268350d = gVar;
    }

    /* renamed from: d */
    private static C95837i m158867d(HotwordResult hotwordResult, ByteArrayInputStream byteArrayInputStream, byte[] bArr) {
        if (byteArrayInputStream.available() <= 0) {
            return new C95837i(hotwordResult);
        }
        int length = bArr.length;
        return new C95837i(hotwordResult, Arrays.copyOfRange(bArr, length - byteArrayInputStream.available(), length));
    }

    /* renamed from: e */
    private final void m158868e(boolean z) {
        C59331n nVar = (C59331n) this.f268355i.getAndSet((Object) null);
        if (nVar != null) {
            this.f268350d.mo28212l("write-hotword", new C95829a(this, z, nVar));
        }
    }

    /* renamed from: a */
    public final File mo89799a(int i, boolean z) {
        File a = this.f268358l.mo106557a();
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = true != z ? "reject" : "accept";
        return new File(a, String.format(locale, "%04d-%s.raw", objArr));
    }

    /* renamed from: b */
    public final synchronized void mo89800b() {
        GoogleHotwordRecognizer googleHotwordRecognizer = this.f268352f;
        if (googleHotwordRecognizer != null) {
            googleHotwordRecognizer.reset();
        }
        this.f268356j = null;
        this.f268354h = null;
        this.f268357k = null;
        m158868e(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00eb A[LOOP:0: B:19:0x0061->B:44:0x00eb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00a8 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95837i mo89801c(byte[] r18, int r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            monitor-enter(r17)
            com.google.android.libraries.assistant.hotword.x r0 = r1.f268357k     // Catch:{ all -> 0x013f }
            if (r0 != 0) goto L_0x0011
            com.google.android.libraries.assistant.hotword.v r0 = r1.f268351e     // Catch:{ all -> 0x013f }
            com.google.android.libraries.assistant.hotword.x r0 = r0.mo23895g()     // Catch:{ all -> 0x013f }
            r1.f268357k = r0     // Catch:{ all -> 0x013f }
        L_0x0011:
            com.google.speech.micro.GoogleHotwordData r0 = r1.f268353g     // Catch:{ all -> 0x013f }
            int r11 = r0.idealBufferBytes()     // Catch:{ all -> 0x013f }
            com.google.android.libraries.assistant.hotword.s r0 = r1.f268354h     // Catch:{ all -> 0x013f }
            r12 = 1
            r13 = 2
            if (r0 != 0) goto L_0x0049
            com.google.android.apps.gsa.shared.bisto.k r0 = r1.f268349c     // Catch:{ all -> 0x013f }
            java.lang.String r3 = "bistoRecordAudio"
            boolean r0 = r0.mo83553h(r3)     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x0038
            java.util.concurrent.atomic.AtomicReference r0 = r1.f268355i     // Catch:{ all -> 0x013f }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x013f }
            if (r0 != 0) goto L_0x0038
            java.util.concurrent.atomic.AtomicReference r0 = r1.f268355i     // Catch:{ all -> 0x013f }
            com.google.common.l.n r3 = com.google.common.p4541l.C59332o.m92215f()     // Catch:{ all -> 0x013f }
            r0.set(r3)     // Catch:{ all -> 0x013f }
        L_0x0038:
            com.google.android.libraries.assistant.hotword.s r0 = new com.google.android.libraries.assistant.hotword.s     // Catch:{ all -> 0x013f }
            int r3 = r11 * 1000
            int r3 = r3 / 32000
            int r3 = r3 + 2000
            int r3 = r3 * 32000
            int r3 = r3 / 1000
            r0.<init>(r11, r3, r13, r12)     // Catch:{ all -> 0x013f }
            r1.f268354h = r0     // Catch:{ all -> 0x013f }
        L_0x0049:
            monitor-exit(r17)     // Catch:{ all -> 0x013f }
            java.util.concurrent.atomic.AtomicReference r0 = r1.f268355i
            java.lang.Object r0 = r0.get()
            com.google.common.l.n r0 = (com.google.common.p4541l.C59331n) r0
            if (r0 == 0) goto L_0x0057
            r0.write((byte[]) r2)
        L_0x0057:
            java.io.ByteArrayInputStream r14 = new java.io.ByteArrayInputStream
            r15 = 0
            r0 = r19
            r14.<init>(r2, r15, r0)
            r10 = 0
            r9 = r10
        L_0x0061:
            int r0 = r14.available()
            if (r0 <= 0) goto L_0x00f8
            com.google.android.libraries.assistant.hotword.s r0 = r1.f268354h     // Catch:{ InterruptedException -> 0x00ef, IOException -> 0x008d }
            com.google.android.libraries.assistant.hotword.r r0 = r0.mo23887a(r14)     // Catch:{ InterruptedException -> 0x00ef, IOException -> 0x008d }
            com.google.android.libraries.assistant.hotword.x r3 = r1.f268357k     // Catch:{ InterruptedException -> 0x00ef, IOException -> 0x008d }
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ InterruptedException -> 0x00ef, IOException -> 0x008d }
            byte[] r5 = new byte[r15]     // Catch:{ InterruptedException -> 0x00ef, IOException -> 0x008d }
            r4.<init>(r5)     // Catch:{ InterruptedException -> 0x00ef, IOException -> 0x008d }
            com.google.android.libraries.assistant.hotword.s r5 = r1.f268354h     // Catch:{ InterruptedException -> 0x00ef, IOException -> 0x008d }
            int r6 = r0.f52173a     // Catch:{ InterruptedException -> 0x00ef, IOException -> 0x008d }
            int r7 = r0.f52174b     // Catch:{ InterruptedException -> 0x00ef, IOException -> 0x008d }
            r0 = 32000(0x7d00, float:4.4842E-41)
            r16 = 1
            r8 = r11
            r15 = r9
            r9 = r0
            r10 = r16
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r0 = r3.mo23896a(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ InterruptedException -> 0x00f0, IOException -> 0x008b }
            r9 = r0
            goto L_0x00a6
        L_0x008b:
            r0 = move-exception
            goto L_0x008f
        L_0x008d:
            r0 = move-exception
            r15 = r9
        L_0x008f:
            com.google.common.f.e r3 = f268347a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "BistoHWDetector"
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "IOException over a byte array input stream"
            r5 = 15463(0x3c67, float:2.1668E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            r9 = r15
        L_0x00a6:
            if (r9 == 0) goto L_0x00eb
            r1.f268356j = r9
            int r0 = r9.mo84692j()
            if (r0 != r13) goto L_0x00bc
            boolean r0 = r9.mo84676A()
            if (r0 == 0) goto L_0x00b7
            goto L_0x00bc
        L_0x00b7:
            com.google.android.apps.gsa.staticplugins.bisto.p.i r0 = m158867d(r9, r14, r2)
            return r0
        L_0x00bc:
            com.google.common.f.e r0 = f268347a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "BistoHWDetector"
            r0.mo56378ag(r3, r4)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r3 = 15462(0x3c66, float:2.1667E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            int r3 = r9.mo84692j()
            if (r3 != r13) goto L_0x00dc
            java.lang.String r3 = "WITH"
            goto L_0x00de
        L_0x00dc:
            java.lang.String r3 = "WITHOUT"
        L_0x00de:
            java.lang.String r4 = "Hotword triggered %s speaker verification."
            r0.mo56389s(r4, r3)
            r1.m158868e(r12)
            com.google.android.apps.gsa.staticplugins.bisto.p.i r0 = m158867d(r9, r14, r2)
            return r0
        L_0x00eb:
            r10 = 0
            r15 = 0
            goto L_0x0061
        L_0x00ef:
            r15 = r9
        L_0x00f0:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x00f9
        L_0x00f8:
            r15 = r9
        L_0x00f9:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r15 == 0) goto L_0x0102
            com.google.android.apps.gsa.staticplugins.bisto.p.i r0 = m158867d(r15, r14, r2)
            return r0
        L_0x0102:
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r0 = r1.f268356j
            if (r0 == 0) goto L_0x0121
            com.google.common.f.e r0 = f268347a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "BistoHWDetector"
            r0.mo56378ag(r3, r4)
            java.lang.String r3 = "Last result null; using last non null result"
            r4 = 15461(0x3c65, float:2.1665E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r0 = r1.f268356j
            com.google.android.apps.gsa.staticplugins.bisto.p.i r0 = m158867d(r0, r14, r2)
            return r0
        L_0x0121:
            com.google.common.f.e r0 = f268347a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "BistoHWDetector"
            r0.mo56378ag(r3, r4)
            java.lang.String r3 = "There were never any detector results. available=%d"
            int r4 = r14.available()
            r5 = 15460(0x3c64, float:2.1664E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56387q(r3, r4)
            r3 = 0
            com.google.android.apps.gsa.staticplugins.bisto.p.i r0 = m158867d(r3, r14, r2)
            return r0
        L_0x013f:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x013f }
            goto L_0x0143
        L_0x0142:
            throw r0
        L_0x0143:
            goto L_0x0142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95830b.mo89801c(byte[], int):com.google.android.apps.gsa.staticplugins.bisto.p.i");
    }
}
