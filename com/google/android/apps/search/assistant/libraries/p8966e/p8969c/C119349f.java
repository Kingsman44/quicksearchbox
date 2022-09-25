package com.google.android.apps.search.assistant.libraries.p8966e.p8969c;

import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17319o;
import com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36117i;
import com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36118j;
import com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36120l;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.libraries.performer.opahandover.OpaHandoverPerformer$createClientOpResult$handoverResult$1$2", mo61344c = "OpaHandoverPerformer.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.libraries.e.c.f */
/* compiled from: PG */
final class C119349f extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f332758a;

    /* renamed from: b */
    final /* synthetic */ C36120l f332759b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119349f(C36120l lVar, C69577g gVar) {
        super(2, gVar);
        this.f332759b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119349f) mo5194c((C17319o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C17319o oVar = (C17319o) this.f332758a;
        C59071e eVar = C119354k.f332769a;
        C36120l lVar = this.f332759b;
        List unmodifiableList = Collections.unmodifiableList(((C36118j) lVar.f94457a.instance).f94454b);
        C69664n.m101060f(unmodifiableList, "_builder.getStatusesList()");
        new C62883b(unmodifiableList);
        C69664n.m101060f(oVar, "it");
        C69664n.m101061g(oVar, "value");
        C36117i iVar = lVar.f94457a;
        iVar.copyOnWrite();
        C36118j jVar = (C36118j) iVar.instance;
        oVar.getClass();
        C62971cq cqVar = jVar.f94454b;
        if (!cqVar.mo58948c()) {
            jVar.f94454b = C62942bv.mutableCopy(cqVar);
        }
        jVar.f94454b.add(oVar);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C119349f fVar = new C119349f(this.f332759b, gVar);
        fVar.f332758a = obj;
        return fVar;
    }
}
