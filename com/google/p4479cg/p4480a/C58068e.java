package com.google.p4479cg.p4480a;

import com.google.common.base.C58838bb;
import com.google.p4479cg.C58071c;
import com.google.p4479cg.C58072d;
import com.google.p4479cg.C58073e;
import com.google.p4479cg.C58074f;
import com.google.p4479cg.C58075g;
import com.google.p4479cg.C58077i;
import com.google.p4479cg.C58081m;
import p3186j$.time.DayOfWeek;
import p3186j$.time.LocalDate;
import p3186j$.time.LocalDateTime;
import p3186j$.time.LocalTime;

/* renamed from: com.google.cg.a.e */
/* compiled from: PG */
public final class C58068e {
    /* renamed from: a */
    public static C58072d m88823a(LocalDate localDate) {
        C58838bb.m90871f(localDate.getYear() > 0, "Year (%s) must be greater than 0.", localDate.getYear());
        C58071c cVar = (C58071c) C58072d.f155218d.createBuilder();
        int year = localDate.getYear();
        cVar.copyOnWrite();
        ((C58072d) cVar.instance).f155220a = year;
        int monthValue = localDate.getMonthValue();
        cVar.copyOnWrite();
        ((C58072d) cVar.instance).f155221b = monthValue;
        int dayOfMonth = localDate.getDayOfMonth();
        cVar.copyOnWrite();
        ((C58072d) cVar.instance).f155222c = dayOfMonth;
        C58072d dVar = (C58072d) cVar.build();
        C58066c.m88821c(dVar);
        return dVar;
    }

    /* renamed from: b */
    public static C58075g m88824b(LocalDateTime localDateTime) {
        C58073e eVar = (C58073e) C58075g.f155227j.createBuilder();
        int year = localDateTime.getYear();
        eVar.copyOnWrite();
        ((C58075g) eVar.instance).f155231c = year;
        int monthValue = localDateTime.getMonthValue();
        eVar.copyOnWrite();
        ((C58075g) eVar.instance).f155232d = monthValue;
        int dayOfMonth = localDateTime.getDayOfMonth();
        eVar.copyOnWrite();
        ((C58075g) eVar.instance).f155233e = dayOfMonth;
        int hour = localDateTime.getHour();
        eVar.copyOnWrite();
        ((C58075g) eVar.instance).f155234f = hour;
        int minute = localDateTime.getMinute();
        eVar.copyOnWrite();
        ((C58075g) eVar.instance).f155235g = minute;
        int second = localDateTime.getSecond();
        eVar.copyOnWrite();
        ((C58075g) eVar.instance).f155236h = second;
        int nano = localDateTime.getNano();
        eVar.copyOnWrite();
        ((C58075g) eVar.instance).f155237i = nano;
        C58075g gVar = (C58075g) eVar.build();
        C58064a.m88817a(gVar);
        return gVar;
    }

    /* renamed from: c */
    public static DayOfWeek m88825c(C58077i iVar) {
        C58838bb.m90869d(C58067d.f155211a.contains(iVar), "Proto does not represent valid day of week.");
        return DayOfWeek.m71130of(iVar.getNumber());
    }

    /* renamed from: d */
    public static LocalDate m88826d(C58072d dVar) {
        C58066c.m88821c(dVar);
        boolean z = true;
        C58838bb.m90869d(dVar.f155220a > 0, "Year must be specified.");
        if (dVar.f155222c <= 0) {
            z = false;
        }
        C58838bb.m90869d(z, "Day must be specified.");
        return LocalDate.m71157of(dVar.f155220a, dVar.f155221b, dVar.f155222c);
    }

    /* renamed from: e */
    public static LocalDateTime m88827e(C58075g gVar) {
        C58838bb.m90869d(C58074f.m88831a(gVar.f155229a).equals(C58074f.TIMEOFFSET_NOT_SET), "Time zone and offset must not be set in a LocalDateTime.");
        C58064a.m88817a(gVar);
        return LocalDateTime.m71185of(gVar.f155231c, gVar.f155232d, gVar.f155233e, gVar.f155234f, gVar.f155235g, gVar.f155236h, gVar.f155237i);
    }

    /* renamed from: f */
    public static LocalTime m88828f(C58081m mVar) {
        C58069f.m88830b(mVar);
        return LocalTime.m71213of(mVar.f155256a, mVar.f155257b, mVar.f155258c, mVar.f155259d);
    }
}
