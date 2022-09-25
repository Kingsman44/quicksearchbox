package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37422c;
import com.google.android.libraries.search.p2904c.p2906aa.C37328c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.C71486aq;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71590q;
import kotlinx.coroutines.p5574b.C71594u;
import kotlinx.coroutines.p5574b.C71598y;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.service.impl.StreamListeningSessionResponseSender$sendAudioBytesReceiverRegistry$2", mo61344c = "StreamListeningSessionResponseSender.kt", mo61345d = "invokeSuspend", mo61346e = {197})
/* renamed from: com.google.android.libraries.search.c.x.a.aj */
/* compiled from: PG */
final class C38172aj extends C69572j implements C69630p {

    /* renamed from: a */
    int f101154a;

    /* renamed from: b */
    final /* synthetic */ C37422c f101155b;

    /* renamed from: c */
    final /* synthetic */ C38181as f101156c;

    /* renamed from: d */
    private /* synthetic */ Object f101157d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38172aj(C37422c cVar, C38181as asVar, C69577g gVar) {
        super(2, gVar);
        this.f101155b = cVar;
        this.f101156c = asVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C38172aj) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f101154a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C58976aa aaVar = C58975e.f156826a;
            C37422c cVar = this.f101155b;
            Executor executor = this.f101156c.f101188c;
            C69664n.m101061g(cVar, "<this>");
            C71587n b = C71486aq.m104308b(C71536cm.m104384b(C71598y.m104522b(C71598y.m104521a(C71590q.m104504a(new C37328c(cVar, executor, (C69577g) null)), Integer.MAX_VALUE, C71387t.SUSPEND)), new C38170ah(this.f101156c, (C71422aw) this.f101157d, (C69577g) null)), new C38171ai(this.f101156c, (C69577g) null));
            this.f101154a = 1;
            if (C71594u.m104514a(b, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C38172aj ajVar = new C38172aj(this.f101155b, this.f101156c, gVar);
        ajVar.f101157d = obj;
        return ajVar;
    }
}
