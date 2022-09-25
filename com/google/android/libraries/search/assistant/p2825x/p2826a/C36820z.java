package com.google.android.libraries.search.assistant.p2825x.p2826a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b.C34677d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b.C34679f;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b.C34680g;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import com.google.speech.p5218j.C66948fk;
import com.google.speech.p5218j.C66952fo;
import java.util.Collections;
import java.util.List;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.quickphrasesmanager.impl.QuickPhrasesManagerImpl$quickPhrasesInvocationSourceStateFlow$1", mo61344c = "QuickPhrasesManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.x.a.z */
/* compiled from: PG */
final class C36820z extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f95962a;

    /* renamed from: b */
    /* synthetic */ Object f95963b;

    /* renamed from: c */
    final /* synthetic */ C36808o f95964c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36820z(C36808o oVar, C69577g gVar) {
        super(3, gVar);
        this.f95964c = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C36820z zVar = new C36820z(this.f95964c, (C69577g) obj3);
        zVar.f95962a = (C34679f) obj;
        zVar.f95963b = (C69685i) obj2;
        return zVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f95962a;
        C69685i iVar = (C69685i) this.f95963b;
        C66952fo foVar = (C66952fo) iVar.f186052a;
        C34037b bVar = (C34037b) iVar.f186053b;
        C34677d dVar = (C34677d) C34680g.f92076g.createBuilder();
        C69664n.m101060f(dVar, "newBuilder()");
        C69664n.m101061g(dVar, "builder");
        C69664n.m101061g(obj2, "value");
        dVar.copyOnWrite();
        C34680g gVar = (C34680g) dVar.instance;
        gVar.f92082e = ((C34679f) obj2).f92074d;
        gVar.f92079a |= 1;
        new C62883b(new C62963cj(gVar.f92080b, C34680g.f92075c));
        List<C66948fk> l = C36808o.m65505l(foVar);
        dVar.copyOnWrite();
        C34680g gVar2 = (C34680g) dVar.instance;
        C62961ch chVar = gVar2.f92080b;
        if (!chVar.mo58948c()) {
            gVar2.f92080b = C62942bv.mutableCopy(chVar);
        }
        for (C66948fk fkVar : l) {
            gVar2.f92080b.mo58916g(fkVar.f181990o);
        }
        List unmodifiableList = Collections.unmodifiableList(((C34680g) dVar.instance).f92081d);
        C69664n.m101060f(unmodifiableList, "_builder.getFailedQuickPhrasesList()");
        new C62883b(unmodifiableList);
        List k = C36808o.m65504k(foVar);
        dVar.copyOnWrite();
        C34680g gVar3 = (C34680g) dVar.instance;
        C62971cq cqVar = gVar3.f92081d;
        if (!cqVar.mo58948c()) {
            gVar3.f92081d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) k, (List) gVar3.f92081d);
        C69664n.m101061g(bVar, "value");
        dVar.copyOnWrite();
        C34680g gVar4 = (C34680g) dVar.instance;
        gVar4.f92083f = bVar.getNumber();
        gVar4.f92079a |= 2;
        C62942bv build = dVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C34680g) build;
    }
}
