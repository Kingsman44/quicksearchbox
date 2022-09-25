package com.google.p4449cd.p4452c;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayList;

/* renamed from: com.google.cd.c.b */
/* compiled from: PG */
public final class C57942b {

    /* renamed from: a */
    private final Object f154965a;

    /* renamed from: b */
    private final C57942b f154966b;

    /* renamed from: c */
    private final int f154967c;

    private C57942b(Object obj, C57942b bVar, int i) {
        this.f154965a = obj;
        this.f154966b = bVar;
        this.f154967c = i;
    }

    /* renamed from: a */
    public static C58485gu m88595a(C57942b bVar) {
        if (bVar == null) {
            return C58485gu.m89845m();
        }
        ArrayList e = C58597ky.m90214e(bVar.f154967c);
        do {
            e.add(bVar.f154965a);
            bVar = bVar.f154966b;
        } while (bVar != null);
        return C58485gu.m89842j(e);
    }

    /* renamed from: b */
    public static C57942b m88596b(Object obj, C57942b bVar) {
        int i = 1;
        if (bVar != null) {
            i = 1 + bVar.f154967c;
        }
        return new C57942b(obj, bVar, i);
    }
}
