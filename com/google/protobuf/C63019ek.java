package com.google.protobuf;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.protobuf.ek */
/* compiled from: PG */
final class C63019ek implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    private final ArrayDeque f170103a;

    /* renamed from: b */
    private C63085w f170104b;

    public C63019ek(C63088z zVar) {
        if (zVar instanceof C63021em) {
            C63021em emVar = (C63021em) zVar;
            ArrayDeque arrayDeque = new ArrayDeque(emVar.f170117g);
            this.f170103a = arrayDeque;
            arrayDeque.push(emVar);
            this.f170104b = m95761b(emVar.f170115e);
            return;
        }
        this.f170103a = null;
        this.f170104b = (C63085w) zVar;
    }

    /* renamed from: b */
    private final C63085w m95761b(C63088z zVar) {
        while (zVar instanceof C63021em) {
            C63021em emVar = (C63021em) zVar;
            this.f170103a.push(emVar);
            int i = C63021em.f170113h;
            zVar = emVar.f170115e;
        }
        return (C63085w) zVar;
    }

    /* renamed from: a */
    public final C63085w next() {
        C63085w wVar;
        C63085w wVar2 = this.f170104b;
        if (wVar2 != null) {
            do {
                ArrayDeque arrayDeque = this.f170103a;
                wVar = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.f170104b = wVar;
                } else {
                    int i = C63021em.f170113h;
                    wVar = m95761b(((C63021em) this.f170103a.pop()).f170116f);
                }
            } while (wVar.mo59173M());
            this.f170104b = wVar;
            return wVar2;
        }
        throw new NoSuchElementException();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f170104b != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
