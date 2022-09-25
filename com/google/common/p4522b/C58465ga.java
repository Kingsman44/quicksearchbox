package com.google.common.p4522b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: com.google.common.b.ga */
/* compiled from: PG */
abstract class C58465ga extends C58485gu {
    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return mo55358b().mo55032a();
    }

    /* renamed from: b */
    public abstract C58471gg mo55358b();

    public final boolean contains(Object obj) {
        return mo55358b().contains(obj);
    }

    public final boolean isEmpty() {
        return mo55358b().isEmpty();
    }

    public final int size() {
        return mo55358b().size();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58463fz(mo55358b());
    }
}
