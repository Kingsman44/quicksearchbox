package com.google.common.p4536h;

import java.util.Deque;
import java.util.Iterator;

/* renamed from: com.google.common.h.af */
/* compiled from: PG */
final class C59239af extends C59241ah {
    /* renamed from: a */
    public final Object mo56706a(Deque deque) {
        Iterator it = (Iterator) deque.getFirst();
        if (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            return next;
        }
        deque.removeFirst();
        return null;
    }
}
