package com.google.android.apps.gsa.shared.util;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: com.google.android.apps.gsa.shared.util.v */
/* compiled from: PG */
public final class C91123v {

    /* renamed from: a */
    private final Context f254436a;

    /* renamed from: b */
    private final Object f254437b = new Object();

    /* renamed from: c */
    private Boolean f254438c;

    /* renamed from: d */
    private Boolean f254439d;

    /* renamed from: e */
    private Boolean f254440e;

    /* renamed from: f */
    private Boolean f254441f;

    /* renamed from: g */
    private Boolean f254442g;

    public C91123v(Context context) {
        this.f254436a = context;
    }

    /* renamed from: a */
    public final boolean mo85389a() {
        boolean booleanValue;
        PackageManager packageManager = this.f254436a.getPackageManager();
        synchronized (this.f254437b) {
            if (this.f254442g == null) {
                this.f254442g = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.camera"));
            }
            booleanValue = this.f254442g.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: b */
    public final boolean mo85390b() {
        boolean booleanValue;
        PackageManager packageManager = this.f254436a.getPackageManager();
        synchronized (this.f254437b) {
            if (this.f254440e == null) {
                this.f254440e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            }
            booleanValue = this.f254440e.booleanValue();
        }
        return booleanValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r1.booleanValue() == false) goto L_0x0034;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo85391c() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f254437b
            monitor-enter(r0)
            java.lang.Boolean r1 = r6.f254438c     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x003a
            android.content.Context r1 = r6.f254436a     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "phone"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ all -> 0x0042 }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ all -> 0x0042 }
            r2 = 0
            if (r1 == 0) goto L_0x0034
            java.lang.Class<android.telephony.TelephonyManager> r3 = android.telephony.TelephonyManager.class
            java.lang.String r4 = "isVoiceCapable"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x001f }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x001f }
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            r4 = 1
            if (r3 == 0) goto L_0x0033
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0033 }
            java.lang.Object r1 = r3.invoke(r1, r5)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0033 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0033 }
            if (r1 == 0) goto L_0x0033
            boolean r1 = r1.booleanValue()     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0033 }
            if (r1 == 0) goto L_0x0034
        L_0x0033:
            r2 = 1
        L_0x0034:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0042 }
            r6.f254438c = r1     // Catch:{ all -> 0x0042 }
        L_0x003a:
            java.lang.Boolean r1 = r6.f254438c     // Catch:{ all -> 0x0042 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return r1
        L_0x0042:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.C91123v.mo85391c():boolean");
    }

    /* renamed from: d */
    public final boolean mo85392d() {
        boolean booleanValue;
        PackageManager packageManager = this.f254436a.getPackageManager();
        synchronized (this.f254437b) {
            if (this.f254441f == null) {
                this.f254441f = Boolean.valueOf(packageManager.hasSystemFeature("android.software.leanback"));
            }
            booleanValue = this.f254441f.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: e */
    public final boolean mo85393e() {
        boolean booleanValue;
        PackageManager packageManager = this.f254436a.getPackageManager();
        synchronized (this.f254437b) {
            if (this.f254439d == null) {
                this.f254439d = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            booleanValue = this.f254439d.booleanValue();
        }
        return booleanValue;
    }
}
