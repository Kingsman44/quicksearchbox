package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.common.p4526f.p4527a.C58970a;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.bb */
/* compiled from: PG */
public final /* synthetic */ class C106894bb implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C106918bz f297794a;

    public /* synthetic */ C106894bb(C106918bz bzVar) {
        this.f297794a = bzVar;
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
        C106918bz bzVar = this.f297794a;
        Map.Entry entry = (Map.Entry) obj;
        if (((Long) entry.getValue()).longValue() >= 3) {
            return true;
        }
        ((C58970a) ((C58970a) bzVar.f297829d.mo56224b()).mo56372aa(23393)).mo56359L("#removeInvalidApps: %s has too few entries: %d < %d", entry.getKey(), entry.getValue(), 3);
        return false;
    }
}
