package com.google.android.apps.search.googleapp.discover.streamui.impl;

import com.google.android.apps.search.googleapp.discover.p10173aa.C134074r;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamui.impl.DiscoverStreamFragmentPeer$onFeedHide$2", mo61344c = "DiscoverStreamFragmentPeer.kt", mo61345d = "invokeSuspend", mo61346e = {984})
/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.x */
/* compiled from: PG */
final class C134919x extends C69572j implements C69630p {

    /* renamed from: a */
    int f367351a;

    /* renamed from: b */
    final /* synthetic */ C134074r f367352b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134919x(C134074r rVar, C69577g gVar) {
        super(2, gVar);
        this.f367352b = rVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134919x) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367351a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134074r rVar = this.f367352b;
            this.f367351a = 1;
            if (rVar.mo111512a(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134919x(this.f367352b, gVar);
    }
}
