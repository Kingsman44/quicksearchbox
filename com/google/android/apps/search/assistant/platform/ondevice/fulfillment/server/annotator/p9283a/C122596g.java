package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.a.g */
/* compiled from: PG */
public final /* synthetic */ class C122596g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C80047aa f339767a;

    public /* synthetic */ C122596g(C80047aa aaVar) {
        this.f339767a = aaVar;
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
        C80047aa aaVar = this.f339767a;
        C80047aa aaVar2 = (C80047aa) obj;
        return aaVar2.f219660d == aaVar.f219660d && aaVar2.f219661e == aaVar.f219661e;
    }
}
