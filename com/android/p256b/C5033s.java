package com.android.p256b;

import android.text.TextUtils;
import android.text.format.Time;
import android.util.Log;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import java.util.HashMap;

/* renamed from: com.android.b.s */
/* compiled from: PG */
public final class C5033s {

    /* renamed from: B */
    private static final HashMap f15884B;

    /* renamed from: a */
    public static final HashMap f15885a;

    /* renamed from: b */
    public static final HashMap f15886b;

    /* renamed from: A */
    public int f15887A;

    /* renamed from: c */
    public Time f15888c;

    /* renamed from: d */
    public int f15889d;

    /* renamed from: e */
    public String f15890e;

    /* renamed from: f */
    public int f15891f;

    /* renamed from: g */
    public int f15892g;

    /* renamed from: h */
    public int f15893h;

    /* renamed from: i */
    public int[] f15894i;

    /* renamed from: j */
    public int f15895j;

    /* renamed from: k */
    public int[] f15896k;

    /* renamed from: l */
    public int f15897l;

    /* renamed from: m */
    public int[] f15898m;

    /* renamed from: n */
    public int f15899n;

    /* renamed from: o */
    public int[] f15900o;

    /* renamed from: p */
    public int[] f15901p;

    /* renamed from: q */
    public int f15902q;

    /* renamed from: r */
    public int[] f15903r;

    /* renamed from: s */
    public int f15904s;

    /* renamed from: t */
    public int[] f15905t;

    /* renamed from: u */
    public int f15906u;

    /* renamed from: v */
    public int[] f15907v;

    /* renamed from: w */
    public int f15908w;

    /* renamed from: x */
    public int[] f15909x;

    /* renamed from: y */
    public int f15910y;

    /* renamed from: z */
    public int[] f15911z;

    static {
        HashMap hashMap = new HashMap();
        f15884B = hashMap;
        hashMap.put("FREQ", new C5028n());
        hashMap.put("UNTIL", new C5030p());
        hashMap.put("COUNT", new C5027m());
        hashMap.put("INTERVAL", new C5029o());
        hashMap.put("BYSECOND", new C5023i());
        hashMap.put("BYMINUTE", new C5020f());
        hashMap.put("BYHOUR", new C5019e());
        hashMap.put("BYDAY", new C5018d());
        hashMap.put("BYMONTHDAY", new C5022h());
        hashMap.put("BYYEARDAY", new C5026l());
        hashMap.put("BYWEEKNO", new C5025k());
        hashMap.put("BYMONTH", new C5021g());
        hashMap.put("BYSETPOS", new C5024j());
        hashMap.put("WKST", new C5031q());
        HashMap hashMap2 = new HashMap();
        f15885a = hashMap2;
        hashMap2.put("SECONDLY", 1);
        hashMap2.put("MINUTELY", 2);
        hashMap2.put("HOURLY", 3);
        hashMap2.put("DAILY", 4);
        hashMap2.put("WEEKLY", 5);
        hashMap2.put("MONTHLY", 6);
        hashMap2.put("YEARLY", 7);
        HashMap hashMap3 = new HashMap();
        f15886b = hashMap3;
        hashMap3.put("SU", 65536);
        hashMap3.put("MO", Integer.valueOf(C89885b.S3REQUEST_VALUE));
        hashMap3.put("TU", Integer.valueOf(C89885b.HTTP_VALUE));
        hashMap3.put("WE", 524288);
        hashMap3.put("TH", 1048576);
        hashMap3.put("FR", Integer.valueOf(C89885b.NOW_VALUE));
        hashMap3.put("SA", 4194304);
    }

    /* renamed from: a */
    public static int m13826a(int i) {
        switch (i) {
            case 1:
                return 65536;
            case 2:
                return C89885b.S3REQUEST_VALUE;
            case 3:
                return C89885b.HTTP_VALUE;
            case 4:
                return 524288;
            case 5:
                return 1048576;
            case 6:
                return C89885b.NOW_VALUE;
            case 7:
                return 4194304;
            default:
                throw new RuntimeException("bad day of week: " + i);
        }
    }

    /* renamed from: b */
    public static int m13827b(int i) {
        if (i == 65536) {
            return 1;
        }
        if (i == 131072) {
            return 2;
        }
        if (i == 262144) {
            return 3;
        }
        if (i == 524288) {
            return 4;
        }
        if (i == 1048576) {
            return 5;
        }
        if (i == 2097152) {
            return 6;
        }
        if (i == 4194304) {
            return 7;
        }
        throw new RuntimeException("bad day of week: " + i);
    }

