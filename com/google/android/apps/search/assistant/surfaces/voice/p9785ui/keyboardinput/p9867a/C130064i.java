package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.completeserver.CompleteServerClientImpl$getHeaders$2", mo61344c = "CompleteServerClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {87, 88})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.i */
/* compiled from: PG */
final class C130064i extends C69572j implements C69630p {

    /* renamed from: a */
    Object f356655a;

    /* renamed from: b */
    Object f356656b;

    /* renamed from: c */
    Object f356657c;

    /* renamed from: d */
    int f356658d;

    /* renamed from: e */
    final /* synthetic */ C130065j f356659e;

    /* renamed from: f */
    private /* synthetic */ Object f356660f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C130064i(C130065j jVar, C69577g gVar) {
        super(2, gVar);
        this.f356659e = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C130064i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.util.Map} */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f356658d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0020
            if (r1 == r2) goto L_0x0012
            java.lang.Object r0 = r7.f356660f
            java.util.Map r0 = (java.util.Map) r0
            p5462h.C69714l.m101134b(r8)
            goto L_0x0077
        L_0x0012:
            java.lang.Object r1 = r7.f356657c
            java.lang.Object r2 = r7.f356656b
            java.lang.Object r4 = r7.f356655a
            java.lang.Object r5 = r7.f356660f
            kotlinx.coroutines.be r5 = (kotlinx.coroutines.C71604be) r5
            p5462h.C69714l.m101134b(r8)
            goto L_0x005d
        L_0x0020:
            p5462h.C69714l.m101134b(r8)
            java.lang.Object r8 = r7.f356660f
            kotlinx.coroutines.aw r8 = (kotlinx.coroutines.C71422aw) r8
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.h r1 = new com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.h
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.j r4 = r7.f356659e
            r1.<init>(r4, r3)
            r4 = 3
            kotlinx.coroutines.be r1 = kotlinx.coroutines.C71803m.m105042c(r8, r3, r3, r1, r4)
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.g r5 = new com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.g
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.j r6 = r7.f356659e
            r5.<init>(r6, r3)
            kotlinx.coroutines.be r5 = kotlinx.coroutines.C71803m.m105042c(r8, r3, r3, r5, r4)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.lang.String r4 = "User-Agent"
            com.google.frameworks.client.data.android.ad r4 = com.google.frameworks.client.data.android.C61362ad.m93870b(r4)
            r7.f356660f = r5
            r7.f356655a = r8
            r7.f356656b = r8
            r7.f356657c = r4
            r7.f356658d = r2
            java.lang.Object r1 = r1.mo62825a(r7)
            if (r1 == r0) goto L_0x0081
            r2 = r8
            r8 = r1
            r1 = r4
            r4 = r2
        L_0x005d:
            java.lang.String r6 = "userAgent.await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r6)
            r2.put(r1, r8)
            r7.f356660f = r4
            r7.f356655a = r3
            r7.f356656b = r3
            r7.f356657c = r3
            r8 = 2
            r7.f356658d = r8
            java.lang.Object r8 = r5.mo62825a(r7)
            if (r8 == r0) goto L_0x0081
            r0 = r4
        L_0x0077:
            j$.util.Optional r8 = (p3186j$.util.Optional) r8
            com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.f r1 = new com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.f
            r1.<init>(r0)
            r8.ifPresent(r1)
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130064i.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C130064i iVar = new C130064i(this.f356659e, gVar);
        iVar.f356660f = obj;
        return iVar;
    }
}
