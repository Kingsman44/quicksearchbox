package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9778l;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4580v.p4582b.C60942a;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.shared.TimeoutHandler$restart$1", mo61344c = "TimeoutHandler.kt", mo61345d = "invokeSuspend", mo61346e = {36})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.l.a */
/* compiled from: PG */
public final class C128947a extends C69572j implements C69630p {

    /* renamed from: a */
    int f354326a;

    /* renamed from: b */
    final /* synthetic */ C128948b f354327b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128947a(C128948b bVar, C69577g gVar) {
        super(2, gVar);
        this.f354327b = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128947a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f354326a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Duration duration = this.f354327b.f354330c;
            this.f354326a = 1;
            if (C60942a.m93084b(duration, this) == aVar) {
                return aVar;
            }
        }
        C59052c cVar = (C59052c) C128948b.f354328a.mo56224b();
        Duration duration2 = this.f354327b.f354330c;
        cVar.mo56379ah(new C59094n(38066));
        cVar.mo56389s("Timeout(%s) reached. Invoking timeout callback.", duration2);
        this.f354327b.f354331d.mo5672a();
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C128947a(this.f354327b, gVar);
    }
}
