package com.google.android.apps.search.assistant.surfaces.p9485e;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126395k;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126404t;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9487b.C126429r;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9487b.C126430s;
import com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32586k;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5574b.C71498bb;
import kotlinx.coroutines.p5574b.C71552db;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71592s;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.VoiceSearchGrpcImpl$Connection$consumeAndCloseMicrophone$2$2$3", mo61344c = "VoiceSearchGrpcImpl.kt", mo61345d = "invokeSuspend", mo61346e = {243})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.n */
/* compiled from: PG */
final class C126613n extends C69572j implements C69630p {

    /* renamed from: a */
    int f348668a;

    /* renamed from: b */
    final /* synthetic */ C126621v f348669b;

    /* renamed from: c */
    final /* synthetic */ C71389v f348670c;

    /* renamed from: d */
    final /* synthetic */ C126404t f348671d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126613n(C126621v vVar, C71389v vVar2, C126404t tVar, C69577g gVar) {
        super(2, gVar);
        this.f348669b = vVar;
        this.f348670c = vVar2;
        this.f348671d = tVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126613n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348668a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C126430s sVar = this.f348669b.f348702g;
            C71587n d = C71592s.m104510d(this.f348670c);
            C126404t tVar = this.f348671d;
            C71552db dbVar = new C71552db(new C126429r(d, new C71552db(new C32586k(tVar.f348149d, C71498bb.m104325a(tVar.f348146a.f348071a, new C126395k((C69577g) null)), (C69577g) null)), sVar, (C69577g) null));
            C126612m mVar = new C126612m(this.f348669b, this.f348671d, this.f348670c);
            this.f348668a = 1;
            if (dbVar.mo38165mp(mVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126613n(this.f348669b, this.f348670c, this.f348671d, gVar);
    }
}
