package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd;
import java.util.UUID;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestConfigBuilder$buildBackgroundFeedRequestConfig$requestMaker$2$1", mo61344c = "RequestConfigBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {405})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.eb */
/* compiled from: PG */
final class C135055eb extends C69572j implements C69630p {

    /* renamed from: a */
    int f367796a;

    /* renamed from: b */
    final /* synthetic */ C135086ff f367797b;

    /* renamed from: c */
    final /* synthetic */ C57303dd f367798c;

    /* renamed from: d */
    final /* synthetic */ UUID f367799d;

    /* renamed from: e */
    final /* synthetic */ C57259bn f367800e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135055eb(C135086ff ffVar, C57303dd ddVar, UUID uuid, C57259bn bnVar, C69577g gVar) {
        super(2, gVar);
        this.f367797b = ffVar;
        this.f367798c = ddVar;
        this.f367799d = uuid;
        this.f367800e = bnVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135055eb) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367796a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135086ff ffVar = this.f367797b;
            C134980bl blVar = ffVar.f367918c;
            C57303dd ddVar = this.f367798c;
            String str = ffVar.f367922g;
            UUID uuid = this.f367799d;
            C57259bn bnVar = this.f367800e;
            this.f367796a = 1;
            obj = blVar.mo112097a(ddVar, str, uuid, bnVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135055eb(this.f367797b, this.f367798c, this.f367799d, this.f367800e, gVar);
    }
}
