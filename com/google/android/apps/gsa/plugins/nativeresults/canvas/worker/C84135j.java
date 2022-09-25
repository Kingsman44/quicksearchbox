package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.j */
/* compiled from: PG */
public final class C84135j extends C84124ad {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x040a, code lost:
        if ((r5 & 16) == 0) goto L_0x0417;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent mo77553a(java.lang.String r19, java.lang.String r20, int r21, java.lang.String r22, java.lang.String r23) {
        /*
            r18 = this;
            android.util.JsonReader r0 = new android.util.JsonReader
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r20
            r1.<init>(r2)
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.protos.w.a.a.d r2 = com.google.protos.p5146w.p5147a.p5148a.C65926d.f179289b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.protos.w.a.a.c r2 = (com.google.protos.p5146w.p5147a.p5148a.C65925c) r2
            r3 = 0
            r0.beginArray()     // Catch:{ IOException -> 0x0440 }
        L_0x001d:
            boolean r4 = r0.hasNext()     // Catch:{ IOException -> 0x0440 }
            if (r4 == 0) goto L_0x043c
            com.google.protos.w.a.a.h r4 = com.google.protos.p5146w.p5147a.p5148a.C65930h.f179300i     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.g r4 = (com.google.protos.p5146w.p5147a.p5148a.C65929g) r4     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.f r5 = com.google.protos.p5146w.p5147a.p5148a.C65928f.f179293f     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.e r5 = (com.google.protos.p5146w.p5147a.p5148a.C65927e) r5     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.f r6 = com.google.protos.p5146w.p5147a.p5148a.C65928f.f179293f     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.e r6 = (com.google.protos.p5146w.p5147a.p5148a.C65927e) r6     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.o r7 = com.google.protos.p5146w.p5147a.p5148a.C65937o.f179332k     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.n r7 = (com.google.protos.p5146w.p5147a.p5148a.C65936n) r7     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.b r8 = com.google.protos.p5146w.p5147a.p5148a.C65924b.f179283d     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.a r8 = (com.google.protos.p5146w.p5147a.p5148a.C65923a) r8     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.m r9 = com.google.protos.p5146w.p5147a.p5148a.C65935m.f179323c     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.l r9 = (com.google.protos.p5146w.p5147a.p5148a.C65934l) r9     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.s r10 = com.google.protos.p5146w.p5147a.p5148a.C65941s.f179349d     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.r r10 = (com.google.protos.p5146w.p5147a.p5148a.C65940r) r10     // Catch:{ IOException -> 0x0440 }
            r0.beginObject()     // Catch:{ IOException -> 0x0440 }
        L_0x005e:
            boolean r11 = r0.hasNext()     // Catch:{ IOException -> 0x0440 }
            r12 = 16
            r13 = 4
            if (r11 == 0) goto L_0x03aa
            java.lang.String r11 = r0.nextName()     // Catch:{ IOException -> 0x0440 }
            int r14 = r11.hashCode()     // Catch:{ IOException -> 0x0440 }
            r15 = 8
            r16 = 1
            r17 = 2
            switch(r14) {
                case 115: goto L_0x0171;
                case 3124: goto L_0x0167;
                case 3262: goto L_0x015d;
                case 3355: goto L_0x0153;
                case 3545: goto L_0x0149;
                case 3556: goto L_0x013f;
                case 3558: goto L_0x0134;
                case 3560: goto L_0x0129;
                case 3588: goto L_0x011f;
                case 3589: goto L_0x0115;
                case 3638: goto L_0x0109;
                case 3651: goto L_0x00fd;
                case 3681: goto L_0x00f1;
                case 3700: goto L_0x00e5;
                case 3713: goto L_0x00d9;
                case 3715: goto L_0x00cd;
                case 98603: goto L_0x00c2;
                case 112909: goto L_0x00b6;
                case 113049: goto L_0x00aa;
                case 114228: goto L_0x009e;
                case 116629: goto L_0x0092;
                case 3559969: goto L_0x0086;
                case 110359112: goto L_0x007a;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x017c
        L_0x007a:
            java.lang.String r14 = "tigrh"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 15
            goto L_0x017d
        L_0x0086:
            java.lang.String r14 = "tigs"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 16
            goto L_0x017d
        L_0x0092:
            java.lang.String r14 = "ved"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 21
            goto L_0x017d
        L_0x009e:
            java.lang.String r14 = "stu"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 13
            goto L_0x017d
        L_0x00aa:
            java.lang.String r14 = "rmt"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 11
            goto L_0x017d
        L_0x00b6:
            java.lang.String r14 = "rid"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 8
            goto L_0x017d
        L_0x00c2:
            java.lang.String r14 = "clt"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 1
            goto L_0x017d
        L_0x00cd:
            java.lang.String r14 = "tw"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 18
            goto L_0x017d
        L_0x00d9:
            java.lang.String r14 = "tu"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 19
            goto L_0x017d
        L_0x00e5:
            java.lang.String r14 = "th"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 17
            goto L_0x017d
        L_0x00f1:
            java.lang.String r14 = "st"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 12
            goto L_0x017d
        L_0x00fd:
            java.lang.String r14 = "ru"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 10
            goto L_0x017d
        L_0x0109:
            java.lang.String r14 = "rh"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 9
            goto L_0x017d
        L_0x0115:
            java.lang.String r14 = "pu"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 7
            goto L_0x017d
        L_0x011f:
            java.lang.String r14 = "pt"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 6
            goto L_0x017d
        L_0x0129:
            java.lang.String r14 = "ow"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 22
            goto L_0x017d
        L_0x0134:
            java.lang.String r14 = "ou"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 20
            goto L_0x017d
        L_0x013f:
            java.lang.String r14 = "os"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 3
            goto L_0x017d
        L_0x0149:
            java.lang.String r14 = "oh"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 5
            goto L_0x017d
        L_0x0153:
            java.lang.String r14 = "id"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 2
            goto L_0x017d
        L_0x015d:
            java.lang.String r14 = "fd"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 4
            goto L_0x017d
        L_0x0167:
            java.lang.String r14 = "au"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 0
            goto L_0x017d
        L_0x0171:
            java.lang.String r14 = "s"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x017c
            r11 = 14
            goto L_0x017d
        L_0x017c:
            r11 = -1
        L_0x017d:
            switch(r11) {
                case 0: goto L_0x0392;
                case 1: goto L_0x0377;
                case 2: goto L_0x035f;
                case 3: goto L_0x0348;
                case 4: goto L_0x0330;
                case 5: goto L_0x031b;
                case 6: goto L_0x02fc;
                case 7: goto L_0x02e4;
                case 8: goto L_0x02cc;
                case 9: goto L_0x02b4;
                case 10: goto L_0x029d;
                case 11: goto L_0x0280;
                case 12: goto L_0x0268;
                case 13: goto L_0x0251;
                case 14: goto L_0x023a;
                case 15: goto L_0x0222;
                case 16: goto L_0x020a;
                case 17: goto L_0x01f5;
                case 18: goto L_0x01e1;
                case 19: goto L_0x01c9;
                case 20: goto L_0x01b1;
                case 21: goto L_0x0199;
                case 22: goto L_0x0185;
                default: goto L_0x0180;
            }
        L_0x0180:
            r0.skipValue()     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x0185:
            int r11 = r0.nextInt()     // Catch:{ IOException -> 0x0440 }
            r5.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r5.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.f r12 = (com.google.protos.p5146w.p5147a.p5148a.C65928f) r12     // Catch:{ IOException -> 0x0440 }
            int r14 = r12.f179295a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | r14
            r12.f179295a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179298d = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x0199:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            r4.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r4.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.h r12 = (com.google.protos.p5146w.p5147a.p5148a.C65930h) r12     // Catch:{ IOException -> 0x0440 }
            r11.getClass()     // Catch:{ IOException -> 0x0440 }
            int r13 = r12.f179302a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | 128(0x80, float:1.794E-43)
            r12.f179302a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179306e = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x01b1:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            r5.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r5.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.f r12 = (com.google.protos.p5146w.p5147a.p5148a.C65928f) r12     // Catch:{ IOException -> 0x0440 }
            r11.getClass()     // Catch:{ IOException -> 0x0440 }
            int r13 = r12.f179295a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | 1
            r12.f179295a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179296b = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x01c9:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            r6.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r6.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.f r12 = (com.google.protos.p5146w.p5147a.p5148a.C65928f) r12     // Catch:{ IOException -> 0x0440 }
            r11.getClass()     // Catch:{ IOException -> 0x0440 }
            int r13 = r12.f179295a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | 1
            r12.f179295a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179296b = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x01e1:
            int r11 = r0.nextInt()     // Catch:{ IOException -> 0x0440 }
            r6.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r6.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.f r12 = (com.google.protos.p5146w.p5147a.p5148a.C65928f) r12     // Catch:{ IOException -> 0x0440 }
            int r14 = r12.f179295a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | r14
            r12.f179295a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179298d = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x01f5:
            int r11 = r0.nextInt()     // Catch:{ IOException -> 0x0440 }
            r6.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r6.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.f r12 = (com.google.protos.p5146w.p5147a.p5148a.C65928f) r12     // Catch:{ IOException -> 0x0440 }
            int r13 = r12.f179295a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | 2
            r12.f179295a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179297c = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x020a:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            r10.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r10.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.s r12 = (com.google.protos.p5146w.p5147a.p5148a.C65941s) r12     // Catch:{ IOException -> 0x0440 }
            r11.getClass()     // Catch:{ IOException -> 0x0440 }
            int r13 = r12.f179352a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | 2
            r12.f179352a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179354c = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x0222:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            r10.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r10.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.s r12 = (com.google.protos.p5146w.p5147a.p5148a.C65941s) r12     // Catch:{ IOException -> 0x0440 }
            r11.getClass()     // Catch:{ IOException -> 0x0440 }
            int r13 = r12.f179352a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | 1
            r12.f179352a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179353b = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x023a:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r13 = r7.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.o r13 = (com.google.protos.p5146w.p5147a.p5148a.C65937o) r13     // Catch:{ IOException -> 0x0440 }
            r11.getClass()     // Catch:{ IOException -> 0x0440 }
            int r14 = r13.f179335a     // Catch:{ IOException -> 0x0440 }
            r12 = r12 | r14
            r13.f179335a = r12     // Catch:{ IOException -> 0x0440 }
            r13.f179340f = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x0251:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            r6.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r6.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.f r12 = (com.google.protos.p5146w.p5147a.p5148a.C65928f) r12     // Catch:{ IOException -> 0x0440 }
            r11.getClass()     // Catch:{ IOException -> 0x0440 }
            int r13 = r12.f179295a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | r15
            r12.f179295a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179299e = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x0268:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r7.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.o r12 = (com.google.protos.p5146w.p5147a.p5148a.C65937o) r12     // Catch:{ IOException -> 0x0440 }
            r11.getClass()     // Catch:{ IOException -> 0x0440 }
            int r13 = r12.f179335a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | 1024(0x400, float:1.435E-42)
            r12.f179335a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179344j = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x0280:
            int r11 = r0.nextInt()     // Catch:{ IOException -> 0x0440 }
            int r11 = com.google.protos.p5146w.p5149b.p5157c.C65954d.m96831a(r11)     // Catch:{ IOException -> 0x0440 }
            if (r11 == 0) goto L_0x005e
            r4.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r4.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.h r12 = (com.google.protos.p5146w.p5147a.p5148a.C65930h) r12     // Catch:{ IOException -> 0x0440 }
            int r11 = r11 + -1
            r12.f179307f = r11     // Catch:{ IOException -> 0x0440 }
            int r11 = r12.f179302a     // Catch:{ IOException -> 0x0440 }
            r11 = r11 | 256(0x100, float:3.59E-43)
            r12.f179302a = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x029d:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r7.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.o r12 = (com.google.protos.p5146w.p5147a.p5148a.C65937o) r12     // Catch:{ IOException -> 0x0440 }
            r11.getClass()     // Catch:{ IOException -> 0x0440 }
            int r14 = r12.f179335a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | r14
            r12.f179335a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179338d = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x02b4:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            r8.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r8.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.b r12 = (com.google.protos.p5146w.p5147a.p5148a.C65924b) r12     // Catch:{ IOException -> 0x0440 }
            r11.getClass()     // Catch:{ IOException -> 0x0440 }
            int r13 = r12.f179286a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | 2
            r12.f179286a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179287b = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x02cc:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r7.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.o r12 = (com.google.protos.p5146w.p5147a.p5148a.C65937o) r12     // Catch:{ IOException -> 0x0440 }
            r11.getClass()     // Catch:{ IOException -> 0x0440 }
            int r13 = r12.f179335a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | 2
            r12.f179335a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179337c = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x02e4:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r7.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.o r12 = (com.google.protos.p5146w.p5147a.p5148a.C65937o) r12     // Catch:{ IOException -> 0x0440 }
            r11.getClass()     // Catch:{ IOException -> 0x0440 }
            int r13 = r12.f179335a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | 64
            r12.f179335a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179342h = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x02fc:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            android.text.Spanned r11 = android.text.Html.fromHtml(r11)     // Catch:{ IOException -> 0x0440 }
            java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0440 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r7.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.o r12 = (com.google.protos.p5146w.p5147a.p5148a.C65937o) r12     // Catch:{ IOException -> 0x0440 }
            r11.getClass()     // Catch:{ IOException -> 0x0440 }
            int r13 = r12.f179335a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | r15
            r12.f179335a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179339e = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x031b:
            int r11 = r0.nextInt()     // Catch:{ IOException -> 0x0440 }
            r5.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r5.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.f r12 = (com.google.protos.p5146w.p5147a.p5148a.C65928f) r12     // Catch:{ IOException -> 0x0440 }
            int r13 = r12.f179295a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | 2
            r12.f179295a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179297c = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x0330:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r7.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.o r12 = (com.google.protos.p5146w.p5147a.p5148a.C65937o) r12     // Catch:{ IOException -> 0x0440 }
            r11.getClass()     // Catch:{ IOException -> 0x0440 }
            int r13 = r12.f179335a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | 1
            r12.f179335a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179336b = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x0348:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            r8.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r8.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.b r12 = (com.google.protos.p5146w.p5147a.p5148a.C65924b) r12     // Catch:{ IOException -> 0x0440 }
            r11.getClass()     // Catch:{ IOException -> 0x0440 }
            int r14 = r12.f179286a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | r14
            r12.f179286a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179288c = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x035f:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            r4.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r4.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.h r12 = (com.google.protos.p5146w.p5147a.p5148a.C65930h) r12     // Catch:{ IOException -> 0x0440 }
            r11.getClass()     // Catch:{ IOException -> 0x0440 }
            int r13 = r12.f179302a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | 2
            r12.f179302a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179303b = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x0377:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            java.lang.String r12 = "y"
            boolean r11 = r11.equals(r12)     // Catch:{ IOException -> 0x0440 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r7.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.o r12 = (com.google.protos.p5146w.p5147a.p5148a.C65937o) r12     // Catch:{ IOException -> 0x0440 }
            int r13 = r12.f179335a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | 32
            r12.f179335a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179341g = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x0392:
            java.lang.String r11 = r0.nextString()     // Catch:{ IOException -> 0x0440 }
            r7.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r12 = r7.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.o r12 = (com.google.protos.p5146w.p5147a.p5148a.C65937o) r12     // Catch:{ IOException -> 0x0440 }
            r11.getClass()     // Catch:{ IOException -> 0x0440 }
            int r13 = r12.f179335a     // Catch:{ IOException -> 0x0440 }
            r13 = r13 | 256(0x100, float:3.59E-43)
            r12.f179335a = r13     // Catch:{ IOException -> 0x0440 }
            r12.f179343i = r11     // Catch:{ IOException -> 0x0440 }
            goto L_0x005e
        L_0x03aa:
            r0.endObject()     // Catch:{ IOException -> 0x0440 }
            r4.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r11 = r4.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.h r11 = (com.google.protos.p5146w.p5147a.p5148a.C65930h) r11     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.f r5 = (com.google.protos.p5146w.p5147a.p5148a.C65928f) r5     // Catch:{ IOException -> 0x0440 }
            r5.getClass()     // Catch:{ IOException -> 0x0440 }
            r11.f179305d = r5     // Catch:{ IOException -> 0x0440 }
            int r5 = r11.f179302a     // Catch:{ IOException -> 0x0440 }
            r5 = r5 | r12
            r11.f179302a = r5     // Catch:{ IOException -> 0x0440 }
            r4.copyOnWrite()     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.h r5 = (com.google.protos.p5146w.p5147a.p5148a.C65930h) r5     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r6 = r6.build()     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.f r6 = (com.google.protos.p5146w.p5147a.p5148a.C65928f) r6     // Catch:{ IOException -> 0x0440 }
            r6.getClass()     // Catch:{ IOException -> 0x0440 }
            r5.f179304c = r6     // Catch:{ IOException -> 0x0440 }
            int r6 = r5.f179302a     // Catch:{ IOException -> 0x0440 }
            r6 = r6 | r13
            r5.f179302a = r6     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bt r5 = com.google.protos.p5146w.p5147a.p5148a.C65924b.f179284e     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r6 = r8.build()     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.b r6 = (com.google.protos.p5146w.p5147a.p5148a.C65924b) r6     // Catch:{ IOException -> 0x0440 }
            r4.mo58885m(r5, r6)     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bt r5 = com.google.protos.p5146w.p5147a.p5148a.C65937o.f179333l     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r6 = r7.build()     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.o r6 = (com.google.protos.p5146w.p5147a.p5148a.C65937o) r6     // Catch:{ IOException -> 0x0440 }
            r4.mo58885m(r5, r6)     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r5 = r9.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.m r5 = (com.google.protos.p5146w.p5147a.p5148a.C65935m) r5     // Catch:{ IOException -> 0x0440 }
            int r5 = r5.f179326a     // Catch:{ IOException -> 0x0440 }
            r6 = r5 & 1
            if (r6 == 0) goto L_0x03fc
            goto L_0x040c
        L_0x03fc:
            r6 = r5 & 2
            if (r6 != 0) goto L_0x040c
            r6 = r5 & 4
            if (r6 != 0) goto L_0x040c
            r6 = r5 & 8
            if (r6 != 0) goto L_0x040c
            r5 = r5 & 16
            if (r5 == 0) goto L_0x0417
        L_0x040c:
            com.google.protobuf.bt r5 = com.google.protos.p5146w.p5147a.p5148a.C65935m.f179324d     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r6 = r9.build()     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.m r6 = (com.google.protos.p5146w.p5147a.p5148a.C65935m) r6     // Catch:{ IOException -> 0x0440 }
            r4.mo58885m(r5, r6)     // Catch:{ IOException -> 0x0440 }
        L_0x0417:
            com.google.protobuf.bv r5 = r10.instance     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.s r5 = (com.google.protos.p5146w.p5147a.p5148a.C65941s) r5     // Catch:{ IOException -> 0x0440 }
            int r5 = r5.f179352a     // Catch:{ IOException -> 0x0440 }
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0422
            goto L_0x0426
        L_0x0422:
            r5 = r5 & 2
            if (r5 == 0) goto L_0x0431
        L_0x0426:
            com.google.protobuf.bt r5 = com.google.protos.p5146w.p5147a.p5148a.C65941s.f179350e     // Catch:{ IOException -> 0x0440 }
            com.google.protobuf.bv r6 = r10.build()     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.s r6 = (com.google.protos.p5146w.p5147a.p5148a.C65941s) r6     // Catch:{ IOException -> 0x0440 }
            r4.mo58885m(r5, r6)     // Catch:{ IOException -> 0x0440 }
        L_0x0431:
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ IOException -> 0x0440 }
            com.google.protos.w.a.a.h r4 = (com.google.protos.p5146w.p5147a.p5148a.C65930h) r4     // Catch:{ IOException -> 0x0440 }
            r1.add(r4)     // Catch:{ IOException -> 0x0440 }
            goto L_0x001d
        L_0x043c:
            r0.endArray()     // Catch:{ IOException -> 0x0440 }
            goto L_0x044f
        L_0x0440:
            r0 = move-exception
            com.google.common.f.e r4 = com.google.android.libraries.gsa.imageviewer.C22826d.f62858a
            com.google.common.f.x r4 = r4.mo56225c()
            java.lang.String r5 = "Error while parsing metadata: "
            r6 = 48427(0xbd2b, float:6.786E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r0)).mo56372aa(r6)).mo56386p(r5)
        L_0x044f:
            r2.mo59439a(r1)
            com.google.protobuf.bv r0 = r2.build()
            com.google.protos.w.a.a.d r0 = (com.google.protos.p5146w.p5147a.p5148a.C65926d) r0
            com.google.protobuf.cq r1 = r0.f179291a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0479
            com.google.protobuf.cq r1 = r0.f179291a
            java.lang.Object r1 = r1.get(r3)
            com.google.protos.w.a.a.h r1 = (com.google.protos.p5146w.p5147a.p5148a.C65930h) r1
            com.google.protobuf.bt r2 = com.google.protos.p5146w.p5147a.p5148a.C65935m.f179324d
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r1.mo58887l(r2)
            com.google.protobuf.bf r1 = r1.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r3 = r1.mo58857o(r2)
        L_0x0479:
            com.google.android.libraries.gsa.imageviewer.e r1 = com.google.android.libraries.gsa.imageviewer.C22828f.m42670q()
            r2 = r1
            com.google.android.libraries.gsa.imageviewer.a r2 = (com.google.android.libraries.gsa.imageviewer.C22821a) r2
            r4 = r19
            r2.f62833a = r4
            r4 = r21
            r1.mo28164e(r4)
            r4 = r3 ^ 1
            r1.mo28161b(r4)
            r1.mo28166g(r4)
            r1.mo28165f(r3)
            r1.mo28163d(r0)
            r3 = r22
            r2.f62835c = r3
            r3 = r23
            r2.f62834b = r3
            com.google.android.libraries.gsa.imageviewer.f r0 = r1.mo28160a()
            android.content.Intent r0 = com.google.android.libraries.gsa.imageviewer.C22825c.m42662a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.C84135j.mo77553a(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):android.content.Intent");
    }
}
