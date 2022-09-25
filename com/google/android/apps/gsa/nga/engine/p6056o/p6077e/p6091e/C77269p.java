package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.common.base.C58815af;
import p3186j$.time.LocalTime;
import p3186j$.time.ZonedDateTime;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.p */
/* compiled from: PG */
public final /* synthetic */ class C77269p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58815af f213121a;

    /* renamed from: b */
    public final /* synthetic */ ZonedDateTime f213122b;

    public /* synthetic */ C77269p(C58815af afVar, ZonedDateTime zonedDateTime) {
        this.f213121a = afVar;
        this.f213122b = zonedDateTime;
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
        C58815af afVar = this.f213121a;
        ZonedDateTime zonedDateTime = this.f213122b;
        C51473j jVar = (C51473j) obj;
        int i = C77276w.f213129a;
        C52403ql qlVar = jVar.f134096e;
        if (qlVar == null) {
            qlVar = C52403ql.f137512f;
        }
        int i2 = qlVar.f137515b;
        C52403ql qlVar2 = jVar.f134096e;
        if (qlVar2 == null) {
            qlVar2 = C52403ql.f137512f;
        }
        return afVar.mo56077d(LocalTime.m71211of(i2, qlVar2.f137516c), zonedDateTime.toLocalTime());
    }
}
