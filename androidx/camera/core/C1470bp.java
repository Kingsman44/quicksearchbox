package androidx.camera.core;

import android.util.Pair;
import android.util.Size;
import androidx.camera.camera2.p063b.C1094aq;
import androidx.camera.core.p069a.C1299am;
import androidx.camera.core.p069a.C1300an;
import androidx.camera.core.p069a.C1301ao;
import androidx.camera.core.p069a.C1302ap;
import androidx.camera.core.p069a.C1303aq;
import androidx.camera.core.p069a.C1305as;
import androidx.camera.core.p069a.C1306at;
import androidx.camera.core.p069a.C1308av;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.C1324bk;
import androidx.camera.core.p069a.C1326bm;
import androidx.camera.core.p069a.C1330bq;
import androidx.camera.core.p069a.C1338by;
import androidx.camera.core.p069a.C1348ch;
import androidx.camera.core.p069a.C1351ck;
import androidx.camera.core.p069a.C1372de;
import androidx.camera.core.p069a.C1373df;
import androidx.camera.core.p069a.C1376di;
import androidx.camera.core.p069a.C1384k;
import androidx.camera.core.p069a.p070a.C1285p;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p071a.C1246i;
import androidx.camera.core.p069a.p070a.p071a.C1250m;
import androidx.camera.core.p069a.p070a.p072b.C1266o;
import androidx.camera.core.p073b.C1449l;
import androidx.camera.core.p073b.p074a.p075a.C1430c;
import androidx.core.p097i.C1974i;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;

/* renamed from: androidx.camera.core.bp */
/* compiled from: PG */
public final class C1470bp extends C1551ea {

    /* renamed from: o */
    public static final /* synthetic */ int f4052o = 0;

    /* renamed from: A */
    private final C1330bq f4053A = C1424ay.f3980a;

    /* renamed from: B */
    private C1299am f4054B;

    /* renamed from: C */
    private boolean f4055C = false;

    /* renamed from: D */
    private C60870cx f4056D = C1266o.f3667a;

    /* renamed from: a */
    final Executor f4057a;

    /* renamed from: b */
    public final int f4058b;

    /* renamed from: c */
    public final AtomicReference f4059c = new AtomicReference((Object) null);

    /* renamed from: d */
    public final int f4060d;

    /* renamed from: e */
    public ExecutorService f4061e;

    /* renamed from: f */
    public C1302ap f4062f;

    /* renamed from: g */
    public int f4063g;

    /* renamed from: h */
    public C1303aq f4064h;

    /* renamed from: i */
    C1351ck f4065i;

    /* renamed from: j */
    C1526dc f4066j;

    /* renamed from: k */
    C1517cu f4067k;

    /* renamed from: l */
    public C1384k f4068l;

    /* renamed from: m */
    public C1314ba f4069m;

    /* renamed from: n */
    public C1469bo f4070n;

    static {
        C1324bk bkVar = C1465bk.f4040a;
    }

    public C1470bp(C1324bk bkVar) {
        super(bkVar);
        C1324bk bkVar2 = (C1324bk) this.f4267t;
        if (C1348ch.m3679g(bkVar2, C1324bk.f3795a)) {
            this.f4058b = bkVar2.mo4193A();
        } else {
            this.f4058b = 1;
        }
        this.f4060d = ((Integer) C1348ch.m3675c(bkVar2, C1324bk.f3803i, 0)).intValue();
        Executor executor = (Executor) C1348ch.m3675c(bkVar2, C1324bk.f4014E, C1246i.m3413a());
        executor.getClass();
        this.f4057a = executor;
        new C1250m(executor);
    }

