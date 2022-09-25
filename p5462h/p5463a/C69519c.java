package p5462h.p5463a;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.a.c */
/* compiled from: PG */
public abstract class C69519c implements Iterator, p3186j$.util.Iterator, C69640a {

    /* renamed from: a */
    public int f185935a = 2;

    /* renamed from: b */
    private Object f185936b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo61268a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo61269b(Object obj) {
        this.f185936b = obj;
        this.f185935a = 1;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final Object next() {
        if (hasNext()) {
            this.f185935a = 2;
            return this.f185936b;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        int i = this.f185935a;
        if (i != 4) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                return true;
            } else {
                if (i2 != 2) {
                    this.f185935a = 4;
                    mo61268a();
                    if (this.f185935a == 1) {
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
