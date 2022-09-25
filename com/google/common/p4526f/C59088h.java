package com.google.common.p4526f;

import java.util.Iterator;

/* renamed from: com.google.common.f.h */
/* compiled from: PG */
final class C59088h extends C58976aa {
    public C59088h(Class cls) {
        super("group_by", cls, true, true);
    }

    /* renamed from: a */
    public final void mo56230a(Iterator it, C59106z zVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                zVar.mo56300a(this.f156827a, next);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String str = this.f156827a;
            sb.append(']');
            zVar.mo56300a(str, sb.toString());
        }
    }
}
