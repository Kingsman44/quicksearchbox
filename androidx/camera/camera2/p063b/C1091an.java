package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.camera.camera2.p063b.p064a.C1062e;
import androidx.camera.camera2.p063b.p064a.C1074q;
import androidx.camera.camera2.p063b.p064a.C1075r;
import androidx.camera.camera2.p063b.p064a.p066b.C1027l;
import androidx.camera.core.C1477bw;
import androidx.camera.core.C1551ea;
import androidx.camera.core.C1557g;
import androidx.camera.core.C1558h;
import androidx.camera.core.C1562l;
import androidx.camera.core.C1571u;
import androidx.camera.core.C1572v;
import androidx.camera.core.C1573w;
import androidx.camera.core.p069a.C1291ae;
import androidx.camera.core.p069a.C1292af;
import androidx.camera.core.p069a.C1295ai;
import androidx.camera.core.p069a.C1296aj;
import androidx.camera.core.p069a.C1302ap;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.C1335bv;
import androidx.camera.core.p069a.C1356cp;
import androidx.camera.core.p069a.C1357cq;
import androidx.camera.core.p069a.C1358cr;
import androidx.camera.core.p069a.C1369db;
import androidx.camera.core.p069a.C1370dc;
import androidx.camera.core.p069a.C1373df;
import androidx.camera.core.p069a.C1391r;
import androidx.camera.core.p069a.C1396w;
import androidx.camera.core.p069a.C1399z;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p071a.C1244g;
import androidx.camera.core.p069a.p070a.p071a.C1250m;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.core.p097i.C1974i;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.Objects;

/* renamed from: androidx.camera.camera2.b.an */
/* compiled from: PG */
public final class C1091an implements C1292af {

    /* renamed from: a */
    public final C1370dc f3242a;

    /* renamed from: b */
    public final C1217t f3243b;

    /* renamed from: c */
    public final C1089al f3244c;

    /* renamed from: d */
    public final C1094aq f3245d;

    /* renamed from: e */
    CameraDevice f3246e;

    /* renamed from: f */
    int f3247f;

    /* renamed from: g */
    C1148cq f3248g;

    /* renamed from: h */
    final Map f3249h;

    /* renamed from: i */
    final Set f3250i;

    /* renamed from: j */
    final Object f3251j;

    /* renamed from: k */
    boolean f3252k;

    /* renamed from: l */
    public volatile int f3253l = 1;

    /* renamed from: m */
    private final C1074q f3254m;

    /* renamed from: n */
    private final Executor f3255n;

    /* renamed from: o */
    private final ScheduledExecutorService f3256o;

    /* renamed from: p */
    private final C1335bv f3257p;

    /* renamed from: q */
    private final C1135cd f3258q;

    /* renamed from: r */
    private final C1083af f3259r;

    /* renamed from: s */
    private final C1296aj f3260s;

    /* renamed from: t */
    private C1164df f3261t;

    /* renamed from: u */
    private final C1151ct f3262u;

    /* renamed from: v */
    private final C1187eb f3263v;

    /* renamed from: w */
    private final Set f3264w;

    /* renamed from: x */
    private C1391r f3265x;

    /* renamed from: y */
    private C1358cr f3266y;

    /* renamed from: z */
    private final C1153cv f3267z;

