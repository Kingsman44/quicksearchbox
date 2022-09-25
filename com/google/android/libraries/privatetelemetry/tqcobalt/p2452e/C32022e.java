package com.google.android.libraries.privatetelemetry.tqcobalt.p2452e;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.e.e */
/* compiled from: PG */
public final class C32022e {

    /* renamed from: a */
    private static final C59071e f86046a = C59071e.m91332i("com.google.android.libraries.privatetelemetry.tqcobalt.e.e");

    /* renamed from: a */
    public static C32021d m59659a(Set set, Set set2) {
        ((C59052c) ((C59052c) f86046a.mo56224b()).mo56372aa(50477)).mo56386p("Cobalt: try to find ProjectConfig for given tags");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C32021d dVar = (C32021d) it.next();
            String format = String.format("%s-%s", new Object[]{Integer.valueOf(dVar.mo37787a().mo37777a()), Long.valueOf(dVar.mo37787a().mo37778b())});
            if (set2.contains(format)) {
                ((C59052c) ((C59052c) f86046a.mo56226d()).mo56372aa(50479)).mo56389s("Cobalt: found ProjectConfig for tag %s", format);
                return dVar;
            }
        }
        ((C59052c) ((C59052c) f86046a.mo56226d()).mo56372aa(50478)).mo56386p("Cobalt: couldn't find ProjectConfig for given tags");
        return null;
    }
}
