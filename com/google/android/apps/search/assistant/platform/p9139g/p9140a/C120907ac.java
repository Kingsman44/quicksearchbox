package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import com.google.assistant.p3931f.p3940d.p3941a.C52896c;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71760h;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.rendering.widgets.ActionsServiceSessionImpl$handleSimpleCollectionRequest$1", mo61344c = "ActionsServiceSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {334, 363})
/* renamed from: com.google.android.apps.search.assistant.platform.g.a.ac */
/* compiled from: PG */
final class C120907ac extends C69572j implements C69630p {

    /* renamed from: a */
    int f336147a;

    /* renamed from: b */
    final /* synthetic */ C120917am f336148b;

    /* renamed from: c */
    final /* synthetic */ List f336149c;

    /* renamed from: d */
    final /* synthetic */ C52896c f336150d;

    /* renamed from: e */
    final /* synthetic */ int f336151e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120907ac(C120917am amVar, List list, C52896c cVar, int i, C69577g gVar) {
        super(2, gVar);
        this.f336148b = amVar;
        this.f336149c = list;
        this.f336150d = cVar;
        this.f336151e = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120907ac) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f336147a;
        if (i == 0) {
            C69714l.m101134b(obj);
            List list = this.f336149c;
            C120906ab abVar = new C120906ab(this.f336150d, this.f336151e, (C69577g) null);
            this.f336147a = 1;
            obj = C71423ax.m104196a(new C120909ae(list, abVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            this.f336148b.f336192m.mo62807f(new C120941bj((List) obj));
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        this.f336147a = 2;
        obj = C71760h.m104949a((Collection) obj, this);
        if (obj == aVar) {
            return aVar;
        }
        this.f336148b.f336192m.mo62807f(new C120941bj((List) obj));
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120907ac(this.f336148b, this.f336149c, this.f336150d, this.f336151e, gVar);
    }
}
