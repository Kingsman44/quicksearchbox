package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import java.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.az */
/* compiled from: PG */
public final /* synthetic */ class C122178az implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Collection f338866a;

    public /* synthetic */ C122178az(Collection collection) {
        this.f338866a = collection;
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
        return !this.f338866a.contains((String) obj);
    }
}
