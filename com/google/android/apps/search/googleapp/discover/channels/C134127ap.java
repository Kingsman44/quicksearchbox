package com.google.android.apps.search.googleapp.discover.channels;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.channels.ChannelsCacheUpdater$updateLocallyFromJava$1", mo61344c = "ChannelsCacheUpdater.kt", mo61345d = "invokeSuspend", mo61346e = {65})
/* renamed from: com.google.android.apps.search.googleapp.discover.channels.ap */
/* compiled from: PG */
final class C134127ap extends C69572j implements C69630p {

    /* renamed from: a */
    int f365371a;

    /* renamed from: b */
    final /* synthetic */ C134128aq f365372b;

    /* renamed from: c */
    final /* synthetic */ C134150bl f365373c;

    /* renamed from: d */
    final /* synthetic */ C134144bf f365374d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134127ap(C134128aq aqVar, C134150bl blVar, C134144bf bfVar, C69577g gVar) {
        super(2, gVar);
        this.f365372b = aqVar;
        this.f365373c = blVar;
        this.f365374d = bfVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134127ap) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365371a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134128aq aqVar = this.f365372b;
            C134150bl blVar = this.f365373c;
            C134144bf bfVar = this.f365374d;
            this.f365371a = 1;
            if (aqVar.mo111576a(blVar, bfVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134127ap(this.f365372b, this.f365373c, this.f365374d, gVar);
    }
}
