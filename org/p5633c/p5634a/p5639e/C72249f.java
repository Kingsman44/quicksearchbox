package org.p5633c.p5634a.p5639e;

import java.io.IOException;
import java.util.Locale;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.p5638d.C72221k;
import org.p5633c.p5634a.p5638d.C72223m;

/* renamed from: org.c.a.e.f */
/* compiled from: PG */
final class C72249f implements C72265v, C72261r {

    /* renamed from: a */
    protected final int f192241a;

    /* renamed from: b */
    protected final int f192242b;

    /* renamed from: c */
    private final C72283g f192243c;

    protected C72249f(C72283g gVar, int i, int i2) {
        this.f192243c = gVar;
        i2 = i2 > 18 ? 18 : i2;
        this.f192241a = i;
        this.f192242b = i2;
    }

    /* renamed from: a */
    public final int mo63604a() {
        return this.f192242b;
    }

    /* renamed from: b */
    public final int mo63605b() {
        return this.f192242b;
    }

    /* renamed from: c */
    public final int mo63606c(C72264u uVar, String str, int i) {
        C72233e a = this.f192243c.mo63646a(uVar.f192278a);
        int min = Math.min(this.f192242b, str.length() - i);
        long e = a.mo63464A().mo63488e() * 10;
        long j = 0;
        int i2 = 0;
        while (i2 < min) {
            char charAt = str.charAt(i + i2);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i2++;
            e /= 10;
            j += ((long) (charAt - '0')) * e;
        }
        long j2 = j / 10;
        if (i2 == 0) {
            return i ^ -1;
        }
        if (j2 > 2147483647L) {
            return i ^ -1;
        }
        uVar.mo63639c(new C72262s(new C72223m(C72283g.f192409y, C72221k.f192190a, a.mo63464A()), (int) j2));
        return i + i2;
    }

    /* renamed from: d */
    public final void mo63607d(StringBuffer stringBuffer, C72151ai aiVar, Locale locale) {
        try {
            mo63609f(stringBuffer, aiVar.mo63439f().mo63343U(aiVar), aiVar.mo63439f());
        } catch (IOException unused) {
        }
    }

    /* renamed from: e */
    public final void mo63608e(StringBuffer stringBuffer, long j, C72132a aVar, int i, C72288l lVar, Locale locale) {
        try {
            mo63609f(stringBuffer, j, aVar);
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo63609f(StringBuffer stringBuffer, long j, C72132a aVar) {
        long j2;
        String str;
        C72233e a = this.f192243c.mo63646a(aVar);
        int i = this.f192241a;
        try {
            long n = a.mo63451n(j);
            if (n == 0) {
                while (true) {
                    i--;
                    if (i >= 0) {
                        stringBuffer.append('0');
                    } else {
                        return;
                    }
                }
            } else {
                long e = a.mo63464A().mo63488e();
                int i2 = this.f192242b;
                while (true) {
                    switch (i2) {
                        case 1:
                            j2 = 10;
                            break;
                        case 2:
                            j2 = 100;
                            break;
                        case 3:
                            j2 = 1000;
                            break;
                        case 4:
                            j2 = 10000;
                            break;
                        case 5:
                            j2 = 100000;
                            break;
                        case 6:
                            j2 = 1000000;
                            break;
                        case 7:
                            j2 = 10000000;
                            break;
                        case 8:
                            j2 = 100000000;
                            break;
                        case 9:
                            j2 = 1000000000;
                            break;
                        case 10:
                            j2 = 10000000000L;
                            break;
                        case 11:
                            j2 = 100000000000L;
                            break;
                        case 12:
                            j2 = 1000000000000L;
                            break;
                        case 13:
                            j2 = 10000000000000L;
                            break;
                        case 14:
                            j2 = 100000000000000L;
                            break;
                        case 15:
                            j2 = 1000000000000000L;
                            break;
                        case 16:
                            j2 = 10000000000000000L;
                            break;
                        case 17:
                            j2 = 100000000000000000L;
                            break;
                        case 18:
                            j2 = 1000000000000000000L;
                            break;
                        default:
                            j2 = 1;
                            break;
                    }
                    if ((e * j2) / j2 == e) {
                        long j3 = (n * j2) / e;
                        int i3 = (int) ((long) i2);
                        if ((2147483647L & j3) == j3) {
                            str = Integer.toString((int) j3);
                        } else {
                            str = Long.toString(j3);
                        }
                        int length = str.length();
                        while (length < i3) {
                            stringBuffer.append('0');
                            i--;
                            i3--;
                        }
                        if (i < i3) {
                            while (i < i3 && length > 1) {
                                int i4 = length - 1;
                                if (str.charAt(i4) == '0') {
                                    i3--;
                                    length = i4;
                                }
                            }
                            if (length < str.length()) {
                                for (int i5 = 0; i5 < length; i5++) {
                                    stringBuffer.append(str.charAt(i5));
                                }
                                return;
                            }
                        }
                        stringBuffer.append(str);
                        return;
                    }
                    i2--;
                }
            }
        } catch (RuntimeException unused) {
            C72260q.m106634c(stringBuffer, i);
        }
    }
}
