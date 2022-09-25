package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a;

import com.google.protos.p4850an.p4851a.p4852a.C63318b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C122581aa implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f339751a;

    /* renamed from: b */
    public final /* synthetic */ String f339752b;

    public /* synthetic */ C122581aa(String str, String str2) {
        this.f339751a = str;
        this.f339752b = str2;
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
        C63318b bVar = (C63318b) obj;
        return !bVar.f171129c.equals(this.f339751a) && !bVar.f171129c.equals(this.f339752b);
    }
}
