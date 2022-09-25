package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9443b;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125708c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9443b.p9444a.C125705a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9481b.C126319a;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.queryagnostic.QueryAgnosticFulfillmentHandler$fulfill$1$1$fulfillmentResults$1$1", mo61344c = "QueryAgnosticFulfillmentHandler.kt", mo61345d = "invokeSuspend", mo61346e = {25})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.b.a */
/* compiled from: PG */
final class C125704a extends C69572j implements C69630p {

    /* renamed from: a */
    int f346461a;

    /* renamed from: b */
    final /* synthetic */ C125708c f346462b;

    /* renamed from: c */
    final /* synthetic */ C125705a f346463c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125704a(C125705a aVar, C125708c cVar, C69577g gVar) {
        super(2, gVar);
        this.f346463c = aVar;
        this.f346462b = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125704a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f346461a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C125705a aVar2 = this.f346463c;
            C125708c cVar = this.f346462b;
            this.f346461a = 1;
            obj = (!aVar2.f346464a || !cVar.f346481f) ? C69496am.f185918a : C69540x.m100944b(C126319a.m206546a("text.AUTO_COMPLETE"));
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125704a(this.f346463c, this.f346462b, gVar);
    }
}
