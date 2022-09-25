package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p851j;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12865i;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.ScheduledExecutorService;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.j.b */
/* compiled from: PG */
public final class C12787b extends C22538o {

    /* renamed from: b */
    private static final C59071e f39961b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.j.b");

    /* renamed from: a */
    public final C69464a f39962a;

    /* renamed from: c */
    private final C12865i f39963c;

    /* renamed from: d */
    private final ScheduledExecutorService f39964d;

    /* renamed from: e */
    private final C69464a f39965e;

    public C12787b(C12865i iVar, ScheduledExecutorService scheduledExecutorService, C69464a aVar, C69464a aVar2) {
        this.f39963c = iVar;
        this.f39964d = scheduledExecutorService;
        this.f39965e = aVar;
        this.f39962a = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20765a(com.google.assistant.p3897e.p3921j.C51809dy r6, com.google.android.libraries.gsa.conversation.clientop.C22434e r7) {
        /*
            r5 = this;
            java.lang.String r7 = r6.f135936b
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.f r7 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16756f.f49030c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.e r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16755e) r7
            java.lang.String r0 = r6.f135936b
            int r1 = r0.hashCode()
            r2 = -8315748(0xffffffffff811c9c, float:NaN)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x0036
            r2 = 485415337(0x1ceed9a9, float:1.5805783E-21)
            if (r1 == r2) goto L_0x002c
            r2 = 1182117200(0x4675ad50, float:15723.328)
            if (r1 == r2) goto L_0x0022
            goto L_0x0040
        L_0x0022:
            java.lang.String r1 = "provider.BIND_APP_ACTIONS_SERVICE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 0
            goto L_0x0041
        L_0x002c:
            java.lang.String r1 = "provider.UNBIND_APP_ACTIONS_SERVICE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 2
            goto L_0x0041
        L_0x0036:
            java.lang.String r1 = "provider.UPDATE_APP_ACTIONS_SERVICE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            java.lang.String r1 = "ClientOp cannot be parsed. clientOp = %s"
            if (r0 == 0) goto L_0x00d9
            if (r0 == r4) goto L_0x00a0
            if (r0 == r3) goto L_0x0066
            com.google.common.f.e r7 = f39961b
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            r0 = 44456(0xada8, float:6.2296E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r0)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            java.lang.String r6 = r6.f135936b
            r7.mo56389s(r1, r6)
            com.google.assistant.e.j.ec r6 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a.f39966a
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            return r6
        L_0x0066:
            com.google.assistant.e.j.aeg r0 = com.google.assistant.p3897e.p3921j.aeg.f134932a
            com.google.protobuf.eb r0 = r0.getParserForType()
            java.lang.String r2 = "provider_unbind_app_actions_service_args"
            com.google.protobuf.MessageLite r0 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16687c.m33753a(r6, r2, r0)
            com.google.assistant.e.j.aeg r0 = (com.google.assistant.p3897e.p3921j.aeg) r0
            if (r0 != 0) goto L_0x0093
            com.google.common.f.e r7 = f39961b
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            r0 = 44459(0xadab, float:6.23E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r0)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            java.lang.String r6 = r6.f135936b
            r7.mo56389s(r1, r6)
            com.google.assistant.e.j.ec r6 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a.f39966a
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            return r6
        L_0x0093:
            r7.copyOnWrite()
            com.google.protobuf.bv r6 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.f r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16756f) r6
            r6.f49033b = r0
            r0 = 3
            r6.f49032a = r0
            goto L_0x0111
        L_0x00a0:
            com.google.assistant.e.j.aei r0 = com.google.assistant.p3897e.p3921j.aei.f134934a
            com.google.protobuf.eb r0 = r0.getParserForType()
            java.lang.String r2 = "provider_update_app_actions_service_args"
            com.google.protobuf.MessageLite r0 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16687c.m33753a(r6, r2, r0)
            com.google.assistant.e.j.aei r0 = (com.google.assistant.p3897e.p3921j.aei) r0
            if (r0 != 0) goto L_0x00cd
            com.google.common.f.e r7 = f39961b
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            r0 = 44458(0xadaa, float:6.2299E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r0)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            java.lang.String r6 = r6.f135936b
            r7.mo56389s(r1, r6)
            com.google.assistant.e.j.ec r6 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a.f39966a
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            return r6
        L_0x00cd:
            r7.copyOnWrite()
            com.google.protobuf.bv r6 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.f r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16756f) r6
            r6.f49033b = r0
            r6.f49032a = r3
            goto L_0x0111
        L_0x00d9:
            com.google.assistant.e.j.ady r0 = com.google.assistant.p3897e.p3921j.ady.f134912f
            com.google.protobuf.eb r0 = r0.getParserForType()
            java.lang.String r2 = "provider_bind_app_actions_service_args"
            com.google.protobuf.MessageLite r0 = com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16687c.m33753a(r6, r2, r0)
            com.google.assistant.e.j.ady r0 = (com.google.assistant.p3897e.p3921j.ady) r0
            if (r0 != 0) goto L_0x0106
            com.google.common.f.e r7 = f39961b
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            r0 = 44457(0xada9, float:6.2298E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r0)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            java.lang.String r6 = r6.f135936b
            r7.mo56389s(r1, r6)
            com.google.assistant.e.j.ec r6 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a.f39966a
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            return r6
        L_0x0106:
            r7.copyOnWrite()
            com.google.protobuf.bv r6 = r7.instance
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.f r6 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16756f) r6
            r6.f49033b = r0
            r6.f49032a = r4
        L_0x0111:
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.i r6 = r5.f39963c
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.f r7 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16756f) r7
            r6.mo20748a(r7)
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.j.a r6 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.j.a
            r6.<init>(r5)
            g.a.a r7 = r5.f39965e
            java.lang.Object r7 = r7.mo17428b()
            java.lang.Long r7 = (java.lang.Long) r7
            long r0 = r7.longValue()
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledExecutorService r2 = r5.f39964d
            com.google.common.util.concurrent.r r6 = com.google.apps.tiktok.tracing.C47810es.m84965e(r6)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92902k(r6, r0, r7, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p851j.C12787b.mo20765a(com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }
}
