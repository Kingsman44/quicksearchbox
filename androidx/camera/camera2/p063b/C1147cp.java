package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.p062a.C0990c;
import androidx.camera.camera2.p062a.C0991d;
import androidx.camera.camera2.p062a.C0992e;
import androidx.camera.camera2.p063b.p064a.p067c.C1053k;
import androidx.camera.camera2.p063b.p064a.p067c.C1055m;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.C1300an;
import androidx.camera.core.p069a.C1302ap;
import androidx.camera.core.p069a.C1306at;
import androidx.camera.core.p069a.C1308av;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.C1339bz;
import androidx.camera.core.p069a.C1343cc;
import androidx.camera.core.p069a.C1357cq;
import androidx.camera.core.p069a.C1384k;
import androidx.camera.core.p069a.p070a.p072b.C1257f;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.camera.core.p069a.p070a.p072b.C1264m;
import androidx.core.p097i.C1974i;
import androidx.p104d.p105a.C2164c;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: androidx.camera.camera2.b.cp */
/* compiled from: PG */
final class C1147cp implements C1148cq {

    /* renamed from: a */
    final Object f3361a;

    /* renamed from: b */
    C1189ed f3362b;

    /* renamed from: c */
    C1174dp f3363c;

    /* renamed from: d */
    C1357cq f3364d;

    /* renamed from: e */
    C1308av f3365e;

    /* renamed from: f */
    C0992e f3366f;

    /* renamed from: g */
    List f3367g;

    /* renamed from: h */
    C60870cx f3368h;

    /* renamed from: i */
    C2164c f3369i;

    /* renamed from: j */
    final C1053k f3370j;

    /* renamed from: k */
    final C1055m f3371k;

    /* renamed from: l */
    int f3372l;

    /* renamed from: m */
    private final List f3373m;

    /* renamed from: n */
    private final CameraCaptureSession.CaptureCallback f3374n;

    /* renamed from: o */
    private final C1146co f3375o;

    /* renamed from: p */
    private final Map f3376p;

    public C1147cp() {
        this.f3361a = new Object();
        this.f3373m = new ArrayList();
        this.f3374n = new C1142ck();
        this.f3365e = C1343cc.f3824c;
        this.f3366f = C0992e.m2996b();
        this.f3376p = new HashMap();
        this.f3367g = Collections.emptyList();
        this.f3372l = 1;
        this.f3370j = new C1053k();
        this.f3371k = new C1055m();
        this.f3372l = 2;
        this.f3375o = new C1146co(this);
    }

    /* renamed from: a */
    public final C1357cq mo3920a() {
        C1357cq cqVar;
        synchronized (this.f3361a) {
            cqVar = this.f3364d;
        }
        return cqVar;
    }

