package com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a;

import com.google.android.libraries.search.assistant.p2705n.C34835c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.conversation.context.impl.ContextController$fetchInitialRequestContext$1", mo61344c = "ContextController.kt", mo61345d = "invokeSuspend", mo61346e = {85})
/* renamed from: com.google.android.apps.search.assistant.platform.b.b.a.n */
/* compiled from: PG */
final class C119923n extends C69572j implements C69630p {

    /* renamed from: a */
    int f333977a;

    /* renamed from: b */
    final /* synthetic */ C119927r f333978b;

    /* renamed from: c */
    final /* synthetic */ boolean f333979c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119923n(C119927r rVar, boolean z, C69577g gVar) {
        super(2, gVar);
        this.f333978b = rVar;
        this.f333979c = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119923n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f333977a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C37215b bVar = this.f333978b.f333993c;
            C37258g gVar = C37176a.f96979cr;
            C69664n.m101060f(gVar, "CONVERSATION_INITIAL_CONTEXT_FETCH_START");
            C37258g gVar2 = C37176a.f96980cs;
            C69664n.m101060f(gVar2, "CONVERSATION_INITIAL_CONTEXT_FETCH_END");
            C119922m mVar = new C119922m(this.f333978b, this.f333979c, (C69577g) null);
            this.f333977a = 1;
            obj = C34835c.m63602a(bVar, gVar, gVar2, mVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C69664n.m101060f(obj, "override fun fetchInitia…   .build()\n      }\n    }");
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C119923n(this.f333978b, this.f333979c, gVar);
    }
}
