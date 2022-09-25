package com.google.p4591e.p4592a.p4594b.p4596b;

import com.google.common.base.C58838bb;
import com.google.p4591e.p4592a.p4594b.C61021b;
import com.google.p4591e.p4592a.p4597c.p4598a.p4599a.p4600a.p4601a.p4602a.C61035a;
import com.google.p4591e.p4592a.p4603d.C61070x;
import java.io.ByteArrayInputStream;

/* renamed from: com.google.e.a.b.b.b */
/* compiled from: PG */
public final class C61023b {
    /* renamed from: a */
    public static final C61024c m93323a(String str, C61021b bVar, Class cls, Class cls2) {
        int indexOf = str.indexOf(46);
        boolean z = true;
        C58838bb.m90868c(indexOf != -1);
        byte[] a = C61035a.m93373a(str.substring(0, indexOf));
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(46, i);
        C58838bb.m90868c(indexOf2 != -1);
        int i2 = indexOf2 + 1;
        C58838bb.m90868c(str.indexOf(46, i2) == -1);
        byte[] a2 = C61035a.m93373a(str.substring(i, indexOf2));
        byte[] a3 = C61035a.m93373a(str.substring(i2));
        byte[] a4 = C61070x.m93434a(str.substring(0, indexOf2));
        C61022a aVar = (C61022a) bVar.mo57540b(new ByteArrayInputStream(a)).mo57579o(cls);
        if (aVar.algorithm == null) {
            z = false;
        }
        C58838bb.m90868c(z);
        return new C61024c(aVar, (C61026e) bVar.mo57540b(new ByteArrayInputStream(a2)).mo57579o(cls2), a3, a4);
    }
}
