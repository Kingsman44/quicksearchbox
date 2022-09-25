package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.os.Looper;
import android.util.Size;
import androidx.camera.camera2.p062a.C0988a;
import androidx.camera.camera2.p063b.p064a.C1068k;
import androidx.camera.camera2.p063b.p064a.p067c.C1043a;
import androidx.camera.camera2.p063b.p064a.p067c.C1044b;
import androidx.camera.camera2.p068c.C1226b;
import androidx.camera.camera2.p068c.C1227c;
import androidx.camera.camera2.p068c.C1228d;
import androidx.camera.camera2.p068c.C1231g;
import androidx.camera.camera2.p068c.C1233i;
import androidx.camera.camera2.p068c.C1234j;
import androidx.camera.core.C1473bs;
import androidx.camera.core.C1477bw;
import androidx.camera.core.C1497ca;
import androidx.camera.core.C1526dc;
import androidx.camera.core.C1555ee;
import androidx.camera.core.C1564n;
import androidx.camera.core.p069a.C1300an;
import androidx.camera.core.p069a.C1306at;
import androidx.camera.core.p069a.C1308av;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.C1332bs;
import androidx.camera.core.p069a.C1339bz;
import androidx.camera.core.p069a.C1347cg;
import androidx.camera.core.p069a.C1348ch;
import androidx.camera.core.p069a.C1351ck;
import androidx.camera.core.p069a.C1399z;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p071a.C1246i;
import androidx.camera.core.p069a.p070a.p071a.C1247j;
import androidx.camera.core.p069a.p070a.p072b.C1257f;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.camera.core.p069a.p070a.p072b.C1264m;
import androidx.camera.core.p069a.p070a.p072b.C1266o;
import androidx.camera.core.p073b.C1447j;
import androidx.camera.core.p073b.p077b.C1439e;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.Objects;

/* renamed from: androidx.camera.camera2.b.t */
/* compiled from: PG */
public final class C1217t implements C1399z {

    /* renamed from: a */
    final C1215r f3562a;

    /* renamed from: b */
    public final Executor f3563b;

    /* renamed from: c */
    public final C1159da f3564c;

    /* renamed from: d */
    public final C1193eh f3565d;

    /* renamed from: e */
    final C1198em f3566e;

    /* renamed from: f */
    public final C1231g f3567f;

    /* renamed from: g */
    public final C1122br f3568g;

    /* renamed from: h */
    public volatile boolean f3569h;

    /* renamed from: i */
    public final C1084ag f3570i;

    /* renamed from: k */
    private final Object f3571k = new Object();

    /* renamed from: l */
    private final C1068k f3572l;

    /* renamed from: m */
    private final C1351ck f3573m;

    /* renamed from: n */
    private final C1196ek f3574n;

    /* renamed from: o */
    private final C1154cw f3575o;

    /* renamed from: p */
    private int f3576p;

    /* renamed from: q */
    private volatile int f3577q;

    /* renamed from: r */
    private final C1043a f3578r;

    /* renamed from: s */
    private final C1044b f3579s;

    /* renamed from: t */
    private final AtomicLong f3580t;

    /* renamed from: u */
    private volatile C60870cx f3581u;

    /* renamed from: v */
    private int f3582v;

    /* renamed from: w */
    private long f3583w;

    /* renamed from: x */
    private final C1213p f3584x;

