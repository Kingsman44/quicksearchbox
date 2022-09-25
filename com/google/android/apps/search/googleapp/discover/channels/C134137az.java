package com.google.android.apps.search.googleapp.discover.channels;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46776ct;
import com.google.apps.tiktok.dataservice.C46882v;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.channels.ChannelsDataService$updateFollowedState$2", mo61344c = "ChannelsDataService.kt", mo61345d = "invokeSuspend", mo61346e = {107})
/* renamed from: com.google.android.apps.search.googleapp.discover.channels.az */
/* compiled from: PG */
final class C134137az extends C69572j implements C69630p {

    /* renamed from: a */
    int f365400a;

    /* renamed from: b */
    final /* synthetic */ C134139ba f365401b;

    /* renamed from: c */
    final /* synthetic */ C134150bl f365402c;

    /* renamed from: d */
    final /* synthetic */ C71604be f365403d;

    /* renamed from: e */
    final /* synthetic */ C69626l f365404e;

    /* renamed from: f */
    private /* synthetic */ Object f365405f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134137az(C134139ba baVar, C134150bl blVar, C71604be beVar, C69626l lVar, C69577g gVar) {
        super(2, gVar);
        this.f365401b = baVar;
        this.f365402c = blVar;
        this.f365403d = beVar;
        this.f365404e = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134137az) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365400a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be c = C71803m.m105042c((C71422aw) this.f365405f, (C69585o) null, (C71424ay) null, new C134136ay(this.f365403d, this.f365401b, this.f365402c, this.f365404e, (C69577g) null), 3);
            C134139ba baVar = this.f365401b;
            C46459k kVar = baVar.f365412e;
            C46776ct ctVar = baVar.f365411d;
            C46882v vVar = new C46882v();
            vVar.f122320a = C71663i.m104688a(c);
            vVar.mo50886c(this.f365401b.mo111577a(this.f365402c).mo18088c());
            vVar.f122322c = new C134135ax(this.f365404e);
            C60870cx a = ctVar.mo50786a(vVar.mo50884a());
            kVar.mo50455c(a, C47831fm.m85015j());
            this.f365400a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C134137az azVar = new C134137az(this.f365401b, this.f365402c, this.f365403d, this.f365404e, gVar);
        azVar.f365405f = obj;
        return azVar;
    }
}
