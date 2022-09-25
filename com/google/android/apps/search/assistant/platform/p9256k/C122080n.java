package com.google.android.apps.search.assistant.platform.p9256k;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126437f;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.voicesearch.VoiceSearchRouter$doVoiceQuery$1$1", mo61344c = "VoiceSearchRouter.kt", mo61345d = "invokeSuspend", mo61346e = {59, 63, 65})
/* renamed from: com.google.android.apps.search.assistant.platform.k.n */
/* compiled from: PG */
final class C122080n extends C69572j implements C69630p {

    /* renamed from: a */
    Object f338686a;

    /* renamed from: b */
    Object f338687b;

    /* renamed from: c */
    Object f338688c;

    /* renamed from: d */
    Object f338689d;

    /* renamed from: e */
    int f338690e;

    /* renamed from: f */
    final /* synthetic */ C71587n f338691f;

    /* renamed from: g */
    final /* synthetic */ C122082p f338692g;

    /* renamed from: h */
    final /* synthetic */ C126437f f338693h;

    /* renamed from: i */
    final /* synthetic */ C71588o f338694i;

    /* renamed from: j */
    private /* synthetic */ Object f338695j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122080n(C71587n nVar, C122082p pVar, C126437f fVar, C71588o oVar, C69577g gVar) {
        super(2, gVar);
        this.f338691f = nVar;
        this.f338692g = pVar;
        this.f338693h = fVar;
        this.f338694i = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C122080n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: com.google.android.libraries.assistant.o.br} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.google.android.libraries.assistant.o.aw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.util.Iterator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f6  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r11.f338690e
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0035
            if (r1 == r3) goto L_0x002d
            if (r1 == r2) goto L_0x0016
            java.lang.Object r0 = r11.f338695j
            kotlinx.coroutines.a.aq r0 = (kotlinx.coroutines.p5573a.C71363aq) r0
            p5462h.C69714l.m101134b(r12)
            goto L_0x00ef
        L_0x0016:
            java.lang.Object r1 = r11.f338689d
            java.lang.Object r3 = r11.f338688c
            java.lang.Object r5 = r11.f338687b
            java.lang.Object r6 = r11.f338686a
            java.lang.Object r7 = r11.f338695j
            kotlinx.coroutines.a.aq r7 = (kotlinx.coroutines.p5573a.C71363aq) r7
            p5462h.C69714l.m101134b(r12)
            r8 = r6
            r6 = r5
            r5 = r3
            r3 = r1
            r1 = r0
            r0 = r11
            goto L_0x00ab
        L_0x002d:
            java.lang.Object r1 = r11.f338695j
            kotlinx.coroutines.a.aq r1 = (kotlinx.coroutines.p5573a.C71363aq) r1
            p5462h.C69714l.m101134b(r12)
            goto L_0x004c
        L_0x0035:
            p5462h.C69714l.m101134b(r12)
            java.lang.Object r12 = r11.f338695j
            kotlinx.coroutines.aw r12 = (kotlinx.coroutines.C71422aw) r12
            kotlinx.coroutines.b.n r1 = r11.f338691f
            kotlinx.coroutines.a.aq r1 = kotlinx.coroutines.p5574b.C71592s.m104509c(r1, r12)
            r11.f338695j = r1
            r11.f338690e = r3
            java.lang.Object r12 = r1.mo62718c(r11)
            if (r12 == r0) goto L_0x0140
        L_0x004c:
            com.google.android.libraries.assistant.o.br r12 = (com.google.android.libraries.assistant.p1533o.C18482br) r12
            java.lang.String r5 = "firstRequest"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r5)
            int r5 = r12.f52417a
            if (r5 != r3) goto L_0x0123
            java.lang.Object r3 = r12.f52418b
            com.google.android.libraries.assistant.o.bo r3 = (com.google.android.libraries.assistant.p1533o.C18479bo) r3
            java.lang.String r5 = "firstRequest.startVoiceQuery"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)
            com.google.android.libraries.assistant.o.aw r3 = r3.f52412a
            if (r3 == 0) goto L_0x0106
            com.google.android.apps.search.assistant.surfaces.e.c.f r5 = r11.f338693h
            com.google.android.libraries.search.b.i.g r6 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96973cl
            com.google.net.a.a.b r7 = com.google.net.p4726a.p4727a.C62722b.OK
            com.google.android.libraries.search.b.i.a r6 = r6.mo40815i(r7)
            r5.mo107615b(r6)
            com.google.android.apps.search.assistant.platform.k.p r5 = r11.f338692g
            java.util.List r5 = r5.f338702c
            java.util.Iterator r5 = r5.iterator()
            r6 = r12
            r12 = r11
            r10 = r5
            r5 = r3
            r3 = r10
        L_0x007e:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00fe
            java.lang.Object r7 = r3.next()
            r8 = r7
            com.google.android.apps.search.assistant.libraries.j.b r8 = (com.google.android.apps.search.assistant.libraries.p8979j.C119414b) r8
            r12.f338695j = r1
            r12.f338686a = r6
            r12.f338687b = r5
            r12.f338688c = r3
            r12.f338689d = r7
            r12.f338690e = r2
            com.google.android.apps.search.assistant.libraries.j.c r8 = r8.f332916b
            r9 = r5
            com.google.android.libraries.assistant.o.aw r9 = (com.google.android.libraries.assistant.p1533o.C18460aw) r9
            java.lang.Object r8 = r8.mo104328a(r9, r12)
            if (r8 == r0) goto L_0x00fd
            r10 = r0
            r0 = r12
            r12 = r8
            r8 = r6
            r6 = r5
            r5 = r3
            r3 = r7
            r7 = r1
            r1 = r10
        L_0x00ab:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x00f6
            com.google.android.apps.search.assistant.libraries.j.b r3 = (com.google.android.apps.search.assistant.libraries.p8979j.C119414b) r3
            com.google.android.apps.search.assistant.surfaces.e.c.f r12 = r0.f338693h
            com.google.android.apps.search.assistant.libraries.j.c r2 = r3.f332916b
            r2.mo104329b(r12)
            kotlinx.coroutines.b.o r12 = r0.f338694i
            com.google.android.apps.search.assistant.platform.k.j r2 = r3.f332915a
            com.google.android.apps.search.assistant.platform.k.l r3 = new com.google.android.apps.search.assistant.platform.k.l
            com.google.android.libraries.assistant.o.br r8 = (com.google.android.libraries.assistant.p1533o.C18482br) r8
            r3.<init>(r8, r7, r4)
            kotlinx.coroutines.b.db r5 = new kotlinx.coroutines.b.db
            r5.<init>(r3)
            com.google.android.apps.search.assistant.platform.k.m r3 = new com.google.android.apps.search.assistant.platform.k.m
            com.google.android.apps.search.assistant.surfaces.e.c.f r6 = r0.f338693h
            r3.<init>(r6, r4)
            kotlinx.coroutines.b.n r3 = kotlinx.coroutines.p5574b.C71477ah.m104295b(r5, r3)
            kotlinx.coroutines.b.n r2 = r2.mo23998b(r3)
            r0.f338695j = r7
            r0.f338686a = r4
            r0.f338687b = r4
            r0.f338688c = r4
            r0.f338689d = r4
            r3 = 3
            r0.f338690e = r3
            java.lang.Object r12 = kotlinx.coroutines.p5574b.C71594u.m104516c(r12, r2, r0)
            if (r12 == r1) goto L_0x00f5
            r0 = r7
        L_0x00ef:
            r0.mo62723u(r4)
            h.q r12 = p5462h.C69788q.f186170a
            return r12
        L_0x00f5:
            return r1
        L_0x00f6:
            r12 = r0
            r0 = r1
            r3 = r5
            r5 = r6
            r1 = r7
            r6 = r8
            goto L_0x007e
        L_0x00fd:
            return r0
        L_0x00fe:
            java.util.NoSuchElementException r12 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r12.<init>(r0)
            throw r12
        L_0x0106:
            com.google.common.f.e r12 = com.google.android.apps.search.assistant.platform.p9256k.C122082p.f338700a
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 36105(0x8d09, float:5.0594E-41)
            r0.<init>(r1)
            r12.mo56379ah(r0)
            java.lang.String r0 = "getConfiguration: VoiceQueryConfiguration is missing from the StartVoiceQuery"
            r12.mo56386p(r0)
            java.lang.Throwable r12 = com.google.android.apps.search.assistant.platform.p9256k.C122077k.m201610a()
            throw r12
        L_0x0123:
            com.google.common.f.e r12 = com.google.android.apps.search.assistant.platform.p9256k.C122082p.f338700a
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 36106(0x8d0a, float:5.0595E-41)
            r0.<init>(r1)
            r12.mo56379ah(r0)
            java.lang.String r0 = "getConfiguration(): start_voice_query is missing from the first VoiceSearchRequest"
            r12.mo56386p(r0)
            java.lang.Throwable r12 = com.google.android.apps.search.assistant.platform.p9256k.C122077k.m201610a()
            throw r12
        L_0x0140:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9256k.C122080n.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C122080n nVar = new C122080n(this.f338691f, this.f338692g, this.f338693h, this.f338694i, gVar);
        nVar.f338695j = obj;
        return nVar;
    }
}
