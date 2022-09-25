package com.google.android.apps.gsa.staticplugins.p8793w.p8815g;

import android.content.Context;
import com.google.android.apps.gsa.p8889z.p8893c.p8896c.C118872a;
import com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.libraries.p590as.p591a.C10771e;
import com.google.android.libraries.p590as.p591a.C10772f;
import com.google.android.libraries.p590as.p591a.C10778l;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.common.base.C58833ax;
import com.google.common.p4541l.C59337t;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;
import com.google.protobuf.C63088z;
import com.google.speech.recognizer.p5233a.C67451at;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.g.f */
/* compiled from: PG */
public final class C117865f implements C57981b {

    /* renamed from: a */
    public final Object f327106a = new Object();

    /* renamed from: b */
    private final C118872a f327107b;

    /* renamed from: c */
    private final C37360ay f327108c;

    /* renamed from: d */
    private final C67451at f327109d;

    /* renamed from: e */
    private final C67451at f327110e;

    /* renamed from: f */
    private final Context f327111f;

    /* renamed from: g */
    private final C86124t f327112g;

    /* renamed from: h */
    private final byte[] f327113h;

    /* renamed from: i */
    private final C60887da f327114i;

    /* renamed from: j */
    private final C85700a f327115j;

    /* renamed from: k */
    private InputStream f327116k;

    /* renamed from: l */
    private InputStream f327117l;

    /* renamed from: m */
    private C117864e f327118m;

    /* renamed from: n */
    private C60870cx f327119n;

    /* renamed from: o */
    private boolean f327120o = false;

    /* renamed from: p */
    private int f327121p = 0;

    public C117865f(C118872a aVar, C37360ay ayVar, C67451at atVar, C67451at atVar2, byte[] bArr, C60887da daVar, Context context, C86124t tVar, C85700a aVar2) {
        this.f327107b = aVar;
        this.f327108c = ayVar;
        this.f327109d = atVar;
        this.f327110e = atVar2;
        this.f327113h = bArr;
        this.f327114i = daVar;
        this.f327111f = context;
        this.f327112g = tVar;
        this.f327115j = aVar2;
    }

