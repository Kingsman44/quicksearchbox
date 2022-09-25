package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.appannotator;

import com.google.android.libraries.mdi.C28595b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.appannotator.m */
/* compiled from: PG */
public final /* synthetic */ class C122683m implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C122683m f339944a = new C122683m();

    private /* synthetic */ C122683m() {
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
        return ((C28595b) obj).f77798b.equals("genie_teleport_resources.binarypb");
    }
}
