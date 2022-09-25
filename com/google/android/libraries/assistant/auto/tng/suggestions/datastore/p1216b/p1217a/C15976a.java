package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1216b.p1217a;

import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C15976a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f47382a;

    public /* synthetic */ C15976a(String str) {
        this.f47382a = str;
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
        String str = this.f47382a;
        int i = C15978c.f47385c;
        return str.endsWith((String) ((Map.Entry) obj).getKey());
    }
}
