package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9998d;

import android.content.Context;
import android.content.res.Resources;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131253v;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.C131596c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.media.C47449e;
import com.google.assistant.p3886c.C50843o;
import com.google.assistant.p3886c.C50844p;
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
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60948g;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.Executor;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.d.e */
/* compiled from: PG */
public final class C131655e {

    /* renamed from: m */
    private static final C59071e f359717m = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.ambient.smartspace.d.e");

    /* renamed from: a */
    public final Context f359718a;

    /* renamed from: b */
    public final C21370a f359719b;

    /* renamed from: c */
    public final Executor f359720c;

    /* renamed from: d */
    public final Executor f359721d;

    /* renamed from: e */
    public final C58974d f359722e;

    /* renamed from: f */
    public final C47449e f359723f;

    /* renamed from: g */
    public final Boolean f359724g;

    /* renamed from: h */
    public final Long f359725h;

    /* renamed from: i */
    public final Boolean f359726i;

    /* renamed from: j */
    public final C131596c f359727j;

    /* renamed from: k */
    public final boolean f359728k;

    /* renamed from: l */
    public final C60887da f359729l;

    public C131655e(Context context, Executor executor, Executor executor2, C47449e eVar, Boolean bool, Boolean bool2, long j, boolean z, C130603a aVar, C21370a aVar2, C131596c cVar, C60887da daVar) {
        this.f359718a = context;
        this.f359720c = executor;
        this.f359721d = executor2;
        this.f359719b = aVar2;
        this.f359723f = eVar;
        this.f359722e = aVar.mo109740b(this);
        this.f359724g = bool;
        this.f359725h = Long.valueOf(j);
        this.f359726i = bool2;
        this.f359727j = cVar;
        this.f359728k = z;
        this.f359729l = daVar;
    }

    /* renamed from: a */
    public static int m214092a(C53190es esVar) {
        int a = C53189er.m86785a(esVar.f139408m);
        return (a != 0 && a == 8) ? R.string.assistant_flight_to_delayed_info : R.string.assistant_flight_to_info;
    }

    /* renamed from: b */
    public static C50843o m214093b(C53190es esVar) {
        C53183el elVar;
        C53183el elVar2;
        C53183el elVar3;
        C53183el elVar4;
        C50843o oVar = (C50843o) C50844p.f132387m.createBuilder();
        C53183el elVar5 = esVar.f139403h;
        if (elVar5 == null) {
            elVar5 = C53183el.f139373c;
        }
        Optional b = C131656f.m214100b(elVar5.f139376b);
        if (b.isPresent()) {
            long longValue = ((Long) b.get()).longValue();
            oVar.copyOnWrite();
            C50844p pVar = (C50844p) oVar.instance;
            pVar.f132389a |= 32;
            pVar.f132395g = longValue;
        }
        C53183el elVar6 = esVar.f139404i;
        if (elVar6 == null) {
            elVar6 = C53183el.f139373c;
        }
        Optional b2 = C131656f.m214100b(elVar6.f139376b);
        if (b2.isPresent()) {
            long longValue2 = ((Long) b2.get()).longValue();
            oVar.copyOnWrite();
            C50844p pVar2 = (C50844p) oVar.instance;
            pVar2.f132389a |= 64;
            pVar2.f132396h = longValue2;
        }
        if (esVar.f139397b == 11) {
            elVar = (C53183el) esVar.f139398c;
        } else {
            elVar = C53183el.f139373c;
        }
        Optional b3 = C131656f.m214100b(elVar.f139376b);
        if (b3.isPresent()) {
            long longValue3 = ((Long) b3.get()).longValue();
            oVar.copyOnWrite();
            C50844p pVar3 = (C50844p) oVar.instance;
            pVar3.f132389a |= 128;
            pVar3.f132397i = longValue3;
        }
        if (esVar.f139399d == 14) {
            elVar2 = (C53183el) esVar.f139400e;
        } else {
            elVar2 = C53183el.f139373c;
        }
        Optional b4 = C131656f.m214100b(elVar2.f139376b);
        if (b4.isPresent()) {
            long longValue4 = ((Long) b4.get()).longValue();
            oVar.copyOnWrite();
            C50844p pVar4 = (C50844p) oVar.instance;
            pVar4.f132389a |= 256;
            pVar4.f132398j = longValue4;
        }
        if (esVar.f139397b == 10) {
            elVar3 = (C53183el) esVar.f139398c;
        } else {
            elVar3 = C53183el.f139373c;
        }
        Optional b5 = C131656f.m214100b(elVar3.f139376b);
        if (b5.isPresent()) {
            long longValue5 = ((Long) b5.get()).longValue();
            oVar.copyOnWrite();
            C50844p pVar5 = (C50844p) oVar.instance;
            pVar5.f132389a |= 512;
            pVar5.f132399k = longValue5;
        }
        if (esVar.f139399d == 13) {
            elVar4 = (C53183el) esVar.f139400e;
        } else {
            elVar4 = C53183el.f139373c;
        }
        Optional b6 = C131656f.m214100b(elVar4.f139376b);
        if (b6.isPresent()) {
            long longValue6 = ((Long) b6.get()).longValue();
            oVar.copyOnWrite();
            C50844p pVar6 = (C50844p) oVar.instance;
            pVar6.f132389a |= 1024;
            pVar6.f132400l = longValue6;
        }
        return oVar;
    }

