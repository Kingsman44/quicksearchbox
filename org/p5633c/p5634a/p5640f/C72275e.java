package org.p5633c.p5634a.p5640f;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;
import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.f.e */
/* compiled from: PG */
final class C72275e extends C72288l {
    private static final long serialVersionUID = 7811976468055766265L;

    /* renamed from: a */
    private final long[] f192371a;

    /* renamed from: f */
    private final int[] f192372f;

    /* renamed from: g */
    private final int[] f192373g;

    /* renamed from: h */
    private final String[] f192374h;

    /* renamed from: i */
    private final C72273c f192375i;

    private C72275e(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, C72273c cVar) {
        super(str);
        this.f192371a = jArr;
        this.f192372f = iArr;
        this.f192373g = iArr2;
        this.f192374h = strArr;
        this.f192375i = cVar;
    }

    /* renamed from: c */
    static C72275e m106741c(DataInput dataInput, String str) {
        int i;
        int readUnsignedShort = dataInput.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        for (int i2 = 0; i2 < readUnsignedShort; i2++) {
            strArr[i2] = dataInput.readUTF();
        }
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        int[] iArr = new int[readInt];
        int[] iArr2 = new int[readInt];
        String[] strArr2 = new String[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            jArr[i3] = C72277g.m106749a(dataInput);
            iArr[i3] = (int) C72277g.m106749a(dataInput);
            iArr2[i3] = (int) C72277g.m106749a(dataInput);
            if (readUnsignedShort < 256) {
                try {
                    i = dataInput.readUnsignedByte();
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IOException("Invalid encoding");
                }
            } else {
                i = dataInput.readUnsignedShort();
            }
            strArr2[i3] = strArr[i];
        }
        return new C72275e(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? new C72273c(str, (int) C72277g.m106749a(dataInput), C72276f.m106748a(dataInput), C72276f.m106748a(dataInput)) : null);
    }

    /* renamed from: a */
    public final int mo37823a(long j) {
        long[] jArr = this.f192371a;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.f192372f[binarySearch];
        }
        int i = binarySearch ^ -1;
        if (i >= jArr.length) {
            C72273c cVar = this.f192375i;
            if (cVar == null) {
                return this.f192372f[i - 1];
            }
            return cVar.mo37823a(j);
        } else if (i > 0) {
            return this.f192372f[i - 1];
        } else {
            return 0;
        }
    }

    /* renamed from: b */
    public final int mo37824b(long j) {
        long[] jArr = this.f192371a;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.f192373g[binarySearch];
        }
        int i = binarySearch ^ -1;
        if (i >= jArr.length) {
            C72273c cVar = this.f192375i;
            return cVar == null ? this.f192373g[i - 1] : cVar.f192362a;
        } else if (i > 0) {
            return this.f192373g[i - 1];
        } else {
            return 0;
        }
    }

    /* renamed from: d */
    public final long mo37826d(long j) {
        long[] jArr = this.f192371a;
        int binarySearch = Arrays.binarySearch(jArr, j);
        int i = binarySearch >= 0 ? binarySearch + 1 : binarySearch ^ -1;
        int length = jArr.length;
        if (i < length) {
            return jArr[i];
        }
        C72273c cVar = this.f192375i;
        if (cVar == null) {
            return j;
        }
        long j2 = jArr[length - 1];
        if (j < j2) {
            j = j2;
        }
        return cVar.mo37826d(j);
    }

    /* renamed from: e */
    public final long mo37827e(long j) {
        long[] jArr = this.f192371a;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            int i = binarySearch ^ -1;
            if (i < jArr.length) {
                if (i > 0) {
                    long j2 = jArr[i - 1];
                    if (j2 > Long.MIN_VALUE) {
                        return j2 - 1;
                    }
                }
                return j;
            }
            C72273c cVar = this.f192375i;
            if (cVar != null) {
                long e = cVar.mo37827e(j);
                if (e < j) {
                    return e;
                }
            }
            long j3 = jArr[i - 1];
            return j3 > Long.MIN_VALUE ? j3 - 1 : j;
        } else if (j > Long.MIN_VALUE) {
            return j - 1;
        } else {
            return Long.MIN_VALUE;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72275e) {
            C72275e eVar = (C72275e) obj;
            if (this.f192423d.equals(eVar.f192423d) && Arrays.equals(this.f192371a, eVar.f192371a) && Arrays.equals(this.f192374h, eVar.f192374h) && Arrays.equals(this.f192372f, eVar.f192372f) && Arrays.equals(this.f192373g, eVar.f192373g)) {
                C72273c cVar = this.f192375i;
                C72273c cVar2 = eVar.f192375i;
                if (cVar != null ? cVar.equals(cVar2) : cVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public final String mo37830g(long j) {
        long[] jArr = this.f192371a;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.f192374h[binarySearch];
        }
        int i = binarySearch ^ -1;
        if (i < jArr.length) {
            return i > 0 ? this.f192374h[i - 1] : "UTC";
        }
        C72273c cVar = this.f192375i;
        if (cVar == null) {
            return this.f192374h[i - 1];
        }
        return cVar.mo63654c(j).f192377b;
    }

    /* renamed from: h */
    public final boolean mo37831h() {
        return false;
    }
}
