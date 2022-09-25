package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.w */
/* compiled from: PG */
public final /* synthetic */ class C110787w implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C110764bi f308690a;

    public /* synthetic */ C110787w(C110764bi biVar) {
        this.f308690a = biVar;
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
        C110764bi biVar = this.f308690a;
        C83741am amVar = (C83741am) obj;
        C50818do doVar = amVar.f228252c;
        if (doVar == null) {
            doVar = C50818do.f132293H;
        }
        if (!doVar.f132322s) {
            return true;
        }
        C92111g gVar = biVar.f308613d;
        C50818do doVar2 = amVar.f228252c;
        if (doVar2 == null) {
            doVar2 = C50818do.f132293H;
        }
        C50794cr a = C50794cr.m85938a(doVar2.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        if (!gVar.mo86744f(a) || !biVar.f308617h.f256848d.mo86766v()) {
            return false;
        }
        return true;
    }
}
