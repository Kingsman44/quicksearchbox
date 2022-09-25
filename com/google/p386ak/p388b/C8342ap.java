package com.google.p386ak.p388b;

import com.google.p386ak.C8407w;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.ak.b.ap */
/* compiled from: PG */
public final class C8342ap {
    /* renamed from: a */
    public static int m23113a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int a = ((C8407w) it.next()).mo17177a();
            if (a != 2) {
                return a;
            }
        }
        return 1;
    }
}
