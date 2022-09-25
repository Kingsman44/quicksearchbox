package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.p9078e;

import com.google.android.libraries.search.assistant.p2517f.p2518a.C32594a;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32637bf;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32640bi;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.network.onlineprocessing.impl.updaterequests.AssistDataRequestProducer$assistDataBuilder$2$assistStateAsync$1", mo61344c = "AssistDataRequestProducer.kt", mo61345d = "invokeSuspend", mo61346e = {71})
/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.e.d */
/* compiled from: PG */
final class C120303d extends C69572j implements C69630p {

    /* renamed from: a */
    int f334719a;

    /* renamed from: b */
    final /* synthetic */ C32594a f334720b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120303d(C32594a aVar, C69577g gVar) {
        super(2, gVar);
        this.f334720b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120303d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f334719a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C32594a aVar2 = this.f334720b;
            C32871q qVar = C32871q.STATIC_CACHE;
            C69664n.m101061g(qVar, "strategy");
            C32640bi biVar = (C32640bi) aVar2;
            C60870cx e = C71663i.m104692e(biVar.f87485a, (C71424ay) null, new C32637bf(biVar, qVar, (C69577g) null), 3);
            C69664n.m101060f(e, "assistDataContextAccesso…ategy.STATIC_CACHE, true)");
            this.f334719a = 1;
            obj = C71663i.m104690c(e, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120303d(this.f334720b, gVar);
    }
}
