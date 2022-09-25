package com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f.p9437a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.execution.performer.ExecuteAppControlPerformer$perform$1", mo61344c = "ExecuteAppControlPerformer.kt", mo61345d = "invokeSuspend", mo61346e = {53, 79})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.f.a.k */
/* compiled from: PG */
final class C125445k extends C69572j implements C69630p {

    /* renamed from: a */
    int f345936a;

    /* renamed from: b */
    final /* synthetic */ C125446l f345937b;

    /* renamed from: c */
    final /* synthetic */ C51809dy f345938c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125445k(C125446l lVar, C51809dy dyVar, C69577g gVar) {
        super(2, gVar);
        this.f345937b = lVar;
        this.f345938c = dyVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125445k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f345936a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C60870cx cxVar = this.f345937b.f345940b;
            this.f345936a = 1;
            obj = C71663i.m104690c(cxVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
        }
        C125444j jVar = new C125444j((List) obj);
        C125446l lVar = this.f345937b;
        C60870cx a = lVar.f345941c.mo66638a(lVar.f345939a, jVar, C34053bp.f90753a).mo20766a(this.f345938c);
        this.f345936a = 2;
        obj = C71663i.m104690c(a, this);
        return obj == aVar ? aVar : obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125445k(this.f345937b, this.f345938c, gVar);
    }
}
