package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b;

import com.google.android.apps.search.assistant.libraries.p8946b.p8948b.C119223f;
import com.google.android.libraries.geller.p1816d.C21774f;
import com.google.common.p4522b.C58479go;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.List;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.verticals.ambient.smartspace.crossdevicetimer.wholehome.TimersWholeHomeChannel$shareElementsToGeller$2", mo61344c = "TimersWholeHomeChannel.kt", mo61345d = "invokeSuspend", mo61346e = {334})
/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ah */
/* compiled from: PG */
final class C131611ah extends C69572j implements C69626l {

    /* renamed from: a */
    int f359599a;

    /* renamed from: b */
    final /* synthetic */ C131614ak f359600b;

    /* renamed from: c */
    final /* synthetic */ List f359601c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C131611ah(C131614ak akVar, List list, C69577g gVar) {
        super(1, gVar);
        this.f359600b = akVar;
        this.f359601c = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C131611ah(this.f359600b, this.f359601c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C60870cx cxVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f359599a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C119223f fVar = this.f359600b.f359610d;
            C65753ak akVar = C131614ak.f359606a;
            C58485gu b = C58479go.m89810b(this.f359601c);
            try {
                fVar.mo104251d();
                cxVar = fVar.mo104250c(akVar, C60856cj.m92900i(b));
            } catch (C21774f e) {
                cxVar = C60856cj.m92899h(e);
            }
            this.f359599a = 1;
            obj = C71663i.m104690c(cxVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