    public C1217t(C1068k kVar, Executor executor, C1084ag agVar, C1347cg cgVar) {
        C1351ck ckVar = new C1351ck();
        this.f3573m = ckVar;
        this.f3576p = 0;
        this.f3569h = false;
        this.f3577q = 2;
        this.f3580t = new AtomicLong(0);
        this.f3581u = C1266o.f3667a;
        this.f3582v = 1;
        this.f3583w = 0;
        C1213p pVar = new C1213p();
        this.f3584x = pVar;
        this.f3572l = kVar;
        this.f3570i = agVar;
        this.f3563b = executor;
        C1215r rVar = new C1215r(executor);
        this.f3562a = rVar;
        ckVar.f3832b.f3742c = this.f3582v;
        ckVar.f3832b.mo4159c(new C1137cf(rVar));
        ckVar.f3832b.mo4159c(pVar);
        this.f3575o = new C1154cw();
        this.f3564c = new C1159da(this);
        this.f3574n = new C1196ek(this, kVar);
        this.f3565d = new C1193eh(this, kVar);
        this.f3566e = new C1202eq(kVar);
        this.f3578r = new C1043a(cgVar);
        this.f3579s = new C1044b(cgVar);
        this.f3567f = new C1231g(this, executor);
        this.f3568g = new C1122br(this, kVar, cgVar, executor);
        executor.execute(new C1209l(this));
    }

    /* renamed from: o */
    private final boolean m3363o() {
        int i;
        synchronized (this.f3571k) {
            i = this.f3576p;
        }
        return i > 0;
    }

