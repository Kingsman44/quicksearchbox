package com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.interaction.Interaction$KeyboardEventStreamObserver$onCompleted$1", mo61344c = "Interaction.kt", mo61345d = "invokeSuspend", mo61346e = {143})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.h.c */
/* compiled from: PG */
final class C125779c extends C69572j implements C69630p {

    /* renamed from: a */
    int f346650a;

    /* renamed from: b */
    final /* synthetic */ C125783g f346651b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125779c(C125783g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f346651b = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125779c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f346650a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C125783g gVar = this.f346651b;
            this.f346650a = 1;
            if (gVar.mo107115a(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125779c(this.f346651b, gVar);
    }
}
