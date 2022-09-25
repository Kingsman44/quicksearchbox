package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import com.google.apps.tiktok.concurrent.C46459k;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69663m;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.ap */
/* compiled from: PG */
final /* synthetic */ class C121767ap extends C69663m implements C69615a {
    public C121767ap(Object obj) {
        super(0, obj, C121769ar.class, "handleEagerSessionTimeout", "handleEagerSessionTimeout()V", 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        C121769ar arVar = (C121769ar) this.f186034c;
        if (arVar.f337931d.cancel(false)) {
            C46459k.m82829b(C71663i.m104692e(arVar.f337930c, (C71424ay) null, new C121768aq(arVar, (C69577g) null), 3), "Failure handling eager session handover timeout.", new Object[0]);
        }
        return C69788q.f186170a;
    }
}
