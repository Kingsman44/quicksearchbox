package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a;

import com.google.protos.p4850an.p4851a.p4852a.C63318b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.a.z */
/* compiled from: PG */
public final /* synthetic */ class C122615z implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f339786a;

    public /* synthetic */ C122615z(String str) {
        this.f339786a = str;
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
        return ((C63318b) obj).f171129c.equals(this.f339786a);
    }
}
