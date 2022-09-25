package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import com.google.assistant.p3897e.p3917i.p3918a.C51419h;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3921j.C52403ql;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.b */
/* compiled from: PG */
public final /* synthetic */ class C110517b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f308125a;

    /* renamed from: b */
    public final /* synthetic */ int f308126b;

    public /* synthetic */ C110517b(int i, int i2) {
        this.f308125a = i;
        this.f308126b = i2;
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
        int i = this.f308125a;
        int i2 = this.f308126b;
        C51473j jVar = (C51473j) obj;
        C51419h a = C51419h.m86180a(jVar.f134097f);
        if (a == null) {
            a = C51419h.UNKNOWN_ALARM_STATUS;
        }
        if (a != C51419h.SCHEDULED) {
            return false;
        }
        C52403ql qlVar = jVar.f134096e;
        if (qlVar == null) {
            qlVar = C52403ql.f137512f;
        }
        if (qlVar.f137515b != i) {
            return false;
        }
        C52403ql qlVar2 = jVar.f134096e;
        if (qlVar2 == null) {
            qlVar2 = C52403ql.f137512f;
        }
        return qlVar2.f137516c == i2;
    }
}
