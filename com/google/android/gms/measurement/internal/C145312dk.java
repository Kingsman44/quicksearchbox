package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dk */
/* compiled from: PG */
public final class C145312dk {

    /* renamed from: b */
    private static final Object f392687b = new Object();

    /* renamed from: a */
    public final String f392688a;

    /* renamed from: c */
    private final C145310di f392689c;

    /* renamed from: d */
    private final Object f392690d;

    /* renamed from: e */
    private final Object f392691e = new Object();

    /* renamed from: f */
    private volatile Object f392692f = null;

    /* renamed from: g */
    private volatile Object f392693g = null;

    public C145312dk(String str, Object obj, C145310di diVar) {
        this.f392688a = str;
        this.f392690d = obj;
        this.f392689c = diVar;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0044 */
    /* renamed from: a */
    public final java.lang.Object mo120854a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f392691e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            com.google.android.gms.measurement.internal.x r4 = com.google.android.gms.measurement.internal.C145311dj.f392686a
            if (r4 != 0) goto L_0x000e
            java.lang.Object r4 = r3.f392690d
            return r4
        L_0x000e:
            java.lang.Object r4 = f392687b
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.C145508x.m236572a()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r3.f392693g     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x001e
            java.lang.Object r0 = r3.f392690d     // Catch:{ all -> 0x0075 }
            goto L_0x0020
        L_0x001e:
            java.lang.Object r0 = r3.f392693g     // Catch:{ all -> 0x0075 }
        L_0x0020:
            monitor-exit(r4)     // Catch:{ all -> 0x0075 }
            return r0
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x0075 }
            java.util.List r4 = com.google.android.gms.measurement.internal.C145313dl.f392720a     // Catch:{ SecurityException -> 0x0056 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0056 }
        L_0x0029:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0056 }
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0056 }
            com.google.android.gms.measurement.internal.dk r0 = (com.google.android.gms.measurement.internal.C145312dk) r0     // Catch:{ SecurityException -> 0x0056 }
            boolean r1 = com.google.android.gms.measurement.internal.C145508x.m236572a()     // Catch:{ SecurityException -> 0x0056 }
            if (r1 != 0) goto L_0x004e
            r1 = 0
            com.google.android.gms.measurement.internal.di r2 = r0.f392689c     // Catch:{ IllegalStateException -> 0x0044 }
            if (r2 == 0) goto L_0x0044
            java.lang.Object r1 = r2.mo120845a()     // Catch:{ IllegalStateException -> 0x0044 }
        L_0x0044:
            java.lang.Object r2 = f392687b     // Catch:{ SecurityException -> 0x0056 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0056 }
            r0.f392693g = r1     // Catch:{ all -> 0x004b }
            monitor-exit(r2)     // Catch:{ all -> 0x004b }
            goto L_0x0029
        L_0x004b:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004b }
            throw r4     // Catch:{ SecurityException -> 0x0056 }
        L_0x004e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0056 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0056 }
            throw r4     // Catch:{ SecurityException -> 0x0056 }
        L_0x0056:
        L_0x0057:
            com.google.android.gms.measurement.internal.di r4 = r3.f392689c
            if (r4 == 0) goto L_0x006e
            java.lang.Object r4 = r4.mo120845a()     // Catch:{ SecurityException -> 0x0067, IllegalStateException -> 0x0060 }
            return r4
        L_0x0060:
            com.google.android.gms.measurement.internal.x r4 = com.google.android.gms.measurement.internal.C145311dj.f392686a
            boolean r4 = r4.f393430a
            java.lang.Object r4 = r3.f392690d
            return r4
        L_0x0067:
            com.google.android.gms.measurement.internal.x r4 = com.google.android.gms.measurement.internal.C145311dj.f392686a
            boolean r4 = r4.f393430a
            java.lang.Object r4 = r3.f392690d
            return r4
        L_0x006e:
            com.google.android.gms.measurement.internal.x r4 = com.google.android.gms.measurement.internal.C145311dj.f392686a
            boolean r4 = r4.f393430a
            java.lang.Object r4 = r3.f392690d
            return r4
        L_0x0075:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0075 }
            throw r0
        L_0x0078:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            goto L_0x007c
        L_0x007b:
            throw r4
        L_0x007c:
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145312dk.mo120854a(java.lang.Object):java.lang.Object");
    }
}