    /* renamed from: d */
    public final List mo3923d() {
        List unmodifiableList;
        synchronized (this.f3361a) {
            unmodifiableList = Collections.unmodifiableList(this.f3373m);
        }
        return unmodifiableList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final List mo3924e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1300an anVar = new C1300an((C1302ap) it.next());
            anVar.f3742c = 1;
            for (C1314ba f : Collections.unmodifiableList(this.f3364d.f3847f.f3749c)) {
                anVar.mo4162f(f);
            }
            arrayList.add(anVar.mo4157a());
        }
        return arrayList;
    }

    /* renamed from: f */
    public final void mo3925f() {
        ArrayList arrayList;
        int i;
        synchronized (this.f3361a) {
            if (!this.f3373m.isEmpty()) {
                arrayList = new ArrayList(this.f3373m);
                this.f3373m.clear();
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Iterator it = ((C1302ap) arrayList.get(i2)).f3752f.iterator();
                while (true) {
                    i = i2 + 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    ((C1384k) it.next()).mo3868a();
                }
                i2 = i;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo3927h() {
        if (this.f3372l == 8) {
            C1477bw.m3978a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f3372l = 8;
        this.f3363c = null;
        C2164c cVar = this.f3369i;
        if (cVar != null) {
            cVar.mo5437b((Object) null);
            this.f3369i = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo3929j() {
        if (!this.f3373m.isEmpty()) {
            try {
                mo3931l(this.f3373m);
            } finally {
                this.f3373m.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        if (r5.f3751e != 2) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = r4 | (!r6);
        r6 = new androidx.camera.core.p069a.C1300an(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r5.f3751e != 5) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        r7 = r5.f3755i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        if (r7 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0090, code lost:
        r6.f3745f = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        r7 = r10.f3364d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        if (r7 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0096, code lost:
        r6.mo4161e(r7.f3847f.f3750d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        r6.mo4161e(r10.f3365e);
        r6.mo4161e(r5.f3750d);
        r6 = androidx.camera.camera2.p063b.C1124bt.m3147a(r6.mo4157a(), r10.f3363c.mo3982j(), r10.f3376p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b7, code lost:
        if (r6 != null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b9, code lost:
        androidx.camera.core.C1477bw.m3978a("CaptureSession", "Skipping issuing request without surface.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r7 = new java.util.ArrayList();
        r5 = r5.f3752f.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d1, code lost:
        if (r5.hasNext() == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d3, code lost:
        androidx.camera.camera2.p063b.C1138cg.m3160a((androidx.camera.core.p069a.C1384k) r5.next(), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dd, code lost:
        r1.mo3877a(r6, r7);
        r2.add(r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fe A[Catch:{ CameraAccessException -> 0x0170 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0121 A[EDGE_INSN: B:96:0x0121->B:58:0x0121 ?: BREAK  , SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3931l(java.util.List r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f3361a
            monitor-enter(r0)
            boolean r1 = r11.isEmpty()     // Catch:{ all -> 0x0190 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0190 }
            return
        L_0x000b:
            androidx.camera.camera2.b.by r1 = new androidx.camera.camera2.b.by     // Catch:{ CameraAccessException -> 0x0170 }
            r1.<init>()     // Catch:{ CameraAccessException -> 0x0170 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x0170 }
            r2.<init>()     // Catch:{ CameraAccessException -> 0x0170 }
            java.lang.String r3 = "CaptureSession"
            java.lang.String r4 = "Issuing capture request."
            androidx.camera.core.C1477bw.m3978a(r3, r4)     // Catch:{ CameraAccessException -> 0x0170 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ CameraAccessException -> 0x0170 }
            r3 = 0
            r4 = 0
        L_0x0022:
            boolean r5 = r11.hasNext()     // Catch:{ CameraAccessException -> 0x0170 }
            r6 = 2
            if (r5 == 0) goto L_0x00e5
            java.lang.Object r5 = r11.next()     // Catch:{ CameraAccessException -> 0x0170 }
            androidx.camera.core.a.ap r5 = (androidx.camera.core.p069a.C1302ap) r5     // Catch:{ CameraAccessException -> 0x0170 }
            java.util.List r7 = r5.f3749c     // Catch:{ CameraAccessException -> 0x0170 }
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)     // Catch:{ CameraAccessException -> 0x0170 }
            boolean r7 = r7.isEmpty()     // Catch:{ CameraAccessException -> 0x0170 }
            if (r7 == 0) goto L_0x0043
            java.lang.String r5 = "CaptureSession"
            java.lang.String r6 = "Skipping issuing empty capture request."
            androidx.camera.core.C1477bw.m3978a(r5, r6)     // Catch:{ CameraAccessException -> 0x0170 }
            goto L_0x0022
        L_0x0043:
            java.util.List r7 = r5.f3749c     // Catch:{ CameraAccessException -> 0x0170 }
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)     // Catch:{ CameraAccessException -> 0x0170 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ CameraAccessException -> 0x0170 }
        L_0x004d:
            boolean r8 = r7.hasNext()     // Catch:{ CameraAccessException -> 0x0170 }
            if (r8 == 0) goto L_0x0078
            java.lang.Object r8 = r7.next()     // Catch:{ CameraAccessException -> 0x0170 }
            androidx.camera.core.a.ba r8 = (androidx.camera.core.p069a.C1314ba) r8     // Catch:{ CameraAccessException -> 0x0170 }
            java.util.Map r9 = r10.f3376p     // Catch:{ CameraAccessException -> 0x0170 }
            boolean r9 = r9.containsKey(r8)     // Catch:{ CameraAccessException -> 0x0170 }
            if (r9 != 0) goto L_0x004d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ CameraAccessException -> 0x0170 }
            r5.<init>()     // Catch:{ CameraAccessException -> 0x0170 }
            java.lang.String r6 = "Skipping capture request with invalid surface: "
            r5.append(r6)     // Catch:{ CameraAccessException -> 0x0170 }
            r5.append(r8)     // Catch:{ CameraAccessException -> 0x0170 }
            java.lang.String r6 = "CaptureSession"
            java.lang.String r5 = r5.toString()     // Catch:{ CameraAccessException -> 0x0170 }
            androidx.camera.core.C1477bw.m3978a(r6, r5)     // Catch:{ CameraAccessException -> 0x0170 }
            goto L_0x0022
        L_0x0078:
            int r7 = r5.f3751e     // Catch:{ CameraAccessException -> 0x0170 }
            r8 = 1
            if (r7 != r6) goto L_0x007f
            r6 = 0
            goto L_0x0080
        L_0x007f:
            r6 = 1
        L_0x0080:
            r6 = r6 ^ r8
            r4 = r4 | r6
            androidx.camera.core.a.an r6 = new androidx.camera.core.a.an     // Catch:{ CameraAccessException -> 0x0170 }
            r6.<init>(r5)     // Catch:{ CameraAccessException -> 0x0170 }
            int r7 = r5.f3751e     // Catch:{ CameraAccessException -> 0x0170 }
            r8 = 5
            if (r7 != r8) goto L_0x0092
            androidx.camera.camera2.b.c r7 = r5.f3755i     // Catch:{ CameraAccessException -> 0x0170 }
            if (r7 == 0) goto L_0x0092
            r6.f3745f = r7     // Catch:{ CameraAccessException -> 0x0170 }
        L_0x0092:
            androidx.camera.core.a.cq r7 = r10.f3364d     // Catch:{ CameraAccessException -> 0x0170 }
            if (r7 == 0) goto L_0x009d
            androidx.camera.core.a.ap r7 = r7.f3847f     // Catch:{ CameraAccessException -> 0x0170 }
            androidx.camera.core.a.av r7 = r7.f3750d     // Catch:{ CameraAccessException -> 0x0170 }
            r6.mo4161e(r7)     // Catch:{ CameraAccessException -> 0x0170 }
        L_0x009d:
            androidx.camera.core.a.av r7 = r10.f3365e     // Catch:{ CameraAccessException -> 0x0170 }
            r6.mo4161e(r7)     // Catch:{ CameraAccessException -> 0x0170 }
            androidx.camera.core.a.av r7 = r5.f3750d     // Catch:{ CameraAccessException -> 0x0170 }
            r6.mo4161e(r7)     // Catch:{ CameraAccessException -> 0x0170 }
            androidx.camera.core.a.ap r6 = r6.mo4157a()     // Catch:{ CameraAccessException -> 0x0170 }
            androidx.camera.camera2.b.dp r7 = r10.f3363c     // Catch:{ CameraAccessException -> 0x0170 }
            android.hardware.camera2.CameraDevice r7 = r7.mo3982j()     // Catch:{ CameraAccessException -> 0x0170 }
            java.util.Map r8 = r10.f3376p     // Catch:{ CameraAccessException -> 0x0170 }
            android.hardware.camera2.CaptureRequest r6 = androidx.camera.camera2.p063b.C1124bt.m3147a(r6, r7, r8)     // Catch:{ CameraAccessException -> 0x0170 }
            if (r6 != 0) goto L_0x00c2
            java.lang.String r11 = "CaptureSession"
            java.lang.String r1 = "Skipping issuing request without surface."
            androidx.camera.core.C1477bw.m3978a(r11, r1)     // Catch:{ CameraAccessException -> 0x0170 }
            monitor-exit(r0)     // Catch:{ all -> 0x0190 }
            return
        L_0x00c2:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x0170 }
            r7.<init>()     // Catch:{ CameraAccessException -> 0x0170 }
            java.util.List r5 = r5.f3752f     // Catch:{ CameraAccessException -> 0x0170 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ CameraAccessException -> 0x0170 }
        L_0x00cd:
            boolean r8 = r5.hasNext()     // Catch:{ CameraAccessException -> 0x0170 }
            if (r8 == 0) goto L_0x00dd
            java.lang.Object r8 = r5.next()     // Catch:{ CameraAccessException -> 0x0170 }
            androidx.camera.core.a.k r8 = (androidx.camera.core.p069a.C1384k) r8     // Catch:{ CameraAccessException -> 0x0170 }
            androidx.camera.camera2.p063b.C1138cg.m3160a(r8, r7)     // Catch:{ CameraAccessException -> 0x0170 }
            goto L_0x00cd
        L_0x00dd:
            r1.mo3877a(r6, r7)     // Catch:{ CameraAccessException -> 0x0170 }
            r2.add(r6)     // Catch:{ CameraAccessException -> 0x0170 }
            goto L_0x0022
        L_0x00e5:
            boolean r11 = r2.isEmpty()     // Catch:{ CameraAccessException -> 0x0170 }
            if (r11 != 0) goto L_0x0168
            androidx.camera.camera2.b.a.c.k r11 = r10.f3370j     // Catch:{ CameraAccessException -> 0x0170 }
            boolean r11 = r11.f3184a     // Catch:{ CameraAccessException -> 0x0170 }
            if (r11 == 0) goto L_0x0121
            if (r4 != 0) goto L_0x00f4
            goto L_0x0121
        L_0x00f4:
            java.util.Iterator r11 = r2.iterator()     // Catch:{ CameraAccessException -> 0x0170 }
        L_0x00f8:
            boolean r3 = r11.hasNext()     // Catch:{ CameraAccessException -> 0x0170 }
            if (r3 == 0) goto L_0x0121
            java.lang.Object r3 = r11.next()     // Catch:{ CameraAccessException -> 0x0170 }
            android.hardware.camera2.CaptureRequest r3 = (android.hardware.camera2.CaptureRequest) r3     // Catch:{ CameraAccessException -> 0x0170 }
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE     // Catch:{ CameraAccessException -> 0x0170 }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ CameraAccessException -> 0x0170 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ CameraAccessException -> 0x0170 }
            int r3 = r3.intValue()     // Catch:{ CameraAccessException -> 0x0170 }
            if (r3 == r6) goto L_0x0115
            r5 = 3
            if (r3 != r5) goto L_0x00f8
        L_0x0115:
            androidx.camera.camera2.b.dp r11 = r10.f3363c     // Catch:{ CameraAccessException -> 0x0170 }
            r11.mo3988p()     // Catch:{ CameraAccessException -> 0x0170 }
            androidx.camera.camera2.b.ch r11 = new androidx.camera.camera2.b.ch     // Catch:{ CameraAccessException -> 0x0170 }
            r11.<init>(r10)     // Catch:{ CameraAccessException -> 0x0170 }
            r1.f3344b = r11     // Catch:{ CameraAccessException -> 0x0170 }
        L_0x0121:
            androidx.camera.camera2.b.a.c.m r11 = r10.f3371k     // Catch:{ CameraAccessException -> 0x0170 }
            boolean r11 = r11.f3188a     // Catch:{ CameraAccessException -> 0x0170 }
            if (r11 == 0) goto L_0x0161
            if (r4 == 0) goto L_0x0161
            java.util.Iterator r11 = r2.iterator()     // Catch:{ CameraAccessException -> 0x0170 }
        L_0x012d:
            boolean r3 = r11.hasNext()     // Catch:{ CameraAccessException -> 0x0170 }
            if (r3 == 0) goto L_0x0161
            java.lang.Object r3 = r11.next()     // Catch:{ CameraAccessException -> 0x0170 }
            android.hardware.camera2.CaptureRequest r3 = (android.hardware.camera2.CaptureRequest) r3     // Catch:{ CameraAccessException -> 0x0170 }
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.FLASH_MODE     // Catch:{ CameraAccessException -> 0x0170 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ CameraAccessException -> 0x0170 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ CameraAccessException -> 0x0170 }
            if (r3 == 0) goto L_0x012d
            int r3 = r3.intValue()     // Catch:{ CameraAccessException -> 0x0170 }
            if (r3 != r6) goto L_0x012d
            int r11 = r2.size()     // Catch:{ CameraAccessException -> 0x0170 }
            int r11 = r11 + -1
            java.lang.Object r11 = r2.get(r11)     // Catch:{ CameraAccessException -> 0x0170 }
            android.hardware.camera2.CaptureRequest r11 = (android.hardware.camera2.CaptureRequest) r11     // Catch:{ CameraAccessException -> 0x0170 }
            androidx.camera.camera2.b.cm r3 = new androidx.camera.camera2.b.cm     // Catch:{ CameraAccessException -> 0x0170 }
            r3.<init>(r10)     // Catch:{ CameraAccessException -> 0x0170 }
            java.util.List r3 = java.util.Collections.singletonList(r3)     // Catch:{ CameraAccessException -> 0x0170 }
            r1.mo3877a(r11, r3)     // Catch:{ CameraAccessException -> 0x0170 }
        L_0x0161:
            androidx.camera.camera2.b.dp r11 = r10.f3363c     // Catch:{ CameraAccessException -> 0x0170 }
            r11.mo3989q(r2, r1)     // Catch:{ CameraAccessException -> 0x0170 }
            monitor-exit(r0)     // Catch:{ all -> 0x0190 }
            return
        L_0x0168:
            java.lang.String r11 = "CaptureSession"
            java.lang.String r1 = "Skipping issuing burst request due to no valid request elements"
            androidx.camera.core.C1477bw.m3978a(r11, r1)     // Catch:{ CameraAccessException -> 0x0170 }
            goto L_0x018e
        L_0x0170:
            r11 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0190 }
            r2.<init>()     // Catch:{ all -> 0x0190 }
            java.lang.String r3 = "Unable to access camera: "
            r2.append(r3)     // Catch:{ all -> 0x0190 }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x0190 }
            r2.append(r11)     // Catch:{ all -> 0x0190 }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x0190 }
            androidx.camera.core.C1477bw.m3980c(r1, r11)     // Catch:{ all -> 0x0190 }
            java.lang.Thread.dumpStack()     // Catch:{ all -> 0x0190 }
        L_0x018e:
            monitor-exit(r0)     // Catch:{ all -> 0x0190 }
            return
        L_0x0190:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0190 }
            goto L_0x0194
        L_0x0193:
            throw r11
        L_0x0194:
            goto L_0x0193
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p063b.C1147cp.mo3931l(java.util.List):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo3933n() {
        synchronized (this.f3361a) {
            if (this.f3372l == 5) {
                mo3932m(this.f3364d);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3930k(androidx.camera.core.p069a.C1357cq r5) {
        /*
            r4 = this;
            java.lang.String r0 = "setSessionConfig() should not be possible in state: "
            java.lang.Object r1 = r4.f3361a
            monitor-enter(r1)
            int r2 = r4.f3372l     // Catch:{ all -> 0x0062 }
            int r3 = r2 + -1
            if (r2 == 0) goto L_0x0060
            switch(r3) {
                case 0: goto L_0x0046;
                case 1: goto L_0x0043;
                case 2: goto L_0x0043;
                case 3: goto L_0x0043;
                case 4: goto L_0x0017;
                case 5: goto L_0x000f;
                case 6: goto L_0x000f;
                case 7: goto L_0x000f;
                default: goto L_0x000e;
            }     // Catch:{ all -> 0x0062 }
        L_0x000e:
            goto L_0x005e
        L_0x000f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "Session configuration cannot be set on a closed/released session."
            r5.<init>(r0)     // Catch:{ all -> 0x0062 }
            throw r5     // Catch:{ all -> 0x0062 }
        L_0x0017:
            r4.f3364d = r5     // Catch:{ all -> 0x0062 }
            if (r5 != 0) goto L_0x001d
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            return
        L_0x001d:
            java.util.Map r0 = r4.f3376p     // Catch:{ all -> 0x0062 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0062 }
            java.util.List r5 = r5.mo4242b()     // Catch:{ all -> 0x0062 }
            boolean r5 = r0.containsAll(r5)     // Catch:{ all -> 0x0062 }
            if (r5 != 0) goto L_0x0036
            java.lang.String r5 = "CaptureSession"
            java.lang.String r0 = "Does not have the proper configured lists"
            androidx.camera.core.C1477bw.m3980c(r5, r0)     // Catch:{ all -> 0x0062 }
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            return
        L_0x0036:
            java.lang.String r5 = "CaptureSession"
            java.lang.String r0 = "Attempting to submit CaptureRequest after setting"
            androidx.camera.core.C1477bw.m3978a(r5, r0)     // Catch:{ all -> 0x0062 }
            androidx.camera.core.a.cq r5 = r4.f3364d     // Catch:{ all -> 0x0062 }
            r4.mo3932m(r5)     // Catch:{ all -> 0x0062 }
            goto L_0x005e
        L_0x0043:
            r4.f3364d = r5     // Catch:{ all -> 0x0062 }
            goto L_0x005e
        L_0x0046:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0062 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r2.<init>(r0)     // Catch:{ all -> 0x0062 }
            int r0 = r4.f3372l     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = androidx.camera.camera2.p063b.C1145cn.m3165a(r0)     // Catch:{ all -> 0x0062 }
            r2.append(r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0062 }
            r5.<init>(r0)     // Catch:{ all -> 0x0062 }
            throw r5     // Catch:{ all -> 0x0062 }
        L_0x005e:
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            return
        L_0x0060:
            r5 = 0
            throw r5     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p063b.C1147cp.mo3930k(androidx.camera.core.a.cq):void");
    }

    /* renamed from: i */
    public final void mo3928i(List list) {
        synchronized (this.f3361a) {
            int i = this.f3372l;
            int i2 = i - 1;
            if (i != 0) {
                switch (i2) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + C1145cn.m3165a(this.f3372l));
                    case 1:
                    case 2:
                    case 3:
                        this.f3373m.addAll(list);
                        break;
                    case 4:
                        this.f3373m.addAll(list);
                        mo3929j();
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } else {
                throw null;
            }
        }
    }

    /* renamed from: b */
    public final C60870cx mo3921b(C1357cq cqVar, CameraDevice cameraDevice, C1189ed edVar) {
        synchronized (this.f3361a) {
            int i = this.f3372l;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 != 1) {
                C1477bw.m3980c("CaptureSession", "Open not allowed in state: " + C1145cn.m3165a(this.f3372l));
                C1264m mVar = new C1264m(new IllegalStateException("open() should not allow the state: " + C1145cn.m3165a(this.f3372l)));
                return mVar;
            } else {
                this.f3372l = 3;
                ArrayList arrayList = new ArrayList(cqVar.mo4242b());
                this.f3367g = arrayList;
                this.f3362b = edVar;
                C60870cx f = C1263l.m3434f(C1257f.m3422a(edVar.f3503a.mo4007y(arrayList)), new C1140ci(this, cqVar, cameraDevice), this.f3362b.mo4013a());
                C1263l.m3436h(f, new C1143cl(this), this.f3362b.mo4013a());
                C60870cx c = C1263l.m3431c(f);
                return c;
            }
        }
    }

    /* renamed from: g */
    public final void mo3926g() {
        synchronized (this.f3361a) {
            int i = this.f3372l;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                if (this.f3364d != null) {
                                    C0991d a = this.f3366f.mo3745a();
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = a.f3140a.iterator();
                                    if (it.hasNext()) {
                                        C0990c cVar = (C0990c) it.next();
                                        throw null;
                                    } else if (!arrayList.isEmpty()) {
                                        try {
                                            mo3928i(mo3924e(arrayList));
                                        } catch (IllegalStateException e) {
                                            C1477bw.m3981d("CaptureSession", "Unable to issue the request before close the capture session", e);
                                        }
                                    }
                                }
                            }
                        }
                        C1974i.m5319g(this.f3362b, "The Opener shouldn't null in state:" + C1145cn.m3165a(this.f3372l));
                        this.f3362b.mo4014b();
                        this.f3372l = 6;
                        this.f3364d = null;
                    } else {
                        C1974i.m5319g(this.f3362b, "The Opener shouldn't null in state:" + C1145cn.m3165a(this.f3372l));
                        this.f3362b.mo4014b();
                    }
                }
                this.f3372l = 8;
            } else {
                throw new IllegalStateException("close() should not be possible in state: " + C1145cn.m3165a(this.f3372l));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r1 = r7.f3366f.mo3745a().f3140a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r1.hasNext() != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r7.f3372l = 7;
        androidx.core.p097i.C1974i.m5319g(r7.f3362b, "The Opener shouldn't null in state:" + androidx.camera.camera2.p063b.C1145cn.m3165a(r7.f3372l));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (r7.f3362b.mo4014b() == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        mo3927h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r7.f3368h != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r7.f3368h = androidx.p104d.p105a.C2169h.m6027a(new androidx.camera.camera2.p063b.C1141cj(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        r0 = r7.f3368h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r0 = (androidx.camera.camera2.p062a.C0990c) r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        r7.f3372l = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00aa, code lost:
        return androidx.camera.core.p069a.p070a.p072b.C1266o.f3667a;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo3934o() {
        /*
            r7 = this;
            java.lang.String r0 = "The Opener shouldn't null in state:"
            java.lang.String r1 = "The Opener shouldn't null in state:"
            java.lang.String r2 = "release() should not be possible in state: "
            java.lang.Object r3 = r7.f3361a
            monitor-enter(r3)
            int r4 = r7.f3372l     // Catch:{ all -> 0x00ac }
            int r5 = r4 + -1
            r6 = 0
            if (r4 == 0) goto L_0x00ab
            switch(r5) {
                case 0: goto L_0x008f;
                case 1: goto L_0x008a;
                case 2: goto L_0x006e;
                case 3: goto L_0x001c;
                case 4: goto L_0x0015;
                case 5: goto L_0x0015;
                case 6: goto L_0x0054;
                default: goto L_0x0013;
            }     // Catch:{ all -> 0x00ac }
        L_0x0013:
            goto L_0x00a7
        L_0x0015:
            androidx.camera.camera2.b.dp r1 = r7.f3363c     // Catch:{ all -> 0x00ac }
            if (r1 == 0) goto L_0x001c
            r1.mo3986n()     // Catch:{ all -> 0x00ac }
        L_0x001c:
            androidx.camera.camera2.a.e r1 = r7.f3366f     // Catch:{ all -> 0x00ac }
            androidx.camera.camera2.a.d r1 = r1.mo3745a()     // Catch:{ all -> 0x00ac }
            java.util.List r1 = r1.f3140a     // Catch:{ all -> 0x00ac }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ac }
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00ac }
            if (r2 != 0) goto L_0x0067
            r1 = 7
            r7.f3372l = r1     // Catch:{ all -> 0x00ac }
            androidx.camera.camera2.b.ed r1 = r7.f3362b     // Catch:{ all -> 0x00ac }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ac }
            r2.<init>(r0)     // Catch:{ all -> 0x00ac }
            int r0 = r7.f3372l     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = androidx.camera.camera2.p063b.C1145cn.m3165a(r0)     // Catch:{ all -> 0x00ac }
            r2.append(r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00ac }
            androidx.core.p097i.C1974i.m5319g(r1, r0)     // Catch:{ all -> 0x00ac }
            androidx.camera.camera2.b.ed r0 = r7.f3362b     // Catch:{ all -> 0x00ac }
            boolean r0 = r0.mo4014b()     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x0054
            r7.mo3927h()     // Catch:{ all -> 0x00ac }
            goto L_0x00a7
        L_0x0054:
            com.google.common.util.concurrent.cx r0 = r7.f3368h     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x0063
            androidx.camera.camera2.b.cj r0 = new androidx.camera.camera2.b.cj     // Catch:{ all -> 0x00ac }
            r0.<init>(r7)     // Catch:{ all -> 0x00ac }
            com.google.common.util.concurrent.cx r0 = androidx.p104d.p105a.C2169h.m6027a(r0)     // Catch:{ all -> 0x00ac }
            r7.f3368h = r0     // Catch:{ all -> 0x00ac }
        L_0x0063:
            com.google.common.util.concurrent.cx r0 = r7.f3368h     // Catch:{ all -> 0x00ac }
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            return r0
        L_0x0067:
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00ac }
            androidx.camera.camera2.a.c r0 = (androidx.camera.camera2.p062a.C0990c) r0     // Catch:{ all -> 0x00ac }
            throw r6     // Catch:{ all -> 0x00ac }
        L_0x006e:
            androidx.camera.camera2.b.ed r0 = r7.f3362b     // Catch:{ all -> 0x00ac }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ac }
            r2.<init>(r1)     // Catch:{ all -> 0x00ac }
            int r1 = r7.f3372l     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = androidx.camera.camera2.p063b.C1145cn.m3165a(r1)     // Catch:{ all -> 0x00ac }
            r2.append(r1)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00ac }
            androidx.core.p097i.C1974i.m5319g(r0, r1)     // Catch:{ all -> 0x00ac }
            androidx.camera.camera2.b.ed r0 = r7.f3362b     // Catch:{ all -> 0x00ac }
            r0.mo4014b()     // Catch:{ all -> 0x00ac }
        L_0x008a:
            r0 = 8
            r7.f3372l = r0     // Catch:{ all -> 0x00ac }
            goto L_0x00a7
        L_0x008f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ac }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ac }
            r1.<init>(r2)     // Catch:{ all -> 0x00ac }
            int r2 = r7.f3372l     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = androidx.camera.camera2.p063b.C1145cn.m3165a(r2)     // Catch:{ all -> 0x00ac }
            r1.append(r2)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ac }
            r0.<init>(r1)     // Catch:{ all -> 0x00ac }
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x00a7:
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            androidx.camera.core.a.a.b.p r0 = androidx.camera.core.p069a.p070a.p072b.C1266o.f3667a
            return r0
        L_0x00ab:
            throw r6     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p063b.C1147cp.mo3934o():com.google.common.util.concurrent.cx");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo3932m(C1357cq cqVar) {
        Object obj;
        Object obj2;
        synchronized (this.f3361a) {
            if (cqVar == null) {
                C1477bw.m3978a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return;
            }
            C1302ap apVar = cqVar.f3847f;
            if (Collections.unmodifiableList(apVar.f3749c).isEmpty()) {
                C1477bw.m3978a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f3363c.mo3988p();
                } catch (CameraAccessException e) {
                    C1477bw.m3980c("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
            } else {
                try {
                    C1477bw.m3978a("CaptureSession", "Issuing request for session.");
                    C1300an anVar = new C1300an(apVar);
                    C0991d a = this.f3366f.mo3745a();
                    ArrayList<C1302ap> arrayList = new ArrayList<>();
                    Iterator it = a.f3140a.iterator();
                    if (!it.hasNext()) {
                        C1339bz g = C1339bz.m3625g();
                        for (C1302ap apVar2 : arrayList) {
                            C1308av avVar = apVar2.f3750d;
                            for (C1306at atVar : avVar.mo3959i()) {
                                Object F = avVar.mo3954F(atVar, (Object) null);
                                if (g.f3825d.containsKey(atVar)) {
                                    try {
                                        obj2 = g.mo3953E(atVar);
                                    } catch (IllegalArgumentException unused) {
                                        obj2 = null;
                                    }
                                    if (!Objects.equals(obj2, F)) {
                                        C1477bw.m3978a("CaptureSession", "Detect conflicting option " + atVar.mo4170c() + " : " + F + " != " + obj2);
                                    }
                                } else {
                                    g.mo4216c(atVar, C1339bz.f3819a, F);
                                }
                            }
                        }
                        this.f3365e = g;
                        anVar.mo4161e(g);
                        CaptureRequest a2 = C1124bt.m3147a(anVar.mo4157a(), this.f3363c.mo3982j(), this.f3376p);
                        if (a2 == null) {
                            C1477bw.m3978a("CaptureSession", "Skipping issuing empty request for session.");
                            return;
                        }
                        List<C1384k> list = apVar.f3752f;
                        CameraCaptureSession.CaptureCallback[] captureCallbackArr = {this.f3374n};
                        ArrayList arrayList2 = new ArrayList(list.size() + 1);
                        for (C1384k kVar : list) {
                            if (kVar == null) {
                                obj = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                C1138cg.m3160a(kVar, arrayList3);
                                if (arrayList3.size() == 1) {
                                    obj = (CameraCaptureSession.CaptureCallback) arrayList3.get(0);
                                } else {
                                    obj = new C1095ar(arrayList3);
                                }
                            }
                            arrayList2.add(obj);
                        }
                        Collections.addAll(arrayList2, captureCallbackArr);
                        this.f3363c.mo3981i(a2, new C1095ar(arrayList2));
                        return;
                    }
                    C0990c cVar = (C0990c) it.next();
                    throw null;
                } catch (CameraAccessException e2) {
                    C1477bw.m3980c("CaptureSession", "Unable to access camera: " + e2.getMessage());
                    Thread.dumpStack();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0212, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0219, code lost:
        return new androidx.camera.core.p069a.p070a.p072b.C1264m(r11);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo3922c(java.util.List r11, androidx.camera.core.p069a.C1357cq r12, android.hardware.camera2.CameraDevice r13) {
        /*
            r10 = this;
            java.lang.String r0 = "openCaptureSession() not execute in state: "
            java.lang.String r1 = "openCaptureSession() should not be possible in state: "
            java.lang.Object r2 = r10.f3361a
            monitor-enter(r2)
            int r3 = r10.f3372l     // Catch:{ all -> 0x0240 }
            int r4 = r3 + -1
            r5 = 0
            if (r3 == 0) goto L_0x023f
            if (r4 == 0) goto L_0x0221
            r3 = 1
            if (r4 == r3) goto L_0x0221
            r6 = 4
            r7 = 2
            if (r4 == r7) goto L_0x0037
            if (r4 == r6) goto L_0x0221
            java.util.concurrent.CancellationException r11 = new java.util.concurrent.CancellationException     // Catch:{ all -> 0x0240 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0240 }
            r12.<init>(r0)     // Catch:{ all -> 0x0240 }
            int r13 = r10.f3372l     // Catch:{ all -> 0x0240 }
            java.lang.String r13 = androidx.camera.camera2.p063b.C1145cn.m3165a(r13)     // Catch:{ all -> 0x0240 }
            r12.append(r13)     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0240 }
            r11.<init>(r12)     // Catch:{ all -> 0x0240 }
            androidx.camera.core.a.a.b.m r12 = new androidx.camera.core.a.a.b.m     // Catch:{ all -> 0x0240 }
            r12.<init>(r11)     // Catch:{ all -> 0x0240 }
            monitor-exit(r2)     // Catch:{ all -> 0x0240 }
            return r12
        L_0x0037:
            java.util.Map r0 = r10.f3376p     // Catch:{ all -> 0x0240 }
            r0.clear()     // Catch:{ all -> 0x0240 }
            r0 = 0
            r1 = 0
        L_0x003e:
            int r4 = r11.size()     // Catch:{ all -> 0x0240 }
            if (r1 >= r4) goto L_0x005a
            java.util.Map r4 = r10.f3376p     // Catch:{ all -> 0x0240 }
            java.util.List r8 = r10.f3367g     // Catch:{ all -> 0x0240 }
            java.lang.Object r8 = r8.get(r1)     // Catch:{ all -> 0x0240 }
            androidx.camera.core.a.ba r8 = (androidx.camera.core.p069a.C1314ba) r8     // Catch:{ all -> 0x0240 }
            java.lang.Object r9 = r11.get(r1)     // Catch:{ all -> 0x0240 }
            android.view.Surface r9 = (android.view.Surface) r9     // Catch:{ all -> 0x0240 }
            r4.put(r8, r9)     // Catch:{ all -> 0x0240 }
            int r1 = r1 + 1
            goto L_0x003e
        L_0x005a:
            r10.f3372l = r6     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = "CaptureSession"
            java.lang.String r1 = "Opening capture session."
            androidx.camera.core.C1477bw.m3978a(r11, r1)     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.b.do[] r11 = new androidx.camera.camera2.p063b.C1173do[r7]     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.b.co r1 = r10.f3375o     // Catch:{ all -> 0x0240 }
            r11[r0] = r1     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.b.ee r1 = new androidx.camera.camera2.b.ee     // Catch:{ all -> 0x0240 }
            java.util.List r4 = r12.f3844c     // Catch:{ all -> 0x0240 }
            boolean r6 = r4.isEmpty()     // Catch:{ all -> 0x0240 }
            if (r6 == 0) goto L_0x0079
            androidx.camera.camera2.b.ca r0 = new androidx.camera.camera2.b.ca     // Catch:{ all -> 0x0240 }
            r0.<init>()     // Catch:{ all -> 0x0240 }
            goto L_0x008b
        L_0x0079:
            int r6 = r4.size()     // Catch:{ all -> 0x0240 }
            if (r6 != r3) goto L_0x0086
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x0240 }
            android.hardware.camera2.CameraCaptureSession$StateCallback r0 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r0     // Catch:{ all -> 0x0240 }
            goto L_0x008b
        L_0x0086:
            androidx.camera.camera2.b.bz r0 = new androidx.camera.camera2.b.bz     // Catch:{ all -> 0x0240 }
            r0.<init>(r4)     // Catch:{ all -> 0x0240 }
        L_0x008b:
            r1.<init>(r0)     // Catch:{ all -> 0x0240 }
            r11[r3] = r1     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.b.ef r0 = new androidx.camera.camera2.b.ef     // Catch:{ all -> 0x0240 }
            java.util.List r11 = java.util.Arrays.asList(r11)     // Catch:{ all -> 0x0240 }
            r0.<init>(r11)     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.a.b r11 = new androidx.camera.camera2.a.b     // Catch:{ all -> 0x0240 }
            androidx.camera.core.a.ap r1 = r12.f3847f     // Catch:{ all -> 0x0240 }
            androidx.camera.core.a.av r1 = r1.f3750d     // Catch:{ all -> 0x0240 }
            r11.<init>(r1)     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.a.e r1 = androidx.camera.camera2.p062a.C0992e.m2996b()     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.a.e r1 = r11.mo3742c(r1)     // Catch:{ all -> 0x0240 }
            r10.f3366f = r1     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.a.d r1 = r1.mo3745a()     // Catch:{ all -> 0x0240 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0240 }
            r3.<init>()     // Catch:{ all -> 0x0240 }
            java.util.List r1 = r1.f3140a     // Catch:{ all -> 0x0240 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0240 }
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x0240 }
            if (r4 != 0) goto L_0x021a
            androidx.camera.core.a.ap r1 = r12.f3847f     // Catch:{ all -> 0x0240 }
            androidx.camera.core.a.an r4 = new androidx.camera.core.a.an     // Catch:{ all -> 0x0240 }
            r4.<init>(r1)     // Catch:{ all -> 0x0240 }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x0240 }
        L_0x00cc:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0240 }
            if (r3 == 0) goto L_0x00de
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0240 }
            androidx.camera.core.a.ap r3 = (androidx.camera.core.p069a.C1302ap) r3     // Catch:{ all -> 0x0240 }
            androidx.camera.core.a.av r3 = r3.f3750d     // Catch:{ all -> 0x0240 }
            r4.mo4161e(r3)     // Catch:{ all -> 0x0240 }
            goto L_0x00cc
        L_0x00de:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0240 }
            r1.<init>()     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = r11.mo3744f()     // Catch:{ all -> 0x0240 }
            java.util.List r3 = r12.f3842a     // Catch:{ all -> 0x0240 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0240 }
        L_0x00ed:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x0240 }
            if (r5 == 0) goto L_0x017e
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x0240 }
            androidx.camera.core.a.co r5 = (androidx.camera.core.p069a.C1355co) r5     // Catch:{ all -> 0x0240 }
            java.util.Map r6 = r10.f3376p     // Catch:{ all -> 0x0240 }
            androidx.camera.core.a.ba r7 = r5.mo4236b()     // Catch:{ all -> 0x0240 }
            java.lang.Object r7 = r6.get(r7)     // Catch:{ all -> 0x0240 }
            android.view.Surface r7 = (android.view.Surface) r7     // Catch:{ all -> 0x0240 }
            java.lang.String r8 = "Surface in OutputConfig not found in configuredSurfaceMap."
            androidx.core.p097i.C1974i.m5319g(r7, r8)     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.b.a.a.d r8 = new androidx.camera.camera2.b.a.a.d     // Catch:{ all -> 0x0240 }
            int r9 = r5.mo4235a()     // Catch:{ all -> 0x0240 }
            r8.<init>(r9, r7)     // Catch:{ all -> 0x0240 }
            if (r11 == 0) goto L_0x011b
            androidx.camera.camera2.b.a.a.k r7 = r8.f3147a     // Catch:{ all -> 0x0240 }
            r7.mo3770e(r11)     // Catch:{ all -> 0x0240 }
            goto L_0x0124
        L_0x011b:
            java.lang.String r7 = r5.mo4237c()     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.b.a.a.k r9 = r8.f3147a     // Catch:{ all -> 0x0240 }
            r9.mo3770e(r7)     // Catch:{ all -> 0x0240 }
        L_0x0124:
            java.util.List r7 = r5.mo4238d()     // Catch:{ all -> 0x0240 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0240 }
            if (r7 != 0) goto L_0x0158
            androidx.camera.camera2.b.a.a.k r7 = r8.f3147a     // Catch:{ all -> 0x0240 }
            r7.mo3769d()     // Catch:{ all -> 0x0240 }
            java.util.List r5 = r5.mo4238d()     // Catch:{ all -> 0x0240 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0240 }
        L_0x013b:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x0240 }
            if (r7 == 0) goto L_0x0158
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x0240 }
            androidx.camera.core.a.ba r7 = (androidx.camera.core.p069a.C1314ba) r7     // Catch:{ all -> 0x0240 }
            java.lang.Object r7 = r6.get(r7)     // Catch:{ all -> 0x0240 }
            android.view.Surface r7 = (android.view.Surface) r7     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = "Surface in OutputConfig not found in configuredSurfaceMap."
            androidx.core.p097i.C1974i.m5319g(r7, r9)     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.b.a.a.k r9 = r8.f3147a     // Catch:{ all -> 0x0240 }
            r9.mo3768c(r7)     // Catch:{ all -> 0x0240 }
            goto L_0x013b
        L_0x0158:
            androidx.camera.core.a.ap r5 = r12.f3847f     // Catch:{ all -> 0x0240 }
            androidx.camera.core.a.av r5 = r5.f3750d     // Catch:{ all -> 0x0240 }
            androidx.camera.core.a.at r6 = androidx.camera.camera2.p062a.C0989b.f3133b     // Catch:{ all -> 0x0240 }
            boolean r5 = r5.mo3960j(r6)     // Catch:{ all -> 0x0240 }
            if (r5 == 0) goto L_0x0179
            androidx.camera.core.a.ap r5 = r12.f3847f     // Catch:{ all -> 0x0240 }
            androidx.camera.core.a.av r5 = r5.f3750d     // Catch:{ all -> 0x0240 }
            androidx.camera.core.a.at r6 = androidx.camera.camera2.p062a.C0989b.f3133b     // Catch:{ all -> 0x0240 }
            java.lang.Object r5 = r5.mo3953E(r6)     // Catch:{ all -> 0x0240 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0240 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.b.a.a.k r7 = r8.f3147a     // Catch:{ all -> 0x0240 }
            r7.mo3771f(r5)     // Catch:{ all -> 0x0240 }
        L_0x0179:
            r1.add(r8)     // Catch:{ all -> 0x0240 }
            goto L_0x00ed
        L_0x017e:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0240 }
            r11.<init>()     // Catch:{ all -> 0x0240 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0240 }
            r3.<init>()     // Catch:{ all -> 0x0240 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0240 }
        L_0x018c:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x0240 }
            if (r5 == 0) goto L_0x01b1
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.b.a.a.d r5 = (androidx.camera.camera2.p063b.p064a.p065a.C0999d) r5     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.b.a.a.k r6 = r5.f3147a     // Catch:{ all -> 0x0240 }
            android.view.Surface r6 = r6.mo3764a()     // Catch:{ all -> 0x0240 }
            boolean r6 = r11.contains(r6)     // Catch:{ all -> 0x0240 }
            if (r6 != 0) goto L_0x018c
            androidx.camera.camera2.b.a.a.k r6 = r5.f3147a     // Catch:{ all -> 0x0240 }
            android.view.Surface r6 = r6.mo3764a()     // Catch:{ all -> 0x0240 }
            r11.add(r6)     // Catch:{ all -> 0x0240 }
            r3.add(r5)     // Catch:{ all -> 0x0240 }
            goto L_0x018c
        L_0x01b1:
            androidx.camera.camera2.b.ed r11 = r10.f3362b     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.b.ec r11 = r11.f3503a     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.b.a.a.m r11 = r11.mo4006x(r3, r0)     // Catch:{ all -> 0x0240 }
            androidx.camera.core.a.ap r0 = r12.f3847f     // Catch:{ all -> 0x0240 }
            int r0 = r0.f3751e     // Catch:{ all -> 0x0240 }
            r1 = 5
            if (r0 != r1) goto L_0x01ea
            android.hardware.camera2.params.InputConfiguration r12 = r12.f3848g     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x01ea
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0240 }
            r1 = 31
            if (r0 < r1) goto L_0x01d5
            androidx.camera.camera2.b.a.a.c r0 = new androidx.camera.camera2.b.a.a.c     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.b.a.a.b r1 = new androidx.camera.camera2.b.a.a.b     // Catch:{ all -> 0x0240 }
            r1.<init>(r12)     // Catch:{ all -> 0x0240 }
            r0.<init>(r1)     // Catch:{ all -> 0x0240 }
            goto L_0x01df
        L_0x01d5:
            androidx.camera.camera2.b.a.a.c r0 = new androidx.camera.camera2.b.a.a.c     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.b.a.a.a r1 = new androidx.camera.camera2.b.a.a.a     // Catch:{ all -> 0x0240 }
            r1.<init>(r12)     // Catch:{ all -> 0x0240 }
            r0.<init>(r1)     // Catch:{ all -> 0x0240 }
        L_0x01df:
            androidx.camera.camera2.b.a.a.l r12 = r11.f3150a     // Catch:{ all -> 0x0240 }
            android.hardware.camera2.params.SessionConfiguration r12 = r12.f3149a     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.b.a.a.a r0 = r0.f3146a     // Catch:{ all -> 0x0240 }
            android.hardware.camera2.params.InputConfiguration r0 = r0.f3145a     // Catch:{ all -> 0x0240 }
            r12.setInputConfiguration(r0)     // Catch:{ all -> 0x0240 }
        L_0x01ea:
            androidx.camera.core.a.ap r12 = r4.mo4157a()     // Catch:{ CameraAccessException -> 0x0212 }
            int r0 = r12.f3751e     // Catch:{ CameraAccessException -> 0x0212 }
            android.hardware.camera2.CaptureRequest$Builder r0 = r13.createCaptureRequest(r0)     // Catch:{ CameraAccessException -> 0x0212 }
            androidx.camera.core.a.av r12 = r12.f3750d     // Catch:{ CameraAccessException -> 0x0212 }
            androidx.camera.camera2.p063b.C1124bt.m3148b(r0, r12)     // Catch:{ CameraAccessException -> 0x0212 }
            android.hardware.camera2.CaptureRequest r12 = r0.build()     // Catch:{ CameraAccessException -> 0x0212 }
            if (r12 == 0) goto L_0x0206
            androidx.camera.camera2.b.a.a.l r0 = r11.f3150a     // Catch:{ CameraAccessException -> 0x0212 }
            android.hardware.camera2.params.SessionConfiguration r0 = r0.f3149a     // Catch:{ CameraAccessException -> 0x0212 }
            r0.setSessionParameters(r12)     // Catch:{ CameraAccessException -> 0x0212 }
        L_0x0206:
            androidx.camera.camera2.b.ed r12 = r10.f3362b     // Catch:{ all -> 0x0240 }
            java.util.List r0 = r10.f3367g     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.b.ec r12 = r12.f3503a     // Catch:{ all -> 0x0240 }
            com.google.common.util.concurrent.cx r11 = r12.mo4000r(r13, r11, r0)     // Catch:{ all -> 0x0240 }
            monitor-exit(r2)     // Catch:{ all -> 0x0240 }
            return r11
        L_0x0212:
            r11 = move-exception
            androidx.camera.core.a.a.b.m r12 = new androidx.camera.core.a.a.b.m     // Catch:{ all -> 0x0240 }
            r12.<init>(r11)     // Catch:{ all -> 0x0240 }
            monitor-exit(r2)     // Catch:{ all -> 0x0240 }
            return r12
        L_0x021a:
            java.lang.Object r11 = r1.next()     // Catch:{ all -> 0x0240 }
            androidx.camera.camera2.a.c r11 = (androidx.camera.camera2.p062a.C0990c) r11     // Catch:{ all -> 0x0240 }
            throw r5     // Catch:{ all -> 0x0240 }
        L_0x0221:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0240 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0240 }
            r12.<init>(r1)     // Catch:{ all -> 0x0240 }
            int r13 = r10.f3372l     // Catch:{ all -> 0x0240 }
            java.lang.String r13 = androidx.camera.camera2.p063b.C1145cn.m3165a(r13)     // Catch:{ all -> 0x0240 }
            r12.append(r13)     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0240 }
            r11.<init>(r12)     // Catch:{ all -> 0x0240 }
            androidx.camera.core.a.a.b.m r12 = new androidx.camera.core.a.a.b.m     // Catch:{ all -> 0x0240 }
            r12.<init>(r11)     // Catch:{ all -> 0x0240 }
            monitor-exit(r2)     // Catch:{ all -> 0x0240 }
            return r12
        L_0x023f:
            throw r5     // Catch:{ all -> 0x0240 }
        L_0x0240:
            r11 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0240 }
            goto L_0x0244
        L_0x0243:
            throw r11
        L_0x0244:
            goto L_0x0243
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p063b.C1147cp.mo3922c(java.util.List, androidx.camera.core.a.cq, android.hardware.camera2.CameraDevice):com.google.common.util.concurrent.cx");
    }
}
