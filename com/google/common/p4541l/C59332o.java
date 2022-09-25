package com.google.common.p4541l;

import com.google.common.base.C58838bb;
import com.google.common.p4575r.C60757n;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.google.common.l.o */
/* compiled from: PG */
public final class C59332o {
    static {
        new C59330m();
    }

    /* renamed from: c */
    public static void m92212c(InputStream inputStream, byte[] bArr) {
        int length = bArr.length;
        int a = m92210a(inputStream, bArr, 0, length);
        if (a != length) {
            throw new EOFException("reached end of stream after reading " + a + " bytes; " + length + " bytes expected");
        }
    }

    /* renamed from: e */
    static byte[] m92214e(InputStream inputStream, long j) {
        C58838bb.m90872g(j >= 0, "expectedSize (%s) must be non-negative", j);
        if (j <= 2147483639) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = i;
            while (i2 > 0) {
                int i3 = i - i2;
                int read = inputStream.read(bArr, i3, i2);
                if (read == -1) {
                    return Arrays.copyOf(bArr, i3);
                }
                i2 -= read;
            }
            int read2 = inputStream.read();
            if (read2 == -1) {
                return bArr;
            }
            ArrayDeque arrayDeque = new ArrayDeque(22);
            arrayDeque.add(bArr);
            arrayDeque.add(new byte[]{(byte) read2});
            return m92217h(inputStream, arrayDeque, i + 1);
        }
        throw new OutOfMemoryError(j + " bytes is too large to fit in a byte array");
    }

    /* renamed from: f */
    public static C59331n m92215f() {
        return new C59331n(new ByteArrayOutputStream());
    }

    /* renamed from: g */
    private static byte[] m92216g(Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i) {
            return bArr;
        }
        int i2 = i - length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(i2, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - i2, min);
            i2 -= min;
        }
        return copyOf;
    }

    /* renamed from: h */
    private static byte[] m92217h(InputStream inputStream, Queue queue, int i) {
        int highestOneBit = Integer.highestOneBit(i);
        int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = inputStream.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return m92216g(queue, i);
                }
                i2 += read;
                i += read;
            }
            min = C60757n.m92748i(((long) min) * ((long) (min < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return m92216g(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: d */
    public static byte[] m92213d(InputStream inputStream) {
        inputStream.getClass();
        return m92217h(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: b */
    public static long m92211b(InputStream inputStream, OutputStream outputStream) {
        inputStream.getClass();
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: a */
    public static int m92210a(InputStream inputStream, byte[] bArr, int i, int i2) {
        inputStream.getClass();
        bArr.getClass();
        int i3 = 0;
        if (i2 >= 0) {
            C58838bb.m90882q(i, i + i2, bArr.length);
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", new Object[]{Integer.valueOf(i2)}));
    }
}
