package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.p9820a.p9821a;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129446a;
import com.google.common.p4580v.p4582b.C60942a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71745ea;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.input.control.dataservice.impl.InputPlateFeatureDataSource$checkFeatureAsync$1", mo61344c = "InputPlateFeatureDataSource.kt", mo61345d = "invokeSuspend", mo61346e = {96})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.c.a.a.d */
/* compiled from: PG */
final class C129450d extends C69572j implements C69630p {

    /* renamed from: a */
    int f355428a;

    /* renamed from: b */
    final /* synthetic */ C129446a f355429b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129450d(C129446a aVar, C69577g gVar) {
        super(2, gVar);
        this.f355429b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129450d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f355428a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Duration duration = C129454h.f355437a;
            C69664n.m101060f(duration, "SELECT_FEATURE_TIMEOUT");
            C129449c cVar = new C129449c(this.f355429b, (C69577g) null);
            this.f355428a = 1;
            obj = C71745ea.m104930b(C60942a.m93083a(duration), cVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C129450d(this.f355429b, gVar);
    }
}