    /* renamed from: p */
    private static final boolean m3364p(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo4032a(int i) {
        int[] iArr = (int[]) this.f3572l.mo3785a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m3364p(i, iArr)) {
            return i;
        }
        if (m3364p(1, iArr)) {
            return 1;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo4033b() {
        this.f3583w = this.f3580t.getAndIncrement();
        this.f3570i.f3229a.mo3834t();
        return this.f3583w;
    }

    /* renamed from: c */
    public final C1308av mo4034c() {
        return this.f3567f.mo4059a();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final androidx.camera.core.p069a.C1357cq mo4035d() {
        /*
            r11 = this;
            androidx.camera.core.a.ck r0 = r11.f3573m
            int r1 = r11.f3582v
            androidx.camera.core.a.an r2 = r0.f3832b
            r2.f3742c = r1
            androidx.camera.camera2.a.a r1 = new androidx.camera.camera2.a.a
            r1.<init>()
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1.mo3739d(r2, r4)
            androidx.camera.camera2.b.da r2 = r11.f3564c
            int r4 = r2.f3402e
            r5 = 4
            r6 = 3
            if (r4 == r6) goto L_0x0021
            r4 = 4
            goto L_0x0022
        L_0x0021:
            r4 = 3
        L_0x0022:
            android.hardware.camera2.CaptureRequest$Key r7 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            androidx.camera.camera2.b.t r8 = r2.f3399b
            androidx.camera.camera2.b.a.k r8 = r8.f3572l
            android.hardware.camera2.CameraCharacteristics$Key r9 = android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES
            java.lang.Object r8 = r8.mo3785a(r9)
            int[] r8 = (int[]) r8
            r9 = 0
            if (r8 != 0) goto L_0x0035
        L_0x0033:
            r5 = 0
            goto L_0x004b
        L_0x0035:
            boolean r10 = m3364p(r4, r8)
            if (r10 != 0) goto L_0x004a
            boolean r4 = m3364p(r5, r8)
            if (r4 == 0) goto L_0x0042
            goto L_0x004b
        L_0x0042:
            boolean r4 = m3364p(r3, r8)
            if (r4 == 0) goto L_0x0033
            r5 = 1
            goto L_0x004b
        L_0x004a:
            r5 = r4
        L_0x004b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r1.mo3739d(r7, r4)
            android.hardware.camera2.params.MeteringRectangle[] r4 = r2.f3403f
            int r4 = r4.length
            android.hardware.camera2.params.MeteringRectangle[] r4 = r2.f3404g
            int r4 = r4.length
            android.hardware.camera2.params.MeteringRectangle[] r2 = r2.f3405h
            int r2 = r2.length
            androidx.camera.camera2.b.a.c.a r2 = r11.f3578r
            android.util.Range r4 = r2.f3171a
            if (r4 == 0) goto L_0x0068
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            android.util.Range r2 = r2.f3171a
            r1.mo3739d(r4, r2)
        L_0x0068:
            androidx.camera.camera2.b.ek r2 = r11.f3574n
            androidx.camera.camera2.b.ej r2 = r2.f3517d
            r2.mo3751c(r1)
            boolean r2 = r11.f3569h
            r4 = 2
            if (r2 == 0) goto L_0x007f
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.mo3739d(r2, r4)
        L_0x007d:
            r6 = 1
            goto L_0x0092
        L_0x007f:
            int r2 = r11.f3577q
            if (r2 == 0) goto L_0x0086
            if (r2 == r3) goto L_0x0092
        L_0x0085:
            goto L_0x007d
        L_0x0086:
            androidx.camera.camera2.b.a.c.b r2 = r11.f3579s
            boolean r5 = r2.f3172a
            if (r5 != 0) goto L_0x007d
            boolean r2 = r2.f3173b
            if (r2 == 0) goto L_0x0091
            goto L_0x0085
        L_0x0091:
            r6 = 2
        L_0x0092:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r4 = r11.mo4032a(r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.mo3739d(r2, r4)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            androidx.camera.camera2.b.a.k r4 = r11.f3572l
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES
            java.lang.Object r4 = r4.mo3785a(r5)
            int[] r4 = (int[]) r4
            if (r4 != 0) goto L_0x00af
        L_0x00ad:
            r3 = 0
            goto L_0x00bc
        L_0x00af:
            boolean r5 = m3364p(r3, r4)
            if (r5 == 0) goto L_0x00b6
            goto L_0x00bc
        L_0x00b6:
            boolean r4 = m3364p(r3, r4)
            if (r4 == 0) goto L_0x00ad
        L_0x00bc:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.mo3739d(r2, r3)
            androidx.camera.camera2.b.cw r2 = r11.f3575o
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION
            androidx.camera.camera2.b.cx r2 = r2.f3393a
            java.lang.Object r2 = r2.f3395a
            monitor-enter(r2)
            monitor-exit(r2)     // Catch:{ all -> 0x013e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r1.mo3739d(r3, r2)
            androidx.camera.camera2.c.g r2 = r11.f3567f
            androidx.camera.camera2.a.b r2 = r2.mo4059a()
            java.util.Set r3 = androidx.camera.core.p069a.C1348ch.m3678f(r2)
            java.util.Iterator r3 = r3.iterator()
        L_0x00e2:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00fa
            java.lang.Object r4 = r3.next()
            androidx.camera.core.a.at r4 = (androidx.camera.core.p069a.C1306at) r4
            androidx.camera.core.a.bz r5 = r1.f3131a
            androidx.camera.core.a.au r6 = androidx.camera.core.p069a.C1307au.ALWAYS_OVERRIDE
            java.lang.Object r7 = androidx.camera.core.p069a.C1348ch.m3674b(r2, r4)
            r5.mo4216c(r4, r6, r7)
            goto L_0x00e2
        L_0x00fa:
            androidx.camera.camera2.a.b r1 = r1.mo3736a()
            androidx.camera.core.a.an r0 = r0.f3832b
            androidx.camera.core.a.bz r1 = androidx.camera.core.p069a.C1339bz.m3626l(r1)
            r0.f3741b = r1
            androidx.camera.camera2.c.g r0 = r11.f3567f
            androidx.camera.camera2.a.b r0 = r0.mo4059a()
            androidx.camera.core.a.av r0 = r0.f3624i
            androidx.camera.core.a.at r1 = androidx.camera.camera2.p062a.C0989b.f3138g
            r2 = 0
            java.lang.Object r0 = r0.mo3954F(r1, r2)
            if (r0 == 0) goto L_0x0126
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0126
            androidx.camera.core.a.ck r1 = r11.f3573m
            androidx.camera.core.a.an r1 = r1.f3832b
            androidx.camera.core.a.ca r1 = r1.f3744e
            java.lang.String r2 = "Camera2CameraControl"
            r1.mo4220b(r2, r0)
        L_0x0126:
            androidx.camera.core.a.ck r0 = r11.f3573m
            long r1 = r11.f3583w
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            androidx.camera.core.a.an r0 = r0.f3832b
            androidx.camera.core.a.ca r0 = r0.f3744e
            java.lang.String r2 = "CameraControlSessionUpdateId"
            r0.mo4220b(r2, r1)
            androidx.camera.core.a.ck r0 = r11.f3573m
            androidx.camera.core.a.cq r0 = r0.mo4227b()
            return r0
        L_0x013e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x013e }
            goto L_0x0142
        L_0x0141:
            throw r0
        L_0x0142:
            goto L_0x0141
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p063b.C1217t.mo4035d():androidx.camera.core.a.cq");
    }

    /* renamed from: e */
    public final C60870cx mo4036e(List list, int i, int i2) {
        if (!m3363o()) {
            C1477bw.m3983f("Camera2CameraControlImp", "Camera is not active.");
            return new C1264m(new C1564n("Camera is not active."));
        }
        return C1263l.m3434f(C1257f.m3422a(C1263l.m3431c(this.f3581u)), new C1207j(this, list, i, this.f3577q, i2), this.f3563b);
    }

    /* renamed from: f */
    public final void mo4037f(C1308av avVar) {
        C1231g gVar = this.f3567f;
        C1234j c = C1233i.m3390a(avVar).mo4062c();
        synchronized (gVar.f3616d) {
            for (C1306at atVar : C1348ch.m3678f(c)) {
                gVar.f3617e.f3131a.mo4216c(atVar, C1339bz.f3819a, C1348ch.m3674b(c, atVar));
            }
        }
        C1263l.m3431c(C2169h.m6027a(new C1228d(gVar))).mo4106b(C1158d.f3397a, C1238a.m3410a());
    }

    /* renamed from: g */
    public final void mo4038g(C1351ck ckVar) {
        boolean isEmpty;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        C1202eq eqVar = (C1202eq) this.f3566e;
        C1439e eVar = eqVar.f3529c;
        while (true) {
            synchronized (eVar.f3993b) {
                isEmpty = eVar.f3992a.isEmpty();
            }
            if (!isEmpty) {
                ((C1473bs) eVar.mo4328a()).close();
            } else {
                C1314ba baVar = eqVar.f3535i;
                if (baVar != null) {
                    C1526dc dcVar = eqVar.f3533g;
                    if (dcVar != null) {
                        C60870cx c = C1263l.m3431c(baVar.f3777p);
                        Objects.requireNonNull(dcVar);
                        c.mo4106b(new C1200eo(dcVar), C1247j.m3414a());
                        eqVar.f3533g = null;
                    }
                    baVar.mo4177c();
                    eqVar.f3535i = null;
                }
                ImageWriter imageWriter = eqVar.f3536j;
                if (imageWriter != null) {
                    imageWriter.close();
                    eqVar.f3536j = null;
                }
                if (!eqVar.f3530d && eqVar.f3532f && !eqVar.f3527a.isEmpty() && eqVar.f3527a.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) eqVar.f3528b.mo3785a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
                    for (int i : validOutputFormatsForInput) {
                        if (i == 256) {
                            Size size = (Size) eqVar.f3527a.get(34);
                            C1497ca caVar = new C1497ca(C1497ca.m4002l(size.getWidth(), size.getHeight(), 34, 9));
                            eqVar.f3534h = caVar.f4116b;
                            eqVar.f3533g = new C1526dc(caVar);
                            caVar.mo4207j(new C1199en(eqVar), C1246i.m3413a());
                            eqVar.f3535i = new C1332bs(eqVar.f3533g.mo4202e(), new Size(eqVar.f3533g.mo4201d(), eqVar.f3533g.mo4198a()), 34);
                            C1526dc dcVar2 = eqVar.f3533g;
                            C60870cx c2 = C1263l.m3431c(eqVar.f3535i.f3777p);
                            Objects.requireNonNull(dcVar2);
                            c2.mo4106b(new C1200eo(dcVar2), C1247j.m3414a());
                            ckVar.mo4232g(eqVar.f3535i);
                            ckVar.mo4228c(eqVar.f3534h);
                            ckVar.mo4231f(new C1201ep(eqVar));
                            ckVar.f3837g = new InputConfiguration(eqVar.f3533g.mo4201d(), eqVar.f3533g.mo4198a(), eqVar.f3533g.mo4199b());
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
        while (true) {
        }
    }

    /* renamed from: h */
    public final void mo4039h() {
        C1231g gVar = this.f3567f;
        synchronized (gVar.f3616d) {
            gVar.f3617e = new C0988a();
        }
        C1263l.m3431c(C2169h.m6027a(new C1227c(gVar))).mo4106b(C1204g.f3538a, C1238a.m3410a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo4041j(boolean z) {
        this.f3569h = z;
        if (!z) {
            C1300an anVar = new C1300an();
            anVar.f3742c = this.f3582v;
            anVar.f3743d = true;
            C0988a aVar = new C0988a();
            aVar.mo3739d(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(mo4032a(1)));
            aVar.mo3739d(CaptureRequest.FLASH_MODE, 0);
            anVar.mo4161e(aVar.mo3736a());
            this.f3570i.mo3798a(Collections.singletonList(anVar.mo4157a()));
        }
        mo4033b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo4042k() {
        synchronized (this.f3571k) {
            this.f3576p++;
        }
    }

    /* renamed from: m */
    public final void mo4044m(int i) {
        if (!m3363o()) {
            C1477bw.m3983f("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f3577q = i;
        C1198em emVar = this.f3566e;
        boolean z = true;
        if (!(this.f3577q == 1 || this.f3577q == 0)) {
            z = false;
        }
        ((C1202eq) emVar).f3531e = z;
        this.f3581u = C1263l.m3431c(C2169h.m6027a(new C1203f(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo4045n(int i) {
        this.f3582v = i;
        this.f3564c.f3402e = i;
        this.f3568g.f3337f = this.f3582v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo4040i() {
        synchronized (this.f3571k) {
            int i = this.f3576p;
            if (i != 0) {
                this.f3576p = i - 1;
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo4043l(boolean z) {
        C1555ee e;
        C1159da daVar = this.f3564c;
        if (z != daVar.f3400c) {
            daVar.f3400c = z;
            if (!daVar.f3400c) {
                daVar.f3399b.f3562a.mo4030b();
                daVar.f3399b.f3562a.mo4030b();
                int length = daVar.f3403f.length;
                MeteringRectangle[] meteringRectangleArr = C1159da.f3398a;
                daVar.f3403f = meteringRectangleArr;
                daVar.f3404g = meteringRectangleArr;
                daVar.f3405h = meteringRectangleArr;
                daVar.f3399b.mo4033b();
            }
        }
        C1196ek ekVar = this.f3574n;
        if (ekVar.f3518e != z) {
            ekVar.f3518e = z;
            if (!z) {
                synchronized (ekVar.f3515b) {
                    ekVar.f3515b.mo4016a();
                    e = C1447j.m3914e(ekVar.f3515b);
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    ekVar.f3516c.mo5708l(e);
                } else {
                    ekVar.f3516c.mo5706i(e);
                }
                ekVar.f3517d.mo3752d();
                ekVar.f3514a.mo4033b();
            }
        }
        C1193eh ehVar = this.f3565d;
        if (ehVar.f3509c != z) {
            ehVar.f3509c = z;
            if (!z) {
                if (ehVar.f3511e) {
                    ehVar.f3511e = false;
                    ehVar.f3507a.mo4041j(false);
                    C1193eh.m3340b(ehVar.f3508b, 0);
                }
                C2164c cVar = ehVar.f3510d;
                if (cVar != null) {
                    cVar.mo5439d(new C1564n("Camera is not active."));
                    ehVar.f3510d = null;
                }
            }
        }
        C1154cw cwVar = this.f3575o;
        if (z != cwVar.f3394b) {
            cwVar.f3394b = z;
            if (!z) {
                synchronized (cwVar.f3393a.f3395a) {
                }
            }
        }
        C1231g gVar = this.f3567f;
        gVar.f3615c.execute(new C1226b(gVar, z));
    }
}
