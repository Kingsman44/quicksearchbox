package com.google.common.p4522b;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.common.b.bb */
/* compiled from: PG */
public final class C58331bb extends C58332bc {
    private static final long serialVersionUID = 0;

    /* renamed from: d */
    transient int f155904d;

    public C58331bb() {
        this(12, 3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f155904d = 3;
        int readInt = objectInputStream.readInt();
        mo54918v(new C58384da());
        C58742qh.m90624c(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C58742qh.m90627f(this, objectOutputStream);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Collection mo54900a() {
        return new ArrayList(this.f155904d);
    }

    public C58331bb(int i, int i2) {
        super(new C58384da(i));
        this.f155904d = i2;
    }
}
