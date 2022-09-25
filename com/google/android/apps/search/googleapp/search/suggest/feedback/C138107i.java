package com.google.android.apps.search.googleapp.search.suggest.feedback;

import com.google.android.gms.feedback.C144207l;
import com.google.android.gms.tasks.C146006ab;
import java.util.Collections;
import java.util.Map;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.feedback.FeedbackDataService$submitFeedback$2", mo61344c = "FeedbackDataService.kt", mo61345d = "invokeSuspend", mo61346e = {51})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.feedback.i */
/* compiled from: PG */
final class C138107i extends C69572j implements C69630p {

    /* renamed from: a */
    int f375755a;

    /* renamed from: b */
    final /* synthetic */ C138109k f375756b;

    /* renamed from: c */
    final /* synthetic */ C138098ao f375757c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138107i(C138109k kVar, C138098ao aoVar, C69577g gVar) {
        super(2, gVar);
        this.f375756b = kVar;
        this.f375757c = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138107i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f375755a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C138109k kVar = this.f375756b;
            this.f375755a = 1;
            obj = C71423ax.m104196a(new C138103e(kVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Map map = (Map) obj;
        Map unmodifiableMap = Collections.unmodifiableMap(this.f375757c.f375728b);
        C69664n.m101060f(unmodifiableMap, "uiPsds.psdsMap");
        map.putAll(unmodifiableMap);
        C144207l lVar = new C144207l(this.f375756b.f375767g);
        lVar.f390625d = true;
        lVar.f390624c = C138109k.f375762b;
        lVar.mo119743c(map);
        C138098ao aoVar = this.f375757c;
        if ((aoVar.f375727a & 1) != 0) {
            lVar.f390623b = aoVar.f375729c;
        }
        C146006ab c = this.f375756b.f375768h.mo119739c(lVar.mo119741a());
        c.mo122497p(C138105g.f375753a);
        c.mo122498q(C138106h.f375754a);
        return c;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138107i(this.f375756b, this.f375757c, gVar);
    }
}