    /* renamed from: c */
    public static C50720e m214094c(String str) {
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

    /* renamed from: d */
    public static C50723h m214095d(Context context, C53190es esVar, boolean z, boolean z2) {
        String str;
        String str2;
        Context context2 = context;
        C53190es esVar2 = esVar;
        boolean z3 = z2;
        int a = C53189er.m86785a(esVar2.f139408m);
        if (a != 0 && a == 8) {
            Resources resources = context.getResources();
            Object[] objArr = new Object[2];
            objArr[0] = m214098g(context, esVar, z3);
            C53183el elVar = esVar2.f139403h;
            if (elVar == null) {
                elVar = C53183el.f139373c;
            }
            Optional b = C131656f.m214100b(elVar.f139376b);
            if (b.isEmpty()) {
                ((C59052c) ((C59052c) f359717m.mo56226d()).mo56372aa(39149)).mo56386p("Return empty scheduled departure time string due to invalid time.");
                str2 = BuildConfig.FLAVOR;
            } else {
                long longValue = ((Long) b.get()).longValue();
                C60948g gVar = C60948g.f165068a;
                str2 = C131253v.m213756c(context, longValue, Instant.now().toEpochMilli(), z2).toString();
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str2.length(); i++) {
                sb.appendCodePoint(str2.codePointAt(i));
                sb.append(822);
            }
            objArr[1] = sb.toString();
            str = resources.getString(R.string.assistant_flight_departure_time_delayed_info, objArr);
        } else {
            str = context.getResources().getString(R.string.assistant_flight_departure_time_info, new Object[]{m214098g(context, esVar, z3)});
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (!z) {
            C53187ep epVar = esVar2.f139401f;
            if (epVar == null) {
                epVar = C53187ep.f139383h;
            }
            int i2 = epVar.f139385a & 64;
            C53187ep epVar2 = esVar2.f139401f;
            if (epVar2 == null) {
                epVar2 = C53187ep.f139383h;
            }
            boolean z4 = (epVar2.f139385a & 4) != 0;
            boolean z5 = !esVar2.f139407l.isEmpty() && (((C53185en) esVar2.f139407l.get(0)).f139379a & 1) != 0;
            if (i2 != 0 && (!z4 || !z5)) {
                sb2.append(" · ");
                Resources resources2 = context.getResources();
                Object[] objArr2 = new Object[1];
                C53187ep epVar3 = esVar2.f139401f;
                if (epVar3 == null) {
                    epVar3 = C53187ep.f139383h;
                }
                objArr2[0] = epVar3.f139391g;
                sb2.append(resources2.getString(R.string.assistant_flight_departure_terminal_info, objArr2));
            }
            if (z4) {
                sb2.append(" · ");
                Resources resources3 = context.getResources();
                Object[] objArr3 = new Object[1];
                C53187ep epVar4 = esVar2.f139401f;
                if (epVar4 == null) {
                    epVar4 = C53187ep.f139383h;
                }
                objArr3[0] = epVar4.f139387c;
                sb2.append(resources3.getString(R.string.assistant_flight_departure_gate_info, objArr3));
            }
            if (z5) {
                sb2.append(" · ");
                sb2.append(context.getResources().getString(R.string.assistant_flight_seat_info, new Object[]{((C53185en) esVar2.f139407l.get(0)).f139380b}));
            }
        }
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        String sb3 = sb2.toString();
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        hVar.f132001a |= 1;
        hVar.f132002b = sb3;
        C50722g gVar2 = C50722g.UNSPECIFIED;
        aVar.copyOnWrite();
        C50723h hVar2 = (C50723h) aVar.instance;
        hVar2.f132003c = gVar2.f131998e;
        hVar2.f132001a |= 2;
        return (C50723h) aVar.build();
    }

    /* renamed from: e */
    public static String m214096e(C53190es esVar) {
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

    /* renamed from: f */
    public static boolean m214097f(C53190es esVar) {
        if (esVar.f139407l.isEmpty() || (((C53185en) esVar.f139407l.get(0)).f139379a & 4) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static String m214098g(Context context, C53190es esVar, boolean z) {
        Optional b = C131656f.m214100b(m214096e(esVar));
        if (b.isEmpty()) {
            ((C59052c) ((C59052c) f359717m.mo56226d()).mo56372aa(39148)).mo56386p("Return empty actual or estimated departure time string due to invalid time");
            return BuildConfig.FLAVOR;
        }
        long longValue = ((Long) b.get()).longValue();
        C60948g gVar = C60948g.f165068a;
        return C131253v.m213756c(context, longValue, Instant.now().toEpochMilli(), z).toString();
    }
}
