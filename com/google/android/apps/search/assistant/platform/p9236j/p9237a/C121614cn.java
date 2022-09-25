package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import android.app.DirectAction;
import android.os.Bundle;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.InternalDirectActionsBackendImpl$performDirectAction$1", mo61344c = "InternalDirectActionsBackendImpl.kt", mo61345d = "invokeSuspend", mo61346e = {245, 253})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.cn */
/* compiled from: PG */
final class C121614cn extends C69572j implements C69630p {

    /* renamed from: a */
    Object f337432a;

    /* renamed from: b */
    int f337433b;

    /* renamed from: c */
    final /* synthetic */ C121616cp f337434c;

    /* renamed from: d */
    final /* synthetic */ DirectAction f337435d;

    /* renamed from: e */
    final /* synthetic */ Bundle f337436e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121614cn(C121616cp cpVar, DirectAction directAction, Bundle bundle, C69577g gVar) {
        super(2, gVar);
        this.f337434c = cpVar;
        this.f337435d = directAction;
        this.f337436e = bundle;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121614cn) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r13 != r0) goto L_0x0023;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r13) {
        /*
            r12 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r12.f337433b
            java.lang.String r2 = "INV.IntDirectActionsBack"
            r3 = 1
            if (r1 == 0) goto L_0x0016
            if (r1 == r3) goto L_0x0012
            java.lang.Object r0 = r12.f337432a
            p5462h.C69714l.m101134b(r13)
            goto L_0x00a7
        L_0x0012:
            p5462h.C69714l.m101134b(r13)
            goto L_0x0023
        L_0x0016:
            p5462h.C69714l.m101134b(r13)
            com.google.android.apps.search.assistant.platform.j.a.cp r13 = r12.f337434c
            r12.f337433b = r3
            java.lang.Object r13 = r13.mo105270h(r12)
            if (r13 == r0) goto L_0x00cd
        L_0x0023:
            java.lang.String r13 = (java.lang.String) r13
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121616cp.f337444a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r4, r2)
            android.app.DirectAction r4 = r12.f337435d
            java.lang.String r4 = com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121616cp.m200931i(r4)
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 35901(0x8c3d, float:5.0308E-41)
            r5.<init>(r6)
            r1.mo56379ah(r5)
            java.lang.String r5 = "DirectActions#performDirectActions activityId=%s action=%s"
            r1.mo56354G(r5, r13, r4)
            com.google.android.apps.search.assistant.platform.j.a.cp r1 = r12.f337434c
            com.google.android.apps.search.assistant.platform.j.a.y r4 = r1.f337453j
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.b r5 = r1.mo105269g()
            android.app.DirectAction r6 = r12.f337435d
            android.os.Bundle r7 = r12.f337436e
            r12.f337432a = r13
            r1 = 2
            r12.f337433b = r1
            kotlinx.coroutines.r r1 = new kotlinx.coroutines.r
            h.c.g r8 = p5462h.p5466c.p5467a.C69555b.m100961b(r12)
            r1.<init>(r8, r3)
            r1.mo63041A()
            android.os.CancellationSignal r8 = new android.os.CancellationSignal
            r8.<init>()
            com.google.android.apps.search.assistant.platform.j.a.u r3 = new com.google.android.apps.search.assistant.platform.j.a.u
            r3.<init>(r8)
            r1.mo63035f(r3)
            com.google.common.f.e r3 = com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121668y.f337553a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r10 = "INV.DirectActAdapter"
            r3.mo56378ag(r9, r10)
            java.lang.String r9 = r6.getId()
            com.google.common.f.n r10 = new com.google.common.f.n
            r11 = 35888(0x8c30, float:5.029E-41)
            r10.<init>(r11)
            r3.mo56379ah(r10)
            java.lang.String r10 = "DirectActionsAdapter#performDirectAction action=%s"
            r3.mo56389s(r10, r9)
            java.util.concurrent.Executor r9 = r4.f337554b
            com.google.android.apps.search.assistant.platform.j.a.v r10 = new com.google.android.apps.search.assistant.platform.j.a.v
            r10.<init>(r1)
            r5.mo38925h(r6, r7, r8, r9, r10)
            java.lang.Object r1 = r1.mo63043n()
            if (r1 == r0) goto L_0x00cd
            r0 = r13
            r13 = r1
        L_0x00a7:
            android.os.Bundle r13 = (android.os.Bundle) r13
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121616cp.f337444a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            android.app.DirectAction r2 = r12.f337435d
            java.lang.String r2 = com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121616cp.m200931i(r2)
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 35902(0x8c3e, float:5.031E-41)
            r3.<init>(r4)
            r1.mo56379ah(r3)
            java.lang.String r3 = "DirectActions#performDirectActions result received activityId=%s action=%s"
            r1.mo56354G(r3, r0, r2)
            return r13
        L_0x00cd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121614cn.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121614cn(this.f337434c, this.f337435d, this.f337436e, gVar);
    }
}
