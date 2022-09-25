package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8455f;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.broadcastreceiver.C74445c;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.search.assistant.verticals.ambient.p9928j.C130812a;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3994s.p3995a.C53174ec;
import com.google.assistant.p3994s.p3995a.C53175ed;
import com.google.assistant.p3994s.p3995a.C53193ev;
import com.google.assistant.p3994s.p3995a.C53194ew;
import com.google.assistant.p3994s.p3995a.C53370lj;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60887da;
import p3186j$.time.DateTimeException;
import p3186j$.time.DayOfWeek;
import p3186j$.time.Instant;
import p3186j$.time.LocalDate;
import p3186j$.time.LocalTime;
import p3186j$.time.ZoneId;
import p3186j$.time.format.DateTimeParseException;
import p3186j$.time.temporal.TemporalAdjusters;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.f.m */
/* compiled from: PG */
public final class C110679m {

    /* renamed from: a */
    public static final C59071e f308400a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.smartspace.f.m");

    /* renamed from: b */
    public static final C58495hd f308401b;

    /* renamed from: l */
    private static final C58495hd f308402l;

    /* renamed from: c */
    public final C130812a f308403c;

    /* renamed from: d */
    public final AlarmManager f308404d;

    /* renamed from: e */
    public final C86124t f308405e;

    /* renamed from: f */
    public final C110681o f308406f;

    /* renamed from: g */
    public final C83793i f308407g;

    /* renamed from: h */
    public final C108013bm f308408h;

    /* renamed from: i */
    public final C60950i f308409i;

    /* renamed from: j */
    public final C60887da f308410j;

