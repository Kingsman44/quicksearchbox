package com.google.android.gms.search.queries.p10874b;

import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.gms.search.queries.b.a */
/* compiled from: PG */
public final class C145929a {

    /* renamed from: a */
    public static final C58485gu f394530a = C58485gu.m89833C("DATE", "IN_D", "LOC", "OVERLAP_L", "QT", "QR", "Q_PREFIX", "IS", "AND", "OR", "NOT");

    /* renamed from: a */
    public static final C145933e m237738a(String str, List list) {
        if (!list.isEmpty()) {
            return new C145933e(str, list);
        }
        throw new IllegalStateException("The ST query should have at least one child");
    }

    /* renamed from: b */
    public static final void m237739b(String str, List list) {
        list.add(new C145932d("\"" + str + "\""));
    }
}
