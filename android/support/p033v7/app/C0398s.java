package android.support.p033v7.app;

import android.content.Context;

/* renamed from: android.support.v7.app.s */
/* compiled from: PG */
public final /* synthetic */ class C0398s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f1354a;

    public /* synthetic */ C0398s(Context context) {
        this.f1354a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r2 == null) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            android.content.Context r0 = r6.f1354a
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "android.support.v7.app.AppLocalesMetadataHolderService"
            r1.<init>(r0, r2)
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            int r2 = r2.getComponentEnabledSetting(r1)
            r3 = 1
            if (r2 == r3) goto L_0x009a
            android.support.p033v7.app.C0401v.f1360f = r0
            boolean r2 = androidx.core.p094f.C1888a.m5150d()
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = android.support.p033v7.app.C0401v.m1324f()
            if (r2 == 0) goto L_0x002f
            android.os.LocaleList r2 = android.support.p033v7.app.C0400u.m1319a(r2)
            androidx.core.f.j r2 = androidx.core.p094f.C1897j.m5167d(r2)
            goto L_0x0031
        L_0x002b:
            androidx.core.f.j r2 = android.support.p033v7.app.C0401v.f1357c
            if (r2 != 0) goto L_0x0031
        L_0x002f:
            androidx.core.f.j r2 = androidx.core.p094f.C1897j.f5773a
        L_0x0031:
            androidx.core.f.k r2 = r2.f5774b
            android.os.LocaleList r2 = r2.f5775a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0093
            java.lang.String r2 = android.support.p033v7.app.C0365az.m1142a(r0)
            androidx.core.f.j r2 = androidx.core.p094f.C1897j.m5165b(r2)
            p3186j$.util.Objects.requireNonNull(r2)
            boolean r4 = androidx.core.p094f.C1888a.m5150d()
            if (r4 == 0) goto L_0x0062
            java.lang.Object r4 = android.support.p033v7.app.C0401v.m1324f()
            if (r4 == 0) goto L_0x0093
            androidx.core.f.k r2 = r2.f5774b
            android.os.LocaleList r2 = r2.f5775a
            java.lang.String r2 = r2.toLanguageTags()
            android.os.LocaleList r2 = android.support.p033v7.app.C0399t.m1318a(r2)
            android.support.p033v7.app.C0400u.m1320b(r4, r2)
            goto L_0x0093
        L_0x0062:
            androidx.core.f.j r4 = android.support.p033v7.app.C0401v.f1357c
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x0093
            java.lang.Object r4 = android.support.p033v7.app.C0401v.f1362h
            monitor-enter(r4)
            android.support.p033v7.app.C0401v.f1357c = r2     // Catch:{ all -> 0x0090 }
            androidx.c.i r2 = android.support.p033v7.app.C0401v.f1361g     // Catch:{ all -> 0x0090 }
            androidx.c.h r5 = new androidx.c.h     // Catch:{ all -> 0x0090 }
            r5.<init>(r2)     // Catch:{ all -> 0x0090 }
        L_0x0076:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x0090 }
            if (r2 == 0) goto L_0x008e
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x0090 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0090 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0090 }
            android.support.v7.app.v r2 = (android.support.p033v7.app.C0401v) r2     // Catch:{ all -> 0x0090 }
            if (r2 == 0) goto L_0x0076
            r2.mo1194x()     // Catch:{ all -> 0x0090 }
            goto L_0x0076
        L_0x008e:
            monitor-exit(r4)     // Catch:{ all -> 0x0090 }
            goto L_0x0093
        L_0x0090:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0090 }
            throw r0
        L_0x0093:
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r0.setComponentEnabledSetting(r1, r3, r3)
        L_0x009a:
            android.support.p033v7.app.C0401v.f1359e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.app.C0398s.run():void");
    }
}
