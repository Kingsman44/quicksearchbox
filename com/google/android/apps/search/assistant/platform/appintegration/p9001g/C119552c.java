package com.google.android.apps.search.assistant.platform.appintegration.p9001g;

import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.g.c */
/* compiled from: PG */
public final /* synthetic */ class C119552c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C119554e f333193a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f333194b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f333195c;

    public /* synthetic */ C119552c(C119554e eVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f333193a = eVar;
        this.f333194b = cxVar;
        this.f333195c = cxVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r7 = this;
            com.google.android.apps.search.assistant.platform.appintegration.g.e r0 = r7.f333193a
            com.google.common.util.concurrent.cx r1 = r7.f333194b
            com.google.common.util.concurrent.cx r2 = r7.f333195c
            com.google.android.apps.search.assistant.platform.appintegration.grpc.t r3 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119638t.f333402e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.search.assistant.platform.appintegration.grpc.r r3 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119636r) r3
            java.lang.Object r1 = com.google.common.util.concurrent.C60856cj.m92909r(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.search.assistant.platform.appintegration.grpc.t r4 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119638t) r4
            int r5 = r4.f333404a
            r6 = 2
            r5 = r5 | r6
            r4.f333404a = r5
            r4.f333406c = r1
            java.lang.Object r1 = com.google.common.util.concurrent.C60856cj.m92909r(r2)
            com.google.android.libraries.search.assistant.m.b r1 = (com.google.android.libraries.search.assistant.p2704m.C34807b) r1
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.android.apps.search.assistant.platform.appintegration.grpc.t r2 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119638t) r2
            int r1 = r1.f92345g
            r2.f333407d = r1
            int r1 = r2.f333404a
            r1 = r1 | 4
            r2.f333404a = r1
            java.lang.String r1 = r0.f333199b
            int r2 = r1.hashCode()
            r4 = -1958346218(0xffffffff8b460216, float:-3.8134982E-32)
            r5 = 1
            if (r2 == r4) goto L_0x005a
            r4 = -305258803(0xffffffffedce1ecd, float:-7.9738935E27)
            if (r2 == r4) goto L_0x0050
            goto L_0x0064
        L_0x0050:
            java.lang.String r2 = "com.google.android.apps.search.assistant.platform.appintegration.devapp"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0064
            r1 = 0
            goto L_0x0065
        L_0x005a:
            java.lang.String r2 = "com.google.android.googlequicksearchbox"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0064
            r1 = 1
            goto L_0x0065
        L_0x0064:
            r1 = -1
        L_0x0065:
            if (r1 == 0) goto L_0x00ad
            if (r1 == r5) goto L_0x0090
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.appintegration.p9001g.C119554e.f333198a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 34527(0x86df, float:4.8383E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            java.lang.String r2 = "Mosaic is eligible in package: %s"
            java.lang.String r4 = r0.f333199b
            r1.mo56389s(r2, r4)
            r3.copyOnWrite()
            com.google.protobuf.bv r1 = r3.instance
            com.google.android.apps.search.assistant.platform.appintegration.grpc.t r1 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119638t) r1
            r1.f333405b = r5
            int r2 = r1.f333404a
            r2 = r2 | r5
            r1.f333404a = r2
            goto L_0x00ca
        L_0x0090:
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.appintegration.p9001g.C119554e.f333198a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "Mosaic is eligible in AGSA"
            r4 = 34529(0x86e1, float:4.8385E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56386p(r2)
            r3.copyOnWrite()
            com.google.protobuf.bv r1 = r3.instance
            com.google.android.apps.search.assistant.platform.appintegration.grpc.t r1 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119638t) r1
            r1.f333405b = r6
            int r2 = r1.f333404a
            r2 = r2 | r5
            r1.f333404a = r2
            goto L_0x00ca
        L_0x00ad:
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.appintegration.p9001g.C119554e.f333198a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "Mosaic is eligible in devapp"
            r4 = 34528(0x86e0, float:4.8384E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56386p(r2)
            r3.copyOnWrite()
            com.google.protobuf.bv r1 = r3.instance
            com.google.android.apps.search.assistant.platform.appintegration.grpc.t r1 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119638t) r1
            r2 = 3
            r1.f333405b = r2
            int r2 = r1.f333404a
            r2 = r2 | r5
            r1.f333404a = r2
        L_0x00ca:
            com.google.android.apps.search.assistant.platform.appintegration.g.ac r0 = r0.f333200c
            com.google.protobuf.bv r1 = r3.build()
            com.google.android.apps.search.assistant.platform.appintegration.grpc.t r1 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119638t) r1
            io.grpc.i.aj r0 = r0.f333189a
            com.google.android.apps.search.assistant.platform.appintegration.grpc.i r2 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119627i.f333384i
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.search.assistant.platform.appintegration.grpc.f r2 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119624f) r2
            com.google.android.apps.search.assistant.platform.appintegration.grpc.au r3 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119601au.f333338d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.search.assistant.platform.appintegration.grpc.at r3 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119600at) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.search.assistant.platform.appintegration.grpc.au r4 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119601au) r4
            r1.getClass()
            r4.f333341b = r1
            int r1 = r4.f333340a
            r1 = r1 | r5
            r4.f333340a = r1
            com.google.protobuf.bv r1 = r3.build()
            com.google.android.apps.search.assistant.platform.appintegration.grpc.au r1 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119601au) r1
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.search.assistant.platform.appintegration.grpc.i r3 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119627i) r3
            r1.getClass()
            r3.f333393h = r1
            int r1 = r3.f333386a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r3.f333386a = r1
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.apps.search.assistant.platform.appintegration.grpc.i r1 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119627i) r1
            r0.mo20123c(r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.appintegration.p9001g.C119552c.call():java.lang.Object");
    }
}
