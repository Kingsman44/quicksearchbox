package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.analytics.C142679a;
import com.google.android.gms.analytics.C142693b;
import com.google.android.gms.analytics.C142696c;
import com.google.android.gms.analytics.C142701h;
import com.google.android.gms.analytics.C142702i;
import com.google.android.gms.analytics.C142759l;
import com.google.android.gms.analytics.C142764q;
import com.google.android.gms.analytics.C142766s;
import com.google.android.gms.analytics.p10733a.C142680a;
import com.google.android.gms.analytics.p10733a.C142681b;
import com.google.android.gms.analytics.p10733a.C142684e;
import com.google.android.gms.analytics.p10733a.C142689j;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.p10782e.C143873c;
import com.google.android.gms.common.util.C144006f;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.internal.y */
/* compiled from: PG */
final class C142755y extends C142737g {

    /* renamed from: a */
    public boolean f387379a;

    /* renamed from: b */
    public long f387380b;

    /* renamed from: c */
    private final C142749s f387381c;

    /* renamed from: d */
    private final C142724au f387382d;

    /* renamed from: f */
    private final C142723at f387383f;

    /* renamed from: g */
    private final C142747q f387384g;

    /* renamed from: h */
    private final C142711ah f387385h;

    /* renamed from: i */
    private final C142711ah f387386i;

    /* renamed from: j */
    private final C142729az f387387j = new C142729az();

    /* renamed from: k */
    private boolean f387388k;

    protected C142755y(C142740j jVar) {
        super(jVar);
        this.f387383f = new C142723at(jVar);
        this.f387381c = new C142749s(jVar);
        this.f387382d = new C142724au(jVar);
        this.f387384g = new C142747q(jVar);
        C144006f fVar = this.f387328e.f387340h;
        this.f387385h = new C142751u(this, jVar);
        this.f387386i = new C142752v(this, jVar);
    }

    /* renamed from: t */
    private final void m231666t() {
        C142713aj g = this.f387328e.mo117547g();
        if (g.f387244b) {
            g.mo117504b();
        }
    }

    /* renamed from: u */
    private final void m231667u() {
        if (this.f387385h.mo117502e()) {
            super.mo117536i(2, "All hits dispatched or no network/service. Going to power save mode", (Object) null, (Object) null, (Object) null);
        }
        this.f387385h.mo117500c();
    }

    /* renamed from: v */
    private final void m231668v() {
        long j;
        C142713aj g = this.f387328e.mo117547g();
        if (g.f387243a && !g.f387244b) {
            C142764q.m231686b();
            mo117537k();
            try {
                C142749s sVar = this.f387381c;
                C142764q.m231686b();
                sVar.mo117537k();
                j = sVar.mo117581v(C142749s.f387370b, (String[]) null);
            } catch (SQLiteException e) {
                super.mo117536i(6, "Failed to get min/max hit times from local store", e, (Object) null, (Object) null);
                j = 0;
            }
            if (j != 0) {
                C144006f fVar = this.f387328e.f387340h;
                long abs = Math.abs(System.currentTimeMillis() - j);
                C142708ae aeVar = this.f387328e.f387336d;
                if (abs <= ((Long) C142715al.f387260g.mo117506a()).longValue()) {
                    C142708ae aeVar2 = this.f387328e.f387336d;
                    super.mo117536i(2, "Dispatch alarm scheduled (ms)", Long.valueOf(C142708ae.m231544b()), (Object) null, (Object) null);
                    g.mo117505c();
                }
            }
        }
    }

