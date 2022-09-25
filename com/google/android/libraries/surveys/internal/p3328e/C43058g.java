package com.google.android.libraries.surveys.internal.p3328e;

import android.content.Context;
import com.google.android.gms.clearcut.C143658k;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63042fg;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64457ar;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64474bh;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64526df;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64527dg;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64528dh;
import java.security.SecureRandom;

/* renamed from: com.google.android.libraries.surveys.internal.e.g */
/* compiled from: PG */
public final class C43058g {

    /* renamed from: b */
    private static C43058g f112616b;

    /* renamed from: a */
    C143658k f112617a;

    /* renamed from: c */
    private final String f112618c;

    private C43058g() {
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(new SecureRandom().nextLong());
        this.f112618c = currentTimeMillis + "_" + abs;
    }

    /* renamed from: a */
    public static C43058g m75965a() {
        if (f112616b == null) {
            f112616b = new C43058g();
        }
        return f112616b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0225  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m75966e(com.google.protos.p4959be.p4960a.p4961a.p4962a.C64527dg r7, com.google.protobuf.C63042fg r8, com.google.protobuf.C62910ar r9, android.content.Context r10, java.lang.String r11) {
        /*
            r6 = this;
            android.content.Context r0 = com.google.android.libraries.surveys.internal.p3328e.C43054c.f112610b
            e.a.a.ag.a.a r1 = p5304e.p5305a.p5306a.p5333ag.p5334a.C68351a.f184689a
            e.a.a.ag.a.b r1 = r1.mo6453a()
            boolean r0 = r1.mo60367b(r0)
            boolean r0 = com.google.android.libraries.surveys.internal.p3328e.C43054c.m75960c(r0)
            if (r0 == 0) goto L_0x0016
            if (r11 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            return
        L_0x0016:
            java.lang.String r0 = r6.f112618c
            r7.copyOnWrite()
            com.google.protobuf.bv r1 = r7.instance
            com.google.protos.be.a.a.a.dh r1 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64528dh) r1
            com.google.protos.be.a.a.a.dh r2 = com.google.protos.p4959be.p4960a.p4961a.p4962a.C64528dh.f174998f
            r1.f175000a = r0
            com.google.protos.be.a.a.a.n r0 = com.google.protos.p4959be.p4960a.p4961a.p4962a.C64538n.f175027e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.protos.be.a.a.a.m r0 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64537m) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.protos.be.a.a.a.n r1 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64538n) r1
            r8.getClass()
            r1.f175029a = r8
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.protos.be.a.a.a.n r8 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64538n) r8
            r9.getClass()
            r8.f175030b = r9
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getLanguage()
            android.content.Context r9 = com.google.android.libraries.surveys.internal.p3328e.C43054c.f112610b
            boolean r9 = p5304e.p5305a.p5306a.p5333ag.p5334a.C68400y.m98797c(r9)
            boolean r9 = com.google.android.libraries.surveys.internal.p3328e.C43054c.m75959b(r9)
            if (r9 == 0) goto L_0x005f
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.toLanguageTag()
        L_0x005f:
            com.google.protos.be.a.a.a.dd r9 = com.google.protos.p4959be.p4960a.p4961a.p4962a.C64524dd.f174991b
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.protos.be.a.a.a.dc r9 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64523dc) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r1 = r9.instance
            com.google.protos.be.a.a.a.dd r1 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64524dd) r1
            r8.getClass()
            r1.f174993a = r8
            com.google.protobuf.bv r8 = r9.build()
            com.google.protos.be.a.a.a.dd r8 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64524dd) r8
            r0.copyOnWrite()
            com.google.protobuf.bv r9 = r0.instance
            com.google.protos.be.a.a.a.n r9 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64538n) r9
            r8.getClass()
            r9.f175031c = r8
            android.content.pm.PackageManager r8 = r10.getPackageManager()
            java.lang.String r9 = "Unknown"
            if (r8 == 0) goto L_0x00ca
            java.lang.String r1 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00be }
            r2 = 0
            android.content.pm.PackageInfo r1 = r8.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException -> 0x00be }
            if (r1 == 0) goto L_0x00ca
            android.content.pm.ApplicationInfo r2 = r1.applicationInfo     // Catch:{ NameNotFoundException -> 0x00be }
            java.lang.CharSequence r8 = r8.getApplicationLabel(r2)     // Catch:{ NameNotFoundException -> 0x00be }
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x00be }
            if (r2 != 0) goto L_0x00a9
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x00be }
            goto L_0x00aa
        L_0x00a9:
            r8 = r9
        L_0x00aa:
            java.lang.String r2 = r1.versionName     // Catch:{ NameNotFoundException -> 0x00bc }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ NameNotFoundException -> 0x00bc }
            if (r2 != 0) goto L_0x00b5
            java.lang.String r1 = r1.versionName     // Catch:{ NameNotFoundException -> 0x00bc }
            goto L_0x00cc
        L_0x00b5:
            int r1 = r1.versionCode     // Catch:{ NameNotFoundException -> 0x00bc }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ NameNotFoundException -> 0x00bc }
            goto L_0x00cc
        L_0x00bc:
            r1 = move-exception
            goto L_0x00c1
        L_0x00be:
            r8 = move-exception
            r1 = r8
            r8 = r9
        L_0x00c1:
            java.lang.String r2 = "SurveyMetricsLogger"
            java.lang.String r3 = "Exception while retrieving application information."
            android.util.Log.e(r2, r3, r1)
            r1 = r9
            goto L_0x00cc
        L_0x00ca:
            r8 = r9
            r1 = r8
        L_0x00cc:
            java.lang.String r2 = r10.getPackageName()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00d7
            goto L_0x00db
        L_0x00d7:
            java.lang.String r9 = r10.getPackageName()
        L_0x00db:
            com.google.protos.be.a.a.a.h r2 = com.google.protos.p4959be.p4960a.p4961a.p4962a.C64532h.f175005g
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.protos.be.a.a.a.g r2 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64531g) r2
            java.lang.String r3 = android.os.Build.MODEL
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.protos.be.a.a.a.h r4 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64532h) r4
            r3.getClass()
            r4.f175007a = r3
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.protos.be.a.a.a.h r3 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64532h) r3
            r4 = 1
            r3.f175008b = r4
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.protos.be.a.a.a.h r5 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64532h) r5
            r3.getClass()
            r5.f175009c = r3
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.protos.be.a.a.a.h r3 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64532h) r3
            r8.getClass()
            r3.f175010d = r8
            r2.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.protos.be.a.a.a.h r8 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64532h) r8
            r9.getClass()
            r8.f175011e = r9
            r2.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.protos.be.a.a.a.h r8 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64532h) r8
            r1.getClass()
            r8.f175012f = r1
            com.google.protobuf.bv r8 = r2.build()
            com.google.protos.be.a.a.a.h r8 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64532h) r8
            java.util.TimeZone r9 = java.util.TimeZone.getDefault()
            java.lang.String r9 = r9.getID()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.TimeZone r9 = p3186j$.util.DesugarTimeZone.getTimeZone(r9)
            int r9 = r9.getRawOffset()
            long r2 = (long) r9
            long r1 = r1.toSeconds(r2)
            com.google.protobuf.ar r9 = com.google.protobuf.C62910ar.f169858c
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.protobuf.aq r9 = (com.google.protobuf.C62909aq) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r3 = r9.instance
            com.google.protobuf.ar r3 = (com.google.protobuf.C62910ar) r3
            r3.f169860a = r1
            com.google.protobuf.bv r9 = r9.build()
            com.google.protobuf.ar r9 = (com.google.protobuf.C62910ar) r9
            com.google.protos.be.a.a.a.i r1 = com.google.protos.p4959be.p4960a.p4961a.p4962a.C64533i.f175013c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.protos.be.a.a.a.f r1 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64530f) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.protos.be.a.a.a.i r2 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64533i) r2
            r8.getClass()
            r2.f175015a = r8
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.protos.be.a.a.a.i r8 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64533i) r8
            r9.getClass()
            r8.f175016b = r9
            com.google.protobuf.bv r8 = r1.build()
            com.google.protos.be.a.a.a.i r8 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64533i) r8
            com.google.protos.be.a.a.a.k r9 = com.google.protos.p4959be.p4960a.p4961a.p4962a.C64535k.f175017e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.protos.be.a.a.a.j r9 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64534j) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r1 = r9.instance
            com.google.protos.be.a.a.a.k r1 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64535k) r1
            r2 = 2
            r1.f175019a = r2
            java.lang.String r1 = com.google.android.libraries.surveys.internal.p3328e.C43066o.m75988i()
            r9.copyOnWrite()
            com.google.protobuf.bv r2 = r9.instance
            com.google.protos.be.a.a.a.k r2 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64535k) r2
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = ""
            java.lang.String r1 = r1.concat(r3)
            r2.f175020b = r1
            r9.copyOnWrite()
            com.google.protobuf.bv r1 = r9.instance
            com.google.protos.be.a.a.a.k r1 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64535k) r1
            com.google.protobuf.ch r2 = r1.f175021c
            boolean r3 = r2.mo58948c()
            if (r3 != 0) goto L_0x01c5
            com.google.protobuf.ch r2 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r2)
            r1.f175021c = r2
        L_0x01c5:
            com.google.protobuf.ch r1 = r1.f175021c
            r1.mo58916g(r4)
            int r1 = com.google.android.libraries.surveys.internal.p3328e.C43066o.m75980a()
            r9.copyOnWrite()
            com.google.protobuf.bv r2 = r9.instance
            com.google.protos.be.a.a.a.k r2 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64535k) r2
            r2.f175022d = r1
            com.google.protobuf.bv r9 = r9.build()
            com.google.protos.be.a.a.a.k r9 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64535k) r9
            com.google.protos.be.a.a.a.l r1 = com.google.protos.p4959be.p4960a.p4961a.p4962a.C64536l.f175023c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.protos.be.a.a.a.e r1 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64529e) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.protos.be.a.a.a.l r2 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64536l) r2
            r8.getClass()
            r2.f175025a = r8
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.protos.be.a.a.a.l r8 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64536l) r8
            r9.getClass()
            r8.f175026b = r9
            com.google.protobuf.bv r8 = r1.build()
            com.google.protos.be.a.a.a.l r8 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64536l) r8
            r0.copyOnWrite()
            com.google.protobuf.bv r9 = r0.instance
            com.google.protos.be.a.a.a.n r9 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64538n) r9
            r8.getClass()
            r9.f175032d = r8
            com.google.protobuf.bv r8 = r0.build()
            com.google.protos.be.a.a.a.n r8 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64538n) r8
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.protos.be.a.a.a.dh r9 = (com.google.protos.p4959be.p4960a.p4961a.p4962a.C64528dh) r9
            r8.getClass()
            r9.f175001b = r8
            com.google.android.gms.clearcut.k r8 = r6.f112617a
            if (r8 != 0) goto L_0x023c
            com.google.android.gms.clearcut.k r8 = new com.google.android.gms.clearcut.k
            android.content.Context r9 = r10.getApplicationContext()
            android.content.Context r10 = com.google.android.libraries.surveys.internal.p3328e.C43054c.f112610b
            e.a.a.ag.a.a r0 = p5304e.p5305a.p5306a.p5333ag.p5334a.C68351a.f184689a
            e.a.a.ag.a.b r0 = r0.mo6453a()
            java.lang.String r10 = r0.mo60366a(r10)
            r8.<init>(r9, r10, r11)
            r6.f112617a = r8
        L_0x023c:
            com.google.android.gms.clearcut.k r8 = r6.f112617a
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.gms.clearcut.j r7 = r8.mo118999d(r7)
            r7.f389473o = r4
            r7.mo118992a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.internal.p3328e.C43058g.m75966e(com.google.protos.be.a.a.a.dg, com.google.protobuf.fg, com.google.protobuf.ar, android.content.Context, java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo46077b(C64457ar arVar, C63042fg fgVar, C62910ar arVar2, Context context, String str) {
        C64527dg dgVar = (C64527dg) C64528dh.f174998f.createBuilder();
        dgVar.copyOnWrite();
        arVar.getClass();
        ((C64528dh) dgVar.instance).f175002c = arVar;
        m75966e(dgVar, fgVar, arVar2, context, str);
    }

    /* renamed from: c */
    public final void mo46078c(C64474bh bhVar, C63042fg fgVar, C62910ar arVar, Context context, String str) {
        C64527dg dgVar = (C64527dg) C64528dh.f174998f.createBuilder();
        dgVar.copyOnWrite();
        bhVar.getClass();
        ((C64528dh) dgVar.instance).f175004e = bhVar;
        m75966e(dgVar, fgVar, arVar, context, str);
    }

    /* renamed from: d */
    public final void mo46079d(C64526df dfVar, C63042fg fgVar, C62910ar arVar, Context context, String str) {
        C64527dg dgVar = (C64527dg) C64528dh.f174998f.createBuilder();
        dgVar.copyOnWrite();
        dfVar.getClass();
        ((C64528dh) dgVar.instance).f175003d = dfVar;
        m75966e(dgVar, fgVar, arVar, context, str);
    }
}
