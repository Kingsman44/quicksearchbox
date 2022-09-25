package com.google.android.libraries.assistant.contexttrigger.impl;

import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.ah */
/* compiled from: PG */
public final class C17757ah {
    /* renamed from: a */
    public static String m35025a(C48919u uVar) {
        Object[] objArr = new Object[3];
        C48900b a = C48900b.m85301a(uVar.f126589b);
        if (a == null) {
            a = C48900b.UNSPECIFIED;
        }
        objArr[0] = a.name();
        objArr[1] = uVar.f126590c;
        objArr[2] = uVar.f126591d;
        return String.format("%s:%s:%s", objArr);
    }
}
