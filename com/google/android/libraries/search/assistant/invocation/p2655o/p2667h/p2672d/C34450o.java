package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2672d;

import com.google.android.apps.gsa.binaries.satin.app.aqz;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34155aa;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34231an;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34254bj;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.C34354a;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71647ct;
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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.platform.PlatformConfigurationTracker$initialize$1$coroutineContext$1", mo61344c = "PlatformConfigurationTracker.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.d.o */
/* compiled from: PG */
final class C34450o extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f91549a;

    /* renamed from: b */
    final /* synthetic */ C69648ae f91550b;

    /* renamed from: c */
    final /* synthetic */ C34453r f91551c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34450o(C69648ae aeVar, C34453r rVar, C69577g gVar) {
        super(2, gVar);
        this.f91550b = aeVar;
        this.f91551c = rVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34450o) mo5194c((C69685i) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C69685i iVar = (C69685i) this.f91549a;
        Set set = (Set) iVar.f186052a;
        Set set2 = (Set) iVar.f186053b;
        Set c = C69514bd.m100889c(set, set2);
        C69648ae aeVar = this.f91550b;
        Object obj2 = aeVar.f186027a;
        Set set3 = (Set) obj2;
        ArrayList<C34449n> arrayList = new ArrayList<>();
        for (Object next : (Iterable) obj2) {
            if (c.contains(((C34449n) next).f91544b)) {
                arrayList.add(next);
            }
        }
        for (C34449n nVar : arrayList) {
            C71647ct.m104639c(nVar.f91546d, (CancellationException) null);
        }
        aeVar.f186027a = C69514bd.m100889c(set3, arrayList);
        Set<C34354a> c2 = C69514bd.m100889c(set2, set);
        C69648ae aeVar2 = this.f91550b;
        Set set4 = (Set) aeVar2.f186027a;
        C34453r rVar = this.f91551c;
        ArrayList arrayList2 = new ArrayList(C69540x.m100804k(c2, 10));
        for (C34354a nVar2 : c2) {
            aqz aqz = rVar.f91555b;
            arrayList2.add(new C34449n(nVar2, (C34231an) aqz.f199891a.a.a.f202677bb.mo17428b(), (C34254bj) aqz.f199891a.a.a.f202926gL.mo17428b(), (C34155aa) aqz.f199891a.a.a.f202920gF.mo17428b(), (C71422aw) aqz.f199891a.a.H.mo17428b()));
        }
        aeVar2.f186027a = C69514bd.m100891e(set4, arrayList2);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34450o oVar = new C34450o(this.f91550b, this.f91551c, gVar);
        oVar.f91549a = obj;
        return oVar;
    }
}
