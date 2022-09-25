package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.af */
/* compiled from: PG */
public final /* synthetic */ class C28823af implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78297a;

    /* renamed from: b */
    public final /* synthetic */ C29392ep f78298b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78299c;

    public /* synthetic */ C28823af(C29117fe feVar, C29392ep epVar, C29334dr drVar) {
        this.f78297a = feVar;
        this.f78298b = epVar;
        this.f78299c = drVar;
    }

    /* JADX WARNING: type inference failed for: r8v17, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r8) {
        /*
            r7 = this;
            com.google.android.libraries.mdi.download.d.fe r0 = r7.f78297a
            com.google.android.libraries.mdi.download.ep r1 = r7.f78298b
            com.google.android.libraries.mdi.download.dr r2 = r7.f78299c
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r3 = 0
            if (r8 == 0) goto L_0x0022
            java.lang.String r8 = "FileGroupManager"
            java.lang.String r0 = r1.f79682b
            java.lang.String r1 = "%s: Received duplicate config for group: %s"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53931c(r1, r8, r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            goto L_0x00be
        L_0x0022:
            boolean r8 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m.m54014j(r2)
            if (r8 == 0) goto L_0x007f
            com.google.common.i.o r8 = com.google.common.p4537i.C59294s.m92135e()
            com.google.common.i.p r8 = r8.mo56748e()
            java.lang.String r4 = r2.f79517s
            r8.mo56766j(r4)
            java.lang.String r4 = "|"
            r8.mo56766j(r4)
            java.lang.String r5 = r1.f79684d
            r8.mo56766j(r5)
            r8.mo56766j(r4)
            long r4 = r2.f79516r
            r8.mo56745f(r4)
            com.google.common.i.n r8 = r8.mo56758p()
            java.lang.String r8 = r8.toString()
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r2.f79501c
            r4[r3] = r5
            r5 = 1
            r4[r5] = r8
            java.lang.String r8 = "%s_%s"
            java.lang.String r8 = java.lang.String.format(r8, r4)
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.android.libraries.mdi.download.dq r2 = (com.google.android.libraries.mdi.download.C29333dq) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.libraries.mdi.download.dr r4 = (com.google.android.libraries.mdi.download.C29334dr) r4
            r8.getClass()
            int r5 = r4.f79499a
            r6 = 131072(0x20000, float:1.83671E-40)
            r5 = r5 | r6
            r4.f79499a = r5
            r4.f79520v = r8
            com.google.protobuf.bv r8 = r2.build()
            r2 = r8
            com.google.android.libraries.mdi.download.dr r2 = (com.google.android.libraries.mdi.download.C29334dr) r2
        L_0x007f:
            com.google.protobuf.bn r8 = r1.toBuilder()
            com.google.android.libraries.mdi.download.eo r8 = (com.google.android.libraries.mdi.download.C29391eo) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.android.libraries.mdi.download.ep r4 = (com.google.android.libraries.mdi.download.C29392ep) r4
            int r5 = r4.f79681a
            r5 = r5 | 8
            r4.f79681a = r5
            r4.f79685e = r3
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.libraries.mdi.download.ep r8 = (com.google.android.libraries.mdi.download.C29392ep) r8
            com.google.android.libraries.mdi.download.d.ff r3 = r0.f78975d
            com.google.common.util.concurrent.cx r8 = r3.mo34602g(r8)
            com.google.android.libraries.mdi.download.d.dt r3 = new com.google.android.libraries.mdi.download.d.dt
            r3.<init>(r0, r2)
            java.util.concurrent.Executor r2 = r0.f78980i
            com.google.common.util.concurrent.s r3 = com.google.apps.tiktok.tracing.C47810es.m84966f(r3)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60922j.m93045h(r8, r3, r2)
            com.google.android.libraries.mdi.download.d.dk r2 = new com.google.android.libraries.mdi.download.d.dk
            r2.<init>(r0, r1)
            java.util.concurrent.Executor r0 = r0.f78980i
            com.google.common.util.concurrent.s r1 = com.google.apps.tiktok.tracing.C47810es.m84966f(r2)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60922j.m93045h(r8, r1, r0)
        L_0x00be:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.mdi.download.p2236d.C28823af.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
