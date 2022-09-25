package com.google.protobuf;

import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.google.protobuf.ej */
/* compiled from: PG */
final class C63018ej {
    /* renamed from: a */
    public static final void m95759a(C63088z zVar, ArrayDeque arrayDeque) {
        if (zVar.mo59035h()) {
            int b = m95760b(zVar.mo59031d());
            int c = C63021em.m95767c(b + 1);
            if (arrayDeque.isEmpty() || ((C63088z) arrayDeque.peek()).mo59031d() >= c) {
                arrayDeque.push(zVar);
                return;
            }
            int c2 = C63021em.m95767c(b);
            C63088z zVar2 = (C63088z) arrayDeque.pop();
            while (!arrayDeque.isEmpty() && ((C63088z) arrayDeque.peek()).mo59031d() < c2) {
                zVar2 = new C63021em((C63088z) arrayDeque.pop(), zVar2);
            }
            C63021em emVar = new C63021em(zVar2, zVar);
            while (!arrayDeque.isEmpty() && ((C63088z) arrayDeque.peek()).mo59031d() < C63021em.m95767c(m95760b(emVar.f170114d) + 1)) {
                emVar = new C63021em((C63088z) arrayDeque.pop(), emVar);
            }
            arrayDeque.push(emVar);
        } else if (zVar instanceof C63021em) {
            C63021em emVar2 = (C63021em) zVar;
            int i = C63021em.f170113h;
            m95759a(emVar2.f170115e, arrayDeque);
            m95759a(emVar2.f170116f, arrayDeque);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(zVar.getClass()))));
        }
    }

    /* renamed from: b */
    private static final int m95760b(int i) {
        int binarySearch = Arrays.binarySearch(C63021em.f170112a, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
