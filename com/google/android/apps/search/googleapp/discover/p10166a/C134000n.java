package com.google.android.apps.search.googleapp.discover.p10166a;

import com.google.android.apps.search.googleapp.discover.p10244v.C135182c;
import com.google.android.apps.search.googleapp.discover.p10244v.C135200t;
import com.google.android.apps.search.googleapp.discover.p10248y.C135255f;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import java.util.List;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.actions.DismissActionApi$dismissImmediately$1", mo61344c = "DismissActionApi.kt", mo61345d = "invokeSuspend", mo61346e = {58})
/* renamed from: com.google.android.apps.search.googleapp.discover.a.n */
/* compiled from: PG */
public final class C134000n extends C69572j implements C69630p {

    /* renamed from: a */
    int f365003a;

    /* renamed from: b */
    final /* synthetic */ C134002p f365004b;

    /* renamed from: c */
    final /* synthetic */ String f365005c;

    /* renamed from: d */
    final /* synthetic */ List f365006d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134000n(C134002p pVar, String str, List list, C69577g gVar) {
        super(2, gVar);
        this.f365004b = pVar;
        this.f365005c = str;
        this.f365006d = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134000n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365003a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134002p pVar = this.f365004b;
            C135200t tVar = pVar.f365017e;
            C134755f fVar = pVar.f365018f.f366954c;
            String str = this.f365005c;
            List b = pVar.f365015c.mo112081b(this.f365006d);
            this.f365003a = 1;
            obj = tVar.mo112154b(fVar, str, b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C135182c cVar = (C135182c) obj;
        if (cVar == null) {
            return null;
        }
        C134002p pVar2 = this.f365004b;
        pVar2.f365016d.mo50787a(C71663i.m104692e(pVar2.f365019g, (C71424ay) null, new C133999m(pVar2, cVar, (C69577g) null), 3), C135255f.f368471a);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134000n(this.f365004b, this.f365005c, this.f365006d, gVar);
    }
}
