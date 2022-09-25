package com.google.android.apps.gsa.staticplugins.smartspace;

import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.i */
/* compiled from: PG */
public final /* synthetic */ class C117425i implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f325929a;

    public /* synthetic */ C117425i(C58528ij ijVar) {
        this.f325929a = ijVar;
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
        C58528ij ijVar = this.f325929a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar == null || !axVar.mo56113h()) {
            return false;
        }
        C50794cr a = C50794cr.m85938a(((C50818do) axVar.mo56107c()).f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        return !ijVar.contains(Integer.valueOf(a.f132222T));
    }
}
