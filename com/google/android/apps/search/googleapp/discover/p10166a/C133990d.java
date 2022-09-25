package com.google.android.apps.search.googleapp.discover.p10166a;

import com.google.android.apps.search.googleapp.discover.p10166a.p10168b.C133968c;
import com.google.android.apps.search.googleapp.discover.p10166a.p10168b.C133969d;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.actions.ActionReporter$reportActions$2", mo61344c = "ActionReporter.kt", mo61345d = "invokeSuspend", mo61346e = {26, 27})
/* renamed from: com.google.android.apps.search.googleapp.discover.a.d */
/* compiled from: PG */
final class C133990d extends C69572j implements C69630p {

    /* renamed from: a */
    int f364976a;

    /* renamed from: b */
    final /* synthetic */ C133991e f364977b;

    /* renamed from: c */
    final /* synthetic */ List f364978c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133990d(C133991e eVar, List list, C69577g gVar) {
        super(2, gVar);
        this.f364977b = eVar;
        this.f364978c = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C133990d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f364976a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C133997k kVar = this.f364977b.f364979a;
            List list = this.f364978c;
            this.f364976a = 1;
            obj = C71803m.m105040a(kVar.f364996c, new C133996j(kVar, list, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        C133969d dVar = this.f364977b.f364980b;
        this.f364976a = 2;
        Object a = C71803m.m105040a(dVar.f364902g, new C133968c(dVar, (List) obj, (C69577g) null), this);
        if (a != C69554a.COROUTINE_SUSPENDED) {
            a = C69788q.f186170a;
        }
        if (a == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C133990d(this.f364977b, this.f364978c, gVar);
    }
}
