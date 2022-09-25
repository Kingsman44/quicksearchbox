package com.android.p261d.p263b;

import com.evernote.android.state.BuildConfig;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/* renamed from: com.android.d.b.i */
/* compiled from: PG */
public final class C5050i {

    /* renamed from: a */
    public static final Charset f16076a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final int[] f16077b;

    /* renamed from: c */
    public final short f16078c;

    /* renamed from: d */
    public final short f16079d;

    /* renamed from: e */
    public boolean f16080e;

    /* renamed from: f */
    public int f16081f;

    /* renamed from: g */
    public int f16082g;

    /* renamed from: h */
    public Object f16083h = null;

    /* renamed from: i */
    public int f16084i;

    static {
        int[] iArr = new int[11];
        f16077b = iArr;
        iArr[1] = 1;
        iArr[2] = 1;
        iArr[3] = 2;
        iArr[4] = 4;
        iArr[5] = 8;
        iArr[7] = 1;
        iArr[9] = 4;
        iArr[10] = 8;
        new SimpleDateFormat("yyyy:MM:dd kk:mm:ss");
    }

    public C5050i(short s, short s2, int i, int i2, boolean z) {
        this.f16078c = s;
        this.f16079d = s2;
        this.f16081f = i;
        this.f16080e = z;
        this.f16082g = i2;
    }

    /* renamed from: d */
    public static boolean m13867d(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
    }

    /* renamed from: e */
    public static boolean m13868e(short s) {
        return s == 1 || s == 2 || s == 3 || s == 4 || s == 5 || s == 7 || s == 9 || s == 10;
    }

    /* renamed from: i */
    private static String m13869i(short s) {
        switch (s) {
            case 1:
                return "UNSIGNED_BYTE";
            case 2:
                return "ASCII";
            case 3:
                return "UNSIGNED_SHORT";
            case 4:
                return "UNSIGNED_LONG";
            case 5:
                return "UNSIGNED_RATIONAL";
            case 7:
                return "UNDEFINED";
            case 9:
                return "LONG";
            case 10:
                return "RATIONAL";
            default:
                return BuildConfig.FLAVOR;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo10000a(int i) {
        Object obj = this.f16083h;
        if (obj instanceof long[]) {
            return ((long[]) obj)[i];
        }
        if (obj instanceof byte[]) {
            return (long) ((byte[]) obj)[i];
        }
        throw new IllegalArgumentException("Cannot get integer value from ".concat(m13869i(this.f16079d)));
    }

    /* renamed from: b */
    public final boolean mo10001b(int i) {
        return this.f16080e && this.f16081f != i;
    }

    /* renamed from: c */
    public final boolean mo10002c() {
        return this.f16083h != null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C5050i)) {
            C5050i iVar = (C5050i) obj;
            if (iVar.f16078c == this.f16078c && iVar.f16081f == this.f16081f && iVar.f16079d == this.f16079d) {
                Object obj2 = this.f16083h;
                if (obj2 != null) {
                    Object obj3 = iVar.f16083h;
                    if (obj3 == null) {
                        return false;
                    }
                    if (obj2 instanceof long[]) {
                        if (!(obj3 instanceof long[])) {
                            return false;
                        }
                        return Arrays.equals((long[]) obj2, (long[]) obj3);
                    } else if (obj2 instanceof C5052k[]) {
                        if (!(obj3 instanceof C5052k[])) {
                            return false;
                        }
                        return Arrays.equals((C5052k[]) obj2, (C5052k[]) obj3);
                    } else if (!(obj2 instanceof byte[])) {
                        return obj2.equals(obj3);
                    } else {
                        if (!(obj3 instanceof byte[])) {
                            return false;
                        }
                        return Arrays.equals((byte[]) obj2, (byte[]) obj3);
                    }
                } else if (iVar.f16083h == null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo10004f(byte[] bArr, int i) {
        if (!mo10001b(i)) {
            short s = this.f16079d;
            if (s == 1 || s == 7) {
                byte[] bArr2 = new byte[i];
                this.f16083h = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, i);
                this.f16081f = i;
            }
        }
    }

    /* renamed from: g */
    public final void mo10005g(int[] iArr) {
        int length = iArr.length;
        if (!mo10001b(length)) {
            short s = this.f16079d;
            int i = 0;
            if (s == 3) {
                int i2 = 0;
                while (i2 < length) {
                    int i3 = iArr[i2];
                    if (i3 <= 65535 && i3 >= 0) {
                        i2++;
                    } else {
                        return;
                    }
                }
            } else if (!(s == 9 || s == 4)) {
                return;
            }
            if (this.f16079d == 4) {
                int length2 = iArr.length;
                int i4 = 0;
                while (i4 < length2) {
                    if (iArr[i4] >= 0) {
                        i4++;
                    } else {
                        return;
                    }
                }
            }
            long[] jArr = new long[iArr.length];
            while (true) {
                int length3 = iArr.length;
                if (i < length3) {
                    jArr[i] = (long) iArr[i];
                    i++;
                } else {
                    this.f16083h = jArr;
                    this.f16081f = length3;
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo10006h(C5052k[] kVarArr) {
        int length = kVarArr.length;
        if (!mo10001b(length)) {
            short s = this.f16079d;
            int i = 0;
            if (s == 5) {
                int i2 = 0;
                while (i2 < length) {
                    C5052k kVar = kVarArr[i2];
                    if (kVar.f16088a >= 0 && kVar.f16089b >= 0) {
                        i2++;
                    } else {
                        return;
                    }
                }
            } else if (s != 10) {
                return;
            }
            if (this.f16079d == 10) {
                int length2 = kVarArr.length;
                while (i < length2) {
                    C5052k kVar2 = kVarArr[i];
                    long j = kVar2.f16088a;
                    long j2 = kVar2.f16089b;
                    if (j <= 2147483647L && j2 <= 2147483647L) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            this.f16083h = kVarArr;
            this.f16081f = kVarArr.length;
        }
    }

    public final String toString() {
        String format = String.format("tag id: %04X\n", new Object[]{Short.valueOf(this.f16078c)});
        int i = this.f16082g;
        short s = this.f16079d;
        String i2 = m13869i(s);
        int i3 = this.f16081f;
        int i4 = this.f16084i;
        Object obj = this.f16083h;
        String str = BuildConfig.FLAVOR;
        if (obj != null) {
            if (obj instanceof byte[]) {
                str = s == 2 ? new String((byte[]) obj, f16076a) : Arrays.toString((byte[]) obj);
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                str = jArr.length == 1 ? String.valueOf(jArr[0]) : Arrays.toString(jArr);
            } else if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        str = obj2.toString();
                    }
                } else {
                    str = Arrays.toString(objArr);
                }
            } else {
                str = obj.toString();
            }
        }
        return format + "ifd id: " + i + "\ntype: " + i2 + "\ncount: " + i3 + "\noffset: " + i4 + "\nvalue: " + str + "\n";
    }
}
