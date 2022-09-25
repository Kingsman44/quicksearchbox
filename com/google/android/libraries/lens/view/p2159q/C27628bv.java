package com.google.android.libraries.lens.view.p2159q;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.q.bv */
/* compiled from: PG */
public final class C27628bv {
    /* renamed from: a */
    public static String m51418a(String str, String str2) {
        return String.format("%s %s", new Object[]{str, str2});
    }

    /* renamed from: b */
    static List m51419b(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    /* renamed from: c */
    static boolean m51420c(C24465t tVar, List list) {
        return Collection.EL.stream(list).allMatch(new C27627bu(tVar));
    }
}
