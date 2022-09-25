package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.au */
/* compiled from: PG */
public final /* synthetic */ class C16024au implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C16090ap f47446a;

    public /* synthetic */ C16024au(C16090ap apVar) {
        this.f47446a = apVar;
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
        return ((C16091aq) obj).mo22733g() == this.f47446a;
    }
}
