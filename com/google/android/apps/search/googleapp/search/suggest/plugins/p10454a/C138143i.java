package com.google.android.apps.search.googleapp.search.suggest.plugins.p10454a;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.plugins.incontextcontrol.InContextControlTwiddler$twiddle$1", mo61344c = "InContextControlTwiddler.kt", mo61345d = "invokeSuspend", mo61346e = {33})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.a.i */
/* compiled from: PG */
final class C138143i extends C69572j implements C69630p {

    /* renamed from: a */
    int f375850a;

    /* renamed from: b */
    final /* synthetic */ C138145k f375851b;

    /* renamed from: c */
    final /* synthetic */ C138133o f375852c;

    /* renamed from: d */
    final /* synthetic */ List f375853d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138143i(C138145k kVar, C138133o oVar, List list, C69577g gVar) {
        super(2, gVar);
        this.f375851b = kVar;
        this.f375852c = oVar;
        this.f375853d = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138143i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f375850a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C138145k kVar = this.f375851b;
            C138133o oVar = this.f375852c;
            List list = this.f375853d;
            this.f375850a = 1;
            obj = kVar.mo114165c(oVar, list, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138143i(this.f375851b, this.f375852c, this.f375853d, gVar);
    }
}
