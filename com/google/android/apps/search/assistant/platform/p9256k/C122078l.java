package com.google.android.apps.search.assistant.platform.p9256k;

import com.google.android.libraries.assistant.p1533o.C18482br;
import kotlinx.coroutines.p5573a.C71363aq;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.voicesearch.VoiceSearchRouter$doVoiceQuery$1$1$1", mo61344c = "VoiceSearchRouter.kt", mo61345d = "invokeSuspend", mo61346e = {70, 71, 72})
/* renamed from: com.google.android.apps.search.assistant.platform.k.l */
/* compiled from: PG */
final class C122078l extends C69572j implements C69630p {

    /* renamed from: a */
    Object f338679a;

    /* renamed from: b */
    int f338680b;

    /* renamed from: c */
    final /* synthetic */ C18482br f338681c;

    /* renamed from: d */
    final /* synthetic */ C71363aq f338682d;

    /* renamed from: e */
    private /* synthetic */ Object f338683e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122078l(C18482br brVar, C71363aq aqVar, C69577g gVar) {
        super(2, gVar);
        this.f338681c = brVar;
        this.f338682d = aqVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C122078l) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.a.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: kotlinx.coroutines.a.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: kotlinx.coroutines.a.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: kotlinx.coroutines.a.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: kotlinx.coroutines.a.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: kotlinx.coroutines.a.x} */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        if (r1.mo20883a(r8, r7) != r0) goto L_0x0040;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f338680b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002c
            if (r1 == r3) goto L_0x0024
            if (r1 == r2) goto L_0x0018
            java.lang.Object r1 = r7.f338679a
            java.lang.Object r3 = r7.f338683e
            kotlinx.coroutines.b.o r3 = (kotlinx.coroutines.p5574b.C71588o) r3
            p5462h.C69714l.m101134b(r8)
            r8 = r1
            r1 = r3
            goto L_0x0046
        L_0x0018:
            java.lang.Object r1 = r7.f338679a
            java.lang.Object r3 = r7.f338683e
            kotlinx.coroutines.b.o r3 = (kotlinx.coroutines.p5574b.C71588o) r3
            p5462h.C69714l.m101134b(r8)
            r4 = r3
            r3 = r7
            goto L_0x0057
        L_0x0024:
            java.lang.Object r1 = r7.f338683e
            kotlinx.coroutines.b.o r1 = (kotlinx.coroutines.p5574b.C71588o) r1
            p5462h.C69714l.m101134b(r8)
            goto L_0x0040
        L_0x002c:
            p5462h.C69714l.m101134b(r8)
            java.lang.Object r8 = r7.f338683e
            r1 = r8
            kotlinx.coroutines.b.o r1 = (kotlinx.coroutines.p5574b.C71588o) r1
            com.google.android.libraries.assistant.o.br r8 = r7.f338681c
            r7.f338683e = r1
            r7.f338680b = r3
            java.lang.Object r8 = r1.mo20883a(r8, r7)
            if (r8 == r0) goto L_0x0079
        L_0x0040:
            kotlinx.coroutines.a.aq r8 = r7.f338682d
            kotlinx.coroutines.a.x r8 = r8.mo62721g()
        L_0x0046:
            r3 = r7
        L_0x0047:
            r3.f338683e = r1
            r3.f338679a = r8
            r3.f338680b = r2
            java.lang.Object r4 = r8.mo62689a(r3)
            if (r4 == r0) goto L_0x0079
            r6 = r1
            r1 = r8
            r8 = r4
            r4 = r6
        L_0x0057:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0076
            java.lang.Object r8 = r1.mo62690b()
            com.google.android.libraries.assistant.o.br r8 = (com.google.android.libraries.assistant.p1533o.C18482br) r8
            r3.f338683e = r4
            r3.f338679a = r1
            r5 = 3
            r3.f338680b = r5
            java.lang.Object r8 = r4.mo20883a(r8, r3)
            if (r8 == r0) goto L_0x0075
            r8 = r1
            r1 = r4
            goto L_0x0047
        L_0x0075:
            return r0
        L_0x0076:
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9256k.C122078l.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C122078l lVar = new C122078l(this.f338681c, this.f338682d, gVar);
        lVar.f338683e = obj;
        return lVar;
    }
}
