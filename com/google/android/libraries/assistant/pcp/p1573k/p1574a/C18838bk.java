package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.bk */
/* compiled from: PG */
public final /* synthetic */ class C18838bk implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f53060a;

    public /* synthetic */ C18838bk(List list) {
        this.f53060a = list;
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
        return !this.f53060a.contains(((ComponentName) obj).getPackageName());
    }
}
