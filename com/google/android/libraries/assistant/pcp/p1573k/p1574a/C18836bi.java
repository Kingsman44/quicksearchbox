package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.bi */
/* compiled from: PG */
public final /* synthetic */ class C18836bi implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f53058a;

    public /* synthetic */ C18836bi(String str) {
        this.f53058a = str;
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
        return ((ComponentName) obj).getPackageName().equals(this.f53058a);
    }
}
