package com.google.android.libraries.storage.p3304a.p3307c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.storage.a.c.d */
/* compiled from: PG */
public final class C42751d {

    /* renamed from: a */
    public final String f112008a;

    /* renamed from: b */
    public final List f112009b = new ArrayList();

    public C42751d(String str, List list) {
        this.f112008a = str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C42753f fVar = (C42753f) it.next();
            int i = 0;
            while (true) {
                if (i >= this.f112009b.size()) {
                    this.f112009b.add(fVar);
                    break;
                } else if (((C42753f) this.f112009b.get(i)).f112012a.equals(fVar.f112012a)) {
                    this.f112009b.set(i, fVar);
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}