    /* renamed from: A */
    private final int m3943A() {
        C1324bk bkVar = (C1324bk) this.f4267t;
        if (C1348ch.m3679g(bkVar, C1324bk.f3804j)) {
            return ((Integer) C1348ch.m3674b(bkVar, C1324bk.f3804j)).intValue();
        }
        int i = this.f4058b;
        if (i == 0) {
            return 100;
        }
        if (i == 1 || i == 2) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.f4058b + " is invalid");
    }

    /* renamed from: B */
    private final void m3944B() {
        if (this.f4070n != null) {
            this.f4070n.mo4349a(new C1563m());
        }
    }

    /* renamed from: C */
    private final void m3945C() {
        synchronized (this.f4059c) {
            if (this.f4059c.get() == null) {
                mo4415q().mo4044m(mo4351g());
            }
        }
    }

    /* renamed from: D */
    private static boolean m3946D(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    static void m3947n(Throwable th) {
        if (!(th instanceof C1563m) && (th instanceof C1471bq)) {
            C1471bq bqVar = (C1471bq) th;
        }
    }

    /* renamed from: a */
    public final Size mo4309a(Size size) {
        C1351ck i = mo4353i(mo4417s(), (C1324bk) this.f4267t, size);
        this.f4065i = i;
        mo4422x(i.mo4227b());
        mo4419u();
        return size;
    }

    /* renamed from: b */
    public final C1372de mo4310b(C1308av avVar) {
        return C1464bj.m3933a(avVar);
    }

    /* renamed from: c */
    public final C1373df mo4311c(boolean z, C1376di diVar) {
        C1308av a = diVar.mo3876a(1, this.f4058b);
        if (z) {
            a = C1305as.m3501a(a, C1465bk.f4040a);
        }
        if (a == null) {
            return null;
        }
        return C1464bj.m3933a(a).mo4273c();
    }

    /* renamed from: d */
    public final void mo4312d() {
        C1324bk bkVar = (C1324bk) this.f4267t;
        C1301ao aoVar = (C1301ao) C1348ch.m3675c(bkVar, C1373df.f3868o, (Object) null);
        if (aoVar != null) {
            C1300an anVar = new C1300an();
            aoVar.mo3859a(bkVar, anVar);
            this.f4062f = anVar.mo4157a();
            this.f4064h = (C1303aq) C1348ch.m3675c(bkVar, C1324bk.f3798d, (Object) null);
            this.f4063g = ((Integer) C1348ch.m3675c(bkVar, C1324bk.f3800f, 2)).intValue();
            this.f4054B = (C1299am) C1348ch.m3675c(bkVar, C1324bk.f3797c, C1405af.m3853a());
            this.f4055C = ((Boolean) C1348ch.m3675c(bkVar, C1324bk.f3802h, false)).booleanValue();
            C1974i.m5319g(mo4416r(), "Attached camera cannot be null");
            this.f4061e = Executors.newFixedThreadPool(1, new C1463bi());
            return;
        }
        throw new IllegalStateException("Implementation is missing option unpacker for ".concat(String.valueOf(C1449l.m3919a(bkVar, bkVar.toString()))));
    }

    /* renamed from: e */
    public final void mo4313e() {
        C60870cx cxVar = this.f4056D;
        m3944B();
        mo4354j();
        this.f4055C = false;
        ExecutorService executorService = this.f4061e;
        Objects.requireNonNull(executorService);
        cxVar.mo4106b(new C1421av(executorService), C1238a.m3410a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C1373df mo4314f(C1094aq aqVar, C1372de deVar) {
        boolean z;
        boolean z2 = true;
        if (deVar.mo4273c().mo3954F(C1324bk.f3798d, (Object) null) != null) {
            C1477bw.m3982e("ImageCapture", "Requesting software JPEG due to a CaptureProcessor is set.");
            deVar.mo3737b().mo4215a(C1324bk.f3802h, true);
        } else if (aqVar.f3275e.mo4226b(C1430c.class)) {
            if (Boolean.FALSE.equals(deVar.mo3737b().mo3954F(C1324bk.f3802h, true))) {
                C1477bw.m3983f("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                C1477bw.m3982e("ImageCapture", "Requesting software JPEG due to device quirk.");
                deVar.mo3737b().mo4215a(C1324bk.f3802h, true);
            }
        }
        C1338by b = deVar.mo3737b();
        if (Boolean.TRUE.equals(b.mo3954F(C1324bk.f3802h, false))) {
            Integer num = (Integer) b.mo3954F(C1324bk.f3799e, (Object) null);
            if (num == null || num.intValue() == 256) {
                z = true;
            } else {
                C1477bw.m3983f("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
                z = false;
            }
            if (!z) {
                C1477bw.m3983f("ImageCapture", "Unable to support software JPEG. Disabling.");
                b.mo4215a(C1324bk.f3802h, false);
            }
        } else {
            z = false;
        }
        Integer num2 = (Integer) deVar.mo3737b().mo3954F(C1324bk.f3799e, (Object) null);
        int i = 35;
        if (num2 != null) {
            C1974i.m5314b(deVar.mo3737b().mo3954F(C1324bk.f3798d, (Object) null) == null, "Cannot set buffer format with CaptureProcessor defined.");
            C1338by b2 = deVar.mo3737b();
            C1306at atVar = C1326bm.f3806w;
            if (!z) {
                i = num2.intValue();
            }
            b2.mo4215a(atVar, Integer.valueOf(i));
        } else if (deVar.mo3737b().mo3954F(C1324bk.f3798d, (Object) null) != null || z) {
            deVar.mo3737b().mo4215a(C1326bm.f3806w, 35);
        } else {
            List list = (List) deVar.mo3737b().mo3954F(C1324bk.f3810D, (Object) null);
            if (list == null) {
                deVar.mo3737b().mo4215a(C1326bm.f3806w, 256);
            } else if (m3946D(list, 256)) {
                deVar.mo3737b().mo4215a(C1326bm.f3806w, 256);
            } else if (m3946D(list, 35)) {
                deVar.mo3737b().mo4215a(C1326bm.f3806w, 35);
            }
        }
        Integer num3 = (Integer) deVar.mo3737b().mo3954F(C1324bk.f3800f, 2);
        C1974i.m5319g(num3, "Maximum outstanding image count must be at least 1");
        if (num3.intValue() <= 0) {
            z2 = false;
        }
        C1974i.m5314b(z2, "Maximum outstanding image count must be at least 1");
        return deVar.mo4273c();
    }

    /* renamed from: g */
    public final int mo4351g() {
        int intValue;
        synchronized (this.f4059c) {
            intValue = ((Integer) C1348ch.m3675c((C1324bk) this.f4267t, C1324bk.f3796b, 2)).intValue();
        }
        return intValue;
    }

    /* renamed from: h */
    public final C1299am mo4352h(C1299am amVar) {
        List a = this.f4054B.mo4156a();
        return (a == null || a.isEmpty()) ? amVar : new C1404ae(a);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x023a  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.camera.core.p069a.C1351ck mo4353i(java.lang.String r15, androidx.camera.core.p069a.C1324bk r16, android.util.Size r17) {
        /*
            r14 = this;
            r1 = r14
            androidx.camera.core.p069a.p070a.C1285p.m3462a()
            androidx.camera.core.p069a.p070a.C1285p.m3462a()
            androidx.camera.core.a.ck r0 = androidx.camera.core.p069a.C1351ck.m3687a(r16)
            int r2 = r1.f4058b
            r3 = 2
            if (r2 != r3) goto L_0x0017
            androidx.camera.core.a.z r2 = r14.mo4415q()
            r2.mo4038g(r0)
        L_0x0017:
            androidx.camera.core.bt r2 = r16.mo4194B()
            r4 = 0
            if (r2 == 0) goto L_0x0040
            androidx.camera.core.dc r2 = new androidx.camera.core.dc
            androidx.camera.core.bt r3 = r16.mo4194B()
            r17.getWidth()
            r17.getHeight()
            r14.mo4413o()
            androidx.camera.core.a.br r3 = r3.mo4359a()
            r2.<init>(r3)
            r1.f4066j = r2
            androidx.camera.core.bf r2 = new androidx.camera.core.bf
            r2.<init>()
            r1.f4068l = r2
        L_0x003d:
            r3 = r4
            goto L_0x01a8
        L_0x0040:
            androidx.camera.core.a.af r2 = r14.mo4416r()
            r5 = 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x004a
            goto L_0x00ef
        L_0x004a:
            androidx.camera.core.a.af r2 = r14.mo4416r()
            androidx.camera.core.a.r r2 = r2.mo3818b()
            androidx.camera.core.a.cr r2 = r2.mo4292m()
            if (r2 == 0) goto L_0x00ef
            int r2 = r14.mo4413o()
            if (r2 != r5) goto L_0x0075
            androidx.camera.core.e r2 = new androidx.camera.core.e
            int r5 = r17.getWidth()
            int r6 = r17.getHeight()
            int r7 = r14.mo4413o()
            android.media.ImageReader r3 = android.media.ImageReader.newInstance(r5, r6, r7, r3)
            r2.<init>(r3)
            r3 = r4
            goto L_0x00c7
        L_0x0075:
            int r2 = r14.mo4413o()
            r6 = 35
            if (r2 != r6) goto L_0x00d7
            androidx.camera.core.b.q r2 = new androidx.camera.core.b.q
            int r7 = r14.m3943A()
            r2.<init>(r7, r3)
            androidx.camera.core.cb r7 = new androidx.camera.core.cb
            int r8 = r17.getWidth()
            int r9 = r17.getHeight()
            android.media.ImageReader r3 = android.media.ImageReader.newInstance(r8, r9, r6, r3)
            r7.<init>(r3)
            androidx.camera.core.a.am r3 = androidx.camera.core.C1405af.m3853a()
            androidx.camera.core.ct r6 = new androidx.camera.core.ct
            r6.<init>(r7, r3, r2)
            java.util.concurrent.ExecutorService r8 = r1.f4061e
            r6.f4165e = r8
            r6.f4164d = r5
            androidx.camera.core.cu r5 = new androidx.camera.core.cu
            r5.<init>(r6)
            androidx.camera.core.a.ca r6 = androidx.camera.core.p069a.C1341ca.m3631a()
            java.lang.String r8 = r5.f4178m
            androidx.camera.core.ae r3 = (androidx.camera.core.C1404ae) r3
            java.util.List r3 = r3.f3951a
            r9 = 0
            java.lang.Object r3 = r3.get(r9)
            androidx.camera.core.a.ar r3 = (androidx.camera.core.p069a.C1304ar) r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r6.mo4220b(r8, r3)
            r7.f4128c = r6
            r3 = r2
            r2 = r5
        L_0x00c7:
            androidx.camera.core.bg r5 = new androidx.camera.core.bg
            r5.<init>()
            r1.f4068l = r5
            androidx.camera.core.dc r5 = new androidx.camera.core.dc
            r5.<init>(r2)
            r1.f4066j = r5
            goto L_0x01a8
        L_0x00d7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported image format:"
            r2.<init>(r3)
            int r3 = r14.mo4413o()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x00ef:
            androidx.camera.core.a.aq r2 = r1.f4064h
            if (r2 != 0) goto L_0x011a
            boolean r6 = r1.f4055C
            if (r6 == 0) goto L_0x00f8
            goto L_0x011a
        L_0x00f8:
            androidx.camera.core.ca r2 = new androidx.camera.core.ca
            int r5 = r17.getWidth()
            int r6 = r17.getHeight()
            int r7 = r14.mo4413o()
            androidx.camera.core.a.br r3 = androidx.camera.core.C1497ca.m4002l(r5, r6, r7, r3)
            r2.<init>(r3)
            androidx.camera.core.a.k r3 = r2.f4116b
            r1.f4068l = r3
            androidx.camera.core.dc r3 = new androidx.camera.core.dc
            r3.<init>(r2)
            r1.f4066j = r3
            goto L_0x003d
        L_0x011a:
            int r3 = r14.mo4413o()
            int r6 = r14.mo4413o()
            boolean r7 = r1.f4055C
            if (r7 == 0) goto L_0x0158
            java.lang.String r2 = "ImageCapture"
            java.lang.String r6 = "Using software JPEG encoder."
            androidx.camera.core.C1477bw.m3982e(r2, r6)
            androidx.camera.core.a.aq r2 = r1.f4064h
            if (r2 == 0) goto L_0x014b
            androidx.camera.core.b.q r2 = new androidx.camera.core.b.q
            int r6 = r14.m3943A()
            int r7 = r1.f4063g
            r2.<init>(r6, r7)
            androidx.camera.core.al r6 = new androidx.camera.core.al
            androidx.camera.core.a.aq r7 = r1.f4064h
            int r8 = r1.f4063g
            java.util.concurrent.ExecutorService r9 = r1.f4061e
            r6.<init>(r7, r8, r2, r9)
            r13 = r6
            r6 = r2
            r2 = r13
            goto L_0x015a
        L_0x014b:
            androidx.camera.core.b.q r2 = new androidx.camera.core.b.q
            int r6 = r14.m3943A()
            int r7 = r1.f4063g
            r2.<init>(r6, r7)
            r6 = r2
            goto L_0x015a
        L_0x0158:
            r5 = r6
            r6 = r4
        L_0x015a:
            androidx.camera.core.ct r7 = new androidx.camera.core.ct
            int r8 = r17.getWidth()
            int r9 = r17.getHeight()
            int r10 = r1.f4063g
            androidx.camera.core.a.am r11 = androidx.camera.core.C1405af.m3853a()
            androidx.camera.core.a.am r11 = r14.mo4352h(r11)
            androidx.camera.core.ca r12 = new androidx.camera.core.ca
            androidx.camera.core.a.br r3 = androidx.camera.core.C1497ca.m4002l(r8, r9, r3, r10)
            r12.<init>(r3)
            r7.<init>(r12, r11, r2)
            java.util.concurrent.ExecutorService r2 = r1.f4061e
            r7.f4165e = r2
            r7.f4164d = r5
            androidx.camera.core.cu r2 = new androidx.camera.core.cu
            r2.<init>(r7)
            r1.f4067k = r2
            java.lang.Object r3 = r2.f4166a
            monitor-enter(r3)
            androidx.camera.core.a.br r2 = r2.f4169d     // Catch:{ all -> 0x0274 }
            boolean r5 = r2 instanceof androidx.camera.core.C1497ca     // Catch:{ all -> 0x0274 }
            if (r5 == 0) goto L_0x0196
            androidx.camera.core.ca r2 = (androidx.camera.core.C1497ca) r2     // Catch:{ all -> 0x0274 }
            androidx.camera.core.a.k r2 = r2.f4116b     // Catch:{ all -> 0x0274 }
            monitor-exit(r3)     // Catch:{ all -> 0x0274 }
            goto L_0x019c
        L_0x0196:
            androidx.camera.core.cs r2 = new androidx.camera.core.cs     // Catch:{ all -> 0x0274 }
            r2.<init>()     // Catch:{ all -> 0x0274 }
            monitor-exit(r3)     // Catch:{ all -> 0x0274 }
        L_0x019c:
            r1.f4068l = r2
            androidx.camera.core.dc r2 = new androidx.camera.core.dc
            androidx.camera.core.cu r3 = r1.f4067k
            r2.<init>(r3)
            r1.f4066j = r2
            r3 = r6
        L_0x01a8:
            androidx.camera.core.bo r2 = r1.f4070n
            if (r2 == 0) goto L_0x01b6
            java.util.concurrent.CancellationException r5 = new java.util.concurrent.CancellationException
            java.lang.String r6 = "Request is canceled."
            r5.<init>(r6)
            r2.mo4349a(r5)
        L_0x01b6:
            androidx.camera.core.bo r2 = new androidx.camera.core.bo
            androidx.camera.core.az r5 = new androidx.camera.core.az
            r5.<init>(r14)
            if (r3 != 0) goto L_0x01c0
            goto L_0x01c5
        L_0x01c0:
            androidx.camera.core.ba r4 = new androidx.camera.core.ba
            r4.<init>(r3)
        L_0x01c5:
            r2.<init>(r5, r4)
            r1.f4070n = r2
            androidx.camera.core.dc r2 = r1.f4066j
            androidx.camera.core.a.bq r3 = r1.f4053A
            java.util.concurrent.ScheduledExecutorService r4 = androidx.camera.core.p069a.p070a.p071a.C1247j.m3414a()
            r2.mo4207j(r3, r4)
            androidx.camera.core.a.ba r2 = r1.f4069m
            if (r2 == 0) goto L_0x01dc
            r2.mo4177c()
        L_0x01dc:
            androidx.camera.core.a.bs r2 = new androidx.camera.core.a.bs
            androidx.camera.core.dc r3 = r1.f4066j
            android.view.Surface r3 = r3.mo4202e()
            java.lang.Object r3 = p3186j$.util.Objects.requireNonNull(r3)
            android.view.Surface r3 = (android.view.Surface) r3
            android.util.Size r4 = new android.util.Size
            androidx.camera.core.dc r5 = r1.f4066j
            int r5 = r5.mo4201d()
            androidx.camera.core.dc r6 = r1.f4066j
            int r6 = r6.mo4198a()
            r4.<init>(r5, r6)
            int r5 = r14.mo4413o()
            r2.<init>(r3, r4, r5)
            r1.f4069m = r2
            androidx.camera.core.cu r2 = r1.f4067k
            if (r2 == 0) goto L_0x023a
            java.lang.Object r3 = r2.f4166a
            monitor-enter(r3)
            boolean r4 = r2.f4167b     // Catch:{ all -> 0x0237 }
            if (r4 == 0) goto L_0x0220
            boolean r4 = r2.f4168c     // Catch:{ all -> 0x0237 }
            if (r4 != 0) goto L_0x0220
            com.google.common.util.concurrent.cx r2 = r2.f4177l     // Catch:{ all -> 0x0237 }
            androidx.camera.core.ck r4 = androidx.camera.core.C1507ck.f4151a     // Catch:{ all -> 0x0237 }
            java.util.concurrent.Executor r5 = androidx.camera.core.p069a.p070a.p071a.C1238a.m3410a()     // Catch:{ all -> 0x0237 }
            com.google.common.util.concurrent.cx r2 = androidx.camera.core.p069a.p070a.p072b.C1263l.m3433e(r2, r4, r5)     // Catch:{ all -> 0x0237 }
            goto L_0x0235
        L_0x0220:
            com.google.common.util.concurrent.cx r4 = r2.f4174i     // Catch:{ all -> 0x0237 }
            if (r4 != 0) goto L_0x022f
            androidx.camera.core.cl r4 = new androidx.camera.core.cl     // Catch:{ all -> 0x0237 }
            r4.<init>(r2)     // Catch:{ all -> 0x0237 }
            com.google.common.util.concurrent.cx r4 = androidx.p104d.p105a.C2169h.m6027a(r4)     // Catch:{ all -> 0x0237 }
            r2.f4174i = r4     // Catch:{ all -> 0x0237 }
        L_0x022f:
            com.google.common.util.concurrent.cx r2 = r2.f4174i     // Catch:{ all -> 0x0237 }
            com.google.common.util.concurrent.cx r2 = androidx.camera.core.p069a.p070a.p072b.C1263l.m3431c(r2)     // Catch:{ all -> 0x0237 }
        L_0x0235:
            monitor-exit(r3)     // Catch:{ all -> 0x0237 }
            goto L_0x023c
        L_0x0237:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0237 }
            throw r0
        L_0x023a:
            androidx.camera.core.a.a.b.p r2 = androidx.camera.core.p069a.p070a.p072b.C1266o.f3667a
        L_0x023c:
            r1.f4056D = r2
            androidx.camera.core.a.ba r2 = r1.f4069m
            com.google.common.util.concurrent.cx r2 = r2.f3777p
            com.google.common.util.concurrent.cx r2 = androidx.camera.core.p069a.p070a.p072b.C1263l.m3431c(r2)
            androidx.camera.core.dc r3 = r1.f4066j
            p3186j$.util.Objects.requireNonNull(r3)
            androidx.camera.core.bb r4 = new androidx.camera.core.bb
            r4.<init>(r3)
            java.util.concurrent.ScheduledExecutorService r3 = androidx.camera.core.p069a.p070a.p071a.C1247j.m3414a()
            r2.mo4106b(r4, r3)
            androidx.camera.core.a.ba r2 = r1.f4069m
            androidx.camera.core.a.cn r2 = androidx.camera.core.p069a.C1355co.m3697e(r2)
            androidx.camera.core.a.co r2 = r2.mo4234a()
            java.util.Set r3 = r0.f3831a
            r3.add(r2)
            androidx.camera.core.bc r2 = new androidx.camera.core.bc
            r3 = r15
            r4 = r16
            r5 = r17
            r2.<init>(r14, r15, r4, r5)
            r0.mo4230e(r2)
            return r0
        L_0x0274:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0274 }
            goto L_0x0278
        L_0x0277:
            throw r0
        L_0x0278:
            goto L_0x0277
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C1470bp.mo4353i(java.lang.String, androidx.camera.core.a.bk, android.util.Size):androidx.camera.core.a.ck");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo4354j() {
        C1285p.m3462a();
        C1285p.m3462a();
        C1469bo boVar = this.f4070n;
        if (boVar != null) {
            boVar.mo4349a(new CancellationException("Request is canceled."));
            this.f4070n = null;
        }
        C1314ba baVar = this.f4069m;
        this.f4069m = null;
        this.f4066j = null;
        this.f4067k = null;
        this.f4056D = C1266o.f3667a;
        if (baVar != null) {
            baVar.mo4177c();
        }
    }

    /* renamed from: k */
    public final void mo4355k() {
        m3945C();
    }

    /* renamed from: l */
    public final void mo4356l() {
        m3944B();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4357m() {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r3.f4059c
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r3.f4059c     // Catch:{ all -> 0x001f }
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)     // Catch:{ all -> 0x001f }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x0010:
            int r1 = r1.intValue()     // Catch:{ all -> 0x001f }
            int r2 = r3.mo4351g()     // Catch:{ all -> 0x001f }
            if (r1 == r2) goto L_0x001d
            r3.m3945C()     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C1470bp.mo4357m():void");
    }

    public final String toString() {
        return "ImageCapture:".concat(String.valueOf(mo4418t()));
    }
}
