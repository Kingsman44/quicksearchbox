package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.p3126a;

import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40111d;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40527m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4287b.p4342b.C56943g;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57827x;
import java.util.HashMap;
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
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.rendering.xuikit.bubbles.ui.container.dataservice.XBubbleDataService$getDataSource$1", mo61344c = "XBubbleDataService.kt", mo61345d = "invokeSuspend", mo61346e = {75})
/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.a.f */
/* compiled from: PG */
public final class C40188f extends C69572j implements C69626l {

    /* renamed from: a */
    Object f105573a;

    /* renamed from: b */
    Object f105574b;

    /* renamed from: c */
    int f105575c;

    /* renamed from: d */
    final /* synthetic */ C40190h f105576d;

    /* renamed from: e */
    final /* synthetic */ C40111d f105577e;

    /* renamed from: f */
    final /* synthetic */ C56943g f105578f;

    /* renamed from: g */
    final /* synthetic */ Locale f105579g;

    /* renamed from: h */
    final /* synthetic */ Optional f105580h;

    /* renamed from: i */
    final /* synthetic */ String f105581i = "AIzaSyAdpjYZYvdXHgEiolTuTqzS28omVuVmNBU";

    /* renamed from: j */
    final /* synthetic */ Map f105582j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40188f(C40190h hVar, C40111d dVar, C56943g gVar, Locale locale, Optional optional, Map map, C69577g gVar2) {
        super(1, gVar2);
        this.f105576d = hVar;
        this.f105577e = dVar;
        this.f105578f = gVar;
        this.f105579g = locale;
        this.f105580h = optional;
        this.f105582j = map;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C40188f(this.f105576d, this.f105577e, this.f105578f, this.f105579g, this.f105580h, this.f105582j, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f105575c != 0) {
            obj3 = this.f105574b;
            Object obj4 = this.f105573a;
            C69714l.m101134b(obj);
            obj2 = obj4;
        } else {
            C69714l.m101134b(obj);
            C40190h hVar = this.f105576d;
            Object obj5 = hVar.f105587c;
            C40111d dVar = this.f105577e;
            C40527m mVar = hVar.f105588d;
            C56943g gVar = this.f105578f;
            Locale locale = this.f105579g;
            Optional optional = this.f105580h;
            String str = this.f105581i;
            Map map = this.f105582j;
            this.f105573a = obj5;
            this.f105574b = dVar;
            this.f105575c = 1;
            obj = mVar.mo42488a(gVar, locale, optional, str, map, this);
            if (obj == aVar) {
                return aVar;
            }
            obj3 = dVar;
            obj2 = obj5;
        }
        C57827x xVar = (C57827x) obj;
        C69664n.m101061g(obj3, "bubbleId");
        C69664n.m101061g(xVar, "response");
        synchronized (((C40183a) obj2).f105565c) {
            if (((C40183a) obj2).f105566d.containsKey(obj3)) {
                HashMap hashMap = ((C40183a) obj2).f105566d;
                Optional of = Optional.m71637of(xVar);
                C69664n.m101060f(of, "of(response)");
                hashMap.put(obj3, of);
            } else {
                C59052c cVar = (C59052c) C40183a.f105563a.mo56226d();
                cVar.mo56378ag(C40364q.f106014a, ((C40183a) obj2).f105564b.mo42422a());
                cVar.mo56379ah(new C59094n(53287));
                cVar.mo56386p("Bubble response comes back after the Bubble has been removed.");
            }
        }
        return C69788q.f186170a;
    }
}
