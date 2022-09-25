package com.google.android.apps.gsa.opa.smartspace.p6458g;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83740al;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84469a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3897e.p3921j.p3926e.C52017hp;
import com.google.assistant.p3994s.p3995a.C53230ge;
import com.google.assistant.p3994s.p3995a.C53232gg;
import com.google.assistant.p3994s.p3995a.C53234gi;
import com.google.assistant.p3994s.p3995a.C53236gk;
import com.google.assistant.p3994s.p3995a.C53243gr;
import com.google.assistant.p3994s.p3995a.C53244gs;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4479cg.C58072d;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.LocalDateTime;
import p3186j$.time.LocalTime;
import p3186j$.time.ZoneId;
import p3186j$.time.ZoneOffset;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.g.c */
/* compiled from: PG */
public final class C83791c {

    /* renamed from: e */
    public static final /* synthetic */ int f228369e = 0;

    /* renamed from: f */
    private static final C58528ij f228370f = C58528ij.m90011K(C53236gk.RAIN_PRECIPITATION_TYPE, C53236gk.SNOW_PRECIPITATION_TYPE);

    /* renamed from: a */
    public final C130895ag f228371a;

    /* renamed from: b */
    public final C21370a f228372b;

    /* renamed from: c */
    public final C86124t f228373c;

    /* renamed from: d */
    public final C58974d f228374d;

    /* renamed from: g */
    private final C92111g f228375g;

    /* renamed from: h */
    private final C83794j f228376h;

    /* renamed from: i */
    private final C92122r f228377i;

    /* renamed from: j */
    private final C85664bo f228378j;

    /* renamed from: k */
    private final C84469a f228379k;

    public C83791c(C92111g gVar, C83794j jVar, C92122r rVar, C85664bo boVar, C130895ag agVar, C21370a aVar, C86124t tVar, C83564a aVar2, C84469a aVar3) {
        this.f228375g = gVar;
        this.f228376h = jVar;
        this.f228377i = rVar;
        this.f228378j = boVar;
        this.f228371a = agVar;
        this.f228372b = aVar;
        this.f228373c = tVar;
        this.f228374d = aVar2.mo76900a("WeatherUtils");
        this.f228379k = aVar3;
    }

