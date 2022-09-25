package p5589m;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;
import p5462h.p5473f.p5475b.C69664n;
import p5589m.p5590a.C71821b;

/* renamed from: m.i */
/* compiled from: PG */
public class C71832i implements Serializable, Comparable {

    /* renamed from: a */
    public static final C71832i f191357a = new C71832i(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final byte[] f191358b;

    /* renamed from: c */
    public transient int f191359c;

    /* renamed from: d */
    public transient String f191360d;

    public C71832i(byte[] bArr) {
        C69664n.m101061g(bArr, "data");
        this.f191358b = bArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        C69664n.m101061g(objectInputStream, "<this>");
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            int i = 0;
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            C71832i iVar = new C71832i(bArr);
            Field declaredField = C71832i.class.getDeclaredField("b");
            declaredField.setAccessible(true);
            declaredField.set(this, iVar.f191358b);
            return;
        }
        throw new IllegalArgumentException("byteCount < 0: " + readInt);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f191358b.length);
        objectOutputStream.write(this.f191358b);
    }

    /* renamed from: a */
    public byte mo63093a(int i) {
        return this.f191358b[i];
    }

    /* renamed from: b */
    public int mo63094b() {
        return this.f191358b.length;
    }

    /* renamed from: c */
    public String mo63095c() {
        char[] cArr = new char[(r1 + r1)];
        int i = 0;
        for (byte b : this.f191358b) {
            int i2 = i + 1;
            cArr[i] = C71821b.f191351a[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = C71821b.f191351a[b & 15];
        }
        return new String(cArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r9) {
        /*
            r8 = this;
            m.i r9 = (p5589m.C71832i) r9
            java.lang.String r0 = "other"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r0)
            int r0 = r8.mo63094b()
            int r1 = r9.mo63094b()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0015:
            r5 = 1
            if (r4 >= r2) goto L_0x002c
            byte r6 = r8.mo63093a(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r7 = r9.mo63093a(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r6 != r7) goto L_0x0029
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0029:
            if (r6 < r7) goto L_0x0033
            goto L_0x0031
        L_0x002c:
            if (r0 != r1) goto L_0x002f
            goto L_0x0032
        L_0x002f:
            if (r0 < r1) goto L_0x0033
        L_0x0031:
            r3 = 1
        L_0x0032:
            return r3
        L_0x0033:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p5589m.C71832i.compareTo(java.lang.Object):int");
    }

    /* renamed from: d */
    public final String mo63097d() {
        String str = this.f191360d;
        if (str != null) {
            return str;
        }
        String a = C71823aa.m105125a(mo63102h());
        this.f191360d = a;
        return a;
    }

    /* renamed from: e */
    public C71832i mo63098e() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f191358b;
            int length = bArr.length;
            if (i >= length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr, length);
                C69664n.m101060f(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C71832i(copyOf);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r6 = (p5589m.C71832i) r6;
        r1 = r6.mo63094b();
        r3 = r5.f191358b;
        r4 = r3.length;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            goto L_0x001d
        L_0x0004:
            boolean r1 = r6 instanceof p5589m.C71832i
            r2 = 0
            if (r1 == 0) goto L_0x001c
            m.i r6 = (p5589m.C71832i) r6
            int r1 = r6.mo63094b()
            byte[] r3 = r5.f191358b
            int r4 = r3.length
            if (r1 != r4) goto L_0x001c
            boolean r6 = r6.mo63100f(r2, r3, r2, r4)
            if (r6 != 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            return r0
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p5589m.C71832i.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public boolean mo63100f(int i, byte[] bArr, int i2, int i3) {
        C69664n.m101061g(bArr, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f191358b;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C71824ab.m105128b(bArr2, i, bArr, i2, i3);
    }

    /* renamed from: g */
    public final boolean mo63101g(C71832i iVar) {
        C69664n.m101061g(iVar, "prefix");
        return mo63105j(iVar, iVar.mo63094b());
    }

    /* renamed from: h */
    public byte[] mo63102h() {
        return this.f191358b;
    }

    public int hashCode() {
        int i = this.f191359c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f191358b);
        this.f191359c = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    public byte[] mo63104i() {
        byte[] bArr = this.f191358b;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C69664n.m101060f(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: j */
    public boolean mo63105j(C71832i iVar, int i) {
        C69664n.m101061g(iVar, "other");
        return iVar.mo63100f(0, this.f191358b, 0, i);
    }

    /* renamed from: k */
    public void mo63106k(C71828e eVar, int i) {
        char[] cArr = C71821b.f191351a;
        eVar.mo63084t(this.f191358b, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
        if (r5 != 64) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        r6 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        if (r5 != 64) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008d, code lost:
        if (r5 != 64) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009b, code lost:
        if (r5 != 64) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ba, code lost:
        if (r5 != 64) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c4, code lost:
        if (r5 != 64) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d8, code lost:
        if (r5 != 64) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00db, code lost:
        if (r5 != 64) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e6, code lost:
        if (r5 != 64) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0112, code lost:
        if (r5 != 64) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x011d, code lost:
        if (r5 != 64) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0123, code lost:
        if (r5 != 64) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0131, code lost:
        if (r5 != 64) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0135, code lost:
        if (r5 != 64) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0139, code lost:
        if (r5 != 64) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x013d, code lost:
        if (r5 != 64) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            byte[] r1 = r0.f191358b
            int r2 = r1.length
            if (r2 != 0) goto L_0x000b
            java.lang.String r1 = "[size=0]"
            goto L_0x01ed
        L_0x000b:
            char[] r3 = p5589m.p5590a.C71821b.f191351a
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0010:
            r7 = 64
            r8 = -1
            if (r4 >= r2) goto L_0x0141
            byte r9 = r1[r4]
            if (r9 < 0) goto L_0x0051
            int r10 = r5 + 1
            if (r5 != r7) goto L_0x001f
            goto L_0x0141
        L_0x001f:
            r5 = 127(0x7f, float:1.78E-43)
            r11 = 32
            r12 = 13
            r13 = 10
            if (r9 == r13) goto L_0x0031
            if (r9 == r12) goto L_0x0031
            if (r9 >= r11) goto L_0x002e
            goto L_0x0065
        L_0x002e:
            if (r9 < r5) goto L_0x0031
            goto L_0x0065
        L_0x0031:
            int r6 = r6 + 1
            int r4 = r4 + 1
        L_0x0035:
            if (r4 >= r2) goto L_0x004f
            byte r9 = r1[r4]
            if (r9 < 0) goto L_0x004f
            int r4 = r4 + 1
            int r14 = r10 + 1
            if (r10 == r7) goto L_0x0141
            if (r9 == r13) goto L_0x004b
            if (r9 == r12) goto L_0x004b
            if (r9 >= r11) goto L_0x0048
            goto L_0x0065
        L_0x0048:
            if (r9 < r5) goto L_0x004b
            goto L_0x0065
        L_0x004b:
            int r6 = r6 + 1
            r10 = r14
            goto L_0x0035
        L_0x004f:
            r5 = r10
            goto L_0x0010
        L_0x0051:
            int r10 = r9 >> 5
            r11 = 65533(0xfffd, float:9.1831E-41)
            r12 = 65536(0x10000, float:9.18355E-41)
            r13 = -2
            r15 = 128(0x80, float:1.794E-43)
            r16 = 1
            if (r10 != r13) goto L_0x0090
            int r10 = r4 + 1
            if (r2 > r10) goto L_0x0068
            if (r5 == r7) goto L_0x0141
        L_0x0065:
            r6 = -1
            goto L_0x0141
        L_0x0068:
            byte r10 = r1[r10]
            r13 = r10 & 192(0xc0, float:2.69E-43)
            if (r13 != r15) goto L_0x008d
            r10 = r10 ^ 3968(0xf80, float:5.56E-42)
            int r9 = r9 << 6
            r9 = r9 ^ r10
            if (r9 >= r15) goto L_0x0078
            if (r5 == r7) goto L_0x0141
            goto L_0x0065
        L_0x0078:
            int r10 = r5 + 1
            if (r5 == r7) goto L_0x0141
            r5 = 160(0xa0, float:2.24E-43)
            if (r9 >= r5) goto L_0x0081
            goto L_0x0065
        L_0x0081:
            if (r9 != r11) goto L_0x0084
            goto L_0x0065
        L_0x0084:
            if (r9 >= r12) goto L_0x0088
            r14 = 1
            goto L_0x0089
        L_0x0088:
            r14 = 2
        L_0x0089:
            int r6 = r6 + r14
            int r4 = r4 + 2
            goto L_0x004f
        L_0x008d:
            if (r5 == r7) goto L_0x0141
            goto L_0x0065
        L_0x0090:
            int r10 = r9 >> 4
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r10 != r13) goto L_0x00de
            int r10 = r4 + 2
            if (r2 > r10) goto L_0x009e
            if (r5 == r7) goto L_0x0141
            goto L_0x0065
        L_0x009e:
            int r13 = r4 + 1
            byte r13 = r1[r13]
            r3 = r13 & 192(0xc0, float:2.69E-43)
            if (r3 != r15) goto L_0x00db
            byte r3 = r1[r10]
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r15) goto L_0x00d8
            r10 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r10
            int r10 = r13 << 6
            r3 = r3 ^ r10
            int r9 = r9 << 12
            r3 = r3 ^ r9
            r9 = 2048(0x800, float:2.87E-42)
            if (r3 >= r9) goto L_0x00bd
            if (r5 == r7) goto L_0x0141
            goto L_0x0065
        L_0x00bd:
            if (r3 < r14) goto L_0x00c7
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r3 >= r9) goto L_0x00c7
            if (r5 == r7) goto L_0x0141
            goto L_0x0065
        L_0x00c7:
            int r10 = r5 + 1
            if (r5 == r7) goto L_0x0141
            if (r3 != r11) goto L_0x00ce
            goto L_0x0065
        L_0x00ce:
            if (r3 >= r12) goto L_0x00d2
            r14 = 1
            goto L_0x00d3
        L_0x00d2:
            r14 = 2
        L_0x00d3:
            int r6 = r6 + r14
            int r4 = r4 + 3
            goto L_0x004f
        L_0x00d8:
            if (r5 == r7) goto L_0x0141
            goto L_0x0065
        L_0x00db:
            if (r5 == r7) goto L_0x0141
            goto L_0x0065
        L_0x00de:
            int r3 = r9 >> 3
            if (r3 != r13) goto L_0x013d
            int r3 = r4 + 3
            if (r2 > r3) goto L_0x00ea
            if (r5 == r7) goto L_0x0141
            goto L_0x0065
        L_0x00ea:
            int r10 = r4 + 1
            byte r10 = r1[r10]
            r11 = r10 & 192(0xc0, float:2.69E-43)
            if (r11 != r15) goto L_0x0139
            int r11 = r4 + 2
            byte r11 = r1[r11]
            r13 = r11 & 192(0xc0, float:2.69E-43)
            if (r13 != r15) goto L_0x0135
            byte r3 = r1[r3]
            r13 = r3 & 192(0xc0, float:2.69E-43)
            if (r13 != r15) goto L_0x0131
            r13 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r13
            int r11 = r11 << 6
            r3 = r3 ^ r11
            int r10 = r10 << 12
            r3 = r3 ^ r10
            int r9 = r9 << 18
            r3 = r3 ^ r9
            r9 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r9) goto L_0x0116
            if (r5 == r7) goto L_0x0141
            goto L_0x0065
        L_0x0116:
            if (r3 < r14) goto L_0x0121
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r3 >= r9) goto L_0x0121
            if (r5 == r7) goto L_0x0141
            goto L_0x0065
        L_0x0121:
            if (r3 >= r12) goto L_0x0127
            if (r5 == r7) goto L_0x0141
            goto L_0x0065
        L_0x0127:
            int r10 = r5 + 1
            if (r5 == r7) goto L_0x0141
            int r6 = r6 + 2
            int r4 = r4 + 4
            goto L_0x004f
        L_0x0131:
            if (r5 == r7) goto L_0x0141
            goto L_0x0065
        L_0x0135:
            if (r5 == r7) goto L_0x0141
            goto L_0x0065
        L_0x0139:
            if (r5 == r7) goto L_0x0141
            goto L_0x0065
        L_0x013d:
            if (r5 == r7) goto L_0x0141
            goto L_0x0065
        L_0x0141:
            java.lang.String r1 = "…]"
            java.lang.String r2 = "[size="
            java.lang.String r3 = "]"
            if (r6 != r8) goto L_0x0195
            byte[] r4 = r0.f191358b
            int r5 = r4.length
            if (r5 > r7) goto L_0x0165
            java.lang.String r1 = r17.mo63095c()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "[hex="
            r2.<init>(r4)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            goto L_0x01ed
        L_0x0165:
            m.i r3 = new m.i
            java.lang.String r6 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r6)
            r6 = 0
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r6, r7)
            java.lang.String r6 = "copyOfRange(this, fromIndex, toIndex)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)
            r3.<init>(r4)
            java.lang.String r3 = r3.mo63095c()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r5)
            java.lang.String r2 = " hex="
            r4.append(r2)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            goto L_0x01ed
        L_0x0195:
            java.lang.String r4 = r17.mo63097d()
            r5 = 0
            java.lang.String r5 = r4.substring(r5, r6)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r7)
            java.lang.String r7 = "\\"
            java.lang.String r8 = "\\\\"
            java.lang.String r5 = p5462h.p5483m.C69764m.m101231j(r5, r7, r8)
            java.lang.String r7 = "\n"
            java.lang.String r8 = "\\n"
            java.lang.String r5 = p5462h.p5483m.C69764m.m101231j(r5, r7, r8)
            java.lang.String r7 = "\r"
            java.lang.String r8 = "\\r"
            java.lang.String r5 = p5462h.p5483m.C69764m.m101231j(r5, r7, r8)
            int r4 = r4.length()
            if (r6 >= r4) goto L_0x01dc
            byte[] r3 = r0.f191358b
            int r3 = r3.length
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r3)
            java.lang.String r2 = " text="
            r4.append(r2)
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            goto L_0x01ed
        L_0x01dc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[text="
            r1.<init>(r2)
            r1.append(r5)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L_0x01ed:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p5589m.C71832i.toString():java.lang.String");
    }
}
