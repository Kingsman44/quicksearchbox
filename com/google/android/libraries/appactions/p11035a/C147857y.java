package com.google.android.libraries.appactions.p11035a;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.a.y */
/* compiled from: PG */
public final /* synthetic */ class C147857y implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f398883a;

    /* renamed from: b */
    public final /* synthetic */ String f398884b;

    public /* synthetic */ C147857y(String str, String str2) {
        this.f398883a = str;
        this.f398884b = str2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: com.google.protobuf.ga} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r0 = r12.f398883a
            java.lang.String r1 = r12.f398884b
            com.google.protobuf.fb r13 = (com.google.protobuf.C63037fb) r13
            java.lang.String r2 = "@type"
            java.lang.String r3 = "ListItem"
            java.lang.String r2 = com.google.android.libraries.appactions.p11035a.C147828ad.m240952d(r2, r13, r3)
            boolean r3 = com.google.common.base.C58890d.m90990e(r2, r3)
            if (r3 == 0) goto L_0x0131
            com.google.android.libraries.appactions.a.a.e r2 = new com.google.android.libraries.appactions.a.a.e
            r2.<init>()
            java.lang.String r3 = "name"
            java.lang.String r4 = ""
            java.lang.String r3 = com.google.android.libraries.appactions.p11035a.C147828ad.m240952d(r3, r13, r4)
            if (r3 == 0) goto L_0x0129
            r2.f398801b = r3
            java.lang.String r3 = "identifier"
            java.lang.String r3 = com.google.android.libraries.appactions.p11035a.C147828ad.m240952d(r3, r13, r4)
            if (r3 == 0) goto L_0x0121
            r2.f398804e = r3
            java.lang.String r3 = "url"
            java.lang.String r3 = com.google.android.libraries.appactions.p11035a.C147828ad.m240952d(r3, r13, r4)
            if (r3 == 0) goto L_0x0119
            r2.f398805f = r3
            if (r0 == 0) goto L_0x0111
            r2.f398807h = r0
            if (r1 == 0) goto L_0x0109
            r2.f398806g = r1
            com.google.android.libraries.appactions.a.a.c r0 = com.google.android.libraries.appactions.p11035a.p11036a.C147818c.INLINE_INVENTORY
            if (r0 == 0) goto L_0x0101
            r2.f398800a = r0
            com.google.protobuf.ga r0 = com.google.protobuf.C63063ga.f170179c
            com.google.protobuf.dn r13 = r13.f170146a
            java.lang.String r1 = "alternateName"
            boolean r3 = r13.containsKey(r1)
            if (r3 == 0) goto L_0x005a
            java.lang.Object r13 = r13.get(r1)
            r0 = r13
            com.google.protobuf.ga r0 = (com.google.protobuf.C63063ga) r0
        L_0x005a:
            int r13 = r0.f170181a
            r1 = 6
            if (r13 != r1) goto L_0x0064
            java.lang.Object r13 = r0.f170182b
            com.google.protobuf.dg r13 = (com.google.protobuf.C62988dg) r13
            goto L_0x0066
        L_0x0064:
            com.google.protobuf.dg r13 = com.google.protobuf.C62988dg.f170043b
        L_0x0066:
            com.google.protobuf.cq r13 = r13.f170045a
            j$.util.stream.Stream r13 = p3186j$.util.Collection.EL.stream(r13)
            com.google.android.libraries.appactions.a.u r0 = com.google.android.libraries.appactions.p11035a.C147853u.f398878a
            j$.util.stream.Stream r13 = r13.map(r0)
            p3186j$.util.Objects.requireNonNull(r2)
            com.google.android.libraries.appactions.a.v r0 = new com.google.android.libraries.appactions.a.v
            r0.<init>(r2)
            r13.forEach(r0)
            com.google.common.b.gp r13 = r2.f398802c
            if (r13 == 0) goto L_0x0088
            com.google.common.b.gu r13 = r13.mo55394f()
            r2.f398803d = r13
            goto L_0x0092
        L_0x0088:
            com.google.common.b.gu r13 = r2.f398803d
            if (r13 != 0) goto L_0x0092
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89845m()
            r2.f398803d = r13
        L_0x0092:
            java.lang.Enum r4 = r2.f398800a
            if (r4 == 0) goto L_0x00b6
            java.lang.String r5 = r2.f398801b
            if (r5 == 0) goto L_0x00b6
            java.lang.String r7 = r2.f398804e
            if (r7 == 0) goto L_0x00b6
            java.lang.String r8 = r2.f398805f
            if (r8 == 0) goto L_0x00b6
            java.lang.String r9 = r2.f398806g
            if (r9 == 0) goto L_0x00b6
            java.lang.String r10 = r2.f398807h
            if (r10 != 0) goto L_0x00ab
            goto L_0x00b6
        L_0x00ab:
            com.google.android.libraries.appactions.a.a.f r13 = new com.google.android.libraries.appactions.a.a.f
            com.google.common.b.gu r6 = r2.f398803d
            j$.util.Optional r11 = r2.f398808i
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        L_0x00b6:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.Enum r0 = r2.f398800a
            if (r0 != 0) goto L_0x00c4
            java.lang.String r0 = " inventoryType"
            r13.append(r0)
        L_0x00c4:
            java.lang.String r0 = r2.f398801b
            if (r0 != 0) goto L_0x00cd
            java.lang.String r0 = " name"
            r13.append(r0)
        L_0x00cd:
            java.lang.String r0 = r2.f398804e
            if (r0 != 0) goto L_0x00d6
            java.lang.String r0 = " identifier"
            r13.append(r0)
        L_0x00d6:
            java.lang.String r0 = r2.f398805f
            if (r0 != 0) goto L_0x00df
            java.lang.String r0 = " url"
            r13.append(r0)
        L_0x00df:
            java.lang.String r0 = r2.f398806g
            if (r0 != 0) goto L_0x00e8
            java.lang.String r0 = " entitySetId"
            r13.append(r0)
        L_0x00e8:
            java.lang.String r0 = r2.f398807h
            if (r0 != 0) goto L_0x00f1
            java.lang.String r0 = " packageName"
            r13.append(r0)
        L_0x00f1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing required properties:"
            java.lang.String r13 = r13.toString()
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        L_0x0101:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r0 = "Null inventoryType"
            r13.<init>(r0)
            throw r13
        L_0x0109:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r0 = "Null entitySetId"
            r13.<init>(r0)
            throw r13
        L_0x0111:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r0 = "Null packageName"
            r13.<init>(r0)
            throw r13
        L_0x0119:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r0 = "Null url"
            r13.<init>(r0)
            throw r13
        L_0x0121:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r0 = "Null identifier"
            r13.<init>(r0)
            throw r13
        L_0x0129:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r0 = "Null name"
            r13.<init>(r0)
            throw r13
        L_0x0131:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Expect EntitySet @type to be ListItem found: "
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r0.concat(r1)
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.appactions.p11035a.C147857y.apply(java.lang.Object):java.lang.Object");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
