package com.google.android.libraries.search.p3024j;

import com.google.android.libraries.p1623at.p1631d.C19552a;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4574q.C60735n;

/* renamed from: com.google.android.libraries.search.j.a */
/* compiled from: PG */
public final class C38522a {

    /* renamed from: a */
    private static final C59071e f101894a = C59071e.m91332i("com.google.android.libraries.search.j.a");

    /* renamed from: a */
    public static C60735n m67774a(String str, String str2, int i) {
        boolean z = true;
        C58838bb.m90869d(!str.isEmpty(), "property name must be defined");
        C58838bb.m90869d(str2 != null && !str2.isEmpty(), "default hostname must be defined");
        if (i <= 0) {
            z = false;
        }
        C58838bb.m90869d(z, "defaultPort must be bigger than 0");
        C60735n b = C60735n.m92689b(new C19552a(str, str2 + ":" + i).mo24804a());
        if (!b.f164743a.startsWith(str2)) {
            ((C59052c) ((C59052c) f101894a.mo56224b()).mo56372aa(53108)).mo56359L("gRPC hostname was overwritten. %s:%d -> %s", str2, Integer.valueOf(i), b);
        }
        return b;
    }

    /* renamed from: b */
    public static C60735n m67775b(String str) {
        return m67774a("s3.grpc.url", str, 443);
    }
}
