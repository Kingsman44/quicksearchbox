package com.google.common.p4520a;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: com.google.common.a.ah */
/* compiled from: PG */
final class C58201ah extends C58207an implements Serializable, C58259n {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    transient C58259n f155641a;

    public C58201ah(C58234bn bnVar) {
        super(bnVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f155641a = mo54716f().mo54818b(this.f155659m);
    }

    private Object readResolve() {
        return this.f155641a;
    }

    /* renamed from: a */
    public final Object mo54699a(Object obj) {
        throw null;
    }

    public final Object apply(Object obj) {
        return ((C58204ak) this.f155641a).mo54699a(obj);
    }
}
