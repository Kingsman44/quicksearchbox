package com.google.android.apps.search.googleapp.discover.channels;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.channels.ChannelsDataService$unfollowChannel$1", mo61344c = "ChannelsDataService.kt", mo61345d = "invokeSuspend", mo61346e = {59})
/* renamed from: com.google.android.apps.search.googleapp.discover.channels.aw */
/* compiled from: PG */
final class C134134aw extends C69572j implements C69630p {

    /* renamed from: a */
    int f365391a;

    /* renamed from: b */
    final /* synthetic */ C134139ba f365392b;

    /* renamed from: c */
    final /* synthetic */ C134150bl f365393c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134134aw(C134139ba baVar, C134150bl blVar, C69577g gVar) {
        super(2, gVar);
        this.f365392b = baVar;
        this.f365393c = blVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134134aw) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365391a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134139ba baVar = this.f365392b;
            C71604be c = C71803m.m105042c(baVar.f365410c, (C69585o) null, (C71424ay) null, new C134132au(baVar, this.f365393c, (C69577g) null), 3);
            C134150bl blVar = this.f365393c;
            C134133av avVar = C134133av.f365390a;
            this.f365391a = 1;
            obj = baVar.mo111580d(c, blVar, avVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134134aw(this.f365392b, this.f365393c, gVar);
    }
}
