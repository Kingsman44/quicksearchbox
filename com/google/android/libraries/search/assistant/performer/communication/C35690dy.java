package com.google.android.libraries.search.assistant.performer.communication;

import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.dy */
/* compiled from: PG */
public final /* synthetic */ class C35690dy implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C35690dy f93580a = new C35690dy();

    private /* synthetic */ C35690dy() {
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
        int i = ((C51058ev) obj).f132943a;
        return ((i & 1) == 0 || (i & 256) == 0 || (i & 1024) == 0) ? false : true;
    }
}
