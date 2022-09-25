package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.d.u;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83792h;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.C83806v;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.android.apps.gsa.smartspace.p7259c.C92094j;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50738bc;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63042fg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.h */
/* compiled from: PG */
public final class C110772h implements C83806v {

    /* renamed from: a */
    private final Comparator f308643a;

    /* renamed from: b */
    private final Comparator f308644b;

    /* renamed from: c */
    private final C92111g f308645c;

    /* renamed from: d */
    private final C83792h f308646d;

    /* renamed from: e */
    private final C22871g f308647e;

    /* renamed from: f */
    private final u f308648f;

    /* renamed from: g */
    private final C83794j f308649g;

    /* renamed from: h */
    private final C60887da f308650h;

    /* renamed from: i */
    private final C86124t f308651i;

    public C110772h(C92111g gVar, C83792h hVar, C22871g gVar2, u uVar, C83794j jVar, C60887da daVar, C86124t tVar, Comparator comparator, Comparator comparator2) {
        this.f308643a = comparator;
        this.f308644b = comparator2;
        this.f308646d = hVar;
        this.f308645c = gVar;
        this.f308647e = gVar2;
        this.f308648f = uVar;
        this.f308650h = daVar;
        this.f308649g = jVar;
        this.f308651i = tVar;
    }

    /* renamed from: b */
    public static final List m184498b(List list, Optional optional) {
        if (!optional.isPresent() || ((Boolean) optional.get()).booleanValue()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C83741am amVar = (C83741am) it.next();
            C50818do doVar = amVar.f228252c;
            if (doVar == null) {
                doVar = C50818do.f132293H;
            }
            C50794cr a = C50794cr.m85938a(doVar.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            if (C83794j.f228391d.contains(a)) {
                arrayList.add(amVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C60870cx mo77191a(Pair pair) {
        C60870cx cxVar;
        C60870cx cxVar2;
        List<C50738bc> list = (List) pair.first;
        List<C83741am> list2 = (List) pair.second;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!list2.isEmpty()) {
            Collections.sort(list2, this.f308643a);
            for (C83741am amVar : list2) {
                C92111g gVar = this.f308645c;
                C50818do doVar = amVar.f228252c;
                if (doVar == null) {
                    doVar = C50818do.f132293H;
                }
                if (gVar.mo86743d(doVar)) {
                    C92111g gVar2 = this.f308645c;
                    C50818do doVar2 = amVar.f228252c;
                    if (doVar2 == null) {
                        doVar2 = C50818do.f132293H;
                    }
                    if (!gVar2.mo86741b(doVar2)) {
                        arrayList.add(amVar);
                        C92111g gVar3 = this.f308645c;
                        C50818do doVar3 = amVar.f228252c;
                        if (doVar3 == null) {
                            doVar3 = C50818do.f132293H;
                        }
                        C50794cr a = C50794cr.m85938a(doVar3.f132315l);
                        if (a == null) {
                            a = C50794cr.UNDEFINED;
                        }
                        if (gVar3.f256815a.f256848d.mo86755k()) {
                            switch (a.ordinal()) {
                                case 1:
                                    if (!gVar3.f256816b.mo79746e(C89985ax.f246674aA)) {
                                        cxVar2 = C60856cj.m92900i(true);
                                        break;
                                    } else {
                                        cxVar2 = gVar3.f256817c.e(C92094j.WEATHER);
                                        break;
                                    }
                                case 2:
                                    cxVar2 = gVar3.f256817c.e(C92094j.CALENDAR_EVENTS);
                                    break;
                                case 3:
                                    cxVar2 = gVar3.f256817c.e(C92094j.COMMUTE);
                                    break;
                                case 4:
                                    cxVar2 = gVar3.f256817c.e(C92094j.UPCOMING_FLIGHTS);
                                    break;
                                case 5:
                                    cxVar2 = gVar3.f256817c.e(C92094j.BIRTHDAY);
                                    break;
                                case 7:
                                case 11:
                                case 12:
                                case 15:
                                case 17:
                                case 18:
                                case 22:
                                case 23:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 32:
                                case 33:
                                case 34:
                                case 36:
                                case 37:
                                case 38:
                                case 41:
                                    cxVar2 = C60856cj.m92900i(true);
                                    break;
                                case 8:
                                    cxVar2 = gVar3.f256817c.e(C92094j.REMINDERS);
                                    break;
                                case 10:
                                    cxVar2 = gVar3.f256817c.e(C92094j.ALARM);
                                    break;
                                case 13:
                                    cxVar2 = gVar3.f256817c.e(C92094j.SPORTS);
                                    break;
                                case 14:
                                    cxVar2 = gVar3.f256817c.e(C92094j.WEATHER_ALERT);
                                    break;
                                case 16:
                                case 20:
                                    cxVar2 = gVar3.f256817c.e(C92094j.STOCK);
                                    break;
                                case 24:
                                    cxVar2 = gVar3.f256817c.e(C92094j.TRAFFIC_INFORMATION);
                                    break;
                                case 35:
                                    cxVar2 = gVar3.f256817c.e(C92094j.AIR_QUALITY);
                                    break;
                                default:
                                    cxVar2 = C60856cj.m92900i(false);
                                    break;
                            }
                        } else {
                            cxVar2 = C60856cj.m92900i(false);
                        }
                        arrayList2.add(C60922j.m93044g(cxVar2, new C110769e(amVar), this.f308650h));
                    }
                }
            }
        }
        if (this.f308651i.mo79746e(C90017bw.f247866H)) {
            cxVar = C60856cj.m92892a(arrayList2).mo57334a(new C110770f(arrayList2, arrayList), this.f308650h);
            if (this.f308649g.mo77174l()) {
                C60870cx c = this.f308648f.c();
                cxVar = C60856cj.m92893b(c, cxVar).mo57334a(new C110768d(cxVar, c), this.f308650h);
            }
        } else if (this.f308649g.mo77174l()) {
            cxVar = this.f308647e.mo28210j(this.f308648f.c(), BuildConfig.FLAVOR, new C110728a(arrayList));
        } else {
            cxVar = C60856cj.m92900i(arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        if (!list.isEmpty()) {
            Collections.sort(list, this.f308644b);
            for (C50738bc bcVar : list) {
                C83792h hVar = this.f308646d;
                C50701am a2 = C50701am.m85887a(bcVar.f132040g);
                if (a2 == null) {
                    a2 = C50701am.UNKNOWN;
                }
                if (a2 != C50701am.UNKNOWN) {
                    C49156z zVar = bcVar.f132041h;
                    if (zVar == null) {
                        zVar = C49156z.f127111d;
                    }
                    if ((zVar.f127113a & 2) != 0) {
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        C63042fg fgVar = zVar.f127115c;
                        if (fgVar == null) {
                            fgVar = C63042fg.f170152c;
                        }
                        if (hVar.f228380a.mo26870b() >= timeUnit.toMillis(fgVar.f170154a)) {
                        }
                    }
                    arrayList3.add(bcVar);
                }
            }
        }
        return this.f308647e.mo28210j(cxVar, BuildConfig.FLAVOR, new C110771g(arrayList3));
    }
}