    /* renamed from: c */
    public static int m13828c(int i) {
        if (i == 65536) {
            return 0;
        }
        if (i == 131072) {
            return 1;
        }
        if (i == 262144) {
            return 2;
        }
        if (i == 524288) {
            return 3;
        }
        if (i == 1048576) {
            return 4;
        }
        if (i == 2097152) {
            return 5;
        }
        if (i == 4194304) {
            return 6;
        }
        throw new RuntimeException("bad day of week: " + i);
    }

    /* renamed from: d */
    public static int m13829d(int i) {
        switch (i) {
            case 0:
                return 65536;
            case 1:
                return C89885b.S3REQUEST_VALUE;
            case 2:
                return C89885b.HTTP_VALUE;
            case 3:
                return 524288;
            case 4:
                return 1048576;
            case 5:
                return C89885b.NOW_VALUE;
            case 6:
                return 4194304;
            default:
                throw new RuntimeException("bad day of week: " + i);
        }
    }

    /* renamed from: f */
    private static String m13830f(int i) {
        if (i == 65536) {
            return "SU";
        }
        if (i == 131072) {
            return "MO";
        }
        if (i == 262144) {
            return "TU";
        }
        if (i == 524288) {
            return "WE";
        }
        if (i == 1048576) {
            return "TH";
        }
        if (i == 2097152) {
            return "FR";
        }
        if (i == 4194304) {
            return "SA";
        }
        throw new IllegalArgumentException("bad day argument: " + i);
    }

    /* renamed from: g */
    private final void m13831g(StringBuilder sb, int i) {
        int i2 = this.f15901p[i];
        if (i2 != 0) {
            sb.append(i2);
        }
        sb.append(m13830f(this.f15900o[i]));
    }

