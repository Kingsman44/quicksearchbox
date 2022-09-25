package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9469b;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126032h;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.c.b.f */
/* compiled from: PG */
public final /* synthetic */ class C126006f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f347274a;

    public /* synthetic */ C126006f(Set set) {
        this.f347274a = set;
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
        return this.f347274a.add(((C126032h) obj).mo107224a().f344979a);
    }
}
