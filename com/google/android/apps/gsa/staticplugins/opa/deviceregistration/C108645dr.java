package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.dr */
/* compiled from: PG */
public final class C108645dr extends C84036z {

    /* renamed from: a */
    public static final C59071e f302189a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.dr");

    /* renamed from: b */
    private final C108556ar f302190b;

    /* renamed from: c */
    private final C84026u f302191c;

    /* renamed from: d */
    private final C108635dh f302192d;

    /* renamed from: e */
    private final C108617cq f302193e;

    public C108645dr(C108556ar arVar, C84026u uVar, C108635dh dhVar, C108617cq cqVar) {
        this.f302190b = arVar;
        this.f302191c = uVar;
        this.f302192d = dhVar;
        this.f302193e = cqVar;
    }

    /* renamed from: b */
    public final C83956t mo97044b(String str) {
        if (!C90772bp.m148274A(this.f302192d.mo97039a(this.f302190b.mo96983b()), str)) {
            return C83875ai.m133537b(new C108641dn());
        }
        C84026u uVar = this.f302191c;
        C108635dh dhVar = this.f302192d;
        String str2 = (String) this.f302190b.mo96984c().mo56107c();
        str2.getClass();
        return uVar.mo77487a(dhVar.mo97040b(str2, this.f302190b.mo96983b(), str), C108642do.f302186a);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r0.f130239h == false) goto L_0x0056;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58485gu mo77495h() {
        /*
            r13 = this;
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ar r0 = r13.f302190b
            com.google.common.base.ax r0 = r0.mo96984c()
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.dh r1 = r13.f302192d
            r2 = 0
            r1.f302170a = r2
            boolean r0 = r0.mo56113h()
            if (r0 != 0) goto L_0x0026
            com.google.common.f.e r0 = f302189a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "LanguageSeq"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Skip with no assistant device id."
            r2 = 24185(0x5e79, float:3.389E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x004f
        L_0x0026:
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ar r0 = r13.f302190b
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.i r1 = r0.f302004l
            r2 = 2
            if (r1 == 0) goto L_0x0054
            boolean r1 = r1.mo97113q()
            if (r1 == 0) goto L_0x0054
            com.google.assistant.at.li r0 = r0.f302006n
            if (r0 == 0) goto L_0x0056
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r1 = r0.f130302a
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0044
            com.google.assistant.at.ki r1 = r0.f130304c
            if (r1 != 0) goto L_0x0044
            com.google.assistant.at.ki r1 = com.google.assistant.p3861at.C50094ki.f130230i
        L_0x0044:
            com.google.assistant.at.ki r0 = r0.f130304c
            if (r0 != 0) goto L_0x004a
            com.google.assistant.at.ki r0 = com.google.assistant.p3861at.C50094ki.f130230i
        L_0x004a:
            boolean r0 = r0.f130239h
            if (r0 != 0) goto L_0x004f
            goto L_0x0056
        L_0x004f:
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            return r0
        L_0x0054:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x0056:
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.cq r0 = r13.f302193e
            com.google.assistant.at.acv r1 = com.google.assistant.p3861at.acv.f128920X
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.at.acu r1 = (com.google.assistant.p3861at.acu) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.at.acv r3 = (com.google.assistant.p3861at.acv) r3
            int r4 = r3.f128945a
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r4 = r4 | r5
            r3.f128945a = r4
            r4 = 1
            r3.f128968x = r4
            com.google.protobuf.bv r1 = r1.build()
            r7 = r1
            com.google.assistant.at.acv r7 = (com.google.assistant.p3861at.acv) r7
            com.google.android.apps.gsa.assistant.shared.n.l r5 = r0.f302138c
            dagger.a r1 = r0.f302137b
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.opaonboarding.b r1 = (com.google.android.apps.gsa.opaonboarding.C83893b) r1
            com.google.common.base.ax r1 = r1.mo77278a()
            java.lang.Object r1 = r1.mo56107c()
            r6 = r1
            android.accounts.Account r6 = (android.accounts.Account) r6
            com.google.assistant.at.me r8 = com.google.assistant.p3861at.C50144me.f130361d
            r9 = 5
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.Class r0 = r0.getClass()
            java.lang.String r12 = r0.getSimpleName()
            com.google.common.util.concurrent.cx r0 = r5.j(r6, r7, r8, r9, r11, r12)
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.cn r1 = com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108614cn.f302131a
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r3)
            com.google.android.apps.gsa.opaonboarding.t[] r1 = new com.google.android.apps.gsa.opaonboarding.C83956t[r2]
            com.google.android.apps.gsa.opaonboarding.ui.u r2 = r13.f302191c
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.do r3 = com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108642do.f302186a
            com.google.android.apps.gsa.opaonboarding.ui.t r2 = r2.mo77487a(r0, r3)
            r3 = 0
            r1[r3] = r2
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.dp r2 = new com.google.android.apps.gsa.staticplugins.opa.deviceregistration.dp
            r2.<init>(r13)
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.dq r3 = new com.google.android.apps.gsa.staticplugins.opa.deviceregistration.dq
            r3.<init>(r13)
            com.google.android.apps.gsa.opaonboarding.t r0 = com.google.android.apps.gsa.opaonboarding.C83875ai.m133536a(r0, r2, r3)
            r1[r4] = r0
            com.google.android.apps.gsa.opaonboarding.t r0 = com.google.android.apps.gsa.opaonboarding.C83875ai.m133539d(r1)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108645dr.mo77495h():com.google.common.b.gu");
    }
}
