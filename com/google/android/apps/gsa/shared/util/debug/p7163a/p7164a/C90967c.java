package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.android.libraries.search.p2904c.C37570ek;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C90967c implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C90967c f254184a = new C90967c();

    private /* synthetic */ C90967c() {
    }

    public final int compare(Object obj, Object obj2) {
        C37570ek ekVar = (C37570ek) obj;
        C37570ek ekVar2 = (C37570ek) obj2;
        long j = Long.MAX_VALUE;
        Long valueOf = Long.valueOf((ekVar.f99838a & 1) != 0 ? ekVar.f99841d : Long.MAX_VALUE);
        if ((ekVar2.f99838a & 1) != 0) {
            j = ekVar2.f99841d;
        }
        return valueOf.compareTo(Long.valueOf(j));
    }
}
