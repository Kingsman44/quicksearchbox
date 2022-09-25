package com.facebook.litho.p322a;

import com.facebook.litho.C6367gt;

/* renamed from: com.facebook.litho.a.r */
/* compiled from: PG */
public final class C6085r {

    /* renamed from: a */
    public final C6367gt f17977a;

    /* renamed from: b */
    public final C6076i f17978b;

    public C6085r(C6367gt gtVar, C6076i iVar) {
        this.f17977a = gtVar;
        this.f17978b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C6085r rVar = (C6085r) obj;
            return this.f17977a.equals(rVar.f17977a) && this.f17978b.equals(rVar.f17978b);
        }
    }

    public final int hashCode() {
        return (this.f17977a.f18827d * 31) + this.f17978b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f17977a);
        String valueOf2 = String.valueOf(this.f17978b);
        return "PropertyHandle{ mTransitionId='" + valueOf + "', mProperty=" + valueOf2 + "}";
    }
}
