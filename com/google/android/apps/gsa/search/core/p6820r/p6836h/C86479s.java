package com.google.android.apps.gsa.search.core.p6820r.p6836h;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6820r.C86385ag;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90915bl;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.r.h.s */
/* compiled from: PG */
final class C86479s implements C86385ag {

    /* renamed from: b */
    private final List f233715b;

    public C86479s(List list) {
        this.f233715b = list;
    }

    /* renamed from: a */
    public final C60870cx mo80162a() {
        ArrayList arrayList = new ArrayList(this.f233715b.size());
        for (C60870cx h : this.f233715b) {
            C60870cx h2 = C60922j.m93045h(h, new C90915bl(C86478r.f233714a), C60826bg.f164896a);
            C90476a aVar = C91018d.f254254a;
            arrayList.add(h2);
        }
        return C118826c.m197213c(C90918bo.m148518e(arrayList));
    }
}
