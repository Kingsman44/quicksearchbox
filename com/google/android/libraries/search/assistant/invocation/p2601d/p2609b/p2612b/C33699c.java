package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b;

import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33677e;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33683k;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33687o;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b.C33688p;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69644aa;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.audio.input.service.AudioInputInternalServiceImpl$openSessionStreaming$1$1", mo61344c = "AudioInputInternalServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {83, 84})
/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.b.c */
/* compiled from: PG */
final class C33699c extends C69572j implements C69630p {

    /* renamed from: a */
    int f90019a;

    /* renamed from: b */
    /* synthetic */ Object f90020b;

    /* renamed from: c */
    final /* synthetic */ C69644aa f90021c;

    /* renamed from: d */
    final /* synthetic */ C33706j f90022d;

    /* renamed from: e */
    final /* synthetic */ C69648ae f90023e;

    /* renamed from: f */
    final /* synthetic */ C69648ae f90024f;

    /* renamed from: g */
    final /* synthetic */ C71361ao f90025g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33699c(C69644aa aaVar, C33706j jVar, C69648ae aeVar, C69648ae aeVar2, C71361ao aoVar, C69577g gVar) {
        super(2, gVar);
        this.f90021c = aaVar;
        this.f90022d = jVar;
        this.f90023e = aeVar;
        this.f90024f = aeVar2;
        this.f90025g = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33699c) mo5194c((C33688p) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C33683k kVar;
        C33677e eVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90019a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C33688p pVar = (C33688p) this.f90020b;
            C59052c cVar = (C59052c) C33706j.f90049a.mo56224b();
            int a = C33687o.m62279a(pVar.f90008a);
            String str = a != 1 ? a != 2 ? a != 3 ? "null" : "REQUEST_NOT_SET" : "CLOSE_SESSION" : "OPEN_SESSION";
            if (a != 0) {
                cVar.mo56379ah(new C59094n(51262));
                cVar.mo56389s("On new streaming audio session request(%s).", str);
                int i = pVar.f90008a;
                int a2 = C33687o.m62279a(i);
                int i2 = a2 - 1;
                if (a2 == 0) {
                    throw null;
                } else if (i2 == 0) {
                    C69644aa aaVar = this.f90021c;
                    C33706j jVar = this.f90022d;
                    C69648ae aeVar = this.f90023e;
                    C69648ae aeVar2 = this.f90024f;
                    C71361ao aoVar = this.f90025g;
                    if (i == 1) {
                        kVar = (C33683k) pVar.f90009b;
                    } else {
                        kVar = C33683k.f89998b;
                    }
                    C69664n.m101060f(kVar, "it.openSession");
                    this.f90019a = 1;
                    if (C33705i.m62303f(aaVar, jVar, aeVar, aeVar2, aoVar, kVar, this) == aVar) {
                        return aVar;
                    }
                } else if (i2 == 1) {
                    C33706j jVar2 = this.f90022d;
                    C69644aa aaVar2 = this.f90021c;
                    C71361ao aoVar2 = this.f90025g;
                    if (i == 2) {
                        eVar = (C33677e) pVar.f90009b;
                    } else {
                        eVar = C33677e.f89987c;
                    }
                    C69664n.m101060f(eVar, "it.closeSession");
                    this.f90019a = 2;
                    if (C33705i.m62302e(jVar2, aaVar2, aoVar2, eVar, this) == aVar) {
                        return aVar;
                    }
                } else if (i2 == 2) {
                    throw new IllegalArgumentException("No request data.");
                }
            } else {
                throw null;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C33699c cVar = new C33699c(this.f90021c, this.f90022d, this.f90023e, this.f90024f, this.f90025g, gVar);
        cVar.f90020b = obj;
        return cVar;
    }
}
