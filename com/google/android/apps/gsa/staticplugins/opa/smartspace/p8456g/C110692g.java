package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g;

import android.content.Context;
import android.content.res.Resources;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.p6453b.C83743a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3886c.p3888b.C50716a;
import com.google.assistant.p3886c.p3888b.C50717b;
import com.google.assistant.p3886c.p3888b.C50719d;
import com.google.assistant.p3886c.p3888b.C50720e;
import com.google.assistant.p3886c.p3888b.C50722g;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3994s.p3995a.C53183el;
import com.google.assistant.p3994s.p3995a.C53185en;
import com.google.assistant.p3994s.p3995a.C53187ep;
import com.google.assistant.p3994s.p3995a.C53189er;
import com.google.assistant.p3994s.p3995a.C53190es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4479cg.C58072d;
import com.google.p4479cg.C58081m;
import java.util.Calendar;
import java.util.TimeZone;
import p3186j$.util.DesugarTimeZone;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.g.g */
/* compiled from: PG */
public final class C110692g {

    /* renamed from: a */
    public final Context f308438a;

    /* renamed from: b */
    public final C86124t f308439b;

    /* renamed from: c */
    public final C130895ag f308440c;

    /* renamed from: d */
    public final C21370a f308441d;

    /* renamed from: e */
    public final C22871g f308442e;

    /* renamed from: f */
    public final C22871g f308443f;

    /* renamed from: g */
    public final C58974d f308444g;

    /* renamed from: h */
    public final C91189au f308445h;

    public C110692g(Context context, C91189au auVar, C86124t tVar, C130895ag agVar, C21370a aVar, C83564a aVar2, C22871g gVar, C22871g gVar2) {
        this.f308438a = context;
        this.f308445h = auVar;
        this.f308439b = tVar;
        this.f308440c = agVar;
        this.f308441d = aVar;
        this.f308442e = gVar;
        this.f308443f = gVar2;
        this.f308444g = aVar2.mo76900a("AA.SSFlightUtils");
    }

    /* renamed from: a */
    public static int m184391a(C53190es esVar) {
        int a = C53189er.m86785a(esVar.f139408m);
        return (a != 0 && a == 8) ? R.string.assistant_flight_to_delayed_info : R.string.assistant_flight_to_info;
    }

    @Deprecated
    /* renamed from: b */
    public static long m184392b(C53187ep epVar) {
        Calendar instance = Calendar.getInstance();
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        timeZone.setRawOffset(epVar.f139390f * 60000);
        C58072d dVar = epVar.f139389e;
        if (dVar == null) {
            dVar = C58072d.f155218d;
        }
        instance.set(1, dVar.f155220a);
        C58072d dVar2 = epVar.f139389e;
        if (dVar2 == null) {
            dVar2 = C58072d.f155218d;
        }
        instance.set(2, dVar2.f155221b - 1);
        C58072d dVar3 = epVar.f139389e;
        if (dVar3 == null) {
            dVar3 = C58072d.f155218d;
        }
        instance.set(5, dVar3.f155222c);
        C58081m mVar = epVar.f139388d;
        if (mVar == null) {
            mVar = C58081m.f155254e;
        }
        instance.set(11, mVar.f155256a);
        C58081m mVar2 = epVar.f139388d;
        if (mVar2 == null) {
            mVar2 = C58081m.f155254e;
        }
        instance.set(12, mVar2.f155257b);
        C58081m mVar3 = epVar.f139388d;
        if (mVar3 == null) {
            mVar3 = C58081m.f155254e;
        }
        instance.set(13, mVar3.f155258c);
        instance.set(14, 0);
        instance.setTimeZone(timeZone);
        return instance.getTimeInMillis();
    }

    /* renamed from: c */
    public static C50720e m184393c(String str) {
        C50717b bVar = (C50717b) C50720e.f131985f.createBuilder();
        bVar.copyOnWrite();
        C50720e eVar = (C50720e) bVar.instance;
        str.getClass();
        eVar.f131987a |= 1;
        eVar.f131988b = str;
        C50722g gVar = C50722g.UNSPECIFIED;
        bVar.copyOnWrite();
        C50720e eVar2 = (C50720e) bVar.instance;
        eVar2.f131989c = gVar.f131998e;
        eVar2.f131987a |= 2;
        C50719d dVar = C50719d.FIXED_STRING;
        bVar.copyOnWrite();
        C50720e eVar3 = (C50720e) bVar.instance;
        eVar3.f131990d = dVar.f131984e;
        eVar3.f131987a |= 4;
        bVar.copyOnWrite();
        C50720e eVar4 = (C50720e) bVar.instance;
        eVar4.f131987a |= 8;
        eVar4.f131991e = false;
        return (C50720e) bVar.build();
    }

    /* renamed from: g */
    public static String m184395g(C53190es esVar) {
        C53183el elVar;
        int i = esVar.f139397b;
        if (i == 11) {
            return ((C53183el) esVar.f139398c).f139376b;
        }
        if (i == 10) {
            elVar = (C53183el) esVar.f139398c;
        } else {
            elVar = C53183el.f139373c;
        }
        return elVar.f139376b;
    }

