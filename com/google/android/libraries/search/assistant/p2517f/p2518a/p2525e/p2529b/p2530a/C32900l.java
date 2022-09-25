package com.google.android.libraries.search.assistant.p2517f.p2518a.p2525e.p2529b.p2530a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import kotlinx.coroutines.C71422aw;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.providers.user.locale.LocaleProvider$update$2$2$locale$1$update$1", mo61344c = "LocaleProvider.kt", mo61345d = "invokeSuspend", mo61346e = {150})
/* renamed from: com.google.android.libraries.search.assistant.f.a.e.b.a.l */
/* compiled from: PG */
final class C32900l extends C69572j implements C69630p {

    /* renamed from: a */
    int f88178a;

    /* renamed from: b */
    final /* synthetic */ C32903o f88179b;

    /* renamed from: c */
    private /* synthetic */ Object f88180c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32900l(C32903o oVar, C69577g gVar) {
        super(2, gVar);
        this.f88179b = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32900l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f88178a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                obj2 = C69714l.m101133a(th);
            }
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f88180c;
            C32903o oVar = this.f88179b;
            this.f88178a = 1;
            obj = oVar.mo38337a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        obj2 = (C32801aw) obj;
        return new C69702k(obj2);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C32900l lVar = new C32900l(this.f88179b, gVar);
        lVar.f88180c = obj;
        return lVar;
    }
}
