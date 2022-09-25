package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125891b;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71517bu;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.invocation.KeyboardPreparer$waitForKeyboardToShowUp$interaction$1", mo61344c = "KeyboardPreparer.kt", mo61345d = "invokeSuspend", mo61346e = {244})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.bm */
/* compiled from: PG */
final class C125849bm extends C69572j implements C69630p {

    /* renamed from: a */
    int f346844a;

    /* renamed from: b */
    final /* synthetic */ C125850bn f346845b;

    /* renamed from: c */
    final /* synthetic */ C125891b f346846c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125849bm(C125850bn bnVar, C125891b bVar, C69577g gVar) {
        super(2, gVar);
        this.f346845b = bnVar;
        this.f346846c = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125849bm) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f346844a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n a = C71536cm.m104383a(this.f346845b.f346849c.f346686e);
            C125848bl blVar = new C125848bl(this.f346845b, this.f346846c, (C69577g) null);
            this.f346844a = 1;
            obj = C71517bu.m104352c(a, blVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125849bm(this.f346845b, this.f346846c, gVar);
    }
}
