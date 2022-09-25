package com.google.common.p4522b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: com.google.common.b.id */
/* compiled from: PG */
public final class C58522id implements Serializable, C58716pi {

    /* renamed from: a */
    public static final C58522id f156167a = new C58522id(C58485gu.m89845m(), C58485gu.m89845m());
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    public final transient C58485gu f156168b;

    /* renamed from: c */
    public final transient C58485gu f156169c;

    public C58522id(C58485gu guVar, C58485gu guVar2) {
        this.f156168b = guVar;
        this.f156169c = guVar2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: a */
    public final C58495hd mo55476b() {
        if (this.f156168b.isEmpty()) {
            return C58729pv.f156485a;
        }
        return new C58537is(new C58735qa(this.f156168b, C58714pg.m90501d()), this.f156169c, (C58537is) null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C58716pi) {
            return mo55476b().equals(((C58716pi) obj).mo55476b());
        }
        return false;
    }

    public final int hashCode() {
        return C58758qx.m90643a(mo55476b().entrySet());
    }

    public final String toString() {
        return C58662ni.m90350i(mo55476b());
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58521ic(mo55476b());
    }
}
