package com.google.android.libraries.mdi.download.p2247g;

import android.content.Context;
import com.google.android.libraries.mdi.download.C29383eg;
import com.google.android.libraries.mdi.download.C29384eh;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29046m;
import com.google.android.libraries.storage.p3304a.p3311e.C42774b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.mdi.download.g.i */
/* compiled from: PG */
public final class C29445i implements C42774b {

    /* renamed from: a */
    public final C29384eh f79826a;

    /* renamed from: b */
    private final Context f79827b;

    /* renamed from: c */
    private final C29046m f79828c;

    /* renamed from: d */
    private final AtomicLong f79829d = new AtomicLong();

    /* renamed from: e */
    private final AtomicLong f79830e = new AtomicLong();

    public C29445i(Context context, C29046m mVar, C29384eh ehVar) {
        this.f79827b = context;
        this.f79828c = mVar;
        this.f79826a = ehVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34737a(int r8) {
        /*
            r7 = this;
            java.lang.String r0 = "NetworkUsageMonitor"
            android.content.Context r1 = r7.f79827b
            r2 = 0
            java.lang.String r3 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch:{ SecurityException -> 0x000e }
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch:{ SecurityException -> 0x000e }
            goto L_0x0014
        L_0x000e:
            java.lang.String r1 = "%s: Couldn't retrieve ConnectivityManager."
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53935g(r1, r0)
            r1 = r2
        L_0x0014:
            if (r1 != 0) goto L_0x0017
            goto L_0x001b
        L_0x0017:
            android.net.NetworkInfo r2 = r1.getActiveNetworkInfo()
        L_0x001b:
            r1 = 1
            r3 = 0
            if (r2 != 0) goto L_0x0026
            java.lang.String r2 = "%s: Fail to get network type "
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53935g(r2, r0)
        L_0x0024:
            r2 = 0
            goto L_0x003e
        L_0x0026:
            int r4 = r2.getType()
            if (r4 == r1) goto L_0x0024
            int r4 = r2.getType()
            r5 = 9
            if (r4 == r5) goto L_0x0024
            int r2 = r2.getType()
            r4 = 17
            if (r2 != r4) goto L_0x003d
            goto L_0x0024
        L_0x003d:
            r2 = 1
        L_0x003e:
            if (r2 == 0) goto L_0x0047
            java.util.concurrent.atomic.AtomicLong r4 = r7.f79830e
            long r5 = (long) r8
            r4.getAndAdd(r5)
            goto L_0x004d
        L_0x0047:
            java.util.concurrent.atomic.AtomicLong r4 = r7.f79829d
            long r5 = (long) r8
            r4.getAndAdd(r5)
        L_0x004d:
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r0
            if (r1 == r2) goto L_0x0057
            java.lang.String r0 = "wifi"
            goto L_0x0059
        L_0x0057:
            java.lang.String r0 = "cellular"
        L_0x0059:
            r4[r1] = r0
            com.google.android.libraries.mdi.download.eh r0 = r7.f79826a
            com.google.android.libraries.mdi.download.ep r0 = r0.f79656b
            if (r0 != 0) goto L_0x0063
            com.google.android.libraries.mdi.download.ep r0 = com.google.android.libraries.mdi.download.C29392ep.f79679g
        L_0x0063:
            r1 = 2
            java.lang.String r0 = r0.f79682b
            r4[r1] = r0
            r0 = 3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4[r0] = r8
            java.util.concurrent.atomic.AtomicLong r8 = r7.f79829d
            long r0 = r8.get()
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            r0 = 4
            r4[r0] = r8
            java.util.concurrent.atomic.AtomicLong r8 = r7.f79830e
            long r0 = r8.get()
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            r0 = 5
            r4[r0] = r8
            java.lang.String r8 = "%s: Received data (%s) for fileGroup = %s, len = %d, wifiCounter = %d, cellularCounter = %d"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53941m(r8, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.mdi.download.p2247g.C29445i.mo34737a(int):void");
    }

    /* renamed from: b */
    public final void mo34738b() {
        C29046m mVar = this.f79828c;
        C29383eg egVar = (C29383eg) this.f79826a.toBuilder();
        long andSet = this.f79830e.getAndSet(0);
        egVar.copyOnWrite();
        C29384eh ehVar = (C29384eh) egVar.instance;
        ehVar.f79655a |= 16;
        ehVar.f79660f = andSet;
        long andSet2 = this.f79829d.getAndSet(0);
        egVar.copyOnWrite();
        C29384eh ehVar2 = (C29384eh) egVar.instance;
        ehVar2.f79655a |= 32;
        ehVar2.f79661g = andSet2;
        C60856cj.m92911t(mVar.mo34553e((C29384eh) egVar.build()), C47810es.m84974n(new C29444h(this)), C60826bg.f164896a);
    }
}
