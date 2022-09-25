package com.google.android.apps.search.assistant.verticals.ambient.feedback;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.ac */
/* compiled from: PG */
final class C130610ac {
    /* renamed from: a */
    public static C130655n m212981a(C58485gu guVar) {
        return new C130607a(Collection.EL.stream(guVar).mapToDouble(C130658q.f357813a).min().orElse(Double.MAX_VALUE), (C58485gu) Collection.EL.stream(guVar).map(C130661t.f357816a).collect(C58370cn.f155946a));
    }
}
