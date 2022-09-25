package com.google.android.apps.search.googleapp.notifications.p10360a.p10362b;

import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4345d.C57033l;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.notifications.actionupload.store.ActionUploadStore$saveEvents$2", mo61344c = "ActionUploadStore.kt", mo61345d = "invokeSuspend", mo61346e = {84})
/* renamed from: com.google.android.apps.search.googleapp.notifications.a.b.m */
/* compiled from: PG */
public final class C136735m extends C69572j implements C69630p {

    /* renamed from: a */
    int f372197a;

    /* renamed from: b */
    final /* synthetic */ C136736n f372198b;

    /* renamed from: c */
    final /* synthetic */ C57033l f372199c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136735m(C136736n nVar, C57033l lVar, C69577g gVar) {
        super(2, gVar);
        this.f372198b = nVar;
        this.f372199c = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C136735m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f372197a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C136730h hVar = this.f372198b.f372200a;
            C57033l lVar = this.f372199c;
            C69664n.m101060f(lVar, "notificationEvent");
            this.f372197a = 1;
            byte[] byteArray = lVar.toByteArray();
            C69664n.m101060f(byteArray, "notificationEvent.toByteArray()");
            C60870cx b = hVar.f372183a.mo45938b(new C136729g(byteArray, lVar));
            C69664n.m101060f(b, "notificationEvent: Notif…CONFLICT_REPLACE)\n      }");
            Object c = C71663i.m104690c(b, this);
            if (c != C69554a.COROUTINE_SUSPENDED) {
                c = C69788q.f186170a;
            }
            if (c == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C136735m(this.f372198b, this.f372199c, gVar);
    }
}