    /* renamed from: h */
    private static void m13832h(StringBuilder sb, String str, int i, int[] iArr) {
        if (i > 0) {
            sb.append(str);
            int i2 = i - 1;
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(iArr[i3]);
                sb.append(",");
            }
            sb.append(iArr[i2]);
        }
    }

    /* renamed from: i */
    private static boolean m13833i(int[] iArr, int i, int[] iArr2, int i2) {
        if (i != i2) {
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] != iArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final void mo9970e(String str) {
        this.f15890e = null;
        this.f15887A = 0;
        this.f15910y = 0;
        this.f15908w = 0;
        this.f15906u = 0;
        this.f15904s = 0;
        this.f15902q = 0;
        this.f15899n = 0;
        this.f15897l = 0;
        this.f15895j = 0;
        this.f15892g = 0;
        this.f15891f = 0;
        this.f15889d = 0;
        int i = 0;
        for (String str2 : str.toUpperCase().split(";")) {
            if (!TextUtils.isEmpty(str2)) {
                int indexOf = str2.indexOf(61);
                if (indexOf > 0) {
                    String substring = str2.substring(0, indexOf);
                    String substring2 = str2.substring(indexOf + 1);
                    if (substring2.length() != 0) {
                        C5032r rVar = (C5032r) f15884B.get(substring);
                        if (rVar != null) {
                            int a = rVar.mo9969a(substring2, this);
                            if ((i & a) == 0) {
                                i |= a;
                            } else {
                                throw new C5017c("Part " + substring + " was specified twice");
                            }
                        } else if (!substring.startsWith("X-")) {
                            throw new C5017c("Couldn't find parser for ".concat(String.valueOf(substring)));
                        }
                    } else {
                        throw new C5017c("Missing RHS in ".concat(String.valueOf(str2)));
                    }
                } else {
                    throw new C5017c("Missing LHS in ".concat(String.valueOf(str2)));
                }
            }
        }
        if ((i & 8192) == 0) {
            this.f15893h = C89885b.S3REQUEST_VALUE;
        }
        if ((i & 1) == 0) {
            throw new C5017c("Must specify a FREQ value");
        } else if ((i & 6) == 6) {
            Log.w("EventRecur", "Warning: rrule has both UNTIL and COUNT: ".concat(String.valueOf(str)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r1 = r6.f15890e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof com.android.p256b.C5033s
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.android.b.s r7 = (com.android.p256b.C5033s) r7
            android.text.format.Time r1 = r7.f15888c
            int r1 = r6.f15889d
            int r3 = r7.f15889d
            if (r1 != r3) goto L_0x00c6
            java.lang.String r1 = r6.f15890e
            if (r1 != 0) goto L_0x001d
            java.lang.String r1 = r7.f15890e
            if (r1 != 0) goto L_0x00c6
            goto L_0x0027
        L_0x001d:
            java.lang.String r3 = r7.f15890e
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0027
            goto L_0x00c6
        L_0x0027:
            int r1 = r6.f15891f
            int r3 = r7.f15891f
            if (r1 != r3) goto L_0x00c6
            int r1 = r6.f15892g
            int r3 = r7.f15892g
            if (r1 != r3) goto L_0x00c6
            int r1 = r6.f15893h
            int r3 = r7.f15893h
            if (r1 != r3) goto L_0x00c6
            int[] r1 = r6.f15894i
            int r3 = r6.f15895j
            int[] r4 = r7.f15894i
            int r5 = r7.f15895j
            boolean r1 = m13833i(r1, r3, r4, r5)
            if (r1 == 0) goto L_0x00c6
            int[] r1 = r6.f15896k
            int r3 = r6.f15897l
            int[] r4 = r7.f15896k
            int r5 = r7.f15897l
            boolean r1 = m13833i(r1, r3, r4, r5)
            if (r1 == 0) goto L_0x00c6
            int[] r1 = r6.f15898m
            int r3 = r6.f15899n
            int[] r4 = r7.f15898m
            int r5 = r7.f15899n
            boolean r1 = m13833i(r1, r3, r4, r5)
            if (r1 == 0) goto L_0x00c6
            int[] r1 = r6.f15900o
            int r3 = r6.f15902q
            int[] r4 = r7.f15900o
            int r5 = r7.f15902q
            boolean r1 = m13833i(r1, r3, r4, r5)
            if (r1 == 0) goto L_0x00c6
            int[] r1 = r6.f15901p
            int r3 = r6.f15902q
            int[] r4 = r7.f15901p
            int r5 = r7.f15902q
            boolean r1 = m13833i(r1, r3, r4, r5)
            if (r1 == 0) goto L_0x00c6
            int[] r1 = r6.f15903r
            int r3 = r6.f15904s
            int[] r4 = r7.f15903r
            int r5 = r7.f15904s
            boolean r1 = m13833i(r1, r3, r4, r5)
            if (r1 == 0) goto L_0x00c6
            int[] r1 = r6.f15905t
            int r3 = r6.f15906u
            int[] r4 = r7.f15905t
            int r5 = r7.f15906u
            boolean r1 = m13833i(r1, r3, r4, r5)
            if (r1 == 0) goto L_0x00c6
            int[] r1 = r6.f15907v
            int r3 = r6.f15908w
            int[] r4 = r7.f15907v
            int r5 = r7.f15908w
            boolean r1 = m13833i(r1, r3, r4, r5)
            if (r1 == 0) goto L_0x00c6
            int[] r1 = r6.f15909x
            int r3 = r6.f15910y
            int[] r4 = r7.f15909x
            int r5 = r7.f15910y
            boolean r1 = m13833i(r1, r3, r4, r5)
            if (r1 == 0) goto L_0x00c6
            int[] r1 = r6.f15911z
            int r3 = r6.f15887A
            int[] r4 = r7.f15911z
            int r7 = r7.f15887A
            boolean r7 = m13833i(r1, r3, r4, r7)
            if (r7 == 0) goto L_0x00c6
            return r0
        L_0x00c6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p256b.C5033s.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FREQ=");
        switch (this.f15889d) {
            case 1:
                sb.append("SECONDLY");
                break;
            case 2:
                sb.append("MINUTELY");
                break;
            case 3:
                sb.append("HOURLY");
                break;
            case 4:
                sb.append("DAILY");
                break;
            case 5:
                sb.append("WEEKLY");
                break;
            case 6:
                sb.append("MONTHLY");
                break;
            case 7:
                sb.append("YEARLY");
                break;
        }
        if (!TextUtils.isEmpty(this.f15890e)) {
            sb.append(";UNTIL=");
            sb.append(this.f15890e);
        }
        if (this.f15891f != 0) {
            sb.append(";COUNT=");
            sb.append(this.f15891f);
        }
        if (this.f15892g != 0) {
            sb.append(";INTERVAL=");
            sb.append(this.f15892g);
        }
        if (this.f15893h != 0) {
            sb.append(";WKST=");
            sb.append(m13830f(this.f15893h));
        }
        m13832h(sb, ";BYSECOND=", this.f15895j, this.f15894i);
        m13832h(sb, ";BYMINUTE=", this.f15897l, this.f15896k);
        m13832h(sb, ";BYSECOND=", this.f15899n, this.f15898m);
        int i = this.f15902q;
        if (i > 0) {
            sb.append(";BYDAY=");
            int i2 = i - 1;
            for (int i3 = 0; i3 < i2; i3++) {
                m13831g(sb, i3);
                sb.append(",");
            }
            m13831g(sb, i2);
        }
        m13832h(sb, ";BYMONTHDAY=", this.f15904s, this.f15903r);
        m13832h(sb, ";BYYEARDAY=", this.f15906u, this.f15905t);
        m13832h(sb, ";BYWEEKNO=", this.f15908w, this.f15907v);
        m13832h(sb, ";BYMONTH=", this.f15910y, this.f15909x);
        m13832h(sb, ";BYSETPOS=", this.f15887A, this.f15911z);
        return sb.toString();
    }
}
