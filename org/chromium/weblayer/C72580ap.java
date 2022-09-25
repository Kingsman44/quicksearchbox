package org.chromium.weblayer;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: org.chromium.weblayer.ap */
/* compiled from: PG */
final class C72580ap implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ C72581aq f193108a;

    /* renamed from: b */
    private final int f193109b;

    /* renamed from: c */
    private int f193110c;

    /* renamed from: d */
    private boolean f193111d;

    public C72580ap(C72581aq aqVar) {
        this.f193108a = aqVar;
        aqVar.f193113b++;
        this.f193109b = aqVar.f193112a.size();
    }

    /* renamed from: a */
    private final void m107312a() {
        if (!this.f193111d) {
            this.f193111d = true;
            C72581aq aqVar = this.f193108a;
            aqVar.f193113b--;
        }
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        int i = this.f193110c;
        while (i < this.f193109b && this.f193108a.mo64453a(i) == null) {
            i++;
        }
        if (i < this.f193109b) {
            return true;
        }
        m107312a();
        return false;
    }

    public final Object next() {
        while (true) {
            int i = this.f193110c;
            if (i >= this.f193109b || this.f193108a.mo64453a(i) != null) {
                int i2 = this.f193110c;
            } else {
                this.f193110c++;
            }
        }
        int i22 = this.f193110c;
        if (i22 < this.f193109b) {
            C72581aq aqVar = this.f193108a;
            this.f193110c = i22 + 1;
            return aqVar.mo64453a(i22);
        }
        m107312a();
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
