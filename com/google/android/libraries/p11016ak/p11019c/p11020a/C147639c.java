package com.google.android.libraries.p11016ak.p11019c.p11020a;

import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.ak.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C147639c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C147644h f398480a;

    public /* synthetic */ C147639c(C147644h hVar) {
        this.f398480a = hVar;
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
        return this.f398480a.mo124392c(((Integer) ((Map.Entry) obj).getKey()).intValue()) == 1;
    }
}
