package com.google.android.libraries.performance.primes.metrics.p2403a;

import android.os.health.HealthStats;
import android.os.health.TimerStat;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71191aa;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71192ab;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71193ac;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71194ad;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71323r;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71324s;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71326u;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71330y;

/* renamed from: com.google.android.libraries.performance.primes.metrics.a.r */
/* compiled from: PG */
final class C31285r {
    /* renamed from: a */
    public static long m58320a(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            return 0;
        }
        return healthStats.getMeasurement(i);
    }

    /* renamed from: b */
    public static List m58321b(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimers(i)) {
            return Collections.emptyList();
        }
        return C31284q.f84253a.mo36996d(healthStats.getTimers(i));
    }

    /* renamed from: c */
    public static Map m58322c(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasStats(i)) ? Collections.emptyMap() : healthStats.getStats(i);
    }

    /* renamed from: d */
    public static C71324s m58323d(String str) {
        C71323r rVar = (C71323r) C71324s.f190488d.createBuilder();
        rVar.copyOnWrite();
        C71324s sVar = (C71324s) rVar.instance;
        sVar.f190490a |= 2;
        sVar.f190492c = str;
        return (C71324s) rVar.build();
    }

    /* renamed from: e */
    public static C71193ac m58324e(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return m58326g((String) null, healthStats.getTimer(i));
    }

    /* renamed from: f */
    static C71193ac m58325f(C71193ac acVar, C71193ac acVar2) {
        if (acVar == null || acVar2 == null) {
            return acVar;
        }
        int i = acVar.f189956b - acVar2.f189956b;
        long j = acVar.f189957c - acVar2.f189957c;
        if (i == 0) {
            if (j == 0) {
                return null;
            }
            i = 0;
        }
        C71192ab abVar = (C71192ab) C71193ac.f189953e.createBuilder();
        if ((acVar.f189955a & 4) != 0) {
            C71324s sVar = acVar.f189958d;
            if (sVar == null) {
                sVar = C71324s.f190488d;
            }
            abVar.copyOnWrite();
            C71193ac acVar3 = (C71193ac) abVar.instance;
            sVar.getClass();
            acVar3.f189958d = sVar;
            acVar3.f189955a |= 4;
        }
        abVar.copyOnWrite();
        C71193ac acVar4 = (C71193ac) abVar.instance;
        acVar4.f189955a |= 1;
        acVar4.f189956b = i;
        abVar.copyOnWrite();
        C71193ac acVar5 = (C71193ac) abVar.instance;
        acVar5.f189955a |= 2;
        acVar5.f189957c = j;
        return (C71193ac) abVar.build();
    }

    /* renamed from: g */
    public static C71193ac m58326g(String str, TimerStat timerStat) {
        C71192ab abVar = (C71192ab) C71193ac.f189953e.createBuilder();
        int count = timerStat.getCount();
        abVar.copyOnWrite();
        C71193ac acVar = (C71193ac) abVar.instance;
        acVar.f189955a |= 1;
        acVar.f189956b = count;
        long time = timerStat.getTime();
        abVar.copyOnWrite();
        C71193ac acVar2 = (C71193ac) abVar.instance;
        acVar2.f189955a |= 2;
        acVar2.f189957c = time;
        if (acVar2.f189956b < 0) {
            abVar.copyOnWrite();
            C71193ac acVar3 = (C71193ac) abVar.instance;
            acVar3.f189955a |= 1;
            acVar3.f189956b = 0;
        }
        if (str != null) {
            C71324s d = m58323d(str);
            abVar.copyOnWrite();
            C71193ac acVar4 = (C71193ac) abVar.instance;
            d.getClass();
            acVar4.f189958d = d;
            acVar4.f189955a |= 4;
        }
        C71193ac acVar5 = (C71193ac) abVar.instance;
        if (acVar5.f189956b == 0 && acVar5.f189957c == 0) {
            return null;
        }
        return (C71193ac) abVar.build();
    }

    /* renamed from: h */
    static C71195ae m58327h(C71195ae aeVar, C71195ae aeVar2) {
        C71193ac acVar;
        C71193ac acVar2;
        C71193ac acVar3;
        C71193ac acVar4;
        C71193ac acVar5;
        C71193ac acVar6;
        C71193ac acVar7;
        C71193ac acVar8;
        C71193ac acVar9;
        C71193ac acVar10;
        C71193ac acVar11;
        C71193ac acVar12;
        C71193ac acVar13;
        C71193ac acVar14;
        C71193ac acVar15;
        C71193ac acVar16;
        C71193ac acVar17;
        C71193ac acVar18;
        C71193ac acVar19;
        C71193ac acVar20;
        C71193ac acVar21;
        C71193ac acVar22;
        C71193ac acVar23;
        C71193ac acVar24;
        C71193ac acVar25;
        C71193ac acVar26;
        C71193ac acVar27;
        C71193ac acVar28;
        C71193ac acVar29;
        C71193ac acVar30;
        C71193ac acVar31;
        C71193ac acVar32;
        if (!(aeVar == null || aeVar2 == null)) {
            C71194ad adVar = (C71194ad) C71195ae.f189959an.createBuilder();
            if ((aeVar.f189987a & 1) != 0) {
                long j = aeVar.f190002c - aeVar2.f190002c;
                if (j != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar3 = (C71195ae) adVar.instance;
                    aeVar3.f189987a |= 1;
                    aeVar3.f190002c = j;
                }
            }
            if ((aeVar.f189987a & 2) != 0) {
                long j2 = aeVar.f190003d - aeVar2.f190003d;
                if (j2 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar4 = (C71195ae) adVar.instance;
                    aeVar4.f189987a |= 2;
                    aeVar4.f190003d = j2;
                }
            }
            if ((aeVar.f189987a & 4) != 0) {
                long j3 = aeVar.f190004e - aeVar2.f190004e;
                if (j3 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar5 = (C71195ae) adVar.instance;
                    aeVar5.f189987a |= 4;
                    aeVar5.f190004e = j3;
                }
            }
            if ((aeVar.f189987a & 8) != 0) {
                long j4 = aeVar.f190005f - aeVar2.f190005f;
                if (j4 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar6 = (C71195ae) adVar.instance;
                    aeVar6.f189987a |= 8;
                    aeVar6.f190005f = j4;
                }
            }
            adVar.mo62638n(C31284q.f84253a.mo36997e(aeVar.f190006g, aeVar2.f190006g));
            adVar.mo62639o(C31284q.f84253a.mo36997e(aeVar.f190007h, aeVar2.f190007h));
            adVar.mo62640p(C31284q.f84253a.mo36997e(aeVar.f190008i, aeVar2.f190008i));
            adVar.mo62637m(C31284q.f84253a.mo36997e(aeVar.f190009j, aeVar2.f190009j));
            adVar.mo62636l(C31284q.f84253a.mo36997e(aeVar.f190010k, aeVar2.f190010k));
            adVar.mo62632h(C31284q.f84253a.mo36997e(aeVar.f190011l, aeVar2.f190011l));
            if ((aeVar.f189987a & 16) != 0) {
                acVar = aeVar.f190012m;
                if (acVar == null) {
                    acVar = C71193ac.f189953e;
                }
            } else {
                acVar = null;
            }
            if ((aeVar2.f189987a & 16) != 0) {
                acVar2 = aeVar2.f190012m;
                if (acVar2 == null) {
                    acVar2 = C71193ac.f189953e;
                }
            } else {
                acVar2 = null;
            }
            C71193ac f = m58325f(acVar, acVar2);
            if (f != null) {
                adVar.copyOnWrite();
                C71195ae aeVar7 = (C71195ae) adVar.instance;
                aeVar7.f190012m = f;
                aeVar7.f189987a |= 16;
            }
            adVar.mo62633i(C31284q.f84253a.mo36997e(aeVar.f190013n, aeVar2.f190013n));
            adVar.mo62635k(C31281n.f84251a.mo36997e(aeVar.f190015p, aeVar2.f190015p));
            adVar.mo62634j(C31280m.f84250a.mo36997e(aeVar.f190016q, aeVar2.f190016q));
            if ((aeVar.f189987a & 32) != 0) {
                long j5 = aeVar.f190017r - aeVar2.f190017r;
                if (j5 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar8 = (C71195ae) adVar.instance;
                    aeVar8.f189987a |= 32;
                    aeVar8.f190017r = j5;
                }
            }
            if ((aeVar.f189987a & 64) != 0) {
                long j6 = aeVar.f190018s - aeVar2.f190018s;
                if (j6 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar9 = (C71195ae) adVar.instance;
                    aeVar9.f189987a |= 64;
                    aeVar9.f190018s = j6;
                }
            }
            if ((aeVar.f189987a & 128) != 0) {
                long j7 = aeVar.f190019t - aeVar2.f190019t;
                if (j7 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar10 = (C71195ae) adVar.instance;
                    aeVar10.f189987a |= 128;
                    aeVar10.f190019t = j7;
                }
            }
            if ((aeVar.f189987a & 256) != 0) {
                long j8 = aeVar.f190020u - aeVar2.f190020u;
                if (j8 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar11 = (C71195ae) adVar.instance;
                    aeVar11.f189987a |= 256;
                    aeVar11.f190020u = j8;
                }
            }
            if ((aeVar.f189987a & 512) != 0) {
                long j9 = aeVar.f190021v - aeVar2.f190021v;
                if (j9 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar12 = (C71195ae) adVar.instance;
                    aeVar12.f189987a |= 512;
                    aeVar12.f190021v = j9;
                }
            }
            if ((aeVar.f189987a & 1024) != 0) {
                long j10 = aeVar.f190022w - aeVar2.f190022w;
                if (j10 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar13 = (C71195ae) adVar.instance;
                    aeVar13.f189987a |= 1024;
                    aeVar13.f190022w = j10;
                }
            }
            if ((aeVar.f189987a & 2048) != 0) {
                long j11 = aeVar.f190023x - aeVar2.f190023x;
                if (j11 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar14 = (C71195ae) adVar.instance;
                    aeVar14.f189987a |= 2048;
                    aeVar14.f190023x = j11;
                }
            }
            if ((aeVar.f189987a & 4096) != 0) {
                long j12 = aeVar.f190024y - aeVar2.f190024y;
                if (j12 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar15 = (C71195ae) adVar.instance;
                    aeVar15.f189987a |= 4096;
                    aeVar15.f190024y = j12;
                }
            }
            if ((aeVar.f189987a & 8192) != 0) {
                long j13 = aeVar.f190025z - aeVar2.f190025z;
                if (j13 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar16 = (C71195ae) adVar.instance;
                    aeVar16.f189987a |= 8192;
                    aeVar16.f190025z = j13;
                }
            }
            if ((aeVar.f189987a & 16384) != 0) {
                long j14 = aeVar.f189961A - aeVar2.f189961A;
                if (j14 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar17 = (C71195ae) adVar.instance;
                    aeVar17.f189987a |= 16384;
                    aeVar17.f189961A = j14;
                }
            }
            if ((aeVar.f189987a & 32768) != 0) {
                long j15 = aeVar.f189962B - aeVar2.f189962B;
                if (j15 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar18 = (C71195ae) adVar.instance;
                    aeVar18.f189987a |= 32768;
                    aeVar18.f189962B = j15;
                }
            }
            if ((aeVar.f189987a & 65536) != 0) {
                long j16 = aeVar.f189963C - aeVar2.f189963C;
                if (j16 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar19 = (C71195ae) adVar.instance;
                    aeVar19.f189987a |= 65536;
                    aeVar19.f189963C = j16;
                }
            }
            if ((aeVar.f189987a & C89885b.S3REQUEST_VALUE) != 0) {
                long j17 = aeVar.f189964D - aeVar2.f189964D;
                if (j17 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar20 = (C71195ae) adVar.instance;
                    aeVar20.f189987a |= C89885b.S3REQUEST_VALUE;
                    aeVar20.f189964D = j17;
                }
            }
            if ((aeVar.f189987a & C89885b.HTTP_VALUE) != 0) {
                long j18 = aeVar.f189965E - aeVar2.f189965E;
                if (j18 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar21 = (C71195ae) adVar.instance;
                    aeVar21.f189987a |= C89885b.HTTP_VALUE;
                    aeVar21.f189965E = j18;
                }
            }
            if ((aeVar.f189987a & 524288) != 0) {
                acVar3 = aeVar.f189966F;
                if (acVar3 == null) {
                    acVar3 = C71193ac.f189953e;
                }
            } else {
                acVar3 = null;
            }
            if ((aeVar2.f189987a & 524288) != 0) {
                acVar4 = aeVar2.f189966F;
                if (acVar4 == null) {
                    acVar4 = C71193ac.f189953e;
                }
            } else {
                acVar4 = null;
            }
            C71193ac f2 = m58325f(acVar3, acVar4);
            if (f2 != null) {
                adVar.copyOnWrite();
                C71195ae aeVar22 = (C71195ae) adVar.instance;
                aeVar22.f189966F = f2;
                aeVar22.f189987a |= 524288;
            }
            if ((aeVar.f189987a & 1048576) != 0) {
                long j19 = aeVar.f189967G - aeVar2.f189967G;
                if (j19 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar23 = (C71195ae) adVar.instance;
                    aeVar23.f189987a |= 1048576;
                    aeVar23.f189967G = j19;
                }
            }
            if ((aeVar.f189987a & C89885b.NOW_VALUE) != 0) {
                acVar5 = aeVar.f189968H;
                if (acVar5 == null) {
                    acVar5 = C71193ac.f189953e;
                }
            } else {
                acVar5 = null;
            }
            if ((aeVar2.f189987a & C89885b.NOW_VALUE) != 0) {
                acVar6 = aeVar2.f189968H;
                if (acVar6 == null) {
                    acVar6 = C71193ac.f189953e;
                }
            } else {
                acVar6 = null;
            }
            C71193ac f3 = m58325f(acVar5, acVar6);
            if (f3 != null) {
                adVar.copyOnWrite();
                C71195ae aeVar24 = (C71195ae) adVar.instance;
                aeVar24.f189968H = f3;
                aeVar24.f189987a |= C89885b.NOW_VALUE;
            }
            if ((aeVar.f189987a & 4194304) != 0) {
                acVar7 = aeVar.f189969I;
                if (acVar7 == null) {
                    acVar7 = C71193ac.f189953e;
                }
            } else {
                acVar7 = null;
            }
            if ((aeVar2.f189987a & 4194304) != 0) {
                acVar8 = aeVar2.f189969I;
                if (acVar8 == null) {
                    acVar8 = C71193ac.f189953e;
                }
            } else {
                acVar8 = null;
            }
            C71193ac f4 = m58325f(acVar7, acVar8);
            if (f4 != null) {
                adVar.copyOnWrite();
                C71195ae aeVar25 = (C71195ae) adVar.instance;
                aeVar25.f189969I = f4;
                aeVar25.f189987a |= 4194304;
            }
            if ((aeVar.f189987a & 8388608) != 0) {
                acVar9 = aeVar.f189970J;
                if (acVar9 == null) {
                    acVar9 = C71193ac.f189953e;
                }
            } else {
                acVar9 = null;
            }
            if ((aeVar2.f189987a & 8388608) != 0) {
                acVar10 = aeVar2.f189970J;
                if (acVar10 == null) {
                    acVar10 = C71193ac.f189953e;
                }
            } else {
                acVar10 = null;
            }
            C71193ac f5 = m58325f(acVar9, acVar10);
            if (f5 != null) {
                adVar.copyOnWrite();
                C71195ae aeVar26 = (C71195ae) adVar.instance;
                aeVar26.f189970J = f5;
                aeVar26.f189987a |= 8388608;
            }
            if ((aeVar.f189987a & 16777216) != 0) {
                acVar11 = aeVar.f189971K;
                if (acVar11 == null) {
                    acVar11 = C71193ac.f189953e;
                }
            } else {
                acVar11 = null;
            }
            if ((aeVar2.f189987a & 16777216) != 0) {
                acVar12 = aeVar2.f189971K;
                if (acVar12 == null) {
                    acVar12 = C71193ac.f189953e;
                }
            } else {
                acVar12 = null;
            }
            C71193ac f6 = m58325f(acVar11, acVar12);
            if (f6 != null) {
                adVar.copyOnWrite();
                C71195ae aeVar27 = (C71195ae) adVar.instance;
                aeVar27.f189971K = f6;
                aeVar27.f189987a |= 16777216;
            }
            if ((aeVar.f189987a & 33554432) != 0) {
                acVar13 = aeVar.f189972L;
                if (acVar13 == null) {
                    acVar13 = C71193ac.f189953e;
                }
            } else {
                acVar13 = null;
            }
            if ((aeVar2.f189987a & 33554432) != 0) {
                acVar14 = aeVar2.f189972L;
                if (acVar14 == null) {
                    acVar14 = C71193ac.f189953e;
                }
            } else {
                acVar14 = null;
            }
            C71193ac f7 = m58325f(acVar13, acVar14);
            if (f7 != null) {
                adVar.copyOnWrite();
                C71195ae aeVar28 = (C71195ae) adVar.instance;
                aeVar28.f189972L = f7;
                aeVar28.f189987a |= 33554432;
            }
            if ((aeVar.f189987a & 67108864) != 0) {
                acVar15 = aeVar.f189973M;
                if (acVar15 == null) {
                    acVar15 = C71193ac.f189953e;
                }
            } else {
                acVar15 = null;
            }
            if ((aeVar2.f189987a & 67108864) != 0) {
                acVar16 = aeVar2.f189973M;
                if (acVar16 == null) {
                    acVar16 = C71193ac.f189953e;
                }
            } else {
                acVar16 = null;
            }
            C71193ac f8 = m58325f(acVar15, acVar16);
            if (f8 != null) {
                adVar.copyOnWrite();
                C71195ae aeVar29 = (C71195ae) adVar.instance;
                aeVar29.f189973M = f8;
                aeVar29.f189987a |= 67108864;
            }
            if ((aeVar.f189987a & 134217728) != 0) {
                acVar17 = aeVar.f189974N;
                if (acVar17 == null) {
                    acVar17 = C71193ac.f189953e;
                }
            } else {
                acVar17 = null;
            }
            if ((aeVar2.f189987a & 134217728) != 0) {
                acVar18 = aeVar2.f189974N;
                if (acVar18 == null) {
                    acVar18 = C71193ac.f189953e;
                }
            } else {
                acVar18 = null;
            }
            C71193ac f9 = m58325f(acVar17, acVar18);
            if (f9 != null) {
                adVar.copyOnWrite();
                C71195ae aeVar30 = (C71195ae) adVar.instance;
                aeVar30.f189974N = f9;
                aeVar30.f189987a |= 134217728;
            }
            if ((aeVar.f189987a & 268435456) != 0) {
                acVar19 = aeVar.f189975O;
                if (acVar19 == null) {
                    acVar19 = C71193ac.f189953e;
                }
            } else {
                acVar19 = null;
            }
            if ((aeVar2.f189987a & 268435456) != 0) {
                acVar20 = aeVar2.f189975O;
                if (acVar20 == null) {
                    acVar20 = C71193ac.f189953e;
                }
            } else {
                acVar20 = null;
            }
            C71193ac f10 = m58325f(acVar19, acVar20);
            if (f10 != null) {
                adVar.copyOnWrite();
                C71195ae aeVar31 = (C71195ae) adVar.instance;
                aeVar31.f189975O = f10;
                aeVar31.f189987a |= 268435456;
            }
            if ((aeVar.f189987a & 536870912) != 0) {
                acVar21 = aeVar.f189976P;
                if (acVar21 == null) {
                    acVar21 = C71193ac.f189953e;
                }
            } else {
                acVar21 = null;
            }
            if ((aeVar2.f189987a & 536870912) != 0) {
                acVar22 = aeVar2.f189976P;
                if (acVar22 == null) {
                    acVar22 = C71193ac.f189953e;
                }
            } else {
                acVar22 = null;
            }
            C71193ac f11 = m58325f(acVar21, acVar22);
            if (f11 != null) {
                adVar.copyOnWrite();
                C71195ae aeVar32 = (C71195ae) adVar.instance;
                aeVar32.f189976P = f11;
                aeVar32.f189987a |= 536870912;
            }
            if ((aeVar.f189987a & 1073741824) != 0) {
                acVar23 = aeVar.f189977Q;
                if (acVar23 == null) {
                    acVar23 = C71193ac.f189953e;
                }
            } else {
                acVar23 = null;
            }
            if ((aeVar2.f189987a & 1073741824) != 0) {
                acVar24 = aeVar2.f189977Q;
                if (acVar24 == null) {
                    acVar24 = C71193ac.f189953e;
                }
            } else {
                acVar24 = null;
            }
            C71193ac f12 = m58325f(acVar23, acVar24);
            if (f12 != null) {
                adVar.copyOnWrite();
                C71195ae aeVar33 = (C71195ae) adVar.instance;
                aeVar33.f189977Q = f12;
                aeVar33.f189987a |= 1073741824;
            }
            if ((aeVar.f189987a & LinearLayoutManager.INVALID_OFFSET) != 0) {
                acVar25 = aeVar.f189978R;
                if (acVar25 == null) {
                    acVar25 = C71193ac.f189953e;
                }
            } else {
                acVar25 = null;
            }
            if ((aeVar2.f189987a & LinearLayoutManager.INVALID_OFFSET) != 0) {
                acVar26 = aeVar2.f189978R;
                if (acVar26 == null) {
                    acVar26 = C71193ac.f189953e;
                }
            } else {
                acVar26 = null;
            }
            C71193ac f13 = m58325f(acVar25, acVar26);
            if (f13 != null) {
                adVar.copyOnWrite();
                C71195ae aeVar34 = (C71195ae) adVar.instance;
                aeVar34.f189978R = f13;
                aeVar34.f189987a |= LinearLayoutManager.INVALID_OFFSET;
            }
            if ((aeVar.f190001b & 1) != 0) {
                acVar27 = aeVar.f189979S;
                if (acVar27 == null) {
                    acVar27 = C71193ac.f189953e;
                }
            } else {
                acVar27 = null;
            }
            if ((aeVar2.f190001b & 1) != 0) {
                acVar28 = aeVar2.f189979S;
                if (acVar28 == null) {
                    acVar28 = C71193ac.f189953e;
                }
            } else {
                acVar28 = null;
            }
            C71193ac f14 = m58325f(acVar27, acVar28);
            if (f14 != null) {
                adVar.copyOnWrite();
                C71195ae aeVar35 = (C71195ae) adVar.instance;
                aeVar35.f189979S = f14;
                aeVar35.f190001b |= 1;
            }
            if ((aeVar.f190001b & 2) != 0) {
                acVar29 = aeVar.f189980T;
                if (acVar29 == null) {
                    acVar29 = C71193ac.f189953e;
                }
            } else {
                acVar29 = null;
            }
            if ((aeVar2.f190001b & 2) != 0) {
                acVar30 = aeVar2.f189980T;
                if (acVar30 == null) {
                    acVar30 = C71193ac.f189953e;
                }
            } else {
                acVar30 = null;
            }
            C71193ac f15 = m58325f(acVar29, acVar30);
            if (f15 != null) {
                adVar.copyOnWrite();
                C71195ae aeVar36 = (C71195ae) adVar.instance;
                aeVar36.f189980T = f15;
                aeVar36.f190001b |= 2;
            }
            if ((aeVar.f190001b & 4) != 0) {
                long j20 = aeVar.f189981U - aeVar2.f189981U;
                if (j20 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar37 = (C71195ae) adVar.instance;
                    aeVar37.f190001b |= 4;
                    aeVar37.f189981U = j20;
                }
            }
            if ((aeVar.f190001b & 8) != 0) {
                long j21 = aeVar.f189982V - aeVar2.f189982V;
                if (j21 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar38 = (C71195ae) adVar.instance;
                    aeVar38.f190001b |= 8;
                    aeVar38.f189982V = j21;
                }
            }
            if ((aeVar.f190001b & 16) != 0) {
                long j22 = aeVar.f189983W - aeVar2.f189983W;
                if (j22 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar39 = (C71195ae) adVar.instance;
                    aeVar39.f190001b |= 16;
                    aeVar39.f189983W = j22;
                }
            }
            if ((aeVar.f190001b & 32) != 0) {
                long j23 = aeVar.f189984X - aeVar2.f189984X;
                if (j23 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar40 = (C71195ae) adVar.instance;
                    aeVar40.f190001b |= 32;
                    aeVar40.f189984X = j23;
                }
            }
            if ((aeVar.f190001b & 64) != 0) {
                long j24 = aeVar.f189985Y - aeVar2.f189985Y;
                if (j24 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar41 = (C71195ae) adVar.instance;
                    aeVar41.f190001b |= 64;
                    aeVar41.f189985Y = j24;
                }
            }
            if ((aeVar.f190001b & 128) != 0) {
                long j25 = aeVar.f189986Z - aeVar2.f189986Z;
                if (j25 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar42 = (C71195ae) adVar.instance;
                    aeVar42.f190001b |= 128;
                    aeVar42.f189986Z = j25;
                }
            }
            if ((aeVar.f190001b & 256) != 0) {
                long j26 = aeVar.f189988aa - aeVar2.f189988aa;
                if (j26 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar43 = (C71195ae) adVar.instance;
                    aeVar43.f190001b |= 256;
                    aeVar43.f189988aa = j26;
                }
            }
            if ((aeVar.f190001b & 512) != 0) {
                long j27 = aeVar.f189989ab - aeVar2.f189989ab;
                if (j27 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar44 = (C71195ae) adVar.instance;
                    aeVar44.f190001b |= 512;
                    aeVar44.f189989ab = j27;
                }
            }
            if ((aeVar.f190001b & 1024) != 0) {
                long j28 = aeVar.f189990ac - aeVar2.f189990ac;
                if (j28 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar45 = (C71195ae) adVar.instance;
                    aeVar45.f190001b |= 1024;
                    aeVar45.f189990ac = j28;
                }
            }
            if ((aeVar.f190001b & 2048) != 0) {
                long j29 = aeVar.f189991ad - aeVar2.f189991ad;
                if (j29 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar46 = (C71195ae) adVar.instance;
                    aeVar46.f190001b |= 2048;
                    aeVar46.f189991ad = j29;
                }
            }
            if ((aeVar.f190001b & 4096) != 0) {
                long j30 = aeVar.f189992ae - aeVar2.f189992ae;
                if (j30 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar47 = (C71195ae) adVar.instance;
                    aeVar47.f190001b |= 4096;
                    aeVar47.f189992ae = j30;
                }
            }
            if ((aeVar.f190001b & 8192) != 0) {
                long j31 = aeVar.f189993af - aeVar2.f189993af;
                if (j31 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar48 = (C71195ae) adVar.instance;
                    aeVar48.f190001b |= 8192;
                    aeVar48.f189993af = j31;
                }
            }
            if ((aeVar.f190001b & 16384) != 0) {
                long j32 = aeVar.f189994ag - aeVar2.f189994ag;
                if (j32 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar49 = (C71195ae) adVar.instance;
                    aeVar49.f190001b |= 16384;
                    aeVar49.f189994ag = j32;
                }
            }
            if ((aeVar.f190001b & 32768) != 0) {
                long j33 = aeVar.f189995ah - aeVar2.f189995ah;
                if (j33 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar50 = (C71195ae) adVar.instance;
                    aeVar50.f190001b = 32768 | aeVar50.f190001b;
                    aeVar50.f189995ah = j33;
                }
            }
            if ((aeVar.f190001b & 65536) != 0) {
                long j34 = aeVar.f189996ai - aeVar2.f189996ai;
                if (j34 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar51 = (C71195ae) adVar.instance;
                    aeVar51.f190001b |= 65536;
                    aeVar51.f189996ai = j34;
                }
            }
            if ((aeVar.f190001b & C89885b.S3REQUEST_VALUE) != 0) {
                acVar31 = aeVar.f189997aj;
                if (acVar31 == null) {
                    acVar31 = C71193ac.f189953e;
                }
            } else {
                acVar31 = null;
            }
            if ((aeVar2.f190001b & C89885b.S3REQUEST_VALUE) != 0) {
                acVar32 = aeVar2.f189997aj;
                if (acVar32 == null) {
                    acVar32 = C71193ac.f189953e;
                }
            } else {
                acVar32 = null;
            }
            C71193ac f16 = m58325f(acVar31, acVar32);
            if (f16 != null) {
                adVar.copyOnWrite();
                C71195ae aeVar52 = (C71195ae) adVar.instance;
                aeVar52.f189997aj = f16;
                aeVar52.f190001b |= C89885b.S3REQUEST_VALUE;
            }
            if ((aeVar.f190001b & C89885b.HTTP_VALUE) != 0) {
                long j35 = aeVar.f189998ak - aeVar2.f189998ak;
                if (j35 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar53 = (C71195ae) adVar.instance;
                    aeVar53.f190001b |= C89885b.HTTP_VALUE;
                    aeVar53.f189998ak = j35;
                }
            }
            if ((aeVar.f190001b & 524288) != 0) {
                long j36 = aeVar.f189999al - aeVar2.f189999al;
                if (j36 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar54 = (C71195ae) adVar.instance;
                    aeVar54.f190001b |= 524288;
                    aeVar54.f189999al = j36;
                }
            }
            if ((aeVar.f190001b & 1048576) != 0) {
                long j37 = aeVar.f190000am - aeVar2.f190000am;
                if (j37 != 0) {
                    adVar.copyOnWrite();
                    C71195ae aeVar55 = (C71195ae) adVar.instance;
                    aeVar55.f190001b |= 1048576;
                    aeVar55.f190000am = j37;
                }
            }
            aeVar = (C71195ae) adVar.build();
            if (m58331l(aeVar)) {
                return null;
            }
        }
        return aeVar;
    }

    /* renamed from: i */
    static boolean m58328i(C71326u uVar) {
        if (uVar != null) {
            return uVar.f190496b.size() == 0 && uVar.f190497c.size() == 0;
        }
        return true;
    }

    /* renamed from: j */
    static boolean m58329j(C71330y yVar) {
        if (yVar != null) {
            return yVar.f190504b <= 0 && yVar.f190505c <= 0 && yVar.f190506d <= 0 && yVar.f190507e <= 0 && yVar.f190508f <= 0 && yVar.f190509g <= 0;
        }
        return true;
    }

    /* renamed from: k */
    static boolean m58330k(C71191aa aaVar) {
        if (aaVar != null) {
            return ((long) aaVar.f189950b) <= 0 && ((long) aaVar.f189951c) <= 0;
        }
        return true;
    }

    /* renamed from: l */
    static boolean m58331l(C71195ae aeVar) {
        if (aeVar != null) {
            return aeVar.f190002c <= 0 && aeVar.f190003d <= 0 && aeVar.f190004e <= 0 && aeVar.f190005f <= 0 && aeVar.f190006g.size() == 0 && aeVar.f190007h.size() == 0 && aeVar.f190008i.size() == 0 && aeVar.f190009j.size() == 0 && aeVar.f190010k.size() == 0 && aeVar.f190011l.size() == 0 && aeVar.f190013n.size() == 0 && aeVar.f190014o.size() == 0 && aeVar.f190015p.size() == 0 && aeVar.f190016q.size() == 0 && aeVar.f190017r <= 0 && aeVar.f190018s <= 0 && aeVar.f190019t <= 0 && aeVar.f190020u <= 0 && aeVar.f190021v <= 0 && aeVar.f190022w <= 0 && aeVar.f190023x <= 0 && aeVar.f190024y <= 0 && aeVar.f190025z <= 0 && aeVar.f189961A <= 0 && aeVar.f189962B <= 0 && aeVar.f189963C <= 0 && aeVar.f189964D <= 0 && aeVar.f189965E <= 0 && aeVar.f189967G <= 0 && aeVar.f189981U <= 0 && aeVar.f189982V <= 0 && aeVar.f189983W <= 0 && aeVar.f189984X <= 0 && aeVar.f189985Y <= 0 && aeVar.f189986Z <= 0 && aeVar.f189988aa <= 0 && aeVar.f189989ab <= 0 && aeVar.f189990ac <= 0 && aeVar.f189991ad <= 0 && aeVar.f189992ae <= 0 && aeVar.f189993af <= 0 && aeVar.f189994ag <= 0 && aeVar.f189995ah <= 0 && aeVar.f189996ai <= 0 && aeVar.f189998ak <= 0 && aeVar.f189999al <= 0 && aeVar.f190000am <= 0;
        }
        return true;
    }
}
