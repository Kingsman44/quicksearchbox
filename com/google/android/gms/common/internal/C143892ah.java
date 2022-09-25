package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.common.internal.ah */
/* compiled from: PG */
final class C143892ah implements ServiceConnection, C143895ak {

    /* renamed from: a */
    public final Map f390082a = new HashMap();

    /* renamed from: b */
    public int f390083b = 2;

    /* renamed from: c */
    public boolean f390084c;

    /* renamed from: d */
    public IBinder f390085d;

    /* renamed from: e */
    public final C143890af f390086e;

    /* renamed from: f */
    public ComponentName f390087f;

    /* renamed from: g */
    final /* synthetic */ C143894aj f390088g;

    public C143892ah(C143894aj ajVar, C143890af afVar) {
        this.f390088g = ajVar;
        this.f390086e = afVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0 A[Catch:{ IllegalArgumentException -> 0x0049, all -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7 A[Catch:{ IllegalArgumentException -> 0x0049, all -> 0x00c7 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo119407a(java.lang.String r11, java.util.concurrent.Executor r12) {
        /*
            r10 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            r1 = 3
            r10.f390083b = r1
            android.os.StrictMode$VmPolicy r1 = android.os.StrictMode.getVmPolicy()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L_0x001f
            android.os.StrictMode$VmPolicy$Builder r2 = new android.os.StrictMode$VmPolicy$Builder
            r2.<init>(r1)
            android.os.StrictMode$VmPolicy$Builder r2 = r2.permitUnsafeIntentLaunch()
            android.os.StrictMode$VmPolicy r2 = r2.build()
            android.os.StrictMode.setVmPolicy(r2)
        L_0x001f:
            com.google.android.gms.common.internal.aj r2 = r10.f390088g     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.common.d.a r3 = r2.f390093f     // Catch:{ all -> 0x00c7 }
            android.content.Context r4 = r2.f390091d     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.common.internal.af r2 = r10.f390086e     // Catch:{ all -> 0x00c7 }
            java.lang.String r5 = r2.f390074b     // Catch:{ all -> 0x00c7 }
            if (r5 == 0) goto L_0x0085
            boolean r5 = r2.f390078f     // Catch:{ all -> 0x00c7 }
            r6 = 0
            if (r5 == 0) goto L_0x0075
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x00c7 }
            r5.<init>()     // Catch:{ all -> 0x00c7 }
            java.lang.String r7 = "serviceActionBundleKey"
            java.lang.String r8 = r2.f390074b     // Catch:{ all -> 0x00c7 }
            r5.putString(r7, r8)     // Catch:{ all -> 0x00c7 }
            android.content.ContentResolver r7 = r4.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0049 }
            android.net.Uri r8 = com.google.android.gms.common.internal.C143890af.f390073a     // Catch:{ IllegalArgumentException -> 0x0049 }
            java.lang.String r9 = "serviceIntentCall"
            android.os.Bundle r5 = r7.call(r8, r9, r6, r5)     // Catch:{ IllegalArgumentException -> 0x0049 }
            goto L_0x0058
        L_0x0049:
            r5 = move-exception
            java.lang.String r7 = "Dynamic intent resolution failed: "
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00c7 }
            java.lang.String r5 = r7.concat(r5)     // Catch:{ all -> 0x00c7 }
            android.util.Log.w(r0, r5)     // Catch:{ all -> 0x00c7 }
            r5 = r6
        L_0x0058:
            if (r5 != 0) goto L_0x005b
            goto L_0x0064
        L_0x005b:
            java.lang.String r6 = "serviceResponseIntentKey"
            android.os.Parcelable r5 = r5.getParcelable(r6)     // Catch:{ all -> 0x00c7 }
            android.content.Intent r5 = (android.content.Intent) r5     // Catch:{ all -> 0x00c7 }
            r6 = r5
        L_0x0064:
            if (r6 != 0) goto L_0x0075
            java.lang.String r5 = "Dynamic lookup for intent failed for action: "
            java.lang.String r7 = r2.f390074b     // Catch:{ all -> 0x00c7 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00c7 }
            java.lang.String r5 = r5.concat(r7)     // Catch:{ all -> 0x00c7 }
            android.util.Log.w(r0, r5)     // Catch:{ all -> 0x00c7 }
        L_0x0075:
            if (r6 != 0) goto L_0x0091
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x00c7 }
            java.lang.String r5 = r2.f390074b     // Catch:{ all -> 0x00c7 }
            r0.<init>(r5)     // Catch:{ all -> 0x00c7 }
            java.lang.String r2 = r2.f390075c     // Catch:{ all -> 0x00c7 }
            android.content.Intent r0 = r0.setPackage(r2)     // Catch:{ all -> 0x00c7 }
            goto L_0x0090
        L_0x0085:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x00c7 }
            r0.<init>()     // Catch:{ all -> 0x00c7 }
            android.content.ComponentName r2 = r2.f390076d     // Catch:{ all -> 0x00c7 }
            android.content.Intent r0 = r0.setComponent(r2)     // Catch:{ all -> 0x00c7 }
        L_0x0090:
            r6 = r0
        L_0x0091:
            com.google.android.gms.common.internal.af r0 = r10.f390086e     // Catch:{ all -> 0x00c7 }
            int r8 = r0.f390077e     // Catch:{ all -> 0x00c7 }
            r5 = r11
            r7 = r10
            r9 = r12
            boolean r11 = r3.mo119314e(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00c7 }
            r10.f390084c = r11     // Catch:{ all -> 0x00c7 }
            if (r11 == 0) goto L_0x00b7
            com.google.android.gms.common.internal.aj r11 = r10.f390088g     // Catch:{ all -> 0x00c7 }
            android.os.Handler r11 = r11.f390092e     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.common.internal.af r12 = r10.f390086e     // Catch:{ all -> 0x00c7 }
            r0 = 1
            android.os.Message r11 = r11.obtainMessage(r0, r12)     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.common.internal.aj r12 = r10.f390088g     // Catch:{ all -> 0x00c7 }
            android.os.Handler r12 = r12.f390092e     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.common.internal.aj r0 = r10.f390088g     // Catch:{ all -> 0x00c7 }
            long r2 = r0.f390094g     // Catch:{ all -> 0x00c7 }
            r12.sendMessageDelayed(r11, r2)     // Catch:{ all -> 0x00c7 }
            goto L_0x00c3
        L_0x00b7:
            r11 = 2
            r10.f390083b = r11     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.common.internal.aj r11 = r10.f390088g     // Catch:{ IllegalArgumentException -> 0x00c3 }
            com.google.android.gms.common.d.a r12 = r11.f390093f     // Catch:{ IllegalArgumentException -> 0x00c3 }
            android.content.Context r11 = r11.f390091d     // Catch:{ IllegalArgumentException -> 0x00c3 }
            r12.mo119311b(r11, r10)     // Catch:{ IllegalArgumentException -> 0x00c3 }
        L_0x00c3:
            android.os.StrictMode.setVmPolicy(r1)
            return
        L_0x00c7:
            r11 = move-exception
            android.os.StrictMode.setVmPolicy(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C143892ah.mo119407a(java.lang.String, java.util.concurrent.Executor):void");
    }

    /* renamed from: b */
    public final boolean mo119408b(ServiceConnection serviceConnection) {
        return this.f390082a.containsKey(serviceConnection);
    }

    /* renamed from: c */
    public final boolean mo119409c() {
        return this.f390082a.isEmpty();
    }

    /* renamed from: d */
    public final void mo119410d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.f390082a.put(serviceConnection, serviceConnection2);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f390088g.f390090c) {
            this.f390088g.f390092e.removeMessages(1, this.f390086e);
            this.f390085d = iBinder;
            this.f390087f = componentName;
            for (ServiceConnection onServiceConnected : this.f390082a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f390083b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f390088g.f390090c) {
            this.f390088g.f390092e.removeMessages(1, this.f390086e);
            this.f390085d = null;
            this.f390087f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f390082a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f390083b = 2;
        }
    }
}
