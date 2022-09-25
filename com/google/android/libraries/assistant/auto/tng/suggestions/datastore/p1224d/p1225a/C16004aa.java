package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C16004aa implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ HashSet f47415a;

    public /* synthetic */ C16004aa(HashSet hashSet) {
        this.f47415a = hashSet;
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
        boolean z = !this.f47415a.contains(((C16170n) obj).mo22752f());
        if (z) {
            C58976aa aaVar = C58975e.f156826a;
        }
        return z;
    }
}
