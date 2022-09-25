package com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b;

import com.google.assistant.p3897e.p3908d.p3909a.C51183n;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.execution.session.ExecutionPlanHelper$executionPlan$2$1", mo61344c = "ExecutionPlanHelper.kt", mo61345d = "invokeSuspend", mo61346e = {72})
/* renamed from: com.google.android.apps.search.assistant.platform.f.e.b.d */
/* compiled from: PG */
final class C120553d extends C69572j implements C69630p {

    /* renamed from: a */
    int f335282a;

    /* renamed from: b */
    final /* synthetic */ C120554e f335283b;

    /* renamed from: c */
    final /* synthetic */ Integer f335284c;

    /* renamed from: d */
    final /* synthetic */ C51183n f335285d;

    /* renamed from: e */
    final /* synthetic */ List f335286e;

    /* renamed from: f */
    final /* synthetic */ List f335287f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120553d(C120554e eVar, Integer num, C51183n nVar, List list, List list2, C69577g gVar) {
        super(2, gVar);
        this.f335283b = eVar;
        this.f335284c = num;
        this.f335285d = nVar;
        this.f335286e = list;
        this.f335287f = list2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120553d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335282a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C120554e eVar = this.f335283b;
            Integer num = this.f335284c;
            C69664n.m101060f(num, "it");
            int intValue = num.intValue();
            C51183n nVar = this.f335285d;
            List list = this.f335286e;
            List list2 = this.f335287f;
            this.f335282a = 1;
            obj = eVar.mo104832a(intValue, nVar, list, list2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120553d(this.f335283b, this.f335284c, this.f335285d, this.f335286e, this.f335287f, gVar);
    }
}