    public C1091an(C1074q qVar, String str, C1094aq aqVar, C1296aj ajVar, Executor executor, Handler handler, C1153cv cvVar) {
        String str2;
        C1074q qVar2 = qVar;
        String str3 = str;
        C1094aq aqVar2 = aqVar;
        C1296aj ajVar2 = ajVar;
        C1335bv bvVar = new C1335bv();
        this.f3257p = bvVar;
        this.f3247f = 0;
        new AtomicInteger(0);
        this.f3249h = new LinkedHashMap();
        this.f3250i = new HashSet();
        this.f3264w = new HashSet();
        this.f3265x = C1396w.f3925a;
        this.f3251j = new Object();
        this.f3252k = false;
        this.f3254m = qVar2;
        this.f3260s = ajVar2;
        C1244g gVar = new C1244g(handler);
        this.f3256o = gVar;
        C1250m mVar = new C1250m(executor);
        this.f3255n = mVar;
        this.f3244c = new C1089al(this, mVar, gVar);
        this.f3242a = new C1370dc(str3);
        bvVar.mo4211a(C1291ae.CLOSED);
        C1135cd cdVar = new C1135cd(ajVar2);
        this.f3258q = cdVar;
        C1151ct ctVar = new C1151ct(mVar);
        this.f3262u = ctVar;
        this.f3267z = cvVar;
        this.f3248g = mo3817a();
        try {
            this.f3243b = new C1217t(qVar.mo3787a(str), mVar, new C1084ag(this), aqVar2.f3275e);
            this.f3245d = aqVar2;
            synchronized (aqVar2.f3273c) {
            }
            Integer num = (Integer) aqVar2.f3272b.mo3785a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            num.getClass();
            int intValue = num.intValue();
            if (intValue == 0) {
                str2 = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
            } else if (intValue == 1) {
                str2 = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
            } else if (intValue == 2) {
                str2 = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
            } else if (intValue == 3) {
                str2 = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
            } else if (intValue != 4) {
                str2 = "Unknown value: " + intValue;
            } else {
                str2 = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
            }
            C1477bw.m3982e("Camera2CameraInfo", "Device Level: ".concat(str2));
            aqVar2.f3274d.mo3843b(cdVar.f3350b);
            this.f3263v = new C1187eb(mVar, gVar, handler, ctVar, aqVar2.f3275e, C1027l.f3156a);
            C1083af afVar = new C1083af(this, str3);
            this.f3259r = afVar;
            synchronized (ajVar2.f3736a) {
                C1974i.m5315c(!ajVar2.f3737b.containsKey(this), "Camera is already registered: " + this);
                ajVar2.f3737b.put(this, new C1295ai(mVar, afVar));
            }
            ((C1075r) qVar2.f3211a).f3213a.registerAvailabilityCallback(mVar, afVar);
        } catch (C1062e e) {
            throw new C1573w(e);
        }
    }

    /* renamed from: B */
    private final void m3069B(boolean z) {
        CameraDevice.StateCallback stateCallback;
        if (!z) {
            this.f3244c.f3237b.f3230a = -1;
        }
        this.f3244c.mo3805b();
        mo3822h("Opening camera.", (Throwable) null);
        mo3838w(3, (C1571u) null, true);
        try {
            C1074q qVar = this.f3254m;
            String str = this.f3245d.f3271a;
            Executor executor = this.f3255n;
            ArrayList arrayList = new ArrayList(this.f3242a.mo4264a().mo4239a().f3843b);
            arrayList.add(this.f3262u.f3385f);
            arrayList.add(this.f3244c);
            if (arrayList.isEmpty()) {
                stateCallback = new C1134cc();
            } else if (arrayList.size() == 1) {
                stateCallback = (CameraDevice.StateCallback) arrayList.get(0);
            } else {
                stateCallback = new C1133cb(arrayList);
            }
            qVar.f3211a.mo3789b(str, executor, stateCallback);
        } catch (C1062e e) {
            mo3822h("Unable to open camera due to ".concat(String.valueOf(e.getMessage())), (Throwable) null);
            if (e.f3203b == 10001) {
                mo3838w(1, new C1558h(7, e), true);
            }
        } catch (SecurityException e2) {
            mo3822h("Unable to open camera due to ".concat(String.valueOf(e2.getMessage())), (Throwable) null);
            mo3838w(6, (C1571u) null, true);
            this.f3244c.mo3804a();
        }
    }

