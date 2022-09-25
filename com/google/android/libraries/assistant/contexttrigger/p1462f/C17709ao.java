package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.ao */
/* compiled from: PG */
public final class C17709ao {
    /* renamed from: a */
    public static String m34990a(C48919u uVar) {
        C58838bb.m90869d(1 == (uVar.f126588a & 1), "Should have client id");
        C58838bb.m90869d((uVar.f126588a & 4) != 0, "Should have trigger id");
        Object[] objArr = new Object[2];
        C48900b a = C48900b.m85301a(uVar.f126589b);
        if (a == null) {
            a = C48900b.UNSPECIFIED;
        }
        objArr[0] = a.name();
        objArr[1] = uVar.f126591d;
        return String.format("%s:%s", objArr);
    }
}
