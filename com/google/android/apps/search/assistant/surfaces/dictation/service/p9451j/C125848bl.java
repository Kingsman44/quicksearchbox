package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9430b.C125285o;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125783g;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125891b;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.invocation.KeyboardPreparer$waitForKeyboardToShowUp$interaction$1$1", mo61344c = "KeyboardPreparer.kt", mo61345d = "invokeSuspend", mo61346e = {246})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.bl */
/* compiled from: PG */
final class C125848bl extends C69572j implements C69630p {

    /* renamed from: a */
    int f346840a;

    /* renamed from: b */
    /* synthetic */ Object f346841b;

    /* renamed from: c */
    final /* synthetic */ C125850bn f346842c;

    /* renamed from: d */
    final /* synthetic */ C125891b f346843d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125848bl(C125850bn bnVar, C125891b bVar, C69577g gVar) {
        super(2, gVar);
        this.f346842c = bnVar;
        this.f346843d = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125848bl) mo5194c((C125783g) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f346840a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C125783g gVar = (C125783g) this.f346841b;
            C71587n nVar = gVar.f346664e.f347007d;
            C125847bk bkVar = new C125847bk(gVar, this.f346842c, this.f346843d, (C69577g) null);
            this.f346840a = 1;
            obj = C125285o.m205216a(nVar, bkVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C125848bl blVar = new C125848bl(this.f346842c, this.f346843d, gVar);
        blVar.f346841b = obj;
        return blVar;
    }
}
