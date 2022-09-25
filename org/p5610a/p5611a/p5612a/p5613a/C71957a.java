package org.p5610a.p5611a.p5612a.p5613a;

import p3186j$.util.Objects;

/* renamed from: org.a.a.a.a.a */
/* compiled from: PG */
public class C71957a {

    /* renamed from: a */
    public final C71958b f191654a;

    /* renamed from: b */
    public final C71958b f191655b;

    /* renamed from: c */
    public final C71958b f191656c;

    protected C71957a(C71958b bVar, C71958b bVar2, C71958b bVar3) {
        this.f191654a = bVar;
        this.f191655b = bVar2;
        this.f191656c = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71957a)) {
            return false;
        }
        C71957a aVar = (C71957a) obj;
        return Objects.equals(this.f191654a, aVar.f191654a) && Objects.equals(this.f191655b, aVar.f191655b) && Objects.equals(this.f191656c, aVar.f191656c);
    }

    public final int hashCode() {
        return Objects.hash(this.f191654a, this.f191655b, this.f191656c);
    }

    public final String toString() {
        return String.format("%,d files, %,d directories, %,d bytes", new Object[]{Long.valueOf(this.f191656c.f191657a), Long.valueOf(this.f191655b.f191657a), Long.valueOf(this.f191654a.f191657a)});
    }
}
