package com.google.android.apps.gsa.staticplugins.fedass.p7949h;

import com.google.assistant.p3861at.C49878ci;
import com.google.assistant.p3861at.C49879cj;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.h.h */
/* compiled from: PG */
public final /* synthetic */ class C100869h implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C100869h f281852a = new C100869h();

    private /* synthetic */ C100869h() {
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
        C59071e eVar = C100872k.f281855a;
        C49878ci a = C49878ci.m85757a(((C49879cj) obj).f129632c);
        if (a == null) {
            a = C49878ci.USER_TYPE_UNKNOWN;
        }
        return !a.equals(C49878ci.NOT_FIRST_USER);
    }
}
