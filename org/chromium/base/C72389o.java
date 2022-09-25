package org.chromium.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: org.chromium.base.o */
/* compiled from: PG */
public final class C72389o implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ C72390p f192534a;

    /* renamed from: b */
    private final int f192535b;

    /* renamed from: c */
    private int f192536c;

    /* renamed from: d */
    private boolean f192537d;

    public C72389o(C72390p pVar) {
        this.f192534a = pVar;
        pVar.f192539b++;
        this.f192535b = pVar.f192538a.size();
    }

    /* renamed from: a */
    private final void m107046a() {
        if (!this.f192537d) {
            this.f192537d = true;
            C72390p pVar = this.f192534a;
            int i = pVar.f192539b - 1;
            pVar.f192539b = i;
            if (i <= 0 && pVar.f192540c) {
                pVar.f192540c = false;
                int size = pVar.f192538a.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        return;
                    }
                    if (pVar.f192538a.get(size) == null) {
                        pVar.f192538a.remove(size);
                    }
                }
            }
        }
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        int i = this.f192536c;
        while (i < this.f192535b && this.f192534a.mo63849a(i) == null) {
            i++;
        }
        if (i < this.f192535b) {
            return true;
        }
        m107046a();
        return false;
    }

    public final Object next() {
        while (true) {
            int i = this.f192536c;
            if (i >= this.f192535b || this.f192534a.mo63849a(i) != null) {
                int i2 = this.f192536c;
            } else {
                this.f192536c++;
            }
        }
        int i22 = this.f192536c;
        if (i22 < this.f192535b) {
            C72390p pVar = this.f192534a;
            this.f192536c = i22 + 1;
            return pVar.mo63849a(i22);
        }
        m107046a();
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
