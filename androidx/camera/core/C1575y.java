package androidx.camera.core;

import android.content.Context;
import androidx.p104d.p105a.C2164c;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.y */
/* compiled from: PG */
public final /* synthetic */ class C1575y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1400aa f4303a;

    /* renamed from: b */
    public final /* synthetic */ Context f4304b;

    /* renamed from: c */
    public final /* synthetic */ Executor f4305c;

    /* renamed from: d */
    public final /* synthetic */ C2164c f4306d;

    /* renamed from: e */
    public final /* synthetic */ long f4307e;

    public /* synthetic */ C1575y(C1400aa aaVar, Context context, Executor executor, C2164c cVar, long j) {
        this.f4303a = aaVar;
        this.f4304b = context;
        this.f4305c = executor;
        this.f4306d = cVar;
        this.f4307e = j;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            androidx.camera.core.aa r3 = r1.f4303a
            android.content.Context r0 = r1.f4304b
            java.util.concurrent.Executor r4 = r1.f4305c
            androidx.d.a.c r7 = r1.f4306d
            long r5 = r1.f4307e
            android.app.Application r8 = androidx.camera.core.p069a.p070a.C1274e.m3446a(r0)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r3.f3937i = r8     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            android.content.Context r8 = r3.f3937i     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            if (r8 != 0) goto L_0x001c
            android.content.Context r0 = androidx.camera.core.p069a.p070a.C1274e.m3447b(r0)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r3.f3937i = r0     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
        L_0x001c:
            androidx.camera.core.ad r0 = r3.f3931c     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.cc r0 = r0.f3950h     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.at r8 = androidx.camera.core.C1403ad.f3943a     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.Object r0 = r0.mo3953E(r8)     // Catch:{ IllegalArgumentException -> 0x0027 }
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            androidx.camera.core.a.ac r0 = (androidx.camera.core.p069a.C1289ac) r0     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            if (r0 == 0) goto L_0x01c7
            java.util.concurrent.Executor r8 = r3.f3932d     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            android.os.Handler r9 = r3.f3933e     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.c r10 = new androidx.camera.core.a.c     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r10.<init>(r8, r9)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.ad r8 = r3.f3931c     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.cc r8 = r8.f3950h     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.at r9 = androidx.camera.core.C1403ad.f3949g     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.Object r8 = r8.mo3953E(r9)     // Catch:{ IllegalArgumentException -> 0x0040 }
            goto L_0x0041
        L_0x0040:
            r8 = 0
        L_0x0041:
            androidx.camera.core.t r8 = (androidx.camera.core.C1570t) r8     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            android.content.Context r9 = r3.f3937i     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.ad r0 = r0.mo3735a(r9, r10, r8)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r3.f3934f = r0     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.ad r0 = r3.f3931c     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.cc r0 = r0.f3950h     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.at r9 = androidx.camera.core.C1403ad.f3944b     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.Object r0 = r0.mo3953E(r9)     // Catch:{ IllegalArgumentException -> 0x0056 }
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            androidx.camera.core.a.aa r0 = (androidx.camera.core.p069a.C1287aa) r0     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            if (r0 == 0) goto L_0x01ba
            android.content.Context r9 = r3.f3937i     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.ad r10 = r3.f3934f     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.Object r10 = r10.mo4048c()     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.ad r11 = r3.f3934f     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.util.Set r11 = r11.mo4049d()     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.ab r0 = r0.mo3748a(r9, r10, r11)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r3.f3935g = r0     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.ad r0 = r3.f3931c     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.cc r0 = r0.f3950h     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.at r9 = androidx.camera.core.C1403ad.f3945c     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.Object r0 = r0.mo3953E(r9)     // Catch:{ IllegalArgumentException -> 0x007a }
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            androidx.camera.core.a.dh r0 = (androidx.camera.core.p069a.C1375dh) r0     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            if (r0 == 0) goto L_0x01ad
            android.content.Context r9 = r3.f3937i     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.di r0 = r0.mo4055a(r9)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r3.f3936h = r0     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            boolean r0 = r4 instanceof androidx.camera.core.C1567q     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r9 = 1
            if (r0 == 0) goto L_0x00be
            r0 = r4
            androidx.camera.core.q r0 = (androidx.camera.core.C1567q) r0     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.ad r10 = r3.f3934f     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r10.getClass()
            java.lang.Object r11 = r0.f4293a     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            monitor-enter(r11)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.util.concurrent.ThreadPoolExecutor r12 = r0.f4294b     // Catch:{ all -> 0x00bb }
            boolean r12 = r12.isShutdown()     // Catch:{ all -> 0x00bb }
            if (r12 == 0) goto L_0x00a5
            java.util.concurrent.ThreadPoolExecutor r12 = androidx.camera.core.C1567q.m4167a()     // Catch:{ all -> 0x00bb }
            r0.f4294b = r12     // Catch:{ all -> 0x00bb }
        L_0x00a5:
            java.util.concurrent.ThreadPoolExecutor r0 = r0.f4294b     // Catch:{ all -> 0x00bb }
            monitor-exit(r11)     // Catch:{ all -> 0x00bb }
            java.util.Set r10 = r10.mo4049d()     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            int r10 = r10.size()     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            int r10 = java.lang.Math.max(r9, r10)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r0.setMaximumPoolSize(r10)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r0.setCorePoolSize(r10)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            goto L_0x00be
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
        L_0x00be:
            androidx.camera.core.a.ag r0 = r3.f3929a     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.ad r10 = r3.f3934f     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.Object r11 = r0.f3730a     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            monitor-enter(r11)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.util.Set r12 = r10.mo4049d()     // Catch:{ w -> 0x01a4 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ w -> 0x01a4 }
        L_0x00cd:
            boolean r13 = r12.hasNext()     // Catch:{ w -> 0x01a4 }
            if (r13 == 0) goto L_0x00f9
            java.lang.Object r13 = r12.next()     // Catch:{ w -> 0x01a4 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ w -> 0x01a4 }
            java.lang.String r14 = "CameraRepository"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ w -> 0x01a4 }
            r15.<init>()     // Catch:{ w -> 0x01a4 }
            java.lang.String r2 = "Added camera: "
            r15.append(r2)     // Catch:{ w -> 0x01a4 }
            r15.append(r13)     // Catch:{ w -> 0x01a4 }
            java.lang.String r2 = r15.toString()     // Catch:{ w -> 0x01a4 }
            androidx.camera.core.C1477bw.m3978a(r14, r2)     // Catch:{ w -> 0x01a4 }
            java.util.Map r2 = r0.f3731b     // Catch:{ w -> 0x01a4 }
            androidx.camera.core.a.af r14 = r10.mo4047b(r13)     // Catch:{ w -> 0x01a4 }
            r2.put(r13, r14)     // Catch:{ w -> 0x01a4 }
            goto L_0x00cd
        L_0x00f9:
            monitor-exit(r11)     // Catch:{ all -> 0x01a2 }
            android.content.Context r0 = r3.f3937i     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.ag r2 = r3.f3929a     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            if (r8 == 0) goto L_0x0117
            java.lang.Integer r10 = r8.mo4448a()     // Catch:{ IllegalStateException -> 0x010e }
            if (r10 != 0) goto L_0x0118
            java.lang.String r0 = "CameraValidator"
            java.lang.String r2 = "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing."
            androidx.camera.core.C1477bw.m3983f(r0, r2)     // Catch:{ IllegalStateException -> 0x010e }
            goto L_0x016e
        L_0x010e:
            r0 = move-exception
            java.lang.String r2 = "CameraValidator"
            java.lang.String r8 = "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing."
            androidx.camera.core.C1477bw.m3981d(r2, r8, r0)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            goto L_0x016e
        L_0x0117:
            r10 = 0
        L_0x0118:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r11.<init>()     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.String r12 = "Verifying camera lens facing on "
            r11.append(r12)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.String r12 = android.os.Build.DEVICE     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r11.append(r12)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.String r12 = ", lensFacingInteger: "
            r11.append(r12)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r11.append(r10)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.String r12 = "CameraValidator"
            java.lang.String r11 = r11.toString()     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.C1477bw.m3978a(r12, r11)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.String r11 = "android.hardware.camera"
            boolean r11 = r0.hasSystemFeature(r11)     // Catch:{ IllegalArgumentException -> 0x017d }
            if (r11 == 0) goto L_0x0155
            if (r8 == 0) goto L_0x014c
            int r11 = r10.intValue()     // Catch:{ IllegalArgumentException -> 0x017d }
            if (r11 != r9) goto L_0x0155
        L_0x014c:
            androidx.camera.core.t r9 = androidx.camera.core.C1570t.f4297b     // Catch:{ IllegalArgumentException -> 0x017d }
            java.util.LinkedHashSet r11 = r2.mo4149a()     // Catch:{ IllegalArgumentException -> 0x017d }
            r9.mo4451d(r11)     // Catch:{ IllegalArgumentException -> 0x017d }
        L_0x0155:
            java.lang.String r9 = "android.hardware.camera.front"
            boolean r0 = r0.hasSystemFeature(r9)     // Catch:{ IllegalArgumentException -> 0x017d }
            if (r0 == 0) goto L_0x016e
            if (r8 == 0) goto L_0x0165
            int r0 = r10.intValue()     // Catch:{ IllegalArgumentException -> 0x017d }
            if (r0 != 0) goto L_0x016e
        L_0x0165:
            androidx.camera.core.t r0 = androidx.camera.core.C1570t.f4296a     // Catch:{ IllegalArgumentException -> 0x017d }
            java.util.LinkedHashSet r8 = r2.mo4149a()     // Catch:{ IllegalArgumentException -> 0x017d }
            r0.mo4451d(r8)     // Catch:{ IllegalArgumentException -> 0x017d }
        L_0x016e:
            java.lang.Object r2 = r3.f3930b     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            monitor-enter(r2)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r0 = 4
            r3.f3939k = r0     // Catch:{ all -> 0x017a }
            monitor-exit(r2)     // Catch:{ all -> 0x017a }
            r2 = 0
            r7.mo5437b(r2)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            return
        L_0x017a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x017a }
            throw r0     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
        L_0x017d:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r8.<init>()     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.String r9 = "Camera LensFacing verification failed, existing cameras: "
            r8.append(r9)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.util.LinkedHashSet r2 = r2.mo4149a()     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r8.append(r2)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.String r8 = "CameraValidator"
            java.lang.String r2 = r2.toString()     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.String r2 = r9.concat(r2)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.C1477bw.m3980c(r8, r2)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            androidx.camera.core.a.al r2 = new androidx.camera.core.a.al     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r2.<init>(r0)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            throw r2     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
        L_0x01a2:
            r0 = move-exception
            goto L_0x01ab
        L_0x01a4:
            r0 = move-exception
            androidx.camera.core.bv r2 = new androidx.camera.core.bv     // Catch:{ all -> 0x01a2 }
            r2.<init>(r0)     // Catch:{ all -> 0x01a2 }
            throw r2     // Catch:{ all -> 0x01a2 }
        L_0x01ab:
            monitor-exit(r11)     // Catch:{ all -> 0x01a2 }
            throw r0     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
        L_0x01ad:
            androidx.camera.core.bv r0 = new androidx.camera.core.bv     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.String r8 = "Invalid app configuration provided. Missing UseCaseConfigFactory."
            r2.<init>(r8)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r0.<init>(r2)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            throw r0     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
        L_0x01ba:
            androidx.camera.core.bv r0 = new androidx.camera.core.bv     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.String r8 = "Invalid app configuration provided. Missing CameraDeviceSurfaceManager."
            r2.<init>(r8)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r0.<init>(r2)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            throw r0     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
        L_0x01c7:
            androidx.camera.core.bv r0 = new androidx.camera.core.bv     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            java.lang.String r8 = "Invalid app configuration provided. Missing CameraFactory."
            r2.<init>(r8)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            r0.<init>(r2)     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
            throw r0     // Catch:{ al -> 0x01d8, bv -> 0x01d6, RuntimeException -> 0x01d4 }
        L_0x01d4:
            r0 = move-exception
            goto L_0x01d9
        L_0x01d6:
            r0 = move-exception
            goto L_0x01d9
        L_0x01d8:
            r0 = move-exception
        L_0x01d9:
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r8 = r8 - r5
            r10 = 2500(0x9c4, double:1.235E-320)
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x0213
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r8 = "Retry init. Start time "
            r2.<init>(r8)
            r2.append(r5)
            java.lang.String r8 = " current time "
            r2.append(r8)
            long r8 = android.os.SystemClock.elapsedRealtime()
            r2.append(r8)
            java.lang.String r8 = "CameraX"
            java.lang.String r2 = r2.toString()
            androidx.camera.core.C1477bw.m3984g(r8, r2, r0)
            android.os.Handler r0 = r3.f3933e
            androidx.camera.core.x r8 = new androidx.camera.core.x
            r2 = r8
            r2.<init>(r3, r4, r5, r7)
            java.lang.String r2 = "retry_token"
            r3 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r8, r2, r3)
            return
        L_0x0213:
            java.lang.Object r2 = r3.f3930b
            monitor-enter(r2)
            r4 = 3
            r3.f3939k = r4     // Catch:{ all -> 0x023b }
            monitor-exit(r2)     // Catch:{ all -> 0x023b }
            boolean r2 = r0 instanceof androidx.camera.core.p069a.C1298al
            if (r2 == 0) goto L_0x022a
            java.lang.String r0 = "CameraX"
            java.lang.String r2 = "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries."
            androidx.camera.core.C1477bw.m3980c(r0, r2)
            r2 = 0
            r7.mo5437b(r2)
            return
        L_0x022a:
            boolean r2 = r0 instanceof androidx.camera.core.C1476bv
            if (r2 == 0) goto L_0x0232
            r7.mo5439d(r0)
            return
        L_0x0232:
            androidx.camera.core.bv r2 = new androidx.camera.core.bv
            r2.<init>(r0)
            r7.mo5439d(r2)
            return
        L_0x023b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x023b }
            goto L_0x023f
        L_0x023e:
            throw r0
        L_0x023f:
            goto L_0x023e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C1575y.run():void");
    }
}
