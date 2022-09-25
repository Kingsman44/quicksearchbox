package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.pm.PackageManager;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.apd;
import com.google.assistant.p3897e.p3921j.apf;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.cj */
/* compiled from: PG */
public final class C35945cj implements C35472h {

    /* renamed from: a */
    private static final C59071e f94119a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.cj");

    /* renamed from: b */
    private final PackageManager f94120b;

    public C35945cj(PackageManager packageManager) {
        this.f94120b = packageManager;
    }

    /* renamed from: b */
    private static apf m64330b(C51098gh ghVar, int i) {
        apd apd = (apd) apf.f135549d.createBuilder();
        apd.copyOnWrite();
        apf apf = (apf) apd.instance;
        ghVar.getClass();
        apf.f135552b = ghVar;
        apf.f135551a |= 1;
        apd.copyOnWrite();
        apf apf2 = (apf) apd.instance;
        apf2.f135553c = i - 1;
        apf2.f135551a |= 2;
        return (apf) apd.build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20766a(com.google.assistant.p3897e.p3921j.C51809dy r13) {
        /*
            r12 = this;
            com.google.common.f.e r0 = f94119a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "TNG VerifyProviderPerformer"
            r2 = 51866(0xca9a, float:7.268E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            java.lang.String r0 = r13.f135936b
            java.lang.String r1 = "provider.VERIFY"
            boolean r0 = r0.equals(r1)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0333
            com.google.assistant.e.j.aph r0 = com.google.assistant.p3897e.p3921j.aph.f135554b
            com.google.protobuf.eb r0 = r0.getParserForType()
            java.lang.String r1 = "verify_provider_args"
            com.google.protobuf.MessageLite r13 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r13, r1, r0)
            com.google.assistant.e.j.aph r13 = (com.google.assistant.p3897e.p3921j.aph) r13
            com.google.protobuf.cq r0 = r13.f135556a
            int r0 = r0.size()
            if (r0 != 0) goto L_0x003e
            com.google.assistant.e.j.kf r13 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r0 = "Unable to verify provider: no providers to look up."
            com.google.assistant.e.j.ec r13 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r13, r0)
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92900i(r13)
            return r13
        L_0x003e:
            com.google.assistant.e.j.apj r0 = com.google.assistant.p3897e.p3921j.apj.f135557b
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.api r0 = (com.google.assistant.p3897e.p3921j.C51687api) r0
            com.google.protobuf.cq r13 = r13.f135556a
            java.util.Iterator r13 = r13.iterator()
            r1 = 0
        L_0x004d:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto L_0x0199
            java.lang.Object r5 = r13.next()
            com.google.assistant.e.c.c.gh r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r5
            int r6 = r5.f133012b
            if (r6 != r4) goto L_0x0190
            java.lang.Object r6 = r5.f133013c
            com.google.assistant.e.c.c.ev r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r6
            java.lang.String r7 = r6.f132944b
            int r8 = r6.f132943a
            r8 = r8 & r3
            if (r8 == 0) goto L_0x006b
            int r6 = r6.f132945c
            goto L_0x006c
        L_0x006b:
            r6 = 0
        L_0x006c:
            android.content.pm.PackageManager r8 = r12.f94120b
            r9 = 3
            r10 = 4
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r7, r2)     // Catch:{ NameNotFoundException -> 0x0088 }
            int r11 = r8.versionCode     // Catch:{ NameNotFoundException -> 0x0088 }
            if (r11 >= r6) goto L_0x007a
            r8 = 2
            goto L_0x008a
        L_0x007a:
            android.content.pm.ApplicationInfo r11 = r8.applicationInfo     // Catch:{ NameNotFoundException -> 0x0088 }
            if (r11 == 0) goto L_0x0086
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo     // Catch:{ NameNotFoundException -> 0x0088 }
            boolean r8 = r8.enabled     // Catch:{ NameNotFoundException -> 0x0088 }
            if (r8 == 0) goto L_0x0086
            r8 = 1
            goto L_0x008a
        L_0x0086:
            r8 = 4
            goto L_0x008a
        L_0x0088:
            r8 = 3
        L_0x008a:
            if (r8 != r4) goto L_0x016f
            com.google.assistant.e.c.c.ev r1 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.c.c.es r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            r7.getClass()
            int r9 = r8.f132943a
            r9 = r9 | r4
            r8.f132943a = r9
            r8.f132944b = r7
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            int r9 = r8.f132943a
            r9 = r9 | r3
            r8.f132943a = r9
            r8.f132945c = r6
            android.content.pm.PackageManager r6 = r12.f94120b
            android.content.pm.ApplicationInfo r8 = r6.getApplicationInfo(r7, r2)     // Catch:{ NameNotFoundException -> 0x00ca }
            if (r8 == 0) goto L_0x00d9
            java.lang.CharSequence r6 = r6.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x00ca }
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ NameNotFoundException -> 0x00ca }
            if (r8 != 0) goto L_0x00d9
            java.lang.String r6 = r6.toString()     // Catch:{ NameNotFoundException -> 0x00ca }
            goto L_0x00db
        L_0x00ca:
            r6 = move-exception
            com.google.common.f.e r8 = f94119a
            com.google.common.f.x r8 = r8.mo56226d()
            java.lang.String r9 = "Failed to get app name; couldn't find package name %s"
            r10 = 51867(0xca9b, float:7.2681E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r6)).mo56372aa(r10)).mo56389s(r9, r7)
        L_0x00d9:
            java.lang.String r6 = ""
        L_0x00db:
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 != 0) goto L_0x00f4
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            r6.getClass()
            int r9 = r8.f132943a
            r9 = r9 | 16
            r8.f132943a = r9
            r8.f132948f = r6
            goto L_0x0113
        L_0x00f4:
            int r6 = r5.f133012b
            if (r6 != r4) goto L_0x00fd
            java.lang.Object r6 = r5.f133013c
            com.google.assistant.e.c.c.ev r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r6
            goto L_0x00ff
        L_0x00fd:
            com.google.assistant.e.c.c.ev r6 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x00ff:
            java.lang.String r6 = r6.f132948f
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            r6.getClass()
            int r9 = r8.f132943a
            r9 = r9 | 16
            r8.f132943a = r9
            r8.f132948f = r6
        L_0x0113:
            android.content.pm.PackageManager r6 = r12.f94120b
            android.content.Intent r6 = r6.getLaunchIntentForPackage(r7)
            if (r6 == 0) goto L_0x0131
            java.lang.String r6 = r6.toUri(r2)
            r1.copyOnWrite()
            com.google.protobuf.bv r7 = r1.instance
            com.google.assistant.e.c.c.ev r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r7
            r6.getClass()
            int r8 = r7.f132943a
            r8 = r8 | 32
            r7.f132943a = r8
            r7.f132949g = r6
        L_0x0131:
            com.google.assistant.e.c.c.gh r6 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.c.c.gg r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.c.c.gh r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r7
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.c.c.ev r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r1
            r1.getClass()
            r7.f133013c = r1
            r7.f133012b = r4
            java.lang.String r1 = r5.f133014d
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.assistant.e.c.c.gh r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r5
            r1.getClass()
            int r7 = r5.f133011a
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r5.f133011a = r7
            r5.f133014d = r1
            com.google.protobuf.bv r1 = r6.build()
            com.google.assistant.e.c.c.gh r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r1
            com.google.assistant.e.j.apf r1 = m64330b(r1, r3)
            r0.mo53711a(r1)
            goto L_0x0179
        L_0x016f:
            if (r8 != r10) goto L_0x017c
            r1 = 5
            com.google.assistant.e.j.apf r1 = m64330b(r5, r1)
            r0.mo53711a(r1)
        L_0x0179:
            r1 = 1
            goto L_0x004d
        L_0x017c:
            if (r8 != r3) goto L_0x0187
            com.google.assistant.e.j.apf r5 = m64330b(r5, r10)
            r0.mo53711a(r5)
            goto L_0x004d
        L_0x0187:
            com.google.assistant.e.j.apf r5 = m64330b(r5, r9)
            r0.mo53711a(r5)
            goto L_0x004d
        L_0x0190:
            com.google.assistant.e.j.apf r5 = m64330b(r5, r4)
            r0.mo53711a(r5)
            goto L_0x004d
        L_0x0199:
            java.lang.String r13 = "assistant.api.client_op.VerifyProviderClientOpResult"
            java.lang.String r2 = "verify_provider_result"
            if (r1 != 0) goto L_0x0269
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.apj r0 = (com.google.assistant.p3897e.p3921j.apj) r0
            com.google.assistant.e.j.kc r1 = com.google.assistant.p3897e.p3921j.C52232kc.f137062d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.kb r1 = (com.google.assistant.p3897e.p3921j.C52231kb) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.assistant.e.j.kc r5 = (com.google.assistant.p3897e.p3921j.C52232kc) r5
            int r6 = r5.f137064a
            r6 = r6 | r4
            r5.f137064a = r6
            r5.f137065b = r2
            com.google.assistant.e.j.ka r2 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.jz r2 = (com.google.assistant.p3897e.p3921j.C52228jz) r2
            com.google.protobuf.z r0 = r0.toByteString()
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.j.ka r5 = (com.google.assistant.p3897e.p3921j.C52230ka) r5
            r0.getClass()
            int r6 = r5.f137059a
            r6 = r6 | r3
            r5.f137059a = r6
            r5.f137061c = r0
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.e.j.ka r0 = (com.google.assistant.p3897e.p3921j.C52230ka) r0
            int r5 = r0.f137059a
            r5 = r5 | r4
            r0.f137059a = r5
            r0.f137060b = r13
            com.google.protobuf.bv r13 = r2.build()
            com.google.assistant.e.j.ka r13 = (com.google.assistant.p3897e.p3921j.C52230ka) r13
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.assistant.e.j.kc r0 = (com.google.assistant.p3897e.p3921j.C52232kc) r0
            r13.getClass()
            r0.f137066c = r13
            int r13 = r0.f137064a
            r13 = r13 | r3
            r0.f137064a = r13
            com.google.protobuf.bv r13 = r1.build()
            com.google.assistant.e.j.kc r13 = (com.google.assistant.p3897e.p3921j.C52232kc) r13
            com.google.assistant.e.j.ec r0 = com.google.assistant.p3897e.p3921j.C52070ec.f136651d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.dz r0 = (com.google.assistant.p3897e.p3921j.C51810dz) r0
            com.google.assistant.e.j.kg r1 = com.google.assistant.p3897e.p3921j.C52236kg.f137089d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.kd r1 = (com.google.assistant.p3897e.p3921j.C52233kd) r1
            com.google.assistant.e.j.kf r2 = com.google.assistant.p3897e.p3921j.C52235kf.NOT_FOUND
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.assistant.e.j.kg r5 = (com.google.assistant.p3897e.p3921j.C52236kg) r5
            int r2 = r2.f137088t
            r5.f137092b = r2
            int r2 = r5.f137091a
            r2 = r2 | r4
            r5.f137091a = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.ec r2 = (com.google.assistant.p3897e.p3921j.C52070ec) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.kg r1 = (com.google.assistant.p3897e.p3921j.C52236kg) r1
            r1.getClass()
            r2.f136654b = r1
            int r1 = r2.f136653a
            r1 = r1 | r4
            r2.f136653a = r1
            com.google.assistant.e.j.eb r1 = com.google.assistant.p3897e.p3921j.C52069eb.f136648b
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.ea r1 = (com.google.assistant.p3897e.p3921j.C52068ea) r1
            r1.mo53780b(r13)
            com.google.protobuf.bv r13 = r1.build()
            com.google.assistant.e.j.eb r13 = (com.google.assistant.p3897e.p3921j.C52069eb) r13
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.ec r1 = (com.google.assistant.p3897e.p3921j.C52070ec) r1
            r13.getClass()
            r1.f136655c = r13
            int r13 = r1.f136653a
            r13 = r13 | r3
            r1.f136653a = r13
            com.google.protobuf.bv r13 = r0.build()
            com.google.assistant.e.j.ec r13 = (com.google.assistant.p3897e.p3921j.C52070ec) r13
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92900i(r13)
            return r13
        L_0x0269:
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.apj r0 = (com.google.assistant.p3897e.p3921j.apj) r0
            com.google.assistant.e.j.kc r1 = com.google.assistant.p3897e.p3921j.C52232kc.f137062d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.kb r1 = (com.google.assistant.p3897e.p3921j.C52231kb) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.assistant.e.j.kc r5 = (com.google.assistant.p3897e.p3921j.C52232kc) r5
            int r6 = r5.f137064a
            r6 = r6 | r4
            r5.f137064a = r6
            r5.f137065b = r2
            com.google.assistant.e.j.ka r2 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.jz r2 = (com.google.assistant.p3897e.p3921j.C52228jz) r2
            com.google.protobuf.z r0 = r0.toByteString()
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.j.ka r5 = (com.google.assistant.p3897e.p3921j.C52230ka) r5
            r0.getClass()
            int r6 = r5.f137059a
            r6 = r6 | r3
            r5.f137059a = r6
            r5.f137061c = r0
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.e.j.ka r0 = (com.google.assistant.p3897e.p3921j.C52230ka) r0
            int r5 = r0.f137059a
            r5 = r5 | r4
            r0.f137059a = r5
            r0.f137060b = r13
            com.google.protobuf.bv r13 = r2.build()
            com.google.assistant.e.j.ka r13 = (com.google.assistant.p3897e.p3921j.C52230ka) r13
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.assistant.e.j.kc r0 = (com.google.assistant.p3897e.p3921j.C52232kc) r0
            r13.getClass()
            r0.f137066c = r13
            int r13 = r0.f137064a
            r13 = r13 | r3
            r0.f137064a = r13
            com.google.protobuf.bv r13 = r1.build()
            com.google.assistant.e.j.kc r13 = (com.google.assistant.p3897e.p3921j.C52232kc) r13
            com.google.assistant.e.j.ec r0 = com.google.assistant.p3897e.p3921j.C52070ec.f136651d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.dz r0 = (com.google.assistant.p3897e.p3921j.C51810dz) r0
            com.google.assistant.e.j.kg r1 = com.google.assistant.p3897e.p3921j.C52236kg.f137089d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.kd r1 = (com.google.assistant.p3897e.p3921j.C52233kd) r1
            com.google.assistant.e.j.kf r2 = com.google.assistant.p3897e.p3921j.C52235kf.OK
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.assistant.e.j.kg r5 = (com.google.assistant.p3897e.p3921j.C52236kg) r5
            int r2 = r2.f137088t
            r5.f137092b = r2
            int r2 = r5.f137091a
            r2 = r2 | r4
            r5.f137091a = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.ec r2 = (com.google.assistant.p3897e.p3921j.C52070ec) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.kg r1 = (com.google.assistant.p3897e.p3921j.C52236kg) r1
            r1.getClass()
            r2.f136654b = r1
            int r1 = r2.f136653a
            r1 = r1 | r4
            r2.f136653a = r1
            com.google.assistant.e.j.eb r1 = com.google.assistant.p3897e.p3921j.C52069eb.f136648b
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.ea r1 = (com.google.assistant.p3897e.p3921j.C52068ea) r1
            r1.mo53780b(r13)
            com.google.protobuf.bv r13 = r1.build()
            com.google.assistant.e.j.eb r13 = (com.google.assistant.p3897e.p3921j.C52069eb) r13
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.ec r1 = (com.google.assistant.p3897e.p3921j.C52070ec) r1
            r13.getClass()
            r1.f136655c = r13
            int r13 = r1.f136653a
            r13 = r13 | r3
            r1.f136653a = r13
            com.google.protobuf.bv r13 = r0.build()
            com.google.assistant.e.j.ec r13 = (com.google.assistant.p3897e.p3921j.C52070ec) r13
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92900i(r13)
            return r13
        L_0x0333:
            com.google.android.libraries.search.assistant.performer.a.g r0 = new com.google.android.libraries.search.assistant.performer.a.g
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r1
            java.lang.String r13 = r13.f135936b
            r3[r4] = r13
            java.lang.String r13 = "ClientOp is incorrect. Expected %1$s but instead got %2$s"
            java.lang.String r13 = java.lang.String.format(r13, r3)
            r0.<init>((java.lang.String) r13)
            goto L_0x0348
        L_0x0347:
            throw r0
        L_0x0348:
            goto L_0x0347
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.deviceactions.C35945cj.mo20766a(com.google.assistant.e.j.dy):com.google.common.util.concurrent.cx");
    }
}
