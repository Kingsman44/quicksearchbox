package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.i */
/* compiled from: PG */
public final /* synthetic */ class C110643i implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C110645k f308315a;

    public /* synthetic */ C110643i(C110645k kVar) {
        this.f308315a = kVar;
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
        C92111g gVar = this.f308315a.f308318a;
        C50818do doVar = ((C83741am) obj).f228252c;
        if (doVar == null) {
            doVar = C50818do.f132293H;
        }
        C50794cr a = C50794cr.m85938a(doVar.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        return gVar.mo86744f(a);
    }
}
