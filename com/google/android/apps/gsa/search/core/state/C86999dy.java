package com.google.android.apps.gsa.search.core.state;

import com.google.common.p4522b.C58557jl;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.search.core.state.dy */
/* compiled from: PG */
final class C86999dy implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ C87000dz f234981a;

    /* renamed from: b */
    private final int f234982b;

    /* renamed from: c */
    private int f234983c = 0;

    /* renamed from: d */
    private boolean f234984d = false;

    public C86999dy(C87000dz dzVar) {
        this.f234981a = dzVar;
        dzVar.f234986b++;
        this.f234982b = dzVar.f234985a.size();
    }

    /* renamed from: a */
    private final void m140477a() {
        if (!this.f234984d) {
            this.f234984d = true;
            C87000dz dzVar = this.f234981a;
            int i = dzVar.f234986b - 1;
            dzVar.f234986b = i;
            if (i == 0) {
                C58557jl.m90145z(dzVar.f234985a, C86998dx.f234980a);
            }
        }
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        int i = this.f234983c;
        while (i < this.f234982b && this.f234981a.mo80628a(i) == null) {
            i++;
        }
        if (i < this.f234982b) {
            return true;
        }
        m140477a();
        return false;
    }

    public final Object next() {
        while (true) {
            int i = this.f234983c;
            if (i >= this.f234982b || this.f234981a.mo80628a(i) != null) {
                int i2 = this.f234983c;
            } else {
                this.f234983c++;
            }
        }
        int i22 = this.f234983c;
        if (i22 < this.f234982b) {
            C87000dz dzVar = this.f234981a;
            this.f234983c = i22 + 1;
            return dzVar.mo80628a(i22);
        }
        m140477a();
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
