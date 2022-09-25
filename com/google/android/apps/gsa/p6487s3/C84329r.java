package com.google.android.apps.gsa.p6487s3;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p408c.p414c.p416b.C8482ay;

/* renamed from: com.google.android.apps.gsa.s3.r */
/* compiled from: PG */
final class C84329r extends C84328q {

    /* renamed from: a */
    private final C84330s f229496a;

    /* renamed from: b */
    private final C8482ay f229497b;

    /* renamed from: c */
    private final String f229498c;

    /* renamed from: d */
    private final C89012aj f229499d;

    /* renamed from: f */
    private final C89061q f229500f;

    /* renamed from: g */
    private final int f229501g;

    /* renamed from: h */
    private final boolean f229502h;

    /* renamed from: i */
    private final C84295m f229503i;

    /* renamed from: j */
    private final int f229504j;

    /* renamed from: k */
    private final C86124t f229505k;

    /* renamed from: l */
    private C60870cx f229506l = null;

    public C84329r(C84330s sVar, C8482ay ayVar, String str, C89012aj ajVar, C89061q qVar, int i, boolean z, C84295m mVar, int i2, C86124t tVar) {
        super("PairHttpDown");
        this.f229496a = sVar;
        this.f229497b = ayVar;
        this.f229498c = str;
        this.f229499d = ajVar;
        this.f229500f = qVar;
        this.f229501g = i;
        this.f229502h = z;
        this.f229503i = mVar;
        this.f229504j = i2;
        this.f229505k = tVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e A[Catch:{ all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092 A[Catch:{ all -> 0x0063 }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m134536f(com.google.android.apps.gsa.shared.p6968aa.C89068x r5) {
        /*
            r4 = this;
            com.google.common.f.e r0 = com.google.android.apps.gsa.p6487s3.C84330s.f229507a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "[Download] starting read"
            r2 = 7196(0x1c1c, float:1.0084E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            r0 = 0
            com.google.android.apps.gsa.s3.a.d r1 = new com.google.android.apps.gsa.s3.a.d     // Catch:{ IOException -> 0x0067, IndexOutOfBoundsException -> 0x0065 }
            com.google.android.apps.gsa.shared.aa.ae r2 = new com.google.android.apps.gsa.shared.aa.ae     // Catch:{ IOException -> 0x0067, IndexOutOfBoundsException -> 0x0065 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x0067, IndexOutOfBoundsException -> 0x0065 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0067, IndexOutOfBoundsException -> 0x0065 }
        L_0x0018:
            r4.mo77835b()     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
            com.google.speech.h.ci r5 = r1.mo77821a()     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
            com.google.android.apps.gsa.s3.s r0 = r4.f229496a     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
            r2 = 2
            boolean r0 = r0.mo77867d(r2)     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
            if (r0 != 0) goto L_0x0036
            com.google.android.apps.gsa.s3.m r5 = r4.f229503i     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
            com.google.android.apps.gsa.shared.speech.a.o r0 = new com.google.android.apps.gsa.shared.speech.a.o     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
            r2 = 65548(0x1000c, float:9.1852E-41)
            r0.<init>(r2)     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
            r5.mo77831a(r0)     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
            goto L_0x0057
        L_0x0036:
            com.google.android.apps.gsa.s3.m r0 = r4.f229503i     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
            r0.mo77833d(r5)     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
            int r0 = r5.f181209b     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
            com.google.speech.h.ch r0 = com.google.speech.p5208h.C66610ch.m97260a(r0)     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
            if (r0 != 0) goto L_0x0045
            com.google.speech.h.ch r0 = com.google.speech.p5208h.C66610ch.IN_PROGRESS     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
        L_0x0045:
            com.google.speech.h.ch r2 = com.google.speech.p5208h.C66610ch.DONE_ERROR     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
            if (r0 == r2) goto L_0x0057
            int r5 = r5.f181209b     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
            com.google.speech.h.ch r5 = com.google.speech.p5208h.C66610ch.m97260a(r5)     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
            if (r5 != 0) goto L_0x0053
            com.google.speech.h.ch r5 = com.google.speech.p5208h.C66610ch.IN_PROGRESS     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
        L_0x0053:
            com.google.speech.h.ch r0 = com.google.speech.p5208h.C66610ch.DONE_SUCCESS     // Catch:{ IOException -> 0x0060, IndexOutOfBoundsException -> 0x005e, all -> 0x005b }
            if (r5 != r0) goto L_0x0018
        L_0x0057:
            com.google.common.p4541l.C59317ae.m92163a(r1)
            return
        L_0x005b:
            r5 = move-exception
            r0 = r1
            goto L_0x00b3
        L_0x005e:
            r5 = move-exception
            goto L_0x0061
        L_0x0060:
            r5 = move-exception
        L_0x0061:
            r0 = r1
            goto L_0x0068
        L_0x0063:
            r5 = move-exception
            goto L_0x00b3
        L_0x0065:
            r5 = move-exception
            goto L_0x0068
        L_0x0067:
            r5 = move-exception
        L_0x0068:
            r4.mo77835b()     // Catch:{ all -> 0x0063 }
            com.google.common.f.e r1 = com.google.android.apps.gsa.p6487s3.C84330s.f229507a     // Catch:{ all -> 0x0063 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x0063 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0063 }
            r2 = 7199(0x1c1f, float:1.0088E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0063 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = "[Download] exception - exit %s"
            java.lang.String r3 = r5.getMessage()     // Catch:{ all -> 0x0063 }
            r1.mo56389s(r2, r3)     // Catch:{ all -> 0x0063 }
            com.google.android.apps.gsa.s3.s r1 = r4.f229496a     // Catch:{ all -> 0x0063 }
            r2 = 3
            r1.mo77867d(r2)     // Catch:{ all -> 0x0063 }
            boolean r1 = r5 instanceof java.io.EOFException     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0092
            r1 = 65573(0x10025, float:9.1887E-41)
            goto L_0x00a5
        L_0x0092:
            boolean r1 = r5 instanceof java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x009a
            r1 = 65574(0x10026, float:9.1889E-41)
            goto L_0x00a5
        L_0x009a:
            boolean r1 = r5 instanceof com.google.protobuf.C62974ct     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x00a2
            r1 = 65575(0x10027, float:9.189E-41)
            goto L_0x00a5
        L_0x00a2:
            r1 = 65550(0x1000e, float:9.1855E-41)
        L_0x00a5:
            com.google.android.apps.gsa.s3.m r2 = r4.f229503i     // Catch:{ all -> 0x0063 }
            com.google.android.apps.gsa.shared.speech.a.o r3 = new com.google.android.apps.gsa.shared.speech.a.o     // Catch:{ all -> 0x0063 }
            r3.<init>((java.lang.Throwable) r5, (int) r1)     // Catch:{ all -> 0x0063 }
            r2.mo77831a(r3)     // Catch:{ all -> 0x0063 }
            com.google.common.p4541l.C59317ae.m92163a(r0)
            return
        L_0x00b3:
            com.google.common.p4541l.C59317ae.m92163a(r0)
            goto L_0x00b8
        L_0x00b7:
            throw r5
        L_0x00b8:
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p6487s3.C84329r.m134536f(com.google.android.apps.gsa.shared.aa.x):void");
    }

    /* renamed from: a */
    public final void mo77834a() {
        super.mo77834a();
        C60870cx cxVar = this.f229506l;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00af, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        r4 = r1.mo82984e();
        r1 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af A[Catch:{ MalformedURLException -> 0x00b6, ak -> 0x00af, d -> 0x00a5, CancellationException -> 0x0082, ExecutionException -> 0x0058, all -> 0x0019 }, ExcHandler: ak (r1v14 'e' com.google.android.apps.gsa.shared.aa.ak A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:7:0x0020] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d0 A[Catch:{ MalformedURLException -> 0x00b6, ak -> 0x00af, d -> 0x00a5, CancellationException -> 0x0082, ExecutionException -> 0x0058, all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77836c() {
        /*
            r8 = this;
            r0 = 0
            com.google.android.apps.gsa.search.core.i.t r1 = r8.f229505k     // Catch:{ all -> 0x0019 }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250513k     // Catch:{ all -> 0x0019 }
            boolean r1 = r1.mo79746e(r2)     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x001c
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x0019 }
            int r0 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x0019 }
            r1 = -19
            android.os.Process.setThreadPriority(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x0019:
            r1 = move-exception
            goto L_0x0147
        L_0x001c:
            r1 = 65571(0x10023, float:9.1885E-41)
            r2 = 0
            com.google.al.c.c.b.ay r3 = r8.f229497b     // Catch:{ MalformedURLException -> 0x00b6, ak -> 0x00af, d -> 0x00a5, CancellationException -> 0x0082, ExecutionException -> 0x0058 }
            com.google.al.c.c.b.ai r3 = r3.f29443b     // Catch:{ MalformedURLException -> 0x00b6, ak -> 0x00af, d -> 0x00a5, CancellationException -> 0x0082, ExecutionException -> 0x0058 }
            if (r3 != 0) goto L_0x0028
            com.google.al.c.c.b.ai r3 = com.google.p395al.p408c.p414c.p416b.C8466ai.f29395g     // Catch:{ MalformedURLException -> 0x00b6, ak -> 0x00af, d -> 0x00a5, CancellationException -> 0x0082, ExecutionException -> 0x0058 }
        L_0x0028:
            java.lang.String r4 = r8.f229498c     // Catch:{ MalformedURLException -> 0x00b6, ak -> 0x00af, d -> 0x00a5, CancellationException -> 0x0082, ExecutionException -> 0x0058 }
            int r5 = r8.f229501g     // Catch:{ MalformedURLException -> 0x00b6, ak -> 0x00af, d -> 0x00a5, CancellationException -> 0x0082, ExecutionException -> 0x0058 }
            boolean r6 = r8.f229502h     // Catch:{ MalformedURLException -> 0x00b6, ak -> 0x00af, d -> 0x00a5, CancellationException -> 0x0082, ExecutionException -> 0x0058 }
            r7 = 38
            com.google.android.apps.gsa.shared.aa.ar r3 = m134531e(r3, r4, r5, r7, r6)     // Catch:{ MalformedURLException -> 0x00b6, ak -> 0x00af, d -> 0x00a5, CancellationException -> 0x0082, ExecutionException -> 0x0058 }
            com.google.android.apps.gsa.shared.aa.aj r4 = r8.f229499d     // Catch:{ MalformedURLException -> 0x00b6, ak -> 0x00af, d -> 0x00a5, CancellationException -> 0x0082, ExecutionException -> 0x0058 }
            com.google.android.apps.gsa.shared.aa.x r5 = com.google.android.apps.gsa.shared.p6968aa.C89009ag.f241207b     // Catch:{ MalformedURLException -> 0x00b6, ak -> 0x00af, d -> 0x00a5, CancellationException -> 0x0082, ExecutionException -> 0x0058 }
            com.google.android.apps.gsa.shared.aa.q r6 = r8.f229500f     // Catch:{ MalformedURLException -> 0x00b6, ak -> 0x00af, d -> 0x00a5, CancellationException -> 0x0082, ExecutionException -> 0x0058 }
            com.google.common.util.concurrent.cx r3 = r4.mo27496g(r3, r5, r6)     // Catch:{ MalformedURLException -> 0x00b6, ak -> 0x00af, d -> 0x00a5, CancellationException -> 0x0082, ExecutionException -> 0x0058 }
            r8.f229506l = r3     // Catch:{ MalformedURLException -> 0x00b6, ak -> 0x00af, d -> 0x00a5, CancellationException -> 0x0082, ExecutionException -> 0x0058 }
            java.lang.Object r3 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r3)     // Catch:{ MalformedURLException -> 0x00b6, ak -> 0x00af, d -> 0x00a5, CancellationException -> 0x0082, ExecutionException -> 0x0058 }
            com.google.android.apps.gsa.shared.aa.as r3 = (com.google.android.apps.gsa.shared.p6968aa.C89021as) r3     // Catch:{ MalformedURLException -> 0x00b6, ak -> 0x00af, d -> 0x00a5, CancellationException -> 0x0082, ExecutionException -> 0x0058 }
            com.google.android.apps.gsa.shared.aa.at r4 = r3.mo82999g()     // Catch:{ MalformedURLException -> 0x00b6, ak -> 0x00af, d -> 0x00a5, CancellationException -> 0x0082, ExecutionException -> 0x0058 }
            com.google.android.apps.gsa.shared.aa.x r1 = r3.mo82997b()     // Catch:{ MalformedURLException -> 0x0056, ak -> 0x00af, d -> 0x0054, CancellationException -> 0x0052, ExecutionException -> 0x0050 }
            goto L_0x00e4
        L_0x0050:
            r1 = move-exception
            goto L_0x005a
        L_0x0052:
            r3 = move-exception
            goto L_0x0084
        L_0x0054:
            r3 = move-exception
            goto L_0x00a7
        L_0x0056:
            r1 = move-exception
            goto L_0x00b8
        L_0x0058:
            r1 = move-exception
            r4 = r2
        L_0x005a:
            com.google.common.f.e r3 = com.google.android.apps.gsa.p6487s3.C84330s.f229507a     // Catch:{ all -> 0x0019 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x0019 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0019 }
            com.google.common.f.x r3 = r3.mo56382g(r1)     // Catch:{ all -> 0x0019 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0019 }
            r5 = 7204(0x1c24, float:1.0095E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r5)     // Catch:{ all -> 0x0019 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0019 }
            java.lang.String r5 = "Connecting to the down stream failed unexpectedly."
            r3.mo56386p(r5)     // Catch:{ all -> 0x0019 }
            int r3 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x0019 }
            com.google.android.apps.gsa.shared.speech.a.o r3 = new com.google.android.apps.gsa.shared.speech.a.o     // Catch:{ all -> 0x0019 }
            r5 = 65587(0x10033, float:9.1907E-41)
            r3.<init>((java.lang.Throwable) r1, (int) r5)     // Catch:{ all -> 0x0019 }
        L_0x007f:
            r1 = r2
            r2 = r3
            goto L_0x00e4
        L_0x0082:
            r3 = move-exception
            r4 = r2
        L_0x0084:
            com.google.common.f.e r5 = com.google.android.apps.gsa.p6487s3.C84330s.f229507a     // Catch:{ all -> 0x0019 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x0019 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0019 }
            com.google.common.f.x r5 = r5.mo56382g(r3)     // Catch:{ all -> 0x0019 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0019 }
            r6 = 7203(0x1c23, float:1.0094E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)     // Catch:{ all -> 0x0019 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0019 }
            java.lang.String r6 = "Connecting to downstream cancelled unexpectedly."
            r5.mo56386p(r6)     // Catch:{ all -> 0x0019 }
            com.google.android.apps.gsa.shared.speech.a.o r5 = new com.google.android.apps.gsa.shared.speech.a.o     // Catch:{ all -> 0x0019 }
            r5.<init>((java.lang.Throwable) r3, (int) r1)     // Catch:{ all -> 0x0019 }
            goto L_0x00ac
        L_0x00a5:
            r3 = move-exception
            r4 = r2
        L_0x00a7:
            com.google.android.apps.gsa.shared.speech.a.o r5 = new com.google.android.apps.gsa.shared.speech.a.o     // Catch:{ all -> 0x0019 }
            r5.<init>((java.lang.Throwable) r3, (int) r1)     // Catch:{ all -> 0x0019 }
        L_0x00ac:
            r1 = r2
            r2 = r5
            goto L_0x00e4
        L_0x00af:
            r1 = move-exception
            com.google.android.apps.gsa.shared.aa.at r4 = r1.mo82984e()     // Catch:{ all -> 0x0019 }
            r1 = r2
            goto L_0x00e4
        L_0x00b6:
            r1 = move-exception
            r4 = r2
        L_0x00b8:
            com.google.common.f.e r3 = com.google.android.apps.gsa.p6487s3.C84330s.f229507a     // Catch:{ all -> 0x0019 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x0019 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0019 }
            r5 = 7202(0x1c22, float:1.0092E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r5)     // Catch:{ all -> 0x0019 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0019 }
            java.lang.String r5 = "Malformed URL '%s' with suffix '%s'"
            com.google.al.c.c.b.ay r6 = r8.f229497b     // Catch:{ all -> 0x0019 }
            com.google.al.c.c.b.ai r6 = r6.f29443b     // Catch:{ all -> 0x0019 }
            if (r6 != 0) goto L_0x00d2
            com.google.al.c.c.b.ai r6 = com.google.p395al.p408c.p414c.p416b.C8466ai.f29395g     // Catch:{ all -> 0x0019 }
        L_0x00d2:
            java.lang.String r6 = r6.f29398b     // Catch:{ all -> 0x0019 }
            java.lang.String r7 = r8.f229498c     // Catch:{ all -> 0x0019 }
            r3.mo56354G(r5, r6, r7)     // Catch:{ all -> 0x0019 }
            int r3 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x0019 }
            com.google.android.apps.gsa.shared.speech.a.o r3 = new com.google.android.apps.gsa.shared.speech.a.o     // Catch:{ all -> 0x0019 }
            r5 = 65537(0x10001, float:9.1837E-41)
            r3.<init>((java.lang.Throwable) r1, (int) r5)     // Catch:{ all -> 0x0019 }
            goto L_0x007f
        L_0x00e4:
            if (r2 != 0) goto L_0x0110
            r4.getClass()
            java.lang.String r2 = "Download"
            com.google.android.apps.gsa.p6487s3.C84334w.m134552b(r4, r2)     // Catch:{ o -> 0x0111 }
            com.google.common.util.concurrent.cx r2 = r8.f229506l     // Catch:{ o -> 0x0111 }
            r2.getClass()
            r1.getClass()
            r8.m134536f(r1)     // Catch:{ all -> 0x0019 }
            com.google.common.util.concurrent.cx r1 = r8.f229506l
            if (r1 == 0) goto L_0x0102
            int r2 = r8.f229504j
            com.google.android.apps.gsa.p6487s3.C84330s.m134539c(r1, r2)
        L_0x0102:
            com.google.android.apps.gsa.search.core.i.t r1 = r8.f229505k
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250513k
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x010f
            android.os.Process.setThreadPriority(r0)
        L_0x010f:
            return
        L_0x0110:
            throw r2     // Catch:{ o -> 0x0111 }
        L_0x0111:
            r1 = move-exception
            com.google.android.apps.gsa.s3.s r2 = r8.f229496a     // Catch:{ all -> 0x0019 }
            r3 = 3
            boolean r2 = r2.mo77867d(r3)     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x012b
            boolean r2 = r1 instanceof com.google.android.apps.gsa.shared.speech.p7139a.C90522n     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x0120
            goto L_0x012b
        L_0x0120:
            com.google.android.apps.gsa.s3.m r2 = r8.f229503i     // Catch:{ all -> 0x0019 }
            com.google.android.apps.gsa.shared.speech.a.i r3 = new com.google.android.apps.gsa.shared.speech.a.i     // Catch:{ all -> 0x0019 }
            r3.<init>(r1)     // Catch:{ all -> 0x0019 }
            r2.mo77832c(r3)     // Catch:{ all -> 0x0019 }
            goto L_0x0130
        L_0x012b:
            com.google.android.apps.gsa.s3.m r2 = r8.f229503i     // Catch:{ all -> 0x0019 }
            r2.mo77831a(r1)     // Catch:{ all -> 0x0019 }
        L_0x0130:
            com.google.common.util.concurrent.cx r1 = r8.f229506l
            if (r1 == 0) goto L_0x0139
            int r2 = r8.f229504j
            com.google.android.apps.gsa.p6487s3.C84330s.m134539c(r1, r2)
        L_0x0139:
            com.google.android.apps.gsa.search.core.i.t r1 = r8.f229505k
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250513k
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x0146
            android.os.Process.setThreadPriority(r0)
        L_0x0146:
            return
        L_0x0147:
            com.google.common.util.concurrent.cx r2 = r8.f229506l
            if (r2 == 0) goto L_0x0150
            int r3 = r8.f229504j
            com.google.android.apps.gsa.p6487s3.C84330s.m134539c(r2, r3)
        L_0x0150:
            com.google.android.apps.gsa.search.core.i.t r2 = r8.f229505k
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250513k
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x015d
            android.os.Process.setThreadPriority(r0)
        L_0x015d:
            goto L_0x015f
        L_0x015e:
            throw r1
        L_0x015f:
            goto L_0x015e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p6487s3.C84329r.mo77836c():void");
    }
}
