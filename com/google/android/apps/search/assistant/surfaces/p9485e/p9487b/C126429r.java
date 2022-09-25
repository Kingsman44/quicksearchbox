package com.google.android.apps.search.assistant.surfaces.p9485e.p9487b;

import kotlinx.coroutines.p5574b.C71498bb;
import kotlinx.coroutines.p5574b.C71506bj;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.endpointer.EndpointerMerger$merge$1", mo61344c = "EndpointerMerger.kt", mo61345d = "invokeSuspend", mo61346e = {43, 83, 86, 88})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.b.r */
/* compiled from: PG */
public final class C126429r extends C69572j implements C69630p {

    /* renamed from: a */
    Object f348203a;

    /* renamed from: b */
    Object f348204b;

    /* renamed from: c */
    Object f348205c;

    /* renamed from: d */
    int f348206d;

    /* renamed from: e */
    final /* synthetic */ C71587n f348207e;

    /* renamed from: f */
    final /* synthetic */ C71587n f348208f;

    /* renamed from: g */
    final /* synthetic */ C126430s f348209g;

    /* renamed from: h */
    private /* synthetic */ Object f348210h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126429r(C71587n nVar, C71587n nVar2, C126430s sVar, C69577g gVar) {
        super(2, gVar);
        this.f348207e = nVar;
        this.f348208f = nVar2;
        this.f348209g = sVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126429r) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71588o oVar;
        Object obj2;
        Object obj3;
        Object obj4;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f348206d;
        if (i == 0) {
            C69714l.m101134b(obj);
            C71588o oVar2 = (C71588o) this.f348210h;
            C69648ae aeVar = new C69648ae();
            aeVar.f186027a = C126419h.INITIAL;
            C69648ae aeVar2 = new C69648ae();
            aeVar2.f186027a = Duration.ZERO;
            C69648ae aeVar3 = new C69648ae();
            aeVar3.f186027a = Duration.ZERO;
            C69648ae aeVar4 = new C69648ae();
            Optional empty = Optional.empty();
            C69664n.m101060f(empty, "empty<Event>()");
            aeVar4.f186027a = empty;
            C126430s sVar = this.f348209g;
            C126428q qVar = new C126428q(sVar);
            C126427p pVar = new C126427p(aeVar2, sVar);
            C126423l lVar = r7;
            C71587n a = C71498bb.m104325a(C71506bj.m104338d(this.f348207e, new C126426o(this.f348208f)), new C126420i(aeVar, (C69577g) null));
            C69648ae aeVar5 = aeVar4;
            C69648ae aeVar6 = aeVar3;
            C126423l lVar2 = new C126423l(aeVar, qVar, aeVar4, pVar, aeVar2, aeVar3, oVar2);
            this.f348210h = oVar2;
            this.f348203a = aeVar;
            this.f348204b = aeVar6;
            this.f348205c = aeVar5;
            this.f348206d = 1;
            if (a.mo38165mp(lVar, this) == aVar) {
                return aVar;
            }
            oVar = oVar2;
            obj3 = aeVar6;
            obj4 = aeVar5;
            obj2 = aeVar;
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            obj4 = this.f348205c;
            obj3 = this.f348204b;
            obj2 = this.f348203a;
            oVar = (C71588o) this.f348210h;
            C69714l.m101134b(obj);
        }
        C126419h hVar = C126419h.INITIAL;
        int ordinal = ((C126419h) ((C69648ae) obj2).f186027a).ordinal();
        if (ordinal == 0) {
            Object obj5 = ((C69648ae) obj3).f186027a;
            C69664n.m101060f(obj5, "lastOfflineProgressOffset");
            C126415d dVar = new C126415d((Duration) obj5);
            this.f348210h = null;
            this.f348203a = null;
            this.f348204b = null;
            this.f348205c = null;
            this.f348206d = 2;
            if (oVar.mo20883a(dVar, this) == aVar) {
                return aVar;
            }
        } else if (ordinal == 1) {
            C69648ae aeVar7 = (C69648ae) obj4;
            if (((Optional) aeVar7.f186027a).isPresent()) {
                Object obj6 = ((Optional) aeVar7.f186027a).get();
                C69664n.m101060f(obj6, "offlineSpeechEndEvent.get()");
                this.f348210h = null;
                this.f348203a = null;
                this.f348204b = null;
                this.f348205c = null;
                this.f348206d = 3;
                if (oVar.mo20883a(obj6, this) == aVar) {
                    return aVar;
                }
            } else {
                Object obj7 = ((C69648ae) obj3).f186027a;
                C69664n.m101060f(obj7, "lastOfflineProgressOffset");
                C126412a aVar2 = new C126412a((Duration) obj7);
                this.f348210h = null;
                this.f348203a = null;
                this.f348204b = null;
                this.f348205c = null;
                this.f348206d = 4;
                if (oVar.mo20883a(aVar2, this) == aVar) {
                    return aVar;
                }
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C126429r rVar = new C126429r(this.f348207e, this.f348208f, this.f348209g, gVar);
        rVar.f348210h = obj;
        return rVar;
    }
}
