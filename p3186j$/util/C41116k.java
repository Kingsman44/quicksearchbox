package p3186j$.util;

import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.k */
final class C41116k implements ListIterator, Iterator {

    /* renamed from: a */
    private final List f107687a;

    /* renamed from: b */
    private final int f107688b;

    /* renamed from: c */
    private final boolean f107689c;

    /* renamed from: d */
    private int f107690d;

    C41116k(List list, int i) {
        this.f107687a = list;
        this.f107688b = i;
        this.f107690d = 0;
        this.f107689c = false;
    }

    C41116k(List list, int i, int i2) {
        this.f107687a = list;
        this.f107688b = i;
        this.f107690d = i2;
        this.f107689c = true;
    }

    public final void add(Object obj) {
        int i = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f107690d != this.f107688b;
    }

    public final boolean hasPrevious() {
        if (!this.f107689c) {
            int i = C41329u.f108056a;
            throw new UnsupportedOperationException();
        } else if (this.f107690d != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final Object next() {
        try {
            int i = this.f107690d;
            Object obj = this.f107687a.get(i);
            this.f107690d = i + 1;
            return obj;
        } catch (IndexOutOfBoundsException unused) {
            throw new NoSuchElementException();
        }
    }

    public final int nextIndex() {
        if (this.f107689c) {
            return this.f107690d;
        }
        int i = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }

    public final Object previous() {
        if (this.f107689c) {
            try {
                int i = this.f107690d - 1;
                Object obj = this.f107687a.get(i);
                this.f107690d = i;
                return obj;
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException();
            }
        } else {
            int i2 = C41329u.f108056a;
            throw new UnsupportedOperationException();
        }
    }

    public final int previousIndex() {
        if (this.f107689c) {
            return this.f107690d - 1;
        }
        int i = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }

    public final void remove() {
        int i = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }

    public final void set(Object obj) {
        int i = C41329u.f108056a;
        throw new UnsupportedOperationException();
    }
}
