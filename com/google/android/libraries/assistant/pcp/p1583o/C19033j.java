package com.google.android.libraries.assistant.pcp.p1583o;

import com.google.common.p4522b.C58495hd;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.o.j */
/* compiled from: PG */
public final /* synthetic */ class C19033j implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f53419a;

    public /* synthetic */ C19033j(C58495hd hdVar) {
        this.f53419a = hdVar;
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
        return this.f53419a.containsKey(((Map.Entry) obj).getKey());
    }
}
