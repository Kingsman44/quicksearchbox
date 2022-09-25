package com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1238b.p1239a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16169m;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.f.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C16211a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C16211a f47778a = new C16211a();

    private /* synthetic */ C16211a() {
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
        return ((C16170n) obj).mo22746a().equals(C16169m.GENERATED_ON_DEVICE);
    }
}
