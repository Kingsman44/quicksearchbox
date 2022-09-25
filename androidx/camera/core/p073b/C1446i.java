package androidx.camera.core.p073b;

import androidx.camera.core.C1477bw;
import androidx.camera.core.C1548dy;
import androidx.camera.core.C1551ea;
import androidx.camera.core.C1562l;
import androidx.camera.core.p069a.C1288ab;
import androidx.camera.core.p069a.C1292af;
import androidx.camera.core.p069a.C1308av;
import androidx.camera.core.p069a.C1376di;
import androidx.camera.core.p069a.C1391r;
import androidx.camera.core.p069a.C1396w;
import androidx.camera.core.p069a.C1399z;
import androidx.core.p097i.C1974i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: androidx.camera.core.b.i */
/* compiled from: PG */
public final class C1446i implements C1562l {

    /* renamed from: a */
    public final C1292af f4003a;

    /* renamed from: b */
    public final C1444g f4004b;

    /* renamed from: c */
    public final List f4005c = new ArrayList();

    /* renamed from: d */
    public C1391r f4006d = C1396w.f3925a;

    /* renamed from: e */
    public final Object f4007e = new Object();

    /* renamed from: f */
    private final LinkedHashSet f4008f;

    /* renamed from: g */
    private final C1288ab f4009g;

    /* renamed from: h */
    private final C1376di f4010h;

    /* renamed from: i */
    private boolean f4011i = true;

    /* renamed from: j */
    private C1308av f4012j = null;

    /* renamed from: k */
    private List f4013k = new ArrayList();

    public C1446i(LinkedHashSet linkedHashSet, C1288ab abVar, C1376di diVar) {
        this.f4003a = (C1292af) linkedHashSet.iterator().next();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(linkedHashSet);
        this.f4008f = linkedHashSet2;
        this.f4004b = new C1444g(linkedHashSet2);
        this.f4009g = abVar;
        this.f4010h = diVar;
    }

    /* renamed from: g */
    private final void m3906g(List list) {
        synchronized (this.f4007e) {
            if (!list.isEmpty()) {
                this.f4003a.mo3823i(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C1551ea eaVar = (C1551ea) it.next();
                    if (this.f4005c.contains(eaVar)) {
                        C1292af afVar = this.f4003a;
                        eaVar.mo4313e();
                        C1548dy q = eaVar.f4267t.mo3967q();
                        if (q != null) {
                            q.mo4411a();
                        }
                        synchronized (eaVar.f4264q) {
                            C1974i.m5313a(afVar == eaVar.f4271x);
                            eaVar.f4263p.remove(eaVar.f4271x);
                            eaVar.f4271x = null;
                        }
                        eaVar.f4268u = null;
                        eaVar.f4270w = null;
                        eaVar.f4267t = eaVar.f4266s;
                        eaVar.f4265r = null;
                        eaVar.f4269v = null;
                    } else {
                        C1477bw.m3980c("CameraUseCaseAdapter", "Attempting to detach non-attached UseCase: " + eaVar);
                    }
                }
                this.f4005c.removeAll(list);
            }
        }
    }

