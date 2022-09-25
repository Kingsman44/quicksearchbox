package com.google.android.apps.search.googleapp.discover.channels;

import com.google.p4017at.p4027c.p4028a.p4029a.C53850j;
import com.google.p4017at.p4027c.p4028a.p4029a.C53854n;
import com.google.p4017at.p4027c.p4028a.p4029a.C53855o;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.channels.ChannelsDataService$followChannel$1$1", mo61344c = "ChannelsDataService.kt", mo61345d = "invokeSuspend", mo61346e = {45})
/* renamed from: com.google.android.apps.search.googleapp.discover.channels.ar */
/* compiled from: PG */
final class C134129ar extends C69572j implements C69630p {

    /* renamed from: a */
    int f365380a;

    /* renamed from: b */
    final /* synthetic */ C134139ba f365381b;

    /* renamed from: c */
    final /* synthetic */ C134150bl f365382c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134129ar(C134139ba baVar, C134150bl blVar, C69577g gVar) {
        super(2, gVar);
        this.f365381b = baVar;
        this.f365382c = blVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134129ar) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365380a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134139ba baVar = this.f365381b;
            C53854n nVar = (C53854n) C53855o.f141341b.createBuilder();
            String str = this.f365382c.f365439b;
            nVar.copyOnWrite();
            str.getClass();
            ((C53855o) nVar.instance).f141343a = str;
            C62942bv build = nVar.build();
            C69664n.m101060f(build, "newBuilder().setName(cli…annelLookup.name).build()");
            this.f365380a = 1;
            obj = ((C53850j) baVar.f365413f.mo112085a(baVar.f365409b)).mo54030b((C53855o) build, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134129ar(this.f365381b, this.f365382c, gVar);
    }
}
