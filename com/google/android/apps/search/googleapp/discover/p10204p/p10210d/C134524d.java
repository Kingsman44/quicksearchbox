package com.google.android.apps.search.googleapp.discover.p10204p.p10210d;

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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.ondevicecontent.storage.OnDeviceContentDataManager$readOnDeviceContent$2", mo61344c = "OnDeviceContentDataManager.kt", mo61345d = "invokeSuspend", mo61346e = {48})
/* renamed from: com.google.android.apps.search.googleapp.discover.p.d.d */
/* compiled from: PG */
final class C134524d extends C69572j implements C69630p {

    /* renamed from: a */
    int f366347a;

    /* renamed from: b */
    final /* synthetic */ C134526f f366348b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134524d(C134526f fVar, C69577g gVar) {
        super(2, gVar);
        this.f366348b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134524d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f366347a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx d = this.f366348b.f366350a.mo46042d();
            C69664n.m101060f(d, "store.data");
            this.f366347a = 1;
            obj = C71663i.m104690c(d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134524d(this.f366348b, gVar);
    }
}
