package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131690b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.ag */
/* compiled from: PG */
public final /* synthetic */ class C131767ag implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f359944a;

    public /* synthetic */ C131767ag(String str) {
        this.f359944a = str;
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
        return ((C131690b) obj).mo110267d(this.f359944a);
    }
}
