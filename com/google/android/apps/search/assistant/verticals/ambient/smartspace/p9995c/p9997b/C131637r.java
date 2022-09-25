package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.C124211d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32881e;
import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.verticals.ambient.smartspace.crossdevicetimer.wholehome.TimersWholeHomeChannel$2", mo61344c = "TimersWholeHomeChannel.kt", mo61345d = "invokeSuspend", mo61346e = {183})
/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.r */
/* compiled from: PG */
final class C131637r extends C69572j implements C69626l {

    /* renamed from: a */
    int f359677a;

    /* renamed from: b */
    final /* synthetic */ C71604be f359678b;

    /* renamed from: c */
    final /* synthetic */ C32881e f359679c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C131637r(C71604be beVar, C32881e eVar, C69577g gVar) {
        super(1, gVar);
        this.f359678b = beVar;
        this.f359679c = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C131637r(this.f359678b, this.f359679c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f359677a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be beVar = this.f359678b;
            this.f359677a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C124211d dVar = (C124211d) obj;
        if (dVar != null) {
            dVar.mo106320a();
        }
        this.f359679c.close();
        return C69788q.f186170a;
    }
}
