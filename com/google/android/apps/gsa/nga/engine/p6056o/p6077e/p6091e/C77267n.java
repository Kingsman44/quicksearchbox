package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52403ql;
import p3186j$.time.LocalDate;
import p3186j$.time.LocalTime;
import p3186j$.time.ZonedDateTime;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.n */
/* compiled from: PG */
public final /* synthetic */ class C77267n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f213117a;

    /* renamed from: b */
    public final /* synthetic */ ZonedDateTime f213118b;

    /* renamed from: c */
    public final /* synthetic */ LocalDate f213119c;

    public /* synthetic */ C77267n(int i, ZonedDateTime zonedDateTime, LocalDate localDate) {
        this.f213117a = i;
        this.f213118b = zonedDateTime;
        this.f213119c = localDate;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        int i = this.f213117a;
        ZonedDateTime zonedDateTime = this.f213118b;
        LocalDate localDate = this.f213119c;
        C51473j jVar = (C51473j) obj;
        if (jVar.f134093b == 4) {
            return ((C52397qf) jVar.f134094c).f137496d.contains(Integer.valueOf(i));
        }
        C52403ql qlVar = jVar.f134096e;
        if (qlVar == null) {
            qlVar = C52403ql.f137512f;
        }
        ZonedDateTime with = zonedDateTime.mo43046d(LocalTime.m71211of(qlVar.f137515b, qlVar.f137516c));
        if (with.isBefore(zonedDateTime)) {
            with = with.plusDays(1);
        }
        return with.toLocalDate().equals(localDate);
    }
}
