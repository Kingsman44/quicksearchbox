package com.google.android.gms.search.queries.p10874b;

import com.google.common.base.C58913w;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4537i.C59290o;
import com.google.common.p4537i.C59294s;
import com.google.common.p4541l.C59326i;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.search.queries.b.f */
/* compiled from: PG */
public final class C145934f {

    /* renamed from: a */
    private static final C59290o f394535a = C59294s.m92133c();

    /* renamed from: a */
    public static C145933e m237740a(String str) {
        C58485gu guVar = C145929a.f394530a;
        if (C145929a.f394530a.contains("QT")) {
            ArrayList arrayList = new ArrayList();
            C145929a.m237739b(m237741b(str), arrayList);
            arrayList.add(new C145932d("keywords"));
            return C145929a.m237738a("QT", arrayList);
        }
        throw new IllegalArgumentException("Unexpected operator %sQT");
    }

    /* renamed from: b */
    public static String m237741b(String str) {
        byte[] e = f394535a.mo56759a(str, C58913w.f156754c).mo56775e();
        String l = C59326i.f157516d.mo56837l(e, e.length);
        return "__a_" + l + "__";
    }

    /* renamed from: c */
    public static boolean m237742c(String str) {
        return str.startsWith("__a_") && str.endsWith("__");
    }
}
