package com.google.android.apps.gsa.search.core.tasks.now;

import com.google.android.apps.gsa.gcm.a.e;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91376f;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

@ProguardMustNotDelete
/* compiled from: PG */
public class NowUpdateGcmRegistrationTask extends C90888av implements C118549h {

    /* renamed from: a */
    private static final C59071e f235580a = C59071e.m91332i("com.google.android.apps.gsa.search.core.tasks.now.NowUpdateGcmRegistrationTask");

    /* renamed from: b */
    private final e f235581b;

    /* renamed from: c */
    private final C86054o f235582c;

    /* renamed from: d */
    private final C91376f f235583d;

    public NowUpdateGcmRegistrationTask(e eVar, C86054o oVar, C91376f fVar) {
        super("UpdateGcmReg", 2, 4);
        this.f235581b = eVar;
        this.f235582c = oVar;
        this.f235583d = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        run();
        return C118826c.f331423b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.google.android.apps.gsa.gcm.a.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r5.equals(r4.a()) == false) goto L_0x002a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8 A[Catch:{ RuntimeException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cf A[Catch:{ RuntimeException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0127 A[Catch:{ RuntimeException -> 0x024b }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0248 A[Catch:{ RuntimeException -> 0x024b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            java.lang.String r0 = "gcm_account_state3:"
            java.lang.String r1 = "gcm_account_expiration3:"
            java.lang.String r2 = "UpdateGcmReg"
            com.google.android.apps.gsa.search.core.google.gaia.o r3 = r15.f235582c     // Catch:{ RuntimeException -> 0x024b }
            android.accounts.Account r3 = r3.mo79668a()     // Catch:{ RuntimeException -> 0x024b }
            if (r3 != 0) goto L_0x0011
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x024b }
            return
        L_0x0011:
            com.google.android.apps.gsa.gcm.a.e r4 = r15.f235581b     // Catch:{ RuntimeException -> 0x024b }
            com.google.android.apps.gsa.gcm.a.i r5 = r4.c()     // Catch:{ RuntimeException -> 0x024b }
            r6 = 0
            if (r5 == 0) goto L_0x002a
            com.google.android.apps.gsa.gcm.a.g r5 = r5.b     // Catch:{ f -> 0x0065 }
            if (r5 != 0) goto L_0x0020
            com.google.android.apps.gsa.gcm.a.g r5 = com.google.android.apps.gsa.gcm.a.g.d     // Catch:{ f -> 0x0065 }
        L_0x0020:
            com.google.android.apps.gsa.gcm.a.g r7 = r4.a()     // Catch:{ f -> 0x0065 }
            boolean r5 = r5.equals(r7)     // Catch:{ f -> 0x0065 }
            if (r5 != 0) goto L_0x0073
        L_0x002a:
            com.google.android.apps.gsa.gcm.a.i r5 = r4.b()     // Catch:{ f -> 0x0065 }
            java.lang.String r7 = r5.c     // Catch:{ f -> 0x0065 }
            int r7 = r7.length()     // Catch:{ f -> 0x0065 }
            r8 = 70
            if (r7 >= r8) goto L_0x004c
            dagger.a r7 = r4.g     // Catch:{ f -> 0x0065 }
            java.lang.Object r7 = r7.mo27525b()     // Catch:{ f -> 0x0065 }
            com.google.android.apps.gsa.shared.logger.f r7 = (com.google.android.apps.gsa.shared.logger.C89911f) r7     // Catch:{ f -> 0x0065 }
            r8 = 35802468(0x2224d64, float:1.192409E-37)
            r9 = 29
            com.google.android.apps.gsa.shared.logger.e r7 = r7.mo83755a(r6, r8, r9)     // Catch:{ f -> 0x0065 }
            r7.mo83721a()     // Catch:{ f -> 0x0065 }
        L_0x004c:
            dagger.a r7 = r4.d     // Catch:{ f -> 0x0065 }
            java.lang.Object r7 = r7.mo27525b()     // Catch:{ f -> 0x0065 }
            com.google.android.apps.gsa.search.core.preferences.r r7 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r7     // Catch:{ f -> 0x0065 }
            com.google.android.apps.gsa.search.core.preferences.q r7 = r7.mo80076b()     // Catch:{ f -> 0x0065 }
            java.lang.String r8 = "gcm_device3"
            byte[] r5 = r5.toByteArray()     // Catch:{ f -> 0x0065 }
            r7.mo80068c(r8, r5)     // Catch:{ f -> 0x0065 }
            r7.apply()     // Catch:{ f -> 0x0065 }
            goto L_0x0073
        L_0x0065:
            r5 = move-exception
            com.google.common.f.e r7 = com.google.android.apps.gsa.gcm.a.e.a     // Catch:{ RuntimeException -> 0x024b }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r8 = "Failure to register with GCM"
            r9 = 2240(0x8c0, float:3.139E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r5)).mo56372aa(r9)).mo56386p(r8)     // Catch:{ RuntimeException -> 0x024b }
        L_0x0073:
            dagger.a r5 = r4.d     // Catch:{ RuntimeException -> 0x024b }
            java.lang.Object r5 = r5.mo27525b()     // Catch:{ RuntimeException -> 0x024b }
            com.google.android.apps.gsa.search.core.preferences.r r5 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r5     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r7 = r3.name     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r8 = r3.name     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r8 = r1.concat(r8)     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r7 = r0.concat(r7)     // Catch:{ RuntimeException -> 0x024b }
            byte[] r7 = r5.mo80079e(r7, r6)     // Catch:{ RuntimeException -> 0x024b }
            if (r7 != 0) goto L_0x0097
        L_0x0095:
            r5 = r6
            goto L_0x00c0
        L_0x0097:
            r9 = 0
            long r8 = r5.getLong(r8, r9)     // Catch:{ RuntimeException -> 0x024b }
            com.google.android.libraries.f.a r5 = r4.c     // Catch:{ RuntimeException -> 0x024b }
            long r10 = r5.mo26870b()     // Catch:{ RuntimeException -> 0x024b }
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x00a8
            goto L_0x0095
        L_0x00a8:
            com.google.android.apps.gsa.gcm.a.b r5 = com.google.android.apps.gsa.gcm.a.b.l     // Catch:{ ct -> 0x00b1 }
            com.google.protobuf.bv r5 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (byte[]) r7)     // Catch:{ ct -> 0x00b1 }
            com.google.android.apps.gsa.gcm.a.b r5 = (com.google.android.apps.gsa.gcm.a.b) r5     // Catch:{ ct -> 0x00b1 }
            goto L_0x00c0
        L_0x00b1:
            r5 = move-exception
            com.google.common.f.e r7 = com.google.android.apps.gsa.gcm.a.e.a     // Catch:{ RuntimeException -> 0x024b }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r8 = "Bad GCM registration state"
            r9 = 2237(0x8bd, float:3.135E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r5)).mo56372aa(r9)).mo56386p(r8)     // Catch:{ RuntimeException -> 0x024b }
            goto L_0x0095
        L_0x00c0:
            com.google.android.apps.gsa.gcm.a.i r7 = r4.c()     // Catch:{ RuntimeException -> 0x024b }
            r8 = 0
            r9 = 1
            if (r7 != 0) goto L_0x00cf
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a     // Catch:{ RuntimeException -> 0x024b }
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60856cj.m92900i(r4)     // Catch:{ RuntimeException -> 0x024b }
            goto L_0x010c
        L_0x00cf:
            com.google.android.apps.gsa.search.core.bo r10 = r4.e     // Catch:{ RuntimeException -> 0x024b }
            com.google.android.apps.gsa.search.core.bm[] r11 = new com.google.android.apps.gsa.search.core.C85662bm[r9]     // Catch:{ RuntimeException -> 0x024b }
            com.google.android.apps.gsa.search.core.bm r12 = com.google.android.apps.gsa.search.core.C85662bm.NOW_CARDS     // Catch:{ RuntimeException -> 0x024b }
            r11[r8] = r12     // Catch:{ RuntimeException -> 0x024b }
            com.google.android.apps.gsa.search.core.bl r10 = r10.mo79190b(r11)     // Catch:{ RuntimeException -> 0x024b }
            boolean r10 = r10.mo79180f()     // Catch:{ RuntimeException -> 0x024b }
            com.google.android.apps.gsa.sidekick.main.b.f r11 = r4.f     // Catch:{ RuntimeException -> 0x024b }
            com.google.common.util.concurrent.cx r11 = r11.mo85541e(r3)     // Catch:{ RuntimeException -> 0x024b }
            com.google.android.apps.gsa.gcm.a.c r12 = new com.google.android.apps.gsa.gcm.a.c     // Catch:{ RuntimeException -> 0x024b }
            r12.<init>()     // Catch:{ RuntimeException -> 0x024b }
            com.google.common.util.concurrent.bg r13 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ RuntimeException -> 0x024b }
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60922j.m93044g(r11, r12, r13)     // Catch:{ RuntimeException -> 0x024b }
            java.lang.Class<android.os.RemoteException> r12 = android.os.RemoteException.class
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)     // Catch:{ RuntimeException -> 0x024b }
            com.google.common.base.aj r14 = new com.google.common.base.aj     // Catch:{ RuntimeException -> 0x024b }
            r14.<init>(r13)     // Catch:{ RuntimeException -> 0x024b }
            com.google.common.util.concurrent.bg r13 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ RuntimeException -> 0x024b }
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60846c.m92878g(r11, r12, r14, r13)     // Catch:{ RuntimeException -> 0x024b }
            com.google.android.apps.gsa.gcm.a.d r12 = new com.google.android.apps.gsa.gcm.a.d     // Catch:{ RuntimeException -> 0x024b }
            r12.<init>(r4, r7, r3, r10)     // Catch:{ RuntimeException -> 0x024b }
            com.google.common.util.concurrent.bg r4 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ RuntimeException -> 0x024b }
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60922j.m93044g(r11, r12, r4)     // Catch:{ RuntimeException -> 0x024b }
        L_0x010c:
            java.lang.Object r4 = com.google.common.util.concurrent.C60856cj.m92910s(r4)     // Catch:{ RuntimeException -> 0x024b }
            com.google.common.base.ax r4 = (com.google.common.base.C58833ax) r4     // Catch:{ RuntimeException -> 0x024b }
            if (r5 == 0) goto L_0x011e
            java.lang.Object r7 = r4.mo56111f()     // Catch:{ RuntimeException -> 0x024b }
            boolean r5 = r5.equals(r7)     // Catch:{ RuntimeException -> 0x024b }
            if (r5 != 0) goto L_0x0125
        L_0x011e:
            java.lang.Object r4 = r4.mo56111f()     // Catch:{ RuntimeException -> 0x024b }
            r6 = r4
            com.google.android.apps.gsa.gcm.a.b r6 = (com.google.android.apps.gsa.gcm.a.b) r6     // Catch:{ RuntimeException -> 0x024b }
        L_0x0125:
            if (r6 == 0) goto L_0x0248
            com.google.ai.b.eo r4 = com.google.p375ai.p378b.C7642eo.GCM_REGISTRATION     // Catch:{ RuntimeException -> 0x024b }
            com.google.ai.b.qa r4 = com.google.android.apps.gsa.sidekick.shared.p7244m.C91763c.m150327a(r4)     // Catch:{ RuntimeException -> 0x024b }
            com.google.protobuf.bn r4 = r4.toBuilder()     // Catch:{ RuntimeException -> 0x024b }
            com.google.ai.b.pz r4 = (com.google.p375ai.p378b.C7950pz) r4     // Catch:{ RuntimeException -> 0x024b }
            com.google.ai.b.ok r5 = com.google.p375ai.p378b.C7908ok.f27786g     // Catch:{ RuntimeException -> 0x024b }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ RuntimeException -> 0x024b }
            com.google.ai.b.oj r5 = (com.google.p375ai.p378b.C7907oj) r5     // Catch:{ RuntimeException -> 0x024b }
            com.google.android.apps.gsa.gcm.a.i r7 = r6.h     // Catch:{ RuntimeException -> 0x024b }
            if (r7 != 0) goto L_0x0141
            com.google.android.apps.gsa.gcm.a.i r7 = com.google.android.apps.gsa.gcm.a.i.d     // Catch:{ RuntimeException -> 0x024b }
        L_0x0141:
            java.lang.String r7 = r7.c     // Catch:{ RuntimeException -> 0x024b }
            r5.copyOnWrite()     // Catch:{ RuntimeException -> 0x024b }
            com.google.protobuf.bv r10 = r5.instance     // Catch:{ RuntimeException -> 0x024b }
            com.google.ai.b.ok r10 = (com.google.p375ai.p378b.C7908ok) r10     // Catch:{ RuntimeException -> 0x024b }
            r7.getClass()     // Catch:{ RuntimeException -> 0x024b }
            int r11 = r10.f27788a     // Catch:{ RuntimeException -> 0x024b }
            r11 = r11 | r9
            r10.f27788a = r11     // Catch:{ RuntimeException -> 0x024b }
            r10.f27789b = r7     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r7 = com.google.android.apps.gsa.sidekick.main.p7201d.C91284a.m149219a(r3)     // Catch:{ RuntimeException -> 0x024b }
            r5.copyOnWrite()     // Catch:{ RuntimeException -> 0x024b }
            com.google.protobuf.bv r10 = r5.instance     // Catch:{ RuntimeException -> 0x024b }
            com.google.ai.b.ok r10 = (com.google.p375ai.p378b.C7908ok) r10     // Catch:{ RuntimeException -> 0x024b }
            r7.getClass()     // Catch:{ RuntimeException -> 0x024b }
            int r11 = r10.f27788a     // Catch:{ RuntimeException -> 0x024b }
            r11 = r11 | 4
            r10.f27788a = r11     // Catch:{ RuntimeException -> 0x024b }
            r10.f27791d = r7     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r7 = android.os.Build.MODEL     // Catch:{ RuntimeException -> 0x024b }
            r5.copyOnWrite()     // Catch:{ RuntimeException -> 0x024b }
            com.google.protobuf.bv r10 = r5.instance     // Catch:{ RuntimeException -> 0x024b }
            com.google.ai.b.ok r10 = (com.google.p375ai.p378b.C7908ok) r10     // Catch:{ RuntimeException -> 0x024b }
            r7.getClass()     // Catch:{ RuntimeException -> 0x024b }
            int r11 = r10.f27788a     // Catch:{ RuntimeException -> 0x024b }
            r11 = r11 | 16
            r10.f27788a = r11     // Catch:{ RuntimeException -> 0x024b }
            r10.f27793f = r7     // Catch:{ RuntimeException -> 0x024b }
            r5.copyOnWrite()     // Catch:{ RuntimeException -> 0x024b }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ RuntimeException -> 0x024b }
            com.google.ai.b.ok r7 = (com.google.p375ai.p378b.C7908ok) r7     // Catch:{ RuntimeException -> 0x024b }
            r7.f27792e = r9     // Catch:{ RuntimeException -> 0x024b }
            int r9 = r7.f27788a     // Catch:{ RuntimeException -> 0x024b }
            r9 = r9 | 8
            r7.f27788a = r9     // Catch:{ RuntimeException -> 0x024b }
            r5.copyOnWrite()     // Catch:{ RuntimeException -> 0x024b }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ RuntimeException -> 0x024b }
            com.google.ai.b.ok r7 = (com.google.p375ai.p378b.C7908ok) r7     // Catch:{ RuntimeException -> 0x024b }
            int r9 = r7.f27788a     // Catch:{ RuntimeException -> 0x024b }
            r9 = r9 | 2
            r7.f27788a = r9     // Catch:{ RuntimeException -> 0x024b }
            r7.f27790c = r8     // Catch:{ RuntimeException -> 0x024b }
            r4.copyOnWrite()     // Catch:{ RuntimeException -> 0x024b }
            com.google.protobuf.bv r7 = r4.instance     // Catch:{ RuntimeException -> 0x024b }
            com.google.ai.b.qa r7 = (com.google.p375ai.p378b.C7952qa) r7     // Catch:{ RuntimeException -> 0x024b }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ RuntimeException -> 0x024b }
            com.google.ai.b.ok r5 = (com.google.p375ai.p378b.C7908ok) r5     // Catch:{ RuntimeException -> 0x024b }
            r5.getClass()     // Catch:{ RuntimeException -> 0x024b }
            r7.f27932m = r5     // Catch:{ RuntimeException -> 0x024b }
            int r5 = r7.f27920a     // Catch:{ RuntimeException -> 0x024b }
            r8 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 | r8
            r7.f27920a = r5     // Catch:{ RuntimeException -> 0x024b }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ RuntimeException -> 0x024b }
            com.google.ai.b.qa r4 = (com.google.p375ai.p378b.C7952qa) r4     // Catch:{ RuntimeException -> 0x024b }
            com.google.android.apps.gsa.sidekick.main.f.f r5 = r15.f235583d     // Catch:{ RuntimeException -> 0x024b }
            com.google.android.apps.gsa.sidekick.main.f.g r7 = com.google.android.apps.gsa.sidekick.main.p7203f.C91378h.m149422f()     // Catch:{ RuntimeException -> 0x024b }
            r8 = r7
            com.google.android.apps.gsa.sidekick.main.f.a r8 = (com.google.android.apps.gsa.sidekick.main.p7203f.C91371a) r8     // Catch:{ RuntimeException -> 0x024b }
            r8.f254932a = r3     // Catch:{ RuntimeException -> 0x024b }
            com.google.android.apps.gsa.sidekick.main.f.h r3 = r7.mo85669a()     // Catch:{ RuntimeException -> 0x024b }
            com.google.android.apps.gsa.sidekick.main.f.e r3 = r5.mo85696a(r4, r3)     // Catch:{ RuntimeException -> 0x024b }
            com.google.ai.b.ql r3 = r3.f254946a     // Catch:{ RuntimeException -> 0x024b }
            if (r3 != 0) goto L_0x01ee
            com.google.common.f.e r0 = f235580a     // Catch:{ RuntimeException -> 0x024b }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ RuntimeException -> 0x024b }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x024b }
            r0.mo56378ag(r1, r2)     // Catch:{ RuntimeException -> 0x024b }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ RuntimeException -> 0x024b }
            r1 = 9344(0x2480, float:1.3094E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ RuntimeException -> 0x024b }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r1 = "Network error while trying to register for GCM updates"
            r0.mo56386p(r1)     // Catch:{ RuntimeException -> 0x024b }
            return
        L_0x01ee:
            com.google.android.apps.gsa.gcm.a.e r3 = r15.f235581b     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r4 = "gcm_device2"
            java.lang.String r5 = r6.b     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r7 = "gcm_account2:state:"
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r7 = r7.concat(r8)     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r8 = "gcm_account2:expires:"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r5 = r8.concat(r5)     // Catch:{ RuntimeException -> 0x024b }
            com.google.android.libraries.f.a r8 = r3.c     // Catch:{ RuntimeException -> 0x024b }
            long r8 = r8.mo26870b()     // Catch:{ RuntimeException -> 0x024b }
            long r10 = com.google.android.apps.gsa.gcm.a.e.b     // Catch:{ RuntimeException -> 0x024b }
            long r8 = r8 + r10
            dagger.a r3 = r3.d     // Catch:{ RuntimeException -> 0x024b }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ RuntimeException -> 0x024b }
            com.google.android.apps.gsa.search.core.preferences.r r3 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r3     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r10 = r6.b     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r11 = java.lang.String.valueOf(r10)     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r0 = r0.concat(r11)     // Catch:{ RuntimeException -> 0x024b }
            com.google.android.apps.gsa.search.core.preferences.q r3 = r3.mo80076b()     // Catch:{ RuntimeException -> 0x024b }
            byte[] r6 = r6.toByteArray()     // Catch:{ RuntimeException -> 0x024b }
            r3.mo80068c(r0, r6)     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ RuntimeException -> 0x024b }
            java.lang.String r0 = r1.concat(r0)     // Catch:{ RuntimeException -> 0x024b }
            r3.mo80072g(r0, r8)     // Catch:{ RuntimeException -> 0x024b }
            r3.mo80075j(r4)     // Catch:{ RuntimeException -> 0x024b }
            r3.mo80075j(r7)     // Catch:{ RuntimeException -> 0x024b }
            r3.mo80075j(r5)     // Catch:{ RuntimeException -> 0x024b }
            r3.apply()     // Catch:{ RuntimeException -> 0x024b }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x024b }
            return
        L_0x0248:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x024b }
            return
        L_0x024b:
            r0 = move-exception
            com.google.common.f.e r1 = f235580a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            java.lang.String r2 = "Exception while running GCM registration update"
            r3 = 9342(0x247e, float:1.3091E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.tasks.now.NowUpdateGcmRegistrationTask.run():void");
    }
}
