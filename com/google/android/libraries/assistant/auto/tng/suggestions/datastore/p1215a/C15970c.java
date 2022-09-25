package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.c */
/* compiled from: PG */
public final /* synthetic */ class C15970c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C16091aq f47356a;

    public /* synthetic */ C15970c(C16091aq aqVar) {
        this.f47356a = aqVar;
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
        return ((C16091aq) ((Map.Entry) obj).getValue()).mo22733g() == this.f47356a.mo22733g();
    }
}
