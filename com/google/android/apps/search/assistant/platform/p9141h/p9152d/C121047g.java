package com.google.android.apps.search.assistant.platform.p9141h.p9152d;

import com.google.android.apps.search.assistant.platform.p9141h.p9152d.p9153a.C121040c;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9620b.C127609c;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9620b.C127610d;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.settingsdata.inputmodality.InputModalityImpl$setInputModality$1", mo61344c = "InputModalityImpl.kt", mo61345d = "invokeSuspend", mo61346e = {40})
/* renamed from: com.google.android.apps.search.assistant.platform.h.d.g */
/* compiled from: PG */
final class C121047g extends C69572j implements C69630p {

    /* renamed from: a */
    int f336437a;

    /* renamed from: b */
    final /* synthetic */ C121048h f336438b;

    /* renamed from: c */
    final /* synthetic */ C121040c f336439c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121047g(C121048h hVar, C121040c cVar, C69577g gVar) {
        super(2, gVar);
        this.f336438b = hVar;
        this.f336439c = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121047g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f336437a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C121048h hVar = this.f336438b;
            C60870cx a = hVar.f336440a.mo46039a(new C121046f(this.f336439c), hVar.f336443d);
            C69664n.m101060f(a, "inputModality: InputModa…eightExecutor\n          )");
            this.f336437a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Void voidR = (Void) obj;
        Object b = this.f336438b.f336441b.mo27525b();
        C69664n.m101060f(b, "listeners.get()");
        for (C127610d dVar : (Iterable) b) {
            C71803m.m105043d(dVar.f351317c, (C69585o) null, (C71424ay) null, new C127609c(dVar, (C69577g) null), 3);
        }
        return voidR;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121047g(this.f336438b, this.f336439c, gVar);
    }
}
