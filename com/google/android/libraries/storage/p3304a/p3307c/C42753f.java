package com.google.android.libraries.storage.p3304a.p3307c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.storage.a.c.f */
/* compiled from: PG */
public final class C42753f {

    /* renamed from: a */
    public final String f112012a;

    /* renamed from: b */
    public final List f112013b = new ArrayList();

    public C42753f(String str, List list) {
        this.f112012a = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C42755h hVar = (C42755h) it.next();
                int i = 0;
                while (true) {
                    if (i >= this.f112013b.size()) {
                        this.f112013b.add(hVar);
                        break;
                    } else if (((C42755h) this.f112013b.get(i)).f112016a.equals(hVar.f112016a)) {
                        this.f112013b.set(i, hVar);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}
