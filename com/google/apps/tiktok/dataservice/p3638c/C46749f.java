package com.google.apps.tiktok.dataservice.p3638c;

import java.util.AbstractList;
import java.util.List;

/* renamed from: com.google.apps.tiktok.dataservice.c.f */
/* compiled from: PG */
final class C46749f extends AbstractList {

    /* renamed from: a */
    final /* synthetic */ C46751h f122094a;

    public C46749f(C46751h hVar) {
        this.f122094a = hVar;
    }

    public final Object get(int i) {
        int i2 = 0;
        while (true) {
            C46751h hVar = this.f122094a;
            if (i2 > hVar.f122099e) {
                throw new IndexOutOfBoundsException("No adapter for position: " + i);
            } else if (hVar.f122100f[i2] > i) {
                int i3 = i2 - 1;
                return ((List) hVar.f122098d.get(i3)).get(i - this.f122094a.f122100f[i3]);
            } else {
                i2++;
            }
        }
    }

    public final int size() {
        return this.f122094a.f122101g;
    }
}
