package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.c */
/* compiled from: PG */
public abstract class C62947c implements MessageLite {
    protected int memoizedHashCode = 0;

    @Deprecated
    protected static void addAll(Iterable iterable, Collection collection) {
        C62919b.addAll(iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(C63088z zVar) {
        if (!zVar.mo59047s()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        String name = getClass().getName();
        return "Serializing " + name + " to a " + str + " threw an IOException (should never happen).";
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(C63022en enVar) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int a = enVar.mo58992a(this);
        setMemoizedSerializedSize(a);
        return a;
    }

    public C63005dx mutableCopy() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public C63043fh newUninitializedMessageException() {
        return new C63043fh();
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            C62906an Q = C62906an.m95324Q(bArr);
            writeTo(Q);
            Q.mo58788T();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    public C63088z toByteString() {
        try {
            int serializedSize = getSerializedSize();
            C63088z zVar = C63088z.f170246b;
            byte[] bArr = new byte[serializedSize];
            C62906an Q = C62906an.m95324Q(bArr);
            writeTo(Q);
            return C63084v.m96114a(Q, bArr);
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        C62906an R = C62906an.m95325R(outputStream, C62906an.m95318K(C62906an.m95321N(serializedSize) + serializedSize));
        R.mo58780w(serializedSize);
        writeTo(R);
        R.mo58759X();
    }

    public void writeTo(OutputStream outputStream) {
        C62906an R = C62906an.m95325R(outputStream, C62906an.m95318K(getSerializedSize()));
        writeTo(R);
        R.mo58759X();
    }

    public static void addAll(Iterable iterable, List list) {
        C62919b.addAll(iterable, list);
    }
}
