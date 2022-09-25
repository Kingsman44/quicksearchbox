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
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.feedback.FeedbackDataService$getAsyncPsds$2$accountDeferred$1", mo61344c = "FeedbackDataService.kt", mo61345d = "invokeSuspend", mo61346e = {75})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.feedback.a */
/* compiled from: PG */
final class C138082a extends C69572j implements C69630p {

    /* renamed from: a */
    int f375694a;

    /* renamed from: b */
    final /* synthetic */ C138109k f375695b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138082a(C138109k kVar, C69577g gVar) {
        super(2, gVar);
        this.f375695b = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138082a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f375694a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C138109k kVar = this.f375695b;
            C60870cx c = kVar.f375764d.mo50246c(kVar.f375763c);
            C69664n.m101060f(c, "accountDataService.getAccount(accountId)");
            this.f375694a = 1;
            obj = C71663i.m104690c(c, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138082a(this.f375695b, gVar);
    }
}
