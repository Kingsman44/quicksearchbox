package com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.p1234c;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16169m;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.f.a.c.a */
/* compiled from: PG */
public final /* synthetic */ class C16200a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C16200a f47764a = new C16200a();

    private /* synthetic */ C16200a() {
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
        return ((C16170n) obj).mo22746a().equals(C16169m.PRELOADED_ON_DEVICE);
    }
}
