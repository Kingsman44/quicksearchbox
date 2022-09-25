package com.google.android.apps.gsa.staticplugins.fedass.p7949h;

import com.google.assistant.p3861at.C49879cj;
import com.google.common.p4526f.C59071e;
import java.util.HashSet;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.h.a */
/* compiled from: PG */
public final /* synthetic */ class C100852a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ HashSet f281818a;

    public /* synthetic */ C100852a(HashSet hashSet) {
        this.f281818a = hashSet;
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
        return !this.f281818a.contains((C49879cj) obj);
    }
}
