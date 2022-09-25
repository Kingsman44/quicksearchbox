package org.p5623b.p5624a;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* renamed from: org.b.a.v */
/* compiled from: PG */
final class C72109v implements Enumeration {

    /* renamed from: a */
    final /* synthetic */ C72110w f191937a;

    /* renamed from: b */
    private int f191938b = 0;

    public C72109v(C72110w wVar) {
        this.f191937a = wVar;
    }

    public final boolean hasMoreElements() {
        return this.f191938b < this.f191937a.f191939a.length;
    }

    public final Object nextElement() {
        int i = this.f191938b;
        C72092e[] eVarArr = this.f191937a.f191939a;
        if (i < eVarArr.length) {
            this.f191938b = i + 1;
            return eVarArr[i];
        }
        throw new NoSuchElementException("ASN1Sequence Enumeration");
    }
}
