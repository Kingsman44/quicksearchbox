package com.google.android.apps.search.assistant.libraries.p8966e.p8969c;

import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36117i;
import com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36118j;
import com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36120l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.libraries.performer.opahandover.OpaHandoverPerformer$createClientOpResult$handoverResult$1$3", mo61344c = "OpaHandoverPerformer.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.libraries.e.c.g */
/* compiled from: PG */
final class C119350g extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f332760a;

    /* renamed from: b */
    final /* synthetic */ C36120l f332761b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119350g(C36120l lVar, C69577g gVar) {
        super(3, gVar);
        this.f332761b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C119350g gVar = new C119350g(this.f332761b, (C69577g) obj3);
        gVar.f332760a = (Throwable) obj2;
        return gVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Throwable th = (Throwable) this.f332760a;
        C59052c cVar = (C59052c) ((C59052c) C119354k.f332769a.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(34389));
        cVar.mo56386p("Handover failed");
        C36120l lVar = this.f332761b;
        C34822b b = C34830d.m63595b(th);
        C69664n.m101060f(b, "fromThrowable(it)");
        C69664n.m101061g(b, "value");
        C36117i iVar = lVar.f94457a;
        iVar.copyOnWrite();
        C36118j jVar = (C36118j) iVar.instance;
        C36118j jVar2 = C36118j.f94451d;
        b.getClass();
        jVar.f94455c = b;
        jVar.f94453a |= 1;
        return C69788q.f186170a;
    }
}
