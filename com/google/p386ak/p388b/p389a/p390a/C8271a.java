package com.google.p386ak.p388b.p389a.p390a;

import java.util.TimeZone;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.ak.b.a.a.a */
/* compiled from: PG */
public final class C8271a {

    /* renamed from: a */
    private static final TimeZone f29021a = DesugarTimeZone.getTimeZone("UTC");

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e7 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ce A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d6 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date m22983a(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            int r3 = r0 + 4
            int r0 = m22984b(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r4 = 45
            boolean r5 = m22985c(r1, r3, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            if (r5 == 0) goto L_0x0018
            int r3 = r3 + 1
        L_0x0018:
            int r5 = r3 + 2
            int r3 = m22984b(r1, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            boolean r6 = m22985c(r1, r5, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            if (r6 == 0) goto L_0x0026
            int r5 = r5 + 1
        L_0x0026:
            int r6 = r5 + 2
            int r5 = m22984b(r1, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r7 = 84
            boolean r7 = m22985c(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r8 = 0
            if (r7 != 0) goto L_0x004d
            int r9 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            if (r9 > r6) goto L_0x004d
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            int r3 = r3 + -1
            r4.<init>(r0, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r4.setLenient(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.util.Date r0 = r4.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            return r0
        L_0x004d:
            r9 = 43
            r10 = 90
            r11 = 2
            r12 = 1
            if (r7 == 0) goto L_0x00dd
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = m22984b(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r13 = 58
            boolean r14 = m22985c(r1, r7, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            if (r14 == 0) goto L_0x0067
            int r7 = r7 + 1
        L_0x0067:
            int r14 = r7 + 2
            int r7 = m22984b(r1, r7, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            boolean r13 = m22985c(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            if (r13 == 0) goto L_0x0075
            int r14 = r14 + 1
        L_0x0075:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            if (r13 <= r14) goto L_0x00da
            char r13 = r1.charAt(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            if (r13 == r10) goto L_0x00da
            if (r13 == r9) goto L_0x00da
            if (r13 == r4) goto L_0x00da
            int r13 = r14 + 2
            int r14 = m22984b(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r15 = 59
            if (r14 <= r15) goto L_0x0095
            r15 = 63
            if (r14 >= r15) goto L_0x0095
            r14 = 59
        L_0x0095:
            r15 = 46
            boolean r15 = m22985c(r1, r13, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            if (r15 == 0) goto L_0x00d6
            int r13 = r13 + 1
            int r15 = r13 + 1
        L_0x00a1:
            int r8 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            if (r15 >= r8) goto L_0x00b9
            char r8 = r1.charAt(r15)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r4 = 48
            if (r8 < r4) goto L_0x00be
            r4 = 57
            if (r8 <= r4) goto L_0x00b4
            goto L_0x00be
        L_0x00b4:
            int r15 = r15 + 1
            r4 = 45
            goto L_0x00a1
        L_0x00b9:
            int r4 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r15 = r4
        L_0x00be:
            int r4 = r13 + 3
            int r4 = java.lang.Math.min(r15, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            int r8 = m22984b(r1, r13, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            int r4 = r4 - r13
            if (r4 == r12) goto L_0x00d1
            if (r4 == r11) goto L_0x00ce
            goto L_0x00d3
        L_0x00ce:
            int r8 = r8 * 10
            goto L_0x00d3
        L_0x00d1:
            int r8 = r8 * 100
        L_0x00d3:
            r4 = r6
            r6 = r15
            goto L_0x00e1
        L_0x00d6:
            r4 = r6
            r6 = r13
            r8 = 0
            goto L_0x00e1
        L_0x00da:
            r4 = r6
            r6 = r14
            goto L_0x00df
        L_0x00dd:
            r4 = 0
            r7 = 0
        L_0x00df:
            r8 = 0
            r14 = 0
        L_0x00e1:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            if (r13 <= r6) goto L_0x01ce
            char r13 = r1.charAt(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r15 = 5
            if (r13 != r10) goto L_0x00f3
            java.util.TimeZone r9 = f29021a     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            int r6 = r6 + r12
            goto L_0x019c
        L_0x00f3:
            if (r13 == r9) goto L_0x0116
            r9 = 45
            if (r13 != r9) goto L_0x00fa
            goto L_0x0116
        L_0x00fa:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r3.append(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
        L_0x0116:
            java.lang.String r9 = r1.substring(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            int r10 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            if (r10 >= r15) goto L_0x0131
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r10.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r10.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.lang.String r9 = "00"
            r10.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.lang.String r9 = r10.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
        L_0x0131:
            int r10 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            int r6 = r6 + r10
            java.lang.String r10 = "+0000"
            boolean r10 = r10.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            if (r10 != 0) goto L_0x019a
            java.lang.String r10 = "+00:00"
            boolean r10 = r10.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            if (r10 == 0) goto L_0x0147
            goto L_0x019a
        L_0x0147:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r10.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.lang.String r13 = "GMT"
            r10.append(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r10.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.lang.String r9 = r10.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.util.TimeZone r10 = p3186j$.util.DesugarTimeZone.getTimeZone(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.lang.String r13 = r10.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            boolean r16 = r13.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            if (r16 != 0) goto L_0x0198
            java.lang.String r15 = ":"
            java.lang.String r11 = ""
            java.lang.String r11 = r13.replace(r15, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            boolean r11 = r11.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            if (r11 == 0) goto L_0x0175
            goto L_0x0198
        L_0x0175:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.lang.String r3 = r10.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r4.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.lang.String r5 = "Mismatching time zone indicator: "
            r4.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r4.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.lang.String r5 = " given, resolves to "
            r4.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r4.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.lang.String r3 = r4.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
        L_0x0198:
            r9 = r10
            goto L_0x019c
        L_0x019a:
            java.util.TimeZone r9 = f29021a     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
        L_0x019c:
            java.util.GregorianCalendar r10 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r10.<init>(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r9 = 0
            r10.setLenient(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r10.set(r12, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            int r3 = r3 + -1
            r0 = 2
            r10.set(r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r0 = 5
            r10.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r0 = 11
            r10.set(r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r0 = 12
            r10.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r0 = 13
            r10.set(r0, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r0 = 14
            r10.set(r0, r8)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.util.Date r0 = r10.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            return r0
        L_0x01ce:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01da, NumberFormatException -> 0x01d8, IllegalArgumentException -> 0x01d6 }
        L_0x01d6:
            r0 = move-exception
            goto L_0x01db
        L_0x01d8:
            r0 = move-exception
            goto L_0x01db
        L_0x01da:
            r0 = move-exception
        L_0x01db:
            if (r1 != 0) goto L_0x01df
            r1 = 0
            goto L_0x01f0
        L_0x01df:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\""
            r3.<init>(r4)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L_0x01f0:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01fc
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0217
        L_0x01fc:
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "("
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = ")"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L_0x0217:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to parse date ["
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            goto L_0x023b
        L_0x023a:
            throw r4
        L_0x023b:
            goto L_0x023a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p386ak.p388b.p389a.p390a.C8271a.m22983a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: b */
    private static int m22984b(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i3 = -digit;
            } else {
                throw new NumberFormatException("Invalid number: ".concat(String.valueOf(str.substring(i, i2))));
            }
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 >= 0) {
                i3 = (i3 * 10) - digit2;
                i4 = i5;
            } else {
                throw new NumberFormatException("Invalid number: ".concat(String.valueOf(str.substring(i, i2))));
            }
        }
        return -i3;
    }

    /* renamed from: c */
    private static boolean m22985c(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }
}
