package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121740a;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.C33588c;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33605al;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33618l;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33619m;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33623q;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33624r;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.audio.focus.service.AudioFocusInternalServiceImpl$createAudioFocusStreaming$1$handleAcquireSessionRequest$4", mo61344c = "AudioFocusInternalServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {97, 98})
/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.e */
/* compiled from: PG */
final class C33635e extends C69572j implements C69630p {

    /* renamed from: a */
    int f89876a;

    /* renamed from: b */
    final /* synthetic */ C121740a f89877b;

    /* renamed from: c */
    final /* synthetic */ C71361ao f89878c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33635e(C121740a aVar, C71361ao aoVar, C69577g gVar) {
        super(2, gVar);
        this.f89877b = aVar;
        this.f89878c = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33635e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f89876a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C71604be beVar = this.f89877b.f337813b;
            this.f89876a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        C33588c cVar = (C33588c) obj;
        C71361ao aoVar = this.f89878c;
        C33623q qVar = (C33623q) C33624r.f89856c.createBuilder();
        C69664n.m101060f(qVar, "newBuilder()");
        C33605al a = C69664n.m101061g(qVar, "builder");
        C33618l lVar = (C33618l) C33619m.f89848b.createBuilder();
        C69664n.m101060f(lVar, "newBuilder()");
        C69664n.m101061g(lVar, "builder");
        C69664n.m101061g(cVar, "value");
        lVar.copyOnWrite();
        cVar.getClass();
        ((C33619m) lVar.instance).f89850a = cVar;
        C62942bv build = lVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C33619m mVar = (C33619m) build;
        C69664n.m101061g(mVar, "value");
        C33623q qVar2 = a.f89824a;
        qVar2.copyOnWrite();
        C33624r rVar = (C33624r) qVar2.instance;
        mVar.getClass();
        rVar.f89859b = mVar;
        rVar.f89858a = 3;
        C33624r a2 = a.mo39003a();
        this.f89876a = 2;
        if (aoVar.mo62729v(a2, this) == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33635e(this.f89877b, this.f89878c, gVar);
    }
}
