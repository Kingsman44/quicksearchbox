package com.google.android.apps.search.googleapp.search.srp.p10433c;

import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.apps.search.googleapp.p10257g.C135419aj;
import com.google.android.apps.search.googleapp.p10257g.C135420ak;
import com.google.android.apps.search.googleapp.p10257g.C135423an;
import com.google.android.apps.search.googleapp.p10257g.C135431f;
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

/* renamed from: com.google.android.apps.search.googleapp.search.srp.c.h */
/* compiled from: PG */
public final class C137742h extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C47423c f374698a;

    /* renamed from: b */
    final /* synthetic */ C137737d f374699b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137742h(C47423c cVar, C137737d dVar) {
        super(1);
        this.f374698a = cVar;
        this.f374699b = dVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        Object obj2;
        C47423c cVar = this.f374698a;
        C46623be beVar = (C46623be) obj;
        if (beVar instanceof C46615ax) {
            cVar.mo51261a(C135423an.f368947a);
        } else if (beVar instanceof C46617az) {
            C46617az azVar = (C46617az) beVar;
            if (C69664n.m101066l(azVar.f121814a, C6617d.f19649y)) {
                obj2 = C135423an.f368947a;
            } else {
                obj2 = C135420ak.m219576a((C6617d) azVar.f121814a, C133933a.m217248a(this.f374699b.f374673b), C135419aj.MEDIUM, (C135431f) null);
            }
            cVar.mo51261a(obj2);
        } else if (beVar instanceof C46614aw) {
            C59052c cVar2 = (C59052c) ((C59052c) C137737d.f374672a.mo56226d()).mo56382g(((C46614aw) beVar).f121811a);
            cVar2.mo56379ah(new C59094n(41040));
            cVar2.mo56386p("Failed to load doodle metadata.");
        }
        return C69788q.f186170a;
    }
}
