package com.google.android.apps.search.googleapp.p10257g;

import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.apps.tiktok.coroutines.p3632a.C46614aw;
import com.google.apps.tiktok.coroutines.p3632a.C46615ax;
import com.google.apps.tiktok.coroutines.p3632a.C46617az;
import com.google.apps.tiktok.coroutines.p3632a.C46623be;
import com.google.apps.tiktok.lifecycle.flow.C47423c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.p337aa.C6617d;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.g.k */
/* compiled from: PG */
public final class C135438k extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C47423c f368994a;

    /* renamed from: b */
    final /* synthetic */ C135435j f368995b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135438k(C47423c cVar, C135435j jVar) {
        super(1);
        this.f368994a = cVar;
        this.f368995b = jVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        Object obj2;
        C47423c cVar = this.f368994a;
        C46623be beVar = (C46623be) obj;
        if (beVar instanceof C46615ax) {
            cVar.mo51261a(C135423an.f368947a);
        } else if (beVar instanceof C46617az) {
            C46617az azVar = (C46617az) beVar;
            if (C69664n.m101066l(azVar.f121814a, C6617d.f19649y)) {
                obj2 = C135423an.f368947a;
            } else {
                obj2 = C135420ak.m219576a((C6617d) azVar.f121814a, C133933a.m217248a(this.f368995b.f368979g.getContext()), C135419aj.LARGE, this.f368995b.f368977e);
            }
            cVar.mo51261a(obj2);
        } else if (beVar instanceof C46614aw) {
            C59052c cVar2 = (C59052c) ((C59052c) C135435j.f368974b.mo56226d()).mo56382g(((C46614aw) beVar).f121811a);
            cVar2.mo56379ah(new C59094n(40560));
            cVar2.mo56386p("Failed to load doodle metadata.");
        }
        return C69788q.f186170a;
    }
}
