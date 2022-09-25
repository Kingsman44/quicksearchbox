package com.google.android.libraries.notifications.platform.p2318f.p2322b.p2323a;

import androidx.work.impl.C4452ag;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2318f.p2322b.p2323a.p2324a.C30118a;
import com.google.android.libraries.notifications.platform.registration.AccountRepresentation;
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

@C69567e(mo61343b = "com.google.android.libraries.notifications.platform.internal.job.impl.GnpJobSchedulingApiImpl$cancel$2", mo61344c = "GnpJobSchedulingApiImpl.kt", mo61345d = "invokeSuspend", mo61346e = {137})
/* renamed from: com.google.android.libraries.notifications.platform.f.b.a.b */
/* compiled from: PG */
final class C30119b extends C69572j implements C69630p {

    /* renamed from: a */
    int f81468a;

    /* renamed from: b */
    final /* synthetic */ C30122e f81469b;

    /* renamed from: c */
    final /* synthetic */ int f81470c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30119b(C30122e eVar, int i, C69577g gVar) {
        super(2, gVar);
        this.f81469b = eVar;
        this.f81470c = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C30119b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f81468a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            String a = C30118a.m55954a((AccountRepresentation) null, this.f81470c);
            C30058b.m55789a("GnpWorkManagerJobSchedulingApiImpl", "Cancelling a scheduled work request for package [%s] with ID: %s, type: %s", this.f81469b.f81482a.getApplicationContext().getPackageName(), a, new Integer(this.f81470c));
            C60870cx a2 = C4452ag.m12686j(this.f81469b.f81482a).mo9328b(a).mo9320a();
            C69664n.m101060f(a2, "getInstance(context).can…lUniqueWork(jobId).result");
            this.f81468a = 1;
            obj = C71663i.m104690c(a2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C30119b(this.f81469b, this.f81470c, gVar);
    }
}
