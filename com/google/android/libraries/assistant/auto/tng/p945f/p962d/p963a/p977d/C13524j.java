package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.j */
/* compiled from: PG */
public final /* synthetic */ class C13524j implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C13524j f41457a = new C13524j();

    private /* synthetic */ C13524j() {
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
        C13529e a = C13529e.m29814a(((C13530f) obj).f41478c);
        if (a == null) {
            a = C13529e.UNRECOGNIZED;
        }
        return C13526l.m29807c(a);
    }
}
