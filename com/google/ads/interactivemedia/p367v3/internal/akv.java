package com.google.ads.interactivemedia.p367v3.internal;

import java.util.TimeZone;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akv */
/* compiled from: PG */
public final class akv {

    /* renamed from: a */
    private static final TimeZone f20840a = DesugarTimeZone.getTimeZone("UTC");

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e3 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ca A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d2 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date m18859a(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            int r3 = r0 + 4
            int r0 = m18861c(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r4 = 45
            boolean r5 = m18860b(r1, r3, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r5 == 0) goto L_0x0018
            int r3 = r3 + 1
        L_0x0018:
            int r5 = r3 + 2
            int r3 = m18861c(r1, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            boolean r6 = m18860b(r1, r5, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r6 == 0) goto L_0x0026
            int r5 = r5 + 1
        L_0x0026:
            int r6 = r5 + 2
            int r5 = m18861c(r1, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r7 = 84
            boolean r7 = m18860b(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r7 != 0) goto L_0x0049
            int r8 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r8 > r6) goto L_0x0049
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            int r3 = r3 + -1
            r4.<init>(r0, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.util.Date r0 = r4.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            return r0
        L_0x0049:
            r8 = 43
            r9 = 90
            r10 = 2
            r11 = 1
            if (r7 == 0) goto L_0x00d9
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = m18861c(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r13 = 58
            boolean r14 = m18860b(r1, r7, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r14 == 0) goto L_0x0063
            int r7 = r7 + 1
        L_0x0063:
            int r14 = r7 + 2
            int r7 = m18861c(r1, r7, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            boolean r13 = m18860b(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r13 == 0) goto L_0x0071
            int r14 = r14 + 1
        L_0x0071:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r13 <= r14) goto L_0x00d6
            char r13 = r1.charAt(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r13 == r9) goto L_0x00d6
            if (r13 == r8) goto L_0x00d6
            if (r13 == r4) goto L_0x00d6
            int r13 = r14 + 2
            int r14 = m18861c(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r15 = 59
            if (r14 <= r15) goto L_0x0091
            r15 = 63
            if (r14 >= r15) goto L_0x0091
            r14 = 59
        L_0x0091:
            r15 = 46
            boolean r15 = m18860b(r1, r13, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r15 == 0) goto L_0x00d2
            int r13 = r13 + 1
            int r15 = r13 + 1
        L_0x009d:
            int r12 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r15 >= r12) goto L_0x00b5
            char r12 = r1.charAt(r15)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r4 = 48
            if (r12 < r4) goto L_0x00ba
            r4 = 57
            if (r12 <= r4) goto L_0x00b0
            goto L_0x00ba
        L_0x00b0:
            int r15 = r15 + 1
            r4 = 45
            goto L_0x009d
        L_0x00b5:
            int r4 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r15 = r4
        L_0x00ba:
            int r4 = r13 + 3
            int r4 = java.lang.Math.min(r15, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            int r12 = m18861c(r1, r13, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            int r4 = r4 - r13
            if (r4 == r11) goto L_0x00cd
            if (r4 == r10) goto L_0x00ca
            goto L_0x00cf
        L_0x00ca:
            int r12 = r12 * 10
            goto L_0x00cf
        L_0x00cd:
            int r12 = r12 * 100
        L_0x00cf:
            r4 = r6
            r6 = r15
            goto L_0x00dd
        L_0x00d2:
            r4 = r6
            r6 = r13
            r12 = 0
            goto L_0x00dd
        L_0x00d6:
            r4 = r6
            r6 = r14
            goto L_0x00db
        L_0x00d9:
            r4 = 0
            r7 = 0
        L_0x00db:
            r12 = 0
            r14 = 0
        L_0x00dd:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r13 <= r6) goto L_0x01ca
            char r13 = r1.charAt(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r15 = 5
            if (r13 != r9) goto L_0x00ef
            java.util.TimeZone r8 = f20840a     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            int r6 = r6 + r11
            goto L_0x0198
        L_0x00ef:
            if (r13 == r8) goto L_0x0112
            r8 = 45
            if (r13 != r8) goto L_0x00f6
            goto L_0x0112
        L_0x00f6:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r3.append(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
        L_0x0112:
            java.lang.String r8 = r1.substring(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            int r9 = r8.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r9 >= r15) goto L_0x012d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r9.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r9.append(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r8 = "00"
            r9.append(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r8 = r9.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
        L_0x012d:
            int r9 = r8.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            int r6 = r6 + r9
            java.lang.String r9 = "+0000"
            boolean r9 = r9.equals(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r9 != 0) goto L_0x0196
            java.lang.String r9 = "+00:00"
            boolean r9 = r9.equals(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r9 == 0) goto L_0x0143
            goto L_0x0196
        L_0x0143:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r9.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r13 = "GMT"
            r9.append(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r9.append(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r8 = r9.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.util.TimeZone r9 = p3186j$.util.DesugarTimeZone.getTimeZone(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r13 = r9.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            boolean r16 = r13.equals(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r16 != 0) goto L_0x0194
            java.lang.String r15 = ":"
            java.lang.String r10 = ""
            java.lang.String r10 = r13.replace(r15, r10)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            boolean r10 = r10.equals(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            if (r10 == 0) goto L_0x0171
            goto L_0x0194
        L_0x0171:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r4 = "Mismatching time zone indicator: "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r3.append(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r4 = r9.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
        L_0x0194:
            r8 = r9
            goto L_0x0198
        L_0x0196:
            java.util.TimeZone r8 = f20840a     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
        L_0x0198:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r9.<init>(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r8 = 0
            r9.setLenient(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r9.set(r11, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            int r3 = r3 + -1
            r0 = 2
            r9.set(r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r0 = 5
            r9.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r0 = 11
            r9.set(r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r0 = 12
            r9.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r0 = 13
            r9.set(r0, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r0 = 14
            r9.set(r0, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.util.Date r0 = r9.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            return r0
        L_0x01ca:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d6, NumberFormatException -> 0x01d4, IllegalArgumentException -> 0x01d2 }
        L_0x01d2:
            r0 = move-exception
            goto L_0x01d7
        L_0x01d4:
            r0 = move-exception
            goto L_0x01d7
        L_0x01d6:
            r0 = move-exception
        L_0x01d7:
            if (r1 != 0) goto L_0x01db
            r1 = 0
            goto L_0x01ee
        L_0x01db:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\""
            r3.<init>(r4)
            r3.append(r1)
            r1 = 34
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x01ee:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01fa
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0215
        L_0x01fa:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "("
            r3.<init>(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0215:
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
            goto L_0x0239
        L_0x0238:
            throw r4
        L_0x0239:
            goto L_0x0238
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.akv.m18859a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: b */
    private static boolean m18860b(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* renamed from: c */
    private static int m18861c(String str, int i, int i2) {
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
}