    /* renamed from: i */
    public static C53236gk m133402i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return C53236gk.UNKNOWN_PRECIPITATION_TYPE;
        }
        if (i2 != 1) {
            return C53236gk.SNOW_PRECIPITATION_TYPE;
        }
        return C53236gk.RAIN_PRECIPITATION_TYPE;
    }

    /* renamed from: j */
    private final int m133403j(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt >= 0) {
                if (parseInt <= 100) {
                    return parseInt;
                }
            }
            ((C58970a) ((C58970a) this.f228374d.mo56226d()).mo56372aa(6864)).mo56387q("Received invalid precipitation %s", parseInt);
            return -1;
        } catch (NumberFormatException unused) {
            ((C58970a) ((C58970a) this.f228374d.mo56226d()).mo56372aa(6865)).mo56389s("Failed to parse precipitation=%s", str);
            return -1;
        }
    }

    /* renamed from: a */
    public final C50818do mo77138a(C50818do doVar) {
        if (this.f228373c.mo79746e(C89985ax.f246718az)) {
            boolean z = true;
            if (this.f228378j.mo79190b(new C85662bm[]{C85662bm.LOCATION_HISTORY_AND_REPORTING}).mo79181g(C85662bm.LOCATION_HISTORY_AND_REPORTING) && (doVar.f132304a & 268435456) != 0) {
                C50790cn cnVar = (C50790cn) doVar.toBuilder();
                cnVar.copyOnWrite();
                C50818do doVar2 = (C50818do) cnVar.instance;
                doVar2.f132304a &= -268435457;
                doVar2.f132297C = C50818do.f132293H.f132297C;
                doVar = (C50818do) cnVar.build();
            }
            C130895ag agVar = this.f228371a;
            if ((268435456 & doVar.f132304a) == 0) {
                z = false;
            }
            agVar.mo109903aa(z);
        }
        return doVar;
    }

    /* renamed from: b */
    public final C53244gs mo77139b(C53245gt gtVar) {
        String str;
        if (this.f228373c.mo79746e(C89985ax.f246708ap) && (gtVar.f139567a & 4) != 0) {
            C53244gs gsVar = gtVar.f139571e;
            if (gsVar == null) {
                gsVar = C53244gs.f139553j;
            }
            C53230ge geVar = (C53230ge) gtVar.f139569c.get(0);
            StringBuilder sb = new StringBuilder();
            String str2 = "_";
            if (!gsVar.f139556b.equals(geVar.f139506b)) {
                sb.append("DESCRIPTION");
                str = str2;
            } else {
                str = BuildConfig.FLAVOR;
            }
            if (!gsVar.f139557c.equals(geVar.f139507c)) {
                sb.append(str);
                sb.append("TEMPERATURE");
                str = str2;
            }
            if (!gsVar.f139562h.equals(geVar.f139512h)) {
                sb.append(str);
                sb.append("ICON");
            } else {
                str2 = str;
            }
            if (!str2.isEmpty()) {
                C130895ag agVar = this.f228371a;
                C53232gg a = C53232gg.m86789a(gtVar.f139568b);
                if (a == null) {
                    a = C53232gg.UNKNOWN;
                }
                agVar.mo109929b(a.f139522g, sb.toString());
            }
        }
        int i = 1;
        if (this.f228373c.mo79746e(C89985ax.f246708ap) && (gtVar.f139567a & 4) != 0) {
            C53244gs gsVar2 = gtVar.f139571e;
            if (gsVar2 == null) {
                gsVar2 = C53244gs.f139553j;
            }
            int i2 = gsVar2.f139555a;
            if (!((i2 & 2) == 0 || (i2 & 64) == 0 || (i2 & 1) == 0)) {
                C53244gs gsVar3 = gtVar.f139571e;
                return gsVar3 == null ? C53244gs.f139553j : gsVar3;
            }
        }
        C53230ge geVar2 = (C53230ge) gtVar.f139569c.get(0);
        int i3 = geVar2.f139505a;
        C53243gr grVar = (C53243gr) C53244gs.f139553j.createBuilder();
        String str3 = geVar2.f139506b;
        grVar.copyOnWrite();
        C53244gs gsVar4 = (C53244gs) grVar.instance;
        str3.getClass();
        gsVar4.f139555a |= 1;
        gsVar4.f139556b = str3;
        String str4 = geVar2.f139507c;
        grVar.copyOnWrite();
        C53244gs gsVar5 = (C53244gs) grVar.instance;
        str4.getClass();
        gsVar5.f139555a |= 2;
        gsVar5.f139557c = str4;
        String str5 = geVar2.f139512h;
        grVar.copyOnWrite();
        C53244gs gsVar6 = (C53244gs) grVar.instance;
        str5.getClass();
        gsVar6.f139555a |= 64;
        gsVar6.f139562h = str5;
        if ((geVar2.f139505a & 16) != 0) {
            C53236gk a2 = C53236gk.m86793a(geVar2.f139510f);
            if (a2 == null) {
                a2 = C53236gk.UNKNOWN_PRECIPITATION_TYPE;
            }
            grVar.copyOnWrite();
            C53244gs gsVar7 = (C53244gs) grVar.instance;
            gsVar7.f139560f = a2.f139534d;
            gsVar7.f139555a |= 16;
        }
        if ((geVar2.f139505a & 32) != 0) {
            String str6 = geVar2.f139511g;
            grVar.copyOnWrite();
            C53244gs gsVar8 = (C53244gs) grVar.instance;
            str6.getClass();
            gsVar8.f139555a |= 32;
            gsVar8.f139561g = str6;
        }
        if ((geVar2.f139505a & 128) != 0) {
            int a3 = C52017hp.m86469a(geVar2.f139513i);
            if (a3 != 0) {
                i = a3;
            }
            grVar.copyOnWrite();
            C53244gs gsVar9 = (C53244gs) grVar.instance;
            gsVar9.f139563i = i - 1;
            gsVar9.f139555a |= 128;
        }
        return (C53244gs) grVar.build();
    }

    /* renamed from: c */
    public final C58833ax mo77140c(C83800p pVar) {
        if (!pVar.mo77058d().mo56113h() || ((C83741am) pVar.mo77058d().mo56107c()).f228253d.isEmpty()) {
            ((C58970a) ((C58970a) this.f228374d.mo56226d()).mo56372aa(6869)).mo56386p("Weather cards are missing from cache.");
            return C58836b.f156633a;
        }
        C62971cq<C50818do> cqVar = ((C83741am) pVar.mo77058d().mo56107c()).f228253d;
        ((C58970a) ((C58970a) this.f228374d.mo56224b()).mo56372aa(6870)).mo56387q("Have %d weather cards in cache", cqVar.size());
        if (this.f228375g.mo86741b((C50818do) C58557jl.m90131l(cqVar))) {
            C50818do doVar = (C50818do) C58557jl.m90131l(cqVar);
            C58970a aVar = (C58970a) ((C58970a) this.f228374d.mo56226d()).mo56372aa(6872);
            Long valueOf = Long.valueOf(doVar.f132317n);
            Long valueOf2 = Long.valueOf(doVar.f132318o);
            C50796ct ctVar = doVar.f132320q;
            if (ctVar == null) {
                ctVar = C50796ct.f132223c;
            }
            aVar.mo56359L("All the weather cards in cache are expired, updated time=%d, event start time=%d, event expriation time=%d", valueOf, valueOf2, Long.valueOf(ctVar.f132226b));
            if (doVar.f132317n == 0) {
                ((C58970a) ((C58970a) this.f228374d.mo56226d()).mo56372aa(6873)).mo56386p("Expired weather card with zero update time");
                this.f228371a.mo109905ac();
            }
            return C58836b.f156633a;
        }
        C83740al alVar = (C83740al) ((C83741am) pVar.mo77058d().mo56107c()).toBuilder();
        alVar.copyOnWrite();
        ((C83741am) alVar.instance).f228253d = C83741am.emptyProtobufList();
        for (C50818do doVar2 : cqVar) {
            if (!this.f228375g.mo86743d(doVar2)) {
                C58970a aVar2 = (C58970a) ((C58970a) this.f228374d.mo56226d()).mo56372aa(6871);
                boolean z = doVar2.f132305b;
                C92111g gVar = this.f228375g;
                C50794cr a = C50794cr.m85938a(doVar2.f132315l);
                if (a == null) {
                    a = C50794cr.UNDEFINED;
                }
                aVar2.mo56358K("Return empty weather cards: one of the cards in cache is invalid: shouldDiscard=%s, isEnabled=%s", z, gVar.mo86742c(a));
                return C58836b.f156633a;
            }
            alVar.mo77054a(mo77138a(doVar2));
        }
        C83741am amVar = (C83741am) alVar.build();
        if (!amVar.f228253d.isEmpty()) {
            return C58833ax.m90834k(amVar);
        }
        return C58836b.f156633a;
    }

    /* renamed from: d */
    public final C58833ax mo77141d(C53245gt gtVar) {
        if (!this.f228379k.mo78048v()) {
            return C58836b.f156633a;
        }
        if (!gtVar.f139569c.isEmpty() && (gtVar.f139567a & 16) != 0) {
            C53234gi giVar = gtVar.f139573g;
            if (giVar == null) {
                giVar = C53234gi.f139523e;
            }
            if ((giVar.f139525a & 1) != 0) {
                C53234gi giVar2 = gtVar.f139573g;
                if (((giVar2 == null ? C53234gi.f139523e : giVar2).f139525a & 2) != 0) {
                    if (giVar2 == null) {
                        giVar2 = C53234gi.f139523e;
                    }
                    if (!giVar2.f139528d.isEmpty()) {
                        C53244gs b = mo77139b(gtVar);
                        int j = m133403j(b.f139561g);
                        int a = C52017hp.m86469a(b.f139563i);
                        if (a == 0) {
                            a = 1;
                        }
                        int i = a - 1;
                        if (!(i == 26 || i == 27 || i == 29 || i == 31)) {
                            switch (i) {
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                    break;
                                default:
                                    if (i != 31) {
                                        switch (i) {
                                            case 19:
                                            case 20:
                                            case 21:
                                            case 22:
                                            case 23:
                                            case 24:
                                            case 25:
                                                break;
                                            default:
                                                if (j >= 0) {
                                                    C53236gk a2 = C53236gk.m86793a(b.f139560f);
                                                    if (a2 == null) {
                                                        a2 = C53236gk.UNKNOWN_PRECIPITATION_TYPE;
                                                    }
                                                    if (!f228370f.contains(a2) || ((long) j) <= this.f228373c.mo79743a(C89985ax.f246683aJ)) {
                                                        C53234gi giVar3 = gtVar.f139573g;
                                                        if (giVar3 == null) {
                                                            giVar3 = C53234gi.f139523e;
                                                        }
                                                        C58072d dVar = giVar3.f139526b;
                                                        if (dVar == null) {
                                                            dVar = C58072d.f155218d;
                                                        }
                                                        C53234gi giVar4 = gtVar.f139573g;
                                                        if (giVar4 == null) {
                                                            giVar4 = C53234gi.f139523e;
                                                        }
                                                        int i2 = 0;
                                                        long hours = (Duration.ofMillis(this.f228372b.mo26870b()).toHours() - Duration.ofMillis(LocalDateTime.m71183of(dVar.f155220a, dVar.f155221b, dVar.f155222c, giVar4.f139527c, 0).atZone(ZoneOffset.UTC).toInstant().toEpochMilli()).toHours()) + 1;
                                                        if (2 + hours <= 0) {
                                                            return C58836b.f156633a;
                                                        }
                                                        while (i2 < 2) {
                                                            long j2 = ((long) i2) + hours;
                                                            C53234gi giVar5 = gtVar.f139573g;
                                                            if (giVar5 == null) {
                                                                giVar5 = C53234gi.f139523e;
                                                            }
                                                            if (j2 >= ((long) giVar5.f139528d.size())) {
                                                                return C58836b.f156633a;
                                                            }
                                                            C53234gi giVar6 = gtVar.f139573g;
                                                            if (giVar6 == null) {
                                                                giVar6 = C53234gi.f139523e;
                                                            }
                                                            C53244gs gsVar = (C53244gs) giVar6.f139528d.get(((int) hours) + i2);
                                                            C58528ij ijVar = f228370f;
                                                            C53236gk a3 = C53236gk.m86793a(gsVar.f139560f);
                                                            if (a3 == null) {
                                                                a3 = C53236gk.UNKNOWN_PRECIPITATION_TYPE;
                                                            }
                                                            if (!ijVar.contains(a3) || ((long) m133403j(gsVar.f139561g)) <= this.f228373c.mo79743a(C89985ax.f246684aK)) {
                                                                i2++;
                                                            } else {
                                                                C53236gk a4 = C53236gk.m86793a(gsVar.f139560f);
                                                                if (a4 == null) {
                                                                    a4 = C53236gk.UNKNOWN_PRECIPITATION_TYPE;
                                                                }
                                                                return C58833ax.m90834k(new Pair(a4, Integer.valueOf(i2 + 1)));
                                                            }
                                                        }
                                                        return C58836b.f156633a;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        return C58836b.f156633a;
                    }
                }
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: e */
    public final C58485gu mo77142e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Drawable drawable = (Drawable) it.next();
            if (drawable == null) {
                ((C58970a) ((C58970a) this.f228374d.mo56226d()).mo56372aa(6878)).mo56386p("One of the weather drawable is null");
                this.f228371a.mo109907ae(list.size());
                return C58485gu.m89845m();
            }
            arrayList.add(((BitmapDrawable) drawable).getBitmap());
        }
        return C58485gu.m89842j(arrayList);
    }

    /* renamed from: f */
    public final C60870cx mo77143f(C83741am amVar, C91189au auVar) {
        ArrayList arrayList = new ArrayList();
        if (!this.f228376h.mo77175m() || !this.f228376h.mo77161F()) {
            C50818do doVar = amVar.f228252c;
            if (doVar == null) {
                doVar = C50818do.f132293H;
            }
            C50729n nVar = doVar.f132314k;
            if (nVar == null) {
                nVar = C50729n.f132007g;
            }
            arrayList.add(auVar.mo85418e(Uri.parse(nVar.f132011c), 7));
        } else {
            for (C50818do doVar2 : amVar.f228253d) {
                C50729n nVar2 = doVar2.f132314k;
                if (nVar2 == null) {
                    nVar2 = C50729n.f132007g;
                }
                arrayList.add(auVar.mo85418e(Uri.parse(nVar2.f132011c), 7));
            }
        }
        return C60856cj.m92894c(arrayList).mo57334a(new C83790b(arrayList), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final boolean mo77144g(long j, ZoneId zoneId) {
        if (!this.f228379k.mo78040n()) {
            return false;
        }
        LocalTime localTime = Instant.ofEpochMilli(j).atZone(zoneId).toLocalTime();
        LocalTime parse = LocalTime.parse(this.f228373c.mo79758x(C89985ax.f246705am));
        LocalTime parse2 = LocalTime.parse(this.f228373c.mo79758x(C89985ax.f246704al));
        if (!localTime.isAfter(parse) || !localTime.isBefore(parse2)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final C58485gu mo77145h(List list, List list2) {
        if (list.size() != list2.size()) {
            ((C58970a) ((C58970a) this.f228374d.mo56226d()).mo56372aa(6877)).mo56393w("Number of weather cards and icons does not match: cards=%d, icons=%d", list.size(), list2.size());
            this.f228371a.mo109941n();
            return C58485gu.m89845m();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C50818do doVar = (C50818do) list.get(i);
            Bitmap bitmap = (Bitmap) list2.get(i);
            if (!this.f228375g.mo86743d(doVar)) {
                C58970a aVar = (C58970a) ((C58970a) this.f228374d.mo56226d()).mo56372aa(6876);
                Boolean valueOf = Boolean.valueOf(doVar.f132305b);
                C92111g gVar = this.f228375g;
                C50794cr a = C50794cr.m85938a(doVar.f132315l);
                if (a == null) {
                    a = C50794cr.UNDEFINED;
                }
                aVar.mo56361N("Return empty weather cards: one of the cards is invalid: shouldDiscard=%s, isEnabled=%s, smartspace_weather_toggle_enabled=%s, isSmartspaceEnabled=%s, isSmartspaceWeatherUpdateEnabled=%s", valueOf, Boolean.valueOf(gVar.mo86742c(a)), Boolean.valueOf(this.f228373c.mo79746e(C89985ax.f246674aA)), Boolean.valueOf(this.f228377i.f256848d.mo86755k()), Boolean.valueOf(this.f228377i.f256848d.mo86765u()));
                return C58485gu.m89845m();
            }
            if (this.f228375g.mo86741b(doVar)) {
                C58970a aVar2 = (C58970a) ((C58970a) this.f228374d.mo56226d()).mo56372aa(6874);
                C50796ct ctVar = doVar.f132320q;
                if (ctVar == null) {
                    ctVar = C50796ct.f132223c;
                }
                aVar2.mo56350C("One of the weather cards in cache is expired: exiration time=%d, current time=%d", ctVar.f132226b, this.f228372b.mo26870b());
                if (doVar.f132317n == 0) {
                    ((C58970a) ((C58970a) this.f228374d.mo56226d()).mo56372aa(6875)).mo56386p("Expired weather card with zero update time");
                    this.f228371a.mo109905ac();
                }
            } else {
                arrayList.add(new C92113i(mo77138a(doVar), bitmap, true));
            }
        }
        this.f228371a.mo109935h(list.size() - arrayList.size());
        return C58485gu.m89842j(arrayList);
    }
}
