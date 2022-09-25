package com.android.p266f.p267a.p268a;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* renamed from: com.android.f.a.a.e */
/* compiled from: PG */
public final class C5120e implements Cloneable {

    /* renamed from: a */
    public int f16310a;

    /* renamed from: b */
    public byte[] f16311b;

    public C5120e(String str) {
        if (str != null) {
            this.f16310a = 106;
            try {
                this.f16311b = str.getBytes(C5118c.m13992a(106));
            } catch (UnsupportedEncodingException e) {
                Log.e("EncodedStringValue", "Input encoding 106 must be supported.", e);
                this.f16311b = str.getBytes();
            }
        } else {
            throw new NullPointerException("EncodedStringValue: Text-string is null");
        }
    }

    /* renamed from: e */
    public static C5120e[] m13993e(String[] strArr) {
        int length = strArr.length;
        if (length <= 0) {
            return null;
        }
        C5120e[] eVarArr = new C5120e[length];
        for (int i = 0; i < length; i++) {
            eVarArr[i] = new C5120e(strArr[i]);
        }
        return eVarArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:5|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        return new java.lang.String(r3.f16311b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        return new java.lang.String(r3.f16311b, "iso-8859-1");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0010 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo10143a() {
        /*
            r3 = this;
            int r0 = r3.f16310a
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = com.android.p266f.p267a.p268a.C5118c.m13992a(r0)     // Catch:{ UnsupportedEncodingException -> 0x0010 }
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0010 }
            byte[] r2 = r3.f16311b     // Catch:{ UnsupportedEncodingException -> 0x0010 }
            r1.<init>(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x0010 }
            return r1
        L_0x0010:
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x001a }
            byte[] r1 = r3.f16311b     // Catch:{ UnsupportedEncodingException -> 0x001a }
            java.lang.String r2 = "iso-8859-1"
            r0.<init>(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x001a }
            return r0
        L_0x001a:
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r3.f16311b
            r0.<init>(r1)
            return r0
        L_0x0022:
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r3.f16311b
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p266f.p267a.p268a.C5120e.mo10143a():java.lang.String");
    }

    /* renamed from: b */
    public final void mo10144b(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Text-string is null.");
        } else if (this.f16311b == null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            this.f16311b = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(this.f16311b);
                byteArrayOutputStream.write(bArr);
                this.f16311b = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                e.printStackTrace();
                throw new NullPointerException("appendTextString: failed when write a new Text-string");
            }
        }
    }

    /* renamed from: c */
    public final void mo10145c(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            this.f16311b = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return;
        }
        throw new NullPointerException("EncodedStringValue: Text-string is null.");
    }

    public final Object clone() {
        super.clone();
        byte[] bArr = this.f16311b;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        try {
            return new C5120e(this.f16310a, bArr2);
        } catch (Exception e) {
            Log.e("EncodedStringValue", "failed to clone an EncodedStringValue: ".concat(toString()));
            e.printStackTrace();
            throw new CloneNotSupportedException(e.getMessage());
        }
    }

    /* renamed from: d */
    public final byte[] mo10147d() {
        byte[] bArr = this.f16311b;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public C5120e(int i, byte[] bArr) {
        if (bArr != null) {
            this.f16310a = i;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            this.f16311b = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return;
        }
        throw new NullPointerException("EncodedStringValue: Text-string is null.");
    }
}
