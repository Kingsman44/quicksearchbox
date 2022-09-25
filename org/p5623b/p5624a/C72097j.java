package org.p5623b.p5624a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.p5623b.p5629b.C72123b;

/* renamed from: org.b.a.j */
/* compiled from: PG */
public class C72097j extends C72108u {

    /* renamed from: a */
    public byte[] f191923a;

    public C72097j(byte[] bArr) {
        if (bArr.length >= 4) {
            this.f191923a = bArr;
            if (!m105562l(0) || !m105562l(1) || !m105562l(2) || !m105562l(3)) {
                throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
            }
            return;
        }
        throw new IllegalArgumentException("GeneralizedTime string too short");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r3 = r0[r3];
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m105562l(int r3) {
        /*
            r2 = this;
            byte[] r0 = r2.f191923a
            int r1 = r0.length
            if (r1 <= r3) goto L_0x0011
            byte r3 = r0[r3]
            r0 = 48
            if (r3 < r0) goto L_0x0011
            r0 = 57
            if (r3 > r0) goto L_0x0011
            r3 = 1
            return r3
        L_0x0011:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5623b.p5624a.C72097j.m105562l(int):boolean");
    }

    /* renamed from: s */
    private static final String m105563s(int i) {
        if (i >= 10) {
            return Integer.toString(i);
        }
        return "0" + i;
    }

    /* renamed from: a */
    public int mo63217a() {
        int length = this.f191923a.length;
        return C72090ch.m105544a(length) + 1 + length;
    }

    /* renamed from: b */
    public void mo63218b(C72106s sVar, boolean z) {
        sVar.mo63301e(z, 24, this.f191923a);
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (!(uVar instanceof C72097j)) {
            return false;
        }
        return Arrays.equals(this.f191923a, ((C72097j) uVar).f191923a);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return false;
    }

    /* renamed from: e */
    public final String mo63282e(String str) {
        String str2;
        SimpleDateFormat simpleDateFormat;
        char charAt;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str2 = "-";
        } else {
            str2 = "+";
        }
        int i = rawOffset / 3600000;
        int i2 = (rawOffset - (3600000 * i)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                int i3 = 1;
                if (mo63283i()) {
                    String substring = str.substring(14);
                    int i4 = 1;
                    while (true) {
                        if (i4 >= substring.length() || (charAt = substring.charAt(i4)) < '0') {
                            break;
                        } else if (charAt > '9') {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    int i5 = i4 - 1;
                    if (i5 > 3) {
                        str = String.valueOf(str.substring(0, 14)).concat(String.valueOf(substring.substring(0, 4)).concat(String.valueOf(substring.substring(i4))));
                    } else if (i5 == 1) {
                        str = String.valueOf(str.substring(0, 14)).concat(substring.substring(0, i4) + "00" + substring.substring(i4));
                    } else if (i5 == 2) {
                        str = String.valueOf(str.substring(0, 14)).concat(substring.substring(0, i4) + "0" + substring.substring(i4));
                    }
                }
                if (mo63283i()) {
                    simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSSz");
                } else if (mo63285k()) {
                    simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
                } else if (mo63284j()) {
                    simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmz");
                } else {
                    simpleDateFormat = new SimpleDateFormat("yyyyMMddHHz");
                }
                simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
                if (timeZone.inDaylightTime(simpleDateFormat.parse(str + "GMT" + str2 + m105563s(i) + ":" + m105563s(i2)))) {
                    if (true != str2.equals("+")) {
                        i3 = -1;
                    }
                    i += i3;
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "GMT" + str2 + m105563s(i) + ":" + m105563s(i2);
    }

    /* renamed from: f */
    public C72108u mo63228f() {
        return new C72038ax(this.f191923a);
    }

    /* renamed from: h */
    public C72108u mo63229h() {
        return new C72038ax(this.f191923a);
    }

    public final int hashCode() {
        return C72123b.m105659a(this.f191923a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo63283i() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f191923a;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo63284j() {
        return m105562l(10) && m105562l(11);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo63285k() {
        return m105562l(12) && m105562l(13);
    }
}
