package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6106c;

import com.google.android.apps.gsa.nga.engine.p6011e.C75371a;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80561f;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.p2927f.C37587a;
import com.google.common.base.C58872ci;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.c.y */
/* compiled from: PG */
final class C77541y extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    public static final C58974d f213634a = C58974d.m91136j();

    /* renamed from: l */
    private static final AtomicInteger f213635l = new AtomicInteger();

    /* renamed from: b */
    public final C80561f f213636b;

    /* renamed from: c */
    public final C91142g f213637c;

    /* renamed from: d */
    public final C118843f f213638d;

    /* renamed from: e */
    public final String f213639e;

    /* renamed from: f */
    public final C75371a f213640f;

    /* renamed from: g */
    public final C22871g f213641g;

    /* renamed from: h */
    public final C60870cx f213642h;

    /* renamed from: i */
    public final C77566as f213643i;

    /* renamed from: j */
    public final C77509a f213644j;

    /* renamed from: k */
    public C60870cx f213645k;

    /* renamed from: m */
    private final InputStream f213646m;

    /* renamed from: n */
    private final C37402bg f213647n;

    /* renamed from: o */
    private final C58872ci f213648o;

    /* renamed from: p */
    private final AtomicInteger f213649p = new AtomicInteger();

    /* renamed from: q */
    private final C81459h f213650q;

    /* renamed from: r */
    private boolean f213651r = false;

    public C77541y(C37402bg bgVar, C77566as asVar, C80561f fVar, C58889cz czVar, C77509a aVar, C91142g gVar, C118843f fVar2, C75371a aVar2, C22871g gVar2, C81465n nVar, C22871g gVar3) {
        this.f213647n = bgVar;
        this.f213636b = fVar;
        this.f213637c = gVar;
        this.f213638d = fVar2;
        this.f213640f = aVar2;
        this.f213641g = gVar3;
        this.f213643i = asVar;
        this.f213644j = aVar;
        this.f213645k = C60856cj.m92898g();
        this.f213650q = nVar.mo75095b(gVar2, C77539w.f213632a);
        int andIncrement = f213635l.getAndIncrement();
        this.f213639e = "AudioListeningSessionInputStream_" + andIncrement;
        C60870cx d = bgVar.mo20357d();
        this.f213642h = d;
        this.f213646m = new C37587a(gVar3.mo28209i(d, "[NGA] AudioListeningSessionInputStream.getStartListeningResult", C77540x.f213633a));
        this.f213648o = C58872ci.m90947d(czVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r0.mo56359L("Closing input stream for %s with %d bytes read and id %d", r2, java.lang.Integer.valueOf(r6.f213649p.get()), java.lang.Integer.valueOf(r6.f213636b.f221127b));
        r6.f213647n.mo20354a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r6.f213646m.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        r6.f213638d.mo71747h(r6.f213639e);
        r6.f213644j.mo72593a(r6.f213648o.mo56158a(java.util.concurrent.TimeUnit.MILLISECONDS), r6.f213643i);
        r6.f213645k.cancel(false);
        r6.f213650q.mo75090a(new com.google.common.base.C58835az(r6.f213636b, java.lang.Integer.valueOf(r6.f213649p.get())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ad, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00af, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r0 = (com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) f213634a.mo56224b()).mo56372aa(4291);
        r1 = r6.f213643i.mo72690m();
        r2 = com.google.android.apps.gsa.nga.engine.recognition.C77568au.m124486a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r1 == 0) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f213651r     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r6)     // Catch:{ all -> 0x00b0 }
            return
        L_0x0007:
            r0 = 1
            r6.f213651r = r0     // Catch:{ all -> 0x00b0 }
            monitor-exit(r6)     // Catch:{ all -> 0x00b0 }
            com.google.common.f.a.d r0 = f213634a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            r1 = 4291(0x10c3, float:6.013E-42)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            com.google.android.apps.gsa.nga.engine.recognition.as r1 = r6.f213643i
            int r1 = r1.mo72690m()
            java.lang.String r2 = com.google.android.apps.gsa.nga.engine.recognition.C77568au.m124486a(r1)
            if (r1 == 0) goto L_0x00ae
            java.lang.String r1 = "Closing input stream for %s with %d bytes read and id %d"
            java.util.concurrent.atomic.AtomicInteger r3 = r6.f213649p
            int r3 = r3.get()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.apps.gsa.nga.shared.ae.a.f r4 = r6.f213636b
            int r4 = r4.f221127b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.mo56359L(r1, r2, r3, r4)
            com.google.android.libraries.search.c.bg r0 = r6.f213647n
            r0.mo20354a()
            r0 = 0
            java.io.InputStream r1 = r6.f213646m     // Catch:{ all -> 0x007b }
            r1.close()     // Catch:{ all -> 0x007b }
            com.google.android.apps.gsa.z.a.f r1 = r6.f213638d
            java.lang.String r2 = r6.f213639e
            r1.mo71747h(r2)
            com.google.android.apps.gsa.nga.engine.recognition.a.c.a r1 = r6.f213644j
            com.google.common.base.ci r2 = r6.f213648o
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r2.mo56158a(r3)
            com.google.android.apps.gsa.nga.engine.recognition.as r4 = r6.f213643i
            r1.mo72593a(r2, r4)
            com.google.common.util.concurrent.cx r1 = r6.f213645k
            r1.cancel(r0)
            com.google.android.apps.gsa.nga.shared.s.h r0 = r6.f213650q
            com.google.android.apps.gsa.nga.shared.ae.a.f r1 = r6.f213636b
            java.util.concurrent.atomic.AtomicInteger r2 = r6.f213649p
            int r2 = r2.get()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.common.base.az r3 = new com.google.common.base.az
            r3.<init>(r1, r2)
            r0.mo75090a(r3)
            return
        L_0x007b:
            r1 = move-exception
            com.google.android.apps.gsa.z.a.f r2 = r6.f213638d
            java.lang.String r3 = r6.f213639e
            r2.mo71747h(r3)
            com.google.android.apps.gsa.nga.engine.recognition.a.c.a r2 = r6.f213644j
            com.google.common.base.ci r3 = r6.f213648o
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r3 = r3.mo56158a(r4)
            com.google.android.apps.gsa.nga.engine.recognition.as r5 = r6.f213643i
            r2.mo72593a(r3, r5)
            com.google.common.util.concurrent.cx r2 = r6.f213645k
            r2.cancel(r0)
            com.google.android.apps.gsa.nga.shared.s.h r0 = r6.f213650q
            com.google.android.apps.gsa.nga.shared.ae.a.f r2 = r6.f213636b
            java.util.concurrent.atomic.AtomicInteger r3 = r6.f213649p
            int r3 = r3.get()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.common.base.az r4 = new com.google.common.base.az
            r4.<init>(r2, r3)
            r0.mo75090a(r4)
            throw r1
        L_0x00ae:
            r0 = 0
            throw r0
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00b0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6106c.C77541y.close():void");
    }

    public final int read() {
        int read = this.f213646m.read();
        this.f213649p.addAndGet(read == -1 ? 0 : read);
        return read;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr) {
        int i = 0;
        int read = ((C37587a) this.f213646m).read(bArr, 0, bArr.length);
        AtomicInteger atomicInteger = this.f213649p;
        if (read != -1) {
            i = read;
        }
        atomicInteger.addAndGet(i);
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f213646m.read(bArr, i, i2);
        this.f213649p.addAndGet(read == -1 ? 0 : read);
        return read;
    }
}
