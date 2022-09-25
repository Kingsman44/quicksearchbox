package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd;
import java.util.UUID;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.RequestConfigBuilder$buildSecondScreenRequestConfig$requestMaker$2$1", mo61344c = "RequestConfigBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {205, 206})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.ew */
/* compiled from: PG */
final class C135076ew extends C69572j implements C69630p {

    /* renamed from: a */
    int f367881a;

    /* renamed from: b */
    final /* synthetic */ C135086ff f367882b;

    /* renamed from: c */
    final /* synthetic */ C57303dd f367883c;

    /* renamed from: d */
    final /* synthetic */ UUID f367884d;

    /* renamed from: e */
    final /* synthetic */ C57259bn f367885e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135076ew(C135086ff ffVar, C57303dd ddVar, UUID uuid, C57259bn bnVar, C69577g gVar) {
        super(2, gVar);
        this.f367882b = ffVar;
        this.f367883c = ddVar;
        this.f367884d = uuid;
        this.f367885e = bnVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135076ew) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f367881a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C47633f b = this.f367882b.mo112121b(C135022cx.SECOND_SCREEN, this.f367883c);
            this.f367881a = 1;
            if (C71663i.m104690c(b, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
        }
        C135086ff ffVar = this.f367882b;
        C134980bl blVar = ffVar.f367918c;
        C57303dd ddVar = this.f367883c;
        String str = ffVar.f367921f;
        UUID uuid = this.f367884d;
        C57259bn bnVar = this.f367885e;
        this.f367881a = 2;
        obj = blVar.mo112097a(ddVar, str, uuid, bnVar, this);
        return obj == aVar ? aVar : obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135076ew(this.f367882b, this.f367883c, this.f367884d, this.f367885e, gVar);
    }
}
