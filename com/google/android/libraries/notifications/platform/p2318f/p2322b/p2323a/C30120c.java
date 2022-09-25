package com.google.android.libraries.notifications.platform.p2318f.p2322b.p2323a;

import androidx.work.C4395as;
import androidx.work.impl.C4452ag;
import com.google.android.libraries.notifications.platform.p2318f.p2322b.p2323a.p2324a.C30118a;
import com.google.android.libraries.notifications.platform.registration.AccountRepresentation;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collection;
import java.util.Iterator;
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

@C69567e(mo61343b = "com.google.android.libraries.notifications.platform.internal.job.impl.GnpJobSchedulingApiImpl$isScheduled$2", mo61344c = "GnpJobSchedulingApiImpl.kt", mo61345d = "invokeSuspend", mo61346e = {120})
/* renamed from: com.google.android.libraries.notifications.platform.f.b.a.c */
/* compiled from: PG */
final class C30120c extends C69572j implements C69630p {

    /* renamed from: a */
    int f81471a;

    /* renamed from: b */
    final /* synthetic */ C30122e f81472b;

    /* renamed from: c */
    final /* synthetic */ int f81473c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30120c(C30122e eVar, int i, C69577g gVar) {
        super(2, gVar);
        this.f81472b = eVar;
        this.f81473c = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C30120c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        boolean z = true;
        if (this.f81471a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx h = C4452ag.m12686j(this.f81472b.f81482a).mo9334h(C30118a.m55954a((AccountRepresentation) null, this.f81473c));
            C69664n.m101060f(h, "getInstance(context)\n   …Representation, jobType))");
            this.f81471a = 1;
            obj = C71663i.m104690c(h, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C69664n.m101060f(obj, "getInstance(context)\n   …obType))\n        .await()");
        Iterable iterable = (Iterable) obj;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C4395as) it.next()).f14027b.mo9323a()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C30120c(this.f81472b, this.f81473c, gVar);
    }
}
