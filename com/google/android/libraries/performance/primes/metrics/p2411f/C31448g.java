package com.google.android.libraries.performance.primes.metrics.p2411f;

import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.performance.primes.metrics.f.g */
/* compiled from: PG */
final class C31448g {

    /* renamed from: a */
    private static final C59071e f84687a = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.f.g");

    /* renamed from: b */
    private static final C58528ij f84688b = C58528ij.m90013M("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");

    /* renamed from: c */
    private static final Pattern f84689c = Pattern.compile("(?:[^\\/]*\\/)([^;]*)");

    /* renamed from: d */
    private static final Pattern f84690d = Pattern.compile("([^\\?]+)(\\?+)");

    /* renamed from: e */
    private static final Pattern f84691e = Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");

    /* renamed from: f */
    private static final Pattern f84692f = Pattern.compile("([a-zA-Z0-9-_]+)");

    /* renamed from: g */
    private static final Pattern f84693g = Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");

    /* renamed from: h */
    private final C69464a f84694h;

    public C31448g(C69464a aVar) {
        this.f84694h = aVar;
    }

    /* renamed from: a */
    static String m58635a(String str) {
        Matcher matcher = f84691e.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m58636b(java.lang.String r3, com.google.android.libraries.performance.primes.metrics.p2411f.C31459r r4, boolean r5) {
        /*
            boolean r0 = com.google.common.base.C58837ba.m90859h(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            if (r4 == 0) goto L_0x0010
            if (r5 != 0) goto L_0x0010
            java.lang.String r3 = r4.mo37147a()
        L_0x0010:
            r4 = 1
            if (r5 == 0) goto L_0x0015
        L_0x0013:
            r5 = 1
            goto L_0x001e
        L_0x0015:
            java.lang.String r5 = m58635a(r3)
            if (r5 == 0) goto L_0x001d
            r3 = r5
            goto L_0x0013
        L_0x001d:
            r5 = 0
        L_0x001e:
            java.util.regex.Pattern r0 = f84690d
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r2 = r0.find()
            if (r2 == 0) goto L_0x002f
            java.lang.String r3 = r0.group(r4)
            r5 = 1
        L_0x002f:
            java.lang.String r0 = m58637c(r3)
            if (r0 == 0) goto L_0x003c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x003c
            r5 = 1
        L_0x003c:
            if (r0 == 0) goto L_0x0051
            java.util.regex.Pattern r3 = f84693g
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r2 = r3.find()
            if (r2 == 0) goto L_0x0051
            java.lang.String r5 = "<ip>"
            java.lang.String r0 = r3.replaceFirst(r5)
            r5 = 1
        L_0x0051:
            if (r0 == 0) goto L_0x0067
            if (r5 != 0) goto L_0x0067
            java.util.regex.Pattern r3 = f84692f
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r5 = r3.find()
            if (r5 != 0) goto L_0x0062
            goto L_0x0068
        L_0x0062:
            java.lang.String r3 = r3.group(r4)
            return r3
        L_0x0067:
            r1 = r0
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.metrics.p2411f.C31448g.m58636b(java.lang.String, com.google.android.libraries.performance.primes.metrics.f.r, boolean):java.lang.String");
    }

    /* renamed from: c */
    static String m58637c(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f84693g.matcher(str);
        return matcher.find() ? matcher.replaceFirst("<ip>") : str;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014e, code lost:
        if (r4.equals("http/2+quic/43") != false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c6, code lost:
        if (r4 == null) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c8, code lost:
        r4 = f84691e.matcher(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d2, code lost:
        if (r4.matches() == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d4, code lost:
        r4 = r4.group(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d9, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01da, code lost:
        if (r4 == null) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01dc, code lost:
        r3.copyOnWrite();
        r10 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r3.instance;
        r10.f190170a |= 524288;
        r10.f190189t = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0381 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02ad  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej mo37143d(com.google.android.libraries.performance.primes.metrics.p2411f.C31447f... r15) {
        /*
            r14 = this;
            j.a.i.b.a.bt r0 = p5535j.p5536a.p5562i.p5568b.p5569a.C71237bt.f190195b
            com.google.protobuf.bn r0 = r0.createBuilder()
            j.a.i.b.a.bs r0 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71236bs) r0
            r1 = 0
            r2 = 0
        L_0x000a:
            int r3 = r15.length
            if (r2 >= r3) goto L_0x0382
            j.a.i.b.a.br r3 = p5535j.p5536a.p5562i.p5568b.p5569a.C71235br.f190169y
            com.google.protobuf.bn r3 = r3.createBuilder()
            j.a.i.b.a.bo r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71232bo) r3
            r4 = r15[r2]
            int r4 = r4.f84669e
            if (r4 <= 0) goto L_0x002a
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            j.a.i.b.a.br r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r5
            int r6 = r5.f190170a
            r6 = r6 | 128(0x80, float:1.794E-43)
            r5.f190170a = r6
            r5.f190178i = r4
        L_0x002a:
            r4 = r15[r2]
            int r4 = r4.f84668d
            if (r4 <= 0) goto L_0x003f
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            j.a.i.b.a.br r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r5
            int r6 = r5.f190170a
            r6 = r6 | 64
            r5.f190170a = r6
            r5.f190177h = r4
        L_0x003f:
            r4 = r15[r2]
            long r4 = r4.f84667c
            r6 = 8
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x005a
            r3.copyOnWrite()
            com.google.protobuf.bv r9 = r3.instance
            j.a.i.b.a.br r9 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r9
            int r10 = r9.f190170a
            r10 = r10 | r6
            r9.f190170a = r10
            int r5 = (int) r4
            r9.f190174e = r5
        L_0x005a:
            r4 = r15[r2]
            long r4 = r4.f84666b
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0072
            r3.copyOnWrite()
            com.google.protobuf.bv r9 = r3.instance
            j.a.i.b.a.br r9 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r9
            int r10 = r9.f190170a
            r10 = r10 | 16
            r9.f190170a = r10
            int r5 = (int) r4
            r9.f190175f = r5
        L_0x0072:
            r4 = r15[r2]
            int r4 = r4.f84674j
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            j.a.i.b.a.br r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r5
            int r9 = r5.f190170a
            r9 = r9 | 32
            r5.f190170a = r9
            r5.f190176g = r4
            r4 = r15[r2]
            int r4 = r4.f84683s
            r5 = 1
            if (r4 < 0) goto L_0x00bf
            j.a.i.b.a.ca r4 = p5535j.p5536a.p5562i.p5568b.p5569a.C71245ca.f190204c
            com.google.protobuf.bn r4 = r4.createBuilder()
            j.a.i.b.a.bz r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71243bz) r4
            r9 = r15[r2]
            int r9 = r9.f84683s
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            j.a.i.b.a.ca r10 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71245ca) r10
            int r11 = r10.f190206a
            r11 = r11 | r5
            r10.f190206a = r11
            r10.f190207b = r9
            com.google.protobuf.bv r4 = r4.build()
            j.a.i.b.a.ca r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71245ca) r4
            r3.copyOnWrite()
            com.google.protobuf.bv r9 = r3.instance
            j.a.i.b.a.br r9 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r9
            r4.getClass()
            r9.f190192w = r4
            int r4 = r9.f190170a
            r10 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 | r10
            r9.f190170a = r4
        L_0x00bf:
            r4 = r15[r2]
            java.lang.String r4 = r4.f84675k
            r9 = 0
            if (r4 == 0) goto L_0x00fe
            boolean r10 = com.google.common.base.C58837ba.m90859h(r4)
            if (r10 == 0) goto L_0x00ce
        L_0x00cc:
            r4 = r9
            goto L_0x00ee
        L_0x00ce:
            java.util.regex.Pattern r10 = f84689c
            java.util.regex.Matcher r10 = r10.matcher(r4)
            boolean r11 = r10.find()
            if (r11 == 0) goto L_0x00df
            java.lang.String r4 = r10.group(r1)
            goto L_0x00ee
        L_0x00df:
            com.google.common.f.e r10 = f84687a
            com.google.common.f.x r10 = r10.mo56226d()
            java.lang.String r11 = "contentType extraction failed for %s, skipping logging path"
            r12 = 50405(0xc4e5, float:7.0632E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r12)).mo56389s(r11, r4)
            goto L_0x00cc
        L_0x00ee:
            if (r4 == 0) goto L_0x00fe
            r3.copyOnWrite()
            com.google.protobuf.bv r10 = r3.instance
            j.a.i.b.a.br r10 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r10
            int r11 = r10.f190170a
            r11 = r11 | r5
            r10.f190170a = r11
            r10.f190171b = r4
        L_0x00fe:
            r4 = r15[r2]
            java.lang.String r4 = r4.f84673i
            boolean r10 = com.google.common.base.C58837ba.m90859h(r4)
            r11 = 4
            r12 = 2
            if (r10 == 0) goto L_0x010c
        L_0x010a:
            r6 = 1
            goto L_0x0150
        L_0x010c:
            java.lang.String r10 = "http/1.1"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x0116
            r6 = 2
            goto L_0x0150
        L_0x0116:
            java.lang.String r10 = "spdy/2"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x0120
            r6 = 3
            goto L_0x0150
        L_0x0120:
            java.lang.String r10 = "spdy/3"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x012a
            r6 = 4
            goto L_0x0150
        L_0x012a:
            java.lang.String r10 = "spdy/3.1"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x0134
            r6 = 5
            goto L_0x0150
        L_0x0134:
            java.lang.String r10 = "h2"
            boolean r10 = r4.startsWith(r10)
            if (r10 == 0) goto L_0x013e
            r6 = 6
            goto L_0x0150
        L_0x013e:
            java.lang.String r10 = "quic/1+spdy/3"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x0148
            r6 = 7
            goto L_0x0150
        L_0x0148:
            java.lang.String r10 = "http/2+quic/43"
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x010a
        L_0x0150:
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            j.a.i.b.a.br r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r4
            int r6 = r6 + -1
            r4.f190179j = r6
            int r6 = r4.f190170a
            r6 = r6 | 256(0x100, float:3.59E-43)
            r4.f190170a = r6
            g.a.a r4 = r14.f84694h
            java.lang.Object r4 = r4.mo17428b()
            com.google.android.libraries.performance.primes.metrics.f.e r4 = (com.google.android.libraries.performance.primes.metrics.p2411f.C31446e) r4
            com.google.android.libraries.performance.primes.metrics.f.r r4 = r4.mo37135d()
            r6 = r15[r2]
            java.lang.String r10 = r6.f84670f
            if (r10 == 0) goto L_0x0203
            boolean r13 = r6.f84672h
            if (r13 == 0) goto L_0x0189
            java.lang.String r4 = r6.f84671g
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            j.a.i.b.a.br r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r6
            int r13 = r6.f190170a
            r11 = r11 | r13
            r6.f190170a = r11
            r6.f190173d = r10
            goto L_0x0204
        L_0x0189:
            java.lang.String r6 = m58635a(r10)
            g.a.a r11 = r14.f84694h
            java.lang.Object r11 = r11.mo17428b()
            com.google.android.libraries.performance.primes.metrics.f.e r11 = (com.google.android.libraries.performance.primes.metrics.p2411f.C31446e) r11
            boolean r11 = r11.mo37138f()
            if (r11 == 0) goto L_0x01ed
            com.google.common.b.ij r11 = f84688b
            com.google.common.b.sl r11 = r11.iterator()
        L_0x01a1:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x01b4
            java.lang.Object r13 = r11.next()
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = r10.contains(r13)
            if (r13 == 0) goto L_0x01a1
            goto L_0x01c2
        L_0x01b4:
            r11 = r15[r2]
            int r11 = r11.f84685u
            if (r11 != 0) goto L_0x01bb
            goto L_0x01ed
        L_0x01bb:
            int r11 = r11 + -1
            if (r11 == r5) goto L_0x01c2
            if (r11 == r12) goto L_0x01c2
            goto L_0x01ed
        L_0x01c2:
            java.lang.String r4 = m58636b(r10, r4, r5)
            if (r4 == 0) goto L_0x0201
            java.util.regex.Pattern r10 = f84691e
            java.util.regex.Matcher r4 = r10.matcher(r4)
            boolean r10 = r4.matches()
            if (r10 == 0) goto L_0x01d9
            java.lang.String r4 = r4.group(r12)
            goto L_0x01da
        L_0x01d9:
            r4 = r9
        L_0x01da:
            if (r4 == 0) goto L_0x0201
            r3.copyOnWrite()
            com.google.protobuf.bv r10 = r3.instance
            j.a.i.b.a.br r10 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r10
            int r11 = r10.f190170a
            r13 = 524288(0x80000, float:7.34684E-40)
            r11 = r11 | r13
            r10.f190170a = r11
            r10.f190189t = r4
            goto L_0x0201
        L_0x01ed:
            java.lang.String r4 = m58636b(r10, r4, r1)
            if (r4 == 0) goto L_0x0201
            r3.copyOnWrite()
            com.google.protobuf.bv r10 = r3.instance
            j.a.i.b.a.br r10 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r10
            int r11 = r10.f190170a
            r11 = r11 | r12
            r10.f190170a = r11
            r10.f190172c = r4
        L_0x0201:
            r4 = r6
            goto L_0x0204
        L_0x0203:
            r4 = r9
        L_0x0204:
            if (r4 == 0) goto L_0x021c
            java.lang.String r4 = m58637c(r4)
            if (r4 == 0) goto L_0x021c
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            j.a.i.b.a.br r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r6
            int r10 = r6.f190170a
            r11 = 2097152(0x200000, float:2.938736E-39)
            r10 = r10 | r11
            r6.f190170a = r10
            r6.f190191v = r4
        L_0x021c:
            r4 = r15[r2]
            j.a.i.b.a.ct r4 = r4.f84676l
            if (r4 == 0) goto L_0x0231
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            j.a.i.b.a.br r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r6
            r6.f190180k = r4
            int r4 = r6.f190170a
            r4 = r4 | 512(0x200, float:7.175E-43)
            r6.f190170a = r4
        L_0x0231:
            r4 = r15[r2]
            int r4 = r4.f84677m
            j.a.i.b.a.bq r4 = p5535j.p5536a.p5562i.p5568b.p5569a.C71234bq.m103942a(r4)
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90833j(r4)
            j.a.i.b.a.bq r6 = p5535j.p5536a.p5562i.p5568b.p5569a.C71234bq.UNKNOWN
            java.lang.Object r4 = r4.mo56109e(r6)
            j.a.i.b.a.bq r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71234bq) r4
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            j.a.i.b.a.br r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r6
            int r4 = r4.f190167c
            r6.f190181l = r4
            int r4 = r6.f190170a
            r4 = r4 | 1024(0x400, float:1.435E-42)
            r6.f190170a = r4
            j.a.i.b.a.bn r4 = p5535j.p5536a.p5562i.p5568b.p5569a.C71231bn.f190159c
            com.google.protobuf.bn r4 = r4.createBuilder()
            j.a.i.b.a.bk r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71228bk) r4
            r6 = r15[r2]
            int r6 = r6.f84684t
            if (r6 == 0) goto L_0x0274
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            j.a.i.b.a.bn r10 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71231bn) r10
            int r6 = r6 + -2
            r10.f190162b = r6
            int r6 = r10.f190161a
            r6 = r6 | r5
            r10.f190161a = r6
        L_0x0274:
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            j.a.i.b.a.br r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r6
            com.google.protobuf.bv r4 = r4.build()
            j.a.i.b.a.bn r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71231bn) r4
            r4.getClass()
            r6.f190182m = r4
            int r4 = r6.f190170a
            r4 = r4 | 2048(0x800, float:2.87E-42)
            r6.f190170a = r4
            r4 = r15[r2]
            int r4 = r4.f84685u
            if (r4 == 0) goto L_0x02a3
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            j.a.i.b.a.br r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r6
            int r4 = r4 + -1
            r6.f190183n = r4
            int r4 = r6.f190170a
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            r6.f190170a = r4
        L_0x02a3:
            r4 = r15[r2]
            j.a.i.b.a.aq r6 = r4.f84678n
            long r10 = r4.f84665a
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x02bc
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            j.a.i.b.a.br r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r4
            int r6 = r4.f190170a
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
            r4.f190170a = r6
            r4.f190184o = r10
        L_0x02bc:
            r4 = r15[r2]
            int r4 = r4.f84681q
            if (r4 <= 0) goto L_0x0309
            j.a.i.b.a.bj r4 = p5535j.p5536a.p5562i.p5568b.p5569a.C71227bj.f190153d
            com.google.protobuf.bn r4 = r4.createBuilder()
            j.a.i.b.a.bi r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71226bi) r4
            r6 = r15[r2]
            int r6 = r6.f84681q
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            j.a.i.b.a.bj r7 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71227bj) r7
            int r8 = r7.f190155a
            r8 = r8 | r5
            r7.f190155a = r8
            r7.f190156b = r6
            r6 = r15[r2]
            int r6 = r6.f84682r
            if (r6 <= 0) goto L_0x02f0
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            j.a.i.b.a.bj r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71227bj) r6
            int r7 = r6.f190155a
            r7 = r7 | r12
            r6.f190155a = r7
            r6.f190157c = r5
        L_0x02f0:
            com.google.protobuf.bv r4 = r4.build()
            j.a.i.b.a.bj r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71227bj) r4
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            j.a.i.b.a.br r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r5
            r4.getClass()
            r5.f190193x = r4
            int r4 = r5.f190170a
            r6 = 8388608(0x800000, float:1.17549435E-38)
            r4 = r4 | r6
            r5.f190170a = r4
        L_0x0309:
            r4 = r15[r2]
            int r4 = r4.f84686v
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            j.a.i.b.a.br r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r5
            int r6 = r4 + -1
            if (r4 == 0) goto L_0x0381
            r5.f190185p = r6
            int r4 = r5.f190170a
            r6 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 | r6
            r5.f190170a = r4
            r4 = r15[r2]
            int r4 = r4.f84679o
            int r4 = p5535j.p5536a.p5562i.p5568b.p5569a.C71240bw.m103945a(r4)
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            j.a.i.b.a.br r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r5
            int r6 = r4 + -1
            if (r4 == 0) goto L_0x0380
            r5.f190186q = r6
            int r4 = r5.f190170a
            r6 = 65536(0x10000, float:9.18355E-41)
            r4 = r4 | r6
            r5.f190170a = r4
            r4 = r15[r2]
            int r4 = r4.f84680p
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            j.a.i.b.a.br r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r5
            int r6 = r5.f190170a
            r7 = 131072(0x20000, float:1.83671E-40)
            r6 = r6 | r7
            r5.f190170a = r6
            r5.f190187r = r4
            r4 = r15[r2]
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            j.a.i.b.a.br r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r4
            int r5 = r4.f190170a
            r6 = 262144(0x40000, float:3.67342E-40)
            r5 = r5 | r6
            r4.f190170a = r5
            r4.f190188s = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            j.a.i.b.a.bt r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71237bt) r4
            com.google.protobuf.bv r3 = r3.build()
            j.a.i.b.a.br r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71235br) r3
            r3.getClass()
            r4.mo62660a()
            com.google.protobuf.cq r4 = r4.f190197a
            r4.add(r3)
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0380:
            throw r9
        L_0x0381:
            throw r9
        L_0x0382:
            j.a.i.b.a.ej r15 = p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej.f190415x
            com.google.protobuf.bn r15 = r15.createBuilder()
            j.a.i.b.a.ei r15 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei) r15
            r15.copyOnWrite()
            com.google.protobuf.bv r1 = r15.instance
            j.a.i.b.a.ej r1 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej) r1
            com.google.protobuf.bv r0 = r0.build()
            j.a.i.b.a.bt r0 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71237bt) r0
            r0.getClass()
            r1.f190422g = r0
            int r0 = r1.f190416a
            r0 = r0 | 32
            r1.f190416a = r0
            g.a.a r0 = r14.f84694h     // Catch:{ Exception -> 0x03de }
            java.lang.Object r0 = r0.mo17428b()     // Catch:{ Exception -> 0x03de }
            com.google.android.libraries.performance.primes.metrics.f.e r0 = (com.google.android.libraries.performance.primes.metrics.p2411f.C31446e) r0     // Catch:{ Exception -> 0x03de }
            com.google.common.base.ax r0 = r0.mo37136e()     // Catch:{ Exception -> 0x03de }
            boolean r1 = r0.mo56113h()     // Catch:{ Exception -> 0x03de }
            if (r1 == 0) goto L_0x03ed
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ Exception -> 0x03de }
            com.google.android.libraries.performance.primes.metrics.f.i r0 = (com.google.android.libraries.performance.primes.metrics.p2411f.C31450i) r0     // Catch:{ Exception -> 0x03de }
            com.google.common.base.ax r0 = r0.mo37144a()     // Catch:{ Exception -> 0x03de }
            boolean r1 = r0.mo56113h()     // Catch:{ Exception -> 0x03de }
            if (r1 == 0) goto L_0x03ed
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ Exception -> 0x03de }
            j.a.i.b.a.aq r0 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq) r0     // Catch:{ Exception -> 0x03de }
            r15.copyOnWrite()     // Catch:{ Exception -> 0x03de }
            com.google.protobuf.bv r1 = r15.instance     // Catch:{ Exception -> 0x03de }
            j.a.i.b.a.ej r1 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej) r1     // Catch:{ Exception -> 0x03de }
            r0.getClass()     // Catch:{ Exception -> 0x03de }
            r1.f190437v = r0     // Catch:{ Exception -> 0x03de }
            int r0 = r1.f190416a     // Catch:{ Exception -> 0x03de }
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 | r2
            r1.f190416a = r0     // Catch:{ Exception -> 0x03de }
            goto L_0x03ed
        L_0x03de:
            r0 = move-exception
            com.google.common.f.e r1 = f84687a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Exception while getting network metric extension!"
            r3 = 50406(0xc4e6, float:7.0634E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
        L_0x03ed:
            com.google.protobuf.bv r15 = r15.build()
            j.a.i.b.a.ej r15 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej) r15
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.metrics.p2411f.C31448g.mo37143d(com.google.android.libraries.performance.primes.metrics.f.f[]):j.a.i.b.a.ej");
    }
}
