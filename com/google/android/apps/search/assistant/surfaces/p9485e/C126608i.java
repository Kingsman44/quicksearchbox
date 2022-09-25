package com.google.android.apps.search.assistant.surfaces.p9485e;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126377ae;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126379ag;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126382aj;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126385am;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126403s;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126404t;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71471ab;
import kotlinx.coroutines.p5574b.C71498bb;
import kotlinx.coroutines.p5574b.C71552db;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.VoiceSearchGrpcImpl$Connection$consumeAndCloseMicrophone$2$2$2", mo61344c = "VoiceSearchGrpcImpl.kt", mo61345d = "invokeSuspend", mo61346e = {228})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.i */
/* compiled from: PG */
final class C126608i extends C69572j implements C69630p {

    /* renamed from: a */
    int f348659a;

    /* renamed from: b */
    final /* synthetic */ C126404t f348660b;

    /* renamed from: c */
    final /* synthetic */ C126621v f348661c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126608i(C126404t tVar, C126621v vVar, C69577g gVar) {
        super(2, gVar);
        this.f348660b = tVar;
        this.f348661c = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126608i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348659a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C126404t tVar = this.f348660b;
            C71587n a = C71498bb.m104325a(tVar.f348146a.f348071a, new C126403s((C69577g) null));
            C126377ae aeVar = tVar.f348147b;
            C69664n.m101061g(aeVar, "config");
            C69664n.m101061g(aeVar, "config");
            C71587n a2 = C71471ab.m104286a(new C71552db(new C126385am(new C71552db(new C126382aj(a, new C126379ag(), (C69577g) null)), (int) (aeVar.f348084a.toMillis() / 20), (C69577g) null)));
            C126607h hVar = new C126607h(this.f348661c);
            this.f348659a = 1;
            if (a2.mo38165mp(hVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126608i(this.f348660b, this.f348661c, gVar);
    }
}
