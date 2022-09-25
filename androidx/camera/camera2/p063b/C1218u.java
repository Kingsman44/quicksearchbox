package androidx.camera.camera2.p063b;

import androidx.camera.camera2.p063b.p064a.C1062e;
import androidx.camera.camera2.p063b.p064a.C1074q;
import androidx.camera.core.C1573w;
import androidx.camera.core.p069a.C1290ad;
import androidx.camera.core.p069a.C1292af;
import androidx.camera.core.p069a.C1296aj;
import androidx.camera.core.p069a.C1297ak;
import androidx.camera.core.p069a.C1340c;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.camera.camera2.b.u */
/* compiled from: PG */
public final class C1218u implements C1290ad {

    /* renamed from: a */
    public final C1074q f3585a;

    /* renamed from: b */
    private final C1297ak f3586b;

    /* renamed from: c */
    private final C1296aj f3587c;

    /* renamed from: d */
    private final List f3588d;

    /* renamed from: e */
    private final C1153cv f3589e;

    /* renamed from: f */
    private final Map f3590f = new HashMap();

    /* JADX WARNING: Can't wrap try/catch for region: R(11:10|11|12|(1:14)(2:15|(2:17|(1:19)(2:20|(2:22|(1:24))(2:25|(1:29)))))|30|31|(4:34|(2:36|76)(1:75)|73|32)|74|37|(2:40|38)|77) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0091 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a0 A[Catch:{ e -> 0x014d, w -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c2 A[Catch:{ e -> 0x014d, w -> 0x0146 }, LOOP:2: B:38:0x00bc->B:40:0x00c2, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1218u(android.content.Context r8, androidx.camera.core.p069a.C1297ak r9, androidx.camera.core.C1570t r10) {
        /*
            r7 = this;
            r7.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r7.f3590f = r0
            r7.f3586b = r9
            androidx.camera.core.a.aj r9 = new androidx.camera.core.a.aj
            r9.<init>()
            r7.f3587c = r9
            androidx.camera.camera2.b.a.q r9 = androidx.camera.camera2.p063b.p064a.C1074q.m3045b(r8)
            r7.f3585a = r9
            androidx.camera.camera2.b.cv r8 = androidx.camera.camera2.p063b.C1153cv.m3205d(r8)
            r7.f3589e = r8
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ e -> 0x014d, w -> 0x0146 }
            r8.<init>()     // Catch:{ e -> 0x014d, w -> 0x0146 }
            androidx.camera.camera2.b.a.t r0 = r9.f3211a     // Catch:{ e -> 0x014d, w -> 0x0146 }
            java.lang.String[] r0 = r0.mo3790c()     // Catch:{ e -> 0x014d, w -> 0x0146 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ e -> 0x014d, w -> 0x0146 }
            java.lang.String r1 = "1"
            java.lang.String r2 = "0"
            if (r10 != 0) goto L_0x0048
            java.util.Iterator r9 = r0.iterator()     // Catch:{ e -> 0x014d, w -> 0x0146 }
        L_0x0038:
            boolean r10 = r9.hasNext()     // Catch:{ e -> 0x014d, w -> 0x0146 }
            if (r10 == 0) goto L_0x00ce
            java.lang.Object r10 = r9.next()     // Catch:{ e -> 0x014d, w -> 0x0146 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ e -> 0x014d, w -> 0x0146 }
            r8.add(r10)     // Catch:{ e -> 0x014d, w -> 0x0146 }
            goto L_0x0038
        L_0x0048:
            r3 = 0
            java.lang.Integer r4 = r10.mo4448a()     // Catch:{ IllegalStateException -> 0x0091 }
            if (r4 != 0) goto L_0x0050
            goto L_0x0091
        L_0x0050:
            boolean r5 = r0.contains(r2)     // Catch:{ IllegalStateException -> 0x0091 }
            if (r5 == 0) goto L_0x0091
            boolean r5 = r0.contains(r1)     // Catch:{ IllegalStateException -> 0x0091 }
            if (r5 != 0) goto L_0x005d
            goto L_0x0091
        L_0x005d:
            int r5 = r4.intValue()     // Catch:{ IllegalStateException -> 0x0091 }
            r6 = 1
            if (r5 != r6) goto L_0x0078
            androidx.camera.camera2.b.a.k r9 = r9.mo3787a(r2)     // Catch:{ IllegalStateException -> 0x0091 }
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ IllegalStateException -> 0x0091 }
            java.lang.Object r9 = r9.mo3785a(r4)     // Catch:{ IllegalStateException -> 0x0091 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ IllegalStateException -> 0x0091 }
            int r9 = r9.intValue()     // Catch:{ IllegalStateException -> 0x0091 }
            if (r9 != r6) goto L_0x0091
            r3 = r1
            goto L_0x0091
        L_0x0078:
            int r4 = r4.intValue()     // Catch:{ IllegalStateException -> 0x0091 }
            if (r4 != 0) goto L_0x0091
            androidx.camera.camera2.b.a.k r9 = r9.mo3787a(r1)     // Catch:{ IllegalStateException -> 0x0091 }
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ IllegalStateException -> 0x0091 }
            java.lang.Object r9 = r9.mo3785a(r4)     // Catch:{ IllegalStateException -> 0x0091 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ IllegalStateException -> 0x0091 }
            int r9 = r9.intValue()     // Catch:{ IllegalStateException -> 0x0091 }
            if (r9 != 0) goto L_0x0091
            r3 = r2
        L_0x0091:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ e -> 0x014d, w -> 0x0146 }
            r9.<init>()     // Catch:{ e -> 0x014d, w -> 0x0146 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ e -> 0x014d, w -> 0x0146 }
        L_0x009a:
            boolean r4 = r0.hasNext()     // Catch:{ e -> 0x014d, w -> 0x0146 }
            if (r4 == 0) goto L_0x00b4
            java.lang.Object r4 = r0.next()     // Catch:{ e -> 0x014d, w -> 0x0146 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ e -> 0x014d, w -> 0x0146 }
            boolean r5 = r4.equals(r3)     // Catch:{ e -> 0x014d, w -> 0x0146 }
            if (r5 != 0) goto L_0x009a
            androidx.camera.camera2.b.aq r4 = r7.mo4046a(r4)     // Catch:{ e -> 0x014d, w -> 0x0146 }
            r9.add(r4)     // Catch:{ e -> 0x014d, w -> 0x0146 }
            goto L_0x009a
        L_0x00b4:
            java.util.List r9 = r10.mo4450c(r9)     // Catch:{ e -> 0x014d, w -> 0x0146 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ e -> 0x014d, w -> 0x0146 }
        L_0x00bc:
            boolean r10 = r9.hasNext()     // Catch:{ e -> 0x014d, w -> 0x0146 }
            if (r10 == 0) goto L_0x00ce
            java.lang.Object r10 = r9.next()     // Catch:{ e -> 0x014d, w -> 0x0146 }
            androidx.camera.camera2.b.aq r10 = (androidx.camera.camera2.p063b.C1094aq) r10     // Catch:{ e -> 0x014d, w -> 0x0146 }
            java.lang.String r10 = r10.f3271a     // Catch:{ e -> 0x014d, w -> 0x0146 }
            r8.add(r10)     // Catch:{ e -> 0x014d, w -> 0x0146 }
            goto L_0x00bc
        L_0x00ce:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x00d7:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0143
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = r10.equals(r2)
            if (r0 != 0) goto L_0x013f
            boolean r0 = r10.equals(r1)
            if (r0 == 0) goto L_0x00f0
            goto L_0x013f
        L_0x00f0:
            java.lang.String r0 = "robolectric"
            java.lang.String r3 = android.os.Build.FINGERPRINT
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00fb
            goto L_0x0116
        L_0x00fb:
            androidx.camera.camera2.b.a.q r0 = r7.f3585a     // Catch:{ e -> 0x0133 }
            androidx.camera.camera2.b.a.k r0 = r0.mo3787a(r10)     // Catch:{ e -> 0x0133 }
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES     // Catch:{ e -> 0x0133 }
            java.lang.Object r0 = r0.mo3785a(r3)     // Catch:{ e -> 0x0133 }
            int[] r0 = (int[]) r0     // Catch:{ e -> 0x0133 }
            if (r0 == 0) goto L_0x011a
            int r3 = r0.length
            r4 = 0
        L_0x010d:
            if (r4 >= r3) goto L_0x011a
            r5 = r0[r4]
            if (r5 == 0) goto L_0x0116
            int r4 = r4 + 1
            goto L_0x010d
        L_0x0116:
            r9.add(r10)
            goto L_0x00d7
        L_0x011a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Camera "
            r0.<init>(r3)
            r0.append(r10)
            java.lang.String r10 = " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE."
            r0.append(r10)
            java.lang.String r10 = "Camera2CameraFactory"
            java.lang.String r0 = r0.toString()
            androidx.camera.core.C1477bw.m3978a(r10, r0)
            goto L_0x00d7
        L_0x0133:
            r8 = move-exception
            androidx.camera.core.bv r9 = new androidx.camera.core.bv
            androidx.camera.core.w r10 = new androidx.camera.core.w
            r10.<init>(r8)
            r9.<init>(r10)
            throw r9
        L_0x013f:
            r9.add(r10)
            goto L_0x00d7
        L_0x0143:
            r7.f3588d = r9
            return
        L_0x0146:
            r8 = move-exception
            androidx.camera.core.bv r9 = new androidx.camera.core.bv
            r9.<init>(r8)
            throw r9
        L_0x014d:
            r8 = move-exception
            androidx.camera.core.bv r9 = new androidx.camera.core.bv
            androidx.camera.core.w r10 = new androidx.camera.core.w
            r10.<init>(r8)
            r9.<init>(r10)
            goto L_0x015a
        L_0x0159:
            throw r9
        L_0x015a:
            goto L_0x0159
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p063b.C1218u.<init>(android.content.Context, androidx.camera.core.a.ak, androidx.camera.core.t):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1094aq mo4046a(String str) {
        try {
            C1094aq aqVar = (C1094aq) this.f3590f.get(str);
            if (aqVar != null) {
                return aqVar;
            }
            C1094aq aqVar2 = new C1094aq(str, this.f3585a);
            this.f3590f.put(str, aqVar2);
            return aqVar2;
        } catch (C1062e e) {
            throw new C1573w(e);
        }
    }

    /* renamed from: b */
    public final C1292af mo4047b(String str) {
        if (this.f3588d.contains(str)) {
            C1074q qVar = this.f3585a;
            C1094aq a = mo4046a(str);
            C1296aj ajVar = this.f3587c;
            C1340c cVar = (C1340c) this.f3586b;
            return new C1091an(qVar, str, a, ajVar, cVar.f3820a, cVar.f3821b, this.f3589e);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo4048c() {
        return this.f3585a;
    }

    /* renamed from: d */
    public final Set mo4049d() {
        return new LinkedHashSet(this.f3588d);
    }
}
