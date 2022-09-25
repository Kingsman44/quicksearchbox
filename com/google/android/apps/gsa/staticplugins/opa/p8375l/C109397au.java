package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.assistant.p4008y.p4009a.C53593bz;
import java.util.regex.Pattern;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.au */
/* compiled from: PG */
public final /* synthetic */ class C109397au implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C109397au f304686a = new C109397au();

    private /* synthetic */ C109397au() {
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
        C53593bz bzVar = (C53593bz) obj;
        Pattern pattern = C109398av.f304687a;
        return (bzVar.f140660a & 1) != 0 && !bzVar.f140661b.matches("(.*)(%([^%]+)%)(.*)");
    }
}
