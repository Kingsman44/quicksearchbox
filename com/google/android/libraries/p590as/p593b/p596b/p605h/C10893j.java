package com.google.android.libraries.p590as.p593b.p596b.p605h;

import com.google.common.p4526f.p4527a.C58974d;
import java.io.File;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.h.j */
/* compiled from: PG */
public final /* synthetic */ class C10893j implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C10893j f35979a = new C10893j();

    private /* synthetic */ C10893j() {
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
        C58974d dVar = C10895l.f35981a;
        int indexOf = ((File) obj).getName().indexOf(45);
        return indexOf == 2 || indexOf == 3;
    }
}
