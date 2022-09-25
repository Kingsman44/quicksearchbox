package com.android.p266f.p267a.p268a;

import android.net.Uri;
import android.util.SparseArray;

/* renamed from: com.android.f.a.a.r */
/* compiled from: PG */
public final class C5133r {

    /* renamed from: a */
    public SparseArray f16340a;

    /* renamed from: b */
    public Uri f16341b;

    /* renamed from: c */
    private byte[] f16342c;

    static {
        "from-data".getBytes();
        "attachment".getBytes();
        "inline".getBytes();
    }

    public C5133r() {
        this.f16340a = null;
        this.f16341b = null;
        this.f16342c = null;
        this.f16340a = new SparseArray();
    }

    /* renamed from: a */
    public final void mo10178a(int i) {
        this.f16340a.put(129, Integer.valueOf(i));
    }

    /* renamed from: c */
    public final void mo10180c(byte[] bArr) {
        if (bArr != null) {
            this.f16340a.put(142, bArr);
            return;
        }
        throw new NullPointerException("null content-location");
    }

    /* renamed from: d */
    public final void mo10181d(byte[] bArr) {
        if (bArr != null) {
            this.f16340a.put(145, bArr);
            return;
        }
        throw new NullPointerException("null content-type");
    }

    /* renamed from: e */
    public final void mo10182e(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            this.f16342c = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
    }

    /* renamed from: f */
    public final byte[] mo10183f() {
        return (byte[]) this.f16340a.get(192);
    }

    /* renamed from: g */
    public final byte[] mo10184g() {
        return (byte[]) this.f16340a.get(142);
    }

    /* renamed from: h */
    public final byte[] mo10185h() {
        return (byte[]) this.f16340a.get(145);
    }

    /* renamed from: i */
    public final byte[] mo10186i() {
        byte[] bArr = this.f16342c;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* renamed from: j */
    public final byte[] mo10187j() {
        return (byte[]) this.f16340a.get(152);
    }

    /* renamed from: k */
    public final byte[] mo10188k() {
        return (byte[]) this.f16340a.get(151);
    }

    /* renamed from: b */
    public final void mo10179b(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            throw new IllegalArgumentException("Content-Id may not be null or empty.");
        } else if (length > 1 && ((char) bArr[0]) == '<' && ((char) bArr[length - 1]) == '>') {
            this.f16340a.put(192, bArr);
        } else {
            int i = length + 2;
            byte[] bArr2 = new byte[i];
            bArr2[0] = 60;
            bArr2[i - 1] = 62;
            System.arraycopy(bArr, 0, bArr2, 1, length);
            this.f16340a.put(192, bArr2);
        }
    }
}
