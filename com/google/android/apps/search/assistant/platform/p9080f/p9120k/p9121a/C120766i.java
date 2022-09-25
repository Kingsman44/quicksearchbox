package com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.opahandover.impl.OpaHandoverControllerImpl$isEnabledInternal$1", mo61344c = "OpaHandoverControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {188, 188})
/* renamed from: com.google.android.apps.search.assistant.platform.f.k.a.i */
/* compiled from: PG */
final class C120766i extends C69572j implements C69630p {

    /* renamed from: a */
    int f335877a;

    /* renamed from: b */
    final /* synthetic */ C120777t f335878b;

    /* renamed from: c */
    private /* synthetic */ Object f335879c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120766i(C120777t tVar, C69577g gVar) {
        super(2, gVar);
        this.f335878b = tVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120766i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ec  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r9.f335877a
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0019
            if (r1 == r3) goto L_0x0010
            p5462h.C69714l.m101134b(r10)
            goto L_0x00c3
        L_0x0010:
            java.lang.Object r1 = r9.f335879c
            kotlinx.coroutines.be r1 = (kotlinx.coroutines.C71604be) r1
            p5462h.C69714l.m101134b(r10)
            goto L_0x00aa
        L_0x0019:
            p5462h.C69714l.m101134b(r10)
            java.lang.Object r10 = r9.f335879c
            kotlinx.coroutines.aw r10 = (kotlinx.coroutines.C71422aw) r10
            com.google.android.apps.search.assistant.platform.f.k.a.t r1 = r9.f335878b
            com.google.android.apps.search.assistant.platform.b.d.a r1 = r1.f335900d
            com.google.common.b.gu r1 = r1.mo104605c()
            java.lang.String r5 = "clientExecutionProxy.supportedClientOps()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r5)
            boolean r5 = r1 instanceof java.util.Collection
            if (r5 == 0) goto L_0x0037
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L_0x00fb
        L_0x0037:
            java.util.Iterator r1 = r1.iterator()
        L_0x003b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00fb
            java.lang.Object r5 = r1.next()
            com.google.assistant.e.j.da r5 = (com.google.assistant.p3897e.p3921j.C51785da) r5
            java.lang.String r5 = r5.f135878b
            java.lang.String r6 = "apa.HANDOVER_TO_OPA"
            boolean r5 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            r5 = r5 ^ r3
            if (r5 != 0) goto L_0x003b
            com.google.android.apps.search.assistant.platform.f.k.a.t r1 = r9.f335878b
            com.google.android.apps.search.assistant.platform.f.k.a.b r1 = r1.f335903g
            com.google.android.libraries.search.b.i.g r5 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96845aP
            java.lang.String r6 = "ASSISTANT_HANDOVER_ENABLED_BY_CLIENT"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r1.mo104920a(r5)
            com.google.android.apps.search.assistant.platform.f.k.a.t r1 = r9.f335878b
            com.google.android.apps.search.assistant.platform.h.c.a r1 = r1.f335901e
            com.google.common.util.concurrent.cx r1 = r1.mo104231a()
            java.lang.String r5 = "assistantEligibilityChecker.isAssistantEligible"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r5)
            com.google.android.apps.search.assistant.platform.f.k.a.e r5 = new com.google.android.apps.search.assistant.platform.f.k.a.e
            r5.<init>(r1, r4)
            r6 = 3
            kotlinx.coroutines.be r5 = kotlinx.coroutines.C71803m.m105042c(r10, r4, r4, r5, r6)
            com.google.android.apps.search.assistant.platform.f.k.a.f r7 = new com.google.android.apps.search.assistant.platform.f.k.a.f
            r7.<init>(r1)
            r5.mo62873s(r7)
            com.google.android.apps.search.assistant.platform.f.k.a.t r1 = r9.f335878b
            com.google.android.apps.search.assistant.platform.h.c.a r1 = r1.f335901e
            com.google.common.util.concurrent.cx r1 = r1.mo104232b()
            java.lang.String r7 = "assistantEligibilityChecker.isAssistantEnabled"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r7)
            com.google.android.apps.search.assistant.platform.f.k.a.g r7 = new com.google.android.apps.search.assistant.platform.f.k.a.g
            r7.<init>(r1, r4)
            kotlinx.coroutines.be r10 = kotlinx.coroutines.C71803m.m105042c(r10, r4, r4, r7, r6)
            com.google.android.apps.search.assistant.platform.f.k.a.h r6 = new com.google.android.apps.search.assistant.platform.f.k.a.h
            r6.<init>(r1)
            r10.mo62873s(r6)
            r9.f335879c = r10
            r9.f335877a = r3
            java.lang.Object r1 = r5.mo62825a(r9)
            if (r1 == r0) goto L_0x00fa
            r8 = r1
            r1 = r10
            r10 = r8
        L_0x00aa:
            java.lang.String r5 = "isAssistantEligible.await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r5)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00d1
            r9.f335879c = r4
            r10 = 2
            r9.f335877a = r10
            java.lang.Object r10 = r1.mo62825a(r9)
            if (r10 != r0) goto L_0x00c3
            return r0
        L_0x00c3:
            java.lang.String r0 = "isAssistantEnabled.await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00d1
            r2 = 1
        L_0x00d1:
            com.google.android.apps.search.assistant.platform.f.k.a.t r10 = r9.f335878b
            com.google.android.apps.search.assistant.platform.f.k.a.b r10 = r10.f335903g
            if (r2 == 0) goto L_0x00da
            com.google.net.a.a.b r0 = com.google.net.p4726a.p4727a.C62722b.OK
            goto L_0x00dc
        L_0x00da:
            com.google.net.a.a.b r0 = com.google.net.p4726a.p4727a.C62722b.UNAVAILABLE
        L_0x00dc:
            java.lang.String r1 = "code"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r1)
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96963cb
            com.google.android.libraries.search.b.i.a r0 = r1.mo40815i(r0)
            r10.mo104920a(r0)
            if (r2 != 0) goto L_0x00f5
            com.google.android.apps.search.assistant.platform.f.k.a.t r10 = r9.f335878b
            com.google.android.apps.search.assistant.platform.f.k.a.b r10 = r10.f335903g
            com.google.net.a.a.b r0 = com.google.net.p4726a.p4727a.C62722b.UNAVAILABLE
            r10.mo104922c(r0)
        L_0x00f5:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            return r10
        L_0x00fa:
            return r0
        L_0x00fb:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a.C120766i.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120766i iVar = new C120766i(this.f335878b, gVar);
        iVar.f335879c = obj;
        return iVar;
    }
}
