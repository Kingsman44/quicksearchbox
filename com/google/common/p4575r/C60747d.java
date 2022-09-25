package com.google.common.p4575r;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.common.r.d */
/* compiled from: PG */
public final class C60747d {
    /* renamed from: a */
    public static int m92719a(byte[] bArr, byte b, int i, int i2) {
        while (i < i2) {
            if (bArr[i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public static List m92720b(byte... bArr) {
        int length = bArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new C60746c(bArr, 0, length);
    }

    /* renamed from: c */
    public static byte[] m92721c(byte[]... bArr) {
        int i = 0;
        for (byte[] length : bArr) {
            i += length.length;
        }
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i2, length2);
            i2 += length2;
        }
        return bArr2;
    }

    /* renamed from: d */
    public static byte[] m92722d(Collection collection) {
        if (collection instanceof C60746c) {
            C60746c cVar = (C60746c) collection;
            return Arrays.copyOfRange(cVar.f164788a, cVar.f164789b, cVar.f164790c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            bArr[i] = ((Number) obj).byteValue();
        }
        return bArr;
    }
}