    /* renamed from: c */
    public final void mo103462c(boolean z, Throwable th) {
        synchronized (this.f327106a) {
            this.f327120o = true;
            InputStream inputStream = this.f327117l;
            InputStream inputStream2 = this.f327116k;
            C59337t.m92221a(inputStream);
            C59337t.m92221a(inputStream2);
            C117864e eVar = this.f327118m;
            if (eVar != null) {
                if (th != null) {
                    eVar.mo54585e(th);
                } else {
                    eVar.mo54584d(z);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r5.f327121p <= 100) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        r6 = (com.google.common.p4552o.C59582aj) com.google.common.p4552o.C59687cb.f160034bf.createBuilder();
        r7 = r5.f327121p;
        r6.copyOnWrite();
        r8 = (com.google.common.p4552o.C59687cb) r6.instance;
        r8.f160062a |= 128;
        r8.f160131l = r7;
        r5.f327115j.mo79323e(com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_AUDIO_SENT_TO_S3, 0, (com.google.common.p4552o.C59687cb) r6.build());
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103463d(java.io.InputStream r6, byte[] r7, boolean r8) {
        /*
            r5 = this;
        L_0x0000:
            r0 = 0
            int r1 = r7.length     // Catch:{ a -> 0x008c, c -> 0x0082, IOException -> 0x0078 }
            int r1 = com.google.common.p4541l.C59332o.m92210a(r6, r7, r0, r1)     // Catch:{ a -> 0x008c, c -> 0x0082, IOException -> 0x0078 }
            r2 = 100
            if (r1 > 0) goto L_0x0037
            int r6 = r5.f327121p     // Catch:{ d -> 0x0096 }
            if (r6 <= r2) goto L_0x0036
            com.google.common.o.cb r6 = com.google.common.p4552o.C59687cb.f160034bf     // Catch:{ d -> 0x0096 }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ d -> 0x0096 }
            com.google.common.o.aj r6 = (com.google.common.p4552o.C59582aj) r6     // Catch:{ d -> 0x0096 }
            int r7 = r5.f327121p     // Catch:{ d -> 0x0096 }
            r6.copyOnWrite()     // Catch:{ d -> 0x0096 }
            com.google.protobuf.bv r8 = r6.instance     // Catch:{ d -> 0x0096 }
            com.google.common.o.cb r8 = (com.google.common.p4552o.C59687cb) r8     // Catch:{ d -> 0x0096 }
            int r1 = r8.f160062a     // Catch:{ d -> 0x0096 }
            r1 = r1 | 128(0x80, float:1.794E-43)
            r8.f160062a = r1     // Catch:{ d -> 0x0096 }
            r8.f160131l = r7     // Catch:{ d -> 0x0096 }
            com.google.protobuf.bv r6 = r6.build()     // Catch:{ d -> 0x0096 }
            com.google.common.o.cb r6 = (com.google.common.p4552o.C59687cb) r6     // Catch:{ d -> 0x0096 }
            com.google.android.apps.gsa.search.core.carassistant.c.a r7 = r5.f327115j     // Catch:{ d -> 0x0096 }
            com.google.android.apps.gsa.shared.logger.b.ae r8 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_AUDIO_SENT_TO_S3     // Catch:{ d -> 0x0096 }
            r1 = 0
            r7.mo79323e(r8, r1, r6)     // Catch:{ d -> 0x0096 }
        L_0x0036:
            return
        L_0x0037:
            java.lang.Object r3 = r5.f327106a     // Catch:{ d -> 0x0096 }
            monitor-enter(r3)     // Catch:{ d -> 0x0096 }
            com.google.android.apps.gsa.staticplugins.w.g.e r4 = r5.f327118m     // Catch:{ all -> 0x0075 }
            if (r4 == 0) goto L_0x006e
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.f155044c     // Catch:{ all -> 0x0075 }
            boolean r4 = r4.get()     // Catch:{ all -> 0x0075 }
            if (r4 != 0) goto L_0x0047
            goto L_0x006e
        L_0x0047:
            if (r8 == 0) goto L_0x0053
            com.google.android.apps.gsa.staticplugins.w.g.e r2 = r5.f327118m     // Catch:{ all -> 0x0075 }
            com.google.speech.h.ce r1 = com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a.m197406d(r7, r1)     // Catch:{ all -> 0x0075 }
            r2.mo54583c(r1)     // Catch:{ all -> 0x0075 }
            goto L_0x006c
        L_0x0053:
            int r4 = r5.f327121p     // Catch:{ all -> 0x0075 }
            if (r4 > r2) goto L_0x005e
            com.google.android.apps.gsa.search.core.carassistant.c.a r2 = r5.f327115j     // Catch:{ all -> 0x0075 }
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ASSISTANT_AUTO_AUDIO_SENT_TO_S3_STREAM_BEGIN     // Catch:{ all -> 0x0075 }
            r2.mo79322d(r4)     // Catch:{ all -> 0x0075 }
        L_0x005e:
            int r2 = r5.f327121p     // Catch:{ all -> 0x0075 }
            int r2 = r2 + r1
            r5.f327121p = r2     // Catch:{ all -> 0x0075 }
            com.google.android.apps.gsa.staticplugins.w.g.e r2 = r5.f327118m     // Catch:{ all -> 0x0075 }
            com.google.speech.h.ce r1 = com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a.m197404b(r7, r1)     // Catch:{ all -> 0x0075 }
            r2.mo54583c(r1)     // Catch:{ all -> 0x0075 }
        L_0x006c:
            monitor-exit(r3)     // Catch:{ all -> 0x0075 }
            goto L_0x0000
        L_0x006e:
            r6 = 1
            r7 = 0
            r5.mo103462c(r6, r7)     // Catch:{ all -> 0x0075 }
            monitor-exit(r3)     // Catch:{ all -> 0x0075 }
            return
        L_0x0075:
            r6 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0075 }
            throw r6     // Catch:{ d -> 0x0096 }
        L_0x0078:
            r6 = move-exception
            com.google.android.apps.gsa.shared.q.d r7 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ d -> 0x0096 }
            r8 = 393267(0x60033, float:5.51084E-40)
            r7.<init>((java.lang.Throwable) r6, (int) r8)     // Catch:{ d -> 0x0096 }
            throw r7     // Catch:{ d -> 0x0096 }
        L_0x0082:
            r6 = move-exception
            com.google.android.apps.gsa.shared.q.d r7 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ d -> 0x0096 }
            r8 = 393269(0x60035, float:5.51087E-40)
            r7.<init>((java.lang.Throwable) r6, (int) r8)     // Catch:{ d -> 0x0096 }
            throw r7     // Catch:{ d -> 0x0096 }
        L_0x008c:
            r6 = move-exception
            com.google.android.apps.gsa.shared.q.d r7 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ d -> 0x0096 }
            r8 = 393268(0x60034, float:5.51086E-40)
            r7.<init>((java.lang.Throwable) r6, (int) r8)     // Catch:{ d -> 0x0096 }
            throw r7     // Catch:{ d -> 0x0096 }
        L_0x0096:
            r6 = move-exception
            r5.mo103462c(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8793w.p8815g.C117865f.mo103463d(java.io.InputStream, byte[], boolean):void");
    }

    /* renamed from: jJ */
    public final C60870cx mo20440jJ(C57974a aVar) {
        C117864e eVar = new C117864e(this, aVar);
        aVar.mo20338d(eVar);
        synchronized (this.f327106a) {
            if (this.f327120o) {
                eVar.mo21018g();
                C57979e eVar2 = eVar.f155043b;
                return eVar2;
            } else if (this.f327118m != null) {
                eVar.mo54585e(new UnsupportedOperationException("AudioStreamSource is an one shot source."));
                C57979e eVar3 = eVar.f155043b;
                return eVar3;
            } else {
                this.f327118m = eVar;
                try {
                    InputStream a = this.f327107b.mo91302a();
                    int bitCount = Integer.bitCount(this.f327108c.f99229d);
                    C10772f fVar = new C10772f();
                    fVar.mo19257g(this.f327109d);
                    fVar.f35766b = C58833ax.m90834k(Integer.valueOf(this.f327108c.f99228c));
                    fVar.f35767c = C58833ax.m90834k(Integer.valueOf(bitCount));
                    if (this.f327109d == C67451at.OGG_OPUS) {
                        C10778l.m25802a(this.f327111f);
                        fVar.f35765a = C58833ax.m90834k(Integer.valueOf((int) C10771e.m25765b(this.f327112g.mo79743a(C90082eg.f250029cm), bitCount)));
                    }
                    this.f327117l = C10771e.m25768e(a, fVar.mo19268j());
                    byte[] h = C10771e.m25771h(this.f327109d);
                    InputStream inputStream = this.f327117l;
                    if (this.f327113h != null) {
                        if (this.f327110e == C67451at.OGG_OPUS) {
                            C10778l.m25802a(this.f327111f);
                        }
                        byte[] bArr = this.f327113h;
                        bArr.getClass();
                        InputStream m = C63088z.m96139A(bArr).mo59041m();
                        C10772f fVar2 = new C10772f();
                        fVar2.mo19257g(this.f327110e);
                        fVar2.f35766b = C58833ax.m90834k(Integer.valueOf(this.f327108c.f99228c));
                        fVar2.f35767c = C58833ax.m90834k(Integer.valueOf(Integer.bitCount(this.f327108c.f99229d)));
                        fVar2.f35765a = C58833ax.m90834k(24000);
                        this.f327116k = C10771e.m25768e(m, fVar2.mo19268j());
                        byte[] h2 = C10771e.m25771h(this.f327110e);
                        this.f327119n = this.f327114i.mo19399b(new C117861b(this, this.f327116k, h2, inputStream, h));
                    } else {
                        this.f327119n = this.f327114i.mo19399b(new C117862c(this, inputStream, h));
                    }
                    C60856cj.m92911t(this.f327119n, new C117863d(this), this.f327114i);
                } catch (IOException e) {
                    mo103462c(false, e);
                }
            }
        }
        return eVar.f155043b;
    }

    /* renamed from: jK */
    public final void mo20388jK() {
        synchronized (this.f327106a) {
            this.f327120o = true;
            C60870cx cxVar = this.f327119n;
            if (cxVar != null) {
                cxVar.cancel(true);
            }
            C117864e eVar = this.f327118m;
            if (eVar != null && eVar.f155044c.get()) {
                this.f327118m.mo21018g();
            }
        }
    }
}
