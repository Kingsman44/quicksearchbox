package com.google.android.apps.search.googleapp.search.suggest.feedback;

import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.feedback.FeedbackDataService$getAsyncPsds$2$previousQueryDataDeferred$1", mo61344c = "FeedbackDataService.kt", mo61345d = "invokeSuspend", mo61346e = {77})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.feedback.c */
/* compiled from: PG */
final class C138101c extends C69572j implements C69630p {

    /* renamed from: a */
    int f375740a;

    /* renamed from: b */
    final /* synthetic */ C138109k f375741b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138101c(C138109k kVar, C69577g gVar) {
        super(2, gVar);
        this.f375741b = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138101c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f375740a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx a = this.f375741b.f375766f.mo114052a();
            this.f375740a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138101c(this.f375741b, gVar);
    }
}
