package com.google.android.libraries.assistant.auto.tng.media.p1060e;

import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.e.a */
/* compiled from: PG */
public final /* synthetic */ class C14005a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C14005a f42607a = new C14005a();

    private /* synthetic */ C14005a() {
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
        C61746h hVar = (C61746h) obj;
        if ((hVar.f166793a & 4) == 0) {
            return false;
        }
        C61748j jVar = hVar.f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        return jVar.f166802a == 22;
    }
}
