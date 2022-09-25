package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ck */
/* compiled from: PG */
public final /* synthetic */ class C14850ck implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C14850ck f44707a = new C14850ck();

    private /* synthetic */ C14850ck() {
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
        C14216b bVar = (C14216b) obj;
        return !C14856cq.f44716b.contains(bVar.f43011c) && !bVar.f43011c.equals("com.google.android.apps.youtube.music") && !bVar.f43011c.equals("com.google.android.googlequicksearchbox");
    }
}
