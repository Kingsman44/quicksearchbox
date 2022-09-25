package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b;

import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.verticals.ambient.smartspace.crossdevicetimer.wholehome.TimersWholeHomeChannel$wipeTimersInGeller$2", mo61344c = "TimersWholeHomeChannel.kt", mo61345d = "invokeSuspend", mo61346e = {341})
/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.aj */
/* compiled from: PG */
final class C131613aj extends C69572j implements C69626l {

    /* renamed from: a */
    int f359604a;

    /* renamed from: b */
    final /* synthetic */ C131614ak f359605b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C131613aj(C131614ak akVar, C69577g gVar) {
        super(1, gVar);
        this.f359605b = akVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C131613aj(this.f359605b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f359604a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx a = this.f359605b.f359610d.mo104248a(C131614ak.f359606a);
            C69664n.m101060f(a, "aiaiDataSharer.deleteSharedData(CORPUS)");
            this.f359604a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
