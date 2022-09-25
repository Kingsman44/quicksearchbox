package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import com.google.common.p4526f.C59071e;
import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.cf */
/* compiled from: PG */
public final /* synthetic */ class C18860cf implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C18860cf f53107a = new C18860cf();

    private /* synthetic */ C18860cf() {
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
        C59071e eVar = C18868cn.f53115a;
        return !((List) obj).isEmpty();
    }
}
