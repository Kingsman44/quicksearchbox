package com.airbnb.lottie.p243e.p244a;

import java.io.EOFException;
import p5462h.p5483m.C69755d;
import p5589m.C71828e;
import p5589m.C71830g;
import p5589m.C71831h;
import p5589m.C71832i;
import p5589m.C71841r;

/* renamed from: com.airbnb.lottie.e.a.f */
/* compiled from: PG */
final class C4909f extends C4908e {

    /* renamed from: f */
    private static final C71832i f15649f = C71831h.m105170a("'\\");

    /* renamed from: g */
    private static final C71832i f15650g = C71831h.m105170a("\"\\");

    /* renamed from: h */
    private static final C71832i f15651h = C71831h.m105170a("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: i */
    private final C71830g f15652i;

    /* renamed from: j */
    private final C71828e f15653j;

    /* renamed from: k */
    private int f15654k = 0;

    /* renamed from: l */
    private long f15655l;

    /* renamed from: m */
    private int f15656m;

    /* renamed from: n */
    private String f15657n;

    static {
        C71832i iVar = C71832i.f191357a;
        C71831h.m105170a("\n\r");
        C71831h.m105170a("*/");
    }

    public C4909f(C71830g gVar) {
        this.f15652i = gVar;
        this.f15653j = ((C71841r) gVar).f191371b;
        mo9850m(6);
    }

    /* renamed from: A */
    private final boolean m13621A(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        throw mo9842d("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    /* renamed from: s */
    private final char m13622s() {
        int i;
        if (this.f15652i.mo63080q(1)) {
            byte c = this.f15653j.mo63062c();
            if (c == 10 || c == 34 || c == 39 || c == 47 || c == 92) {
                return (char) c;
            }
            if (c == 98) {
                return 8;
            }
            if (c == 102) {
                return 12;
            }
            if (c == 110) {
                return 10;
            }
            if (c == 114) {
                return 13;
            }
            if (c == 116) {
                return 9;
            }
            if (c != 117) {
                throw mo9842d("Invalid escape sequence: \\" + ((char) c));
            } else if (this.f15652i.mo63080q(4)) {
                char c2 = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    byte b = this.f15653j.mo63061b((long) i2);
                    char c3 = (char) (c2 << 4);
                    if (b >= 48 && b <= 57) {
                        i = b - 48;
                    } else if (b >= 97 && b <= 102) {
                        i = b - 87;
                    } else if (b < 65 || b > 70) {
                        throw mo9842d("\\u".concat(this.f15653j.mo63069h(4, C69755d.f186125a)));
                    } else {
                        i = b - 55;
                    }
                    c2 = (char) (c3 + i);
                }
                this.f15653j.mo63078o(4);
                return c2;
            } else {
                throw new EOFException("Unterminated escape sequence at path ".concat(String.valueOf(mo9843f())));
            }
        } else {
            throw mo9842d("Unterminated escape sequence");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01b4, code lost:
        if (m13621A(r10) == false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01b8, code lost:
        if (r1 != 2) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01ba, code lost:
        if (r16 == false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01c0, code lost:
        if (r6 != Long.MIN_VALUE) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01c2, code lost:
        if (r8 == false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01c4, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01c6, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01cb, code lost:
        if (r6 != 0) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01cd, code lost:
        if (r3 != false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01d0, code lost:
        if (r3 == false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01d3, code lost:
        r6 = -r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01d4, code lost:
        r0.f15655l = r6;
        r0.f15653j.mo63078o((long) r2);
        r0.f15654k = 16;
        r6 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01e3, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01e4, code lost:
        if (r1 == 2) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01e7, code lost:
        if (r1 == 4) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01ea, code lost:
        if (r1 != 7) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01ec, code lost:
        r0.f15656m = r2;
        r6 = 17;
        r0.f15654k = 17;
     */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x023d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0122  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m13623t() {
        /*
            r17 = this;
            r0 = r17
            int[] r1 = r0.f15646c
            int r2 = r0.f15645b
            r3 = -1
            int r2 = r2 + r3
            r4 = r1[r2]
            r7 = 93
            r8 = 59
            r9 = 44
            r10 = 6
            r11 = 3
            r12 = 7
            java.lang.String r13 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            r14 = 4
            r15 = 5
            r5 = 2
            r6 = 0
            r3 = 1
            if (r4 != r3) goto L_0x001f
            r1[r2] = r5
            goto L_0x0082
        L_0x001f:
            if (r4 != r5) goto L_0x003f
            int r1 = r0.m13625v(r3)
            m.e r2 = r0.f15653j
            r2.mo63062c()
            if (r1 == r9) goto L_0x0082
            if (r1 == r8) goto L_0x003a
            if (r1 != r7) goto L_0x0033
            r0.f15654k = r14
            return r14
        L_0x0033:
            java.lang.String r1 = "Unterminated array"
            com.airbnb.lottie.e.a.b r1 = r0.mo9842d(r1)
            throw r1
        L_0x003a:
            com.airbnb.lottie.e.a.b r1 = r0.mo9842d(r13)
            throw r1
        L_0x003f:
            if (r4 == r11) goto L_0x0286
            if (r4 != r15) goto L_0x0045
            goto L_0x0286
        L_0x0045:
            if (r4 != r14) goto L_0x0066
            r1[r2] = r15
            int r1 = r0.m13625v(r3)
            m.e r2 = r0.f15653j
            r2.mo63062c()
            r2 = 58
            if (r1 == r2) goto L_0x0082
            r2 = 61
            if (r1 == r2) goto L_0x0061
            java.lang.String r1 = "Expected ':'"
            com.airbnb.lottie.e.a.b r1 = r0.mo9842d(r1)
            throw r1
        L_0x0061:
            com.airbnb.lottie.e.a.b r1 = r0.mo9842d(r13)
            throw r1
        L_0x0066:
            if (r4 != r10) goto L_0x006b
            r1[r2] = r12
            goto L_0x0082
        L_0x006b:
            if (r4 != r12) goto L_0x007e
            int r1 = r0.m13625v(r6)
            r2 = -1
            if (r1 != r2) goto L_0x0079
            r1 = 18
            r0.f15654k = r1
            return r1
        L_0x0079:
            com.airbnb.lottie.e.a.b r1 = r0.mo9842d(r13)
            throw r1
        L_0x007e:
            r1 = 8
            if (r4 == r1) goto L_0x027e
        L_0x0082:
            int r1 = r0.m13625v(r3)
            r2 = 34
            if (r1 == r2) goto L_0x0274
            r2 = 39
            if (r1 == r2) goto L_0x026f
            if (r1 == r9) goto L_0x025d
            if (r1 == r8) goto L_0x025d
            r2 = 91
            if (r1 == r2) goto L_0x0254
            if (r1 == r7) goto L_0x0247
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x023e
            m.e r1 = r0.f15653j
            r7 = 0
            byte r1 = r1.mo63061b(r7)
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L_0x00ca
            r2 = 84
            if (r1 != r2) goto L_0x00ad
            goto L_0x00ca
        L_0x00ad:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L_0x00c4
            r2 = 70
            if (r1 != r2) goto L_0x00b6
            goto L_0x00c4
        L_0x00b6:
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L_0x00be
            r2 = 78
            if (r1 != r2) goto L_0x00e1
        L_0x00be:
            java.lang.String r1 = "null"
            java.lang.String r2 = "NULL"
            r4 = 7
            goto L_0x00cf
        L_0x00c4:
            java.lang.String r1 = "false"
            java.lang.String r2 = "FALSE"
            r4 = 6
            goto L_0x00cf
        L_0x00ca:
            java.lang.String r1 = "true"
            java.lang.String r2 = "TRUE"
            r4 = 5
        L_0x00cf:
            int r9 = r1.length()
            r6 = 1
        L_0x00d4:
            if (r6 >= r9) goto L_0x00ff
            int r12 = r6 + 1
            m.g r14 = r0.f15652i
            long r10 = (long) r12
            boolean r10 = r14.mo63080q(r10)
            if (r10 != 0) goto L_0x00e3
        L_0x00e1:
            r4 = 0
            goto L_0x0120
        L_0x00e3:
            m.e r10 = r0.f15653j
            long r7 = (long) r6
            byte r7 = r10.mo63061b(r7)
            char r8 = r1.charAt(r6)
            if (r7 == r8) goto L_0x00f7
            char r6 = r2.charAt(r6)
            if (r7 == r6) goto L_0x00f7
            goto L_0x00e1
        L_0x00f7:
            r6 = r12
            r7 = 0
            r10 = 6
            r11 = 3
            r12 = 7
            r14 = 4
            goto L_0x00d4
        L_0x00ff:
            m.g r1 = r0.f15652i
            int r2 = r9 + 1
            long r6 = (long) r2
            boolean r1 = r1.mo63080q(r6)
            if (r1 == 0) goto L_0x0118
            m.e r1 = r0.f15653j
            long r6 = (long) r9
            byte r1 = r1.mo63061b(r6)
            boolean r1 = r0.m13621A(r1)
            if (r1 == 0) goto L_0x0118
            goto L_0x00e1
        L_0x0118:
            m.e r1 = r0.f15653j
            long r6 = (long) r9
            r1.mo63078o(r6)
            r0.f15654k = r4
        L_0x0120:
            if (r4 != 0) goto L_0x023d
            r1 = 0
            r2 = 0
            r4 = 1
            r6 = 0
            r8 = 0
        L_0x0128:
            int r9 = r2 + 1
            m.g r10 = r0.f15652i
            long r11 = (long) r9
            boolean r10 = r10.mo63080q(r11)
            if (r10 != 0) goto L_0x0137
            r16 = r4
            goto L_0x01b8
        L_0x0137:
            m.e r10 = r0.f15653j
            long r11 = (long) r2
            byte r10 = r10.mo63061b(r11)
            r11 = 43
            if (r10 == r11) goto L_0x0212
            r11 = 69
            if (r10 == r11) goto L_0x0207
            r11 = 101(0x65, float:1.42E-43)
            if (r10 == r11) goto L_0x0207
            r11 = 45
            if (r10 == r11) goto L_0x01fb
            r11 = 46
            if (r10 == r11) goto L_0x01f3
            r11 = 48
            if (r10 < r11) goto L_0x01ae
            r11 = 57
            if (r10 <= r11) goto L_0x015b
            goto L_0x01ae
        L_0x015b:
            if (r1 == r3) goto L_0x01a3
            if (r1 != 0) goto L_0x0160
            goto L_0x01a3
        L_0x0160:
            if (r1 != r5) goto L_0x0194
            r11 = 0
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x016a
            goto L_0x021f
        L_0x016a:
            r11 = 10
            long r11 = r11 * r6
            int r10 = r10 + -48
            r16 = r4
            long r3 = (long) r10
            long r11 = r11 - r3
            r2 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x018d
            r2 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x018b
            int r2 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x018b
            goto L_0x018d
        L_0x018b:
            r2 = 0
            goto L_0x018e
        L_0x018d:
            r2 = 1
        L_0x018e:
            r4 = r16 & r2
            r16 = r4
            r6 = r11
            goto L_0x019a
        L_0x0194:
            r16 = r4
            r2 = 3
            if (r1 != r2) goto L_0x019c
            r1 = 4
        L_0x019a:
            r3 = 6
            goto L_0x01ab
        L_0x019c:
            r3 = 6
            if (r1 == r15) goto L_0x01a1
            if (r1 != r3) goto L_0x01ab
        L_0x01a1:
            r1 = 7
            goto L_0x01ab
        L_0x01a3:
            r16 = r4
            r3 = 6
            int r10 = r10 + -48
            int r1 = -r10
            long r6 = (long) r1
            r1 = 2
        L_0x01ab:
            r4 = 7
            goto L_0x0219
        L_0x01ae:
            r16 = r4
            boolean r3 = r0.m13621A(r10)
            if (r3 == 0) goto L_0x01b8
            goto L_0x021f
        L_0x01b8:
            if (r1 != r5) goto L_0x01e4
            if (r16 == 0) goto L_0x01e3
            r3 = -9223372036854775808
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01c6
            if (r8 == 0) goto L_0x01e3
            r3 = 1
            goto L_0x01c7
        L_0x01c6:
            r3 = r8
        L_0x01c7:
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x01d0
            if (r3 != 0) goto L_0x01e3
            goto L_0x01d3
        L_0x01d0:
            if (r3 == 0) goto L_0x01d3
            goto L_0x01d4
        L_0x01d3:
            long r6 = -r6
        L_0x01d4:
            r0.f15655l = r6
            m.e r1 = r0.f15653j
            long r2 = (long) r2
            r1.mo63078o(r2)
            r1 = 16
            r0.f15654k = r1
            r6 = 16
            goto L_0x0220
        L_0x01e3:
            r1 = 2
        L_0x01e4:
            if (r1 == r5) goto L_0x01ec
            r3 = 4
            if (r1 == r3) goto L_0x01ec
            r4 = 7
            if (r1 != r4) goto L_0x021f
        L_0x01ec:
            r0.f15656m = r2
            r6 = 17
            r0.f15654k = r6
            goto L_0x0220
        L_0x01f3:
            r16 = r4
            r3 = 6
            r4 = 7
            if (r1 != r5) goto L_0x021f
            r1 = 3
            goto L_0x0219
        L_0x01fb:
            r16 = r4
            r3 = 6
            r4 = 7
            if (r1 != 0) goto L_0x0204
            r1 = 1
            r8 = 1
            goto L_0x0219
        L_0x0204:
            if (r1 != r15) goto L_0x021f
            goto L_0x0218
        L_0x0207:
            r16 = r4
            r3 = 6
            r4 = 7
            if (r1 == r5) goto L_0x0210
            r2 = 4
            if (r1 != r2) goto L_0x021f
        L_0x0210:
            r1 = 5
            goto L_0x0219
        L_0x0212:
            r16 = r4
            r3 = 6
            r4 = 7
            if (r1 != r15) goto L_0x021f
        L_0x0218:
            r1 = 6
        L_0x0219:
            r2 = r9
            r4 = r16
            r3 = 1
            goto L_0x0128
        L_0x021f:
            r6 = 0
        L_0x0220:
            if (r6 == 0) goto L_0x0223
            return r6
        L_0x0223:
            m.e r1 = r0.f15653j
            r2 = 0
            byte r1 = r1.mo63061b(r2)
            boolean r1 = r0.m13621A(r1)
            if (r1 != 0) goto L_0x0238
            java.lang.String r1 = "Expected value"
            com.airbnb.lottie.e.a.b r1 = r0.mo9842d(r1)
            throw r1
        L_0x0238:
            com.airbnb.lottie.e.a.b r1 = r0.mo9842d(r13)
            throw r1
        L_0x023d:
            return r4
        L_0x023e:
            m.e r1 = r0.f15653j
            r1.mo63062c()
            r1 = 1
            r0.f15654k = r1
            return r1
        L_0x0247:
            r1 = 1
            if (r4 == r1) goto L_0x024b
            goto L_0x025e
        L_0x024b:
            m.e r1 = r0.f15653j
            r1.mo63062c()
            r1 = 4
            r0.f15654k = r1
            return r1
        L_0x0254:
            m.e r1 = r0.f15653j
            r1.mo63062c()
            r1 = 3
            r0.f15654k = r1
            return r1
        L_0x025d:
            r1 = 1
        L_0x025e:
            if (r4 == r1) goto L_0x026a
            if (r4 != r5) goto L_0x0263
            goto L_0x026a
        L_0x0263:
            java.lang.String r1 = "Unexpected value"
            com.airbnb.lottie.e.a.b r1 = r0.mo9842d(r1)
            throw r1
        L_0x026a:
            com.airbnb.lottie.e.a.b r1 = r0.mo9842d(r13)
            throw r1
        L_0x026f:
            com.airbnb.lottie.e.a.b r1 = r0.mo9842d(r13)
            throw r1
        L_0x0274:
            m.e r1 = r0.f15653j
            r1.mo63062c()
            r1 = 9
            r0.f15654k = r1
            return r1
        L_0x027e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x0286:
            r3 = 4
            r1[r2] = r3
            r1 = 125(0x7d, float:1.75E-43)
            if (r4 != r15) goto L_0x02ac
            r2 = 1
            int r3 = r0.m13625v(r2)
            m.e r2 = r0.f15653j
            r2.mo63062c()
            if (r3 == r9) goto L_0x02ac
            if (r3 == r8) goto L_0x02a7
            if (r3 != r1) goto L_0x02a0
            r0.f15654k = r5
            return r5
        L_0x02a0:
            java.lang.String r1 = "Unterminated object"
            com.airbnb.lottie.e.a.b r1 = r0.mo9842d(r1)
            throw r1
        L_0x02a7:
            com.airbnb.lottie.e.a.b r1 = r0.mo9842d(r13)
            throw r1
        L_0x02ac:
            r2 = 1
            int r2 = r0.m13625v(r2)
            r3 = 34
            if (r2 == r3) goto L_0x02db
            r3 = 39
            if (r2 == r3) goto L_0x02d1
            if (r2 != r1) goto L_0x02cc
            if (r4 == r15) goto L_0x02c5
            m.e r1 = r0.f15653j
            r1.mo63062c()
            r0.f15654k = r5
            return r5
        L_0x02c5:
            java.lang.String r1 = "Expected name"
            com.airbnb.lottie.e.a.b r1 = r0.mo9842d(r1)
            throw r1
        L_0x02cc:
            com.airbnb.lottie.e.a.b r1 = r0.mo9842d(r13)
            throw r1
        L_0x02d1:
            m.e r1 = r0.f15653j
            r1.mo63062c()
            com.airbnb.lottie.e.a.b r1 = r0.mo9842d(r13)
            throw r1
        L_0x02db:
            m.e r1 = r0.f15653j
            r1.mo63062c()
            r1 = 13
            r0.f15654k = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p243e.p244a.C4909f.m13623t():int");
    }

    /* renamed from: u */
    private final int m13624u(String str, C4906c cVar) {
        int length = cVar.f15642a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(cVar.f15642a[i])) {
                this.f15654k = 0;
                this.f15647d[this.f15645b - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: v */
    private final int m13625v(boolean z) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (this.f15652i.mo63080q((long) i2)) {
                byte b = this.f15653j.mo63061b((long) i);
                if (b == 10 || b == 32 || b == 13 || b == 9) {
                    i = i2;
                } else {
                    this.f15653j.mo63078o((long) (i2 - 1));
                    if (b == 47) {
                        if (!this.f15652i.mo63080q(2)) {
                            return 47;
                        }
                        throw mo9842d("Use JsonReader.setLenient(true) to accept malformed JSON");
                    } else if (b != 35) {
                        return b;
                    } else {
                        throw mo9842d("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                }
            } else if (!z) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    /* renamed from: w */
    private final String m13626w(C71832i iVar) {
        StringBuilder sb = null;
        while (true) {
            long g = this.f15652i.mo63068g(iVar);
            if (g == -1) {
                throw mo9842d("Unterminated string");
            } else if (this.f15653j.mo63061b(g) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f15653j.mo63069h(g, C69755d.f186125a));
                this.f15653j.mo63062c();
                sb.append(m13622s());
            } else if (sb == null) {
                String h = this.f15653j.mo63069h(g, C69755d.f186125a);
                this.f15653j.mo63062c();
                return h;
            } else {
                sb.append(this.f15653j.mo63069h(g, C69755d.f186125a));
                this.f15653j.mo63062c();
                return sb.toString();
            }
        }
    }

    /* renamed from: x */
    private final String m13627x() {
        long g = this.f15652i.mo63068g(f15651h);
        return g != -1 ? this.f15653j.mo63069h(g, C69755d.f186125a) : this.f15653j.mo63071i();
    }

    /* renamed from: y */
    private final void m13628y(C71832i iVar) {
        while (true) {
            long g = this.f15652i.mo63068g(iVar);
            if (g == -1) {
                throw mo9842d("Unterminated string");
            } else if (this.f15653j.mo63061b(g) == 92) {
                this.f15653j.mo63078o(g + 1);
                m13622s();
            } else {
                this.f15653j.mo63078o(g + 1);
                return;
            }
        }
    }

    /* renamed from: z */
    private final void m13629z() {
        long g = this.f15652i.mo63068g(f15651h);
        C71828e eVar = this.f15653j;
        if (g == -1) {
            g = eVar.f191356b;
        }
        eVar.mo63078o(g);
    }

    /* renamed from: a */
    public final double mo9839a() {
        int i = this.f15654k;
        if (i == 0) {
            i = m13623t();
        }
        if (i == 16) {
            this.f15654k = 0;
            int[] iArr = this.f15648e;
            int i2 = this.f15645b - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f15655l;
        }
        if (i == 17) {
            this.f15657n = this.f15653j.mo63069h((long) this.f15656m, C69755d.f186125a);
        } else if (i == 9) {
            this.f15657n = m13626w(f15650g);
        } else if (i == 8) {
            this.f15657n = m13626w(f15649f);
        } else if (i == 10) {
            this.f15657n = m13627x();
        } else if (i != 11) {
            int r = mo9855r();
            throw new C4904a("Expected a double but was " + C4907d.m13602a(r) + " at path " + mo9843f());
        }
        this.f15654k = 11;
        try {
            double parseDouble = Double.parseDouble(this.f15657n);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new C4905b("JSON forbids NaN and infinities: " + parseDouble + " at path " + mo9843f());
            }
            this.f15657n = null;
            this.f15654k = 0;
            int[] iArr2 = this.f15648e;
            int i3 = this.f15645b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new C4904a("Expected a double but was " + this.f15657n + " at path " + mo9843f());
        }
    }

    /* renamed from: b */
    public final int mo9840b() {
        String str;
        int i = this.f15654k;
        if (i == 0) {
            i = m13623t();
        }
        if (i == 16) {
            long j = this.f15655l;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f15654k = 0;
                int[] iArr = this.f15648e;
                int i3 = this.f15645b - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new C4904a("Expected an int but was " + j + " at path " + mo9843f());
        }
        if (i == 17) {
            this.f15657n = this.f15653j.mo63069h((long) this.f15656m, C69755d.f186125a);
        } else {
            if (i == 9) {
                str = m13626w(f15650g);
            } else if (i == 8) {
                str = m13626w(f15649f);
            } else if (i != 11) {
                int r = mo9855r();
                throw new C4904a("Expected an int but was " + C4907d.m13602a(r) + " at path " + mo9843f());
            }
            this.f15657n = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f15654k = 0;
                int[] iArr2 = this.f15648e;
                int i4 = this.f15645b - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f15654k = 11;
        try {
            double parseDouble = Double.parseDouble(this.f15657n);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f15657n = null;
                this.f15654k = 0;
                int[] iArr3 = this.f15648e;
                int i6 = this.f15645b - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new C4904a("Expected an int but was " + this.f15657n + " at path " + mo9843f());
        } catch (NumberFormatException unused2) {
            throw new C4904a("Expected an int but was " + this.f15657n + " at path " + mo9843f());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r4 = -1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9841c(com.airbnb.lottie.p243e.p244a.C4906c r10) {
        /*
            r9 = this;
            int r0 = r9.f15654k
            if (r0 != 0) goto L_0x0008
            int r0 = r9.m13623t()
        L_0x0008:
            r1 = 12
            r2 = -1
            if (r0 < r1) goto L_0x008a
            r1 = 15
            if (r0 <= r1) goto L_0x0013
            goto L_0x008a
        L_0x0013:
            if (r0 != r1) goto L_0x001c
            java.lang.String r0 = r9.f15657n
            int r10 = r9.m13624u(r0, r10)
            return r10
        L_0x001c:
            m.g r0 = r9.f15652i
            m.n r3 = r10.f15643b
            m.r r0 = (p5589m.C71841r) r0
            boolean r4 = r0.f191372c
            if (r4 != 0) goto L_0x0082
        L_0x0026:
            m.e r4 = r0.f191371b
            int r4 = p5589m.p5590a.C71820a.m105123c(r4, r3)
            r5 = -2
            if (r4 == r5) goto L_0x0042
            if (r4 == r2) goto L_0x0040
            m.i[] r3 = r3.f191363b
            r3 = r3[r4]
            int r3 = r3.mo63094b()
            m.e r0 = r0.f191371b
            long r5 = (long) r3
            r0.mo63078o(r5)
            goto L_0x0053
        L_0x0040:
            r4 = -1
            goto L_0x0053
        L_0x0042:
            m.x r4 = r0.f191370a
            m.e r5 = r0.f191371b
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.mo62472a(r5, r6)
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0026
            goto L_0x0040
        L_0x0053:
            if (r4 == r2) goto L_0x0064
            r0 = 0
            r9.f15654k = r0
            java.lang.String[] r0 = r9.f15647d
            int r1 = r9.f15645b
            int r1 = r1 + r2
            java.lang.String[] r10 = r10.f15642a
            r10 = r10[r4]
            r0[r1] = r10
            return r4
        L_0x0064:
            java.lang.String[] r0 = r9.f15647d
            int r3 = r9.f15645b
            int r3 = r3 + r2
            r0 = r0[r3]
            java.lang.String r3 = r9.mo9844g()
            int r10 = r9.m13624u(r3, r10)
            if (r10 != r2) goto L_0x0081
            r9.f15654k = r1
            r9.f15657n = r3
            java.lang.String[] r10 = r9.f15647d
            int r1 = r9.f15645b
            int r1 = r1 + r2
            r10[r1] = r0
            return r2
        L_0x0081:
            return r10
        L_0x0082:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            r10.<init>(r0)
            throw r10
        L_0x008a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p243e.p244a.C4909f.mo9841c(com.airbnb.lottie.e.a.c):int");
    }

    public final void close() {
        this.f15654k = 0;
        this.f15646c[0] = 8;
        this.f15645b = 1;
        C71828e eVar = this.f15653j;
        eVar.mo63078o(eVar.f191356b);
        this.f15652i.close();
    }

    /* renamed from: g */
    public final String mo9844g() {
        String str;
        int i = this.f15654k;
        if (i == 0) {
            i = m13623t();
        }
        if (i == 14) {
            str = m13627x();
        } else if (i == 13) {
            str = m13626w(f15650g);
        } else if (i == 12) {
            str = m13626w(f15649f);
        } else if (i == 15) {
            str = this.f15657n;
        } else {
            int r = mo9855r();
            String f = mo9843f();
            throw new C4904a("Expected a name but was " + C4907d.m13602a(r) + " at path " + f);
        }
        this.f15654k = 0;
        this.f15647d[this.f15645b - 1] = str;
        return str;
    }

    /* renamed from: h */
    public final String mo9845h() {
        String str;
        int i = this.f15654k;
        if (i == 0) {
            i = m13623t();
        }
        if (i == 10) {
            str = m13627x();
        } else if (i == 9) {
            str = m13626w(f15650g);
        } else if (i == 8) {
            str = m13626w(f15649f);
        } else if (i == 11) {
            str = this.f15657n;
            this.f15657n = null;
        } else if (i == 16) {
            str = Long.toString(this.f15655l);
        } else if (i == 17) {
            str = this.f15653j.mo63069h((long) this.f15656m, C69755d.f186125a);
        } else {
            int r = mo9855r();
            throw new C4904a("Expected a string but was " + C4907d.m13602a(r) + " at path " + mo9843f());
        }
        this.f15654k = 0;
        int[] iArr = this.f15648e;
        int i2 = this.f15645b - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: i */
    public final void mo9846i() {
        int i = this.f15654k;
        if (i == 0) {
            i = m13623t();
        }
        if (i == 3) {
            mo9850m(1);
            this.f15648e[this.f15645b - 1] = 0;
            this.f15654k = 0;
            return;
        }
        int r = mo9855r();
        String f = mo9843f();
        throw new C4904a("Expected BEGIN_ARRAY but was " + C4907d.m13602a(r) + " at path " + f);
    }

    /* renamed from: j */
    public final void mo9847j() {
        int i = this.f15654k;
        if (i == 0) {
            i = m13623t();
        }
        if (i == 1) {
            mo9850m(3);
            this.f15654k = 0;
            return;
        }
        int r = mo9855r();
        String f = mo9843f();
        throw new C4904a("Expected BEGIN_OBJECT but was " + C4907d.m13602a(r) + " at path " + f);
    }

    /* renamed from: k */
    public final void mo9848k() {
        int i = this.f15654k;
        if (i == 0) {
            i = m13623t();
        }
        if (i == 4) {
            int i2 = this.f15645b - 1;
            this.f15645b = i2;
            int[] iArr = this.f15648e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f15654k = 0;
            return;
        }
        int r = mo9855r();
        throw new C4904a("Expected END_ARRAY but was " + C4907d.m13602a(r) + " at path " + mo9843f());
    }

    /* renamed from: l */
    public final void mo9849l() {
        int i = this.f15654k;
        if (i == 0) {
            i = m13623t();
        }
        if (i == 2) {
            int i2 = this.f15645b - 1;
            this.f15645b = i2;
            this.f15647d[i2] = null;
            int[] iArr = this.f15648e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f15654k = 0;
            return;
        }
        int r = mo9855r();
        throw new C4904a("Expected END_OBJECT but was " + C4907d.m13602a(r) + " at path " + mo9843f());
    }

    /* renamed from: n */
    public final void mo9851n() {
        int i = this.f15654k;
        if (i == 0) {
            i = m13623t();
        }
        if (i == 14) {
            m13629z();
        } else if (i == 13) {
            m13628y(f15650g);
        } else if (i == 12) {
            m13628y(f15649f);
        } else if (i != 15) {
            int r = mo9855r();
            String f = mo9843f();
            throw new C4904a("Expected a name but was " + C4907d.m13602a(r) + " at path " + f);
        }
        this.f15654k = 0;
        this.f15647d[this.f15645b - 1] = "null";
    }

    /* renamed from: o */
    public final void mo9852o() {
        int i = 0;
        do {
            int i2 = this.f15654k;
            if (i2 == 0) {
                i2 = m13623t();
            }
            if (i2 == 3) {
                mo9850m(1);
            } else if (i2 == 1) {
                mo9850m(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i >= 0) {
                        this.f15645b--;
                    } else {
                        int r = mo9855r();
                        throw new C4904a("Expected a value but was " + C4907d.m13602a(r) + " at path " + mo9843f());
                    }
                } else if (i2 == 2) {
                    i--;
                    if (i >= 0) {
                        this.f15645b--;
                    } else {
                        int r2 = mo9855r();
                        throw new C4904a("Expected a value but was " + C4907d.m13602a(r2) + " at path " + mo9843f());
                    }
                } else if (i2 == 14 || i2 == 10) {
                    m13629z();
                } else if (i2 == 9 || i2 == 13) {
                    m13628y(f15650g);
                } else if (i2 == 8 || i2 == 12) {
                    m13628y(f15649f);
                } else if (i2 == 17) {
                    this.f15653j.mo63078o((long) this.f15656m);
                } else if (i2 == 18) {
                    int r3 = mo9855r();
                    throw new C4904a("Expected a value but was " + C4907d.m13602a(r3) + " at path " + mo9843f());
                }
                this.f15654k = 0;
            }
            i++;
            this.f15654k = 0;
        } while (i != 0);
        int[] iArr = this.f15648e;
        int i3 = this.f15645b - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f15647d[i3] = "null";
    }

    /* renamed from: p */
    public final boolean mo9853p() {
        int i = this.f15654k;
        if (i == 0) {
            i = m13623t();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    /* renamed from: q */
    public final boolean mo9854q() {
        int i = this.f15654k;
        if (i == 0) {
            i = m13623t();
        }
        if (i == 5) {
            this.f15654k = 0;
            int[] iArr = this.f15648e;
            int i2 = this.f15645b - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f15654k = 0;
            int[] iArr2 = this.f15648e;
            int i3 = this.f15645b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            int r = mo9855r();
            throw new C4904a("Expected a boolean but was " + C4907d.m13602a(r) + " at path " + mo9843f());
        }
    }

    /* renamed from: r */
    public final int mo9855r() {
        int i = this.f15654k;
        if (i == 0) {
            i = m13623t();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        String obj = this.f15652i.toString();
        return "JsonReader(" + obj + ")";
    }
}
