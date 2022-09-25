package androidx.p060c;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: androidx.c.j */
/* compiled from: PG */
abstract class C0980j implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    private int f3103a;

    /* renamed from: b */
    private int f3104b;

    /* renamed from: c */
    private boolean f3105c;

    public C0980j(int i) {
        this.f3103a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo3602a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo3603b(int i);

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f3104b < this.f3103a;
    }

    public final Object next() {
        if (hasNext()) {
            Object a = mo3602a(this.f3104b);
            this.f3104b++;
            this.f3105c = true;
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f3105c) {
            int i = this.f3104b - 1;
            this.f3104b = i;
            mo3603b(i);
            this.f3103a--;
            this.f3105c = false;
            return;
        }
        throw new IllegalStateException();
    }
}
