package com.facebook.p313c.p315b;

import java.util.Comparator;

/* renamed from: com.facebook.c.b.e */
/* compiled from: PG */
final class C6029e implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C6028d dVar = (C6028d) obj;
        C6028d dVar2 = (C6028d) obj2;
        int i = dVar.f17755c.top;
        int i2 = dVar2.f17755c.top;
        if (i != i2) {
            return i <= i2 ? -1 : 1;
        }
        int i3 = dVar.f17753a;
        int i4 = dVar2.f17753a;
        if (i3 == i4) {
            return 0;
        }
        return i3 <= i4 ? -1 : 1;
    }
}
