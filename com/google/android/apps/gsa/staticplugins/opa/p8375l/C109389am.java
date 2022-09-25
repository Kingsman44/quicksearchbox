package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.assistant.p4008y.p4009a.C53552al;
import com.google.assistant.p4008y.p4009a.C53556ap;
import java.util.regex.Pattern;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.am */
/* compiled from: PG */
public final /* synthetic */ class C109389am implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C109389am f304675a = new C109389am();

    private /* synthetic */ C109389am() {
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
        Pattern pattern = C109398av.f304687a;
        C53556ap b = C53556ap.m86865b(((C53552al) obj).f140544d);
        if (b == null) {
            b = C53556ap.NONE;
        }
        return b.equals(C53556ap.PERSONAL_CONTEXT);
    }
}
