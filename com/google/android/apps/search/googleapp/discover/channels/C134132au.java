package com.google.android.apps.search.googleapp.discover.channels;

import com.google.p4017at.p4027c.p4028a.p4029a.C53835aa;
import com.google.p4017at.p4027c.p4028a.p4029a.C53850j;
import com.google.p4017at.p4027c.p4028a.p4029a.C53866z;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.channels.ChannelsDataService$unfollowChannel$1$1", mo61344c = "ChannelsDataService.kt", mo61345d = "invokeSuspend", mo61346e = {63})
/* renamed from: com.google.android.apps.search.googleapp.discover.channels.au */
/* compiled from: PG */
final class C134132au extends C69572j implements C69630p {

    /* renamed from: a */
    int f365387a;

    /* renamed from: b */
    final /* synthetic */ C134139ba f365388b;

    /* renamed from: c */
    final /* synthetic */ C134150bl f365389c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134132au(C134139ba baVar, C134150bl blVar, C69577g gVar) {
        super(2, gVar);
        this.f365388b = baVar;
        this.f365389c = blVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134132au) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365387a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134139ba baVar = this.f365388b;
            C53866z zVar = (C53866z) C53835aa.f141299b.createBuilder();
            String str = this.f365389c.f365439b;
            zVar.copyOnWrite();
            str.getClass();
            ((C53835aa) zVar.instance).f141301a = str;
            C62942bv build = zVar.build();
            C69664n.m101060f(build, "newBuilder().setName(cli…annelLookup.name).build()");
            this.f365387a = 1;
            obj = ((C53850j) baVar.f365413f.mo112085a(baVar.f365409b)).mo54031c((C53835aa) build, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134132au(this.f365388b, this.f365389c, gVar);
    }
}
