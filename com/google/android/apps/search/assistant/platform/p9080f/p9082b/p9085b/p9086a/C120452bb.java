package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5573a.C71392y;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.focus.impl.PolicyRunner$runTasks$2", mo61344c = "PolicyRunner.kt", mo61345d = "invokeSuspend", mo61346e = {87})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.bb */
/* compiled from: PG */
final class C120452bb extends C69572j implements C69630p {

    /* renamed from: a */
    int f335011a;

    /* renamed from: b */
    final /* synthetic */ C120441as f335012b;

    /* renamed from: c */
    private /* synthetic */ Object f335013c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120452bb(C120441as asVar, C69577g gVar) {
        super(2, gVar);
        this.f335012b = asVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120452bb) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335011a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71389v a = C71392y.m104158a(0, (C71387t) null, 6);
            C71803m.m105043d((C71422aw) this.f335013c, (C69585o) null, (C71424ay) null, new C120451ba(this.f335012b, a, (C69577g) null), 3);
            C120432aj ajVar = this.f335012b.f334987a;
            this.f335011a = 1;
            Object a2 = C71423ax.m104196a(new C120431ai(a, ajVar, (C69577g) null), this);
            if (a2 != C69554a.COROUTINE_SUSPENDED) {
                a2 = C69788q.f186170a;
            }
            if (a2 == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120452bb bbVar = new C120452bb(this.f335012b, gVar);
        bbVar.f335013c = obj;
        return bbVar;
    }
}
