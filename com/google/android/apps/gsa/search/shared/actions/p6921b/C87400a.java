package com.google.android.apps.gsa.search.shared.actions.p6921b;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.b.a */
/* compiled from: PG */
public final class C87400a {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.google.android.apps.gsa.shared.logger.j.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.google.android.apps.gsa.shared.logger.j.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.google.android.apps.gsa.shared.logger.j.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: com.google.bj.c.e.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: com.google.android.apps.gsa.shared.logger.j.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: com.google.android.apps.gsa.shared.logger.j.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: com.google.android.apps.gsa.shared.logger.j.d} */
    /* JADX WARNING: type inference failed for: r4v11, types: [com.google.bj.c.e.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0253 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02be  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.apps.gsa.shared.logger.p7065j.C89933d m141528a(com.google.android.apps.gsa.shared.search.Query r25, com.google.android.apps.gsa.search.shared.actions.ActionData r26, int r27, com.google.android.apps.gsa.search.shared.actions.VoiceAction r28, com.google.android.apps.gsa.search.shared.actions.util.CardDecision r29) {
        /*
            r0 = r25
            r1 = r26
            r2 = r28
            r3 = r29
            r4 = 0
            if (r0 == 0) goto L_0x037d
            if (r1 != 0) goto L_0x000f
            goto L_0x037d
        L_0x000f:
            r5 = 1
            if (r2 == 0) goto L_0x0302
            boolean r6 = r28.mo81082u()
            if (r6 != 0) goto L_0x001a
            goto L_0x0302
        L_0x001a:
            r6 = r2
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r6 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r6
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.t r7 = r6.mo81064e()
            r8 = 2
            if (r7 == 0) goto L_0x0198
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r9 = r7.mo81156b()
            if (r9 == 0) goto L_0x0198
            com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation r7 = r7.mo81156b()
            if (r7 == 0) goto L_0x0198
            boolean r9 = r7.mo81543l()
            if (r9 != 0) goto L_0x0038
            goto L_0x0198
        L_0x0038:
            com.google.assistant.e.f.o r9 = com.google.assistant.p3897e.p3912f.C51220o.f133350m
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.f.m r9 = (com.google.assistant.p3897e.p3912f.C51218m) r9
            android.os.Parcelable r10 = r7.f236364c
            r10.getClass()
            com.google.android.apps.gsa.search.shared.contact.Person r10 = (com.google.android.apps.gsa.search.shared.contact.Person) r10
            long r11 = r10.f236371b
            r9.copyOnWrite()
            com.google.protobuf.bv r13 = r9.instance
            com.google.assistant.e.f.o r13 = (com.google.assistant.p3897e.p3912f.C51220o) r13
            int r14 = r13.f133352a
            r14 = r14 | r5
            r13.f133352a = r14
            r13.f133353b = r11
            java.lang.String r10 = r10.f236373d
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x0070
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.assistant.e.f.o r11 = (com.google.assistant.p3897e.p3912f.C51220o) r11
            r10.getClass()
            int r12 = r11.f133352a
            r12 = r12 | r8
            r11.f133352a = r12
            r11.f133354c = r10
        L_0x0070:
            java.lang.String r10 = r7.f236394j
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x008a
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.assistant.e.f.o r11 = (com.google.assistant.p3897e.p3912f.C51220o) r11
            r10.getClass()
            int r12 = r11.f133352a
            r12 = r12 | 256(0x100, float:3.59E-43)
            r11.f133352a = r12
            r11.f133361j = r10
        L_0x008a:
            java.util.List r10 = r7.f236411n
            r11 = 4
            if (r10 == 0) goto L_0x0141
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0141
            android.os.Parcelable r10 = r7.f236412o
            r10.getClass()
            com.google.android.apps.gsa.search.shared.contact.Contact r10 = (com.google.android.apps.gsa.search.shared.contact.Contact) r10
            com.google.android.apps.gsa.search.shared.contact.c r12 = r10.f236350a
            com.google.android.apps.gsa.search.shared.contact.c r13 = com.google.android.apps.gsa.search.shared.contact.C87515c.PHONE_NUMBER
            if (r12 != r13) goto L_0x00b9
            java.lang.String r12 = r10.mo81519d()
            r9.copyOnWrite()
            com.google.protobuf.bv r13 = r9.instance
            com.google.assistant.e.f.o r13 = (com.google.assistant.p3897e.p3912f.C51220o) r13
            r12.getClass()
            int r14 = r13.f133352a
            r14 = r14 | 8
            r13.f133352a = r14
            r13.f133356e = r12
            goto L_0x0126
        L_0x00b9:
            com.google.android.apps.gsa.search.shared.contact.c r12 = r10.f236350a
            com.google.android.apps.gsa.search.shared.contact.c r13 = com.google.android.apps.gsa.search.shared.contact.C87515c.EMAIL
            if (r12 != r13) goto L_0x00d6
            java.lang.String r12 = r10.mo81519d()
            r9.copyOnWrite()
            com.google.protobuf.bv r13 = r9.instance
            com.google.assistant.e.f.o r13 = (com.google.assistant.p3897e.p3912f.C51220o) r13
            r12.getClass()
            int r14 = r13.f133352a
            r14 = r14 | 16
            r13.f133352a = r14
            r13.f133357f = r12
            goto L_0x0126
        L_0x00d6:
            com.google.android.apps.gsa.search.shared.contact.c r13 = com.google.android.apps.gsa.search.shared.contact.C87515c.POSTAL_ADDRESS
            if (r12 != r13) goto L_0x00f1
            java.lang.String r12 = r10.mo81519d()
            r9.copyOnWrite()
            com.google.protobuf.bv r13 = r9.instance
            com.google.assistant.e.f.o r13 = (com.google.assistant.p3897e.p3912f.C51220o) r13
            r12.getClass()
            int r14 = r13.f133352a
            r14 = r14 | 32
            r13.f133352a = r14
            r13.f133358g = r12
            goto L_0x0126
        L_0x00f1:
            com.google.android.apps.gsa.search.shared.contact.c r13 = com.google.android.apps.gsa.search.shared.contact.C87515c.GAIA_ID
            if (r12 != r13) goto L_0x010c
            java.lang.String r12 = r10.mo81519d()
            r9.copyOnWrite()
            com.google.protobuf.bv r13 = r9.instance
            com.google.assistant.e.f.o r13 = (com.google.assistant.p3897e.p3912f.C51220o) r13
            r12.getClass()
            int r14 = r13.f133352a
            r14 = r14 | 64
            r13.f133352a = r14
            r13.f133359h = r12
            goto L_0x0126
        L_0x010c:
            com.google.android.apps.gsa.search.shared.contact.c r13 = com.google.android.apps.gsa.search.shared.contact.C87515c.APP_SPECIFIC_ENDPOINT_ID
            if (r12 != r13) goto L_0x0126
            java.lang.String r12 = r10.mo81519d()
            r9.copyOnWrite()
            com.google.protobuf.bv r13 = r9.instance
            com.google.assistant.e.f.o r13 = (com.google.assistant.p3897e.p3912f.C51220o) r13
            r12.getClass()
            int r14 = r13.f133352a
            r14 = r14 | 128(0x80, float:1.794E-43)
            r13.f133352a = r14
            r13.f133360i = r12
        L_0x0126:
            java.lang.String r12 = r10.f236355f
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0141
            java.lang.String r10 = r10.f236355f
            r9.copyOnWrite()
            com.google.protobuf.bv r12 = r9.instance
            com.google.assistant.e.f.o r12 = (com.google.assistant.p3897e.p3912f.C51220o) r12
            r10.getClass()
            int r13 = r12.f133352a
            r13 = r13 | r11
            r12.f133352a = r13
            r12.f133355d = r10
        L_0x0141:
            java.util.List r10 = r7.f236363b
            int r10 = r10.size()
            com.google.android.apps.gsa.search.shared.contact.PersonShortcut r12 = r7.f236397m
            boolean r7 = r7.f236367f
            if (r10 < r8) goto L_0x0170
            if (r12 == 0) goto L_0x015f
            r9.copyOnWrite()
            com.google.protobuf.bv r7 = r9.instance
            com.google.assistant.e.f.o r7 = (com.google.assistant.p3897e.p3912f.C51220o) r7
            r7.f133362k = r8
            int r10 = r7.f133352a
            r10 = r10 | 512(0x200, float:7.175E-43)
            r7.f133352a = r10
            goto L_0x0191
        L_0x015f:
            r9.copyOnWrite()
            com.google.protobuf.bv r7 = r9.instance
            com.google.assistant.e.f.o r7 = (com.google.assistant.p3897e.p3912f.C51220o) r7
            r10 = 3
            r7.f133362k = r10
            int r10 = r7.f133352a
            r10 = r10 | 512(0x200, float:7.175E-43)
            r7.f133352a = r10
            goto L_0x0191
        L_0x0170:
            if (r7 == 0) goto L_0x0182
            r9.copyOnWrite()
            com.google.protobuf.bv r7 = r9.instance
            com.google.assistant.e.f.o r7 = (com.google.assistant.p3897e.p3912f.C51220o) r7
            r7.f133362k = r5
            int r10 = r7.f133352a
            r10 = r10 | 512(0x200, float:7.175E-43)
            r7.f133352a = r10
            goto L_0x0191
        L_0x0182:
            r9.copyOnWrite()
            com.google.protobuf.bv r7 = r9.instance
            com.google.assistant.e.f.o r7 = (com.google.assistant.p3897e.p3912f.C51220o) r7
            r7.f133362k = r11
            int r10 = r7.f133352a
            r10 = r10 | 512(0x200, float:7.175E-43)
            r7.f133352a = r10
        L_0x0191:
            com.google.protobuf.bv r7 = r9.build()
            com.google.assistant.e.f.o r7 = (com.google.assistant.p3897e.p3912f.C51220o) r7
            goto L_0x0199
        L_0x0198:
            r7 = r4
        L_0x0199:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r9 = r6.mo81065f()
            if (r9 != 0) goto L_0x01a1
        L_0x019f:
            r8 = r4
            goto L_0x0201
        L_0x01a1:
            com.google.bb.a.pn r9 = r9.mo81433d()
            if (r9 != 0) goto L_0x01a8
            goto L_0x019f
        L_0x01a8:
            java.lang.String r10 = r9.f145869b
            com.google.protobuf.bt r11 = com.google.p4152bb.p4153a.C55359pl.f145864b
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r9.mo58887l(r11)
            com.google.protobuf.bf r12 = r9.f169962ag
            com.google.protobuf.bs r11 = r11.f169971d
            boolean r11 = r12.mo58857o(r11)
            if (r11 == 0) goto L_0x01cd
            int r11 = r9.f145872e
            int r11 = com.google.p4152bb.p4153a.C55419v.m87685a(r11)
            if (r11 != 0) goto L_0x01c6
            goto L_0x01cd
        L_0x01c6:
            r12 = 13
            if (r11 != r12) goto L_0x01cd
            java.lang.String r9 = "com.google.android.googlequicksearchbox.sms"
            goto L_0x01d1
        L_0x01cd:
            java.lang.String r9 = com.google.android.apps.gsa.search.shared.actions.util.C87494p.m142026c(r9)
        L_0x01d1:
            if (r9 != 0) goto L_0x01d4
            goto L_0x019f
        L_0x01d4:
            com.google.assistant.e.f.b r11 = com.google.assistant.p3897e.p3912f.C51207b.f133303d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.e.f.a r11 = (com.google.assistant.p3897e.p3912f.C51206a) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.assistant.e.f.b r12 = (com.google.assistant.p3897e.p3912f.C51207b) r12
            r10.getClass()
            int r13 = r12.f133305a
            r13 = r13 | r5
            r12.f133305a = r13
            r12.f133306b = r10
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.assistant.e.f.b r10 = (com.google.assistant.p3897e.p3912f.C51207b) r10
            int r12 = r10.f133305a
            r8 = r8 | r12
            r10.f133305a = r8
            r10.f133307c = r9
            com.google.protobuf.bv r8 = r11.build()
            com.google.assistant.e.f.b r8 = (com.google.assistant.p3897e.p3912f.C51207b) r8
        L_0x0201:
            java.util.List r9 = r6.f236100f
            java.util.Iterator r9 = r9.iterator()
        L_0x0207:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0253
            java.lang.Object r10 = r9.next()
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r10 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument) r10
            int r11 = r10.mo81277l()
            r12 = 11756(0x2dec, float:1.6474E-41)
            if (r11 != r12) goto L_0x0207
            boolean r11 = r10 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument
            if (r11 == 0) goto L_0x0207
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument r10 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument) r10
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity r10 = r10.mo81300g()
            if (r10 == 0) goto L_0x0207
            android.text.Spanned r10 = r10.f236170b
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x0207
            com.google.assistant.e.f.h r9 = com.google.assistant.p3897e.p3912f.C51213h.f133336c
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.f.g r9 = (com.google.assistant.p3897e.p3912f.C51212g) r9
            java.lang.String r10 = r10.toString()
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.assistant.e.f.h r11 = (com.google.assistant.p3897e.p3912f.C51213h) r11
            r10.getClass()
            int r12 = r11.f133338a
            r12 = r12 | r5
            r11.f133338a = r12
            r11.f133339b = r10
            com.google.protobuf.bv r9 = r9.build()
            com.google.assistant.e.f.h r9 = (com.google.assistant.p3897e.p3912f.C51213h) r9
            goto L_0x0254
        L_0x0253:
            r9 = r4
        L_0x0254:
            com.google.common.b.gp r10 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.List r6 = r6.mo81222ab()
            java.util.Iterator r6 = r6.iterator()
        L_0x0260:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x02a3
            java.lang.Object r11 = r6.next()
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r11 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument) r11
            boolean r12 = r11 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument
            if (r12 == 0) goto L_0x0260
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument r11 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument) r11
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity r11 = r11.mo81300g()
            if (r11 == 0) goto L_0x0260
            android.text.Spanned r11 = r11.f236170b
            if (r11 == 0) goto L_0x0260
            com.google.bj.c.e.h r12 = com.google.p4184bj.p4193c.p4200e.C56000h.f149133c
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.bj.c.e.g r12 = (com.google.p4184bj.p4193c.p4200e.C55999g) r12
            java.lang.String r11 = r11.toString()
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.bj.c.e.h r13 = (com.google.p4184bj.p4193c.p4200e.C56000h) r13
            r11.getClass()
            int r14 = r13.f149135a
            r14 = r14 | r5
            r13.f149135a = r14
            r13.f149136b = r11
            com.google.protobuf.bv r11 = r12.build()
            com.google.bj.c.e.h r11 = (com.google.p4184bj.p4193c.p4200e.C56000h) r11
            r10.mo55395g(r11)
            goto L_0x0260
        L_0x02a3:
            com.google.common.b.gu r6 = r10.mo55394f()
            if (r7 != 0) goto L_0x02b4
            if (r8 != 0) goto L_0x02b4
            if (r9 != 0) goto L_0x02b4
            boolean r10 = r6.isEmpty()
            if (r10 == 0) goto L_0x02b4
            goto L_0x0302
        L_0x02b4:
            com.google.bj.c.e.d r4 = com.google.p4184bj.p4193c.p4200e.C55996d.f149115h
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.bj.c.e.c r4 = (com.google.p4184bj.p4193c.p4200e.C55995c) r4
            if (r7 == 0) goto L_0x02c1
            r4.mo54310c(r7)
        L_0x02c1:
            if (r8 == 0) goto L_0x02c6
            r4.mo54308a(r8)
        L_0x02c6:
            if (r9 == 0) goto L_0x02e2
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.bj.c.e.d r7 = (com.google.p4184bj.p4193c.p4200e.C55996d) r7
            com.google.protobuf.cq r8 = r7.f149122f
            boolean r10 = r8.mo58948c()
            if (r10 != 0) goto L_0x02dd
            com.google.protobuf.cq r8 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r8)
            r7.f149122f = r8
        L_0x02dd:
            com.google.protobuf.cq r7 = r7.f149122f
            r7.add(r9)
        L_0x02e2:
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.bj.c.e.d r7 = (com.google.p4184bj.p4193c.p4200e.C55996d) r7
            com.google.protobuf.cq r8 = r7.f149118b
            boolean r9 = r8.mo58948c()
            if (r9 != 0) goto L_0x02f7
            com.google.protobuf.cq r8 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r8)
            r7.f149118b = r8
        L_0x02f7:
            com.google.protobuf.cq r7 = r7.f149118b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r6, (java.util.List) r7)
            com.google.protobuf.bv r4 = r4.build()
            com.google.bj.c.e.d r4 = (com.google.p4184bj.p4193c.p4200e.C55996d) r4
        L_0x0302:
            r21 = r4
            com.google.bb.a.ad r4 = r26.mo81107s()
            r6 = 0
            if (r4 == 0) goto L_0x0321
            com.google.protobuf.bt r7 = com.google.p4152bb.p4153a.C55265lz.f145556m
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)
            r4.mo58887l(r7)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r7 = r7.f169971d
            boolean r4 = r4.mo58857o(r7)
            if (r4 == 0) goto L_0x0321
            r17 = 1
            goto L_0x0323
        L_0x0321:
            r17 = 0
        L_0x0323:
            com.google.android.apps.gsa.shared.logger.j.d r4 = new com.google.android.apps.gsa.shared.logger.j.d
            java.lang.String r7 = r1.f236000j
            boolean r8 = r26.mo81099j()
            long r9 = r0.f252751I
            boolean r11 = r26.mo81101l()
            java.lang.String r12 = r0.f252770i
            int r13 = r3.f236259m
            boolean r5 = r3.f236255i
            if (r5 == 0) goto L_0x033c
            long r5 = r3.f236257k
            goto L_0x033e
        L_0x033c:
            r5 = -1
        L_0x033e:
            r14 = r5
            com.google.bb.a.x r3 = r1.f235998h
            if (r2 == 0) goto L_0x035c
            boolean r5 = r28.mo81084w()
            if (r5 != 0) goto L_0x0359
            boolean r5 = r28.mo81053C()
            if (r5 == 0) goto L_0x0350
            goto L_0x0359
        L_0x0350:
            boolean r5 = r28.mo81083v()
            if (r5 == 0) goto L_0x035c
            com.google.bj.c.e.f r5 = com.google.p4184bj.p4193c.p4200e.C55998f.CANCELED
            goto L_0x035e
        L_0x0359:
            com.google.bj.c.e.f r5 = com.google.p4184bj.p4193c.p4200e.C55998f.COMPLETED
            goto L_0x035e
        L_0x035c:
            com.google.bj.c.e.f r5 = com.google.p4184bj.p4193c.p4200e.C55998f.INCOMPLETE
        L_0x035e:
            r18 = r5
            boolean r1 = r1.f235997g
            r19 = r1
            boolean r22 = r25.mo84332bQ()
            int r1 = r0.f252784w
            r23 = r1
            boolean r24 = r25.mo84403cj()
            r6 = r4
            r16 = r3
            r20 = r27
            r6.<init>(r7, r8, r9, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            if (r2 == 0) goto L_0x037d
            r2.mo81073j(r4)
        L_0x037d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.p6921b.C87400a.m141528a(com.google.android.apps.gsa.shared.search.Query, com.google.android.apps.gsa.search.shared.actions.ActionData, int, com.google.android.apps.gsa.search.shared.actions.VoiceAction, com.google.android.apps.gsa.search.shared.actions.util.CardDecision):com.google.android.apps.gsa.shared.logger.j.d");
    }
}
