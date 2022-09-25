package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.or */
/* compiled from: PG */
final class C58698or implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    private final C58692ol f156420a;

    /* renamed from: b */
    private final Iterator f156421b;

    /* renamed from: c */
    private C58691ok f156422c;

    /* renamed from: d */
    private int f156423d;

    /* renamed from: e */
    private int f156424e;

    /* renamed from: f */
    private boolean f156425f;

    public C58698or(C58692ol olVar, Iterator it) {
        this.f156420a = olVar;
        this.f156421b = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f156423d > 0 || this.f156421b.hasNext();
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f156423d;
            if (i == 0) {
                C58691ok okVar = (C58691ok) this.f156421b.next();
                this.f156422c = okVar;
                i = okVar.mo55767a();
                this.f156424e = i;
            }
            this.f156423d = i - 1;
            this.f156425f = true;
            return ((C58691ok) Objects.requireNonNull(this.f156422c)).mo55768b();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        C58838bb.m90884s(this.f156425f, "no calls to next() since the last call to remove()");
        if (this.f156424e == 1) {
            this.f156421b.remove();
        } else {
            this.f156420a.remove(((C58691ok) Objects.requireNonNull(this.f156422c)).mo55768b());
        }
        this.f156424e--;
        this.f156425f = false;
    }
}
