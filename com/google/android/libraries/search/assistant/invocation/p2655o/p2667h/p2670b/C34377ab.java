package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.C34354a;
import com.google.android.libraries.search.assistant.p2697j.p2698a.C34743k;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71647ct;
import kotlinx.coroutines.p5574b.C71471ab;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69514bd;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.debug.ApaTriggeringDebugDataProvider$initialize$1$4", mo61344c = "ApaTriggeringDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.b.ab */
/* compiled from: PG */
final class C34377ab extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f91388a;

    /* renamed from: b */
    final /* synthetic */ C69648ae f91389b;

    /* renamed from: c */
    final /* synthetic */ C34382ag f91390c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34377ab(C69648ae aeVar, C34382ag agVar, C69577g gVar) {
        super(2, gVar);
        this.f91389b = aeVar;
        this.f91390c = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34377ab) mo5194c((C69685i) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C69685i iVar = (C69685i) this.f91388a;
        Set set = (Set) iVar.f186052a;
        Set set2 = (Set) iVar.f186053b;
        Set c = C69514bd.m100889c(set, set2);
        ArrayList<C34375a> arrayList = new ArrayList<>();
        for (Object next : (Iterable) this.f91389b.f186027a) {
            if (c.contains(((C34375a) next).f91385a)) {
                arrayList.add(next);
            }
        }
        for (C34375a aVar2 : arrayList) {
            C71647ct.m104639c(aVar2.f91386b, (CancellationException) null);
        }
        Set ab = C69540x.m100846ab(arrayList);
        C69648ae aeVar = this.f91389b;
        aeVar.f186027a = C69514bd.m100889c((Set) aeVar.f186027a, ab);
        Set<C34354a> c2 = C69514bd.m100889c(set2, set);
        C69648ae aeVar2 = this.f91389b;
        Set set3 = (Set) aeVar2.f186027a;
        C34382ag agVar = this.f91390c;
        ArrayList arrayList2 = new ArrayList(C69540x.m100804k(c2, 10));
        for (C34354a aVar3 : c2) {
            arrayList2.add(new C34375a(aVar3, C71594u.m104517d(C71477ah.m104295b(C71536cm.m104384b(C71471ab.m104287b(new C34398n(C71536cm.m104383a(C34743k.m63493d(C71471ab.m104286a(new C34395k(C71536cm.m104384b(aVar3.mo39323d(), new C34400p(aVar3, agVar, (C69577g) null)))), new C34401q((C69577g) null))), agVar), C34402r.f91449a), new C34404t(agVar, aVar3, (C69577g) null)), new C34406v(agVar, aVar3, (C69577g) null)), agVar.f91399b)));
        }
        aeVar2.f186027a = C69514bd.m100891e(set3, C69540x.m100846ab(arrayList2));
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34377ab abVar = new C34377ab(this.f91389b, this.f91390c, gVar);
        abVar.f91388a = obj;
        return abVar;
    }
}
