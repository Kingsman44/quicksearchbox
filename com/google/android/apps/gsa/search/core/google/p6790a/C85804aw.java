package com.google.android.apps.gsa.search.core.google.p6790a;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.aw */
/* compiled from: PG */
public final class C85804aw {

    /* renamed from: a */
    private static final C59071e f232011a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.a.aw");

    /* renamed from: b */
    private final C68214a f232012b;

    /* renamed from: c */
    private final C58833ax f232013c;

    /* renamed from: d */
    private final C68214a f232014d;

    /* renamed from: e */
    private final C68214a f232015e;

    /* renamed from: f */
    private final C85831p f232016f;

    /* renamed from: g */
    private final KeyguardManager f232017g;

    /* renamed from: h */
    private final PackageManager f232018h;

    /* renamed from: i */
    private String f232019i;

    /* renamed from: j */
    private final C58833ax f232020j;

    /* renamed from: k */
    private final C86124t f232021k;

    /* renamed from: l */
    private final C68214a f232022l;

    public C85804aw(Context context, C86124t tVar, C68214a aVar, C58833ax axVar, C68214a aVar2, C68214a aVar3, C58833ax axVar2, C85831p pVar, C68214a aVar4) {
        this.f232021k = tVar;
        this.f232017g = (KeyguardManager) context.getSystemService("keyguard");
        this.f232018h = context.getPackageManager();
        this.f232012b = aVar;
        this.f232013c = axVar;
        this.f232014d = aVar2;
        this.f232015e = aVar3;
        this.f232020j = axVar2;
        this.f232016f = pVar;
        this.f232022l = aVar4;
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x039c A[LOOP:1: B:81:0x0396->B:83:0x039c, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.assistant.p3897e.p3921j.C52232kc mo79448a(com.google.android.apps.gsa.shared.search.Query r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.apps.gsa.search.core.google.a.p r2 = r0.f232016f
            com.google.assistant.e.i.a.fn r3 = com.google.assistant.p3897e.p3917i.p3918a.C51379fn.f133814i
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.i.a.fk r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51376fk) r3
            com.google.knowledge.b.ai r4 = com.google.knowledge.p4671b.C61790ai.f166898o
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.knowledge.b.ah r4 = (com.google.knowledge.p4671b.C61789ah) r4
            dagger.a r5 = r0.f232012b
            java.lang.Object r5 = r5.mo27525b()
            com.google.common.base.ax r5 = (com.google.common.base.C58833ax) r5
            boolean r5 = r5.mo56113h()
            r6 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r7 = ""
            if (r5 == 0) goto L_0x0420
            dagger.a r5 = r0.f232012b
            java.lang.Object r5 = r5.mo27525b()
            com.google.common.base.ax r5 = (com.google.common.base.C58833ax) r5
            java.lang.Object r5 = r5.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r5 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r5
            boolean r8 = r17.mo84392cY()
            if (r8 == 0) goto L_0x0063
            com.google.assistant.e.f.f r8 = r5.f300689c
            r3.copyOnWrite()
            com.google.protobuf.bv r9 = r3.instance
            com.google.assistant.e.i.a.fn r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51379fn) r9
            int r8 = r8.f133335j
            r9.f133819d = r8
            int r8 = r9.f133816a
            r8 = r8 | 64
            r9.f133816a = r8
            com.google.assistant.ab.bd r8 = r5.f300695i
            r3.copyOnWrite()
            com.google.protobuf.bv r9 = r3.instance
            com.google.assistant.e.i.a.fn r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51379fn) r9
            r8.getClass()
            r9.f133820e = r8
            int r8 = r9.f133816a
            r8 = r8 | 128(0x80, float:1.794E-43)
            r9.f133816a = r8
        L_0x0063:
            boolean r8 = r5.mo96452q()
            r4.copyOnWrite()
            com.google.protobuf.bv r9 = r4.instance
            com.google.knowledge.b.ai r9 = (com.google.knowledge.p4671b.C61790ai) r9
            int r10 = r9.f166900a
            r11 = 131072(0x20000, float:1.83671E-40)
            r10 = r10 | r11
            r9.f166900a = r10
            r9.f166911l = r8
            boolean r8 = r5.mo96452q()
            if (r8 == 0) goto L_0x00c0
            com.google.common.base.ax r8 = r0.f232013c
            boolean r8 = r8.mo56113h()
            if (r8 == 0) goto L_0x00c0
            com.google.common.base.ax r8 = r0.f232013c
            java.lang.Object r8 = r8.mo56107c()
            com.google.android.apps.gsa.opa.ak r8 = (com.google.android.apps.gsa.opa.C83580ak) r8
            boolean r8 = r8.mo76923d()
            if (r8 == 0) goto L_0x00c0
            com.google.common.base.ax r8 = r0.f232013c
            java.lang.Object r8 = r8.mo56107c()
            com.google.android.apps.gsa.opa.ak r8 = (com.google.android.apps.gsa.opa.C83580ak) r8
            boolean r9 = r8.mo76924e()
            boolean r8 = r8.mo76925f()
            if (r9 != 0) goto L_0x00a7
            if (r8 == 0) goto L_0x00e4
        L_0x00a7:
            com.google.android.apps.gsa.shared.logger.b.f r10 = new com.google.android.apps.gsa.shared.logger.b.f
            r10.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.S3_HEADER_REQUEST_DISPLAY_PARAMS_CLIENT_RESTARTED_COUNTERFACTUAL
            r10.f246201a = r11
            com.google.android.apps.gsa.shared.logger.b.g r10 = r10.mo83699a()
            dagger.a r11 = r0.f232022l
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r11 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r11
            r11.mo74236a(r10)
            goto L_0x00e4
        L_0x00c0:
            boolean r9 = r5.mo96450o()
            boolean r8 = r5.mo96451p()
            if (r9 != 0) goto L_0x00cc
            if (r8 == 0) goto L_0x00e4
        L_0x00cc:
            com.google.android.apps.gsa.shared.logger.b.f r10 = new com.google.android.apps.gsa.shared.logger.b.f
            r10.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r11 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.S3_HEADER_REQUEST_DISPLAY_PARAMS_COUNTERFACTUAL
            r10.f246201a = r11
            com.google.android.apps.gsa.shared.logger.b.g r10 = r10.mo83699a()
            dagger.a r11 = r0.f232022l
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r11 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r11
            r11.mo74236a(r10)
        L_0x00e4:
            boolean r10 = r17.mo84404ck()
            r11 = 0
            if (r10 != 0) goto L_0x00f3
            java.lang.String r10 = "android.opa.extra.MINI_PLATE_ENABLED"
            boolean r10 = r1.mo84363bw(r10)
            if (r10 == 0) goto L_0x00f4
        L_0x00f3:
            r9 = 0
        L_0x00f4:
            com.google.android.apps.gsa.search.core.i.t r10 = r0.f232021k
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C89973al.f246586a
            boolean r10 = r10.mo79746e(r12)
            if (r10 == 0) goto L_0x011d
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.knowledge.b.ai r10 = (com.google.knowledge.p4671b.C61790ai) r10
            int r12 = r10.f166900a
            r13 = 32768(0x8000, float:4.5918E-41)
            r12 = r12 | r13
            r10.f166900a = r12
            r10.f166909j = r9
            r4.copyOnWrite()
            com.google.protobuf.bv r9 = r4.instance
            com.google.knowledge.b.ai r9 = (com.google.knowledge.p4671b.C61790ai) r9
            int r10 = r9.f166900a
            r10 = r10 | r6
            r9.f166900a = r10
            r9.f166910k = r8
        L_0x011d:
            dagger.a r8 = r0.f232012b
            java.lang.Object r8 = r8.mo27525b()
            com.google.common.base.ax r8 = (com.google.common.base.C58833ax) r8
            java.lang.Object r8 = r8.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r8 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r8
            java.lang.String r9 = "android.opa.extra.FOREGROUND_APP_TRIGGERED_ON"
            java.lang.String r9 = r1.mo84347bf(r9)
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x0138
            goto L_0x013c
        L_0x0138:
            java.lang.String r9 = r8.mo96439d()
        L_0x013c:
            com.google.knowledge.b.g r8 = com.google.knowledge.p4671b.C61814g.f166984j
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.knowledge.b.e r8 = (com.google.knowledge.p4671b.C61812e) r8
            java.lang.String r10 = "android.opa.extra.CONVERSATION_DELTA"
            boolean r10 = r1.mo84364bx(r10)
            if (r10 == 0) goto L_0x0179
            byte[] r10 = r17.mo84439dT()     // Catch:{ ct -> 0x0165 }
            com.google.protobuf.ba r12 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0165 }
            com.google.assistant.e.j.en r13 = com.google.assistant.p3897e.p3921j.C52081en.f136679i     // Catch:{ ct -> 0x0165 }
            com.google.protobuf.bv r10 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r13, (byte[]) r10, (com.google.protobuf.C62921ba) r12)     // Catch:{ ct -> 0x0165 }
            com.google.assistant.e.j.en r10 = (com.google.assistant.p3897e.p3921j.C52081en) r10     // Catch:{ ct -> 0x0165 }
            com.google.protobuf.z r10 = r10.f136682b     // Catch:{ ct -> 0x0165 }
            java.nio.charset.Charset r12 = com.google.protobuf.C62972cr.f170009a     // Catch:{ ct -> 0x0165 }
            java.lang.String r10 = r10.mo59170I(r12)     // Catch:{ ct -> 0x0165 }
            goto L_0x017a
        L_0x0165:
            com.google.common.f.e r10 = f232011a
            com.google.common.f.x r10 = r10.mo56226d()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r13 = "ConversationStatePPF"
            r10.mo56378ag(r12, r13)
            java.lang.String r12 = "Unable to parse ConversationDelta included in Query"
            r13 = 7966(0x1f1e, float:1.1163E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r13)).mo56386p(r12)
        L_0x0179:
            r10 = r7
        L_0x017a:
            java.lang.String r12 = r2.mo79471a()
            boolean r12 = com.google.common.base.C58837ba.m90859h(r12)
            if (r12 != 0) goto L_0x018b
            java.lang.String r12 = r2.mo79471a()
            r8.mo58199a(r10, r12)
        L_0x018b:
            com.google.knowledge.b.i r10 = com.google.knowledge.p4671b.C61816i.f166995c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.knowledge.b.h r10 = (com.google.knowledge.p4671b.C61815h) r10
            boolean r2 = r2.f232080b
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.knowledge.b.i r12 = (com.google.knowledge.p4671b.C61816i) r12
            int r13 = r12.f166997a
            r13 = r13 | 1
            r12.f166997a = r13
            r12.f166998b = r2
            com.google.protobuf.bv r2 = r10.build()
            com.google.knowledge.b.i r2 = (com.google.knowledge.p4671b.C61816i) r2
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.knowledge.b.g r10 = (com.google.knowledge.p4671b.C61814g) r10
            r2.getClass()
            r10.f166993h = r2
            int r2 = r10.f166986a
            r2 = r2 | 128(0x80, float:1.794E-43)
            r10.f166986a = r2
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto L_0x0203
            r8.copyOnWrite()
            com.google.protobuf.bv r2 = r8.instance
            com.google.knowledge.b.g r2 = (com.google.knowledge.p4671b.C61814g) r2
            r9.getClass()
            int r10 = r2.f166986a
            r10 = r10 | 1
            r2.f166986a = r10
            r2.f166987b = r9
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.ANDROID_AUTO_PROJECTED
            com.google.common.o.amo r10 = r1.f252760R
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x0203
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f232021k
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250276aA
            boolean r2 = r2.mo79746e(r10)
            if (r2 == 0) goto L_0x0203
            android.content.pm.PackageManager r2 = r0.f232018h     // Catch:{ NameNotFoundException -> 0x0202 }
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r9, r11)     // Catch:{ NameNotFoundException -> 0x0202 }
            long r12 = r2.getLongVersionCode()     // Catch:{ NameNotFoundException -> 0x0202 }
            r8.copyOnWrite()     // Catch:{ NameNotFoundException -> 0x0202 }
            com.google.protobuf.bv r2 = r8.instance     // Catch:{ NameNotFoundException -> 0x0202 }
            com.google.knowledge.b.g r2 = (com.google.knowledge.p4671b.C61814g) r2     // Catch:{ NameNotFoundException -> 0x0202 }
            int r10 = r2.f166986a     // Catch:{ NameNotFoundException -> 0x0202 }
            r10 = r10 | 8
            r2.f166986a = r10     // Catch:{ NameNotFoundException -> 0x0202 }
            r2.f166990e = r12     // Catch:{ NameNotFoundException -> 0x0202 }
            goto L_0x0203
        L_0x0202:
        L_0x0203:
            com.google.protobuf.bv r2 = r8.build()
            com.google.knowledge.b.g r2 = (com.google.knowledge.p4671b.C61814g) r2
            r4.copyOnWrite()
            com.google.protobuf.bv r8 = r4.instance
            com.google.knowledge.b.ai r8 = (com.google.knowledge.p4671b.C61790ai) r8
            r2.getClass()
            r8.f166903d = r2
            int r2 = r8.f166900a
            r2 = r2 | 16
            r8.f166900a = r2
            dagger.a r2 = r0.f232014d
            java.lang.Object r2 = r2.mo27525b()
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x02d0
            dagger.a r2 = r0.f232014d
            java.lang.Object r2 = r2.mo27525b()
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.ao.a r2 = (com.google.android.apps.gsa.staticplugins.opa.p8281ao.C107129a) r2
            boolean r2 = r2.f298207b
            r4.copyOnWrite()
            com.google.protobuf.bv r8 = r4.instance
            com.google.knowledge.b.ai r8 = (com.google.knowledge.p4671b.C61790ai) r8
            int r10 = r8.f166900a
            r12 = 262144(0x40000, float:3.67342E-40)
            r10 = r10 | r12
            r8.f166900a = r10
            r8.f166912m = r2
            dagger.a r2 = r0.f232014d
            java.lang.Object r2 = r2.mo27525b()
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.ao.a r2 = (com.google.android.apps.gsa.staticplugins.opa.p8281ao.C107129a) r2
            java.util.List r2 = r2.f298206a
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89842j(r2)
            int r8 = r2.size()
        L_0x0261:
            if (r11 >= r8) goto L_0x02d0
            java.lang.Object r10 = r2.get(r11)
            com.google.assistant.e.j.ju r10 = (com.google.assistant.p3897e.p3921j.C52223ju) r10
            com.google.knowledge.b.ak r12 = com.google.knowledge.p4671b.C61792ak.f166916d
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.knowledge.b.aj r12 = (com.google.knowledge.p4671b.C61791aj) r12
            com.google.knowledge.b.as r13 = com.google.knowledge.p4671b.C61800as.f166936f
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.knowledge.b.ar r13 = (com.google.knowledge.p4671b.C61799ar) r13
            int r14 = r10.f137040a
            r14 = r14 & 16
            if (r14 == 0) goto L_0x0282
            java.lang.String r14 = r10.f137045f
            goto L_0x0284
        L_0x0282:
            java.lang.String r14 = r10.f137041b
        L_0x0284:
            r13.copyOnWrite()
            com.google.protobuf.bv r15 = r13.instance
            com.google.knowledge.b.as r15 = (com.google.knowledge.p4671b.C61800as) r15
            r14.getClass()
            int r6 = r15.f166938a
            r6 = r6 | 8
            r15.f166938a = r6
            r15.f166940c = r14
            r12.copyOnWrite()
            com.google.protobuf.bv r6 = r12.instance
            com.google.knowledge.b.ak r6 = (com.google.knowledge.p4671b.C61792ak) r6
            com.google.protobuf.bv r13 = r13.build()
            com.google.knowledge.b.as r13 = (com.google.knowledge.p4671b.C61800as) r13
            r13.getClass()
            r6.f166920c = r13
            int r13 = r6.f166918a
            r13 = r13 | 16
            r6.f166918a = r13
            int r6 = r10.f137040a
            r6 = r6 & 64
            if (r6 == 0) goto L_0x02c8
            java.lang.String r6 = r10.f137046g
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.knowledge.b.ak r10 = (com.google.knowledge.p4671b.C61792ak) r10
            r6.getClass()
            int r13 = r10.f166918a
            r13 = r13 | 1
            r10.f166918a = r13
            r10.f166919b = r6
        L_0x02c8:
            r4.mo58193a(r12)
            int r11 = r11 + 1
            r6 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0261
        L_0x02d0:
            dagger.a r2 = r0.f232015e
            java.lang.Object r2 = r2.mo27525b()
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x0339
            dagger.a r2 = r0.f232015e
            java.lang.Object r2 = r2.mo27525b()
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.nga.api.cd r2 = (com.google.android.apps.gsa.nga.api.cd) r2
            com.google.common.base.ax r2 = r2.a()
            boolean r6 = r2.mo56113h()
            if (r6 == 0) goto L_0x0339
            com.google.knowledge.b.ak r6 = com.google.knowledge.p4671b.C61792ak.f166916d
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.knowledge.b.aj r6 = (com.google.knowledge.p4671b.C61791aj) r6
            com.google.knowledge.b.as r8 = com.google.knowledge.p4671b.C61800as.f166936f
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.knowledge.b.ar r8 = (com.google.knowledge.p4671b.C61799ar) r8
            java.lang.Object r2 = r2.mo56107c()
            java.lang.String r2 = (java.lang.String) r2
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.knowledge.b.as r10 = (com.google.knowledge.p4671b.C61800as) r10
            r2.getClass()
            int r11 = r10.f166938a
            r11 = r11 | 8
            r10.f166938a = r11
            r10.f166940c = r2
            r6.copyOnWrite()
            com.google.protobuf.bv r2 = r6.instance
            com.google.knowledge.b.ak r2 = (com.google.knowledge.p4671b.C61792ak) r2
            com.google.protobuf.bv r8 = r8.build()
            com.google.knowledge.b.as r8 = (com.google.knowledge.p4671b.C61800as) r8
            r8.getClass()
            r2.f166920c = r8
            int r8 = r2.f166918a
            r8 = r8 | 16
            r2.f166918a = r8
            r4.mo58193a(r6)
        L_0x0339:
            com.google.knowledge.b.ag r2 = r5.mo96438c()
            if (r2 == 0) goto L_0x0355
            com.google.knowledge.b.ag r2 = r5.mo96438c()
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.knowledge.b.ai r6 = (com.google.knowledge.p4671b.C61790ai) r6
            r2.getClass()
            r6.f166902c = r2
            int r2 = r6.f166900a
            r2 = r2 | 8
            r6.f166900a = r2
        L_0x0355:
            a.b.b.a.g r2 = r5.f300691e
            if (r2 == 0) goto L_0x0384
            com.google.common.base.ax r2 = r0.f232020j
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x0384
            com.google.common.base.ax r2 = r0.f232020j
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.assistant.shared.az r2 = (com.google.android.apps.gsa.assistant.shared.az) r2
            boolean r2 = r2.l()
            if (r2 == 0) goto L_0x0384
            a.b.b.a.g r2 = r5.f300691e
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.knowledge.b.ai r6 = (com.google.knowledge.p4671b.C61790ai) r6
            r2.getClass()
            r6.f166913n = r2
            int r2 = r6.f166900a
            r8 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 | r8
            r6.f166900a = r2
        L_0x0384:
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f232021k
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248839au
            boolean r2 = r2.mo79746e(r6)
            if (r2 == 0) goto L_0x0421
            java.util.List r2 = r5.f300692f
            if (r2 == 0) goto L_0x0421
            java.util.Iterator r2 = r2.iterator()
        L_0x0396:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0421
            java.lang.Object r5 = r2.next()
            a.b.b.a.e r5 = (p001a.p007b.p011b.p012a.C0029e) r5
            com.google.knowledge.b.ak r6 = com.google.knowledge.p4671b.C61792ak.f166916d
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.knowledge.b.aj r6 = (com.google.knowledge.p4671b.C61791aj) r6
            com.google.knowledge.b.as r8 = com.google.knowledge.p4671b.C61800as.f166936f
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.knowledge.b.ar r8 = (com.google.knowledge.p4671b.C61799ar) r8
            java.lang.String r10 = r5.f89a
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.knowledge.b.as r11 = (com.google.knowledge.p4671b.C61800as) r11
            r10.getClass()
            int r12 = r11.f166938a
            r12 = r12 | 1
            r11.f166938a = r12
            r11.f166939b = r10
            java.lang.String r10 = r5.f90b
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.knowledge.b.as r11 = (com.google.knowledge.p4671b.C61800as) r11
            r10.getClass()
            int r12 = r11.f166938a
            r12 = r12 | 16
            r11.f166938a = r12
            r11.f166941d = r10
            java.lang.String r5 = r5.f91c
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.knowledge.b.as r10 = (com.google.knowledge.p4671b.C61800as) r10
            r5.getClass()
            int r11 = r10.f166938a
            r11 = r11 | 1024(0x400, float:1.435E-42)
            r10.f166938a = r11
            r10.f166942e = r5
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.knowledge.b.ak r5 = (com.google.knowledge.p4671b.C61792ak) r5
            com.google.protobuf.bv r8 = r8.build()
            com.google.knowledge.b.as r8 = (com.google.knowledge.p4671b.C61800as) r8
            r8.getClass()
            r5.f166920c = r8
            int r8 = r5.f166918a
            r8 = r8 | 16
            r5.f166918a = r8
            com.google.protobuf.bv r5 = r6.build()
            com.google.knowledge.b.ak r5 = (com.google.knowledge.p4671b.C61792ak) r5
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.knowledge.b.ai r6 = (com.google.knowledge.p4671b.C61790ai) r6
            r5.getClass()
            r6.mo58194a()
            com.google.protobuf.cq r6 = r6.f166908i
            r6.add(r5)
            goto L_0x0396
        L_0x0420:
            r9 = 0
        L_0x0421:
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f232021k
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90066dr.f249678a
            boolean r2 = r2.mo79746e(r5)
            if (r2 == 0) goto L_0x04ac
            android.app.KeyguardManager r2 = r0.f232017g
            boolean r2 = r2.isKeyguardLocked()
            if (r2 == 0) goto L_0x0447
            com.google.assistant.e.i.a.fm r2 = com.google.assistant.p3897e.p3917i.p3918a.C51378fm.LOCKSCREEN
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.i.a.fn r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51379fn) r5
            int r2 = r2.f133813e
            r5.f133821f = r2
            int r2 = r5.f133816a
            r2 = r2 | 256(0x100, float:3.59E-43)
            r5.f133816a = r2
            goto L_0x04ac
        L_0x0447:
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto L_0x0499
            java.lang.String r2 = r0.f232019i
            if (r2 != 0) goto L_0x0474
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.MAIN"
            r2.<init>(r5)
            java.lang.String r5 = "android.intent.category.HOME"
            r2.addCategory(r5)
            android.content.pm.PackageManager r5 = r0.f232018h
            r6 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r2 = r5.resolveActivity(r2, r6)
            if (r2 == 0) goto L_0x0472
            android.content.pm.ActivityInfo r5 = r2.activityInfo
            if (r5 == 0) goto L_0x0472
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            java.lang.String r2 = r2.packageName
            r0.f232019i = r2
            goto L_0x0474
        L_0x0472:
            r0.f232019i = r7
        L_0x0474:
            java.lang.String r2 = r0.f232019i
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0485
            java.lang.String r2 = r0.f232019i
            boolean r2 = p3186j$.util.Objects.equals(r2, r9)
            if (r2 == 0) goto L_0x0485
            goto L_0x0499
        L_0x0485:
            com.google.assistant.e.i.a.fm r2 = com.google.assistant.p3897e.p3917i.p3918a.C51378fm.IN_APP
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.i.a.fn r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51379fn) r5
            int r2 = r2.f133813e
            r5.f133821f = r2
            int r2 = r5.f133816a
            r2 = r2 | 256(0x100, float:3.59E-43)
            r5.f133816a = r2
            goto L_0x04ac
        L_0x0499:
            com.google.assistant.e.i.a.fm r2 = com.google.assistant.p3897e.p3917i.p3918a.C51378fm.HOMESCREEN
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.i.a.fn r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51379fn) r5
            int r2 = r2.f133813e
            r5.f133821f = r2
            int r2 = r5.f133816a
            r2 = r2 | 256(0x100, float:3.59E-43)
            r5.f133816a = r2
        L_0x04ac:
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.assistant.e.i.a.fn r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51379fn) r2
            com.google.protobuf.bv r4 = r4.build()
            com.google.knowledge.b.ai r4 = (com.google.knowledge.p4671b.C61790ai) r4
            r4.getClass()
            r2.f133817b = r4
            int r4 = r2.f133816a
            r4 = r4 | 1
            r2.f133816a = r4
            com.google.protobuf.bv r2 = r3.build()
            com.google.assistant.e.i.a.fn r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51379fn) r2
            java.lang.String r3 = "android.opa.extra.BACK_NAVIGATION_QUERY_OPAQUE_TOKEN"
            byte[] r1 = r1.mo84440dU(r3)
            if (r1 == 0) goto L_0x04f2
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.assistant.e.i.a.fk r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51376fk) r2
            com.google.protobuf.z r1 = com.google.protobuf.C63088z.m96139A(r1)
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.i.a.fn r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51379fn) r3
            int r4 = r3.f133816a
            r4 = r4 | 1024(0x400, float:1.435E-42)
            r3.f133816a = r4
            r3.f133823h = r1
            com.google.protobuf.bv r1 = r2.build()
            r2 = r1
            com.google.assistant.e.i.a.fn r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51379fn) r2
        L_0x04f2:
            com.google.assistant.e.j.kc r1 = com.google.assistant.p3897e.p3921j.C52232kc.f137062d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.kb r1 = (com.google.assistant.p3897e.p3921j.C52231kb) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.kc r3 = (com.google.assistant.p3897e.p3921j.C52232kc) r3
            int r4 = r3.f137064a
            r4 = r4 | 1
            r3.f137064a = r4
            java.lang.String r4 = "asst.display.context.params"
            r3.f137065b = r4
            com.google.assistant.e.j.ka r3 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.jz r3 = (com.google.assistant.p3897e.p3921j.C52228jz) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.e.j.ka r4 = (com.google.assistant.p3897e.p3921j.C52230ka) r4
            int r5 = r4.f137059a
            r5 = r5 | 1
            r4.f137059a = r5
            java.lang.String r5 = "assistant.api.params.DisplayContextParams"
            r4.f137060b = r5
            com.google.protobuf.z r2 = r2.toByteString()
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.e.j.ka r4 = (com.google.assistant.p3897e.p3921j.C52230ka) r4
            r2.getClass()
            int r5 = r4.f137059a
            r5 = r5 | 2
            r4.f137059a = r5
            r4.f137061c = r2
            com.google.protobuf.bv r2 = r3.build()
            com.google.assistant.e.j.ka r2 = (com.google.assistant.p3897e.p3921j.C52230ka) r2
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.kc r3 = (com.google.assistant.p3897e.p3921j.C52232kc) r3
            r2.getClass()
            r3.f137066c = r2
            int r2 = r3.f137064a
            r2 = r2 | 2
            r3.f137064a = r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.kc r1 = (com.google.assistant.p3897e.p3921j.C52232kc) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.p6790a.C85804aw.mo79448a(com.google.android.apps.gsa.shared.search.Query):com.google.assistant.e.j.kc");
    }
}
