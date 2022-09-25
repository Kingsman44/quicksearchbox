package org.p5633c.p5634a;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: org.c.a.k */
/* compiled from: PG */
final class C72287k implements Serializable {
    private static final long serialVersionUID = -6471952376487863581L;

    /* renamed from: a */
    private transient String f192414a;

    public C72287k(String str) {
        this.f192414a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f192414a = objectInputStream.readUTF();
    }

    private Object readResolve() {
        return C72288l.m106786m(this.f192414a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeUTF(this.f192414a);
    }
}
