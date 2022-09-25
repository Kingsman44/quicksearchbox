package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b;

import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5574b.C71486aq;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69644aa;
import p5462h.p5473f.p5475b.C69648ae;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.audio.input.service.AudioInputInternalServiceImpl$openSessionStreaming$1", mo61344c = "AudioInputInternalServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {96})
/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.b.i */
/* compiled from: PG */
final class C33705i extends C69572j implements C69630p {

    /* renamed from: a */
    int f90045a;

    /* renamed from: b */
    final /* synthetic */ C71587n f90046b;

    /* renamed from: c */
    final /* synthetic */ C33706j f90047c;

    /* renamed from: d */
    private /* synthetic */ Object f90048d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33705i(C71587n nVar, C33706j jVar, C69577g gVar) {
        super(2, gVar);
        this.f90046b = nVar;
        this.f90047c = jVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: kotlinx.coroutines.a.ao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: kotlinx.coroutines.a.ao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlinx.coroutines.a.ao} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m62302e(com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.C33706j r5, p5462h.p5473f.p5475b.C69644aa r6, kotlinx.coroutines.p5573a.C71361ao r7, com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33677e r8, p5462h.p5466c.C69577g r9) {
        /*
            boolean r0 = r9 instanceof com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.C33703g
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.search.assistant.invocation.d.b.b.g r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.C33703g) r0
            int r1 = r0.f90038d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f90038d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.d.b.b.g r0 = new com.google.android.libraries.search.assistant.invocation.d.b.b.g
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f90037c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f90038d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0087
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            java.lang.Object r7 = r0.f90036b
            java.lang.Object r6 = r0.f90035a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0049
        L_0x003a:
            p5462h.C69714l.m101134b(r9)
            r0.f90035a = r6
            r0.f90036b = r7
            r0.f90038d = r4
            java.lang.Object r9 = r5.mo39033b(r8, r0)
            if (r9 == r1) goto L_0x008a
        L_0x0049:
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.i r9 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33681i) r9
            h.f.b.aa r6 = (p5462h.p5473f.p5475b.C69644aa) r6
            r6.f186023a = r4
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.r r5 = com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33690r.f90011c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.q r5 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33689q) r5
            java.lang.String r6 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.af r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            java.lang.String r6 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r6)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.q r6 = r5.f89975a
            r6.copyOnWrite()
            com.google.protobuf.bv r6 = r6.instance
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.r r6 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33690r) r6
            r9.getClass()
            r6.f90014b = r9
            r6.f90013a = r3
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.r r5 = r5.mo39026a()
            r6 = 0
            r0.f90035a = r6
            r0.f90036b = r6
            r0.f90038d = r3
            java.lang.Object r5 = r7.mo62729v(r5, r0)
            if (r5 != r1) goto L_0x0087
            return r1
        L_0x0087:
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        L_0x008a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.C33705i.m62302e(com.google.android.libraries.search.assistant.invocation.d.b.b.j, h.f.b.aa, kotlinx.coroutines.a.ao, com.google.android.libraries.search.assistant.invocation.d.b.b.b.e, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: kotlinx.coroutines.a.ao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: kotlinx.coroutines.a.ao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: kotlinx.coroutines.a.ao} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m62303f(p5462h.p5473f.p5475b.C69644aa r5, com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.C33706j r6, p5462h.p5473f.p5475b.C69648ae r7, p5462h.p5473f.p5475b.C69648ae r8, kotlinx.coroutines.p5573a.C71361ao r9, com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33683k r10, p5462h.p5466c.C69577g r11) {
        /*
            boolean r0 = r11 instanceof com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.C33704h
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.libraries.search.assistant.invocation.d.b.b.h r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.C33704h) r0
            int r1 = r0.f90044f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f90044f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.d.b.b.h r0 = new com.google.android.libraries.search.assistant.invocation.d.b.b.h
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.f90043e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f90044f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p5462h.C69714l.m101134b(r11)
            goto L_0x00cb
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            java.lang.Object r10 = r0.f90042d
            java.lang.Object r9 = r0.f90041c
            java.lang.Object r8 = r0.f90040b
            java.lang.Object r7 = r0.f90039a
            p5462h.C69714l.m101134b(r11)
            goto L_0x0056
        L_0x003f:
            p5462h.C69714l.m101134b(r11)
            boolean r5 = r5.f186023a
            if (r5 != 0) goto L_0x00cf
            r0.f90039a = r7
            r0.f90040b = r8
            r0.f90041c = r9
            r0.f90042d = r10
            r0.f90044f = r4
            java.lang.Object r11 = r6.mo39034c(r10, r0)
            if (r11 == r1) goto L_0x00ce
        L_0x0056:
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.m r11 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33685m) r11
            java.lang.String r5 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r5)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.k r10 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33683k) r10
            com.google.android.libraries.search.assistant.invocation.o.a.bp r6 = r10.f90000a
            r10 = 0
            if (r6 != 0) goto L_0x0065
            r6 = r10
        L_0x0065:
            h.f.b.ae r7 = (p5462h.p5473f.p5475b.C69648ae) r7
            r7.f186027a = r6
            int r6 = r11.f90004a
            if (r6 != r4) goto L_0x0072
            java.lang.Object r6 = r11.f90005b
            com.google.android.apps.search.assistant.platform.j.b.b.c.at r6 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121771at) r6
            goto L_0x0074
        L_0x0072:
            com.google.android.apps.search.assistant.platform.j.b.b.c.at r6 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121771at.f337934d
        L_0x0074:
            int r7 = r6.f337936a
            if (r7 != r4) goto L_0x007d
            java.lang.Object r6 = r6.f337937b
            com.google.android.apps.search.assistant.platform.j.b.b.c.bf r6 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121784bf) r6
            goto L_0x007f
        L_0x007d:
            com.google.android.apps.search.assistant.platform.j.b.b.c.bf r6 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121784bf.f337956e
        L_0x007f:
            java.lang.String r7 = "response.startListeningR…artListeningResultSuccess"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r5)
            com.google.android.libraries.search.c.cc r5 = r6.f337959b
            if (r5 != 0) goto L_0x008c
            r5 = r10
        L_0x008c:
            h.f.b.ae r8 = (p5462h.p5473f.p5475b.C69648ae) r8
            r8.f186027a = r5
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.r r5 = com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33690r.f90011c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.q r5 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33689q) r5
            java.lang.String r6 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.af r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            java.lang.String r6 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r6)
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.q r6 = r5.f89975a
            r6.copyOnWrite()
            com.google.protobuf.bv r6 = r6.instance
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.r r6 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33690r) r6
            r11.getClass()
            r6.f90014b = r11
            r6.f90013a = r4
            com.google.android.libraries.search.assistant.invocation.d.b.b.b.r r5 = r5.mo39026a()
            r0.f90039a = r10
            r0.f90040b = r10
            r0.f90041c = r10
            r0.f90042d = r10
            r0.f90044f = r3
            java.lang.Object r5 = r9.mo62729v(r5, r0)
            if (r5 != r1) goto L_0x00cb
            return r1
        L_0x00cb:
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        L_0x00ce:
            return r1
        L_0x00cf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Duplicate open session call."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.C33705i.m62303f(h.f.b.aa, com.google.android.libraries.search.assistant.invocation.d.b.b.j, h.f.b.ae, h.f.b.ae, kotlinx.coroutines.a.ao, com.google.android.libraries.search.assistant.invocation.d.b.b.b.k, h.c.g):java.lang.Object");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33705i) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90045a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f90048d;
            C69644aa aaVar = new C69644aa();
            C69648ae aeVar = new C69648ae();
            C69648ae aeVar2 = new C69648ae();
            C71594u.m104517d(C71486aq.m104308b(C71536cm.m104384b(this.f90046b, new C33699c(aaVar, this.f90047c, aeVar, aeVar2, aoVar, (C69577g) null)), new C33700d(aeVar, (C69577g) null)), aoVar);
            C33702f fVar = new C33702f(aaVar, aeVar, aeVar2, this.f90047c);
            this.f90045a = 1;
            if (C71360an.m104022a(aoVar, fVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C33705i iVar = new C33705i(this.f90046b, this.f90047c, gVar);
        iVar.f90048d = obj;
        return iVar;
    }
}
