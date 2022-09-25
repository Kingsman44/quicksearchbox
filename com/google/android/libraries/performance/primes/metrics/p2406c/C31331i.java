package com.google.android.libraries.performance.primes.metrics.p2406c;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import androidx.core.content.C1882h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31310m;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31311n;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31313p;
import com.google.android.libraries.performance.primes.p2399d.C31230a;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71200aj;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71201ak;

/* renamed from: com.google.android.libraries.performance.primes.metrics.c.i */
/* compiled from: PG */
final class C31331i implements C31313p {

    /* renamed from: a */
    public static final C59071e f84354a = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.c.i");

    /* renamed from: b */
    public final AtomicBoolean f84355b = new AtomicBoolean(false);

    /* renamed from: c */
    public final Application f84356c;

    /* renamed from: d */
    public final C60888db f84357d;

    /* renamed from: e */
    public final C68214a f84358e;

    /* renamed from: f */
    public final IntentFilter f84359f = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: g */
    public final C21370a f84360g;

    /* renamed from: h */
    public final C31310m f84361h;

    /* renamed from: i */
    public final C58881cr f84362i;

    /* renamed from: j */
    private final C58881cr f84363j;

    /* renamed from: k */
    private WifiManager f84364k;

    public C31331i(C31311n nVar, Context context, C60888db dbVar, C68214a aVar, C69464a aVar2, C21370a aVar3, C69464a aVar4) {
        this.f84361h = nVar.mo37026a(dbVar, aVar, aVar2);
        this.f84356c = (Application) context;
        this.f84357d = dbVar;
        this.f84358e = aVar;
        this.f84360g = aVar3;
        this.f84362i = C58886cw.m90973a(new C31326d(this, context));
        this.f84363j = C58886cw.m90973a(new C31327e(aVar4));
    }

    /* renamed from: c */
    public static void m58411c(File file) {
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (RuntimeException unused) {
        }
    }

    /* renamed from: e */
    public static final float m58412e(Intent intent) {
        return ((float) intent.getIntExtra("level", -1)) / ((float) intent.getIntExtra("scale", -1));
    }

