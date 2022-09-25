package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8455f;

import com.google.assistant.p3897e.p3917i.p3918a.C51419h;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.LocalDate;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.f.k */
/* compiled from: PG */
public final /* synthetic */ class C110677k implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ LocalDate f308398a;

    public /* synthetic */ C110677k(LocalDate localDate) {
        this.f308398a = localDate;
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
        LocalDate localDate = this.f308398a;
        C51473j jVar = (C51473j) obj;
        C59071e eVar = C110679m.f308400a;
        C51419h a = C51419h.m86180a(jVar.f134097f);
        if (a == null) {
            a = C51419h.UNKNOWN_ALARM_STATUS;
        }
        if (a != C51419h.SCHEDULED) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
        C52403ql qlVar = jVar.f134096e;
        if (qlVar == null) {
            qlVar = C52403ql.f137512f;
        }
        if (!C110679m.m184367e(qlVar)) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        } else if (jVar.f134093b == 4) {
            return ((C58485gu) Collection.EL.stream(((C52397qf) jVar.f134094c).f137496d).filter(C110675i.f308396a).map(C110676j.f308397a).collect(C58370cn.f155946a)).contains(localDate.getDayOfWeek());
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            return false;
        }
    }
}