    /* renamed from: i */
    public static boolean m184396i(C53190es esVar) {
        if (esVar.f139407l.isEmpty() || (((C53185en) esVar.f139407l.get(0)).f139379a & 4) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m184397j(C53190es esVar) {
        if (esVar.f139407l.isEmpty() || (((C53185en) esVar.f139407l.get(0)).f139379a & 16) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final C50723h mo98853d(Context context, C53190es esVar, boolean z, boolean z2) {
        String str;
        String str2;
        int a = C53189er.m86785a(esVar.f139408m);
        if (a != 0 && a == 8) {
            Resources resources = context.getResources();
            Object[] objArr = new Object[2];
            objArr[0] = mo98855h(context, esVar, z2);
            C53183el elVar = esVar.f139403h;
            if (elVar == null) {
                elVar = C53183el.f139373c;
            }
            Optional b = C83743a.m133333b(elVar.f139376b);
            if (!b.isPresent()) {
                ((C58970a) ((C58970a) this.f308444g.mo56226d()).mo56372aa(26671)).mo56386p("Return empty scheduled departure time string due to invalid time.");
                str2 = BuildConfig.FLAVOR;
            } else {
                str2 = C89407a.m145418a(context, ((Long) b.get()).longValue(), 0, false).toString();
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str2.length(); i++) {
                sb.appendCodePoint(str2.codePointAt(i));
                sb.append(822);
            }
            objArr[1] = sb.toString();
            str = resources.getString(R.string.assistant_flight_departure_time_delayed_info, objArr);
        } else {
            str = context.getResources().getString(R.string.assistant_flight_departure_time_info, new Object[]{mo98855h(context, esVar, z2)});
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (!z) {
            C53187ep epVar = esVar.f139401f;
            if (epVar == null) {
                epVar = C53187ep.f139383h;
            }
            int i2 = epVar.f139385a & 64;
            C53187ep epVar2 = esVar.f139401f;
            if (epVar2 == null) {
                epVar2 = C53187ep.f139383h;
            }
            boolean z3 = (epVar2.f139385a & 4) != 0;
            boolean z4 = !esVar.f139407l.isEmpty() && (((C53185en) esVar.f139407l.get(0)).f139379a & 1) != 0;
            if (i2 != 0 && (!z3 || !z4)) {
                sb2.append(" · ");
                Resources resources2 = context.getResources();
                Object[] objArr2 = new Object[1];
                C53187ep epVar3 = esVar.f139401f;
                if (epVar3 == null) {
                    epVar3 = C53187ep.f139383h;
                }
                objArr2[0] = epVar3.f139391g;
                sb2.append(resources2.getString(R.string.assistant_flight_departure_terminal_info, objArr2));
            }
            if (z3) {
                sb2.append(" · ");
                Resources resources3 = context.getResources();
                Object[] objArr3 = new Object[1];
                C53187ep epVar4 = esVar.f139401f;
                if (epVar4 == null) {
                    epVar4 = C53187ep.f139383h;
                }
                objArr3[0] = epVar4.f139387c;
                sb2.append(resources3.getString(R.string.assistant_flight_departure_gate_info, objArr3));
            }
            if (z4) {
                sb2.append(" · ");
                sb2.append(context.getResources().getString(R.string.assistant_flight_seat_info, new Object[]{((C53185en) esVar.f139407l.get(0)).f139380b}));
            }
        }
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        String sb3 = sb2.toString();
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        hVar.f132001a |= 1;
        hVar.f132002b = sb3;
        C50722g gVar = C50722g.UNSPECIFIED;
        aVar.copyOnWrite();
        C50723h hVar2 = (C50723h) aVar.instance;
        hVar2.f132003c = gVar.f131998e;
        hVar2.f132001a |= 2;
        return (C50723h) aVar.build();
    }

    /* renamed from: e */
    public final C50723h mo98854e(Context context, C53190es esVar, boolean z) {
        String str;
        C53187ep epVar = esVar.f139401f;
        if (epVar == null) {
            epVar = C53187ep.f139383h;
        }
        if ((epVar.f139385a & 4) != 0) {
            str = context.getResources().getString(R.string.assistant_flight_departure_gate_info, new Object[]{epVar.f139387c});
        } else {
            str = context.getResources().getString(R.string.assistant_flight_departure_time_info, new Object[]{mo98855h(context, esVar, z)});
        }
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        str.getClass();
        hVar.f132001a |= 1;
        hVar.f132002b = str;
        C50722g gVar = C50722g.UNSPECIFIED;
        aVar.copyOnWrite();
        C50723h hVar2 = (C50723h) aVar.instance;
        hVar2.f132003c = gVar.f131998e;
        hVar2.f132001a |= 2;
        return (C50723h) aVar.build();
    }

    /* renamed from: h */
    public final String mo98855h(Context context, C53190es esVar, boolean z) {
        Optional f = m184394f(esVar, z);
        if (f.isPresent()) {
            return C89407a.m145418a(context, ((Long) f.get()).longValue(), 0, false).toString();
        }
        ((C58970a) ((C58970a) this.f308444g.mo56226d()).mo56372aa(26670)).mo56386p("Return empty actual or estimated departure time string due to invalid time");
        return BuildConfig.FLAVOR;
    }

    /* renamed from: k */
    public final boolean mo98856k(long j) {
        long b = this.f308441d.mo26870b();
        return b <= C131179d.f358768d + j && b >= j - C131179d.f358766b;
    }

    /* renamed from: l */
    public final boolean mo98857l(C53190es esVar) {
        return this.f308439b.mo79746e(C89985ax.f246709aq) && m184396i(esVar);
    }

    /* renamed from: f */
    public static Optional m184394f(C53190es esVar, boolean z) {
        if (z) {
            return C83743a.m133333b(m184395g(esVar));
        }
        C53187ep epVar = esVar.f139401f;
        if (epVar == null) {
            epVar = C53187ep.f139383h;
        }
        return Optional.m71637of(Long.valueOf(m184392b(epVar)));
    }
}
