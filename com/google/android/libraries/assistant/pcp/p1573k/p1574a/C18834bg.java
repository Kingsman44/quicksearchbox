package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.bg */
/* compiled from: PG */
public final /* synthetic */ class C18834bg implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f53056a;

    public /* synthetic */ C18834bg(List list) {
        this.f53056a = list;
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
        return this.f53056a.contains(((ComponentName) obj).getPackageName());
    }
}