    /* renamed from: C */
    private final void m3070C() {
        if (this.f3261t != null) {
            C1370dc dcVar = this.f3242a;
            String str = "MeteringRepeating" + this.f3261t.hashCode();
            if (dcVar.f3864b.containsKey(str)) {
                C1369db dbVar = (C1369db) dcVar.f3864b.get(str);
                dbVar.f3861c = false;
                if (!dbVar.f3862d) {
                    dcVar.f3864b.remove(str);
                }
            }
            this.f3242a.mo4270g("MeteringRepeating" + this.f3261t.hashCode());
            C1164df dfVar = this.f3261t;
            C1477bw.m3978a("MeteringRepeating", "MeteringRepeating clear!");
            C1314ba baVar = dfVar.f3411a;
            if (baVar != null) {
                baVar.mo4177c();
            }
            dfVar.f3411a = null;
            this.f3261t = null;
        }
    }

    /* renamed from: D */
    private static final Collection m3071D(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C1551ea eaVar = (C1551ea) it.next();
            arrayList.add(new C1104b(m3073e(eaVar), eaVar.getClass(), eaVar.f4272y, eaVar.f4267t, eaVar.f4268u));
        }
        return arrayList;
    }

    /* renamed from: d */
    static String m3072d(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    /* renamed from: e */
    static String m3073e(C1551ea eaVar) {
        return eaVar.mo4418t() + eaVar.hashCode();
    }

    /* renamed from: A */
    public final C1094aq mo3816A() {
        return this.f3245d;
    }

    /* renamed from: a */
    public final C1148cq mo3817a() {
        synchronized (this.f3251j) {
            if (this.f3266y == null) {
                C1147cp cpVar = new C1147cp();
                return cpVar;
            }
            C1171dm dmVar = new C1171dm(this.f3266y, this.f3255n, this.f3256o);
            return dmVar;
        }
    }

    /* renamed from: b */
    public final C1391r mo3818b() {
        return this.f3265x;
    }

    /* renamed from: c */
    public final C1399z mo3819c() {
        return this.f3243b;
    }

    /* renamed from: f */
    public final void mo3820f() {
        C1357cq a = this.f3242a.mo4264a().mo4239a();
        C1302ap apVar = a.f3847f;
        int size = Collections.unmodifiableList(apVar.f3749c).size();
        int size2 = a.mo4242b().size();
        if (a.mo4242b().isEmpty()) {
            return;
        }
        if (Collections.unmodifiableList(apVar.f3749c).isEmpty()) {
            if (this.f3261t == null) {
                this.f3261t = new C1164df(this.f3245d.f3272b, this.f3267z);
            }
            if (this.f3261t != null) {
                C1164df dfVar = this.f3261t;
                this.f3242a.mo4269f("MeteringRepeating" + this.f3261t.hashCode(), dfVar.f3412b, dfVar.f3413c);
                C1164df dfVar2 = this.f3261t;
                this.f3242a.mo4268e("MeteringRepeating" + this.f3261t.hashCode(), dfVar2.f3412b, dfVar2.f3413c);
                return;
            }
            return;
        }
        if (size2 == 1) {
            if (size != 1) {
                size2 = 1;
            } else {
                m3070C();
                return;
            }
        }
        if (size >= 2) {
            m3070C();
            return;
        }
        C1477bw.m3978a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
    }

    /* renamed from: g */
    public final void mo3821g(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            this.f3243b.mo4042k();
            for (C1551ea eaVar : new ArrayList(arrayList)) {
                String e = m3073e(eaVar);
                if (!this.f3264w.contains(e)) {
                    this.f3264w.add(e);
                    eaVar.mo4355k();
                }
            }
            try {
                this.f3255n.execute(new C1221x(this, new ArrayList(m3071D(arrayList))));
            } catch (RejectedExecutionException e2) {
                mo3822h("Unable to attach use cases.", e2);
                this.f3243b.mo4040i();
            }
        }
    }

    /* renamed from: h */
    public final void mo3822h(String str, Throwable th) {
        C1477bw.m3979b("Camera2CameraImpl", String.format("{%s} %s", new Object[]{toString(), str}), th);
    }

    /* renamed from: i */
    public final void mo3823i(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(m3071D(arrayList));
            for (C1551ea eaVar : new ArrayList(arrayList)) {
                String e = m3073e(eaVar);
                if (this.f3264w.contains(e)) {
                    eaVar.mo4356l();
                    this.f3264w.remove(e);
                }
            }
            this.f3255n.execute(new C1220w(this, arrayList2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo3824j() {
        C1974i.m5315c(this.f3253l == 7 || this.f3253l == 5, (String) null);
        C1974i.m5315c(this.f3249h.isEmpty(), (String) null);
        this.f3246e = null;
        if (this.f3253l == 5) {
            mo3838w(1, (C1571u) null, true);
            return;
        }
        ((C1075r) this.f3254m.f3211a).f3213a.unregisterAvailabilityCallback(this.f3259r);
        mo3838w(8, (C1571u) null, true);
    }

    /* renamed from: k */
    public final void mo3825k(C1551ea eaVar) {
        this.f3255n.execute(new C1078aa(this, m3073e(eaVar), eaVar.f4272y, eaVar.f4267t));
    }

    /* renamed from: l */
    public final void mo3826l(C1551ea eaVar) {
        this.f3255n.execute(new C1219v(this, m3073e(eaVar)));
    }

    /* renamed from: m */
    public final void mo3827m(C1551ea eaVar) {
        this.f3255n.execute(new C1222y(this, m3073e(eaVar), eaVar.f4272y, eaVar.f4267t));
    }

    /* renamed from: n */
    public final void mo3828n(C1551ea eaVar) {
        this.f3255n.execute(new C1080ac(this, m3073e(eaVar), eaVar.f4272y, eaVar.f4267t));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: androidx.camera.camera2.b.ea} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: androidx.camera.camera2.b.dx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: androidx.camera.camera2.b.ea} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: androidx.camera.camera2.b.ea} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        r2 = 4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3829o() {
        /*
            r13 = this;
            int r0 = r13.f3253l
            r1 = 4
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0009
            r0 = 1
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            r1 = 0
            androidx.core.p097i.C1974i.m5315c(r0, r1)
            androidx.camera.core.a.dc r0 = r13.f3242a
            androidx.camera.core.a.cp r0 = r0.mo4264a()
            boolean r4 = r0.mo4241c()
            if (r4 != 0) goto L_0x0020
            java.lang.String r0 = "Unable to create capture session due to conflicting configurations"
            r13.mo3822h(r0, r1)
            return
        L_0x0020:
            androidx.camera.core.a.cq r1 = r0.mo4239a()
            androidx.camera.core.a.ap r1 = r1.f3847f
            androidx.camera.core.a.av r1 = r1.f3750d
            androidx.camera.core.a.at r4 = androidx.camera.camera2.p062a.C0989b.f3133b
            boolean r1 = r1.mo3960j(r4)
            if (r1 != 0) goto L_0x00b4
            androidx.camera.core.a.at r1 = androidx.camera.camera2.p062a.C0989b.f3133b
            androidx.camera.core.a.dc r4 = r13.f3242a
            java.util.Collection r4 = r4.mo4266c()
            androidx.camera.core.a.dc r5 = r13.f3242a
            java.util.Collection r5 = r5.mo4265b()
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            if (r6 >= r7) goto L_0x0048
            r2 = -1
            goto L_0x00ab
        L_0x0048:
            boolean r6 = r4.isEmpty()
            r7 = 0
            if (r6 == 0) goto L_0x0052
        L_0x0050:
            r2 = r7
            goto L_0x00ab
        L_0x0052:
            java.util.Iterator r5 = r5.iterator()
        L_0x0056:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x006a
            java.lang.Object r6 = r5.next()
            androidx.camera.core.a.cq r6 = (androidx.camera.core.p069a.C1357cq) r6
            androidx.camera.core.a.ap r6 = r6.f3847f
            int r6 = r6.f3751e
            r9 = 5
            if (r6 != r9) goto L_0x0056
            goto L_0x0050
        L_0x006a:
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 0
        L_0x0070:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x009c
            java.lang.Object r9 = r4.next()
            androidx.camera.core.a.df r9 = (androidx.camera.core.p069a.C1373df) r9
            boolean r10 = r9 instanceof androidx.camera.core.p069a.C1323bj
            if (r10 == 0) goto L_0x0081
            goto L_0x0050
        L_0x0081:
            boolean r10 = r9 instanceof androidx.camera.core.p069a.C1345ce
            if (r10 == 0) goto L_0x0087
            r6 = 1
            goto L_0x0070
        L_0x0087:
            boolean r10 = r9 instanceof androidx.camera.core.p069a.C1324bk
            r11 = 4
            if (r10 == 0) goto L_0x0093
            if (r5 == 0) goto L_0x0091
        L_0x008f:
            r2 = r11
            goto L_0x00ab
        L_0x0091:
            r3 = 1
            goto L_0x0070
        L_0x0093:
            boolean r9 = r9 instanceof androidx.camera.core.p069a.C1377dj
            if (r9 == 0) goto L_0x0070
            if (r3 == 0) goto L_0x009a
            goto L_0x008f
        L_0x009a:
            r5 = 1
            goto L_0x0070
        L_0x009c:
            if (r3 == 0) goto L_0x00a1
            r2 = 2
            goto L_0x00ab
        L_0x00a1:
            if (r5 == 0) goto L_0x00a6
            r2 = 3
            goto L_0x00ab
        L_0x00a6:
            if (r6 != 0) goto L_0x00a9
            goto L_0x0050
        L_0x00a9:
            r2 = 1
        L_0x00ab:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            androidx.camera.core.a.an r3 = r0.f3832b
            r3.mo4160d(r1, r2)
        L_0x00b4:
            androidx.camera.camera2.b.cq r1 = r13.f3248g
            androidx.camera.core.a.cq r0 = r0.mo4239a()
            android.hardware.camera2.CameraDevice r2 = r13.f3246e
            r2.getClass()
            androidx.camera.camera2.b.eb r3 = r13.f3263v
            androidx.camera.camera2.b.ed r4 = new androidx.camera.camera2.b.ed
            boolean r5 = r3.f3502g
            if (r5 == 0) goto L_0x00da
            androidx.camera.camera2.b.ea r5 = new androidx.camera.camera2.b.ea
            androidx.camera.core.a.cg r7 = r3.f3500e
            androidx.camera.core.a.cg r8 = r3.f3501f
            androidx.camera.camera2.b.ct r9 = r3.f3499d
            java.util.concurrent.Executor r10 = r3.f3496a
            java.util.concurrent.ScheduledExecutorService r11 = r3.f3497b
            android.os.Handler r3 = r3.f3498c
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x00e7
        L_0x00da:
            androidx.camera.camera2.b.dx r5 = new androidx.camera.camera2.b.dx
            androidx.camera.camera2.b.ct r6 = r3.f3499d
            java.util.concurrent.Executor r7 = r3.f3496a
            java.util.concurrent.ScheduledExecutorService r8 = r3.f3497b
            android.os.Handler r3 = r3.f3498c
            r5.<init>(r6, r7, r8)
        L_0x00e7:
            r4.<init>(r5)
            com.google.common.util.concurrent.cx r0 = r1.mo3921b(r0, r2, r4)
            androidx.camera.camera2.b.ae r1 = new androidx.camera.camera2.b.ae
            r1.<init>(r13)
            java.util.concurrent.Executor r2 = r13.f3255n
            androidx.camera.core.p069a.p070a.p072b.C1263l.m3436h(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p063b.C1091an.mo3829o():void");
    }

    /* renamed from: p */
    public final void mo3830p(boolean z) {
        this.f3255n.execute(new C1223z(this, z));
    }

    /* renamed from: q */
    public final void mo3831q(C1391r rVar) {
        if (rVar == null) {
            rVar = C1396w.f3925a;
        }
        C1358cr m = rVar.mo4292m();
        this.f3265x = rVar;
        synchronized (this.f3251j) {
            this.f3266y = m;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo3832r(boolean z) {
        mo3822h("Attempting to force open the camera.", (Throwable) null);
        if (!this.f3260s.mo4153c(this)) {
            mo3822h("No cameras available. Waiting for available camera before opening camera.", (Throwable) null);
            mo3838w(2, (C1571u) null, true);
            return;
        }
        m3069B(z);
    }

    /* renamed from: s */
    public final void mo3833s(boolean z) {
        mo3822h("Attempting to open the camera.", (Throwable) null);
        if (!this.f3259r.f3226a || !this.f3260s.mo4153c(this)) {
            mo3822h("No cameras available. Waiting for available camera before opening camera.", (Throwable) null);
            mo3838w(2, (C1571u) null, true);
            return;
        }
        m3069B(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo3834t() {
        C1370dc dcVar = this.f3242a;
        C1356cp cpVar = new C1356cp();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : dcVar.f3864b.entrySet()) {
            C1369db dbVar = (C1369db) entry.getValue();
            if (dbVar.f3862d && dbVar.f3861c) {
                cpVar.mo4240b(dbVar.f3859a);
                arrayList.add((String) entry.getKey());
            }
        }
        C1477bw.m3978a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + dcVar.f3863a);
        if (cpVar.mo4241c()) {
            this.f3243b.mo4045n(cpVar.mo4239a().f3847f.f3751e);
            cpVar.mo4240b(this.f3243b.mo4035d());
            this.f3248g.mo3930k(cpVar.mo4239a());
            return;
        }
        this.f3243b.mo4045n(1);
        this.f3248g.mo3930k(this.f3243b.mo4035d());
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", new Object[]{Integer.valueOf(hashCode()), this.f3245d.f3271a});
    }

    /* renamed from: u */
    public final void mo3836u() {
        boolean z = false;
        for (C1373df r : this.f3242a.mo4266c()) {
            z |= r.mo3968r();
        }
        ((C1202eq) this.f3243b.f3566e).f3530d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo3837v() {
        return this.f3249h.isEmpty() && this.f3250i.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo3838w(int i, C1571u uVar, boolean z) {
        C1291ae aeVar;
        C1291ae aeVar2;
        C1557g gVar;
        HashMap hashMap;
        boolean z2;
        mo3822h("Transitioning camera internal state: " + C1085ah.m3057a(this.f3253l) + " --> " + C1085ah.m3057a(i), (Throwable) null);
        this.f3253l = i;
        switch (i - 1) {
            case 0:
                aeVar = C1291ae.CLOSED;
                break;
            case 1:
                aeVar = C1291ae.PENDING_OPEN;
                break;
            case 2:
            case 5:
                aeVar = C1291ae.OPENING;
                break;
            case 3:
                aeVar = C1291ae.OPEN;
                break;
            case 4:
                aeVar = C1291ae.CLOSING;
                break;
            case 6:
                aeVar = C1291ae.RELEASING;
                break;
            default:
                aeVar = C1291ae.RELEASED;
                break;
        }
        C1296aj ajVar = this.f3260s;
        synchronized (ajVar.f3736a) {
            int i2 = ajVar.f3738c;
            if (aeVar == C1291ae.RELEASED) {
                C1295ai aiVar = (C1295ai) ajVar.f3737b.remove(this);
                if (aiVar != null) {
                    ajVar.mo4152a();
                    aeVar2 = aiVar.f3733a;
                } else {
                    aeVar2 = null;
                }
            } else {
                C1295ai aiVar2 = (C1295ai) ajVar.f3737b.get(this);
                C1974i.m5319g(aiVar2, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                C1291ae aeVar3 = aiVar2.f3733a;
                aiVar2.f3733a = aeVar;
                C1291ae aeVar4 = C1291ae.OPENING;
                if (aeVar == aeVar4) {
                    if (!C1296aj.m3482b(aeVar)) {
                        if (aeVar3 != aeVar4) {
                            z2 = false;
                            C1974i.m5315c(z2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
                        }
                    }
                    z2 = true;
                    C1974i.m5315c(z2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
                }
                if (aeVar3 != aeVar) {
                    ajVar.mo4152a();
                }
                aeVar2 = aeVar3;
            }
            if (aeVar2 != aeVar) {
                if (i2 <= 0 && ajVar.f3738c > 0) {
                    hashMap = new HashMap();
                    for (Map.Entry entry : ajVar.f3737b.entrySet()) {
                        if (((C1295ai) entry.getValue()).f3733a == C1291ae.PENDING_OPEN) {
                            hashMap.put((C1562l) entry.getKey(), (C1295ai) entry.getValue());
                        }
                    }
                } else if (aeVar != C1291ae.PENDING_OPEN || ajVar.f3738c <= 0) {
                    hashMap = null;
                } else {
                    hashMap = new HashMap();
                    hashMap.put(this, (C1295ai) ajVar.f3737b.get(this));
                }
                if (hashMap != null && !z) {
                    hashMap.remove(this);
                }
                if (hashMap != null) {
                    for (C1295ai a : hashMap.values()) {
                        a.mo4151a();
                    }
                }
            }
        }
        this.f3257p.mo4211a(aeVar);
        C1135cd cdVar = this.f3258q;
        switch (aeVar.ordinal()) {
            case 0:
                C1296aj ajVar2 = cdVar.f3349a;
                synchronized (ajVar2.f3736a) {
                    Iterator it = ajVar2.f3737b.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C1295ai) ((Map.Entry) it.next()).getValue()).f3733a == C1291ae.CLOSING) {
                                gVar = new C1557g(2, (C1571u) null);
                                break;
                            }
                        } else {
                            gVar = new C1557g(1, (C1571u) null);
                            break;
                        }
                    }
                }
            case 1:
                gVar = new C1557g(2, uVar);
                break;
            case 2:
                gVar = new C1557g(3, uVar);
                break;
            case 3:
            case 5:
                gVar = new C1557g(4, uVar);
                break;
            case 4:
            case 6:
                gVar = new C1557g(5, uVar);
                break;
            default:
                new StringBuilder("Unknown internal camera state: ").append(aeVar);
                throw new IllegalStateException("Unknown internal camera state: ".concat(String.valueOf(aeVar)));
        }
        C1477bw.m3978a("CameraStateMachine", "New public camera state " + gVar + " from " + aeVar + " and " + uVar);
        if (!Objects.equals((C1572v) cdVar.f3350b.mo3842a(), gVar)) {
            new StringBuilder("Publishing new public camera state ").append(gVar);
            C1477bw.m3978a("CameraStateMachine", "Publishing new public camera state ".concat(gVar.toString()));
            cdVar.f3350b.mo5706i(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo3839x() {
        boolean z = true;
        if (!(this.f3253l == 5 || this.f3253l == 7 || (this.f3253l == 6 && this.f3247f != 0))) {
            z = false;
        }
        C1974i.m5315c(z, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + C1085ah.m3057a(this.f3253l) + " (error: " + m3072d(this.f3247f) + ")");
        mo3840y();
        this.f3248g.mo3925f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo3840y() {
        C1974i.m5315c(this.f3248g != null, (String) null);
        mo3822h("Resetting Capture Session", (Throwable) null);
        C1148cq cqVar = this.f3248g;
        C1357cq a = cqVar.mo3920a();
        List d = cqVar.mo3923d();
        C1148cq a2 = mo3817a();
        this.f3248g = a2;
        a2.mo3930k(a);
        this.f3248g.mo3928i(d);
        cqVar.mo3926g();
        C60870cx o = cqVar.mo3934o();
        int i = this.f3253l;
        String a3 = C1085ah.m3057a(i);
        if (i != 0) {
            mo3822h("Releasing session in state ".concat(a3), (Throwable) null);
            this.f3249h.put(cqVar, o);
            C1263l.m3436h(o, new C1081ad(this, cqVar), C1238a.m3410a());
            return;
        }
        throw null;
    }

    /* renamed from: z */
    public final /* synthetic */ C1094aq mo3841z() {
        return this.f3245d;
    }
}
