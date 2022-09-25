package org.p5623b.p5624a;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* renamed from: org.b.a.y */
/* compiled from: PG */
final class C72112y implements Enumeration {

    /* renamed from: a */
    final /* synthetic */ C72113z f191940a;

    /* renamed from: b */
    private int f191941b = 0;

    public C72112y(C72113z zVar) {
        this.f191940a = zVar;
    }

    public final boolean hasMoreElements() {
        return this.f191941b < this.f191940a.f191942a.length;
    }

    public final Object nextElement() {
        int i = this.f191941b;
        C72092e[] eVarArr = this.f191940a.f191942a;
        if (i < eVarArr.length) {
            this.f191941b = i + 1;
            return eVarArr[i];
        }
        throw new NoSuchElementException("ASN1Set Enumeration");
    }
}
