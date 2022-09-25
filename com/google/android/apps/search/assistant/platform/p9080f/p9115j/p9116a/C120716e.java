package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9116a;

import com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.C120725a;
import com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.C120753e;
import com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.C120755g;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.ondevice.impl.OnDeviceStreamingController$processing$2$1$1", mo61344c = "OnDeviceStreamingController.kt", mo61345d = "invokeSuspend", mo61346e = {84, 85})
/* renamed from: com.google.android.apps.search.assistant.platform.f.j.a.e */
/* compiled from: PG */
final class C120716e extends C69572j implements C69630p {

    /* renamed from: a */
    int f335743a;

    /* renamed from: b */
    final /* synthetic */ C120723l f335744b;

    /* renamed from: c */
    final /* synthetic */ C120755g f335745c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120716e(C120723l lVar, C120755g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f335744b = lVar;
        this.f335745c = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120716e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f335743a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C120715d dVar = this.f335744b.f335769d;
            C60870cx e = C71663i.m104692e(dVar.f335740c, (C71424ay) null, new C120712a(((C120753e) this.f335745c).f335860a, dVar, (C69577g) null), 3);
            this.f335743a = 1;
            obj = C71663i.m104690c(e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        C71389v vVar = this.f335744b.f335772g;
        C120725a aVar2 = new C120725a((C58485gu) obj);
        this.f335743a = 2;
        if (vVar.mo62729v(aVar2, this) == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120716e(this.f335744b, this.f335745c, gVar);
    }
}
