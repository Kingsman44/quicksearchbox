package com.google.android.apps.search.googleapp.notifications.p10360a.p10362b;

import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.notifications.actionupload.store.ActionUploadStore$batchEvents$tasks$1", mo61344c = "ActionUploadStore.kt", mo61345d = "invokeSuspend", mo61346e = {105})
/* renamed from: com.google.android.apps.search.googleapp.notifications.a.b.k */
/* compiled from: PG */
final class C136733k extends C69572j implements C69630p {

    /* renamed from: a */
    int f372191a;

    /* renamed from: b */
    final /* synthetic */ C136736n f372192b;

    /* renamed from: c */
    final /* synthetic */ long f372193c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136733k(C136736n nVar, long j, C69577g gVar) {
        super(2, gVar);
        this.f372192b = nVar;
        this.f372193c = j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C136733k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f372191a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C136736n nVar = this.f372192b;
            C136730h hVar = nVar.f372200a;
            long j = this.f372193c;
            C62910ar arVar = nVar.f372202c;
            C62948a.m95465p(arVar);
            long j2 = arVar.f169860a;
            this.f372191a = 1;
            C60870cx a = hVar.f372183a.mo45937a(new C136725c(j - j2));
            C69664n.m101060f(a, "timestamp: Long) {\n    d…stamp.toString())\n      }");
            Object c = C71663i.m104690c(a, this);
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
        return new C136733k(this.f372192b, this.f372193c, gVar);
    }
}
