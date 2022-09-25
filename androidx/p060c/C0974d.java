package androidx.p060c;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.c.d */
/* compiled from: PG */
final class C0974d implements Iterator, Map.Entry, p3186j$.util.Iterator, Map.Entry {

    /* renamed from: a */
    int f3090a;

    /* renamed from: b */
    int f3091b = -1;

    /* renamed from: c */
    boolean f3092c;

    /* renamed from: d */
    final /* synthetic */ C0977g f3093d;

    public C0974d(C0977g gVar) {
        this.f3093d = gVar;
        this.f3090a = gVar.f3122d - 1;
    }

    public final boolean equals(Object obj) {
        if (!this.f3092c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            if (!C69664n.m101066l(entry.getKey(), this.f3093d.mo3702e(this.f3091b)) || !C69664n.m101066l(entry.getValue(), this.f3093d.mo3708h(this.f3091b))) {
                return false;
            }
            return true;
        }
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final Object getKey() {
        if (this.f3092c) {
            return this.f3093d.mo3702e(this.f3091b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.f3092c) {
            return this.f3093d.mo3708h(this.f3091b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean hasNext() {
        return this.f3091b < this.f3090a;
    }

    public final int hashCode() {
        int i;
        if (this.f3092c) {
            Object e = this.f3093d.mo3702e(this.f3091b);
            Object h = this.f3093d.mo3708h(this.f3091b);
            int i2 = 0;
            if (e == null) {
                i = 0;
            } else {
                i = e.hashCode();
            }
            if (h != null) {
                i2 = h.hashCode();
            }
            return i ^ i2;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            this.f3091b++;
            this.f3092c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f3092c) {
            this.f3093d.mo3704f(this.f3091b);
            this.f3091b--;
            this.f3090a--;
            this.f3092c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.f3092c) {
            return this.f3093d.mo3705g(this.f3091b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
