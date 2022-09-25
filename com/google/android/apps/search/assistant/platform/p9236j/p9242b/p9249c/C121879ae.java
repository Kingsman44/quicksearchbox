package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.os.Bundle;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Optional;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.vis.ApaVoiceInteractionHandler$onForegroundActivityAssistStateReceived$future$1", mo61344c = "ApaVoiceInteractionHandler.kt", mo61345d = "invokeSuspend", mo61346e = {649})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.ae */
/* compiled from: PG */
final class C121879ae extends C69572j implements C69630p {

    /* renamed from: a */
    Object f338178a;

    /* renamed from: b */
    Object f338179b;

    /* renamed from: c */
    Object f338180c;

    /* renamed from: d */
    Object f338181d;

    /* renamed from: e */
    Object f338182e;

    /* renamed from: f */
    Object f338183f;

    /* renamed from: g */
    int f338184g;

    /* renamed from: h */
    final /* synthetic */ C121892ar f338185h;

    /* renamed from: i */
    final /* synthetic */ AssistContent f338186i;

    /* renamed from: j */
    final /* synthetic */ Optional f338187j;

    /* renamed from: k */
    final /* synthetic */ Bundle f338188k;

    /* renamed from: l */
    final /* synthetic */ AssistStructure f338189l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121879ae(C121892ar arVar, AssistContent assistContent, Optional optional, Bundle bundle, AssistStructure assistStructure, C69577g gVar) {
        super(2, gVar);
        this.f338185h = arVar;
        this.f338186i = assistContent;
        this.f338187j = optional;
        this.f338188k = bundle;
        this.f338189l = assistStructure;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121879ae) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.google.android.apps.search.assistant.platform.j.b.c.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r15) {
        /*
            r14 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r14.f338184g
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.Object r0 = r14.f338183f
            java.lang.Object r1 = r14.f338182e
            java.lang.Object r4 = r14.f338181d
            java.lang.Object r5 = r14.f338180c
            java.lang.Object r6 = r14.f338179b
            java.lang.Object r7 = r14.f338178a
            p5462h.C69714l.m101134b(r15)
            goto L_0x003c
        L_0x0018:
            p5462h.C69714l.m101134b(r15)
            com.google.android.apps.search.assistant.platform.j.b.c.ar r5 = r14.f338185h
            kotlinx.coroutines.j.b r7 = r5.f338249b
            android.app.assist.AssistContent r6 = r14.f338186i
            j$.util.Optional r4 = r14.f338187j
            android.os.Bundle r1 = r14.f338188k
            android.app.assist.AssistStructure r15 = r14.f338189l
            r14.f338178a = r7
            r14.f338179b = r6
            r14.f338180c = r5
            r14.f338181d = r4
            r14.f338182e = r1
            r14.f338183f = r15
            r14.f338184g = r2
            java.lang.Object r8 = r7.mo63025b(r3, r14)
            if (r8 == r0) goto L_0x00b6
            r0 = r15
        L_0x003c:
            com.google.common.f.e r15 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar.f338248a     // Catch:{ all -> 0x00b1 }
            com.google.common.f.x r15 = r15.mo56224b()     // Catch:{ all -> 0x00b1 }
            com.google.common.f.c r15 = (com.google.common.p4526f.C59052c) r15     // Catch:{ all -> 0x00b1 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00b1 }
            java.lang.String r9 = "INV.ApaVIHandler"
            r15.mo56378ag(r8, r9)     // Catch:{ all -> 0x00b1 }
            java.lang.String r8 = "#assistStateReceived(foregroundApp=%s, activityIdHash=%s, session=%d)"
            if (r6 == 0) goto L_0x005a
            r9 = r6
            android.app.assist.AssistContent r9 = (android.app.assist.AssistContent) r9     // Catch:{ all -> 0x00b1 }
            r10 = r5
            com.google.android.apps.search.assistant.platform.j.b.c.ar r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r10     // Catch:{ all -> 0x00b1 }
            java.lang.String r9 = r10.mo105421x(r9)     // Catch:{ all -> 0x00b1 }
            goto L_0x005b
        L_0x005a:
            r9 = r3
        L_0x005b:
            r10 = r4
            j$.util.Optional r10 = (p3186j$.util.Optional) r10     // Catch:{ all -> 0x00b1 }
            java.lang.Object r10 = r10.orElse(r3)     // Catch:{ all -> 0x00b1 }
            r11 = r5
            com.google.android.apps.search.assistant.platform.j.b.c.ar r11 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r11     // Catch:{ all -> 0x00b1 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r11 = r11.f338250c     // Catch:{ all -> 0x00b1 }
            com.google.common.f.n r12 = new com.google.common.f.n     // Catch:{ all -> 0x00b1 }
            r13 = 35987(0x8c93, float:5.0429E-41)
            r12.<init>(r13)     // Catch:{ all -> 0x00b1 }
            r15.mo56379ah(r12)     // Catch:{ all -> 0x00b1 }
            r15.mo56359L(r8, r9, r10, r11)     // Catch:{ all -> 0x00b1 }
            com.google.android.apps.search.assistant.platform.j.b.c.ad r15 = new com.google.android.apps.search.assistant.platform.j.b.c.ad     // Catch:{ all -> 0x00b1 }
            r8 = r6
            android.app.assist.AssistContent r8 = (android.app.assist.AssistContent) r8     // Catch:{ all -> 0x00b1 }
            j$.util.Optional r4 = (p3186j$.util.Optional) r4     // Catch:{ all -> 0x00b1 }
            r9 = r1
            android.os.Bundle r9 = (android.os.Bundle) r9     // Catch:{ all -> 0x00b1 }
            r10 = r0
            android.app.assist.AssistStructure r10 = (android.app.assist.AssistStructure) r10     // Catch:{ all -> 0x00b1 }
            r15.<init>(r9, r10, r8, r4)     // Catch:{ all -> 0x00b1 }
            r4 = r5
            com.google.android.apps.search.assistant.platform.j.b.c.ar r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r4     // Catch:{ all -> 0x00b1 }
            r4.mo105411A(r15)     // Catch:{ all -> 0x00b1 }
            com.google.android.apps.search.assistant.platform.j.b.c.be r15 = new com.google.android.apps.search.assistant.platform.j.b.c.be     // Catch:{ all -> 0x00b1 }
            r4 = r5
            com.google.android.apps.search.assistant.platform.j.b.c.ar r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r4     // Catch:{ all -> 0x00b1 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d r4 = r4.f338250c     // Catch:{ all -> 0x00b1 }
            r8 = 0
            if (r1 == 0) goto L_0x0097
            r1 = 1
            goto L_0x0098
        L_0x0097:
            r1 = 0
        L_0x0098:
            if (r0 == 0) goto L_0x009c
            r0 = 1
            goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            if (r6 == 0) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r2 = 0
        L_0x00a1:
            r15.<init>(r4, r1, r0, r2)     // Catch:{ all -> 0x00b1 }
            com.google.android.apps.search.assistant.platform.j.b.c.ar r5 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121892ar) r5     // Catch:{ all -> 0x00b1 }
            com.google.android.apps.search.assistant.platform.j.b.c.au r0 = r5.f338251d     // Catch:{ all -> 0x00b1 }
            r0.mo105424a(r15)     // Catch:{ all -> 0x00b1 }
            r7.mo63026c(r3)
            h.q r15 = p5462h.C69788q.f186170a
            return r15
        L_0x00b1:
            r15 = move-exception
            r7.mo63026c(r3)
            throw r15
        L_0x00b6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C121879ae.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121879ae(this.f338185h, this.f338186i, this.f338187j, this.f338188k, this.f338189l, gVar);
    }
}
