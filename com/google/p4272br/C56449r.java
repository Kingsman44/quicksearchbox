package com.google.p4272br;

import java.io.Serializable;

/* renamed from: com.google.br.r */
/* compiled from: PG */
public final class C56449r implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final String f150776a;

    /* renamed from: b */
    public final transient C56453v f150777b;

    /* renamed from: c */
    private final int f150778c;

    public C56449r(String str, int i, C56453v vVar) {
        if (str != null) {
            this.f150776a = str;
            this.f150778c = i;
            this.f150777b = vVar;
            return;
        }
        throw new NullPointerException("pattern is null");
    }

    /* renamed from: a */
    public static C56449r m88180a(String str, int i) {
        return m88181b(i != 0 ? "(?i)".concat(String.valueOf(str)) : str, str, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.br.x} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01b2, code lost:
        r3 = r3 ^ -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b6, code lost:
        if (r8 != 58) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b8, code lost:
        r9.mo54406m(20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01bb, code lost:
        r9.f150771b = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x023a, code lost:
        if (r3 == r15) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x042c, code lost:
        throw new com.google.p4272br.C56450s("invalid character class range", r14.mo54393d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ae, code lost:
        if (r5 >= 0) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01b0, code lost:
        if (r6 == false) goto L_0x01bf;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x04c8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.p4272br.C56449r m88181b(java.lang.String r18, java.lang.String r19, int r20) {
        /*
            r0 = r18
            com.google.br.r r1 = new com.google.br.r
            com.google.br.q r9 = new com.google.br.q
            r9.<init>(r0)
            int r2 = r9.f150771b
            r3 = r2 & 2
            r11 = 5
            r12 = 0
            r13 = 1
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = r9.f150770a
            com.google.br.x r4 = new com.google.br.x
            r5 = 3
            r4.<init>((int) r5)
            r4.f150792b = r2
            int r2 = r3.length()
            int r5 = r3.codePointCount(r12, r2)
            int[] r5 = new int[r5]
            r6 = 0
            r7 = 0
        L_0x0028:
            if (r6 >= r2) goto L_0x0039
            int r8 = r3.codePointAt(r6)
            int r9 = r7 + 1
            r5[r7] = r8
            int r7 = java.lang.Character.charCount(r8)
            int r6 = r6 + r7
            r7 = r9
            goto L_0x0028
        L_0x0039:
            r4.f150794d = r5
            goto L_0x056f
        L_0x003d:
            com.google.br.p r14 = new com.google.br.p
            java.lang.String r2 = r9.f150770a
            r14.<init>(r2)
            r15 = -1
            r8 = -1
            r16 = -1
            r17 = -1
        L_0x004a:
            boolean r2 = r14.mo54396g()
            java.lang.String r3 = "missing closing )"
            if (r2 == 0) goto L_0x0543
            int r2 = r14.mo54390a()
            r4 = 36
            r5 = 8
            r6 = 10
            if (r2 == r4) goto L_0x0523
            r4 = 46
            if (r2 == r4) goto L_0x050e
            r4 = 63
            if (r2 == r4) goto L_0x0090
            r5 = 9
            r10 = 94
            if (r2 == r10) goto L_0x04cc
            r4 = 91
            r7 = 45
            r10 = 4
            if (r2 == r4) goto L_0x035f
            r4 = 92
            if (r2 == r4) goto L_0x0294
            r4 = 123(0x7b, float:1.72E-43)
            if (r2 == r4) goto L_0x01f2
            r4 = 124(0x7c, float:1.74E-43)
            if (r2 == r4) goto L_0x01dd
            r4 = 20
            r5 = 2
            switch(r2) {
                case 40: goto L_0x00e7;
                case 41: goto L_0x0093;
                case 42: goto L_0x0090;
                case 43: goto L_0x0090;
                default: goto L_0x0085;
            }
        L_0x0085:
            int r2 = r14.mo54391b()
            r9.mo54400f(r2)
        L_0x008c:
            r8 = -1
        L_0x008d:
            r10 = -1
            goto L_0x053f
        L_0x0090:
            r10 = -1
            goto L_0x04e2
        L_0x0093:
            r9.mo54409p()
            boolean r2 = r9.mo54404j()
            if (r2 == 0) goto L_0x009f
            r9.mo54398d()
        L_0x009f:
            r9.mo54408o()
            com.google.br.o r2 = r9.f150772c
            int r2 = r2.size()
            if (r2 < r5) goto L_0x00dd
            com.google.br.x r2 = r9.mo54398d()
            com.google.br.x r5 = r9.mo54398d()
            int r6 = r5.f150800j
            if (r6 != r4) goto L_0x00d5
            int r3 = r5.f150792b
            r9.f150771b = r3
            int r3 = r5.f150797g
            if (r3 != 0) goto L_0x00c2
            r9.mo54399e(r2)
            goto L_0x00cf
        L_0x00c2:
            r3 = 13
            r5.f150800j = r3
            com.google.br.x[] r3 = new com.google.p4272br.C56455x[r13]
            r3[r12] = r2
            r5.f150793c = r3
            r9.mo54399e(r5)
        L_0x00cf:
            int r2 = r14.f150767a
            int r2 = r2 + r13
            r14.f150767a = r2
            goto L_0x008c
        L_0x00d5:
            com.google.br.s r0 = new com.google.br.s
            java.lang.String r1 = r9.f150770a
            r0.<init>(r3, r1)
            throw r0
        L_0x00dd:
            com.google.br.s r0 = new com.google.br.s
            java.lang.String r1 = "regexp/syntax: internal error"
            java.lang.String r2 = "stack underflow"
            r0.<init>(r1, r2)
            throw r0
        L_0x00e7:
            int r2 = r9.f150771b
            r2 = r2 & 64
            if (r2 == 0) goto L_0x01cb
            java.lang.String r2 = r14.mo54393d()
            java.lang.String r3 = "(?"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x01cb
            int r2 = r14.f150767a
            java.lang.String r3 = r14.mo54393d()
            java.lang.String r6 = "(?P<"
            boolean r6 = r3.startsWith(r6)
            if (r6 == 0) goto L_0x016e
            r2 = 62
            int r2 = r3.indexOf(r2)
            java.lang.String r5 = "invalid named capture"
            if (r2 < 0) goto L_0x0168
            java.lang.String r6 = r3.substring(r10, r2)
            r14.mo54394e(r6)
            int r7 = r14.f150767a
            int r7 = r7 + r11
            r14.f150767a = r7
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x015e
            r7 = 0
        L_0x0124:
            int r8 = r6.length()
            if (r7 >= r8) goto L_0x013b
            char r8 = r6.charAt(r7)
            r10 = 95
            if (r8 == r10) goto L_0x0138
            boolean r8 = com.google.p4272br.C56432ab.m88121e(r8)
            if (r8 == 0) goto L_0x015e
        L_0x0138:
            int r7 = r7 + 1
            goto L_0x0124
        L_0x013b:
            com.google.br.x r2 = r9.mo54406m(r4)
            int r3 = r9.f150773d
            int r3 = r3 + r13
            r9.f150773d = r3
            r2.f150797g = r3
            java.util.Map r4 = r9.f150774e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r4.put(r6, r3)
            if (r3 != 0) goto L_0x0156
            r2.f150798h = r6
            goto L_0x008c
        L_0x0156:
            com.google.br.s r0 = new com.google.br.s
            java.lang.String r1 = "duplicate capture group name"
            r0.<init>(r1, r6)
            throw r0
        L_0x015e:
            com.google.br.s r0 = new com.google.br.s
            java.lang.String r1 = r3.substring(r12, r2)
            r0.<init>(r5, r1)
            throw r0
        L_0x0168:
            com.google.br.s r0 = new com.google.br.s
            r0.<init>(r5, r3)
            throw r0
        L_0x016e:
            int r3 = r14.f150767a
            int r3 = r3 + r5
            r14.f150767a = r3
            int r3 = r9.f150771b
            r5 = 1
        L_0x0176:
            r6 = 0
        L_0x0177:
            boolean r8 = r14.mo54396g()
            if (r8 == 0) goto L_0x01bf
            int r8 = r14.mo54391b()
            r10 = 41
            if (r8 == r10) goto L_0x01ae
            if (r8 == r7) goto L_0x01a8
            r10 = 58
            if (r8 == r10) goto L_0x01ae
            r6 = 85
            if (r8 == r6) goto L_0x01a4
            r6 = 105(0x69, float:1.47E-43)
            if (r8 == r6) goto L_0x01a1
            r6 = 109(0x6d, float:1.53E-43)
            if (r8 == r6) goto L_0x019e
            r6 = 115(0x73, float:1.61E-43)
            if (r8 != r6) goto L_0x01bf
            r3 = r3 | 8
            goto L_0x01a6
        L_0x019e:
            r3 = r3 & -17
            goto L_0x01a6
        L_0x01a1:
            r3 = r3 | 1
            goto L_0x01a6
        L_0x01a4:
            r3 = r3 | 32
        L_0x01a6:
            r6 = 1
            goto L_0x0177
        L_0x01a8:
            if (r5 < 0) goto L_0x01bf
            r3 = r3 ^ -1
            r5 = -1
            goto L_0x0176
        L_0x01ae:
            if (r5 >= 0) goto L_0x01b4
            if (r6 == 0) goto L_0x01bf
            r3 = r3 ^ -1
        L_0x01b4:
            r2 = 58
            if (r8 != r2) goto L_0x01bb
            r9.mo54406m(r4)
        L_0x01bb:
            r9.f150771b = r3
            goto L_0x008c
        L_0x01bf:
            com.google.br.s r0 = new com.google.br.s
            java.lang.String r1 = "invalid or unsupported Perl syntax"
            java.lang.String r2 = r14.mo54392c(r2)
            r0.<init>(r1, r2)
            throw r0
        L_0x01cb:
            com.google.br.x r2 = r9.mo54406m(r4)
            int r3 = r9.f150773d
            int r3 = r3 + r13
            r9.f150773d = r3
            r2.f150797g = r3
            int r2 = r14.f150767a
            int r2 = r2 + r13
            r14.f150767a = r2
            goto L_0x008c
        L_0x01dd:
            r9.mo54409p()
            boolean r2 = r9.mo54404j()
            if (r2 != 0) goto L_0x01eb
            r2 = 21
            r9.mo54406m(r2)
        L_0x01eb:
            int r2 = r14.f150767a
            int r2 = r2 + r13
            r14.f150767a = r2
            goto L_0x008c
        L_0x01f2:
            int r10 = r14.f150767a
            boolean r2 = r14.mo54396g()
            if (r2 == 0) goto L_0x0273
            boolean r2 = r14.mo54395f(r4)
            if (r2 != 0) goto L_0x0202
            goto L_0x0273
        L_0x0202:
            int r2 = r14.f150767a
            int r2 = r2 + r13
            r14.f150767a = r2
            int r2 = com.google.p4272br.C56448q.m88159c(r14)
            if (r2 != r15) goto L_0x020f
            goto L_0x0273
        L_0x020f:
            boolean r3 = r14.mo54396g()
            if (r3 != 0) goto L_0x0216
            goto L_0x0273
        L_0x0216:
            r3 = 44
            boolean r3 = r14.mo54395f(r3)
            if (r3 != 0) goto L_0x0220
            r3 = r2
            goto L_0x023d
        L_0x0220:
            int r3 = r14.f150767a
            int r3 = r3 + r13
            r14.f150767a = r3
            boolean r3 = r14.mo54396g()
            if (r3 != 0) goto L_0x022c
            goto L_0x0273
        L_0x022c:
            r3 = 125(0x7d, float:1.75E-43)
            boolean r3 = r14.mo54395f(r3)
            if (r3 == 0) goto L_0x0236
            r3 = -1
            goto L_0x023d
        L_0x0236:
            int r3 = com.google.p4272br.C56448q.m88159c(r14)
            if (r3 != r15) goto L_0x023d
            goto L_0x0273
        L_0x023d:
            boolean r4 = r14.mo54396g()
            if (r4 == 0) goto L_0x0273
            r4 = 125(0x7d, float:1.75E-43)
            boolean r4 = r14.mo54395f(r4)
            if (r4 != 0) goto L_0x024c
            goto L_0x0273
        L_0x024c:
            int r4 = r14.f150767a
            int r4 = r4 + r13
            r14.f150767a = r4
            if (r2 < 0) goto L_0x0267
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r2 > r4) goto L_0x0267
            r4 = -2
            if (r3 == r4) goto L_0x0267
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 > r4) goto L_0x0267
            if (r3 < 0) goto L_0x0262
            if (r2 > r3) goto L_0x0267
        L_0x0262:
            int r2 = r2 << 16
            char r3 = (char) r3
            r2 = r2 | r3
            goto L_0x0274
        L_0x0267:
            com.google.br.s r0 = new com.google.br.s
            java.lang.String r1 = "invalid repeat count"
            java.lang.String r2 = r14.mo54392c(r10)
            r0.<init>(r1, r2)
            throw r0
        L_0x0273:
            r2 = -1
        L_0x0274:
            if (r2 >= 0) goto L_0x0280
            r14.f150767a = r10
            int r2 = r14.mo54391b()
            r9.mo54400f(r2)
            goto L_0x0291
        L_0x0280:
            int r16 = r2 >> 16
            char r2 = (char) r2
            short r7 = (short) r2
            r3 = 17
            r2 = r9
            r4 = r16
            r5 = r7
            r6 = r10
            r17 = r7
            r7 = r14
            r2.mo54407n(r3, r4, r5, r6, r7, r8)
        L_0x0291:
            r8 = r10
            goto L_0x008d
        L_0x0294:
            int r2 = r14.f150767a
            int r3 = r2 + 1
            r14.f150767a = r3
            int r3 = r9.f150771b
            r3 = r3 & 64
            if (r3 == 0) goto L_0x0305
            boolean r3 = r14.mo54396g()
            if (r3 == 0) goto L_0x0305
            int r3 = r14.mo54391b()
            r4 = 81
            if (r3 == r4) goto L_0x02de
            r4 = 98
            if (r3 == r4) goto L_0x02d7
            r4 = 122(0x7a, float:1.71E-43)
            if (r3 == r4) goto L_0x02d2
            switch(r3) {
                case 65: goto L_0x02cd;
                case 66: goto L_0x02c6;
                case 67: goto L_0x02bc;
                default: goto L_0x02b9;
            }
        L_0x02b9:
            r14.f150767a = r2
            goto L_0x0305
        L_0x02bc:
            com.google.br.s r0 = new com.google.br.s
            java.lang.String r1 = "invalid escape sequence"
            java.lang.String r2 = "\\C"
            r0.<init>(r1, r2)
            throw r0
        L_0x02c6:
            r2 = 12
            r9.mo54406m(r2)
            goto L_0x008c
        L_0x02cd:
            r9.mo54406m(r5)
            goto L_0x008c
        L_0x02d2:
            r9.mo54406m(r6)
            goto L_0x008c
        L_0x02d7:
            r2 = 11
            r9.mo54406m(r2)
            goto L_0x008c
        L_0x02de:
            java.lang.String r2 = r14.mo54393d()
            java.lang.String r3 = "\\E"
            int r4 = r2.indexOf(r3)
            if (r4 < 0) goto L_0x02ee
            java.lang.String r2 = r2.substring(r12, r4)
        L_0x02ee:
            r14.mo54394e(r2)
            r14.mo54394e(r3)
            r3 = 0
        L_0x02f5:
            int r4 = r2.length()
            if (r3 >= r4) goto L_0x008c
            char r4 = r2.charAt(r3)
            r9.mo54400f(r4)
            int r3 = r3 + 1
            goto L_0x02f5
        L_0x0305:
            com.google.br.x r3 = r9.mo54405l(r10)
            int r4 = r9.f150771b
            r3.f150792b = r4
            java.lang.String r4 = r14.mo54393d()
            java.lang.String r5 = "\\p"
            boolean r4 = r4.startsWith(r5)
            if (r4 != 0) goto L_0x0325
            java.lang.String r4 = r14.mo54393d()
            java.lang.String r5 = "\\P"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L_0x033b
        L_0x0325:
            com.google.br.a r4 = new com.google.br.a
            r4.<init>()
            boolean r5 = r9.mo54403i(r14, r4)
            if (r5 == 0) goto L_0x033b
            int[] r2 = r4.mo54364b()
            r3.f150794d = r2
            r9.mo54399e(r3)
            goto L_0x008c
        L_0x033b:
            com.google.br.a r4 = new com.google.br.a
            r4.<init>()
            boolean r5 = r9.mo54402h(r14, r4)
            if (r5 == 0) goto L_0x0351
            int[] r2 = r4.mo54364b()
            r3.f150794d = r2
            r9.mo54399e(r3)
            goto L_0x008c
        L_0x0351:
            r14.f150767a = r2
            r9.mo54401g(r3)
            int r2 = com.google.p4272br.C56448q.m88158b(r14)
            r9.mo54400f(r2)
            goto L_0x008c
        L_0x035f:
            int r2 = r14.f150767a
            int r3 = r2 + 1
            r14.f150767a = r3
            com.google.br.x r3 = r9.mo54405l(r10)
            int r4 = r9.f150771b
            r3.f150792b = r4
            com.google.br.a r4 = new com.google.br.a
            r4.<init>()
            boolean r5 = r14.mo54396g()
            if (r5 == 0) goto L_0x038f
            r5 = 94
            boolean r5 = r14.mo54395f(r5)
            if (r5 == 0) goto L_0x038f
            int r5 = r14.f150767a
            int r5 = r5 + r13
            r14.f150767a = r5
            int r5 = r9.f150771b
            r5 = r5 & r10
            if (r5 != 0) goto L_0x038d
            r4.mo54367e(r6, r6)
        L_0x038d:
            r6 = -1
            goto L_0x0390
        L_0x038f:
            r6 = 1
        L_0x0390:
            r5 = 1
        L_0x0391:
            boolean r8 = r14.mo54396g()
            r10 = 93
            if (r8 == 0) goto L_0x03f6
            int r8 = r14.mo54390a()
            if (r8 != r10) goto L_0x03f6
            if (r5 == 0) goto L_0x03a3
            r5 = 1
            goto L_0x03f6
        L_0x03a3:
            int r2 = r14.f150767a
            int r2 = r2 + r13
            r14.f150767a = r2
            r4.mo54369g()
            if (r6 >= 0) goto L_0x03eb
            r2 = 0
            r5 = 0
            r6 = 0
        L_0x03b0:
            int r7 = r4.f150561b
            if (r2 >= r7) goto L_0x03cc
            int[] r7 = r4.f150560a
            r8 = r7[r2]
            int r10 = r2 + 1
            r10 = r7[r10]
            int r8 = r8 + r15
            if (r6 > r8) goto L_0x03c7
            r7[r5] = r6
            int r6 = r5 + 1
            r7[r6] = r8
            int r5 = r5 + 2
        L_0x03c7:
            int r6 = r10 + 1
            int r2 = r2 + 2
            goto L_0x03b0
        L_0x03cc:
            r4.f150561b = r5
            r2 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 > r2) goto L_0x03eb
            int r5 = r5 + 2
            r4.mo54363a(r5)
            int[] r2 = r4.f150560a
            int r5 = r4.f150561b
            int r7 = r5 + 1
            r4.f150561b = r7
            r2[r5] = r6
            int r5 = r7 + 1
            r4.f150561b = r5
            r5 = 1114111(0x10ffff, float:1.561202E-39)
            r2[r7] = r5
        L_0x03eb:
            int[] r2 = r4.mo54364b()
            r3.f150794d = r2
            r9.mo54399e(r3)
            goto L_0x008c
        L_0x03f6:
            boolean r8 = r14.mo54396g()
            java.lang.String r11 = "invalid character class range"
            if (r8 == 0) goto L_0x042d
            boolean r8 = r14.mo54395f(r7)
            if (r8 == 0) goto L_0x042d
            int r8 = r9.f150771b
            r8 = r8 & 64
            if (r8 != 0) goto L_0x042d
            if (r5 != 0) goto L_0x042d
            java.lang.String r5 = r14.mo54393d()
            java.lang.String r8 = "-"
            boolean r8 = r5.equals(r8)
            if (r8 != 0) goto L_0x0421
            java.lang.String r8 = "-]"
            boolean r5 = r5.startsWith(r8)
            if (r5 == 0) goto L_0x0421
            goto L_0x042d
        L_0x0421:
            r14.f150767a = r2
            com.google.br.s r0 = new com.google.br.s
            java.lang.String r1 = r14.mo54393d()
            r0.<init>(r11, r1)
            throw r0
        L_0x042d:
            int r5 = r14.f150767a
            java.lang.String r8 = r14.mo54393d()
            java.lang.String r15 = "[:"
            boolean r8 = r8.startsWith(r15)
            if (r8 == 0) goto L_0x046f
            java.lang.String r8 = r14.mo54393d()
            java.lang.String r15 = ":]"
            int r15 = r8.indexOf(r15)
            if (r15 >= 0) goto L_0x044a
            r14.f150767a = r5
            goto L_0x046f
        L_0x044a:
            int r15 = r15 + 2
            java.lang.String r5 = r8.substring(r12, r15)
            r14.mo54394e(r5)
            java.util.HashMap r8 = com.google.p4272br.C56433b.f150708b
            java.lang.Object r8 = r8.get(r5)
            com.google.br.b r8 = (com.google.p4272br.C56433b) r8
            if (r8 == 0) goto L_0x0469
            int r5 = r9.f150771b
            r5 = r5 & r13
            if (r13 == r5) goto L_0x0464
            r5 = 0
            goto L_0x0465
        L_0x0464:
            r5 = 1
        L_0x0465:
            r4.mo54366d(r8, r5)
            goto L_0x0475
        L_0x0469:
            com.google.br.s r0 = new com.google.br.s
            r0.<init>(r11, r5)
            throw r0
        L_0x046f:
            boolean r8 = r9.mo54403i(r14, r4)
            if (r8 == 0) goto L_0x047a
        L_0x0475:
            r5 = 0
            r11 = 5
            r15 = -1
            goto L_0x0391
        L_0x047a:
            boolean r8 = r9.mo54402h(r14, r4)
            if (r8 == 0) goto L_0x0481
            goto L_0x0475
        L_0x0481:
            r14.f150767a = r5
            int r8 = com.google.p4272br.C56448q.m88157a(r14, r2)
            boolean r15 = r14.mo54396g()
            if (r15 == 0) goto L_0x04bd
            boolean r15 = r14.mo54395f(r7)
            if (r15 == 0) goto L_0x04bd
            int r15 = r14.f150767a
            int r15 = r15 + r13
            r14.f150767a = r15
            boolean r15 = r14.mo54396g()
            if (r15 == 0) goto L_0x04ab
            boolean r10 = r14.mo54395f(r10)
            if (r10 == 0) goto L_0x04ab
            int r5 = r14.f150767a
            r10 = -1
            int r5 = r5 + r10
            r14.f150767a = r5
            goto L_0x04be
        L_0x04ab:
            r10 = -1
            int r15 = com.google.p4272br.C56448q.m88157a(r14, r2)
            if (r15 < r8) goto L_0x04b3
            goto L_0x04bf
        L_0x04b3:
            com.google.br.s r0 = new com.google.br.s
            java.lang.String r1 = r14.mo54392c(r5)
            r0.<init>(r11, r1)
            throw r0
        L_0x04bd:
            r10 = -1
        L_0x04be:
            r15 = r8
        L_0x04bf:
            int r5 = r9.f150771b
            r5 = r5 & r13
            if (r5 != 0) goto L_0x04c8
            r4.mo54367e(r8, r15)
            goto L_0x0475
        L_0x04c8:
            r4.mo54371i(r8, r15)
            goto L_0x0475
        L_0x04cc:
            r10 = -1
            int r2 = r9.f150771b
            r3 = 16
            r2 = r2 & r3
            if (r2 == 0) goto L_0x04d8
            r9.mo54406m(r5)
            goto L_0x04dc
        L_0x04d8:
            r2 = 7
            r9.mo54406m(r2)
        L_0x04dc:
            int r2 = r14.f150767a
            int r2 = r2 + r13
            r14.f150767a = r2
            goto L_0x053e
        L_0x04e2:
            int r11 = r14.f150767a
            int r2 = r14.mo54391b()
            r3 = 42
            if (r2 == r3) goto L_0x04fe
            r3 = 43
            if (r2 == r3) goto L_0x04f9
            r3 = 63
            if (r2 == r3) goto L_0x04f6
            r3 = 0
            goto L_0x0502
        L_0x04f6:
            r3 = 16
            goto L_0x0502
        L_0x04f9:
            r2 = 15
            r3 = 15
            goto L_0x0502
        L_0x04fe:
            r2 = 14
            r3 = 14
        L_0x0502:
            r2 = r9
            r4 = r16
            r5 = r17
            r6 = r11
            r7 = r14
            r2.mo54407n(r3, r4, r5, r6, r7, r8)
            r8 = r11
            goto L_0x053f
        L_0x050e:
            r10 = -1
            int r2 = r9.f150771b
            r2 = r2 & r5
            if (r2 == 0) goto L_0x0519
            r2 = 6
            r9.mo54406m(r2)
            goto L_0x051d
        L_0x0519:
            r2 = 5
            r9.mo54406m(r2)
        L_0x051d:
            int r2 = r14.f150767a
            int r2 = r2 + r13
            r14.f150767a = r2
            goto L_0x053e
        L_0x0523:
            r10 = -1
            int r2 = r9.f150771b
            r3 = 16
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0536
            com.google.br.x r2 = r9.mo54406m(r6)
            int r3 = r2.f150792b
            r3 = r3 | 256(0x100, float:3.59E-43)
            r2.f150792b = r3
            goto L_0x0539
        L_0x0536:
            r9.mo54406m(r5)
        L_0x0539:
            int r2 = r14.f150767a
            int r2 = r2 + r13
            r14.f150767a = r2
        L_0x053e:
            r8 = -1
        L_0x053f:
            r11 = 5
            r15 = -1
            goto L_0x004a
        L_0x0543:
            r9.mo54409p()
            boolean r2 = r9.mo54404j()
            if (r2 == 0) goto L_0x054f
            r9.mo54398d()
        L_0x054f:
            r9.mo54408o()
            com.google.br.o r2 = r9.f150772c
            int r2 = r2.size()
            if (r2 != r13) goto L_0x0603
            com.google.br.o r2 = r9.f150772c
            java.lang.Object r2 = r2.get(r12)
            com.google.br.x r2 = (com.google.p4272br.C56455x) r2
            java.util.Map r3 = r9.f150774e
            r2.f150799i = r3
            com.google.br.o r2 = r9.f150772c
            java.lang.Object r2 = r2.get(r12)
            r4 = r2
            com.google.br.x r4 = (com.google.p4272br.C56455x) r4
        L_0x056f:
            int r2 = r4.mo54420a()
            com.google.br.x r3 = com.google.p4272br.C56456y.m88191a(r4)
            int r4 = com.google.p4272br.C56435d.f150730a
            com.google.br.t r4 = new com.google.br.t
            r4.<init>()
            r5 = 5
            com.google.p4272br.C56435d.m88124b(r5, r4)
            com.google.br.c r5 = com.google.p4272br.C56435d.m88123a(r3, r4)
            int r6 = r5.f150729b
            r7 = 6
            com.google.br.c r7 = com.google.p4272br.C56435d.m88124b(r7, r4)
            int r7 = r7.f150728a
            r4.mo54416c(r6, r7)
            int r5 = r5.f150728a
            r4.f150781c = r5
            com.google.br.v r5 = new com.google.br.v
            r5.<init>(r0, r4, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r4.f150781c
            com.google.br.e r2 = r4.mo54415b(r2)
            int r6 = r2.f150733a
            boolean r6 = com.google.p4272br.C56436e.m88131a(r6)
            if (r6 == 0) goto L_0x05d2
            int[] r6 = r2.f150736d
            int r6 = r6.length
            if (r6 == r13) goto L_0x05b4
            goto L_0x05d2
        L_0x05b4:
            int r6 = r2.f150733a
            boolean r6 = com.google.p4272br.C56436e.m88131a(r6)
            if (r6 == 0) goto L_0x05d2
            int[] r6 = r2.f150736d
            int r7 = r6.length
            if (r7 != r13) goto L_0x05d2
            int r7 = r2.f150735c
            r7 = r7 & r13
            if (r7 != 0) goto L_0x05d2
            r6 = r6[r12]
            r0.appendCodePoint(r6)
            int r2 = r2.f150734b
            com.google.br.e r2 = r4.mo54415b(r2)
            goto L_0x05b4
        L_0x05d2:
            java.lang.String r0 = r0.toString()
            r5.f150787e = r0
            java.lang.String r0 = r5.f150787e     // Catch:{ UnsupportedEncodingException -> 0x05fb }
            java.lang.String r2 = "UTF-8"
            r0.getBytes(r2)     // Catch:{ UnsupportedEncodingException -> 0x05fb }
            java.lang.String r0 = r5.f150787e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x05ef
            java.lang.String r0 = r5.f150787e
            int r0 = r0.codePointAt(r12)
            r5.f150788f = r0
        L_0x05ef:
            java.util.Map r0 = r3.f150799i
            r5.f150789g = r0
            r0 = r19
            r2 = r20
            r1.<init>(r0, r2, r5)
            return r1
        L_0x05fb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "can't happen"
            r0.<init>(r1)
            throw r0
        L_0x0603:
            com.google.br.s r0 = new com.google.br.s
            java.lang.String r1 = r9.f150770a
            r0.<init>(r3, r1)
            goto L_0x060c
        L_0x060b:
            throw r0
        L_0x060c:
            goto L_0x060b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4272br.C56449r.m88181b(java.lang.String, java.lang.String, int):com.google.br.r");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C56449r rVar = (C56449r) obj;
            return this.f150778c == rVar.f150778c && this.f150776a.equals(rVar.f150776a);
        }
    }

    public final int hashCode() {
        return (this.f150776a.hashCode() * 31) + this.f150778c;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return m88180a(this.f150776a, this.f150778c);
    }

    public final String toString() {
        return this.f150776a;
    }
}
