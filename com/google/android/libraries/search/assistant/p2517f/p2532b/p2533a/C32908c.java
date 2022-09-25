package com.google.android.libraries.search.assistant.p2517f.p2532b.p2533a;

import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.logging.statedump.ContextDebugDataProvider$getDebugData$1", mo61344c = "ContextDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {98, 112})
/* renamed from: com.google.android.libraries.search.assistant.f.b.a.c */
/* compiled from: PG */
final class C32908c extends C69572j implements C69630p {

    /* renamed from: a */
    int f88203a;

    /* renamed from: b */
    final /* synthetic */ C32914i f88204b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32908c(C32914i iVar, C69577g gVar) {
        super(2, gVar);
        this.f88204b = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32908c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f88203a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C60870cx b = this.f88204b.mo38343b();
            this.f88203a = 1;
            if (C71663i.m104690c(b, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            C69664n.m101060f(obj, "override fun getDebugDat…       .await()\n    }\n  }");
            return obj;
        } else {
            C69714l.m101134b(obj);
        }
        C32914i iVar = this.f88204b;
        C60870cx c = iVar.mo38344c(new C32907b(iVar, (C69577g) null));
        this.f88203a = 2;
        obj = C71663i.m104690c(c, this);
        if (obj == aVar) {
            return aVar;
        }
        C69664n.m101060f(obj, "override fun getDebugDat…       .await()\n    }\n  }");
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32908c(this.f88204b, gVar);
    }
}