    /* renamed from: h */
    private final boolean m3907h() {
        boolean z;
        synchronized (this.f4007e) {
            z = true;
            if (this.f4006d.mo4289a() != 1) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final List mo4338a() {
        ArrayList arrayList;
        synchronized (this.f4007e) {
            arrayList = new ArrayList(this.f4005c);
        }
        return arrayList;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x018a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x01a8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:118:0x01c9 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x018e A[Catch:{ IllegalArgumentException -> 0x03d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01b5 A[Catch:{ IllegalArgumentException -> 0x03d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01b7 A[Catch:{ IllegalArgumentException -> 0x03d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01dc A[Catch:{ IllegalArgumentException -> 0x03d9 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4339b(java.util.Collection r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Object r2 = r1.f4007e
            monitor-enter(r2)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x03e4 }
            r0.<init>()     // Catch:{ all -> 0x03e4 }
            java.util.Iterator r3 = r18.iterator()     // Catch:{ all -> 0x03e4 }
        L_0x000e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x03e4 }
            if (r4 == 0) goto L_0x002e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.ea r4 = (androidx.camera.core.C1551ea) r4     // Catch:{ all -> 0x03e4 }
            java.util.List r5 = r1.f4005c     // Catch:{ all -> 0x03e4 }
            boolean r5 = r5.contains(r4)     // Catch:{ all -> 0x03e4 }
            if (r5 == 0) goto L_0x002a
            java.lang.String r4 = "CameraUseCaseAdapter"
            java.lang.String r5 = "Attempting to attach already attached UseCase"
            androidx.camera.core.C1477bw.m3978a(r4, r5)     // Catch:{ all -> 0x03e4 }
            goto L_0x000e
        L_0x002a:
            r0.add(r4)     // Catch:{ all -> 0x03e4 }
            goto L_0x000e
        L_0x002e:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x03e4 }
            java.util.List r4 = r1.f4005c     // Catch:{ all -> 0x03e4 }
            r3.<init>(r4)     // Catch:{ all -> 0x03e4 }
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ all -> 0x03e4 }
            java.util.List r5 = java.util.Collections.emptyList()     // Catch:{ all -> 0x03e4 }
            boolean r6 = r17.m3907h()     // Catch:{ all -> 0x03e4 }
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x023a
            java.util.List r4 = r1.f4013k     // Catch:{ all -> 0x03e4 }
            r3.removeAll(r4)     // Catch:{ all -> 0x03e4 }
            r3.addAll(r0)     // Catch:{ all -> 0x03e4 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x03e4 }
            java.util.List r5 = r1.f4013k     // Catch:{ all -> 0x03e4 }
            r4.<init>(r5)     // Catch:{ all -> 0x03e4 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x03e4 }
            r5.<init>(r4)     // Catch:{ all -> 0x03e4 }
            java.util.Iterator r6 = r3.iterator()     // Catch:{ all -> 0x03e4 }
            r9 = 0
            r10 = 0
        L_0x005f:
            boolean r11 = r6.hasNext()     // Catch:{ all -> 0x03e4 }
            if (r11 == 0) goto L_0x0077
            java.lang.Object r11 = r6.next()     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.ea r11 = (androidx.camera.core.C1551ea) r11     // Catch:{ all -> 0x03e4 }
            boolean r12 = r11 instanceof androidx.camera.core.C1506cj     // Catch:{ all -> 0x03e4 }
            if (r12 == 0) goto L_0x0071
            r10 = 1
            goto L_0x005f
        L_0x0071:
            boolean r11 = r11 instanceof androidx.camera.core.C1470bp     // Catch:{ all -> 0x03e4 }
            if (r11 == 0) goto L_0x005f
            r9 = 1
            goto L_0x005f
        L_0x0077:
            if (r9 == 0) goto L_0x007d
            if (r10 != 0) goto L_0x007d
            r6 = 1
            goto L_0x007e
        L_0x007d:
            r6 = 0
        L_0x007e:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x03e4 }
            r9 = 0
            r10 = 0
        L_0x0084:
            boolean r11 = r3.hasNext()     // Catch:{ all -> 0x03e4 }
            if (r11 == 0) goto L_0x009c
            java.lang.Object r11 = r3.next()     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.ea r11 = (androidx.camera.core.C1551ea) r11     // Catch:{ all -> 0x03e4 }
            boolean r12 = r11 instanceof androidx.camera.core.C1506cj     // Catch:{ all -> 0x03e4 }
            if (r12 == 0) goto L_0x0096
            r9 = 1
            goto L_0x0084
        L_0x0096:
            boolean r11 = r11 instanceof androidx.camera.core.C1470bp     // Catch:{ all -> 0x03e4 }
            if (r11 == 0) goto L_0x0084
            r10 = 1
            goto L_0x0084
        L_0x009c:
            if (r9 == 0) goto L_0x00a2
            if (r10 != 0) goto L_0x00a2
            r3 = 1
            goto L_0x00a3
        L_0x00a2:
            r3 = 0
        L_0x00a3:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x03e4 }
            r9 = 0
            r10 = r9
            r11 = r10
        L_0x00aa:
            boolean r12 = r4.hasNext()     // Catch:{ all -> 0x03e4 }
            if (r12 == 0) goto L_0x00c3
            java.lang.Object r12 = r4.next()     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.ea r12 = (androidx.camera.core.C1551ea) r12     // Catch:{ all -> 0x03e4 }
            boolean r13 = r12 instanceof androidx.camera.core.C1506cj     // Catch:{ all -> 0x03e4 }
            if (r13 == 0) goto L_0x00bc
            r10 = r12
            goto L_0x00aa
        L_0x00bc:
            boolean r13 = r12 instanceof androidx.camera.core.C1470bp     // Catch:{ all -> 0x03e4 }
            if (r13 != 0) goto L_0x00c1
            goto L_0x00aa
        L_0x00c1:
            r11 = r12
            goto L_0x00aa
        L_0x00c3:
            if (r6 == 0) goto L_0x00e4
            if (r10 != 0) goto L_0x00e4
            androidx.camera.core.cg r4 = new androidx.camera.core.cg     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.bz r6 = androidx.camera.core.p069a.C1339bz.m3625g()     // Catch:{ all -> 0x03e4 }
            r4.<init>(r6)     // Catch:{ all -> 0x03e4 }
            java.lang.String r6 = "Preview-Extra"
            r4.mo4380f(r6)     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.cj r4 = r4.mo4378d()     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.b.e r6 = androidx.camera.core.p073b.C1442e.f3999a     // Catch:{ all -> 0x03e4 }
            java.util.concurrent.Executor r10 = androidx.camera.core.C1506cj.f4143a     // Catch:{ all -> 0x03e4 }
            r4.mo4382h(r10, r6)     // Catch:{ all -> 0x03e4 }
            r5.add(r4)     // Catch:{ all -> 0x03e4 }
            goto L_0x00eb
        L_0x00e4:
            if (r6 != 0) goto L_0x00eb
            if (r10 == 0) goto L_0x00eb
            r5.remove(r10)     // Catch:{ all -> 0x03e4 }
        L_0x00eb:
            if (r3 == 0) goto L_0x021a
            if (r11 != 0) goto L_0x021a
            androidx.camera.core.bj r3 = new androidx.camera.core.bj     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.bz r4 = androidx.camera.core.p069a.C1339bz.m3625g()     // Catch:{ all -> 0x03e4 }
            r3.<init>(r4)     // Catch:{ all -> 0x03e4 }
            java.lang.String r4 = "ImageCapture-Extra"
            r3.mo4347e(r4)     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.bz r4 = r3.f4039a     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.at r6 = androidx.camera.core.p069a.C1324bk.f3811x     // Catch:{ all -> 0x03e4 }
            java.lang.Object r4 = r4.mo3953E(r6)     // Catch:{ IllegalArgumentException -> 0x0106 }
            goto L_0x0108
        L_0x0106:
            r4 = r9
        L_0x0108:
            if (r4 == 0) goto L_0x0120
            androidx.camera.core.a.bz r4 = r3.f4039a     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.at r6 = androidx.camera.core.p069a.C1324bk.f3807A     // Catch:{ all -> 0x03e4 }
            java.lang.Object r4 = r4.mo3953E(r6)     // Catch:{ IllegalArgumentException -> 0x0113 }
            goto L_0x0115
        L_0x0113:
            r4 = r9
        L_0x0115:
            if (r4 != 0) goto L_0x0118
            goto L_0x0120
        L_0x0118:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x03e4 }
            java.lang.String r3 = "Cannot use both setTargetResolution and setTargetAspectRatio on the same config."
            r0.<init>(r3)     // Catch:{ all -> 0x03e4 }
            throw r0     // Catch:{ all -> 0x03e4 }
        L_0x0120:
            androidx.camera.core.a.bz r4 = r3.f4039a     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.at r6 = androidx.camera.core.p069a.C1324bk.f3799e     // Catch:{ all -> 0x03e4 }
            java.lang.Object r4 = r4.mo3953E(r6)     // Catch:{ IllegalArgumentException -> 0x0129 }
            goto L_0x012a
        L_0x0129:
            r4 = r9
        L_0x012a:
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x03e4 }
            if (r4 == 0) goto L_0x014d
            androidx.camera.core.a.bz r6 = r3.f4039a     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.at r10 = androidx.camera.core.p069a.C1324bk.f3798d     // Catch:{ all -> 0x03e4 }
            java.lang.Object r6 = r6.mo3953E(r10)     // Catch:{ IllegalArgumentException -> 0x0137 }
            goto L_0x0139
        L_0x0137:
            r6 = r9
        L_0x0139:
            if (r6 != 0) goto L_0x013d
            r6 = 1
            goto L_0x013e
        L_0x013d:
            r6 = 0
        L_0x013e:
            java.lang.String r10 = "Cannot set buffer format with CaptureProcessor defined."
            androidx.core.p097i.C1974i.m5314b(r6, r10)     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.bz r6 = r3.f4039a     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.at r10 = androidx.camera.core.p069a.C1326bm.f3806w     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.au r11 = androidx.camera.core.p069a.C1339bz.f3819a     // Catch:{ all -> 0x03e4 }
            r6.mo4216c(r10, r11, r4)     // Catch:{ all -> 0x03e4 }
            goto L_0x0179
        L_0x014d:
            androidx.camera.core.a.bz r4 = r3.f4039a     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.at r6 = androidx.camera.core.p069a.C1324bk.f3798d     // Catch:{ all -> 0x03e4 }
            java.lang.Object r4 = r4.mo3953E(r6)     // Catch:{ IllegalArgumentException -> 0x0156 }
            goto L_0x0158
        L_0x0156:
            r4 = r9
        L_0x0158:
            if (r4 == 0) goto L_0x016a
            androidx.camera.core.a.bz r4 = r3.f4039a     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.at r6 = androidx.camera.core.p069a.C1326bm.f3806w     // Catch:{ all -> 0x03e4 }
            r10 = 35
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.au r11 = androidx.camera.core.p069a.C1339bz.f3819a     // Catch:{ all -> 0x03e4 }
            r4.mo4216c(r6, r11, r10)     // Catch:{ all -> 0x03e4 }
            goto L_0x0179
        L_0x016a:
            androidx.camera.core.a.bz r4 = r3.f4039a     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.at r6 = androidx.camera.core.p069a.C1326bm.f3806w     // Catch:{ all -> 0x03e4 }
            r10 = 256(0x100, float:3.59E-43)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.au r11 = androidx.camera.core.p069a.C1339bz.f3819a     // Catch:{ all -> 0x03e4 }
            r4.mo4216c(r6, r11, r10)     // Catch:{ all -> 0x03e4 }
        L_0x0179:
            androidx.camera.core.bp r4 = new androidx.camera.core.bp     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.bk r6 = r3.mo4273c()     // Catch:{ all -> 0x03e4 }
            r4.<init>(r6)     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.bz r6 = r3.f4039a     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.at r10 = androidx.camera.core.p069a.C1324bk.f3807A     // Catch:{ all -> 0x03e4 }
            java.lang.Object r9 = r6.mo3953E(r10)     // Catch:{ IllegalArgumentException -> 0x018a }
        L_0x018a:
            android.util.Size r9 = (android.util.Size) r9     // Catch:{ all -> 0x03e4 }
            if (r9 == 0) goto L_0x019b
            android.util.Rational r6 = new android.util.Rational     // Catch:{ all -> 0x03e4 }
            int r10 = r9.getWidth()     // Catch:{ all -> 0x03e4 }
            int r9 = r9.getHeight()     // Catch:{ all -> 0x03e4 }
            r6.<init>(r10, r9)     // Catch:{ all -> 0x03e4 }
        L_0x019b:
            androidx.camera.core.a.bz r6 = r3.f4039a     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.at r9 = androidx.camera.core.p069a.C1324bk.f3800f     // Catch:{ all -> 0x03e4 }
            r10 = 2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x03e4 }
            java.lang.Object r11 = r6.mo3953E(r9)     // Catch:{ IllegalArgumentException -> 0x01a8 }
        L_0x01a8:
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x03e4 }
            java.lang.String r6 = "Maximum outstanding image count must be at least 1"
            androidx.core.p097i.C1974i.m5319g(r11, r6)     // Catch:{ all -> 0x03e4 }
            int r6 = r11.intValue()     // Catch:{ all -> 0x03e4 }
            if (r6 <= 0) goto L_0x01b7
            r6 = 1
            goto L_0x01b8
        L_0x01b7:
            r6 = 0
        L_0x01b8:
            java.lang.String r9 = "Maximum outstanding image count must be at least 1"
            androidx.core.p097i.C1974i.m5314b(r6, r9)     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.bz r6 = r3.f4039a     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.at r9 = androidx.camera.core.p069a.C1324bk.f4014E     // Catch:{ all -> 0x03e4 }
            java.util.concurrent.Executor r11 = androidx.camera.core.p069a.p070a.p071a.C1246i.m3413a()     // Catch:{ all -> 0x03e4 }
            java.lang.Object r11 = r6.mo3953E(r9)     // Catch:{ IllegalArgumentException -> 0x01c9 }
        L_0x01c9:
            java.util.concurrent.Executor r11 = (java.util.concurrent.Executor) r11     // Catch:{ all -> 0x03e4 }
            java.lang.String r6 = "The IO executor can't be null"
            androidx.core.p097i.C1974i.m5319g(r11, r6)     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.bz r6 = r3.f4039a     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.at r9 = androidx.camera.core.p069a.C1324bk.f3796b     // Catch:{ all -> 0x03e4 }
            java.util.TreeMap r6 = r6.f3825d     // Catch:{ all -> 0x03e4 }
            boolean r6 = r6.containsKey(r9)     // Catch:{ all -> 0x03e4 }
            if (r6 == 0) goto L_0x0216
            androidx.camera.core.a.bz r3 = r3.f4039a     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.at r6 = androidx.camera.core.p069a.C1324bk.f3796b     // Catch:{ all -> 0x03e4 }
            java.lang.Object r3 = r3.mo3953E(r6)     // Catch:{ all -> 0x03e4 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x03e4 }
            if (r3 == 0) goto L_0x01fb
            int r6 = r3.intValue()     // Catch:{ all -> 0x03e4 }
            if (r6 == 0) goto L_0x0216
            int r6 = r3.intValue()     // Catch:{ all -> 0x03e4 }
            if (r6 == r7) goto L_0x0216
            int r6 = r3.intValue()     // Catch:{ all -> 0x03e4 }
            if (r6 != r10) goto L_0x01fb
            goto L_0x0216
        L_0x01fb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x03e4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x03e4 }
            r4.<init>()     // Catch:{ all -> 0x03e4 }
            java.lang.String r5 = "The flash mode is not allowed to set: "
            r4.append(r5)     // Catch:{ all -> 0x03e4 }
            r4.append(r3)     // Catch:{ all -> 0x03e4 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x03e4 }
            java.lang.String r3 = r5.concat(r3)     // Catch:{ all -> 0x03e4 }
            r0.<init>(r3)     // Catch:{ all -> 0x03e4 }
            throw r0     // Catch:{ all -> 0x03e4 }
        L_0x0216:
            r5.add(r4)     // Catch:{ all -> 0x03e4 }
            goto L_0x0221
        L_0x021a:
            if (r3 != 0) goto L_0x0221
            if (r11 == 0) goto L_0x0221
            r5.remove(r11)     // Catch:{ all -> 0x03e4 }
        L_0x0221:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x03e4 }
            r3.<init>(r5)     // Catch:{ all -> 0x03e4 }
            java.util.List r4 = r1.f4013k     // Catch:{ all -> 0x03e4 }
            r3.removeAll(r4)     // Catch:{ all -> 0x03e4 }
            r0.addAll(r3)     // Catch:{ all -> 0x03e4 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x03e4 }
            java.util.List r4 = r1.f4013k     // Catch:{ all -> 0x03e4 }
            r3.<init>(r4)     // Catch:{ all -> 0x03e4 }
            r3.removeAll(r5)     // Catch:{ all -> 0x03e4 }
            r4 = r5
            r5 = r3
        L_0x023a:
            androidx.camera.core.a.r r3 = r1.f4006d     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.di r3 = r3.mo4291l()     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.di r6 = r1.f4010h     // Catch:{ all -> 0x03e4 }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x03e4 }
            r9.<init>()     // Catch:{ all -> 0x03e4 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x03e4 }
        L_0x024b:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x03e4 }
            if (r11 == 0) goto L_0x0268
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.ea r11 = (androidx.camera.core.C1551ea) r11     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.b.h r12 = new androidx.camera.core.b.h     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.df r13 = r11.mo4311c(r8, r3)     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.df r14 = r11.mo4311c(r7, r6)     // Catch:{ all -> 0x03e4 }
            r12.<init>(r13, r14)     // Catch:{ all -> 0x03e4 }
            r9.put(r11, r12)     // Catch:{ all -> 0x03e4 }
            goto L_0x024b
        L_0x0268:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x03d9 }
            java.util.List r6 = r1.f4005c     // Catch:{ IllegalArgumentException -> 0x03d9 }
            r3.<init>(r6)     // Catch:{ IllegalArgumentException -> 0x03d9 }
            r3.removeAll(r5)     // Catch:{ IllegalArgumentException -> 0x03d9 }
            androidx.camera.core.a.af r6 = r1.f4003a     // Catch:{ IllegalArgumentException -> 0x03d9 }
            androidx.camera.camera2.b.aq r6 = r6.mo3816A()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x03d9 }
            r8.<init>()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            java.lang.String r10 = r6.f3271a     // Catch:{ IllegalArgumentException -> 0x03d9 }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ IllegalArgumentException -> 0x03d9 }
            r11.<init>()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IllegalArgumentException -> 0x03d9 }
        L_0x0288:
            boolean r12 = r3.hasNext()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            if (r12 == 0) goto L_0x02bf
            java.lang.Object r12 = r3.next()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            androidx.camera.core.ea r12 = (androidx.camera.core.C1551ea) r12     // Catch:{ IllegalArgumentException -> 0x03d9 }
            androidx.camera.core.a.ab r13 = r1.f4009g     // Catch:{ IllegalArgumentException -> 0x03d9 }
            int r14 = r12.mo4413o()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            android.util.Size r15 = r12.f4268u     // Catch:{ IllegalArgumentException -> 0x03d9 }
            androidx.camera.core.a.cv r13 = r13.mo3873a(r10, r14, r15)     // Catch:{ IllegalArgumentException -> 0x03d9 }
            int r14 = r12.mo4413o()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            android.util.Size r15 = r12.f4268u     // Catch:{ IllegalArgumentException -> 0x03d9 }
            androidx.camera.core.a.df r7 = r12.f4267t     // Catch:{ IllegalArgumentException -> 0x03d9 }
            android.util.Range r7 = r7.mo3966p()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            r16 = r3
            androidx.camera.core.a.b r3 = new androidx.camera.core.a.b     // Catch:{ IllegalArgumentException -> 0x03d9 }
            r3.<init>(r13, r14, r15, r7)     // Catch:{ IllegalArgumentException -> 0x03d9 }
            r8.add(r3)     // Catch:{ IllegalArgumentException -> 0x03d9 }
            android.util.Size r3 = r12.f4268u     // Catch:{ IllegalArgumentException -> 0x03d9 }
            r11.put(r12, r3)     // Catch:{ IllegalArgumentException -> 0x03d9 }
            r3 = r16
            r7 = 1
            goto L_0x0288
        L_0x02bf:
            boolean r3 = r0.isEmpty()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            if (r3 != 0) goto L_0x0323
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IllegalArgumentException -> 0x03d9 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ IllegalArgumentException -> 0x03d9 }
        L_0x02ce:
            boolean r12 = r7.hasNext()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            if (r12 == 0) goto L_0x02ec
            java.lang.Object r12 = r7.next()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            androidx.camera.core.ea r12 = (androidx.camera.core.C1551ea) r12     // Catch:{ IllegalArgumentException -> 0x03d9 }
            java.lang.Object r13 = r9.get(r12)     // Catch:{ IllegalArgumentException -> 0x03d9 }
            androidx.camera.core.b.h r13 = (androidx.camera.core.p073b.C1445h) r13     // Catch:{ IllegalArgumentException -> 0x03d9 }
            androidx.camera.core.a.df r14 = r13.f4001a     // Catch:{ IllegalArgumentException -> 0x03d9 }
            androidx.camera.core.a.df r13 = r13.f4002b     // Catch:{ IllegalArgumentException -> 0x03d9 }
            androidx.camera.core.a.df r13 = r12.mo4424z(r6, r14, r13)     // Catch:{ IllegalArgumentException -> 0x03d9 }
            r3.put(r13, r12)     // Catch:{ IllegalArgumentException -> 0x03d9 }
            goto L_0x02ce
        L_0x02ec:
            androidx.camera.core.a.ab r6 = r1.f4009g     // Catch:{ IllegalArgumentException -> 0x03d9 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x03d9 }
            java.util.Set r12 = r3.keySet()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            r7.<init>(r12)     // Catch:{ IllegalArgumentException -> 0x03d9 }
            java.util.Map r6 = r6.mo3874b(r10, r8, r7)     // Catch:{ IllegalArgumentException -> 0x03d9 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IllegalArgumentException -> 0x03d9 }
        L_0x0303:
            boolean r7 = r3.hasNext()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            if (r7 == 0) goto L_0x0323
            java.lang.Object r7 = r3.next()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ IllegalArgumentException -> 0x03d9 }
            java.lang.Object r8 = r7.getValue()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            androidx.camera.core.ea r8 = (androidx.camera.core.C1551ea) r8     // Catch:{ IllegalArgumentException -> 0x03d9 }
            java.lang.Object r7 = r7.getKey()     // Catch:{ IllegalArgumentException -> 0x03d9 }
            java.lang.Object r7 = r6.get(r7)     // Catch:{ IllegalArgumentException -> 0x03d9 }
            android.util.Size r7 = (android.util.Size) r7     // Catch:{ IllegalArgumentException -> 0x03d9 }
            r11.put(r8, r7)     // Catch:{ IllegalArgumentException -> 0x03d9 }
            goto L_0x0303
        L_0x0323:
            java.lang.Object r3 = r1.f4007e     // Catch:{ all -> 0x03e4 }
            monitor-enter(r3)     // Catch:{ all -> 0x03e4 }
            monitor-exit(r3)     // Catch:{ all -> 0x03d6 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x03e4 }
            r3.<init>()     // Catch:{ all -> 0x03e4 }
            java.util.Iterator r6 = r18.iterator()     // Catch:{ all -> 0x03e4 }
        L_0x0330:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x03e4 }
            if (r7 == 0) goto L_0x0350
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.ea r7 = (androidx.camera.core.C1551ea) r7     // Catch:{ all -> 0x03e4 }
            boolean r8 = r7 instanceof androidx.camera.core.C1506cj     // Catch:{ all -> 0x03e4 }
            if (r8 == 0) goto L_0x0330
            androidx.camera.core.cj r7 = (androidx.camera.core.C1506cj) r7     // Catch:{ all -> 0x03e4 }
            r8 = 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x03e4 }
            java.lang.Object r10 = r3.get(r10)     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.c.i r10 = (androidx.camera.core.p078c.C1490i) r10     // Catch:{ all -> 0x03e4 }
            r7.f4145c = r10     // Catch:{ all -> 0x03e4 }
            goto L_0x0330
        L_0x0350:
            r1.f4013k = r4     // Catch:{ all -> 0x03e4 }
            r1.m3906g(r5)     // Catch:{ all -> 0x03e4 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x03e4 }
        L_0x0359:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x03e4 }
            if (r4 == 0) goto L_0x03b2
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.ea r4 = (androidx.camera.core.C1551ea) r4     // Catch:{ all -> 0x03e4 }
            java.lang.Object r5 = r9.get(r4)     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.b.h r5 = (androidx.camera.core.p073b.C1445h) r5     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.af r6 = r1.f4003a     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.df r7 = r5.f4001a     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.df r5 = r5.f4002b     // Catch:{ all -> 0x03e4 }
            java.lang.Object r8 = r4.f4264q     // Catch:{ all -> 0x03e4 }
            monitor-enter(r8)     // Catch:{ all -> 0x03e4 }
            r4.f4271x = r6     // Catch:{ all -> 0x03af }
            java.util.Set r10 = r4.f4263p     // Catch:{ all -> 0x03af }
            r10.add(r6)     // Catch:{ all -> 0x03af }
            monitor-exit(r8)     // Catch:{ all -> 0x03af }
            r4.f4265r = r7     // Catch:{ all -> 0x03e4 }
            r4.f4269v = r5     // Catch:{ all -> 0x03e4 }
            androidx.camera.camera2.b.aq r5 = r6.mo3816A()     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.df r7 = r4.f4265r     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.df r8 = r4.f4269v     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.df r5 = r4.mo4424z(r5, r7, r8)     // Catch:{ all -> 0x03e4 }
            r4.f4267t = r5     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.a.df r5 = r4.f4267t     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.dy r5 = r5.mo3967q()     // Catch:{ all -> 0x03e4 }
            if (r5 == 0) goto L_0x039c
            r6.mo3816A()     // Catch:{ all -> 0x03e4 }
            r5.mo4412b()     // Catch:{ all -> 0x03e4 }
        L_0x039c:
            r4.mo4312d()     // Catch:{ all -> 0x03e4 }
            java.lang.Object r5 = r11.get(r4)     // Catch:{ all -> 0x03e4 }
            android.util.Size r5 = (android.util.Size) r5     // Catch:{ all -> 0x03e4 }
            r5.getClass()
            android.util.Size r5 = r4.mo4309a(r5)     // Catch:{ all -> 0x03e4 }
            r4.f4268u = r5     // Catch:{ all -> 0x03e4 }
            goto L_0x0359
        L_0x03af:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x03af }
            throw r0     // Catch:{ all -> 0x03e4 }
        L_0x03b2:
            java.util.List r3 = r1.f4005c     // Catch:{ all -> 0x03e4 }
            r3.addAll(r0)     // Catch:{ all -> 0x03e4 }
            boolean r3 = r1.f4011i     // Catch:{ all -> 0x03e4 }
            if (r3 == 0) goto L_0x03c0
            androidx.camera.core.a.af r3 = r1.f4003a     // Catch:{ all -> 0x03e4 }
            r3.mo3821g(r0)     // Catch:{ all -> 0x03e4 }
        L_0x03c0:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x03e4 }
        L_0x03c4:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x03e4 }
            if (r3 == 0) goto L_0x03d4
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x03e4 }
            androidx.camera.core.ea r3 = (androidx.camera.core.C1551ea) r3     // Catch:{ all -> 0x03e4 }
            r3.mo4421w()     // Catch:{ all -> 0x03e4 }
            goto L_0x03c4
        L_0x03d4:
            monitor-exit(r2)     // Catch:{ all -> 0x03e4 }
            return
        L_0x03d6:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03d6 }
            throw r0     // Catch:{ all -> 0x03e4 }
        L_0x03d9:
            r0 = move-exception
            androidx.camera.core.b.f r3 = new androidx.camera.core.b.f     // Catch:{ all -> 0x03e4 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x03e4 }
            r3.<init>(r0)     // Catch:{ all -> 0x03e4 }
            throw r3     // Catch:{ all -> 0x03e4 }
        L_0x03e4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03e4 }
            goto L_0x03e8
        L_0x03e7:
            throw r0
        L_0x03e8:
            goto L_0x03e7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p073b.C1446i.mo4339b(java.util.Collection):void");
    }

    /* renamed from: c */
    public final void mo4340c() {
        synchronized (this.f4007e) {
            if (!this.f4011i) {
                this.f4003a.mo3821g(this.f4005c);
                synchronized (this.f4007e) {
                    if (this.f4012j != null) {
                        this.f4003a.mo3819c().mo4037f(this.f4012j);
                    }
                }
                for (C1551ea w : this.f4005c) {
                    w.mo4421w();
                }
                this.f4011i = true;
            }
        }
    }

    /* renamed from: d */
    public final void mo4341d() {
        synchronized (this.f4007e) {
            if (this.f4011i) {
                this.f4003a.mo3823i(new ArrayList(this.f4005c));
                synchronized (this.f4007e) {
                    C1399z c = this.f4003a.mo3819c();
                    this.f4012j = c.mo4034c();
                    c.mo4039h();
                }
                this.f4011i = false;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001e */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4342e(java.util.Collection r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4007e
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0028 }
            r1.<init>(r3)     // Catch:{ all -> 0x0028 }
            r2.m3906g(r1)     // Catch:{ all -> 0x0028 }
            boolean r1 = r2.m3907h()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0026
            java.util.List r1 = r2.f4013k     // Catch:{ all -> 0x0028 }
            r1.removeAll(r3)     // Catch:{ all -> 0x0028 }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ f -> 0x001e }
            r2.mo4339b(r3)     // Catch:{ f -> 0x001e }
            goto L_0x0026
        L_0x001e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "Failed to add extra fake Preview or ImageCapture use case!"
            r3.<init>(r1)     // Catch:{ all -> 0x0028 }
            throw r3     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p073b.C1446i.mo4342e(java.util.Collection):void");
    }

    /* renamed from: f */
    public final void mo4343f(boolean z) {
        this.f4003a.mo3830p(z);
    }
}
