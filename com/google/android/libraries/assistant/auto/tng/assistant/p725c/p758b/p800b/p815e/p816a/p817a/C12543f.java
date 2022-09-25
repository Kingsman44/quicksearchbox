package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p815e.p816a.p817a;

import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protos.p4850an.p4855d.p4858c.C63533f;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.e.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C12543f implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C12543f f39475a = new C12543f();

    private /* synthetic */ C12543f() {
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
        C63533f fVar;
        C61748j jVar = ((C61746h) obj).f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        if (jVar.f166802a == 22) {
            fVar = (C63533f) jVar.f166803b;
        } else {
            fVar = C63533f.f171842d;
        }
        return (fVar.f171844a & 256) != 0;
    }
}
