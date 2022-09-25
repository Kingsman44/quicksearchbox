package com.google.android.libraries.appactions.serviceengine.impl;

import com.google.android.libraries.appactions.serviceengine.api.C147881n;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.j */
/* compiled from: PG */
public final /* synthetic */ class C147917j implements Function {

    /* renamed from: a */
    public final /* synthetic */ C147906ao f398994a;

    /* renamed from: b */
    public final /* synthetic */ C147881n f398995b;

    public /* synthetic */ C147917j(C147906ao aoVar, C147881n nVar) {
        this.f398994a = aoVar;
        this.f398995b = nVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x008f, code lost:
        if (r3 != 2) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d3, code lost:
        if (java.util.regex.Pattern.matches(r8, r3) != false) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r11) {
        /*
            r10 = this;
            com.google.android.libraries.appactions.serviceengine.impl.ao r0 = r10.f398994a
            com.google.android.libraries.appactions.serviceengine.api.n r1 = r10.f398995b
            java.lang.String r11 = (java.lang.String) r11
            com.google.common.b.hd r2 = r1.mo124547b()
            boolean r3 = r2.isEmpty()
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0018
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            goto L_0x005d
        L_0x0018:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0025:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0055
            java.lang.Object r7 = r2.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.Object r9 = r7.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = android.net.Uri.encode(r9)
            r8[r5] = r9
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = android.net.Uri.encode(r7)
            r8[r6] = r7
            java.lang.String r7 = "%s=%s&"
            java.lang.String r7 = java.lang.String.format(r7, r8)
            r3.append(r7)
            goto L_0x0025
        L_0x0055:
            java.lang.String r2 = r3.toString()
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
        L_0x005d:
            j$.util.Optional r3 = r1.mo124553g()
            com.google.assistant.g.b.a.ag r7 = com.google.assistant.p3944g.p3948b.p3949a.C52936ag.URL_VALIDATOR_ASSISTANT
            java.lang.Object r3 = r3.orElse(r7)
            com.google.assistant.g.b.a.ag r3 = (com.google.assistant.p3944g.p3948b.p3949a.C52936ag) r3
            j$.util.Optional r7 = r1.mo124554h()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r7 = r7.orElse(r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            j$.util.Optional r1 = r1.mo124556i()
            java.lang.Object r1 = r1.orElse(r8)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            int r3 = r3.ordinal()
            if (r3 == r6) goto L_0x0093
            if (r3 == r4) goto L_0x00d5
            goto L_0x017a
        L_0x0093:
            com.google.android.libraries.appactions.serviceengine.impl.f r3 = r0.f398978h
            boolean r3 = r3.f398989b
            if (r3 == 0) goto L_0x017a
            r0.mo124569f()
            android.net.Uri r3 = android.net.Uri.parse(r11)
            java.lang.String r8 = r3.getHost()
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x017a
            java.lang.String r9 = "www."
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x00b7
            r9 = 4
            java.lang.String r8 = r8.substring(r9)
        L_0x00b7:
            java.lang.String r3 = r3.getPath()
            boolean r9 = android.text.TextUtils.isEmpty(r3)
            if (r9 != 0) goto L_0x017a
            java.util.Map r9 = r0.f398976f
            java.lang.Object r8 = r9.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x017a
            boolean r3 = java.util.regex.Pattern.matches(r8, r3)
            if (r3 == 0) goto L_0x017a
        L_0x00d5:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r4 = ""
            java.lang.Object r2 = r2.orElse(r4)
            r3[r5] = r2
            java.lang.String r11 = android.net.Uri.encode(r11)
            r3[r6] = r11
            java.lang.String r11 = "https://www.instacart.com/store/partner_recipes?%srecipeSourceUrl=%s"
            java.lang.String r11 = java.lang.String.format(r11, r3)
            android.content.Intent r11 = com.google.android.libraries.appactions.serviceengine.impl.C147906ao.m241044e(r11)
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r11)
            java.lang.String r2 = "com.instacart.client"
            if (r7 == 0) goto L_0x0101
            com.google.android.libraries.appactions.serviceengine.impl.y r1 = new com.google.android.libraries.appactions.serviceengine.impl.y
            r1.<init>(r0)
            j$.util.Optional r11 = r11.filter(r1)
            goto L_0x010e
        L_0x0101:
            if (r1 == 0) goto L_0x010e
            boolean r1 = r0.mo124571h(r2)
            if (r1 != 0) goto L_0x010e
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
            goto L_0x017e
        L_0x010e:
            com.google.assistant.g.b.a.k r1 = com.google.assistant.p3944g.p3948b.p3949a.C52946k.f138824d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.g.b.a.j r1 = (com.google.assistant.p3944g.p3948b.p3949a.C52945j) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.g.b.a.k r3 = (com.google.assistant.p3944g.p3948b.p3949a.C52946k) r3
            int r4 = r3.f138826a
            r4 = r4 | r6
            r3.f138826a = r4
            java.lang.String r4 = "Add ingredients to cart"
            r3.f138827b = r4
            com.google.android.libraries.appactions.serviceengine.a.e r0 = r0.f398972b
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x0133
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x0153
        L_0x0133:
            android.content.pm.PackageManager r0 = r0.f398895b     // Catch:{ NameNotFoundException -> 0x0140 }
            r3 = 1024(0x400, float:1.435E-42)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r2, r3)     // Catch:{ NameNotFoundException -> 0x0140 }
            j$.util.Optional r0 = p3186j$.util.Optional.ofNullable(r0)     // Catch:{ NameNotFoundException -> 0x0140 }
            goto L_0x0153
        L_0x0140:
            r0 = move-exception
            com.google.common.f.e r2 = com.google.android.libraries.appactions.serviceengine.p11037a.C147867e.f398894a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Invalid caller package"
            r4 = 42275(0xa523, float:5.924E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x0153:
            com.google.android.libraries.appactions.serviceengine.a.b r2 = com.google.android.libraries.appactions.serviceengine.p11037a.C147864b.f398891a
            j$.util.Optional r0 = r0.filter(r2)
            com.google.android.libraries.appactions.serviceengine.a.c r2 = com.google.android.libraries.appactions.serviceengine.p11037a.C147865c.f398892a
            j$.util.Optional r0 = r0.map(r2)
            com.google.android.libraries.appactions.serviceengine.a.d r2 = new com.google.android.libraries.appactions.serviceengine.a.d
            r2.<init>()
            j$.util.Optional r0 = r0.map(r2)
            com.google.android.libraries.appactions.serviceengine.impl.z r2 = new com.google.android.libraries.appactions.serviceengine.impl.z
            r2.<init>(r1)
            r0.ifPresent(r2)
            com.google.android.libraries.appactions.serviceengine.impl.aa r0 = new com.google.android.libraries.appactions.serviceengine.impl.aa
            r0.<init>(r1)
            j$.util.Optional r11 = r11.map(r0)
            goto L_0x017e
        L_0x017a:
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
        L_0x017e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.appactions.serviceengine.impl.C147917j.apply(java.lang.Object):java.lang.Object");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
