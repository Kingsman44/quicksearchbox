package com.google.android.apps.gsa.shared.p7066m;

import com.google.android.apps.gsa.shared.util.C90726aj;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.shared.m.b */
/* compiled from: PG */
public final class C89988b {

    /* renamed from: a */
    public static final C90726aj f246752a = new C90726aj(";", ",");

    /* renamed from: a */
    public static C58485gu m146548a(String str, C89959a aVar) {
        if (str.isEmpty()) {
            return C58485gu.m89845m();
        }
        C58480gp f = C58485gu.m89838f(r0);
        for (String str2 : str.split(",")) {
            if (!str2.isEmpty()) {
                try {
                    Object a = aVar.mo71139a(Integer.parseInt(str2));
                    if (a != null) {
                        f.mo55395g(a);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return f.mo55394f();
    }

    /* renamed from: b */
    public static C58485gu m146549b(String str) {
        if (str.isEmpty()) {
            return C58485gu.m89845m();
        }
        C58480gp f = C58485gu.m89838f(r0);
        for (String parseInt : str.split(",")) {
            f.mo55395g(Integer.valueOf(Integer.parseInt(parseInt)));
        }
        return f.mo55394f();
    }

    /* renamed from: c */
    public static C58485gu m146550c(String str) {
        if (str.isEmpty()) {
            return C58485gu.m89845m();
        }
        C58480gp f = C58485gu.m89838f(r0);
        for (String parseLong : str.split(",")) {
            f.mo55395g(Long.valueOf(Long.parseLong(parseLong)));
        }
        return f.mo55394f();
    }

    /* renamed from: d */
    public static C58485gu m146551d(String str) {
        if (str.isEmpty()) {
            return C58485gu.m89845m();
        }
        return C58485gu.m89844l(str.split(","));
    }
}
