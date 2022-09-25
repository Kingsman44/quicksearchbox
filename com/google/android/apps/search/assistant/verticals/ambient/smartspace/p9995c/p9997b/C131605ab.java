package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.C124182b;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.C124211d;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124186b;
import com.google.android.libraries.search.p2871b.p2872a.p2881i.C37197a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.verticals.ambient.smartspace.crossdevicetimer.wholehome.TimersWholeHomeChannel$createTorusConnectionAsync$1", mo61344c = "TimersWholeHomeChannel.kt", mo61345d = "invokeSuspend", mo61346e = {199, 208})
/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ab */
/* compiled from: PG */
final class C131605ab extends C69572j implements C69630p {

    /* renamed from: a */
    int f359567a;

    /* renamed from: b */
    final /* synthetic */ C131614ak f359568b;

    /* renamed from: c */
    final /* synthetic */ C124186b f359569c;

    /* renamed from: d */
    final /* synthetic */ C124182b f359570d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C131605ab(C131614ak akVar, C124186b bVar, C124182b bVar2, C69577g gVar) {
        super(2, gVar);
        this.f359568b = akVar;
        this.f359569c = bVar;
        this.f359570d = bVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C131605ab) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f359567a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C60870cx a = this.f359568b.f359616j.mo106379a();
            C69664n.m101060f(a, "usoniaModuleDownloader.d…oadUsoniaIfNotAvailable()");
            this.f359567a = 1;
            if (C71663i.m104690c(a, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            try {
                C69714l.m101134b(obj);
                C124211d dVar = (C124211d) obj;
                C59052c cVar = (C59052c) this.f359568b.f359611e.mo56224b();
                cVar.mo56379ah(new C59094n(39128));
                cVar.mo56386p("__SsXDeviceTimer__Step_2: Torus connection successfully created");
                this.f359568b.f359612f.mo19974a(C37197a.f98667c.mo40805c(C62722b.OK));
                return dVar;
            } catch (Throwable th) {
                C59052c cVar2 = (C59052c) ((C59052c) this.f359568b.f359611e.mo56225c()).mo56382g(th);
                cVar2.mo56379ah(new C59094n(39129));
                cVar2.mo56386p("Torus connection creation failed");
                this.f359568b.f359612f.mo19974a(C37197a.f98667c.mo40805c(C62722b.FAILED_PRECONDITION));
                return null;
            }
        } else {
            C69714l.m101134b(obj);
        }
        C59052c cVar3 = (C59052c) this.f359568b.f359611e.mo56224b();
        cVar3.mo56379ah(new C59094n(39127));
        cVar3.mo56386p("Usonia finished downloading (or was already available)");
        this.f359568b.f359612f.mo19974a(C37197a.f98666b);
        C131614ak akVar = this.f359568b;
        C60870cx a2 = akVar.f359608b.mo106322a(this.f359569c, this.f359570d, akVar.f359609c);
        C69664n.m101060f(a2, "crossDeviceConnectionFac…cks, lightweightExecutor)");
        this.f359567a = 2;
        obj = C71663i.m104690c(a2, this);
        if (obj == aVar) {
            return aVar;
        }
        C124211d dVar2 = (C124211d) obj;
        C59052c cVar4 = (C59052c) this.f359568b.f359611e.mo56224b();
        cVar4.mo56379ah(new C59094n(39128));
        cVar4.mo56386p("__SsXDeviceTimer__Step_2: Torus connection successfully created");
        this.f359568b.f359612f.mo19974a(C37197a.f98667c.mo40805c(C62722b.OK));
        return dVar2;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C131605ab(this.f359568b, this.f359569c, this.f359570d, gVar);
    }
}