    /* renamed from: k */
    public final ZoneId f308411k;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(0, DayOfWeek.SUNDAY);
        gzVar.mo55429h(1, DayOfWeek.MONDAY);
        gzVar.mo55429h(2, DayOfWeek.TUESDAY);
        gzVar.mo55429h(3, DayOfWeek.WEDNESDAY);
        gzVar.mo55429h(4, DayOfWeek.THURSDAY);
        gzVar.mo55429h(5, DayOfWeek.FRIDAY);
        gzVar.mo55429h(6, DayOfWeek.SATURDAY);
        f308401b = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("en", "Testing Day");
        gzVar2.mo55429h("ja", "テストの日");
        gzVar2.mo55429h("de", "Testtag");
        gzVar2.mo55429h("hi", "परीक्षण दिवस");
        gzVar2.mo55429h("fr", "Journée de test");
        gzVar2.mo55429h("es", "día de prueba");
        gzVar2.mo55429h("it", "Giornata di prova");
        gzVar2.mo55429h("zh", "测试日");
        f308402l = gzVar2.mo55427f(false);
    }

    public C110679m(C130812a aVar, AlarmManager alarmManager, C86124t tVar, C110681o oVar, C83793i iVar, C108013bm bmVar, C60950i iVar2, C60887da daVar, ZoneId zoneId) {
        this.f308403c = aVar;
        this.f308404d = alarmManager;
        this.f308405e = tVar;
        this.f308406f = oVar;
        this.f308407g = iVar;
        this.f308408h = bmVar;
        this.f308409i = iVar2;
        this.f308410j = daVar;
        this.f308411k = zoneId;
    }

    /* renamed from: e */
    public static boolean m184367e(C52403ql qlVar) {
        try {
            LocalTime of = LocalTime.m71211of(qlVar.f137515b, qlVar.f137516c);
            if (of.isBefore(LocalTime.m71211of(3, 0)) || of.isAfter(LocalTime.m71211of(10, 0))) {
                return false;
            }
            return true;
        } catch (DateTimeException e) {
            C59104x c = f308400a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EvtSuggsManager");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(26641)).mo56386p("Malformed alarm time pattern.");
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m184368f(C53175ed edVar) {
        try {
            LocalDate.parse(edVar.f139361c);
            LocalDate.parse(edVar.f139362d);
            return C110684r.m184383b(edVar);
        } catch (DateTimeParseException e) {
            C59104x c = f308400a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EvtSuggsManager");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(26642)).mo56354G("Error parsing eventOccurrence. start_time: %s, end_time: %s", edVar.f139361c, edVar.f139362d);
            return false;
        }
    }

    /* renamed from: g */
    private final void m184369g(C58833ax axVar, Instant instant) {
        if (!axVar.mo56113h()) {
            C59104x c = f308400a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EvtSuggsManager");
            ((C59052c) ((C59052c) c).mo56372aa(26637)).mo56386p("pendingIntent is null!");
        } else if (instant.isBefore(this.f308409i.mo57444a())) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C59104x b = f308400a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "EvtSuggsManager");
            ((C59052c) ((C59052c) b).mo56372aa(26634)).mo56389s("alarmManager#set triggerAtInstant: %s", instant);
            try {
                this.f308404d.set(0, instant.toEpochMilli(), (PendingIntent) axVar.mo56107c());
            } catch (RuntimeException e) {
                C59104x c2 = f308400a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "EvtSuggsManager");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(26635)).mo56386p("Unable to set the alarm window.");
            }
        }
    }

    /* renamed from: a */
    public final C58833ax mo98846a(C53422nh nhVar, LocalDate localDate) {
        C58976aa aaVar = C58975e.f156826a;
        C58485gu b = mo98847b(nhVar);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C53175ed edVar = (C53175ed) b.get(i);
            LocalDate parse = LocalDate.parse(edVar.f139361c);
            LocalDate parse2 = LocalDate.parse(edVar.f139362d);
            if (!localDate.isBefore(parse) && !localDate.isAfter(parse2)) {
                return C58833ax.m90834k(edVar);
            }
        }
        if (!mo98849d()) {
            return C58836b.f156633a;
        }
        C59104x b2 = f308400a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "EvtSuggsManager");
        ((C59052c) ((C59052c) b2).mo56372aa(26626)).mo56389s("#buildHolidayForDebugging tomorrow: %s", localDate);
        C53174ec ecVar = (C53174ec) C53175ed.f139357f.createBuilder();
        String localDate2 = localDate.toString();
        ecVar.copyOnWrite();
        C53175ed edVar2 = (C53175ed) ecVar.instance;
        localDate2.getClass();
        edVar2.f139359a |= 2;
        edVar2.f139361c = localDate2;
        String localDate3 = localDate.toString();
        ecVar.copyOnWrite();
        C53175ed edVar3 = (C53175ed) ecVar.instance;
        localDate3.getClass();
        edVar3.f139359a |= 4;
        edVar3.f139362d = localDate3;
        ecVar.copyOnWrite();
        C53175ed edVar4 = (C53175ed) ecVar.instance;
        edVar4.f139359a |= 1;
        edVar4.f139360b = "/m/debug";
        C58800sl lA = f308402l.keySet().iterator();
        while (lA.hasNext()) {
            String str = (String) lA.next();
            str.getClass();
            C53193ev evVar = (C53193ev) C53194ew.f139416d.createBuilder();
            evVar.copyOnWrite();
            C53194ew ewVar = (C53194ew) evVar.instance;
            ewVar.f139418a |= 2;
            ewVar.f139420c = str;
            String str2 = (String) f308402l.get(str);
            str2.getClass();
            evVar.copyOnWrite();
            C53194ew ewVar2 = (C53194ew) evVar.instance;
            ewVar2.f139418a |= 1;
            ewVar2.f139419b = str2;
            ecVar.mo53964a(evVar);
        }
        return C58833ax.m90834k((C53175ed) ecVar.build());
    }

    /* renamed from: b */
    public final C58485gu mo98847b(C53422nh nhVar) {
        C53370lj ljVar = nhVar.f140188e;
        if (ljVar == null) {
            ljVar = C53370lj.f140047c;
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(ljVar.f140050b).peek(C110670d.f308391a).filter(C110671e.f308392a).flatMap(C110672f.f308393a).peek(C110673g.f308394a).filter(C110674h.f308395a).collect(C58370cn.f155946a);
        if (!this.f308405e.mo79746e(C90017bw.f247925an)) {
            return guVar;
        }
        C58480gp gpVar = new C58480gp(4);
        gpVar.mo55396h(guVar);
        LocalDate b = this.f308409i.mo57445b(this.f308411k);
        for (LocalDate localDate = b; localDate.isBefore(b.plusWeeks(6)); localDate = localDate.mo43046d(TemporalAdjusters.next(DayOfWeek.FRIDAY))) {
            if (!Collection.EL.stream(guVar).anyMatch(new C110678l(localDate))) {
                C53174ec ecVar = (C53174ec) C53175ed.f139357f.createBuilder();
                String localDate2 = localDate.toString();
                ecVar.copyOnWrite();
                C53175ed edVar = (C53175ed) ecVar.instance;
                localDate2.getClass();
                edVar.f139359a |= 2;
                edVar.f139361c = localDate2;
                String localDate3 = localDate.toString();
                ecVar.copyOnWrite();
                C53175ed edVar2 = (C53175ed) ecVar.instance;
                localDate3.getClass();
                edVar2.f139359a |= 4;
                edVar2.f139362d = localDate3;
                ecVar.copyOnWrite();
                C53175ed edVar3 = (C53175ed) ecVar.instance;
                edVar3.f139359a |= 1;
                edVar3.f139360b = "/m/debug";
                C53193ev evVar = (C53193ev) C53194ew.f139416d.createBuilder();
                evVar.copyOnWrite();
                C53194ew ewVar = (C53194ew) evVar.instance;
                ewVar.f139418a |= 2;
                ewVar.f139420c = "en";
                evVar.copyOnWrite();
                C53194ew ewVar2 = (C53194ew) evVar.instance;
                ewVar2.f139418a |= 1;
                ewVar2.f139419b = "go/ss-holiday-test";
                ecVar.mo53964a(evVar);
                gpVar.mo55395g((C53175ed) ecVar.build());
            } else {
                C59104x b2 = f308400a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "EvtSuggsManager");
                ((C59052c) ((C59052c) b2).mo56372aa(26628)).mo56389s("%s is already a holiday, skip.", localDate);
            }
        }
        return gpVar.mo55394f();
    }

    /* renamed from: c */
    public final void mo98848c(C58485gu guVar) {
        int i;
        int size = guVar.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            C53175ed edVar = (C53175ed) guVar.get(i3);
            LocalDate parse = LocalDate.parse(edVar.f139361c);
            LocalDate parse2 = LocalDate.parse(edVar.f139362d);
            LocalDate minusDays = parse.minusDays(1);
            while (true) {
                i = i3 + 1;
                if (minusDays.isAfter(parse2.minusDays(1))) {
                    break;
                }
                Instant instant = minusDays.atTime(21, i2).atZone(this.f308411k).toInstant();
                Instant instant2 = minusDays.atTime(15, i2).atZone(this.f308411k).toInstant();
                int hashCode = instant.hashCode();
                int hashCode2 = instant2.hashCode();
                C83793i iVar = this.f308407g;
                C58976aa aaVar = C58975e.f156826a;
                Intent intent = new Intent();
                intent.setPackage("com.google.android.googlequicksearchbox");
                intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_NOTIFICATION_UPDATE");
                Context context = iVar.f228383c;
                ClipData clipData = C147798a.f398772a;
                m184369g(C58833ax.m90833j(C74445c.m120395b(context, hashCode, intent)), instant);
                C83793i iVar2 = this.f308407g;
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.android.googlequicksearchbox");
                intent2.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_CARD_UPDATE");
                m184369g(C58833ax.m90833j(C74445c.m120395b(iVar2.f228383c, hashCode2, intent2)), instant2);
                minusDays = minusDays.plusDays(1);
                i2 = 0;
            }
            i3 = i;
        }
    }

    /* renamed from: d */
    public final boolean mo98849d() {
        return this.f308405e.mo79746e(C90017bw.f247924am);
    }
}
