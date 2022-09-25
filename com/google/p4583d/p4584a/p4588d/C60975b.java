package com.google.p4583d.p4584a.p4588d;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.d.a.d.b */
/* compiled from: PG */
public final class C60975b implements Iterator {

    /* renamed from: a */
    final /* synthetic */ C60976c f165099a;

    /* renamed from: b */
    private int f165100b = 0;

    public C60975b(C60976c cVar) {
        this.f165099a = cVar;
    }

    /* renamed from: a */
    public final C60987n next() {
        if (this.f165100b < this.f165099a.mo57467c()) {
            C60976c cVar = this.f165099a;
            int i = this.f165100b;
            this.f165100b = i + 1;
            return cVar.mo57469e(i);
        }
        int i2 = this.f165100b;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }

    public final boolean hasNext() {
        return this.f165100b < this.f165099a.mo57467c();
    }
}
