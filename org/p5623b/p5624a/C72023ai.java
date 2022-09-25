package org.p5623b.p5624a;

import java.util.Enumeration;

/* renamed from: org.b.a.ai */
/* compiled from: PG */
final class C72023ai implements Enumeration {

    /* renamed from: a */
    int f191779a = 0;

    /* renamed from: b */
    final /* synthetic */ C72024aj f191780b;

    public C72023ai(C72024aj ajVar) {
        this.f191780b = ajVar;
    }

    public final boolean hasMoreElements() {
        return this.f191779a < this.f191780b.f191781b.length;
    }

    public final Object nextElement() {
        C72104q[] qVarArr = this.f191780b.f191781b;
        int i = this.f191779a;
        this.f191779a = i + 1;
        return qVarArr[i];
    }
}
