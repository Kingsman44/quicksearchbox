package com.google.common.p4522b;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.jv */
/* compiled from: PG */
final class C58567jv implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    private Iterator f156233a;

    /* renamed from: b */
    private Iterator f156234b = C58566ju.f156231a;

    /* renamed from: c */
    private Iterator f156235c;

    /* renamed from: d */
    private Deque f156236d;

    public C58567jv(Iterator it) {
        it.getClass();
        this.f156235c = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        java.util.Iterator it;
        while (true) {
            java.util.Iterator it2 = this.f156234b;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                java.util.Iterator it3 = this.f156235c;
                if (it3 != null && it3.hasNext()) {
                    it = this.f156235c;
                    break;
                }
                Deque deque = this.f156236d;
                if (deque == null || deque.isEmpty()) {
                    it = null;
                } else {
                    this.f156235c = (java.util.Iterator) this.f156236d.removeFirst();
                }
            }
            it = null;
            this.f156235c = it;
            if (it == null) {
                return false;
            }
            java.util.Iterator it4 = (java.util.Iterator) it.next();
            this.f156234b = it4;
            if (it4 instanceof C58567jv) {
                C58567jv jvVar = (C58567jv) it4;
                this.f156234b = jvVar.f156234b;
                if (this.f156236d == null) {
                    this.f156236d = new ArrayDeque();
                }
                this.f156236d.addFirst(this.f156235c);
                if (jvVar.f156236d != null) {
                    while (!jvVar.f156236d.isEmpty()) {
                        this.f156236d.addFirst((java.util.Iterator) jvVar.f156236d.removeLast());
                    }
                }
                this.f156235c = jvVar.f156235c;
            }
        }
    }

    public final Object next() {
        if (hasNext()) {
            java.util.Iterator it = this.f156234b;
            this.f156233a = it;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        java.util.Iterator it = this.f156233a;
        if (it != null) {
            it.remove();
            this.f156233a = null;
            return;
        }
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
