package com.google.common.p4522b;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: com.google.common.b.rs */
/* compiled from: PG */
class C58780rs implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Object f156561a;

    /* renamed from: b */
    final Object f156562b;

    public C58780rs(Object obj, Object obj2) {
        obj.getClass();
        this.f156561a = obj;
        this.f156562b = obj2 == null ? this : obj2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f156562b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    public final String toString() {
        String obj;
        synchronized (this.f156562b) {
            obj = this.f156561a.toString();
        }
        return obj;
    }
}
