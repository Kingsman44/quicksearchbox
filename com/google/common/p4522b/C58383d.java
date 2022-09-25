package com.google.common.p4522b;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

/* renamed from: com.google.common.b.d */
/* compiled from: PG */
final class C58383d extends C58464g {
    private static final long serialVersionUID = 0;

    public C58383d(Map map, C58464g gVar) {
        super(map, gVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f156090b = (C58464g) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f156090b);
    }

    /* renamed from: c */
    public final Object mo55081c(Object obj) {
        return this.f156090b.mo55082d(obj);
    }

    /* renamed from: d */
    public final Object mo55082d(Object obj) {
        return this.f156090b.mo55081c(obj);
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return this.f156090b.mo55027e();
    }
}
