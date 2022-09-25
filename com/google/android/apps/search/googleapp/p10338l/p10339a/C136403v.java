package com.google.android.apps.search.googleapp.p10338l.p10339a;

import com.google.android.apps.search.googleapp.p10338l.C136412f;
import java.util.Map;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.feedback.statedump.StateDump$getComplexData$2$deferredItems$1$1", mo61344c = "StateDump.kt", mo61345d = "invokeSuspend", mo61346e = {57})
/* renamed from: com.google.android.apps.search.googleapp.l.a.v */
/* compiled from: PG */
final class C136403v extends C69572j implements C69630p {

    /* renamed from: a */
    int f371354a;

    /* renamed from: b */
    final /* synthetic */ Map f371355b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136403v(Map map, C69577g gVar) {
        super(2, gVar);
        this.f371355b = map;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C136403v) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f371354a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Map map = this.f371355b;
            this.f371354a = 1;
            obj = C136412f.m221656a(map, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C136403v(this.f371355b, gVar);
    }
}
