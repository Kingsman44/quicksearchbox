package com.google.common.p4535g;

import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.common.g.dt */
/* compiled from: PG */
final class C59208dt implements Comparator {

    /* renamed from: a */
    private final List f157281a;

    /* renamed from: b */
    private final C59207ds f157282b;

    public C59208dt(List list) {
        this.f157281a = list;
        this.f157282b = new C59207ds(list);
    }

    /* renamed from: a */
    static /* synthetic */ C59136bb m91842a(List list, int i) {
        return (C59136bb) list.get(i % list.size());
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int h;
        C59206dr drVar = (C59206dr) obj;
        C59206dr drVar2 = (C59206dr) obj2;
        if (drVar.mo56575a(drVar2)) {
            return 0;
        }
        int i = drVar.f157278a;
        int i2 = drVar2.f157278a;
        int size = this.f157281a.size();
        do {
            size--;
            if (size <= 0) {
                return 0;
            }
            i += drVar.f157279b;
            i2 += drVar2.f157279b;
            h = m91842a(this.f157282b.f157280a, i).compareTo(m91842a(this.f157282b.f157280a, i2));
        } while (h == 0);
        return h;
    }
}
