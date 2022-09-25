package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80394g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.o */
/* compiled from: PG */
public final /* synthetic */ class C79831o implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79831o f218902a = new C79831o();

    private /* synthetic */ C79831o() {
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
        C80295aq aqVar;
        C80394g gVar = (C80394g) obj;
        if (gVar.f220647a == 2) {
            aqVar = (C80295aq) gVar.f220648b;
        } else {
            aqVar = C80295aq.f220357c;
        }
        return aqVar.f220359a == 9;
    }
}
