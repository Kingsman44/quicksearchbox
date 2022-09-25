package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.gz */
/* compiled from: PG */
final class C145408gz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f393114a;

    /* renamed from: b */
    final /* synthetic */ C145416hg f393115b;

    public C145408gz(C145416hg hgVar, AtomicReference atomicReference) {
        this.f393115b = hgVar;
        this.f393114a = atomicReference;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2 = ((java.lang.Double) r4.mo120854a((java.lang.Object) null)).doubleValue();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r7.f393114a
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r7.f393114a     // Catch:{ all -> 0x0069 }
            com.google.android.gms.measurement.internal.hg r2 = r7.f393115b     // Catch:{ all -> 0x0069 }
            com.google.android.gms.measurement.internal.ff r3 = r2.f393011w     // Catch:{ all -> 0x0069 }
            com.google.android.gms.measurement.internal.ab r3 = r3.f392937g     // Catch:{ all -> 0x0069 }
            com.google.android.gms.measurement.internal.ff r2 = r2.f393011w     // Catch:{ all -> 0x0069 }
            com.google.android.gms.measurement.internal.dp r2 = r2.mo120969d()     // Catch:{ all -> 0x0069 }
            java.lang.String r2 = r2.mo120874e()     // Catch:{ all -> 0x0069 }
            com.google.android.gms.measurement.internal.dk r4 = com.google.android.gms.measurement.internal.C145313dl.f392707N     // Catch:{ all -> 0x0069 }
            r5 = 0
            if (r2 != 0) goto L_0x0025
            java.lang.Object r2 = r4.mo120854a(r5)     // Catch:{ all -> 0x0069 }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ all -> 0x0069 }
            double r2 = r2.doubleValue()     // Catch:{ all -> 0x0069 }
            goto L_0x005b
        L_0x0025:
            com.google.android.gms.measurement.internal.aa r3 = r3.f392550a     // Catch:{ all -> 0x0069 }
            java.lang.String r6 = r4.f392688a     // Catch:{ all -> 0x0069 }
            java.lang.String r2 = r3.mo120764a(r2, r6)     // Catch:{ all -> 0x0069 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0069 }
            if (r3 == 0) goto L_0x003e
            java.lang.Object r2 = r4.mo120854a(r5)     // Catch:{ all -> 0x0069 }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ all -> 0x0069 }
            double r2 = r2.doubleValue()     // Catch:{ all -> 0x0069 }
            goto L_0x005b
        L_0x003e:
            double r2 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x0051 }
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0051 }
            java.lang.Object r2 = r4.mo120854a(r2)     // Catch:{ NumberFormatException -> 0x0051 }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ NumberFormatException -> 0x0051 }
            double r2 = r2.doubleValue()     // Catch:{ NumberFormatException -> 0x0051 }
            goto L_0x005b
        L_0x0051:
            java.lang.Object r2 = r4.mo120854a(r5)     // Catch:{ all -> 0x0069 }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ all -> 0x0069 }
            double r2 = r2.doubleValue()     // Catch:{ all -> 0x0069 }
        L_0x005b:
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x0069 }
            r1.set(r2)     // Catch:{ all -> 0x0069 }
            java.util.concurrent.atomic.AtomicReference r1 = r7.f393114a     // Catch:{ all -> 0x0070 }
            r1.notify()     // Catch:{ all -> 0x0070 }
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            return
        L_0x0069:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r7.f393114a     // Catch:{ all -> 0x0070 }
            r2.notify()     // Catch:{ all -> 0x0070 }
            throw r1     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145408gz.run():void");
    }
}
