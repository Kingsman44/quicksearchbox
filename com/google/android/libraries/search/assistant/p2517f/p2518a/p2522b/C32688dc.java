package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32805b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32840ch;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32905a;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.common.p4526f.C58976aa;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.dc */
/* compiled from: PG */
public final class C32688dc {
    /* renamed from: a */
    public static final List m60588a(long j, List list) {
        C69664n.m101061g(list, "parentTags");
        List g = C69540x.m100949g(new C32689dd(C58976aa.m91139c("request", Long.class), Long.valueOf(j)));
        g.addAll(list);
        return g;
    }

    /* renamed from: b */
    public static final List m60589b(C32805b bVar, List list) {
        C69664n.m101061g(bVar, "$this$toLogTags");
        C69664n.m101061g(list, "parentTags");
        C69664n.m101061g(bVar, "<this>");
        List g = C69540x.m100949g(new C32689dd(C58976aa.m91139c("accessSessionKey", String.class), C32905a.m60895a(bVar)));
        g.addAll(list);
        return g;
    }

    /* renamed from: c */
    public static final List m60590c(C32858d dVar, List list) {
        C69664n.m101061g(dVar, "$this$toLogTags");
        C69664n.m101061g(list, "parentTags");
        C69664n.m101061g(dVar, "<this>");
        List g = C69540x.m100949g(new C32689dd(C58976aa.m91139c("accessSession", String.class), C32941s.m60950a(dVar)));
        g.addAll(list);
        return g;
    }

    /* renamed from: d */
    public static final List m60591d(C32849cq cqVar, List list) {
        C69664n.m101061g(cqVar, "$this$toLogTags");
        List g = C69540x.m100949g(new C32689dd(C58976aa.m91139c("session", String.class), C32692dg.m60597c(cqVar)));
        g.addAll(list);
        return g;
    }

    /* renamed from: e */
    public static final List m60592e(C32840ch chVar, List list) {
        C32805b bVar;
        C69664n.m101061g(chVar, "$this$toLogTags");
        C69664n.m101061g(list, "parentTags");
        C69664n.m101061g(chVar, "$this$requestNumber");
        long j = chVar.f88052d;
        C69664n.m101061g(chVar, "<this>");
        if ((chVar.f88049a & 1) != 0) {
            bVar = chVar.f88051c;
            if (bVar == null) {
                bVar = C32805b.f87984c;
            }
        } else {
            bVar = null;
        }
        C32858d dVar = chVar.f88050b;
        if (dVar == null) {
            dVar = C32858d.f88081c;
        }
        C69664n.m101060f(dVar, "accessSessionToken");
        List c = m60590c(dVar, list);
        C69664n.m101061g(c, "parentTags");
        if (bVar != null) {
            c = m60589b(bVar, c);
        }
        return m60588a(j, c);
    }
}
