package com.google.android.apps.search.googleapp.discover.streamui.impl;

import com.google.android.apps.search.googleapp.discover.p10248y.C135248bi;
import com.google.android.apps.search.googleapp.discover.p10248y.C135250bk;
import com.google.android.apps.search.googleapp.discover.p10249z.C135359p;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import java.util.UUID;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamui.impl.DiscoverStreamFragmentPeer$requestToken$1", mo61344c = "DiscoverStreamFragmentPeer.kt", mo61345d = "invokeSuspend", mo61346e = {1124})
/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.z */
/* compiled from: PG */
final class C134921z extends C69572j implements C69630p {

    /* renamed from: a */
    int f367354a;

    /* renamed from: b */
    final /* synthetic */ C134904m f367355b;

    /* renamed from: c */
    final /* synthetic */ C135359p f367356c;

    /* renamed from: d */
    final /* synthetic */ UUID f367357d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134921z(C134904m mVar, C135359p pVar, UUID uuid, C69577g gVar) {
        super(2, gVar);
        this.f367355b = mVar;
        this.f367356c = pVar;
        this.f367357d = uuid;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134921z) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367354a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134904m mVar = this.f367355b;
            C135250bk bkVar = mVar.f367264M;
            C135359p pVar = this.f367356c;
            UUID uuid = this.f367357d;
            C134766q qVar = mVar.f367265N;
            this.f367354a = 1;
            obj = C71803m.m105040a(bkVar.f368451e, new C135248bi(bkVar, pVar, uuid, qVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134921z(this.f367355b, this.f367356c, this.f367357d, gVar);
    }
}
