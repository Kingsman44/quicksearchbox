package androidx.camera.core.p069a.p070a;

import androidx.camera.core.C1477bw;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: androidx.camera.core.a.a.j */
/* compiled from: PG */
public final class C1279j {

    /* renamed from: a */
    static final List f3691a = Collections.list(new C1276g());

    /* renamed from: d */
    private static final Pattern f3692d = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: e */
    private static final Pattern f3693e = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: f */
    private static final Pattern f3694f = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: b */
    public final List f3695b = Collections.list(new C1277h());

    /* renamed from: c */
    public final ByteOrder f3696c;

    public C1279j(ByteOrder byteOrder) {
        this.f3696c = byteOrder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        java.lang.Double.parseDouble(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014d, code lost:
        return new android.util.Pair(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0153, code lost:
        return new android.util.Pair(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x013f */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair m3453f(java.lang.String r10) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r10.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a7
            java.lang.String[] r10 = r10.split(r0, r6)
            r0 = r10[r2]
            android.util.Pair r0 = m3453f(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 == r4) goto L_0x00a6
        L_0x0028:
            int r1 = r10.length
            if (r3 >= r1) goto L_0x00a6
            r1 = r10[r3]
            android.util.Pair r1 = m3453f(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004c
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r2 = -1
            goto L_0x0054
        L_0x004c:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0054:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x007f
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0076
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x007f
        L_0x0076:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0080
        L_0x007f:
            r1 = -1
        L_0x0080:
            if (r2 != r6) goto L_0x008c
            if (r1 == r6) goto L_0x0086
            r2 = -1
            goto L_0x008c
        L_0x0086:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        L_0x008c:
            if (r2 != r6) goto L_0x0098
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a3
        L_0x0098:
            if (r1 != r6) goto L_0x00a3
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a3:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x00a6:
            return r0
        L_0x00a7:
            java.lang.String r0 = "/"
            boolean r1 = r10.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0106
            java.lang.String[] r10 = r10.split(r0, r6)
            int r0 = r10.length
            if (r0 != r4) goto L_0x0100
            r0 = r10[r2]     // Catch:{ NumberFormatException -> 0x0100 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0100 }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x0100 }
            r10 = r10[r3]     // Catch:{ NumberFormatException -> 0x0100 }
            double r2 = java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x0100 }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x0100 }
            r10 = 10
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x00f6
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d1
            goto L_0x00f6
        L_0x00d1:
            r4 = 5
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x00ec
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00de
            goto L_0x00ec
        L_0x00de:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0100 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0100 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0100 }
            r0.<init>(r10, r1)     // Catch:{ NumberFormatException -> 0x0100 }
            return r0
        L_0x00ec:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0100 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0100 }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x0100 }
            return r10
        L_0x00f6:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x0100 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0100 }
            r0.<init>(r10, r7)     // Catch:{ NumberFormatException -> 0x0100 }
            return r0
        L_0x0100:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        L_0x0106:
            long r0 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x013f }
            r2 = 4
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0125
            r3 = 65535(0xffff, double:3.23786E-319)
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x0125
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013f }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x013f }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x013f }
            return r0
        L_0x0125:
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x0135
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013f }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013f }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013f }
            return r0
        L_0x0135:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x013f }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013f }
            return r0
        L_0x013f:
            java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x014e }
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014e }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r10
        L_0x014e:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p069a.p070a.C1279j.m3453f(java.lang.String):android.util.Pair");
    }

    /* renamed from: a */
    public final void mo4139a(String str, String str2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        mo4140b(str, str2, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if (r8 != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r8 != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0182, code lost:
        if (r7 != r0) goto L_0x0343;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4140b(java.lang.String r20, java.lang.String r21, java.util.List r22) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            r3 = r22
            java.lang.String r4 = "DateTime"
            boolean r4 = r4.equals(r0)
            java.lang.String r5 = "ExifData"
            java.lang.String r6 = " : "
            java.lang.String r7 = "Invalid value for "
            if (r4 != 0) goto L_0x0026
            java.lang.String r4 = "DateTimeOriginal"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0026
            java.lang.String r4 = "DateTimeDigitized"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x006a
        L_0x0026:
            if (r2 == 0) goto L_0x006a
            java.util.regex.Pattern r4 = f3693e
            java.util.regex.Matcher r4 = r4.matcher(r2)
            boolean r4 = r4.find()
            java.util.regex.Pattern r8 = f3694f
            java.util.regex.Matcher r8 = r8.matcher(r2)
            boolean r8 = r8.find()
            int r9 = r21.length()
            r10 = 19
            if (r9 != r10) goto L_0x0054
            if (r4 != 0) goto L_0x0049
            if (r8 == 0) goto L_0x0054
            goto L_0x004b
        L_0x0049:
            if (r8 == 0) goto L_0x006a
        L_0x004b:
            java.lang.String r4 = "-"
            java.lang.String r8 = ":"
            java.lang.String r2 = r2.replaceAll(r4, r8)
            goto L_0x006a
        L_0x0054:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r7)
            r3.append(r0)
            r3.append(r6)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            androidx.camera.core.C1477bw.m3983f(r5, r0)
            return
        L_0x006a:
            java.lang.String r4 = "ISOSpeedRatings"
            boolean r4 = r4.equals(r0)
            r8 = 1
            if (r8 != r4) goto L_0x0075
            java.lang.String r0 = "PhotographicSensitivity"
        L_0x0075:
            r4 = r0
            r0 = 2
            r9 = 3
            if (r2 == 0) goto L_0x011c
            java.util.HashSet r10 = androidx.camera.core.p069a.p070a.C1280k.f3699c
            boolean r10 = r10.contains(r4)
            if (r10 == 0) goto L_0x011c
            java.lang.String r10 = "GPSTimeStamp"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x00ed
            java.util.regex.Pattern r10 = f3692d
            java.util.regex.Matcher r10 = r10.matcher(r2)
            boolean r11 = r10.find()
            if (r11 != 0) goto L_0x00ac
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            r0.append(r4)
            r0.append(r6)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            androidx.camera.core.C1477bw.m3983f(r5, r0)
            return
        L_0x00ac:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = r10.group(r8)
            r5.getClass()
            int r5 = java.lang.Integer.parseInt(r5)
            r2.append(r5)
            java.lang.String r5 = "/1,"
            r2.append(r5)
            java.lang.String r6 = r10.group(r0)
            r6.getClass()
            int r6 = java.lang.Integer.parseInt(r6)
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = r10.group(r9)
            r5.getClass()
            int r5 = java.lang.Integer.parseInt(r5)
            r2.append(r5)
            java.lang.String r5 = "/1"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            goto L_0x011c
        L_0x00ed:
            double r10 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x0105 }
            androidx.camera.core.a.a.n r12 = new androidx.camera.core.a.a.n     // Catch:{ NumberFormatException -> 0x0105 }
            r13 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r10 = r10 * r13
            long r10 = (long) r10     // Catch:{ NumberFormatException -> 0x0105 }
            r13 = 10000(0x2710, double:4.9407E-320)
            r12.<init>(r10, r13)     // Catch:{ NumberFormatException -> 0x0105 }
            java.lang.String r2 = r12.toString()     // Catch:{ NumberFormatException -> 0x0105 }
            goto L_0x011c
        L_0x0105:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r7)
            r3.append(r4)
            r3.append(r6)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            androidx.camera.core.C1477bw.m3984g(r5, r2, r0)
            return
        L_0x011c:
            r5 = 0
            r6 = 0
        L_0x011e:
            int r7 = androidx.camera.core.p069a.p070a.C1280k.f3700e
            r7 = 4
            if (r6 >= r7) goto L_0x034b
            java.util.List r7 = f3691a
            java.lang.Object r7 = r7.get(r6)
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.Object r7 = r7.get(r4)
            androidx.camera.core.a.a.m r7 = (androidx.camera.core.p069a.p070a.C1282m) r7
            if (r7 == 0) goto L_0x0343
            if (r2 != 0) goto L_0x0140
            java.lang.Object r7 = r3.get(r6)
            java.util.Map r7 = (java.util.Map) r7
            r7.remove(r4)
            goto L_0x0343
        L_0x0140:
            android.util.Pair r10 = m3453f(r2)
            int r11 = r7.f3716c
            java.lang.Object r12 = r10.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r13 = -1
            if (r11 == r12) goto L_0x0185
            int r11 = r7.f3716c
            java.lang.Object r12 = r10.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 != r12) goto L_0x015e
            goto L_0x0185
        L_0x015e:
            int r11 = r7.f3717d
            if (r11 == r13) goto L_0x017b
            java.lang.Object r12 = r10.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 == r12) goto L_0x0178
            int r11 = r7.f3717d
            java.lang.Object r10 = r10.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r11 != r10) goto L_0x017b
        L_0x0178:
            int r7 = r7.f3717d
            goto L_0x0187
        L_0x017b:
            int r7 = r7.f3716c
            if (r7 == r8) goto L_0x0187
            r10 = 7
            if (r7 == r10) goto L_0x0187
            if (r7 != r0) goto L_0x0343
            goto L_0x0187
        L_0x0185:
            int r7 = r7.f3716c
        L_0x0187:
            java.lang.String r10 = "/"
            java.lang.String r11 = ","
            switch(r7) {
                case 1: goto L_0x0334;
                case 2: goto L_0x0325;
                case 3: goto L_0x02dc;
                case 4: goto L_0x02b4;
                case 5: goto L_0x0249;
                case 6: goto L_0x018e;
                case 7: goto L_0x0325;
                case 8: goto L_0x018e;
                case 9: goto L_0x0200;
                case 10: goto L_0x0190;
                default: goto L_0x018e;
            }
        L_0x018e:
            goto L_0x0343
        L_0x0190:
            java.lang.String[] r7 = r2.split(r11, r13)
            int r11 = r7.length
            androidx.camera.core.a.a.n[] r12 = new androidx.camera.core.p069a.p070a.C1283n[r11]
            r14 = 0
        L_0x0198:
            int r15 = r7.length
            if (r14 >= r15) goto L_0x01c4
            r15 = r7[r14]
            java.lang.String[] r15 = r15.split(r10, r13)
            androidx.camera.core.a.a.n r0 = new androidx.camera.core.a.a.n
            r16 = r15[r5]
            r17 = r10
            double r9 = java.lang.Double.parseDouble(r16)
            long r9 = (long) r9
            r15 = r15[r8]
            r18 = r6
            double r5 = java.lang.Double.parseDouble(r15)
            long r5 = (long) r5
            r0.<init>(r9, r5)
            r12[r14] = r0
            int r14 = r14 + 1
            r10 = r17
            r6 = r18
            r0 = 2
            r5 = 0
            r9 = 3
            goto L_0x0198
        L_0x01c4:
            r5 = r6
            java.lang.Object r0 = r3.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            java.nio.ByteOrder r6 = r1.f3696c
            int[] r7 = androidx.camera.core.p069a.p070a.C1275f.f3683c
            r9 = 10
            r7 = r7[r9]
            int r7 = r7 * r11
            byte[] r7 = new byte[r7]
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)
            r7.order(r6)
            r6 = 0
        L_0x01df:
            if (r6 >= r11) goto L_0x01f2
            r10 = r12[r6]
            long r13 = r10.f3718a
            int r14 = (int) r13
            r7.putInt(r14)
            long r13 = r10.f3719b
            int r10 = (int) r13
            r7.putInt(r10)
            int r6 = r6 + 1
            goto L_0x01df
        L_0x01f2:
            androidx.camera.core.a.a.f r6 = new androidx.camera.core.a.a.f
            byte[] r7 = r7.array()
            r6.<init>(r9, r11, r7)
            r0.put(r4, r6)
            goto L_0x02da
        L_0x0200:
            r5 = r6
            java.lang.String[] r0 = r2.split(r11, r13)
            int r6 = r0.length
            int[] r7 = new int[r6]
            r9 = 0
        L_0x0209:
            int r10 = r0.length
            if (r9 >= r10) goto L_0x0217
            r10 = r0[r9]
            int r10 = java.lang.Integer.parseInt(r10)
            r7[r9] = r10
            int r9 = r9 + 1
            goto L_0x0209
        L_0x0217:
            java.lang.Object r0 = r3.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            java.nio.ByteOrder r9 = r1.f3696c
            int[] r10 = androidx.camera.core.p069a.p070a.C1275f.f3683c
            r11 = 9
            r10 = r10[r11]
            int r10 = r10 * r6
            byte[] r10 = new byte[r10]
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r10)
            r10.order(r9)
            r9 = 0
        L_0x0231:
            if (r9 >= r6) goto L_0x023b
            r12 = r7[r9]
            r10.putInt(r12)
            int r9 = r9 + 1
            goto L_0x0231
        L_0x023b:
            androidx.camera.core.a.a.f r7 = new androidx.camera.core.a.a.f
            byte[] r9 = r10.array()
            r7.<init>(r11, r6, r9)
            r0.put(r4, r7)
            goto L_0x02da
        L_0x0249:
            r5 = r6
            r17 = r10
            java.lang.String[] r0 = r2.split(r11, r13)
            int r6 = r0.length
            androidx.camera.core.a.a.n[] r7 = new androidx.camera.core.p069a.p070a.C1283n[r6]
            r9 = 0
        L_0x0254:
            int r10 = r0.length
            if (r9 >= r10) goto L_0x027b
            r10 = r0[r9]
            r11 = r17
            java.lang.String[] r10 = r10.split(r11, r13)
            androidx.camera.core.a.a.n r12 = new androidx.camera.core.a.a.n
            r14 = 0
            r15 = r10[r14]
            double r14 = java.lang.Double.parseDouble(r15)
            long r14 = (long) r14
            r10 = r10[r8]
            r18 = r9
            double r8 = java.lang.Double.parseDouble(r10)
            long r8 = (long) r8
            r12.<init>(r14, r8)
            r7[r18] = r12
            int r9 = r18 + 1
            r8 = 1
            goto L_0x0254
        L_0x027b:
            java.lang.Object r0 = r3.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            java.nio.ByteOrder r8 = r1.f3696c
            int[] r9 = androidx.camera.core.p069a.p070a.C1275f.f3683c
            r10 = 5
            r9 = r9[r10]
            int r9 = r9 * r6
            byte[] r9 = new byte[r9]
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
            r9.order(r8)
            r8 = 0
        L_0x0294:
            if (r8 >= r6) goto L_0x02a7
            r11 = r7[r8]
            long r12 = r11.f3718a
            int r13 = (int) r12
            r9.putInt(r13)
            long r11 = r11.f3719b
            int r12 = (int) r11
            r9.putInt(r12)
            int r8 = r8 + 1
            goto L_0x0294
        L_0x02a7:
            androidx.camera.core.a.a.f r7 = new androidx.camera.core.a.a.f
            byte[] r8 = r9.array()
            r7.<init>(r10, r6, r8)
            r0.put(r4, r7)
            goto L_0x02da
        L_0x02b4:
            r5 = r6
            java.lang.String[] r0 = r2.split(r11, r13)
            int r6 = r0.length
            long[] r6 = new long[r6]
            r7 = 0
        L_0x02bd:
            int r8 = r0.length
            if (r7 >= r8) goto L_0x02cb
            r8 = r0[r7]
            long r8 = java.lang.Long.parseLong(r8)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x02bd
        L_0x02cb:
            java.lang.Object r0 = r3.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            java.nio.ByteOrder r7 = r1.f3696c
            androidx.camera.core.a.a.f r6 = androidx.camera.core.p069a.p070a.C1275f.m3451e(r6, r7)
            r0.put(r4, r6)
        L_0x02da:
            r9 = 3
            goto L_0x0344
        L_0x02dc:
            r5 = r6
            java.lang.String[] r0 = r2.split(r11, r13)
            int r6 = r0.length
            int[] r7 = new int[r6]
            r8 = 0
        L_0x02e5:
            int r9 = r0.length
            if (r8 >= r9) goto L_0x02f3
            r9 = r0[r8]
            int r9 = java.lang.Integer.parseInt(r9)
            r7[r8] = r9
            int r8 = r8 + 1
            goto L_0x02e5
        L_0x02f3:
            java.lang.Object r0 = r3.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            java.nio.ByteOrder r8 = r1.f3696c
            int[] r9 = androidx.camera.core.p069a.p070a.C1275f.f3683c
            r10 = 3
            r9 = r9[r10]
            int r9 = r9 * r6
            byte[] r9 = new byte[r9]
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
            r9.order(r8)
            r8 = 0
        L_0x030c:
            if (r8 >= r6) goto L_0x0317
            r10 = r7[r8]
            short r10 = (short) r10
            r9.putShort(r10)
            int r8 = r8 + 1
            goto L_0x030c
        L_0x0317:
            androidx.camera.core.a.a.f r7 = new androidx.camera.core.a.a.f
            byte[] r8 = r9.array()
            r9 = 3
            r7.<init>(r9, r6, r8)
            r0.put(r4, r7)
            goto L_0x0344
        L_0x0325:
            r5 = r6
            java.lang.Object r0 = r3.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            androidx.camera.core.a.a.f r6 = androidx.camera.core.p069a.p070a.C1275f.m3449c(r2)
            r0.put(r4, r6)
            goto L_0x0344
        L_0x0334:
            r5 = r6
            java.lang.Object r0 = r3.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            androidx.camera.core.a.a.f r6 = androidx.camera.core.p069a.p070a.C1275f.m3448b(r2)
            r0.put(r4, r6)
            goto L_0x0344
        L_0x0343:
            r5 = r6
        L_0x0344:
            int r6 = r5 + 1
            r0 = 2
            r5 = 0
            r8 = 1
            goto L_0x011e
        L_0x034b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p069a.p070a.C1279j.mo4140b(java.lang.String, java.lang.String, java.util.List):void");
    }

    /* renamed from: c */
    public final void mo4141c(int i) {
        int i2;
        if (i == 0) {
            i2 = 1;
        } else if (i == 90) {
            i2 = 6;
        } else if (i == 180) {
            i2 = 3;
        } else if (i != 270) {
            C1477bw.m3983f("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
            i2 = 0;
        } else {
            i2 = 8;
        }
        mo4140b("Orientation", String.valueOf(i2), this.f3695b);
    }

    /* renamed from: d */
    public final void mo4142d(int i) {
        mo4140b("ImageLength", String.valueOf(i), this.f3695b);
    }

    /* renamed from: e */
    public final void mo4143e(int i) {
        mo4140b("ImageWidth", String.valueOf(i), this.f3695b);
    }
}
