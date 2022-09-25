package com.google.common.p4522b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.common.b.np */
/* compiled from: PG */
final class C58669np {

    /* renamed from: a */
    Object f156399a = null;

    /* renamed from: b */
    List f156400b = Collections.emptyList();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final IllegalArgumentException mo55743a(boolean z) {
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(this.f156399a);
        for (Object next : this.f156400b) {
            sb.append(", ");
            sb.append(next);
        }
        if (z) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo55744b(Object obj) {
        obj.getClass();
        if (this.f156399a == null) {
            this.f156399a = obj;
        } else if (this.f156400b.isEmpty()) {
            ArrayList arrayList = new ArrayList(4);
            this.f156400b = arrayList;
            arrayList.add(obj);
        } else if (this.f156400b.size() < 4) {
            this.f156400b.add(obj);
        } else {
            throw mo55743a(true);
        }
    }
}
