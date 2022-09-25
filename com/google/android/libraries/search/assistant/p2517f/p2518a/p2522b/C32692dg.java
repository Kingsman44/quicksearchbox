package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.common.p4526f.C59052c;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C71604be;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.dg */
/* compiled from: PG */
public final class C32692dg {
    /* renamed from: a */
    public static final C59052c m60595a(C59052c cVar, List list) {
        C69664n.m101061g(cVar, "$this$with");
        C69664n.m101061g(list, "tags");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C32689dd ddVar = (C32689dd) it.next();
            cVar.mo56378ag(ddVar.f87604a, ddVar.f87605b);
            C69664n.m101060f(cVar, "acc.withTag(tag)");
        }
        return cVar;
    }

    /* renamed from: b */
    public static final String m60596b(C71604be beVar) {
        C69664n.m101061g(beVar, "<this>");
        if (!beVar.mo62875x()) {
            return "RUNNING";
        }
        return beVar.mo62868mk() ? "CANCELLED/FAILED" : "DONE";
    }

    /* renamed from: c */
    public static final String m60597c(C32849cq cqVar) {
        C69664n.m101061g(cqVar, "<this>");
        return C32941s.m60951b(cqVar);
    }
}
