package com.google.android.apps.search.assistant.platform.pcp.validity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123614ag;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124048ad;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48904f;
import com.google.assistant.p3803ag.p3807b.p3808a.C48918t;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.assistant.p3803ag.p3809c.C48948av;
import com.google.assistant.p3803ag.p3809c.C48950ax;
import com.google.assistant.p3803ag.p3809c.C48951ay;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3803ag.p3809c.C48971br;
import com.google.assistant.p3803ag.p3809c.C49005cy;
import com.google.assistant.p3803ag.p3809c.C49017dj;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62953e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69236b;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.validity.g */
/* compiled from: PG */
public final /* synthetic */ class C124158g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124166o f342877a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f342878b;

    /* renamed from: c */
    public final /* synthetic */ List f342879c;

    /* renamed from: d */
    public final /* synthetic */ List f342880d;

    public /* synthetic */ C124158g(C124166o oVar, C60870cx cxVar, List list, List list2) {
        this.f342877a = oVar;
        this.f342878b = cxVar;
        this.f342879c = list;
        this.f342880d = list2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        long j;
        long j2;
        long j3;
        C58480gp gpVar;
        C58480gp gpVar2;
        C58480gp gpVar3;
        boolean z;
        HashMap hashMap;
        char c;
        String str;
        C48971br brVar;
        C58480gp gpVar4;
        C48971br brVar2;
        C48971br brVar3;
        C49156z zVar;
        C48971br brVar4;
        C49017dj djVar;
        C49005cy cyVar;
        C58480gp gpVar5;
        C58480gp gpVar6;
        long j4;
        C58480gp gpVar7;
        long j5;
        C58480gp gpVar8;
        C49017dj djVar2;
        C49005cy cyVar2;
        C48971br brVar5;
        C49017dj djVar3;
        C49005cy cyVar3;
        C49017dj djVar4;
        C48971br brVar6;
        long j6;
        long j7;
        long j8;
        C48971br brVar7;
        C49017dj djVar5;
        C48971br brVar8;
        C49017dj djVar6;
        C49005cy cyVar4;
        C48971br brVar9;
        C49156z zVar2;
        C124166o oVar = this.f342877a;
        C60870cx cxVar = this.f342878b;
        List list = this.f342879c;
        List list2 = this.f342880d;
        long b = oVar.f342897c.mo26870b();
        long longValue = ((Long) C60856cj.m92909r(cxVar)).longValue();
        boolean z2 = longValue != 0 && b - longValue > C62948a.m95453d(oVar.f342901g);
        if (z2) {
            oVar.f342900f.f342762a.mo41704s("ALARM_EXPIRED");
        }
        long j9 = Long.MAX_VALUE;
        if (longValue != 0 && longValue >= b) {
            j9 = ((Long) C60856cj.m92909r(cxVar)).longValue();
        }
        C58480gp e = C58485gu.m89837e();
        C58480gp e2 = C58485gu.m89837e();
        C58480gp e3 = C58485gu.m89837e();
        HashMap hashMap2 = new HashMap();
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            C124169r rVar = (C124169r) G.next();
            C48952az d = rVar.mo106301d();
            C58801sm smVar = G;
            if (d.f126659a == 1) {
                brVar6 = (C48971br) d.f126660b;
            } else {
                brVar6 = C48971br.f126689d;
            }
            if (brVar6.f126691a == 1) {
                if (d.f126659a == 1) {
                    brVar9 = (C48971br) d.f126660b;
                } else {
                    brVar9 = C48971br.f126689d;
                }
                if (brVar9.f126691a == 1) {
                    zVar2 = (C49156z) brVar9.f126692b;
                } else {
                    zVar2 = C49156z.f127111d;
                }
                C63042fg fgVar = zVar2.f127114b;
                if (fgVar == null) {
                    fgVar = C63042fg.f170152c;
                }
                j8 = C62953e.m95478c(fgVar);
                C63042fg fgVar2 = zVar2.f127115c;
                if (fgVar2 == null) {
                    fgVar2 = C63042fg.f170152c;
                }
                long j10 = j;
                j7 = C62953e.m95478c(fgVar2);
                j6 = j10;
            } else {
                if (d.f126659a == 1) {
                    brVar7 = (C48971br) d.f126660b;
                } else {
                    brVar7 = C48971br.f126689d;
                }
                j6 = j;
                if (brVar7.f126691a == 2) {
                    djVar5 = (C49017dj) brVar7.f126692b;
                } else {
                    djVar5 = C49017dj.f126788c;
                }
                if (djVar5.f126790a == 1) {
                    if (d.f126659a == 1) {
                        brVar8 = (C48971br) d.f126660b;
                    } else {
                        brVar8 = C48971br.f126689d;
                    }
                    if (brVar8.f126691a == 2) {
                        djVar6 = (C49017dj) brVar8.f126692b;
                    } else {
                        djVar6 = C49017dj.f126788c;
                    }
                    if (djVar6.f126790a == 1) {
                        cyVar4 = (C49005cy) djVar6.f126791b;
                    } else {
                        cyVar4 = C49005cy.f126761d;
                    }
                    j8 = cyVar4.f126764b;
                    j7 = cyVar4.f126765c;
                } else {
                    G = smVar;
                    j = j6;
                }
            }
            Optional e4 = rVar.mo106302e();
            boolean z3 = z2;
            int b2 = rVar.mo106299b();
            C58480gp gpVar9 = e;
            C53306j a = C53306j.m86809a(rVar.mo106298a());
            if (b < j8 || b >= j7) {
                G = smVar;
                j = j6;
                z2 = z3;
                e = gpVar9;
            } else {
                long j11 = longValue;
                ((C58970a) ((C58970a) oVar.f342909o.mo56224b()).mo56372aa(35441)).mo56359L("deleted entity dataId %s, dataType %d, clientType %d", rVar.mo106304f(), Integer.valueOf(rVar.mo106299b()), Integer.valueOf(rVar.mo106298a()));
                e2.mo55395g(a);
                if (oVar.mo106314i(e4, b2, a)) {
                    e3.mo55395g(a);
                }
                C124166o.m203600g(hashMap2, a.f139793X, b2);
                G = smVar;
                j = j6;
                z2 = z3;
                e = gpVar9;
                longValue = j11;
            }
        }
        C58480gp gpVar10 = e;
        boolean z4 = z2;
        long j12 = longValue;
        Iterator it = list2.iterator();
        long j13 = j;
        while (it.hasNext()) {
            C124169r rVar2 = (C124169r) it.next();
            C48952az d2 = rVar2.mo106301d();
            C53306j a2 = C53306j.m86809a(rVar2.mo106298a());
            int b3 = rVar2.mo106299b();
            Optional e5 = rVar2.mo106302e();
            int i = d2.f126659a;
            Iterator it2 = it;
            String str2 = "_DATA_TYPE_";
            int i2 = 1;
            if (i == 1) {
                C48971br brVar10 = (C48971br) d2.f126660b;
                int i3 = brVar10.f126691a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        djVar4 = (C49017dj) brVar10.f126692b;
                    } else {
                        djVar4 = C49017dj.f126788c;
                    }
                    i2 = 1;
                    if (djVar4.f126790a != 1) {
                        gpVar5 = e2;
                        j3 = b;
                        gpVar6 = gpVar10;
                        gpVar = gpVar6;
                        gpVar2 = gpVar5;
                    }
                }
                if (brVar10.f126691a == i2) {
                    C63042fg fgVar3 = ((C49156z) brVar10.f126692b).f127114b;
                    if (fgVar3 == null) {
                        fgVar3 = C63042fg.f170152c;
                    }
                    j4 = C62953e.m95478c(fgVar3);
                    gpVar7 = e2;
                } else {
                    if (d2.f126659a == i2) {
                        brVar5 = (C48971br) d2.f126660b;
                    } else {
                        brVar5 = C48971br.f126689d;
                    }
                    if (brVar5.f126691a == 2) {
                        djVar3 = (C49017dj) brVar5.f126692b;
                    } else {
                        djVar3 = C49017dj.f126788c;
                    }
                    if (djVar3.f126790a == 1) {
                        cyVar3 = (C49005cy) djVar3.f126791b;
                    } else {
                        cyVar3 = C49005cy.f126761d;
                    }
                    gpVar7 = e2;
                    j4 = cyVar3.f126764b;
                }
                int i4 = brVar10.f126691a;
                if (i4 == 1) {
                    C63042fg fgVar4 = ((C49156z) brVar10.f126692b).f127115c;
                    if (fgVar4 == null) {
                        fgVar4 = C63042fg.f170152c;
                    }
                    j5 = C62953e.m95478c(fgVar4);
                } else {
                    if (i4 == 2) {
                        djVar2 = (C49017dj) brVar10.f126692b;
                    } else {
                        djVar2 = C49017dj.f126788c;
                    }
                    if (djVar2.f126790a == 1) {
                        cyVar2 = (C49005cy) djVar2.f126791b;
                    } else {
                        cyVar2 = C49005cy.f126761d;
                    }
                    j5 = cyVar2.f126765c;
                }
                if (j5 <= b) {
                    C60870cx f = oVar.mo106312f(e5, rVar2, false);
                    if (j5 == j12 || (oVar.f342907m && rVar2.mo106305g())) {
                        gpVar5 = gpVar7;
                        gpVar5.mo55395g(a2);
                        C124166o.m203600g(hashMap2, a2.f139793X, b3);
                        gpVar8 = gpVar10;
                        gpVar8.mo55395g(f);
                        if (oVar.mo106314i(e5, b3, a2)) {
                            e3.mo55395g(a2);
                        }
                    } else {
                        gpVar5 = gpVar7;
                        gpVar8 = gpVar10;
                    }
                    oVar.mo106313h(f, rVar2);
                    gpVar6 = gpVar8;
                    j3 = b;
                } else {
                    gpVar5 = gpVar7;
                    gpVar6 = gpVar10;
                    if (b < j4 || b >= j5) {
                        j3 = b;
                        if (j3 < j4 && j13 > j4) {
                            if (oVar.f342906l) {
                                C60870cx f2 = oVar.mo106312f(e5, rVar2, false);
                                gpVar5.mo55395g(a2);
                                C124166o.m203600g(hashMap2, a2.f139793X, b3);
                                gpVar6.mo55395g(f2);
                                if (oVar.mo106314i(e5, b3, a2)) {
                                    e3.mo55395g(a2);
                                }
                            }
                            j13 = j4;
                            gpVar = gpVar6;
                            gpVar2 = gpVar5;
                        }
                    } else {
                        j3 = b;
                        C58480gp gpVar11 = e3;
                        long j14 = j5;
                        ((C58970a) ((C58970a) oVar.f342909o.mo56224b()).mo56372aa(35434)).mo56359L("display valid entity dataId %s, dataType %d, clientType %d", rVar2.mo106304f(), Integer.valueOf(rVar2.mo106299b()), Integer.valueOf(rVar2.mo106298a()));
                        gpVar5.mo55395g(a2);
                        C124166o.m203600g(hashMap2, a2.f139793X, b3);
                        C60870cx f3 = oVar.mo106312f(e5, rVar2, true);
                        oVar.mo106313h(f3, rVar2);
                        gpVar6.mo55395g(f3);
                        if (j14 < j13) {
                            j13 = j14;
                        }
                        e3 = gpVar11;
                        if (oVar.mo106314i(e5, b3, a2)) {
                            e3.mo55395g(a2);
                        }
                        C124100bz bzVar = oVar.f342900f;
                        int i5 = a2.f139793X;
                        bzVar.f342762a.mo41704s("DATA_VISIBLE_FOR_CLIENT_TYPE_" + i5 + str2 + b3);
                        if (b3 == 100003) {
                            ((C19569f) oVar.f342900f.f342762a.f102826aJ.mo6453a()).mo24824b((double) (j3 - j4), new Object[0]);
                        }
                    }
                }
                gpVar = gpVar6;
                gpVar2 = gpVar5;
            } else {
                C58480gp gpVar12 = e2;
                j3 = b;
                C58480gp gpVar13 = gpVar10;
                if (i == 2) {
                    C62971cq cqVar = ((C48951ay) d2.f126660b).f126656a;
                    String str3 = a2.f139793X + ":" + rVar2.mo106299b() + ":" + rVar2.mo106304f();
                    Optional empty = Optional.empty();
                    if (rVar2.mo106302e().isPresent()) {
                        Optional f4 = C124048ad.m203471a(oVar.f342896b, (AccountId) rVar2.mo106302e().get()).mo106253f(C53306j.m86809a(rVar2.mo106298a()), rVar2.mo106299b());
                        if (f4.isPresent()) {
                            C69236b bVar = (C69236b) f4.get();
                            if ((bVar.f185330a & 16) != 0) {
                                C62910ar arVar = bVar.f185334e;
                                if (arVar == null) {
                                    arVar = C62910ar.f169858c;
                                }
                                empty = Optional.m71637of(arVar);
                            }
                        }
                        empty = Optional.empty();
                    }
                    if (empty.isEmpty()) {
                        empty = Optional.m71637of(oVar.f342908n);
                    }
                    Iterator it3 = cqVar.iterator();
                    boolean z5 = true;
                    C124169r rVar3 = rVar2;
                    long d3 = j3 + C62948a.m95453d((C62910ar) empty.get());
                    boolean z6 = false;
                    while (it3.hasNext()) {
                        C48952az azVar = (C48952az) it3.next();
                        Iterator it4 = it3;
                        C58480gp gpVar14 = gpVar13;
                        if (azVar.f126659a == 1) {
                            brVar = (C48971br) azVar.f126660b;
                        } else {
                            brVar = C48971br.f126689d;
                        }
                        C58480gp gpVar15 = gpVar12;
                        if (brVar.f126691a == 2) {
                            if (azVar.f126659a == 1) {
                                brVar4 = (C48971br) azVar.f126660b;
                            } else {
                                brVar4 = C48971br.f126689d;
                            }
                            if (brVar4.f126691a == 2) {
                                djVar = (C49017dj) brVar4.f126692b;
                            } else {
                                djVar = C49017dj.f126788c;
                            }
                            if (djVar.f126790a == 1) {
                                cyVar = (C49005cy) djVar.f126791b;
                            } else {
                                cyVar = C49005cy.f126761d;
                            }
                            d3 = cyVar.f126765c;
                            if (j3 > d3) {
                                ((C58970a) ((C58970a) oVar.f342909o.mo56224b()).mo56372aa(35433)).mo56389s("PCP receives validity outside of scheduling time triggerId %s", str3);
                                z5 = false;
                            }
                            gpVar4 = e3;
                        } else {
                            int i6 = azVar.f126659a;
                            if (i6 == 1) {
                                brVar2 = (C48971br) azVar.f126660b;
                            } else {
                                brVar2 = C48971br.f126689d;
                            }
                            gpVar4 = e3;
                            if (brVar2.f126691a == 1) {
                                if (i6 == 1) {
                                    brVar3 = (C48971br) azVar.f126660b;
                                } else {
                                    brVar3 = C48971br.f126689d;
                                }
                                if (brVar3.f126691a == 1) {
                                    zVar = (C49156z) brVar3.f126692b;
                                } else {
                                    zVar = C49156z.f127111d;
                                }
                                C63042fg fgVar5 = zVar.f127115c;
                                if (fgVar5 == null) {
                                    fgVar5 = C63042fg.f170152c;
                                }
                                d3 = C62953e.m95478c(fgVar5);
                                if (j3 > d3) {
                                    ((C58970a) ((C58970a) oVar.f342909o.mo56224b()).mo56372aa(35432)).mo56389s("PCP receives validity outside of scheduling time triggerId %s", str3);
                                    z5 = false;
                                }
                            } else {
                                if ((i6 == 1 ? (C48971br) azVar.f126660b : C48971br.f126689d).f126691a == 5) {
                                    z6 = true;
                                }
                            }
                        }
                        it3 = it4;
                        gpVar12 = gpVar15;
                        gpVar13 = gpVar14;
                        e3 = gpVar4;
                    }
                    C58480gp gpVar16 = gpVar13;
                    C58480gp gpVar17 = gpVar12;
                    C58480gp gpVar18 = e3;
                    if (z5) {
                        ((C58970a) ((C58970a) oVar.f342909o.mo56224b()).mo56372aa(35431)).mo56353F("scheduling trigger: %s, trigger stop time: %s", str3, d3);
                        if (rVar3.mo106302e().isPresent() && (!z6 || (oVar.f342904j.mo106108a("android.permission.ACCESS_COARSE_LOCATION") && oVar.f342904j.mo106108a("android.permission.ACCESS_FINE_LOCATION")))) {
                            C48904f c2 = rVar3.mo106300c();
                            if (rVar3.mo106302e().isPresent()) {
                                AccountId accountId = (AccountId) rVar3.mo106302e().get();
                                C48918t tVar = (C48918t) C48919u.f126586g.createBuilder();
                                C48900b bVar2 = C48900b.PROACTIVE_CLIENT_PLATFORM;
                                tVar.copyOnWrite();
                                C48919u uVar = (C48919u) tVar.instance;
                                uVar.f126589b = bVar2.f126548g;
                                uVar.f126588a |= 1;
                                tVar.copyOnWrite();
                                C48919u uVar2 = (C48919u) tVar.instance;
                                uVar2.f126588a |= 4;
                                uVar2.f126591d = str3;
                                C39226b bVar3 = C39226b.TAG_ASSISTANT_PCP;
                                tVar.copyOnWrite();
                                C48919u uVar3 = (C48919u) tVar.instance;
                                uVar3.f126592e = bVar3.getNumber();
                                uVar3.f126588a |= 8;
                                switch (rVar3.mo106299b()) {
                                    case 100001:
                                        c = 34465;
                                        break;
                                    case 100002:
                                        c = 34466;
                                        break;
                                    case 100003:
                                        c = 34467;
                                        break;
                                    case 100004:
                                        c = 34468;
                                        break;
                                    case 100005:
                                        c = 34469;
                                        break;
                                    case 100006:
                                        c = 34470;
                                        break;
                                    case 100007:
                                        c = 34471;
                                        break;
                                    case 100008:
                                        c = 34472;
                                        break;
                                    case 100009:
                                        c = 34473;
                                        break;
                                    case 100010:
                                        c = 34474;
                                        break;
                                    case 100011:
                                        c = 34475;
                                        break;
                                    case 100012:
                                        c = 34476;
                                        break;
                                    case 100013:
                                        c = 34477;
                                        break;
                                    default:
                                        c = 0;
                                        break;
                                }
                                if (c != 0) {
                                    switch (c) {
                                        case 34465:
                                            str = "REMINDER";
                                            break;
                                        case 34466:
                                            str = "TIPS";
                                            break;
                                        case 34467:
                                            str = "LOCAL_CALENDAR";
                                            break;
                                        case 34468:
                                            str = "NEXT_STOP";
                                            break;
                                        case 34469:
                                            str = "TIME_TO_LEAVE";
                                            break;
                                        case 34470:
                                            str = "COMMUTE_TIME";
                                            break;
                                        case 34471:
                                            str = "WEATHER_ALERT";
                                            break;
                                        case 34472:
                                            str = "ON_DEVICE_MEDIA_RECOMMENDATION";
                                            break;
                                        case 34473:
                                            str = "GROCERY";
                                            break;
                                        case 34474:
                                            str = "FLIGHT_LANDING";
                                            break;
                                        case 34475:
                                            str = "HOTEL_CHECK_IN";
                                            break;
                                        case 34476:
                                            str = "HOTEL_CHECK_OUT";
                                            break;
                                        default:
                                            str = "LOCAL_REMINDER";
                                            break;
                                    }
                                } else {
                                    str = "PROACTIVE_CLIENT_PLATFORM";
                                }
                                tVar.copyOnWrite();
                                C48919u uVar4 = (C48919u) tVar.instance;
                                uVar4.f126588a |= 16;
                                uVar4.f126593f = str;
                                C48948av avVar = (C48948av) C48952az.f126657c.createBuilder();
                                C48950ax axVar = (C48950ax) C48951ay.f126654b.createBuilder();
                                axVar.copyOnWrite();
                                C48951ay ayVar = (C48951ay) axVar.instance;
                                ayVar.mo53203a();
                                C62947c.addAll((Iterable) cqVar, (List) ayVar.f126656a);
                                avVar.copyOnWrite();
                                C48952az azVar2 = (C48952az) avVar.instance;
                                C48951ay ayVar2 = (C48951ay) axVar.build();
                                ayVar2.getClass();
                                azVar2.f126660b = ayVar2;
                                azVar2.f126659a = 2;
                                gpVar2 = gpVar17;
                                gpVar = gpVar16;
                                j2 = j13;
                                C60870cx b4 = oVar.f342903i.mo50215b(accountId);
                                z = z4;
                                C48904f fVar = c2;
                                gpVar3 = gpVar18;
                                AccountId accountId2 = accountId;
                                hashMap = hashMap2;
                                C60922j.m93045h(b4, C47810es.m84966f(new C124153b(oVar, tVar, (C48952az) avVar.build(), d3, fVar, accountId2, str3)), oVar.f342898d);
                                hashMap2 = hashMap;
                                z4 = z;
                                e3 = gpVar3;
                                it = it2;
                                e2 = gpVar2;
                                gpVar10 = gpVar;
                                b = j3;
                                j13 = j2;
                            } else {
                                hashMap = hashMap2;
                                j2 = j13;
                                gpVar2 = gpVar17;
                                z = z4;
                                gpVar = gpVar16;
                                gpVar3 = gpVar18;
                                hashMap2 = hashMap;
                                z4 = z;
                                e3 = gpVar3;
                                it = it2;
                                e2 = gpVar2;
                                gpVar10 = gpVar;
                                b = j3;
                                j13 = j2;
                            }
                        }
                    }
                    hashMap = hashMap2;
                    j2 = j13;
                    gpVar2 = gpVar17;
                    z = z4;
                    gpVar = gpVar16;
                    gpVar3 = gpVar18;
                    hashMap2 = hashMap;
                    z4 = z;
                    e3 = gpVar3;
                    it = it2;
                    e2 = gpVar2;
                    gpVar10 = gpVar;
                    b = j3;
                    j13 = j2;
                } else {
                    gpVar = gpVar13;
                    gpVar2 = gpVar12;
                }
            }
            gpVar3 = e3;
            hashMap = hashMap2;
            j2 = j13;
            z = z4;
            hashMap2 = hashMap;
            z4 = z;
            e3 = gpVar3;
            it = it2;
            e2 = gpVar2;
            gpVar10 = gpVar;
            b = j3;
            j13 = j2;
        }
        String str4 = "_DATA_TYPE_";
        C58480gp gpVar19 = e2;
        C58480gp gpVar20 = e3;
        HashMap hashMap3 = hashMap2;
        boolean z7 = z4;
        C58480gp gpVar21 = gpVar10;
        PendingIntent broadcast = PendingIntent.getBroadcast(oVar.f342896b, 0, C147798a.m240896b(new Intent(oVar.f342896b, ValidityController_Receiver.class), 335544320, 0), 335544320);
        AlarmManager alarmManager = (AlarmManager) oVar.f342896b.getSystemService("alarm");
        alarmManager.getClass();
        broadcast.getClass();
        long j15 = j13;
        try {
            alarmManager.setExactAndAllowWhileIdle(1, j15, broadcast);
        } catch (SecurityException e6) {
            ((C58970a) ((C58970a) ((C58970a) oVar.f342909o.mo56226d()).mo56382g(e6)).mo56372aa(35435)).mo56386p("Failed to set exact alarm on PCP, fallback to inexact alarm");
            broadcast.getClass();
            alarmManager.setAndAllowWhileIdle(1, j15, broadcast);
        } catch (RuntimeException e7) {
            RuntimeException runtimeException = e7;
            C58970a aVar = (C58970a) oVar.f342909o.mo56226d();
            aVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.PCP_FAILED_TO_SET_ALARM_FOR_DATA_UPDATE_VALUE));
            ((C58970a) ((C58970a) aVar.mo56382g(runtimeException)).mo56372aa(35436)).mo56386p("Failed to set alarm for PCP data update!");
        }
        if (j12 != j15) {
            oVar.f342900f.f342762a.mo41704s("NEW_ALARM_SCHEDULED");
            C60856cj.m92911t(oVar.f342902h.f341541b.mo45938b(new C123614ag(C123611ad.m202961t(Instant.ofEpochMilli(j15)))), C47810es.m84974n(new C124163l(oVar, z7)), oVar.f342898d);
        }
        C124100bz bzVar2 = oVar.f342900f;
        for (Map.Entry entry : hashMap3.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            bzVar2.f342762a.mo41704s("NOTIFICATIONS_TO_CLIENTS_FOR_CLIENT_TYPE_" + intValue);
            for (Integer intValue2 : (Set) entry.getValue()) {
                int intValue3 = intValue2.intValue();
                bzVar2.f342762a.mo41704s("NOTIFICATIONS_TO_CLIENTS_FOR_CLIENT_TYPE_" + intValue + str4 + intValue3);
            }
        }
        return C47638k.m84752c(gpVar21.mo55394f()).mo51521b(new C124160i(oVar, gpVar19.mo55394f(), gpVar20.mo55394f()), oVar.f342898d);
    }
}
