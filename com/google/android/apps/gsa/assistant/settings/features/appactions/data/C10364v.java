package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.v */
/* compiled from: PG */
public final /* synthetic */ class C10364v implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f35050a;

    public /* synthetic */ C10364v(String str) {
        this.f35050a = str;
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
        return this.f35050a.equals(((C51058ev) obj).f132944b);
    }
}
