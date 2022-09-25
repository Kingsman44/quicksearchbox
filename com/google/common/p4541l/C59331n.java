package com.google.common.p4541l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: com.google.common.l.n */
/* compiled from: PG */
public final class C59331n implements DataOutput {

    /* renamed from: a */
    final DataOutput f157520a;

    /* renamed from: b */
    public final ByteArrayOutputStream f157521b;

    public C59331n(ByteArrayOutputStream byteArrayOutputStream) {
        this.f157521b = byteArrayOutputStream;
        this.f157520a = new DataOutputStream(byteArrayOutputStream);
    }

    public final void write(int i) {
        try {
            this.f157520a.write(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeBoolean(boolean z) {
        try {
            this.f157520a.writeBoolean(z);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeByte(int i) {
        try {
            this.f157520a.writeByte(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeBytes(String str) {
        try {
            this.f157520a.writeBytes(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeChar(int i) {
        try {
            this.f157520a.writeChar(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeChars(String str) {
        try {
            this.f157520a.writeChars(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeDouble(double d) {
        try {
            this.f157520a.writeDouble(d);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeFloat(float f) {
        try {
            this.f157520a.writeFloat(f);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeInt(int i) {
        try {
            this.f157520a.writeInt(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeLong(long j) {
        try {
            this.f157520a.writeLong(j);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeShort(int i) {
        try {
            this.f157520a.writeShort(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeUTF(String str) {
        try {
            this.f157520a.writeUTF(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void write(byte[] bArr) {
        try {
            this.f157520a.write(bArr);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.f157520a.write(bArr, i, i2);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