    /* renamed from: b */
    public final C71201ak mo37040b(Intent intent) {
        C71200aj ajVar = (C71200aj) C71201ak.f190042f.createBuilder();
        if (this.f84364k == null) {
            this.f84364k = (WifiManager) this.f84356c.getSystemService("wifi");
        }
        boolean isWifiEnabled = this.f84364k.isWifiEnabled();
        ajVar.copyOnWrite();
        C71201ak akVar = (C71201ak) ajVar.instance;
        akVar.f190044a |= 4;
        akVar.f190047d = isWifiEnabled;
        boolean z = false;
        if (C1882h.m5137c(this.f84356c, "android.permission.BLUETOOTH") == 0) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            boolean z2 = defaultAdapter != null && defaultAdapter.isEnabled();
            ajVar.copyOnWrite();
            C71201ak akVar2 = (C71201ak) ajVar.instance;
            akVar2.f190044a |= 8;
            akVar2.f190048e = z2;
        }
        boolean d = C31230a.m58232d(this.f84356c);
        ajVar.copyOnWrite();
        C71201ak akVar3 = (C71201ak) ajVar.instance;
        akVar3.f190044a |= 1;
        akVar3.f190045b = d;
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            z = true;
        }
        ajVar.copyOnWrite();
        C71201ak akVar4 = (C71201ak) ajVar.instance;
        akVar4.f190044a = 2 | akVar4.f190044a;
        akVar4.f190046c = z;
        return (C71201ak) ajVar.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b0, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo37041d(boolean r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            dagger.a r0 = r6.f84358e     // Catch:{ all -> 0x00b1 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x00b1 }
            com.google.android.libraries.performance.primes.metrics.c.b r0 = (com.google.android.libraries.performance.primes.metrics.p2406c.C31324b) r0     // Catch:{ all -> 0x00b1 }
            boolean r1 = r0.mo36980b()     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x00af
            com.google.android.libraries.performance.primes.metrics.b.m r1 = r6.f84361h     // Catch:{ all -> 0x00b1 }
            r2 = 0
            boolean r1 = r1.mo37024d(r2)     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x00af
            int r1 = r0.mo37029d()     // Catch:{ all -> 0x00b1 }
            if (r1 <= 0) goto L_0x00af
            int r1 = r0.mo37029d()     // Catch:{ all -> 0x00b1 }
            r2 = 3145728(0x300000, float:4.408104E-39)
            if (r1 > r2) goto L_0x00af
            int r1 = r0.mo37030e()     // Catch:{ all -> 0x00b1 }
            if (r1 <= 0) goto L_0x00af
            int r1 = r0.mo37033g()     // Catch:{ all -> 0x00b1 }
            if (r1 <= 0) goto L_0x00af
            double r0 = r0.mo37028c()     // Catch:{ all -> 0x00b1 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00af
            if (r7 == 0) goto L_0x0055
            com.google.common.base.cr r7 = r6.f84362i     // Catch:{ all -> 0x00b1 }
            java.lang.Object r7 = r7.mo6453a()     // Catch:{ all -> 0x00b1 }
            com.google.common.base.ax r7 = (com.google.common.base.C58833ax) r7     // Catch:{ all -> 0x00b1 }
            boolean r0 = r7.mo56113h()     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0055
            java.lang.Object r7 = r7.mo56107c()     // Catch:{ all -> 0x00b1 }
            java.io.File r7 = (java.io.File) r7     // Catch:{ all -> 0x00b1 }
            m58411c(r7)     // Catch:{ all -> 0x00b1 }
        L_0x0055:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f84355b     // Catch:{ all -> 0x00b1 }
            boolean r7 = r7.get()     // Catch:{ all -> 0x00b1 }
            if (r7 != 0) goto L_0x00ad
            r7 = 0
        L_0x005e:
            r0 = 5
            if (r7 >= r0) goto L_0x00ab
            com.google.common.base.cr r0 = r6.f84363j     // Catch:{ all -> 0x00b1 }
            java.lang.Object r0 = r0.mo6453a()     // Catch:{ all -> 0x00b1 }
            com.google.android.libraries.performance.primes.metrics.c.j r0 = (com.google.android.libraries.performance.primes.metrics.p2406c.C31332j) r0     // Catch:{ all -> 0x00b1 }
            com.google.android.libraries.p1623at.p1632e.C19559g.m37303b()     // Catch:{ all -> 0x00b1 }
            com.google.android.libraries.f.a r1 = r0.f84366b     // Catch:{ all -> 0x00b1 }
            long r1 = r1.mo26870b()     // Catch:{ all -> 0x00b1 }
            long r3 = com.google.android.libraries.performance.primes.metrics.p2406c.C31332j.f84365a     // Catch:{ all -> 0x00b1 }
            long r3 = r1 % r3
            long r1 = r1 - r3
            java.lang.Long r0 = r0.mo37042a(r1)     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x007f
            monitor-exit(r6)
            return
        L_0x007f:
            long r1 = r0.longValue()     // Catch:{ all -> 0x00b1 }
            com.google.android.libraries.f.a r3 = r6.f84360g     // Catch:{ all -> 0x00b1 }
            long r3 = r3.mo26870b()     // Catch:{ all -> 0x00b1 }
            long r1 = r1 - r3
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0093
            int r7 = r7 + 1
            goto L_0x005e
        L_0x0093:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f84355b     // Catch:{ all -> 0x00b1 }
            r3 = 1
            r7.set(r3)     // Catch:{ all -> 0x00b1 }
            com.google.common.util.concurrent.db r7 = r6.f84357d     // Catch:{ all -> 0x00b1 }
            com.google.android.libraries.performance.primes.metrics.c.h r3 = new com.google.android.libraries.performance.primes.metrics.c.h     // Catch:{ all -> 0x00b1 }
            long r4 = r0.longValue()     // Catch:{ all -> 0x00b1 }
            r3.<init>(r6, r4)     // Catch:{ all -> 0x00b1 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00b1 }
            r7.mo29164d(r3, r1, r0)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r6)
            return
        L_0x00ab:
            monitor-exit(r6)
            return
        L_0x00ad:
            monitor-exit(r6)
            return
        L_0x00af:
            monitor-exit(r6)
            return
        L_0x00b1:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x00b5
        L_0x00b4:
            throw r7
        L_0x00b5:
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.metrics.p2406c.C31331i.mo37041d(boolean):void");
    }

    /* renamed from: ln */
    public final void mo29159ln() {
        C60856cj.m92903l(new C31325c(this), this.f84357d);
    }
}
