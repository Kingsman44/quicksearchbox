package com.google.android.apps.search.podcasts.p10573k.p10575b;

import android.content.Context;
import com.google.android.apps.search.podcasts.p10576l.C140494f;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.k.b.b */
/* compiled from: PG */
final class C140435b extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140436c f381474a;

    /* renamed from: b */
    final /* synthetic */ Context f381475b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140435b(C140436c cVar, Context context) {
        super(1);
        this.f381474a = cVar;
        this.f381475b = context;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            C59052c cVar = (C59052c) C140436c.f381476a.mo56224b();
            cVar.mo56379ah(new C59094n(41622));
            cVar.mo56386p("New episode notifications not enabled for any shows.");
            return C60856cj.m92898g();
        }
        C60870cx d = this.f381474a.f381477b.f381594a.mo46042d();
        C69664n.m101060f(d, "devicePreferencesStore.data");
        return C140989k.m228944b(C140989k.m228944b(d, C140494f.f381591a), new C140434a(this.f381475b, this.f381474a));
    }
}
