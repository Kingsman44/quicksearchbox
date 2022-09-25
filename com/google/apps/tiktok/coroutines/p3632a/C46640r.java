package com.google.apps.tiktok.coroutines.p3632a;

import com.google.apps.tiktok.coroutines.C46590a;
import com.google.apps.tiktok.coroutines.C46649b;
import com.google.apps.tiktok.coroutines.C46650c;
import p5462h.C69677g;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69663m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a.r */
/* compiled from: PG */
final /* synthetic */ class C46640r extends C69663m implements C69631q {

    /* renamed from: a */
    public static final C46640r f121890a = new C46640r();

    public C46640r() {
        super(3, C46642t.class, "reduceLocal", "reduceLocal(Lcom/google/apps/tiktok/coroutines/flow/LocalSnapshot;Lcom/google/apps/tiktok/coroutines/flow/LocalReadState;Z)Lcom/google/apps/tiktok/coroutines/flow/LocalSnapshot;", 1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        Object alVar;
        C46605an anVar = (C46605an) obj;
        C46598ag agVar = (C46598ag) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        C69664n.m101061g(anVar, "p0");
        C69664n.m101061g(agVar, "p1");
        if (agVar instanceof C46597af) {
            if (anVar instanceof C46600ai) {
                return new C46602ak((C46607ap) null);
            }
            if (anVar instanceof C46599ah) {
                alVar = new C46602ak(((C46599ah) anVar).f121788a);
            } else if (anVar instanceof C46602ak) {
                alVar = new C46602ak(((C46602ak) anVar).f121791a);
            } else if (anVar instanceof C46601aj) {
                alVar = new C46603al(((C46601aj) anVar).f121790a, (C46607ap) null);
            } else if (anVar instanceof C46604am) {
                C46604am amVar = (C46604am) anVar;
                alVar = new C46603al(amVar.f121794a, amVar.f121795b);
            } else if (anVar instanceof C46603al) {
                C46603al alVar2 = (C46603al) anVar;
                alVar = new C46603al(alVar2.f121792a, alVar2.f121793b);
            } else {
                throw new C69677g();
            }
        } else if (agVar instanceof C46596ae) {
            C46650c cVar = ((C46596ae) agVar).f121786a;
            if (cVar instanceof C46649b) {
                if (booleanValue) {
                    return new C46603al(cVar.mo50592a(), (C46607ap) null);
                }
                return new C46601aj(cVar.mo50592a());
            } else if (!(cVar instanceof C46590a)) {
                throw new C69677g();
            } else if (anVar instanceof C46600ai) {
                throw new C46608aq("Advanced from Idle to a failure with no intermediate state.");
            } else if (anVar instanceof C46599ah) {
                throw new C46608aq("Advanced from Failed to another failure with no intermediate state.");
            } else if (anVar instanceof C46602ak) {
                if (!booleanValue) {
                    return new C46599ah(new C46607ap("Local read failed.", ((C46590a) cVar).f121777a));
                }
                alVar = new C46602ak(((C46602ak) anVar).f121791a);
            } else if (anVar instanceof C46601aj) {
                throw new C46608aq("Advanced from Read to a failure with no intermediate state.");
            } else if (anVar instanceof C46604am) {
                throw new C46608aq("Advanced from StaleRead to a failure with no intermediate state.");
            } else if (!(anVar instanceof C46603al)) {
                throw new C69677g();
            } else if (!booleanValue) {
                return new C46604am(((C46603al) anVar).f121792a, new C46607ap("Local read failed.", ((C46590a) cVar).f121777a));
            } else {
                C46603al alVar3 = (C46603al) anVar;
                alVar = new C46603al(alVar3.f121792a, alVar3.f121793b);
            }
        } else {
            throw new C69677g();
        }
        return alVar;
    }
}
