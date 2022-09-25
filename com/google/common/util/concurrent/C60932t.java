package com.google.common.util.concurrent;

import com.google.common.p4535g.C59203do;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.common.util.concurrent.t */
/* compiled from: PG */
public final class C60932t extends Number implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLong value;

    public C60932t() {
        this((byte[]) null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.value = new AtomicLong();
        mo57429b(objectInputStream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(mo57428a());
    }

    /* renamed from: a */
    public final double mo57428a() {
        return Double.longBitsToDouble(this.value.get());
    }

    /* renamed from: b */
    public final void mo57429b(double d) {
        this.value.set(Double.doubleToRawLongBits(d));
    }

    public final double doubleValue() {
        return mo57428a();
    }

    public final float floatValue() {
        return (float) mo57428a();
    }

    public final int intValue() {
        return (int) mo57428a();
    }

    public final long longValue() {
        return (long) mo57428a();
    }

    public final String toString() {
        return Double.toString(mo57428a());
    }

    public C60932t(byte[] bArr) {
        this.value = new AtomicLong(Double.doubleToRawLongBits(C59203do.f157270a));
    }
}
