package com.google.android.libraries.performance.primes.metrics.p2403a;

import android.os.health.HealthStats;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import java.util.Collections;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71193ac;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71194ad;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71317l;

/* renamed from: com.google.android.libraries.performance.primes.metrics.a.b */
/* compiled from: PG */
public final class C31269b {
    /* renamed from: a */
    static final C31290w m58279a(Long l, Long l2, HealthStats healthStats, C71317l lVar, C31270c cVar) {
        HealthStats healthStats2 = healthStats;
        C31270c cVar2 = cVar;
        C31293z zVar = cVar2.f84217a;
        C71194ad adVar = (C71194ad) C71195ae.f189959an.createBuilder();
        long a = C31285r.m58320a(healthStats2, 10001);
        long j = 0;
        if (a != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar = (C71195ae) adVar.instance;
            aeVar.f189987a |= 1;
            aeVar.f190002c = a;
        }
        long a2 = C31285r.m58320a(healthStats2, 10002);
        if (a2 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar2 = (C71195ae) adVar.instance;
            aeVar2.f189987a |= 2;
            aeVar2.f190003d = a2;
        }
        long a3 = C31285r.m58320a(healthStats2, 10003);
        if (a3 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar3 = (C71195ae) adVar.instance;
            aeVar3.f189987a |= 4;
            aeVar3.f190004e = a3;
        }
        long a4 = C31285r.m58320a(healthStats2, 10004);
        if (a4 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar4 = (C71195ae) adVar.instance;
            aeVar4.f189987a |= 8;
            aeVar4.f190005f = a4;
        }
        adVar.mo62638n(C31285r.m58321b(healthStats2, 10005));
        adVar.mo62639o(C31285r.m58321b(healthStats2, 10006));
        adVar.mo62640p(C31285r.m58321b(healthStats2, 10007));
        adVar.mo62637m(C31285r.m58321b(healthStats2, 10008));
        adVar.mo62636l(C31285r.m58321b(healthStats2, 10009));
        adVar.mo62632h(C31285r.m58321b(healthStats2, 10010));
        C71193ac e = C31285r.m58324e(healthStats2, 10011);
        if (e != null) {
            adVar.copyOnWrite();
            C71195ae aeVar5 = (C71195ae) adVar.instance;
            aeVar5.f190012m = e;
            aeVar5.f189987a |= 16;
        }
        adVar.mo62633i(C31285r.m58321b(healthStats2, 10012));
        adVar.mo62635k(C31281n.f84251a.mo36996d(C31285r.m58322c(healthStats2, 10014)));
        adVar.mo62634j(C31280m.f84250a.mo36996d(C31285r.m58322c(healthStats2, 10015)));
        long a5 = C31285r.m58320a(healthStats2, 10016);
        if (a5 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar6 = (C71195ae) adVar.instance;
            aeVar6.f189987a |= 32;
            aeVar6.f190017r = a5;
        }
        long a6 = C31285r.m58320a(healthStats2, 10017);
        if (a6 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar7 = (C71195ae) adVar.instance;
            aeVar7.f189987a |= 64;
            aeVar7.f190018s = a6;
        }
        long a7 = C31285r.m58320a(healthStats2, 10018);
        if (a7 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar8 = (C71195ae) adVar.instance;
            aeVar8.f189987a |= 128;
            aeVar8.f190019t = a7;
        }
        long a8 = C31285r.m58320a(healthStats2, 10019);
        if (a8 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar9 = (C71195ae) adVar.instance;
            aeVar9.f189987a |= 256;
            aeVar9.f190020u = a8;
        }
        long a9 = C31285r.m58320a(healthStats2, 10020);
        if (a9 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar10 = (C71195ae) adVar.instance;
            aeVar10.f189987a |= 512;
            aeVar10.f190021v = a9;
        }
        long a10 = C31285r.m58320a(healthStats2, 10021);
        if (a10 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar11 = (C71195ae) adVar.instance;
            aeVar11.f189987a |= 1024;
            aeVar11.f190022w = a10;
        }
        long a11 = C31285r.m58320a(healthStats2, 10022);
        if (a11 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar12 = (C71195ae) adVar.instance;
            aeVar12.f189987a |= 2048;
            aeVar12.f190023x = a11;
        }
        long a12 = C31285r.m58320a(healthStats2, 10023);
        if (a12 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar13 = (C71195ae) adVar.instance;
            aeVar13.f189987a |= 4096;
            aeVar13.f190024y = a12;
        }
        long a13 = C31285r.m58320a(healthStats2, 10024);
        if (a13 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar14 = (C71195ae) adVar.instance;
            aeVar14.f189987a |= 8192;
            aeVar14.f190025z = a13;
        }
        long a14 = C31285r.m58320a(healthStats2, 10025);
        if (a14 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar15 = (C71195ae) adVar.instance;
            aeVar15.f189987a |= 16384;
            aeVar15.f189961A = a14;
        }
        long a15 = C31285r.m58320a(healthStats2, 10026);
        if (a15 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar16 = (C71195ae) adVar.instance;
            aeVar16.f189987a |= 32768;
            aeVar16.f189962B = a15;
        }
        long a16 = C31285r.m58320a(healthStats2, 10027);
        if (a16 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar17 = (C71195ae) adVar.instance;
            aeVar17.f189987a |= 65536;
            aeVar17.f189963C = a16;
        }
        long a17 = C31285r.m58320a(healthStats2, 10028);
        if (a17 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar18 = (C71195ae) adVar.instance;
            aeVar18.f189987a |= C89885b.S3REQUEST_VALUE;
            aeVar18.f189964D = a17;
        }
        long a18 = C31285r.m58320a(healthStats2, 10029);
        if (a18 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar19 = (C71195ae) adVar.instance;
            aeVar19.f189987a |= C89885b.HTTP_VALUE;
            aeVar19.f189965E = a18;
        }
        C71193ac e2 = C31285r.m58324e(healthStats2, 10030);
        if (e2 != null) {
            adVar.copyOnWrite();
            C71195ae aeVar20 = (C71195ae) adVar.instance;
            aeVar20.f189966F = e2;
            aeVar20.f189987a |= 524288;
        }
        long a19 = C31285r.m58320a(healthStats2, 10031);
        if (a19 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar21 = (C71195ae) adVar.instance;
            aeVar21.f189987a |= 1048576;
            aeVar21.f189967G = a19;
        }
        C71193ac e3 = C31285r.m58324e(healthStats2, 10032);
        if (e3 != null) {
            adVar.copyOnWrite();
            C71195ae aeVar22 = (C71195ae) adVar.instance;
            aeVar22.f189968H = e3;
            aeVar22.f189987a |= C89885b.NOW_VALUE;
        }
        C71193ac e4 = C31285r.m58324e(healthStats2, 10033);
        if (e4 != null) {
            adVar.copyOnWrite();
            C71195ae aeVar23 = (C71195ae) adVar.instance;
            aeVar23.f189969I = e4;
            aeVar23.f189987a |= 4194304;
        }
        C71193ac e5 = C31285r.m58324e(healthStats2, 10034);
        if (e5 != null) {
            adVar.copyOnWrite();
            C71195ae aeVar24 = (C71195ae) adVar.instance;
            aeVar24.f189970J = e5;
            aeVar24.f189987a |= 8388608;
        }
        C71193ac e6 = C31285r.m58324e(healthStats2, 10035);
        if (e6 != null) {
            adVar.copyOnWrite();
            C71195ae aeVar25 = (C71195ae) adVar.instance;
            aeVar25.f189971K = e6;
            aeVar25.f189987a |= 16777216;
        }
        C71193ac e7 = C31285r.m58324e(healthStats2, 10036);
        if (e7 != null) {
            adVar.copyOnWrite();
            C71195ae aeVar26 = (C71195ae) adVar.instance;
            aeVar26.f189972L = e7;
            aeVar26.f189987a |= 33554432;
        }
        C71193ac e8 = C31285r.m58324e(healthStats2, 10037);
        if (e8 != null) {
            adVar.copyOnWrite();
            C71195ae aeVar27 = (C71195ae) adVar.instance;
            aeVar27.f189973M = e8;
            aeVar27.f189987a |= 67108864;
        }
        C71193ac e9 = C31285r.m58324e(healthStats2, 10038);
        if (e9 != null) {
            adVar.copyOnWrite();
            C71195ae aeVar28 = (C71195ae) adVar.instance;
            aeVar28.f189974N = e9;
            aeVar28.f189987a |= 134217728;
        }
        C71193ac e10 = C31285r.m58324e(healthStats2, 10039);
        if (e10 != null) {
            adVar.copyOnWrite();
            C71195ae aeVar29 = (C71195ae) adVar.instance;
            aeVar29.f189975O = e10;
            aeVar29.f189987a |= 268435456;
        }
        C71193ac e11 = C31285r.m58324e(healthStats2, 10040);
        if (e11 != null) {
            adVar.copyOnWrite();
            C71195ae aeVar30 = (C71195ae) adVar.instance;
            aeVar30.f189976P = e11;
            aeVar30.f189987a |= 536870912;
        }
        C71193ac e12 = C31285r.m58324e(healthStats2, 10041);
        if (e12 != null) {
            adVar.copyOnWrite();
            C71195ae aeVar31 = (C71195ae) adVar.instance;
            aeVar31.f189977Q = e12;
            aeVar31.f189987a |= 1073741824;
        }
        C71193ac e13 = C31285r.m58324e(healthStats2, 10042);
        if (e13 != null) {
            adVar.copyOnWrite();
            C71195ae aeVar32 = (C71195ae) adVar.instance;
            aeVar32.f189978R = e13;
            aeVar32.f189987a |= LinearLayoutManager.INVALID_OFFSET;
        }
        C71193ac e14 = C31285r.m58324e(healthStats2, 10043);
        if (e14 != null) {
            adVar.copyOnWrite();
            C71195ae aeVar33 = (C71195ae) adVar.instance;
            aeVar33.f189979S = e14;
            aeVar33.f190001b |= 1;
        }
        C71193ac e15 = C31285r.m58324e(healthStats2, 10044);
        if (e15 != null) {
            adVar.copyOnWrite();
            C71195ae aeVar34 = (C71195ae) adVar.instance;
            aeVar34.f189980T = e15;
            aeVar34.f190001b |= 2;
        }
        long a20 = C31285r.m58320a(healthStats2, 10045);
        if (a20 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar35 = (C71195ae) adVar.instance;
            aeVar35.f190001b |= 4;
            aeVar35.f189981U = a20;
        }
        long a21 = C31285r.m58320a(healthStats2, 10046);
        if (a21 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar36 = (C71195ae) adVar.instance;
            aeVar36.f190001b |= 8;
            aeVar36.f189982V = a21;
        }
        long a22 = C31285r.m58320a(healthStats2, 10047);
        if (a22 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar37 = (C71195ae) adVar.instance;
            aeVar37.f190001b |= 16;
            aeVar37.f189983W = a22;
        }
        long a23 = C31285r.m58320a(healthStats2, 10048);
        if (a23 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar38 = (C71195ae) adVar.instance;
            aeVar38.f190001b |= 32;
            aeVar38.f189984X = a23;
        }
        long a24 = C31285r.m58320a(healthStats2, 10049);
        if (a24 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar39 = (C71195ae) adVar.instance;
            aeVar39.f190001b |= 64;
            aeVar39.f189985Y = a24;
        }
        long a25 = C31285r.m58320a(healthStats2, 10050);
        if (a25 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar40 = (C71195ae) adVar.instance;
            aeVar40.f190001b |= 128;
            aeVar40.f189986Z = a25;
        }
        long a26 = C31285r.m58320a(healthStats2, 10051);
        if (a26 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar41 = (C71195ae) adVar.instance;
            aeVar41.f190001b |= 256;
            aeVar41.f189988aa = a26;
        }
        long a27 = C31285r.m58320a(healthStats2, 10052);
        if (a27 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar42 = (C71195ae) adVar.instance;
            aeVar42.f190001b |= 512;
            aeVar42.f189989ab = a27;
        }
        long a28 = C31285r.m58320a(healthStats2, 10053);
        if (a28 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar43 = (C71195ae) adVar.instance;
            aeVar43.f190001b |= 1024;
            aeVar43.f189990ac = a28;
        }
        long a29 = C31285r.m58320a(healthStats2, 10054);
        if (a29 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar44 = (C71195ae) adVar.instance;
            aeVar44.f190001b |= 2048;
            aeVar44.f189991ad = a29;
        }
        long a30 = C31285r.m58320a(healthStats2, 10055);
        if (a30 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar45 = (C71195ae) adVar.instance;
            aeVar45.f190001b |= 4096;
            aeVar45.f189992ae = a30;
        }
        long a31 = C31285r.m58320a(healthStats2, 10056);
        if (a31 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar46 = (C71195ae) adVar.instance;
            aeVar46.f190001b |= 8192;
            aeVar46.f189993af = a31;
        }
        long a32 = C31285r.m58320a(healthStats2, 10057);
        if (a32 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar47 = (C71195ae) adVar.instance;
            aeVar47.f190001b |= 16384;
            aeVar47.f189994ag = a32;
        }
        long a33 = C31285r.m58320a(healthStats2, 10058);
        if (a33 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar48 = (C71195ae) adVar.instance;
            aeVar48.f190001b = 32768 | aeVar48.f190001b;
            aeVar48.f189995ah = a33;
        }
        long a34 = C31285r.m58320a(healthStats2, 10059);
        if (a34 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar49 = (C71195ae) adVar.instance;
            aeVar49.f190001b |= 65536;
            aeVar49.f189996ai = a34;
        }
        C71193ac e16 = C31285r.m58324e(healthStats2, 10061);
        if (e16 != null) {
            adVar.copyOnWrite();
            C71195ae aeVar50 = (C71195ae) adVar.instance;
            aeVar50.f189997aj = e16;
            aeVar50.f190001b |= C89885b.S3REQUEST_VALUE;
        }
        long a35 = C31285r.m58320a(healthStats2, 10062);
        if (a35 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar51 = (C71195ae) adVar.instance;
            aeVar51.f190001b |= C89885b.HTTP_VALUE;
            aeVar51.f189998ak = a35;
        }
        long a36 = C31285r.m58320a(healthStats2, 10063);
        if (a36 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar52 = (C71195ae) adVar.instance;
            aeVar52.f190001b = 524288 | aeVar52.f190001b;
            aeVar52.f189999al = a36;
        }
        long a37 = C31285r.m58320a(healthStats2, 10064);
        if (a37 != 0) {
            adVar.copyOnWrite();
            C71195ae aeVar53 = (C71195ae) adVar.instance;
            aeVar53.f190001b |= 1048576;
            aeVar53.f190000am = a37;
        }
        C71194ad adVar2 = (C71194ad) ((C71195ae) adVar.build()).toBuilder();
        C31278k kVar = zVar.f84267b;
        Collections.unmodifiableList(((C71195ae) adVar2.instance).f190006g);
        for (int i = 0; i < ((C71195ae) adVar2.instance).f190006g.size(); i++) {
            adVar2.mo62645u(i, kVar.mo36992c(1, adVar2.mo62625a(i)));
        }
        Collections.unmodifiableList(((C71195ae) adVar2.instance).f190007h);
        for (int i2 = 0; i2 < ((C71195ae) adVar2.instance).f190007h.size(); i2++) {
            adVar2.mo62646v(i2, kVar.mo36992c(1, adVar2.mo62626b(i2)));
        }
        Collections.unmodifiableList(((C71195ae) adVar2.instance).f190008i);
        for (int i3 = 0; i3 < ((C71195ae) adVar2.instance).f190008i.size(); i3++) {
            adVar2.mo62647w(i3, kVar.mo36992c(1, adVar2.mo62627c(i3)));
        }
        Collections.unmodifiableList(((C71195ae) adVar2.instance).f190009j);
        for (int i4 = 0; i4 < ((C71195ae) adVar2.instance).f190009j.size(); i4++) {
            adVar2.mo62644t(i4, kVar.mo36992c(1, adVar2.mo62628d(i4)));
        }
        Collections.unmodifiableList(((C71195ae) adVar2.instance).f190010k);
        for (int i5 = 0; i5 < ((C71195ae) adVar2.instance).f190010k.size(); i5++) {
            adVar2.mo62643s(i5, kVar.mo36992c(2, adVar2.mo62629e(i5)));
        }
        Collections.unmodifiableList(((C71195ae) adVar2.instance).f190011l);
        for (int i6 = 0; i6 < ((C71195ae) adVar2.instance).f190011l.size(); i6++) {
            adVar2.mo62641q(i6, kVar.mo36992c(3, adVar2.mo62630f(i6)));
        }
        Collections.unmodifiableList(((C71195ae) adVar2.instance).f190013n);
        for (int i7 = 0; i7 < ((C71195ae) adVar2.instance).f190013n.size(); i7++) {
            adVar2.mo62642r(i7, kVar.mo36992c(5, adVar2.mo62631g(i7)));
        }
        C71195ae aeVar54 = (C71195ae) adVar2.build();
        String str = cVar2.f84219c;
        if (str != null) {
            j = (long) str.hashCode();
        }
        return new C31290w(aeVar54, l, l2, 474373037L, Long.valueOf(j), lVar, (String) null, (C71207aq) null);
    }
}
