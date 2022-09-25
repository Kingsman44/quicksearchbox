package com.google.android.apps.gsa.sidekick.main.p7223o;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58662ni;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.sidekick.main.o.c */
/* compiled from: PG */
public final class C91555c {

    /* renamed from: a */
    public static final C58817ah f255354a = C91553a.f255352a;

    /* renamed from: b */
    public static final C58817ah f255355b = C91554b.f255353a;

    /* renamed from: a */
    public static Map m149785a(List list, C58817ah ahVar) {
        HashMap j = C58662ni.m90351j(list.size());
        for (Object next : list) {
            j.put((String) ahVar.apply(next), next);
        }
        return j;
    }
}
