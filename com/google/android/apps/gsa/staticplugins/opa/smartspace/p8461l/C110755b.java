package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.b */
/* compiled from: PG */
public final /* synthetic */ class C110755b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Map f308579a;

    public /* synthetic */ C110755b(Map map) {
        this.f308579a = map;
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
        Map map = this.f308579a;
        C83741am amVar = (C83741am) obj;
        C50818do doVar = amVar.f228252c;
        if (doVar == null) {
            doVar = C50818do.f132293H;
        }
        if (doVar.f132305b) {
            return true;
        }
        C50818do doVar2 = amVar.f228252c;
        if (doVar2 == null) {
            doVar2 = C50818do.f132293H;
        }
        C50794cr a = C50794cr.m85938a(doVar2.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        if (((Boolean) Map.EL.getOrDefault(map, a, false)).booleanValue()) {
            return true;
        }
        return false;
    }
}
