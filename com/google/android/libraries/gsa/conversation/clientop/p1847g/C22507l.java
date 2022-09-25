package com.google.android.libraries.gsa.conversation.clientop.p1847g;

import com.google.android.libraries.gsa.conversation.clientop.C22538o;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.g.l */
/* compiled from: PG */
public final class C22507l extends C22538o {

    /* renamed from: a */
    private final C22506k f62105a;

    public C22507l(C22506k kVar) {
        this.f62105a = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0128  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20765a(com.google.assistant.p3897e.p3921j.C51809dy r13, com.google.android.libraries.gsa.conversation.clientop.C22434e r14) {
        /*
            r12 = this;
            java.lang.String r14 = r13.f135936b
            java.lang.String r0 = "provider.VERIFY"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x0341
            com.google.assistant.e.j.dw r13 = r13.f135938d
            if (r13 != 0) goto L_0x0010
            com.google.assistant.e.j.dw r13 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0010:
            com.google.assistant.e.j.aph r14 = com.google.assistant.p3897e.p3921j.aph.f135554b
            com.google.protobuf.eb r14 = r14.getParserForType()
            java.lang.String r0 = "verify_provider_args"
            com.google.protobuf.MessageLite r13 = m41992m(r13, r0, r14)
            com.google.assistant.e.j.aph r13 = (com.google.assistant.p3897e.p3921j.aph) r13
            com.google.android.libraries.gsa.conversation.clientop.g.k r14 = r12.f62105a
            com.google.protobuf.cq r0 = r13.f135556a
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0036
            com.google.assistant.e.j.kf r13 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r14 = "Unable to verify provider: no providers to look up."
            com.google.assistant.e.j.ec r13 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r13, r14)
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92900i(r13)
            goto L_0x0340
        L_0x0036:
            com.google.assistant.e.j.apj r0 = com.google.assistant.p3897e.p3921j.apj.f135557b
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.api r0 = (com.google.assistant.p3897e.p3921j.C51687api) r0
            com.google.protobuf.cq r13 = r13.f135556a
            java.util.Iterator r13 = r13.iterator()
            r1 = 0
            r2 = 0
        L_0x0046:
            boolean r3 = r13.hasNext()
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x01a6
            java.lang.Object r3 = r13.next()
            com.google.assistant.e.c.c.gh r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r3
            int r6 = r3.f133012b
            if (r6 != r5) goto L_0x019d
            java.lang.Object r6 = r3.f133013c
            com.google.assistant.e.c.c.ev r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r6
            java.lang.String r7 = r6.f132944b
            int r8 = r6.f132943a
            r8 = r8 & r4
            if (r8 == 0) goto L_0x0066
            int r6 = r6.f132945c
            goto L_0x0067
        L_0x0066:
            r6 = 0
        L_0x0067:
            dagger.a r8 = r14.f62104b
            java.lang.Object r8 = r8.mo27525b()
            android.content.pm.PackageManager r8 = (android.content.pm.PackageManager) r8
            r9 = 3
            r10 = 4
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r7, r1)     // Catch:{ NameNotFoundException -> 0x0089 }
            int r11 = r8.versionCode     // Catch:{ NameNotFoundException -> 0x0089 }
            if (r11 >= r6) goto L_0x007b
            r8 = 2
            goto L_0x008b
        L_0x007b:
            android.content.pm.ApplicationInfo r11 = r8.applicationInfo     // Catch:{ NameNotFoundException -> 0x0089 }
            if (r11 == 0) goto L_0x0087
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo     // Catch:{ NameNotFoundException -> 0x0089 }
            boolean r8 = r8.enabled     // Catch:{ NameNotFoundException -> 0x0089 }
            if (r8 == 0) goto L_0x0087
            r8 = 1
            goto L_0x008b
        L_0x0087:
            r8 = 4
            goto L_0x008b
        L_0x0089:
            r8 = 3
        L_0x008b:
            if (r8 != r5) goto L_0x017c
            com.google.assistant.e.c.c.ev r2 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.c.c.es r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            r7.getClass()
            int r9 = r8.f132943a
            r9 = r9 | r5
            r8.f132943a = r9
            r8.f132944b = r7
            r2.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            int r9 = r8.f132943a
            r9 = r9 | r4
            r8.f132943a = r9
            r8.f132945c = r6
            dagger.a r6 = r14.f62104b
            java.lang.Object r6 = r6.mo27525b()
            android.content.pm.PackageManager r6 = (android.content.pm.PackageManager) r6
            android.content.pm.ApplicationInfo r8 = r6.getApplicationInfo(r7, r1)     // Catch:{ NameNotFoundException -> 0x00d1 }
            if (r8 == 0) goto L_0x00e0
            java.lang.CharSequence r6 = r6.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x00d1 }
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ NameNotFoundException -> 0x00d1 }
            if (r8 != 0) goto L_0x00e0
            java.lang.String r6 = r6.toString()     // Catch:{ NameNotFoundException -> 0x00d1 }
            goto L_0x00e2
        L_0x00d1:
            r6 = move-exception
            com.google.common.f.e r8 = com.google.android.libraries.gsa.conversation.clientop.p1847g.C22506k.f62103a
            com.google.common.f.x r8 = r8.mo56226d()
            java.lang.String r9 = "Failed to get app name; couldn't find package name %s"
            r10 = 48310(0xbcb6, float:6.7697E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r6)).mo56372aa(r10)).mo56389s(r9, r7)
        L_0x00e0:
            java.lang.String r6 = ""
        L_0x00e2:
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 != 0) goto L_0x00fb
            r2.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            r6.getClass()
            int r9 = r8.f132943a
            r9 = r9 | 16
            r8.f132943a = r9
            r8.f132948f = r6
            goto L_0x011a
        L_0x00fb:
            int r6 = r3.f133012b
            if (r6 != r5) goto L_0x0104
            java.lang.Object r6 = r3.f133013c
            com.google.assistant.e.c.c.ev r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r6
            goto L_0x0106
        L_0x0104:
            com.google.assistant.e.c.c.ev r6 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0106:
            java.lang.String r6 = r6.f132948f
            r2.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            r6.getClass()
            int r9 = r8.f132943a
            r9 = r9 | 16
            r8.f132943a = r9
            r8.f132948f = r6
        L_0x011a:
            dagger.a r6 = r14.f62104b
            java.lang.Object r6 = r6.mo27525b()
            android.content.pm.PackageManager r6 = (android.content.pm.PackageManager) r6
            android.content.Intent r6 = r6.getLaunchIntentForPackage(r7)
            if (r6 == 0) goto L_0x013e
            java.lang.String r6 = r6.toUri(r1)
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.assistant.e.c.c.ev r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r7
            r6.getClass()
            int r8 = r7.f132943a
            r8 = r8 | 32
            r7.f132943a = r8
            r7.f132949g = r6
        L_0x013e:
            com.google.assistant.e.c.c.gh r6 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.c.c.gg r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.c.c.gh r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r7
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.c.c.ev r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r2
            r2.getClass()
            r7.f133013c = r2
            r7.f133012b = r5
            java.lang.String r2 = r3.f133014d
            r6.copyOnWrite()
            com.google.protobuf.bv r3 = r6.instance
            com.google.assistant.e.c.c.gh r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r3
            r2.getClass()
            int r7 = r3.f133011a
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.f133011a = r7
            r3.f133014d = r2
            com.google.protobuf.bv r2 = r6.build()
            com.google.assistant.e.c.c.gh r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r2
            com.google.assistant.e.j.apf r2 = com.google.android.libraries.gsa.conversation.clientop.p1847g.C22506k.m41963a(r2, r4)
            r0.mo53711a(r2)
            goto L_0x0186
        L_0x017c:
            if (r8 != r10) goto L_0x0189
            r2 = 5
            com.google.assistant.e.j.apf r2 = com.google.android.libraries.gsa.conversation.clientop.p1847g.C22506k.m41963a(r3, r2)
            r0.mo53711a(r2)
        L_0x0186:
            r2 = 1
            goto L_0x0046
        L_0x0189:
            if (r8 != r4) goto L_0x0194
            com.google.assistant.e.j.apf r3 = com.google.android.libraries.gsa.conversation.clientop.p1847g.C22506k.m41963a(r3, r10)
            r0.mo53711a(r3)
            goto L_0x0046
        L_0x0194:
            com.google.assistant.e.j.apf r3 = com.google.android.libraries.gsa.conversation.clientop.p1847g.C22506k.m41963a(r3, r9)
            r0.mo53711a(r3)
            goto L_0x0046
        L_0x019d:
            com.google.assistant.e.j.apf r3 = com.google.android.libraries.gsa.conversation.clientop.p1847g.C22506k.m41963a(r3, r5)
            r0.mo53711a(r3)
            goto L_0x0046
        L_0x01a6:
            java.lang.String r13 = "assistant.api.client_op.VerifyProviderClientOpResult"
            java.lang.String r14 = "verify_provider_result"
            if (r2 != 0) goto L_0x0277
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.apj r0 = (com.google.assistant.p3897e.p3921j.apj) r0
            com.google.assistant.e.j.kc r1 = com.google.assistant.p3897e.p3921j.C52232kc.f137062d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.kb r1 = (com.google.assistant.p3897e.p3921j.C52231kb) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.kc r2 = (com.google.assistant.p3897e.p3921j.C52232kc) r2
            int r3 = r2.f137064a
            r3 = r3 | r5
            r2.f137064a = r3
            r2.f137065b = r14
            com.google.assistant.e.j.ka r14 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.assistant.e.j.jz r14 = (com.google.assistant.p3897e.p3921j.C52228jz) r14
            com.google.protobuf.z r0 = r0.toByteString()
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.assistant.e.j.ka r2 = (com.google.assistant.p3897e.p3921j.C52230ka) r2
            r0.getClass()
            int r3 = r2.f137059a
            r3 = r3 | r4
            r2.f137059a = r3
            r2.f137061c = r0
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.assistant.e.j.ka r0 = (com.google.assistant.p3897e.p3921j.C52230ka) r0
            int r2 = r0.f137059a
            r2 = r2 | r5
            r0.f137059a = r2
            r0.f137060b = r13
            com.google.protobuf.bv r13 = r14.build()
            com.google.assistant.e.j.ka r13 = (com.google.assistant.p3897e.p3921j.C52230ka) r13
            r1.copyOnWrite()
            com.google.protobuf.bv r14 = r1.instance
            com.google.assistant.e.j.kc r14 = (com.google.assistant.p3897e.p3921j.C52232kc) r14
            r13.getClass()
            r14.f137066c = r13
            int r13 = r14.f137064a
            r13 = r13 | r4
            r14.f137064a = r13
            com.google.protobuf.bv r13 = r1.build()
            com.google.assistant.e.j.kc r13 = (com.google.assistant.p3897e.p3921j.C52232kc) r13
            com.google.assistant.e.j.ec r14 = com.google.assistant.p3897e.p3921j.C52070ec.f136651d
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.assistant.e.j.dz r14 = (com.google.assistant.p3897e.p3921j.C51810dz) r14
            com.google.assistant.e.j.kg r0 = com.google.assistant.p3897e.p3921j.C52236kg.f137089d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.kd r0 = (com.google.assistant.p3897e.p3921j.C52233kd) r0
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.NOT_FOUND
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.kg r2 = (com.google.assistant.p3897e.p3921j.C52236kg) r2
            int r1 = r1.f137088t
            r2.f137092b = r1
            int r1 = r2.f137091a
            r1 = r1 | r5
            r2.f137091a = r1
            r14.copyOnWrite()
            com.google.protobuf.bv r1 = r14.instance
            com.google.assistant.e.j.ec r1 = (com.google.assistant.p3897e.p3921j.C52070ec) r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.kg r0 = (com.google.assistant.p3897e.p3921j.C52236kg) r0
            r0.getClass()
            r1.f136654b = r0
            int r0 = r1.f136653a
            r0 = r0 | r5
            r1.f136653a = r0
            com.google.assistant.e.j.eb r0 = com.google.assistant.p3897e.p3921j.C52069eb.f136648b
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.ea r0 = (com.google.assistant.p3897e.p3921j.C52068ea) r0
            r0.mo53780b(r13)
            com.google.protobuf.bv r13 = r0.build()
            com.google.assistant.e.j.eb r13 = (com.google.assistant.p3897e.p3921j.C52069eb) r13
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.assistant.e.j.ec r0 = (com.google.assistant.p3897e.p3921j.C52070ec) r0
            r13.getClass()
            r0.f136655c = r13
            int r13 = r0.f136653a
            r13 = r13 | r4
            r0.f136653a = r13
            com.google.protobuf.bv r13 = r14.build()
            com.google.assistant.e.j.ec r13 = (com.google.assistant.p3897e.p3921j.C52070ec) r13
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92900i(r13)
            goto L_0x0340
        L_0x0277:
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.apj r0 = (com.google.assistant.p3897e.p3921j.apj) r0
            com.google.assistant.e.j.kc r1 = com.google.assistant.p3897e.p3921j.C52232kc.f137062d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.kb r1 = (com.google.assistant.p3897e.p3921j.C52231kb) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.kc r2 = (com.google.assistant.p3897e.p3921j.C52232kc) r2
            int r3 = r2.f137064a
            r3 = r3 | r5
            r2.f137064a = r3
            r2.f137065b = r14
            com.google.assistant.e.j.ka r14 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.assistant.e.j.jz r14 = (com.google.assistant.p3897e.p3921j.C52228jz) r14
            com.google.protobuf.z r0 = r0.toByteString()
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.assistant.e.j.ka r2 = (com.google.assistant.p3897e.p3921j.C52230ka) r2
            r0.getClass()
            int r3 = r2.f137059a
            r3 = r3 | r4
            r2.f137059a = r3
            r2.f137061c = r0
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.assistant.e.j.ka r0 = (com.google.assistant.p3897e.p3921j.C52230ka) r0
            int r2 = r0.f137059a
            r2 = r2 | r5
            r0.f137059a = r2
            r0.f137060b = r13
            com.google.protobuf.bv r13 = r14.build()
            com.google.assistant.e.j.ka r13 = (com.google.assistant.p3897e.p3921j.C52230ka) r13
            r1.copyOnWrite()
            com.google.protobuf.bv r14 = r1.instance
            com.google.assistant.e.j.kc r14 = (com.google.assistant.p3897e.p3921j.C52232kc) r14
            r13.getClass()
            r14.f137066c = r13
            int r13 = r14.f137064a
            r13 = r13 | r4
            r14.f137064a = r13
            com.google.protobuf.bv r13 = r1.build()
            com.google.assistant.e.j.kc r13 = (com.google.assistant.p3897e.p3921j.C52232kc) r13
            com.google.assistant.e.j.ec r14 = com.google.assistant.p3897e.p3921j.C52070ec.f136651d
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.assistant.e.j.dz r14 = (com.google.assistant.p3897e.p3921j.C51810dz) r14
            com.google.assistant.e.j.kg r0 = com.google.assistant.p3897e.p3921j.C52236kg.f137089d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.kd r0 = (com.google.assistant.p3897e.p3921j.C52233kd) r0
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.OK
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.kg r2 = (com.google.assistant.p3897e.p3921j.C52236kg) r2
            int r1 = r1.f137088t
            r2.f137092b = r1
            int r1 = r2.f137091a
            r1 = r1 | r5
            r2.f137091a = r1
            r14.copyOnWrite()
            com.google.protobuf.bv r1 = r14.instance
            com.google.assistant.e.j.ec r1 = (com.google.assistant.p3897e.p3921j.C52070ec) r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.kg r0 = (com.google.assistant.p3897e.p3921j.C52236kg) r0
            r0.getClass()
            r1.f136654b = r0
            int r0 = r1.f136653a
            r0 = r0 | r5
            r1.f136653a = r0
            com.google.assistant.e.j.eb r0 = com.google.assistant.p3897e.p3921j.C52069eb.f136648b
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.ea r0 = (com.google.assistant.p3897e.p3921j.C52068ea) r0
            r0.mo53780b(r13)
            com.google.protobuf.bv r13 = r0.build()
            com.google.assistant.e.j.eb r13 = (com.google.assistant.p3897e.p3921j.C52069eb) r13
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.assistant.e.j.ec r0 = (com.google.assistant.p3897e.p3921j.C52070ec) r0
            r13.getClass()
            r0.f136655c = r13
            int r13 = r0.f136653a
            r13 = r13 | r4
            r0.f136653a = r13
            com.google.protobuf.bv r13 = r14.build()
            com.google.assistant.e.j.ec r13 = (com.google.assistant.p3897e.p3921j.C52070ec) r13
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92900i(r13)
        L_0x0340:
            return r13
        L_0x0341:
            com.google.android.libraries.gsa.conversation.clientop.d r14 = new com.google.android.libraries.gsa.conversation.clientop.d
            r14.<init>(r13)
            goto L_0x0348
        L_0x0347:
            throw r14
        L_0x0348:
            goto L_0x0347
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.conversation.clientop.p1847g.C22507l.mo20765a(com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }
}
