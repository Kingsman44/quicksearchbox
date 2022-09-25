package com.google.android.libraries.search.assistant.p2566g.p2567a.p2568a;

import com.google.android.libraries.search.assistant.p2566g.C33428w;
import com.google.common.p4522b.C58528ij;
import java.util.Collections;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.g.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C33398e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f89457a;

    public /* synthetic */ C33398e(C58528ij ijVar) {
        this.f89457a = ijVar;
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
        return !Collections.disjoint(this.f89457a, C58528ij.m90008H(((C33428w) ((Map.Entry) obj).getKey()).mo38832a()));
    }
}