    /* renamed from: w */
    private final boolean m231669w(String str) {
        return C143873c.f389983a.mo119351a(this.f387328e.f387334b).f389982a.checkCallingOrSelfPermission(str) == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117488a() {
        this.f387381c.mo117538l();
        this.f387382d.mo117538l();
        this.f387384g.mo117538l();
    }

    /* renamed from: b */
    public final long mo117584b() {
        C142708ae aeVar = this.f387328e.f387336d;
        long longValue = ((Long) C142715al.f387257d.mo117506a()).longValue();
        C142732bb j = this.f387328e.mo117550j();
        j.mo117537k();
        if (!j.f387320c) {
            return longValue;
        }
        C142732bb j2 = this.f387328e.mo117550j();
        j2.mo117537k();
        return ((long) j2.f387321d) * 1000;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:19|20|21|22|23|(1:25)|26|27) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00b6 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117585c() {
        /*
            r12 = this;
            boolean r0 = r12.f387388k
            if (r0 != 0) goto L_0x00f4
            com.google.android.gms.analytics.internal.j r0 = r12.f387328e
            com.google.android.gms.analytics.internal.ae r0 = r0.f387336d
            boolean r0 = com.google.android.gms.analytics.internal.C142708ae.m231551i()
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            com.google.android.gms.analytics.internal.q r0 = r12.f387384g
            boolean r0 = r0.mo117559f()
            if (r0 != 0) goto L_0x00f4
            com.google.android.gms.analytics.internal.j r0 = r12.f387328e
            com.google.android.gms.analytics.internal.ae r0 = r0.f387336d
            com.google.android.gms.analytics.internal.ak r0 = com.google.android.gms.analytics.internal.C142715al.f387250B
            java.lang.Object r0 = r0.mo117506a()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            com.google.android.gms.analytics.internal.az r2 = r12.f387387j
            boolean r0 = r2.mo117526a(r0)
            if (r0 == 0) goto L_0x00f4
            com.google.android.gms.analytics.internal.az r0 = r12.f387387j
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.f387316a = r1
            r4 = 2
            java.lang.String r5 = "Connecting to service"
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r12
            super.mo117536i(r4, r5, r6, r7, r8)
            com.google.android.gms.analytics.internal.q r0 = r12.f387384g
            com.google.android.gms.analytics.C142764q.m231686b()
            r0.mo117537k()
            com.google.android.gms.analytics.internal.ap r1 = r0.f387365b
            if (r1 == 0) goto L_0x004f
            goto L_0x00dd
        L_0x004f:
            com.google.android.gms.analytics.internal.p r1 = r0.f387364a
            com.google.android.gms.analytics.C142764q.m231686b()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "com.google.android.gms.analytics.service.START"
            r2.<init>(r3)
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "com.google.android.gms"
            java.lang.String r5 = "com.google.android.gms.analytics.service.AnalyticsService"
            r3.<init>(r4, r5)
            r2.setComponent(r3)
            com.google.android.gms.analytics.internal.q r3 = r1.f387362b
            com.google.android.gms.analytics.internal.j r3 = r3.f387328e
            android.content.Context r3 = r3.f387334b
            java.lang.String r4 = "app_package_name"
            java.lang.String r5 = r3.getPackageName()
            r2.putExtra(r4, r5)
            com.google.android.gms.common.d.a r4 = com.google.android.gms.common.p10781d.C143860a.m233845a()
            monitor-enter(r1)
            r5 = 0
            r1.f387363c = r5     // Catch:{ all -> 0x00f1 }
            r6 = 1
            r1.f387361a = r6     // Catch:{ all -> 0x00f1 }
            com.google.android.gms.analytics.internal.q r6 = r1.f387362b     // Catch:{ all -> 0x00f1 }
            com.google.android.gms.analytics.internal.p r6 = r6.f387364a     // Catch:{ all -> 0x00f1 }
            r7 = 129(0x81, float:1.81E-43)
            boolean r2 = r4.mo119313d(r3, r2, r6, r7)     // Catch:{ all -> 0x00f1 }
            com.google.android.gms.analytics.internal.q r6 = r1.f387362b     // Catch:{ all -> 0x00f1 }
            java.lang.String r8 = "Bind to service requested"
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x00f1 }
            r7 = 2
            r10 = 0
            r11 = 0
            r6.mo117536i(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00f1 }
            r3 = 0
            if (r2 != 0) goto L_0x00a0
            r1.f387361a = r3     // Catch:{ all -> 0x00f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x00d6
        L_0x00a0:
            com.google.android.gms.analytics.internal.q r2 = r1.f387362b     // Catch:{ InterruptedException -> 0x00b6 }
            com.google.android.gms.analytics.internal.j r2 = r2.f387328e     // Catch:{ InterruptedException -> 0x00b6 }
            com.google.android.gms.analytics.internal.ae r2 = r2.f387336d     // Catch:{ InterruptedException -> 0x00b6 }
            com.google.android.gms.analytics.internal.ak r2 = com.google.android.gms.analytics.internal.C142715al.f387249A     // Catch:{ InterruptedException -> 0x00b6 }
            java.lang.Object r2 = r2.mo117506a()     // Catch:{ InterruptedException -> 0x00b6 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ InterruptedException -> 0x00b6 }
            long r6 = r2.longValue()     // Catch:{ InterruptedException -> 0x00b6 }
            r1.wait(r6)     // Catch:{ InterruptedException -> 0x00b6 }
            goto L_0x00c1
        L_0x00b6:
            com.google.android.gms.analytics.internal.q r6 = r1.f387362b     // Catch:{ all -> 0x00f1 }
            java.lang.String r8 = "Wait for service connect was interrupted"
            r7 = 5
            r9 = 0
            r10 = 0
            r11 = 0
            r6.mo117536i(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00f1 }
        L_0x00c1:
            r1.f387361a = r3     // Catch:{ all -> 0x00f1 }
            com.google.android.gms.analytics.internal.ap r2 = r1.f387363c     // Catch:{ all -> 0x00f1 }
            r1.f387363c = r5     // Catch:{ all -> 0x00f1 }
            if (r2 != 0) goto L_0x00d4
            com.google.android.gms.analytics.internal.q r6 = r1.f387362b     // Catch:{ all -> 0x00f1 }
            java.lang.String r8 = "Successfully bound to service but never got onServiceConnected callback"
            r7 = 6
            r9 = 0
            r10 = 0
            r11 = 0
            r6.mo117536i(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00f1 }
        L_0x00d4:
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            r5 = r2
        L_0x00d6:
            if (r5 == 0) goto L_0x00f4
            r0.f387365b = r5
            r0.mo117558e()
        L_0x00dd:
            r7 = 2
            java.lang.String r8 = "Connected to service"
            r9 = 0
            r10 = 0
            r11 = 0
            r6 = r12
            super.mo117536i(r7, r8, r9, r10, r11)
            com.google.android.gms.analytics.internal.az r0 = r12.f387387j
            r1 = 0
            r0.f387316a = r1
            r12.mo117589g()
            return
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            throw r0
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.C142755y.mo117585c():void");
    }

    /* renamed from: d */
    public final void mo117586d(C142718ao aoVar) {
        long j;
        C142764q.m231686b();
        mo117537k();
        if (this.f387388k) {
            super.mo117536i(3, "Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions", (Object) null, (Object) null, (Object) null);
        } else {
            super.mo117536i(2, "Delivering hit", aoVar, (Object) null, (Object) null);
        }
        if (TextUtils.isEmpty(aoVar.mo117507a("_m", BuildConfig.FLAVOR))) {
            C142725av avVar = this.f387328e.mo117549i().f387311b;
            long a = avVar.mo117519a();
            if (a == 0) {
                j = 0;
            } else {
                C144006f fVar = avVar.f387308b.f387328e.f387340h;
                j = Math.abs(a - System.currentTimeMillis());
            }
            long j2 = avVar.f387307a;
            Pair pair = null;
            if (j >= j2) {
                if (j > j2 + j2) {
                    avVar.mo117522d();
                } else {
                    String string = avVar.f387308b.f387310a.getString(avVar.mo117521c(), (String) null);
                    long j3 = avVar.f387308b.f387310a.getLong(avVar.mo117520b(), 0);
                    avVar.mo117522d();
                    if (string != null && j3 > 0) {
                        pair = new Pair(string, Long.valueOf(j3));
                    }
                }
            }
            if (pair != null) {
                HashMap hashMap = new HashMap(aoVar.f387287a);
                hashMap.put("_m", ((Long) pair.second) + ":" + ((String) pair.first));
                aoVar = new C142718ao(this, hashMap, aoVar.f387290d, aoVar.f387292f, aoVar.f387289c, aoVar.f387291e, aoVar.f387288b);
            }
        }
        mo117585c();
        if (!this.f387384g.mo117560g(aoVar)) {
            C142708ae aeVar = this.f387328e.f387336d;
            try {
                this.f387381c.mo117576q(aoVar);
                mo117593q();
            } catch (SQLiteException e) {
                super.mo117536i(6, "Delivery failed to save hit to a database", e, (Object) null, (Object) null);
                this.f387328e.mo117548h().mo117509b(aoVar, "deliver: failed to insert hit to database");
            }
        } else {
            super.mo117536i(3, "Hit sent to the device AnalyticsService for delivery", (Object) null, (Object) null, (Object) null);
        }
    }

    /* renamed from: e */
    public final void mo117587e() {
        try {
            this.f387381c.mo117580u();
            mo117593q();
        } catch (SQLiteException e) {
            super.mo117536i(5, "Failed to delete stale hits", e, (Object) null, (Object) null);
        }
        C142711ah ahVar = this.f387386i;
        C142708ae aeVar = this.f387328e.f387336d;
        ahVar.mo117501d(86400000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo117588f(C142742l lVar) {
        C142764q.m231686b();
        super.mo117536i(3, "Sending first hit to property", lVar.f387352b, (Object) null, (Object) null);
        C142726aw i = this.f387328e.mo117549i();
        C144006f fVar = i.f387328e.f387340h;
        C142729az azVar = new C142729az(i.mo117523b());
        C142708ae aeVar = this.f387328e.f387336d;
        if (!azVar.mo117526a(((Long) C142715al.f387277x.mo117506a()).longValue())) {
            C142726aw i2 = this.f387328e.mo117549i();
            C142740j jVar = i2.f387328e;
            C142764q.m231686b();
            i2.mo117537k();
            String str = null;
            String string = i2.f387310a.getString("installation_campaign", (String) null);
            if (true != TextUtils.isEmpty(string)) {
                str = string;
            }
            if (!TextUtils.isEmpty(str)) {
                C142681b b = C142731ba.m231602b(this.f387328e.mo117548h(), str);
                super.mo117536i(3, "Found relevant installation campaign", b, (Object) null, (Object) null);
                C143919bh.m233958a(b);
                C142679a aVar = new C142679a(this.f387328e);
                String str2 = lVar.f387352b;
                C143919bh.m233969l(str2);
                Uri a = C142693b.m231518a(str2);
                ListIterator listIterator = aVar.f387391g.f387217h.listIterator();
                while (listIterator.hasNext()) {
                    if (a.equals(((C142766s) listIterator.next()).mo117476b())) {
                        listIterator.remove();
                    }
                }
                aVar.f387391g.f387217h.add(new C142693b(aVar.f387167a, str2));
                aVar.f387168b = lVar.f387353c;
                C142701h hVar = new C142701h(aVar.f387391g);
                C142750t e = aVar.f387167a.mo117545e();
                e.mo117537k();
                hVar.mo117484c(e.f387374a);
                hVar.mo117484c(aVar.f387167a.f387339g.mo117503b());
                for (C142702i a2 : aVar.f387392h) {
                    a2.mo117485a();
                }
                C142689j jVar2 = (C142689j) hVar.mo117482a(C142689j.class);
                jVar2.f387192a = "data";
                jVar2.f387197f = true;
                hVar.mo117484c(b);
                C142684e eVar = (C142684e) hVar.mo117482a(C142684e.class);
                C142680a aVar2 = (C142680a) hVar.mo117482a(C142680a.class);
                for (Map.Entry entry : lVar.f387355e.entrySet()) {
                    String str3 = (String) entry.getKey();
                    String str4 = (String) entry.getValue();
                    if ("an".equals(str3)) {
                        aVar2.f387169a = str4;
                    } else if ("av".equals(str3)) {
                        aVar2.f387170b = str4;
                    } else if ("aid".equals(str3)) {
                        aVar2.f387171c = str4;
                    } else if ("aiid".equals(str3)) {
                        aVar2.f387172d = str4;
                    } else if ("uid".equals(str3)) {
                        jVar2.f387194c = str4;
                    } else {
                        C143919bh.m233969l(str3);
                        if (str3 != null && str3.startsWith("&")) {
                            str3 = str3.substring(1);
                        }
                        C143919bh.m233970m(str3, "Name can not be empty or \"&\"");
                        eVar.f387185a.put(str3, str4);
                    }
                }
                super.mo117536i(3, "Sending installation campaign to", lVar.f387352b, b, (Object) null);
                hVar.f387213d = this.f387328e.mo117549i().mo117523b();
                C142764q qVar = hVar.f387210a.f387390f;
                if (hVar.f387215f) {
                    throw new IllegalStateException("Measurement prototype can't be submitted");
                } else if (!hVar.f387211b) {
                    C142701h hVar2 = new C142701h(hVar);
                    hVar2.f387214e = SystemClock.elapsedRealtime();
                    long j = hVar2.f387213d;
                    if (j != 0) {
                        hVar2.f387212c = j;
                    } else {
                        hVar2.f387212c = System.currentTimeMillis();
                    }
                    hVar2.f387211b = true;
                    qVar.f387401d.execute(new C142759l(qVar, hVar2));
                } else {
                    throw new IllegalStateException("Measurement can only be submitted once");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c A[LOOP:1: B:14:0x005c->B:22:?, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092 A[SYNTHETIC, Splitter:B:26:0x0092] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117589g() {
        /*
            r7 = this;
            com.google.android.gms.analytics.C142764q.m231686b()
            com.google.android.gms.analytics.internal.j r0 = r7.f387328e
            com.google.android.gms.analytics.internal.ae r0 = r0.f387336d
            com.google.android.gms.analytics.C142764q.m231686b()
            r7.mo117537k()
            com.google.android.gms.analytics.internal.j r0 = r7.f387328e
            com.google.android.gms.analytics.internal.ae r0 = r0.f387336d
            boolean r0 = com.google.android.gms.analytics.internal.C142708ae.m231551i()
            if (r0 != 0) goto L_0x0021
            r2 = 5
            java.lang.String r3 = "Service client disabled. Can't dispatch local hits to device AnalyticsService"
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r7
            super.mo117536i(r2, r3, r4, r5, r6)
        L_0x0021:
            com.google.android.gms.analytics.internal.q r0 = r7.f387384g
            boolean r0 = r0.mo117559f()
            if (r0 != 0) goto L_0x0034
            r2 = 2
            java.lang.String r3 = "Service not connected"
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r7
            super.mo117536i(r2, r3, r4, r5, r6)
            return
        L_0x0034:
            com.google.android.gms.analytics.internal.s r0 = r7.f387381c
            boolean r0 = r0.mo117579t()
            if (r0 == 0) goto L_0x003d
            return
        L_0x003d:
            r2 = 2
            java.lang.String r3 = "Dispatching local hits to device AnalyticsService"
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r7
            super.mo117536i(r2, r3, r4, r5, r6)
        L_0x0047:
            com.google.android.gms.analytics.internal.s r0 = r7.f387381c     // Catch:{ SQLiteException -> 0x0096 }
            com.google.android.gms.analytics.internal.j r1 = r7.f387328e     // Catch:{ SQLiteException -> 0x0096 }
            com.google.android.gms.analytics.internal.ae r1 = r1.f387336d     // Catch:{ SQLiteException -> 0x0096 }
            int r1 = com.google.android.gms.analytics.internal.C142708ae.m231547e()     // Catch:{ SQLiteException -> 0x0096 }
            long r1 = (long) r1     // Catch:{ SQLiteException -> 0x0096 }
            java.util.List r0 = r0.mo117570e(r1)     // Catch:{ SQLiteException -> 0x0096 }
            boolean r1 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x0096 }
            if (r1 != 0) goto L_0x0092
        L_0x005c:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0047
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.analytics.internal.ao r1 = (com.google.android.gms.analytics.internal.C142718ao) r1
            com.google.android.gms.analytics.internal.q r2 = r7.f387384g
            boolean r2 = r2.mo117560g(r1)
            if (r2 != 0) goto L_0x0075
            r7.mo117593q()
            return
        L_0x0075:
            r0.remove(r1)
            com.google.android.gms.analytics.internal.s r2 = r7.f387381c     // Catch:{ SQLiteException -> 0x0080 }
            long r3 = r1.f387289c     // Catch:{ SQLiteException -> 0x0080 }
            r2.mo117573n(r3)     // Catch:{ SQLiteException -> 0x0080 }
            goto L_0x005c
        L_0x0080:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Failed to remove hit that was send for delivery"
            r5 = 0
            r6 = 0
            r1 = r7
            super.mo117536i(r2, r3, r4, r5, r6)
            r7.m231667u()
            r7.m231666t()
            return
        L_0x0092:
            r7.mo117593q()     // Catch:{ SQLiteException -> 0x0096 }
            return
        L_0x0096:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Failed to read hits from store"
            r5 = 0
            r6 = 0
            r1 = r7
            super.mo117536i(r2, r3, r4, r5, r6)
            r7.m231667u()
            r7.m231666t()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.C142755y.mo117589g():void");
    }

    /* renamed from: n */
    public final void mo117590n() {
        C142764q.m231686b();
        mo117537k();
        super.mo117536i(2, "Service disconnected", (Object) null, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo117591o() {
        boolean z;
        mo117537k();
        C142708ae aeVar = this.f387328e.f387336d;
        C142764q.m231686b();
        Context context = this.f387328e.f387334b;
        if (!C142727ax.m231598a(context)) {
            super.mo117536i(5, "AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.", (Object) null, (Object) null, (Object) null);
        } else if (!C142728ay.m231599a(context)) {
            super.mo117536i(6, "AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.", (Object) null, (Object) null, (Object) null);
        }
        C143919bh.m233958a(context);
        Boolean bool = C142696c.f387203a;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = C142731ba.m231606f(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
            C142696c.f387203a = Boolean.valueOf(z);
        }
        if (!z) {
            super.mo117536i(5, "CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.", (Object) null, (Object) null, (Object) null);
        }
        this.f387328e.mo117549i().mo117523b();
        if (!m231669w("android.permission.ACCESS_NETWORK_STATE")) {
            super.mo117536i(6, "Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions", (Object) null, (Object) null, (Object) null);
            mo117592p();
        }
        if (!m231669w("android.permission.INTERNET")) {
            super.mo117536i(6, "Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions", (Object) null, (Object) null, (Object) null);
            mo117592p();
        }
        if (C142728ay.m231599a(this.f387328e.f387334b)) {
            super.mo117536i(2, "AnalyticsService registered in the app manifest and enabled", (Object) null, (Object) null, (Object) null);
        } else {
            C142708ae aeVar2 = this.f387328e.f387336d;
            super.mo117536i(5, "AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.", (Object) null, (Object) null, (Object) null);
        }
        if (!this.f387388k) {
            C142708ae aeVar3 = this.f387328e.f387336d;
            if (!this.f387381c.mo117579t()) {
                mo117585c();
            }
        }
        mo117593q();
    }

    /* renamed from: p */
    public final void mo117592p() {
        mo117537k();
        C142764q.m231686b();
        this.f387388k = true;
        this.f387384g.mo117555b();
        mo117593q();
    }

    /* renamed from: q */
    public final void mo117593q() {
        long j;
        long j2;
        C142764q.m231686b();
        mo117537k();
        if (!this.f387388k) {
            C142708ae aeVar = this.f387328e.f387336d;
            long j3 = 0;
            if (mo117584b() > 0) {
                if (this.f387381c.mo117579t()) {
                    this.f387383f.mo117512a();
                    m231667u();
                    m231666t();
                    return;
                }
                if (!((Boolean) C142715al.f387278y.mo117506a()).booleanValue()) {
                    C142723at atVar = this.f387383f;
                    atVar.f387301b.mo117548h();
                    atVar.f387301b.mo117544d();
                    if (!atVar.f387302c) {
                        Context context = atVar.f387301b.f387334b;
                        context.registerReceiver(atVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
                        intentFilter.addCategory(context.getPackageName());
                        context.registerReceiver(atVar, intentFilter);
                        atVar.f387303d = atVar.mo117513b();
                        atVar.f387301b.mo117548h().mo117536i(2, "Registering connectivity change receiver. Network connected", Boolean.valueOf(atVar.f387303d), (Object) null, (Object) null);
                        atVar.f387302c = true;
                    }
                    C142723at atVar2 = this.f387383f;
                    if (!atVar2.f387302c) {
                        atVar2.f387301b.mo117548h().mo117536i(5, "Connectivity unknown. Receiver not registered", (Object) null, (Object) null, (Object) null);
                    }
                    if (!atVar2.f387303d) {
                        m231667u();
                        m231666t();
                        m231668v();
                        return;
                    }
                }
                m231668v();
                long b = mo117584b();
                long c = this.f387328e.mo117549i().mo117524c();
                if (c != 0) {
                    C144006f fVar = this.f387328e.f387340h;
                    j = b - Math.abs(System.currentTimeMillis() - c);
                    if (j <= 0) {
                        C142708ae aeVar2 = this.f387328e.f387336d;
                        j = Math.min(C142708ae.m231545c(), b);
                    }
                } else {
                    C142708ae aeVar3 = this.f387328e.f387336d;
                    j = Math.min(C142708ae.m231545c(), b);
                }
                super.mo117536i(2, "Dispatch scheduled (ms)", Long.valueOf(j), (Object) null, (Object) null);
                if (this.f387385h.mo117502e()) {
                    C142711ah ahVar = this.f387385h;
                    if (ahVar.f387242d == 0) {
                        j2 = 0;
                    } else {
                        C142740j jVar = ahVar.f387240b;
                        j2 = Math.abs(System.currentTimeMillis() - ahVar.f387242d);
                    }
                    long max = Math.max(1, j + j2);
                    C142711ah ahVar2 = this.f387385h;
                    if (ahVar2.mo117502e()) {
                        if (max < 0) {
                            ahVar2.mo117500c();
                            return;
                        }
                        C142740j jVar2 = ahVar2.f387240b;
                        long abs = max - Math.abs(System.currentTimeMillis() - ahVar2.f387242d);
                        if (abs >= 0) {
                            j3 = abs;
                        }
                        ahVar2.mo117499b().removeCallbacks(ahVar2.f387241c);
                        if (!ahVar2.mo117499b().postDelayed(ahVar2.f387241c, j3)) {
                            ahVar2.f387240b.mo117548h().mo117536i(6, "Failed to adjust delayed post. time", Long.valueOf(j3), (Object) null, (Object) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f387385h.mo117501d(j);
                return;
            }
        }
        this.f387383f.mo117512a();
        m231667u();
        m231666t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a7, code lost:
        super.mo117536i(2, "Store is empty, nothing to dispatch", (java.lang.Object) null, (java.lang.Object) null, (java.lang.Object) null);
        m231667u();
        m231666t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r7.f387381c.mo117577r();
        r7.f387381c.mo117575p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        super.mo117536i(6, "Failed to commit local dispatch transaction", r0, (java.lang.Object) null, (java.lang.Object) null);
        m231667u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0100, code lost:
        super.mo117536i(6, "Database contains successfully uploaded hit", java.lang.Long.valueOf(r9), java.lang.Integer.valueOf(r15.size()), (java.lang.Object) null);
        m231667u();
        m231666t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r7.f387381c.mo117577r();
        r7.f387381c.mo117575p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0127, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        super.mo117536i(6, "Failed to commit local dispatch transaction", r0, (java.lang.Object) null, (java.lang.Object) null);
        m231667u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r7.f387381c.mo117577r();
        r7.f387381c.mo117575p();
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02b6 A[Catch:{ Exception -> 0x02df }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02c1 A[Catch:{ Exception -> 0x02df }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117594r(com.google.android.gms.analytics.internal.C142754x r18, long r19) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            com.google.android.gms.analytics.C142764q.m231686b()
            r17.mo117537k()
            com.google.android.gms.analytics.internal.j r0 = r7.f387328e
            com.google.android.gms.analytics.internal.aw r0 = r0.mo117549i()
            long r0 = r0.mo117524c()
            r9 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x0028
            com.google.android.gms.analytics.internal.j r2 = r7.f387328e
            com.google.android.gms.common.util.f r2 = r2.f387340h
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            long r0 = java.lang.Math.abs(r2)
            goto L_0x002a
        L_0x0028:
            r0 = -1
        L_0x002a:
            r2 = 3
            java.lang.String r3 = "Dispatching local hits. Elapsed time since last dispatch (ms)"
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)
            com.google.android.gms.analytics.internal.j r0 = r7.f387328e
            com.google.android.gms.analytics.internal.ae r0 = r0.f387336d
            r17.mo117585c()
            com.google.android.gms.analytics.C142764q.m231686b()     // Catch:{ Exception -> 0x02df }
            r17.mo117537k()     // Catch:{ Exception -> 0x02df }
            r2 = 2
            java.lang.String r3 = "Dispatching a batch of local hits"
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x02df }
            com.google.android.gms.analytics.internal.q r0 = r7.f387384g     // Catch:{ Exception -> 0x02df }
            boolean r0 = r0.mo117559f()     // Catch:{ Exception -> 0x02df }
            r11 = 0
            r12 = 1
            if (r0 != 0) goto L_0x0060
            com.google.android.gms.analytics.internal.j r0 = r7.f387328e     // Catch:{ Exception -> 0x02df }
            com.google.android.gms.analytics.internal.ae r0 = r0.f387336d     // Catch:{ Exception -> 0x02df }
            r0 = 1
            goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            com.google.android.gms.analytics.internal.au r1 = r7.f387382d     // Catch:{ Exception -> 0x02df }
            boolean r1 = r1.mo117518e()     // Catch:{ Exception -> 0x02df }
            r1 = r1 ^ r12
            if (r0 == 0) goto L_0x0079
            if (r1 == 0) goto L_0x0079
            r2 = 2
            java.lang.String r3 = "No network or service available. Will retry later"
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x02df }
            goto L_0x02a8
        L_0x0079:
            com.google.android.gms.analytics.internal.j r0 = r7.f387328e     // Catch:{ Exception -> 0x02df }
            com.google.android.gms.analytics.internal.ae r0 = r0.f387336d     // Catch:{ Exception -> 0x02df }
            int r0 = com.google.android.gms.analytics.internal.C142708ae.m231547e()     // Catch:{ Exception -> 0x02df }
            com.google.android.gms.analytics.internal.j r1 = r7.f387328e     // Catch:{ Exception -> 0x02df }
            com.google.android.gms.analytics.internal.ae r1 = r1.f387336d     // Catch:{ Exception -> 0x02df }
            int r1 = com.google.android.gms.analytics.internal.C142708ae.m231546d()     // Catch:{ Exception -> 0x02df }
            int r0 = java.lang.Math.max(r0, r1)     // Catch:{ Exception -> 0x02df }
            long r13 = (long) r0     // Catch:{ Exception -> 0x02df }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x02df }
            r0.<init>()     // Catch:{ Exception -> 0x02df }
        L_0x0093:
            com.google.android.gms.analytics.internal.s r1 = r7.f387381c     // Catch:{ all -> 0x028b }
            r1.mo117572g()     // Catch:{ all -> 0x028b }
            r0.clear()     // Catch:{ all -> 0x028b }
            com.google.android.gms.analytics.internal.s r1 = r7.f387381c     // Catch:{ SQLiteException -> 0x025d }
            java.util.List r15 = r1.mo117570e(r13)     // Catch:{ SQLiteException -> 0x025d }
            boolean r1 = r15.isEmpty()     // Catch:{ SQLiteException -> 0x025d }
            if (r1 == 0) goto L_0x00d8
            java.lang.String r3 = "Store is empty, nothing to dispatch"
            r2 = 2
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ SQLiteException -> 0x025d }
            r17.m231667u()     // Catch:{ SQLiteException -> 0x025d }
            r17.m231666t()     // Catch:{ SQLiteException -> 0x025d }
            com.google.android.gms.analytics.internal.s r0 = r7.f387381c     // Catch:{ SQLiteException -> 0x00c4 }
            r0.mo117577r()     // Catch:{ SQLiteException -> 0x00c4 }
            com.google.android.gms.analytics.internal.s r0 = r7.f387381c     // Catch:{ SQLiteException -> 0x00c4 }
            r0.mo117575p()     // Catch:{ SQLiteException -> 0x00c4 }
            goto L_0x02a8
        L_0x00c4:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Failed to commit local dispatch transaction"
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x02df }
            r17.m231667u()     // Catch:{ Exception -> 0x02df }
        L_0x00d3:
            r17.m231666t()     // Catch:{ Exception -> 0x02df }
            goto L_0x02a8
        L_0x00d8:
            java.lang.String r3 = "Hits loaded from store. count"
            int r1 = r15.size()     // Catch:{ SQLiteException -> 0x025d }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x025d }
            r2 = 2
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ SQLiteException -> 0x025d }
            java.util.Iterator r1 = r15.iterator()     // Catch:{ all -> 0x028b }
        L_0x00ee:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x028b }
            if (r2 == 0) goto L_0x0137
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x028b }
            com.google.android.gms.analytics.internal.ao r2 = (com.google.android.gms.analytics.internal.C142718ao) r2     // Catch:{ all -> 0x028b }
            long r2 = r2.f387289c     // Catch:{ all -> 0x028b }
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x00ee
            java.lang.String r3 = "Database contains successfully uploaded hit"
            java.lang.Long r4 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x028b }
            int r0 = r15.size()     // Catch:{ all -> 0x028b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x028b }
            r2 = 6
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x028b }
            r17.m231667u()     // Catch:{ all -> 0x028b }
            r17.m231666t()     // Catch:{ all -> 0x028b }
            com.google.android.gms.analytics.internal.s r0 = r7.f387381c     // Catch:{ SQLiteException -> 0x0127 }
            r0.mo117577r()     // Catch:{ SQLiteException -> 0x0127 }
            com.google.android.gms.analytics.internal.s r0 = r7.f387381c     // Catch:{ SQLiteException -> 0x0127 }
            r0.mo117575p()     // Catch:{ SQLiteException -> 0x0127 }
            goto L_0x02a8
        L_0x0127:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Failed to commit local dispatch transaction"
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x02df }
            r17.m231667u()     // Catch:{ Exception -> 0x02df }
            goto L_0x00d3
        L_0x0137:
            com.google.android.gms.analytics.internal.q r1 = r7.f387384g     // Catch:{ all -> 0x028b }
            boolean r1 = r1.mo117559f()     // Catch:{ all -> 0x028b }
            if (r1 == 0) goto L_0x01bd
            com.google.android.gms.analytics.internal.j r1 = r7.f387328e     // Catch:{ all -> 0x028b }
            com.google.android.gms.analytics.internal.ae r1 = r1.f387336d     // Catch:{ all -> 0x028b }
            java.lang.String r3 = "Service connected, sending hits to the service"
            r2 = 2
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x028b }
        L_0x014e:
            boolean r1 = r15.isEmpty()     // Catch:{ all -> 0x028b }
            if (r1 != 0) goto L_0x01bd
            java.lang.Object r1 = r15.get(r11)     // Catch:{ all -> 0x028b }
            r6 = r1
            com.google.android.gms.analytics.internal.ao r6 = (com.google.android.gms.analytics.internal.C142718ao) r6     // Catch:{ all -> 0x028b }
            com.google.android.gms.analytics.internal.q r1 = r7.f387384g     // Catch:{ all -> 0x028b }
            boolean r1 = r1.mo117560g(r6)     // Catch:{ all -> 0x028b }
            if (r1 != 0) goto L_0x0164
            goto L_0x01bd
        L_0x0164:
            long r1 = r6.f387289c     // Catch:{ all -> 0x028b }
            long r9 = java.lang.Math.max(r9, r1)     // Catch:{ all -> 0x028b }
            r15.remove(r6)     // Catch:{ all -> 0x028b }
            java.lang.String r3 = "Hit sent do device AnalyticsService for delivery"
            r2 = 3
            r5 = 0
            r16 = 0
            r1 = r17
            r4 = r6
            r11 = r6
            r6 = r16
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x028b }
            com.google.android.gms.analytics.internal.s r1 = r7.f387381c     // Catch:{ SQLiteException -> 0x018e }
            long r2 = r11.f387289c     // Catch:{ SQLiteException -> 0x018e }
            r1.mo117573n(r2)     // Catch:{ SQLiteException -> 0x018e }
            long r1 = r11.f387289c     // Catch:{ SQLiteException -> 0x018e }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x018e }
            r0.add(r1)     // Catch:{ SQLiteException -> 0x018e }
            r11 = 0
            goto L_0x014e
        L_0x018e:
            r0 = move-exception
            r4 = r0
            java.lang.String r3 = "Failed to remove hit that was send for delivery"
            r2 = 6
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x028b }
            r17.m231667u()     // Catch:{ all -> 0x028b }
            r17.m231666t()     // Catch:{ all -> 0x028b }
            com.google.android.gms.analytics.internal.s r0 = r7.f387381c     // Catch:{ SQLiteException -> 0x01ac }
            r0.mo117577r()     // Catch:{ SQLiteException -> 0x01ac }
            com.google.android.gms.analytics.internal.s r0 = r7.f387381c     // Catch:{ SQLiteException -> 0x01ac }
            r0.mo117575p()     // Catch:{ SQLiteException -> 0x01ac }
            goto L_0x02a8
        L_0x01ac:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Failed to commit local dispatch transaction"
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x02df }
            r17.m231667u()     // Catch:{ Exception -> 0x02df }
            goto L_0x00d3
        L_0x01bd:
            com.google.android.gms.analytics.internal.au r1 = r7.f387382d     // Catch:{ all -> 0x028b }
            boolean r1 = r1.mo117518e()     // Catch:{ all -> 0x028b }
            if (r1 == 0) goto L_0x021c
            com.google.android.gms.analytics.internal.au r1 = r7.f387382d     // Catch:{ all -> 0x028b }
            java.util.List r1 = r1.mo117517d(r15)     // Catch:{ all -> 0x028b }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x028b }
        L_0x01cf:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x028b }
            if (r3 == 0) goto L_0x01e4
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x028b }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x028b }
            long r3 = r3.longValue()     // Catch:{ all -> 0x028b }
            long r9 = java.lang.Math.max(r9, r3)     // Catch:{ all -> 0x028b }
            goto L_0x01cf
        L_0x01e4:
            com.google.android.gms.analytics.internal.s r2 = r7.f387381c     // Catch:{ SQLiteException -> 0x01ed }
            r2.mo117574o(r1)     // Catch:{ SQLiteException -> 0x01ed }
            r0.addAll(r1)     // Catch:{ SQLiteException -> 0x01ed }
            goto L_0x021c
        L_0x01ed:
            r0 = move-exception
            r4 = r0
            java.lang.String r3 = "Failed to remove successfully uploaded hits"
            r2 = 6
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x028b }
            r17.m231667u()     // Catch:{ all -> 0x028b }
            r17.m231666t()     // Catch:{ all -> 0x028b }
            com.google.android.gms.analytics.internal.s r0 = r7.f387381c     // Catch:{ SQLiteException -> 0x020b }
            r0.mo117577r()     // Catch:{ SQLiteException -> 0x020b }
            com.google.android.gms.analytics.internal.s r0 = r7.f387381c     // Catch:{ SQLiteException -> 0x020b }
            r0.mo117575p()     // Catch:{ SQLiteException -> 0x020b }
            goto L_0x02a8
        L_0x020b:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Failed to commit local dispatch transaction"
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x02df }
            r17.m231667u()     // Catch:{ Exception -> 0x02df }
            goto L_0x00d3
        L_0x021c:
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x028b }
            if (r1 == 0) goto L_0x023f
            com.google.android.gms.analytics.internal.s r0 = r7.f387381c     // Catch:{ SQLiteException -> 0x022e }
            r0.mo117577r()     // Catch:{ SQLiteException -> 0x022e }
            com.google.android.gms.analytics.internal.s r0 = r7.f387381c     // Catch:{ SQLiteException -> 0x022e }
            r0.mo117575p()     // Catch:{ SQLiteException -> 0x022e }
            goto L_0x02a8
        L_0x022e:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Failed to commit local dispatch transaction"
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x02df }
            r17.m231667u()     // Catch:{ Exception -> 0x02df }
            goto L_0x00d3
        L_0x023f:
            com.google.android.gms.analytics.internal.s r1 = r7.f387381c     // Catch:{ SQLiteException -> 0x024c }
            r1.mo117577r()     // Catch:{ SQLiteException -> 0x024c }
            com.google.android.gms.analytics.internal.s r1 = r7.f387381c     // Catch:{ SQLiteException -> 0x024c }
            r1.mo117575p()     // Catch:{ SQLiteException -> 0x024c }
            r11 = 0
            goto L_0x0093
        L_0x024c:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Failed to commit local dispatch transaction"
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x02df }
            r17.m231667u()     // Catch:{ Exception -> 0x02df }
            goto L_0x00d3
        L_0x025d:
            r0 = move-exception
            r4 = r0
            java.lang.String r3 = "Failed to read hits from persisted store"
            r2 = 5
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x028b }
            r17.m231667u()     // Catch:{ all -> 0x028b }
            r17.m231666t()     // Catch:{ all -> 0x028b }
            com.google.android.gms.analytics.internal.s r0 = r7.f387381c     // Catch:{ SQLiteException -> 0x027a }
            r0.mo117577r()     // Catch:{ SQLiteException -> 0x027a }
            com.google.android.gms.analytics.internal.s r0 = r7.f387381c     // Catch:{ SQLiteException -> 0x027a }
            r0.mo117575p()     // Catch:{ SQLiteException -> 0x027a }
            goto L_0x02a8
        L_0x027a:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Failed to commit local dispatch transaction"
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x02df }
            r17.m231667u()     // Catch:{ Exception -> 0x02df }
            goto L_0x00d3
        L_0x028b:
            r0 = move-exception
            com.google.android.gms.analytics.internal.s r1 = r7.f387381c     // Catch:{ SQLiteException -> 0x0297 }
            r1.mo117577r()     // Catch:{ SQLiteException -> 0x0297 }
            com.google.android.gms.analytics.internal.s r1 = r7.f387381c     // Catch:{ SQLiteException -> 0x0297 }
            r1.mo117575p()     // Catch:{ SQLiteException -> 0x0297 }
            throw r0     // Catch:{ Exception -> 0x02df }
        L_0x0297:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Failed to commit local dispatch transaction"
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x02df }
            r17.m231667u()     // Catch:{ Exception -> 0x02df }
            goto L_0x00d3
        L_0x02a8:
            com.google.android.gms.analytics.internal.j r0 = r7.f387328e     // Catch:{ Exception -> 0x02df }
            com.google.android.gms.analytics.internal.aw r0 = r0.mo117549i()     // Catch:{ Exception -> 0x02df }
            r0.mo117525d()     // Catch:{ Exception -> 0x02df }
            r17.mo117593q()     // Catch:{ Exception -> 0x02df }
            if (r8 == 0) goto L_0x02bb
            com.google.android.gms.analytics.internal.y r0 = r8.f387378a     // Catch:{ Exception -> 0x02df }
            r0.mo117593q()     // Catch:{ Exception -> 0x02df }
        L_0x02bb:
            long r0 = r7.f387380b     // Catch:{ Exception -> 0x02df }
            int r2 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r2 == 0) goto L_0x02fe
            com.google.android.gms.analytics.internal.at r0 = r7.f387383f     // Catch:{ Exception -> 0x02df }
            com.google.android.gms.analytics.internal.j r0 = r0.f387301b     // Catch:{ Exception -> 0x02df }
            android.content.Context r0 = r0.f387334b     // Catch:{ Exception -> 0x02df }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x02df }
            java.lang.String r2 = "com.google.analytics.RADIO_POWERED"
            r1.<init>(r2)     // Catch:{ Exception -> 0x02df }
            java.lang.String r2 = r0.getPackageName()     // Catch:{ Exception -> 0x02df }
            r1.addCategory(r2)     // Catch:{ Exception -> 0x02df }
            java.lang.String r2 = com.google.android.gms.analytics.internal.C142723at.f387300a     // Catch:{ Exception -> 0x02df }
            r1.putExtra(r2, r12)     // Catch:{ Exception -> 0x02df }
            r2 = 0
            r0.sendOrderedBroadcast(r1, r2)     // Catch:{ Exception -> 0x02df }
            return
        L_0x02df:
            r0 = move-exception
            r4 = r0
            r2 = 6
            java.lang.String r3 = "Local dispatch failed"
            r5 = 0
            r6 = 0
            r1 = r17
            super.mo117536i(r2, r3, r4, r5, r6)
            com.google.android.gms.analytics.internal.j r0 = r7.f387328e
            com.google.android.gms.analytics.internal.aw r0 = r0.mo117549i()
            r0.mo117525d()
            r17.mo117593q()
            if (r8 == 0) goto L_0x02fe
            com.google.android.gms.analytics.internal.y r0 = r8.f387378a
            r0.mo117593q()
        L_0x02fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.C142755y.mo117594r(com.google.android.gms.analytics.internal.x, long):void");
    }

    /* renamed from: s */
    public final long mo117595s(C142742l lVar) {
        mo117537k();
        C142764q.m231686b();
        try {
            this.f387381c.mo117572g();
            this.f387381c.mo117582w(lVar.f387351a);
            C142749s sVar = this.f387381c;
            String str = lVar.f387351a;
            String str2 = lVar.f387352b;
            C143919bh.m233969l(str);
            C143919bh.m233969l(str2);
            sVar.mo117537k();
            C142764q.m231686b();
            long v = sVar.mo117581v("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{"0", str, str2});
            lVar.f387354d = 1 + v;
            this.f387381c.mo117578s(lVar);
            this.f387381c.mo117577r();
            try {
                this.f387381c.mo117575p();
            } catch (SQLiteException e) {
                super.mo117536i(6, "Failed to end transaction", e, (Object) null, (Object) null);
            }
            return v;
        } catch (SQLiteException e2) {
            super.mo117536i(6, "Failed to update Analytics property", e2, (Object) null, (Object) null);
            try {
                this.f387381c.mo117575p();
                return -1;
            } catch (SQLiteException e3) {
                super.mo117536i(6, "Failed to end transaction", e3, (Object) null, (Object) null);
                return -1;
            }
        } catch (Throwable th) {
            try {
                this.f387381c.mo117575p();
            } catch (SQLiteException e4) {
                super.mo117536i(6, "Failed to end transaction", e4, (Object) null, (Object) null);
            }
            throw th;
        }
    }
}
