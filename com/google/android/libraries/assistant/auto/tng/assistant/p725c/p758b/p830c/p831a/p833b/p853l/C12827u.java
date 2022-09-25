package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p853l;

import com.google.assistant.p3897e.p3902c.p3907c.C50964bi;
import com.google.assistant.p3897e.p3902c.p3907c.C50965bj;
import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.u */
/* compiled from: PG */
public final /* synthetic */ class C12827u implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C12827u f40037a = new C12827u();

    private /* synthetic */ C12827u() {
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
        C50969bn bnVar;
        C51941eu euVar = (C51941eu) obj;
        C59071e eVar = C12830x.f40040a;
        if (euVar.f136277e == 16) {
            bnVar = (C50969bn) euVar.f136278f;
        } else {
            bnVar = C50969bn.f132678i;
        }
        C50965bj bjVar = bnVar.f132682c;
        if (bjVar == null) {
            bjVar = C50965bj.f132670e;
        }
        int a = C50964bi.m85996a(bjVar.f132675d);
        if (a == 0) {
            a = 1;
        }
        if (euVar.f136277e == 16 && (((C50969bn) euVar.f136278f).f132680a & 4) == 0 && a == 2) {
            return true;
        }
        return false;
    }
}
