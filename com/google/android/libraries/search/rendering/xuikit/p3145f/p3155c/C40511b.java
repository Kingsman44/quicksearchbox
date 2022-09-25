package com.google.android.libraries.search.rendering.xuikit.p3145f.p3155c;

import com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40527m;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.p4283bv.p4287b.p4342b.C56943g;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57827x;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.rendering.xuikit.xblend.dataservice.XBlendDataService$getDataSource$1", mo61344c = "XBlendDataService.kt", mo61345d = "invokeSuspend", mo61346e = {114})
/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.c.b */
/* compiled from: PG */
public final class C40511b extends C69572j implements C69626l {

    /* renamed from: a */
    Object f106292a;

    /* renamed from: b */
    Object f106293b;

    /* renamed from: c */
    int f106294c;

    /* renamed from: d */
    final /* synthetic */ C40514e f106295d;

    /* renamed from: e */
    final /* synthetic */ C40510a f106296e;

    /* renamed from: f */
    final /* synthetic */ C56943g f106297f;

    /* renamed from: g */
    final /* synthetic */ Locale f106298g;

    /* renamed from: h */
    final /* synthetic */ Optional f106299h;

    /* renamed from: i */
    final /* synthetic */ String f106300i = "AIzaSyAdpjYZYvdXHgEiolTuTqzS28omVuVmNBU";

    /* renamed from: j */
    final /* synthetic */ Map f106301j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40511b(C40514e eVar, C40510a aVar, C56943g gVar, Locale locale, Optional optional, Map map, C69577g gVar2) {
        super(1, gVar2);
        this.f106295d = eVar;
        this.f106296e = aVar;
        this.f106297f = gVar;
        this.f106298g = locale;
        this.f106299h = optional;
        this.f106301j = map;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C40511b(this.f106295d, this.f106296e, this.f106297f, this.f106298g, this.f106299h, this.f106301j, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f106294c != 0) {
            obj3 = this.f106293b;
            Object obj4 = this.f106292a;
            C69714l.m101134b(obj);
            obj2 = obj4;
        } else {
            C69714l.m101134b(obj);
            C40514e eVar = this.f106295d;
            C40510a aVar2 = this.f106296e;
            C40527m mVar = eVar.f106309e;
            C56943g gVar = this.f106297f;
            Locale locale = this.f106298g;
            Optional optional = this.f106299h;
            String str = this.f106300i;
            Map map = this.f106301j;
            this.f106292a = eVar;
            this.f106293b = aVar2;
            this.f106294c = 1;
            Object a = mVar.mo42488a(gVar, locale, optional, str, map, this);
            if (a == aVar) {
                return aVar;
            }
            obj3 = aVar2;
            obj = a;
            obj2 = eVar;
        }
        C46690ah ahVar = C40514e.f106305a;
        ((C40514e) obj2).mo42483b((C40510a) obj3, (C57827x) obj);
        return C69788q.f186170a;
    }
}
