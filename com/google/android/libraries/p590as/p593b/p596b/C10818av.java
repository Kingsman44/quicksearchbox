package com.google.android.libraries.p590as.p593b.p596b;

import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.av */
/* compiled from: PG */
public final /* synthetic */ class C10818av implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C10818av f35860a = new C10818av();

    private /* synthetic */ C10818av() {
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
        C58974d dVar = C10846ba.f35901a;
        return ((C58833ax) ((Map.Entry) obj).getValue()).mo56113h();
    }
}
