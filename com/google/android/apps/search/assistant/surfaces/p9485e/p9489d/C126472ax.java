package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9490a.C126446f;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9490a.C126448h;
import com.google.android.libraries.assistant.p1533o.C18460aw;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5573a.C71367au;
import kotlinx.coroutines.p5574b.C71486aq;
import kotlinx.coroutines.p5574b.C71521by;
import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71561dk;
import kotlinx.coroutines.p5574b.C71562dl;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71590q;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69644aa;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.Network$run$2", mo61344c = "Network.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.ax */
/* compiled from: PG */
public final class C126472ax extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C126473ay f348312a;

    /* renamed from: b */
    final /* synthetic */ C18460aw f348313b;

    /* renamed from: c */
    final /* synthetic */ C71604be f348314c;

    /* renamed from: d */
    final /* synthetic */ C71367au f348315d;

    /* renamed from: e */
    private /* synthetic */ Object f348316e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126472ax(C126473ay ayVar, C18460aw awVar, C71604be beVar, C71367au auVar, C69577g gVar) {
        super(2, gVar);
        this.f348312a = ayVar;
        this.f348313b = awVar;
        this.f348314c = beVar;
        this.f348315d = auVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126472ax) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C71422aw awVar = (C71422aw) this.f348316e;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C69644aa aaVar = new C69644aa();
        C126473ay ayVar = this.f348312a;
        C126449aa a = ayVar.f348324h.mo107630a(atomicBoolean, ayVar.f348319c, ayVar.f348318b, ayVar.f348321e, this.f348313b);
        C71604be beVar = this.f348314c;
        C126473ay ayVar2 = this.f348312a;
        C126454af afVar = new C126454af(beVar, ayVar2.f348321e);
        C126471aw awVar2 = new C126471aw(atomicBoolean, aaVar, ayVar2, (C69577g) null);
        C126448h hVar = new C126448h(this.f348312a.f348323g);
        C69664n.m101061g(a, "initialRequestProvider");
        C71587n c = C71486aq.m104309c(C71590q.m104504a(new C126446f(hVar, a, afVar, (C69577g) null)), 2, awVar2);
        int i = C71562dl.f190976a;
        C71553dc b = C71521by.m104364b(c, awVar, C71561dk.f190974a, Integer.MAX_VALUE);
        C71604be c2 = C71803m.m105042c(awVar, (C69585o) null, (C71424ay) null, new C126470av(this.f348312a, b, this.f348314c, (C69577g) null), 3);
        C126473ay ayVar3 = this.f348312a;
        C71604be d = C71663i.m104691d(ayVar3.f348328l.a(ayVar3.f348322f).mo104333a(this.f348313b));
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C126457ai(d, this.f348312a, (C69577g) null), 3);
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C126459ak(b, aaVar, (C69577g) null), 3);
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C126461am(c2, this.f348312a, (C69577g) null), 3);
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C126463ao(b, this.f348315d, (C69577g) null), 3);
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C126465aq(this.f348312a, b, d, c2, (C69577g) null), 3);
        return C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C126467as(this.f348312a, b, (C69577g) null), 3);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C126472ax axVar = new C126472ax(this.f348312a, this.f348313b, this.f348314c, this.f348315d, gVar);
        axVar.f348316e = obj;
        return axVar;
    }
}
