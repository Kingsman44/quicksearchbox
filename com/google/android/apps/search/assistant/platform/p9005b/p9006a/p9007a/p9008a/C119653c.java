package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9008a;

import com.google.assistant.p3897e.p3921j.C52070ec;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.conversation.api.contrib.clientop.ClientOpPrefetchSessionAdaptersKt$clientOpPrefetchSession$job$1", mo61344c = "ClientOpPrefetchSessionAdapters.kt", mo61345d = "invokeSuspend", mo61346e = {53})
/* renamed from: com.google.android.apps.search.assistant.platform.b.a.a.a.c */
/* compiled from: PG */
final class C119653c extends C69572j implements C69630p {

    /* renamed from: a */
    int f333443a;

    /* renamed from: b */
    final /* synthetic */ C69630p f333444b;

    /* renamed from: c */
    final /* synthetic */ C71816z f333445c;

    /* renamed from: d */
    private /* synthetic */ Object f333446d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119653c(C71816z zVar, C69630p pVar, C69577g gVar) {
        super(2, gVar);
        this.f333445c = zVar;
        this.f333444b = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119653c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f333443a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C119657g gVar = new C119657g((C71422aw) this.f333446d, this.f333445c);
            C69630p pVar = this.f333444b;
            this.f333443a = 1;
            obj = pVar.mo5192a(gVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return (C52070ec) obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C119653c cVar = new C119653c(this.f333445c, this.f333444b, gVar);
        cVar.f333446d = obj;
        return cVar;
    }
}
