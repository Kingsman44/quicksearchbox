package com.google.common.util;

import com.google.common.p4541l.C59332o;
import com.google.common.p4575r.C60747d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.common.util.b */
/* compiled from: PG */
public final class C60789b {
    /* renamed from: a */
    public static byte[] m92791a(byte[] bArr, int i) {
        GZIPOutputStream gZIPOutputStream;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr, 0, i);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            C60788a.m92790a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public static byte[] m92792b(byte[] bArr, int i) {
        GZIPInputStream gZIPInputStream;
        int read;
        int i2 = i - 4;
        int i3 = i < 4 ? 0 : ((bArr[i2 + 3] & 255) << 24) + ((bArr[i2 + 2] & 255) << 16) + ((bArr[i2 + 1] & 255) << 8) + (bArr[i2] & 255);
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr, 0, i), Math.min(Math.max(i3, i) + 10, 8192));
            if (i3 <= 10000000) {
                byte[] bArr2 = new byte[i3];
                int i4 = 0;
                while (i4 < i3 && (read = gZIPInputStream.read(bArr2, i4, i3 - i4)) != -1) {
                    i4 += read;
                }
                if (i4 < i3) {
                    byte[] copyOf = Arrays.copyOf(bArr2, i4);
                    gZIPInputStream.close();
                    return copyOf;
                }
                int read2 = gZIPInputStream.read();
                if (read2 == -1) {
                    gZIPInputStream.close();
                    return bArr2;
                }
                byte[] c = C60747d.m92721c(bArr2, new byte[]{(byte) read2}, C59332o.m92213d(gZIPInputStream));
                gZIPInputStream.close();
                return c;
            }
            byte[] d = C59332o.m92213d(gZIPInputStream);
            gZIPInputStream.close();
            return d;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            C60788a.m92790a(th, th);
        }
        throw th;
    }
}
