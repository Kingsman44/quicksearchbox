package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125783g;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125891b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125934w;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.invocation.KeyboardPreparer$waitForKeyboardToShowUp$interaction$1$1$1", mo61344c = "KeyboardPreparer.kt", mo61345d = "invokeSuspend", mo61346e = {248})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.bk */
/* compiled from: PG */
final class C125847bk extends C69572j implements C69630p {

    /* renamed from: a */
    int f346835a;

    /* renamed from: b */
    /* synthetic */ Object f346836b;

    /* renamed from: c */
    final /* synthetic */ C125783g f346837c;

    /* renamed from: d */
    final /* synthetic */ C125850bn f346838d;

    /* renamed from: e */
    final /* synthetic */ C125891b f346839e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125847bk(C125783g gVar, C125850bn bnVar, C125891b bVar, C69577g gVar2) {
        super(2, gVar2);
        this.f346837c = gVar;
        this.f346838d = bnVar;
        this.f346839e = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125847bk) mo5194c((C125934w) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f346835a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C125850bn bnVar = this.f346838d;
            C125891b bVar = this.f346839e;
            this.f346835a = 1;
            obj = bnVar.mo107129b((C125934w) this.f346836b, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return Boolean.valueOf(C69664n.m101066l(obj, C125856bt.f346865a));
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C125847bk bkVar = new C125847bk(this.f346837c, this.f346838d, this.f346839e, gVar);
        bkVar.f346836b = obj;
        return bkVar;
    }
}
